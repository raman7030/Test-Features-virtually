package l;

/* JADX INFO: renamed from: l.᩵ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19521 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63088 = 49152;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0469 m44926(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f63088;
        if (iCodePointCount <= i) {
            this.f63088 = i - iCodePointCount;
            return new C0469(str, false);
        }
        int iMax = Math.max(0, i);
        this.f63088 = 0;
        return new C0469(iMax <= 0 ? "" : str.substring(0, str.offsetByCodePoints(0, iMax)), iCodePointCount > iMax);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44927(String str) {
        int iCodePointCount = str.codePointCount(0, str.length());
        int i = this.f63088;
        if (iCodePointCount > i) {
            return false;
        }
        this.f63088 = i - iCodePointCount;
        return true;
    }
}
