package l;

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
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public class C9762 extends ViewGroup implements InterfaceC19974 {
    public static final String TAG = "Toolbar";
    public InterfaceC17585 mActionMenuPresenterCallback;
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
    public C16382 mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C17522 mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public InterfaceC19994 mMenuBuilderCallback;
    public final C12212 mMenuHostHelper;
    public C8788 mMenuView;
    public final InterfaceC9494 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public InterfaceC23872 mOnMenuItemClickListener;
    public C17254 mOuterActionMenuPresenter;
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
    public C2706 mWrapper;

    public C9762(Context context) {
        this(context, null);
    }

    public C9762(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C9762(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C12212(new RunnableC19472(1, this));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new C13560(this);
        this.mShowOverflowMenuRunnable = new RunnableC7211(this);
        Context context2 = getContext();
        int[] iArr = C3390.f10710;
        C22733 c22733M50796 = C22733.m50796(context2, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, c22733M50796.m50810(), i);
        this.mTitleTextAppearance = c22733M50796.m50806(28, 0);
        this.mSubtitleTextAppearance = c22733M50796.m50806(19, 0);
        this.mGravity = c22733M50796.m50814(0, this.mGravity);
        this.mButtonGravity = c22733M50796.m50814(2, 48);
        int iM50799 = c22733M50796.m50799(22, 0);
        iM50799 = c22733M50796.m50802(27) ? c22733M50796.m50799(27, iM50799) : iM50799;
        this.mTitleMarginBottom = iM50799;
        this.mTitleMarginTop = iM50799;
        this.mTitleMarginEnd = iM50799;
        this.mTitleMarginStart = iM50799;
        int iM507910 = c22733M50796.m50799(25, -1);
        if (iM507910 >= 0) {
            this.mTitleMarginStart = iM507910;
        }
        int iM507911 = c22733M50796.m50799(24, -1);
        if (iM507911 >= 0) {
            this.mTitleMarginEnd = iM507911;
        }
        int iM507912 = c22733M50796.m50799(26, -1);
        if (iM507912 >= 0) {
            this.mTitleMarginTop = iM507912;
        }
        int iM507913 = c22733M50796.m50799(23, -1);
        if (iM507913 >= 0) {
            this.mTitleMarginBottom = iM507913;
        }
        this.mMaxButtonHeight = c22733M50796.m50803(13, -1);
        int iM507914 = c22733M50796.m50799(9, Integer.MIN_VALUE);
        int iM507915 = c22733M50796.m50799(5, Integer.MIN_VALUE);
        int iM50803 = c22733M50796.m50803(7, 0);
        int iM50804 = c22733M50796.m50803(8, 0);
        m24751();
        this.mContentInsets.m38573(iM50803, iM50804);
        if (iM507914 != Integer.MIN_VALUE || iM507915 != Integer.MIN_VALUE) {
            this.mContentInsets.m38576(iM507914, iM507915);
        }
        this.mContentInsetStartWithNavigation = c22733M50796.m50799(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = c22733M50796.m50799(6, Integer.MIN_VALUE);
        this.mCollapseIcon = c22733M50796.m50815(4);
        this.mCollapseDescription = c22733M50796.m50817(3);
        CharSequence charSequenceM50817 = c22733M50796.m50817(21);
        if (!TextUtils.isEmpty(charSequenceM50817)) {
            setTitle(charSequenceM50817);
        }
        CharSequence charSequenceM50818 = c22733M50796.m50817(18);
        if (!TextUtils.isEmpty(charSequenceM50818)) {
            setSubtitle(charSequenceM50818);
        }
        this.mPopupContext = getContext();
        setPopupTheme(c22733M50796.m50806(17, 0));
        Drawable drawableM50815 = c22733M50796.m50815(16);
        if (drawableM50815 != null) {
            setNavigationIcon(drawableM50815);
        }
        CharSequence charSequenceM50819 = c22733M50796.m50817(15);
        if (!TextUtils.isEmpty(charSequenceM50819)) {
            setNavigationContentDescription(charSequenceM50819);
        }
        Drawable drawableM50816 = c22733M50796.m50815(11);
        if (drawableM50816 != null) {
            setLogo(drawableM50816);
        }
        CharSequence charSequenceM508110 = c22733M50796.m50817(12);
        if (!TextUtils.isEmpty(charSequenceM508110)) {
            setLogoDescription(charSequenceM508110);
        }
        if (c22733M50796.m50802(29)) {
            setTitleTextColor(c22733M50796.m50804(29));
        }
        if (c22733M50796.m50802(20)) {
            setSubtitleTextColor(c22733M50796.m50804(20));
        }
        if (c22733M50796.m50802(14)) {
            inflateMenu(c22733M50796.m50806(14, 0));
        }
        c22733M50796.m50813();
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
        m24751();
        this.mContentInsets.m38574(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C21311.m48345(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        C8788 c8788;
        return getVisibility() == 0 && (c8788 = this.mMenuView) != null && c8788.m22679();
    }

    public boolean isOverflowMenuShowing() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22686();
    }

    public boolean isOverflowMenuShowPending() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22677();
    }

    public boolean showOverflowMenu() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22676();
    }

    public boolean hideOverflowMenu() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22687();
    }

    public void setMenu(C3060 c3060, C17254 c17254) {
        if (c3060 == null && this.mMenuView == null) {
            return;
        }
        m24765();
        C3060 c3060M22678 = this.mMenuView.m22678();
        if (c3060M22678 == c3060) {
            return;
        }
        if (c3060M22678 != null) {
            c3060M22678.removeMenuPresenter(this.mOuterActionMenuPresenter);
            c3060M22678.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C17522(this);
        }
        c17254.m40549();
        if (c3060 != null) {
            c3060.addMenuPresenter(c17254, this.mPopupContext);
            c3060.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c17254.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c17254.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.m22680(this.mPopupTheme);
        this.mMenuView.m22672(c17254);
        this.mOuterActionMenuPresenter = c17254;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        C8788 c8788 = this.mMenuView;
        if (c8788 != null) {
            c8788.m22683();
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
            m24760();
            if (!m24763(this.mLogoView)) {
                m24753((View) this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m24763(imageView)) {
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
            m24760();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24760() {
        if (this.mLogoView == null) {
            this.mLogoView = new C17939(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        C17522 c17522 = this.mExpandedMenuPresenter;
        return (c17522 == null || c17522.f53517 == null) ? false : true;
    }

    public void collapseActionView() {
        C17522 c17522 = this.mExpandedMenuPresenter;
        C5882 c5882 = c17522 == null ? null : c17522.f53517;
        if (c5882 != null) {
            c5882.collapseActionView();
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
                C14615 c14615 = new C14615(context);
                this.mTitleTextView = c14615;
                c14615.setSingleLine();
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
            if (!m24763(this.mTitleTextView)) {
                m24753((View) this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && m24763(textView)) {
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
                C14615 c14615 = new C14615(context);
                this.mSubtitleTextView = c14615;
                c14615.setSingleLine();
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
            if (!m24763(this.mSubtitleTextView)) {
                m24753((View) this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m24763(textView)) {
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
            m24764();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C18934.m43699(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C21311.m48345(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m24764();
            if (!m24763(this.mNavButtonView)) {
                m24753((View) this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m24763(imageButton)) {
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
        m24764();
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
        setCollapseIcon(C21311.m48345(getContext(), i));
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
        m24762();
        return this.mMenuView.m22685();
    }

    public void setOverflowIcon(Drawable drawable) {
        m24762();
        this.mMenuView.m22671(drawable);
    }

    public Drawable getOverflowIcon() {
        m24762();
        return this.mMenuView.m22684();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24762() {
        m24765();
        if (this.mMenuView.m22678() == null) {
            C3060 c3060 = (C3060) this.mMenuView.m22685();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C17522(this);
            }
            this.mMenuView.m22682();
            c3060.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24765() {
        if (this.mMenuView == null) {
            C8788 c8788 = new C8788(getContext(), null);
            this.mMenuView = c8788;
            c8788.m22680(this.mPopupTheme);
            C8788 c8789 = this.mMenuView;
            c8789.f26764 = this.mMenuViewItemClickListener;
            c8789.m22673(this.mActionMenuPresenterCallback, new C2000(this));
            C14699 c14699GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c14699GenerateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388613;
            this.mMenuView.setLayoutParams(c14699GenerateDefaultLayoutParams);
            m24753((View) this.mMenuView, false);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private MenuInflater m24768() {
        return new C7790(getContext());
    }

    public void inflateMenu(int i) {
        m24768().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(InterfaceC23872 interfaceC23872) {
        this.mOnMenuItemClickListener = interfaceC23872;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m24751();
        this.mContentInsets.m38576(i, i2);
    }

    public int getContentInsetStart() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38578();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38572();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m24751();
        this.mContentInsets.m38573(i, i2);
    }

    public int getContentInsetLeft() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38575();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38577();
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
        C3060 c3060M22678;
        C8788 c8788 = this.mMenuView;
        if (c8788 != null && (c3060M22678 = c8788.m22678()) != null && c3060M22678.hasVisibleItems()) {
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24764() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C10884(getContext(), null, R.attr.MT_Protector);
            C14699 c14699GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c14699GenerateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            this.mNavButtonView.setLayoutParams(c14699GenerateDefaultLayoutParams);
        }
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C10884 c10884 = new C10884(getContext(), null, R.attr.MT_Protector);
            this.mCollapseButtonView = c10884;
            c10884.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C14699 c14699GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c14699GenerateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c14699GenerateDefaultLayoutParams.f44895 = 2;
            this.mCollapseButtonView.setLayoutParams(c14699GenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC11173(this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24753(View view, boolean z) {
        C14699 c14699GenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c14699GenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c14699GenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            c14699GenerateLayoutParams = (C14699) layoutParams;
        }
        c14699GenerateLayoutParams.f44895 = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c14699GenerateLayoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, c14699GenerateLayoutParams);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5882 c5882;
        C21051 c21051 = new C21051(super.onSaveInstanceState());
        C17522 c17522 = this.mExpandedMenuPresenter;
        if (c17522 != null && (c5882 = c17522.f53517) != null) {
            c21051.f67909 = c5882.getItemId();
        }
        c21051.f67910 = isOverflowMenuShowing();
        return c21051;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C21051)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C21051 c21051 = (C21051) parcelable;
        super.onRestoreInstanceState(c21051.getSuperState());
        C8788 c8788 = this.mMenuView;
        C3060 c3060M22678 = c8788 != null ? c8788.m22678() : null;
        int i = c21051.f67909;
        if (i != 0 && this.mExpandedMenuPresenter != null && c3060M22678 != null && (menuItemFindItem = c3060M22678.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c21051.f67910) {
            m24767();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24767() {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24752(View view, int i, int i2, int i3, int i4, int i5) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24748(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m24756() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m24766(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
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
        int i3 = C22461.f72738;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m24766(this.mNavButtonView)) {
            m24752(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + m24746(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m24758(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m24766(this.mCollapseButtonView)) {
            m24752(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + m24746(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + m24758(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[c] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m24766(this.mMenuView)) {
            m24752(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + m24746(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + m24758(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m24766(this.mExpandedActionView)) {
            iMax4 += m24748(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + m24758(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (m24766(this.mLogoView)) {
            iMax4 += m24748(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + m24758(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C14699) childAt.getLayoutParams()).f44895 == 0 && m24766(childAt)) {
                iMax4 += m24748(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m24758(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m24766(this.mTitleTextView)) {
            m24748(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + m24746(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + m24758(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (m24766(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m24748(this.mSubtitleTextView, i, iMax4 + i6, i2, i5 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + m24758(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m24756() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax5, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
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
        int iM24749;
        int iM24759;
        int iMax;
        int iMin;
        boolean zM24766;
        boolean zM24767;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C14699 c14699;
        C14699 c146910;
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
        int i26 = C17648.f53953;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m24766(this.mNavButtonView)) {
            if (z3) {
                iM24759 = m24759(this.mNavButtonView, i25, iArr, iMin2);
                iM24749 = paddingLeft;
            } else {
                iM24749 = m24749(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (m24766(this.mCollapseButtonView)) {
                if (z3) {
                    iM24759 = m24759(this.mCollapseButtonView, iM24759, iArr, iMin2);
                } else {
                    iM24749 = m24749(this.mCollapseButtonView, iM24749, iArr, iMin2);
                }
            }
            if (m24766(this.mMenuView)) {
                if (z3) {
                    iM24749 = m24749(this.mMenuView, iM24749, iArr, iMin2);
                } else {
                    iM24759 = m24759(this.mMenuView, iM24759, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM24749);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iM24759));
            iMax = Math.max(iM24749, currentContentInsetLeft);
            iMin = Math.min(iM24759, i25 - currentContentInsetRight);
            if (m24766(this.mExpandedActionView)) {
                if (z3) {
                    iMin = m24759(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = m24749(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (m24766(this.mLogoView)) {
                if (z3) {
                    iMin = m24759(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = m24749(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zM24766 = m24766(this.mTitleTextView);
            zM24767 = m24766(this.mSubtitleTextView);
            if (zM24766) {
                C14699 c146911 = (C14699) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c146911).topMargin + ((ViewGroup.MarginLayoutParams) c146911).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM24767) {
                C14699 c146912 = (C14699) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c146912).topMargin + ((ViewGroup.MarginLayoutParams) c146912).bottomMargin;
            }
            if (!zM24766 || zM24767) {
                if (zM24766) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zM24767) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c14699 = (C14699) textView.getLayoutParams();
                c146910 = (C14699) textView2.getLayoutParams();
                z2 = (!zM24766 && this.mTitleTextView.getMeasuredWidth() > 0) || (zM24767 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i5 = paddingLeft;
                i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                i7 = iMin2;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14699).topMargin + this.mTitleMarginTop;
                } else if (i6 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) c14699).topMargin;
                    i16 = this.mTitleMarginTop;
                    if (iMax4 < i15 + i16) {
                        iMax4 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) c14699).bottomMargin;
                        i19 = this.mTitleMarginBottom;
                        if (i17 < i18 + i19) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c146910).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c146910).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                    if (zM24766) {
                        C14699 c146913 = (C14699) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c146913).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zM24767) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                    if (zM24766) {
                        C14699 c146914 = (C14699) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c146914).bottomMargin;
                    } else {
                        i9 = iMax2;
                    }
                    if (zM24767 != 0) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                m24754(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i20 = 0; i20 < size; i20++) {
                    iMax3 = m24749((View) this.mTempViews.get(i20), iMax3, iArr, i7);
                }
                i21 = i7;
                m24754(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i22 = 0; i22 < size2; i22++) {
                    iMin = m24759((View) this.mTempViews.get(i22), iMin, iArr, i21);
                }
                m24754(this.mTempViews, 1);
                int iM24750 = m24750(this.mTempViews, iArr);
                i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM24750 / 2);
                i24 = iM24750 + i23;
                if (i23 >= iMax3) {
                    if (i24 > iMin) {
                        iMax3 = i23 - (i24 - iMin);
                    } else {
                        iMax3 = i23;
                    }
                }
                size3 = this.mTempViews.size();
                while (i11 < size3) {
                    iMax3 = m24749((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                    i11++;
                }
                this.mTempViews.clear();
            }
            iMax = iMax;
            i7 = iMin2;
            i5 = paddingLeft;
            i11 = 0;
            iMax3 = iMax;
            m24754(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i20 < size) {
                iMax3 = m24749((View) this.mTempViews.get(i20), iMax3, iArr, i7);
            }
            i21 = i7;
            m24754(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i22 < size2) {
                iMin = m24759((View) this.mTempViews.get(i22), iMin, iArr, i21);
            }
            m24754(this.mTempViews, 1);
            int iM24751 = m24750(this.mTempViews, iArr);
            i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM24751 / 2);
            i24 = iM24751 + i23;
            if (i23 >= iMax3) {
                if (i24 > iMin) {
                    iMax3 = i23 - (i24 - iMin);
                } else {
                    iMax3 = i23;
                }
            }
            size3 = this.mTempViews.size();
            while (i11 < size3) {
                iMax3 = m24749((View) this.mTempViews.get(i11), iMax3, iArr, i21);
                i11++;
            }
            this.mTempViews.clear();
        }
        iM24749 = paddingLeft;
        iM24759 = i25;
        if (m24766(this.mCollapseButtonView)) {
            if (z3) {
                iM24759 = m24759(this.mCollapseButtonView, iM24759, iArr, iMin2);
            } else {
                iM24749 = m24749(this.mCollapseButtonView, iM24749, iArr, iMin2);
            }
        }
        if (m24766(this.mMenuView)) {
            if (z3) {
                iM24749 = m24749(this.mMenuView, iM24749, iArr, iMin2);
            } else {
                iM24759 = m24759(this.mMenuView, iM24759, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM24749);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iM24759));
        iMax = Math.max(iM24749, currentContentInsetLeft2);
        iMin = Math.min(iM24759, i25 - currentContentInsetRight2);
        if (m24766(this.mExpandedActionView)) {
            if (z3) {
                iMin = m24759(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = m24749(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (m24766(this.mLogoView)) {
            if (z3) {
                iMin = m24759(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = m24749(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zM24766 = m24766(this.mTitleTextView);
        zM24767 = m24766(this.mSubtitleTextView);
        if (zM24766) {
            C14699 c146915 = (C14699) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c146915).topMargin + ((ViewGroup.MarginLayoutParams) c146915).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM24767) {
            C14699 c146916 = (C14699) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c146916).topMargin + ((ViewGroup.MarginLayoutParams) c146916).bottomMargin;
        }
        if (zM24766) {
            if (zM24766) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM24767) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c14699 = (C14699) textView.getLayoutParams();
            c146910 = (C14699) textView2.getLayoutParams();
            if (zM24766) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14699).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c14699).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c14699).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c146910).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c146910).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                if (zM24766) {
                    C14699 c146917 = (C14699) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c146917).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM24767) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                if (zM24766) {
                    C14699 c146918 = (C14699) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c146918).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM24767 != 0) {
                    int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
            if (zM24766) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zM24767) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            c14699 = (C14699) textView.getLayoutParams();
            c146910 = (C14699) textView2.getLayoutParams();
            if (zM24766) {
            }
            i5 = paddingLeft;
            i6 = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            i7 = iMin2;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14699).topMargin + this.mTitleMarginTop;
            } else if (i6 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) c14699).topMargin;
                i16 = this.mTitleMarginTop;
                if (iMax4 < i15 + i16) {
                    iMax4 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) c14699).bottomMargin;
                    i19 = this.mTitleMarginBottom;
                    if (i17 < i18 + i19) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) c146910).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c146910).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
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
                if (zM24766) {
                    C14699 c146919 = (C14699) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c146919).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zM24767) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
                if (zM24766) {
                    C14699 c1469110 = (C14699) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c1469110).bottomMargin;
                } else {
                    i9 = iMax2;
                }
                if (zM24767 != 0) {
                    int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C14699) this.mSubtitleTextView.getLayoutParams())).topMargin;
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
        m24754(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i20 < size) {
            iMax3 = m24749((View) this.mTempViews.get(i20), iMax3, iArr, i7);
        }
        i21 = i7;
        m24754(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i22 < size2) {
            iMin = m24759((View) this.mTempViews.get(i22), iMin, iArr, i21);
        }
        m24754(this.mTempViews, 1);
        int iM24752 = m24750(this.mTempViews, iArr);
        i23 = ((((width - i5) - paddingRight) / 2) + i5) - (iM24752 / 2);
        i24 = iM24752 + i23;
        if (i23 >= iMax3) {
            if (i24 > iMin) {
                iMax3 = i23 - (i24 - iMin);
            } else {
                iMax3 = i23;
            }
        }
        size3 = this.mTempViews.size();
        while (i11 < size3) {
            iMax3 = m24749((View) this.mTempViews.get(i11), iMax3, iArr, i21);
            i11++;
        }
        this.mTempViews.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24750(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C14699 c14699 = (C14699) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c14699).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c14699).rightMargin - i2;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24749(View view, int i, int[] iArr, int i2) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c14699).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM24747 = m24747(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM24747, iMax + measuredWidth, view.getMeasuredHeight() + iM24747);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c14699).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24759(View view, int i, int[] iArr, int i2) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c14699).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM24747 = m24747(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM24747, iMax, view.getMeasuredHeight() + iM24747);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c14699).leftMargin);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24747(View view, int i) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM24757 = m24757(c14699.f39731);
        if (iM24757 == 48) {
            return getPaddingTop() - i2;
        }
        if (iM24757 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c14699).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c14699).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c14699).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24757(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24754(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C14699 c14699 = (C14699) childAt.getLayoutParams();
                if (c14699.f44895 == 0 && m24766(childAt) && m24745(c14699.f39731) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C14699 c146910 = (C14699) childAt2.getLayoutParams();
            if (c146910.f44895 == 0 && m24766(childAt2) && m24745(c146910.f39731) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24745(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m24766(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24746(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24758(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public C14699 generateLayoutParams(AttributeSet attributeSet) {
        return new C14699(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C14699 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C14699) {
            C14699 c14699 = (C14699) layoutParams;
            C14699 c146910 = new C14699(c14699);
            c146910.f44895 = 0;
            c146910.f44895 = c14699.f44895;
            return c146910;
        }
        if (layoutParams instanceof C13267) {
            C14699 c146911 = new C14699((C13267) layoutParams);
            c146911.f44895 = 0;
            return c146911;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C14699 c146912 = new C14699(layoutParams);
            c146912.f44895 = 0;
            return c146912;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C14699 c146913 = new C14699(marginLayoutParams);
        c146913.f44895 = 0;
        ((ViewGroup.MarginLayoutParams) c146913).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c146913).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c146913).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c146913).bottomMargin = marginLayoutParams.bottomMargin;
        return c146913;
    }

    @Override // android.view.ViewGroup
    public C14699 generateDefaultLayoutParams() {
        C14699 c14699 = new C14699(-2, -2);
        c14699.f44895 = 0;
        c14699.f39731 = 8388627;
        return c14699;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C14699);
    }

    public InterfaceC0504 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C2706(this, true);
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
            if (((C14699) childAt.getLayoutParams()).f44895 != 2 && childAt != this.mMenuView) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24763(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(InterfaceC17585 interfaceC17585, InterfaceC19994 interfaceC19994) {
        this.mActionMenuPresenterCallback = interfaceC17585;
        this.mMenuBuilderCallback = interfaceC19994;
        C8788 c8788 = this.mMenuView;
        if (c8788 != null) {
            c8788.m22673(interfaceC17585, interfaceC19994);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24751() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C16382();
        }
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public C17254 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private ArrayList m24761() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m24755() {
        Menu menu = getMenu();
        ArrayList arrayListM24761 = m24761();
        this.mMenuHostHelper.m29700(menu, m24768());
        ArrayList arrayListM24762 = m24761();
        arrayListM24762.removeAll(arrayListM24761);
        this.mProvidedMenuItems = arrayListM24762;
    }

    @Override // l.InterfaceC19974
    public void addMenuProvider(InterfaceC11507 interfaceC11507) {
        this.mMenuHostHelper.m29701(interfaceC11507);
    }

    public void addMenuProvider(InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586) {
        this.mMenuHostHelper.m29702(interfaceC11507, interfaceC23586);
    }

    public void addMenuProvider(InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586, EnumC13728 enumC13728) {
        this.mMenuHostHelper.m29703(interfaceC11507, interfaceC23586, enumC13728);
    }

    @Override // l.InterfaceC19974
    public void removeMenuProvider(InterfaceC11507 interfaceC11507) {
        this.mMenuHostHelper.m29706(interfaceC11507);
    }

    public void invalidateMenu() {
        Iterator it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m24755();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM42466 = C18228.m42466(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherM42466 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C18228.m42465(new RunnableC7412(1, this));
                }
                C18228.m42467(onBackInvokedDispatcherM42466, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherM42466;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C18228.m42468(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }
}
