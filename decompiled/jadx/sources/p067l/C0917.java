package p067l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֫֫ */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C0917 {

    /* JADX INFO: renamed from: ۢ᩸᩶, reason: not valid java name and contains not printable characters */
    public static boolean f81868;

    /* JADX INFO: renamed from: ֫ */
    public final Bundle f8136 = new Bundle();

    /* JADX INFO: renamed from: ֫ۜۡ, reason: not valid java name and contains not printable characters */
    public static String m55840(Object obj) {
        return ((InterfaceC22991) obj).getType();
    }

    /* JADX INFO: renamed from: ۘܶ᩵, reason: not valid java name and contains not printable characters */
    public static void m55841(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ۙܽ᩹, reason: not valid java name and contains not printable characters */
    public static C22682 m55842(int i) {
        return C22682.m50793(i);
    }

    /* JADX INFO: renamed from: ۚ֡ܽ, reason: not valid java name and contains not printable characters */
    public static Intent m55843(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢۖۗ, reason: not valid java name and contains not printable characters */
    public static void m55844(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ۢۨܰ, reason: not valid java name and contains not printable characters */
    public static InputStream m55845(Object obj, Object obj2) {
        return ((C19561) obj).m44448((C5738) obj2);
    }

    /* JADX INFO: renamed from: ۤ۟ۗ, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m55846(Object obj, Object obj2) {
        return ((AbstractC17043) obj).m38684((String) obj2);
    }

    /* JADX INFO: renamed from: ۤܿ۠, reason: not valid java name and contains not printable characters */
    public static void m55847(Object obj) {
        ((DialogInterfaceC2564) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۨ۫ܿ, reason: not valid java name and contains not printable characters */
    public static int m55848(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ܶۨ᩹, reason: not valid java name and contains not printable characters */
    public static void m55849(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ܽۧ֡, reason: not valid java name and contains not printable characters */
    public static void m55850(Object obj, int i) {
        ((InterfaceC6631) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ܽ᩹ۘ, reason: not valid java name and contains not printable characters */
    public static int m55851(Object obj) {
        return ((C21089) obj).m47682();
    }

    /* JADX INFO: renamed from: ܿ᩶ۤ, reason: not valid java name and contains not printable characters */
    public static String m55852(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۛܺ, reason: not valid java name and contains not printable characters */
    public static String m55853(Object obj, boolean z) {
        return C25165.m55215((String) obj, z);
    }

    /* JADX INFO: renamed from: ᩵᩸ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m55854() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ܿ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC3167 m55855(Object obj) {
        return ((InterfaceC23920) obj).mo6217();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7410(String str, String str2) {
        C0977 c0977 = C1372.f35093;
        if (c0977.containsKey(str) && ((Integer) c0977.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(C6988.m16053("The ", str, " key cannot be used to put a String"));
        }
        this.f8136.putCharSequence(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7408(long j) {
        C0977 c0977 = C1372.f35093;
        if (c0977.containsKey("android.media.metadata.DURATION") && ((Integer) c0977.getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.f8136.putLong("android.media.metadata.DURATION", j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7409(String str, Bitmap bitmap) {
        C0977 c0977 = C1372.f35093;
        if (c0977.containsKey(str) && ((Integer) c0977.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(C6988.m16053("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f8136.putParcelable(str, bitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1372 m7407() {
        return new C1372(this.f8136);
    }
}
