package l;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ܶۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14950 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f45587;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45588;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45589;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45590;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AutoCompleteTextView f45591;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f45592;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45593;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f45594;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f45595;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45596;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45597;

    public /* synthetic */ C14950(C2978 c2978, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractActivityC3346 abstractActivityC3346, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        this.f45587 = c2978;
        this.f45591 = autoCompleteTextView;
        this.f45595 = textInputLayout;
        this.f45594 = textInputLayout2;
        this.f45592 = textInputLayout3;
        this.f45597 = abstractActivityC3346;
        this.f45588 = editText;
        this.f45596 = editText2;
        this.f45590 = editText3;
        this.f45589 = editText4;
        this.f45593 = editText5;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        final AbstractC5073 abstractC5073 = (AbstractC5073) obj;
        this.f45587.setVisibility(abstractC5073.mo1210() == 0 ? 0 : 8);
        this.f45591.setTag(abstractC5073);
        this.f45595.setHint(abstractC5073.mo1204());
        this.f45594.setHint(abstractC5073.mo1206());
        boolean zMo1207 = abstractC5073.mo1207();
        TextInputLayout textInputLayout = this.f45592;
        if (zMo1207) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
            final AbstractActivityC3346 abstractActivityC3346 = this.f45597;
            final EditText editText = this.f45588;
            final EditText editText2 = this.f45596;
            final EditText editText3 = this.f45590;
            final EditText editText4 = this.f45589;
            final EditText editText5 = this.f45593;
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۙۖ᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abstractC5073.mo14619(abstractActivityC3346, editText, editText2, editText3, editText4, editText5);
                }
            });
            return;
        }
        textInputLayout.setEndIconMode(0);
    }
}
