package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۛ */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C1124 {

    /* JADX INFO: renamed from: ᩺᩻֫, reason: not valid java name and contains not printable characters */
    public static int f82007;

    /* JADX INFO: renamed from: ֨ܶᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m56360(Object obj) {
        return ((C14146) obj).m32583();
    }

    /* JADX INFO: renamed from: ۘܺ᩸, reason: not valid java name and contains not printable characters */
    public static float m56361(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۙ᩹֫, reason: not valid java name and contains not printable characters */
    public static void m56362(Object obj, Object obj2, Object obj3) {
        ((C10844) obj).m24988((C5738) obj2, (C19561) obj3);
    }

    /* JADX INFO: renamed from: ۚ֨ܿ, reason: not valid java name and contains not printable characters */
    public static void m56363(Object obj, int i, Object obj2) {
        ((C20671) obj).m46734(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۚ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static C25085 m56364() {
        return C8992.m20786();
    }

    /* JADX INFO: renamed from: ۛۨܳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m56365(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۠᩶֫, reason: not valid java name and contains not printable characters */
    public static void m56366(Object obj) {
        ((C19561) obj).close();
    }

    /* JADX INFO: renamed from: ۧᩴۢ, reason: not valid java name and contains not printable characters */
    public static int m56367() {
        return -491519761;
    }

    /* JADX INFO: renamed from: ܳۤۢ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m56368(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ܽ۫᩸, reason: not valid java name and contains not printable characters */
    public static int m56369(Object obj) {
        return ((C14146) obj).m32512();
    }

    /* JADX INFO: renamed from: ܿܽۘ, reason: not valid java name and contains not printable characters */
    public static int m56370(Object obj) {
        return ((InterfaceC21384) obj).readInt();
    }

    /* JADX INFO: renamed from: ᩵ܳۧ, reason: not valid java name and contains not printable characters */
    public static boolean m56371(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩵᩺۟, reason: not valid java name and contains not printable characters */
    public static int m56372(Object obj) {
        return ((C12412) obj).length();
    }

    /* JADX INFO: renamed from: ᩷ۘ᩹, reason: not valid java name and contains not printable characters */
    public static String m56373(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸᩷֫, reason: not valid java name and contains not printable characters */
    public static void m56374(Object obj, int i, Object obj2) {
        ((C20671) obj).m46728(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩻ܰۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m56375(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static MediaDescription.Builder m17941() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17948(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m17953(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m17950(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17947(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17944(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17945(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17946(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static MediaDescription m17942(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m17954(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static CharSequence m17956(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* JADX INFO: renamed from: ܳ */
    public static CharSequence m17951(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m17943(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* JADX INFO: renamed from: ܽ */
    public static Bitmap m17952(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Uri m17955(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bundle m17949(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }
}
