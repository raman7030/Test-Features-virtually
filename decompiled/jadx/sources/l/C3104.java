package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3104 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9709 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f9710;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Uri f9711;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f9712;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f9713;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9714;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f9715;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f9716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f9717;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f9718;

    public /* synthetic */ C3104(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, int i3) {
        this(uri, j, i, bArr, map, j2, j3, str, i2);
    }

    static {
        C16840.m39615("media3.datasource");
    }

    public C3104(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        C22632.m50631(j + j2 >= 0);
        C22632.m50631(j2 >= 0);
        C22632.m50631(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f9711 = uri;
        this.f9717 = j;
        this.f9714 = i;
        this.f9712 = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f9716 = C20195.unmodifiableMap(new HashMap(map));
        this.f9718 = j2;
        this.f9713 = j3;
        this.f9715 = str;
        this.f9710 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4515 m9467() {
        return new C4515(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3104 m9466(long j, long j2) {
        if (j == 0 && this.f9713 == j2) {
            return this;
        }
        return new C3104(this.f9711, this.f9717, this.f9714, this.f9712, this.f9716, this.f9718 + j, j2, this.f9715, this.f9710);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f9714;
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
        sb.append(this.f9711);
        sb.append(", ");
        sb.append(this.f9718);
        sb.append(", ");
        sb.append(this.f9713);
        sb.append(", ");
        sb.append(this.f9715);
        sb.append(", ");
        return C3200.m9831(this.f9710, "]", sb);
    }
}
