package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2655 {

    /* JADX INFO: renamed from: ۡ */
    public static final Object f4436 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public int f4437;

    /* JADX INFO: renamed from: ۜ */
    public volatile Object f4438;

    /* JADX INFO: renamed from: ۢ */
    public int f4439;

    /* JADX INFO: renamed from: ۧ */
    public boolean f4440;

    /* JADX INFO: renamed from: ܳ */
    public boolean f4441;

    /* JADX INFO: renamed from: ܽ */
    public volatile Object f4442;

    /* JADX INFO: renamed from: ܿ */
    public boolean f4443;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f4444;

    /* JADX INFO: renamed from: ᩷ */
    public final Runnable f4445;

    /* JADX INFO: renamed from: ᩻ */
    public C1397 f4446;

    /* JADX INFO: renamed from: ܽ */
    public void mo4070() {
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo4071() {
    }

    public AbstractC2655(Object obj) {
        this.f4444 = new Object();
        this.f4446 = new C1397();
        this.f4437 = 0;
        this.f4438 = f4436;
        this.f4445 = new RunnableC4668(this);
        this.f4442 = obj;
        this.f4439 = 0;
    }

    public AbstractC2655() {
        this.f4444 = new Object();
        this.f4446 = new C1397();
        this.f4437 = 0;
        Object obj = f4436;
        this.f4438 = obj;
        this.f4445 = new RunnableC4668(this);
        this.f4442 = obj;
        this.f4439 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m4059(AbstractC20762 abstractC20762) {
        if (abstractC20762.f65263) {
            if (!abstractC20762.mo13523()) {
                abstractC20762.m46869(false);
                return;
            }
            int i = abstractC20762.f65264;
            int i2 = this.f4439;
            if (i >= i2) {
                return;
            }
            abstractC20762.f65264 = i2;
            abstractC20762.f65262.mo4017(this.f4442);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4064(AbstractC20762 abstractC20762) {
        if (this.f4441) {
            this.f4443 = true;
            return;
        }
        this.f4441 = true;
        do {
            this.f4443 = false;
            if (abstractC20762 != null) {
                m4059(abstractC20762);
                abstractC20762 = null;
            } else {
                C1536 c1536M29826 = this.f4446.m29826();
                while (c1536M29826.hasNext()) {
                    m4059((AbstractC20762) ((Map.Entry) c1536M29826.next()).getValue());
                    if (this.f4443) {
                        break;
                    }
                }
            }
        } while (this.f4443);
        this.f4441 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4066(InterfaceC24784 interfaceC24784, InterfaceC3326 interfaceC3326) {
        m4058("observe");
        if (interfaceC24784.getLifecycle().mo21805() == EnumC15415.DESTROYED) {
            return;
        }
        C20091 c20091 = new C20091(this, interfaceC24784, interfaceC3326);
        AbstractC20762 abstractC20762 = (AbstractC20762) this.f4446.mo28379(interfaceC3326, c20091);
        if (abstractC20762 != null && !abstractC20762.mo45505(interfaceC24784)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC20762 != null) {
            return;
        }
        interfaceC24784.getLifecycle().mo21806(c20091);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4063(InterfaceC3326 interfaceC3326) {
        m4058("observeForever");
        C6009 c6009 = new C6009(this, interfaceC3326);
        AbstractC20762 abstractC20762 = (AbstractC20762) this.f4446.mo28379(interfaceC3326, c6009);
        if (abstractC20762 instanceof C20091) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC20762 != null) {
            return;
        }
        c6009.m46869(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public void m4068(InterfaceC3326 interfaceC3326) {
        m4058("removeObserver");
        AbstractC20762 abstractC20762 = (AbstractC20762) this.f4446.remove(interfaceC3326);
        if (abstractC20762 == null) {
            return;
        }
        abstractC20762.mo45504();
        abstractC20762.m46869(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4065(InterfaceC24784 interfaceC24784) {
        m4058("removeObservers");
        for (Map.Entry entry : this.f4446) {
            if (((AbstractC20762) entry.getValue()).mo45505(interfaceC24784)) {
                m4068((InterfaceC3326) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4062(Object obj) {
        boolean z;
        synchronized (this.f4444) {
            z = this.f4438 == f4436;
            this.f4438 = obj;
        }
        if (z) {
            C1081.m15926().m15927(this.f4445);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo4067(Object obj) {
        m4058("setValue");
        this.f4439++;
        this.f4442 = obj;
        m4064((AbstractC20762) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m4060() {
        Object obj = this.f4442;
        if (obj != f4436) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m4069() {
        return this.f4446.size() > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4061(int i) {
        int i2 = this.f4437;
        this.f4437 = i + i2;
        if (this.f4440) {
            return;
        }
        this.f4440 = true;
        while (true) {
            try {
                int i3 = this.f4437;
                if (i2 == i3) {
                    this.f4440 = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo4070();
                } else if (z2) {
                    mo4071();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f4440 = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4058(String str) {
        if (!C1081.m15926().m15928()) {
            throw new IllegalStateException(C6988.m16053("Cannot invoke ", str, " on a background thread"));
        }
    }
}
