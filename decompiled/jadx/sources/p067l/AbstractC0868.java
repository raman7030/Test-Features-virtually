package p067l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.֡ܽ */
/* JADX INFO: compiled from: T20C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0868 {

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList f4956 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4387 f4957;

    /* JADX INFO: renamed from: ܽ */
    public boolean f4958;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo3603();

    public AbstractC0868(boolean z) {
        this.f4958 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m4609() {
        return this.f4958;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4607(boolean z) {
        this.f4958 = z;
        InterfaceC4387 interfaceC4387 = this.f4957;
        if (interfaceC4387 != null) {
            interfaceC4387.mo6293();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4387 m4604() {
        return this.f4957;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4605(InterfaceC4387 interfaceC4387) {
        this.f4957 = interfaceC4387;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4610() {
        Iterator it = this.f4956.iterator();
        while (it.hasNext()) {
            ((InterfaceC1070) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4606(InterfaceC1070 interfaceC1070) {
        this.f4956.add(interfaceC1070);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4608(InterfaceC1070 interfaceC1070) {
        this.f4956.remove(interfaceC1070);
    }
}
