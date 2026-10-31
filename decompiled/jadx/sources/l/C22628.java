package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bin.mt.plus.Main;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C22628 {

    /* JADX INFO: renamed from: ۙۛܶ, reason: not valid java name and contains not printable characters */
    public static int f73083;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f73084;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f73085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f73086;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Uri f73087;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Bitmap f73088;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f73089;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Uri f73090;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f73091;

    /* JADX INFO: renamed from: ֨ܶ۟, reason: not valid java name and contains not printable characters */
    public static String m50602(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֨ܿ᩹, reason: not valid java name and contains not printable characters */
    public static void m50603(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ֫۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m50604(Object obj) {
        return ((C23881) obj).m52606();
    }

    /* JADX INFO: renamed from: ֫ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m50605(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ۗ֫᩷, reason: not valid java name and contains not printable characters */
    public static void m50606(Object obj, Object obj2) {
        ((C9762) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۜ֨ܽ, reason: not valid java name and contains not printable characters */
    public static void m50607(Object obj, int i) {
        ((InterfaceC4485) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۟᩷۠, reason: not valid java name and contains not printable characters */
    public static void m50608(Object obj, Object obj2) {
        ((AbstractActivityC3346) obj).m10237((String) obj2);
    }

    /* JADX INFO: renamed from: ۠۫ۖ, reason: not valid java name and contains not printable characters */
    public static Button m50609(Object obj) {
        return ((DialogInterfaceC0206) obj).m1447();
    }

    /* JADX INFO: renamed from: ۢ۬ۖ, reason: not valid java name and contains not printable characters */
    public static void m50610(Object obj) {
        C11233.m27804((String) obj);
    }

    /* JADX INFO: renamed from: ۬֫ۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m50611(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ܳᩳۙ, reason: not valid java name and contains not printable characters */
    public static Main m50612(Object obj) {
        return ((C16560) obj).m39056();
    }

    /* JADX INFO: renamed from: ܽۤۚ, reason: not valid java name and contains not printable characters */
    public static void m50613(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩳ۟ܳ, reason: not valid java name and contains not printable characters */
    public static String m50614(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܿܳ, reason: not valid java name and contains not printable characters */
    public static int m50615() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩵᩷ۖ, reason: not valid java name and contains not printable characters */
    public static void m50616(Object obj, Object obj2) {
        ((C12392) obj).mo25910((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩶᩹᩵, reason: not valid java name and contains not printable characters */
    public static void m50617(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50623(String str) {
        this.f73089 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50626(CharSequence charSequence) {
        this.f73085 = charSequence;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50625(CharSequence charSequence) {
        this.f73091 = charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50622(CharSequence charSequence) {
        this.f73084 = charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50619(Bitmap bitmap) {
        this.f73088 = bitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50620(Uri uri) {
        this.f73090 = uri;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50621(Bundle bundle) {
        this.f73086 = bundle;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50624(Uri uri) {
        this.f73087 = uri;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13455 m50618() {
        return new C13455(this.f73089, this.f73085, this.f73091, this.f73084, this.f73088, this.f73090, this.f73086, this.f73087);
    }
}
