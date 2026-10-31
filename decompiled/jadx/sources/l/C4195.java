package l;

import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9SS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4195 extends AbstractC9693 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f13656;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f13657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2784 f13658;

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
    }

    public C4195(AbstractC9693 abstractC9693, C12951 c12951) {
        super(abstractC9693);
        C22124.m49721(c12951, 20229);
        c12951.readInt();
        this.f13656 = c12951.m31503();
        this.f13658 = new C2784(c12951);
        this.f13657 = C4900.m14261(c12951.m31503());
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        c10130.mo13231(20229);
        c10130.m25436();
        c10130.m25424(this.f13656);
        this.f13658.m8606(c10130);
        c10130.m25424(C4900.m14262(this.f13657));
        c10130.m25418();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m12658() {
        return this.f13656;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12654(String str) {
        this.f13656 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12655(C2784 c2784) {
        this.f13658 = c2784;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2784 m12659() {
        return this.f13658;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12657(String str) {
        this.f13657 = C4900.m14261(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12656() {
        int i = this.f13657;
        return i == 0 ? C4900.f15477 : i;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        C4195 c4195 = new C4195(abstractC9693);
        c4195.f29308 = this.f29308;
        c4195.f13656 = this.f13656;
        c4195.f13658 = this.f13658;
        c4195.f13657 = this.f13657;
        return c4195;
    }

    @Override // l.AbstractC9693
    /* JADX INFO: renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        String strM24608 = C9679.m24608(i, "\t");
        sb.append(strM24608);
        sb.append("{\n");
        sb.append(strM24608);
        sb.append("\t");
        sb.append("numFormat: \"");
        sb.append(this.f13658.m8609());
        sb.append("\"\n");
        String strM8611 = this.f13658.m8611();
        if (!strM8611.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM24608, "\t", "iSuffixes: \"", strM8611);
            sb.append("\"\n");
        }
        String strM8607 = this.f13658.m8607();
        if (!strM8607.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM24608, "\t", "fSuffixes: \"", strM8607);
            sb.append("\"\n");
        }
        String strM14262 = C4900.m14262(this.f13657);
        if (strM14262 != null) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM24608, "\t", "style: \"", strM14262);
            sb.append("\"\n");
        }
        sb.append(strM24608);
        sb.append("}\n");
    }
}
