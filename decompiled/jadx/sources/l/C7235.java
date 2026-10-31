package l;

/* JADX INFO: renamed from: l.۟ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7235 extends C4065 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f22181;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f22182;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17777 f22183;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f22184;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f22185;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7235(C17777 c17777, C12552 c12552, int i) {
        super(c12552, null, null);
        this.f22183 = c17777;
        this.f22185 = i;
        this.f22184 = -9223372036854775807L;
        this.f22181 = -1;
        this.f22182 = -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m19345(int i) {
        this.f22181 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19346(int i) {
        this.f22182 = i;
    }

    @Override // l.C4065, l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8454(long j) {
        this.f22184 = j;
    }

    @Override // l.C4065
    /* JADX INFO: renamed from: ۧ */
    public final C8353 mo12206(C8353 c8353) {
        if (m12222() == null) {
            C17777.m41638(this.f22183, this, c8353);
        }
        return super.mo12206(c8353);
    }

    @Override // l.C4065, l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8455(long j, int i, int i2, int i3, C18677 c18677) {
        int i4 = i & (-536870913);
        C22632.m50634(this.f22181 != -1);
        int iM12203 = m12203();
        super.mo8455(j, i4, i2, i3, c18677);
        if (m12203() == iM12203 + 1) {
            int i5 = ((i & 1073741824) != 0 ? 2 : 0) | ((i & 1) != 0 ? 1 : 0);
            int i6 = this.f22182;
            C17777 c17777 = this.f22183;
            if (i6 != -1) {
                c17777.f54379.m38526(i5, this.f22182, j);
            }
            c17777.f54379.m38526(i5, this.f22181, j);
        }
    }

    public final String toString() {
        int i = this.f22181;
        int i2 = this.f22182;
        StringBuilder sbM46682 = C20361.m46682("trackId: ", this.f22185, ", mainTrackIndex: ", ", compatibilityTrackIndex: ", i);
        sbM46682.append(i2);
        return sbM46682.toString();
    }
}
