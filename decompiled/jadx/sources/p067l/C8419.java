package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8419 extends AbstractC24196 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final String f22569;

    /* JADX INFO: renamed from: ۙ */
    public final String f22570;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C13784 f22571;

    /* JADX INFO: renamed from: ۫ */
    public boolean f22572;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC24196 f22573;

    /* JADX INFO: renamed from: ᩶ */
    public final File f22574;

    /* JADX INFO: renamed from: ᩸ */
    public final C13468 f22575;

    /* JADX INFO: renamed from: ᩹ */
    public final C12443 f22576;

    public C8419(C13784 c13784, AbstractC24196 abstractC24196, C13468 c13468, File file, C12443 c12443) {
        this.f22571 = c13784;
        this.f22573 = abstractC24196;
        this.f22575 = c13468;
        this.f22574 = file;
        this.f22576 = c12443;
        this.f22570 = abstractC24196.mo8382();
        this.f22569 = abstractC24196.mo8379();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f22570;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f22569;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۜ */
    public final File mo19605() {
        return this.f22574;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() throws IOException {
        C13784 c13784 = this.f22571;
        c13784.m31436();
        if (!this.f22572 && !c13784.f38974) {
            File file = this.f22574;
            return file == null ? this.f22573.mo8380() : new FileInputStream(file);
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() throws IOException {
        C13784 c13784 = this.f22571;
        c13784.m31436();
        if (!this.f22572 && !c13784.f38974) {
            C12443 c12443 = this.f22576;
            C13468 c13468 = this.f22575;
            if (c12443 == null) {
                this.f22573.m53500(c13468);
            }
            return c13468;
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C13784 c13784 = this.f22571;
        c13784.m31436();
        if (this.f22572) {
            return;
        }
        this.f22572 = true;
        C12443 c12443 = this.f22576;
        if (c12443 != null) {
            c12443.f34785 = true;
            c13784.m31432();
        }
    }
}
