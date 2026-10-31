package l;

/* JADX INFO: renamed from: l.ܶܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: LARQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15279 implements InterfaceC8225 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15279 f46873;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f46874;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f46875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f46876;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f46877;

    static {
        String[] strArr = new String[0];
        f46874 = strArr;
        f46873 = new C15279(strArr, strArr, strArr);
    }

    public C15279(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = f46874;
        strArr = strArr == null ? strArr4 : strArr;
        this.f46876 = strArr;
        strArr2 = strArr2 == null ? strArr4 : strArr2;
        this.f46877 = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.f46875 = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36284(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f46876;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m36285(int i) {
        if (i >= 0) {
            String[] strArr = this.f46877;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36283(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f46875;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM36284 = m36284(i);
        if (strM36284 != null) {
            return strM36284;
        }
        String strM36285 = m36285(i);
        return strM36285 != null ? strM36285 : Integer.toString(i);
    }
}
