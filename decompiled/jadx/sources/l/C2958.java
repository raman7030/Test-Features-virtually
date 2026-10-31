package l;

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
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes.dex */
public final class C2958 {

    /* JADX INFO: renamed from: ۨ۬ۖ, reason: not valid java name and contains not printable characters */
    public static int f9394;

    /* JADX INFO: renamed from: ۠᩸ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC7379 m9023(Object obj) {
        return ((InterfaceC23586) obj).getLifecycle();
    }

    /* JADX INFO: renamed from: ۠᩹᩻, reason: not valid java name and contains not printable characters */
    public static View m9024(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ۡۜᩳ, reason: not valid java name and contains not printable characters */
    public static String m9025(Object obj) {
        return ((AbstractC15440) obj).mo23554();
    }

    /* JADX INFO: renamed from: ۡ۟ۛ, reason: not valid java name and contains not printable characters */
    public static Long m9026(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۢۡ֡, reason: not valid java name and contains not printable characters */
    public static void m9027(Object obj, Object obj2) {
        C19926.m45879((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Editable m9028(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۢ᩸᩶, reason: not valid java name and contains not printable characters */
    public static Iterator m9029(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۤ۬ۘ, reason: not valid java name and contains not printable characters */
    public static String m9030(Object obj) {
        return ((InterfaceC0748) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ۧܺۧ, reason: not valid java name and contains not printable characters */
    public static String m9031(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9032(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ۬ۛ֡, reason: not valid java name and contains not printable characters */
    public static boolean m9033(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ᩳᩳ֫, reason: not valid java name and contains not printable characters */
    public static int m9034() {
        return 1948257019;
    }

    /* JADX INFO: renamed from: ᩵᩷ܳ, reason: not valid java name and contains not printable characters */
    public static String m9035(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶۫ۡ, reason: not valid java name and contains not printable characters */
    public static int m9036(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ᩷ۨܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9037() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ᩻᩻ܿ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9038(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23418 m9021(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C23418.m51875(typedValue.data);
            }
            C23418 c23418M51876 = C23418.m51876(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (c23418M51876 != null) {
                return c23418M51876;
            }
        }
        return C23418.m51875(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9022(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9018(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m9022(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9020(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m9022(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TypedArray m9019(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9017(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
