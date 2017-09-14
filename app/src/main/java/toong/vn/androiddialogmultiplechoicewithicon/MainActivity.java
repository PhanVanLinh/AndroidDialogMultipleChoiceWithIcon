package toong.vn.androiddialogmultiplechoicewithicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    DialogMultipleChoice mDialogMultipleChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialogMultipleChoice = new DialogMultipleChoice(this);

        findViewById(R.id.show_multiple_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialogMultipleChoice.show();
            }
        });
    }
}
