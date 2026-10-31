package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5073 {
    /* JADX INFO: renamed from: ֫ */
    public abstract String mo1204();

    /* JADX INFO: renamed from: ֫ */
    public abstract List mo1205(String str, String str2);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo1206();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo1207();

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo1208();

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo1209();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo1210();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5073 m14618(int i) {
        if (i == 0) {
            return C0133.f1248;
        }
        if (i == 1) {
            return C2251.f7325;
        }
        if (i == 2) {
            return C6484.f20016;
        }
        if (i == 3) {
            return C15655.f48179;
        }
        if (i == 4) {
            return C20596.f66300;
        }
        if (i == 5) {
            return C19185.f60439;
        }
        return C0133.f1248;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14619(AbstractActivityC3346 abstractActivityC3346, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC3577.m10939(editText, R.string.MT_Protector) && AbstractC3577.m10939(editText2, R.string.MT_Protector)) {
            new C23417(abstractActivityC3346, new C17773(this, editText, editText2), editText5, editText3, editText4).m20274();
        }
    }

    public final String toString() {
        return mo1208();
    }
}
