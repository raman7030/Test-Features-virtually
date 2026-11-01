package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes4.dex */
public final class C21416 {

    /* JADX INFO: renamed from: ֫ */
    public final String f67578;

    /* JADX INFO: renamed from: ۧ */
    public final String f67579;

    /* JADX INFO: renamed from: ܳ */
    public final Boolean f67580;

    /* JADX INFO: renamed from: ܽ */
    public final String f67581;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f67582;

    /* JADX INFO: renamed from: ᩳ */
    public final long f67583;

    public C21416(boolean z, String str, String str2, long j, String str3, Boolean bool) {
        this.f67582 = z;
        this.f67578 = str;
        this.f67581 = str2;
        this.f67583 = j;
        this.f67579 = str3;
        this.f67580 = bool;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21416 m48550(C24959 c24959) {
        Map map = c24959.f79693;
        String strM11521 = C5322.m11521("ETag", map);
        String strM11522 = C5322.m11521("Last-Modified", map);
        Uri uri = c24959.f79692;
        return new C21416(true, strM11521, strM11522, -1L, uri == null ? null : C5322.m11520(uri), null);
    }
}
