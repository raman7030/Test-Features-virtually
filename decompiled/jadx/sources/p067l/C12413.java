package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۤ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12413 extends AbstractC15094 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f34683f = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ FileSystemProvider f34684e;

    public /* synthetic */ C12413(FileSystemProvider fileSystemProvider) {
        this.f34684e = fileSystemProvider;
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo25789a(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) throws IOException {
        this.f34684e.createLink(C9730.m22751l(interfaceC22097), C9730.m22751l(interfaceC22098));
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo25790b(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23437[] interfaceC23437Arr) throws IOException {
        this.f34684e.createSymbolicLink(C9730.m22751l(interfaceC22097), C9730.m22751l(interfaceC22098), AbstractC24029.m53224N(interfaceC23437Arr));
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean mo25791c(InterfaceC22097 interfaceC22097) {
        return this.f34684e.deleteIfExists(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void checkAccess(InterfaceC22097 interfaceC22097, EnumC13183[] enumC13183Arr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.f34684e;
        Path pathM22751l = C9730.m22751l(interfaceC22097);
        AccessMode[] accessModeArr = null;
        if (enumC13183Arr != null) {
            int length = enumC13183Arr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC13183 enumC13183 = enumC13183Arr[i];
                if (enumC13183 == null) {
                    accessMode = null;
                } else if (enumC13183 == EnumC13183.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC13183 == EnumC13183.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathM22751l, accessModeArr);
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void copy(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911[] interfaceC23911Arr) throws IOException {
        this.f34684e.copy(C9730.m22751l(interfaceC22097), C9730.m22751l(interfaceC22098), AbstractC24029.m53220J(interfaceC23911Arr));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void createDirectory(InterfaceC22097 interfaceC22097, InterfaceC23437[] interfaceC23437Arr) throws IOException {
        this.f34684e.createDirectory(C9730.m22751l(interfaceC22097), AbstractC24029.m53224N(interfaceC23437Arr));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void delete(InterfaceC22097 interfaceC22097) throws IOException {
        this.f34684e.delete(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11842 mo25792e(InterfaceC22097 interfaceC22097, Set set, ExecutorService executorService, InterfaceC23437[] interfaceC23437Arr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.f34684e.newAsynchronousFileChannel(C9730.m22751l(interfaceC22097), AbstractC24029.m53252u(set), executorService, AbstractC24029.m53224N(interfaceC23437Arr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new C11842(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.f34684e;
        if (obj instanceof C12413) {
            obj = ((C12413) obj).f34684e;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FileChannel mo25793f(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437[] interfaceC23437Arr) {
        return this.f34684e.newFileChannel(C9730.m22751l(interfaceC22097), AbstractC24029.m53252u(set), AbstractC24029.m53224N(interfaceC23437Arr));
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ OutputStream mo28599g(InterfaceC22097 interfaceC22097, InterfaceC24778[] interfaceC24778Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.f34684e;
        Path pathM22751l = C9730.m22751l(interfaceC22097);
        if (interfaceC24778Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC24778Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C13754.m31339a(interfaceC24778Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathM22751l, openOptionArr);
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ InterfaceC21426 getFileAttributeView(InterfaceC22097 interfaceC22097, Class cls, EnumC16060[] enumC16060Arr) {
        FileAttributeView fileAttributeView = this.f34684e.getFileAttributeView(C9730.m22751l(interfaceC22097), AbstractC24029.m53248q(cls), AbstractC24029.m53221K(enumC16060Arr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C4857) {
            return ((C4857) fileAttributeView).f11045a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C12904) {
                return ((C12904) basicFileAttributeView).f36281a;
            }
            if (!(basicFileAttributeView instanceof DosFileAttributeView)) {
                return basicFileAttributeView instanceof PosixFileAttributeView ? new C10221((PosixFileAttributeView) basicFileAttributeView) : new C9355(basicFileAttributeView);
            }
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
            return dosFileAttributeView instanceof C24973 ? ((C24973) dosFileAttributeView).f79746a : new C16255(dosFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new C23632((UserDefinedFileAttributeView) fileAttributeView) : new C17596(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof C20280) {
            return ((C20280) fileOwnerAttributeView).f62671a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return new C8014((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? new C10221((PosixFileAttributeView) fileOwnerAttributeView) : new C6198(fileOwnerAttributeView);
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ AbstractC15193 getFileStore(InterfaceC22097 interfaceC22097) throws IOException {
        FileStore fileStore = this.f34684e.getFileStore(C9730.m22751l(interfaceC22097));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C8209 ? ((C8209) fileStore).f21780a : new C14244(fileStore);
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ AbstractC9159 getFileSystem(URI uri) {
        return C24302.m53636b(this.f34684e.getFileSystem(uri));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ InterfaceC22097 getPath(URI uri) {
        return C15764.m35828l(this.f34684e.getPath(uri));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ String getScheme() {
        return this.f34684e.getScheme();
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC22097 mo25794h(InterfaceC22097 interfaceC22097) {
        return C15764.m35828l(this.f34684e.readSymbolicLink(C9730.m22751l(interfaceC22097)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f34684e.hashCode();
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ boolean isHidden(InterfaceC22097 interfaceC22097) {
        return this.f34684e.isHidden(C9730.m22751l(interfaceC22097));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ boolean isSameFile(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        return this.f34684e.isSameFile(C9730.m22751l(interfaceC22097), C9730.m22751l(interfaceC22098));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void move(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911[] interfaceC23911Arr) throws IOException {
        this.f34684e.move(C9730.m22751l(interfaceC22097), C9730.m22751l(interfaceC22098), AbstractC24029.m53220J(interfaceC23911Arr));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ SeekableByteChannel newByteChannel(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437[] interfaceC23437Arr) {
        return this.f34684e.newByteChannel(C9730.m22751l(interfaceC22097), AbstractC24029.m53252u(set), AbstractC24029.m53224N(interfaceC23437Arr));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ AbstractC9159 newFileSystem(URI uri, Map map) {
        return C24302.m53636b(this.f34684e.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ AbstractC9159 newFileSystem(InterfaceC22097 interfaceC22097, Map map) {
        return C24302.m53636b(this.f34684e.newFileSystem(C9730.m22751l(interfaceC22097), (Map<String, ?>) map));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ InputStream newInputStream(InterfaceC22097 interfaceC22097, InterfaceC24778[] interfaceC24778Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.f34684e;
        Path pathM22751l = C9730.m22751l(interfaceC22097);
        if (interfaceC24778Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC24778Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C13754.m31339a(interfaceC24778Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathM22751l, openOptionArr);
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ Map readAttributes(InterfaceC22097 interfaceC22097, String str, EnumC16060[] enumC16060Arr) {
        return AbstractC24029.m53250s(this.f34684e.readAttributes(C9730.m22751l(interfaceC22097), str, AbstractC24029.m53221K(enumC16060Arr)));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ InterfaceC16730 readAttributes(InterfaceC22097 interfaceC22097, Class cls, EnumC16060[] enumC16060Arr) {
        return C19609.m44513a(this.f34684e.readAttributes(C9730.m22751l(interfaceC22097), AbstractC24029.m53249r(cls), AbstractC24029.m53221K(enumC16060Arr)));
    }

    @Override // p067l.AbstractC15094
    public final /* synthetic */ void setAttribute(InterfaceC22097 interfaceC22097, String str, Object obj, EnumC16060[] enumC16060Arr) throws IOException {
        this.f34684e.setAttribute(C9730.m22751l(interfaceC22097), str, AbstractC24029.m53251t(obj), AbstractC24029.m53221K(enumC16060Arr));
    }

    @Override // p067l.AbstractC15094
    public final DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter) {
        return new C13104(this.f34684e.newDirectoryStream(C9730.m22751l(interfaceC22097), new C18546(2, filter)));
    }
}
