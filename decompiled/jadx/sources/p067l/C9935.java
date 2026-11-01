package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9935 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22676 f27515;

    /* JADX INFO: renamed from: ᩶ */
    public int f27516 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f27517;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f27518;

    public C9935(C22676 c22676) {
        this.f27515 = c22676;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f27516 + 1;
        C22676 c22676 = this.f27515;
        return i < c22676.f71535.size() || (!c22676.f71533.isEmpty() && m23234().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f27518 = true;
        int i = this.f27516 + 1;
        this.f27516 = i;
        C22676 c22676 = this.f27515;
        if (i < c22676.f71535.size()) {
            return (Map.Entry) c22676.f71535.get(this.f27516);
        }
        return (Map.Entry) m23234().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f27518) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f27518 = false;
        C22676 c22676 = this.f27515;
        c22676.m50760();
        if (this.f27516 < c22676.f71535.size()) {
            int i = this.f27516;
            this.f27516 = i - 1;
            c22676.m50757(i);
            return;
        }
        m23234().remove();
    }

    /* JADX INFO: renamed from: ֫ */
    private Iterator m23234() {
        if (this.f27517 == null) {
            this.f27517 = this.f27515.f71533.entrySet().iterator();
        }
        return this.f27517;
    }
}
