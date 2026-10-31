package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܺ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8KN */
/* JADX INFO: loaded from: classes5.dex */
public final class C15803 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f48754;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f48755;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AssetManager f48756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f48757;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InputStream f48758;

    public C15803(Context context) {
        super(false);
        this.f48756 = context.getAssets();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws C8749 {
        try {
            Uri uri = c3104.f9711;
            long j = c3104.f9718;
            this.f48757 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m7774(c3104);
            InputStream inputStreamOpen = this.f48756.open(path, 1);
            this.f48758 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C8749(2008, null);
            }
            long j2 = c3104.f9713;
            if (j2 != -1) {
                this.f48755 = j2;
            } else {
                long jAvailable = this.f48758.available();
                this.f48755 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f48755 = -1L;
                }
            }
            this.f48754 = true;
            m7776(c3104);
            return this.f48755;
        } catch (C8749 e) {
            throw e;
        } catch (IOException e2) {
            throw new C8749(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C8749 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f48755;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C8749(2000, e);
                }
            }
            InputStream inputStream = this.f48758;
            String str = C3603.f11424;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f48755;
                if (j2 != -1) {
                    this.f48755 = j2 - ((long) i3);
                }
                m7777(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f48757;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // l.InterfaceC21449
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f48757 = null;
        try {
            InputStream inputStream = this.f48758;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f48758 = null;
            if (this.f48754) {
                this.f48754 = false;
                m7775();
            }
        } catch (IOException e) {
            throw new C8749(2000, e);
        }
    }
}
