package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۚۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBC3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5190 implements InterfaceC0601, Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0747 f16269;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22390 f16270;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16270.compareTo(((C5190) obj).f16270);
    }

    public C5190(C22390 c22390, C0747 c0747) {
        this.f16270 = c22390;
        this.f16269 = c0747;
    }

    public final int hashCode() {
        return this.f16270.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5190)) {
            return false;
        }
        return this.f16270.equals(((C5190) obj).f16270);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14953(C1662 c1662) {
        C21418 c21418M5627 = c1662.m5627();
        C4484 c4484M5620 = c1662.m5620();
        c21418M5627.m48540(this.f16270);
        this.f16269 = (C0747) c4484M5620.m13223(this.f16269);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14954(C1662 c1662, C18241 c18241) {
        C21418 c21418M5627 = c1662.m5627();
        C22390 c22390 = this.f16270;
        int iM48538 = c21418M5627.m48538((AbstractC16745) c22390);
        int iM9390 = this.f16269.m9390();
        if (c18241.m42506()) {
            c18241.m42501(0, ASN1Dump.TAB + c22390.mo2463());
            c18241.m42501(4, "      method_idx:      ".concat(C14712.m35008(iM48538)));
            c18241.m42501(4, "      annotations_off: ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM48538);
        c18241.m42514(iM9390);
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f16270.mo2463() + ": " + this.f16269;
    }
}
