package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15198 extends C4211 {

    /* JADX INFO: renamed from: ۛ֫ */
    public int f43379;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f43380;

    /* JADX INFO: renamed from: ۫֫ */
    public int f43381;

    /* JADX INFO: renamed from: ۬֫ */
    public ArrayList f43382;

    public C15198() {
        throw null;
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6310() {
        ArrayList arrayList = this.f43382;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ֨ */
    private C23916 m34632() {
        String strM48081;
        C22161 c22161 = this.f9266;
        AbstractC5396 abstractC5396M27975 = c22161.f38266.m27975(this.f43381);
        C12102 c12102 = c22161.f38266;
        EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
        c12102.getClass();
        C3384 c3384 = new C3384(c12102, enumC14113);
        if (abstractC5396M27975 instanceof C3384) {
            c3384 = (C3384) abstractC5396M27975;
            strM48081 = c3384.mo5910() + C0249l.f1196b;
        } else {
            strM48081 = c22161.f38257.m48081("??? Invalid bootstrap method reference", new Object[0]);
            if (!this.f32275) {
                strM48081 = m26671(25, String.format("#%d", Integer.valueOf(this.f43381))).concat(" // ").concat(strM48081);
            }
        }
        return new C23916(strM48081, c3384);
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        C9419 c9419 = this.f9267;
        int i3 = c9419.f32298 - AbstractC11588.f32271;
        C23916 c23916M34632 = m34632();
        m26672(m26671(AbstractC11588.f32271, EnumC16818.f49600.m38127()));
        Map map = AbstractC11588.f32272;
        boolean z = this.f32292;
        int i4 = 1;
        boolean z2 = this.f32275;
        if (!z2) {
            m26676(m26659(c23916M34632.m52989(), m26683() + AbstractC11588.f32271, "", AbstractC11588.f32267));
        } else if (z) {
            m26676(String.format("#%d;", Integer.valueOf(this.f43381)));
        } else {
            m26675(i3, String.format("#%d;", Integer.valueOf(this.f43381)));
            m26676(" // " + m26659(c23916M34632.m52989(), m26670() + c9419.f32298, " // ", map));
        }
        m26672(m26671(AbstractC11588.f32271, " "));
        m26668("{ ");
        if (this.f43379 > 0) {
            m26681();
            m26678(2);
            if (z2) {
                int i5 = 0;
                while (i5 < this.f43379) {
                    Integer num = (Integer) this.f43382.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f43379 - i4;
                    String str = i5 != i6 ? "," : "";
                    boolean z3 = i5 != i6;
                    m26672(m26671(AbstractC11588.f32271, " "));
                    if (z) {
                        Object[] objArr = new Object[2];
                        objArr[0] = num;
                        objArr[i4] = str;
                        m26676(String.format("#%d%s", objArr));
                    } else {
                        C3384 c3384M52988 = c23916M34632.m52988();
                        c3384M52988.getClass();
                        String strM26659 = m26659(c3384M52988.m5906(iIntValue, "", z3 ? "⾀" : ""), m26683() + c9419.f32298, " // ", map);
                        m26675(i3 - (m26683() * 2), String.format("#%d%s", num, str));
                        m26676(" // " + strM26659);
                    }
                    i5++;
                    i4 = 1;
                    z = z;
                }
            } else {
                String strM5907 = c23916M34632.m52988().m5907(this, "", "");
                m26672(m26671(AbstractC11588.f32271 - m26683(), " "));
                m26676(m26659(strM5907, (m26683() * 2) + AbstractC11588.f32271, "", AbstractC11588.f32268));
            }
            m26667(2);
            m26672(m26671(AbstractC11588.f32271, " "));
        }
        m26676(C0249l.f1198d);
        if (i < i2 - 1) {
            m26681();
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        char c;
        C9419 c9419 = this.f9267;
        int i3 = c9419.f32298;
        int i4 = this.f43380;
        int iM26670 = (i3 - i4) - m26670();
        C23916 c23916M34632 = m34632();
        if (i == 0) {
            m26679(EnumC16818.f49600.m38119() + " {");
        }
        m26678(1);
        m26672(m26671(i4, String.format("%2d:", Integer.valueOf(i))));
        Map map = AbstractC11588.f32267;
        boolean z = this.f32292;
        boolean z2 = this.f32275;
        if (z2) {
            if (z) {
                m26676(String.format("#%d;", Integer.valueOf(this.f43381)));
            } else {
                m26675(iM26670, String.format("#%d;", Integer.valueOf(this.f43381)));
                m26676(" // " + m26659(c23916M34632.m52989(), m26683() + c9419.f32298, " // ", map));
            }
            c = 0;
        } else {
            c = 0;
            m26676(m26659(c23916M34632.m52989(), (m26683() * 2) + i4, "", map));
        }
        if (this.f43379 > 0) {
            m26679(" Arguments:");
            if (z2) {
                int iM26683 = (m26683() * 2) + iM26670 + i4;
                int i5 = 0;
                while (i5 < this.f43379) {
                    Integer num = (Integer) this.f43382.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f43379 - 1;
                    boolean z3 = i5 != i6;
                    String str = i5 != i6 ? "," : C0249l.f1196b;
                    m26672(m26671(i4, ""));
                    if (!z2) {
                        z2 = z2;
                    } else if (z) {
                        Object[] objArr = new Object[2];
                        objArr[c] = num;
                        objArr[1] = str;
                        m26676(String.format("#%d%s", objArr));
                        z2 = z2;
                    } else {
                        C3384 c3384M52988 = c23916M34632.m52988();
                        c3384M52988.getClass();
                        String strM26659 = m26659(c3384M52988.m5906(iIntValue, "", z3 ? "⾀" : ""), iM26683, " // ", AbstractC11588.f32272);
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = num;
                        objArr2[1] = str;
                        m26675(iM26670, String.format("#%d%s", objArr2));
                        m26676(" // " + strM26659);
                    }
                    i5++;
                    z2 = z2;
                    z = z;
                }
            } else {
                String strM5907 = c23916M34632.m52988().m5907(this, "", "");
                m26672(m26671(i4, " "));
                m26676(m26659(strM5907, (m26683() * 2) + i4, "", AbstractC11588.f32268) + C0249l.f1196b);
            }
        }
        if (i < i2 - 1) {
            m26681();
        } else {
            m26667(1);
            m26679(C0249l.f1198d);
        }
    }
}
