package l;

/* JADX INFO: renamed from: l.۠ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7886 implements InterfaceC19176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f24431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f24432;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24433;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24434;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24435;

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ۧ */
    public final int mo3099() {
        return -1;
    }

    public C7886(C7836 c7836) {
        C17714 c17714 = c7836.f24238;
        this.f24432 = c17714;
        c17714.m41484(12);
        this.f24433 = c17714.m41492() & 255;
        this.f24435 = c17714.m41492();
    }

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ܽ */
    public final int mo3100() {
        return this.f24435;
    }

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ֫ */
    public final int mo3098() {
        C17714 c17714 = this.f24432;
        int i = this.f24433;
        if (i == 8) {
            return c17714.m41456();
        }
        if (i == 16) {
            return c17714.m41464();
        }
        int i2 = this.f24434;
        this.f24434 = i2 + 1;
        if (i2 % 2 == 0) {
            int iM41456 = c17714.m41456();
            this.f24431 = iM41456;
            return (iM41456 & 240) >> 4;
        }
        return this.f24431 & 15;
    }
}
