package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۗۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3051 extends C3695 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f9595;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9596;

    public C3051(final C2346 c2346) {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        this.f9595 = concurrentMapC10942;
        C5378.stream(c2346.m7657()).map(new C7990()).filter(new C15044()).forEach(new Consumer() { // from class: l.᩸ۛܳ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C4462 c4462 = (C4462) obj;
                this.f68897.f9595.put(Integer.valueOf(c4462.f14226), c4462);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        if (concurrentMapC10942.isEmpty()) {
            return;
        }
        C1802.f6208.submit(new Runnable() { // from class: l.᩹ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C3051.m9344(this.f71764, c2346);
            }
        });
    }

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return C12347.m29964(((C10231) interfaceC17889).m25859());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9344(C3051 c3051, C2346 c2346) {
        for (int i : C5378.stream(c3051.f9595.keySet()).mapToInt(new C12473()).toArray()) {
            C4462 c4462 = (C4462) c3051.f9595.get(Integer.valueOf(i));
            if (c4462 != null && C3695.m11252(c4462.f14224)) {
                c3051.f9595.remove(Integer.valueOf(i));
                synchronized (c4462) {
                    c4462.notifyAll();
                }
            }
        }
        if (c3051.f9595.isEmpty()) {
            return;
        }
        int[] array = C5378.stream(c3051.f9595.keySet()).mapToInt(new C12473()).toArray();
        IInArchive iInArchiveM7658 = null;
        try {
            iInArchiveM7658 = c2346.m7658();
            iInArchiveM7658.extract(array, false, new C19985(c3051, iInArchiveM7658));
        } catch (IOException unused) {
        } finally {
            c3051.f9595.clear();
            C0349.m1793(iInArchiveM7658);
        }
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            return C12347.m29965(((C10231) interfaceC17889).m25859());
        }
        return 0;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C4007 c4007M25859 = ((C10231) interfaceC17889).m25859();
        int iM12080 = c4007M25859.m12080();
        C4462 c4462 = (C4462) this.f9595.get(Integer.valueOf(iM12080));
        if (c4462 != null) {
            do {
                synchronized (c4462) {
                    try {
                        c4462.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } while (this.f9595.containsKey(Integer.valueOf(iM12080)));
        }
        String strM29964 = C12347.m29964(c4007M25859);
        if (i == 1) {
            return m9343(strM29964, C19883.f64187, C19883.f64215);
        }
        if (i == 2) {
            return m9343(strM29964, C19883.f64187, C19883.f64215);
        }
        if (i == 3) {
            C19883 c19883 = C19883.f64196;
            C11813 c11813M9343 = m9343(strM29964, c19883, c19883);
            if (c11813M9343 != c19883.f64250) {
                interfaceC17889.mo36975(R.id.MT_Protector, Boolean.TRUE);
            }
            return c11813M9343;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11813 m9343(String str, C19883 c19883, C19883 c19884) {
        if (C3695.m11253(str)) {
            return c19884.f64250;
        }
        C11813 c11813M28875 = C11813.m28875(C13110.m31773(str));
        return c11813M28875 == null ? c19883.f64250 : c11813M28875;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9352() {
        this.f9596 = true;
    }
}
