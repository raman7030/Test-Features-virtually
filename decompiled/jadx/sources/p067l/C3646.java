package p067l;

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
public final class C3646 extends AbstractC15094 {
    @Override // p067l.AbstractC15094
    public final String getScheme() {
        return "jar";
    }

    @Override // p067l.AbstractC15094
    public final boolean isHidden(InterfaceC22097 interfaceC22097) {
        return false;
    }

    @Override // p067l.AbstractC15094
    public final AbstractC9159 newFileSystem(InterfaceC22097 interfaceC22097, Map map) {
        if (!C18743.exists(interfaceC22097, new EnumC16060[0])) {
            throw new FileSystemNotFoundException("JAR file not found: " + interfaceC22097);
        }
        return new C7670(this, interfaceC22097);
    }

    @Override // p067l.AbstractC15094
    public final InputStream newInputStream(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        if (!(interfaceC22097 instanceof C10352)) {
            throw new ProviderMismatchException();
        }
        C10352 c10352 = (C10352) interfaceC22097;
        return c10352.getFileSystem().m17770(c10352);
    }

    @Override // p067l.AbstractC15094
    public final DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter) {
        if (!(interfaceC22097 instanceof C10352)) {
            throw new ProviderMismatchException();
        }
        C10352 c10352 = (C10352) interfaceC22097;
        return c10352.getFileSystem().m17771(c10352, filter);
    }

    @Override // p067l.AbstractC15094
    public final void checkAccess(InterfaceC22097 interfaceC22097, EnumC13183... enumC13183Arr) throws NoSuchFileException, AccessDeniedException {
        if (!(interfaceC22097 instanceof C10352)) {
            throw new ProviderMismatchException();
        }
        C10352 c10352 = (C10352) interfaceC22097;
        c10352.getFileSystem().m17772(c10352, enumC13183Arr);
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC16730 readAttributes(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        if (!(interfaceC22097 instanceof C10352)) {
            throw new ProviderMismatchException();
        }
        C10352 c10352 = (C10352) interfaceC22097;
        C7670 fileSystem = c10352.getFileSystem();
        if (cls != InterfaceC16730.class) {
            fileSystem.getClass();
            throw new UnsupportedOperationException("Attribute type not supported: " + cls);
        }
        return new C4988(fileSystem.m17773(c10352));
    }

    @Override // p067l.AbstractC15094
    public final Map readAttributes(InterfaceC22097 interfaceC22097, String str, EnumC16060... enumC16060Arr) throws NoSuchFileException {
        if (!(interfaceC22097 instanceof C10352)) {
            throw new ProviderMismatchException();
        }
        C10352 c10352 = (C10352) interfaceC22097;
        C5738 c5738M17773 = c10352.getFileSystem().m17773(c10352);
        HashMap map = new HashMap();
        C4988 c4988 = new C4988(c5738M17773);
        if (!str.equals("*") && !str.equals("basic:*")) {
            return map;
        }
        map.put("size", Long.valueOf(c4988.size()));
        map.put("isDirectory", Boolean.valueOf(c4988.isDirectory()));
        map.put("isRegularFile", Boolean.valueOf(c4988.isRegularFile()));
        map.put("lastModifiedTime", c4988.lastModifiedTime());
        map.put("creationTime", c4988.creationTime());
        map.put("lastAccessTime", c4988.lastAccessTime());
        return map;
    }

    @Override // p067l.AbstractC15094
    public final boolean isSameFile(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        return interfaceC22097.equals(interfaceC22098);
    }

    @Override // p067l.AbstractC15094
    public final AbstractC9159 newFileSystem(URI uri, Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final AbstractC9159 getFileSystem(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC22097 getPath(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final SeekableByteChannel newByteChannel(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final void createDirectory(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final void delete(InterfaceC22097 interfaceC22097) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final void copy(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final void move(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final AbstractC15193 getFileStore(InterfaceC22097 interfaceC22097) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC21426 getFileAttributeView(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    public final void setAttribute(InterfaceC22097 interfaceC22097, String str, Object obj, EnumC16060... enumC16060Arr) {
        throw new UnsupportedOperationException();
    }
}
