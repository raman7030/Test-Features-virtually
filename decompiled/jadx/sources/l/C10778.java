package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۧۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10778 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16421 f32428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32429 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f32430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f32431;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C10778(C16421 c16421) {
        this.f32428 = c16421;
        this.f32430 = new C0193((C5133) c16421.f50510);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m26980() {
        Object next;
        do {
            Iterator it = this.f32430;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f32429 = 0;
                return;
            }
        } while (((Boolean) ((C18539) this.f32428.f50509).invoke(next)).booleanValue());
        this.f32431 = next;
        this.f32429 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32429 == -1) {
            m26980();
        }
        if (this.f32429 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f32431;
        this.f32431 = null;
        this.f32429 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32429 == -1) {
            m26980();
        }
        return this.f32429 == 1;
    }
}
