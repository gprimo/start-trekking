package com.example.starttrekking;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EstouComSorteFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {

		//Inflate the layout for this fragment

		return inflater.inflate(
				R.layout.estou_com_sorte, container, false);
	}

}
