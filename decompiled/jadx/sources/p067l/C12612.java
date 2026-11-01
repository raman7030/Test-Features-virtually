package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۧۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C12612 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17975 f35404;

    /* JADX INFO: renamed from: ᩶ */
    public int f35405 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f35406;

    /* JADX INFO: renamed from: ᩹ */
    public Object f35407;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C12612(C17975 c17975) {
        this.f35404 = c17975;
        this.f35406 = new C2552((C7247) c17975.f53690);
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m29025() {
        Object next;
        do {
            Iterator it = this.f35406;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f35405 = 0;
                return;
            }
        } while (((Boolean) ((C19988) this.f35404.f53689).invoke(next)).booleanValue());
        this.f35407 = next;
        this.f35405 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35405 == -1) {
            m29025();
        }
        if (this.f35405 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f35407;
        this.f35407 = null;
        this.f35405 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35405 == -1) {
            m29025();
        }
        return this.f35405 == 1;
    }
}
