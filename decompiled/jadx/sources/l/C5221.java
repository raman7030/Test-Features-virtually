package l;

import android.net.Uri;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۚ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5221 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16348;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f16349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f16350;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3104 f16351;

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws C9080, C22154 {
        m7774(c3104);
        this.f16351 = c3104;
        Uri uri = c3104.f9711;
        long j = c3104.f9713;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C22632.m50630("Unsupported scheme: " + scheme, e.m.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = C3603.f11424;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C9080.m23439("Unexpected URI format: " + uriNormalizeScheme, (IllegalArgumentException) null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f16349 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw C9080.m23439("Error while parsing Base64 encoded string: " + str2, e);
            }
        } else {
            this.f16349 = C2912.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c3104.f9718;
        byte[] bArr = this.f16349;
        if (j2 > bArr.length) {
            this.f16349 = null;
            throw new C22154(2008);
        }
        int i = (int) j2;
        this.f16348 = i;
        int length = bArr.length - i;
        this.f16350 = length;
        if (j != -1) {
            this.f16350 = (int) Math.min(length, j);
        }
        m7776(c3104);
        return j != -1 ? j : this.f16350;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f16350;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f16349;
        String str = C3603.f11424;
        System.arraycopy(bArr2, this.f16348, bArr, i, iMin);
        this.f16348 += iMin;
        this.f16350 -= iMin;
        m7777(iMin);
        return iMin;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        C3104 c3104 = this.f16351;
        if (c3104 != null) {
            return c3104.f9711;
        }
        return null;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        if (this.f16349 != null) {
            this.f16349 = null;
            m7775();
        }
        this.f16351 = null;
    }
}
