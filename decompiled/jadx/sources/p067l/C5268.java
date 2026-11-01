package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.function.Consumer;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۗۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5268 extends C5880 {

    /* JADX INFO: renamed from: ܿ */
    public final ConcurrentMapC12768 f12396;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f12397;

    public C5268(final C4598 c4598) {
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        this.f12396 = concurrentMapC12768;
        C7480.stream(c4598.m9728()).map(new C9962()).filter(new C16666()).forEach(new Consumer() { // from class: l.᩸ۛܳ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C6609 c6609 = (C6609) obj;
                this.f71592.f12396.put(Integer.valueOf(c6609.f17050), c6609);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
        if (concurrentMapC12768.isEmpty()) {
            return;
        }
        C4081.f8987.submit(new Runnable() { // from class: l.᩹ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C5268.m11386(this.f74484, c4598);
            }
        });
    }

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        return C14103.m32024(((C12092) interfaceC19370).m27881());
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11386(C5268 c5268, C4598 c4598) {
        for (int i : C7480.stream(c5268.f12396.keySet()).mapToInt(new C14223()).toArray()) {
            C6609 c6609 = (C6609) c5268.f12396.get(Integer.valueOf(i));
            if (c6609 != null && C5880.m13198(c6609.f17048)) {
                c5268.f12396.remove(Integer.valueOf(i));
                synchronized (c6609) {
                    c6609.notifyAll();
                }
            }
        }
        if (c5268.f12396.isEmpty()) {
            return;
        }
        int[] array = C7480.stream(c5268.f12396.keySet()).mapToInt(new C14223()).toArray();
        IInArchive iInArchiveM9729 = null;
        try {
            iInArchiveM9729 = c4598.m9729();
            iInArchiveM9729.extract(array, false, new C21362(c5268, iInArchiveM9729));
        } catch (IOException unused) {
        } finally {
            c5268.f12396.clear();
            C2700.m4192(iInArchiveM9729);
        }
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135()) {
            return C14103.m32025(((C12092) interfaceC19370).m27881());
        }
        return 0;
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        C6177 c6177M27881 = ((C12092) interfaceC19370).m27881();
        int iM14000 = c6177M27881.m14000();
        C6609 c6609 = (C6609) this.f12396.get(Integer.valueOf(iM14000));
        if (c6609 != null) {
            do {
                synchronized (c6609) {
                    try {
                        c6609.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } while (this.f12396.containsKey(Integer.valueOf(iM14000)));
        }
        String strM32024 = C14103.m32024(c6177M27881);
        if (i == 1) {
            return m11385(strM32024, C21265.f66823, C21265.f66851);
        }
        if (i == 2) {
            return m11385(strM32024, C21265.f66823, C21265.f66851);
        }
        if (i == 3) {
            C21265 c21265 = C21265.f66832;
            C13596 c13596M11385 = m11385(strM32024, c21265, c21265);
            if (c13596M11385 != c21265.f66886) {
                interfaceC19370.mo39141(R.id.MT_Protector, Boolean.TRUE);
            }
            return c13596M11385;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13596 m11385(String str, C21265 c21265, C21265 c21266) {
        if (C5880.m13199(str)) {
            return c21266.f66886;
        }
        C13596 c13596M30924 = C13596.m30924(C14828.m33864(str));
        return c13596M30924 == null ? c21265.f66886 : c13596M30924;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11394() {
        this.f12397 = true;
    }
}
