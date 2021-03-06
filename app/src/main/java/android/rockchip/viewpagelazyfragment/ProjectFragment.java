package android.rockchip.viewpagelazyfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.rockchip.viewpagelazyfragment.adapter.ListAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class ProjectFragment extends NewLazyFragment {

    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    private List<String> mData;
    private String TAG ="hank";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "ProjectFragment onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "ProjectFragment onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "ProjectFragment onCreateView()");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_project;
    }

    /**
     * 初始化视图
     *
     * @param view
     */
    @Override
    protected void initView(View view) {
        super.initView(view);
        mRecyclerView = view.findViewById(R.id.rv_project);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        super.initData();
        mData = new ArrayList<>();
        showProgressDialog("请稍后");
        // 模拟数据的延迟加载
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        for (int i = 0; i < 20; i++) {
                            mData.add("项目文章" + (i + 1));
                        }
                        mAdapter = new ListAdapter(getActivity(), mData);
                        mRecyclerView.setAdapter(mAdapter);
                        hideProgressDialog();
                    }
                });
    }

    /**
     * 初始化事件
     */
    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "ProjectFragment onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "ProjectFragment onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "ProjectFragment onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "ProjectFragment onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "ProjectFragment onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "ProjectFragment onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "ProjectFragment onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "ProjectFragment onDetach()");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e(TAG, "ProjectFragment isVisibleToUser = " + isVisibleToUser);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e(TAG, "ProjectFragment onHiddenChanged = " + hidden);
    }
}