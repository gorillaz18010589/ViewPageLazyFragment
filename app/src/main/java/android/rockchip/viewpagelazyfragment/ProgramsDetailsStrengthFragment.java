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


public class ProgramsDetailsStrengthFragment extends NewLazyFragment {
    private String TAG = "hank";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "ProgramsDetailsStrengthFragment onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "ProgramsDetailsStrengthFragment onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "ProgramsDetailsStrengthFragment onCreateView()");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_programs_details_strength;
    }

    /**
     * 初始化视图
     *
     * @param view
     */
    @Override
    protected void initView(View view) {
        super.initView(view);

    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        super.initData();
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
        Log.e(TAG, "ProgramsDetailsStrengthFragment onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "ProgramsDetailsStrengthFragment onDetach()");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e(TAG, "ProgramsDetailsStrengthFragment isVisibleToUser = " + isVisibleToUser);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e(TAG, "ProgramsDetailsStrengthFragment onHiddenChanged = " + hidden);
    }
}