package l;

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
public final class C16714 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Uri f51332;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f51333;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51334;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51335;

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws C11071 {
        Uri uri = c3104.f9711;
        long j = c3104.f9718;
        this.f51332 = uri;
        m7774(c3104);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f51333 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c3104.f9713;
                if (length == -1) {
                    length = this.f51333.length() - j;
                }
                this.f51334 = length;
                if (length < 0) {
                    throw new C11071(null, null, 2008);
                }
                this.f51335 = true;
                m7776(c3104);
                return this.f51334;
            } catch (IOException e) {
                throw new C11071(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C11071(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM10501 = C3435.m10501("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM10501.append(fragment);
            throw new C11071(sbM10501.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C11071(2006, e3);
        } catch (RuntimeException e4) {
            throw new C11071(2000, e4);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C11071 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f51334;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f51333;
            String str = C3603.f11424;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f51334 -= (long) i3;
                m7777(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C11071(2000, e);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f51332;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // l.InterfaceC21449
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f51332 = null;
        try {
            RandomAccessFile randomAccessFile = this.f51333;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f51333 = null;
            if (this.f51335) {
                this.f51335 = false;
                m7775();
            }
        } catch (IOException e) {
            throw new C11071(2000, e);
        }
    }
}
