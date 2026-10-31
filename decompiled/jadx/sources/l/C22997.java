package l;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩺۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ALL */
/* JADX INFO: loaded from: classes.dex */
public final class C22997 extends AbstractC12414 {
    public volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[] f74040;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC13824 f74041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74042;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f74043;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74044;

    @Override // l.AbstractC12414
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo30583() {
        return false;
    }

    @Override // l.AbstractC12414
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30581(AbstractC23642 abstractC23642) {
        ReentrantLock reentrantLock = this.f74043;
        reentrantLock.lock();
        try {
            return super.mo30581(abstractC23642);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.AbstractC12414
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo30585() {
        return this.size == 0;
    }

    @Override // l.AbstractC6064
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16918(C17473 c17473) {
        C15050 c15050 = C10298.f31023;
        ReentrantLock reentrantLock = this.f74043;
        reentrantLock.lock();
        try {
            int i = this.size;
            C17998 c17998M16921 = m16921();
            if (c17998M16921 != null) {
                reentrantLock.unlock();
                return c17998M16921;
            }
            C15050 c15051 = null;
            if (i < this.f74042) {
                this.size = i + 1;
            } else {
                int i2 = C11709.f34922[this.f74041.ordinal()];
                if (i2 == 1) {
                    c15051 = C10298.f31022;
                } else if (i2 == 2) {
                    c15051 = c15050;
                } else if (i2 != 3) {
                    throw new C8764();
                }
            }
            if (c15051 != null) {
                reentrantLock.unlock();
                return c15051;
            }
            if (i == 0) {
                while (true) {
                    InterfaceC6709 interfaceC6709M16924 = m16924();
                    if (interfaceC6709M16924 == null) {
                        break;
                    }
                    if (interfaceC6709M16924 instanceof C17998) {
                        this.size = i;
                        reentrantLock.unlock();
                        return interfaceC6709M16924;
                    }
                    if (interfaceC6709M16924.mo13623(c17473) != null) {
                        this.size = i;
                        C8058 c8058 = C8058.f24861;
                        reentrantLock.unlock();
                        interfaceC6709M16924.mo13621(c17473);
                        return interfaceC6709M16924.mo18267();
                    }
                }
            }
            m51145(i, c17473);
            reentrantLock.unlock();
            return c15050;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m51145(int i, C17473 c17473) {
        int i2 = this.f74042;
        if (i >= i2) {
            Object[] objArr = this.f74040;
            int i3 = this.f74044;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = c17473;
            this.f74044 = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f74040;
        if (i >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[iMin];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.f74040;
                objArr3[i4] = objArr4[(this.f74044 + i4) % objArr4.length];
            }
            Arrays.fill(objArr3, i, iMin, C10298.f31021);
            this.f74040 = objArr3;
            this.f74044 = 0;
        }
        Object[] objArr5 = this.f74040;
        objArr5[(this.f74044 + i) % objArr5.length] = c17473;
    }

    @Override // l.AbstractC12414
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo30584() {
        Object objMo42037;
        AbstractC20821 abstractC20821M16923;
        boolean z;
        Object obj = C10298.f31024;
        ReentrantLock reentrantLock = this.f74043;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                C17998 c17998M16921 = m16921();
                if (c17998M16921 != null) {
                    obj = c17998M16921;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f74040;
            int i2 = this.f74044;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            if (i != this.f74042 || (abstractC20821M16923 = m16923()) == null) {
                objMo42037 = obj;
                abstractC20821M16923 = null;
                z = false;
            } else {
                objMo42037 = abstractC20821M16923.mo42037();
                z = true;
            }
            if (objMo42037 != obj && !(objMo42037 instanceof C17998)) {
                this.size = i;
                Object[] objArr2 = this.f74040;
                objArr2[(this.f74044 + i) % objArr2.length] = objMo42037;
            }
            this.f74044 = (this.f74044 + 1) % this.f74040.length;
            C8058 c8058 = C8058.f24861;
            reentrantLock.unlock();
            if (z) {
                C11233.m27799(abstractC20821M16923);
            }
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.AbstractC6064
    /* JADX INFO: renamed from: ֫ */
    public final String mo16919() {
        return "(buffer:capacity=" + this.f74042 + ",size=" + this.size + ')';
    }

    public C22997(int i, EnumC13824 enumC13824) {
        this.f74042 = i;
        this.f74041 = enumC13824;
        if (i < 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "ArrayChannel capacity must be at least 1, but ", " was specified").toString());
        }
        this.f74043 = new ReentrantLock();
        int iMin = Math.min(i, 8);
        Object[] objArr = new Object[iMin];
        Arrays.fill(objArr, 0, iMin, C10298.f31021);
        this.f74040 = objArr;
        this.size = 0;
    }
}
