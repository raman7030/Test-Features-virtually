package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7190 {
    /* JADX INFO: renamed from: ֫ */
    public abstract String mo3606();

    /* JADX INFO: renamed from: ֫ */
    public abstract List mo3607(String str, String str2);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo3608();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo3609();

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo3610();

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo3611();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo3612();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7190 m16526(int i) {
        if (i == 0) {
            return C2495.f4023;
        }
        if (i == 1) {
            return C4508.f10113;
        }
        if (i == 2) {
            return C8531.f22890;
        }
        if (i == 3) {
            return C17247.f51318;
        }
        if (i == 4) {
            return C21943.f68980;
        }
        if (i == 5) {
            return C20602.f63669;
        }
        return C2495.f4023;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16527(AbstractActivityC5549 abstractActivityC5549, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC5769.m12916(editText, R.string.MT_Protector) && AbstractC5769.m12916(editText2, R.string.MT_Protector)) {
            new C24624(abstractActivityC5549, new C19260(this, editText, editText2), editText5, editText3, editText4).m22250();
        }
    }

    public final String toString() {
        return mo3610();
    }
}
