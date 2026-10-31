package l;

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
public final /* synthetic */ class C10568 extends AbstractC13389 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ FileSystemProvider e;

    public /* synthetic */ C10568(FileSystemProvider fileSystemProvider) {
        this.e = fileSystemProvider;
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void a(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) throws IOException {
        this.e.createLink(C7745.l(interfaceC20758), C7745.l(interfaceC20759));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void b(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22168[] interfaceC22168Arr) throws IOException {
        this.e.createSymbolicLink(C7745.l(interfaceC20758), C7745.l(interfaceC20759), AbstractC22791.N(interfaceC22168Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ boolean c(InterfaceC20758 interfaceC20758) {
        return this.e.deleteIfExists(C7745.l(interfaceC20758));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void checkAccess(InterfaceC20758 interfaceC20758, EnumC11379[] enumC11379Arr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C7745.l(interfaceC20758);
        AccessMode[] accessModeArr = null;
        if (enumC11379Arr != null) {
            int length = enumC11379Arr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC11379 enumC11379 = enumC11379Arr[i];
                if (enumC11379 == null) {
                    accessMode = null;
                } else if (enumC11379 == EnumC11379.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC11379 == EnumC11379.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathL, accessModeArr);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void copy(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667[] interfaceC22667Arr) throws IOException {
        this.e.copy(C7745.l(interfaceC20758), C7745.l(interfaceC20759), AbstractC22791.J(interfaceC22667Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void createDirectory(InterfaceC20758 interfaceC20758, InterfaceC22168[] interfaceC22168Arr) throws IOException {
        this.e.createDirectory(C7745.l(interfaceC20758), AbstractC22791.N(interfaceC22168Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void delete(InterfaceC20758 interfaceC20758) throws IOException {
        this.e.delete(C7745.l(interfaceC20758));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ C9968 e(InterfaceC20758 interfaceC20758, Set set, ExecutorService executorService, InterfaceC22168[] interfaceC22168Arr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.e.newAsynchronousFileChannel(C7745.l(interfaceC20758), AbstractC22791.u(set), executorService, AbstractC22791.N(interfaceC22168Arr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new C9968(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.e;
        if (obj instanceof C10568) {
            obj = ((C10568) obj).e;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ FileChannel f(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168[] interfaceC22168Arr) {
        return this.e.newFileChannel(C7745.l(interfaceC20758), AbstractC22791.u(set), AbstractC22791.N(interfaceC22168Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ OutputStream g(InterfaceC20758 interfaceC20758, InterfaceC23579[] interfaceC23579Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C7745.l(interfaceC20758);
        if (interfaceC23579Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC23579Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C11979.a(interfaceC23579Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathL, openOptionArr);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ InterfaceC20052 getFileAttributeView(InterfaceC20758 interfaceC20758, Class cls, EnumC14406[] enumC14406Arr) {
        FileAttributeView fileAttributeView = this.e.getFileAttributeView(C7745.l(interfaceC20758), AbstractC22791.q(cls), AbstractC22791.K(enumC14406Arr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C2618) {
            return ((C2618) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C11085) {
                return ((C11085) basicFileAttributeView).a;
            }
            if (!(basicFileAttributeView instanceof DosFileAttributeView)) {
                return basicFileAttributeView instanceof PosixFileAttributeView ? new C8262((PosixFileAttributeView) basicFileAttributeView) : new C7351(basicFileAttributeView);
            }
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
            return dosFileAttributeView instanceof C23784 ? ((C23784) dosFileAttributeView).a : new C14611(dosFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new C22373((UserDefinedFileAttributeView) fileAttributeView) : new C16022(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof C18846) {
            return ((C18846) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return new C5940((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? new C8262((PosixFileAttributeView) fileOwnerAttributeView) : new C4029(fileOwnerAttributeView);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ AbstractC13494 getFileStore(InterfaceC20758 interfaceC20758) throws IOException {
        FileStore fileStore = this.e.getFileStore(C7745.l(interfaceC20758));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C6145 ? ((C6145) fileStore).a : new C12495(fileStore);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ AbstractC7145 getFileSystem(URI uri) {
        return C23078.b(this.e.getFileSystem(uri));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ InterfaceC20758 getPath(URI uri) {
        return C14094.l(this.e.getPath(uri));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ String getScheme() {
        return this.e.getScheme();
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ InterfaceC20758 h(InterfaceC20758 interfaceC20758) {
        return C14094.l(this.e.readSymbolicLink(C7745.l(interfaceC20758)));
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ boolean isHidden(InterfaceC20758 interfaceC20758) {
        return this.e.isHidden(C7745.l(interfaceC20758));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ boolean isSameFile(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        return this.e.isSameFile(C7745.l(interfaceC20758), C7745.l(interfaceC20759));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void move(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667[] interfaceC22667Arr) throws IOException {
        this.e.move(C7745.l(interfaceC20758), C7745.l(interfaceC20759), AbstractC22791.J(interfaceC22667Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ SeekableByteChannel newByteChannel(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168[] interfaceC22168Arr) {
        return this.e.newByteChannel(C7745.l(interfaceC20758), AbstractC22791.u(set), AbstractC22791.N(interfaceC22168Arr));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ AbstractC7145 newFileSystem(URI uri, Map map) {
        return C23078.b(this.e.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ AbstractC7145 newFileSystem(InterfaceC20758 interfaceC20758, Map map) {
        return C23078.b(this.e.newFileSystem(C7745.l(interfaceC20758), (Map<String, ?>) map));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ InputStream newInputStream(InterfaceC20758 interfaceC20758, InterfaceC23579[] interfaceC23579Arr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.e;
        Path pathL = C7745.l(interfaceC20758);
        if (interfaceC23579Arr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC23579Arr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C11979.a(interfaceC23579Arr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathL, openOptionArr);
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ Map readAttributes(InterfaceC20758 interfaceC20758, String str, EnumC14406[] enumC14406Arr) {
        return AbstractC22791.s(this.e.readAttributes(C7745.l(interfaceC20758), str, AbstractC22791.K(enumC14406Arr)));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ InterfaceC15111 readAttributes(InterfaceC20758 interfaceC20758, Class cls, EnumC14406[] enumC14406Arr) {
        return C18140.a(this.e.readAttributes(C7745.l(interfaceC20758), AbstractC22791.r(cls), AbstractC22791.K(enumC14406Arr)));
    }

    @Override // l.AbstractC13389
    public final /* synthetic */ void setAttribute(InterfaceC20758 interfaceC20758, String str, Object obj, EnumC14406[] enumC14406Arr) throws IOException {
        this.e.setAttribute(C7745.l(interfaceC20758), str, AbstractC22791.t(obj), AbstractC22791.K(enumC14406Arr));
    }

    @Override // l.AbstractC13389
    public final DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter) {
        return new C11295(this.e.newDirectoryStream(C7745.l(interfaceC20758), new C17022(2, filter)));
    }
}
