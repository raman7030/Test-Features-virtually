package l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes.dex */
public class C23436 extends AbstractC3723 {
    public C23436(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ۤ */
    public final void mo6912() {
        super.mo6912();
        m51894(Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49282() * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m51894(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i, 2);
        mo6894((CharSequence) m6886().getString(R.string.MT_Protector, (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString()));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m51895(String str) {
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

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        int i;
        int iRound = Math.round(SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49282() * 100.0f);
        C10235 c10235 = new C10235(abstractActivityC3346);
        c10235.m25894(false);
        c10235.m30407(true);
        c10235.m30507(false);
        c10235.setFocusable(false);
        c10235.setOnTouchListener(new ViewOnTouchListenerC16380());
        try {
            i = Integer.parseInt(m11313().getString(abstractActivityC3346 instanceof ActivityC2454 ? "diff_text_font_size" : "edit_text_font_size", abstractActivityC3346 instanceof ActivityC2454 ? "12" : "15"));
        } catch (RuntimeException unused) {
            i = 15;
        }
        c10235.m30310(i, SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49279());
        float f = iRound / 100.0f;
        c10235.m30309(f);
        c10235.setContentDescription(m6886().getString(R.string.MT_Protector));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C21943.m49424(-13619152, -657931));
        gradientDrawable.setCornerRadius(C11266.m27878(8.0f));
        c10235.setBackground(gradientDrawable);
        int iM27878 = C11266.m27878(12.0f);
        c10235.setPadding(iM27878, iM27878, iM27878, iM27878);
        C15821 c15821 = new C15821(abstractActivityC3346, null);
        c15821.setMinimumHeight(C11266.m27878(48.0f));
        c15821.setMax(24);
        c15821.setProgress(Math.round((iRound - 80) / 5.0f));
        c15821.setContentDescription(m6909());
        LinearLayout linearLayout = new LinearLayout(abstractActivityC3346);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c10235.getPaddingBottom() + c10235.getPaddingTop() + ((int) Math.ceil((c10235.m30384() / f) * 6.0f)));
        layoutParams.topMargin = C11266.m27878(12.0f);
        linearLayout.addView(c10235, layoutParams);
        c10235.mo25910((CharSequence) m6886().getString(R.string.MT_Protector));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C11266.m27878(16.0f);
        linearLayout.addView(c15821, layoutParams2);
        C17792 c17792 = new C17792(this, abstractActivityC3346);
        c17792.m31264(m6909());
        c17792.m31276(o.a.r);
        c17792.m31250((CharSequence) String.format(Locale.ROOT, "%.2f", Float.valueOf(f)));
        c17792.m31244();
        c17792.m31247(R.string.MT_Protector, new ViewOnClickListenerC19142(3, c17792), (ViewOnLongClickListenerC23553) null);
        c17792.m31286().addView(linearLayout);
        c17792.m31286().setVisibility(0);
        c17792.m31249(new C17086(c15821, c10235));
        c15821.setOnSeekBarChangeListener(new C14263(c17792));
        c17792.m31266(false);
    }
}
