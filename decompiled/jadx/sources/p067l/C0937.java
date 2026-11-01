package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֫ܺ */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class C0937 {

    /* JADX INFO: renamed from: ֡ܳ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f81884;

    /* JADX INFO: renamed from: ֫ */
    public boolean f9224;

    /* JADX INFO: renamed from: ۖ */
    public final TextView f9225;

    /* JADX INFO: renamed from: ۜ */
    public C1130 f9226;

    /* JADX INFO: renamed from: ۢ */
    public Typeface f9228;

    /* JADX INFO: renamed from: ۧ */
    public final C1287 f9229;

    /* JADX INFO: renamed from: ܳ */
    public C1130 f9230;

    /* JADX INFO: renamed from: ܽ */
    public C1130 f9232;

    /* JADX INFO: renamed from: ܿ */
    public C1130 f9233;

    /* JADX INFO: renamed from: ᩳ */
    public C1130 f9234;

    /* JADX INFO: renamed from: ᩷ */
    public C1130 f9235;

    /* JADX INFO: renamed from: ᩻ */
    public C1130 f9236;

    /* JADX INFO: renamed from: ܺ */
    public int f9231 = 0;

    /* JADX INFO: renamed from: ۡ */
    public int f9227 = -1;

    /* JADX INFO: renamed from: ֡ۨܽ, reason: not valid java name and contains not printable characters */
    public static void m55908(Object obj, int i) {
        ((C20671) obj).m46710(i);
    }

    /* JADX INFO: renamed from: ֨᩹۟, reason: not valid java name and contains not printable characters */
    public static long m55909(Object obj) {
        return ((C5738) obj).getSize();
    }

    /* JADX INFO: renamed from: ۖۧܶ, reason: not valid java name and contains not printable characters */
    public static Window m55910(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ۙ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static MenuItem m55911(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ۚ۬᩻, reason: not valid java name and contains not printable characters */
    public static void m55912(Object obj) {
        ((InterfaceC14770) obj).apply();
    }

    /* JADX INFO: renamed from: ۟ۡܿ, reason: not valid java name and contains not printable characters */
    public static String m55913(Object obj) {
        return C16111.m36665((byte[]) obj);
    }

    /* JADX INFO: renamed from: ܰ᩷᩷, reason: not valid java name and contains not printable characters */
    public static byte m55914(Object obj) {
        return ((C14677) obj).readByte();
    }

    /* JADX INFO: renamed from: ܶۖ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m55915(Object obj) {
        return ((AbstractC17043) obj).mo25093();
    }

    /* JADX INFO: renamed from: ܺᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m55916(Object obj) throws IOException {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ܽۚ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m55917(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ܽᩴ֨, reason: not valid java name and contains not printable characters */
    public static int m55918() {
        return -1026826572;
    }

    /* JADX INFO: renamed from: ᩴܽᩴ, reason: not valid java name and contains not printable characters */
    public static String m55919(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۛۙ, reason: not valid java name and contains not printable characters */
    public static int m55920(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩶֡ۤ, reason: not valid java name and contains not printable characters */
    public static String m55921(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹֫ܳ, reason: not valid java name and contains not printable characters */
    public static void m55922(Object obj) {
        ((C9729) obj).close();
    }

    /* JADX INFO: renamed from: ᩺ۜ۠, reason: not valid java name and contains not printable characters */
    public static boolean m55923(Object obj) {
        return ((String) obj).isEmpty();
    }

    public C0937(TextView textView) {
        this.f9225 = textView;
        this.f9229 = new C1287(textView);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0356  */
    /* JADX WARN: Code duplicated, block: B:215:0x035b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0364  */
    /* JADX WARN: Code duplicated, block: B:221:0x0369  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX INFO: renamed from: ֫ */
    public final void m8494(AttributeSet attributeSet, int i) {
        boolean z;
        String strM53140;
        boolean zM53134;
        boolean z2;
        ColorStateList colorStateListM53137;
        ColorStateList colorStateListM53138;
        ColorStateList colorStateListM53139;
        String strM53141;
        C1138 c1138;
        C1138 c1139;
        Drawable drawableM18628;
        float fM53136;
        int i2;
        int i3;
        int i4;
        TextView textView = this.f9225;
        Context context = textView.getContext();
        C1138 c1138M18626 = C1138.m18626();
        int[] iArr = C1010.f13527;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(textView, textView.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        int iM53139 = c1970M53129.m53139(0, -1);
        if (c1970M53129.m53135(3)) {
            this.f9233 = m8484(context, c1138M18626, c1970M53129.m53139(3, 0));
        }
        if (c1970M53129.m53135(1)) {
            this.f9235 = m8484(context, c1138M18626, c1970M53129.m53139(1, 0));
        }
        if (c1970M53129.m53135(4)) {
            this.f9230 = m8484(context, c1138M18626, c1970M53129.m53139(4, 0));
        }
        if (c1970M53129.m53135(2)) {
            this.f9232 = m8484(context, c1138M18626, c1970M53129.m53139(2, 0));
        }
        if (c1970M53129.m53135(5)) {
            this.f9236 = m8484(context, c1138M18626, c1970M53129.m53139(5, 0));
        }
        if (c1970M53129.m53135(6)) {
            z = true;
            this.f9234 = m8484(context, c1138M18626, c1970M53129.m53139(6, 0));
        } else {
            z = true;
        }
        c1970M53129.m53146();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C1010.f13505;
        if (iM53139 != -1) {
            C1970 c1970M53127 = C1970.m53127(context, iM53139, iArr2);
            if (z3 || !c1970M53127.m53135(14)) {
                zM53134 = false;
                z2 = false;
            } else {
                zM53134 = c1970M53127.m53134(14, false);
                z2 = true;
            }
            m8485(context, c1970M53127);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 23) {
                colorStateListM53137 = c1970M53127.m53135(3) ? c1970M53127.m53137(3) : null;
                colorStateListM53138 = c1970M53127.m53135(4) ? c1970M53127.m53137(4) : null;
                if (c1970M53127.m53135(5)) {
                    colorStateListM53139 = c1970M53127.m53137(5);
                    i4 = 15;
                }
                if (c1970M53127.m53135(i4)) {
                    strM53141 = c1970M53127.m53140(i4);
                } else {
                    strM53141 = null;
                }
                if (i5 >= 26 || !c1970M53127.m53135(13)) {
                    strM53140 = null;
                } else {
                    strM53140 = c1970M53127.m53140(13);
                }
                c1970M53127.m53146();
            } else {
                colorStateListM53137 = null;
                colorStateListM53138 = null;
            }
            colorStateListM53139 = null;
            i4 = 15;
            if (c1970M53127.m53135(i4)) {
                strM53141 = c1970M53127.m53140(i4);
            } else {
                strM53141 = null;
            }
            if (i5 >= 26) {
                strM53140 = null;
            } else {
                strM53140 = null;
            }
            c1970M53127.m53146();
        } else {
            strM53140 = null;
            zM53134 = false;
            z2 = false;
            colorStateListM53137 = null;
            colorStateListM53138 = null;
            colorStateListM53139 = null;
            strM53141 = null;
        }
        C1970 c1970M531210 = C1970.m53129(context, attributeSet, iArr2, i, 0);
        if (!z3 && c1970M531210.m53135(14)) {
            zM53134 = c1970M531210.m53134(14, false);
            z2 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            if (c1970M531210.m53135(3)) {
                colorStateListM53137 = c1970M531210.m53137(3);
            }
            if (c1970M531210.m53135(4)) {
                colorStateListM53138 = c1970M531210.m53137(4);
            }
            if (c1970M531210.m53135(5)) {
                colorStateListM53139 = c1970M531210.m53137(5);
            }
        }
        ColorStateList colorStateList = colorStateListM53137;
        ColorStateList colorStateList2 = colorStateListM53138;
        String strM53142 = c1970M531210.m53135(15) ? c1970M531210.m53140(15) : strM53141;
        String strM53143 = (i6 < 26 || !c1970M531210.m53135(13)) ? strM53140 : c1970M531210.m53140(13);
        boolean z4 = z;
        if (i6 < 28 || !c1970M531210.m53135(0)) {
            c1138 = c1138M18626;
        } else {
            c1138 = c1138M18626;
            if (c1970M531210.m53136(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m8485(context, c1970M531210);
        c1970M531210.m53146();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateListM53139 != null) {
            textView.setLinkTextColor(colorStateListM53139);
        }
        if (!z3 && z2) {
            m8496(zM53134);
        }
        Typeface typeface = this.f9228;
        if (typeface != null) {
            if (this.f9227 == -1) {
                textView.setTypeface(typeface, this.f9231);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM53143 != null) {
            C1522.m35069(textView, strM53143);
        }
        if (strM53142 != null) {
            if (i6 >= 24) {
                C1977.m53365(textView, C1977.m53364(strM53142));
            } else {
                textView.setTextLocale(C1417.m30528(strM53142.split(",")[0]));
            }
        }
        C1287 c1287 = this.f9229;
        c1287.m25117(attributeSet, i);
        if (C1956.f75467 && c1287.m25120() != 0) {
            int[] iArrM25122 = c1287.m25122();
            if (iArrM25122.length > 0) {
                if (C1522.m35066(textView) != -1.0f) {
                    C1522.m35067(textView, c1287.m25121(), c1287.m25119(), c1287.m25123(), 0);
                } else {
                    C1522.m35068(textView, iArrM25122, 0);
                }
            }
        }
        C1970 c1970M53128 = C1970.m53128(context, attributeSet, C1010.f13513);
        int iM531310 = c1970M53128.m53139(8, -1);
        if (iM531310 != -1) {
            c1139 = c1138;
            drawableM18628 = c1139.m18628(context, iM531310);
        } else {
            c1139 = c1138;
            drawableM18628 = null;
        }
        int iM531311 = c1970M53128.m53139(13, -1);
        Drawable drawableM18629 = iM531311 != -1 ? c1139.m18628(context, iM531311) : null;
        int iM531312 = c1970M53128.m53139(9, -1);
        Drawable drawableM186210 = iM531312 != -1 ? c1139.m18628(context, iM531312) : null;
        int iM531313 = c1970M53128.m53139(6, -1);
        Drawable drawableM186211 = iM531313 != -1 ? c1139.m18628(context, iM531313) : null;
        int iM531314 = c1970M53128.m53139(10, -1);
        Drawable drawableM186212 = iM531314 != -1 ? c1139.m18628(context, iM531314) : null;
        int iM531315 = c1970M53128.m53139(7, -1);
        Drawable drawableM186213 = iM531315 != -1 ? c1139.m18628(context, iM531315) : null;
        if (drawableM186212 != null || drawableM186213 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM186212 == null) {
                drawableM186212 = compoundDrawablesRelative[0];
            }
            if (drawableM18629 == null) {
                drawableM18629 = compoundDrawablesRelative[z4 ? 1 : 0];
            }
            if (drawableM186213 == null) {
                drawableM186213 = compoundDrawablesRelative[2];
            }
            if (drawableM186211 == null) {
                drawableM186211 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM186212, drawableM18629, drawableM186213, drawableM186211);
        } else if (drawableM18628 != null || drawableM18629 != null || drawableM186210 != null || drawableM186211 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable != null || compoundDrawablesRelative2[2] != null) {
                if (drawableM18629 == null) {
                    drawableM18629 = compoundDrawablesRelative2[z4 ? 1 : 0];
                }
                if (drawableM186211 == null) {
                    drawableM186211 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM18629, compoundDrawablesRelative2[2], drawableM186211);
            } else {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM18628 == null) {
                    drawableM18628 = compoundDrawables[0];
                }
                if (drawableM18629 == null) {
                    drawableM18629 = compoundDrawables[z4 ? 1 : 0];
                }
                if (drawableM186210 == null) {
                    drawableM186210 = compoundDrawables[2];
                }
                if (drawableM186211 == null) {
                    drawableM186211 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM18628, drawableM18629, drawableM186210, drawableM186211);
            }
        }
        if (c1970M53128.m53135(11)) {
            C6483.m14855(textView, c1970M53128.m53137(11));
        }
        if (c1970M53128.m53135(12)) {
            C6483.m14856(textView, C1602.m38504(c1970M53128.m53142(12, -1), null));
        }
        int iM53136 = c1970M53128.m53136(15, -1);
        int iM53137 = c1970M53128.m53136(18, -1);
        if (c1970M53128.m53135(19)) {
            TypedValue typedValueM53149 = c1970M53128.m53149();
            if (typedValueM53149 != null && typedValueM53149.type == 5) {
                int i7 = typedValueM53149.data;
                i3 = i7 & 15;
                fM53136 = TypedValue.complexToFloat(i7);
                i2 = -1;
            } else {
                fM53136 = c1970M53128.m53136(19, -1);
            }
            c1970M53128.m53146();
            if (iM53136 != i2) {
                C6483.m14853(textView, iM53136);
            }
            if (iM53137 != i2) {
                C6483.m14859(textView, iM53137);
            }
            if (fM53136 != -1.0f) {
                if (i3 == i2) {
                    C6483.m14860(textView, (int) fM53136);
                } else {
                    C6483.m14854(textView, i3, fM53136);
                }
            }
        }
        fM53136 = -1.0f;
        i2 = -1;
        i3 = -1;
        c1970M53128.m53146();
        if (iM53136 != i2) {
            C6483.m14853(textView, iM53136);
        }
        if (iM53137 != i2) {
            C6483.m14859(textView, iM53137);
        }
        if (fM53136 != -1.0f) {
            if (i3 == i2) {
                C6483.m14860(textView, (int) fM53136);
            } else {
                C6483.m14854(textView, i3, fM53136);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8485(Context context, C1970 c1970) {
        String strM53140;
        this.f9231 = c1970.m53142(2, this.f9231);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM53142 = c1970.m53142(11, -1);
            this.f9227 = iM53142;
            if (iM53142 != -1) {
                this.f9231 &= 2;
            }
        }
        if (c1970.m53135(10) || c1970.m53135(12)) {
            this.f9228 = null;
            int i2 = c1970.m53135(12) ? 12 : 10;
            int i3 = this.f9227;
            int i4 = this.f9231;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM53133 = c1970.m53133(i2, this.f9231, new C1347(this, i3, i4, new WeakReference(this.f9225)));
                    if (typefaceM53133 != null) {
                        if (i >= 28 && this.f9227 != -1) {
                            this.f9228 = C1207.m21685(Typeface.create(typefaceM53133, 0), this.f9227, (this.f9231 & 2) != 0);
                        } else {
                            this.f9228 = typefaceM53133;
                        }
                    }
                    this.f9224 = this.f9228 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f9228 != null || (strM53140 = c1970.m53140(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f9227 != -1) {
                this.f9228 = C1207.m21685(Typeface.create(strM53140, 0), this.f9227, (this.f9231 & 2) != 0);
                return;
            } else {
                this.f9228 = Typeface.create(strM53140, this.f9231);
                return;
            }
        }
        if (c1970.m53135(1)) {
            this.f9224 = false;
            int iM53143 = c1970.m53142(1, 1);
            if (iM53143 == 1) {
                this.f9228 = Typeface.SANS_SERIF;
            } else if (iM53143 == 2) {
                this.f9228 = Typeface.SERIF;
            } else {
                if (iM53143 != 3) {
                    return;
                }
                this.f9228 = Typeface.MONOSPACE;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8495(WeakReference weakReference, Typeface typeface) {
        if (this.f9224) {
            this.f9228 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC1137(textView, typeface, this.f9231));
                } else {
                    textView.setTypeface(typeface, this.f9231);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8491(Context context, int i) {
        String strM53140;
        ColorStateList colorStateListM53137;
        ColorStateList colorStateListM53138;
        ColorStateList colorStateListM53139;
        C1970 c1970M53127 = C1970.m53127(context, i, C1010.f13505);
        if (c1970M53127.m53135(14)) {
            m8496(c1970M53127.m53134(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        TextView textView = this.f9225;
        if (i2 < 23) {
            if (c1970M53127.m53135(3) && (colorStateListM53139 = c1970M53127.m53137(3)) != null) {
                textView.setTextColor(colorStateListM53139);
            }
            if (c1970M53127.m53135(5) && (colorStateListM53138 = c1970M53127.m53137(5)) != null) {
                textView.setLinkTextColor(colorStateListM53138);
            }
            if (c1970M53127.m53135(4) && (colorStateListM53137 = c1970M53127.m53137(4)) != null) {
                textView.setHintTextColor(colorStateListM53137);
            }
        }
        if (c1970M53127.m53135(0) && c1970M53127.m53136(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m8485(context, c1970M53127);
        if (i2 >= 26 && c1970M53127.m53135(13) && (strM53140 = c1970M53127.m53140(13)) != null) {
            C1522.m35069(textView, strM53140);
        }
        c1970M53127.m53146();
        Typeface typeface = this.f9228;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9231);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8496(boolean z) {
        this.f9225.setAllCaps(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8487() {
        C1130 c1130 = this.f9233;
        TextView textView = this.f9225;
        if (c1130 != null || this.f9235 != null || this.f9230 != null || this.f9232 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m8486(compoundDrawables[0], this.f9233);
            m8486(compoundDrawables[1], this.f9235);
            m8486(compoundDrawables[2], this.f9230);
            m8486(compoundDrawables[3], this.f9232);
        }
        if (this.f9236 == null && this.f9234 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m8486(compoundDrawablesRelative[0], this.f9236);
        m8486(compoundDrawablesRelative[2], this.f9234);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8486(Drawable drawable, C1130 c1130) {
        if (drawable == null || c1130 == null) {
            return;
        }
        int[] drawableState = this.f9225.getDrawableState();
        int i = C1138.f21149;
        C0920.m7580(drawable, c1130, drawableState);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1130 m8484(Context context, C1138 c1138, int i) {
        ColorStateList colorStateListM18631 = c1138.m18631(context, i);
        if (colorStateListM18631 == null) {
            return null;
        }
        C1130 c1130 = new C1130();
        c1130.f20689 = true;
        c1130.f20691 = colorStateListM18631;
        return c1130;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8489(int i, float f) {
        if (C1956.f75467) {
            return;
        }
        C1287 c1287 = this.f9229;
        if (c1287.m25124()) {
            return;
        }
        c1287.m25114(f, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8500() {
        this.f9229.m25113();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m8499() {
        return this.f9229.m25124();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8488(int i) {
        this.f9229.m25115(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8490(int i, int i2, int i3, int i4) {
        this.f9229.m25116(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8497(int[] iArr, int i) {
        this.f9229.m25118(iArr, i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m8506() {
        return this.f9229.m25120();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m8503() {
        return this.f9229.m25123();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m8504() {
        return this.f9229.m25121();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8502() {
        return this.f9229.m25119();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int[] m8501() {
        return this.f9229.m25122();
    }

    /* JADX INFO: renamed from: ۜ */
    public final ColorStateList m8498() {
        C1130 c1130 = this.f9226;
        if (c1130 != null) {
            return c1130.f20691;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8492(ColorStateList colorStateList) {
        if (this.f9226 == null) {
            this.f9226 = new C1130();
        }
        C1130 c1130 = this.f9226;
        c1130.f20691 = colorStateList;
        c1130.f20689 = colorStateList != null;
        this.f9233 = c1130;
        this.f9235 = c1130;
        this.f9230 = c1130;
        this.f9232 = c1130;
        this.f9236 = c1130;
        this.f9234 = c1130;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final PorterDuff.Mode m8505() {
        C1130 c1130 = this.f9226;
        if (c1130 != null) {
            return c1130.f20692;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8493(PorterDuff.Mode mode) {
        if (this.f9226 == null) {
            this.f9226 = new C1130();
        }
        C1130 c1130 = this.f9226;
        c1130.f20692 = mode;
        c1130.f20690 = mode != null;
        this.f9233 = c1130;
        this.f9235 = c1130;
        this.f9230 = c1130;
        this.f9232 = c1130;
        this.f9236 = c1130;
        this.f9234 = c1130;
    }
}
