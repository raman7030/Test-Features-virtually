package l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes.dex */
public final class C1504 {

    /* JADX INFO: renamed from: ۢ᩸᩶, reason: not valid java name and contains not printable characters */
    public static boolean f5354;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle f5355 = new Bundle();

    /* JADX INFO: renamed from: ֫ۜۡ, reason: not valid java name and contains not printable characters */
    public static String m5165(Object obj) {
        return ((InterfaceC21699) obj).getType();
    }

    /* JADX INFO: renamed from: ۘܶ᩵, reason: not valid java name and contains not printable characters */
    public static void m5166(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ۙܽ᩹, reason: not valid java name and contains not printable characters */
    public static C21374 m5167(int i) {
        return C21374.m48457(i);
    }

    /* JADX INFO: renamed from: ۚ֡ܽ, reason: not valid java name and contains not printable characters */
    public static Intent m5168(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢۖۗ, reason: not valid java name and contains not printable characters */
    public static void m5169(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ۢۨܰ, reason: not valid java name and contains not printable characters */
    public static InputStream m5170(Object obj, Object obj2) {
        return ((C18090) obj).m42189((C3545) obj2);
    }

    /* JADX INFO: renamed from: ۤ۟ۗ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m5171(Object obj, Object obj2) {
        return ((AbstractC15440) obj).m36526((String) obj2);
    }

    /* JADX INFO: renamed from: ۤܿ۠, reason: not valid java name and contains not printable characters */
    public static void m5172(Object obj) {
        ((DialogInterfaceC0206) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۨ۫ܿ, reason: not valid java name and contains not printable characters */
    public static int m5173(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ܶۨ᩹, reason: not valid java name and contains not printable characters */
    public static void m5174(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ܽۧ֡, reason: not valid java name and contains not printable characters */
    public static void m5175(Object obj, int i) {
        ((InterfaceC4485) obj).writeByte(i);
    }

    /* JADX INFO: renamed from: ܽ᩹ۘ, reason: not valid java name and contains not printable characters */
    public static int m5176(Object obj) {
        return ((C19697) obj).m45385();
    }

    /* JADX INFO: renamed from: ܿ᩶ۤ, reason: not valid java name and contains not printable characters */
    public static String m5177(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۛܺ, reason: not valid java name and contains not printable characters */
    public static String m5178(Object obj, boolean z) {
        return C23986.m52809((String) obj, z);
    }

    /* JADX INFO: renamed from: ᩵᩸ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m5179() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ܿ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC0841 m5180(Object obj) {
        return ((InterfaceC22677) obj).mo3975();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5184(String str, String str2) {
        C2727 c2727 = C10677.f32122;
        if (c2727.containsKey(str) && ((Integer) c2727.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(C4860.m14172("The ", str, " key cannot be used to put a String"));
        }
        this.f5355.putCharSequence(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5182(long j) {
        C2727 c2727 = C10677.f32122;
        if (c2727.containsKey("android.media.metadata.DURATION") && ((Integer) c2727.getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.f5355.putLong("android.media.metadata.DURATION", j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5183(String str, Bitmap bitmap) {
        C2727 c2727 = C10677.f32122;
        if (c2727.containsKey(str) && ((Integer) c2727.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(C4860.m14172("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f5355.putParcelable(str, bitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10677 m5181() {
        return new C10677(this.f5355);
    }
}
