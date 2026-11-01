package p067l;

import com.umeng.analytics.pro.C0655am;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۨۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13336 {

    /* JADX INFO: renamed from: ֫ */
    public int f37454;

    /* JADX INFO: renamed from: ۧ */
    public int f37455;

    /* JADX INFO: renamed from: ܽ */
    public final String f37456;

    /* JADX INFO: renamed from: ܿ */
    public int f37457;

    /* JADX INFO: renamed from: ᩳ */
    public int f37458;

    public C13336(AbstractC4619 abstractC4619, String str) {
        int iMo5704 = abstractC4619.mo5704();
        this.f37456 = str;
        this.f37454 = 1;
        this.f37457 = iMo5704;
        this.f37455 = iMo5704;
        this.f37458 = iMo5704;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30462(AbstractC4619 abstractC4619) {
        int iMo5704 = abstractC4619.mo5704();
        this.f37454++;
        this.f37457 += iMo5704;
        if (iMo5704 > this.f37455) {
            this.f37455 = iMo5704;
        }
        if (iMo5704 < this.f37458) {
            this.f37458 = iMo5704;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30463(C19705 c19705) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(EnumC2483.f3919);
        sb2.append(this.f37456);
        sb2.append(": ");
        sb2.append(this.f37454);
        sb2.append(" item");
        sb2.append(this.f37454 == 1 ? "" : C0655am.f2274aB);
        sb2.append("; ");
        sb2.append(this.f37457);
        sb2.append(" bytes total\n");
        sb.append(sb2.toString());
        if (this.f37458 == this.f37455) {
            sb.append(ASN1Dump.TAB + this.f37458 + " bytes/item\n");
        } else {
            sb.append(ASN1Dump.TAB + this.f37458 + ".." + this.f37455 + " bytes/item; average " + (this.f37457 / this.f37454) + "\n");
        }
        c19705.m44762(sb.toString());
    }
}
