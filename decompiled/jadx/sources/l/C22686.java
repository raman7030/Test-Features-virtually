package l;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4RP */
/* JADX INFO: loaded from: classes.dex */
public final class C22686 extends C9584 {

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static final String f73225 = String.valueOf('\n');

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f73226;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73227;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f73228;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public int f73229;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f73230;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public Drawable f73231;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C12392 f73232;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public float f73233;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final int f73234;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public boolean f73235;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f73236;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public float f73237;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final int f73238;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public int f73239;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f73240;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public int f73241;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f73242;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public boolean f73243;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Integer f73244;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public float f73245;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public C22597 f73246;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public int f73247;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public int f73248;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f73249;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public int f73250;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f73251;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final C15859 f73252;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18702 f73253;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public float f73254;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f73255;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public boolean f73256;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f73257;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public int f73258;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public int f73259;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f73260;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public boolean f73261;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f73262;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73263;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f73264;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73265;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f73266;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f73267;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f73268;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C1539 f73269;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public int f73270;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f73271;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public boolean f73272;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f73273;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public int f73274;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f73275;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public int f73276;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public int f73277;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f73278;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f73279;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public Drawable f73280;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f73281;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f73282;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public Drawable f73283;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f73284;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f73285;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f73286;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public int f73287;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final int f73288;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public float f73289;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public Integer f73290;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73291;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final int f73292;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public String f73293;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f73294;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public int f73295;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f73296;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public String f73297;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f73298;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public float f73299;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public C22597 f73300;

