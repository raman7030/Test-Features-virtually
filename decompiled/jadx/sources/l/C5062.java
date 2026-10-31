package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes2.dex */
public class C5062 extends LinearLayout {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15913 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15635 f15914;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f15915;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17939 f15916;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f15917;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7884 f15918;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0828 f15919;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RunnableC20645 f15920;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0122 f15922;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10235 f15923;

    public C5062(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f15921 = false;
        if (!isInEditMode() && ApplicationC20075.f65010.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f15917 = z;
        this.f15915 = isInEditMode() ? Collections.EMPTY_LIST : C1534.m5244();
        this.f15919 = new C0828("");
        this.f15922 = new C0122(this);
        m14587(context, attributeSet);
    }

    public C5062(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f15921 = false;
        if (!isInEditMode() && ApplicationC20075.f65010.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f15917 = z;
        this.f15915 = isInEditMode() ? Collections.EMPTY_LIST : C1534.m5244();
        this.f15919 = new C0828("");
        this.f15922 = new C0122(this);
        m14587(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14587(Context context, AttributeSet attributeSet) {
        float f = getResources().getDisplayMetrics().density;
        C10235 c10235 = new C10235(context);
        this.f15923 = c10235;
        c10235.m25903(3);
        C17939 c17939 = new C17939(context);
        this.f15916 = c17939;
        c17939.setImageResource(R.drawable.MT_Protector);
        this.f15916.setClickable(true);
        this.f15916.setBackground(C19890.m45742(context));
        int i = (int) ((3.0f * f) + 0.5f);
        this.f15916.setPadding(i, 0, i, 0);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        addView(this.f15923, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(this.f15916, layoutParams2);
        C15635 c15635 = new C15635(context, null, R.attr.MT_Protector);
        this.f15914 = c15635;
        c15635.m23831(this.f15923);
        this.f15914.m23835();
        this.f15914.m23842();
        this.f15914.mo1654(this.f15922);
        this.f15914.m36831(C11266.m27878(280.0f));
        this.f15914.m23832(new C8590());
        this.f15916.setOnClickListener(new ViewOnClickListenerC9841(8, this));
        if (!isInEditMode()) {
            ActivityC1252 activityC1252 = (ActivityC1252) C5350.m15313(context);
            C11003.requireNonNull(activityC1252);
            this.f15918 = (C7884) new C4741(activityC1252).m13885(C7884.class);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19743.f63782);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f15923.m25894(false);
        }
        if (!isInEditMode()) {
            String string = typedArrayObtainStyledAttributes.getString(2);
            if (string != null && string.length() > 0) {
                m14602(string, typedArrayObtainStyledAttributes.getString(0));
            } else {
                m14590();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14588(C5062 c5062) {
        c5062.f15921 = false;
        c5062.f15922.notifyDataSetChanged();
        c5062.f15914.show();
        ListView listViewMo8540 = c5062.f15914.mo8540();
        C11003.requireNonNull(listViewMo8540);
        listViewMo8540.setOnItemLongClickListener(new C15644());
        if (c5062.f15923.hasFocus()) {
            return;
        }
        c5062.f15923.requestFocus();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14598() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15923.getLayoutParams();
        layoutParams.topMargin = 0;
        this.f15923.setLayoutParams(layoutParams);
        C9876.m24967(this.f15923, -1, C11266.m27878(4.0f), -1, -1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10235 m14607() {
        return this.f15923;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() != 0 || this.f15923.m30436() == null) {
            return;
        }
        this.f15919.m3092(this.f15923.m30436().toString());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 m14611() {
        return this.f15923.m30436();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14601(CharSequence charSequence) {
        this.f15923.mo25910(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14608(int i) {
        this.f15923.mo25919(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m14614() {
        return this.f15923.m30526();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14615() {
        this.f15923.m25900();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14599(int i) {
        this.f15923.m25926(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14604(boolean z) {
        this.f15923.m25894(!z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14600(TextWatcher textWatcher) {
        this.f15923.m30313(textWatcher);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14603(RunnableC20645 runnableC20645) {
        this.f15920 = runnableC20645;
        runnableC20645.run();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m14616() {
        this.f15919.m3089();
        RunnableC20645 runnableC20645 = this.f15920;
        if (runnableC20645 != null) {
            runnableC20645.run();
        }
        m14613();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14596(C5062 c5062) {
        RunnableC20645 runnableC20645 = c5062.f15920;
        if (runnableC20645 != null) {
            runnableC20645.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14602(String str, String str2) {
        if (isInEditMode()) {
            return;
        }
        C0828 c0828M21166 = this.f15918.m21166(str, str2);
        this.f15919 = c0828M21166;
        this.f15923.mo25910((CharSequence) c0828M21166.m3082());
        C10235 c10235 = this.f15923;
        c10235.mo25922(0, c10235.m30526());
        m14613();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m14590() {
        if (this.f15917) {
            if (this.f15916.isEnabled()) {
                return;
            }
            this.f15916.setEnabled(true);
            this.f15916.setAlpha(1.0f);
            return;
        }
        if (this.f15919.m3093() == 0) {
            if (this.f15916.isEnabled()) {
                this.f15916.setEnabled(false);
                this.f15916.setAlpha(0.8f);
                return;
            }
            return;
        }
        if (this.f15916.isEnabled()) {
            return;
        }
        this.f15916.setEnabled(true);
        this.f15916.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14605() {
        m14601(this.f15919.m3082());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14610() {
        InterfaceC7785 interfaceC7785M30436 = this.f15923.m30436();
        if (interfaceC7785M30436 != null) {
            String string = interfaceC7785M30436.toString();
            if (string == null || string.isEmpty() || string.length() > 2000) {
                this.f15919.m3087(true);
                return;
            }
            this.f15919.m3087(false);
            this.f15919.m3092(string);
            int iM3088 = this.f15919.m3088(string);
            if (iM3088 == -1) {
                if (this.f15919.m3093() >= 100) {
                    this.f15919.m3091();
                }
                this.f15919.m3085(string);
            } else if (iM3088 != 0) {
                for (int i = 0; i <= iM3088; i++) {
                    string = this.f15919.m3084(i, string);
                }
            }
            this.f15919.m3094();
            RunnableC20645 runnableC20645 = this.f15920;
            if (runnableC20645 != null) {
                runnableC20645.run();
            }
            m14613();
            return;
        }
        this.f15919.m3087(true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14613() {
        boolean zIsShowing = this.f15914.isShowing();
        C0122 c0122 = this.f15922;
        if (zIsShowing && c0122.getCount() == 0) {
            this.f15914.dismiss();
        }
        c0122.notifyDataSetChanged();
        m14590();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14609(boolean z) {
        C10235 c10235;
        String str;
        if (z) {
            c10235 = this.f15923;
            str = PluginEditText.SYNTAX_REGEX;
        } else {
            c10235 = this.f15923;
            str = null;
        }
        c10235.m30317(str, true);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m14606() {
        if (this.f15917) {
            this.f15917 = false;
            this.f15921 = false;
            m14613();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14612(boolean z) {
        C10235 c10235;
        String str;
        if (z) {
            c10235 = this.f15923;
            str = PluginEditText.SYNTAX_REGEX_REPLACEMENT;
        } else {
            c10235 = this.f15923;
            str = null;
        }
        c10235.m30317(str, true);
    }
}
