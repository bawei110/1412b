package com.example.day01_slidingmenu;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.day01_slidingmenu.fragments.ContentFragment;
import com.example.day01_slidingmenu.fragments.LeftFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * SlidingMenuʹ�ò��� 1.�̳�SlidingFragmentActivity���Դ�SlidingMenu 2.��ȡSlidingMenu
 * 3.����
 * 
 * @author Administrator
 * 
 */
public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ��ȡSlidingMenu
		SlidingMenu slidingMenu = getSlidingMenu();
		// �������໬�˵�
		setBehindContentView(R.layout.left_fragment);
		// ���û���ģʽ
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		// �������ĵĿ��
		slidingMenu.setBehindOffset(400);
		// ��ʼ��Fragment
		initFragments();
	}

	private void initFragments() {
//		FragmentManager fragmentManager = getSupportFragmentManager();
//		FragmentTransaction transaction = fragmentManager.beginTransaction();
//		// ���Fragment
//		transaction.replace(R.id.content, new ContentFragment());
//		transaction.replace(R.id.left_fragment, new LeftFragment());
//		// �ύ
//		transaction.commit();
	}
}