    @Override // l.C9584
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo24477(float f) {
        super.mo24477(f);
        this.f73299 = m50680(this.f73269.getFontMetrics());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50684(float f, int i) {
        this.f73248 = i;
        int i2 = i & 255;
        if (i2 == 0) {
            this.f29058.setTypeface(Typeface.MONOSPACE);
        } else if (i2 == 1) {
            this.f29058.setTypeface((Typeface) SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49281().f30698);
        } else if (i2 != 2) {
            this.f29058.setTypeface(Typeface.DEFAULT);
        } else {
            Object tag = this.f73232.getTag(R.id.MT_Protector);
            if (tag instanceof Typeface) {
                this.f29058.setTypeface((Typeface) tag);
            } else {
                this.f29058.setTypeface(Typeface.DEFAULT);
            }
        }
        m24483();
        this.f29058.setTextSize(f);
        m24481();
        this.f73269.setTypeface(this.f29058.getTypeface());
        this.f73269.setTextSize(f);
        this.f73299 = m50680(this.f73269.getFontMetrics());
        float fMeasureText = this.f73269.measureText("0");
        this.f73245 = fMeasureText;
        float f2 = fMeasureText / 2.0f;
        this.f73281 = f2;
        this.f73251 = (int) (f2 * 0.8f);
        this.f73270 = (int) (m24495() * 0.5f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m50689(float f) {
        float f2 = this.f73233;
        if (f > f2) {
            f = f2;
        } else {
            f2 = this.f73237;
            if (f < f2) {
                f = f2;
            }
        }
        if (this.f29058.getTextSize() == f) {
            return false;
        }
        this.f29058.setTextSize(f);
        m24481();
        this.f73269.setTypeface(this.f29058.getTypeface());
        this.f73269.setTextSize(f);
        this.f73299 = m50680(this.f73269.getFontMetrics());
        float fMeasureText = this.f73269.measureText("0");
        this.f73245 = fMeasureText;
        float f3 = fMeasureText / 2.0f;
        this.f73281 = f3;
        this.f73251 = (int) (f3 * 0.8f);
        this.f73270 = (int) (m24495() * 0.5f);
        return true;
    }

    public C22686(C12392 c12392) {
        super(c12392.getContext());
        this.f73261 = true;
        this.f73257 = true;
        this.f73255 = false;
        this.f73265 = true;
        this.f73291 = true;
        this.f73298 = 3;
        this.f73256 = true;
        this.f73285 = true;
        this.f73236 = true;
        this.f73249 = true;
        this.f73226 = true;
        this.f73271 = true;
        this.f73240 = false;
        this.f73267 = false;
        this.f73227 = true;
        this.f73272 = false;
        this.f73296 = false;
        this.f73235 = false;
        this.f73243 = false;
        this.f73228 = true;
        this.f73284 = true;
        this.f73250 = -1;
        this.f73229 = -1;
        this.f73252 = new C15859();
        this.f73262 = C13802.f41130;
        Resources resources = c12392.getResources();
        this.f73232 = c12392;
        float f = this.f29053;
        this.f73233 = 30.0f * f;
        this.f73237 = f * 6.0f;
        this.f73248 = 255;
        this.f73293 = "\n";
        this.f73263 = true;
        C1539 c1539 = new C1539(0);
        this.f73269 = c1539;
        c1539.setTextAlign(Paint.Align.CENTER);
        c1539.setTypeface(Typeface.DEFAULT);
        m50689(this.f29053 * 15.0f);
        Drawable drawableMutate = C4369.m13097(resources, R.drawable.MT_Protector, null).mutate();
        this.f73283 = drawableMutate;
        Drawable drawableMutate2 = C4369.m13097(resources, R.drawable.MT_Protector, null).mutate();
        this.f73280 = drawableMutate2;
        Drawable drawableMutate3 = C4369.m13097(resources, R.drawable.MT_Protector, null).mutate();
        this.f73231 = drawableMutate3;
        this.f73277 = drawableMutate.getIntrinsicWidth() / 2;
        this.f73259 = drawableMutate3.getIntrinsicHeight() * 3;
        drawableMutate3.setAlpha(230);
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        this.f73274 = -drawableMutate3.getIntrinsicHeight();
        this.f73273 = drawableMutate3.getIntrinsicHeight() / 2;
        this.f73292 = -579373193;
        this.f73234 = 964130679;
        float f2 = this.f29068;
        this.f73238 = (int) (8.0f * f2);
        this.f73288 = (int) (48.0f * f2);
        this.f73295 = 2003199590;
        this.f73289 = f2 * 4.0f;
        this.f73246 = C22597.m50571(resources, R.drawable.MT_Protector, null);
        this.f73300 = C22597.m50571(resources, R.drawable.MT_Protector, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50686(C10130 c10130) {
        c10130.m25423((CharSequence) this.f73293);
        c10130.m25425(this.f73263);
        c10130.writeByte(this.f73248);
        c10130.m25419(this.f29058.getTextSize());
        c10130.mo13231(m24485());
        c10130.m25425(m24482());
        c10130.m25425(m24498());
        c10130.m25425(this.f73227);
        c10130.m25425(this.f73272);
        c10130.m25425(this.f73267);
        if (this.f73267) {
            c10130.m25423((CharSequence) this.f73297);
        }
        c10130.writeInt(591749672);
        c10130.m25425(m24499());
        c10130.m25425(m24470());
        c10130.m25425(this.f73261);
        if (this.f73290 == null) {
            c10130.writeByte(0);
        } else {
            c10130.m25425(true);
            c10130.writeInt(this.f73290.intValue());
        }
        if (this.f73244 == null) {
            c10130.writeByte(0);
        } else {
            c10130.m25425(true);
            c10130.writeInt(this.f73244.intValue());
        }
        c10130.m25419(m24500());
        c10130.m25419(m24484());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m50683() {
        int iIntValue;
        int iIntValue2;
        int i = C21943.f70257;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.f73283.setColorFilter(porterDuffColorFilter);
        this.f73280.setColorFilter(porterDuffColorFilter);
        this.f73231.setColorFilter(porterDuffColorFilter);
        this.f73294 = i;
        Integer num = this.f73290;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (C21943.m49431()) {
            iIntValue = this.f73232 instanceof C10235 ? C21943.f70284 : -5654586;
        } else {
            iIntValue = -16777216;
        }
        m24489(iIntValue);
        Integer num2 = this.f73244;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = C21943.m49431() ? -1866415936 : -1979711488;
        }
        this.f73266 = iIntValue2;
        if (C21943.m49431()) {
            this.f73275 = -13948117;
            this.f73276 = -7829368;
            this.f73258 = -13223878;
            this.f73282 = -11184811;
            this.f73279 = -10978957;
            this.f73247 = -10461088;
            this.f73230 = -6974059;
            this.f73268 = -13158601;
            this.f73242 = -12888001;
            this.f73260 = -11964850;
            this.f73241 = 537981088;
        } else {
            this.f73275 = -1;
            this.f73276 = -5197648;
            this.f73258 = -460552;
            this.f73282 = -3092272;
            this.f73279 = -10053737;
            this.f73247 = -2960686;
            this.f73230 = -6645094;
            this.f73268 = -1309;
            this.f73242 = -684;
            this.f73260 = 0;
            this.f73241 = 537960464;
        }
        this.f73239 = C9584.m24461(this.f73275, i & 1728053247);
        if (C21943.m49431()) {
            float[] fArr = new float[3];
            C7466.m20004(this.f73239, fArr);
            fArr[2] = fArr[2] * 1.05f;
            this.f73239 = Color.HSVToColor(fArr);
        }
        this.f73287 = this.f73239;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50688(Integer num) {
        int i;
        this.f73290 = num;
        if (num == null) {
            if (C21943.m49431()) {
                i = this.f73232 instanceof C10235 ? C21943.f70284 : -5654586;
            } else {
                i = -16777216;
            }
            m24489(i);
            return;
        }
        m24489(num.intValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50685(Integer num) {
        this.f73244 = num;
        this.f73266 = ((Integer) C11003.requireNonNullElseGet(num, new C11398(this))).intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m50680(Paint.FontMetrics fontMetrics) {
        return ((m24484() - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + (-fontMetrics.ascent);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m50687() {
        if (this.f73261) {
            return this.f73270;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m50690() {
        this.f73271 = false;
        this.f73240 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50691(int i) {
        this.f73239 = i;
        this.f73287 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m50681(CharSequence charSequence) {
        if (TextUtils.indexOf(charSequence, '\r') == -1) {
            return charSequence;
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 >= length || charSequence.charAt(i2) == '\n') {
                    i = i2;
                }
                sb.append('\n');
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m50682(CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n');
        if (iIndexOf == -1) {
            return TextUtils.indexOf(charSequence, '\r') == -1 ? "\n" : "\r";
        }
        return (iIndexOf <= 0 || charSequence.charAt(iIndexOf + (-1)) != '\r') ? "\n" : "\r\n";
    }
}
