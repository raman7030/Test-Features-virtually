package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܰ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14152 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20316 f42708;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22390 f42709;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f42710;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f42711;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
    }

    public C14152(C20316 c20316, boolean z, C22390 c22390) {
        super(1, -1);
        if (c20316 == null) {
            throw new NullPointerException("code == null");
        }
        this.f42708 = c20316;
        this.f42710 = z;
        this.f42709 = c22390;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        try {
            byte[] bArrM33763 = m33763(c4484.m16521(), null, null, false);
            this.f42711 = bArrM33763;
            m9389(bArrM33763.length);
        } catch (RuntimeException e) {
            throw C8136.m21601("...while placing debug info for " + this.f42709.mo2463(), e);
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33764(C1662 c1662, C18241 c18241) {
        m33763(c1662, ASN1Dump.TAB, c18241, false);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        if (c18241.m42506()) {
            c18241.m42503(m9391() + " debug info");
            m33763(c1662, null, c18241, true);
        }
        c18241.m42505(this.f42711);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m33763(C1662 c1662, String str, C18241 c18241, boolean z) {
        C20316 c20316 = this.f42708;
        C20938 c20938M46601 = c20316.m46601();
        C1887 c1887M46603 = c20316.m46603();
        C3382 c3382M46604 = c20316.m46604();
        C23325 c23325 = new C23325(c20938M46601, c1887M46603, c1662, c3382M46604.m10315(), c3382M46604.m10318(), this.f42710, this.f42709);
        if (c18241 == null) {
            return c23325.m51729();
        }
        return c23325.m51730(str, c18241, z);
    }
}
