package p067l;

import android.media.browse.MediaBrowser;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۖ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public class C0949 {

    /* JADX INFO: renamed from: ᩹۟ۘ, reason: not valid java name and contains not printable characters */
    public static int f81897;

    /* JADX INFO: renamed from: ֫ */
    public final MediaBrowser.ConnectionCallback f9944 = new C1614(this);

    /* JADX INFO: renamed from: ۧ */
    public C1789 f9945;

    /* JADX INFO: renamed from: ֡᩹۫, reason: not valid java name and contains not printable characters */
    public static int m56004(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ֨֫ۡ, reason: not valid java name and contains not printable characters */
    public static Object m56005(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ۘ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static Throwable m56006(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ۙ֫ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m56007(Object obj) {
        return ((InterfaceC18588) obj).mo3924();
    }

    /* JADX INFO: renamed from: ۚۖܽ, reason: not valid java name and contains not printable characters */
    public static void m56008(Object obj) {
        C13045.m29861(obj);
    }

    /* JADX INFO: renamed from: ۢܰۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19157 m56009(Object obj) {
        return C7480.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۢᩴۖ, reason: not valid java name and contains not printable characters */
    public static boolean m56010(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۧܺ᩹, reason: not valid java name and contains not printable characters */
    public static void m56011(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۨۙ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m56012() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ᩵۠, reason: not valid java name and contains not printable characters */
    public static C5738 m56013(Object obj, Object obj2) {
        return ((C19561) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ܳ۠ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m56014(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* JADX INFO: renamed from: ܶ᩵۟, reason: not valid java name and contains not printable characters */
    public static void m56015(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ܽ֡ܶ, reason: not valid java name and contains not printable characters */
    public static String m56016(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹۬ۖ, reason: not valid java name and contains not printable characters */
    public static void m56017(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ᩺ۚۧ, reason: not valid java name and contains not printable characters */
    public static boolean m56018(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩻ۖܳ, reason: not valid java name and contains not printable characters */
    public static boolean m56019(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9242() {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9243() {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo9244() {
        throw null;
    }
}
