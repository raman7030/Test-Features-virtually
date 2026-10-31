package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C5695 {

    /* JADX INFO: renamed from: ᩺᩻֫, reason: not valid java name and contains not printable characters */
    public static int f17556;

    /* JADX INFO: renamed from: ֨ܶᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m16006(Object obj) {
        return ((C12392) obj).m30519();
    }

    /* JADX INFO: renamed from: ۘܺ᩸, reason: not valid java name and contains not printable characters */
    public static float m16015(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۙ᩹֫, reason: not valid java name and contains not printable characters */
    public static void m16016(Object obj, Object obj2, Object obj3) {
        ((C8918) obj).m23014((C3545) obj2, (C18090) obj3);
    }

    /* JADX INFO: renamed from: ۚ֨ܿ, reason: not valid java name and contains not printable characters */
    public static void m16017(Object obj, int i, Object obj2) {
        ((C19258) obj).m44440(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۚ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static C23902 m16018() {
        return C6969.m18832();
    }

    /* JADX INFO: renamed from: ۛۨܳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16019(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۠᩶֫, reason: not valid java name and contains not printable characters */
    public static void m16020(Object obj) {
        ((C18090) obj).close();
    }

    /* JADX INFO: renamed from: ۧᩴۢ, reason: not valid java name and contains not printable characters */
    public static int m16023() {
        return -491519761;
    }

    /* JADX INFO: renamed from: ܳۤۢ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m16025(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ܽ۫᩸, reason: not valid java name and contains not printable characters */
    public static int m16028(Object obj) {
        return ((C12392) obj).m30448();
    }

    /* JADX INFO: renamed from: ܿܽۘ, reason: not valid java name and contains not printable characters */
    public static int m16030(Object obj) {
        return ((InterfaceC20008) obj).readInt();
    }

    /* JADX INFO: renamed from: ᩵ܳۧ, reason: not valid java name and contains not printable characters */
    public static boolean m16032(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩵᩺۟, reason: not valid java name and contains not printable characters */
    public static int m16033(Object obj) {
        return ((C10567) obj).length();
    }

    /* JADX INFO: renamed from: ᩷ۘ᩹, reason: not valid java name and contains not printable characters */
    public static String m16034(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸᩷֫, reason: not valid java name and contains not printable characters */
    public static void m16035(Object obj, int i, Object obj2) {
        ((C19258) obj).m44434(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܰۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m16037(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaDescription.Builder m16007() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16014(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m16027(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16022(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16013(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16010(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16011(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16012(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaDescription m16008(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m16029(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static CharSequence m16036(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m16024(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m16009(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Bitmap m16026(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Uri m16031(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m16021(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }
}
