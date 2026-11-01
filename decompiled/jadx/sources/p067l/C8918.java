package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8918 {

    /* JADX INFO: renamed from: ᩷ */
    public static final int f24163 = Math.min(4, Math.max(1, C19110.f57020 - 1));

    /* JADX INFO: renamed from: ֫ */
    public final BooleanSupplier f24164;

    /* JADX INFO: renamed from: ۜ */
    public final int f24165;

    /* JADX INFO: renamed from: ۧ */
    public final CountDownLatch f24166;

    /* JADX INFO: renamed from: ܳ */
    public final C22076[] f24167;

    /* JADX INFO: renamed from: ܿ */
    public final Supplier f24169;

    /* JADX INFO: renamed from: ᩻ */
    public final List f24171;

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f24170 = new AtomicInteger();

    /* JADX INFO: renamed from: ܽ */
    public final AtomicBoolean f24168 = new AtomicBoolean();

    public C8918(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        this.f24169 = supplier;
        this.f24171 = list;
        this.f24164 = booleanSupplier;
        this.f24167 = new C22076[list.size()];
        int iMin = Math.min(f24163, list.size());
        this.f24165 = iMin;
        this.f24166 = new CountDownLatch(iMin);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22076 m20611(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        C8918 c8918 = new C8918(supplier, list, booleanSupplier);
        CountDownLatch countDownLatch = c8918.f24166;
        AtomicBoolean atomicBoolean = c8918.f24168;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c8918.f24165; i2++) {
            arrayList.add(new CallableC25011(c8918));
        }
        try {
            try {
                Iterator it = C4081.m8184(C4081.f8986, arrayList).iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).get();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((CallableC25011) it2.next()).m54922();
                }
                boolean z = false;
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused) {
                        atomicBoolean.set(true);
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (atomicBoolean.get() || c8918.f24164.getAsBoolean()) {
                    return null;
                }
                C22076 c22076 = new C22076();
                C22076[] c22076Arr = c8918.f24167;
                int length = c22076Arr.length;
                while (i < length) {
                    C22076 c22077 = c22076Arr[i];
                    if (c22077 == null) {
                        throw new IllegalStateException("Missing wrap batch result");
                    }
                    c22076.m49681(c22077);
                    i++;
                }
                return c22076;
            } catch (Throwable th) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((CallableC25011) it3.next()).m54922();
                }
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused2) {
                        atomicBoolean.set(true);
                        i = 1;
                    }
                }
                if (i != 0) {
                    Thread.currentThread().interrupt();
                    throw th;
                }
                throw th;
            }
        } catch (Error | Exception e) {
            atomicBoolean.set(true);
            boolean z2 = e instanceof InterruptedException;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22076 m20612(C5409 c5409, ArrayList arrayList, C21503 c21503) {
        C22076 c22076 = new C22076();
        C9729 c9729M11841 = c5409.f12885.m11841();
        try {
            C15763 c15763M22750 = c9729M11841.m22750();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC16293 interfaceC16293 = (InterfaceC16293) it.next();
                if (!c21503.getAsBoolean()) {
                    c22076.m49681(interfaceC16293.mo15412(c15763M22750));
                } else {
                    c9729M11841.close();
                    return null;
                }
            }
            c9729M11841.close();
            if (c21503.getAsBoolean()) {
                return null;
            }
            return c22076;
        } catch (Throwable th) {
            try {
                c9729M11841.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m20618(C8918 c8918) {
        return c8918.f24168.get() || c8918.f24164.getAsBoolean();
    }
}
