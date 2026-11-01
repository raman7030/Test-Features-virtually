package p067l;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4RP */
/* JADX INFO: loaded from: classes.dex */
public final class C23929 extends C11477 {

    /* JADX INFO: renamed from: ᩷ܽ */
    public static final String f75950 = String.valueOf('\n');

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f75951;

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f75952;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f75953;

    /* JADX INFO: renamed from: ֨ۧ */
    public int f75954;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f75955;

    /* JADX INFO: renamed from: ֫ܽ */
    public Drawable f75956;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C14146 f75957;

    /* JADX INFO: renamed from: ۖۧ */
    public float f75958;

    /* JADX INFO: renamed from: ۗ֫ */
    public final int f75959;

    /* JADX INFO: renamed from: ۗۧ */
    public boolean f75960;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f75961;

    /* JADX INFO: renamed from: ۘۧ */
    public float f75962;

    /* JADX INFO: renamed from: ۙ֫ */
    public final int f75963;

    /* JADX INFO: renamed from: ۙۧ */
    public int f75964;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f75965;

    /* JADX INFO: renamed from: ۚۧ */
    public int f75966;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f75967;

    /* JADX INFO: renamed from: ۛۧ */
    public boolean f75968;

    /* JADX INFO: renamed from: ۜ֫ */
    public Integer f75969;

    /* JADX INFO: renamed from: ۜۧ */
    public float f75970;

    /* JADX INFO: renamed from: ۜܽ */
    public C23845 f75971;

    /* JADX INFO: renamed from: ۟֫ */
    public int f75972;

    /* JADX INFO: renamed from: ۟ۧ */
    public int f75973;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f75974;

    /* JADX INFO: renamed from: ۠ۧ */
    public int f75975;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f75976;

    /* JADX INFO: renamed from: ۡۧ */
    public final C17441 f75977;

    /* JADX INFO: renamed from: ۢ֫ */
    public InterfaceC20143 f75978;

    /* JADX INFO: renamed from: ۢۧ */
    public float f75979;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f75980;

    /* JADX INFO: renamed from: ۤۧ */
    public boolean f75981;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f75982;

    /* JADX INFO: renamed from: ۧۧ */
    public int f75983;

    /* JADX INFO: renamed from: ۧܽ */
    public int f75984;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f75985;

    /* JADX INFO: renamed from: ۨۧ */
    public boolean f75986;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f75987;

    /* JADX INFO: renamed from: ۫ۧ */
    public boolean f75988;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f75989;

    /* JADX INFO: renamed from: ۬ۧ */
    public boolean f75990;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f75991;

    /* JADX INFO: renamed from: ܰۧ */
    public boolean f75992;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f75993;

    /* JADX INFO: renamed from: ܳۧ */
    public C3831 f75994;

    /* JADX INFO: renamed from: ܳܽ */
    public int f75995;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f75996;

    /* JADX INFO: renamed from: ܶۧ */
    public boolean f75997;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f75998;

    /* JADX INFO: renamed from: ܺۧ */
    public int f75999;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f76000;

    /* JADX INFO: renamed from: ܽۧ */
    public int f76001;

    /* JADX INFO: renamed from: ܽܽ */
    public int f76002;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f76003;

    /* JADX INFO: renamed from: ܿۧ */
    public int f76004;

    /* JADX INFO: renamed from: ܿܽ */
    public Drawable f76005;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f76006;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f76007;

    /* JADX INFO: renamed from: ᩳܽ */
    public Drawable f76008;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f76009;

    /* JADX INFO: renamed from: ᩴۧ */
    public boolean f76010;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f76011;

    /* JADX INFO: renamed from: ᩵ۧ */
    public int f76012;

    /* JADX INFO: renamed from: ᩶֫ */
    public final int f76013;

    /* JADX INFO: renamed from: ᩶ۧ */
    public float f76014;

    /* JADX INFO: renamed from: ᩷֫ */
    public Integer f76015;

    /* JADX INFO: renamed from: ᩷ۧ */
    public boolean f76016;

    /* JADX INFO: renamed from: ᩸֫ */
    public final int f76017;

    /* JADX INFO: renamed from: ᩸ۧ */
    public String f76018;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f76019;

    /* JADX INFO: renamed from: ᩹ۧ */
    public int f76020;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f76021;

    /* JADX INFO: renamed from: ᩺ۧ */
    public String f76022;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f76023;

    /* JADX INFO: renamed from: ᩻ۧ */
    public float f76024;

