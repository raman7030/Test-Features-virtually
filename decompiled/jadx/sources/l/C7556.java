package l;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7556 extends FileSystem {
    public final /* synthetic */ AbstractC7145 a;

    public /* synthetic */ C7556(AbstractC7145 abstractC7145) {
        this.a = abstractC7145;
    }

    public static /* synthetic */ FileSystem b(AbstractC7145 abstractC7145) {
        if (abstractC7145 == null) {
            return null;
        }
        return abstractC7145 instanceof C23078 ? ((C23078) abstractC7145).a : new C7556(abstractC7145);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC7145 abstractC7145 = this.a;
        if (obj instanceof C7556) {
            obj = ((C7556) obj).a;
        }
        return abstractC7145.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C7745.l(this.a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        InterfaceC9469 pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C4734 ? ((C4734) pathMatcher).a : new C13200(pathMatcher);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        AbstractC12290 userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        int i = C1912.b;
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C13700 ? ((C13700) userPrincipalLookupService).a : new C1912(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return C1395.b(this.a.newWatchService());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        AbstractC13389 abstractC13389Provider = this.a.provider();
        int i = C6334.b;
        if (abstractC13389Provider == null) {
            return null;
        }
        return abstractC13389Provider instanceof C10568 ? ((C10568) abstractC13389Provider).e : new C6334(abstractC13389Provider);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C16938(this.a.getRootDirectories());
    }
}
