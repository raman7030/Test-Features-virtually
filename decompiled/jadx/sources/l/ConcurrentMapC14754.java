package l;

import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܳ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class ConcurrentMapC14754 extends AbstractMap implements ConcurrentMap, InterfaceC17291 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f45047;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f45048;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f45049;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Set f45050;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Collection f45051;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC4172 f45052;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f45053;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f45054;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f45055;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14796 f45056;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f45057;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f45058;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f45059;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f45060;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18325 f45061;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C4235[] f45062;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC14090 f45063;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19695 f45064;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f45065;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC19031 f45066;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f45067;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f45068;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final Logger f45046 = Logger.getLogger(ConcurrentMapC14754.class.getName());

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final C5625 f45044 = new C5625();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Queue f45045 = new C1391();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C16585.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C16585.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C16585.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C16585.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C16585.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C16585.$default$replaceAll(this, biFunction);
    }

    public ConcurrentMapC14754(C2803 c2803, AbstractC19031 abstractC19031) {
        long j;
        Collection concurrentLinkedQueue;
        int i = c2803.f8752;
        InterfaceC6141 interfaceC6141 = c2803.f8764;
        this.f45065 = Math.min(i == -1 ? 4 : i, 65536);
        EnumC1412 enumC1412 = c2803.f8762;
        EnumC1412 enumC1413 = EnumC1412.f5081;
        EnumC1412 enumC1414 = (EnumC1412) C16018.m37870(enumC1412, enumC1413);
        this.f45055 = enumC1414;
        this.f45068 = (EnumC1412) C16018.m37870(c2803.f8753, enumC1413);
        this.f45053 = (AbstractC11081) C16018.m37870(c2803.f8763, ((EnumC1412) C16018.m37870(c2803.f8762, enumC1413)).mo2794());
        this.f45059 = (AbstractC11081) C16018.m37870(c2803.f8760, ((EnumC1412) C16018.m37870(c2803.f8753, enumC1413)).mo2794());
        if (c2803.f8761 == 0 || c2803.f8758 == 0) {
            j = 0;
        } else {
            j = c2803.f8754 == null ? c2803.f8759 : c2803.f8765;
        }
        this.f45067 = j;
        InterfaceC19695 interfaceC19695 = c2803.f8754;
        EnumC16207 enumC16207 = EnumC16207.INSTANCE;
        InterfaceC19695 interfaceC19696 = (InterfaceC19695) C16018.m37870(interfaceC19695, enumC16207);
        this.f45064 = interfaceC19696;
        long j2 = c2803.f8758;
        this.f45048 = j2 == -1 ? 0L : j2;
        long j3 = c2803.f8761;
        this.f45057 = j3 == -1 ? 0L : j3;
        this.f45058 = 0L;
        InterfaceC4172 interfaceC4172 = c2803.f8755;
        EnumC9153 enumC9153 = EnumC9153.INSTANCE;
        InterfaceC4172 interfaceC4173 = (InterfaceC4172) C16018.m37870(interfaceC4172, enumC9153);
        this.f45052 = interfaceC4173;
        if (interfaceC4173 == enumC9153) {
            concurrentLinkedQueue = f45045;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f45047 = (AbstractQueue) concurrentLinkedQueue;
        int i2 = 0;
        boolean z = m35065() || 0 > 0 || m35064();
        AbstractC18325 abstractC18325M42705 = c2803.f8756;
        if (abstractC18325M42705 == null) {
            abstractC18325M42705 = z ? AbstractC18325.m42705() : C2803.f8751;
        }
        this.f45061 = abstractC18325M42705;
        this.f45063 = EnumC14090.m33694(enumC1414, m35064() || m35061() || m35064(), m35065() || m35065() || 0 > 0);
        this.f45056 = (InterfaceC14796) interfaceC6141.get();
        this.f45066 = abstractC19031;
        int iMin = Math.min(16, 1073741824);
        if (m35061() && interfaceC19696 == enumC16207) {
            iMin = (int) Math.min(iMin, j);
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f45065 && (!m35061() || ((long) i3) * 20 <= this.f45067)) {
            i4++;
            i3 <<= 1;
        }
        this.f45060 = 32 - i4;
        this.f45054 = i3 - 1;
        this.f45062 = new C4235[i3];
        int i5 = iMin / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < iMin ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        if (m35061()) {
            long j4 = this.f45067;
            long j5 = i3;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                C4235[] c4235Arr = this.f45062;
                if (i2 >= c4235Arr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                c4235Arr[i2] = new C4235(this, i6, j8, (InterfaceC14796) interfaceC6141.get());
                i2++;
                j6 = j8;
            }
        } else {
            while (true) {
                C4235[] c4235Arr2 = this.f45062;
                if (i2 >= c4235Arr2.length) {
                    return;
                }
                c4235Arr2[i2] = new C4235(this, i6, -1L, (InterfaceC14796) interfaceC6141.get());
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35061() {
        return this.f45067 >= 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35065() {
        return this.f45057 > 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m35064() {
        return this.f45048 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM35059 = m35059(obj);
        return m35063(iM35059).m12734(obj, iM35059, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM35059 = m35059(obj);
        return m35063(iM35059).m12734(obj, iM35059, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.lock();
        try {
            long jMo39766 = c4235M35063.f13733.f45061.mo39766();
            c4235M35063.m12752(jMo39766);
            AtomicReferenceArray atomicReferenceArray = c4235M35063.f13737;
            int length = iM35059 & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM35059 && key != null && c4235M35063.f13733.f45053.m27496(obj, key)) {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj3 = interfaceC3529Mo17644.get();
                    if (obj3 == null) {
                        if (!interfaceC3529Mo17644.mo10725()) {
                            break;
                        }
                        c4235M35063.f13739++;
                        InterfaceC23927 interfaceC23927M12742 = c4235M35063.m12742(interfaceC23927, next, key, obj3, interfaceC3529Mo17644, EnumC2761.f8579);
                        int i = c4235M35063.f13743 - 1;
                        atomicReferenceArray.set(length, interfaceC23927M12742);
                        c4235M35063.f13743 = i;
                        break;
                    }
                    c4235M35063.f13739++;
                    c4235M35063.m12746(obj, obj3, interfaceC3529Mo17644.mo6744(), EnumC2761.f8574);
                    c4235M35063.m12748(next, obj, obj2, jMo39766);
                    c4235M35063.m12747(next);
                    return obj3;
                }
            }
            return null;
        } finally {
            c4235M35063.unlock();
            c4235M35063.m12758();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.lock();
        try {
            long jMo39766 = c4235M35063.f13733.f45061.mo39766();
            c4235M35063.m12752(jMo39766);
            AtomicReferenceArray atomicReferenceArray = c4235M35063.f13737;
            int length = (atomicReferenceArray.length() - 1) & iM35059;
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 next = interfaceC23927;
            while (next != null) {
                Object key = next.getKey();
                if (next.getHash() != iM35059 || key == null || !c4235M35063.f13733.f45053.m27496(obj, key)) {
                    int i = length;
                    next = next.getNext();
                    length = i;
                } else {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj4 = interfaceC3529Mo17644.get();
                    if (obj4 == null) {
                        if (!interfaceC3529Mo17644.mo10725()) {
                            break;
                        }
                        c4235M35063.f13739++;
                        InterfaceC23927 interfaceC23927M12742 = c4235M35063.m12742(interfaceC23927, next, key, obj4, interfaceC3529Mo17644, EnumC2761.f8579);
                        int i2 = c4235M35063.f13743 - 1;
                        atomicReferenceArray.set(length, interfaceC23927M12742);
                        c4235M35063.f13743 = i2;
                        break;
                    }
                    if (c4235M35063.f13733.f45059.m27496(obj2, obj4)) {
                        c4235M35063.f13739++;
                        c4235M35063.m12746(obj, obj4, interfaceC3529Mo17644.mo6744(), EnumC2761.f8574);
                        c4235M35063.m12748(next, obj, obj3, jMo39766);
                        c4235M35063.m12747(next);
                        c4235M35063.unlock();
                        c4235M35063.m12758();
                        return true;
                    }
                    c4235M35063.m12754(next, jMo39766);
                    break;
                }
            }
            c4235M35063.unlock();
            c4235M35063.m12758();
            return false;
        } catch (Throwable th) {
            c4235M35063.unlock();
            c4235M35063.m12758();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m35060(Object obj, AbstractC19031 abstractC19031) {
        InterfaceC23927 interfaceC23927M12740;
        obj.getClass();
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.getClass();
        abstractC19031.getClass();
        try {
            try {
                if (c4235M35063.f13743 != 0 && (interfaceC23927M12740 = c4235M35063.m12740(iM35059, obj)) != null) {
                    long jMo39766 = c4235M35063.f13733.f45061.mo39766();
                    Object objM12737 = c4235M35063.m12737(interfaceC23927M12740, jMo39766);
                    if (objM12737 != null) {
                        c4235M35063.m12757(interfaceC23927M12740, jMo39766);
                        c4235M35063.f13734.mo19007();
                        Object objM12738 = c4235M35063.m12738(interfaceC23927M12740, obj, iM35059, objM12737, jMo39766, abstractC19031);
                        c4235M35063.m12759();
                        return objM12738;
                    }
                    InterfaceC3529 interfaceC3529Mo17644 = interfaceC23927M12740.mo17644();
                    if (interfaceC3529Mo17644.mo10724()) {
                        Object objM12739 = c4235M35063.m12739(interfaceC23927M12740, obj, interfaceC3529Mo17644);
                        c4235M35063.m12759();
                        return objM12739;
                    }
                }
                Object objM12735 = c4235M35063.m12735(obj, iM35059, abstractC19031);
                c4235M35063.m12759();
                return objM12735;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C0454((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new C6099(cause);
                }
                throw e;
            }
        } catch (Throwable th) {
            c4235M35063.m12759();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35062(InterfaceC23927 interfaceC23927, long j) {
        interfaceC23927.getClass();
        if (!m35064() || j - interfaceC23927.mo17638() < this.f45048) {
            return m35065() && j - interfaceC23927.mo17639() >= this.f45057;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35059(Object obj) {
        int iM27495 = this.f45053.m27495(obj);
        int i = iM27495 + ((iM27495 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4235 m35063(int i) {
        return this.f45062[(i >>> this.f45060) & this.f45054];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C4235[] c4235Arr = this.f45062;
        long j = 0;
        for (C4235 c4235 : c4235Arr) {
            if (c4235.f13743 != 0) {
                return false;
            }
            j += (long) c4235.f13739;
        }
        if (j == 0) {
            return true;
        }
        for (C4235 c4236 : c4235Arr) {
            if (c4236.f13743 != 0) {
                return false;
            }
            j -= (long) c4236.f13739;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C4235 c4235 : this.f45062) {
            jMax += (long) Math.max(0, c4235.f13743);
        }
        return C13426.m32450(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        InterfaceC23927 interfaceC23927;
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.getClass();
        try {
            if (c4235M35063.f13743 != 0) {
                long jMo39766 = c4235M35063.f13733.f45061.mo39766();
                InterfaceC23927 interfaceC23927M12740 = c4235M35063.m12740(iM35059, obj);
                if (interfaceC23927M12740 != null) {
                    if (!c4235M35063.f13733.m35062(interfaceC23927M12740, jMo39766)) {
                        interfaceC23927 = interfaceC23927M12740;
                    } else if (c4235M35063.tryLock()) {
                        try {
                            c4235M35063.m12744(jMo39766);
                            c4235M35063.unlock();
                        } catch (Throwable th) {
                            c4235M35063.unlock();
                            throw th;
                        }
                    }
                    if (interfaceC23927 == null) {
                        obj2 = interfaceC23927.mo17644().get();
                        if (obj2 != null) {
                            c4235M35063.m12757(interfaceC23927, jMo39766);
                            Object objM12738 = c4235M35063.m12738(interfaceC23927, interfaceC23927.getKey(), iM35059, obj2, jMo39766, c4235M35063.f13733.f45066);
                            c4235M35063.m12759();
                            return objM12738;
                        }
                        c4235M35063.m12755();
                    } else {
                        c4235M35063.m12759();
                        return null;
                    }
                }
                interfaceC23927 = null;
                if (interfaceC23927 == null) {
                    obj2 = interfaceC23927.mo17644().get();
                    if (obj2 != null) {
                        c4235M35063.m12757(interfaceC23927, jMo39766);
                        Object objM12739 = c4235M35063.m12738(interfaceC23927, interfaceC23927.getKey(), iM35059, obj2, jMo39766, c4235M35063.f13733.f45066);
                        c4235M35063.m12759();
                        return objM12739;
                    }
                    c4235M35063.m12755();
                } else {
                    c4235M35063.m12759();
                    return null;
                }
            }
            c4235M35063.m12759();
            return null;
        } catch (Throwable th2) {
            c4235M35063.m12759();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:18:0x0039, B:19:0x003c, B:15:0x0031), top: B:34:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.getClass();
        try {
            if (c4235M35063.f13743 == 0) {
                c4235M35063.m12759();
                return false;
            }
            long jMo39766 = c4235M35063.f13733.f45061.mo39766();
            InterfaceC23927 interfaceC23927M12740 = c4235M35063.m12740(iM35059, obj);
            if (interfaceC23927M12740 != null) {
                if (c4235M35063.f13733.m35062(interfaceC23927M12740, jMo39766)) {
                    if (c4235M35063.tryLock()) {
                        try {
                            c4235M35063.m12744(jMo39766);
                            c4235M35063.unlock();
                        } catch (Throwable th) {
                            c4235M35063.unlock();
                            throw th;
                        }
                    }
                }
                if (interfaceC23927M12740 == null) {
                    boolean z = interfaceC23927M12740.mo17644().get() != null;
                    c4235M35063.m12759();
                    return z;
                }
                c4235M35063.m12759();
                return false;
            }
            interfaceC23927M12740 = null;
            if (interfaceC23927M12740 == null) {
                if (interfaceC23927M12740.mo17644().get() != null) {
                }
                c4235M35063.m12759();
                return z;
            }
            c4235M35063.m12759();
            return false;
        } catch (Throwable th2) {
            c4235M35063.m12759();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jMo39766 = this.f45061.mo39766();
        C4235[] c4235Arr = this.f45062;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c4235Arr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C4235 c4235 = c4235Arr[i2];
                int i3 = c4235.f13743;
                AtomicReferenceArray atomicReferenceArray = c4235.f13737;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC23927 next = (InterfaceC23927) atomicReferenceArray.get(i4);
                    while (next != null) {
                        C4235[] c4235Arr2 = c4235Arr;
                        Object objM12737 = c4235.m12737(next, jMo39766);
                        long j3 = jMo39766;
                        if (objM12737 != null && this.f45059.m27496(obj, objM12737)) {
                            return true;
                        }
                        next = next.getNext();
                        c4235Arr = c4235Arr2;
                        jMo39766 = j3;
                    }
                }
                j2 += (long) c4235.f13739;
                i2++;
                jMo39766 = jMo39766;
            }
            long j4 = jMo39766;
            C4235[] c4235Arr3 = c4235Arr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c4235Arr = c4235Arr3;
            jMo39766 = j4;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        EnumC2761 enumC2761;
        if (obj == null) {
            return null;
        }
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.lock();
        try {
            c4235M35063.m12752(c4235M35063.f13733.f45061.mo39766());
            AtomicReferenceArray atomicReferenceArray = c4235M35063.f13737;
            int length = iM35059 & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM35059 && key != null && c4235M35063.f13733.f45053.m27496(obj, key)) {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj2 = interfaceC3529Mo17644.get();
                    if (obj2 != null) {
                        enumC2761 = EnumC2761.f8575;
                    } else {
                        if (!interfaceC3529Mo17644.mo10725()) {
                            break;
                        }
                        enumC2761 = EnumC2761.f8579;
                    }
                    EnumC2761 enumC2762 = enumC2761;
                    c4235M35063.f13739++;
                    InterfaceC23927 interfaceC23927M12742 = c4235M35063.m12742(interfaceC23927, next, key, obj2, interfaceC3529Mo17644, enumC2762);
                    int i = c4235M35063.f13743 - 1;
                    atomicReferenceArray.set(length, interfaceC23927M12742);
                    c4235M35063.f13743 = i;
                    return obj2;
                }
            }
            return null;
        } finally {
            c4235M35063.unlock();
            c4235M35063.m12758();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        EnumC2761 enumC2761;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM35059 = m35059(obj);
        C4235 c4235M35063 = m35063(iM35059);
        c4235M35063.lock();
        try {
            c4235M35063.m12752(c4235M35063.f13733.f45061.mo39766());
            AtomicReferenceArray atomicReferenceArray = c4235M35063.f13737;
            int length = iM35059 & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM35059 && key != null && c4235M35063.f13733.f45053.m27496(obj, key)) {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj3 = interfaceC3529Mo17644.get();
                    if (c4235M35063.f13733.f45059.m27496(obj2, obj3)) {
                        enumC2761 = EnumC2761.f8575;
                    } else {
                        if (obj3 != null || !interfaceC3529Mo17644.mo10725()) {
                            break;
                            break;
                        }
                        enumC2761 = EnumC2761.f8579;
                    }
                    c4235M35063.f13739++;
                    InterfaceC23927 interfaceC23927M12742 = c4235M35063.m12742(interfaceC23927, next, key, obj3, interfaceC3529Mo17644, enumC2761);
                    int i = c4235M35063.f13743 - 1;
                    atomicReferenceArray.set(length, interfaceC23927M12742);
                    c4235M35063.f13743 = i;
                    if (enumC2761 != EnumC2761.f8575) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
            return z;
        } finally {
            c4235M35063.unlock();
            c4235M35063.m12758();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (C4235 c4235 : this.f45062) {
            if (c4235.f13743 != 0) {
                c4235.lock();
                try {
                    c4235.m12752(c4235.f13733.f45061.mo39766());
                    AtomicReferenceArray atomicReferenceArray = c4235.f13737;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (InterfaceC23927 next = (InterfaceC23927) atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.mo17644().mo10725()) {
                                Object key = next.getKey();
                                Object obj = next.mo17644().get();
                                EnumC2761 enumC2761 = (key == null || obj == null) ? EnumC2761.f8579 : EnumC2761.f8575;
                                next.getHash();
                                c4235.m12746(key, obj, next.mo17644().mo6744(), enumC2761);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    ConcurrentMapC14754 concurrentMapC14754 = c4235.f13733;
                    if (concurrentMapC14754.f45055 != EnumC1412.f5081) {
                        while (c4235.f13741.poll() != null) {
                        }
                    }
                    if (concurrentMapC14754.f45068 != EnumC1412.f5081) {
                        while (c4235.f13735.poll() != null) {
                        }
                    }
                    c4235.f13731.clear();
                    c4235.f13742.clear();
                    c4235.f13738.set(0);
                    c4235.f13739++;
                    c4235.f13743 = 0;
                    c4235.unlock();
                    c4235.m12758();
                } catch (Throwable th) {
                    c4235.unlock();
                    c4235.m12758();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f45050;
        if (set != null) {
            return set;
        }
        C18346 c18346 = new C18346(this);
        this.f45050 = c18346;
        return c18346;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f45051;
        if (collection != null) {
            return collection;
        }
        C13406 c13406 = new C13406(this);
        this.f45051 = c13406;
        return c13406;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f45049;
        if (set != null) {
            return set;
        }
        C2118 c2118 = new C2118(this);
        this.f45049 = c2118;
        return c2118;
    }
}
