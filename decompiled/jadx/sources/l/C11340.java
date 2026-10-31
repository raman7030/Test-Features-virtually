package l;

import android.content.SharedPreferences;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C11340 {

    /* JADX INFO: renamed from: ᩺᩷ۚ, reason: not valid java name and contains not printable characters */
    public static int f33930;

    /* JADX INFO: renamed from: ֡ᩴ۠, reason: not valid java name and contains not printable characters */
    public static C17793 m28014(Object obj, Object obj2) {
        return ((C17793) obj).m41725((C17793) obj2);
    }

    /* JADX INFO: renamed from: ֨ۡ᩶, reason: not valid java name and contains not printable characters */
    public static String m28015(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ۖ֨ܿ, reason: not valid java name and contains not printable characters */
    public static void m28018(Object obj, int i) {
        ((C9327) obj).m24005(i);
    }

    /* JADX INFO: renamed from: ۖۜ۬, reason: not valid java name and contains not printable characters */
    public static boolean m28019(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ۗᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m28020(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ۘۜᩴ, reason: not valid java name and contains not printable characters */
    public static char m28021(int i, Object obj) {
        return C7416.m19937(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۘܰۖ, reason: not valid java name and contains not printable characters */
    public static C23721 m28022(Object obj) {
        return ((InterfaceC7785) obj).mo1601();
    }

    /* JADX INFO: renamed from: ۙۨܶ, reason: not valid java name and contains not printable characters */
    public static String m28023(Object obj) {
        return ((AbstractC15440) obj).getName();
    }

    /* JADX INFO: renamed from: ۟֡ۚ, reason: not valid java name and contains not printable characters */
    public static long m28024(long j, long j2) {
        return C18177.m42370(j, j2);
    }

    /* JADX INFO: renamed from: ۟᩹ܽ, reason: not valid java name and contains not printable characters */
    public static String m28025(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static int m28026(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ۢ᩻᩻, reason: not valid java name and contains not printable characters */
    public static C19099 m28027(Object obj) {
        return ((ActivityC12581) obj).f37929;
    }

    /* JADX INFO: renamed from: ۬ۜۤ, reason: not valid java name and contains not printable characters */
    public static View m28028(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ᩶ۙᩴ, reason: not valid java name and contains not printable characters */
    public static String m28029(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩸ܺ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC7785 m28030(Object obj) {
        return ((C12392) obj).m30436();
    }

    /* JADX INFO: renamed from: ᩻ۘ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m28031() {
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28017(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m28016(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
}
