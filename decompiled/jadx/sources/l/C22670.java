package l;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X72V */
/* JADX INFO: loaded from: classes.dex */
public final class C22670 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f73180 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73181;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50660() {
        if (this.f73181) {
            throw new InterruptedIOException("Remote payload opening was canceled");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50661(InterfaceC16687 interfaceC16687) {
        this.f73180.remove(interfaceC16687);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50659(InterfaceC16687 interfaceC16687) throws InterruptedIOException {
        synchronized (this) {
            if (!this.f73181) {
                this.f73180.add(interfaceC16687);
            } else {
                interfaceC16687.cancel();
                throw new InterruptedIOException("Remote payload opening was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50658() {
        synchronized (this) {
            if (this.f73181) {
                return;
            }
            this.f73181 = true;
            ArrayList arrayList = new ArrayList(this.f73180);
            this.f73180.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC16687) it.next()).cancel();
            }
        }
    }
}
