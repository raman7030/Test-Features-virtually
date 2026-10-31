package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8995 extends C1939 implements InterfaceC3350 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f27328;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f27329;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public String f27330;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f27331;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f27332;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f27333;

    public C8995(C20826 c20826, C7419 c7419) {
        super(c20826, c7419);
        this.f27331 = 0;
        this.f27330 = m24644(m24657(AbstractC9701.f29322, EnumC15204.f46466.m35967()));
        this.f29348 = EnumC0970.INNER_CLASSES;
    }

    @Override // l.C1939, l.AbstractC9701
    /* JADX INFO: renamed from: ܿ */
    public final int mo6398() {
        if (this.f27331 == 0) {
            boolean zMo24649 = mo24649();
            C7419 c7419 = this.f6488;
            if (zMo24649) {
                int iM24669 = c7419.f29349 - m24669();
                this.f27331 = iM24669;
                this.f27331 = Math.max(iM24669, this.f29353);
            } else {
                int iM246610 = c7419.f29349 - m24669();
                this.f27331 = iM246610;
                this.f27331 = Math.max(iM246610, this.f27330.length() + this.f29353);
            }
        }
        return this.f27331;
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        String strConcat = this.f27330.concat(EnumC6073.m16932(this.f27332, EnumC20185.INNER_CLASS));
        boolean z = this.f29343;
        boolean z2 = this.f29326;
        if (z2) {
            String strM23234 = m23234(strConcat);
            if (z) {
                m24654(strM23234);
            } else {
                this.f29325.mo1968(m24657(mo6398(), strM23234));
                m24654(" // ");
            }
        } else {
            m24654(strConcat);
        }
        if (!z2 || (z2 && !z)) {
            int i3 = this.f27328;
            C20826 c20826 = this.f6487;
            if (i3 != 0) {
                m24654(c20826.f35264.getName(this.f27328) + " = ");
            }
            int i4 = this.f27329;
            if (i4 != 0) {
                m24654(c20826.f35264.m25961(i4));
            }
            int i5 = this.f27333;
            if (i5 != 0) {
                m24654(" of " + c20826.f35264.m25961(i5));
            }
            m24662((!c20826.f29326 || z) ? l.b : "");
            return;
        }
        m24667();
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        if (i == 0) {
            m24665(EnumC15204.f46466.m35959() + " {");
        }
        m24664(1);
        String strM16932 = EnumC6073.m16932(this.f27332, EnumC20185.INNER_CLASS);
        boolean z = this.f29326;
        boolean z2 = this.f29343;
        if (z) {
            String strM23234 = m23234(strM16932);
            if (z2) {
                m24658(strM23234);
            } else {
                this.f29325.mo1968(m24643(mo6398(), strM23234));
                m24654(" // ");
            }
        } else {
            m24658(strM16932);
        }
        if (!z || (z && !z2)) {
            int i3 = this.f27328;
            C20826 c20826 = this.f6487;
            if (i3 != 0) {
                m24654(c20826.f35264.getName(i3) + " = ");
            }
            int i4 = this.f27329;
            if (i4 != 0) {
                m24654(c20826.f35264.m25961(i4));
            }
            int i5 = this.f27333;
            if (i5 != 0) {
                m24654(" of " + c20826.f35264.m25961(i5));
            }
            m24662((!c20826.f29326 || z2) ? l.b : "");
        } else {
            m24667();
        }
        m24653(1);
        if (i == i2 - 1) {
            m24665(l.d);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private String m23234(String str) {
        int i = this.f27328;
        if (i != 0) {
            str = str.concat(String.format("#%d = ", Integer.valueOf(i)));
        }
        int i2 = this.f27329;
        if (i2 != 0) {
            str = str.concat(String.format("#%d", Integer.valueOf(i2)));
        }
        int i3 = this.f27333;
        if (i3 != 0) {
            str = str.concat(String.format(" of #%d", Integer.valueOf(i3)));
        }
        return str.concat(l.b);
    }

    @Override // l.InterfaceC3350
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10250() {
        return m23234(EnumC6073.m16932(this.f27332, EnumC20185.INNER_CLASS)).length() + 1;
    }

    @Override // l.InterfaceC3350
    /* JADX INFO: renamed from: ֫ */
    public final void mo10249(int i) {
        this.f29353 = i;
    }
}
