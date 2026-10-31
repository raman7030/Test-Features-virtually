package l;

import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۨۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f34459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34460;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f34461;

    public C11540(AbstractC2368 abstractC2368, String str) {
        int iMo3385 = abstractC2368.mo3385();
        this.f34459 = str;
        this.f34457 = 1;
        this.f34460 = iMo3385;
        this.f34458 = iMo3385;
        this.f34461 = iMo3385;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28416(AbstractC2368 abstractC2368) {
        int iMo3385 = abstractC2368.mo3385();
        this.f34457++;
        this.f34460 += iMo3385;
        if (iMo3385 > this.f34458) {
            this.f34458 = iMo3385;
        }
        if (iMo3385 < this.f34461) {
            this.f34461 = iMo3385;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28417(C18241 c18241) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(EnumC0121.f1143);
        sb2.append(this.f34459);
        sb2.append(": ");
        sb2.append(this.f34457);
        sb2.append(" item");
        sb2.append(this.f34457 == 1 ? "" : am.aB);
        sb2.append("; ");
        sb2.append(this.f34460);
        sb2.append(" bytes total\n");
        sb.append(sb2.toString());
        if (this.f34461 == this.f34458) {
            sb.append(ASN1Dump.TAB + this.f34461 + " bytes/item\n");
        } else {
            sb.append(ASN1Dump.TAB + this.f34461 + ".." + this.f34458 + " bytes/item; average " + (this.f34460 / this.f34457) + "\n");
        }
        c18241.m42503(sb.toString());
    }
}
