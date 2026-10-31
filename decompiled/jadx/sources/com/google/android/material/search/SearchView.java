package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import l.AbstractC6317;
import l.AbstractC7152;
import l.C15813;
import l.C16648;
import l.C17648;
import l.C17887;
import l.C17931;
import l.C18333;
import l.C18637;
import l.C19343;
import l.C20118;
import l.C20754;
import l.C21311;
import l.C21610;
import l.C23575;
import l.C4330;
import l.C5674;
import l.C6642;
import l.C8184;
import l.C9762;
import l.InterfaceC10551;
import l.InterfaceC16610;
import l.InterfaceC23872;
import l.RunnableC20699;
import l.RunnableC20760;
import l.RunnableC3505;
import l.ViewOnClickListenerC10893;
import l.ViewOnClickListenerC14054;
import l.ViewOnClickListenerC3658;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements InterfaceC10551, MaterialBackHandler {
    public static final int DEF_STYLE_RES = C18637.f57940;
    public static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    public boolean animatedMenuItems;
    public boolean animatedNavigationIcon;
    public boolean autoShowKeyboard;
    public final boolean backHandlingEnabled;
    public final MaterialBackOrchestrator backOrchestrator;
    public final int backgroundColor;
    public final View backgroundView;
    public Map childImportantForAccessibilityMap;
    public final ImageButton clearButton;
    public final TouchObserverFrameLayout contentContainer;
    public TransitionState currentTransitionState;
    public final View divider;
    public final C9762 dummyToolbar;
    public final EditText editText;
    public final ElevationOverlayProvider elevationOverlayProvider;
    public final FrameLayout headerContainer;
    public final boolean layoutInflated;
    public final ClippableRoundedCornerLayout rootView;
    public final View scrim;
    public SearchBar searchBar;
    public final TextView searchPrefix;
    public final SearchViewAnimationHelper searchViewAnimationHelper;
    public int softInputMode;
    public final View statusBarSpacer;
    public boolean statusBarSpacerEnabledOverride;
    public final MaterialToolbar toolbar;
    public final FrameLayout toolbarContainer;
    public final Set transitionListeners;
    public boolean useWindowInsetsController;

    public interface TransitionListener {
        void onStateChanged(SearchView searchView, TransitionState transitionState, TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55092);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C19343.f60902, i, i2, new int[0]);
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(C19343.f61699, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C19343.f61677, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C19343.f61062, -1);
        String string = typedArrayObtainStyledAttributes.getString(C19343.f61168);
        String string2 = typedArrayObtainStyledAttributes.getString(C19343.f61965);
        String string3 = typedArrayObtainStyledAttributes.getString(C19343.f61570);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C19343.f61040, false);
        this.animatedNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(C19343.f61752, true);
        this.animatedMenuItems = typedArrayObtainStyledAttributes.getBoolean(C19343.f61805, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C19343.f62103, false);
        this.autoShowKeyboard = typedArrayObtainStyledAttributes.getBoolean(C19343.f61592, true);
        this.backHandlingEnabled = typedArrayObtainStyledAttributes.getBoolean(C19343.f61274, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(C15813.f48831, this);
        this.layoutInflated = true;
        this.scrim = findViewById(C20754.f67175);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(C20754.f67211);
        this.backgroundView = findViewById(C20754.f67163);
        this.statusBarSpacer = findViewById(C20754.f66894);
        this.headerContainer = (FrameLayout) findViewById(C20754.f67199);
        this.toolbarContainer = (FrameLayout) findViewById(C20754.f67045);
        this.toolbar = (MaterialToolbar) findViewById(C20754.f67056);
        this.dummyToolbar = (C9762) findViewById(C20754.f66976);
        this.searchPrefix = (TextView) findViewById(C20754.f66918);
        this.editText = (EditText) findViewById(C20754.f67091);
        this.clearButton = (ImageButton) findViewById(C20754.f66846);
        this.divider = findViewById(C20754.f66858);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(C20754.f66930);
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z, z2);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // l.InterfaceC10551
    public AbstractC6317 getBehavior() {
        return new Behavior();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C20118 c20118) {
        if (isHiddenOrHiding() || this.searchBar == null) {
            return;
        }
        this.searchViewAnimationHelper.startBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C20118 c20118) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.updateBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        C20118 c20118OnHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT >= 34 && this.searchBar != null && c20118OnHandleBackInvoked != null) {
            this.searchViewAnimationHelper.finishBackProgress();
        } else {
            hide();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.cancelBackProgress();
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private void setUpRootView() {
        this.rootView.setOnTouchListener(new SearchView$$ExternalSyntheticLambda6());
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f));
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(C23575.f75879);
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpEditText(int i, String str, String str2) {
        if (i != -1) {
            C4330.m12997(this.editText, i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpBackButton(boolean z, boolean z2) {
        if (z2) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new ViewOnClickListenerC10893(7, this));
        if (z) {
            C5674 c5674 = new C5674(getContext());
            c5674.m15982(MaterialColors.getColor(this, C17931.f55479));
            this.toolbar.setNavigationIcon(c5674);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new ViewOnClickListenerC14054(3, this));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.lambda$setUpContentOnTouchListener$3(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        clearFocusAndHideKeyboard();
        return false;
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableM21684 = C8184.m21684(C21311.m48345(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            C8184.m21683(drawableM21684, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), drawableM21684));
        updateNavigationIconProgressIfNeeded();
    }

    private boolean isNavigationIconDrawerArrowDrawable(C9762 c9762) {
        return C8184.m21686(c9762.getNavigationIcon()) instanceof C5674;
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new C17887(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C21610 lambda$setUpToolbarInsetListener$4(View view, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        this.toolbar.setPadding(c21610.m48824() + (zIsLayoutRtl ? relativePadding.end : relativePadding.start), relativePadding.top, c21610.m48834() + (zIsLayoutRtl ? relativePadding.start : relativePadding.end), relativePadding.bottom);
        return c21610;
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        C17648.m41310(this.statusBarSpacer, new C16648(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C21610 lambda$setUpStatusBarSpacerInsetListener$5(View view, C21610 c21610) {
        int iM48826 = c21610.m48826();
        setUpStatusBarSpacer(iM48826);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(iM48826 > 0);
        }
        return c21610;
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        C17648.m41310(this.divider, new InterfaceC16610() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda0
            @Override // l.InterfaceC16610
            public final C21610 onApplyWindowInsets(View view, C21610 c21610) {
                return SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i, i2, view, c21610);
            }
        });
    }

    public static /* synthetic */ C21610 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, C21610 c21610) {
        marginLayoutParams.leftMargin = c21610.m48824() + i;
        marginLayoutParams.rightMargin = c21610.m48834() + i2;
        return c21610;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new ViewOnClickListenerC3658(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new RunnableC3505(3, this));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    public void addHeaderView(View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void removeHeaderView(View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    public void removeTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void inflateMenu(int i) {
        this.toolbar.inflateMenu(i);
    }

    public void setOnMenuItemClickListener(InterfaceC23872 interfaceC23872) {
        this.toolbar.setOnMenuItemClickListener(interfaceC23872);
    }

    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    public C9762 getToolbar() {
        return this.toolbar;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public Editable getText() {
        return this.editText.getText();
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setText(int i) {
        this.editText.setText(i);
    }

    public void clearText() {
        this.editText.setText("");
    }

    public CharSequence getHint() {
        return this.editText.getHint();
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setHint(int i) {
        this.editText.setHint(i);
    }

    public int getSoftInputMode() {
        return this.softInputMode;
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.statusBarSpacer.setVisibility(z ? 0 : 8);
    }

    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    public void setTransitionState(TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    private void setTransitionState(TransitionState transitionState, boolean z) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        updateListeningForBackCallbacks(transitionState);
    }

    private void updateListeningForBackCallbacks(TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        this.searchViewAnimationHelper.hide();
    }

    public void setVisible(boolean z) {
        boolean z2 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z ? TransitionState.SHOWN : TransitionState.HIDDEN, z2 != z);
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable drawableM21686 = C8184.m21686(navigationIconButton.getDrawable());
        if (drawableM21686 instanceof C5674) {
            ((C5674) drawableM21686).m15981(i);
        }
        if (drawableM21686 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableM21686).setProgress(i);
        }
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new RunnableC20760(7, this), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new RunnableC20699(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (z) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
        int iIntValue;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z);
                } else {
                    if (!z) {
                        Map map = this.childImportantForAccessibilityMap;
                        if (map != null && map.containsKey(childAt)) {
                            iIntValue = ((Integer) this.childImportantForAccessibilityMap.get(childAt)).intValue();
                            int i2 = C17648.f53953;
                        }
                    } else {
                        this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int i3 = C17648.f53953;
                        iIntValue = 4;
                    }
                    childAt.setImportantForAccessibility(iIntValue);
                }
            }
        }
    }

    public int getDefaultNavigationIconResource() {
        return C6642.f20525;
    }

    public class Behavior extends AbstractC6317 {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // l.AbstractC6317
        public boolean onDependentViewChanged(C18333 c18333, SearchView searchView, View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    public class SavedState extends AbstractC7152 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.search.SearchView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public String text;
        public int visibility;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }
    }
}
