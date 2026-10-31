package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.۟ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7216 implements InterfaceC4394 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Logger f22080 = Logger.getLogger(C7216.class.getName());

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22081 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f22082;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22083;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f22084;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22085;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f22086;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10039 f22087;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f22088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12860 f22089;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f22090;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13565 f22091;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f22092;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22738 f22093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14893 f22094;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22095;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f22096;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13565 f22097;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f22098;

    public final String toString() {
        return "JSyn V17.2.0 (build 467, 2025-06-29)";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m19316() {
        C22738 c22738;
        if (!this.f22095) {
            f22080.info("JSyn already stopped.");
            return;
        }
        if (this.f22082 && (c22738 = this.f22093) != null) {
            try {
                c22738.m50818();
                this.f22093.join(2000L);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f22085) {
            this.f22085.clear();
        }
        this.f22095 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19301(C7216 c7216, AbstractC23898 abstractC23898) {
        c7216.getClass();
        if (abstractC23898.m52652() == null) {
            synchronized (c7216.f22085) {
                if (!c7216.f22085.contains(abstractC23898)) {
                    c7216.f22085.add(abstractC23898);
                }
            }
        }
    }

    public C7216() {
        InterfaceC12860 interfaceC12860M10855 = C3563.m10855();
        this.f22094 = new C14893();
        this.f22084 = true;
        this.f22082 = true;
        this.f22086 = 44100;
        this.f22098 = 1.0d / ((double) 44100);
        this.f22083 = new ArrayList();
        this.f22085 = new ArrayList();
        this.f22096 = new ArrayList();
        this.f22092 = new CopyOnWriteArrayList();
        this.f22089 = interfaceC12860M10855;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m19308() {
        synchronized (this) {
            if (this.f22095) {
                return;
            }
            this.f22086 = 44100;
            double d = 44100;
            this.f22098 = 1.0d / d;
            this.f22097 = new C13565(0);
            this.f22091 = new C13565(2);
            this.f22088 = 2.0d / d;
            if (this.f22082) {
                this.f22093 = new C22738(this);
                Logger logger = f22080;
                logger.fine("Synth thread old priority = " + this.f22093.getPriority());
                int priority = 10;
                if (this.f22093.getPriority() + 2 <= 10) {
                    priority = this.f22093.getPriority() + 2;
                }
                this.f22093.setPriority(priority);
                logger.fine("Synth thread new priority = " + this.f22093.getPriority());
                this.f22093.start();
            }
            this.f22095 = true;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m19303(C7216 c7216) {
        Iterator it = c7216.f22092.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19309() {
        int iM32614 = 0;
        int iM32613 = 0;
        int i = 0;
        while (i < 8) {
            C13565 c13565 = this.f22097;
            if (c13565 != null) {
                iM32613 = c13565.m32613(iM32613);
            }
            int i2 = iM32613;
            C21245 c21245M19305 = m19305();
            C14893 c14893 = this.f22094;
            for (List listM35337 = c14893.m35337(c21245M19305); listM35337 != null; listM35337 = c14893.m35337(c21245M19305)) {
                while (!listM35337.isEmpty()) {
                    InterfaceC7838 interfaceC7838 = (InterfaceC7838) listM35337.remove(0);
                    f22080.fine("processing " + interfaceC7838 + ", at time " + c21245M19305.m48255());
                    interfaceC7838.run();
                }
            }
            C13565 c13566 = this.f22091;
            int i3 = 0;
            while (true) {
                C11450[] c11450Arr = c13566.f40482;
                if (i3 >= c11450Arr.length) {
                    break;
                }
                c11450Arr[i3].m28257();
                i3++;
            }
            synchronized (this.f22085) {
                ListIterator listIterator = this.f22085.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC23898 abstractC23898 = (AbstractC23898) listIterator.next();
                    if (this.f22084) {
                        abstractC23898.m52646(this.f22090);
                    } else {
                        abstractC23898.mo6591();
                    }
                }
                for (AbstractC23898 abstractC23899 : this.f22096) {
                    this.f22085.remove(abstractC23899);
                    abstractC23899.mo14058();
                }
            }
            this.f22096.clear();
            C13565 c13567 = this.f22091;
            if (c13567 != null) {
                iM32614 = c13567.m32614(iM32614);
            }
            this.f22090 += 8;
            i++;
            iM32613 = i2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19310(double d) throws InterruptedException {
        long j = this.f22090;
        double d2 = this.f22098;
        double d3 = (j * d2) + d;
        double d4 = j * d2;
        while (true) {
            double d5 = d3 - d4;
            if (d5 <= 0.0d) {
                return;
            }
            if (this.f22082) {
                long j2 = (long) (d5 * 1000.0d);
                if (j2 <= 0) {
                    j2 = 1;
                }
                Thread.sleep(j2);
            } else {
                m19309();
            }
            d4 = this.f22090 * this.f22098;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21245 m19305() {
        return new C21245(this.f22090 * this.f22098);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19306(C21245 c21245, InterfaceC7838 interfaceC7838) {
        if (Thread.currentThread() == this.f22093 && c21245.m48255() <= this.f22090 * this.f22098) {
            interfaceC7838.run();
            return;
        }
        f22080.fine("scheduling " + interfaceC7838 + ", at time " + c21245.m48255());
        this.f22094.m35338(c21245, interfaceC7838);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19311(AbstractC23898 abstractC23898) {
        C21245 c21245M19305 = m19305();
        if (abstractC23898.m52652() == null) {
            m19306(c21245M19305, new C5805(this, abstractC23898));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double m19314() {
        return this.f22088;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m19304(double d) {
        return Math.pow(3.0517578125E-5d, 1.0d / (d * ((double) this.f22086)));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m19315() {
        return this.f22086;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final double m19313() {
        return this.f22098;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m19317() {
        this.f22082 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19312() {
        return this.f22082;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19307(AbstractC23898 abstractC23898) {
        abstractC23898.mo14059(this);
        this.f22083.add(abstractC23898);
    }
}
