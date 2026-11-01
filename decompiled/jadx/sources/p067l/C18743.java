package p067l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18743 {

    /* JADX INFO: renamed from: a */
    public static final Set f56028a = AbstractC24029.m53214D(new Object[]{EnumC6003.CREATE_NEW, EnumC6003.WRITE});

    /* JADX INFO: renamed from: b */
    public static AbstractC15094 m42775b(InterfaceC22097 interfaceC22097) {
        return interfaceC22097.getFileSystem().provider();
    }

    public static InputStream newInputStream(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        return m42775b(interfaceC22097).newInputStream(interfaceC22097, interfaceC24778Arr);
    }

    public static OutputStream newOutputStream(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        return m42775b(interfaceC22097).mo28599g(interfaceC22097, interfaceC24778Arr);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097) {
        return m42775b(interfaceC22097).newDirectoryStream(interfaceC22097, C21801.f68619a);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, String str) {
        if (str.equals("*")) {
            return newDirectoryStream(interfaceC22097);
        }
        AbstractC9159 fileSystem = interfaceC22097.getFileSystem();
        return fileSystem.provider().newDirectoryStream(interfaceC22097, new C18546(1, fileSystem.getPathMatcher("glob:".concat(str))));
    }

    public static DirectoryStream newDirectoryStream(InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter) {
        return m42775b(interfaceC22097).newDirectoryStream(interfaceC22097, filter);
    }

    public static InterfaceC22097 createFile(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr) {
        m42775b(interfaceC22097).newByteChannel(interfaceC22097, f56028a, interfaceC23437Arr).close();
        return interfaceC22097;
    }

    public static InterfaceC22097 createDirectory(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr) {
        m42775b(interfaceC22097).createDirectory(interfaceC22097, interfaceC23437Arr);
        return interfaceC22097;
    }

    public static InterfaceC22097 createDirectories(InterfaceC22097 interfaceC22097, InterfaceC23437... interfaceC23437Arr) {
        try {
            try {
                createDirectory(interfaceC22097, interfaceC23437Arr);
            } catch (IOException unused) {
                try {
                    interfaceC22097 = interfaceC22097.toAbsolutePath();
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                }
                InterfaceC22097 parent = interfaceC22097.getParent();
                while (parent != null) {
                    try {
                        parent.getFileSystem().provider().checkAccess(parent, new EnumC13183[0]);
                        break;
                    } catch (NoSuchFileException unused2) {
                        parent = parent.getParent();
                    }
                }
                if (parent == null) {
                    if (e == null) {
                        throw new FileSystemException(interfaceC22097.toString(), null, "Unable to determine if root directory exists");
                    }
                    throw e;
                }
                Iterator it = parent.relativize(interfaceC22097).iterator();
                while (it.hasNext()) {
                    parent = parent.resolve((InterfaceC22097) it.next());
                    try {
                        createDirectory(parent, interfaceC23437Arr);
                    } catch (FileAlreadyExistsException e2) {
                        if (!isDirectory(parent, EnumC16060.NOFOLLOW_LINKS)) {
                            throw e2;
                        }
                    }
                }
                return interfaceC22097;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                if (!isDirectory(interfaceC22097, EnumC16060.NOFOLLOW_LINKS)) {
                    throw e3;
                }
            } catch (FileAlreadyExistsException e4) {
                throw e4;
            }
        }
        return interfaceC22097;
    }

    public static InterfaceC22097 createTempFile(InterfaceC22097 interfaceC22097, String str, String str2, InterfaceC23437... interfaceC23437Arr) {
        InterfaceC22097 interfaceC22098 = (InterfaceC22097) C12826.requireNonNull(interfaceC22097);
        InterfaceC22097 interfaceC22099 = AbstractC4366.f9815a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = ".tmp";
        }
        if (interfaceC22098 == null) {
            interfaceC22098 = interfaceC22099;
        }
        if (AbstractC4366.f9816b && interfaceC22098.getFileSystem() == C3991.getDefault()) {
            if (interfaceC23437Arr.length != 0) {
                int i = 0;
                while (true) {
                    if (i < interfaceC23437Arr.length) {
                        if (interfaceC23437Arr[i].name().equals("posix:permissions")) {
                            break;
                        }
                        i++;
                    } else {
                        int length = interfaceC23437Arr.length;
                        InterfaceC23437[] interfaceC23437Arr2 = new InterfaceC23437[length + 1];
                        System.arraycopy(interfaceC23437Arr, 0, interfaceC23437Arr2, 0, interfaceC23437Arr.length);
                        interfaceC23437Arr2[length] = AbstractC15584.f44520a;
                        interfaceC23437Arr = interfaceC23437Arr2;
                        break;
                    }
                }
            } else {
                interfaceC23437Arr = new InterfaceC23437[]{AbstractC15584.f44520a};
            }
        }
        SecurityManager securityManager = System.getSecurityManager();
        while (true) {
            try {
                try {
                    return createFile(AbstractC4366.m9099a(str, str2, interfaceC22098), interfaceC23437Arr);
                } catch (SecurityException e) {
                    if (interfaceC22098 == interfaceC22099 && securityManager != null) {
                        throw new SecurityException("Unable to create temporary file or directory");
                    }
                    throw e;
                } catch (FileAlreadyExistsException unused) {
                }
            } catch (InvalidPathException e2) {
                if (securityManager != null) {
                    throw new IllegalArgumentException("Invalid prefix or suffix");
                }
                throw e2;
            }
        }
    }

    public static void delete(InterfaceC22097 interfaceC22097) {
        m42775b(interfaceC22097).delete(interfaceC22097);
    }

    public static boolean deleteIfExists(InterfaceC22097 interfaceC22097) {
        return m42775b(interfaceC22097).mo25791c(interfaceC22097);
    }

    public static InterfaceC22097 move(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, InterfaceC23911... interfaceC23911Arr) throws IOException {
        AbstractC15094 abstractC15094M42775b = m42775b(interfaceC22097);
        if (!m42775b(interfaceC22098).equals(abstractC15094M42775b)) {
            int length = interfaceC23911Arr.length;
            int i = length + 2;
            InterfaceC23911[] interfaceC23911Arr2 = new InterfaceC23911[i];
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC23911 interfaceC23911 = interfaceC23911Arr[i2];
                if (interfaceC23911 == EnumC4662.ATOMIC_MOVE) {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
                interfaceC23911Arr2[i2] = interfaceC23911;
            }
            interfaceC23911Arr2[length] = EnumC16060.NOFOLLOW_LINKS;
            interfaceC23911Arr2[length + 1] = EnumC4662.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                InterfaceC23911 interfaceC23912 = interfaceC23911Arr2[i3];
                if (interfaceC23912 == EnumC4662.REPLACE_EXISTING) {
                    z2 = true;
                } else if (interfaceC23912 == EnumC16060.NOFOLLOW_LINKS) {
                    z = false;
                } else {
                    if (interfaceC23912 != EnumC4662.COPY_ATTRIBUTES) {
                        interfaceC23912.getClass();
                        throw new UnsupportedOperationException("'" + interfaceC23912 + "' is not a recognized copy option");
                    }
                    z3 = true;
                }
            }
            InterfaceC16730 attributes = readAttributes(interfaceC22097, InterfaceC16730.class, z ? new EnumC16060[0] : new EnumC16060[]{EnumC16060.NOFOLLOW_LINKS});
            if (attributes.isSymbolicLink()) {
                throw new IOException("Copying of symbolic links not supported");
            }
            if (z2) {
                deleteIfExists(interfaceC22098);
            } else if (exists(interfaceC22098, new EnumC16060[0])) {
                throw new FileAlreadyExistsException(interfaceC22098.toString());
            }
            if (attributes.isDirectory()) {
                createDirectory(interfaceC22098, new InterfaceC23437[0]);
            } else {
                InputStream inputStreamNewInputStream = newInputStream(interfaceC22097, new InterfaceC24778[0]);
                try {
                    m42774a(inputStreamNewInputStream, interfaceC22098, new InterfaceC23911[0]);
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamNewInputStream != null) {
                        try {
                            inputStreamNewInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (z3) {
                try {
                    ((InterfaceC18267) getFileAttributeView(interfaceC22098, InterfaceC18267.class, new EnumC16060[0])).mo21481a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
                } catch (Throwable th3) {
                    try {
                        delete(interfaceC22098);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            delete(interfaceC22097);
            return interfaceC22098;
        }
        abstractC15094M42775b.move(interfaceC22097, interfaceC22098, interfaceC23911Arr);
        return interfaceC22098;
    }

    public static InterfaceC22097 readSymbolicLink(InterfaceC22097 interfaceC22097) {
        return m42775b(interfaceC22097).mo25794h(interfaceC22097);
    }

    public static AbstractC15193 getFileStore(InterfaceC22097 interfaceC22097) {
        return m42775b(interfaceC22097).getFileStore(interfaceC22097);
    }

    public static boolean isSameFile(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        return m42775b(interfaceC22097).isSameFile(interfaceC22097, interfaceC22098);
    }

    public static InterfaceC21426 getFileAttributeView(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        return m42775b(interfaceC22097).getFileAttributeView(interfaceC22097, cls, enumC16060Arr);
    }

    public static InterfaceC16730 readAttributes(InterfaceC22097 interfaceC22097, Class cls, EnumC16060... enumC16060Arr) {
        return m42775b(interfaceC22097).readAttributes(interfaceC22097, cls, enumC16060Arr);
    }

    public static Map readAttributes(InterfaceC22097 interfaceC22097, String str, EnumC16060... enumC16060Arr) {
        return m42775b(interfaceC22097).readAttributes(interfaceC22097, str, enumC16060Arr);
    }

    public static Set getPosixFilePermissions(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        return ((InterfaceC5332) readAttributes(interfaceC22097, InterfaceC5332.class, enumC16060Arr)).permissions();
    }

    public static InterfaceC22097 setPosixFilePermissions(InterfaceC22097 interfaceC22097, Set set) {
        C10221 c10221 = (C10221) getFileAttributeView(interfaceC22097, C10221.class, new EnumC16060[0]);
        if (c10221 == null) {
            throw new UnsupportedOperationException();
        }
        c10221.f28336a.setPermissions(AbstractC24029.m53253v(set));
        return interfaceC22097;
    }

    public static boolean isSymbolicLink(InterfaceC22097 interfaceC22097) {
        try {
            return readAttributes(interfaceC22097, InterfaceC16730.class, EnumC16060.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isDirectory(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        if (enumC16060Arr.length == 0) {
            m42775b(interfaceC22097);
        }
        try {
            return readAttributes(interfaceC22097, InterfaceC16730.class, enumC16060Arr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isRegularFile(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        if (enumC16060Arr.length == 0) {
            m42775b(interfaceC22097);
        }
        try {
            return readAttributes(interfaceC22097, InterfaceC16730.class, enumC16060Arr).isRegularFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static C6673 getLastModifiedTime(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        return readAttributes(interfaceC22097, InterfaceC16730.class, enumC16060Arr).lastModifiedTime();
    }

    public static long size(InterfaceC22097 interfaceC22097) {
        return readAttributes(interfaceC22097, InterfaceC16730.class, new EnumC16060[0]).size();
    }

    public static boolean exists(InterfaceC22097 interfaceC22097, EnumC16060... enumC16060Arr) {
        if (enumC16060Arr.length == 0) {
            m42775b(interfaceC22097);
        }
        try {
            int length = enumC16060Arr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC16060 enumC16060 = enumC16060Arr[i];
                if (enumC16060 != EnumC16060.NOFOLLOW_LINKS) {
                    enumC16060.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                m42775b(interfaceC22097).checkAccess(interfaceC22097, new EnumC13183[0]);
            } else {
                readAttributes(interfaceC22097, InterfaceC16730.class, EnumC16060.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static InterfaceC22097 walkFileTree(InterfaceC22097 interfaceC22097, Set set, int i, InterfaceC19414 interfaceC19414) {
        EnumC18072 enumC18072VisitFile;
        C21131 c21131 = new C21131(set, i);
        try {
            if (c21131.f66413e) {
                throw new IllegalStateException("Closed");
            }
            C17776 c17776M47759e = c21131.m47759e(interfaceC22097, false);
            do {
                int[] iArr = AbstractC23142.f72733a;
                EnumC6378 enumC6378 = c17776M47759e.f53079a;
                InterfaceC16730 interfaceC16730 = c17776M47759e.f53081c;
                InterfaceC22097 interfaceC22098 = c17776M47759e.f53080b;
                int i2 = iArr[enumC6378.ordinal()];
                if (i2 == 1) {
                    IOException iOException = c17776M47759e.f53082d;
                    enumC18072VisitFile = iOException == null ? interfaceC19414.visitFile(interfaceC22098, interfaceC16730) : interfaceC19414.visitFileFailed(interfaceC22098, iOException);
                } else if (i2 == 2) {
                    enumC18072VisitFile = interfaceC19414.preVisitDirectory(interfaceC22098, interfaceC16730);
                    if ((enumC18072VisitFile == EnumC18072.SKIP_SUBTREE || enumC18072VisitFile == EnumC18072.SKIP_SIBLINGS) && !c21131.f66412d.isEmpty()) {
                        try {
                            ((C11743) c21131.f66412d.pop()).f32791c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else if (i2 == 3) {
                    enumC18072VisitFile = interfaceC19414.postVisitDirectory(interfaceC22098, c17776M47759e.f53082d);
                    if (enumC18072VisitFile == EnumC18072.SKIP_SIBLINGS) {
                        enumC18072VisitFile = EnumC18072.CONTINUE;
                    }
                } else {
                    throw new AssertionError("Should not get here");
                }
                if (C12826.requireNonNull(enumC18072VisitFile) != EnumC18072.CONTINUE) {
                    if (enumC18072VisitFile == EnumC18072.TERMINATE) {
                        break;
                    }
                    if (enumC18072VisitFile == EnumC18072.SKIP_SIBLINGS && !c21131.f66412d.isEmpty()) {
                        ((C11743) c21131.f66412d.peek()).f32793e = true;
                    }
                    c17776M47759e = c21131.m47758d();
                } else {
                    c17776M47759e = c21131.m47758d();
                }
            } while (c17776M47759e != null);
            c21131.close();
            return interfaceC22097;
        } catch (Throwable th) {
            try {
                c21131.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static InterfaceC22097 walkFileTree(InterfaceC22097 interfaceC22097, InterfaceC19414 interfaceC19414) {
        return walkFileTree(interfaceC22097, EnumSet.noneOf(EnumC12709.class), Integer.MAX_VALUE, interfaceC19414);
    }

    public static BufferedReader newBufferedReader(InterfaceC22097 interfaceC22097, Charset charset) {
        return new BufferedReader(new InputStreamReader(newInputStream(interfaceC22097, new InterfaceC24778[0]), charset.newDecoder()));
    }

    public static BufferedWriter newBufferedWriter(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        C9080 c9080 = C9080.f24616a;
        c9080.getClass();
        return new BufferedWriter(new OutputStreamWriter(newOutputStream(interfaceC22097, interfaceC24778Arr), new C25173(c9080)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m42774a(InputStream inputStream, InterfaceC22097 interfaceC22097, InterfaceC23911... interfaceC23911Arr) throws IOException {
        C12826.requireNonNull(inputStream);
        int length = interfaceC23911Arr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            InterfaceC23911 interfaceC23911 = interfaceC23911Arr[i];
            if (interfaceC23911 != EnumC4662.REPLACE_EXISTING) {
                if (interfaceC23911 == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(interfaceC23911 + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(interfaceC22097);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamNewOutputStream = newOutputStream(interfaceC22097, EnumC6003.CREATE_NEW, EnumC6003.WRITE);
            try {
                if (inputStream instanceof InterfaceC16534) {
                    ((InterfaceC16534) inputStream).transferTo(outputStreamNewOutputStream);
                } else {
                    C3123.transferTo(inputStream, outputStreamNewOutputStream);
                }
                if (outputStreamNewOutputStream != null) {
                    outputStreamNewOutputStream.close();
                }
            } catch (Throwable th) {
                if (outputStreamNewOutputStream != null) {
                    try {
                        outputStreamNewOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static List readAllLines(InterfaceC22097 interfaceC22097, Charset charset) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = newBufferedReader(interfaceC22097, charset);
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                } else {
                    bufferedReaderNewBufferedReader.close();
                    return arrayList;
                }
            }
        } catch (Throwable th) {
            if (bufferedReaderNewBufferedReader != null) {
                try {
                    bufferedReaderNewBufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static List readAllLines(InterfaceC22097 interfaceC22097) {
        return readAllLines(interfaceC22097, C9080.f24616a);
    }

    public static InterfaceC19157 list(InterfaceC22097 interfaceC22097) {
        DirectoryStream directoryStreamNewDirectoryStream = newDirectoryStream(interfaceC22097);
        try {
            return (InterfaceC19157) C16474.stream(C23554.m52342b(new C10401(directoryStreamNewDirectoryStream.iterator()), 1), false).onClose(new RunnableC7719(directoryStreamNewDirectoryStream));
        } catch (Error | RuntimeException e) {
            try {
                directoryStreamNewDirectoryStream.close();
            } catch (IOException e2) {
                try {
                    e.addSuppressed(e2);
                } catch (Throwable unused) {
                }
            }
            throw e;
        }
    }

    public static InterfaceC19157 walk(InterfaceC22097 interfaceC22097, EnumC12709... enumC12709Arr) {
        C16435 c16435 = new C16435(interfaceC22097, enumC12709Arr);
        try {
            InterfaceC19157 interfaceC19157Stream = C16474.stream(C23554.m52342b(c16435, 1), false);
            C12826.requireNonNull(c16435);
            return ((InterfaceC19157) interfaceC19157Stream.onClose(new RunnableC7719(c16435))).map(new C21801());
        } catch (Error | RuntimeException e) {
            c16435.close();
            throw e;
        }
    }
}
