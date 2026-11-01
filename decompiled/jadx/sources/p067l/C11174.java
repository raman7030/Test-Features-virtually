package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11174 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f31014;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f31015 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m25796(InterfaceC9866 interfaceC9866) {
        if (this.f31014) {
            return false;
        }
        this.f31015.add(interfaceC9866);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m25797(InterfaceC9866 interfaceC9866) {
        this.f31015.remove(interfaceC9866);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25795() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (this.f31014) {
                return;
            }
            this.f31014 = true;
            Iterator it = this.f31015.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC9866) it.next()).mo23138());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC4502) it2.next()).close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
