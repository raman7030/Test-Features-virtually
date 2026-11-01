package p067l;

/* JADX INFO: renamed from: l.۟ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9244 extends C6232 {

    /* JADX INFO: renamed from: ֫֫ */
    public int f25064;

    /* JADX INFO: renamed from: ۟ */
    public int f25065;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C19263 f25066;

    /* JADX INFO: renamed from: ܽ֫ */
    public long f25067;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f25068;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9244(C19263 c19263, C14298 c14298, int i) {
        super(c14298, null, null);
        this.f25066 = c19263;
        this.f25068 = i;
        this.f25067 = -9223372036854775807L;
        this.f25064 = -1;
        this.f25065 = -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m21294(int i) {
        this.f25064 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m21295(int i) {
        this.f25065 = i;
    }

    @Override // p067l.C6232, p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10501(long j) {
        this.f25067 = j;
    }

    @Override // p067l.C6232
    /* JADX INFO: renamed from: ۧ */
    public final C10307 mo14127(C10307 c10307) {
        if (m14143() == null) {
            C19263.m43884(this.f25066, this, c10307);
        }
        return super.mo14127(c10307);
    }

    @Override // p067l.C6232, p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10502(long j, int i, int i2, int i3, C20119 c20119) {
        int i4 = i & (-536870913);
        C23877.m52960(this.f25064 != -1);
        int iM14124 = m14124();
        super.mo10502(j, i4, i2, i3, c20119);
        if (m14124() == iM14124 + 1) {
            int i5 = ((i & 1073741824) != 0 ? 2 : 0) | ((i & 1) != 0 ? 1 : 0);
            int i6 = this.f25065;
            C19263 c19263 = this.f25066;
            if (i6 != -1) {
                c19263.f57573.m40743(i5, this.f25065, j);
            }
            c19263.f57573.m40743(i5, this.f25064, j);
        }
    }

    public final String toString() {
        int i = this.f25064;
        int i2 = this.f25065;
        StringBuilder sbM49005 = C21720.m49005("trackId: ", this.f25068, ", mainTrackIndex: ", ", compatibilityTrackIndex: ", i);
        sbM49005.append(i2);
        return sbM49005.toString();
    }
}
