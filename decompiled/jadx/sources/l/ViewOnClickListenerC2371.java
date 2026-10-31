package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2371 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7567;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7568;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7569;

    public /* synthetic */ ViewOnClickListenerC2371(int i, Object obj, Object obj2) {
        this.f7568 = i;
        this.f7569 = obj;
        this.f7567 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7568) {
            case 0:
                boolean[] zArr = (boolean[]) this.f7569;
                BaseAdapter baseAdapter = (BaseAdapter) this.f7567;
                for (int i = 0; i < zArr.length; i++) {
                    zArr[i] = !zArr[i];
                }
                baseAdapter.notifyDataSetChanged();
                break;
            default:
                Main main = (Main) this.f7569;
                final EditText editText = (EditText) this.f7567;
                ArrayList arrayList = new ArrayList(C14776.f45125 + 1);
                arrayList.add(main.getString(R.string.MT_Protector));
                int size = editText.length() == 0 ? 0 : -1;
                String string = editText.getText().toString();
                for (int i2 = 0; i2 < C14776.f45125; i2++) {
                    String strM35153 = C14776.m35153(i2);
                    if (strM35153.equalsIgnoreCase(string)) {
                        size = arrayList.size();
                    }
                    arrayList.add(strM35153);
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C19258 c19258BuildDialog = main.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44429(strArr, size, new DialogInterface.OnClickListener() { // from class: l.۠ᩳ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        editText.setText(i3 == 0 ? "" : strArr[i3]);
                        dialogInterface.dismiss();
                    }
                });
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                c19258BuildDialog.m44438();
                break;
        }
    }
}
