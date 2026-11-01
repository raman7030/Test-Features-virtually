package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBD4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22978 extends AbstractC8225 {

    /* JADX INFO: renamed from: ᩶ */
    public static final String[] f72264 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC15405 f72265;

    /* JADX INFO: renamed from: ᩹ */
    public final int f72266;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "method handle";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22978 m51312(int i, AbstractC15405 abstractC15405) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC15405 instanceof AbstractC18283)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC15405.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(C20778.m46922(i, "type is out of range: "));
            }
        } else if (!(abstractC15405 instanceof C10908)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC15405.getClass());
        }
        return new C22978(i, abstractC15405);
    }

    public C22978(int i, AbstractC15405 abstractC15405) {
        this.f72266 = i;
        this.f72265 = abstractC15405;
    }

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC15405 m51315() {
        return this.f72265;
    }

    /* JADX INFO: renamed from: ֫ۧ */
    public final int m51314() {
        return this.f72266;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m51316() {
        int i = this.f72266;
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m51313() {
        switch (this.f72266) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m51311(int i) {
        return f72264[i];
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        C22978 c22978 = (C22978) abstractC15405;
        int i = c22978.f72266;
        int i2 = this.f72266;
        if (i2 == i) {
            return this.f72265.compareTo(c22978.f72265);
        }
        return Integer.compare(i2, i);
    }

    public final String toString() {
        return "method-handle{" + mo4819() + C0249l.f1198d;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return f72264[this.f72266] + "," + this.f72265.toString();
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26300;
    }
}
