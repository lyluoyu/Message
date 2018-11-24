package com.example.common.recycler;
/**
 * 适配器的回调
 */

public interface AdapterCallback<Data> {
    void update(Data data, RecyclerAdapter.ViewHolder<Data> holder);
}
