package com.yey.cleverboy.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.yey.cleverboy.MainActivity;

/**
 * @author 作者 E-mail: 908716835@qq.com
 * @date 创建时间：2015-8-2 下午2:36:52
 * @version 1.0
 */
public abstract class BasePage {

	public View view;
	public Context context;
	public SlidingMenu sm;

	/**
	 * 1、画界面 2、初始化数据
	 */
	public BasePage(Context context) {
		this.context = context;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = initView(inflater);
		sm = ((MainActivity) context).getSlidingMenu();
	}

	public View getRootView() {
		return view;
	}

	// 初始化view
	public abstract View initView(LayoutInflater inflater);

	// 初始化数据
	public abstract void initData();

}
