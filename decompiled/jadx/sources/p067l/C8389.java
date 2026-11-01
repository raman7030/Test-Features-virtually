package p067l;

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
public final /* synthetic */ class C8389 extends FileSystemProvider {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f22501b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC15094 f22502a;

    public /* synthetic */ C8389(AbstractC15094 abstractC15094) {
        this.f22502a = abstractC15094;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC13183 enumC13183;
        AbstractC15094 abstractC15094 = this.f22502a;
        InterfaceC22097 interfaceC22097M35828l = C15764.m35828l(path);
        EnumC13183[] enumC13183Arr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC13183[] enumC13183Arr2 = new EnumC13183[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    enumC13183 = null;
                } else if (accessMode == AccessMode.READ) {
                    enumC13183 = EnumC13183.READ;
                } else {
                    enumC13183 = accessMode == AccessMode.WRITE ? EnumC13183.WRITE : EnumC13183.EXECUTE;
                }
                enumC13183Arr2[i] = enumC13183;
            }
            enumC13183Arr = enumC13183Arr2;
        }
        abstractC15094.checkAccess(interfaceC22097M35828l, enumC13183Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC23911[] interfaceC23911Arr;
        AbstractC15094 abstractC15094 = this.f22502a;
        InterfaceC22097 interfaceC22097M35828l = C15764.m35828l(path);
        InterfaceC22097 interfaceC22097M35828l2 = C15764.m35828l(path2);
        if (copyOptionArr == null) {
            interfaceC23911Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC23911[] interfaceC23911Arr2 = new InterfaceC23911[length];
            for (int i = 0; i < length; i++) {
                interfaceC23911Arr2[i] = C10026.m23406a(copyOptionArr[i]);
            }
            interfaceC23911Arr = interfaceC23911Arr2;
        }
        abstractC15094.copy(interfaceC22097M35828l, interfaceC22097M35828l2, interfaceC23911Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.f22502a.createDirectory(C15764.m35828l(path), AbstractC24029.m53219I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.f22502a.mo25789a(C15764.m35828l(path), C15764.m35828l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.f22502a.mo25790b(C15764.m35828l(path), C15764.m35828l(path2), AbstractC24029.m53219I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.f22502a.delete(C15764.m35828l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.f22502a.mo25791c(C15764.m35828l(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC15094 abstractC15094 = this.f22502a;
        if (obj instanceof C8389) {
            obj = ((C8389) obj).f22502a;
        }
        return abstractC15094.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC21426 fileAttributeView = this.f22502a.getFileAttributeView(C15764.m35828l(path), AbstractC24029.m53248q(cls), AbstractC24029.m53216F(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C17596) {
            return ((C17596) fileAttributeView).f52589a;
        }
        if (fileAttributeView instanceof InterfaceC18267) {
            InterfaceC18267 interfaceC18267 = (InterfaceC18267) fileAttributeView;
            if (interfaceC18267 instanceof C9355) {
                return ((C9355) interfaceC18267).f25482a;
            }
            if (!(interfaceC18267 instanceof InterfaceC22767)) {
                return interfaceC18267 instanceof C10221 ? ((C10221) interfaceC18267).f28336a : new C12904(interfaceC18267);
            }
            InterfaceC22767 interfaceC22767 = (InterfaceC22767) interfaceC18267;
            return interfaceC22767 instanceof C16255 ? ((C16255) interfaceC22767).f47815a : new C24973(interfaceC22767);
        }
        if (!(fileAttributeView instanceof InterfaceC20951)) {
            return fileAttributeView instanceof C23632 ? ((C23632) fileAttributeView).f75244a : new C4857(fileAttributeView);
        }
        InterfaceC20951 interfaceC20951 = (InterfaceC20951) fileAttributeView;
        if (interfaceC20951 instanceof C6198) {
            return ((C6198) interfaceC20951).f15613a;
        }
        if (interfaceC20951 instanceof C8014) {
            return ((C8014) interfaceC20951).f21090a;
        }
        return interfaceC20951 instanceof C10221 ? ((C10221) interfaceC20951).f28336a : new C20280(interfaceC20951);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        AbstractC15193 fileStore = this.f22502a.getFileStore(C15764.m35828l(path));
        int i = C8209.f21779b;
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C14244 ? ((C14244) fileStore).f40557a : new C8209(fileStore);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C9550.m22253b(this.f22502a.getFileSystem(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C9730.m22751l(this.f22502a.getPath(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f22502a.getScheme();
    }

    public final /* synthetic */ int hashCode() {
        return this.f22502a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.f22502a.isHidden(C15764.m35828l(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.f22502a.isSameFile(C15764.m35828l(path), C15764.m35828l(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        InterfaceC23911[] interfaceC23911Arr;
        AbstractC15094 abstractC15094 = this.f22502a;
        InterfaceC22097 interfaceC22097M35828l = C15764.m35828l(path);
        InterfaceC22097 interfaceC22097M35828l2 = C15764.m35828l(path2);
        if (copyOptionArr == null) {
            interfaceC23911Arr = null;
        } else {
            int length = copyOptionArr.length;
            InterfaceC23911[] interfaceC23911Arr2 = new InterfaceC23911[length];
            for (int i = 0; i < length; i++) {
                interfaceC23911Arr2[i] = C10026.m23406a(copyOptionArr[i]);
            }
            interfaceC23911Arr = interfaceC23911Arr2;
        }
        abstractC15094.move(interfaceC22097M35828l, interfaceC22097M35828l2, interfaceC23911Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        C11842 c11842Mo25792e = this.f22502a.mo25792e(C15764.m35828l(path), AbstractC24029.m53252u(set), executorService, AbstractC24029.m53219I(fileAttributeArr));
        int i = AbstractC7818.f20511a;
        if (c11842Mo25792e == null) {
            return null;
        }
        return c11842Mo25792e.f33037a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f22502a.newByteChannel(C15764.m35828l(path), AbstractC24029.m53252u(set), AbstractC24029.m53219I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f22502a.mo25793f(C15764.m35828l(path), AbstractC24029.m53252u(set), AbstractC24029.m53219I(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C9550.m22253b(this.f22502a.newFileSystem(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C9550.m22253b(this.f22502a.newFileSystem(C15764.m35828l(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC24778[] interfaceC24778Arr;
        AbstractC15094 abstractC15094 = this.f22502a;
        InterfaceC22097 interfaceC22097M35828l = C15764.m35828l(path);
        if (openOptionArr == null) {
            interfaceC24778Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC24778[] interfaceC24778Arr2 = new InterfaceC24778[length];
            for (int i = 0; i < length; i++) {
                interfaceC24778Arr2[i] = C5707.m12701a(openOptionArr[i]);
            }
            interfaceC24778Arr = interfaceC24778Arr2;
        }
        return abstractC15094.newInputStream(interfaceC22097M35828l, interfaceC24778Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC24778[] interfaceC24778Arr;
        AbstractC15094 abstractC15094 = this.f22502a;
        InterfaceC22097 interfaceC22097M35828l = C15764.m35828l(path);
        if (openOptionArr == null) {
            interfaceC24778Arr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC24778[] interfaceC24778Arr2 = new InterfaceC24778[length];
            for (int i = 0; i < length; i++) {
                interfaceC24778Arr2[i] = C5707.m12701a(openOptionArr[i]);
            }
            interfaceC24778Arr = interfaceC24778Arr2;
        }
        return abstractC15094.mo28599g(interfaceC22097M35828l, interfaceC24778Arr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C18938.m43029a(this.f22502a.readAttributes(C15764.m35828l(path), AbstractC24029.m53249r(cls), AbstractC24029.m53216F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC24029.m53250s(this.f22502a.readAttributes(C15764.m35828l(path), str, AbstractC24029.m53216F(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C9730.m22751l(this.f22502a.mo25794h(C15764.m35828l(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.f22502a.setAttribute(C15764.m35828l(path), str, AbstractC24029.m53251t(obj), AbstractC24029.m53216F(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C13104(this.f22502a.newDirectoryStream(C15764.m35828l(path), new C18546(2, filter)));
    }
}
