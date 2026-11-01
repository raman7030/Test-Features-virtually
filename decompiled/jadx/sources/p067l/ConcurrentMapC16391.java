package p067l;

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
public final class ConcurrentMapC16391 extends AbstractMap implements ConcurrentMap, InterfaceC18802 {

    /* JADX INFO: renamed from: ֫֫ */
    public final AbstractQueue f48160;

    /* JADX INFO: renamed from: ۗ */
    public final long f48161;

    /* JADX INFO: renamed from: ۙ */
    public Set f48162;

    /* JADX INFO: renamed from: ۛ */
    public Set f48163;

    /* JADX INFO: renamed from: ۜ֫ */
    public Collection f48164;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC6334 f48165;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12900 f48166;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f48167;

    /* JADX INFO: renamed from: ۨ */
    public final EnumC3711 f48168;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC16431 f48169;

    /* JADX INFO: renamed from: ۬ */
    public final long f48170;

    /* JADX INFO: renamed from: ܰ */
    public final long f48171;

    /* JADX INFO: renamed from: ܳ֫ */
    public final AbstractC12900 f48172;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f48173;

    /* JADX INFO: renamed from: ܿ֫ */
    public final AbstractC19785 f48174;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C6394[] f48175;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC15760 f48176;

    /* JADX INFO: renamed from: ᩷֫ */
    public final InterfaceC21087 f48177;

    /* JADX INFO: renamed from: ᩸ */
    public final int f48178;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC20456 f48179;

    /* JADX INFO: renamed from: ᩺ */
    public final long f48180;

    /* JADX INFO: renamed from: ᩻֫ */
    public final EnumC3711 f48181;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final Logger f48159 = Logger.getLogger(ConcurrentMapC16391.class.getName());

    /* JADX INFO: renamed from: ۡ֫ */
    public static final C7715 f48157 = new C7715();

