package p067l;

import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19376 {

    /* JADX INFO: renamed from: ۖ */
    public static final long f57833;

    /* JADX INFO: renamed from: ۘ */
    public static final Unsafe f57834;

    /* JADX INFO: renamed from: ۡ */
    public static final int f57835;

    /* JADX INFO: renamed from: ܺ */
    public static final int f57836;

    /* JADX INFO: renamed from: ֫ */
    public AbstractFutureC10659[] f57837;

    /* JADX INFO: renamed from: ۜ */
    public volatile int f57838;

    /* JADX INFO: renamed from: ۢ */
    public int f57839 = 4096;

    /* JADX INFO: renamed from: ۧ */
    public volatile int f57840 = 4096;

    /* JADX INFO: renamed from: ܳ */
    public volatile int f57841;

    /* JADX INFO: renamed from: ܽ */
    public int f57842;

    /* JADX INFO: renamed from: ܿ */
    public final C5965 f57843;

    /* JADX INFO: renamed from: ᩳ */
    public int f57844;

    /* JADX INFO: renamed from: ᩷ */
    public int f57845;

    /* JADX INFO: renamed from: ᩻ */
    public final C18705 f57846;

    public C19376(C18705 c18705, C5965 c5965) {
        this.f57846 = c18705;
        this.f57843 = c5965;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44108(AbstractFutureC10659 abstractFutureC10659) {
        int length;
        int i = this.f57839;
        AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
        if (abstractFutureC10659Arr == null || (length = abstractFutureC10659Arr.length) <= 0) {
            return;
        }
        long j = (((long) ((length - 1) & i)) << f57836) + ((long) f57835);
        C18705 c18705 = this.f57846;
        this.f57839 = i + 1;
        f57834.putOrderedObject(abstractFutureC10659Arr, j, abstractFutureC10659);
        int i2 = this.f57840 - i;
        if (i2 == 0) {
            C18034.m41073();
            c18705.m42688();
        } else if (i2 + length == 1) {
            m44106();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44106() {
        int i;
        AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
        int length = abstractFutureC10659Arr != null ? abstractFutureC10659Arr.length : 0;
        int i2 = length > 0 ? length << 1 : 8192;
        if (i2 < 8192 || i2 > 67108864) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        AbstractFutureC10659[] abstractFutureC10659Arr2 = new AbstractFutureC10659[i2];
        this.f57837 = abstractFutureC10659Arr2;
        if (abstractFutureC10659Arr == null || (i = length - 1) <= 0) {
            return;
        }
        int i3 = this.f57839;
        int i4 = this.f57840;
        if (i3 - i4 > 0) {
            int i5 = i2 - 1;
            do {
                long j = (((long) (i4 & i)) << f57836) + ((long) f57835);
                Unsafe unsafe = f57834;
                AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j);
                if (abstractFutureC10659 != null && C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC10659)) {
                    abstractFutureC10659Arr2[i4 & i5] = abstractFutureC10659;
                }
                i4++;
            } while (i4 != i3);
            C18034.m41074();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractFutureC10659 m44109() {
        int i;
        int length;
        while (true) {
            int i2 = this.f57840;
            int i3 = this.f57839;
            AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
            if (abstractFutureC10659Arr == null || (i = i2 - i3) >= 0 || (length = abstractFutureC10659Arr.length) <= 0) {
                return null;
            }
            long j = (((long) ((length - 1) & i2)) << f57836) + ((long) f57835);
            Unsafe unsafe = f57834;
            AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j);
            int i4 = i2 + 1;
            if (i2 == this.f57840) {
                if (abstractFutureC10659 != null) {
                    if (C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC10659)) {
                        this.f57840 = i4;
                        return abstractFutureC10659;
                    }
                } else if (i == -1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44114(AbstractFutureC10659 abstractFutureC10659) {
        int length;
        int i = this.f57840;
        int i2 = this.f57839;
        AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
        if (abstractFutureC10659Arr == null || i == i2 || (length = abstractFutureC10659Arr.length) <= 0) {
            return false;
        }
        int i3 = i2 - 1;
        if (!C8449.m19671(f57834, abstractFutureC10659Arr, (((long) ((length - 1) & i3)) << f57836) + ((long) f57835), abstractFutureC10659)) {
            return false;
        }
        this.f57839 = i3;
        C18034.m41074();
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44110(int i) {
        int length;
        while (true) {
            int i2 = this.f57840;
            int i3 = this.f57839;
            AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
            if (abstractFutureC10659Arr == null || i2 == i3 || (length = abstractFutureC10659Arr.length) <= 0) {
                return;
            }
            int i4 = i3 - 1;
            AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) C18705.m42671((((long) ((length - 1) & i4)) << f57836) + ((long) f57835), abstractFutureC10659Arr);
            if (abstractFutureC10659 == null) {
                return;
            }
            this.f57839 = i4;
            C18034.m41074();
            abstractFutureC10659.m24524();
            if (i != 0 && (i = i - 1) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44107(int i) {
        int i2;
        int length;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f57840;
                int i5 = this.f57839;
                AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
                if (abstractFutureC10659Arr == null || (i2 = i4 - i5) >= 0 || (length = abstractFutureC10659Arr.length) <= 0) {
                    return;
                }
                int i6 = i4 + 1;
                AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) C18705.m42671((((long) (i4 & (length - 1))) << f57836) + ((long) f57835), abstractFutureC10659Arr);
                if (abstractFutureC10659 != null) {
                    this.f57840 = i6;
                    abstractFutureC10659.m24524();
                    if (i != 0 && (i3 = i3 + 1) == i) {
                        return;
                    }
                }
            }
        } while (i2 != -1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44111(AbstractFutureC10659 abstractFutureC10659) {
        AbstractFutureC10659[] abstractFutureC10659Arr;
        int length;
        int i = this.f57840;
        int i2 = this.f57839;
        if (i - i2 >= 0 || (abstractFutureC10659Arr = this.f57837) == null || (length = abstractFutureC10659Arr.length) <= 0) {
            return;
        }
        int i3 = length - 1;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            long j = ((i5 & i3) << f57836) + f57835;
            Unsafe unsafe = f57834;
            AbstractFutureC10659 abstractFutureC106510 = (AbstractFutureC10659) unsafe.getObject(abstractFutureC10659Arr, j);
            if (abstractFutureC106510 == null) {
                return;
            }
            if (abstractFutureC106510 == abstractFutureC10659) {
                if (C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC106510)) {
                    this.f57839 = i4;
                    while (i5 != i4) {
                        int i6 = i5 + 1;
                        int i7 = f57836;
                        int i8 = f57835;
                        long j2 = ((i6 & i3) << i7) + i8;
                        Unsafe unsafe2 = f57834;
                        AbstractFutureC10659 abstractFutureC106511 = (AbstractFutureC10659) unsafe2.getObject(abstractFutureC10659Arr, j2);
                        unsafe2.putObjectVolatile(abstractFutureC10659Arr, j2, (Object) null);
                        unsafe2.putOrderedObject(abstractFutureC10659Arr, ((i5 & i3) << i7) + i8, abstractFutureC106511);
                        i5 = i6;
                    }
                    C18034.m41074();
                    abstractFutureC106510.m24524();
                    return;
                }
                return;
            }
            i5--;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44112() {
        return f57834.compareAndSwapInt(this, f57833, 0, 1);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44113(AbstractFutureC10659 abstractFutureC10659) {
        int length;
        int i = this.f57839;
        int i2 = i - 1;
        AbstractFutureC10659[] abstractFutureC10659Arr = this.f57837;
        if (abstractFutureC10659Arr != null && (length = abstractFutureC10659Arr.length) > 0) {
            boolean z = true;
            long j = (((long) ((length - 1) & i2)) << f57836) + ((long) f57835);
            Unsafe unsafe = f57834;
            if (((AbstractFutureC10659) unsafe.getObject(abstractFutureC10659Arr, j)) == abstractFutureC10659) {
                long j2 = f57833;
                if (unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                    if (this.f57839 == i && this.f57837 == abstractFutureC10659Arr && C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC10659)) {
                        this.f57839 = i2;
                    } else {
                        z = false;
                    }
                    unsafe.putOrderedInt(this, j2, 0);
                    return z;
                }
            }
        }
        return false;
    }

    static {
        Unsafe unsafe = C3282.f6392;
        f57834 = unsafe;
        try {
            f57833 = unsafe.objectFieldOffset(C19376.class.getDeclaredField("ܳ"));
            f57835 = unsafe.arrayBaseOffset(AbstractFutureC10659[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC10659[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f57836 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
