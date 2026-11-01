package p067l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes.dex */
public class C24642 extends AbstractC5907 {
    public C24642(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۤ */
    public final void mo9038() {
        super.mo9038();
        m54295(Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51635() * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m54295(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i, 2);
        mo9020((CharSequence) m9012().getString(R.string.MT_Protector, (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString()));
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m54296(String str) {
        String strReplace = str.trim().replace(',', '.');
        if (strReplace.isEmpty()) {
            throw new IllegalArgumentException("Empty line spacing");
        }
        for (int i = 0; i < strReplace.length(); i++) {
            char cCharAt = strReplace.charAt(i);
            if (cCharAt != '.' && (cCharAt < '0' || cCharAt > '9')) {
                throw new IllegalArgumentException("Invalid line spacing");
            }
        }
        BigDecimal bigDecimal = new BigDecimal(strReplace);
        if (bigDecimal.scale() > 2) {
            throw new IllegalArgumentException("Too many decimal places");
        }
        int iIntValueExact = bigDecimal.movePointRight(2).intValueExact();
        if (iIntValueExact < 80 || iIntValueExact > 200) {
            throw new IllegalArgumentException("Line spacing out of range");
        }
        return iIntValueExact;
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        int i;
        int iRound = Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51635() * 100.0f);
        C12096 c12096 = new C12096(abstractActivityC5549);
        c12096.m27916(false);
        c12096.m32471(true);
        c12096.m32571(false);
        c12096.setFocusable(false);
        c12096.setOnTouchListener(new ViewOnTouchListenerC17936());
        try {
            i = Integer.parseInt(m13265().getString(abstractActivityC5549 instanceof ActivityC4701 ? "diff_text_font_size" : "edit_text_font_size", abstractActivityC5549 instanceof ActivityC4701 ? "12" : "15"));
        } catch (RuntimeException unused) {
            i = 15;
        }
        c12096.m32374(i, SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51632());
        float f = iRound / 100.0f;
        c12096.m32373(f);
        c12096.setContentDescription(m9012().getString(R.string.MT_Protector));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C23223.m51761(-13619152, -657931));
        gradientDrawable.setCornerRadius(C13076.m29939(8.0f));
        c12096.setBackground(gradientDrawable);
        int iM29939 = C13076.m29939(12.0f);
        c12096.setPadding(iM29939, iM29939, iM29939, iM29939);
        C1627 c1627 = new C1627(abstractActivityC5549, null);
        c1627.setMinimumHeight(C13076.m29939(48.0f));
        c1627.setMax(24);
        c1627.setProgress(Math.round((iRound - 80) / 5.0f));
        c1627.setContentDescription(m9035());
        LinearLayout linearLayout = new LinearLayout(abstractActivityC5549);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c12096.getPaddingBottom() + c12096.getPaddingTop() + ((int) Math.ceil((c12096.m32448() / f) * 6.0f)));
        layoutParams.topMargin = C13076.m29939(12.0f);
        linearLayout.addView(c12096, layoutParams);
        c12096.mo27932((CharSequence) m9012().getString(R.string.MT_Protector));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C13076.m29939(16.0f);
        linearLayout.addView(c1627, layoutParams2);
        C19278 c19278 = new C19278(this, abstractActivityC5549);
        c19278.m33350(m9035());
        c19278.m33362(C0719o.a.f2912r);
        c19278.m33336((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(f)));
        c19278.m33330();
        c19278.m33333(R.string.MT_Protector, new ViewOnClickListenerC20561(3, c19278), (ViewOnLongClickListenerC24753) null);
        c19278.m33372().addView(linearLayout);
        c19278.m33372().setVisibility(0);
        c19278.m33335(new C18607(c1627, c12096));
        c1627.setOnSeekBarChangeListener(new C15924(c19278));
        c19278.m33352(false);
    }
}
