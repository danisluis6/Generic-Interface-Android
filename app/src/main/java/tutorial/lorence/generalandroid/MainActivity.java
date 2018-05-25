package tutorial.lorence.generalandroid;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = this.findViewById(R.id.demoText);
        editText = this.findViewById(R.id.editText);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = new Test1(editText.getText().toString()).compareTo("Hello");
                mTextView.setText(String.valueOf(result));
                editText.setText("");
            }
        });
    }

    class Test1 implements Comparable<String> {

        private String name;

        public Test1(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(@NonNull String o) {
            return name.compareTo(o);
        }
    }

}
