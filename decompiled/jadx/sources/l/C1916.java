package l;

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

/* JADX INFO: renamed from: l.֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class C1916 {

    /* JADX INFO: renamed from: ֡ܳ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f6442;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6443;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f6444;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5800 f6445;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Typeface f6447;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8972 f6448;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5800 f6449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5800 f6451;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5800 f6452;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5800 f6453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5800 f6454;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5800 f6455;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6450 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f6446 = -1;

    /* JADX INFO: renamed from: ֡ۨܽ, reason: not valid java name and contains not printable characters */
    public static void m6295(Object obj, int i) {
        ((C19258) obj).m44416(i);
    }

    /* JADX INFO: renamed from: ֨᩹۟, reason: not valid java name and contains not printable characters */
    public static long m6296(Object obj) {
        return ((C3545) obj).getSize();
    }

    /* JADX INFO: renamed from: ۖۧܶ, reason: not valid java name and contains not printable characters */
    public static Window m6300(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ۙ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6301(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ۚ۬᩻, reason: not valid java name and contains not printable characters */
    public static void m6302(Object obj) {
        ((InterfaceC13049) obj).apply();
    }

    /* JADX INFO: renamed from: ۟ۡܿ, reason: not valid java name and contains not printable characters */
    public static String m6303(Object obj) {
        return C14460.m34531((byte[]) obj);
    }

    /* JADX INFO: renamed from: ܰ᩷᩷, reason: not valid java name and contains not printable characters */
    public static byte m6304(Object obj) {
        return ((C12951) obj).readByte();
    }

    /* JADX INFO: renamed from: ܶۖ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m6305(Object obj) {
        return ((AbstractC15440) obj).mo23119();
    }

    /* JADX INFO: renamed from: ܺᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m6306(Object obj) throws IOException {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ܽۚ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m6307(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ܽᩴ֨, reason: not valid java name and contains not printable characters */
    public static int m6308() {
        return -1026826572;
    }

    /* JADX INFO: renamed from: ᩴܽᩴ, reason: not valid java name and contains not printable characters */
    public static String m6309(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۛۙ, reason: not valid java name and contains not printable characters */
    public static int m6310(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩶֡ۤ, reason: not valid java name and contains not printable characters */
    public static String m6311(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹֫ܳ, reason: not valid java name and contains not printable characters */
    public static void m6312(Object obj) {
        ((C7744) obj).close();
    }

    /* JADX INFO: renamed from: ᩺ۜ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6313(Object obj) {
        return ((String) obj).isEmpty();
    }

    public C1916(TextView textView) {
        this.f6444 = textView;
        this.f6448 = new C8972(textView);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6321(AttributeSet attributeSet, int i) {
        boolean z;
        String strM50807;
        boolean zM50801;
        boolean z2;
        ColorStateList colorStateListM50804;
        ColorStateList colorStateListM50805;
        ColorStateList colorStateListM50806;
        String strM50808;
        C5965 c5965;
        C5965 c5966;
        Drawable drawableM16702;
        float fM50803;
        int i2;
        int i3;
        int i4;
        TextView textView = this.f6444;
        Context context = textView.getContext();
        C5965 c5965M16700 = C5965.m16700();
        int[] iArr = C3390.f10720;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(textView, textView.getContext(), iArr, attributeSet, c22733M50796.m50810(), i);
        int iM50806 = c22733M50796.m50806(0, -1);
        if (c22733M50796.m50802(3)) {
            this.f6452 = m6297(context, c5965M16700, c22733M50796.m50806(3, 0));
        }
        if (c22733M50796.m50802(1)) {
            this.f6454 = m6297(context, c5965M16700, c22733M50796.m50806(1, 0));
        }
        if (c22733M50796.m50802(4)) {
            this.f6449 = m6297(context, c5965M16700, c22733M50796.m50806(4, 0));
        }
        if (c22733M50796.m50802(2)) {
            this.f6451 = m6297(context, c5965M16700, c22733M50796.m50806(2, 0));
        }
        if (c22733M50796.m50802(5)) {
            this.f6455 = m6297(context, c5965M16700, c22733M50796.m50806(5, 0));
        }
        if (c22733M50796.m50802(6)) {
            z = true;
            this.f6453 = m6297(context, c5965M16700, c22733M50796.m50806(6, 0));
        } else {
            z = true;
        }
        c22733M50796.m50813();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C3390.f10698;
        if (iM50806 != -1) {
            C22733 c22733M50794 = C22733.m50794(context, iM50806, iArr2);
            if (z3 || !c22733M50794.m50802(14)) {
                zM50801 = false;
                z2 = false;
            } else {
                zM50801 = c22733M50794.m50801(14, false);
                z2 = true;
            }
            m6298(context, c22733M50794);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 23) {
                colorStateListM50804 = c22733M50794.m50802(3) ? c22733M50794.m50804(3) : null;
                colorStateListM50805 = c22733M50794.m50802(4) ? c22733M50794.m50804(4) : null;
                if (c22733M50794.m50802(5)) {
                    colorStateListM50806 = c22733M50794.m50804(5);
                    i4 = 15;
                }
                if (c22733M50794.m50802(i4)) {
                    strM50808 = c22733M50794.m50807(i4);
                } else {
                    strM50808 = null;
                }
                if (i5 >= 26 || !c22733M50794.m50802(13)) {
                    strM50807 = null;
                } else {
                    strM50807 = c22733M50794.m50807(13);
                }
                c22733M50794.m50813();
            } else {
                colorStateListM50804 = null;
                colorStateListM50805 = null;
            }
            colorStateListM50806 = null;
            i4 = 15;
            if (c22733M50794.m50802(i4)) {
                strM50808 = c22733M50794.m50807(i4);
            } else {
                strM50808 = null;
            }
            if (i5 >= 26) {
                strM50807 = null;
            } else {
                strM50807 = null;
            }
            c22733M50794.m50813();
        } else {
            strM50807 = null;
            zM50801 = false;
            z2 = false;
            colorStateListM50804 = null;
            colorStateListM50805 = null;
            colorStateListM50806 = null;
            strM50808 = null;
        }
        C22733 c22733M50797 = C22733.m50796(context, attributeSet, iArr2, i, 0);
        if (!z3 && c22733M50797.m50802(14)) {
            zM50801 = c22733M50797.m50801(14, false);
            z2 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            if (c22733M50797.m50802(3)) {
                colorStateListM50804 = c22733M50797.m50804(3);
            }
            if (c22733M50797.m50802(4)) {
                colorStateListM50805 = c22733M50797.m50804(4);
            }
            if (c22733M50797.m50802(5)) {
                colorStateListM50806 = c22733M50797.m50804(5);
            }
        }
        ColorStateList colorStateList = colorStateListM50804;
        ColorStateList colorStateList2 = colorStateListM50805;
        String strM50809 = c22733M50797.m50802(15) ? c22733M50797.m50807(15) : strM50808;
        String strM508010 = (i6 < 26 || !c22733M50797.m50802(13)) ? strM50807 : c22733M50797.m50807(13);
        boolean z4 = z;
        if (i6 < 28 || !c22733M50797.m50802(0)) {
            c5965 = c5965M16700;
        } else {
            c5965 = c5965M16700;
            if (c22733M50797.m50803(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m6298(context, c22733M50797);
        c22733M50797.m50813();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateListM50806 != null) {
            textView.setLinkTextColor(colorStateListM50806);
        }
        if (!z3 && z2) {
            m6323(zM50801);
        }
        Typeface typeface = this.f6447;
        if (typeface != null) {
            if (this.f6446 == -1) {
                textView.setTypeface(typeface, this.f6450);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM508010 != null) {
            C13704.m32955(textView, strM508010);
        }
        if (strM50809 != null) {
            if (i6 >= 24) {
                C22877.m50975(textView, C22877.m50974(strM50809));
            } else {
                textView.setTextLocale(C11589.m28482(strM50809.split(",")[0]));
            }
        }
        C8972 c8972 = this.f6448;
        c8972.m23173(attributeSet, i);
        if (C22461.f72739 && c8972.m23176() != 0) {
            int[] iArrM23178 = c8972.m23178();
            if (iArrM23178.length > 0) {
                if (C13704.m32952(textView) != -1.0f) {
                    C13704.m32953(textView, c8972.m23177(), c8972.m23175(), c8972.m23179(), 0);
                } else {
                    C13704.m32954(textView, iArrM23178, 0);
                }
            }
        }
        C22733 c22733M50795 = C22733.m50795(context, attributeSet, C3390.f10706);
        int iM50807 = c22733M50795.m50806(8, -1);
        if (iM50807 != -1) {
            c5966 = c5965;
            drawableM16702 = c5966.m16702(context, iM50807);
        } else {
            c5966 = c5965;
            drawableM16702 = null;
        }
        int iM50808 = c22733M50795.m50806(13, -1);
        Drawable drawableM16703 = iM50808 != -1 ? c5966.m16702(context, iM50808) : null;
        int iM50809 = c22733M50795.m50806(9, -1);
        Drawable drawableM16704 = iM50809 != -1 ? c5966.m16702(context, iM50809) : null;
        int iM508010 = c22733M50795.m50806(6, -1);
        Drawable drawableM16705 = iM508010 != -1 ? c5966.m16702(context, iM508010) : null;
        int iM508011 = c22733M50795.m50806(10, -1);
        Drawable drawableM16706 = iM508011 != -1 ? c5966.m16702(context, iM508011) : null;
        int iM508012 = c22733M50795.m50806(7, -1);
        Drawable drawableM16707 = iM508012 != -1 ? c5966.m16702(context, iM508012) : null;
        if (drawableM16706 != null || drawableM16707 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM16706 == null) {
                drawableM16706 = compoundDrawablesRelative[0];
            }
            if (drawableM16703 == null) {
                drawableM16703 = compoundDrawablesRelative[z4 ? 1 : 0];
            }
            if (drawableM16707 == null) {
                drawableM16707 = compoundDrawablesRelative[2];
            }
            if (drawableM16705 == null) {
                drawableM16705 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM16706, drawableM16703, drawableM16707, drawableM16705);
        } else if (drawableM16702 != null || drawableM16703 != null || drawableM16704 != null || drawableM16705 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable != null || compoundDrawablesRelative2[2] != null) {
                if (drawableM16703 == null) {
                    drawableM16703 = compoundDrawablesRelative2[z4 ? 1 : 0];
                }
                if (drawableM16705 == null) {
                    drawableM16705 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM16703, compoundDrawablesRelative2[2], drawableM16705);
            } else {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM16702 == null) {
                    drawableM16702 = compoundDrawables[0];
                }
                if (drawableM16703 == null) {
                    drawableM16703 = compoundDrawables[z4 ? 1 : 0];
                }
                if (drawableM16704 == null) {
                    drawableM16704 = compoundDrawables[2];
                }
                if (drawableM16705 == null) {
                    drawableM16705 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM16702, drawableM16703, drawableM16704, drawableM16705);
            }
        }
        if (c22733M50795.m50802(11)) {
            C4330.m12991(textView, c22733M50795.m50804(11));
        }
        if (c22733M50795.m50802(12)) {
            C4330.m12992(textView, C15320.m36346(c22733M50795.m50809(12, -1), null));
        }
        int iM50803 = c22733M50795.m50803(15, -1);
        int iM50804 = c22733M50795.m50803(18, -1);
        if (c22733M50795.m50802(19)) {
            TypedValue typedValueM50816 = c22733M50795.m50816();
            if (typedValueM50816 != null && typedValueM50816.type == 5) {
                int i7 = typedValueM50816.data;
                i3 = i7 & 15;
                fM50803 = TypedValue.complexToFloat(i7);
                i2 = -1;
            } else {
                fM50803 = c22733M50795.m50803(19, -1);
            }
            c22733M50795.m50813();
            if (iM50803 != i2) {
                C4330.m12989(textView, iM50803);
            }
            if (iM50804 != i2) {
                C4330.m12995(textView, iM50804);
            }
            if (fM50803 != -1.0f) {
                if (i3 == i2) {
                    C4330.m12996(textView, (int) fM50803);
                } else {
                    C4330.m12990(textView, i3, fM50803);
                }
            }
        }
        fM50803 = -1.0f;
        i2 = -1;
        i3 = -1;
        c22733M50795.m50813();
        if (iM50803 != i2) {
            C4330.m12989(textView, iM50803);
        }
        if (iM50804 != i2) {
            C4330.m12995(textView, iM50804);
        }
        if (fM50803 != -1.0f) {
            if (i3 == i2) {
                C4330.m12996(textView, (int) fM50803);
            } else {
                C4330.m12990(textView, i3, fM50803);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6298(Context context, C22733 c22733) {
        String strM50807;
        this.f6450 = c22733.m50809(2, this.f6450);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM50809 = c22733.m50809(11, -1);
            this.f6446 = iM50809;
            if (iM50809 != -1) {
                this.f6450 &= 2;
            }
        }
        if (c22733.m50802(10) || c22733.m50802(12)) {
            this.f6447 = null;
            int i2 = c22733.m50802(12) ? 12 : 10;
            int i3 = this.f6446;
            int i4 = this.f6450;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM50800 = c22733.m50800(i2, this.f6450, new C10178(this, i3, i4, new WeakReference(this.f6444)));
                    if (typefaceM50800 != null) {
                        if (i >= 28 && this.f6446 != -1) {
                            this.f6447 = C7355.m19712(Typeface.create(typefaceM50800, 0), this.f6446, (this.f6450 & 2) != 0);
                        } else {
                            this.f6447 = typefaceM50800;
                        }
                    }
                    this.f6443 = this.f6447 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f6447 != null || (strM50807 = c22733.m50807(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f6446 != -1) {
                this.f6447 = C7355.m19712(Typeface.create(strM50807, 0), this.f6446, (this.f6450 & 2) != 0);
                return;
            } else {
                this.f6447 = Typeface.create(strM50807, this.f6450);
                return;
            }
        }
        if (c22733.m50802(1)) {
            this.f6443 = false;
            int iM508010 = c22733.m50809(1, 1);
            if (iM508010 == 1) {
                this.f6447 = Typeface.SANS_SERIF;
            } else if (iM508010 == 2) {
                this.f6447 = Typeface.SERIF;
            } else {
                if (iM508010 != 3) {
                    return;
                }
                this.f6447 = Typeface.MONOSPACE;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6322(WeakReference weakReference, Typeface typeface) {
        if (this.f6443) {
            this.f6447 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC5944(textView, typeface, this.f6450));
                } else {
                    textView.setTypeface(typeface, this.f6450);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6318(Context context, int i) {
        String strM50807;
        ColorStateList colorStateListM50804;
        ColorStateList colorStateListM50805;
        ColorStateList colorStateListM50806;
        C22733 c22733M50794 = C22733.m50794(context, i, C3390.f10698);
        if (c22733M50794.m50802(14)) {
            m6323(c22733M50794.m50801(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        TextView textView = this.f6444;
        if (i2 < 23) {
            if (c22733M50794.m50802(3) && (colorStateListM50806 = c22733M50794.m50804(3)) != null) {
                textView.setTextColor(colorStateListM50806);
            }
            if (c22733M50794.m50802(5) && (colorStateListM50805 = c22733M50794.m50804(5)) != null) {
                textView.setLinkTextColor(colorStateListM50805);
            }
            if (c22733M50794.m50802(4) && (colorStateListM50804 = c22733M50794.m50804(4)) != null) {
                textView.setHintTextColor(colorStateListM50804);
            }
        }
        if (c22733M50794.m50802(0) && c22733M50794.m50803(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m6298(context, c22733M50794);
        if (i2 >= 26 && c22733M50794.m50802(13) && (strM50807 = c22733M50794.m50807(13)) != null) {
            C13704.m32955(textView, strM50807);
        }
        c22733M50794.m50813();
        Typeface typeface = this.f6447;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f6450);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6323(boolean z) {
        this.f6444.setAllCaps(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6314() {
        C5800 c5800 = this.f6452;
        TextView textView = this.f6444;
        if (c5800 != null || this.f6454 != null || this.f6449 != null || this.f6451 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m6299(compoundDrawables[0], this.f6452);
            m6299(compoundDrawables[1], this.f6454);
            m6299(compoundDrawables[2], this.f6449);
            m6299(compoundDrawables[3], this.f6451);
        }
        if (this.f6455 == null && this.f6453 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m6299(compoundDrawablesRelative[0], this.f6455);
        m6299(compoundDrawablesRelative[2], this.f6453);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6299(Drawable drawable, C5800 c5800) {
        if (drawable == null || c5800 == null) {
            return;
        }
        int[] drawableState = this.f6444.getDrawableState();
        int i = C5965.f18296;
        C1566.m5351(drawable, c5800, drawableState);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5800 m6297(Context context, C5965 c5965, int i) {
        ColorStateList colorStateListM16705 = c5965.m16705(context, i);
        if (colorStateListM16705 == null) {
            return null;
        }
        C5800 c5800 = new C5800();
        c5800.f17836 = true;
        c5800.f17838 = colorStateListM16705;
        return c5800;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6316(int i, float f) {
        if (C22461.f72739) {
            return;
        }
        C8972 c8972 = this.f6448;
        if (c8972.m23180()) {
            return;
        }
        c8972.m23170(f, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6327() {
        this.f6448.m23169();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m6326() {
        return this.f6448.m23180();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6315(int i) {
        this.f6448.m23171(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6317(int i, int i2, int i3, int i4) {
        this.f6448.m23172(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6324(int[] iArr, int i) {
        this.f6448.m23174(iArr, i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m6333() {
        return this.f6448.m23176();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m6330() {
        return this.f6448.m23179();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6331() {
        return this.f6448.m23177();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6329() {
        return this.f6448.m23175();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m6328() {
        return this.f6448.m23178();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m6325() {
        C5800 c5800 = this.f6445;
        if (c5800 != null) {
            return c5800.f17838;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6319(ColorStateList colorStateList) {
        if (this.f6445 == null) {
            this.f6445 = new C5800();
        }
        C5800 c5800 = this.f6445;
        c5800.f17838 = colorStateList;
        c5800.f17836 = colorStateList != null;
        this.f6452 = c5800;
        this.f6454 = c5800;
        this.f6449 = c5800;
        this.f6451 = c5800;
        this.f6455 = c5800;
        this.f6453 = c5800;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m6332() {
        C5800 c5800 = this.f6445;
        if (c5800 != null) {
            return c5800.f17839;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6320(PorterDuff.Mode mode) {
        if (this.f6445 == null) {
            this.f6445 = new C5800();
        }
        C5800 c5800 = this.f6445;
        c5800.f17839 = mode;
        c5800.f17837 = mode != null;
        this.f6452 = c5800;
        this.f6454 = c5800;
        this.f6449 = c5800;
        this.f6451 = c5800;
        this.f6455 = c5800;
        this.f6453 = c5800;
    }
}
