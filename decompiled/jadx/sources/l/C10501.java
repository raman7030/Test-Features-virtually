package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10501 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f31498;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31499;

    public /* synthetic */ C10501(int i) {
        this();
    }

    public C10501() {
        this.f31498 = null;
        this.f31499 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26402() {
        this.f31499 += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f31498.iterator();
        while (it.hasNext()) {
            sb.append((C6267) it.next());
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f31499);
        sb.append(']');
        return sb.toString();
    }
}
