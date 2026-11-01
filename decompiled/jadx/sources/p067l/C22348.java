package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V40L */
/* JADX INFO: loaded from: classes4.dex */
public final class C22348 {
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m50169(C19561 c19561) {
        ArrayList arrayList = new ArrayList();
        for (C5738 c5738 : c19561.m44469()) {
            String name = c5738.getName();
            if (name.endsWith(".class") && !name.equals("module-info.class")) {
                arrayList.add(new C18994(c5738.getName(), new C6293(c19561, c5738)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50171(final ArrayList arrayList, final int i, final C7041 c7041, final InterfaceC10630 interfaceC10630) throws Exception {
        final C20689 c20689 = new C20689(arrayList.size());
        c20689.m46753(interfaceC10630);
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicReference atomicReference = new AtomicReference();
        Runnable runnable = new Runnable() { // from class: l.ۜܿܺ
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                byte[] bArrM44452;
                ArrayList arrayList2 = arrayList;
                AtomicInteger atomicInteger2 = atomicInteger;
                AtomicReference atomicReference2 = atomicReference;
                InterfaceC10630 interfaceC10631 = interfaceC10630;
                int i3 = i;
                C20689 c206810 = c20689;
                C7041 c7042 = c7041;
                C9785 c9785 = new C9785(new byte[WXNativeGamePageObject.LENGTH_LIMIT]);
                int size = arrayList2.size();
                while (true) {
                    try {
                        int andIncrement = atomicInteger2.getAndIncrement();
                        if (andIncrement < size && atomicReference2.get() == null && !interfaceC10631.mo3924()) {
                            C25029 c25029 = new C25029();
                            C17652 c17652 = new C17652();
                            c17652.f52729 = System.err;
                            c17652.f52726 = true;
                            c17652.f52730 = false;
                            c17652.f52727 = true;
                            C11619 c11619 = new C11619();
                            c11619.f32432 = true;
                            c11619.f32434 = i3;
                            C3948 c3948 = new C3948(c11619);
                            int i4 = 0;
                            while (i4 < 100) {
                                c206810.m46754(1);
                                if (i4 != 0) {
                                    int andIncrement2 = atomicInteger2.getAndIncrement();
                                    if (andIncrement2 >= size) {
                                        break;
                                    } else {
                                        andIncrement = andIncrement2;
                                    }
                                }
                                C18994 c18994 = (C18994) arrayList2.set(andIncrement, null);
                                ArrayList arrayList3 = arrayList2;
                                String str = c18994.f56632;
                                C6293 c6293 = c18994.f56631;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                C19561 c19561 = (C19561) c6293.f15904;
                                C5738 c5738 = (C5738) c6293.f15905;
                                synchronized (c19561) {
                                    i2 = i3;
                                    try {
                                        bArrM44452 = c19561.m44452(c5738, (C20689) null);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C23708 c23708 = new C23708(str, c17652.f52730, bArrM44452);
                                c23708.m52720();
                                c23708.m52730();
                                c3948.m7847(C4913.m10434(c25029, c23708, c17652, c11619, c3948));
                                if (atomicReference2.get() != null || interfaceC10631.mo3924()) {
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
                            C19705 c19705M7846 = c3948.m7846(c9785);
                            c7042.m16185(c19705M7846.m44769(), c19705M7846.m44774());
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
        int i2 = C19110.f57020;
        Thread[] threadArr = new Thread[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threadArr[i3] = thread;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            threadArr[i4].join();
        }
        if (!interfaceC10630.mo3924() && atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m50170(C19561 c19561, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, InterfaceC10630 interfaceC10630) throws Throwable {
        C10844 c10844;
        C19561 c19562 = c19561;
        AbstractC17043 abstractC17045 = abstractC17043;
        C18555 c18555 = new C18555();
        C19226 c19226 = new C19226();
        List listM44449 = c19562.m44449(false);
        C20689 c20689 = new C20689(listM44449.size());
        c20689.m46753(interfaceC10630);
        C22776 c22776 = new C22776();
        try {
            Iterator it = listM44449.iterator();
            boolean z = false;
            C20765 c20765 = null;
            c10844 = null;
            int i = 0;
            C9873 c9873 = null;
            while (it.hasNext()) {
                try {
                    C5738 c5738 = (C5738) it.next();
                    if (interfaceC10630.mo3924()) {
                        if (z) {
                            abstractC17045 = abstractC17044;
                        }
                        if (c10844 != null) {
                            c10844.close();
                        }
                        return abstractC17045;
                    }
                    c20689.m46754(1);
                    C14645 c14645M33467 = C14645.m33467(c19562.m44452(c5738, (C20689) null));
                    if (c20765 == null) {
                        C9873 c9873Mo29499 = c14645M33467.mo29499();
                        c9873 = c9873Mo29499;
                        c20765 = new C20765(c9873Mo29499);
                    }
                    for (C9952 c9952 : (AbstractC20050) c14645M33467.mo29500()) {
                        if (interfaceC10630.mo3924()) {
                            break;
                        }
                        C17884 c17884 = new C17884(c9952, c18555);
                        c19226.m43796(c17884);
                        C18555 c18556 = c18555;
                        Iterator it2 = it;
                        if (c19226.m43797() > 65000 || c19226.m43798() > 65000) {
                            if (!z) {
                                z = true;
                                c10844 = new C10844(abstractC17044);
                            }
                            c20765.m50870(c22776);
                            i++;
                            c10844.m24986(m50168(i));
                            c10844.write(c22776.m50959(), 0, c22776.m50962());
                            c22776.m50960();
                            c19226 = new C19226();
                            c19226.m43796(c17884);
                            c20765 = new C20765(c9873);
                        }
                        c20765.m46900((InterfaceC10509) c9952);
                        c18555 = c18556;
                        it = it2;
                    }
                    c19562 = c19561;
                    c18555 = c18555;
                    it = it;
                } catch (Throwable th) {
                    th = th;
                    if (c10844 != null) {
                        c10844.close();
                    }
                    throw th;
                }
            }
            if (z) {
                c20765.m50870(c22776);
                c10844.m24986(m50168(i + 1));
                c10844.write(c22776.m50959(), 0, c22776.m50962());
            } else {
                if (c20765 == null) {
                    c20765 = new C20765(C9873.m23150(15));
                }
                c20765.m50871(abstractC17045);
            }
            if (c10844 != null) {
                c10844.close();
            }
            return z ? abstractC17044 : abstractC17045;
        } catch (Throwable th2) {
            th = th2;
            c10844 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50168(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C19768.m44906(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }
}
