package l;

/* JADX INFO: renamed from: l.۠۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8044 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0988[] f24800;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24801;

    public C8044(int i, C0988... c0988Arr) {
        this.f24801 = i;
        this.f24800 = c0988Arr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21362() {
        return this.f24801;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m21363() {
        int iM3451 = 0;
        for (C0988 c0988 : this.f24800) {
            iM3451 += c0988.m3451();
        }
        return iM3451;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m21364() {
        return m21363() * this.f24801;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0988[] m21361() {
        return this.f24800;
    }
}
