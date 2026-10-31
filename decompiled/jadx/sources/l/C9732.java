package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.opensdk.constants.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9732 extends HorizontalScrollView {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f29479;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f29480;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f29481;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9732(Context context, C18904 c18904, String str, final C3402 c3402) {
        super(context);
        List list = c18904.f59572;
        this.f29481 = new ArrayList();
        this.f29480 = true;
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(m24717(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        for (int i = 0; i < list.size(); i++) {
            final C4087 c4087 = (C4087) list.get(i);
            if (i > 0) {
                C14615 c14615M24722 = m24722("/");
                c14615M24722.setTextColor(C21943.f70269);
                c14615M24722.setPadding(m24717(3), 0, m24717(3), 0);
                c14615M24722.setImportantForAccessibility(2);
                linearLayout.addView(c14615M24722, new LinearLayout.LayoutParams(-2, -2));
            }
            C14615 c14615M24723 = m24722(c4087.m12287());
            c14615M24723.setPadding(m24717(8), m24717(4), m24717(8), m24717(4));
            c14615M24723.setTag(c4087.m12288());
            c14615M24723.setContentDescription(c4087.m12288());
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, m24721((C21943.f70257 & 16777215) | Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE));
            stateListDrawable.addState(new int[0], m24721(0));
            c14615M24723.setBackground(new RippleDrawable(ColorStateList.valueOf((C21943.f70257 & 16777215) | 855638016), stateListDrawable, m24721(-1)));
            c14615M24723.setOnClickListener(new View.OnClickListener() { // from class: l.᩷ܿܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9732.m24720(this.f67859, c4087, c3402);
                }
            });
            this.f29481.add(c14615M24723);
            linearLayout.addView(c14615M24723, new LinearLayout.LayoutParams(-2, -2));
        }
        m24719(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24720(C9732 c9732, C4087 c4087, C3402 c3402) {
        c9732.m24719(c4087.m12288());
        c3402.n(c4087.m12288());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C14615 m24722(String str) {
        C14615 c14615 = new C14615(getContext());
        c14615.setTextSize(14.0f);
        c14615.setTextColor(C21943.f70284);
        c14615.setIncludeFontPadding(false);
        c14615.setSingleLine(true);
        c14615.setText(str);
        return c14615;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private GradientDrawable m24721(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m24717(5));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24719(String str) {
        this.f29479 = str;
        for (TextView textView : this.f29481) {
            textView.setSelected(str.equals(textView.getTag()));
            if (textView.isSelected()) {
                m24718(textView, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24718(TextView textView, boolean z) {
        if (getWidth() == 0) {
            return;
        }
        int iMax = Math.max(0, textView.getLeft() - Math.max(0, (getWidth() - textView.getWidth()) / 2));
        if (z) {
            smoothScrollTo(iMax, 0);
        } else {
            scrollTo(iMax, 0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24723() {
        return this.f29479;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24717(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f29480 || getWidth() <= 0) {
            return;
        }
        this.f29480 = false;
        for (TextView textView : this.f29481) {
            if (textView.isSelected()) {
                m24718(textView, false);
                return;
            }
        }
    }
}
