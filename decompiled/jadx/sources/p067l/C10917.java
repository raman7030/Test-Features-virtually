package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10917 extends C4211 implements InterfaceC5552 {

    /* JADX INFO: renamed from: ۛ֫ */
    public int f30262;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f30263;

    /* JADX INFO: renamed from: ۨ֫ */
    public String f30264;

    /* JADX INFO: renamed from: ۫֫ */
    public int f30265;

    /* JADX INFO: renamed from: ۬֫ */
    public int f30266;

    /* JADX INFO: renamed from: ᩺֫ */
    public int f30267;

    public C10917(C22161 c22161, C9419 c9419) {
        super(c22161, c9419);
        this.f30265 = 0;
        this.f30264 = m26658(m26671(AbstractC11588.f32271, EnumC16818.f49591.m38127()));
        this.f32297 = EnumC3290.INNER_CLASSES;
    }

    @Override // p067l.C4211, p067l.AbstractC11588
    /* JADX INFO: renamed from: ܿ */
    public final int mo8555() {
        if (this.f30265 == 0) {
            boolean zMo26663 = mo26663();
            C9419 c9419 = this.f9267;
            if (zMo26663) {
                int iM26683 = c9419.f32298 - m26683();
                this.f30265 = iM26683;
                this.f30265 = Math.max(iM26683, this.f32302);
            } else {
                int iM26684 = c9419.f32298 - m26683();
                this.f30265 = iM26684;
                this.f30265 = Math.max(iM26684, this.f30264.length() + this.f32302);
            }
        }
        return this.f30265;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        String strConcat = this.f30264.concat(EnumC8140.m18861(this.f30266, EnumC21552.INNER_CLASS));
        boolean z = this.f32292;
        boolean z2 = this.f32275;
        if (z2) {
            String strM25178 = m25178(strConcat);
            if (z) {
                m26668(strM25178);
            } else {
                this.f32274.mo4344(m26671(mo8555(), strM25178));
                m26668(" // ");
            }
        } else {
            m26668(strConcat);
        }
        if (!z2 || (z2 && !z)) {
            int i3 = this.f30262;
            C22161 c22161 = this.f9266;
            if (i3 != 0) {
                m26668(c22161.f38266.getName(this.f30262) + " = ");
            }
            int i4 = this.f30263;
            if (i4 != 0) {
                m26668(c22161.f38266.m27983(i4));
            }
            int i5 = this.f30267;
            if (i5 != 0) {
                m26668(" of " + c22161.f38266.m27983(i5));
            }
            m26676((!c22161.f32275 || z) ? C0249l.f1196b : "");
            return;
        }
        m26681();
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        if (i == 0) {
            m26679(EnumC16818.f49591.m38119() + " {");
        }
        m26678(1);
        String strM18861 = EnumC8140.m18861(this.f30266, EnumC21552.INNER_CLASS);
        boolean z = this.f32275;
        boolean z2 = this.f32292;
        if (z) {
            String strM25178 = m25178(strM18861);
            if (z2) {
                m26672(strM25178);
            } else {
                this.f32274.mo4344(m26657(mo8555(), strM25178));
                m26668(" // ");
            }
        } else {
            m26672(strM18861);
        }
        if (!z || (z && !z2)) {
            int i3 = this.f30262;
            C22161 c22161 = this.f9266;
            if (i3 != 0) {
                m26668(c22161.f38266.getName(i3) + " = ");
            }
            int i4 = this.f30263;
            if (i4 != 0) {
                m26668(c22161.f38266.m27983(i4));
            }
            int i5 = this.f30267;
            if (i5 != 0) {
                m26668(" of " + c22161.f38266.m27983(i5));
            }
            m26676((!c22161.f32275 || z2) ? C0249l.f1196b : "");
        } else {
            m26681();
        }
        m26667(1);
        if (i == i2 - 1) {
            m26679(C0249l.f1198d);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private String m25178(String str) {
        int i = this.f30262;
        if (i != 0) {
            str = str.concat(String.format("#%d = ", Integer.valueOf(i)));
        }
        int i2 = this.f30263;
        if (i2 != 0) {
            str = str.concat(String.format("#%d", Integer.valueOf(i2)));
        }
        int i3 = this.f30267;
        if (i3 != 0) {
            str = str.concat(String.format(" of #%d", Integer.valueOf(i3)));
        }
        return str.concat(C0249l.f1196b);
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12286() {
        return m25178(EnumC8140.m18861(this.f30266, EnumC21552.INNER_CLASS)).length() + 1;
    }

    @Override // p067l.InterfaceC5552
    /* JADX INFO: renamed from: ֫ */
    public final void mo12285(int i) {
        this.f32302 = i;
    }
}
