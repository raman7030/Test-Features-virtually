package p067l;

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
import com.tencent.p062mm.opensdk.constants.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11618 extends HorizontalScrollView {

    /* JADX INFO: renamed from: ᩶ */
    public String f32429;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f32430;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f32431;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11618(Context context, C20335 c20335, String str, final C5602 c5602) {
        super(context);
        List list = c20335.f62802;
        this.f32431 = new ArrayList();
        this.f32430 = true;
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(m26731(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        for (int i = 0; i < list.size(); i++) {
            final C6253 c6253 = (C6253) list.get(i);
            if (i > 0) {
                C1567 c1567M26736 = m26736("/");
                c1567M26736.setTextColor(C23223.f72980);
                c1567M26736.setPadding(m26731(3), 0, m26731(3), 0);
                c1567M26736.setImportantForAccessibility(2);
                linearLayout.addView(c1567M26736, new LinearLayout.LayoutParams(-2, -2));
            }
            C1567 c1567M26737 = m26736(c6253.m14192());
            c1567M26737.setPadding(m26731(8), m26731(4), m26731(8), m26731(4));
            c1567M26737.setTag(c6253.m14193());
            c1567M26737.setContentDescription(c6253.m14193());
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, m26735((C23223.f72969 & 16777215) | Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE));
            stateListDrawable.addState(new int[0], m26735(0));
            c1567M26737.setBackground(new RippleDrawable(ColorStateList.valueOf((C23223.f72969 & 16777215) | 855638016), stateListDrawable, m26735(-1)));
            c1567M26737.setOnClickListener(new View.OnClickListener() { // from class: l.᩷ܿܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11618.m26734(this.f70544, c6253, c5602);
                }
            });
            this.f32431.add(c1567M26737);
            linearLayout.addView(c1567M26737, new LinearLayout.LayoutParams(-2, -2));
        }
        m26733(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26734(C11618 c11618, C6253 c6253, C5602 c5602) {
        c11618.m26733(c6253.m14193());
        c5602.m45213n(c6253.m14193());
    }

    /* JADX INFO: renamed from: ۧ */
    private C1567 m26736(String str) {
        C1567 c1567 = new C1567(getContext());
        c1567.setTextSize(14.0f);
        c1567.setTextColor(C23223.f72995);
        c1567.setIncludeFontPadding(false);
        c1567.setSingleLine(true);
        c1567.setText(str);
        return c1567;
    }

    /* JADX INFO: renamed from: ۧ */
    private GradientDrawable m26735(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m26731(5));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26733(String str) {
        this.f32429 = str;
        for (TextView textView : this.f32431) {
            textView.setSelected(str.equals(textView.getTag()));
            if (textView.isSelected()) {
                m26732(textView, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26732(TextView textView, boolean z) {
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

    /* JADX INFO: renamed from: ֫ */
    public final String m26737() {
        return this.f32429;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26731(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f32430 || getWidth() <= 0) {
            return;
        }
        this.f32430 = false;
        for (TextView textView : this.f32431) {
            if (textView.isSelected()) {
                m26732(textView, false);
                return;
            }
        }
    }
}
