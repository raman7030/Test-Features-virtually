package l;

/* JADX INFO: renamed from: l.֨ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0830 implements InterfaceC19176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f3004;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f3006;

    public C0830(C7836 c7836, C8353 c8353) {
        C17714 c17714 = c7836.f24238;
        this.f3004 = c17714;
        c17714.m41484(12);
        int iM41492 = c17714.m41492();
        if ("audio/raw".equals(c8353.f25614)) {
            int iM11047 = C3603.m11047(c8353.f25605) * c8353.f25625;
            if (iM41492 == 0 || iM41492 % iM11047 != 0) {
                C19956.m46037("Audio sample size mismatch. stsd sample size: " + iM11047 + ", stsz sample size: " + iM41492);
                iM41492 = iM11047;
            }
        }
        this.f3005 = iM41492 == 0 ? -1 : iM41492;
        this.f3006 = c17714.m41492();
    }

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo3100() {
        return this.f3006;
    }

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo3099() {
        return this.f3005;
    }

    @Override // l.InterfaceC19176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo3098() {
        int i = this.f3005;
        return i == -1 ? this.f3004.m41492() : i;
    }
}
