package ia.money.flow.app;

import java.util.List;

import ia.money.flow.app.database.DatabaseClient;
import ia.money.flow.app.database.IncomeDB;
import ia.money.flow.app.gen.R;
import ia.money.flow.app.model.Income;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         
       
        return rootView;
	}
	
}
