package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14298 implements InterfaceC23016 {

    /* JADX INFO: renamed from: ֫ */
    public int f40704;

    /* JADX INFO: renamed from: ܿ */
    public int f40708;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f40706 = true;

    /* JADX INFO: renamed from: ᩳ */
    public final int f40709 = 65536;

    /* JADX INFO: renamed from: ܽ */
    public int f40707 = 0;

    /* JADX INFO: renamed from: ۧ */
    public C10275[] f40705 = new C10275[100];

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C10275 m32855() {
        C10275 c10275;
        int i = this.f40704 + 1;
        this.f40704 = i;
        int i2 = this.f40707;
        if (i2 > 0) {
            C10275[] c10275Arr = this.f40705;
            int i3 = i2 - 1;
            this.f40707 = i3;
            c10275 = c10275Arr[i3];
            c10275.getClass();
            this.f40705[this.f40707] = null;
        } else {
            C10275 c10276 = new C10275(new byte[this.f40709], 0);
            C10275[] c10275Arr2 = this.f40705;
            if (i > c10275Arr2.length) {
                this.f40705 = (C10275[]) Arrays.copyOf(c10275Arr2, c10275Arr2.length * 2);
            }
            c10275 = c10276;
        }
        return c10275;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m32856(int i) {
        boolean z = i < this.f40708;
        this.f40708 = i;
        if (z) {
            m32861();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized int m32860() {
        return this.f40704 * this.f40709;
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized void m32861() {
        int iMax = Math.max(0, C5792.m12975(this.f40708, this.f40709) - this.f40704);
        int i = this.f40707;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f40705, iMax, i, (Object) null);
        this.f40707 = iMax;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m32862() {
        if (this.f40706) {
            m32856(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m32857(C10275 c10275) {
        C10275[] c10275Arr = this.f40705;
        int i = this.f40707;
        this.f40707 = i + 1;
        c10275Arr[i] = c10275;
        this.f40704--;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m32858(InterfaceC16979 interfaceC16979) {
        while (interfaceC16979 != null) {
            C10275[] c10275Arr = this.f40705;
            int i = this.f40707;
            this.f40707 = i + 1;
            c10275Arr[i] = interfaceC16979.mo20604();
            this.f40704--;
            interfaceC16979 = interfaceC16979.next();
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m32859() {
        return this.f40709;
    }
}
