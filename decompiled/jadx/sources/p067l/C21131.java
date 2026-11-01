package p067l;

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
public final class C21131 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final boolean f66409a;

    /* JADX INFO: renamed from: b */
    public final EnumC16060[] f66410b;

    /* JADX INFO: renamed from: c */
    public final int f66411c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f66412d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public boolean f66413e;

    public C21131(Collection collection, int i) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (AbstractC9060.f24567a[((EnumC12709) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.f66409a = z;
        this.f66410b = z ? new EnumC16060[0] : new EnumC16060[]{EnumC16060.NOFOLLOW_LINKS};
        this.f66411c = i;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC16730 m47757b(InterfaceC22097 interfaceC22097) throws IOException {
        try {
            return C18743.readAttributes(interfaceC22097, InterfaceC16730.class, this.f66410b);
        } catch (IOException e) {
            if (this.f66409a) {
                return C18743.readAttributes(interfaceC22097, InterfaceC16730.class, EnumC16060.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C17776 m47759e(InterfaceC22097 interfaceC22097, boolean z) {
        try {
            InterfaceC16730 interfaceC16730M47757b = m47757b(interfaceC22097);
            if (this.f66412d.size() >= this.f66411c || !interfaceC16730M47757b.isDirectory()) {
                return new C17776(EnumC6378.ENTRY, interfaceC22097, interfaceC16730M47757b, null);
            }
            if (this.f66409a) {
                Object objFileKey = interfaceC16730M47757b.fileKey();
                for (C11743 c11743 : this.f66412d) {
                    Object obj = c11743.f32790b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C17776(EnumC6378.ENTRY, interfaceC22097, null, new FileSystemLoopException(interfaceC22097.toString()));
                        }
                    } else {
                        try {
                            if (C18743.isSameFile(interfaceC22097, c11743.f32789a)) {
                                return new C17776(EnumC6378.ENTRY, interfaceC22097, null, new FileSystemLoopException(interfaceC22097.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                        }
                    }
                }
            }
            try {
                this.f66412d.push(new C11743(interfaceC22097, interfaceC16730M47757b.fileKey(), C18743.newDirectoryStream(interfaceC22097)));
                return new C17776(EnumC6378.START_DIRECTORY, interfaceC22097, interfaceC16730M47757b, null);
            } catch (IOException e) {
                return new C17776(EnumC6378.ENTRY, interfaceC22097, null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new C17776(EnumC6378.ENTRY, interfaceC22097, null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final C17776 m47758d() {
        InterfaceC22097 interfaceC22097;
        IOException cause;
        C17776 c17776M47759e;
        C11743 c11743 = (C11743) this.f66412d.peek();
        if (c11743 == null) {
            return null;
        }
        do {
            if (c11743.f32793e) {
                interfaceC22097 = null;
                cause = null;
            } else {
                Iterator it = c11743.f32792d;
                try {
                    interfaceC22097 = it.hasNext() ? (InterfaceC22097) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    interfaceC22097 = null;
                }
            }
            if (interfaceC22097 == null) {
                try {
                    c11743.f32791c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.f66412d.pop();
                return new C17776(EnumC6378.END_DIRECTORY, c11743.f32789a, null, cause);
            }
            c17776M47759e = m47759e(interfaceC22097, true);
        } while (c17776M47759e == null);
        return c17776M47759e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f66413e) {
            return;
        }
        while (!this.f66412d.isEmpty()) {
            if (!this.f66412d.isEmpty()) {
                try {
                    ((C11743) this.f66412d.pop()).f32791c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.f66413e = true;
    }
}
