package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes.dex */
public final class C24624 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ EditText f77948;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ EditText f77949;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ AbstractC11214 f77950;

    /* JADX INFO: renamed from: ܳ */
    public List f77951;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ EditText f77952;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f77953;

    public C24624(AbstractActivityC5549 abstractActivityC5549, AbstractC11214 abstractC11214, EditText editText, EditText editText2, EditText editText3) {
        this.f77953 = abstractActivityC5549;
        this.f77950 = abstractC11214;
        this.f77949 = editText;
        this.f77952 = editText2;
        this.f77948 = editText3;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f77953);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f77951 = this.f77950.mo13136();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f77951.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C7480.stream(this.f77951).map(new C18589()).toArray(new C2642(2));
        C20671 c20671BuildDialog = this.f77953.buildDialog();
        final AbstractC11214 abstractC11214 = this.f77950;
        final EditText editText = this.f77949;
        final EditText editText2 = this.f77952;
        final EditText editText3 = this.f77948;
        c20671BuildDialog.m46724(charSequenceArr, new DialogInterface.OnClickListener(abstractC11214, editText, editText2, editText3) { // from class: l.ܳۖ᩻

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ EditText f46010;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ EditText f46011;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ EditText f46013;

            {
                this.f46013 = editText;
                this.f46011 = editText2;
                this.f46010 = editText3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8232 c8232 = (C8232) this.f46012.f77951.get(i);
                String strM19007 = c8232.m19007();
                String strM19006 = c8232.m19006();
                EditText editText4 = this.f46013;
                int length = editText4.length();
                EditText editText5 = this.f46011;
                if (length > 0 && TextUtils.equals(editText4.getText(), editText5.getText())) {
                    editText4.setText(strM19007);
                }
                editText5.setText(strM19007);
                this.f46010.setText(strM19006);
                editText5.requestFocus();
            }
        });
        c20671BuildDialog.m46732();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f77953.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
