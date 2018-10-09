package pharm.pharmedge.com.pharmedge.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import pharm.pharmedge.com.pharmedge.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SurveyFragment extends Fragment {


    private View view;

    public SurveyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_survey, container, false);
      /*  WebView webView = (WebView) view.findViewById(R.id.txtSurey);
        String a = "\"<h2 class=\\\"page-subtitle user-generated notranslate\\\">This survey asks for your opinions about patient safety in this pharmacy and takes about 15 minutes to complete. Answer only about the pharmacy location/store where you received this survey.<br><br>Staff means EVERYONE who works in this pharmacy, including pharmacists, pharmacy technicians, pharmacy clerks, etc.<br><br>Patient safety is the prevention of patient harm resulting from the processes of health care delivery. In the pharmacy setting, it means that:<br><br>The right patient receives the right medication in the right dose at the right time by the right route, and<br><br>The patient or caregiver understands the purpose and proper use of the medication. <br><br>A mistake is any type of medication error, mistake, incident, or quality-related event, regardless of whether or not it reaches the patient or results in patient harm. Mistakes may be related to, or include:<br><br>Prescribing, transcribing, dispensing, administering, monitoring (use of medication), unsafe conditions or procedures in the pharmacy, etc.<br><br>If a question does not apply to you or you don’t know the answer, please answer “Does Not Apply or Don’t Know.”\\n\" +\n" +
                "                \"                    <button class=\\\"new-button ok-button user-generated notranslate\\\" type=\\\"submit\\\">\\n\" +\n" +
                "                \"                        OK\\n\" +\n" +
                "                \"                    </button>\\n\" +\n" +
                "                \"                    \\n\" +\n" +
                "                \"                </h2>\"";

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.surveymonkey.co.uk/r/FB5N23K");*/

        //webView.loadData(a, "text/html; charset=utf-8", "UTF-8");

        return view;
    }

}