    /* JADX INFO: renamed from: ۢ֫ */
    public static final Queue f48158 = new C3691();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C18131.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C18131.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C18131.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C18131.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C18131.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C18131.$default$replaceAll(this, biFunction);
    }

    public ConcurrentMapC16391(C5033 c5033, AbstractC20456 abstractC20456) {
        long j;
        Collection concurrentLinkedQueue;
        int i = c5033.f11546;
        InterfaceC8205 interfaceC8205 = c5033.f11558;
        this.f48178 = Math.min(i == -1 ? 4 : i, 65536);
        EnumC3711 enumC3711 = c5033.f11556;
        EnumC3711 enumC3712 = EnumC3711.f7852;
        EnumC3711 enumC3713 = (EnumC3711) C17592.m40056(enumC3711, enumC3712);
        this.f48168 = enumC3713;
        this.f48181 = (EnumC3711) C17592.m40056(c5033.f11547, enumC3712);
        this.f48166 = (AbstractC12900) C17592.m40056(c5033.f11557, ((EnumC3711) C17592.m40056(c5033.f11556, enumC3712)).mo5139());
        this.f48172 = (AbstractC12900) C17592.m40056(c5033.f11554, ((EnumC3711) C17592.m40056(c5033.f11547, enumC3712)).mo5139());
        if (c5033.f11555 == 0 || c5033.f11552 == 0) {
            j = 0;
        } else {
            j = c5033.f11548 == null ? c5033.f11553 : c5033.f11559;
        }
        this.f48180 = j;
        InterfaceC21087 interfaceC21087 = c5033.f11548;
        EnumC17772 enumC17772 = EnumC17772.INSTANCE;
        InterfaceC21087 interfaceC21088 = (InterfaceC21087) C17592.m40056(interfaceC21087, enumC17772);
        this.f48177 = interfaceC21088;
        long j2 = c5033.f11552;
        this.f48161 = j2 == -1 ? 0L : j2;
        long j3 = c5033.f11555;
        this.f48170 = j3 == -1 ? 0L : j3;
        this.f48171 = 0L;
        InterfaceC6334 interfaceC6334 = c5033.f11549;
        EnumC11068 enumC11068 = EnumC11068.INSTANCE;
        InterfaceC6334 interfaceC6335 = (InterfaceC6334) C17592.m40056(interfaceC6334, enumC11068);
        this.f48165 = interfaceC6335;
        if (interfaceC6335 == enumC11068) {
            concurrentLinkedQueue = f48158;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f48160 = (AbstractQueue) concurrentLinkedQueue;
        int i2 = 0;
        boolean z = m37212() || 0 > 0 || m37211();
        AbstractC19785 abstractC19785M44967 = c5033.f11550;
        if (abstractC19785M44967 == null) {
            abstractC19785M44967 = z ? AbstractC19785.m44967() : C5033.f11545;
        }
        this.f48174 = abstractC19785M44967;
        this.f48176 = EnumC15760.m35819(enumC3713, m37211() || m37208() || m37211(), m37212() || m37212() || 0 > 0);
        this.f48169 = (InterfaceC16431) interfaceC8205.get();
        this.f48179 = abstractC20456;
        int iMin = Math.min(16, 1073741824);
        if (m37208() && interfaceC21088 == enumC17772) {
            iMin = (int) Math.min(iMin, j);
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f48178 && (!m37208() || ((long) i3) * 20 <= this.f48180)) {
            i4++;
            i3 <<= 1;
        }
        this.f48173 = 32 - i4;
        this.f48167 = i3 - 1;
        this.f48175 = new C6394[i3];
        int i5 = iMin / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < iMin ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        if (m37208()) {
            long j4 = this.f48180;
            long j5 = i3;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                C6394[] c6394Arr = this.f48175;
                if (i2 >= c6394Arr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                c6394Arr[i2] = new C6394(this, i6, j8, (InterfaceC16431) interfaceC8205.get());
                i2++;
                j6 = j8;
            }
        } else {
            while (true) {
                C6394[] c6394Arr2 = this.f48175;
                if (i2 >= c6394Arr2.length) {
                    return;
                }
                c6394Arr2[i2] = new C6394(this, i6, -1L, (InterfaceC16431) interfaceC8205.get());
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37208() {
        return this.f48180 >= 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m37212() {
        return this.f48170 > 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m37211() {
        return this.f48161 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM37206 = m37206(obj);
        return m37210(iM37206).m14610(obj, iM37206, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM37206 = m37206(obj);
        return m37210(iM37206).m14610(obj, iM37206, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.lock();
        try {
            long jMo42007 = c6394M37210.f16546.f48174.mo42007();
            c6394M37210.m14628(jMo42007);
            AtomicReferenceArray atomicReferenceArray = c6394M37210.f16550;
            int length = iM37206 & (atomicReferenceArray.length() - 1);
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM37206 && key != null && c6394M37210.f16546.f48166.m29558(obj, key)) {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj3 = interfaceC5723Mo19584.get();
                    if (obj3 == null) {
                        if (!interfaceC5723Mo19584.mo12721()) {
                            break;
                        }
                        c6394M37210.f16552++;
                        InterfaceC25109 interfaceC25109M14618 = c6394M37210.m14618(interfaceC25109, next, key, obj3, interfaceC5723Mo19584, EnumC4993.f11373);
                        int i = c6394M37210.f16556 - 1;
                        atomicReferenceArray.set(length, interfaceC25109M14618);
                        c6394M37210.f16556 = i;
                        break;
                    }
                    c6394M37210.f16552++;
                    c6394M37210.m14622(obj, obj3, interfaceC5723Mo19584.mo8870(), EnumC4993.f11368);
                    c6394M37210.m14624(next, obj, obj2, jMo42007);
                    c6394M37210.m14623(next);
                    return obj3;
                }
            }
            return null;
        } finally {
            c6394M37210.unlock();
            c6394M37210.m14634();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.lock();
        try {
            long jMo42007 = c6394M37210.f16546.f48174.mo42007();
            c6394M37210.m14628(jMo42007);
            AtomicReferenceArray atomicReferenceArray = c6394M37210.f16550;
            int length = (atomicReferenceArray.length() - 1) & iM37206;
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            InterfaceC25109 next = interfaceC25109;
            while (next != null) {
                Object key = next.getKey();
                if (next.getHash() != iM37206 || key == null || !c6394M37210.f16546.f48166.m29558(obj, key)) {
                    int i = length;
                    next = next.getNext();
                    length = i;
                } else {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj4 = interfaceC5723Mo19584.get();
                    if (obj4 == null) {
                        if (!interfaceC5723Mo19584.mo12721()) {
                            break;
                        }
                        c6394M37210.f16552++;
                        InterfaceC25109 interfaceC25109M14618 = c6394M37210.m14618(interfaceC25109, next, key, obj4, interfaceC5723Mo19584, EnumC4993.f11373);
                        int i2 = c6394M37210.f16556 - 1;
                        atomicReferenceArray.set(length, interfaceC25109M14618);
                        c6394M37210.f16556 = i2;
                        break;
                    }
                    if (c6394M37210.f16546.f48172.m29558(obj2, obj4)) {
                        c6394M37210.f16552++;
                        c6394M37210.m14622(obj, obj4, interfaceC5723Mo19584.mo8870(), EnumC4993.f11368);
                        c6394M37210.m14624(next, obj, obj3, jMo42007);
                        c6394M37210.m14623(next);
                        c6394M37210.unlock();
                        c6394M37210.m14634();
                        return true;
                    }
                    c6394M37210.m14630(next, jMo42007);
                    break;
                }
            }
            c6394M37210.unlock();
            c6394M37210.m14634();
            return false;
        } catch (Throwable th) {
            c6394M37210.unlock();
            c6394M37210.m14634();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m37207(Object obj, AbstractC20456 abstractC20456) {
        InterfaceC25109 interfaceC25109M14616;
        obj.getClass();
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.getClass();
        abstractC20456.getClass();
        try {
            try {
                if (c6394M37210.f16556 != 0 && (interfaceC25109M14616 = c6394M37210.m14616(iM37206, obj)) != null) {
                    long jMo42007 = c6394M37210.f16546.f48174.mo42007();
                    Object objM14613 = c6394M37210.m14613(interfaceC25109M14616, jMo42007);
                    if (objM14613 != null) {
                        c6394M37210.m14633(interfaceC25109M14616, jMo42007);
                        c6394M37210.f16547.mo20964();
                        Object objM14614 = c6394M37210.m14614(interfaceC25109M14616, obj, iM37206, objM14613, jMo42007, abstractC20456);
                        c6394M37210.m14635();
                        return objM14614;
                    }
                    InterfaceC5723 interfaceC5723Mo19584 = interfaceC25109M14616.mo19584();
                    if (interfaceC5723Mo19584.mo12720()) {
                        Object objM14615 = c6394M37210.m14615(interfaceC25109M14616, obj, interfaceC5723Mo19584);
                        c6394M37210.m14635();
                        return objM14615;
                    }
                }
                Object objM14611 = c6394M37210.m14611(obj, iM37206, abstractC20456);
                c6394M37210.m14635();
                return objM14611;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C2800((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new C8165(cause);
                }
                throw e;
            }
        } catch (Throwable th) {
            c6394M37210.m14635();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37209(InterfaceC25109 interfaceC25109, long j) {
        interfaceC25109.getClass();
        if (!m37211() || j - interfaceC25109.mo19578() < this.f48161) {
            return m37212() && j - interfaceC25109.mo19579() >= this.f48170;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37206(Object obj) {
        int iM29557 = this.f48166.m29557(obj);
        int i = iM29557 + ((iM29557 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6394 m37210(int i) {
        return this.f48175[(i >>> this.f48173) & this.f48167];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C6394[] c6394Arr = this.f48175;
        long j = 0;
        for (C6394 c6394 : c6394Arr) {
            if (c6394.f16556 != 0) {
                return false;
            }
            j += (long) c6394.f16552;
        }
        if (j == 0) {
            return true;
        }
        for (C6394 c6395 : c6394Arr) {
            if (c6395.f16556 != 0) {
                return false;
            }
            j -= (long) c6395.f16552;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C6394 c6394 : this.f48175) {
            jMax += (long) Math.max(0, c6394.f16556);
        }
        return C15129.m34552(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        InterfaceC25109 interfaceC25109;
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.getClass();
        try {
            if (c6394M37210.f16556 != 0) {
                long jMo42007 = c6394M37210.f16546.f48174.mo42007();
                InterfaceC25109 interfaceC25109M14616 = c6394M37210.m14616(iM37206, obj);
                if (interfaceC25109M14616 != null) {
                    if (!c6394M37210.f16546.m37209(interfaceC25109M14616, jMo42007)) {
                        interfaceC25109 = interfaceC25109M14616;
                    } else if (c6394M37210.tryLock()) {
                        try {
                            c6394M37210.m14620(jMo42007);
                            c6394M37210.unlock();
                        } catch (Throwable th) {
                            c6394M37210.unlock();
                            throw th;
                        }
                    }
                    if (interfaceC25109 == null) {
                        obj2 = interfaceC25109.mo19584().get();
                        if (obj2 != null) {
                            c6394M37210.m14633(interfaceC25109, jMo42007);
                            Object objM14614 = c6394M37210.m14614(interfaceC25109, interfaceC25109.getKey(), iM37206, obj2, jMo42007, c6394M37210.f16546.f48179);
                            c6394M37210.m14635();
                            return objM14614;
                        }
                        c6394M37210.m14631();
                    } else {
                        c6394M37210.m14635();
                        return null;
                    }
                }
                interfaceC25109 = null;
                if (interfaceC25109 == null) {
                    obj2 = interfaceC25109.mo19584().get();
                    if (obj2 != null) {
                        c6394M37210.m14633(interfaceC25109, jMo42007);
                        Object objM14615 = c6394M37210.m14614(interfaceC25109, interfaceC25109.getKey(), iM37206, obj2, jMo42007, c6394M37210.f16546.f48179);
                        c6394M37210.m14635();
                        return objM14615;
                    }
                    c6394M37210.m14631();
                } else {
                    c6394M37210.m14635();
                    return null;
                }
            }
            c6394M37210.m14635();
            return null;
        } catch (Throwable th2) {
            c6394M37210.m14635();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
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
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.getClass();
        try {
            if (c6394M37210.f16556 == 0) {
                c6394M37210.m14635();
                return false;
            }
            long jMo42007 = c6394M37210.f16546.f48174.mo42007();
            InterfaceC25109 interfaceC25109M14616 = c6394M37210.m14616(iM37206, obj);
            if (interfaceC25109M14616 != null) {
                if (c6394M37210.f16546.m37209(interfaceC25109M14616, jMo42007)) {
                    if (c6394M37210.tryLock()) {
                        try {
                            c6394M37210.m14620(jMo42007);
                            c6394M37210.unlock();
                        } catch (Throwable th) {
                            c6394M37210.unlock();
                            throw th;
                        }
                    }
                }
                if (interfaceC25109M14616 == null) {
                    boolean z = interfaceC25109M14616.mo19584().get() != null;
                    c6394M37210.m14635();
                    return z;
                }
                c6394M37210.m14635();
                return false;
            }
            interfaceC25109M14616 = null;
            if (interfaceC25109M14616 == null) {
                if (interfaceC25109M14616.mo19584().get() != null) {
                }
                c6394M37210.m14635();
                return z;
            }
            c6394M37210.m14635();
            return false;
        } catch (Throwable th2) {
            c6394M37210.m14635();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jMo42007 = this.f48174.mo42007();
        C6394[] c6394Arr = this.f48175;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c6394Arr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C6394 c6394 = c6394Arr[i2];
                int i3 = c6394.f16556;
                AtomicReferenceArray atomicReferenceArray = c6394.f16550;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC25109 next = (InterfaceC25109) atomicReferenceArray.get(i4);
                    while (next != null) {
                        C6394[] c6394Arr2 = c6394Arr;
                        Object objM14613 = c6394.m14613(next, jMo42007);
                        long j3 = jMo42007;
                        if (objM14613 != null && this.f48172.m29558(obj, objM14613)) {
                            return true;
                        }
                        next = next.getNext();
                        c6394Arr = c6394Arr2;
                        jMo42007 = j3;
                    }
                }
                j2 += (long) c6394.f16552;
                i2++;
                jMo42007 = jMo42007;
            }
            long j4 = jMo42007;
            C6394[] c6394Arr3 = c6394Arr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c6394Arr = c6394Arr3;
            jMo42007 = j4;
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
        EnumC4993 enumC4993;
        if (obj == null) {
            return null;
        }
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.lock();
        try {
            c6394M37210.m14628(c6394M37210.f16546.f48174.mo42007());
            AtomicReferenceArray atomicReferenceArray = c6394M37210.f16550;
            int length = iM37206 & (atomicReferenceArray.length() - 1);
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM37206 && key != null && c6394M37210.f16546.f48166.m29558(obj, key)) {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj2 = interfaceC5723Mo19584.get();
                    if (obj2 != null) {
                        enumC4993 = EnumC4993.f11369;
                    } else {
                        if (!interfaceC5723Mo19584.mo12721()) {
                            break;
                        }
                        enumC4993 = EnumC4993.f11373;
                    }
                    EnumC4993 enumC4994 = enumC4993;
                    c6394M37210.f16552++;
                    InterfaceC25109 interfaceC25109M14618 = c6394M37210.m14618(interfaceC25109, next, key, obj2, interfaceC5723Mo19584, enumC4994);
                    int i = c6394M37210.f16556 - 1;
                    atomicReferenceArray.set(length, interfaceC25109M14618);
                    c6394M37210.f16556 = i;
                    return obj2;
                }
            }
            return null;
        } finally {
            c6394M37210.unlock();
            c6394M37210.m14634();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        EnumC4993 enumC4993;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM37206 = m37206(obj);
        C6394 c6394M37210 = m37210(iM37206);
        c6394M37210.lock();
        try {
            c6394M37210.m14628(c6394M37210.f16546.f48174.mo42007());
            AtomicReferenceArray atomicReferenceArray = c6394M37210.f16550;
            int length = iM37206 & (atomicReferenceArray.length() - 1);
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM37206 && key != null && c6394M37210.f16546.f48166.m29558(obj, key)) {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj3 = interfaceC5723Mo19584.get();
                    if (c6394M37210.f16546.f48172.m29558(obj2, obj3)) {
                        enumC4993 = EnumC4993.f11369;
                    } else {
                        if (obj3 != null || !interfaceC5723Mo19584.mo12721()) {
                            break;
                            break;
                        }
                        enumC4993 = EnumC4993.f11373;
                    }
                    c6394M37210.f16552++;
                    InterfaceC25109 interfaceC25109M14618 = c6394M37210.m14618(interfaceC25109, next, key, obj3, interfaceC5723Mo19584, enumC4993);
                    int i = c6394M37210.f16556 - 1;
                    atomicReferenceArray.set(length, interfaceC25109M14618);
                    c6394M37210.f16556 = i;
                    if (enumC4993 != EnumC4993.f11369) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
            return z;
        } finally {
            c6394M37210.unlock();
            c6394M37210.m14634();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (C6394 c6394 : this.f48175) {
            if (c6394.f16556 != 0) {
                c6394.lock();
                try {
                    c6394.m14628(c6394.f16546.f48174.mo42007());
                    AtomicReferenceArray atomicReferenceArray = c6394.f16550;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (InterfaceC25109 next = (InterfaceC25109) atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.mo19584().mo12721()) {
                                Object key = next.getKey();
                                Object obj = next.mo19584().get();
                                EnumC4993 enumC4993 = (key == null || obj == null) ? EnumC4993.f11373 : EnumC4993.f11369;
                                next.getHash();
                                c6394.m14622(key, obj, next.mo19584().mo8870(), enumC4993);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    ConcurrentMapC16391 concurrentMapC16391 = c6394.f16546;
                    if (concurrentMapC16391.f48168 != EnumC3711.f7852) {
                        while (c6394.f16554.poll() != null) {
                        }
                    }
                    if (concurrentMapC16391.f48181 != EnumC3711.f7852) {
                        while (c6394.f16548.poll() != null) {
                        }
                    }
                    c6394.f16544.clear();
                    c6394.f16555.clear();
                    c6394.f16551.set(0);
                    c6394.f16552++;
                    c6394.f16556 = 0;
                    c6394.unlock();
                    c6394.m14634();
                } catch (Throwable th) {
                    c6394.unlock();
                    c6394.m14634();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f48163;
        if (set != null) {
            return set;
        }
        C19805 c19805 = new C19805(this);
        this.f48163 = c19805;
        return c19805;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f48164;
        if (collection != null) {
            return collection;
        }
        C15110 c15110 = new C15110(this);
        this.f48164 = c15110;
        return c15110;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f48162;
        if (set != null) {
            return set;
        }
        C4382 c4382 = new C4382(this);
        this.f48162 = c4382;
        return c4382;
    }
}
