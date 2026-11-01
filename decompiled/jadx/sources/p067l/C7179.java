package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import bin.p000mt.plugin.api.p002ui.PluginEditText;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes2.dex */
public class C7179 extends LinearLayout {

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f18749 = 0;

    /* JADX INFO: renamed from: ۗ */
    public C1618 f18750;

    /* JADX INFO: renamed from: ۙ */
    public List f18751;

    /* JADX INFO: renamed from: ۛ */
    public C1732 f18752;

    /* JADX INFO: renamed from: ۤ */
    public boolean f18753;

    /* JADX INFO: renamed from: ۨ */
    public C9861 f18754;

    /* JADX INFO: renamed from: ۫ */
    public C3155 f18755;

    /* JADX INFO: renamed from: ۬ */
    public RunnableC21989 f18756;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f18757;

    /* JADX INFO: renamed from: ᩸ */
    public final C2484 f18758;

    /* JADX INFO: renamed from: ᩹ */
    public C12096 f18759;

    public C7179(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f18757 = false;
        if (!isInEditMode() && ApplicationC21448.f67650.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f18753 = z;
        this.f18751 = isInEditMode() ? Collections.EMPTY_LIST : C3826.m7473();
        this.f18755 = new C3155("");
        this.f18758 = new C2484(this);
        m16494(context, attributeSet);
    }

    public C7179(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f18757 = false;
        if (!isInEditMode() && ApplicationC21448.f67650.getBoolean("show_input_fav", true)) {
            z = true;
        }
        this.f18753 = z;
        this.f18751 = isInEditMode() ? Collections.EMPTY_LIST : C3826.m7473();
        this.f18755 = new C3155("");
        this.f18758 = new C2484(this);
        m16494(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16494(Context context, AttributeSet attributeSet) {
        float f = getResources().getDisplayMetrics().density;
        C12096 c12096 = new C12096(context);
        this.f18759 = c12096;
        c12096.m27925(3);
        C1732 c1732 = new C1732(context);
        this.f18752 = c1732;
        c1732.setImageResource(R.drawable.MT_Protector);
        this.f18752.setClickable(true);
        this.f18752.setBackground(C21272.m48053(context));
        int i = (int) ((3.0f * f) + 0.5f);
        this.f18752.setPadding(i, 0, i, 0);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = (int) ((f * 2.0f) + 0.5f);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        addView(this.f18759, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(this.f18752, layoutParams2);
        C1618 c1618 = new C1618(context, null, R.attr.MT_Protector);
        this.f18750 = c1618;
        c1618.m25840(this.f18759);
        this.f18750.m25844();
        this.f18750.m25851();
        this.f18750.mo4052(this.f18758);
        this.f18750.m38997(C13076.m29939(280.0f));
        this.f18750.m25841(new C10532());
        this.f18752.setOnClickListener(new ViewOnClickListenerC11722(8, this));
        if (!isInEditMode()) {
            ActivityC0904 activityC0904 = (ActivityC0904) C7453.m17221(context);
            C12826.requireNonNull(activityC0904);
            this.f18754 = (C9861) new C6874(activityC0904).m15765(C9861.class);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21133.f66417);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f18759.m27916(false);
        }
        if (!isInEditMode()) {
            String string = typedArrayObtainStyledAttributes.getString(2);
            if (string != null && string.length() > 0) {
                m16509(string, typedArrayObtainStyledAttributes.getString(0));
            } else {
                m16497();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16495(C7179 c7179) {
        c7179.f18757 = false;
        c7179.f18758.notifyDataSetChanged();
        c7179.f18750.show();
        ListView listViewMo10603 = c7179.f18750.mo10603();
        C12826.requireNonNull(listViewMo10603);
        listViewMo10603.setOnItemLongClickListener(new C17236());
        if (c7179.f18759.hasFocus()) {
            return;
        }
        c7179.f18759.requestFocus();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16505() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f18759.getLayoutParams();
        layoutParams.topMargin = 0;
        this.f18759.setLayoutParams(layoutParams);
        C11755.m26982(this.f18759, -1, C13076.m29939(4.0f), -1, -1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12096 m16514() {
        return this.f18759;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getVisibility() != 0 || this.f18759.m32500() == null) {
            return;
        }
        this.f18755.m5406(this.f18759.m32500().toString());
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC9768 m16518() {
        return this.f18759.m32500();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16508(CharSequence charSequence) {
        this.f18759.mo27932(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16515(int i) {
        this.f18759.mo27941(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m16521() {
        return this.f18759.m32590();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m16522() {
        this.f18759.m27922();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16506(int i) {
        this.f18759.m27948(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16511(boolean z) {
        this.f18759.m27916(!z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16507(TextWatcher textWatcher) {
        this.f18759.m32377(textWatcher);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16510(RunnableC21989 runnableC21989) {
        this.f18756 = runnableC21989;
        runnableC21989.run();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m16523() {
        this.f18755.m5403();
        RunnableC21989 runnableC21989 = this.f18756;
        if (runnableC21989 != null) {
            runnableC21989.run();
        }
        m16520();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m16503(C7179 c7179) {
        RunnableC21989 runnableC21989 = c7179.f18756;
        if (runnableC21989 != null) {
            runnableC21989.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16509(String str, String str2) {
        if (isInEditMode()) {
            return;
        }
        C3155 c3155M23131 = this.f18754.m23131(str, str2);
        this.f18755 = c3155M23131;
        this.f18759.mo27932((CharSequence) c3155M23131.m5396());
        C12096 c12096 = this.f18759;
        c12096.mo27944(0, c12096.m32590());
        m16520();
    }

    /* JADX INFO: renamed from: ۡ */
    private void m16497() {
        if (this.f18753) {
            if (this.f18752.isEnabled()) {
                return;
            }
            this.f18752.setEnabled(true);
            this.f18752.setAlpha(1.0f);
            return;
        }
        if (this.f18755.m5407() == 0) {
            if (this.f18752.isEnabled()) {
                this.f18752.setEnabled(false);
                this.f18752.setAlpha(0.8f);
                return;
            }
            return;
        }
        if (this.f18752.isEnabled()) {
            return;
        }
        this.f18752.setEnabled(true);
        this.f18752.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m16512() {
        m16508(this.f18755.m5396());
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m16517() {
        InterfaceC9768 interfaceC9768M32500 = this.f18759.m32500();
        if (interfaceC9768M32500 != null) {
            String string = interfaceC9768M32500.toString();
            if (string == null || string.isEmpty() || string.length() > 2000) {
                this.f18755.m5401(true);
                return;
            }
            this.f18755.m5401(false);
            this.f18755.m5406(string);
            int iM5402 = this.f18755.m5402(string);
            if (iM5402 == -1) {
                if (this.f18755.m5407() >= 100) {
                    this.f18755.m5405();
                }
                this.f18755.m5399(string);
            } else if (iM5402 != 0) {
                for (int i = 0; i <= iM5402; i++) {
                    string = this.f18755.m5398(i, string);
                }
            }
            this.f18755.m5408();
            RunnableC21989 runnableC21989 = this.f18756;
            if (runnableC21989 != null) {
                runnableC21989.run();
            }
            m16520();
            return;
        }
        this.f18755.m5401(true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m16520() {
        boolean zIsShowing = this.f18750.isShowing();
        C2484 c2484 = this.f18758;
        if (zIsShowing && c2484.getCount() == 0) {
            this.f18750.dismiss();
        }
        c2484.notifyDataSetChanged();
        m16497();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16516(boolean z) {
        C12096 c12096;
        String str;
        if (z) {
            c12096 = this.f18759;
            str = PluginEditText.SYNTAX_REGEX;
        } else {
            c12096 = this.f18759;
            str = null;
        }
        c12096.m32381(str, true);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m16513() {
        if (this.f18753) {
            this.f18753 = false;
            this.f18757 = false;
            m16520();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16519(boolean z) {
        C12096 c12096;
        String str;
        if (z) {
            c12096 = this.f18759;
            str = PluginEditText.SYNTAX_REGEX_REPLACEMENT;
        } else {
            c12096 = this.f18759;
            str = null;
        }
        c12096.m32381(str, true);
    }
}
