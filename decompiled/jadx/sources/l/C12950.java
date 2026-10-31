package l;

import java.util.ArrayList;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۬ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12950 implements InterfaceC0601, Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14775 f38847;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22390 f38848;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38848.compareTo(((C12950) obj).f38848);
    }

    public C12950(C22390 c22390, C13738 c13738, C1662 c1662) {
        this.f38848 = c22390;
        int size = c13738.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5687(new C0747(c13738.m41005get(i), c1662)));
        }
        this.f38847 = new C14775(EnumC3779.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public final int hashCode() {
        return this.f38848.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12950)) {
            return false;
        }
        return this.f38848.equals(((C12950) obj).f38848);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31483(C1662 c1662) {
        C21418 c21418M5627 = c1662.m5627();
        C4484 c4484M5620 = c1662.m5620();
        c21418M5627.m48540(this.f38848);
        c4484M5620.m13220((AbstractC3073) this.f38847);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31484(C1662 c1662, C18241 c18241) {
        C21418 c21418M5627 = c1662.m5627();
        C22390 c22390 = this.f38848;
        int iM48538 = c21418M5627.m48538((AbstractC16745) c22390);
        int iM9390 = this.f38847.m9390();
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38848.mo2463());
        sb.append(": ");
        boolean z = true;
        for (C5687 c5687 : (ArrayList) this.f38847.m35147()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c5687.mo2864());
        }
        return sb.toString();
    }
}
