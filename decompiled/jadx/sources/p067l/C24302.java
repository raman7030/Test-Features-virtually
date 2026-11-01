package p067l;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24302 extends AbstractC9159 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileSystem f76972a;

    public /* synthetic */ C24302(FileSystem fileSystem) {
        this.f76972a = fileSystem;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC9159 m53636b(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C9550 ? ((C9550) fileSystem).f26256a : new C24302(fileSystem);
    }

    @Override // p067l.AbstractC9159, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f76972a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.f76972a;
        if (obj instanceof C24302) {
            obj = ((C24302) obj).f76972a;
        }
        return fileSystem.equals(obj);
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ Iterable getFileStores() {
        return this.f76972a.getFileStores();
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ InterfaceC22097 getPath(String str, String[] strArr) {
        return C15764.m35828l(this.f76972a.getPath(str, strArr));
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ InterfaceC11368 getPathMatcher(String str) {
        PathMatcher pathMatcher = this.f76972a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C14914 ? ((C14914) pathMatcher).f42533a : new C6868(pathMatcher);
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ String getSeparator() {
        return this.f76972a.getSeparator();
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ AbstractC14049 getUserPrincipalLookupService() {
        UserPrincipalLookupService userPrincipalLookupService = this.f76972a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C4186 ? ((C4186) userPrincipalLookupService).f9218a : new C15389(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.f76972a.hashCode();
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ boolean isOpen() {
        return this.f76972a.isOpen();
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ boolean isReadOnly() {
        return this.f76972a.isReadOnly();
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ InterfaceC7344 newWatchService() {
        return C3024.m5116b(this.f76972a.newWatchService());
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ AbstractC15094 provider() {
        FileSystemProvider fileSystemProviderProvider = this.f76972a.provider();
        int i = C12413.f34683f;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof C8389 ? ((C8389) fileSystemProviderProvider).f22502a : new C12413(fileSystemProviderProvider);
    }

    @Override // p067l.AbstractC9159
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f76972a.supportedFileAttributeViews();
    }

    @Override // p067l.AbstractC9159
    public final Iterable getRootDirectories() {
        return new C18467(this.f76972a.getRootDirectories());
    }
}
