package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import bin.mt.plus.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q216 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14245 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42922 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f42923 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m33890(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m33891(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m33891(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        float f2;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = C23977.f77737;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(i, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(i, -65281);
                } else {
                    ThreadLocal threadLocal = f42923;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = m33890(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i, -65281);
                    }
                }
                if (typedArrayObtainAttributes.hasValue(r4)) {
                    f = typedArrayObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                if (Build.VERSION.SDK_INT >= 31 && typedArrayObtainAttributes.hasValue(2)) {
                    f2 = typedArrayObtainAttributes.getFloat(2, -1.0f);
                } else {
                    f2 = typedArrayObtainAttributes.getFloat(4, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.MT_Protector && attributeNameResource != R.attr.MT_Protector) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i4);
                boolean z = f2 >= 0.0f && f2 <= 100.0f;
                if (f != 1.0f || z) {
                    int iM6036 = C1814.m6036((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z) {
                        C17774 c17774M41628 = C17774.m41628(color);
                        color = C17774.m41629(c17774M41628.m41632(), c17774M41628.m41630(), f2);
                    }
                    color = (color & 16777215) | (iM6036 << 24);
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
            }
            r4 = 1;
            i = 0;
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
