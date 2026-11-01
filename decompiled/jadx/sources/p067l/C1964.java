package p067l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bin.p000mt.plus.Main;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺ */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C1964 {

    /* JADX INFO: renamed from: ۙۛܶ, reason: not valid java name and contains not printable characters */
    public static int f83032;

    /* JADX INFO: renamed from: ֫ */
    public CharSequence f75810;

    /* JADX INFO: renamed from: ۜ */
    public CharSequence f75811;

    /* JADX INFO: renamed from: ۧ */
    public Bundle f75812;

    /* JADX INFO: renamed from: ܳ */
    public Uri f75813;

    /* JADX INFO: renamed from: ܽ */
    public Bitmap f75814;

    /* JADX INFO: renamed from: ܿ */
    public String f75815;

    /* JADX INFO: renamed from: ᩳ */
    public Uri f75816;

    /* JADX INFO: renamed from: ᩻ */
    public CharSequence f75817;

    /* JADX INFO: renamed from: ֨ܶ۟, reason: not valid java name and contains not printable characters */
    public static String m56584(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֨ܿ᩹, reason: not valid java name and contains not printable characters */
    public static void m56585(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ֫۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m56586(Object obj) {
        return ((C25065) obj).m55015();
    }

    /* JADX INFO: renamed from: ֫ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m56587(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ۗ֫᩷, reason: not valid java name and contains not printable characters */
    public static void m56588(Object obj, Object obj2) {
        ((C1326) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۜ֨ܽ, reason: not valid java name and contains not printable characters */
    public static void m56589(Object obj, int i) {
        ((InterfaceC6631) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۟᩷۠, reason: not valid java name and contains not printable characters */
    public static void m56590(Object obj, Object obj2) {
        ((AbstractActivityC5549) obj).m12273((String) obj2);
    }

    /* JADX INFO: renamed from: ۠۫ۖ, reason: not valid java name and contains not printable characters */
    public static Button m56591(Object obj) {
        return ((DialogInterfaceC2564) obj).m3860();
    }

    /* JADX INFO: renamed from: ۢ۬ۖ, reason: not valid java name and contains not printable characters */
    public static void m56592(Object obj) {
        C13045.m29866((String) obj);
    }

    /* JADX INFO: renamed from: ۬֫ۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m56593(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ܳᩳۙ, reason: not valid java name and contains not printable characters */
    public static Main m56594(Object obj) {
        return ((C18107) obj).m41282();
    }

    /* JADX INFO: renamed from: ܽۤۚ, reason: not valid java name and contains not printable characters */
    public static void m56595(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩳ۟ܳ, reason: not valid java name and contains not printable characters */
    public static String m56596(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܿܳ, reason: not valid java name and contains not printable characters */
    public static int m56597() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩵᩷ۖ, reason: not valid java name and contains not printable characters */
    public static void m56598(Object obj, Object obj2) {
        ((C14146) obj).mo27932((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩶᩹᩵, reason: not valid java name and contains not printable characters */
    public static void m56599(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52949(String str) {
        this.f75815 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52952(CharSequence charSequence) {
        this.f75811 = charSequence;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52951(CharSequence charSequence) {
        this.f75817 = charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52948(CharSequence charSequence) {
        this.f75810 = charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52945(Bitmap bitmap) {
        this.f75814 = bitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52946(Uri uri) {
        this.f75816 = uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52947(Bundle bundle) {
        this.f75812 = bundle;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52950(Uri uri) {
        this.f75813 = uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1509 m52944() {
        return new C1509(this.f75815, this.f75811, this.f75817, this.f75810, this.f75814, this.f75816, this.f75812, this.f75813);
    }
}
