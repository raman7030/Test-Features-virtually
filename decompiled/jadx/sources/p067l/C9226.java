package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.۟ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9226 implements InterfaceC6544 {

    /* JADX INFO: renamed from: ֨ */
    public static Logger f24965 = Logger.getLogger(C9226.class.getName());

    /* JADX INFO: renamed from: ۚ */
    public static final /* synthetic */ int f24966 = 0;

    /* JADX INFO: renamed from: ֡ */
    public boolean f24967;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f24968;

    /* JADX INFO: renamed from: ۖ */
    public boolean f24969;

    /* JADX INFO: renamed from: ۘ */
    public final ArrayList f24970;

    /* JADX INFO: renamed from: ۜ */
    public int f24971;

    /* JADX INFO: renamed from: ۡ */
    public C11909 f24972;

    /* JADX INFO: renamed from: ۢ */
    public double f24973;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14590 f24974;

    /* JADX INFO: renamed from: ܳ */
    public long f24975;

    /* JADX INFO: renamed from: ܺ */
    public C15260 f24976;

    /* JADX INFO: renamed from: ܽ */
    public final CopyOnWriteArrayList f24977;

    /* JADX INFO: renamed from: ܿ */
    public C23978 f24978;

    /* JADX INFO: renamed from: ᩳ */
    public final C16522 f24979;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f24980;

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList f24981;

    /* JADX INFO: renamed from: ᩷ */
    public C15260 f24982;

    /* JADX INFO: renamed from: ᩻ */
    public double f24983;

    public final String toString() {
        return "JSyn V17.2.0 (build 467, 2025-06-29)";
    }

    /* JADX INFO: renamed from: ᩷ */
    public final synchronized void m21264() {
        C23978 c23978;
        if (!this.f24980) {
            f24965.info("JSyn already stopped.");
            return;
        }
        if (this.f24967 && (c23978 = this.f24978) != null) {
            try {
                c23978.m53151();
                this.f24978.join(2000L);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f24970) {
            this.f24970.clear();
        }
        this.f24980 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21249(C9226 c9226, AbstractC25081 abstractC25081) {
        c9226.getClass();
        if (abstractC25081.m55061() == null) {
            synchronized (c9226.f24970) {
                if (!c9226.f24970.contains(abstractC25081)) {
                    c9226.f24970.add(abstractC25081);
                }
            }
        }
    }

    public C9226() {
        InterfaceC14590 interfaceC14590M12835 = C5755.m12835();
        this.f24979 = new C16522();
        this.f24969 = true;
        this.f24967 = true;
        this.f24971 = 44100;
        this.f24983 = 1.0d / ((double) 44100);
        this.f24968 = new ArrayList();
        this.f24970 = new ArrayList();
        this.f24981 = new ArrayList();
        this.f24977 = new CopyOnWriteArrayList();
        this.f24974 = interfaceC14590M12835;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m21256() {
        synchronized (this) {
            if (this.f24980) {
                return;
            }
            this.f24971 = 44100;
            double d = 44100;
            this.f24983 = 1.0d / d;
            this.f24982 = new C15260(0);
            this.f24976 = new C15260(2);
            this.f24973 = 2.0d / d;
            if (this.f24967) {
                this.f24978 = new C23978(this);
                Logger logger = f24965;
                logger.fine("Synth thread old priority = " + this.f24978.getPriority());
                int priority = 10;
                if (this.f24978.getPriority() + 2 <= 10) {
                    priority = this.f24978.getPriority() + 2;
                }
                this.f24978.setPriority(priority);
                logger.fine("Synth thread new priority = " + this.f24978.getPriority());
                this.f24978.start();
            }
            this.f24980 = true;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m21251(C9226 c9226) {
        Iterator it = c9226.f24977.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21257() {
        int iM34725 = 0;
        int iM34724 = 0;
        int i = 0;
        while (i < 8) {
            C15260 c15260 = this.f24982;
            if (c15260 != null) {
                iM34724 = c15260.m34724(iM34724);
            }
            int i2 = iM34724;
            C22559 c22559M21253 = m21253();
            C16522 c16522 = this.f24979;
            for (List listM37489 = c16522.m37489(c22559M21253); listM37489 != null; listM37489 = c16522.m37489(c22559M21253)) {
                while (!listM37489.isEmpty()) {
                    InterfaceC9817 interfaceC9817 = (InterfaceC9817) listM37489.remove(0);
                    f24965.fine("processing " + interfaceC9817 + ", at time " + c22559M21253.m50586());
                    interfaceC9817.run();
                }
            }
            C15260 c15261 = this.f24976;
            int i3 = 0;
            while (true) {
                C13250[] c13250Arr = c15261.f43560;
                if (i3 >= c13250Arr.length) {
                    break;
                }
                c13250Arr[i3].m30301();
                i3++;
            }
            synchronized (this.f24970) {
                ListIterator listIterator = this.f24970.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC25081 abstractC25081 = (AbstractC25081) listIterator.next();
                    if (this.f24969) {
                        abstractC25081.m55055(this.f24975);
                    } else {
                        abstractC25081.mo8717();
                    }
                }
                for (AbstractC25081 abstractC25082 : this.f24981) {
                    this.f24970.remove(abstractC25082);
                    abstractC25082.mo15938();
                }
            }
            this.f24981.clear();
            C15260 c15262 = this.f24976;
            if (c15262 != null) {
                iM34725 = c15262.m34725(iM34725);
            }
            this.f24975 += 8;
            i++;
            iM34724 = i2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21258(double d) throws InterruptedException {
        long j = this.f24975;
        double d2 = this.f24983;
        double d3 = (j * d2) + d;
        double d4 = j * d2;
        while (true) {
            double d5 = d3 - d4;
            if (d5 <= 0.0d) {
                return;
            }
            if (this.f24967) {
                long j2 = (long) (d5 * 1000.0d);
                if (j2 <= 0) {
                    j2 = 1;
                }
                Thread.sleep(j2);
            } else {
                m21257();
            }
            d4 = this.f24975 * this.f24983;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22559 m21253() {
        return new C22559(this.f24975 * this.f24983);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21254(C22559 c22559, InterfaceC9817 interfaceC9817) {
        if (Thread.currentThread() == this.f24978 && c22559.m50586() <= this.f24975 * this.f24983) {
            interfaceC9817.run();
            return;
        }
        f24965.fine("scheduling " + interfaceC9817 + ", at time " + c22559.m50586());
        this.f24979.m37490(c22559, interfaceC9817);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21259(AbstractC25081 abstractC25081) {
        C22559 c22559M21253 = m21253();
        if (abstractC25081.m55061() == null) {
            m21254(c22559M21253, new C7885(this, abstractC25081));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final double m21262() {
        return this.f24973;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m21252(double d) {
        return Math.pow(3.0517578125E-5d, 1.0d / (d * ((double) this.f24971)));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m21263() {
        return this.f24971;
    }

    /* JADX INFO: renamed from: ܽ */
    public final double m21261() {
        return this.f24983;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m21265() {
        this.f24967 = false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m21260() {
        return this.f24967;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21255(AbstractC25081 abstractC25081) {
        abstractC25081.mo15939(this);
        this.f24968.add(abstractC25081);
    }
}
