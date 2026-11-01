package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;

/* JADX INFO: renamed from: l.ۘۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C1025 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩷ۙ᩸, reason: not valid java name and contains not printable characters */
    public static int f81947;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1935 f14433;

    /* JADX INFO: renamed from: ۖ۬ۘ, reason: not valid java name and contains not printable characters */
    public static void m56218(Object obj, Object obj2) {
        C13045.m29867(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۛۘۡ, reason: not valid java name and contains not printable characters */
    public static C2836 m56219(Object obj, Object obj2) {
        return C7531.m17431((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۛۛܺ, reason: not valid java name and contains not printable characters */
    public static CharSequence m56220(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ۜܳ᩸, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC2564 m56221(Object obj) {
        return ((C20671) obj).m46732();
    }

    /* JADX INFO: renamed from: ۜ᩹۬, reason: not valid java name and contains not printable characters */
    public static ActivityC3069 m56222(Object obj) {
        return ((ComponentCallbacksC11117) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۟᩻᩹, reason: not valid java name and contains not printable characters */
    public static String m56223(Object obj) {
        return ((C5168) obj).m11037();
    }

    /* JADX INFO: renamed from: ۢܺۚ, reason: not valid java name and contains not printable characters */
    public static JSONArray m56224() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ܳۧ۫, reason: not valid java name and contains not printable characters */
    public static int m56225(Object obj) {
        return ((C14146) obj).m32606();
    }

    /* JADX INFO: renamed from: ܺ᩻ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m56226(Object obj, Object obj2) {
        return C12826.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ܿۖ۠, reason: not valid java name and contains not printable characters */
    public static String m56227(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ܿ᩵᩵, reason: not valid java name and contains not printable characters */
    public static C22682 m56228(Object obj) {
        return C22682.m50795((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩶ۖܶ, reason: not valid java name and contains not printable characters */
    public static void m56229(Object obj, Object obj2) {
        ((C18107) obj).m41279((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶ۚۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56230() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ܳᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m56231(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC14770) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩷ܺ᩸, reason: not valid java name and contains not printable characters */
    public static C25065 m56232(Object obj) {
        return ((C19701) obj).m44755();
    }

    /* JADX INFO: renamed from: ᩻ۙܿ, reason: not valid java name and contains not printable characters */
    public static String m56233(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public C1025(C1935 c1935) {
        this.f14433 = c1935;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f14433.getClass();
        throw null;
    }
}
