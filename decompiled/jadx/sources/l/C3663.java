package l;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P204 */
/* JADX INFO: loaded from: classes.dex */
public final class C3663 {

    /* JADX INFO: renamed from: ֡ܽ۫, reason: not valid java name and contains not printable characters */
    public static boolean f11553;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f11554;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f11555;

    /* JADX INFO: renamed from: ֨ܽ᩻, reason: not valid java name and contains not printable characters */
    public static C21374 m11161(int i) {
        return C21374.m48457(i);
    }

    /* JADX INFO: renamed from: ۖ֫۠, reason: not valid java name and contains not printable characters */
    public static String m11162(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙܿ᩹, reason: not valid java name and contains not printable characters */
    public static InputStream m11163(Object obj, Object obj2) {
        return ((C18090) obj).m42189((C3545) obj2);
    }

    /* JADX INFO: renamed from: ۛۘ᩵, reason: not valid java name and contains not printable characters */
    public static String m11164(Object obj, boolean z) {
        return C23986.m52809((String) obj, z);
    }

    /* JADX INFO: renamed from: ۜۗۨ, reason: not valid java name and contains not printable characters */
    public static void m11165(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ۟᩻᩵, reason: not valid java name and contains not printable characters */
    public static int m11166(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ۤۧۖ, reason: not valid java name and contains not printable characters */
    public static void m11167(Object obj) {
        ((DialogInterfaceC0206) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۬ۜ᩵, reason: not valid java name and contains not printable characters */
    public static int m11168() {
        return -1440437201;
    }

    /* JADX INFO: renamed from: ۬ۤ᩶, reason: not valid java name and contains not printable characters */
    public static EnumC0841 m11169(Object obj) {
        return ((InterfaceC22677) obj).mo3975();
    }

    /* JADX INFO: renamed from: ܶۡۗ, reason: not valid java name and contains not printable characters */
    public static void m11170(Object obj, int i) {
        ((InterfaceC4485) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ܽۧۚ, reason: not valid java name and contains not printable characters */
    public static int m11171(Object obj) {
        return ((C19697) obj).m45385();
    }

    /* JADX INFO: renamed from: ܿ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static Intent m11172(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩳ᩻֨, reason: not valid java name and contains not printable characters */
    public static void m11173(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۜۨ, reason: not valid java name and contains not printable characters */
    public static String m11174(Object obj) {
        return ((InterfaceC21699) obj).getType();
    }

    /* JADX INFO: renamed from: ᩷֨ܽ, reason: not valid java name and contains not printable characters */
    public static void m11175(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ᩸֨᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m11176(Object obj, Object obj2) {
        return ((AbstractC15440) obj).m36526((String) obj2);
    }

    public C3663(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f11554 = new int[size];
        this.f11555 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f11554[i] = ((Integer) arrayList.get(i)).intValue();
            this.f11555[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C3663(int i, int i2) {
        this.f11554 = new int[]{i, i2};
        this.f11555 = new float[]{0.0f, 1.0f};
    }

    public C3663(int i, int i2, int i3) {
        this.f11554 = new int[]{i, i2, i3};
        this.f11555 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
