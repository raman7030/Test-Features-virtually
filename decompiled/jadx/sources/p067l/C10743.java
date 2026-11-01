package p067l;

/* JADX INFO: renamed from: l.ۡۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10743 implements InterfaceC7113 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2418[] f29763;

    /* JADX INFO: renamed from: ۧ */
    public final C14765 f29764;

    /* JADX INFO: renamed from: ܽ */
    public final C16500 f29765;

    public C10743(InterfaceC2418... interfaceC2418Arr) {
        C14765 c14765 = new C14765();
        C16500 c16500 = new C16500();
        InterfaceC2418[] interfaceC2418Arr2 = new InterfaceC2418[interfaceC2418Arr.length + 2];
        this.f29763 = interfaceC2418Arr2;
        System.arraycopy(interfaceC2418Arr, 0, interfaceC2418Arr2, 0, interfaceC2418Arr.length);
        this.f29764 = c14765;
        this.f29765 = c16500;
        interfaceC2418Arr2[interfaceC2418Arr.length] = c14765;
        interfaceC2418Arr2[interfaceC2418Arr.length + 1] = c16500;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2418[] m24743() {
        return this.f29763;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4963 m24741(C4963 c4963) {
        float f = c4963.f11305;
        C16500 c16500 = this.f29765;
        c16500.m37427(f);
        c16500.m37426(c4963.f11303);
        return c4963;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24742(boolean z) {
        this.f29764.m33706(z);
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24740(long j) {
        C16500 c16500 = this.f29765;
        return c16500.mo3359() ? c16500.m37425(j) : j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m24744() {
        return this.f29764.m33707();
    }
}
