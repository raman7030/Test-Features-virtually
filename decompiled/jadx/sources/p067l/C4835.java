package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4835 extends AbstractC16864 {

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C6176 f10998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4835(C6176 c6176, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549);
        this.f10998 = c6176;
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        EditText editTextM38415;
        try {
            int i = Integer.parseInt(m38415(0).getText().toString());
            try {
                int i2 = Integer.parseInt(m38415(1).getText().toString());
                int i3 = C10199.f28276;
                if (i < 1) {
                    i = 1;
                }
                if (i2 < i) {
                    i2 = i;
                }
                ApplicationC21448.f67649.edit().mo27875(i, "text_function_min_line").mo27875(i2, "text_function_max_line").apply();
                C10199.m23792();
                this.f10998.m13987();
                return true;
            } catch (NumberFormatException unused) {
                C22682.m50793(R.string.MT_Protector);
                editTextM38415 = m38415(1);
                editTextM38415.setSelection(0, editTextM38415.length());
                editTextM38415.requestFocus();
                return false;
            }
        } catch (NumberFormatException unused2) {
            C22682.m50793(R.string.MT_Protector);
            editTextM38415 = m38415(0);
        }
    }
}
