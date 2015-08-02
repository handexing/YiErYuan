package com.yey.cleverboy.operate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yey.cleverboy.R;
import com.yey.cleverboy.base.BasePage;

/**
 * @author 作者 E-mail: 908716835@qq.com
 * @date 创建时间：2015-8-2 下午3:04:54
 * @version 1.0
 */
public class SettingPager extends BasePage {

	private View view;
	private TextView titleName;

	public SettingPager(Context context) {
		super(context);
	}

	/**
	 * @Name:initView
	 * @Description: 初始化界面
	 * @Author: 韩德兴（作者）
	 * @Version: V1.00 （版本号）
	 * @Create Date: 2015-8-2 下午3:05:52 （创建日期）
	 * @Parameters: LayoutInflater inflater 界面填充器
	 * @Return: View
	 */
	@Override
	public View initView(LayoutInflater inflater) {
		view = inflater.inflate(R.layout.setting_fragment, null);
		titleName = (TextView) view.findViewById(R.id.titleName);
		titleName.setText("设置");
		ImageView ivBack = (ImageView) view.findViewById(R.id.back);
		ivBack.setVisibility(View.GONE);
		return view;
	}

	/**
	 * @Name: initData
	 * @Description: 初始化数据
	 * @Author: 韩德兴（作者）
	 * @Version: V1.00 （版本号）
	 * @Create Date: 2015-8-2 下午3:05:52 （创建日期）
	 * @Parameters: 无
	 * @Return: 无
	 */
	@Override
	public void initData() {

	}

}
