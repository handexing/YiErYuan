package com.yey.cleverboy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yey.cleverboy.R;

/**
 * @author 作者 E-mail: 908716835@qq.com
 * @date 创建时间：2015-8-2 下午2:48:24
 * @version 1.0
 */
public class FastEntryFragment extends Fragment {

	private static final String TAG = "FastEntryFragment";
	private View view;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.i(TAG, "onActivityCreated");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i(TAG, "onCreateView");
		view = LayoutInflater.from(getActivity()).inflate(
				R.layout.fastentry_fragment, null);
		return view;
	}
}
