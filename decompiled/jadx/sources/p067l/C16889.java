package p067l;

/* JADX INFO: renamed from: l.ܶܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: LARQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16889 implements InterfaceC10185 {

    /* JADX INFO: renamed from: ܿ */
    public static final C16889 f50000;

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f50001;

    /* JADX INFO: renamed from: ֫ */
    public final String[] f50002;

    /* JADX INFO: renamed from: ۧ */
    public final String[] f50003;

    /* JADX INFO: renamed from: ܽ */
    public final String[] f50004;

    static {
        String[] strArr = new String[0];
        f50001 = strArr;
        f50000 = new C16889(strArr, strArr, strArr);
    }

    public C16889(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = f50001;
        strArr = strArr == null ? strArr4 : strArr;
        this.f50003 = strArr;
        strArr2 = strArr2 == null ? strArr4 : strArr2;
        this.f50004 = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.f50002 = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m38445(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f50003;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m38446(int i) {
        if (i >= 0) {
            String[] strArr = this.f50004;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38444(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f50002;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM38445 = m38445(i);
        if (strM38445 != null) {
            return strM38445;
        }
        String strM38446 = m38446(i);
        return strM38446 != null ? strM38446 : Integer.toString(i);
    }
}
