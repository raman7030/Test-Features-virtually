package p067l;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۗ */
/* JADX INFO: compiled from: P204 */
/* JADX INFO: loaded from: classes.dex */
public final class C1024 {

    /* JADX INFO: renamed from: ֡ܽ۫, reason: not valid java name and contains not printable characters */
    public static boolean f81946;

    /* JADX INFO: renamed from: ֫ */
    public final int[] f14358;

    /* JADX INFO: renamed from: ۧ */
    public final float[] f14359;

    /* JADX INFO: renamed from: ֨ܽ᩻, reason: not valid java name and contains not printable characters */
    public static C22682 m56202(int i) {
        return C22682.m50793(i);
    }

    /* JADX INFO: renamed from: ۖ֫۠, reason: not valid java name and contains not printable characters */
    public static String m56203(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙܿ᩹, reason: not valid java name and contains not printable characters */
    public static InputStream m56204(Object obj, Object obj2) {
        return ((C19561) obj).m44448((C5738) obj2);
    }

    /* JADX INFO: renamed from: ۛۘ᩵, reason: not valid java name and contains not printable characters */
    public static String m56205(Object obj, boolean z) {
        return C25165.m55215((String) obj, z);
    }

    /* JADX INFO: renamed from: ۜۗۨ, reason: not valid java name and contains not printable characters */
    public static void m56206(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ۟᩻᩵, reason: not valid java name and contains not printable characters */
    public static int m56207(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ۤۧۖ, reason: not valid java name and contains not printable characters */
    public static void m56208(Object obj) {
        ((DialogInterfaceC2564) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۬ۜ᩵, reason: not valid java name and contains not printable characters */
    public static int m56209() {
        return -1440437201;
    }

    /* JADX INFO: renamed from: ۬ۤ᩶, reason: not valid java name and contains not printable characters */
    public static EnumC3167 m56210(Object obj) {
        return ((InterfaceC23920) obj).mo6217();
    }

    /* JADX INFO: renamed from: ܶۡۗ, reason: not valid java name and contains not printable characters */
    public static void m56211(Object obj, int i) {
        ((InterfaceC6631) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ܽۧۚ, reason: not valid java name and contains not printable characters */
    public static int m56212(Object obj) {
        return ((C21089) obj).m47682();
    }

    /* JADX INFO: renamed from: ܿ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static Intent m56213(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩳ᩻֨, reason: not valid java name and contains not printable characters */
    public static void m56214(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۜۨ, reason: not valid java name and contains not printable characters */
    public static String m56215(Object obj) {
        return ((InterfaceC22991) obj).getType();
    }

    /* JADX INFO: renamed from: ᩷֨ܽ, reason: not valid java name and contains not printable characters */
    public static void m56216(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ᩸֨᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56217(Object obj, Object obj2) {
        return ((AbstractC17043) obj).m38684((String) obj2);
    }

    public C1024(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f14358 = new int[size];
        this.f14359 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f14358[i] = ((Integer) arrayList.get(i)).intValue();
            this.f14359[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C1024(int i, int i2) {
        this.f14358 = new int[]{i, i2};
        this.f14359 = new float[]{0.0f, 1.0f};
    }

    public C1024(int i, int i2, int i3) {
        this.f14358 = new int[]{i, i2, i3};
        this.f14359 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
