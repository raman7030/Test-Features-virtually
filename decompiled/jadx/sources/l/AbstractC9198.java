package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9198 implements InterfaceC21048 {
    public static final C16002 a = new C16002();
    public static final C20321 b = new C20321();
    public static final C1892 c = new C1892();
    public static final C2682 d = new C2682();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract void M(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585);

    public abstract boolean N(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585);

    public abstract InterfaceC5214 Q(InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction);

    public abstract long R(InterfaceC15234 interfaceC15234);

    public abstract InterfaceC8948 c0(long j, IntFunction intFunction);

    public abstract InterfaceC18204 e0();

    public abstract InterfaceC0585 f0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585);

    public abstract InterfaceC0585 g0(InterfaceC0585 interfaceC0585);

    public abstract InterfaceC15234 h0(InterfaceC15234 interfaceC15234);

    @Override // l.InterfaceC21048
    public /* synthetic */ int j() {
        return 0;
    }

    public static C17022 W(Function function) {
        C17022 c17022 = new C17022(11);
        c17022.b = function;
        return c17022;
    }

    public static C10379 d0(EnumC20342 enumC20342, Predicate predicate) {
        C11003.requireNonNull(predicate);
        C11003.requireNonNull(enumC20342);
        return new C10379(EnumC8578.REFERENCE, enumC20342, new C3202(enumC20342, predicate, 3));
    }

    public static AbstractC9904 P(EnumC8578 enumC8578) {
        int i = AbstractC10153.a[enumC8578.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + enumC8578);
    }

    public static C10379 a0(EnumC20342 enumC20342, IntPredicate intPredicate) {
        C11003.requireNonNull(intPredicate);
        C11003.requireNonNull(enumC20342);
        return new C10379(EnumC8578.INT_VALUE, enumC20342, new C3202(enumC20342, intPredicate, 1));
    }

    public static InterfaceC5214 F(InterfaceC5214 interfaceC5214, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC5214.count()) {
            return interfaceC5214;
        }
        InterfaceC15234 interfaceC15234Spliterator = interfaceC5214.spliterator();
        long j3 = j2 - j;
        InterfaceC8948 interfaceC8948G = G(j3, intFunction);
        interfaceC8948G.c(j3);
        for (int i = 0; i < j && interfaceC15234Spliterator.tryAdvance(new C23742(10)); i++) {
        }
        if (j2 == interfaceC5214.count()) {
            interfaceC15234Spliterator.forEachRemaining(interfaceC8948G);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC15234Spliterator.tryAdvance(interfaceC8948G); i2++) {
            }
        }
        interfaceC8948G.end();
        return interfaceC8948G.build();
    }

    public static AbstractC14221 L(EnumC8578 enumC8578, InterfaceC5214 interfaceC5214, InterfaceC5214 interfaceC5215) {
        int i = AbstractC10153.a[enumC8578.ordinal()];
        if (i == 1) {
            return new C16813(interfaceC5214, interfaceC5215);
        }
        if (i == 2) {
            return new C18183((InterfaceC6809) interfaceC5214, (InterfaceC6809) interfaceC5215);
        }
        if (i == 3) {
            return new C18889((InterfaceC6103) interfaceC5214, (InterfaceC6103) interfaceC5215);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC8578);
        }
        return new C13079((InterfaceC8492) interfaceC5214, (InterfaceC8492) interfaceC5215);
    }

    public static C10379 b0(EnumC20342 enumC20342, LongPredicate longPredicate) {
        C11003.requireNonNull(longPredicate);
        C11003.requireNonNull(enumC20342);
        return new C10379(EnumC8578.LONG_VALUE, enumC20342, new C3202(enumC20342, longPredicate, 0));
    }

    public static void t() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C10379 Z(EnumC20342 enumC20342, DoublePredicate doublePredicate) {
        C11003.requireNonNull(doublePredicate);
        C11003.requireNonNull(enumC20342);
        return new C10379(EnumC8578.DOUBLE_VALUE, enumC20342, new C3202(enumC20342, doublePredicate, 2));
    }

    public static void u() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC8948 G(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C15546(j, intFunction);
        }
        return new C18931();
    }

    public static void m() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void p(InterfaceC10422 interfaceC10422, Integer num) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC10422.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC10422.accept(num.intValue());
    }

    public static void r(InterfaceC14696 interfaceC14696, Long l2) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC14696.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC14696.accept(l2.longValue());
    }

    public static InterfaceC22437 X(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C8220();
        }
        return new C20921(j);
    }

    public static void n(InterfaceC5483 interfaceC5483, Double d2) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC5483.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC5483.accept(d2.doubleValue());
    }

    public static InterfaceC7620 Y(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C0379();
        }
        return new C14490(j);
    }

    public static Object[] v(InterfaceC23558 interfaceC23558, IntFunction intFunction) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC23558.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC23558.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC23558.count());
        interfaceC23558.k(objArr, 0);
        return objArr;
    }

    public static InterfaceC16086 O(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C11149();
        }
        return new C4819(j);
    }

    public static InterfaceC5214 H(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        long jR = abstractC9198.R(interfaceC15234);
        if (jR < 0 || !interfaceC15234.hasCharacteristics(16384)) {
            C16607 c16607 = new C16607();
            c16607.a = intFunction;
            InterfaceC5214 interfaceC5214 = (InterfaceC5214) new C17313(abstractC9198, interfaceC15234, c16607, new C23742(18), 3).invoke();
            return z ? S(interfaceC5214, intFunction) : interfaceC5214;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jR);
        new C13243(interfaceC15234, abstractC9198, objArr).invoke();
        return new C0110(objArr);
    }

    public static void A(InterfaceC6809 interfaceC6809, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC6809.g((IntConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(interfaceC6809.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC18764) interfaceC6809.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void x(InterfaceC6809 interfaceC6809, Integer[] numArr, int i) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC6809.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC6809.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static InterfaceC6809 D(InterfaceC6809 interfaceC6809, long j, long j2) {
        if (j == 0 && j2 == interfaceC6809.count()) {
            return interfaceC6809;
        }
        long j3 = j2 - j;
        InterfaceC18764 interfaceC18764 = (InterfaceC18764) interfaceC6809.spliterator();
        InterfaceC22437 interfaceC22437X = X(j3);
        interfaceC22437X.c(j3);
        for (int i = 0; i < j && interfaceC18764.tryAdvance((IntConsumer) new C12020(0)); i++) {
        }
        if (j2 == interfaceC6809.count()) {
            interfaceC18764.forEachRemaining((IntConsumer) interfaceC22437X);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC18764.tryAdvance((IntConsumer) interfaceC22437X); i2++) {
            }
        }
        interfaceC22437X.end();
        return interfaceC22437X.build();
    }

    public static InterfaceC6809 J(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, boolean z) {
        long jR = abstractC9198.R(interfaceC15234);
        if (jR < 0 || !interfaceC15234.hasCharacteristics(16384)) {
            InterfaceC6809 interfaceC6809 = (InterfaceC6809) new C17313(abstractC9198, interfaceC15234, new C23742(14), new C23742(15), 1).invoke();
            return z ? U(interfaceC6809) : interfaceC6809;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jR];
        new C17477(interfaceC15234, abstractC9198, iArr).invoke();
        return new C23308(iArr);
    }

    public static InterfaceC6103 K(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, boolean z) {
        long jR = abstractC9198.R(interfaceC15234);
        if (jR < 0 || !interfaceC15234.hasCharacteristics(16384)) {
            InterfaceC6103 interfaceC6103 = (InterfaceC6103) new C17313(abstractC9198, interfaceC15234, new C23742(16), new C23742(17), 2).invoke();
            return z ? V(interfaceC6103) : interfaceC6103;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jR];
        new C19595(interfaceC15234, abstractC9198, jArr).invoke();
        return new C9990(jArr);
    }

    public static void B(InterfaceC6103 interfaceC6103, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC6103.g((LongConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(interfaceC6103.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC0418) interfaceC6103.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void y(InterfaceC6103 interfaceC6103, Long[] lArr, int i) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC6103.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC6103.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static InterfaceC6103 E(InterfaceC6103 interfaceC6103, long j, long j2) {
        if (j == 0 && j2 == interfaceC6103.count()) {
            return interfaceC6103;
        }
        long j3 = j2 - j;
        InterfaceC0418 interfaceC0418 = (InterfaceC0418) interfaceC6103.spliterator();
        InterfaceC7620 interfaceC7620Y = Y(j3);
        interfaceC7620Y.c(j3);
        for (int i = 0; i < j && interfaceC0418.tryAdvance((LongConsumer) new C1164(0)); i++) {
        }
        if (j2 == interfaceC6103.count()) {
            interfaceC0418.forEachRemaining((LongConsumer) interfaceC7620Y);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC0418.tryAdvance((LongConsumer) interfaceC7620Y); i2++) {
            }
        }
        interfaceC7620Y.end();
        return interfaceC7620Y.build();
    }

    public static InterfaceC8492 I(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, boolean z) {
        long jR = abstractC9198.R(interfaceC15234);
        if (jR < 0 || !interfaceC15234.hasCharacteristics(16384)) {
            InterfaceC8492 interfaceC8492 = (InterfaceC8492) new C17313(abstractC9198, interfaceC15234, new C23742(12), new C23742(13), 0).invoke();
            return z ? T(interfaceC8492) : interfaceC8492;
        }
        if (jR >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jR];
        new C12374(interfaceC15234, abstractC9198, dArr).invoke();
        return new C4114(dArr);
    }

    public static InterfaceC5214 S(InterfaceC5214 interfaceC5214, IntFunction intFunction) {
        if (interfaceC5214.o() <= 0) {
            return interfaceC5214;
        }
        long jCount = interfaceC5214.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C11065(interfaceC5214, objArr).invoke();
        return new C0110(objArr);
    }

    public static void z(InterfaceC8492 interfaceC8492, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC8492.g((DoubleConsumer) consumer);
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(interfaceC8492.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC8160) interfaceC8492.spliterator()).forEachRemaining(consumer);
        }
    }

    public static InterfaceC6809 U(InterfaceC6809 interfaceC6809) {
        if (interfaceC6809.o() <= 0) {
            return interfaceC6809;
        }
        long jCount = interfaceC6809.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C16792(interfaceC6809, iArr).invoke();
        return new C23308(iArr);
    }

    public static void w(InterfaceC8492 interfaceC8492, Double[] dArr, int i) {
        if (AbstractC11875.a) {
            AbstractC11875.a(interfaceC8492.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC8492.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static InterfaceC8492 C(InterfaceC8492 interfaceC8492, long j, long j2) {
        if (j == 0 && j2 == interfaceC8492.count()) {
            return interfaceC8492;
        }
        long j3 = j2 - j;
        InterfaceC8160 interfaceC8160 = (InterfaceC8160) interfaceC8492.spliterator();
        InterfaceC16086 interfaceC16086O = O(j3);
        interfaceC16086O.c(j3);
        for (int i = 0; i < j && interfaceC8160.tryAdvance((DoubleConsumer) new C21193(0)); i++) {
        }
        if (j2 == interfaceC8492.count()) {
            interfaceC8160.forEachRemaining((DoubleConsumer) interfaceC16086O);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC8160.tryAdvance((DoubleConsumer) interfaceC16086O); i2++) {
            }
        }
        interfaceC16086O.end();
        return interfaceC16086O.build();
    }

    public static InterfaceC6103 V(InterfaceC6103 interfaceC6103) {
        if (interfaceC6103.o() <= 0) {
            return interfaceC6103;
        }
        long jCount = interfaceC6103.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C4093(interfaceC6103, jArr).invoke();
        return new C9990(jArr);
    }

    public static InterfaceC8492 T(InterfaceC8492 interfaceC8492) {
        if (interfaceC8492.o() <= 0) {
            return interfaceC8492;
        }
        long jCount = interfaceC8492.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C3408(interfaceC8492, dArr).invoke();
        return new C4114(dArr);
    }

    @Override // l.InterfaceC21048
    public Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        InterfaceC18204 interfaceC18204E0 = e0();
        abstractC12725.f0(interfaceC15234, interfaceC18204E0);
        return interfaceC18204E0.get();
    }

    @Override // l.InterfaceC21048
    public Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        return ((InterfaceC18204) new C7786(this, abstractC9198, interfaceC15234).invoke()).get();
    }
}
