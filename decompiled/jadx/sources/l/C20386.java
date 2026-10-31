package l;

/* JADX INFO: renamed from: l.᩶᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20386 implements InterfaceC4158 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7586 f65784;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6613 f65785;

    public C20386(C7586 c7586, C6613 c6613) {
        this.f65784 = c7586;
        this.f65785 = c6613;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46699() {
        return this.f65784.m20336(this.f65785);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46700() {
        try {
            this.f65785.cancel(true);
        } catch (RuntimeException unused) {
        }
    }
}
