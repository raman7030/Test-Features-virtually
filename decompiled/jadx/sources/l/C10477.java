package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10477 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f31436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31437;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object[] f31438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f31439;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31440;

    public C10477(boolean z, String str, int i, String str2, Object[] objArr) {
        this.f31439 = z;
        this.f31436 = str;
        this.f31440 = i;
        this.f31437 = str2;
        this.f31438 = objArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10477 m26369(String str) {
        return new C10477(true, str, 0, "", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10477 m26368(int i, Object... objArr) {
        return new C10477(false, "", i, "", objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10477 m26367() {
        return new C10477(false, "", R.string.MT_Protector, "pairing_code_invalid", new Object[0]);
    }
}
