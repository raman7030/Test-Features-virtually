package p067l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۟ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A7OH */
/* JADX INFO: loaded from: classes3.dex */
public class C9318 implements PluginView {

    /* JADX INFO: renamed from: ֫ */
    public String f25336;

    /* JADX INFO: renamed from: ۧ */
    public final PluginViewGroup f25337;

    /* JADX INFO: renamed from: ܽ */
    public final PluginUI f25338;

    /* JADX INFO: renamed from: ܿ */
    public View f25339;

    /* JADX INFO: renamed from: ᩳ */
    public Object f25340;

    public C9318(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        this.f25338 = pluginUI;
        this.f25337 = pluginViewGroup;
        if (pluginViewGroup == null && !(this instanceof PluginViewGroup)) {
            throw new IllegalArgumentException("PluginView which is not a PluginViewGroup must have a parent");
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginUI getPluginUI() {
        return this.f25338;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setHeightDp(float f) {
        setHeight(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginBottomDp(float f) {
        setMarginBottom(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginDp(float f) {
        setMargin(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginHorizontalDp(float f) {
        setMarginHorizontal(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginLeftDp(float f) {
        setMarginLeft(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginRightDp(float f) {
        setMarginRight(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginTopDp(float f) {
        setMarginTop(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginVerticalDp(float f) {
        setMarginVertical(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingBottomDp(float f) {
        setPaddingBottom(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingDp(float f) {
        setPadding(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingHorizontalDp(float f) {
        setPaddingHorizontal(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingLeftDp(float f) {
        setPaddingLeft(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingRightDp(float f) {
        setPaddingRight(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingTopDp(float f) {
        setPaddingTop(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingVerticalDp(float f) {
        setPaddingVertical(this.f25338.dp2px(f));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setWidthDp(float f) {
        setWidth(this.f25338.dp2px(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m21563() {
        return this.f25339;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo21566(View view) {
        this.f25339 = view;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginView findViewById(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return mo21564(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginView requireViewById(String str) {
        PluginView pluginViewFindViewById = findViewById(str);
        if (pluginViewFindViewById != null) {
            return pluginViewFindViewById;
        }
        throw new IllegalArgumentException(C6988.m16053("ID '", str, "' does not reference a PluginView"));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final String getId() {
        return this.f25336;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final String requireId() {
        String str = this.f25336;
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("The id not set");
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public PluginView mo21564(String str) {
        if (str.equals(this.f25336)) {
            return this;
        }
        return null;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginViewGroup getParentView() {
        return this.f25337;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginViewGroup requireParentView() {
        PluginViewGroup pluginViewGroup = this.f25337;
        if (pluginViewGroup != null) {
            return pluginViewGroup;
        }
        throw new NullPointerException("No parent view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final PluginViewGroup getRootView() {
        PluginViewGroup pluginViewGroup = this.f25337;
        return pluginViewGroup == null ? (PluginViewGroup) this : pluginViewGroup.getRootView();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21567(String str) {
        this.f25336 = str;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final Object getTag() {
        return this.f25340;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setTag(Object obj) {
        this.f25340 = obj;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final float getLayoutWeight() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).weight;
        }
        return 0.0f;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getLayoutGravity() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).gravity;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m21565(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C9417.m21911(1, str) == '}' && (stringNullable = this.f25338.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getWidth() {
        return this.f25339.getLayoutParams().width;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getHeight() {
        return this.f25339.getLayoutParams().height;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getViewWidth() {
        return this.f25339.getWidth();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getViewHeight() {
        return this.f25339.getHeight();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getPaddingLeft() {
        return this.f25339.getPaddingLeft();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getPaddingTop() {
        return this.f25339.getPaddingTop();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getPaddingRight() {
        return this.f25339.getPaddingRight();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getPaddingBottom() {
        return this.f25339.getPaddingBottom();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getMarginLeft() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getMarginTop() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getMarginRight() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getMarginBottom() {
        ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setSizeDp(float f, float f2) {
        PluginUI pluginUI = this.f25338;
        setSize(pluginUI.dp2px(f), pluginUI.dp2px(f2));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f25338;
        setPadding(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f25338;
        setMargin(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public void setOnClickListener(final PluginView.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.f25339.setOnClickListener(null);
        } else {
            this.f25339.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۜ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9318 c9318 = this.f43822;
                    c9318.getClass();
                    onClickListener.onClick(c9318);
                }
            });
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public void setOnLongClickListener(final PluginView.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            this.f25339.setOnLongClickListener(null);
        } else {
            this.f25339.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩺ۜ᩷
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C9318 c9318 = this.f76438;
                    c9318.getClass();
                    return onLongClickListener.onLongClick(c9318);
                }
            });
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final boolean performClick() {
        return this.f25339.performClick();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final boolean performLongClick() {
        return this.f25339.performLongClick();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final boolean isEnabled() {
        return this.f25339.isEnabled();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final Drawable getBackground() {
        return this.f25339.getBackground();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setBackgroundColor(int i) {
        this.f25339.setBackgroundColor(i);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final float getAlpha() {
        return this.f25339.getAlpha();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setVisible() {
        if (this.f25339.getVisibility() != 0) {
            if (C12799.m29347()) {
                this.f25339.setVisibility(0);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setInvisible() {
        if (this.f25339.getVisibility() != 4) {
            if (C12799.m29347()) {
                this.f25339.setVisibility(4);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setGone() {
        if (this.f25339.getVisibility() != 8) {
            if (C12799.m29347()) {
                this.f25339.setVisibility(8);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final int getVisibility() {
        return this.f25339.getVisibility();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setVisibility(int i) {
        if (this.f25339.getVisibility() != i) {
            if (C12799.m29347()) {
                this.f25339.setVisibility(i);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final boolean isFocused() {
        return this.f25339.isFocused();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final boolean requestFocus() {
        if (C12799.m29347()) {
            return this.f25339.requestFocus();
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setAlpha(float f) {
        if (C12799.m29347()) {
            this.f25339.setAlpha(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setBackground(Drawable drawable) {
        if (C12799.m29347()) {
            this.f25339.setBackground(drawable);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setEnabled(boolean z) {
        if (C12799.m29347()) {
            this.f25339.setEnabled(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setHeight(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            layoutParams.height = i;
            this.f25339.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setLayoutGravity(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i;
                this.f25339.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setLayoutWeight(float f) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = f;
                this.f25339.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMargin(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMargin(int i, int i2, int i3, int i4) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i4;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginBottom(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginHorizontal(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginLeft(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginRight(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginTop(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setMarginVertical(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f25339.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPadding(int i) {
        if (C12799.m29347()) {
            this.f25339.setPadding(i, i, i, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (C12799.m29347()) {
            this.f25339.setPadding(i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingBottom(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, -1, -1, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingHorizontal(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, i, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingLeft(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, i, -1, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingRight(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, -1, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingTop(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, -1, i, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setPaddingVertical(int i) {
        if (C12799.m29347()) {
            C11755.m26982(this.f25339, -1, i, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setSize(int i, int i2) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f25339.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void setWidth(int i) {
        if (C12799.m29347()) {
            ViewGroup.LayoutParams layoutParams = this.f25339.getLayoutParams();
            layoutParams.width = i;
            this.f25339.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void unifyWidth(PluginView... pluginViewArr) {
        if (C12799.m29347()) {
            if (pluginViewArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[pluginViewArr.length];
            for (int i = 0; i < pluginViewArr.length; i++) {
                viewArr[i] = ((C9318) pluginViewArr[i]).f25339;
            }
            C19100.m43394(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginView
    public final void unifyWidth(String... strArr) {
        if (C12799.m29347()) {
            if (strArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                viewArr[i] = ((C9318) requireViewById(strArr[i])).f25339;
            }
            C19100.m43394(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
