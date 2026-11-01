package p067l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13104 implements DirectoryStream, InterfaceC6477 {

    /* JADX INFO: renamed from: a */
    public final DirectoryStream f36836a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C23554.m52342b(iterator(), 0);
    }

    public C13104(DirectoryStream directoryStream) {
        this.f36836a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new C3320(this.f36836a.iterator());
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C21230.forEach(this.f36836a, new C4386(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36836a.close();
    }
}
