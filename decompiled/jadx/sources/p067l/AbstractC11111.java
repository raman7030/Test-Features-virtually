package p067l;

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
public abstract class AbstractC11111 implements InterfaceC22373 {

    /* JADX INFO: renamed from: a */
    public static final C17577 f30813a = new C17577();

    /* JADX INFO: renamed from: b */
    public static final C21682 f30814b = new C21682();

    /* JADX INFO: renamed from: c */
    public static final C4167 f30815c = new C4167();

    /* JADX INFO: renamed from: d */
    public static final C4918 f30816d = new C4918();

    /* JADX INFO: renamed from: e */
    public static final int[] f30817e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final long[] f30818f = new long[0];

    /* JADX INFO: renamed from: g */
    public static final double[] f30819g = new double[0];

    /* JADX INFO: renamed from: M */
    public abstract void mo25625M(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: N */
    public abstract boolean mo25626N(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: Q */
    public abstract InterfaceC7324 mo25627Q(InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction);

    /* JADX INFO: renamed from: R */
    public abstract long mo25628R(InterfaceC16847 interfaceC16847);

    /* JADX INFO: renamed from: c0 */
    public abstract InterfaceC10873 mo17909c0(long j, IntFunction intFunction);

    /* JADX INFO: renamed from: e0 */
    public abstract InterfaceC19670 mo4649e0();

    /* JADX INFO: renamed from: f0 */
    public abstract InterfaceC2925 mo25629f0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: g0 */
    public abstract InterfaceC2925 mo25630g0(InterfaceC2925 interfaceC2925);

    /* JADX INFO: renamed from: h0 */
    public abstract InterfaceC16847 mo25631h0(InterfaceC16847 interfaceC16847);

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: j */
    public /* synthetic */ int mo23312j() {
        return 0;
    }

    /* JADX INFO: renamed from: W */
    public static C18546 m25604W(Function function) {
        C18546 c18546 = new C18546(11);
        c18546.f55375b = function;
        return c18546;
    }

    /* JADX INFO: renamed from: d0 */
    public static C12233 m25610d0(EnumC21702 enumC21702, Predicate predicate) {
        C12826.requireNonNull(predicate);
        C12826.requireNonNull(enumC21702);
        return new C12233(EnumC10521.REFERENCE, enumC21702, new C5412(enumC21702, predicate, 3));
    }

    /* JADX INFO: renamed from: P */
    public static AbstractC11782 m25599P(EnumC10521 enumC10521) {
        int i = AbstractC12018.f33496a[enumC10521.ordinal()];
        if (i == 1) {
            return f30813a;
        }
        if (i == 2) {
            return f30814b;
        }
        if (i == 3) {
            return f30815c;
        }
        if (i == 4) {
            return f30816d;
        }
        throw new IllegalStateException("Unknown shape " + enumC10521);
    }

    /* JADX INFO: renamed from: a0 */
    public static C12233 m25608a0(EnumC21702 enumC21702, IntPredicate intPredicate) {
        C12826.requireNonNull(intPredicate);
        C12826.requireNonNull(enumC21702);
        return new C12233(EnumC10521.INT_VALUE, enumC21702, new C5412(enumC21702, intPredicate, 1));
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC7324 m25591F(InterfaceC7324 interfaceC7324, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == interfaceC7324.count()) {
            return interfaceC7324;
        }
        InterfaceC16847 interfaceC16847Spliterator = interfaceC7324.spliterator();
        long j3 = j2 - j;
        InterfaceC10873 interfaceC10873M25592G = m25592G(j3, intFunction);
        interfaceC10873M25592G.mo4231c(j3);
        for (int i = 0; i < j && interfaceC16847Spliterator.tryAdvance(new C24933(10)); i++) {
        }
        if (j2 == interfaceC7324.count()) {
            interfaceC16847Spliterator.forEachRemaining(interfaceC10873M25592G);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC16847Spliterator.tryAdvance(interfaceC10873M25592G); i2++) {
            }
        }
        interfaceC10873M25592G.end();
        return interfaceC10873M25592G.build();
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC15884 m25597L(EnumC10521 enumC10521, InterfaceC7324 interfaceC7324, InterfaceC7324 interfaceC7325) {
        int i = AbstractC12018.f33496a[enumC10521.ordinal()];
        if (i == 1) {
            return new C18348(interfaceC7324, interfaceC7325);
        }
        if (i == 2) {
            return new C19650((InterfaceC8840) interfaceC7324, (InterfaceC8840) interfaceC7325);
        }
        if (i == 3) {
            return new C20321((InterfaceC8169) interfaceC7324, (InterfaceC8169) interfaceC7325);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC10521);
        }
        return new C14799((InterfaceC10440) interfaceC7324, (InterfaceC10440) interfaceC7325);
    }

    /* JADX INFO: renamed from: b0 */
    public static C12233 m25609b0(EnumC21702 enumC21702, LongPredicate longPredicate) {
        C12826.requireNonNull(longPredicate);
        C12826.requireNonNull(enumC21702);
        return new C12233(EnumC10521.LONG_VALUE, enumC21702, new C5412(enumC21702, longPredicate, 0));
    }

    /* JADX INFO: renamed from: t */
    public static void m25618t() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: Z */
    public static C12233 m25607Z(EnumC21702 enumC21702, DoublePredicate doublePredicate) {
        C12826.requireNonNull(doublePredicate);
        C12826.requireNonNull(enumC21702);
        return new C12233(EnumC10521.DOUBLE_VALUE, enumC21702, new C5412(enumC21702, doublePredicate, 2));
    }

    /* JADX INFO: renamed from: u */
    public static void m25619u() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: G */
    public static InterfaceC10873 m25592G(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C17144(j, intFunction);
        }
        return new C20361();
    }

