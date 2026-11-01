package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4622 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f10358;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10359;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10360;

    public /* synthetic */ ViewOnClickListenerC4622(int i, Object obj, Object obj2) {
        this.f10359 = i;
        this.f10360 = obj;
        this.f10358 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10359) {
            case 0:
                boolean[] zArr = (boolean[]) this.f10360;
                BaseAdapter baseAdapter = (BaseAdapter) this.f10358;
                for (int i = 0; i < zArr.length; i++) {
                    zArr[i] = !zArr[i];
                }
                baseAdapter.notifyDataSetChanged();
                break;
            default:
                Main main = (Main) this.f10360;
                final EditText editText = (EditText) this.f10358;
                ArrayList arrayList = new ArrayList(C16412.f48239 + 1);
                arrayList.add(main.getString(R.string.MT_Protector));
                int size = editText.length() == 0 ? 0 : -1;
                String string = editText.getText().toString();
                for (int i2 = 0; i2 < C16412.f48239; i2++) {
                    String strM37300 = C16412.m37300(i2);
                    if (strM37300.equalsIgnoreCase(string)) {
                        size = arrayList.size();
                    }
                    arrayList.add(strM37300);
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C20671 c20671BuildDialog = main.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46723(strArr, size, new DialogInterface.OnClickListener() { // from class: l.۠ᩳ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        editText.setText(i3 == 0 ? "" : strArr[i3]);
                        dialogInterface.dismiss();
                    }
                });
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46732();
                break;
        }
    }
}
