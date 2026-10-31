package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22745 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f73456;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14759 f73457;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f73458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f73459;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f73460;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f73461;

    public /* synthetic */ ViewOnClickListenerC22745(EditText editText, AbstractActivityC3346 abstractActivityC3346, CharSequence[] charSequenceArr, C14759 c14759, ArrayList arrayList, TextInputLayout textInputLayout) {
        this.f73460 = editText;
        this.f73461 = abstractActivityC3346;
        this.f73459 = charSequenceArr;
        this.f73457 = c14759;
        this.f73456 = arrayList;
        this.f73458 = textInputLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final EditText editText = this.f73460;
        editText.requestFocus();
        C19258 c19258BuildDialog = this.f73461.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        final C14759 c14759 = this.f73457;
        int i = c14759.f45074;
        final ArrayList arrayList = this.f73456;
        final TextInputLayout textInputLayout = this.f73458;
        c19258BuildDialog.m44429(this.f73459, i, new DialogInterface.OnClickListener() { // from class: l.۟ۘܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C11233.m27805(dialogInterface, "dialog");
                c14759.f45074 = i2;
                ArrayList arrayList2 = arrayList;
                Object obj = arrayList2.get(i2);
                EditText editText2 = editText;
                editText2.setTag(obj);
                editText2.setText(((AbstractC3577) arrayList2.get(i2)).getName());
                textInputLayout.setErrorEnabled(false);
                dialogInterface.dismiss();
            }
        });
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }
}
