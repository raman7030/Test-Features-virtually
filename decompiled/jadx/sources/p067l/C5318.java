package p067l;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5318 {

    /* JADX INFO: renamed from: ۢ */
    public static final /* synthetic */ int f12512 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final int f12513;

    /* JADX INFO: renamed from: ۜ */
    public final Uri f12514;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f12515;

    /* JADX INFO: renamed from: ܳ */
    public final long f12516;

    /* JADX INFO: renamed from: ܽ */
    public final int f12517;

    /* JADX INFO: renamed from: ܿ */
    public final String f12518;

    /* JADX INFO: renamed from: ᩳ */
    public final Map f12519;

    /* JADX INFO: renamed from: ᩷ */
    public final long f12520;

    /* JADX INFO: renamed from: ᩻ */
    public final long f12521;

    public /* synthetic */ C5318(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, int i3) {
        this(uri, j, i, bArr, map, j2, j3, str, i2);
    }

    static {
        C18373.m41851("media3.datasource");
    }

    public C5318(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        C23877.m52957(j + j2 >= 0);
        C23877.m52957(j2 >= 0);
        C23877.m52957(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f12514 = uri;
        this.f12520 = j;
        this.f12517 = i;
        this.f12515 = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f12519 = C21562.unmodifiableMap(new HashMap(map));
        this.f12521 = j2;
        this.f12516 = j3;
        this.f12518 = str;
        this.f12513 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6659 m11510() {
        return new C6659(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5318 m11509(long j, long j2) {
        if (j == 0 && this.f12516 == j2) {
            return this;
        }
        return new C5318(this.f12514, this.f12520, this.f12517, this.f12515, this.f12519, this.f12521 + j, j2, this.f12518, this.f12513);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f12517;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f12514);
        sb.append(", ");
        sb.append(this.f12521);
        sb.append(", ");
        sb.append(this.f12516);
        sb.append(", ");
        sb.append(this.f12518);
        sb.append(", ");
        return C5410.m11876(this.f12513, "]", sb);
    }
}
