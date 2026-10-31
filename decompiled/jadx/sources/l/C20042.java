package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes4.dex */
public final class C20042 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f64936;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f64937;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Boolean f64938;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f64939;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f64940;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f64941;

    public C20042(boolean z, String str, String str2, long j, String str3, Boolean bool) {
        this.f64940 = z;
        this.f64936 = str;
        this.f64939 = str2;
        this.f64941 = j;
        this.f64937 = str3;
        this.f64938 = bool;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20042 m46234(C23770 c23770) {
        Map map = c23770.f76940;
        String strM9478 = C3108.m9478("ETag", map);
        String strM9479 = C3108.m9478("Last-Modified", map);
        Uri uri = c23770.f76939;
        return new C20042(true, strM9478, strM9479, -1L, uri == null ? null : C3108.m9477(uri), null);
    }
}
