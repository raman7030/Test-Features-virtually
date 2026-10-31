package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes4.dex */
public final class C21022 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47839(C18090 c18090) {
        ArrayList arrayList = new ArrayList();
        for (C3545 c3545 : c18090.m42210()) {
            String name = c3545.getName();
            if (name.endsWith(".class") && !name.equals("module-info.class")) {
                arrayList.add(new C17493(c3545.getName(), new C4129(c18090, c3545)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47841(final ArrayList arrayList, final int i, final C4916 c4916, final InterfaceC8693 interfaceC8693) throws Exception {
        final C19277 c19277 = new C19277(arrayList.size());
        c19277.m44459(interfaceC8693);
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicReference atomicReference = new AtomicReference();
        Runnable runnable = new Runnable() { // from class: l.ۜܿܺ
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                byte[] bArrM42193;
                ArrayList arrayList2 = arrayList;
                AtomicInteger atomicInteger2 = atomicInteger;
                AtomicReference atomicReference2 = atomicReference;
                InterfaceC8693 interfaceC8694 = interfaceC8693;
                int i3 = i;
                C19277 c19278 = c19277;
                C4916 c4917 = c4916;
                C7803 c7803 = new C7803(new byte[WXNativeGamePageObject.LENGTH_LIMIT]);
                int size = arrayList2.size();
                while (true) {
                    try {
                        int andIncrement = atomicInteger2.getAndIncrement();
                        if (andIncrement < size && atomicReference2.get() == null && !interfaceC8694.mo1526()) {
                            C23843 c23843 = new C23843();
                            C16081 c16081 = new C16081();
                            c16081.f49566 = System.err;
                            c16081.f49563 = true;
                            c16081.f49567 = false;
                            c16081.f49564 = true;
                            C9733 c9733 = new C9733();
                            c9733.f29482 = true;
                            c9733.f29484 = i3;
                            C1662 c1662 = new C1662(c9733);
                            int i4 = 0;
                            while (i4 < 100) {
                                c19278.m44460(1);
                                if (i4 != 0) {
                                    int andIncrement2 = atomicInteger2.getAndIncrement();
                                    if (andIncrement2 >= size) {
                                        break;
                                    } else {
                                        andIncrement = andIncrement2;
                                    }
                                }
                                C17493 c17493 = (C17493) arrayList2.set(andIncrement, null);
                                ArrayList arrayList3 = arrayList2;
                                String str = c17493.f53444;
                                C4129 c4129 = c17493.f53443;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                C18090 c18090 = (C18090) c4129.f13090;
                                C3545 c3545 = (C3545) c4129.f13091;
                                synchronized (c18090) {
                                    i2 = i3;
                                    try {
                                        bArrM42193 = c18090.m42193(c3545, (C19277) null);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C22453 c22453 = new C22453(str, c16081.f49567, bArrM42193);
                                c22453.m50379();
                                c22453.m50389();
                                c1662.m5617(C2677.m8388(c23843, c22453, c16081, c9733, c1662));
                                if (atomicReference2.get() != null || interfaceC8694.mo1526()) {
                                    return;
                                }
                                i4++;
                                arrayList2 = arrayList3;
                                atomicInteger2 = atomicInteger3;
                                i3 = i2;
                            }
                            ArrayList arrayList4 = arrayList2;
                            AtomicInteger atomicInteger4 = atomicInteger2;
                            int i5 = i3;
                            C18241 c18241M5616 = c1662.m5616(c7803);
                            c4917.m14288(c18241M5616.m42510(), c18241M5616.m42515());
                            arrayList2 = arrayList4;
                            atomicInteger2 = atomicInteger4;
                            i3 = i5;
                        }
                        return;
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                }
            }
        };
        int i2 = C17615.f53826;
        Thread[] threadArr = new Thread[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threadArr[i3] = thread;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            threadArr[i4].join();
        }
        if (!interfaceC8693.mo1526() && atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m47840(C18090 c18090, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, InterfaceC8693 interfaceC8693) throws Throwable {
        C8918 c8918;
        C18090 c18091 = c18090;
        AbstractC15440 abstractC15442 = abstractC15440;
        C17032 c17032 = new C17032();
        C17738 c17738 = new C17738();
        List listM42190 = c18091.m42190(false);
        C19277 c19277 = new C19277(listM42190.size());
        c19277.m44459(interfaceC8693);
        C21473 c21473 = new C21473();
        try {
            Iterator it = listM42190.iterator();
            boolean z = false;
            C19357 c19357 = null;
            c8918 = null;
            int i = 0;
            C7897 c7897 = null;
            while (it.hasNext()) {
                try {
                    C3545 c3545 = (C3545) it.next();
                    if (interfaceC8693.mo1526()) {
                        if (z) {
                            abstractC15442 = abstractC15441;
                        }
                        if (c8918 != null) {
                            c8918.close();
                        }
                        return abstractC15442;
                    }
                    c19277.m44460(1);
                    C12918 c12918M31381 = C12918.m31381(c18091.m42193(c3545, (C19277) null));
                    if (c19357 == null) {
                        C7897 c7897Mo27437 = c12918M31381.mo27437();
                        c7897 = c7897Mo27437;
                        c19357 = new C19357(c7897Mo27437);
                    }
                    for (C7980 c7980 : (AbstractC18605) c12918M31381.mo27438()) {
                        if (interfaceC8693.mo1526()) {
                            break;
                        }
                        C16326 c16326 = new C16326(c7980, c17032);
                        c17738.m41551(c16326);
                        C17032 c17033 = c17032;
                        Iterator it2 = it;
                        if (c17738.m41552() > 65000 || c17738.m41553() > 65000) {
                            if (!z) {
                                z = true;
                                c8918 = new C8918(abstractC15441);
                            }
                            c19357.m48534(c21473);
                            i++;
                            c8918.m23012(m47838(i));
                            c8918.write(c21473.m48622(), 0, c21473.m48625());
                            c21473.m48623();
                            c17738 = new C17738();
                            c17738.m41551(c16326);
                            c19357 = new C19357(c7897);
                        }
                        c19357.m44606((InterfaceC8566) c7980);
                        c17032 = c17033;
                        it = it2;
                    }
                    c18091 = c18090;
                    c17032 = c17032;
                    it = it;
                } catch (Throwable th) {
                    th = th;
                    if (c8918 != null) {
                        c8918.close();
                    }
                    throw th;
                }
            }
            if (z) {
                c19357.m48534(c21473);
                c8918.m23012(m47838(i + 1));
                c8918.write(c21473.m48622(), 0, c21473.m48625());
            } else {
                if (c19357 == null) {
                    c19357 = new C19357(C7897.m21184(15));
                }
                c19357.m48535(abstractC15442);
            }
            if (c8918 != null) {
                c8918.close();
            }
            return z ? abstractC15441 : abstractC15442;
        } catch (Throwable th2) {
            th = th2;
            c8918 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47838(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C18307.m42645(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }
}
