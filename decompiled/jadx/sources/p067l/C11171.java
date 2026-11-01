package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۢ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11171 extends AbstractC15094 {

    /* JADX INFO: renamed from: e */
    public final String f31009e;

    /* JADX INFO: renamed from: f */
    public final String f31010f = "/";

    /* JADX INFO: renamed from: g */
    public volatile C15863 f31011g;

    @Override // p067l.AbstractC15094
    public final String getScheme() {
        return "file";
    }

    public C11171(String str) {
        this.f31009e = str;
    }

    @Override // p067l.AbstractC15094
    public final AbstractC9159 newFileSystem(URI uri, Map map) {
        m25787i(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // p067l.AbstractC15094
    public final AbstractC9159 getFileSystem(URI uri) {
        C15863 c15863;
        m25787i(uri);
        C15863 c15864 = this.f31011g;
        if (c15864 != null) {
            return c15864;
        }
        synchronized (this) {
            c15863 = this.f31011g;
            if (c15863 == null) {
                c15863 = new C15863(this, this.f31009e, this.f31010f);
                this.f31011g = c15863;
            }
        }
        return c15863;
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC22097 getPath(URI uri) {
        byte bM9399a;
        C15863 c15863 = this.f31011g;
        String str = this.f31009e;
        String str2 = this.f31010f;
        char[] cArr = AbstractC4465.f10033c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bM9399a = (byte) ((AbstractC4465.m9399a(rawPath.charAt(i3)) << 4) | AbstractC4465.m9399a(rawPath.charAt(i4)));
                if (bM9399a == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bM9399a = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bM9399a;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new C17204(c15863, new String(bArrCopyOf, AbstractC5806.f14267a), str, str2);
    }

    @Override // p067l.AbstractC15094
    public final DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter) {
        filter.getClass();
        C8488 c8488 = new C8488();
        c8488.f22792a = new C21900(this, interfaceC22097, filter);
        return c8488;
    }

    @Override // p067l.AbstractC15094
    public final void createDirectory(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr) throws NoSuchFileException, FileAlreadyExistsException {
        if (interfaceC22097.getParent() != null && !C18743.exists(interfaceC22097.getParent(), new EnumC16060[0])) {
            throw new NoSuchFileException(interfaceC22097.toString());
        }
        if (!interfaceC22097.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(interfaceC22097.toString());
        }
    }

    @Override // p067l.AbstractC15094
    public final void delete(InterfaceC22097 interfaceC22097) throws NoSuchFileException {
        try {
            checkAccess(interfaceC22097, new EnumC13183[0]);
            mo25791c(interfaceC22097);
        } catch (IOException unused) {
            throw new NoSuchFileException(interfaceC22097.toString());
        }
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: c */
    public final boolean mo25791c(InterfaceC22097 interfaceC22097) {
        return interfaceC22097.toFile().delete();
    }

    @Override // p067l.AbstractC15094
    public final SeekableByteChannel newByteChannel(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437... interfaceC23437Arr) {
        return mo25793f(interfaceC22097, set, interfaceC23437Arr);
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: f */
    public final FileChannel mo25793f(InterfaceC22097 interfaceC22097, Set set, InterfaceC23437... interfaceC23437Arr) {
        if (interfaceC22097.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + interfaceC22097);
        }
        return AbstractC24029.m53230T(interfaceC22097, set);
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: e */
    public final C11842 mo25792e(InterfaceC22097 interfaceC22097, Set set, ExecutorService executorService, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: a */
    public final void mo25789a(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: b */
    public final void mo25790b(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23437... interfaceC23437Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15094
    /* JADX INFO: renamed from: h */
    public final InterfaceC22097 mo25794h(InterfaceC22097 interfaceC22097) {
        return new C17204(this.f31011g, interfaceC22097.toFile().getCanonicalPath(), this.f31009e, this.f31010f);
    }

    @Override // p067l.AbstractC15094
    public final void copy(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr) throws IOException {
        if (!m25788j(interfaceC23911Arr, EnumC4662.REPLACE_EXISTING) && C18743.exists(interfaceC22098, new EnumC16060[0])) {
            throw new FileAlreadyExistsException(interfaceC22098.toString());
        }
        if (m25788j(interfaceC23911Arr, EnumC4662.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(interfaceC22097.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(interfaceC22098.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i >= 0) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // p067l.AbstractC15094
    public final void move(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr) throws FileAlreadyExistsException {
        if (!m25788j(interfaceC23911Arr, EnumC4662.REPLACE_EXISTING) && C18743.exists(interfaceC22098, new EnumC16060[0])) {
            throw new FileAlreadyExistsException(interfaceC22098.toString());
        }
        if (m25788j(interfaceC23911Arr, EnumC4662.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        interfaceC22097.toFile().renameTo(interfaceC22098.toFile());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m25788j(InterfaceC23911[] interfaceC23911Arr, EnumC4662 enumC4662) {
        for (InterfaceC23911 interfaceC23911 : interfaceC23911Arr) {
            if (interfaceC23911 == enumC4662) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC15094
    public final boolean isSameFile(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) throws IOException {
        if (interfaceC22097.equals(interfaceC22098)) {
            return true;
        }
        checkAccess(interfaceC22097, new EnumC13183[0]);
        checkAccess(interfaceC22098, new EnumC13183[0]);
        return interfaceC22097.toFile().equals(interfaceC22098.toFile());
    }

    @Override // p067l.AbstractC15094
    public final boolean isHidden(InterfaceC22097 interfaceC22097) {
        return interfaceC22097.toFile().isHidden();
    }

    @Override // p067l.AbstractC15094
    public final AbstractC15193 getFileStore(InterfaceC22097 interfaceC22097) {
        throw new SecurityException("getFileStore");
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC21426 getFileAttributeView(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        cls.getClass();
        if (cls == InterfaceC18267.class) {
            return (InterfaceC21426) cls.cast(new C9277(interfaceC22097));
        }
        return null;
    }

    @Override // p067l.AbstractC15094
    public final void checkAccess(InterfaceC22097 interfaceC22097, EnumC13183... enumC13183Arr) throws IOException {
        boolean zCanRead;
        File file = interfaceC22097.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(interfaceC22097.toString());
        }
        boolean z = true;
        for (EnumC13183 enumC13183 : enumC13183Arr) {
            int i = AbstractC24581.f77821a[enumC13183.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i != 2) {
                if (i == 3) {
                    zCanRead = file.canExecute();
                }
            } else {
                zCanRead = file.canWrite();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", interfaceC22097));
        }
    }

    @Override // p067l.AbstractC15094
    public final InterfaceC16730 readAttributes(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        if (cls != InterfaceC16730.class) {
            throw new UnsupportedOperationException();
        }
        return (InterfaceC16730) cls.cast(((InterfaceC18267) getFileAttributeView(interfaceC22097, InterfaceC18267.class, enumC16060Arr)).readAttributes());
    }

    @Override // p067l.AbstractC15094
    public final Map readAttributes(InterfaceC22097 interfaceC22097, String str, EnumC16060... enumC16060Arr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        C9277 c9277 = new C9277(interfaceC22097);
        Set set = C9277.f25229b;
        C15311 c15311 = new C15311();
        c15311.f43698a = new HashSet();
        c15311.f43699b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                c15311.f43700c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) c15311.f43698a).add(str2);
            }
        }
        InterfaceC16730 attributes = c9277.readAttributes();
        if (c15311.m34847b("size")) {
            c15311.m34846a(Long.valueOf(((C3794) attributes).size()), "size");
        }
        if (c15311.m34847b("creationTime")) {
            c15311.m34846a(((C3794) attributes).creationTime(), "creationTime");
        }
        if (c15311.m34847b("lastAccessTime")) {
            c15311.m34846a(((C3794) attributes).lastAccessTime(), "lastAccessTime");
        }
        if (c15311.m34847b("lastModifiedTime")) {
            c15311.m34846a(((C3794) attributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (c15311.m34847b("fileKey")) {
            c15311.m34846a(((C3794) attributes).fileKey(), "fileKey");
        }
        if (c15311.m34847b("isDirectory")) {
            c15311.m34846a(Boolean.valueOf(((C3794) attributes).isDirectory()), "isDirectory");
        }
        if (c15311.m34847b("isRegularFile")) {
            c15311.m34846a(Boolean.valueOf(((C3794) attributes).isRegularFile()), "isRegularFile");
        }
        if (c15311.m34847b("isSymbolicLink")) {
            c15311.m34846a(Boolean.valueOf(((C3794) attributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (c15311.m34847b("isOther")) {
            c15311.m34846a(Boolean.valueOf(((C3794) attributes).isOther()), "isOther");
        }
        return Collections.unmodifiableMap(c15311.f43699b);
    }

    @Override // p067l.AbstractC15094
    public final void setAttribute(InterfaceC22097 interfaceC22097, String str, Object obj, EnumC16060... enumC16060Arr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        C9277 c9277 = new C9277(interfaceC22097);
        if (str.equals("lastModifiedTime")) {
            c9277.mo21481a((C6673) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c9277.mo21481a(null, (C6673) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m25787i(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }
}
