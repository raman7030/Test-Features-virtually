package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C22140 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f70026;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f70027 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f70028 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m49925() {
        synchronized (C2692.f4522) {
            if (this.f70026) {
                return;
            }
            this.f70026 = true;
            ArrayList arrayList = new ArrayList(this.f70028);
            ArrayList arrayList2 = new ArrayList(this.f70027);
            this.f70028.clear();
            this.f70027.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C8728) it.next()).f23665 = false;
            }
            C2692.f4522.notifyAll();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2692.m4185((C8728) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C2692.m4182((C24821) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m49926() {
        boolean z;
        synchronized (C2692.f4522) {
            z = this.f70026;
        }
        return z;
    }
}
