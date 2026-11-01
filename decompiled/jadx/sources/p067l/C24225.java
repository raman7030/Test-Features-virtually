package p067l;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩺۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ALL */
/* JADX INFO: loaded from: classes.dex */
public final class C24225 extends AbstractC14167 {
    public volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: ۧ */
    public Object[] f76779;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC15507 f76780;

    /* JADX INFO: renamed from: ܽ */
    public final int f76781;

    /* JADX INFO: renamed from: ܿ */
    public final ReentrantLock f76782;

    /* JADX INFO: renamed from: ᩳ */
    public int f76783;

    @Override // p067l.AbstractC14167
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo32647() {
        return false;
    }

    @Override // p067l.AbstractC14167
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo32645(AbstractC24838 abstractC24838) {
        ReentrantLock reentrantLock = this.f76782;
        reentrantLock.lock();
        try {
            return super.mo32645(abstractC24838);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p067l.AbstractC14167
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo32649() {
        return this.size == 0;
    }

    @Override // p067l.AbstractC8132
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18847(C18975 c18975) {
        C16672 c16672 = C12156.f33986;
        ReentrantLock reentrantLock = this.f76782;
        reentrantLock.lock();
        try {
            int i = this.size;
            C19474 c19474M18850 = m18850();
            if (c19474M18850 != null) {
                reentrantLock.unlock();
                return c19474M18850;
            }
            C16672 c16673 = null;
            if (i < this.f76781) {
                this.size = i + 1;
            } else {
                int i2 = C13497.f37922[this.f76780.ordinal()];
                if (i2 == 1) {
                    c16673 = C12156.f33985;
                } else if (i2 == 2) {
                    c16673 = c16672;
                } else if (i2 != 3) {
                    throw new C10698();
                }
            }
            if (c16673 != null) {
                reentrantLock.unlock();
                return c16673;
            }
            if (i == 0) {
                while (true) {
                    InterfaceC8745 interfaceC8745M18853 = m18853();
                    if (interfaceC8745M18853 == null) {
                        break;
                    }
                    if (interfaceC8745M18853 instanceof C19474) {
                        this.size = i;
                        reentrantLock.unlock();
                        return interfaceC8745M18853;
                    }
                    if (interfaceC8745M18853.mo15498(c18975) != null) {
                        this.size = i;
                        C10027 c10027 = C10027.f27775;
                        reentrantLock.unlock();
                        interfaceC8745M18853.mo15496(c18975);
                        return interfaceC8745M18853.mo20215();
                    }
                }
            }
            m53538(i, c18975);
            reentrantLock.unlock();
            return c16672;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m53538(int i, C18975 c18975) {
        int i2 = this.f76781;
        if (i >= i2) {
            Object[] objArr = this.f76779;
            int i3 = this.f76783;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = c18975;
            this.f76783 = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f76779;
        if (i >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[iMin];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.f76779;
                objArr3[i4] = objArr4[(this.f76783 + i4) % objArr4.length];
            }
            Arrays.fill(objArr3, i, iMin, C12156.f33984);
            this.f76779 = objArr3;
            this.f76783 = 0;
        }
        Object[] objArr5 = this.f76779;
        objArr5[(this.f76783 + i) % objArr5.length] = c18975;
    }

    @Override // p067l.AbstractC14167
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo32648() {
        Object objMo44287;
        AbstractC22157 abstractC22157M18852;
        boolean z;
        Object obj = C12156.f33987;
        ReentrantLock reentrantLock = this.f76782;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                C19474 c19474M18850 = m18850();
                if (c19474M18850 != null) {
                    obj = c19474M18850;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f76779;
            int i2 = this.f76783;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            if (i != this.f76781 || (abstractC22157M18852 = m18852()) == null) {
                objMo44287 = obj;
                abstractC22157M18852 = null;
                z = false;
            } else {
                objMo44287 = abstractC22157M18852.mo44287();
                z = true;
            }
            if (objMo44287 != obj && !(objMo44287 instanceof C19474)) {
                this.size = i;
                Object[] objArr2 = this.f76779;
                objArr2[(this.f76783 + i) % objArr2.length] = objMo44287;
            }
            this.f76783 = (this.f76783 + 1) % this.f76779.length;
            C10027 c10027 = C10027.f27775;
            reentrantLock.unlock();
            if (z) {
                C13045.m29861(abstractC22157M18852);
            }
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p067l.AbstractC8132
    /* JADX INFO: renamed from: ֫ */
    public final String mo18848() {
        return "(buffer:capacity=" + this.f76781 + ",size=" + this.size + ')';
    }

    public C24225(int i, EnumC15507 enumC15507) {
        this.f76781 = i;
        this.f76780 = enumC15507;
        if (i < 1) {
            throw new IllegalArgumentException(C19768.m44906(i, "ArrayChannel capacity must be at least 1, but ", " was specified").toString());
        }
        this.f76782 = new ReentrantLock();
        int iMin = Math.min(i, 8);
        Object[] objArr = new Object[iMin];
        Arrays.fill(objArr, 0, iMin, C12156.f33984);
        this.f76779 = objArr;
        this.size = 0;
    }
}
