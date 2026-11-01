package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢᩴ */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public class C1326 extends ViewGroup implements InterfaceC1833 {
    public static final String TAG = "Toolbar";
    public InterfaceC1714 mActionMenuPresenterCallback;
    public OnBackInvokedCallback mBackInvokedCallback;
    public boolean mBackInvokedCallbackEnabled;
    public OnBackInvokedDispatcher mBackInvokedDispatcher;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    public CharSequence mCollapseDescription;
    public Drawable mCollapseIcon;
    public boolean mCollapsible;
    public int mContentInsetEndWithActions;
    public int mContentInsetStartWithNavigation;
    public C1655 mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C1711 mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public InterfaceC1834 mMenuBuilderCallback;
    public final C1448 mMenuHostHelper;
    public C1278 mMenuView;
    public final InterfaceC1313 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public InterfaceC2026 mOnMenuItemClickListener;
    public C1698 mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    public ArrayList mProvidedMenuItems;
    public final Runnable mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public ColorStateList mSubtitleTextColor;
    public TextView mSubtitleTextView;
    public final int[] mTempMargins;
    public final ArrayList mTempViews;
    public int mTitleMarginBottom;
    public int mTitleMarginEnd;
    public int mTitleMarginStart;
    public int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public ColorStateList mTitleTextColor;
    public TextView mTitleTextView;
    public C0976 mWrapper;

    public C1326(Context context) {
        this(context, null);
    }

    public C1326(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1326(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C1448(new RunnableC20875(1, this));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new C1515(this);
        this.mShowOverflowMenuRunnable = new RunnableC1200(this);
        Context context2 = getContext();
        int[] iArr = C1010.f13517;
        C1970 c1970M53129 = C1970.m53129(context2, attributeSet, iArr, i, 0);
        C1717.m43548(this, context, iArr, attributeSet, c1970M53129.m53143(), i);
        this.mTitleTextAppearance = c1970M53129.m53139(28, 0);
        this.mSubtitleTextAppearance = c1970M53129.m53139(19, 0);
        this.mGravity = c1970M53129.m53147(0, this.mGravity);
        this.mButtonGravity = c1970M53129.m53147(2, 48);
        int iM53132 = c1970M53129.m53132(22, 0);
        iM53132 = c1970M53129.m53135(27) ? c1970M53129.m53132(27, iM53132) : iM53132;
        this.mTitleMarginBottom = iM53132;
        this.mTitleMarginTop = iM53132;
        this.mTitleMarginEnd = iM53132;
        this.mTitleMarginStart = iM53132;
        int iM53133 = c1970M53129.m53132(25, -1);
        if (iM53133 >= 0) {
            this.mTitleMarginStart = iM53133;
        }
        int iM53134 = c1970M53129.m53132(24, -1);
        if (iM53134 >= 0) {
            this.mTitleMarginEnd = iM53134;
        }
        int iM53135 = c1970M53129.m53132(26, -1);
        if (iM53135 >= 0) {
            this.mTitleMarginTop = iM53135;
        }
        int iM53136 = c1970M53129.m53132(23, -1);
        if (iM53136 >= 0) {
            this.mTitleMarginBottom = iM53136;
        }
        this.mMaxButtonHeight = c1970M53129.m53136(13, -1);
        int iM53137 = c1970M53129.m53132(9, Integer.MIN_VALUE);
        int iM53138 = c1970M53129.m53132(5, Integer.MIN_VALUE);
        int iM53139 = c1970M53129.m53136(7, 0);
        int iM531310 = c1970M53129.m53136(8, 0);
        m26765();
        this.mContentInsets.m40790(iM53139, iM531310);
        if (iM53137 != Integer.MIN_VALUE || iM53138 != Integer.MIN_VALUE) {
            this.mContentInsets.m40793(iM53137, iM53138);
        }
        this.mContentInsetStartWithNavigation = c1970M53129.m53132(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = c1970M53129.m53132(6, Integer.MIN_VALUE);
        this.mCollapseIcon = c1970M53129.m53148(4);
        this.mCollapseDescription = c1970M53129.m53150(3);
        CharSequence charSequenceM53150 = c1970M53129.m53150(21);
        if (!TextUtils.isEmpty(charSequenceM53150)) {
            setTitle(charSequenceM53150);
        }
        CharSequence charSequenceM53151 = c1970M53129.m53150(18);
        if (!TextUtils.isEmpty(charSequenceM53151)) {
            setSubtitle(charSequenceM53151);
        }
        this.mPopupContext = getContext();
        setPopupTheme(c1970M53129.m53139(17, 0));
        Drawable drawableM53148 = c1970M53129.m53148(16);
        if (drawableM53148 != null) {
            setNavigationIcon(drawableM53148);
        }
        CharSequence charSequenceM53152 = c1970M53129.m53150(15);
        if (!TextUtils.isEmpty(charSequenceM53152)) {
            setNavigationContentDescription(charSequenceM53152);
        }
        Drawable drawableM53149 = c1970M53129.m53148(11);
        if (drawableM53149 != null) {
            setLogo(drawableM53149);
        }
        CharSequence charSequenceM53153 = c1970M53129.m53150(12);
        if (!TextUtils.isEmpty(charSequenceM53153)) {
            setLogoDescription(charSequenceM53153);
        }
        if (c1970M53129.m53135(29)) {
            setTitleTextColor(c1970M53129.m53137(29));
        }
        if (c1970M53129.m53135(20)) {
            setSubtitleTextColor(c1970M53129.m53137(20));
        }
        if (c1970M53129.m53135(14)) {
            inflateMenu(c1970M53129.m53139(14, 0));
        }
        c1970M53129.m53146();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m26765();
        this.mContentInsets.m40791(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C22622.m50680(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        C1278 c1278;
        return getVisibility() == 0 && (c1278 = this.mMenuView) != null && c1278.m24649();
    }

    public boolean isOverflowMenuShowing() {
        C1278 c1278 = this.mMenuView;
        return c1278 != null && c1278.m24656();
    }

    public boolean isOverflowMenuShowPending() {
        C1278 c1278 = this.mMenuView;
        return c1278 != null && c1278.m24647();
    }

    public boolean showOverflowMenu() {
        C1278 c1278 = this.mMenuView;
        return c1278 != null && c1278.m24646();
    }

    public boolean hideOverflowMenu() {
        C1278 c1278 = this.mMenuView;
        return c1278 != null && c1278.m24657();
    }

    public void setMenu(C0994 c0994, C1698 c1698) {
        if (c0994 == null && this.mMenuView == null) {
            return;
        }
        m26779();
        C0994 c0994M24648 = this.mMenuView.m24648();
        if (c0994M24648 == c0994) {
            return;
        }
        if (c0994M24648 != null) {
            c0994M24648.removeMenuPresenter(this.mOuterActionMenuPresenter);
            c0994M24648.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C1711(this);
        }
        c1698.m42798();
        if (c0994 != null) {
            c0994.addMenuPresenter(c1698, this.mPopupContext);
            c0994.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c1698.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c1698.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.m24650(this.mPopupTheme);
        this.mMenuView.m24642(c1698);
        this.mOuterActionMenuPresenter = c1698;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        C1278 c1278 = this.mMenuView;
        if (c1278 != null) {
            c1278.m24653();
        }
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m26774();
            if (!m26777(this.mLogoView)) {
                m26767((View) this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m26777(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m26774();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m26774() {
        if (this.mLogoView == null) {
            this.mLogoView = new C1732(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        C1711 c1711 = this.mExpandedMenuPresenter;
        return (c1711 == null || c1711.f56708 == null) ? false : true;
    }

    public void collapseActionView() {
        C1711 c1711 = this.mExpandedMenuPresenter;
        C1134 c1134 = c1711 == null ? null : c1711.f56708;
        if (c1134 != null) {
            c1134.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C1567 c1567 = new C1567(context);
                this.mTitleTextView = c1567;
                c1567.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m26777(this.mTitleTextView)) {
                m26767((View) this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && m26777(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C1567 c1567 = new C1567(context);
                this.mSubtitleTextView = c1567;
                c1567.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m26777(this.mSubtitleTextView)) {
                m26767((View) this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m26777(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m26778();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C1781.m45965(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C22622.m50680(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m26778();
            if (!m26777(this.mNavButtonView)) {
                m26767((View) this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m26777(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m26778();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C22622.m50680(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public Menu getMenu() {
        m26776();
        return this.mMenuView.m24655();
    }

    public void setOverflowIcon(Drawable drawable) {
        m26776();
        this.mMenuView.m24641(drawable);
    }

    public Drawable getOverflowIcon() {
        m26776();
        return this.mMenuView.m24654();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m26776() {
        m26779();
        if (this.mMenuView.m24648() == null) {
            C0994 c0994 = (C0994) this.mMenuView.m24655();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C1711(this);
            }
            this.mMenuView.m24652();
            c0994.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m26779() {
        if (this.mMenuView == null) {
            C1278 c1278 = new C1278(getContext(), null);
            this.mMenuView = c1278;
            c1278.m24650(this.mPopupTheme);
            C1278 c1279 = this.mMenuView;
            c1279.f29689 = this.mMenuViewItemClickListener;
            c1279.m24643(this.mActionMenuPresenterCallback, new C0941(this));
            C1571 c1571GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c1571GenerateDefaultLayoutParams.f42796 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388613;
            this.mMenuView.setLayoutParams(c1571GenerateDefaultLayoutParams);
            m26767((View) this.mMenuView, false);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private MenuInflater m26782() {
        return new C1228(getContext());
    }

    public void inflateMenu(int i) {
        m26782().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(InterfaceC2026 interfaceC2026) {
        this.mOnMenuItemClickListener = interfaceC2026;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m26765();
        this.mContentInsets.m40793(i, i2);
    }

    public int getContentInsetStart() {
        C1655 c1655 = this.mContentInsets;
        if (c1655 != null) {
            return c1655.m40795();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C1655 c1655 = this.mContentInsets;
        if (c1655 != null) {
            return c1655.m40789();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m26765();
        this.mContentInsets.m40790(i, i2);
    }

    public int getContentInsetLeft() {
        C1655 c1655 = this.mContentInsets;
        if (c1655 != null) {
            return c1655.m40792();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1655 c1655 = this.mContentInsets;
        if (c1655 != null) {
            return c1655.m40794();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0994 c0994M24648;
        C1278 c1278 = this.mMenuView;
        if (c1278 != null && (c0994M24648 = c1278.m24648()) != null && c0994M24648.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m26778() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C1382(getContext(), null, R.attr.MT_Protector);
            C1571 c1571GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c1571GenerateDefaultLayoutParams.f42796 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            this.mNavButtonView.setLayoutParams(c1571GenerateDefaultLayoutParams);
        }
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C1382 c1382 = new C1382(getContext(), null, R.attr.MT_Protector);
            this.mCollapseButtonView = c1382;
            c1382.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C1571 c1571GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c1571GenerateDefaultLayoutParams.f42796 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c1571GenerateDefaultLayoutParams.f48009 = 2;
            this.mCollapseButtonView.setLayoutParams(c1571GenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC1396(this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26767(View view, boolean z) {
        C1571 c1571GenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1571GenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c1571GenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            c1571GenerateLayoutParams = (C1571) layoutParams;
        }
        c1571GenerateLayoutParams.f48009 = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c1571GenerateLayoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, c1571GenerateLayoutParams);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1134 c1134;
        C1886 c1886 = new C1886(super.onSaveInstanceState());
        C1711 c1711 = this.mExpandedMenuPresenter;
        if (c1711 != null && (c1134 = c1711.f56708) != null) {
            c1886.f70593 = c1134.getItemId();
        }
        c1886.f70594 = isOverflowMenuShowing();
        return c1886;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1886)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1886 c1886 = (C1886) parcelable;
        super.onRestoreInstanceState(c1886.getSuperState());
        C1278 c1278 = this.mMenuView;
        C0994 c0994M24648 = c1278 != null ? c1278.m24648() : null;
        int i = c1886.f70593;
        if (i != 0 && this.mExpandedMenuPresenter != null && c0994M24648 != null && (menuItemFindItem = c0994M24648.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1886.f70594) {
            m26781();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m26781() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26766(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26762(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۢ */
    private boolean m26770() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m26780(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.mTempMargins;
        int i3 = C1956.f75466;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m26780(this.mNavButtonView)) {
            m26766(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + m26760(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m26772(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m26780(this.mCollapseButtonView)) {
            m26766(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + m26760(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + m26772(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[c] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m26780(this.mMenuView)) {
            m26766(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + m26760(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + m26772(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m26780(this.mExpandedActionView)) {
            iMax4 += m26762(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + m26772(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m26780(this.mLogoView)) {
            iMax4 += m26762(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + m26772(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1571) childAt.getLayoutParams()).f48009 == 0 && m26780(childAt)) {
                iMax4 += m26762(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m26772(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m26780(this.mTitleTextView)) {
            m26762(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + m26760(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + m26772(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (m26780(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m26762(this.mSubtitleTextView, i, iMax4 + i6, i2, i5 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + m26772(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m26770() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax5, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x028f  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a0 A[LOOP:0: B:105:0x029e->B:106:0x02a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c2 A[LOOP:1: B:108:0x02c0->B:109:0x02c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb A[LOOP:2: B:117:0x02f9->B:118:0x02fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x022a  */
    /* JADX WARN: Code duplicated, block: B:95:0x023e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0261  */
    /* JADX WARN: Code duplicated, block: B:98:0x0264  */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM26763;
        int iM26773;
        int iMax;
        int iMin;
        boolean zM26780;
        boolean zM26781;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C1571 c1571;
        C1571 c1572;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int iMax3;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int i23;
        int i24;
        int size3;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int i26 = C1717.f57146;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m26780(this.mNavButtonView)) {
            if (z3) {
                iM26773 = m26773(this.mNavButtonView, i25, iArr, iMin2);
                iM26763 = paddingLeft;
            } else {
                iM26763 = m26763(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (m26780(this.mCollapseButtonView)) {
                if (z3) {
                    iM26773 = m26773(this.mCollapseButtonView, iM26773, iArr, iMin2);
                } else {
                    iM26763 = m26763(this.mCollapseButtonView, iM26763, iArr, iMin2);
                }
            }
            if (m26780(this.mMenuView)) {
                if (z3) {
                    iM26763 = m26763(this.mMenuView, iM26763, iArr, iMin2);
                } else {
                    iM26773 = m26773(this.mMenuView, iM26773, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM26763);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iM26773));
            iMax = Math.max(iM26763, currentContentInsetLeft);
            iMin = Math.min(iM26773, i25 - currentContentInsetRight);
            if (m26780(this.mExpandedActionView)) {
                if (z3) {
                    iMin = m26773(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = m26763(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (m26780(this.mLogoView)) {
                if (z3) {
                    iMin = m26773(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = m26763(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zM26780 = m26780(this.mTitleTextView);
            zM26781 = m26780(this.mSubtitleTextView);
            if (zM26780) {
                C1571 c1573 = (C1571) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1573).topMargin + ((ViewGroup.MarginLayoutParams) c1573).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM26781) {
                C1571 c1574 = (C1571) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1574).topMargin + ((ViewGroup.MarginLayoutParams) c1574).bottomMargin;
            }
            if (!zM26780 || zM26781) {
                if (zM26780) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zM26781) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c1571 = (C1571) textView.getLayoutParams();
                c1572 = (C1571) textView2.getLayoutParams();
                z2 = (!zM26780 && this.mTitleTextView.getMeasuredWidth() > 0) || (zM26781 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i5 = paddingLeft;
                i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                i7 = iMin2;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1571).topMargin + this.mTitleMarginTop;
                } else if (i6 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) c1571).topMargin;
                    i16 = this.mTitleMarginTop;
                    if (iMax4 < i15 + i16) {
                        iMax4 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c1571).bottomMargin;
                        i19 = this.mTitleMarginBottom;
                        if (i17 < i18 + i19) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c1572).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1572).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i12 = this.mTitleMarginStart;
                    } else {
                        i12 = 0;
                    }
                    int i27 = i12 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM26780) {
                        C1571 c1575 = (C1571) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1575).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zM26781) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i28, iMin, this.mSubtitleTextView.getMeasuredHeight() + i28);
                        i14 = iMin - this.mTitleMarginEnd;
                    } else {
                        i14 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i13, i14);
                    }
                } else {
                    if (z2) {
                        i8 = this.mTitleMarginStart;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax2 = Math.max(0, i29) + iMax;
                    iArr[0] = Math.max(0, -i29);
                    if (zM26780) {
                        C1571 c1576 = (C1571) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1576).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zM26781 != 0) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                        this.mSubtitleTextView.layout(iMax2, i30, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i30);
                        i10 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i10 = iMax2;
                    }
                    if (z2) {
                        iMax3 = Math.max(i9, i10);
                    } else {
                        iMax3 = iMax2;
                    }
                    i11 = 0;
                }
                m26768(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i20 = 0; i20 < size; i20++) {
                    iMax3 = m26763((View) this.mTempViews.get(i20), iMax3, iArr, i7);
                }
                i21 = i7;
                m26768(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i22 = 0; i22 < size2; i22++) {
                    iMin = m26773((View) this.mTempViews.get(i22), iMin, iArr, i21);
                }
                m26768(this.mTempViews, 1);
                int iM26764 = m26764(this.mTempViews, iArr);
                i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM26764 / 2);
                i24 = iM26764 + i23;
                if (i23 >= iMax3) {
                    if (i24 > iMin) {
                        iMax3 = i23 - (i24 - iMin);
                    } else {
                        iMax3 = i23;
                    }
                }
                size3 = this.mTempViews.size();
                while (i11 < size3) {
                    iMax3 = m26763((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                    i11++;
                }
                this.mTempViews.clear();
            }
            iMax = iMax;
            i7 = iMin2;
            i5 = paddingLeft;
            i11 = 0;
            iMax3 = iMax;
            m26768(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i20 < size) {
                iMax3 = m26763((View) this.mTempViews.get(i20), iMax3, iArr, i7);
            }
            i21 = i7;
            m26768(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i22 < size2) {
                iMin = m26773((View) this.mTempViews.get(i22), iMin, iArr, i21);
            }
            m26768(this.mTempViews, 1);
            int iM26765 = m26764(this.mTempViews, iArr);
            i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM26765 / 2);
            i24 = iM26765 + i23;
            if (i23 >= iMax3) {
                if (i24 > iMin) {
                    iMax3 = i23 - (i24 - iMin);
                } else {
                    iMax3 = i23;
                }
            }
            size3 = this.mTempViews.size();
            while (i11 < size3) {
                iMax3 = m26763((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                i11++;
            }
            this.mTempViews.clear();
        }
        iM26763 = paddingLeft;
        iM26773 = i25;
        if (m26780(this.mCollapseButtonView)) {
            if (z3) {
                iM26773 = m26773(this.mCollapseButtonView, iM26773, iArr, iMin2);
            } else {
                iM26763 = m26763(this.mCollapseButtonView, iM26763, iArr, iMin2);
            }
        }
        if (m26780(this.mMenuView)) {
            if (z3) {
                iM26763 = m26763(this.mMenuView, iM26763, iArr, iMin2);
            } else {
                iM26773 = m26773(this.mMenuView, iM26773, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM26763);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iM26773));
        iMax = Math.max(iM26763, currentContentInsetLeft2);
        iMin = Math.min(iM26773, i25 - currentContentInsetRight2);
        if (m26780(this.mExpandedActionView)) {
            if (z3) {
                iMin = m26773(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = m26763(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (m26780(this.mLogoView)) {
            if (z3) {
                iMin = m26773(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = m26763(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zM26780 = m26780(this.mTitleTextView);
        zM26781 = m26780(this.mSubtitleTextView);
        if (zM26780) {
            C1571 c1577 = (C1571) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1577).topMargin + ((ViewGroup.MarginLayoutParams) c1577).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM26781) {
            C1571 c1578 = (C1571) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1578).topMargin + ((ViewGroup.MarginLayoutParams) c1578).bottomMargin;
        }
        if (zM26780) {
            if (zM26780) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM26781) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c1571 = (C1571) textView.getLayoutParams();
            c1572 = (C1571) textView2.getLayoutParams();
            if (zM26780) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1571).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c1571).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c1571).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c1572).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1572).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM26780) {
                    C1571 c1579 = (C1571) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c1579).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM26781) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i211, iMin, this.mSubtitleTextView.getMeasuredHeight() + i211);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                i11 = 0;
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax2 = Math.max(0, i212) + iMax;
                iArr[0] = Math.max(0, -i212);
                if (zM26780) {
                    C1571 c15710 = (C1571) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c15710).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM26781 != 0) {
                    int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i31, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i31);
                    i10 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
                i11 = 0;
            }
        } else {
            if (zM26780) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM26781) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c1571 = (C1571) textView.getLayoutParams();
            c1572 = (C1571) textView2.getLayoutParams();
            if (zM26780) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1571).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c1571).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c1571).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c1572).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1572).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i12 = this.mTitleMarginStart;
                } else {
                    i12 = 0;
                }
                int i213 = i12 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM26780) {
                    C1571 c15711 = (C1571) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c15711).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM26781) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i214, iMin, this.mSubtitleTextView.getMeasuredHeight() + i214);
                    i14 = iMin - this.mTitleMarginEnd;
                } else {
                    i14 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i13, i14);
                }
                i11 = 0;
                iMax3 = iMax;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax2 = Math.max(0, i215) + iMax;
                iArr[0] = Math.max(0, -i215);
                if (zM26780) {
                    C1571 c15712 = (C1571) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c15712).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM26781 != 0) {
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1571) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i32, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i32);
                    i10 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i10 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i9, i10);
                } else {
                    iMax3 = iMax2;
                }
                i11 = 0;
            }
        }
        m26768(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i20 < size) {
            iMax3 = m26763((View) this.mTempViews.get(i20), iMax3, iArr, i7);
        }
        i21 = i7;
        m26768(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i22 < size2) {
            iMin = m26773((View) this.mTempViews.get(i22), iMin, iArr, i21);
        }
        m26768(this.mTempViews, 1);
        int iM26766 = m26764(this.mTempViews, iArr);
        i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM26766 / 2);
        i24 = iM26766 + i23;
        if (i23 >= iMax3) {
            if (i24 > iMin) {
                iMax3 = i23 - (i24 - iMin);
            } else {
                iMax3 = i23;
            }
        }
        size3 = this.mTempViews.size();
        while (i11 < size3) {
            iMax3 = m26763((View) this.mTempViews.get(i11), iMax3, iArr, i21);
            i11++;
        }
        this.mTempViews.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26764(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C1571 c1571 = (C1571) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c1571).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c1571).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += view.getMeasuredWidth() + iMax + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26763(View view, int i, int[] iArr, int i2) {
        C1571 c1571 = (C1571) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1571).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM26761 = m26761(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM26761, iMax + measuredWidth, view.getMeasuredHeight() + iM26761);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1571).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m26773(View view, int i, int[] iArr, int i2) {
        C1571 c1571 = (C1571) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1571).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM26761 = m26761(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM26761, iMax, view.getMeasuredHeight() + iM26761);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1571).leftMargin);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26761(View view, int i) {
        C1571 c1571 = (C1571) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM26771 = m26771(c1571.f42796);
        if (iM26771 == 48) {
            return getPaddingTop() - i2;
        }
        if (iM26771 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1571).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c1571).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c1571).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m26771(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26768(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1571 c1571 = (C1571) childAt.getLayoutParams();
                if (c1571.f48009 == 0 && m26780(childAt) && m26759(c1571.f42796) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C1571 c1572 = (C1571) childAt2.getLayoutParams();
            if (c1572.f48009 == 0 && m26780(childAt2) && m26759(c1572.f42796) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26759(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m26780(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26760(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ۧ */
    private int m26772(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public C1571 generateLayoutParams(AttributeSet attributeSet) {
        return new C1571(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C1571 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1571) {
            C1571 c1571 = (C1571) layoutParams;
            C1571 c1572 = new C1571(c1571);
            c1572.f48009 = 0;
            c1572.f48009 = c1571.f48009;
            return c1572;
        }
        if (layoutParams instanceof C1500) {
            C1571 c1573 = new C1571((C1500) layoutParams);
            c1573.f48009 = 0;
            return c1573;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1571 c1574 = new C1571(layoutParams);
            c1574.f48009 = 0;
            return c1574;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1571 c1575 = new C1571(marginLayoutParams);
        c1575.f48009 = 0;
        ((ViewGroup.MarginLayoutParams) c1575).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1575).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1575).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1575).bottomMargin = marginLayoutParams.bottomMargin;
        return c1575;
    }

    @Override // android.view.ViewGroup
    public C1571 generateDefaultLayoutParams() {
        C1571 c1571 = new C1571(-2, -2);
        c1571.f48009 = 0;
        c1571.f42796 = 8388627;
        return c1571;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1571);
    }

    public InterfaceC0867 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C0976(this, true);
        }
        return this.mWrapper;
    }

    public void removeChildrenForExpandedActionView() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (((C1571) childAt.getLayoutParams()).f48009 != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            if (size >= 0) {
                addView((View) this.mHiddenViews.get(size));
            } else {
                this.mHiddenViews.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m26777(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(InterfaceC1714 interfaceC1714, InterfaceC1834 interfaceC1834) {
        this.mActionMenuPresenterCallback = interfaceC1714;
        this.mMenuBuilderCallback = interfaceC1834;
        C1278 c1278 = this.mMenuView;
        if (c1278 != null) {
            c1278.m24643(interfaceC1714, interfaceC1834);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26765() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C1655();
        }
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public C1698 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    /* JADX INFO: renamed from: ܳ */
    private ArrayList m26775() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m26769() {
        Menu menu = getMenu();
        ArrayList arrayListM26775 = m26775();
        this.mMenuHostHelper.m31762(menu, m26782());
        ArrayList arrayListM26776 = m26775();
        arrayListM26776.removeAll(arrayListM26775);
        this.mProvidedMenuItems = arrayListM26776;
    }

    @Override // p067l.InterfaceC1833
    public void addMenuProvider(InterfaceC1413 interfaceC1413) {
        this.mMenuHostHelper.m31763(interfaceC1413);
    }

    public void addMenuProvider(InterfaceC1413 interfaceC1413, InterfaceC24784 interfaceC24784) {
        this.mMenuHostHelper.m31764(interfaceC1413, interfaceC24784);
    }

    public void addMenuProvider(InterfaceC1413 interfaceC1413, InterfaceC24784 interfaceC24784, EnumC15415 enumC15415) {
        this.mMenuHostHelper.m31765(interfaceC1413, interfaceC24784, enumC15415);
    }

    @Override // p067l.InterfaceC1833
    public void removeMenuProvider(InterfaceC1413 interfaceC1413) {
        this.mMenuHostHelper.m31768(interfaceC1413);
    }

    public void invalidateMenu() {
        Iterator it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m26769();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM44725 = C1746.m44725(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherM44725 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C1746.m44724(new RunnableC9413(1, this));
                }
                C1746.m44726(onBackInvokedDispatcherM44725, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM44725;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C1746.m44727(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }
}
