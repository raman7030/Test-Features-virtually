package p067l;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: l.ܳۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C16119 extends Random {
    public static final long serialVersionUID = -5851777807851030925L;

    /* JADX INFO: renamed from: a */
    public long f47439a;

    /* JADX INFO: renamed from: b */
    public int f47440b;

    /* JADX INFO: renamed from: c */
    public final boolean f47441c;
    public static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f47435d = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f47436e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    public static final C6732 f47437f = new C6732();

    /* JADX INFO: renamed from: g */
    public static final AtomicLong f47438g = new AtomicLong(m36698f(System.currentTimeMillis()) ^ m36698f(System.nanoTime()));

    public /* synthetic */ C16119(int i) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public static int m36697e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* JADX INFO: renamed from: f */
    public static long m36698f(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public C16119() {
        this.f47441c = true;
    }

    /* JADX INFO: renamed from: d */
    public static final void m36696d() {
        int iAddAndGet = f47436e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jM36698f = m36698f(f47438g.getAndAdd(-4942790177534073029L));
        C16119 c16119 = (C16119) f47437f.get();
        c16119.f47439a = jM36698f;
        c16119.f47440b = iAddAndGet;
    }

    public static C16119 current() {
        C16119 c16119 = (C16119) f47437f.get();
        if (c16119.f47440b == 0) {
            m36696d();
        }
        return c16119;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f47441c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m36702g() {
        long j = this.f47439a - 7046029254386353131L;
        this.f47439a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    /* JADX INFO: renamed from: c */
    public final long m36701c(long j, long j2) {
        long jM36698f = m36698f(m36702g());
        if (j >= j2) {
            return jM36698f;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (jM36698f & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = jM36698f >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                jM36698f = m36698f(m36702g());
            }
        } else {
            while (true) {
                if (jM36698f >= j && jM36698f < j2) {
                    return jM36698f;
                }
                jM36698f = m36698f(m36702g());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m36700b(int i, int i2) {
        int iM36697e = m36697e(m36702g());
        if (i >= i2) {
            return iM36697e;
        }
        int i3 = i2 - i;
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return (iM36697e & i4) + i;
        }
        if (i3 > 0) {
            int iM36697e2 = iM36697e >>> 1;
            while (true) {
                int i5 = iM36697e2 + i4;
                int i6 = iM36697e2 % i3;
                if (i5 - i6 >= 0) {
                    return i6 + i;
                }
                iM36697e2 = m36697e(m36702g()) >>> 1;
            }
        } else {
            while (true) {
                if (iM36697e >= i && iM36697e < i2) {
                    return iM36697e;
                }
                iM36697e = m36697e(m36702g());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m36699a(double d, double d2) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return dNextLong;
        }
        double d3 = ((d2 - d) * dNextLong) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m36697e(m36702g());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iM36697e = m36697e(m36702g());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return iM36697e & i2;
        }
        while (true) {
            int i3 = iM36697e >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            iM36697e = m36697e(m36702g());
        }
    }

    public final int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m36700b(i, i2);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m36698f(m36702g());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jM36698f = m36698f(m36702g());
        long j2 = j - 1;
        if ((j & j2) == 0) {
            return jM36698f & j2;
        }
        while (true) {
            long j3 = jM36698f >>> 1;
            long j4 = j3 + j2;
            long j5 = j3 % j;
            if (j4 - j5 >= 0) {
                return j5;
            }
            jM36698f = m36698f(m36702g());
        }
    }

    public final long nextLong(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m36701c(j, j2);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m36698f(m36702g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dM36698f = (m36698f(m36702g()) >>> 11) * 1.1102230246251565E-16d * d;
        return dM36698f < d ? dM36698f : Double.longBitsToDouble(Double.doubleToLongBits(d) - 1);
    }

    public final double nextDouble(double d, double d2) {
        if (d >= d2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m36699a(d, d2);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m36697e(m36702g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m36697e(m36702g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f47435d;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                f47435d.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j >= 0) {
            return C4405.convert(C16474.m37399a(new C14778(0L, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C4405.convert(C16474.m37399a(new C14778(0L, C14849.FOREVER_NS, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i < i2) {
            return C4405.convert(C16474.m37399a(new C14778(0L, j, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(int i, int i2) {
        if (i < i2) {
            return C4405.convert(C16474.m37399a(new C14778(0L, C14849.FOREVER_NS, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        C14108 c14108 = new C14108(0L, j, C14849.FOREVER_NS, 0L);
        return C19494.m44322b(new C2629(c14108, EnumC9335.m21659n(c14108), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        C14108 c14108 = new C14108(0L, C14849.FOREVER_NS, C14849.FOREVER_NS, 0L);
        return C19494.m44322b(new C2629(c14108, EnumC9335.m21659n(c14108), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j2 >= j3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C14108 c14108 = new C14108(0L, j, j2, j3);
        return C19494.m44322b(new C2629(c14108, EnumC9335.m21659n(c14108), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C14108 c14108 = new C14108(0L, C14849.FOREVER_NS, j, j2);
        return C19494.m44322b(new C2629(c14108, EnumC9335.m21659n(c14108), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        C5391 c5391 = new C5391(0L, j, Double.MAX_VALUE, 0.0d);
        return C16215.m36972b(new C22273(c5391, EnumC9335.m21659n(c5391), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        C5391 c5391 = new C5391(0L, C14849.FOREVER_NS, Double.MAX_VALUE, 0.0d);
        return C16215.m36972b(new C22273(c5391, EnumC9335.m21659n(c5391), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d >= d2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C5391 c5391 = new C5391(0L, j, d, d2);
        return C16215.m36972b(new C22273(c5391, EnumC9335.m21659n(c5391), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d, double d2) {
        if (d >= d2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C5391 c5391 = new C5391(0L, C14849.FOREVER_NS, d, d2);
        return C16215.m36972b(new C22273(c5391, EnumC9335.m21659n(c5391), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new C14424(2))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = ((long) seed[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) seed[i]) & 255);
            }
            f47438g.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f47439a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
