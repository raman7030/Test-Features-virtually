package p067l;

import java.net.MalformedURLException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9YC */
/* JADX INFO: loaded from: classes5.dex */
public final class C22690 implements InterfaceC7365 {

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC4410 f71572 = C13128.m30022(C22690.class);

    /* JADX INFO: renamed from: ᩶ */
    public final C14642 f71573;

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f71574;

    /* JADX INFO: renamed from: ᩹ */
    public C14642 f71575 = m50807();

    public C22690(C14642 c14642, Iterator it) {
        this.f71573 = c14642;
        this.f71574 = it;
    }

    /* JADX INFO: renamed from: ֫ */
    private C14642 m50807() {
        while (true) {
            Iterator it = this.f71574;
            if (!it.hasNext()) {
                return null;
            }
            InterfaceC15983 interfaceC15983 = (InterfaceC15983) it.next();
            try {
                return new C14642(this.f71573, interfaceC15983.getName(), false, interfaceC15983.getType(), 17, 0L, 0L);
            } catch (MalformedURLException e) {
                f71572.mo9186("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71575 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C14642 c14642 = this.f71575;
        this.f71575 = m50807();
        return c14642;
    }

    @Override // p067l.InterfaceC7365, java.lang.AutoCloseable
    public final void close() {
        this.f71575 = null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
