package p067l;

import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9SS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6356 extends AbstractC11581 {

    /* JADX INFO: renamed from: ܽ */
    public String f16469;

    /* JADX INFO: renamed from: ܿ */
    public int f16470;

    /* JADX INFO: renamed from: ᩳ */
    public C5015 f16471;

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
    }

    public C6356(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        C23395.m52059(c14677, 20229);
        c14677.readInt();
        this.f16469 = c14677.m33590();
        this.f16471 = new C5015(c14677);
        this.f16470 = C7026.m16158(c14677.m33590());
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20229);
        c11996.m27456();
        c11996.m27444(this.f16469);
        this.f16471.m10669(c11996);
        c11996.m27444(C7026.m16159(this.f16470));
        c11996.m27438();
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m14534() {
        return this.f16469;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14530(String str) {
        this.f16469 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14531(C5015 c5015) {
        this.f16471 = c5015;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C5015 m14535() {
        return this.f16471;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14533(String str) {
        this.f16470 = C7026.m16158(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14532() {
        int i = this.f16470;
        return i == 0 ? C7026.f18310 : i;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C6356 c6356 = new C6356(abstractC11581);
        c6356.f32258 = this.f32258;
        c6356.f16469 = this.f16469;
        c6356.f16471 = this.f16471;
        c6356.f16470 = this.f16470;
        return c6356;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        String strM26622 = C11567.m26622(i, "\t");
        sb.append(strM26622);
        sb.append("{\n");
        sb.append(strM26622);
        sb.append("\t");
        sb.append("numFormat: \"");
        sb.append(this.f16471.m10672());
        sb.append("\"\n");
        String strM10674 = this.f16471.m10674();
        if (!strM10674.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM26622, "\t", "iSuffixes: \"", strM10674);
            sb.append("\"\n");
        }
        String strM10670 = this.f16471.m10670();
        if (!strM10670.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM26622, "\t", "fSuffixes: \"", strM10670);
            sb.append("\"\n");
        }
        String strM16159 = C7026.m16159(this.f16470);
        if (strM16159 != null) {
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM26622, "\t", "style: \"", strM16159);
            sb.append("\"\n");
        }
        sb.append(strM26622);
        sb.append("}\n");
    }
}
