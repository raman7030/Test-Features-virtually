package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7962 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f24601;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24602 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f24603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24604;

    public C7962(C21368 c21368) {
        this.f24601 = c21368;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f24602 + 1;
        C21368 c21368 = this.f24601;
        return i < c21368.f68839.size() || (!c21368.f68837.isEmpty() && m21268().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f24604 = true;
        int i = this.f24602 + 1;
        this.f24602 = i;
        C21368 c21368 = this.f24601;
        if (i < c21368.f68839.size()) {
            return (Map.Entry) c21368.f68839.get(this.f24602);
        }
        return (Map.Entry) m21268().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24604) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24604 = false;
        C21368 c21368 = this.f24601;
        c21368.m48424();
        if (this.f24602 < c21368.f68839.size()) {
            int i = this.f24602;
            this.f24602 = i - 1;
            c21368.m48421(i);
            return;
        }
        m21268().remove();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Iterator m21268() {
        if (this.f24603 == null) {
            this.f24603 = this.f24601.f68837.entrySet().iterator();
        }
        return this.f24603;
    }
}
