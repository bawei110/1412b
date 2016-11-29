package com.example.day01_slidingmenu;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.day01_slidingmenu.fragments.ContentFragment;
import com.example.day01_slidingmenu.fragments.LeftFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * SlidingMenu使用步骤 1.继承SlidingFragmentActivity，自带SlidingMenu 2.获取SlidingMenu
 * 3.设置
 * 
 * @author Administrator
 * 
 */
public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 获取SlidingMenu
		SlidingMenu slidingMenu = getSlidingMenu();
		// 设置左侧侧滑菜单
		setBehindContentView(R.layout.left_fragment);
		// 设置滑动模式
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		// 设置正文的宽度
		slidingMenu.setBehindOffset(400);
		// 初始化Fragment
		initFragments();
	}

	private void initFragments() {
//		FragmentManager fragmentManager = getSupportFragmentManager();
//		FragmentTransaction transaction = fragmentManager.beginTransaction();
//		// 添加Fragment
//		transaction.replace(R.id.content, new ContentFragment());
//		transaction.replace(R.id.left_fragment, new LeftFragment());
//		// 提交
//		transaction.commit();
	}
}