    /* JADX INFO: renamed from: m */
    public static void m25611m() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: renamed from: p */
    public static void m25614p(InterfaceC12274 interfaceC12274, Integer num) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC12274.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC12274.accept(num.intValue());
    }

    /* JADX INFO: renamed from: r */
    public static void m25616r(InterfaceC16336 interfaceC16336, Long l2) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC16336.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC16336.accept(l2.longValue());
    }

    /* JADX INFO: renamed from: X */
    public static InterfaceC23693 m25605X(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C10181();
        }
        return new C22252(j);
    }

    /* JADX INFO: renamed from: n */
    public static void m25612n(InterfaceC7580 interfaceC7580, Double d) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC7580.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC7580.accept(d.doubleValue());
    }

    /* JADX INFO: renamed from: Y */
    public static InterfaceC9611 m25606Y(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C2729();
        }
        return new C16140(j);
    }

    /* JADX INFO: renamed from: v */
    public static Object[] m25620v(InterfaceC24758 interfaceC24758, IntFunction intFunction) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC24758.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (interfaceC24758.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) interfaceC24758.count());
        interfaceC24758.mo3498k(objArr, 0);
        return objArr;
    }

    /* JADX INFO: renamed from: O */
    public static InterfaceC17657 m25598O(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C12965();
        }
        return new C6949(j);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC7324 m25593H(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        long jMo25628R = abstractC11111.mo25628R(interfaceC16847);
        if (jMo25628R < 0 || !interfaceC16847.hasCharacteristics(16384)) {
            C18152 c18152 = new C18152();
            c18152.f54184a = intFunction;
            InterfaceC7324 interfaceC7324 = (InterfaceC7324) new C18823(abstractC11111, interfaceC16847, c18152, new C24933(18), 3).invoke();
            return z ? m25600S(interfaceC7324, intFunction) : interfaceC7324;
        }
        if (jMo25628R >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jMo25628R);
        new C14955(interfaceC16847, abstractC11111, objArr).invoke();
        return new C2473(objArr);
    }

    /* JADX INFO: renamed from: A */
    public static void m25586A(InterfaceC8840 interfaceC8840, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC8840.mo4234g((IntConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(interfaceC8840.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC20202) interfaceC8840.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m25622x(InterfaceC8840 interfaceC8840, Integer[] numArr, int i) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC8840.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC8840.mo4230b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC8840 m25589D(InterfaceC8840 interfaceC8840, long j, long j2) {
        if (j == 0 && j2 == interfaceC8840.count()) {
            return interfaceC8840;
        }
        long j3 = j2 - j;
        InterfaceC20202 interfaceC20202 = (InterfaceC20202) interfaceC8840.spliterator();
        InterfaceC23693 interfaceC23693M25605X = m25605X(j3);
        interfaceC23693M25605X.mo4231c(j3);
        for (int i = 0; i < j && interfaceC20202.tryAdvance((IntConsumer) new C13793(0)); i++) {
        }
        if (j2 == interfaceC8840.count()) {
            interfaceC20202.forEachRemaining((IntConsumer) interfaceC23693M25605X);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC20202.tryAdvance((IntConsumer) interfaceC23693M25605X); i2++) {
            }
        }
        interfaceC23693M25605X.end();
        return interfaceC23693M25605X.build();
    }

    /* JADX INFO: renamed from: J */
    public static InterfaceC8840 m25595J(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, boolean z) {
        long jMo25628R = abstractC11111.mo25628R(interfaceC16847);
        if (jMo25628R < 0 || !interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC8840 interfaceC8840 = (InterfaceC8840) new C18823(abstractC11111, interfaceC16847, new C24933(14), new C24933(15), 1).invoke();
            return z ? m25602U(interfaceC8840) : interfaceC8840;
        }
        if (jMo25628R >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jMo25628R];
        new C18979(interfaceC16847, abstractC11111, iArr).invoke();
        return new C24521(iArr);
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC8169 m25596K(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, boolean z) {
        long jMo25628R = abstractC11111.mo25628R(interfaceC16847);
        if (jMo25628R < 0 || !interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC8169 interfaceC8169 = (InterfaceC8169) new C18823(abstractC11111, interfaceC16847, new C24933(16), new C24933(17), 2).invoke();
            return z ? m25603V(interfaceC8169) : interfaceC8169;
        }
        if (jMo25628R >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jMo25628R];
        new C20992(interfaceC16847, abstractC11111, jArr).invoke();
        return new C11863(jArr);
    }

    /* JADX INFO: renamed from: B */
    public static void m25587B(InterfaceC8169 interfaceC8169, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC8169.mo4234g((LongConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(interfaceC8169.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC2766) interfaceC8169.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m25623y(InterfaceC8169 interfaceC8169, Long[] lArr, int i) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC8169.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC8169.mo4230b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    /* JADX INFO: renamed from: E */
    public static InterfaceC8169 m25590E(InterfaceC8169 interfaceC8169, long j, long j2) {
        if (j == 0 && j2 == interfaceC8169.count()) {
            return interfaceC8169;
        }
        long j3 = j2 - j;
        InterfaceC2766 interfaceC2766 = (InterfaceC2766) interfaceC8169.spliterator();
        InterfaceC9611 interfaceC9611M25606Y = m25606Y(j3);
        interfaceC9611M25606Y.mo4231c(j3);
        for (int i = 0; i < j && interfaceC2766.tryAdvance((LongConsumer) new C3475(0)); i++) {
        }
        if (j2 == interfaceC8169.count()) {
            interfaceC2766.forEachRemaining((LongConsumer) interfaceC9611M25606Y);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC2766.tryAdvance((LongConsumer) interfaceC9611M25606Y); i2++) {
            }
        }
        interfaceC9611M25606Y.end();
        return interfaceC9611M25606Y.build();
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC10440 m25594I(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, boolean z) {
        long jMo25628R = abstractC11111.mo25628R(interfaceC16847);
        if (jMo25628R < 0 || !interfaceC16847.hasCharacteristics(16384)) {
            InterfaceC10440 interfaceC10440 = (InterfaceC10440) new C18823(abstractC11111, interfaceC16847, new C24933(12), new C24933(13), 0).invoke();
            return z ? m25601T(interfaceC10440) : interfaceC10440;
        }
        if (jMo25628R >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jMo25628R];
        new C14129(interfaceC16847, abstractC11111, dArr).invoke();
        return new C6279(dArr);
    }

    /* JADX INFO: renamed from: S */
    public static InterfaceC7324 m25600S(InterfaceC7324 interfaceC7324, IntFunction intFunction) {
        if (interfaceC7324.mo3500o() <= 0) {
            return interfaceC7324;
        }
        long jCount = interfaceC7324.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C12885(interfaceC7324, objArr).invoke();
        return new C2473(objArr);
    }

    /* JADX INFO: renamed from: z */
    public static void m25624z(InterfaceC10440 interfaceC10440, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC10440.mo4234g((DoubleConsumer) consumer);
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(interfaceC10440.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((InterfaceC10124) interfaceC10440.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX INFO: renamed from: U */
    public static InterfaceC8840 m25602U(InterfaceC8840 interfaceC8840) {
        if (interfaceC8840.mo3500o() <= 0) {
            return interfaceC8840;
        }
        long jCount = interfaceC8840.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C18328(interfaceC8840, iArr).invoke();
        return new C24521(iArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m25621w(InterfaceC10440 interfaceC10440, Double[] dArr, int i) {
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(interfaceC10440.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC10440.mo4230b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    /* JADX INFO: renamed from: C */
    public static InterfaceC10440 m25588C(InterfaceC10440 interfaceC10440, long j, long j2) {
        if (j == 0 && j2 == interfaceC10440.count()) {
            return interfaceC10440;
        }
        long j3 = j2 - j;
        InterfaceC10124 interfaceC10124 = (InterfaceC10124) interfaceC10440.spliterator();
        InterfaceC17657 interfaceC17657M25598O = m25598O(j3);
        interfaceC17657M25598O.mo4231c(j3);
        for (int i = 0; i < j && interfaceC10124.tryAdvance((DoubleConsumer) new C22511(0)); i++) {
        }
        if (j2 == interfaceC10440.count()) {
            interfaceC10124.forEachRemaining((DoubleConsumer) interfaceC17657M25598O);
        } else {
            for (int i2 = 0; i2 < j3 && interfaceC10124.tryAdvance((DoubleConsumer) interfaceC17657M25598O); i2++) {
            }
        }
        interfaceC17657M25598O.end();
        return interfaceC17657M25598O.build();
    }

    /* JADX INFO: renamed from: V */
    public static InterfaceC8169 m25603V(InterfaceC8169 interfaceC8169) {
        if (interfaceC8169.mo3500o() <= 0) {
            return interfaceC8169;
        }
        long jCount = interfaceC8169.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C6259(interfaceC8169, jArr).invoke();
        return new C11863(jArr);
    }

    /* JADX INFO: renamed from: T */
    public static InterfaceC10440 m25601T(InterfaceC10440 interfaceC10440) {
        if (interfaceC10440.mo3500o() <= 0) {
            return interfaceC10440;
        }
        long jCount = interfaceC10440.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C5608(interfaceC10440, dArr).invoke();
        return new C6279(dArr);
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: b */
    public Object mo10392b(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        InterfaceC19670 interfaceC19670Mo4649e0 = mo4649e0();
        abstractC14463.mo25629f0(interfaceC16847, interfaceC19670Mo4649e0);
        return interfaceC19670Mo4649e0.get();
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: e */
    public Object mo10393e(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        return ((InterfaceC19670) new C9769(this, abstractC11111, interfaceC16847).invoke()).get();
    }
}
