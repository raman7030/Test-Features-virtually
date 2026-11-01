package p067l;

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
public class C16433 extends AbstractC17043 {

    /* JADX INFO: renamed from: ۗ */
    public String f48296;

    /* JADX INFO: renamed from: ۬ */
    public C14242 f48297;

    @Override // p067l.AbstractC17043
    public String getParent() {
        return null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo29972() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ */
    public boolean mo20484() {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۙ */
    public boolean mo25497() {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۡ */
    public boolean mo37341() {
        return this instanceof C8878;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public boolean mo25502(AbstractC17043 abstractC17043) {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۨ */
    public final void mo37342() {
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫֫ */
    public final boolean mo37343() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܶ */
    public boolean mo20489() {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo29994() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo33653() {
        return true;
    }

    public C16433(Uri uri) {
        this.f48297 = new C14242(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo25088(Uri uri, boolean z) {
        this.f48297 = new C14242(uri);
        mo25099();
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public void mo25099() {
        this.f48296 = null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ */
    public boolean mo25496() {
        try {
            mo25506(false).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    public String getName() {
        if (this.f48296 == null) {
            String strM54868 = C24971.m54868(this.f48297.m32725());
            this.f48296 = strM54868;
            if (strM54868 == null) {
                String path = this.f48297.m32725().getPath();
                if (path == null) {
                    throw new RuntimeException("Can't get name from uri: " + this.f48297.m32725());
                }
                this.f48296 = new File(path).getName();
            }
        }
        return this.f48296;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public String mo25505() {
        return this.f48297.toString();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ֫ */
    public final Uri mo33652() {
        return this.f48297.m32725();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public boolean mo25503() {
        return C24971.m54867(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public boolean mo25094() {
        if (C12799.m29347()) {
            return ((Boolean) m37330(new Callable() { // from class: l.᩺ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C24971.m54869(this.f76964.f48297.m32725()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C24971.m54869(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public boolean mo25093() {
        if (C12799.m29347()) {
            return ((Boolean) m37330(new Callable() { // from class: l.ۤܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C24971.m54871(this.f34170.f48297.m32725()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C24971.m54871(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo25087() {
        if (C12799.m29347()) {
            return ((Boolean) m37330(new Callable() { // from class: l.ᩳ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C24971.m54866(this.f60196.f48297.m32725()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C24971.m54866(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public long mo25101() {
        if (C12799.m29347()) {
            return ((Long) m37330(new Callable() { // from class: l.۟ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C24971.m54870(this.f26254.f48297.m32725()));
                }
            }, (Object) (-1L), 500)).longValue();
        }
        return C24971.m54870(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public long mo25091() {
        if (C12799.m29347()) {
            return ((Long) m37330(new Callable() { // from class: l.ܽ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(C24971.m54864(this.f55158.f48297.m32725()));
                }
            }, (Object) 0L, 500)).longValue();
        }
        return C24971.m54864(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo29997() {
        if (C12799.m29347()) {
            return ((Boolean) m37330(new CallableC15582(0, this), Boolean.FALSE, 500)).booleanValue();
        }
        return C24971.m54863(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo29985() {
        if (C12799.m29347()) {
            return ((Boolean) m37330(new Callable() { // from class: l.ۛܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(C24971.m54865(this.f21776.f48297.m32725()));
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return C24971.m54865(this.f48297.m32725());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public List mo25500(boolean z) {
        return new ArrayList();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo29992() {
        return (List) C7480.stream(mo25500(true)).map(new C9668(0)).collect(C24205.toList());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo29987() {
        return (InputStream) m37329(new Callable() { // from class: l.֫᩸ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C16433.m37337(this.f9813);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ InputStream m37337(C16433 c16433) throws IOException {
        try {
            return C7050.m16233().openInputStream(c16433.f48297.m32725());
        } catch (Error | RuntimeException e) {
            throw new IOException(c16433.mo25505(), e);
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public OutputStream mo25506(final boolean z) {
        return (OutputStream) m37329(new Callable() { // from class: l.ۨܶܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C16433.m37327(this.f38174, z);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ OutputStream m37327(C16433 c16433, boolean z) throws IOException {
        try {
            return C7050.m16233().openOutputStream(c16433.f48297.m32725(), z ? "wa" : "wt");
        } catch (Error | RuntimeException e) {
            throw new IOException(c16433.mo25505(), e);
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo29983() {
        throw new IOException("Unsupported");
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC4502 mo25508(final String str) {
        return (InterfaceC4502) m37329(new Callable() { // from class: l.ۧ᩸ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2489.m3599(this.f36774.f48297.m32725(), str);
            }
        });
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo29982(String str) {
        return (ParcelFileDescriptor) m37329(new CallableC19116(0, this, str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ ParcelFileDescriptor m37334(C16433 c16433, String str) throws IOException {
        try {
            return C7050.m16233().openFileDescriptor(c16433.f48297.m32725(), str);
        } catch (Error | RuntimeException e) {
            throw new IOException(c16433.mo25505(), e);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public static int m37332(String str) {
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
        throw new IllegalArgumentException(C21466.m48631("Invalid mode: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m37329(Callable callable) throws IOException {
        Future futureSubmit = C4081.f8987.submit(callable);
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

    /* JADX INFO: renamed from: ֫ */
    public static Object m37330(Callable callable, Object obj, int i) {
        Future futureSubmit = C4081.f8987.submit(callable);
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
