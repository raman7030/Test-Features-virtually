package p067l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۚۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBC3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7301 implements InterfaceC2940, Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public C3079 f19110;

    /* JADX INFO: renamed from: ᩹ */
    public final C23648 f19111;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19111.compareTo(((C7301) obj).f19111);
    }

    public C7301(C23648 c23648, C3079 c3079) {
        this.f19111 = c23648;
        this.f19110 = c3079;
    }

    public final int hashCode() {
        return this.f19111.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7301)) {
            return false;
        }
        return this.f19111.equals(((C7301) obj).f19111);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16863(C3948 c3948) {
        C22724 c22724M7857 = c3948.m7857();
        C6630 c6630M7850 = c3948.m7850();
        c22724M7857.m50876(this.f19111);
        this.f19110 = (C3079) c6630M7850.m15105(this.f19110);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16864(C3948 c3948, C19705 c19705) {
        C22724 c22724M7857 = c3948.m7857();
        C23648 c23648 = this.f19111;
        int iM50874 = c22724M7857.m50874((AbstractC18283) c23648);
        int iM11432 = this.f19110.m11432();
        if (c19705.m44765()) {
            c19705.m44760(0, ASN1Dump.TAB + c23648.mo4819());
            c19705.m44760(4, "      method_idx:      ".concat(C16351.m37155(iM50874)));
            c19705.m44760(4, "      annotations_off: ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM50874);
        c19705.m44773(iM11432);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f19111.mo4819() + ": " + this.f19110;
    }
}
