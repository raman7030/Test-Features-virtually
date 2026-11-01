package p067l;

/* JADX INFO: renamed from: l.۬ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBGV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14950 extends C20376 {

    /* JADX INFO: renamed from: ۙ */
    public int f42692;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3830[] f42693;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean[] f42694;

    public C14950(int i) {
        super(i != 0);
        this.f42693 = new InterfaceC3830[i];
        this.f42694 = new boolean[i];
        this.f42692 = 0;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C14950 m34208() {
        InterfaceC3830[] interfaceC3830Arr = this.f42693;
        C14950 c14950 = new C14950(interfaceC3830Arr.length);
        System.arraycopy(interfaceC3830Arr, 0, c14950.f42693, 0, interfaceC3830Arr.length);
        boolean[] zArr = c14950.f42694;
        boolean[] zArr2 = this.f42694;
        System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
        c14950.f42692 = this.f42692;
        return c14950;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34212(C4933 c4933) {
        int i = this.f42692 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder sbM11879 = C5410.m11879("stack[", i2 == i ? "top0" : C16351.m37153(i - i2), "]: ");
            InterfaceC3830 interfaceC3830 = this.f42693[i2];
            sbM11879.append(interfaceC3830 == null ? "<invalid>" : interfaceC3830.toString());
            c4933.m23570(sbM11879.toString());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34215(C9566 c9566) {
        if (this.f42692 == 0) {
            return;
        }
        m46001();
        C9566 c9566M22282 = c9566.m22282();
        for (int i = 0; i < this.f42692; i++) {
            InterfaceC3830[] interfaceC3830Arr = this.f42693;
            if (interfaceC3830Arr[i] == c9566) {
                interfaceC3830Arr[i] = c9566M22282;
            }
        }
    }

    public final int size() {
        return this.f42692;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m34213() {
        m46001();
        for (int i = 0; i < this.f42692; i++) {
            this.f42693[i] = null;
            this.f42694[i] = false;
        }
        this.f42692 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34211(InterfaceC3830 interfaceC3830) {
        m46001();
        try {
            InterfaceC3830 interfaceC3830Mo7483 = interfaceC3830.mo7483();
            int iM22291 = interfaceC3830Mo7483.getType().m22291();
            int i = this.f42692;
            int i2 = i + iM22291;
            InterfaceC3830[] interfaceC3830Arr = this.f42693;
            if (i2 > interfaceC3830Arr.length) {
                m34207("overflow");
                throw null;
            }
            if (iM22291 == 2) {
                interfaceC3830Arr[i] = null;
                this.f42692 = i + 1;
            }
            int i3 = this.f42692;
            interfaceC3830Arr[i3] = interfaceC3830Mo7483;
            this.f42692 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m34217() {
        m46001();
        this.f42694[this.f42692] = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3830 m34209(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f42692;
        if (i >= i2) {
            m34207("underflow");
            throw null;
        }
        return this.f42693[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34216(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f42692;
        if (i >= i2) {
            throw new C4933("stack: underflow", null);
        }
        return this.f42694[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9566 m34218(int i) {
        return m34209(i).getType();
    }

    /* JADX INFO: renamed from: ۠ */
    public final InterfaceC3830 m34214() {
        m46001();
        InterfaceC3830 interfaceC3830M34209 = m34209(0);
        int i = this.f42692;
        int i2 = i - 1;
        this.f42693[i2] = null;
        this.f42694[i2] = false;
        this.f42692 = i - interfaceC3830M34209.getType().m22291();
        return interfaceC3830M34209;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34210(int i, InterfaceC3830 interfaceC3830) {
        m46001();
        try {
            InterfaceC3830 interfaceC3830Mo7483 = interfaceC3830.mo7483();
            int i2 = (this.f42692 - i) - 1;
            InterfaceC3830[] interfaceC3830Arr = this.f42693;
            InterfaceC3830 interfaceC3831 = interfaceC3830Arr[i2];
            if (interfaceC3831 == null || interfaceC3831.getType().m22291() != interfaceC3830Mo7483.getType().m22291()) {
                StringBuilder sb = new StringBuilder("incompatible substitution: ");
                sb.append(interfaceC3831 == null ? "<invalid>" : interfaceC3831.toString());
                sb.append(" -> ");
                sb.append(interfaceC3830Mo7483 != null ? interfaceC3830Mo7483.toString() : "<invalid>");
                m34207(sb.toString());
                throw null;
            }
            interfaceC3830Arr[i2] = interfaceC3830Mo7483;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34207(String str) {
        throw new C4933(C21466.m48631("stack: ", str), null);
    }
}
