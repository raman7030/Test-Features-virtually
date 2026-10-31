package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ܳ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes4.dex */
public class C14798 extends AbstractC15440 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f45182;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12493 f45183;

    @Override // l.AbstractC15440
    public String getParent() {
        return null;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo27911() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨ */
    public boolean mo18535() {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۙ */
    public boolean mo23546() {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean mo35194() {
        return this instanceof C6849;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public boolean mo23551(AbstractC15440 abstractC15440) {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo35195() {
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final boolean mo35196() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܶ */
    public boolean mo18540() {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo27933() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo31568() {
        return true;
    }

    public C14798(Uri uri) {
        this.f45183 = new C12493(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23114(Uri uri, boolean z) {
        this.f45183 = new C12493(uri);
        mo23125();
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public void mo23125() {
        this.f45182 = null;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۗ */
    public boolean mo23545() {
        try {
            mo23555(false).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15440
    public String getName() {
        if (this.f45182 == null) {
            String strM52459 = C23782.m52459(this.f45183.m30660());
            this.f45182 = strM52459;
            if (strM52459 == null) {
                String path = this.f45183.m30660().getPath();
                if (path == null) {
                    throw new RuntimeException("Can't get name from uri: " + this.f45183.m30660());
                }
                this.f45182 = new File(path).getName();
            }
        }
        return this.f45182;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ֫ */
    public String mo23554() {
        return this.f45183.toString();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ֫ */
    public final Uri mo31567() {
        return this.f45183.m30660();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۬ */
    public boolean mo23552() {
        return C23782.m52458(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۤ */
    public boolean mo23120() {
        if (C10975.m27285()) {
            return ((Boolean) m35183(new Callable() { // from class: l.᩺ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C23782.m52460(this.f74219.f45183.m30660()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C23782.m52460(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠֫ */
    public boolean mo23119() {
        if (C10975.m27285()) {
            return ((Boolean) m35183(new Callable() { // from class: l.ۤܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C23782.m52462(this.f31208.f45183.m30660()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C23782.m52462(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo23113() {
        if (C10975.m27285()) {
            return ((Boolean) m35183(new Callable() { // from class: l.ᩳ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C23782.m52457(this.f56978.f45183.m30660()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C23782.m52457(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺֫ */
    public long mo23127() {
        if (C10975.m27285()) {
            return ((Long) m35183(new Callable() { // from class: l.۟ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C23782.m52461(this.f23342.f45183.m30660()));
                }
            }, (Object) (-1L), 500)).longValue();
        }
        return C23782.m52461(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۛ֫ */
    public long mo23117() {
        if (C10975.m27285()) {
            return ((Long) m35183(new Callable() { // from class: l.ܽ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C23782.m52455(this.f51978.f45183.m30660()));
                }
            }, (Object) 0L, 500)).longValue();
        }
        return C23782.m52455(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo27936() {
        if (C10975.m27285()) {
            return ((Boolean) m35183(new CallableC13903(0, this), Boolean.FALSE, 500)).booleanValue();
        }
        return C23782.m52454(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo27924() {
        if (C10975.m27285()) {
            return ((Boolean) m35183(new Callable() { // from class: l.ۛܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C23782.m52456(this.f18919.f45183.m30660()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C23782.m52456(this.f45183.m30660());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public List mo23549(boolean z) {
        return new ArrayList();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo27931() {
        return (List) C5378.stream(mo23549(true)).map(new C7680(0)).collect(C22976.toList());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo27926() {
        return (InputStream) m35182(new Callable() { // from class: l.֫᩸ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C14798.m35190(this.f7029);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m35190(C14798 c14798) throws IOException {
        try {
            return C4925.m14336().openInputStream(c14798.f45183.m30660());
        } catch (Error | RuntimeException e) {
            throw new IOException(c14798.mo23554(), e);
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ */
    public OutputStream mo23555(final boolean z) {
        return (OutputStream) m35182(new Callable() { // from class: l.ۨܶܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C14798.m35180(this.f35175, z);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ OutputStream m35180(C14798 c14798, boolean z) throws IOException {
        try {
            return C4925.m14336().openOutputStream(c14798.f45183.m30660(), z ? "wa" : "wt");
        } catch (Error | RuntimeException e) {
            throw new IOException(c14798.mo23554(), e);
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo27922() {
        throw new IOException("Unsupported");
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC2245 mo23557(final String str) {
        return (InterfaceC2245) m35182(new Callable() { // from class: l.ۧ᩸ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0127.m1198(this.f33774.f45183.m30660(), str);
            }
        });
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo27921(String str) {
        return (ParcelFileDescriptor) m35182(new CallableC17621(0, this, str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ParcelFileDescriptor m35187(C14798 c14798, String str) throws IOException {
        try {
            return C4925.m14336().openFileDescriptor(c14798.f45183.m30660(), str);
        } catch (Error | RuntimeException e) {
            throw new IOException(c14798.mo23554(), e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m35185(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C20094.m46315("Invalid mode: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m35182(Callable callable) throws IOException {
        Future futureSubmit = C1802.f6208.submit(callable);
        try {
            return futureSubmit.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            throw new IOException("Timeout", e3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m35183(Callable callable, Object obj, int i) {
        Future futureSubmit = C1802.f6208.submit(callable);
        try {
            return futureSubmit.get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            return obj;
        } catch (TimeoutException unused2) {
            futureSubmit.cancel(true);
            return obj;
        }
    }
}
