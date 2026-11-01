package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23985 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ArrayList f76182;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C16396 f76183;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ TextInputLayout f76184;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ CharSequence[] f76185;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ EditText f76186;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f76187;

    public /* synthetic */ ViewOnClickListenerC23985(EditText editText, AbstractActivityC5549 abstractActivityC5549, CharSequence[] charSequenceArr, C16396 c16396, ArrayList arrayList, TextInputLayout textInputLayout) {
        this.f76186 = editText;
        this.f76187 = abstractActivityC5549;
        this.f76185 = charSequenceArr;
        this.f76183 = c16396;
        this.f76182 = arrayList;
        this.f76184 = textInputLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final EditText editText = this.f76186;
        editText.requestFocus();
        C20671 c20671BuildDialog = this.f76187.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        final C16396 c16396 = this.f76183;
        int i = c16396.f48188;
        final ArrayList arrayList = this.f76182;
        final TextInputLayout textInputLayout = this.f76184;
        c20671BuildDialog.m46723(this.f76185, i, new DialogInterface.OnClickListener() { // from class: l.۟ۘܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13045.m29867(dialogInterface, "dialog");
                c16396.f48188 = i2;
                ArrayList arrayList2 = arrayList;
                Object obj = arrayList2.get(i2);
                EditText editText2 = editText;
                editText2.setTag(obj);
                editText2.setText(((AbstractC5769) arrayList2.get(i2)).getName());
                textInputLayout.setErrorEnabled(false);
                dialogInterface.dismiss();
            }
        });
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }
}
