package l;

import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6439 implements DirectoryStream {
    public C20551 a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return this.a;
    }
}
