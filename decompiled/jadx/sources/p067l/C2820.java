package p067l;

/* JADX INFO: renamed from: l.֡ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BBC */
/* JADX INFO: loaded from: classes3.dex */
public final class C2820 extends AbstractC3491 {

    /* JADX INFO: renamed from: ۜ */
    public final C16981 f4832;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f4833;

    /* JADX INFO: renamed from: ܿ */
    public final C22388 f4834;

    /* JADX INFO: renamed from: ᩻ */
    public final C16981[] f4835;

    public C2820(C12054 c12054, C16981 c16981, C22388 c22388, C16981[] c16981Arr) {
        super(c12054, C21442.f67643);
        if (c16981 == null) {
            throw new NullPointerException("user == null");
        }
        if (c22388 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c16981Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = c22388.size();
        if (size != c16981Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f4832 = c16981;
        this.f4834 = c22388;
        this.f4835 = c16981Arr;
        boolean z = true;
        if (c22388.size() >= 2) {
            long jM4460 = m4460(c22388);
            long size2 = (((long) c22388.size()) * 4) + 2;
            if (jM4460 < 0 || jM4460 > (size2 * 5) / 4) {
                z = false;
            }
        }
        this.f4833 = z;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final int mo4465() {
        boolean z = this.f4833;
        C22388 c22388 = this.f4834;
        return (int) (z ? m4460(c22388) : (((long) c22388.size()) * 4) + 2);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final void mo4463(C19705 c19705) {
        int iM15870;
        int iM15871 = this.f4832.m15870();
        int iMo9224 = C14300.f40855.m34267().mo9224();
        C16981[] c16981Arr = this.f4835;
        int length = c16981Arr.length;
        boolean z = this.f4833;
        C22388 c22388 = this.f4834;
        int i = 0;
        if (z) {
            int i2 = length == 0 ? 0 : c22388.get(0);
            int i3 = ((length == 0 ? 0 : c22388.get(length - 1)) - i2) + 1;
            c19705.m44770(256);
            c19705.m44770(i3);
            c19705.m44773(i2);
            int i4 = 0;
            while (i < i3) {
                if (c22388.get(i4) > i2 + i) {
                    iM15870 = iMo9224;
                } else {
                    iM15870 = c16981Arr[i4].m15870() - iM15871;
                    i4++;
                }
                c19705.m44773(iM15870);
                i++;
            }
            return;
        }
        c19705.m44770(512);
        c19705.m44770(length);
        for (int i5 = 0; i5 < length; i5++) {
            c19705.m44773(c22388.get(i5));
        }
        while (i < length) {
            c19705.m44773(c16981Arr[i].m15870() - iM15871);
            i++;
        }
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C2820(m15863(), this.f4832, this.f4834, this.f4835);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m4464() {
        return this.f4833;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        StringBuilder sb = new StringBuilder(100);
        C16981[] c16981Arr = this.f4835;
        int length = c16981Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f4834.get(i));
            sb.append(": ");
            sb.append(c16981Arr[i]);
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        int iM15870 = this.f4832.m15870();
        StringBuilder sb = new StringBuilder(100);
        C16981[] c16981Arr = this.f4835;
        int length = c16981Arr.length;
        sb.append(this.f4833 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(C16351.m37153(iM15870));
        for (int i = 0; i < length; i++) {
            int iM15871 = c16981Arr[i].m15870();
            sb.append("\n  ");
            sb.append(this.f4834.get(i));
            sb.append(": ");
            sb.append(C16351.m37155(iM15871));
            sb.append(" // ");
            sb.append(C16351.m37150(iM15871 - iM15870));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m4460(C22388 c22388) {
        long j = (((((long) c22388.get(c22388.size() - 1)) - ((long) c22388.get(0))) + 1) * 2) + 4;
        if (j <= 2147483647L) {
            return j;
        }
        return -1L;
    }
}
