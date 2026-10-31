package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes.dex */
public final class C23417 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f75202;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f75203;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9307 f75204;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f75205;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f75206;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f75207;

    public C23417(AbstractActivityC3346 abstractActivityC3346, AbstractC9307 abstractC9307, EditText editText, EditText editText2, EditText editText3) {
        this.f75207 = abstractActivityC3346;
        this.f75204 = abstractC9307;
        this.f75203 = editText;
        this.f75206 = editText2;
        this.f75202 = editText3;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f75207);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f75205 = this.f75204.mo11160();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f75205.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(this.f75205).map(new C17067()).toArray(new C0288(2));
        C19258 c19258BuildDialog = this.f75207.buildDialog();
        final AbstractC9307 abstractC9307 = this.f75204;
        final EditText editText = this.f75203;
        final EditText editText2 = this.f75206;
        final EditText editText3 = this.f75202;
        c19258BuildDialog.m44430(charSequenceArr, new DialogInterface.OnClickListener(abstractC9307, editText, editText2, editText3) { // from class: l.ܳۖ᩻

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42918;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42919;

            /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f42921;

            {
                this.f42921 = editText;
                this.f42919 = editText2;
                this.f42918 = editText3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6169 c6169 = (C6169) this.f42920.f75205.get(i);
                String strM17075 = c6169.m17075();
                String strM17074 = c6169.m17074();
                EditText editText4 = this.f42921;
                int length = editText4.length();
                EditText editText5 = this.f42919;
                if (length > 0 && TextUtils.equals(editText4.getText(), editText5.getText())) {
                    editText4.setText(strM17075);
                }
                editText5.setText(strM17075);
                this.f42918.setText(strM17074);
                editText5.requestFocus();
            }
        });
        c19258BuildDialog.m44438();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f75207.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
