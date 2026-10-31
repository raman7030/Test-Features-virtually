package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۟ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A7OH */
/* JADX INFO: loaded from: classes3.dex */
public class C7312 implements PluginView {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f22445;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PluginViewGroup f22446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PluginUI f22447;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f22448;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f22449;

    public C7312(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        this.f22447 = pluginUI;
        this.f22446 = pluginViewGroup;
        if (pluginViewGroup == null && !(this instanceof PluginViewGroup)) {
            throw new IllegalArgumentException("PluginView which is not a PluginViewGroup must have a parent");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginUI getPluginUI() {
        return this.f22447;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setHeightDp(float f) {
        setHeight(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginBottomDp(float f) {
        setMarginBottom(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginDp(float f) {
        setMargin(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginHorizontalDp(float f) {
        setMarginHorizontal(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginLeftDp(float f) {
        setMarginLeft(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginRightDp(float f) {
        setMarginRight(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginTopDp(float f) {
        setMarginTop(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginVerticalDp(float f) {
        setMarginVertical(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingBottomDp(float f) {
        setPaddingBottom(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingDp(float f) {
        setPadding(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingHorizontalDp(float f) {
        setPaddingHorizontal(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingLeftDp(float f) {
        setPaddingLeft(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingRightDp(float f) {
        setPaddingRight(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingTopDp(float f) {
        setPaddingTop(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingVerticalDp(float f) {
        setPaddingVertical(this.f22447.dp2px(f));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setWidthDp(float f) {
        setWidth(this.f22447.dp2px(f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m19595() {
        return this.f22448;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo19598(View view) {
        this.f22448 = view;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginView findViewById(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return mo19596(str);
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginView requireViewById(String str) {
        PluginView pluginViewFindViewById = findViewById(str);
        if (pluginViewFindViewById != null) {
            return pluginViewFindViewById;
        }
        throw new IllegalArgumentException(C4860.m14172("ID '", str, "' does not reference a PluginView"));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final String getId() {
        return this.f22445;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final String requireId() {
        String str = this.f22445;
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("The id not set");
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PluginView mo19596(String str) {
        if (str.equals(this.f22445)) {
            return this;
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup getParentView() {
        return this.f22446;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup requireParentView() {
        PluginViewGroup pluginViewGroup = this.f22446;
        if (pluginViewGroup != null) {
            return pluginViewGroup;
        }
        throw new NullPointerException("No parent view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.ui.PluginView
    public final PluginViewGroup getRootView() {
        PluginViewGroup pluginViewGroup = this.f22446;
        return pluginViewGroup == null ? (PluginViewGroup) this : pluginViewGroup.getRootView();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19599(String str) {
        this.f22445 = str;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final Object getTag() {
        return this.f22449;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setTag(Object obj) {
        this.f22449 = obj;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final float getLayoutWeight() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).weight;
        }
        return 0.0f;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getLayoutGravity() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) layoutParams).gravity;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m19597(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C7416.m19937(1, str) == '}' && (stringNullable = this.f22447.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getWidth() {
        return this.f22448.getLayoutParams().width;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getHeight() {
        return this.f22448.getLayoutParams().height;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getViewWidth() {
        return this.f22448.getWidth();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getViewHeight() {
        return this.f22448.getHeight();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingLeft() {
        return this.f22448.getPaddingLeft();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingTop() {
        return this.f22448.getPaddingTop();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingRight() {
        return this.f22448.getPaddingRight();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getPaddingBottom() {
        return this.f22448.getPaddingBottom();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginLeft() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginTop() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginRight() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getMarginBottom() {
        ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setSizeDp(float f, float f2) {
        PluginUI pluginUI = this.f22447;
        setSize(pluginUI.dp2px(f), pluginUI.dp2px(f2));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f22447;
        setPadding(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginDp(float f, float f2, float f3, float f4) {
        PluginUI pluginUI = this.f22447;
        setMargin(pluginUI.dp2px(f), pluginUI.dp2px(f2), pluginUI.dp2px(f3), pluginUI.dp2px(f4));
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public void setOnClickListener(final PluginView.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.f22448.setOnClickListener(null);
        } else {
            this.f22448.setOnClickListener(new View.OnClickListener() { // from class: l.ܰۜ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7312 c7312 = this.f40741;
                    c7312.getClass();
                    onClickListener.onClick(c7312);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public void setOnLongClickListener(final PluginView.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            this.f22448.setOnLongClickListener(null);
        } else {
            this.f22448.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩺ۜ᩷
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C7312 c7312 = this.f73706;
                    c7312.getClass();
                    return onLongClickListener.onLongClick(c7312);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean performClick() {
        return this.f22448.performClick();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean performLongClick() {
        return this.f22448.performLongClick();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean isEnabled() {
        return this.f22448.isEnabled();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final Drawable getBackground() {
        return this.f22448.getBackground();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setBackgroundColor(int i) {
        this.f22448.setBackgroundColor(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final float getAlpha() {
        return this.f22448.getAlpha();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setVisible() {
        if (this.f22448.getVisibility() != 0) {
            if (C10975.m27285()) {
                this.f22448.setVisibility(0);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setInvisible() {
        if (this.f22448.getVisibility() != 4) {
            if (C10975.m27285()) {
                this.f22448.setVisibility(4);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setGone() {
        if (this.f22448.getVisibility() != 8) {
            if (C10975.m27285()) {
                this.f22448.setVisibility(8);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final int getVisibility() {
        return this.f22448.getVisibility();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setVisibility(int i) {
        if (this.f22448.getVisibility() != i) {
            if (C10975.m27285()) {
                this.f22448.setVisibility(i);
                return;
            }
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean isFocused() {
        return this.f22448.isFocused();
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final boolean requestFocus() {
        if (C10975.m27285()) {
            return this.f22448.requestFocus();
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setAlpha(float f) {
        if (C10975.m27285()) {
            this.f22448.setAlpha(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setBackground(Drawable drawable) {
        if (C10975.m27285()) {
            this.f22448.setBackground(drawable);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setEnabled(boolean z) {
        if (C10975.m27285()) {
            this.f22448.setEnabled(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setHeight(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            layoutParams.height = i;
            this.f22448.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setLayoutGravity(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i;
                this.f22448.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setLayoutWeight(float f) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = f;
                this.f22448.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMargin(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMargin(int i, int i2, int i3, int i4) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i4;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginBottom(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginHorizontal(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginLeft(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginRight(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginTop(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setMarginVertical(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                marginLayoutParams.bottomMargin = i;
                this.f22448.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPadding(int i) {
        if (C10975.m27285()) {
            this.f22448.setPadding(i, i, i, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (C10975.m27285()) {
            this.f22448.setPadding(i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingBottom(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, -1, -1, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingHorizontal(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, i, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingLeft(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, i, -1, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingRight(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, -1, -1, i, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingTop(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, -1, i, -1, -1);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setPaddingVertical(int i) {
        if (C10975.m27285()) {
            C9876.m24967(this.f22448, -1, i, -1, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setSize(int i, int i2) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f22448.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void setWidth(int i) {
        if (C10975.m27285()) {
            ViewGroup.LayoutParams layoutParams = this.f22448.getLayoutParams();
            layoutParams.width = i;
            this.f22448.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void unifyWidth(PluginView... pluginViewArr) {
        if (C10975.m27285()) {
            if (pluginViewArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[pluginViewArr.length];
            for (int i = 0; i < pluginViewArr.length; i++) {
                viewArr[i] = ((C7312) pluginViewArr[i]).f22448;
            }
            C17604.m41148(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginView
    public final void unifyWidth(String... strArr) {
        if (C10975.m27285()) {
            if (strArr.length < 2) {
                throw new IllegalArgumentException();
            }
            View[] viewArr = new View[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                viewArr[i] = ((C7312) requireViewById(strArr[i])).f22448;
            }
            C17604.m41148(viewArr);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
