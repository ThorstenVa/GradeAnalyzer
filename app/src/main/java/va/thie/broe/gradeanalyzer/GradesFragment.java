package va.thie.broe.gradeanalyzer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GradesFragment extends Fragment {


    public GradesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String [] gradesArray = {
                "Mathematik I",
                "1,0",
                "Algorithmen, Datenstrukturen und Komplexität",
                "2,3",
                "Grundlagen der Programmierung",
                "1,7",
                "Englisch I",
                "1,7",
                "Einführung in Computer Engineering",
                "1,3"
        };

        List <String> grades = new ArrayList<>(Arrays.asList(gradesArray));

        ArrayAdapter<String>gradesAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_grades, R.id.list_item_grades_textview, grades );

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_grades, container, false);


        GridView gradesGrid = (GridView)rootView.findViewById(R.id.my_grid);
        gradesGrid.setAdapter(gradesAdapter);
        return rootView;



    }

}
