package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9265 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28066;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28067 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m23787(InterfaceC7889 interfaceC7889) {
        if (this.f28066) {
            return false;
        }
        this.f28067.add(interfaceC7889);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23788(InterfaceC7889 interfaceC7889) {
        this.f28067.remove(interfaceC7889);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23786() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (this.f28066) {
                return;
            }
            this.f28066 = true;
            Iterator it = this.f28067.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC7889) it.next()).mo21173());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC2245) it2.next()).close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
