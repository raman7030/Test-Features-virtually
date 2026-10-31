package l;

import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2595 extends AbstractC15252 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4006 f8206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2595(C4006 c4006, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346);
        this.f8206 = c4006;
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        EditText editTextM36254;
        try {
            int i = Integer.parseInt(m36254(0).getText().toString());
            try {
                int i2 = Integer.parseInt(m36254(1).getText().toString());
                int i3 = C8239.f25366;
                if (i < 1) {
                    i = 1;
                }
                if (i2 < i) {
                    i2 = i;
                }
                ApplicationC20075.f65008.edit().mo25853(i, "text_function_min_line").mo25853(i2, "text_function_max_line").apply();
                C8239.m21823();
                this.f8206.m12067();
                return true;
            } catch (NumberFormatException unused) {
                C21374.m48457(R.string.MT_Protector);
                editTextM36254 = m36254(1);
                editTextM36254.setSelection(0, editTextM36254.length());
                editTextM36254.requestFocus();
                return false;
            }
        } catch (NumberFormatException unused2) {
            C21374.m48457(R.string.MT_Protector);
            editTextM36254 = m36254(0);
        }
    }
}
