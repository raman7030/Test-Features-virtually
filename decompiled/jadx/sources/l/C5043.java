package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5043 extends AbstractC23114 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C0103 f15856;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15857;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f15858;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C20369 f15859;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C19155 f15860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f15861;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public long f15862;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15863;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f15864;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final long f15865;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final long f15866;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public long f15867;

    public C5043(C18449 c18449) {
        super(c18449.f57221);
        this.f15866 = c18449.f57219;
        this.f15865 = c18449.f57223;
        this.f15863 = c18449.f57224;
        this.f15861 = c18449.f57218;
        this.f15857 = c18449.f57225;
        this.f15858 = c18449.f57220;
        this.f15864 = new ArrayList();
        this.f15859 = new C20369();
    }

    @Override // l.AbstractC21272, l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public final void mo9823() throws C0103 {
        C0103 c0103 = this.f15856;
        if (c0103 != null) {
            throw c0103;
        }
        super.mo9823();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9546 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        C3632 c3632 = new C3632(this.f74351.mo9816(c15894, interfaceC21725, j), this.f15863, this.f15867, this.f15862);
        this.f15864.add(c3632);
        return c3632;
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ArrayList arrayList = this.f15864;
        C22632.m50634(arrayList.remove(interfaceC9546));
        this.f74351.mo9821(((C3632) interfaceC9546).f11481);
        if (!arrayList.isEmpty() || this.f15861) {
            return;
        }
        C19155 c19155 = this.f15860;
        c19155.getClass();
        m14563(c19155.f40320);
    }

    @Override // l.AbstractC21272, l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9824() {
        super.mo9824();
        this.f15856 = null;
        this.f15860 = null;
    }

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo14564(AbstractC4846 abstractC4846) {
        if (this.f15856 != null) {
            return;
        }
        m14563(abstractC4846);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m14563(AbstractC4846 abstractC4846) {
        long j;
        long j2;
        long j3;
        C20369 c20369 = this.f15859;
        abstractC4846.m14106(0, c20369);
        long j4 = c20369.f65757;
        C19155 c19155 = this.f15860;
        long j5 = this.f15865;
        ArrayList arrayList = this.f15864;
        if (c19155 == null || arrayList.isEmpty() || this.f15861) {
            boolean z = this.f15857;
            long j6 = this.f15866;
            if (z) {
                long j7 = c20369.f65749;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f15867 = j4 + j6;
            this.f15862 = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3632 c3632 = (C3632) arrayList.get(i);
                long j8 = this.f15867;
                long j9 = this.f15862;
                c3632.f11482 = j8;
                c3632.f11484 = j9;
            }
            j2 = j;
            j3 = j6;
        } else {
            long j10 = this.f15867 - j4;
            long j11 = j5 != Long.MIN_VALUE ? this.f15862 - j4 : Long.MIN_VALUE;
            j3 = j10;
            j2 = j11;
        }
        try {
            C19155 c19156 = new C19155(abstractC4846, j3, j2, this.f15858);
            this.f15860 = c19156;
            m23794(c19156);
        } catch (C0103 e) {
            this.f15856 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C3632) arrayList.get(i2)).m11118(this.f15856);
            }
        }
    }
}
