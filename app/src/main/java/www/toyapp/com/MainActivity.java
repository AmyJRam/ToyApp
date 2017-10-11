package www.toyapp.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import module.ToysList;

public class MainActivity extends AppCompatActivity {
    /*
      TODO(7) Declared  Text view Variable and Called as mToysListTextView
     */
    TextView mToysListTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         /*
            TODO(8) Using findViewById to reference to the textview from layout
     */
         /*
            TODO(9) Declared ToysList Array and Assigned values using getToys() Static method
     */
        String toyNames[] = module.ToysList.getToys();
         /*
            TODO(10) Calling Foreach loop Lto iterate ToysList array data  and assigned to mToysListTextView
     */
        for (String toys :
                toyNames) {
            mToysListTextView.append(toys + "\n");
        }
    }
}
