package p067l;

import android.net.Uri;
import android.util.Base64;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۚ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7330 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۜ */
    public int f19188;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f19189;

    /* JADX INFO: renamed from: ܿ */
    public int f19190;

    /* JADX INFO: renamed from: ᩻ */
    public C5318 f19191;

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C10998, C23423 {
        m9837(c5318);
        this.f19191 = c5318;
        Uri uri = c5318.f12514;
        long j = c5318.f12516;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C23877.m52956("Unsupported scheme: " + scheme, AbstractC0213e.f989m.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = C5792.f14228;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C10998.m25386("Unexpected URI format: " + uriNormalizeScheme, (IllegalArgumentException) null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f19189 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw C10998.m25386("Error while parsing Base64 encoded string: " + str2, e);
            }
        } else {
            this.f19189 = C5136.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c5318.f12521;
        byte[] bArr = this.f19189;
        if (j2 > bArr.length) {
            this.f19189 = null;
            throw new C23423(2008);
        }
        int i = (int) j2;
        this.f19188 = i;
        int length = bArr.length - i;
        this.f19190 = length;
        if (j != -1) {
            this.f19190 = (int) Math.min(length, j);
        }
        m9839(c5318);
        return j != -1 ? j : this.f19190;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f19190;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f19189;
        String str = C5792.f14228;
        System.arraycopy(bArr2, this.f19188, bArr, i, iMin);
        this.f19188 += iMin;
        this.f19190 -= iMin;
        m9840(iMin);
        return iMin;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        C5318 c5318 = this.f19191;
        if (c5318 != null) {
            return c5318.f12514;
        }
        return null;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        if (this.f19189 != null) {
            this.f19189 = null;
            m9838();
        }
        this.f19191 = null;
    }
}
