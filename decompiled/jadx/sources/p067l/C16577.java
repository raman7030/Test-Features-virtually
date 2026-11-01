package p067l;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ܶۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16577 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C0990 f48699;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ EditText f48700;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ EditText f48701;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ EditText f48702;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AutoCompleteTextView f48703;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ TextInputLayout f48704;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ EditText f48705;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ TextInputLayout f48706;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ TextInputLayout f48707;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ EditText f48708;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f48709;

    public /* synthetic */ C16577(C0990 c0990, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractActivityC5549 abstractActivityC5549, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        this.f48699 = c0990;
        this.f48703 = autoCompleteTextView;
        this.f48707 = textInputLayout;
        this.f48706 = textInputLayout2;
        this.f48704 = textInputLayout3;
        this.f48709 = abstractActivityC5549;
        this.f48700 = editText;
        this.f48708 = editText2;
        this.f48702 = editText3;
        this.f48701 = editText4;
        this.f48705 = editText5;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        final AbstractC7190 abstractC7190 = (AbstractC7190) obj;
        this.f48699.setVisibility(abstractC7190.mo3612() == 0 ? 0 : 8);
        this.f48703.setTag(abstractC7190);
        this.f48707.setHint(abstractC7190.mo3606());
        this.f48706.setHint(abstractC7190.mo3608());
        boolean zMo3609 = abstractC7190.mo3609();
        TextInputLayout textInputLayout = this.f48704;
        if (zMo3609) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
            final AbstractActivityC5549 abstractActivityC5549 = this.f48709;
            final EditText editText = this.f48700;
            final EditText editText2 = this.f48708;
            final EditText editText3 = this.f48702;
            final EditText editText4 = this.f48701;
            final EditText editText5 = this.f48705;
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۙۖ᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abstractC7190.mo16527(abstractActivityC5549, editText, editText2, editText3, editText4, editText5);
                }
            });
            return;
        }
        textInputLayout.setEndIconMode(0);
    }
}
