package p067l;

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
public final /* synthetic */ class C9550 extends FileSystem {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9159 f26256a;

    public /* synthetic */ C9550(AbstractC9159 abstractC9159) {
        this.f26256a = abstractC9159;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FileSystem m22253b(AbstractC9159 abstractC9159) {
        if (abstractC9159 == null) {
            return null;
        }
        return abstractC9159 instanceof C24302 ? ((C24302) abstractC9159).f76972a : new C9550(abstractC9159);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f26256a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9159 abstractC9159 = this.f26256a;
        if (obj instanceof C9550) {
            obj = ((C9550) obj).f26256a;
        }
        return abstractC9159.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f26256a.getFileStores();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        return C9730.m22751l(this.f26256a.getPath(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        InterfaceC11368 pathMatcher = this.f26256a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof C6868 ? ((C6868) pathMatcher).f17851a : new C14914(pathMatcher);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f26256a.getSeparator();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        AbstractC14049 userPrincipalLookupService = this.f26256a.getUserPrincipalLookupService();
        int i = C4186.f9217b;
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof C15389 ? ((C15389) userPrincipalLookupService).f43977a : new C4186(userPrincipalLookupService);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26256a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f26256a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f26256a.isReadOnly();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return C3695.m7126b(this.f26256a.newWatchService());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        AbstractC15094 abstractC15094Provider = this.f26256a.provider();
        int i = C8389.f22501b;
        if (abstractC15094Provider == null) {
            return null;
        }
        return abstractC15094Provider instanceof C12413 ? ((C12413) abstractC15094Provider).f34684e : new C8389(abstractC15094Provider);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f26256a.supportedFileAttributeViews();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C18467(this.f26256a.getRootDirectories());
    }
}
