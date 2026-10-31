package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2098 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f7026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7027 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7028;

    public /* synthetic */ ViewOnClickListenerC2098(C2450 c2450, C16560 c16560, EditText editText) {
        this.f7028 = c2450;
        this.f7025 = c16560;
        this.f7026 = editText;
    }

    public /* synthetic */ ViewOnClickListenerC2098(C7309 c7309, EditText editText, EditText editText2) {
        this.f7028 = c7309;
        this.f7026 = editText;
        this.f7025 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7027;
        final EditText editText = this.f7026;
        Object obj = this.f7025;
        Object obj2 = this.f7028;
        switch (i) {
            case 0:
                C7309 c7309 = (C7309) obj2;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, editText, (EditText) obj);
                break;
            default:
                C2450 c2450 = (C2450) obj2;
                C16560 c16560 = (C16560) obj;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AbstractC15440 abstractC15440M39866 = C16999.m39866(c2450.m7926(), new String[0]);
                String name = abstractC15440M39866.getName();
                if (name.isEmpty()) {
                    name = C4925.m14327(R.string.MT_Protector);
                }
                if (c2450.m7921().m39064()) {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector, name));
                } else {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector, name));
                }
                arrayList.add(abstractC15440M39866);
                AbstractC15440 abstractC15440M39867 = C16999.m39866(c16560.m39058(), new String[0]);
                String name2 = abstractC15440M39867.getName();
                if (name2.isEmpty()) {
                    name2 = C4925.m14327(R.string.MT_Protector);
                }
                if (c16560.m39064()) {
                    arrayList2.add(0, C4925.m14306(R.string.MT_Protector, name2));
                    arrayList.add(0, abstractC15440M39867);
                } else {
                    arrayList2.add(C4925.m14306(R.string.MT_Protector, name2));
                    arrayList.add(abstractC15440M39867);
                }
                C19258 c19258BuildDialog = c2450.m7917().buildDialog();
                c19258BuildDialog.m44430((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.۬ܽ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String strMo23554 = ((AbstractC15440) arrayList.get(i2)).mo23554();
                        EditText editText2 = editText;
                        editText2.setText(strMo23554);
                        editText2.setSelection(editText2.length());
                    }
                });
                c19258BuildDialog.m44438();
                break;
        }
    }
}
