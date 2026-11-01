package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.۟ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9256 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC22097 f25121;

    /* JADX INFO: renamed from: ۙ */
    public C15290 f25122;

    /* JADX INFO: renamed from: ۤ */
    public volatile boolean f25123;

    /* JADX INFO: renamed from: ۫ */
    public final FileChannel f25124;

    /* JADX INFO: renamed from: ۬ */
    public final FileLock f25125;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25126;

    /* JADX INFO: renamed from: ᩸ */
    public C24008 f25127;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f25128;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f25126) {
            return;
        }
        if (this.f25127 != null) {
            throw new IllegalStateException("Recovery generation candidate is still active");
        }
        this.f25126 = true;
        try {
            this.f25125.release();
            this.f25124.close();
        } catch (Throwable th) {
            this.f25124.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C15290 m21330() {
        C15290 c15290;
        if (this.f25126) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        c15290 = this.f25122;
        if (c15290 == null) {
            throw new IllegalStateException("Recovery directory has no published generation");
        }
        return c15290;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C24008 m21333(C3455 c3455, UUID uuid) {
        InterfaceC22097 interfaceC22097Resolve;
        InterfaceC22097 interfaceC22097Resolve2;
        C24008 c24008;
        C14854 c14854M12012;
        m21318();
        if (this.f25122 != null || this.f25127 != null) {
            throw new IllegalStateException("Migration entry already exists");
        }
        C15290 c15290 = new C15290(uuid, uuid, 1L, 0L);
        InterfaceC22097 interfaceC22097M21331 = m21331(c15290);
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.exists(interfaceC22097M21331, enumC16060)) {
            interfaceC22097Resolve = this.f25121.resolve("entry.tmp");
            if (C18743.exists(interfaceC22097Resolve, enumC16060)) {
                InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
                interfaceC24242.mo30681(interfaceC22097Resolve);
                interfaceC24242.mo30678(this.f25121);
            }
            interfaceC22097Resolve2 = this.f25121.resolve("migration-state.bin");
            if (C18743.exists(interfaceC22097Resolve2, enumC16060)) {
                if (C18743.isRegularFile(interfaceC22097Resolve2, enumC16060)) {
                    throw new IOException("Migration state candidate is not a regular file");
                }
                c14854M12012 = C5467.m12012(interfaceC22097Resolve2);
                try {
                    InterfaceC24242 interfaceC24243 = InterfaceC24242.f76829;
                    interfaceC24243.mo30681(interfaceC22097Resolve2);
                    interfaceC24243.mo30678(this.f25121);
                    c14854M12012.close();
                } catch (Throwable th) {
                    try {
                        c14854M12012.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c24008 = new C24008(this, C22902.m51133(interfaceC22097M21331, c3455, uuid), c15290);
            this.f25127 = c24008;
        } else {
            if (!C18743.isRegularFile(interfaceC22097M21331, enumC16060)) {
                throw new IOException("Migration candidate is not a regular file");
            }
            C14854 c14854M12013 = C5467.m12012(interfaceC22097M21331);
            try {
                InterfaceC24242 interfaceC24244 = InterfaceC24242.f76829;
                interfaceC24244.mo30681(interfaceC22097M21331);
                interfaceC24244.mo30678(this.f25121);
                c14854M12013.close();
                interfaceC22097Resolve = this.f25121.resolve("entry.tmp");
                if (C18743.exists(interfaceC22097Resolve, enumC16060)) {
                    InterfaceC24242 interfaceC24245 = InterfaceC24242.f76829;
                    interfaceC24245.mo30681(interfaceC22097Resolve);
                    interfaceC24245.mo30678(this.f25121);
                }
                interfaceC22097Resolve2 = this.f25121.resolve("migration-state.bin");
                if (C18743.exists(interfaceC22097Resolve2, enumC16060)) {
                    if (C18743.isRegularFile(interfaceC22097Resolve2, enumC16060)) {
                        throw new IOException("Migration state candidate is not a regular file");
                    }
                    c14854M12012 = C5467.m12012(interfaceC22097Resolve2);
                    InterfaceC24242 interfaceC24246 = InterfaceC24242.f76829;
                    interfaceC24246.mo30681(interfaceC22097Resolve2);
                    interfaceC24246.mo30678(this.f25121);
                    c14854M12012.close();
                }
                c24008 = new C24008(this, C22902.m51133(interfaceC22097M21331, c3455, uuid), c15290);
                this.f25127 = c24008;
            } catch (Throwable th3) {
                try {
                    c14854M12013.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw th;
        return c24008;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C24008 m21334(C22902 c22902) {
        C24008 c24008;
        m21318();
        C15290 c15290M21330 = m21330();
        if (this.f25127 != null) {
            throw new IllegalStateException("Recovery generation copy is already active");
        }
        if (c15290M21330.f43625.equals(c22902.f72077)) {
            long j = c15290M21330.f43623;
            long j2 = c22902.f72078;
            if (j == j2) {
                if (j2 == C14849.FOREVER_NS) {
                    throw new IOException("Recovery generation exhausted");
                }
                if (m21324(c22902.f72073) != 0) {
                    throw new IOException("Previous recovery generation is still in use or cannot be reclaimed", this.f25128);
                }
                C15290 c15290 = new C15290(c22902.f72077, UUID.randomUUID(), c22902.f72078 + 1, c15290M21330.f43624);
                c24008 = new C24008(this, C22902.m51134(c22902, m21331(c15290)), c15290);
                this.f25127 = c24008;
            }
        }
        throw new IOException("Source does not match current recovery generation");
        return c24008;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m21336(C24008 c24008, long j) {
        m21340(c24008, j);
        m21338(c24008, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m21337(C3455 c3455) {
        if (this.f25126 || this.f25123 || this.f25127 != null) {
            return;
        }
        try {
            m21324(c3455);
        } catch (IOException e) {
            this.f25128 = e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m21338(C24008 c24008, long j) {
        C15290 c15290;
        m21318();
        if (c24008 != this.f25127 || c24008.f76249 || j < 0 || c24008.f76247 != j || c24008.f76245 != c24008.f76246.m51155() || ((c15290 = this.f25122) != null && j < c15290.f43624)) {
            throw new IOException("Recovery candidate validation is missing or stale");
        }
        C15290 c15291 = new C15290(c24008.f76250.f43625, c24008.f76250.f43622, c24008.f76250.f43623, j);
        InterfaceC22097 interfaceC22097Resolve = this.f25121.resolve("entry.tmp");
        if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            throw new IOException("Recovery temporary entry requires cleanup");
        }
        try {
            InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
            interfaceC24242.mo30680(interfaceC22097Resolve, m21322(c15291));
            this.f25123 = true;
            interfaceC24242.mo30679(interfaceC22097Resolve, this.f25121.resolve("current"));
            interfaceC24242.mo30678(this.f25121);
            this.f25122 = c15291;
            c24008.f76250 = c15291;
            this.f25123 = false;
        } catch (IOException | Error | RuntimeException e) {
            try {
                if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
                    InterfaceC24242.f76829.mo30681(interfaceC22097Resolve);
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m21341() {
        if (this.f25126) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        return this.f25122 != null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized C15290 m21343() {
        C15290 c15290M21320;
        C15290 c15290M21330 = m21330();
        c15290M21320 = m21320(m21323(this.f25121.resolve("current")));
        if (!c15290M21330.f43625.equals(c15290M21320.f43625) || !c15290M21330.f43622.equals(c15290M21320.f43622) || c15290M21330.f43623 != c15290M21320.f43623 || c15290M21330.f43624 != c15290M21320.f43624) {
            throw new IOException("Published recovery entry changed outside its owner");
        }
        return c15290M21320;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C24008 m21332(C3455 c3455) {
        C24008 c24008;
        m21318();
        if (this.f25122 != null || this.f25127 != null) {
            throw new IllegalStateException("Recovery generation already exists");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        C22902 c22902M51130 = C22902.m51130(InterfaceC24242.f76829.mo30676(this.f25121.resolve("generation-1-" + uuidRandomUUID + ".mt2"), true), c3455);
        c24008 = new C24008(this, c22902M51130, new C15290(c22902M51130.f72077, uuidRandomUUID, 1L, 0L));
        this.f25127 = c24008;
        return c24008;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9256 m21312(InterfaceC22097 interfaceC22097) {
        InterfaceC22097 absolutePath = interfaceC22097.toAbsolutePath();
        C18743.createDirectory(absolutePath, new InterfaceC23437[0]);
        InterfaceC22097 parent = absolutePath.getParent();
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        interfaceC24242.mo30678(parent);
        C9256 c9256 = new C9256(absolutePath, true);
        try {
            c9256.f25124.force(true);
            interfaceC24242.mo30678(absolutePath);
            return c9256;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c9256.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C9256 m21328(InterfaceC22097 interfaceC22097) {
        InterfaceC22097 absolutePath = interfaceC22097.toAbsolutePath();
        C9256 c9256 = new C9256(absolutePath, false);
        try {
            c9256.f25122 = m21320(m21323(absolutePath.resolve("current")));
            return c9256;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c9256.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m21321(InterfaceC22097 interfaceC22097) throws IOException {
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        InterfaceC22097 absolutePath = interfaceC22097.toAbsolutePath();
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (C18743.exists(absolutePath, enumC16060)) {
            if (!C18743.isDirectory(absolutePath, enumC16060) || !C18743.isRegularFile(absolutePath.resolve("session.lock"), enumC16060)) {
                throw new IOException("Recovery deletion requires an owned directory");
            }
            InterfaceC22097 interfaceC22097ResolveSibling = absolutePath.resolveSibling(absolutePath.getFileName() + "-deleted-" + UUID.randomUUID());
            C9256 c9256 = new C9256(absolutePath, false);
            try {
                C18743.move(absolutePath, interfaceC22097ResolveSibling, EnumC4662.ATOMIC_MOVE);
                interfaceC24242.mo30678(absolutePath.getParent());
                c9256.close();
                InterfaceC19157 interfaceC19157Walk = C18743.walk(interfaceC22097ResolveSibling, new EnumC12709[0]);
                try {
                    Iterator it = interfaceC19157Walk.sorted(C10162.reverseOrder()).toList().iterator();
                    while (it.hasNext()) {
                        C18743.delete((InterfaceC22097) it.next());
                    }
                    interfaceC19157Walk.close();
                    interfaceC24242.mo30678(absolutePath.getParent());
                } catch (Throwable th) {
                    if (interfaceC19157Walk != null) {
                        try {
                            interfaceC19157Walk.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c9256.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C9256 m21327(InterfaceC22097 interfaceC22097) throws IOException {
        InterfaceC22097 absolutePath = interfaceC22097.toAbsolutePath();
        try {
            C18743.createDirectory(absolutePath, new InterfaceC23437[0]);
        } catch (FileAlreadyExistsException e) {
            if (!C18743.isDirectory(absolutePath, EnumC16060.NOFOLLOW_LINKS)) {
                throw new IOException("Migration path is not a directory", e);
            }
        }
        InterfaceC22097 parent = absolutePath.getParent();
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        interfaceC24242.mo30678(parent);
        InterfaceC22097 interfaceC22097Resolve = absolutePath.resolve("session.lock");
        if (!C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(absolutePath);
            try {
                if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                    throw new IOException("Migration directory has no ownership lock");
                }
                directoryStreamNewDirectoryStream.close();
                try {
                    C18743.createFile(interfaceC22097Resolve, new InterfaceC23437[0]);
                } catch (FileAlreadyExistsException unused) {
                }
            } catch (Throwable th) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.isRegularFile(interfaceC22097Resolve, enumC16060)) {
            throw new IOException("Migration ownership lock is not a regular file");
        }
        C9256 c9256 = new C9256(absolutePath, false);
        try {
            c9256.f25124.force(true);
            interfaceC24242.mo30678(absolutePath);
            if (C18743.exists(absolutePath.resolve("current"), enumC16060)) {
                c9256.f25122 = m21320(m21323(absolutePath.resolve("current")));
            }
            return c9256;
        } catch (IOException | Error | RuntimeException e2) {
            try {
                c9256.close();
            } catch (IOException e3) {
                e2.addSuppressed(e3);
            }
            throw e2;
        }
    }

    public C9256(InterfaceC22097 interfaceC22097, boolean z) throws Throwable {
        this.f25121 = interfaceC22097;
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("session.lock");
        FileChannel fileChannelOpen = z ? C13853.open(interfaceC22097Resolve, EnumC6003.CREATE_NEW, EnumC6003.READ, EnumC6003.WRITE) : C13853.open(interfaceC22097Resolve, EnumC6003.READ, EnumC6003.WRITE);
        this.f25124 = fileChannelOpen;
        try {
            try {
                FileLock fileLockTryLock = fileChannelOpen.tryLock();
                this.f25125 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    throw new IOException("Recovery directory is already in use");
                }
            } catch (OverlappingFileLockException e) {
                throw new IOException("Recovery directory is already in use", e);
            }
        } catch (IOException e2) {
            e = e2;
            try {
                this.f25124.close();
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
            throw e;
        } catch (Error e4) {
            e = e4;
            this.f25124.close();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            this.f25124.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m21342() {
        return this.f25123;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 m21331(C15290 c15290) {
        return this.f25121.resolve("generation-" + c15290.f43623 + "-" + c15290.f43622 + ".mt2");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ */
    private int m21324(C3455 c3455) throws IOException {
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        this.f25128 = null;
        InterfaceC22097 interfaceC22097 = this.f25121;
        DirectoryStream<InterfaceC22097> directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097);
        try {
            int i = 0;
            int i2 = 0;
            for (InterfaceC22097 interfaceC22098 : directoryStreamNewDirectoryStream) {
                i2++;
                if (i2 > 1024) {
                    throw new IOException("Recovery directory cleanup scan limit exceeded");
                }
                if (interfaceC22098.getFileName().toString().equals("entry.tmp")) {
                    try {
                        interfaceC24242.mo30681(interfaceC22098);
                        interfaceC24242.mo30678(interfaceC22097);
                    } catch (IOException e) {
                        this.f25128 = e;
                        i++;
                    }
                } else {
                    C15290 c15290M21325 = m21325(interfaceC22098);
                    if (c15290M21325 != null) {
                        try {
                            m21315(c15290M21325, c3455);
                        } catch (IOException e2) {
                            this.f25128 = e2;
                            i++;
                        }
                    }
                }
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                throw th;
            }
            directoryStreamNewDirectoryStream.close();
            return i;
        } catch (Throwable th2) {
            if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private C15290 m21325(InterfaceC22097 interfaceC22097) {
        int iIndexOf;
        if (!C18743.isRegularFile(interfaceC22097, EnumC16060.NOFOLLOW_LINKS)) {
            return null;
        }
        String string = interfaceC22097.getFileName().toString();
        if (!string.startsWith("generation-") || (iIndexOf = string.indexOf(45, 11)) < 0 || !string.endsWith(".mt2")) {
            return null;
        }
        try {
            long j = Long.parseLong(string.substring(11, iIndexOf));
            UUID uuidFromString = UUID.fromString(string.substring(iIndexOf + 1, string.length() - 4));
            if (j >= 1 && !uuidFromString.equals(this.f25122.f43622)) {
                C15290 c15290 = new C15290(this.f25122.f43625, uuidFromString, j, 0L);
                if (m21331(c15290).equals(interfaceC22097)) {
                    return c15290;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21315(C15290 c15290, C3455 c3455) throws IOException {
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        InterfaceC22097 interfaceC22097M21331 = m21331(c15290);
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (C18743.exists(interfaceC22097M21331, enumC16060)) {
            if (!C18743.isRegularFile(interfaceC22097M21331, enumC16060)) {
                throw new IOException("Recovery generation is not a regular file");
            }
            C22902 c22902M51132 = C22902.m51132(interfaceC22097M21331, c3455);
            try {
                if (!c15290.f43625.equals(c22902M51132.f72077) || c15290.f43623 != c22902M51132.f72078) {
                    throw new IOException("Obsolete recovery generation identity does not match");
                }
                interfaceC24242.mo30681(interfaceC22097M21331);
                interfaceC24242.mo30678(this.f25121);
                c22902M51132.close();
            } catch (Throwable th) {
                try {
                    c22902M51132.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m21314(C9256 c9256, C15290 c15290, C22902 c22902, Throwable th) {
        C15290 c15291;
        synchronized (c9256) {
            if (!c9256.f25126 && !c9256.f25123 && ((c15291 = c9256.f25122) == null || !c15291.f43622.equals(c15290.f43622))) {
                if (th != null) {
                    c9256.f25128 = new IOException("Obsolete recovery generation failed to close", th);
                    return;
                }
                try {
                    c9256.m21315(c15290, c22902.f72073);
                } catch (IOException e) {
                    c9256.f25128 = e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m21340(C24008 c24008, long j) {
        m21335(j, c24008, new RunnableC3043());
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m21335(long j, C24008 c24008, Runnable runnable) {
        C15290 c15290;
        m21318();
        if (c24008 != this.f25127 || c24008.f76249 || j < 0 || ((c15290 = this.f25122) != null && j < c15290.f43624)) {
            throw new IllegalArgumentException("Invalid recovery generation publication");
        }
        C15290 c15291 = new C15290(c24008.f76250.f43625, c24008.f76250.f43622, c24008.f76250.f43623, j);
        long jM51155 = c24008.f76246.m51155();
        m21316(c15291, c24008.f76246.f72073, runnable);
        if (jM51155 != c24008.f76246.m51155()) {
            throw new IOException("Recovery candidate changed during validation");
        }
        c24008.f76247 = j;
        c24008.f76245 = jM51155;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21316(C15290 c15290, C3455 c3455, Runnable runnable) throws Exception {
        C22902 c22902M51140 = C22902.m51140(C5467.m12013(m21331(c15290)), c3455);
        try {
            C11229 c11229M24340 = new C10558(c22902M51140, runnable).m24340(C21958.f69011);
            try {
                long j = c11229M24340.f31225;
                m21317(c15290, c22902M51140, j);
                if (j != c15290.f43624 || c11229M24340.f31233 != 0 || c11229M24340.f31226 != null) {
                    throw new IOException("Recovery candidate is not an exact complete commit");
                }
                c11229M24340.close();
                c22902M51140.close();
                return;
            } catch (Throwable th) {
                try {
                    c11229M24340.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c22902M51140.close();
            throw th3;
        }
        try {
            c22902M51140.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m21339() {
        return C18743.getFileStore(this.f25121).getUsableSpace();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21317(C15290 c15290, C22902 c22902, long j) throws IOException {
        if (!c15290.f43625.equals(c22902.f72077) || c15290.f43623 != c22902.f72078 || j < c15290.f43624) {
            throw new IOException("Recovery generation identity or acknowledged revision does not match entry");
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m21318() throws IOException {
        if (this.f25126) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        if (this.f25123) {
            throw new IOException("Recovery entry publication requires reopening");
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static byte[] m21323(InterfaceC22097 interfaceC22097) throws IOException {
        FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.READ);
        try {
            if (fileChannelOpen.size() != 80) {
                throw new IOException("Invalid recovery entry length");
            }
            byte[] bArr = new byte[80];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                if (fileChannelOpen.read(byteBufferWrap) <= 0) {
                    throw new IOException("Truncated recovery entry");
                }
            }
            if (fileChannelOpen.size() != 80) {
                throw new IOException("Recovery entry changed during reading");
            }
            fileChannelOpen.close();
            return bArr;
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m21322(C15290 c15290) {
        C11996 c11996 = new C11996(80);
        c11996.writeInt(1162097229);
        c11996.writeInt(1);
        UUID uuid = c15290.f43625;
        c11996.m27451(uuid.getMostSignificantBits());
        c11996.m27451(uuid.getLeastSignificantBits());
        UUID uuid2 = c15290.f43622;
        c11996.m27451(uuid2.getMostSignificantBits());
        c11996.m27451(uuid2.getLeastSignificantBits());
        c11996.m27451(c15290.f43623);
        c11996.m27451(c15290.f43624);
        while (c11996.size() < 76) {
            c11996.writeByte(0);
        }
        c11996.writeInt(C4107.m8259(0, c11996.size(), c11996.m27458()));
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15290 m21320(byte[] bArr) throws IOException {
        if (bArr.length != 80) {
            throw new IOException("Invalid recovery entry length");
        }
        C14677 c14677 = new C14677(bArr);
        if (c14677.readInt() != 1162097229 || c14677.readInt() != 1) {
            throw new IOException("Unsupported recovery entry");
        }
        UUID uuid = new UUID(c14677.readLong(), c14677.readLong());
        UUID uuid2 = new UUID(c14677.readLong(), c14677.readLong());
        long j = c14677.readLong();
        long j2 = c14677.readLong();
        if (j <= 0 || j2 < 0) {
            throw new IOException("Invalid recovery entry generation");
        }
        while (c14677.available() > 4) {
            if (c14677.readByte() != 0) {
                throw new IOException("Unsupported recovery entry fields");
            }
        }
        if (c14677.readInt() != C4107.m8259(0, 76, bArr)) {
            throw new IOException("Invalid recovery entry checksum");
        }
        return new C15290(uuid, uuid2, j, j2);
    }
}
