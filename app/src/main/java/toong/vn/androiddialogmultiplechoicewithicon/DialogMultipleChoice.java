package toong.vn.androiddialogmultiplechoicewithicon;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PhanVanLinh on 14/09/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class DialogMultipleChoice {
    Context mContext;

    public DialogMultipleChoice(Context context) {
        mContext = context;
    }

    List<Item> itemList = new ArrayList<>();

    public void show() {
        if (itemList.isEmpty()) {
            itemList.add(new Item("A", R.mipmap.ic_launcher));
            itemList.add(new Item("B", R.mipmap.ic_launcher));
            itemList.add(new Item("C", R.mipmap.ic_launcher));
        }

        final DialogMultipleChoiceAdapter adapter =
                new DialogMultipleChoiceAdapter(mContext, itemList);

        new AlertDialog.Builder(mContext).setTitle("Select Image")
                .setAdapter(adapter, null)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(mContext,
                                "getCheckedItem = " + adapter.getCheckedItem().size(),
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();
    }
}
