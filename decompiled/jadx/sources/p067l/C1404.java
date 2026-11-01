package p067l;

import android.content.SharedPreferences;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C1404 {

    /* JADX INFO: renamed from: ᩺᩷ۚ, reason: not valid java name and contains not printable characters */
    public static int f82149;

    /* JADX INFO: renamed from: ֡ᩴ۠, reason: not valid java name and contains not printable characters */
    public static C19279 m56453(Object obj, Object obj2) {
        return ((C19279) obj).m43971((C19279) obj2);
    }

    /* JADX INFO: renamed from: ֨ۡ᩶, reason: not valid java name and contains not printable characters */
    public static String m56454(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ۖ֨ܿ, reason: not valid java name and contains not printable characters */
    public static void m56455(Object obj, int i) {
        ((C11233) obj).m26014(i);
    }

    /* JADX INFO: renamed from: ۖۜ۬, reason: not valid java name and contains not printable characters */
    public static boolean m56456(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ۗᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m56457(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ۘۜᩴ, reason: not valid java name and contains not printable characters */
    public static char m56458(int i, Object obj) {
        return C9417.m21911(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۘܰۖ, reason: not valid java name and contains not printable characters */
    public static C24913 m56459(Object obj) {
        return ((InterfaceC9768) obj).mo3999();
    }

    /* JADX INFO: renamed from: ۙۨܶ, reason: not valid java name and contains not printable characters */
    public static String m56460(Object obj) {
        return ((AbstractC17043) obj).getName();
    }

    /* JADX INFO: renamed from: ۟֡ۚ, reason: not valid java name and contains not printable characters */
    public static long m56461(long j, long j2) {
        return C19644.m44631(j, j2);
    }

    /* JADX INFO: renamed from: ۟᩹ܽ, reason: not valid java name and contains not printable characters */
    public static String m56462(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static int m56463(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ۢ᩻᩻, reason: not valid java name and contains not printable characters */
    public static C20521 m56464(Object obj) {
        return ((ActivityC14326) obj).f40957;
    }

    /* JADX INFO: renamed from: ۬ۜۤ, reason: not valid java name and contains not printable characters */
    public static View m56465(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ᩶ۙᩴ, reason: not valid java name and contains not printable characters */
    public static String m56466(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩸ܺ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC9768 m56467(Object obj) {
        return ((C14146) obj).m32500();
    }

    /* JADX INFO: renamed from: ᩻ۘ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56468() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30076(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m30075(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
}
