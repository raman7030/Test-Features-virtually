package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C20803 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f67343;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67344 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67345 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47597() {
        synchronized (C0340.f1746) {
            if (this.f67343) {
                return;
            }
            this.f67343 = true;
            ArrayList arrayList = new ArrayList(this.f67345);
            ArrayList arrayList2 = new ArrayList(this.f67344);
            this.f67345.clear();
            this.f67344.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6691) it.next()).f20790 = false;
            }
            C0340.f1746.notifyAll();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0340.m1786((C6691) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C0340.m1783((C23624) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47598() {
        boolean z;
        synchronized (C0340.f1746) {
            z = this.f67343;
        }
        return z;
    }
}
