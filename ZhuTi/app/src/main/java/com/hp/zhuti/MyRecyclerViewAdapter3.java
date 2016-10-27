package com.hp.zhuti;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * User : wy
 * Date : 2016/10/27
 */
public class MyRecyclerViewAdapter3 extends BaseRecyclerViewAdapter<String> {


    public MyRecyclerViewAdapter3(Context mContext, List<String> mList) {
        super(mContext, mList);
    }

    @Override
    protected void showOnBindViewHolder(BaseRecyclerHolderView holder, final int position) {
        HolderView holderView = (HolderView) holder;
        holderView.txtName.setText(mList.get(position));


        holderView.txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClickListener.onItemClick(v,position,mList.get(position));
            }
        });

        holderView.txtName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                itemOnClickListener.onLongItemClick(v,position,mList.get(position));
                return false;
            }
        });

    }

    @Override
    protected BaseRecyclerHolderView showOnCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext,R.layout.item,null);
        BaseRecyclerHolderView holderView = new HolderView(view);
        return holderView;
    }

    public class HolderView extends BaseRecyclerHolderView{

        private TextView txtName;
        public HolderView(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.item);
        }
    }

}
