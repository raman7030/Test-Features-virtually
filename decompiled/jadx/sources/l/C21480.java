package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩸ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21480 implements InterfaceC1538, InterfaceC0601, Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69111 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 f69113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18658 f69114;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f69115;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f69112 = new ConcurrentMapC10942(10000, 0.75f);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f69110 = new C8074();

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5253() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21480 m48635(int i, InterfaceC1538 interfaceC1538, C18658 c18658) {
        C15128 c15128 = (C15128) f69110.get();
        c15128.m35834(i, interfaceC1538, c18658);
        ConcurrentMapC10942 concurrentMapC10942 = f69112;
        C21480 c21480M35833 = (C21480) concurrentMapC10942.get(c15128);
        if (c21480M35833 == null) {
            c21480M35833 = c15128.m35833();
            C21480 c21480 = (C21480) concurrentMapC10942.putIfAbsent(c21480M35833, c21480M35833);
            if (c21480 != null) {
                return c21480;
            }
        }
        return c21480M35833;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21480 m48631(int i, InterfaceC1538 interfaceC1538) {
        return m48635(i, interfaceC1538, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21480 m48632(int i, C7573 c7573, C18658 c18658) {
        if (c18658 == null) {
            throw new NullPointerException("local  == null");
        }
        return m48635(i, c7573, c18658);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C21480 m48636(int i, InterfaceC1538 interfaceC1538, C18658 c18658) {
        return m48635(i, interfaceC1538, c18658);
    }

    public C21480(int i, InterfaceC1538 interfaceC1538, C18658 c18658) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC1538 == null) {
            throw new NullPointerException("type == null");
        }
        this.f69115 = i;
        this.f69113 = interfaceC1538;
        this.f69114 = c18658;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21480)) {
            if (!(obj instanceof C15128)) {
                return false;
            }
            C15128 c15128 = (C15128) obj;
            return m48633(c15128.f46248, c15128.f46249, c15128.f46247);
        }
        C21480 c21480 = (C21480) obj;
        return m48633(c21480.f69115, c21480.f69113, c21480.f69114);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48647(C21480 c21480) {
        return m48651(c21480) && this.f69115 == c21480.f69115;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m48651(C21480 c21480) {
        if (c21480 != null && this.f69113.getType().equals(c21480.f69113.getType())) {
            Object obj = c21480.f69114;
            C18658 c18658 = this.f69114;
            if (c18658 == obj) {
                return true;
            }
            if (c18658 != null && c18658.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48633(int i, InterfaceC1538 interfaceC1538, C18658 c18658) {
        if (this.f69115 != i || !this.f69113.equals(interfaceC1538)) {
            return false;
        }
        C18658 c18659 = this.f69114;
        if (c18659 != c18658) {
            return c18659 != null && c18659.equals(c18658);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C21480 c21480) {
        int i = c21480.f69115;
        C18658 c18658 = c21480.f69114;
        int i2 = this.f69115;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c21480) {
            return 0;
        }
        int iM20302 = this.f69113.getType().compareTo(c21480.f69113.getType());
        if (iM20302 != 0) {
            return iM20302;
        }
        C18658 c18659 = this.f69114;
        if (c18659 == null) {
            return c18658 == null ? 0 : -1;
        }
        if (c18658 == null) {
            return 1;
        }
        return c18659.compareTo(c18658);
    }

    public final int hashCode() {
        C18658 c18658 = this.f69114;
        return ((this.f69113.hashCode() + ((c18658 != null ? c18658.hashCode() : 0) * 31)) * 31) + this.f69115;
    }

    public final String toString() {
        return m48630(false);
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return m48630(true);
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return this.f69113.getType();
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC1538 mo5254() {
        return this.f69113.mo5254();
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ܿ */
    public final int mo5255() {
        return this.f69113.mo5255();
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5256() {
        return this.f69113.mo5256();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m48652() {
        return this.f69115;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 m48637() {
        return this.f69113;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18658 m48653() {
        return this.f69114;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m48649() {
        return m48645() + this.f69115;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48645() {
        return this.f69113.getType().m20314();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m48643() {
        return this.f69113.getType().m20308();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m48644() {
        return C19370.m44628(this.f69115, am.aE);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21480 m48650(C21480 c21480) {
        InterfaceC1538 interfaceC1538;
        InterfaceC1538 type;
        if (this != c21480) {
            if (c21480 != null) {
                InterfaceC1538 interfaceC1539 = c21480.f69113;
                int i = c21480.f69115;
                int i2 = this.f69115;
                if (i2 == i) {
                    C18658 c18658 = this.f69114;
                    C18658 c18659 = (c18658 == null || !c18658.equals(c21480.f69114)) ? null : c18658;
                    boolean z = c18659 == c18658;
                    if (z && (type = (interfaceC1538 = this.f69113).getType()) == interfaceC1539.getType()) {
                        if (interfaceC1538.equals(interfaceC1539)) {
                            type = interfaceC1538;
                        }
                        if (type != interfaceC1538 || !z) {
                            if (c18659 == null) {
                                return m48635(i2, type, null);
                            }
                            return m48635(i2, type, c18659);
                        }
                    }
                }
            }
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21480 m48646(int i) {
        return this.f69115 == i ? this : m48635(i, this.f69113, this.f69114);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m48641(InterfaceC1538 interfaceC1538) {
        return m48635(this.f69115, interfaceC1538, this.f69114);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m48640(int i) {
        return i == 0 ? this : m48646(this.f69115 + i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C21480 m48648() {
        C7573 type;
        InterfaceC1538 interfaceC1538 = this.f69113;
        if (interfaceC1538 instanceof C7573) {
            type = (C7573) interfaceC1538;
        } else {
            type = interfaceC1538.getType();
        }
        if (type.m20304()) {
            type = type.m20305();
        }
        return type == interfaceC1538 ? this : m48635(this.f69115, type, this.f69114);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m48642(C18658 c18658) {
        C18658 c18659 = this.f69114;
        return (c18659 == c18658 || (c18659 != null && c18659.equals(c18658))) ? this : m48635(this.f69115, this.f69113, c18658);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m48638() {
        return (this.f69115 & 1) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m48630(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m48644());
        sb.append(":");
        C18658 c18658 = this.f69114;
        if (c18658 != null) {
            sb.append(c18658.toString());
        }
        InterfaceC1538 interfaceC1538 = this.f69113;
        C7573 type = interfaceC1538.getType();
        sb.append(type);
        if (type != interfaceC1538) {
            sb.append("=");
            if (z && (interfaceC1538 instanceof C13217)) {
                sb.append(((C13217) interfaceC1538).m32052());
            } else if (z && (interfaceC1538 instanceof AbstractC13717)) {
                sb.append(interfaceC1538.mo2463());
            } else {
                sb.append(interfaceC1538);
            }
        }
        return sb.toString();
    }
}
