package l;

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
public final class C7247 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f22239;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13596 f22240;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22241;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FileChannel f22242;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FileLock f22243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22244;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22769 f22245;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f22246;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22244) {
            return;
        }
        if (this.f22245 != null) {
            throw new IllegalStateException("Recovery generation candidate is still active");
        }
        this.f22244 = true;
        try {
            this.f22243.release();
            this.f22242.close();
        } catch (Throwable th) {
            this.f22242.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C13596 m19381() {
        C13596 c13596;
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        c13596 = this.f22240;
        if (c13596 == null) {
            throw new IllegalStateException("Recovery directory has no published generation");
        }
        return c13596;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00ca, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000d, B:10:0x002b, B:12:0x0035, B:14:0x0043, B:21:0x0050, B:20:0x004d, B:22:0x0051, B:23:0x0058, B:24:0x0059, B:26:0x006b, B:27:0x0075, B:29:0x0087, B:31:0x0091, B:33:0x009f, B:40:0x00ac, B:39:0x00a9, B:41:0x00ad, B:42:0x00b4, B:43:0x00b5, B:46:0x00c2, B:47:0x00c9, B:32:0x0095, B:13:0x0039, B:36:0x00a4, B:17:0x0048), top: B:57:0x0002, inners: #0, #1, #2, #4 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19384(C1143 c1143, UUID uuid) {
        InterfaceC20758 interfaceC20758Resolve;
        InterfaceC20758 interfaceC20758Resolve2;
        C22769 c22769;
        C13137 c13137M9979;
        m19369();
        if (this.f22240 != null || this.f22245 != null) {
            throw new IllegalStateException("Migration entry already exists");
        }
        C13596 c13596 = new C13596(uuid, uuid, 1L, 0L);
        InterfaceC20758 interfaceC20758M19382 = m19382(c13596);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.exists(interfaceC20758M19382, enumC14406)) {
            interfaceC20758Resolve = this.f22239.resolve("entry.tmp");
            if (C17229.exists(interfaceC20758Resolve, enumC14406)) {
                InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
                interfaceC23015.mo28633(interfaceC20758Resolve);
                interfaceC23015.mo28630(this.f22239);
            }
            interfaceC20758Resolve2 = this.f22239.resolve("migration-state.bin");
            if (C17229.exists(interfaceC20758Resolve2, enumC14406)) {
                if (C17229.isRegularFile(interfaceC20758Resolve2, enumC14406)) {
                    throw new IOException("Migration state candidate is not a regular file");
                }
                c13137M9979 = C3260.m9979(interfaceC20758Resolve2);
                try {
                    InterfaceC23015 interfaceC23016 = InterfaceC23015.f74090;
                    interfaceC23016.mo28633(interfaceC20758Resolve2);
                    interfaceC23016.mo28630(this.f22239);
                    c13137M9979.close();
                } catch (Throwable th) {
                    try {
                        c13137M9979.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c22769 = new C22769(this, C21605.m48786(interfaceC20758M19382, c1143, uuid), c13596);
            this.f22245 = c22769;
        } else {
            if (!C17229.isRegularFile(interfaceC20758M19382, enumC14406)) {
                throw new IOException("Migration candidate is not a regular file");
            }
            C13137 c13137M99710 = C3260.m9979(interfaceC20758M19382);
            try {
                InterfaceC23015 interfaceC23017 = InterfaceC23015.f74090;
                interfaceC23017.mo28633(interfaceC20758M19382);
                interfaceC23017.mo28630(this.f22239);
                c13137M99710.close();
                interfaceC20758Resolve = this.f22239.resolve("entry.tmp");
                if (C17229.exists(interfaceC20758Resolve, enumC14406)) {
                    InterfaceC23015 interfaceC23018 = InterfaceC23015.f74090;
                    interfaceC23018.mo28633(interfaceC20758Resolve);
                    interfaceC23018.mo28630(this.f22239);
                }
                interfaceC20758Resolve2 = this.f22239.resolve("migration-state.bin");
                if (C17229.exists(interfaceC20758Resolve2, enumC14406)) {
                    if (C17229.isRegularFile(interfaceC20758Resolve2, enumC14406)) {
                        throw new IOException("Migration state candidate is not a regular file");
                    }
                    c13137M9979 = C3260.m9979(interfaceC20758Resolve2);
                    InterfaceC23015 interfaceC23019 = InterfaceC23015.f74090;
                    interfaceC23019.mo28633(interfaceC20758Resolve2);
                    interfaceC23019.mo28630(this.f22239);
                    c13137M9979.close();
                }
                c22769 = new C22769(this, C21605.m48786(interfaceC20758M19382, c1143, uuid), c13596);
                this.f22245 = c22769;
            } catch (Throwable th3) {
                try {
                    c13137M99710.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        throw th;
        return c22769;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19385(C21605 c21605) {
        C22769 c22769;
        m19369();
        C13596 c13596M19381 = m19381();
        if (this.f22245 != null) {
            throw new IllegalStateException("Recovery generation copy is already active");
        }
        if (c13596M19381.f40549.equals(c21605.f69374)) {
            long j = c13596M19381.f40547;
            long j2 = c21605.f69375;
            if (j == j2) {
                if (j2 == C13132.FOREVER_NS) {
                    throw new IOException("Recovery generation exhausted");
                }
                if (m19375(c21605.f69370) != 0) {
                    throw new IOException("Previous recovery generation is still in use or cannot be reclaimed", this.f22246);
                }
                C13596 c13596 = new C13596(c21605.f69374, UUID.randomUUID(), c21605.f69375 + 1, c13596M19381.f40548);
                c22769 = new C22769(this, C21605.m48787(c21605, m19382(c13596)), c13596);
                this.f22245 = c22769;
            }
        }
        throw new IOException("Source does not match current recovery generation");
        return c22769;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m19387(C22769 c22769, long j) {
        m19391(c22769, j);
        m19389(c22769, j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19388(C1143 c1143) {
        if (this.f22244 || this.f22241 || this.f22245 != null) {
            return;
        }
        try {
            m19375(c1143);
        } catch (IOException e) {
            this.f22246 = e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19389(C22769 c22769, long j) {
        C13596 c13596;
        m19369();
        if (c22769 != this.f22245 || c22769.f73523 || j < 0 || c22769.f73521 != j || c22769.f73519 != c22769.f73520.m48808() || ((c13596 = this.f22240) != null && j < c13596.f40548)) {
            throw new IOException("Recovery candidate validation is missing or stale");
        }
        C13596 c13597 = new C13596(c22769.f73524.f40549, c22769.f73524.f40546, c22769.f73524.f40547, j);
        InterfaceC20758 interfaceC20758Resolve = this.f22239.resolve("entry.tmp");
        if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            throw new IOException("Recovery temporary entry requires cleanup");
        }
        try {
            InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
            interfaceC23015.mo28632(interfaceC20758Resolve, m19373(c13597));
            this.f22241 = true;
            interfaceC23015.mo28631(interfaceC20758Resolve, this.f22239.resolve("current"));
            interfaceC23015.mo28630(this.f22239);
            this.f22240 = c13597;
            c22769.f73524 = c13597;
            this.f22241 = false;
        } catch (IOException | Error | RuntimeException e) {
            try {
                if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
                    InterfaceC23015.f74090.mo28633(interfaceC20758Resolve);
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m19392() {
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        return this.f22240 != null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C13596 m19394() {
        C13596 c13596M19371;
        C13596 c13596M19381 = m19381();
        c13596M19371 = m19371(m19374(this.f22239.resolve("current")));
        if (!c13596M19381.f40549.equals(c13596M19371.f40549) || !c13596M19381.f40546.equals(c13596M19371.f40546) || c13596M19381.f40547 != c13596M19371.f40547 || c13596M19381.f40548 != c13596M19371.f40548) {
            throw new IOException("Published recovery entry changed outside its owner");
        }
        return c13596M19371;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19383(C1143 c1143) {
        C22769 c22769;
        m19369();
        if (this.f22240 != null || this.f22245 != null) {
            throw new IllegalStateException("Recovery generation already exists");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        C21605 c21605M48783 = C21605.m48783(InterfaceC23015.f74090.mo28628(this.f22239.resolve("generation-1-" + uuidRandomUUID + ".mt2"), true), c1143);
        c22769 = new C22769(this, c21605M48783, new C13596(c21605M48783.f69374, uuidRandomUUID, 1L, 0L));
        this.f22245 = c22769;
        return c22769;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7247 m19363(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        C17229.createDirectory(absolutePath, new InterfaceC22168[0]);
        InterfaceC20758 parent = absolutePath.getParent();
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        interfaceC23015.mo28630(parent);
        C7247 c7247 = new C7247(absolutePath, true);
        try {
            c7247.f22242.force(true);
            interfaceC23015.mo28630(absolutePath);
            return c7247;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c7247.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7247 m19379(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        C7247 c7247 = new C7247(absolutePath, false);
        try {
            c7247.f22240 = m19371(m19374(absolutePath.resolve("current")));
            return c7247;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c7247.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19372(InterfaceC20758 interfaceC20758) throws IOException {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (C17229.exists(absolutePath, enumC14406)) {
            if (!C17229.isDirectory(absolutePath, enumC14406) || !C17229.isRegularFile(absolutePath.resolve("session.lock"), enumC14406)) {
                throw new IOException("Recovery deletion requires an owned directory");
            }
            InterfaceC20758 interfaceC20758ResolveSibling = absolutePath.resolveSibling(absolutePath.getFileName() + "-deleted-" + UUID.randomUUID());
            C7247 c7247 = new C7247(absolutePath, false);
            try {
                C17229.move(absolutePath, interfaceC20758ResolveSibling, EnumC2413.ATOMIC_MOVE);
                interfaceC23015.mo28630(absolutePath.getParent());
                c7247.close();
                InterfaceC17664 interfaceC17664Walk = C17229.walk(interfaceC20758ResolveSibling, new EnumC10880[0]);
                try {
                    Iterator it = interfaceC17664Walk.sorted(C8200.reverseOrder()).toList().iterator();
                    while (it.hasNext()) {
                        C17229.delete((InterfaceC20758) it.next());
                    }
                    interfaceC17664Walk.close();
                    interfaceC23015.mo28630(absolutePath.getParent());
                } catch (Throwable th) {
                    if (interfaceC17664Walk != null) {
                        try {
                            interfaceC17664Walk.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c7247.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C7247 m19378(InterfaceC20758 interfaceC20758) throws IOException {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        try {
            C17229.createDirectory(absolutePath, new InterfaceC22168[0]);
        } catch (FileAlreadyExistsException e) {
            if (!C17229.isDirectory(absolutePath, EnumC14406.NOFOLLOW_LINKS)) {
                throw new IOException("Migration path is not a directory", e);
            }
        }
        InterfaceC20758 parent = absolutePath.getParent();
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        interfaceC23015.mo28630(parent);
        InterfaceC20758 interfaceC20758Resolve = absolutePath.resolve("session.lock");
        if (!C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            DirectoryStream directoryStreamNewDirectoryStream = C17229.newDirectoryStream(absolutePath);
            try {
                if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                    throw new IOException("Migration directory has no ownership lock");
                }
                directoryStreamNewDirectoryStream.close();
                try {
                    C17229.createFile(interfaceC20758Resolve, new InterfaceC22168[0]);
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
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(interfaceC20758Resolve, enumC14406)) {
            throw new IOException("Migration ownership lock is not a regular file");
        }
        C7247 c7247 = new C7247(absolutePath, false);
        try {
            c7247.f22242.force(true);
            interfaceC23015.mo28630(absolutePath);
            if (C17229.exists(absolutePath.resolve("current"), enumC14406)) {
                c7247.f22240 = m19371(m19374(absolutePath.resolve("current")));
            }
            return c7247;
        } catch (IOException | Error | RuntimeException e2) {
            try {
                c7247.close();
            } catch (IOException e3) {
                e2.addSuppressed(e3);
            }
            throw e2;
        }
    }

    public C7247(InterfaceC20758 interfaceC20758, boolean z) throws Throwable {
        this.f22239 = interfaceC20758;
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("session.lock");
        FileChannel fileChannelOpen = z ? C12084.open(interfaceC20758Resolve, EnumC3824.CREATE_NEW, EnumC3824.READ, EnumC3824.WRITE) : C12084.open(interfaceC20758Resolve, EnumC3824.READ, EnumC3824.WRITE);
        this.f22242 = fileChannelOpen;
        try {
            try {
                FileLock fileLockTryLock = fileChannelOpen.tryLock();
                this.f22243 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    throw new IOException("Recovery directory is already in use");
                }
            } catch (OverlappingFileLockException e) {
                throw new IOException("Recovery directory is already in use", e);
            }
        } catch (IOException e2) {
            e = e2;
            try {
                this.f22242.close();
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
            throw e;
        } catch (Error e4) {
            e = e4;
            this.f22242.close();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            this.f22242.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19393() {
        return this.f22241;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m19382(C13596 c13596) {
        return this.f22239.resolve("generation-" + c13596.f40547 + "-" + c13596.f40546 + ".mt2");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m19375(C1143 c1143) throws IOException {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        this.f22246 = null;
        InterfaceC20758 interfaceC20758 = this.f22239;
        DirectoryStream<InterfaceC20758> directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
        try {
            int i = 0;
            int i2 = 0;
            for (InterfaceC20758 interfaceC20759 : directoryStreamNewDirectoryStream) {
                i2++;
                if (i2 > 1024) {
                    throw new IOException("Recovery directory cleanup scan limit exceeded");
                }
                if (interfaceC20759.getFileName().toString().equals("entry.tmp")) {
                    try {
                        interfaceC23015.mo28633(interfaceC20759);
                        interfaceC23015.mo28630(interfaceC20758);
                    } catch (IOException e) {
                        this.f22246 = e;
                        i++;
                    }
                } else {
                    C13596 c13596M19376 = m19376(interfaceC20759);
                    if (c13596M19376 != null) {
                        try {
                            m19366(c13596M19376, c1143);
                        } catch (IOException e2) {
                            this.f22246 = e2;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C13596 m19376(InterfaceC20758 interfaceC20758) {
        int iIndexOf;
        if (!C17229.isRegularFile(interfaceC20758, EnumC14406.NOFOLLOW_LINKS)) {
            return null;
        }
        String string = interfaceC20758.getFileName().toString();
        if (!string.startsWith("generation-") || (iIndexOf = string.indexOf(45, 11)) < 0 || !string.endsWith(".mt2")) {
            return null;
        }
        try {
            long j = Long.parseLong(string.substring(11, iIndexOf));
            UUID uuidFromString = UUID.fromString(string.substring(iIndexOf + 1, string.length() - 4));
            if (j >= 1 && !uuidFromString.equals(this.f22240.f40546)) {
                C13596 c13596 = new C13596(this.f22240.f40549, uuidFromString, j, 0L);
                if (m19382(c13596).equals(interfaceC20758)) {
                    return c13596;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19366(C13596 c13596, C1143 c1143) throws IOException {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 interfaceC20758M19382 = m19382(c13596);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (C17229.exists(interfaceC20758M19382, enumC14406)) {
            if (!C17229.isRegularFile(interfaceC20758M19382, enumC14406)) {
                throw new IOException("Recovery generation is not a regular file");
            }
            C21605 c21605M48785 = C21605.m48785(interfaceC20758M19382, c1143);
            try {
                if (!c13596.f40549.equals(c21605M48785.f69374) || c13596.f40547 != c21605M48785.f69375) {
                    throw new IOException("Obsolete recovery generation identity does not match");
                }
                interfaceC23015.mo28633(interfaceC20758M19382);
                interfaceC23015.mo28630(this.f22239);
                c21605M48785.close();
            } catch (Throwable th) {
                try {
                    c21605M48785.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19365(C7247 c7247, C13596 c13596, C21605 c21605, Throwable th) {
        C13596 c13597;
        synchronized (c7247) {
            if (!c7247.f22244 && !c7247.f22241 && ((c13597 = c7247.f22240) == null || !c13597.f40546.equals(c13596.f40546))) {
                if (th != null) {
                    c7247.f22246 = new IOException("Obsolete recovery generation failed to close", th);
                    return;
                }
                try {
                    c7247.m19366(c13596, c21605.f69370);
                } catch (IOException e) {
                    c7247.f22246 = e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19391(C22769 c22769, long j) {
        m19386(j, c22769, new RunnableC0709());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m19386(long j, C22769 c22769, Runnable runnable) {
        C13596 c13596;
        m19369();
        if (c22769 != this.f22245 || c22769.f73523 || j < 0 || ((c13596 = this.f22240) != null && j < c13596.f40548)) {
            throw new IllegalArgumentException("Invalid recovery generation publication");
        }
        C13596 c13597 = new C13596(c22769.f73524.f40549, c22769.f73524.f40546, c22769.f73524.f40547, j);
        long jM48808 = c22769.f73520.m48808();
        m19367(c13597, c22769.f73520.f69370, runnable);
        if (jM48808 != c22769.f73520.m48808()) {
            throw new IOException("Recovery candidate changed during validation");
        }
        c22769.f73521 = j;
        c22769.f73519 = jM48808;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19367(C13596 c13596, C1143 c1143, Runnable runnable) throws Exception {
        C21605 c21605M48793 = C21605.m48793(C3260.m9980(m19382(c13596)), c1143);
        try {
            C9323 c9323M22371 = new C8617(c21605M48793, runnable).m22371(C20612.f66331);
            try {
                long j = c9323M22371.f28277;
                m19368(c13596, c21605M48793, j);
                if (j != c13596.f40548 || c9323M22371.f28285 != 0 || c9323M22371.f28278 != null) {
                    throw new IOException("Recovery candidate is not an exact complete commit");
                }
                c9323M22371.close();
                c21605M48793.close();
                return;
            } catch (Throwable th) {
                try {
                    c9323M22371.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c21605M48793.close();
            throw th3;
        }
        try {
            c21605M48793.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m19390() {
        return C17229.getFileStore(this.f22239).getUsableSpace();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19368(C13596 c13596, C21605 c21605, long j) throws IOException {
        if (!c13596.f40549.equals(c21605.f69374) || c13596.f40547 != c21605.f69375 || j < c13596.f40548) {
            throw new IOException("Recovery generation identity or acknowledged revision does not match entry");
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m19369() throws IOException {
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        if (this.f22241) {
            throw new IOException("Recovery entry publication requires reopening");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static byte[] m19374(InterfaceC20758 interfaceC20758) throws IOException {
        FileChannel fileChannelOpen = C12084.open(interfaceC20758, EnumC3824.READ);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m19373(C13596 c13596) {
        C10130 c10130 = new C10130(80);
        c10130.writeInt(1162097229);
        c10130.writeInt(1);
        UUID uuid = c13596.f40549;
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        UUID uuid2 = c13596.f40546;
        c10130.m25431(uuid2.getMostSignificantBits());
        c10130.m25431(uuid2.getLeastSignificantBits());
        c10130.m25431(c13596.f40547);
        c10130.m25431(c13596.f40548);
        while (c10130.size() < 76) {
            c10130.writeByte(0);
        }
        c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13596 m19371(byte[] bArr) throws IOException {
        if (bArr.length != 80) {
            throw new IOException("Invalid recovery entry length");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != 1162097229 || c12951.readInt() != 1) {
            throw new IOException("Unsupported recovery entry");
        }
        UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
        UUID uuid2 = new UUID(c12951.readLong(), c12951.readLong());
        long j = c12951.readLong();
        long j2 = c12951.readLong();
        if (j <= 0 || j2 < 0) {
            throw new IOException("Invalid recovery entry generation");
        }
        while (c12951.available() > 4) {
            if (c12951.readByte() != 0) {
                throw new IOException("Unsupported recovery entry fields");
            }
        }
        if (c12951.readInt() != C1829.m6061(0, 76, bArr)) {
            throw new IOException("Invalid recovery entry checksum");
        }
        return new C13596(uuid, uuid2, j, j2);
    }
}
