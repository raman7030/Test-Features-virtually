package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۛ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6334 extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC13389 a;

    public /* synthetic */ C6334(AbstractC13389 abstractC13389) {
        this.a = abstractC13389;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC11379 enumC11379;
        AbstractC13389 abstractC13389 = this.a;
        InterfaceC20758 interfaceC20758L = C14094.l(path);
        EnumC11379[] enumC11379Arr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC11379[] enumC11379Arr2 = new EnumC11379[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    enumC11379 = null;
                } else if (accessMode == AccessMode.READ) {
                    enumC11379 = EnumC11379.READ;
                } else {
                    enumC11379 = accessMode == AccessMode.WRITE ? EnumC11379.WRITE : EnumC11379.EXECUTE;
                }
                enumC11379Arr2[i] = enumC11379;
            }
            enumC11379Arr = enumC11379Arr2;
        }
        abstractC13389.checkAccess(interfaceC20758L, enumC11379Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC22667[] interfaceC22667Arr;
        AbstractC13389 abstractC13389 = this.a;
        InterfaceC20758 interfaceC20758L = C14094.l(path);
        InterfaceC20758 interfaceC20758L2 = C14094.l(path2);
        if (copyOptionArr == null) {
            interfaceC22667Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC22667[] interfaceC22667Arr2 = new InterfaceC22667[length];
            for (int i = 0; i < length; i++) {
                interfaceC22667Arr2[i] = C8057.a(copyOptionArr[i]);
            }
            interfaceC22667Arr = interfaceC22667Arr2;
        }
        abstractC13389.copy(interfaceC20758L, interfaceC20758L2, interfaceC22667Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.createDirectory(C14094.l(path), AbstractC22791.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.a(C14094.l(path), C14094.l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.b(C14094.l(path), C14094.l(path2), AbstractC22791.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.delete(C14094.l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.c(C14094.l(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC13389 abstractC13389 = this.a;
        if (obj instanceof C6334) {
            obj = ((C6334) obj).a;
        }
        return abstractC13389.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC20052 fileAttributeView = this.a.getFileAttributeView(C14094.l(path), AbstractC22791.q(cls), AbstractC22791.F(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C16022) {
            return ((C16022) fileAttributeView).a;
        }
        if (fileAttributeView instanceof InterfaceC16728) {
            InterfaceC16728 interfaceC16728 = (InterfaceC16728) fileAttributeView;
            if (interfaceC16728 instanceof C7351) {
                return ((C7351) interfaceC16728).a;
            }
            if (!(interfaceC16728 instanceof InterfaceC21463)) {
                return interfaceC16728 instanceof C8262 ? ((C8262) interfaceC16728).a : new C11085(interfaceC16728);
            }
            InterfaceC21463 interfaceC21463 = (InterfaceC21463) interfaceC16728;
            return interfaceC21463 instanceof C14611 ? ((C14611) interfaceC21463).a : new C23784(interfaceC21463);
        }
        if (!(fileAttributeView instanceof InterfaceC19552)) {
            return fileAttributeView instanceof C22373 ? ((C22373) fileAttributeView).a : new C2618(fileAttributeView);
        }
        InterfaceC19552 interfaceC19552 = (InterfaceC19552) fileAttributeView;
        if (interfaceC19552 instanceof C4029) {
            return ((C4029) interfaceC19552).a;
        }
        if (interfaceC19552 instanceof C5940) {
            return ((C5940) interfaceC19552).a;
        }
        return interfaceC19552 instanceof C8262 ? ((C8262) interfaceC19552).a : new C18846(interfaceC19552);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        AbstractC13494 fileStore = this.a.getFileStore(C14094.l(path));
        int i = C6145.b;
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C12495 ? ((C12495) fileStore).a : new C6145(fileStore);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C7556.b(this.a.getFileSystem(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C7745.l(this.a.getPath(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.getScheme();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.isHidden(C14094.l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.isSameFile(C14094.l(path), C14094.l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC22667[] interfaceC22667Arr;
        AbstractC13389 abstractC13389 = this.a;
        InterfaceC20758 interfaceC20758L = C14094.l(path);
        InterfaceC20758 interfaceC20758L2 = C14094.l(path2);
        if (copyOptionArr == null) {
            interfaceC22667Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC22667[] interfaceC22667Arr2 = new InterfaceC22667[length];
            for (int i = 0; i < length; i++) {
                interfaceC22667Arr2[i] = C8057.a(copyOptionArr[i]);
            }
            interfaceC22667Arr = interfaceC22667Arr2;
        }
        abstractC13389.move(interfaceC20758L, interfaceC20758L2, interfaceC22667Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        C9968 c9968E = this.a.e(C14094.l(path), AbstractC22791.u(set), executorService, AbstractC22791.I(fileAttributeArr));
        int i = AbstractC5734.a;
        if (c9968E == null) {
            return null;
        }
        return c9968E.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.newByteChannel(C14094.l(path), AbstractC22791.u(set), AbstractC22791.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.f(C14094.l(path), AbstractC22791.u(set), AbstractC22791.I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C7556.b(this.a.newFileSystem(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C7556.b(this.a.newFileSystem(C14094.l(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC23579[] interfaceC23579Arr;
        AbstractC13389 abstractC13389 = this.a;
        InterfaceC20758 interfaceC20758L = C14094.l(path);
        if (openOptionArr == null) {
            interfaceC23579Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC23579[] interfaceC23579Arr2 = new InterfaceC23579[length];
            for (int i = 0; i < length; i++) {
                interfaceC23579Arr2[i] = C3512.a(openOptionArr[i]);
            }
            interfaceC23579Arr = interfaceC23579Arr2;
        }
        return abstractC13389.newInputStream(interfaceC20758L, interfaceC23579Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC23579[] interfaceC23579Arr;
        AbstractC13389 abstractC13389 = this.a;
        InterfaceC20758 interfaceC20758L = C14094.l(path);
        if (openOptionArr == null) {
            interfaceC23579Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC23579[] interfaceC23579Arr2 = new InterfaceC23579[length];
            for (int i = 0; i < length; i++) {
                interfaceC23579Arr2[i] = C3512.a(openOptionArr[i]);
            }
            interfaceC23579Arr = interfaceC23579Arr2;
        }
        return abstractC13389.g(interfaceC20758L, interfaceC23579Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C17434.a(this.a.readAttributes(C14094.l(path), AbstractC22791.r(cls), AbstractC22791.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC22791.s(this.a.readAttributes(C14094.l(path), str, AbstractC22791.F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C7745.l(this.a.h(C14094.l(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.setAttribute(C14094.l(path), str, AbstractC22791.t(obj), AbstractC22791.F(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C11295(this.a.newDirectoryStream(C14094.l(path), new C17022(2, filter)));
    }
}
