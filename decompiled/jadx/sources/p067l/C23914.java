package p067l;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X72V */
/* JADX INFO: loaded from: classes.dex */
public final class C23914 {

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f75905 = new HashSet();

    /* JADX INFO: renamed from: ۧ */
    public boolean f75906;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m52986() {
        if (this.f75906) {
            throw new InterruptedIOException("Remote payload opening was canceled");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m52987(InterfaceC18228 interfaceC18228) {
        this.f75905.remove(interfaceC18228);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52985(InterfaceC18228 interfaceC18228) throws InterruptedIOException {
        synchronized (this) {
            if (!this.f75906) {
                this.f75905.add(interfaceC18228);
            } else {
                interfaceC18228.cancel();
                throw new InterruptedIOException("Remote payload opening was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52984() {
        synchronized (this) {
            if (this.f75906) {
                return;
            }
            this.f75906 = true;
            ArrayList arrayList = new ArrayList(this.f75905);
            this.f75905.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC18228) it.next()).cancel();
            }
        }
    }
}
