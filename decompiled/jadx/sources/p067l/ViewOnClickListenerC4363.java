package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4363 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f9809;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ EditText f9810;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9811 = 1;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f9812;

    public /* synthetic */ ViewOnClickListenerC4363(C4697 c4697, C18107 c18107, EditText editText) {
        this.f9812 = c4697;
        this.f9809 = c18107;
        this.f9810 = editText;
    }

    public /* synthetic */ ViewOnClickListenerC4363(C9315 c9315, EditText editText, EditText editText2) {
        this.f9812 = c9315;
        this.f9810 = editText;
        this.f9809 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9811;
        final EditText editText = this.f9810;
        Object obj = this.f9809;
        Object obj2 = this.f9812;
        switch (i) {
            case 0:
                C9315 c9315 = (C9315) obj2;
                c9315.m21562();
                C4345.m8962(c9315.f25331, c9315.f25329, editText, (EditText) obj);
                break;
            default:
                C4697 c4697 = (C4697) obj2;
                C18107 c18107 = (C18107) obj;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AbstractC17043 abstractC17043M42109 = C18524.m42109(c4697.m9974(), new String[0]);
                String name = abstractC17043M42109.getName();
                if (name.isEmpty()) {
                    name = C7050.m16224(R.string.MT_Protector);
                }
                if (c4697.m9969().m41290()) {
                    arrayList2.add(C7050.m16203(R.string.MT_Protector, name));
                } else {
                    arrayList2.add(C7050.m16203(R.string.MT_Protector, name));
                }
                arrayList.add(abstractC17043M42109);
                AbstractC17043 abstractC17043M421010 = C18524.m42109(c18107.m41284(), new String[0]);
                String name2 = abstractC17043M421010.getName();
                if (name2.isEmpty()) {
                    name2 = C7050.m16224(R.string.MT_Protector);
                }
                if (c18107.m41290()) {
                    arrayList2.add(0, C7050.m16203(R.string.MT_Protector, name2));
                    arrayList.add(0, abstractC17043M421010);
                } else {
                    arrayList2.add(C7050.m16203(R.string.MT_Protector, name2));
                    arrayList.add(abstractC17043M421010);
                }
                C20671 c20671BuildDialog = c4697.m9965().buildDialog();
                c20671BuildDialog.m46724((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.۬ܽ᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String strMo25505 = ((AbstractC17043) arrayList.get(i2)).mo25505();
                        EditText editText2 = editText;
                        editText2.setText(strMo25505);
                        editText2.setSelection(editText2.length());
                    }
                });
                c20671BuildDialog.m46732();
                break;
        }
    }
}
