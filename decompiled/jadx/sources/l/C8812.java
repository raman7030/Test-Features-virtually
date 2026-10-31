package l;

/* JADX INFO: renamed from: l.ۡۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8812 implements InterfaceC4993 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0053[] f26838;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13044 f26839;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14870 f26840;

    public C8812(InterfaceC0053... interfaceC0053Arr) {
        C13044 c13044 = new C13044();
        C14870 c14870 = new C14870();
        InterfaceC0053[] interfaceC0053Arr2 = new InterfaceC0053[interfaceC0053Arr.length + 2];
        this.f26838 = interfaceC0053Arr2;
        System.arraycopy(interfaceC0053Arr, 0, interfaceC0053Arr2, 0, interfaceC0053Arr.length);
        this.f26839 = c13044;
        this.f26840 = c14870;
        interfaceC0053Arr2[interfaceC0053Arr.length] = c13044;
        interfaceC0053Arr2[interfaceC0053Arr.length + 1] = c14870;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0053[] m22773() {
        return this.f26838;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2730 m22771(C2730 c2730) {
        float f = c2730.f8510;
        C14870 c14870 = this.f26840;
        c14870.m35274(f);
        c14870.m35273(c2730.f8508);
        return c2730;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22772(boolean z) {
        this.f26839.m31621(z);
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22770(long j) {
        C14870 c14870 = this.f26840;
        return c14870.mo964() ? c14870.m35272(j) : j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m22774() {
        return this.f26839.m31622();
    }
}
