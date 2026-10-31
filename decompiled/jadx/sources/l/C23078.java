package l;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23078 extends AbstractC7145 {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ C23078(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC7145 b(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C7556 ? ((C7556) fileSystem).a : new C23078(fileSystem);
    }

    @Override // l.AbstractC7145, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C23078) {
            obj = ((C23078) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.getFileStores();
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ InterfaceC20758 getPath(String str, String[] strArr) {
        return C14094.l(this.a.getPath(str, strArr));
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ InterfaceC9469 getPathMatcher(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C13200 ? ((C13200) pathMatcher).a : new C4734(pathMatcher);
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ String getSeparator() {
        return this.a.getSeparator();
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ AbstractC12290 getUserPrincipalLookupService() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C1912 ? ((C1912) userPrincipalLookupService).a : new C13700(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ InterfaceC5235 newWatchService() {
        return C0689.b(this.a.newWatchService());
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ AbstractC13389 provider() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = C10568.f;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof C6334 ? ((C6334) fileSystemProviderProvider).a : new C10568(fileSystemProviderProvider);
    }

    @Override // l.AbstractC7145
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // l.AbstractC7145
    public final Iterable getRootDirectories() {
        return new C16938(this.a.getRootDirectories());
    }
}
