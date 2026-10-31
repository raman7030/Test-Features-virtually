package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܳۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBAQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14361 implements InterfaceC0601, Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0747 f43301;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8985 f43302;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f43302.compareTo(((C14361) obj).f43302);
    }

    public C14361(C8985 c8985, C0747 c0747) {
        this.f43302 = c8985;
        this.f43301 = c0747;
    }

    public final int hashCode() {
        return this.f43302.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14361)) {
            return false;
        }
        return this.f43302.equals(((C14361) obj).f43302);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34262(C1662 c1662) {
        C6601 c6601M5626 = c1662.m5626();
        C4484 c4484M5620 = c1662.m5620();
        c6601M5626.m18104(this.f43302);
        this.f43301 = (C0747) c4484M5620.m13223(this.f43301);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34263(C1662 c1662, C18241 c18241) {
        C6601 c6601M5626 = c1662.m5626();
        C8985 c8985 = this.f43302;
        int iM18102 = c6601M5626.m18102(c8985);
        int iM9390 = this.f43301.m9390();
        if (c18241.m42506()) {
            c18241.m42501(0, ASN1Dump.TAB + c8985.mo2463());
            c18241.m42501(4, "      field_idx:       ".concat(C14712.m35008(iM18102)));
            c18241.m42501(4, "      annotations_off: ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM18102);
        c18241.m42514(iM9390);
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f43302.mo2463() + ": " + this.f43301;
    }
}
