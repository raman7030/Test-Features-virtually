package p067l;

import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.᩸ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22783 implements InterfaceC3830, InterfaceC2940, Comparable {

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ int f71809 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3830 f71811;

    /* JADX INFO: renamed from: ᩸ */
    public final C20101 f71812;

    /* JADX INFO: renamed from: ᩹ */
    public final int f71813;

    /* JADX INFO: renamed from: ۬ */
    public static final ConcurrentMapC12768 f71810 = new ConcurrentMapC12768(10000, 0.75f);

    /* JADX INFO: renamed from: ۗ */
    public static final ThreadLocal f71808 = new C10042();

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo7482() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22783 m50972(int i, InterfaceC3830 interfaceC3830, C20101 c20101) {
        C16746 c16746 = (C16746) f71808.get();
        c16746.m37992(i, interfaceC3830, c20101);
        ConcurrentMapC12768 concurrentMapC12768 = f71810;
        C22783 c22783M37991 = (C22783) concurrentMapC12768.get(c16746);
        if (c22783M37991 == null) {
            c22783M37991 = c16746.m37991();
            C22783 c22783 = (C22783) concurrentMapC12768.putIfAbsent(c22783M37991, c22783M37991);
            if (c22783 != null) {
                return c22783;
            }
        }
        return c22783M37991;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22783 m50968(int i, InterfaceC3830 interfaceC3830) {
        return m50972(i, interfaceC3830, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22783 m50969(int i, C9566 c9566, C20101 c20101) {
        if (c20101 == null) {
            throw new NullPointerException("local  == null");
        }
        return m50972(i, c9566, c20101);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C22783 m50973(int i, InterfaceC3830 interfaceC3830, C20101 c20101) {
        return m50972(i, interfaceC3830, c20101);
    }

    public C22783(int i, InterfaceC3830 interfaceC3830, C20101 c20101) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC3830 == null) {
            throw new NullPointerException("type == null");
        }
        this.f71813 = i;
        this.f71811 = interfaceC3830;
        this.f71812 = c20101;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22783)) {
            if (!(obj instanceof C16746)) {
                return false;
            }
            C16746 c16746 = (C16746) obj;
            return m50970(c16746.f49368, c16746.f49369, c16746.f49367);
        }
        C22783 c22783 = (C22783) obj;
        return m50970(c22783.f71813, c22783.f71811, c22783.f71812);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50984(C22783 c22783) {
        return m50988(c22783) && this.f71813 == c22783.f71813;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m50988(C22783 c22783) {
        if (c22783 != null && this.f71811.getType().equals(c22783.f71811.getType())) {
            Object obj = c22783.f71812;
            C20101 c20101 = this.f71812;
            if (c20101 == obj) {
                return true;
            }
            if (c20101 != null && c20101.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m50970(int i, InterfaceC3830 interfaceC3830, C20101 c20101) {
        if (this.f71813 != i || !this.f71811.equals(interfaceC3830)) {
            return false;
        }
        C20101 c20102 = this.f71812;
        if (c20102 != c20101) {
            return c20102 != null && c20102.equals(c20101);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C22783 c22783) {
        int i = c22783.f71813;
        C20101 c20101 = c22783.f71812;
        int i2 = this.f71813;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c22783) {
            return 0;
        }
        int iM22279 = this.f71811.getType().compareTo(c22783.f71811.getType());
        if (iM22279 != 0) {
            return iM22279;
        }
        C20101 c20102 = this.f71812;
        if (c20102 == null) {
            return c20101 == null ? 0 : -1;
        }
        if (c20101 == null) {
            return 1;
        }
        return c20102.compareTo(c20101);
    }

    public final int hashCode() {
        C20101 c20101 = this.f71812;
        return ((this.f71811.hashCode() + ((c20101 != null ? c20101.hashCode() : 0) * 31)) * 31) + this.f71813;
    }

    public final String toString() {
        return m50967(false);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return m50967(true);
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return this.f71811.getType();
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC3830 mo7483() {
        return this.f71811.mo7483();
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ܿ */
    public final int mo7484() {
        return this.f71811.mo7484();
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7485() {
        return this.f71811.mo7485();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m50989() {
        return this.f71813;
    }

    /* JADX INFO: renamed from: ֡ */
    public final InterfaceC3830 m50974() {
        return this.f71811;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C20101 m50990() {
        return this.f71812;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m50986() {
        return m50982() + this.f71813;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50982() {
        return this.f71811.getType().m22291();
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m50980() {
        return this.f71811.getType().m22285();
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m50981() {
        return C20778.m46922(this.f71813, C0655am.f2277aE);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22783 m50987(C22783 c22783) {
        InterfaceC3830 interfaceC3830;
        InterfaceC3830 type;
        if (this != c22783) {
            if (c22783 != null) {
                InterfaceC3830 interfaceC3831 = c22783.f71811;
                int i = c22783.f71813;
                int i2 = this.f71813;
                if (i2 == i) {
                    C20101 c20101 = this.f71812;
                    C20101 c20102 = (c20101 == null || !c20101.equals(c22783.f71812)) ? null : c20101;
                    boolean z = c20102 == c20101;
                    if (z && (type = (interfaceC3830 = this.f71811).getType()) == interfaceC3831.getType()) {
                        if (interfaceC3830.equals(interfaceC3831)) {
                            type = interfaceC3830;
                        }
                        if (type != interfaceC3830 || !z) {
                            if (c20102 == null) {
                                return m50972(i2, type, null);
                            }
                            return m50972(i2, type, c20102);
                        }
                    }
                }
            }
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22783 m50983(int i) {
        return this.f71813 == i ? this : m50972(i, this.f71811, this.f71812);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m50978(InterfaceC3830 interfaceC3830) {
        return m50972(this.f71813, interfaceC3830, this.f71812);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m50977(int i) {
        return i == 0 ? this : m50983(this.f71813 + i);
    }

    /* JADX INFO: renamed from: ܶ */
    public final C22783 m50985() {
        C9566 type;
        InterfaceC3830 interfaceC3830 = this.f71811;
        if (interfaceC3830 instanceof C9566) {
            type = (C9566) interfaceC3830;
        } else {
            type = interfaceC3830.getType();
        }
        if (type.m22281()) {
            type = type.m22282();
        }
        return type == interfaceC3830 ? this : m50972(this.f71813, type, this.f71812);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m50979(C20101 c20101) {
        C20101 c20102 = this.f71812;
        return (c20102 == c20101 || (c20102 != null && c20102.equals(c20101))) ? this : m50972(this.f71813, this.f71811, c20101);
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m50975() {
        return (this.f71813 & 1) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m50967(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m50981());
        sb.append(":");
        C20101 c20101 = this.f71812;
        if (c20101 != null) {
            sb.append(c20101.toString());
        }
        InterfaceC3830 interfaceC3830 = this.f71811;
        C9566 type = interfaceC3830.getType();
        sb.append(type);
        if (type != interfaceC3830) {
            sb.append("=");
            if (z && (interfaceC3830 instanceof C14930)) {
                sb.append(((C14930) interfaceC3830).m34150());
            } else if (z && (interfaceC3830 instanceof AbstractC15405)) {
                sb.append(interfaceC3830.mo4819());
            } else {
                sb.append(interfaceC3830);
            }
        }
        return sb.toString();
    }
}