    /* JADX INFO: renamed from: ᩻ܽ */
    public C23845 f76025;

    @Override // p067l.C11477
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo26489(float f) {
        super.mo26489(f);
        this.f76024 = m53006(this.f75994.getFontMetrics());
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53010(float f, int i) {
        this.f75973 = i;
        int i2 = i & 255;
        if (i2 == 0) {
            this.f32005.setTypeface(Typeface.MONOSPACE);
        } else if (i2 == 1) {
            this.f32005.setTypeface((Typeface) SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51634().f33659);
        } else if (i2 != 2) {
            this.f32005.setTypeface(Typeface.DEFAULT);
        } else {
            Object tag = this.f75957.getTag(R.id.MT_Protector);
            if (tag instanceof Typeface) {
                this.f32005.setTypeface((Typeface) tag);
            } else {
                this.f32005.setTypeface(Typeface.DEFAULT);
            }
        }
        m26495();
        this.f32005.setTextSize(f);
        m26493();
        this.f75994.setTypeface(this.f32005.getTypeface());
        this.f75994.setTextSize(f);
        this.f76024 = m53006(this.f75994.getFontMetrics());
        float fMeasureText = this.f75994.measureText("0");
        this.f75970 = fMeasureText;
        float f2 = fMeasureText / 2.0f;
        this.f76006 = f2;
        this.f75976 = (int) (f2 * 0.8f);
        this.f75995 = (int) (m26507() * 0.5f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m53015(float f) {
        float f2 = this.f75958;
        if (f > f2) {
            f = f2;
        } else {
            f2 = this.f75962;
            if (f < f2) {
                f = f2;
            }
        }
        if (this.f32005.getTextSize() == f) {
            return false;
        }
        this.f32005.setTextSize(f);
        m26493();
        this.f75994.setTypeface(this.f32005.getTypeface());
        this.f75994.setTextSize(f);
        this.f76024 = m53006(this.f75994.getFontMetrics());
        float fMeasureText = this.f75994.measureText("0");
        this.f75970 = fMeasureText;
        float f3 = fMeasureText / 2.0f;
        this.f76006 = f3;
        this.f75976 = (int) (f3 * 0.8f);
        this.f75995 = (int) (m26507() * 0.5f);
        return true;
    }

    public C23929(C14146 c14146) {
        super(c14146.getContext());
        this.f75986 = true;
        this.f75982 = true;
        this.f75980 = false;
        this.f75990 = true;
        this.f76016 = true;
        this.f76023 = 3;
        this.f75981 = true;
        this.f76010 = true;
        this.f75961 = true;
        this.f75974 = true;
        this.f75951 = true;
        this.f75996 = true;
        this.f75965 = false;
        this.f75992 = false;
        this.f75952 = true;
        this.f75997 = false;
        this.f76021 = false;
        this.f75960 = false;
        this.f75968 = false;
        this.f75953 = true;
        this.f76009 = true;
        this.f75975 = -1;
        this.f75954 = -1;
        this.f75977 = new C17441();
        this.f75987 = C15486.f44208;
        Resources resources = c14146.getResources();
        this.f75957 = c14146;
        float f = this.f32000;
        this.f75958 = 30.0f * f;
        this.f75962 = f * 6.0f;
        this.f75973 = 255;
        this.f76018 = "\n";
        this.f75988 = true;
        C3831 c3831 = new C3831(0);
        this.f75994 = c3831;
        c3831.setTextAlign(Paint.Align.CENTER);
        c3831.setTypeface(Typeface.DEFAULT);
        m53015(this.f32000 * 15.0f);
        Drawable drawableMutate = C1059.m14961(resources, R.drawable.MT_Protector, null).mutate();
        this.f76008 = drawableMutate;
        Drawable drawableMutate2 = C1059.m14961(resources, R.drawable.MT_Protector, null).mutate();
        this.f76005 = drawableMutate2;
        Drawable drawableMutate3 = C1059.m14961(resources, R.drawable.MT_Protector, null).mutate();
        this.f75956 = drawableMutate3;
        this.f76002 = drawableMutate.getIntrinsicWidth() / 2;
        this.f75984 = drawableMutate3.getIntrinsicHeight() * 3;
        drawableMutate3.setAlpha(230);
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        this.f75999 = -drawableMutate3.getIntrinsicHeight();
        this.f75998 = drawableMutate3.getIntrinsicHeight() / 2;
        this.f76017 = -579373193;
        this.f75959 = 964130679;
        float f2 = this.f32015;
        this.f75963 = (int) (8.0f * f2);
        this.f76013 = (int) (48.0f * f2);
        this.f76020 = 2003199590;
        this.f76014 = f2 * 4.0f;
        this.f75971 = C23845.m52913(resources, R.drawable.MT_Protector, null);
        this.f76025 = C23845.m52913(resources, R.drawable.MT_Protector, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53012(C11996 c11996) {
        c11996.m27443((CharSequence) this.f76018);
        c11996.m27445(this.f75988);
        c11996.writeByte(this.f75973);
        c11996.m27439(this.f32005.getTextSize());
        c11996.mo15113(m26497());
        c11996.m27445(m26494());
        c11996.m27445(m26510());
        c11996.m27445(this.f75952);
        c11996.m27445(this.f75997);
        c11996.m27445(this.f75992);
        if (this.f75992) {
            c11996.m27443((CharSequence) this.f76022);
        }
        c11996.writeInt(591749672);
        c11996.m27445(m26511());
        c11996.m27445(m26482());
        c11996.m27445(this.f75986);
        if (this.f76015 == null) {
            c11996.writeByte(0);
        } else {
            c11996.m27445(true);
            c11996.writeInt(this.f76015.intValue());
        }
        if (this.f75969 == null) {
            c11996.writeByte(0);
        } else {
            c11996.m27445(true);
            c11996.writeInt(this.f75969.intValue());
        }
        c11996.m27439(m26512());
        c11996.m27439(m26496());
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m53009() {
        int iIntValue;
        int iIntValue2;
        int i = C23223.f72969;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.f76008.setColorFilter(porterDuffColorFilter);
        this.f76005.setColorFilter(porterDuffColorFilter);
        this.f75956.setColorFilter(porterDuffColorFilter);
        this.f76019 = i;
        Integer num = this.f76015;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (C23223.m51768()) {
            iIntValue = this.f75957 instanceof C12096 ? C23223.f72995 : -5654586;
        } else {
            iIntValue = -16777216;
        }
        m26501(iIntValue);
        Integer num2 = this.f75969;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = C23223.m51768() ? -1866415936 : -1979711488;
        }
        this.f75991 = iIntValue2;
        if (C23223.m51768()) {
            this.f76000 = -13948117;
            this.f76001 = -7829368;
            this.f75983 = -13223878;
            this.f76007 = -11184811;
            this.f76004 = -10978957;
            this.f75972 = -10461088;
            this.f75955 = -6974059;
            this.f75993 = -13158601;
            this.f75967 = -12888001;
            this.f75985 = -11964850;
            this.f75966 = 537981088;
        } else {
            this.f76000 = -1;
            this.f76001 = -5197648;
            this.f75983 = -460552;
            this.f76007 = -3092272;
            this.f76004 = -10053737;
            this.f75972 = -2960686;
            this.f75955 = -6645094;
            this.f75993 = -1309;
            this.f75967 = -684;
            this.f75985 = 0;
            this.f75966 = 537960464;
        }
        this.f75964 = C11477.m26473(this.f76000, i & 1728053247);
        if (C23223.m51768()) {
            float[] fArr = new float[3];
            C9464.m21979(this.f75964, fArr);
            fArr[2] = fArr[2] * 1.05f;
            this.f75964 = Color.HSVToColor(fArr);
        }
        this.f76012 = this.f75964;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53014(Integer num) {
        int i;
        this.f76015 = num;
        if (num == null) {
            if (C23223.m51768()) {
                i = this.f75957 instanceof C12096 ? C23223.f72995 : -5654586;
            } else {
                i = -16777216;
            }
            m26501(i);
            return;
        }
        m26501(num.intValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53011(Integer num) {
        this.f75969 = num;
        this.f75991 = ((Integer) C12826.requireNonNullElseGet(num, new C13201(this))).intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    private float m53006(Paint.FontMetrics fontMetrics) {
        return ((m26496() - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + (-fontMetrics.ascent);
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m53013() {
        if (this.f75986) {
            return this.f75995;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m53016() {
        this.f75996 = false;
        this.f75965 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53017(int i) {
        this.f75964 = i;
        this.f76012 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m53007(CharSequence charSequence) {
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

    /* JADX INFO: renamed from: ۧ */
    public static String m53008(CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n');
        if (iIndexOf == -1) {
            return TextUtils.indexOf(charSequence, '\r') == -1 ? "\n" : "\r";
        }
        return (iIndexOf <= 0 || charSequence.charAt(iIndexOf + (-1)) != '\r') ? "\n" : "\r\n";
    }
}
