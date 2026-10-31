package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBD4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21685 extends AbstractC6162 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String[] f69559 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f69560;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f69561;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "method handle";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21685 m48963(int i, AbstractC13717 abstractC13717) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC13717 instanceof AbstractC16745)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC13717.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(C19370.m44628(i, "type is out of range: "));
            }
        } else if (!(abstractC13717 instanceof C8985)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC13717.getClass());
        }
        return new C21685(i, abstractC13717);
    }

    public C21685(int i, AbstractC13717 abstractC13717) {
        this.f69561 = i;
        this.f69560 = abstractC13717;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m48966() {
        return this.f69560;
    }

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final int m48965() {
        return this.f69561;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48967() {
        int i = this.f69561;
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m48964() {
        switch (this.f69561) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48962(int i) {
        return f69559[i];
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        C21685 c21685 = (C21685) abstractC13717;
        int i = c21685.f69561;
        int i2 = this.f69561;
        if (i2 == i) {
            return this.f69560.compareTo(c21685.f69560);
        }
        return Integer.compare(i2, i);
    }

    public final String toString() {
        return "method-handle{" + mo2463() + l.d;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return f69559[this.f69561] + "," + this.f69560.toString();
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23388;
    }
}
