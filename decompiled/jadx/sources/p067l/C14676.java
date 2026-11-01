package p067l;

import java.util.ArrayList;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۬ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14676 implements InterfaceC2940, Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C16411 f41891;

    /* JADX INFO: renamed from: ᩹ */
    public final C23648 f41892;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41892.compareTo(((C14676) obj).f41892);
    }

    public C14676(C23648 c23648, C15425 c15425, C3948 c3948) {
        this.f41892 = c23648;
        int size = c15425.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C7774(new C3079(c15425.m56525get(i), c3948)));
        }
        this.f41891 = new C16411(EnumC5960.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public final int hashCode() {
        return this.f41892.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14676)) {
            return false;
        }
        return this.f41892.equals(((C14676) obj).f41892);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33570(C3948 c3948) {
        C22724 c22724M7857 = c3948.m7857();
        C6630 c6630M7850 = c3948.m7850();
        c22724M7857.m50876(this.f41892);
        c6630M7850.m15102((AbstractC5289) this.f41891);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33571(C3948 c3948, C19705 c19705) {
        C22724 c22724M7857 = c3948.m7857();
        C23648 c23648 = this.f41892;
        int iM50874 = c22724M7857.m50874((AbstractC18283) c23648);
        int iM11432 = this.f41891.m11432();
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41892.mo4819());
        sb.append(": ");
        boolean z = true;
        for (C7774 c7774 : (ArrayList) this.f41891.m37294()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c7774.mo5193());
        }
        return sb.toString();
    }
}
