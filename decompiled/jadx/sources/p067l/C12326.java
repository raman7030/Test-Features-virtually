package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12326 {

    /* JADX INFO: renamed from: ֫ */
    public final String f34400;

    /* JADX INFO: renamed from: ۧ */
    public final String f34401;

    /* JADX INFO: renamed from: ܽ */
    public final Object[] f34402;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f34403;

    /* JADX INFO: renamed from: ᩳ */
    public final int f34404;

    public C12326(boolean z, String str, int i, String str2, Object[] objArr) {
        this.f34403 = z;
        this.f34400 = str;
        this.f34404 = i;
        this.f34401 = str2;
        this.f34402 = objArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12326 m28401(String str) {
        return new C12326(true, str, 0, "", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12326 m28400(int i, Object... objArr) {
        return new C12326(false, "", i, "", objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12326 m28399() {
        return new C12326(false, "", R.string.MT_Protector, "pairing_code_invalid", new Object[0]);
    }
}
