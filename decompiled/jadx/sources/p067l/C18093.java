package p067l;

import com.google.android.material.motion.MotionUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: renamed from: l.ܽۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C18093 extends AbstractC4012 {

    /* JADX INFO: renamed from: ۬ */
    public static InterfaceC4410 f54016 = C13128.m30023(C18093.class.getName());

    /* JADX INFO: renamed from: ۗ */
    public final boolean f54017;

    /* JADX INFO: renamed from: ۙ */
    public final int f54018;

    /* JADX INFO: renamed from: ᩶ */
    public final C13065 f54019;

    /* JADX INFO: renamed from: ᩹ */
    public final InetAddress f54020;

    public C18093(C10738 c10738, C13065 c13065, InetAddress inetAddress, int i) {
        super(c10738);
        this.f54019 = c13065;
        this.f54020 = inetAddress;
        this.f54018 = i;
        this.f54017 = i != C14760.f42090;
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("Responder("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // p067l.AbstractC4012
    public final String toString() {
        return mo7991() + " incomming: " + this.f54019;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41151(Timer timer) {
        InterfaceC4410 interfaceC4410;
        C13065 c13065 = this.f54019;
        Iterator it = c13065.m44917().iterator();
        boolean zMo10678 = true;
        do {
            boolean zHasNext = it.hasNext();
            interfaceC4410 = f54016;
            if (!zHasNext) {
                break;
            }
            C20441 c20441 = (C20441) it.next();
            interfaceC4410.mo9185("{}.start() question={}", mo7991(), c20441);
            zMo10678 = c20441.mo10678(m7986());
        } while (zMo10678);
        int iNextInt = (!zMo10678 || c13065.m44918()) ? (C10738.m24687().nextInt(96) + 20) - c13065.m29909() : 0;
        int i = iNextInt >= 0 ? iNextInt : 0;
        interfaceC4410.mo9185("{}.start() Responder chosen delay={}", mo7991(), Integer.valueOf(i));
        if (m7986().m24720() || m7986().m24711()) {
            return;
        }
        timer.schedule(this, i);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC4410 interfaceC4410 = f54016;
        C10738 c10738M7986 = m7986();
        C13065 c13065 = this.f54019;
        c10738M7986.m24715(c13065);
        HashSet<C20441> hashSet = new HashSet();
        HashSet<AbstractC23793> hashSet2 = new HashSet();
        if (m7986().m24722()) {
            try {
                Iterator it = c13065.m44917().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z = this.f54017;
                    if (!zHasNext) {
                        break;
                    }
                    C20441 c20441 = (C20441) it.next();
                    interfaceC4410.mo9177("{}.run() JmDNS responding to: {}", mo7991(), c20441);
                    if (z) {
                        hashSet.add(c20441);
                    }
                    c20441.mo10677(m7986(), hashSet2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (AbstractC23793 abstractC23793 : c13065.m44915()) {
                    if (abstractC23793.m52886(jCurrentTimeMillis)) {
                        hashSet2.remove(abstractC23793);
                        interfaceC4410.mo9195(mo7991(), "{} - JmDNS Responder Known Answer Removed");
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                interfaceC4410.mo9195(mo7991(), "{}.run() JmDNS responding");
                C16416 c16416 = new C16416(33792, c13065.m29910(), !z);
                if (z) {
                    c16416.m37307(new InetSocketAddress(this.f54020, this.f54018));
                }
                c16416.m44916(c13065.m44921());
                for (C20441 c20442 : hashSet) {
                    if (c20442 != null) {
                        c16416 = m7988(c16416, c20442);
                    }
                }
                for (AbstractC23793 abstractC23794 : hashSet2) {
                    if (abstractC23794 != null) {
                        c16416 = m7987(c16416, c13065, abstractC23794);
                    }
                }
                if (c16416.m44912()) {
                    return;
                }
                m7986().m24698(c16416);
            } catch (Throwable th) {
                interfaceC4410.mo9178(mo7991() + "run() exception ", th);
                m7986().close();
            }
        }
    }
}
