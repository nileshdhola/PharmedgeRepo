package pharm.pharmedge.com.pharmedge.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pharm.pharmedge.com.pharmedge.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PatientDetailsFragment extends Fragment {


    public PatientDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient_details, container, false);
    }

}
