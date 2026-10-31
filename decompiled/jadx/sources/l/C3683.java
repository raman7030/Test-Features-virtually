package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C3683 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩷ۙ᩸, reason: not valid java name and contains not printable characters */
    public static int f11629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22028 f11630;

    /* JADX INFO: renamed from: ۖ۬ۘ, reason: not valid java name and contains not printable characters */
    public static void m11210(Object obj, Object obj2) {
        C11233.m27805(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۛۘۡ, reason: not valid java name and contains not printable characters */
    public static C0492 m11211(Object obj, Object obj2) {
        return C5432.m15520((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۛۛܺ, reason: not valid java name and contains not printable characters */
    public static CharSequence m11212(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ۜܳ᩸, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0206 m11213(Object obj) {
        return ((C19258) obj).m44438();
    }

    /* JADX INFO: renamed from: ۜ᩹۬, reason: not valid java name and contains not printable characters */
    public static ActivityC0737 m11214(Object obj) {
        return ((ComponentCallbacksC9205) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۟᩻᩹, reason: not valid java name and contains not printable characters */
    public static String m11215(Object obj) {
        return ((C2946) obj).m8969();
    }

    /* JADX INFO: renamed from: ۢܺۚ, reason: not valid java name and contains not printable characters */
    public static JSONArray m11216() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ܳۧ۫, reason: not valid java name and contains not printable characters */
    public static int m11217(Object obj) {
        return ((C12392) obj).m30542();
    }

    /* JADX INFO: renamed from: ܺ᩻ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m11218(Object obj, Object obj2) {
        return C11003.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ܿۖ۠, reason: not valid java name and contains not printable characters */
    public static String m11219(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ܿ᩵᩵, reason: not valid java name and contains not printable characters */
    public static C21374 m11220(Object obj) {
        return C21374.m48459((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩶ۖܶ, reason: not valid java name and contains not printable characters */
    public static void m11221(Object obj, Object obj2) {
        ((C16560) obj).m39053((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶ۚۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11222() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ܳᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m11223(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC13049) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩷ܺ᩸, reason: not valid java name and contains not printable characters */
    public static C23881 m11224(Object obj) {
        return ((C18237) obj).m42496();
    }

    /* JADX INFO: renamed from: ᩻ۙܿ, reason: not valid java name and contains not printable characters */
    public static String m11225(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public C3683(C22028 c22028) {
        this.f11630 = c22028;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f11630.getClass();
        throw null;
    }
}
