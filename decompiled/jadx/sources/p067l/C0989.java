package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۗۗ */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes.dex */
public final class C0989 {

    /* JADX INFO: renamed from: ۨ۬ۖ, reason: not valid java name and contains not printable characters */
    public static int f81920;

    /* JADX INFO: renamed from: ۠᩸ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC9381 m56084(Object obj) {
        return ((InterfaceC24784) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۠᩹᩻, reason: not valid java name and contains not printable characters */
    public static View m56085(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ۡۜᩳ, reason: not valid java name and contains not printable characters */
    public static String m56086(Object obj) {
        return ((AbstractC17043) obj).mo25505();
    }

    /* JADX INFO: renamed from: ۡ۟ۛ, reason: not valid java name and contains not printable characters */
    public static Long m56087(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۢۡ֡, reason: not valid java name and contains not printable characters */
    public static void m56088(Object obj, Object obj2) {
        C21306.m48192((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Editable m56089(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۢ᩸᩶, reason: not valid java name and contains not printable characters */
    public static Iterator m56090(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۤ۬ۘ, reason: not valid java name and contains not printable characters */
    public static String m56091(Object obj) {
        return ((InterfaceC3080) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ۧܺۧ, reason: not valid java name and contains not printable characters */
    public static String m56092(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m56093(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ۬ۛ֡, reason: not valid java name and contains not printable characters */
    public static boolean m56094(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ᩳᩳ֫, reason: not valid java name and contains not printable characters */
    public static int m56095() {
        return 1948257019;
    }

    /* JADX INFO: renamed from: ᩵᩷ܳ, reason: not valid java name and contains not printable characters */
    public static String m56096(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶۫ۡ, reason: not valid java name and contains not printable characters */
    public static int m56097(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ᩷ۨܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m56098() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ᩻᩻ܿ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m56099(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2004 m11089(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C2004.m54273(typedValue.data);
            }
            C2004 c2004M54274 = C2004.m54274(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (c2004M54274 != null) {
                return c2004M54274;
            }
        }
        return C2004.m54273(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11090(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m11086(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m11090(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11088(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m11090(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static TypedArray m11087(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m11085(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
