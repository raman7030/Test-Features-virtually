package p067l;

/* JADX INFO: renamed from: l.᩵ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20921 {

    /* JADX INFO: renamed from: ֫ */
    public int f65708 = 49152;

    /* JADX INFO: renamed from: ֫ */
    public final C2814 m47224(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f65708;
        if (iCodePointCount <= i) {
            this.f65708 = i - iCodePointCount;
            return new C2814(str, false);
        }
        int iMax = Math.max(0, i);
        this.f65708 = 0;
        return new C2814(iMax <= 0 ? "" : str.substring(0, str.offsetByCodePoints(0, iMax)), iCodePointCount > iMax);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47225(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f65708;
        if (iCodePointCount > i) {
            return false;
        }
        this.f65708 = i - iCodePointCount;
        return true;
    }
}
