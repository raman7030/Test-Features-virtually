package p067l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܳۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBAQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16017 implements InterfaceC2940, Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public C3079 f46392;

    /* JADX INFO: renamed from: ᩹ */
    public final C10908 f46393;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f46393.compareTo(((C16017) obj).f46393);
    }

    public C16017(C10908 c10908, C3079 c3079) {
        this.f46393 = c10908;
        this.f46392 = c3079;
    }

    public final int hashCode() {
        return this.f46393.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16017)) {
            return false;
        }
        return this.f46393.equals(((C16017) obj).f46393);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36395(C3948 c3948) {
        C8642 c8642M7856 = c3948.m7856();
        C6630 c6630M7850 = c3948.m7850();
        c8642M7856.m20056(this.f46393);
        this.f46392 = (C3079) c6630M7850.m15105(this.f46392);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36396(C3948 c3948, C19705 c19705) {
        C8642 c8642M7856 = c3948.m7856();
        C10908 c10908 = this.f46393;
        int iM20054 = c8642M7856.m20054(c10908);
        int iM11432 = this.f46392.m11432();
        if (c19705.m44765()) {
            c19705.m44760(0, ASN1Dump.TAB + c10908.mo4819());
            c19705.m44760(4, "      field_idx:       ".concat(C16351.m37155(iM20054)));
            c19705.m44760(4, "      annotations_off: ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM20054);
        c19705.m44773(iM11432);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f46393.mo4819() + ": " + this.f46392;
    }
}
