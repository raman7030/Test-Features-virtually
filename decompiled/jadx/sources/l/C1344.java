package l;

import java.io.InputStream;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.NoSuchFileException;
import java.nio.file.ProviderMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7L8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1344 extends AbstractC13389 {
    @Override // l.AbstractC13389
    public final String getScheme() {
        return "jar";
    }

    @Override // l.AbstractC13389
    public final boolean isHidden(InterfaceC20758 interfaceC20758) {
        return false;
    }

    @Override // l.AbstractC13389
    public final AbstractC7145 newFileSystem(InterfaceC20758 interfaceC20758, Map map) {
        if (!C17229.exists(interfaceC20758, new EnumC14406[0])) {
            throw new FileSystemNotFoundException("JAR file not found: " + interfaceC20758);
        }
        return new C5578(this, interfaceC20758);
    }

    @Override // l.AbstractC13389
    public final InputStream newInputStream(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        if (!(interfaceC20758 instanceof C8400)) {
            throw new ProviderMismatchException();
        }
        C8400 c8400 = (C8400) interfaceC20758;
        return c8400.getFileSystem().m15855(c8400);
    }

    @Override // l.AbstractC13389
    public final DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter) {
        if (!(interfaceC20758 instanceof C8400)) {
            throw new ProviderMismatchException();
        }
        C8400 c8400 = (C8400) interfaceC20758;
        return c8400.getFileSystem().m15856(c8400, filter);
    }

    @Override // l.AbstractC13389
    public final void checkAccess(InterfaceC20758 interfaceC20758, EnumC11379... enumC11379Arr) throws NoSuchFileException, AccessDeniedException {
        if (!(interfaceC20758 instanceof C8400)) {
            throw new ProviderMismatchException();
        }
        C8400 c8400 = (C8400) interfaceC20758;
        c8400.getFileSystem().m15857(c8400, enumC11379Arr);
    }

    @Override // l.AbstractC13389
    public final InterfaceC15111 readAttributes(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        if (!(interfaceC20758 instanceof C8400)) {
            throw new ProviderMismatchException();
        }
        C8400 c8400 = (C8400) interfaceC20758;
        C5578 fileSystem = c8400.getFileSystem();
        if (cls != InterfaceC15111.class) {
            fileSystem.getClass();
            throw new UnsupportedOperationException("Attribute type not supported: " + cls);
        }
        return new C2756(fileSystem.m15858(c8400));
    }

    @Override // l.AbstractC13389
    public final Map readAttributes(InterfaceC20758 interfaceC20758, String str, EnumC14406... enumC14406Arr) throws NoSuchFileException {
        if (!(interfaceC20758 instanceof C8400)) {
            throw new ProviderMismatchException();
        }
        C8400 c8400 = (C8400) interfaceC20758;
        C3545 c3545M15858 = c8400.getFileSystem().m15858(c8400);
        HashMap map = new HashMap();
        C2756 c2756 = new C2756(c3545M15858);
        if (!str.equals("*") && !str.equals("basic:*")) {
            return map;
        }
        map.put("size", Long.valueOf(c2756.size()));
        map.put("isDirectory", Boolean.valueOf(c2756.isDirectory()));
        map.put("isRegularFile", Boolean.valueOf(c2756.isRegularFile()));
        map.put("lastModifiedTime", c2756.lastModifiedTime());
        map.put("creationTime", c2756.creationTime());
        map.put("lastAccessTime", c2756.lastAccessTime());
        return map;
    }

    @Override // l.AbstractC13389
    public final boolean isSameFile(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        return interfaceC20758.equals(interfaceC20759);
    }

    @Override // l.AbstractC13389
    public final AbstractC7145 newFileSystem(URI uri, Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final AbstractC7145 getFileSystem(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final InterfaceC20758 getPath(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final SeekableByteChannel newByteChannel(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void createDirectory(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void delete(InterfaceC20758 interfaceC20758) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void copy(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667... interfaceC22667Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void move(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667... interfaceC22667Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final AbstractC13494 getFileStore(InterfaceC20758 interfaceC20758) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final InterfaceC20052 getFileAttributeView(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void setAttribute(InterfaceC20758 interfaceC20758, String str, Object obj, EnumC14406... enumC14406Arr) {
        throw new UnsupportedOperationException();
    }
}
