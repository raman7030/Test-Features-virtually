package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰܶ */
/* JADX INFO: compiled from: P1C9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1531 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f44476;

    /* JADX INFO: renamed from: ۧ */
    public int f44477;

    /* JADX INFO: renamed from: ܳ */
    public String f44478;

    /* JADX INFO: renamed from: ܽ */
    public float f44479;

    /* JADX INFO: renamed from: ܿ */
    public String f44480;

    /* JADX INFO: renamed from: ᩳ */
    public int f44481;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC1986 f44482;

    /* JADX INFO: renamed from: ֫ */
    public static int m35408(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC1986 m35411() {
        return this.f44482;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m35416() {
        int i = C1426.f38131[this.f44482.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m35415() {
        switch (C1426.f38131[this.f44482.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f44481;
            case 4:
                return this.f44479;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f44476 ? 1.0f : 0.0f;
            case 7:
                return this.f44479;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35414(float[] fArr) {
        switch (C1426.f38131[this.f44482.ordinal()]) {
            case 1:
            case 2:
                int i = this.f44477;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 3:
                fArr[0] = this.f44481;
                return;
            case 4:
                fArr[0] = this.f44479;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f44476 ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f44479;
                return;
            default:
                return;
        }
    }

    public C1531(C1531 c1531, Object obj) {
        this.f44480 = c1531.f44480;
        this.f44482 = c1531.f44482;
        m35413(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35413(Object obj) {
        switch (C1426.f38131[this.f44482.ordinal()]) {
            case 1:
            case 2:
                this.f44477 = ((Integer) obj).intValue();
                break;
            case 3:
                this.f44481 = ((Integer) obj).intValue();
                break;
            case 4:
                this.f44479 = ((Float) obj).floatValue();
                break;
            case 5:
                this.f44478 = (String) obj;
                break;
            case 6:
                this.f44476 = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f44479 = ((Float) obj).floatValue();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35410(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C1531 c1531 = (C1531) map.get(str);
            String strM48631 = C21466.m48631("set", str);
            try {
                try {
                    int i = C1426.f38131[c1531.f44482.ordinal()];
                    Class<?> cls2 = Integer.TYPE;
                    Class<?> cls3 = Float.TYPE;
                    switch (i) {
                        case 1:
                            cls.getMethod(strM48631, cls2).invoke(view, Integer.valueOf(c1531.f44477));
                            break;
                        case 2:
                            Method method = cls.getMethod(strM48631, Drawable.class);
                            ColorDrawable colorDrawable = new ColorDrawable();
                            colorDrawable.setColor(c1531.f44477);
                            method.invoke(view, colorDrawable);
                            break;
                        case 3:
                            cls.getMethod(strM48631, cls2).invoke(view, Integer.valueOf(c1531.f44481));
                            break;
                        case 4:
                            cls.getMethod(strM48631, cls3).invoke(view, Float.valueOf(c1531.f44479));
                            break;
                        case 5:
                            cls.getMethod(strM48631, CharSequence.class).invoke(view, c1531.f44478);
                            break;
                        case 6:
                            cls.getMethod(strM48631, Boolean.TYPE).invoke(view, Boolean.valueOf(c1531.f44476));
                            break;
                        case 7:
                            cls.getMethod(strM48631, cls3).invoke(view, Float.valueOf(c1531.f44479));
                            break;
                    }
                } catch (NoSuchMethodException e) {
                    e.getMessage();
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35412(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        String str = this.f44480;
        sb.append(str);
        String string = sb.toString();
        try {
            int i = C1426.f38131[this.f44482.ordinal()];
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (i) {
                case 1:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((m35408((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m35408((int) (fArr[3] * 255.0f)) << 24) | (m35408((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m35408((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(string, Drawable.class);
                    int iM35408 = (m35408((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m35408((int) (fArr[3] * 255.0f)) << 24) | (m35408((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m35408((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM35408);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(string, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + str);
                case 6:
                    cls.getMethod(string, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(string, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            C0845.m3343(view);
        } catch (NoSuchMethodException unused2) {
            C0845.m3343(view);
        } catch (InvocationTargetException unused3) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35409(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC1986 enumC1986;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72694);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC1986 enumC1987 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC1987 = EnumC1986.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC1986 = EnumC1986.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC1986 = EnumC1986.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC1986 = EnumC1986.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC1986 = EnumC1986.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC1986 = EnumC1986.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC1986 = EnumC1986.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    enumC1986 = EnumC1986.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                enumC1987 = enumC1986;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            C1531 c1531 = new C1531();
            c1531.f44480 = string2;
            c1531.f44482 = enumC1987;
            c1531.m35413(objValueOf);
            map.put(string2, c1531);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
