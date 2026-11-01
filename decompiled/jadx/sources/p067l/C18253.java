package p067l;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ܽܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18253 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public Uri f54516;

    /* JADX INFO: renamed from: ܳ */
    public RandomAccessFile f54517;

    /* JADX INFO: renamed from: ܿ */
    public long f54518;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f54519;

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C12890 {
        Uri uri = c5318.f12514;
        long j = c5318.f12521;
        this.f54516 = uri;
        m9837(c5318);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f54517 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c5318.f12516;
                if (length == -1) {
                    length = this.f54517.length() - j;
                }
                this.f54518 = length;
                if (length < 0) {
                    throw new C12890(null, null, 2008);
                }
                this.f54519 = true;
                m9839(c5318);
                return this.f54518;
            } catch (IOException e) {
                throw new C12890(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C12890(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM12525 = C5633.m12525("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM12525.append(fragment);
            throw new C12890(sbM12525.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C12890(2006, e3);
        } catch (RuntimeException e4) {
            throw new C12890(2000, e4);
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C12890 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f54518;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f54517;
            String str = C5792.f14228;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f54518 -= (long) i3;
                m9840(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C12890(2000, e);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f54516;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // p067l.InterfaceC22753
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f54516 = null;
        try {
            RandomAccessFile randomAccessFile = this.f54517;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f54517 = null;
            if (this.f54519) {
                this.f54519 = false;
                m9838();
            }
        } catch (IOException e) {
            throw new C12890(2000, e);
        }
    }
}
