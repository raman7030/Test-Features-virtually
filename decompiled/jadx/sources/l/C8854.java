package l;

/* JADX INFO: renamed from: l.ۡۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29EQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8854 implements InterfaceC5037 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f26957 = {-3, 83, 77, 66};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26958;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f26959;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26960;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26963;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f26964;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f26965;

    public C8854(long j, int i, byte[] bArr) {
        this.f26959 = new byte[16];
        this.f26964 = bArr;
        this.f26963 = i;
        this.f26961 = 0;
        this.f26958 = 1;
        this.f26965 = j;
    }

    public C8854() {
        this.f26959 = new byte[16];
        this.f26964 = new byte[16];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22874(C0097 c0097) {
        this.f26960 = c0097.m26083();
        c0097.m26077(4, f26957);
        byte[] bArr = this.f26959;
        c0097.m26077(bArr.length, bArr);
        byte[] bArr2 = this.f26964;
        c0097.m26077(bArr2.length, bArr2);
        c0097.m1082(16 - this.f26964.length);
        c0097.m26088(this.f26963);
        c0097.m26086(this.f26961);
        c0097.m26086(this.f26958);
        c0097.m26078(this.f26965);
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final void mo14553(C0097 c0097) throws C13146 {
        this.f26960 = c0097.m26083();
        C23670.m52193(c0097, f26957);
        if (this.f26959.length != 16) {
            this.f26959 = new byte[16];
        }
        byte[] bArr = this.f26959;
        c0097.m26087(bArr.length, bArr);
        if (this.f26964.length != 16) {
            this.f26964 = new byte[16];
        }
        byte[] bArr2 = this.f26964;
        c0097.m26087(bArr2.length, bArr2);
        this.f26963 = c0097.m26099();
        this.f26961 = c0097.m26100();
        this.f26958 = c0097.m26100();
        this.f26965 = c0097.m26090();
        this.f26962 = c0097.m26091();
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final int mo14552() {
        return this.f26960;
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ۧ */
    public final int mo14554() {
        return this.f26962;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m22873() {
        return this.f26959;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m22878() {
        return this.f26964;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m22877() {
        return this.f26963;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22875() {
        return this.f26961;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22876() {
        return this.f26958;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m22879() {
        return this.f26965;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22872(byte[] bArr) {
        return C23670.m52195(bArr, f26957);
    }
}
