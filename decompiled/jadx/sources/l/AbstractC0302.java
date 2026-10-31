package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0302 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Object f1659 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1660;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile Object f1661;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1662;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f1663;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f1664;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile Object f1665;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f1666;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f1667;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable f1668;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11194 f1669;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo1672() {
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo1673() {
    }

    public AbstractC0302(Object obj) {
        this.f1667 = new Object();
        this.f1669 = new C11194();
        this.f1660 = 0;
        this.f1661 = f1659;
        this.f1668 = new RunnableC2420(this);
        this.f1665 = obj;
        this.f1662 = 0;
    }

    public AbstractC0302() {
        this.f1667 = new Object();
        this.f1669 = new C11194();
        this.f1660 = 0;
        Object obj = f1659;
        this.f1661 = obj;
        this.f1668 = new RunnableC2420(this);
        this.f1665 = obj;
        this.f1662 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1661(AbstractC19354 abstractC19354) {
        if (abstractC19354.f62650) {
            if (!abstractC19354.mo11587()) {
                abstractC19354.m44575(false);
                return;
            }
            int i = abstractC19354.f62651;
            int i2 = this.f1662;
            if (i >= i2) {
                return;
            }
            abstractC19354.f62651 = i2;
            abstractC19354.f62649.mo1617(this.f1665);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1666(AbstractC19354 abstractC19354) {
        if (this.f1664) {
            this.f1666 = true;
            return;
        }
        this.f1664 = true;
        do {
            this.f1666 = false;
            if (abstractC19354 != null) {
                m1661(abstractC19354);
                abstractC19354 = null;
            } else {
                C13993 c13993M27764 = this.f1669.m27764();
                while (c13993M27764.hasNext()) {
                    m1661((AbstractC19354) ((Map.Entry) c13993M27764.next()).getValue());
                    if (this.f1666) {
                        break;
                    }
                }
            }
        } while (this.f1666);
        this.f1664 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1668(InterfaceC23586 interfaceC23586, InterfaceC1008 interfaceC1008) {
        m1660("observe");
        if (interfaceC23586.getLifecycle().mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        C18648 c18648 = new C18648(this, interfaceC23586, interfaceC1008);
        AbstractC19354 abstractC19354 = (AbstractC19354) this.f1669.mo26347(interfaceC1008, c18648);
        if (abstractC19354 != null && !abstractC19354.mo43239(interfaceC23586)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC19354 != null) {
            return;
        }
        interfaceC23586.getLifecycle().mo19833(c18648);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1665(InterfaceC1008 interfaceC1008) {
        m1660("observeForever");
        C3831 c3831 = new C3831(this, interfaceC1008);
        AbstractC19354 abstractC19354 = (AbstractC19354) this.f1669.mo26347(interfaceC1008, c3831);
        if (abstractC19354 instanceof C18648) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC19354 != null) {
            return;
        }
        c3831.m44575(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m1670(InterfaceC1008 interfaceC1008) {
        m1660("removeObserver");
        AbstractC19354 abstractC19354 = (AbstractC19354) this.f1669.remove(interfaceC1008);
        if (abstractC19354 == null) {
            return;
        }
        abstractC19354.mo43238();
        abstractC19354.m44575(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1667(InterfaceC23586 interfaceC23586) {
        m1660("removeObservers");
        for (Map.Entry entry : this.f1669) {
            if (((AbstractC19354) entry.getValue()).mo43239(interfaceC23586)) {
                m1670((InterfaceC1008) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1664(Object obj) {
        boolean z;
        synchronized (this.f1667) {
            z = this.f1661 == f1659;
            this.f1661 = obj;
        }
        if (z) {
            C4822.m14046().m14047(this.f1668);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo1669(Object obj) {
        m1660("setValue");
        this.f1662++;
        this.f1665 = obj;
        m1666((AbstractC19354) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m1662() {
        Object obj = this.f1665;
        if (obj != f1659) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m1671() {
        return this.f1669.size() > 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1663(int i) {
        int i2 = this.f1660;
        this.f1660 = i + i2;
        if (this.f1663) {
            return;
        }
        this.f1663 = true;
        while (true) {
            try {
                int i3 = this.f1660;
                if (i2 == i3) {
                    this.f1663 = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo1672();
                } else if (z2) {
                    mo1673();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f1663 = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1660(String str) {
        if (!C4822.m14046().m14048()) {
            throw new IllegalStateException(C4860.m14172("Cannot invoke ", str, " on a background thread"));
        }
    }
}
