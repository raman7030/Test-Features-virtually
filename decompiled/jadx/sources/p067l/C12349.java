package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12349 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f34460;

    /* JADX INFO: renamed from: ۧ */
    public int f34461;

    public /* synthetic */ C12349(int i) {
        this();
    }

    public C12349() {
        this.f34460 = null;
        this.f34461 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28435() {
        this.f34461 += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f34460.iterator();
        while (it.hasNext()) {
            sb.append((C8325) it.next());
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f34461);
        sb.append(']');
        return sb.toString();
    }
}
