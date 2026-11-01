package p067l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܺ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8KN */
/* JADX INFO: loaded from: classes5.dex */
public final class C17387 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f51892;

    /* JADX INFO: renamed from: ܳ */
    public long f51893;

    /* JADX INFO: renamed from: ܿ */
    public final AssetManager f51894;

    /* JADX INFO: renamed from: ᩷ */
    public Uri f51895;

    /* JADX INFO: renamed from: ᩻ */
    public InputStream f51896;

    public C17387(Context context) {
        super(false);
        this.f51894 = context.getAssets();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C10683 {
        try {
            Uri uri = c5318.f12514;
            long j = c5318.f12521;
            this.f51895 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m9837(c5318);
            InputStream inputStreamOpen = this.f51894.open(path, 1);
            this.f51896 = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C10683(2008, null);
            }
            long j2 = c5318.f12516;
            if (j2 != -1) {
                this.f51893 = j2;
            } else {
                long jAvailable = this.f51896.available();
                this.f51893 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f51893 = -1L;
                }
            }
            this.f51892 = true;
            m9839(c5318);
            return this.f51893;
        } catch (C10683 e) {
            throw e;
        } catch (IOException e2) {
            throw new C10683(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C10683 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f51893;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C10683(2000, e);
                }
            }
            InputStream inputStream = this.f51896;
            String str = C5792.f14228;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f51893;
                if (j2 != -1) {
                    this.f51893 = j2 - ((long) i3);
                }
                m9840(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f51895;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // p067l.InterfaceC22753
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f51895 = null;
        try {
            InputStream inputStream = this.f51896;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f51896 = null;
            if (this.f51892) {
                this.f51892 = false;
                m9838();
            }
        } catch (IOException e) {
            throw new C10683(2000, e);
        }
    }
}
