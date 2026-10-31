package l;

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
public final class C17229 {
    public static final Set a = AbstractC22791.D(new Object[]{EnumC3824.CREATE_NEW, EnumC3824.WRITE});

    public static AbstractC13389 b(InterfaceC20758 interfaceC20758) {
        return interfaceC20758.getFileSystem().provider();
    }

    public static InputStream newInputStream(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        return b(interfaceC20758).newInputStream(interfaceC20758, interfaceC23579Arr);
    }

    public static OutputStream newOutputStream(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        return b(interfaceC20758).g(interfaceC20758, interfaceC23579Arr);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758) {
        return b(interfaceC20758).newDirectoryStream(interfaceC20758, C20446.a);
    }

    public static DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, String str) {
        if (str.equals("*")) {
            return newDirectoryStream(interfaceC20758);
        }
        AbstractC7145 fileSystem = interfaceC20758.getFileSystem();
        return fileSystem.provider().newDirectoryStream(interfaceC20758, new C17022(1, fileSystem.getPathMatcher("glob:".concat(str))));
    }

    public static DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter) {
        return b(interfaceC20758).newDirectoryStream(interfaceC20758, filter);
    }

    public static InterfaceC20758 createFile(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr) {
        b(interfaceC20758).newByteChannel(interfaceC20758, a, interfaceC22168Arr).close();
        return interfaceC20758;
    }

    public static InterfaceC20758 createDirectory(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr) {
        b(interfaceC20758).createDirectory(interfaceC20758, interfaceC22168Arr);
        return interfaceC20758;
    }

    public static InterfaceC20758 createDirectories(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr) {
        try {
            try {
                createDirectory(interfaceC20758, interfaceC22168Arr);
            } catch (IOException unused) {
                try {
                    interfaceC20758 = interfaceC20758.toAbsolutePath();
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                }
                InterfaceC20758 parent = interfaceC20758.getParent();
                while (parent != null) {
                    try {
                        parent.getFileSystem().provider().checkAccess(parent, new EnumC11379[0]);
                        break;
                    } catch (NoSuchFileException unused2) {
                        parent = parent.getParent();
                    }
                }
                if (parent == null) {
                    if (e == null) {
                        throw new FileSystemException(interfaceC20758.toString(), null, "Unable to determine if root directory exists");
                    }
                    throw e;
                }
                Iterator it = parent.relativize(interfaceC20758).iterator();
                while (it.hasNext()) {
                    parent = parent.resolve((InterfaceC20758) it.next());
                    try {
                        createDirectory(parent, interfaceC22168Arr);
                    } catch (FileAlreadyExistsException e2) {
                        if (!isDirectory(parent, EnumC14406.NOFOLLOW_LINKS)) {
                            throw e2;
                        }
                    }
                }
                return interfaceC20758;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                if (!isDirectory(interfaceC20758, EnumC14406.NOFOLLOW_LINKS)) {
                    throw e3;
                }
            } catch (FileAlreadyExistsException e4) {
                throw e4;
            }
        }
        return interfaceC20758;
    }

    public static InterfaceC20758 createTempFile(InterfaceC20758 interfaceC20758, String str, String str2, InterfaceC22168... interfaceC22168Arr) {
        InterfaceC20758 interfaceC20759 = (InterfaceC20758) C11003.requireNonNull(interfaceC20758);
        InterfaceC20758 interfaceC207510 = AbstractC2101.a;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = ".tmp";
        }
        if (interfaceC20759 == null) {
            interfaceC20759 = interfaceC207510;
        }
        if (AbstractC2101.b && interfaceC20759.getFileSystem() == C1707.getDefault()) {
            if (interfaceC22168Arr.length != 0) {
                int i = 0;
                while (true) {
                    if (i < interfaceC22168Arr.length) {
                        if (interfaceC22168Arr[i].name().equals("posix:permissions")) {
                            break;
                        }
                        i++;
                    } else {
                        int length = interfaceC22168Arr.length;
                        InterfaceC22168[] interfaceC22168Arr2 = new InterfaceC22168[length + 1];
                        System.arraycopy(interfaceC22168Arr, 0, interfaceC22168Arr2, 0, interfaceC22168Arr.length);
                        interfaceC22168Arr2[length] = AbstractC13905.a;
                        interfaceC22168Arr = interfaceC22168Arr2;
                        break;
                    }
                }
            } else {
                interfaceC22168Arr = new InterfaceC22168[]{AbstractC13905.a};
            }
        }
        SecurityManager securityManager = System.getSecurityManager();
        while (true) {
            try {
                try {
                    return createFile(AbstractC2101.a(str, str2, interfaceC20759), interfaceC22168Arr);
                } catch (SecurityException e) {
                    if (interfaceC20759 == interfaceC207510 && securityManager != null) {
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

    public static void delete(InterfaceC20758 interfaceC20758) {
        b(interfaceC20758).delete(interfaceC20758);
    }

    public static boolean deleteIfExists(InterfaceC20758 interfaceC20758) {
        return b(interfaceC20758).c(interfaceC20758);
    }

    public static InterfaceC20758 move(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, InterfaceC22667... interfaceC22667Arr) throws IOException {
        AbstractC13389 abstractC13389B = b(interfaceC20758);
        if (!b(interfaceC20759).equals(abstractC13389B)) {
            int length = interfaceC22667Arr.length;
            int i = length + 2;
            InterfaceC22667[] interfaceC22667Arr2 = new InterfaceC22667[i];
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC22667 interfaceC22667 = interfaceC22667Arr[i2];
                if (interfaceC22667 == EnumC2413.ATOMIC_MOVE) {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
                interfaceC22667Arr2[i2] = interfaceC22667;
            }
            interfaceC22667Arr2[length] = EnumC14406.NOFOLLOW_LINKS;
            interfaceC22667Arr2[length + 1] = EnumC2413.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                InterfaceC22667 interfaceC22668 = interfaceC22667Arr2[i3];
                if (interfaceC22668 == EnumC2413.REPLACE_EXISTING) {
                    z2 = true;
                } else if (interfaceC22668 == EnumC14406.NOFOLLOW_LINKS) {
                    z = false;
                } else {
                    if (interfaceC22668 != EnumC2413.COPY_ATTRIBUTES) {
                        interfaceC22668.getClass();
                        throw new UnsupportedOperationException("'" + interfaceC22668 + "' is not a recognized copy option");
                    }
                    z3 = true;
                }
            }
            InterfaceC15111 attributes = readAttributes(interfaceC20758, InterfaceC15111.class, z ? new EnumC14406[0] : new EnumC14406[]{EnumC14406.NOFOLLOW_LINKS});
            if (attributes.isSymbolicLink()) {
                throw new IOException("Copying of symbolic links not supported");
            }
            if (z2) {
                deleteIfExists(interfaceC20759);
            } else if (exists(interfaceC20759, new EnumC14406[0])) {
                throw new FileAlreadyExistsException(interfaceC20759.toString());
            }
            if (attributes.isDirectory()) {
                createDirectory(interfaceC20759, new InterfaceC22168[0]);
            } else {
                InputStream inputStreamNewInputStream = newInputStream(interfaceC20758, new InterfaceC23579[0]);
                try {
                    a(inputStreamNewInputStream, interfaceC20759, new InterfaceC22667[0]);
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
                    ((InterfaceC16728) getFileAttributeView(interfaceC20759, InterfaceC16728.class, new EnumC14406[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
                } catch (Throwable th3) {
                    try {
                        delete(interfaceC20759);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            delete(interfaceC20758);
            return interfaceC20759;
        }
        abstractC13389B.move(interfaceC20758, interfaceC20759, interfaceC22667Arr);
        return interfaceC20759;
    }

    public static InterfaceC20758 readSymbolicLink(InterfaceC20758 interfaceC20758) {
        return b(interfaceC20758).h(interfaceC20758);
    }

    public static AbstractC13494 getFileStore(InterfaceC20758 interfaceC20758) {
        return b(interfaceC20758).getFileStore(interfaceC20758);
    }

    public static boolean isSameFile(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) {
        return b(interfaceC20758).isSameFile(interfaceC20758, interfaceC20759);
    }

    public static InterfaceC20052 getFileAttributeView(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        return b(interfaceC20758).getFileAttributeView(interfaceC20758, cls, enumC14406Arr);
    }

    public static InterfaceC15111 readAttributes(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        return b(interfaceC20758).readAttributes(interfaceC20758, cls, enumC14406Arr);
    }

    public static Map readAttributes(InterfaceC20758 interfaceC20758, String str, EnumC14406... enumC14406Arr) {
        return b(interfaceC20758).readAttributes(interfaceC20758, str, enumC14406Arr);
    }

    public static Set getPosixFilePermissions(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        return ((InterfaceC3118) readAttributes(interfaceC20758, InterfaceC3118.class, enumC14406Arr)).permissions();
    }

    public static InterfaceC20758 setPosixFilePermissions(InterfaceC20758 interfaceC20758, Set set) {
        C8262 c8262 = (C8262) getFileAttributeView(interfaceC20758, C8262.class, new EnumC14406[0]);
        if (c8262 == null) {
            throw new UnsupportedOperationException();
        }
        c8262.a.setPermissions(AbstractC22791.v(set));
        return interfaceC20758;
    }

    public static boolean isSymbolicLink(InterfaceC20758 interfaceC20758) {
        try {
            return readAttributes(interfaceC20758, InterfaceC15111.class, EnumC14406.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isDirectory(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        if (enumC14406Arr.length == 0) {
            b(interfaceC20758);
        }
        try {
            return readAttributes(interfaceC20758, InterfaceC15111.class, enumC14406Arr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isRegularFile(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        if (enumC14406Arr.length == 0) {
            b(interfaceC20758);
        }
        try {
            return readAttributes(interfaceC20758, InterfaceC15111.class, enumC14406Arr).isRegularFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static C4529 getLastModifiedTime(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        return readAttributes(interfaceC20758, InterfaceC15111.class, enumC14406Arr).lastModifiedTime();
    }

    public static long size(InterfaceC20758 interfaceC20758) {
        return readAttributes(interfaceC20758, InterfaceC15111.class, new EnumC14406[0]).size();
    }

    public static boolean exists(InterfaceC20758 interfaceC20758, EnumC14406... enumC14406Arr) {
        if (enumC14406Arr.length == 0) {
            b(interfaceC20758);
        }
        try {
            int length = enumC14406Arr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC14406 enumC14406 = enumC14406Arr[i];
                if (enumC14406 != EnumC14406.NOFOLLOW_LINKS) {
                    enumC14406.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                b(interfaceC20758).checkAccess(interfaceC20758, new EnumC11379[0]);
            } else {
                readAttributes(interfaceC20758, InterfaceC15111.class, EnumC14406.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static InterfaceC20758 walkFileTree(InterfaceC20758 interfaceC20758, Set set, int i, InterfaceC17935 interfaceC17935) {
        EnumC16523 enumC16523VisitFile;
        C19741 c19741 = new C19741(set, i);
        try {
            if (c19741.e) {
                throw new IllegalStateException("Closed");
            }
            C16211 c16211E = c19741.e(interfaceC20758, false);
            do {
                int[] iArr = AbstractC21857.a;
                EnumC4218 enumC4218 = c16211E.a;
                InterfaceC15111 interfaceC15111 = c16211E.c;
                InterfaceC20758 interfaceC20759 = c16211E.b;
                int i2 = iArr[enumC4218.ordinal()];
                if (i2 == 1) {
                    IOException iOException = c16211E.d;
                    enumC16523VisitFile = iOException == null ? interfaceC17935.visitFile(interfaceC20759, interfaceC15111) : interfaceC17935.visitFileFailed(interfaceC20759, iOException);
                } else if (i2 == 2) {
                    enumC16523VisitFile = interfaceC17935.preVisitDirectory(interfaceC20759, interfaceC15111);
                    if ((enumC16523VisitFile == EnumC16523.SKIP_SUBTREE || enumC16523VisitFile == EnumC16523.SKIP_SIBLINGS) && !c19741.d.isEmpty()) {
                        try {
                            ((C9863) c19741.d.pop()).c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else if (i2 == 3) {
                    enumC16523VisitFile = interfaceC17935.postVisitDirectory(interfaceC20759, c16211E.d);
                    if (enumC16523VisitFile == EnumC16523.SKIP_SIBLINGS) {
                        enumC16523VisitFile = EnumC16523.CONTINUE;
                    }
                } else {
                    throw new AssertionError("Should not get here");
                }
                if (C11003.requireNonNull(enumC16523VisitFile) != EnumC16523.CONTINUE) {
                    if (enumC16523VisitFile == EnumC16523.TERMINATE) {
                        break;
                    }
                    if (enumC16523VisitFile == EnumC16523.SKIP_SIBLINGS && !c19741.d.isEmpty()) {
                        ((C9863) c19741.d.peek()).e = true;
                    }
                    c16211E = c19741.d();
                } else {
                    c16211E = c19741.d();
                }
            } while (c16211E != null);
            c19741.close();
            return interfaceC20758;
        } catch (Throwable th) {
            try {
                c19741.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static InterfaceC20758 walkFileTree(InterfaceC20758 interfaceC20758, InterfaceC17935 interfaceC17935) {
        return walkFileTree(interfaceC20758, EnumSet.noneOf(EnumC10880.class), Integer.MAX_VALUE, interfaceC17935);
    }

    public static BufferedReader newBufferedReader(InterfaceC20758 interfaceC20758, Charset charset) {
        return new BufferedReader(new InputStreamReader(newInputStream(interfaceC20758, new InterfaceC23579[0]), charset.newDecoder()));
    }

    public static BufferedWriter newBufferedWriter(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        C7061 c7061 = C7061.a;
        c7061.getClass();
        return new BufferedWriter(new OutputStreamWriter(newOutputStream(interfaceC20758, interfaceC23579Arr), new C23994(c7061)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, InterfaceC20758 interfaceC20758, InterfaceC22667... interfaceC22667Arr) throws IOException {
        C11003.requireNonNull(inputStream);
        int length = interfaceC22667Arr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            InterfaceC22667 interfaceC22667 = interfaceC22667Arr[i];
            if (interfaceC22667 != EnumC2413.REPLACE_EXISTING) {
                if (interfaceC22667 == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(interfaceC22667 + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(interfaceC20758);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamNewOutputStream = newOutputStream(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.WRITE);
            try {
                if (inputStream instanceof InterfaceC14905) {
                    ((InterfaceC14905) inputStream).transferTo(outputStreamNewOutputStream);
                } else {
                    C0794.transferTo(inputStream, outputStreamNewOutputStream);
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

    public static List readAllLines(InterfaceC20758 interfaceC20758, Charset charset) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = newBufferedReader(interfaceC20758, charset);
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

    public static List readAllLines(InterfaceC20758 interfaceC20758) {
        return readAllLines(interfaceC20758, C7061.a);
    }

    public static InterfaceC17664 list(InterfaceC20758 interfaceC20758) {
        DirectoryStream directoryStreamNewDirectoryStream = newDirectoryStream(interfaceC20758);
        try {
            return (InterfaceC17664) C14841.stream(C22291.b(new C8451(directoryStreamNewDirectoryStream.iterator()), 1), false).onClose(new RunnableC5629(directoryStreamNewDirectoryStream));
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

    public static InterfaceC17664 walk(InterfaceC20758 interfaceC20758, EnumC10880... enumC10880Arr) {
        C14800 c14800 = new C14800(interfaceC20758, enumC10880Arr);
        try {
            InterfaceC17664 interfaceC17664Stream = C14841.stream(C22291.b(c14800, 1), false);
            C11003.requireNonNull(c14800);
            return ((InterfaceC17664) interfaceC17664Stream.onClose(new RunnableC5629(c14800))).map(new C20446());
        } catch (Error | RuntimeException e) {
            c14800.close();
            throw e;
        }
    }
}
