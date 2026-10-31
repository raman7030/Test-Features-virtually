package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13500 extends C1939 {

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f40309;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f40310;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f40311;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40312;

    public C13500() {
        throw null;
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4066() {
        ArrayList arrayList = this.f40312;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C22673 m32530() {
        String strM45769;
        C20826 c20826 = this.f6487;
        AbstractC3186 abstractC3186M25953 = c20826.f35264.m25953(this.f40311);
        C10242 c10242 = c20826.f35264;
        EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
        c10242.getClass();
        C1069 c1069 = new C1069(c10242, enumC12358);
        if (abstractC3186M25953 instanceof C1069) {
            c1069 = (C1069) abstractC3186M25953;
            strM45769 = c1069.mo3639() + l.b;
        } else {
            strM45769 = c20826.f35255.m45769("??? Invalid bootstrap method reference", new Object[0]);
            if (!this.f29326) {
                strM45769 = m24657(25, String.format("#%d", Integer.valueOf(this.f40311))).concat(" // ").concat(strM45769);
            }
        }
        return new C22673(strM45769, c1069);
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        C7419 c7419 = this.f6488;
        int i3 = c7419.f29349 - AbstractC9701.f29322;
        C22673 c22673M32530 = m32530();
        m24658(m24657(AbstractC9701.f29322, EnumC15204.f46475.m35967()));
        Map map = AbstractC9701.f29323;
        boolean z = this.f29343;
        int i4 = 1;
        boolean z2 = this.f29326;
        if (!z2) {
            m24662(m24645(c22673M32530.m50663(), m24669() + AbstractC9701.f29322, "", AbstractC9701.f29318));
        } else if (z) {
            m24662(String.format("#%d;", Integer.valueOf(this.f40311)));
        } else {
            m24661(i3, String.format("#%d;", Integer.valueOf(this.f40311)));
            m24662(" // " + m24645(c22673M32530.m50663(), m24656() + c7419.f29349, " // ", map));
        }
        m24658(m24657(AbstractC9701.f29322, " "));
        m24654("{ ");
        if (this.f40309 > 0) {
            m24667();
            m24664(2);
            if (z2) {
                int i5 = 0;
                while (i5 < this.f40309) {
                    Integer num = (Integer) this.f40312.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f40309 - i4;
                    String str = i5 != i6 ? "," : "";
                    boolean z3 = i5 != i6;
                    m24658(m24657(AbstractC9701.f29322, " "));
                    if (z) {
                        Object[] objArr = new Object[2];
                        objArr[0] = num;
                        objArr[i4] = str;
                        m24662(String.format("#%d%s", objArr));
                    } else {
                        C1069 c1069M50662 = c22673M32530.m50662();
                        c1069M50662.getClass();
                        String strM24645 = m24645(c1069M50662.m3635(iIntValue, "", z3 ? "⾀" : ""), m24669() + c7419.f29349, " // ", map);
                        m24661(i3 - (m24669() * 2), String.format("#%d%s", num, str));
                        m24662(" // " + strM24645);
                    }
                    i5++;
                    i4 = 1;
                    z = z;
                }
            } else {
                String strM3636 = c22673M32530.m50662().m3636(this, "", "");
                m24658(m24657(AbstractC9701.f29322 - m24669(), " "));
                m24662(m24645(strM3636, (m24669() * 2) + AbstractC9701.f29322, "", AbstractC9701.f29319));
            }
            m24653(2);
            m24658(m24657(AbstractC9701.f29322, " "));
        }
        m24662(l.d);
        if (i < i2 - 1) {
            m24667();
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        char c;
        C7419 c7419 = this.f6488;
        int i3 = c7419.f29349;
        int i4 = this.f40310;
        int iM24656 = (i3 - i4) - m24656();
        C22673 c22673M32530 = m32530();
        if (i == 0) {
            m24665(EnumC15204.f46475.m35959() + " {");
        }
        m24664(1);
        m24658(m24657(i4, String.format("%2d:", Integer.valueOf(i))));
        Map map = AbstractC9701.f29318;
        boolean z = this.f29343;
        boolean z2 = this.f29326;
        if (z2) {
            if (z) {
                m24662(String.format("#%d;", Integer.valueOf(this.f40311)));
            } else {
                m24661(iM24656, String.format("#%d;", Integer.valueOf(this.f40311)));
                m24662(" // " + m24645(c22673M32530.m50663(), m24669() + c7419.f29349, " // ", map));
            }
            c = 0;
        } else {
            c = 0;
            m24662(m24645(c22673M32530.m50663(), (m24669() * 2) + i4, "", map));
        }
        if (this.f40309 > 0) {
            m24665(" Arguments:");
            if (z2) {
                int iM24669 = (m24669() * 2) + iM24656 + i4;
                int i5 = 0;
                while (i5 < this.f40309) {
                    Integer num = (Integer) this.f40312.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f40309 - 1;
                    boolean z3 = i5 != i6;
                    String str = i5 != i6 ? "," : l.b;
                    m24658(m24657(i4, ""));
                    if (!z2) {
                        z2 = z2;
                    } else if (z) {
                        Object[] objArr = new Object[2];
                        objArr[c] = num;
                        objArr[1] = str;
                        m24662(String.format("#%d%s", objArr));
                        z2 = z2;
                    } else {
                        C1069 c1069M50662 = c22673M32530.m50662();
                        c1069M50662.getClass();
                        String strM24645 = m24645(c1069M50662.m3635(iIntValue, "", z3 ? "⾀" : ""), iM24669, " // ", AbstractC9701.f29323);
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = num;
                        objArr2[1] = str;
                        m24661(iM24656, String.format("#%d%s", objArr2));
                        m24662(" // " + strM24645);
                    }
                    i5++;
                    z2 = z2;
                    z = z;
                }
            } else {
                String strM3636 = c22673M32530.m50662().m3636(this, "", "");
                m24658(m24657(i4, " "));
                m24662(m24645(strM3636, (m24669() * 2) + i4, "", AbstractC9701.f29319) + l.b);
            }
        }
        if (i < i2 - 1) {
            m24667();
        } else {
            m24653(1);
            m24665(l.d);
        }
    }
}
