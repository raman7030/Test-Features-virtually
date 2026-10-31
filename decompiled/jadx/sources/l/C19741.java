package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19741 implements Closeable {
    public final boolean a;
    public final EnumC14406[] b;
    public final int c;
    public final ArrayDeque d = new ArrayDeque();
    public boolean e;

    public C19741(Collection collection, int i) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (AbstractC7040.a[((EnumC10880) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.a = z;
        this.b = z ? new EnumC14406[0] : new EnumC14406[]{EnumC14406.NOFOLLOW_LINKS};
        this.c = i;
    }

    public final InterfaceC15111 b(InterfaceC20758 interfaceC20758) throws IOException {
        try {
            return C17229.readAttributes(interfaceC20758, InterfaceC15111.class, this.b);
        } catch (IOException e) {
            if (this.a) {
                return C17229.readAttributes(interfaceC20758, InterfaceC15111.class, EnumC14406.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final C16211 e(InterfaceC20758 interfaceC20758, boolean z) {
        try {
            InterfaceC15111 interfaceC15111B = b(interfaceC20758);
            if (this.d.size() >= this.c || !interfaceC15111B.isDirectory()) {
                return new C16211(EnumC4218.ENTRY, interfaceC20758, interfaceC15111B, null);
            }
            if (this.a) {
                Object objFileKey = interfaceC15111B.fileKey();
                for (C9863 c9863 : this.d) {
                    Object obj = c9863.b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C16211(EnumC4218.ENTRY, interfaceC20758, null, new FileSystemLoopException(interfaceC20758.toString()));
                        }
                    } else {
                        try {
                            if (C17229.isSameFile(interfaceC20758, c9863.a)) {
                                return new C16211(EnumC4218.ENTRY, interfaceC20758, null, new FileSystemLoopException(interfaceC20758.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                        }
                    }
                }
            }
            try {
                this.d.push(new C9863(interfaceC20758, interfaceC15111B.fileKey(), C17229.newDirectoryStream(interfaceC20758)));
                return new C16211(EnumC4218.START_DIRECTORY, interfaceC20758, interfaceC15111B, null);
            } catch (IOException e) {
                return new C16211(EnumC4218.ENTRY, interfaceC20758, null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new C16211(EnumC4218.ENTRY, interfaceC20758, null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    public final C16211 d() {
        InterfaceC20758 interfaceC20758;
        IOException cause;
        C16211 c16211E;
        C9863 c9863 = (C9863) this.d.peek();
        if (c9863 == null) {
            return null;
        }
        do {
            if (c9863.e) {
                interfaceC20758 = null;
                cause = null;
            } else {
                Iterator it = c9863.d;
                try {
                    interfaceC20758 = it.hasNext() ? (InterfaceC20758) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    interfaceC20758 = null;
                }
            }
            if (interfaceC20758 == null) {
                try {
                    c9863.c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.d.pop();
                return new C16211(EnumC4218.END_DIRECTORY, c9863.a, null, cause);
            }
            c16211E = e(interfaceC20758, true);
        } while (c16211E == null);
        return c16211E;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        while (!this.d.isEmpty()) {
            if (!this.d.isEmpty()) {
                try {
                    ((C9863) this.d.pop()).c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.e = true;
    }
}
