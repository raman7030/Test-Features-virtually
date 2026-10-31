package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11295 implements DirectoryStream, InterfaceC4323 {
    public final DirectoryStream a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C22291.b(iterator(), 0);
    }

    public C11295(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new C1001(this.a.iterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19846.forEach(this.a, new C2122(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
