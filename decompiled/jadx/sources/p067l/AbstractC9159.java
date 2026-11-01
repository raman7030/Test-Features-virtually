package p067l;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: renamed from: l.۟֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9159 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Iterable getFileStores();

    public abstract InterfaceC22097 getPath(String str, String... strArr);

    public abstract InterfaceC11368 getPathMatcher(String str);

    public abstract Iterable getRootDirectories();

    public abstract String getSeparator();

    public abstract AbstractC14049 getUserPrincipalLookupService();

    public abstract boolean isOpen();

    public abstract boolean isReadOnly();

    public abstract InterfaceC7344 newWatchService();

    public abstract AbstractC15094 provider();

    public abstract Set supportedFileAttributeViews();
}
