package p067l;

import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡᩺ */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes.dex */
public final class C0877 {

    /* JADX INFO: renamed from: ᩴ᩹ۛ, reason: not valid java name and contains not printable characters */
    public static int f81843;

    /* JADX INFO: renamed from: ֫ۡۙ, reason: not valid java name and contains not printable characters */
    public static void m55693(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۖܳۛ, reason: not valid java name and contains not printable characters */
    public static C5738 m55694(Object obj, Object obj2) {
        return ((C19561) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ۗۧۘ, reason: not valid java name and contains not printable characters */
    public static boolean m55695(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* JADX INFO: renamed from: ۗ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m55696() {
        return true;
    }

    /* JADX INFO: renamed from: ۚ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static void m55697(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۛۜۚ, reason: not valid java name and contains not printable characters */
    public static boolean m55698(Object obj) {
        return ((InterfaceC18588) obj).mo3924();
    }

    /* JADX INFO: renamed from: ۛۜܺ, reason: not valid java name and contains not printable characters */
    public static void m55699(Object obj) {
        C13045.m29861(obj);
    }

    /* JADX INFO: renamed from: ۠ܿ۫, reason: not valid java name and contains not printable characters */
    public static Object m55700(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ۠᩺ۗ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19157 m55701(Object obj) {
        return C7480.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۤ᩹᩹, reason: not valid java name and contains not printable characters */
    public static Throwable m55702(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ܰۖ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m55703(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩳ֫᩺, reason: not valid java name and contains not printable characters */
    public static boolean m55704(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩷ۜܿ, reason: not valid java name and contains not printable characters */
    public static boolean m55705(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩷۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m55706(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۜۢ, reason: not valid java name and contains not printable characters */
    public static String m55707(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩺ᩴ᩹, reason: not valid java name and contains not printable characters */
    public static int m55708(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C11271 m5146(View view) {
        return new C11271(new C1822(view, null));
    }
}
