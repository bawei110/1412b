package com.example.day01_slidingmenu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.day01_slidingmenu.R;

public class LeftFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// View view = inflater.inflate(R.layout.left11, null);
		TextView tv = new TextView(getActivity());
		tv.setText("zuoce ");
		return tv;
	}
}
