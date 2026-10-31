package l;

import java.net.MalformedURLException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9YC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21382 implements InterfaceC5257 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f68877 = C11321.m27961(C21382.class);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12914 f68878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f68879;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f68880 = m48471();

    public C21382(C12914 c12914, Iterator it) {
        this.f68878 = c12914;
        this.f68879 = it;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12914 m48471() {
        while (true) {
            Iterator it = this.f68879;
            if (!it.hasNext()) {
                return null;
            }
            InterfaceC14325 interfaceC14325 = (InterfaceC14325) it.next();
            try {
                return new C12914(this.f68878, interfaceC14325.getName(), false, interfaceC14325.getType(), 17, 0L, 0L);
            } catch (MalformedURLException e) {
                f68877.mo7091("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68880 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C12914 c12914 = this.f68880;
        this.f68880 = m48471();
        return c12914;
    }

    @Override // l.InterfaceC5257, java.lang.AutoCloseable
    public final void close() {
        this.f68880 = null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
