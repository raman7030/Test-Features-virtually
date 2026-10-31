.class public Lcom/google/android/material/search/SearchView;
.super Landroid/widget/FrameLayout;
.source "SearchView.java"

# interfaces
.implements Ll/ۤ᩸;
.implements Lcom/google/android/material/motion/MaterialBackHandler;


# static fields
.field public static final DEF_STYLE_RES:I

.field public static final TALKBACK_FOCUS_CHANGE_DELAY_MS:J = 0x64L


# instance fields
.field public animatedMenuItems:Z

.field public animatedNavigationIcon:Z

.field public autoShowKeyboard:Z

.field public final backHandlingEnabled:Z

.field public final backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

.field public final backgroundColor:I

.field public final backgroundView:Landroid/view/View;

.field public childImportantForAccessibilityMap:Ljava/util/Map;

.field public final clearButton:Landroid/widget/ImageButton;

.field public final contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

.field public currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

.field public final divider:Landroid/view/View;

.field public final dummyToolbar:Ll/ۢᩴ;

.field public final editText:Landroid/widget/EditText;

.field public final elevationOverlayProvider:Lcom/google/android/material/elevation/ElevationOverlayProvider;

.field public final headerContainer:Landroid/widget/FrameLayout;

.field public final layoutInflated:Z

.field public final rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

.field public final scrim:Landroid/view/View;

.field public searchBar:Lcom/google/android/material/search/SearchBar;

.field public final searchPrefix:Landroid/widget/TextView;

.field public final searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

.field public softInputMode:I

.field public final statusBarSpacer:Landroid/view/View;

.field public statusBarSpacerEnabledOverride:Z

.field public final toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

.field public final toolbarContainer:Landroid/widget/FrameLayout;

.field public final transitionListeners:Ljava/util/Set;

.field public useWindowInsetsController:Z


# direct methods
.method public static synthetic $r8$lambda$-fNNeett_Cm8kBqRqI1578N7AFg(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->lambda$setupWithSearchBar$7(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$TmMG7_lw4sF4o7J33Ph3cDNw2tw(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/material/search/SearchView;->lambda$setUpDividerInsetListener$6(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$VkfrNBgEfX_BB8xohYFiurOtNK8(Lcom/google/android/material/search/SearchView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/search/SearchView;->lambda$setUpContentOnTouchListener$3(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$bnspkZFwTlQzgGY9VlFfpkzFBmQ(Lcom/google/android/material/search/SearchView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->lambda$clearFocusAndHideKeyboard$9()V

    return-void
.end method

.method public static synthetic $r8$lambda$dreB4TGol5yqs3ptMQ4DkiyTx48(Lcom/google/android/material/search/SearchView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->lambda$requestFocusAndShowKeyboard$8()V

    return-void
.end method

.method public static synthetic $r8$lambda$jEPC5P2snL5cxZFNR2VSY2U-D-U(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->lambda$setUpClearButton$2(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$kajH3YISJpjEqc1frQhPp6eys-c(Lcom/google/android/material/search/SearchView;Landroid/view/View;Ll/᩸ܰ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/᩸ܰ;
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/search/SearchView;->lambda$setUpToolbarInsetListener$4(Landroid/view/View;Ll/᩸ܰ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lg1Kf9luTqvuNNQuLqehlYyGOi8(Lcom/google/android/material/search/SearchView;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/search/SearchView;->lambda$setUpStatusBarSpacerInsetListener$5(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$m5jol66nZ-NnGCtW5-81117_ung(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lcom/google/android/material/search/SearchView;->lambda$setUpRootView$0(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$z6qQrR1V8KE1EVKGxNJ2AT4K2RQ(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->lambda$setUpBackButton$1(Landroid/view/View;)V

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 1

    .line 137
    sget v0, Ll/ᩴ۠ܺ;->ۖ۫:I

    sput v0, Lcom/google/android/material/search/SearchView;->DEF_STYLE_RES:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 175
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 179
    sget v0, Ll/ᩳ۠ܺ;->ۜܶ:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 183
    sget v4, Lcom/google/android/material/search/SearchView;->DEF_STYLE_RES:I

    invoke-static {p1, p2, p3, v4}, Lcom/google/android/material/theme/overlay/MaterialThemeOverlay;->wrap(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 156
    new-instance p1, Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-direct {p1, p0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    .line 161
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->transitionListeners:Ljava/util/Set;

    const/16 p1, 0x10

    .line 164
    iput p1, p0, Lcom/google/android/material/search/SearchView;->softInputMode:I

    .line 171
    sget-object p1, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 185
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 187
    sget-object v2, Ll/᩵۠ܺ;->֨ۜ֫:[I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v0, p1

    move-object v1, p2

    move v3, p3

    .line 188
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/ThemeEnforcement;->obtainStyledAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 191
    sget p3, Ll/᩵۠ܺ;->ۨۜ֫:I

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/search/SearchView;->backgroundColor:I

    .line 192
    sget p3, Ll/᩵۠ܺ;->ۧ᩷֫:I

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    .line 193
    sget v1, Ll/᩵۠ܺ;->ۗۜ֫:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 194
    sget v1, Ll/᩵۠ܺ;->ۙۜ֫:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 195
    sget v2, Ll/᩵۠ܺ;->ܶۜ֫:I

    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 196
    sget v3, Ll/᩵۠ܺ;->ۢ᩷֫:I

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 197
    sget v4, Ll/᩵۠ܺ;->ۖ᩷֫:I

    .line 198
    invoke-virtual {p2, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 199
    sget v5, Ll/᩵۠ܺ;->۫ۜ֫:I

    const/4 v7, 0x1

    invoke-virtual {p2, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Lcom/google/android/material/search/SearchView;->animatedNavigationIcon:Z

    .line 200
    sget v5, Ll/᩵۠ܺ;->۬ۜ֫:I

    invoke-virtual {p2, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Lcom/google/android/material/search/SearchView;->animatedMenuItems:Z

    .line 201
    sget v5, Ll/᩵۠ܺ;->ܽ᩷֫:I

    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 202
    sget v6, Ll/᩵۠ܺ;->ۤۜ֫:I

    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/google/android/material/search/SearchView;->autoShowKeyboard:Z

    .line 203
    sget v6, Ll/᩵۠ܺ;->ۛۜ֫:I

    invoke-virtual {p2, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/google/android/material/search/SearchView;->backHandlingEnabled:Z

    .line 205
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 207
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v6, Ll/ܺ۠ܺ;->ۤۧ:I

    invoke-virtual {p2, v6, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 208
    iput-boolean v7, p0, Lcom/google/android/material/search/SearchView;->layoutInflated:Z

    .line 210
    sget p2, Ll/᩷۠ܺ;->᩶᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->scrim:Landroid/view/View;

    .line 211
    sget p2, Ll/᩷۠ܺ;->᩹᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 212
    sget p2, Ll/᩷۠ܺ;->᩵᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->backgroundView:Landroid/view/View;

    .line 213
    sget p2, Ll/᩷۠ܺ;->ۗ᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    .line 214
    sget p2, Ll/᩷۠ܺ;->᩸᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    .line 215
    sget p2, Ll/᩷۠ܺ;->۫᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->toolbarContainer:Landroid/widget/FrameLayout;

    .line 216
    sget p2, Ll/᩷۠ܺ;->۬᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 217
    sget p2, Ll/᩷۠ܺ;->۠᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ۢᩴ;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->dummyToolbar:Ll/ۢᩴ;

    .line 218
    sget p2, Ll/᩷۠ܺ;->ۙ᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    .line 219
    sget p2, Ll/᩷۠ܺ;->ܶ᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    .line 220
    sget p2, Ll/᩷۠ܺ;->֡᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->clearButton:Landroid/widget/ImageButton;

    .line 221
    sget p2, Ll/᩷۠ܺ;->֨᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->divider:Landroid/view/View;

    .line 222
    sget p2, Ll/᩷۠ܺ;->ۚ᩻:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/internal/TouchObserverFrameLayout;

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 224
    new-instance p2, Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-direct {p2, p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;-><init>(Lcom/google/android/material/search/SearchView;)V

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    .line 225
    new-instance p2, Lcom/google/android/material/elevation/ElevationOverlayProvider;

    invoke-direct {p2, p1}, Lcom/google/android/material/elevation/ElevationOverlayProvider;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/material/search/SearchView;->elevationOverlayProvider:Lcom/google/android/material/elevation/ElevationOverlayProvider;

    .line 227
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpRootView()V

    .line 228
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay()V

    .line 229
    invoke-direct {p0, p3}, Lcom/google/android/material/search/SearchView;->setUpHeaderLayout(I)V

    .line 230
    invoke-virtual {p0, v3}, Lcom/google/android/material/search/SearchView;->setSearchPrefixText(Ljava/lang/CharSequence;)V

    .line 231
    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/material/search/SearchView;->setUpEditText(ILjava/lang/String;Ljava/lang/String;)V

    .line 232
    invoke-direct {p0, v4, v5}, Lcom/google/android/material/search/SearchView;->setUpBackButton(ZZ)V

    .line 233
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpClearButton()V

    .line 234
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpContentOnTouchListener()V

    .line 235
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpInsetListeners()V

    return-void
.end method

.method private getActivityWindow()Landroid/view/Window;
    .locals 1

    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/internal/ContextUtils;->getActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 331
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method private getOverlayElevation()F
    .locals 2

    .line 353
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_0

    .line 354
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getCompatElevation()F

    move-result v0

    return v0

    .line 356
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Ll/᩻۠ܺ;->ۜۘ:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    return v0
.end method

.method private getStatusBarHeight()I
    .locals 4

    .line 437
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "dimen"

    const-string v2, "android"

    const-string v3, "status_bar_height"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 439
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isHiddenOrHiding()Z
    .locals 2

    .line 324
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->HIDING:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private isNavigationIconDrawerArrowDrawable(Ll/ۢᩴ;)Z
    .locals 0

    .line 475
    invoke-virtual {p1}, Ll/ۢᩴ;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/۠۬;->ܿ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of p1, p1, Ll/ۚ᩻;

    return p1
.end method

.method private synthetic lambda$clearFocusAndHideKeyboard$9()V
    .locals 2

    .line 921
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 922
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_0

    .line 923
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 925
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/google/android/material/search/SearchView;->useWindowInsetsController:Z

    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->hideKeyboard(Landroid/view/View;Z)V

    return-void
.end method

.method private synthetic lambda$requestFocusAndShowKeyboard$8()V
    .locals 2

    .line 908
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 910
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 912
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/google/android/material/search/SearchView;->useWindowInsetsController:Z

    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->showKeyboard(Landroid/view/View;Z)V

    return-void
.end method

.method private synthetic lambda$setUpBackButton$1(Landroid/view/View;)V
    .locals 0

    .line 382
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->hide()V

    return-void
.end method

.method private synthetic lambda$setUpClearButton$2(Landroid/view/View;)V
    .locals 0

    .line 394
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->clearText()V

    .line 395
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->requestFocusAndShowKeyboardIfNeeded()V

    return-void
.end method

.method private synthetic lambda$setUpContentOnTouchListener$3(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 417
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 418
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->clearFocusAndHideKeyboard()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic lambda$setUpDividerInsetListener$6(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 0

    .line 533
    invoke-virtual {p4}, Ll/᩸ܰ;->ۜ()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 534
    invoke-virtual {p4}, Ll/᩸ܰ;->᩷()I

    move-result p1

    add-int/2addr p1, p2

    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    return-object p4
.end method

.method public static synthetic lambda$setUpRootView$0(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private synthetic lambda$setUpStatusBarSpacerInsetListener$5(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 1

    .line 517
    invoke-virtual {p2}, Ll/᩸ܰ;->ۢ()I

    move-result p1

    .line 518
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setUpStatusBarSpacer(I)V

    .line 519
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacerEnabledOverride:Z

    if-nez v0, :cond_1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 520
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setStatusBarSpacerEnabledInternal(Z)V

    :cond_1
    return-object p2
.end method

.method private synthetic lambda$setUpToolbarInsetListener$4(Landroid/view/View;Ll/᩸ܰ;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Ll/᩸ܰ;
    .locals 4

    .line 499
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-static {p1}, Lcom/google/android/material/internal/ViewUtils;->isLayoutRtl(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 500
    iget v0, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->end:I

    goto :goto_0

    :cond_0
    iget v0, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->start:I

    :goto_0
    if-eqz p1, :cond_1

    .line 501
    iget p1, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->start:I

    goto :goto_1

    :cond_1
    iget p1, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->end:I

    .line 502
    :goto_1
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 503
    invoke-virtual {p2}, Ll/᩸ܰ;->ۜ()I

    move-result v2

    add-int/2addr v2, v0

    iget v0, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->top:I

    .line 504
    invoke-virtual {p2}, Ll/᩸ܰ;->᩷()I

    move-result v3

    add-int/2addr v3, p1

    iget p1, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->bottom:I

    .line 502
    invoke-virtual {v1, v2, v0, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method private synthetic lambda$setupWithSearchBar$7(Landroid/view/View;)V
    .locals 0

    .line 554
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->show()V

    return-void
.end method

.method private setStatusBarSpacerEnabledInternal(Z)V
    .locals 1

    .line 784
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private setTransitionState(Lcom/google/android/material/search/SearchView$TransitionState;Z)V
    .locals 2

    .line 799
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_2

    .line 804
    sget-object p2, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWN:Lcom/google/android/material/search/SearchView$TransitionState;

    if-ne p1, p2, :cond_1

    const/4 p2, 0x1

    .line 805
    invoke-virtual {p0, p2}, Lcom/google/android/material/search/SearchView;->setModalForAccessibility(Z)V

    goto :goto_0

    .line 806
    :cond_1
    sget-object p2, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    if-ne p1, p2, :cond_2

    const/4 p2, 0x0

    .line 807
    invoke-virtual {p0, p2}, Lcom/google/android/material/search/SearchView;->setModalForAccessibility(Z)V

    .line 811
    :cond_2
    :goto_0
    iget-object p2, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 812
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 813
    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->transitionListeners:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 814
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/search/SearchView$TransitionListener;

    .line 815
    invoke-interface {v1, p0, p2, p1}, Lcom/google/android/material/search/SearchView$TransitionListener;->onStateChanged(Lcom/google/android/material/search/SearchView;Lcom/google/android/material/search/SearchView$TransitionState;Lcom/google/android/material/search/SearchView$TransitionState;)V

    goto :goto_1

    .line 818
    :cond_3
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->updateListeningForBackCallbacks(Lcom/google/android/material/search/SearchView$TransitionState;)V

    return-void
.end method

.method private setUpBackButton(ZZ)V
    .locals 2

    if-eqz p2, :cond_0

    .line 378
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 382
    :cond_0
    iget-object p2, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    new-instance v0, Ll/ۧۡۡ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_1

    .line 385
    new-instance p1, Ll/ۚ᩻;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۚ᩻;-><init>(Landroid/content/Context;)V

    .line 386
    sget p2, Ll/ᩳ۠ܺ;->ܳ᩻:I

    invoke-static {p0, p2}, Lcom/google/android/material/color/MaterialColors;->getColor(Landroid/view/View;I)I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۚ᩻;->֫(I)V

    .line 387
    iget-object p2, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {p2, p1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method private setUpBackgroundViewElevationOverlay()V
    .locals 1

    .line 340
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->getOverlayElevation()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay(F)V

    return-void
.end method

.method private setUpBackgroundViewElevationOverlay(F)V
    .locals 2

    .line 344
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->elevationOverlayProvider:Lcom/google/android/material/elevation/ElevationOverlayProvider;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->backgroundView:Landroid/view/View;

    if-nez v1, :cond_0

    goto :goto_0

    .line 347
    :cond_0
    iget v1, p0, Lcom/google/android/material/search/SearchView;->backgroundColor:I

    .line 348
    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/elevation/ElevationOverlayProvider;->compositeOverlayIfNeeded(IF)I

    move-result p1

    .line 349
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->backgroundView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private setUpClearButton()V
    .locals 3

    .line 392
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->clearButton:Landroid/widget/ImageButton;

    new-instance v1, Ll/ܰ᩶᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ܰ᩶᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    new-instance v1, Lcom/google/android/material/search/SearchView$1;

    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchView$1;-><init>(Lcom/google/android/material/search/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private setUpContentOnTouchListener()V
    .locals 2

    .line 415
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    new-instance v1, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda7;

    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda7;-><init>(Lcom/google/android/material/search/SearchView;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/TouchObserverFrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private setUpDividerInsetListener()V
    .locals 5

    .line 527
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->divider:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 528
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 529
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 530
    iget-object v3, p0, Lcom/google/android/material/search/SearchView;->divider:Landroid/view/View;

    new-instance v4, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0, v1, v2}, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda0;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;II)V

    invoke-static {v3, v4}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    return-void
.end method

.method private setUpEditText(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 370
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-static {v0, p1}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    .line 372
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setUpHeaderLayout(I)V
    .locals 3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 364
    invoke-virtual {p0, p1}, Lcom/google/android/material/search/SearchView;->addHeaderView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private setUpInsetListeners()V
    .locals 0

    .line 490
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpToolbarInsetListener()V

    .line 491
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpDividerInsetListener()V

    .line 492
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpStatusBarSpacerInsetListener()V

    return-void
.end method

.method private setUpRootView()V
    .locals 2

    .line 336
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    new-instance v1, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda6;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private setUpStatusBarSpacer(I)V
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v0, p1, :cond_0

    .line 426
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 427
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method private setUpStatusBarSpacerInsetListener()V
    .locals 3

    .line 511
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->getStatusBarHeight()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchView;->setUpStatusBarSpacer(I)V

    .line 514
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacer:Landroid/view/View;

    new-instance v1, Ll/ܽ۫᩷;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    return-void
.end method

.method private setUpToolbarInsetListener()V
    .locals 2

    .line 496
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    new-instance v1, Ll/ᩳۜۢ;

    invoke-direct {v1, p0}, Ll/ᩳۜۢ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->doOnApplyWindowInsets(Landroid/view/View;Lcom/google/android/material/internal/ViewUtils$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method private updateChildImportantForAccessibility(Landroid/view/ViewGroup;Z)V
    .locals 4

    const/4 v0, 0x0

    .line 964
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 965
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, p0, :cond_0

    goto :goto_2

    .line 970
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 972
    check-cast v1, Landroid/view/ViewGroup;

    invoke-direct {p0, v1, p2}, Lcom/google/android/material/search/SearchView;->updateChildImportantForAccessibility(Landroid/view/ViewGroup;Z)V

    goto :goto_2

    :cond_1
    if-nez p2, :cond_2

    .line 977
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->childImportantForAccessibilityMap:Ljava/util/Map;

    if-eqz v2, :cond_3

    .line 978
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 980
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->childImportantForAccessibilityMap:Ljava/util/Map;

    .line 981
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 980
    sget v3, Ll/ܿ᩺;->֫:I

    goto :goto_1

    .line 986
    :cond_2
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->childImportantForAccessibilityMap:Ljava/util/Map;

    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    sget v2, Ll/ܿ᩺;->֫:I

    const/4 v2, 0x4

    .line 1427
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private updateListeningForBackCallbacks(Lcom/google/android/material/search/SearchView$TransitionState;)V
    .locals 1

    .line 824
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->backHandlingEnabled:Z

    if-eqz v0, :cond_1

    .line 825
    sget-object v0, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 826
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-virtual {p1}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->startListeningForBackCallbacks()V

    return-void

    .line 827
    :cond_0
    sget-object v0, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 828
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-virtual {p1}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->stopListeningForBackCallbacks()V

    :cond_1
    return-void
.end method

.method private updateNavigationIconIfNeeded()V
    .locals 4

    .line 450
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    if-nez v0, :cond_0

    goto :goto_0

    .line 454
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchView;->isNavigationIconDrawerArrowDrawable(Ll/ۢᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 458
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->getDefaultNavigationIconResource()I

    move-result v0

    .line 459
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-nez v1, :cond_2

    .line 460
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v1, v0}, Ll/ۢᩴ;->setNavigationIcon(I)V

    return-void

    .line 464
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 463
    invoke-static {v0}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 465
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v1}, Lcom/google/android/material/appbar/MaterialToolbar;->getNavigationIconTint()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 466
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v1}, Lcom/google/android/material/appbar/MaterialToolbar;->getNavigationIconTint()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;I)V

    .line 468
    :cond_3
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    new-instance v2, Lcom/google/android/material/internal/FadeThroughDrawable;

    iget-object v3, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 469
    invoke-virtual {v3}, Ll/ۢᩴ;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/google/android/material/internal/FadeThroughDrawable;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 468
    invoke-virtual {v1, v2}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 470
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->updateNavigationIconProgressIfNeeded()V

    return-void
.end method

.method private updateNavigationIconProgressIfNeeded()V
    .locals 4

    .line 878
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-static {v0}, Lcom/google/android/material/internal/ToolbarUtils;->getNavigationIconButton(Ll/ۢᩴ;)Landroid/widget/ImageButton;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 883
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 884
    :goto_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/۠۬;->ܿ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 885
    instance-of v2, v0, Ll/ۚ᩻;

    if-eqz v2, :cond_2

    .line 886
    move-object v2, v0

    check-cast v2, Ll/ۚ᩻;

    int-to-float v3, v1

    invoke-virtual {v2, v3}, Ll/ۚ᩻;->֫(F)V

    .line 888
    :cond_2
    instance-of v2, v0, Lcom/google/android/material/internal/FadeThroughDrawable;

    if-eqz v2, :cond_3

    .line 889
    check-cast v0, Lcom/google/android/material/internal/FadeThroughDrawable;

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/FadeThroughDrawable;->setProgress(F)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public addHeaderView(Landroid/view/View;)V
    .locals 1

    .line 578
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 579
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public addTransitionListener(Lcom/google/android/material/search/SearchView$TransitionListener;)V
    .locals 1

    .line 660
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->transitionListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 240
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->layoutInflated:Z

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 243
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public cancelBackProgress()V
    .locals 2

    .line 310
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->isHiddenOrHiding()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->cancelBackProgress()V

    :cond_1
    :goto_0
    return-void
.end method

.method public clearFocusAndHideKeyboard()V
    .locals 3

    .line 919
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    new-instance v1, Ll/᩷ۛ᩻;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public clearText()V
    .locals 2

    .line 729
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getBackHelper()Lcom/google/android/material/motion/MaterialMainContainerBackHelper;
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getBackHelper()Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    move-result-object v0

    return-object v0
.end method

.method public getBehavior()Ll/ۛ᩸;
    .locals 1

    .line 271
    new-instance v0, Lcom/google/android/material/search/SearchView$Behavior;

    invoke-direct {v0}, Lcom/google/android/material/search/SearchView$Behavior;-><init>()V

    return-object v0
.end method

.method public getCurrentTransitionState()Lcom/google/android/material/search/SearchView$TransitionState;
    .locals 1

    .line 790
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    return-object v0
.end method

.method public getDefaultNavigationIconResource()I
    .locals 1

    .line 1003
    sget v0, Ll/ۜ۠ܺ;->۬ۧ:I

    return v0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 706
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 1

    .line 735
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getSearchPrefix()Landroid/widget/TextView;
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    return-object v0
.end method

.method public getSearchPrefixText()Ljava/lang/CharSequence;
    .locals 1

    .line 694
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getSoftInputMode()I
    .locals 1

    .line 751
    iget v0, p0, Lcom/google/android/material/search/SearchView;->softInputMode:I

    return v0
.end method

.method public getText()Landroid/text/Editable;
    .locals 1

    .line 713
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getToolbar()Ll/ۢᩴ;
    .locals 1

    .line 700
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    return-object v0
.end method

.method public handleBackInvoked()V
    .locals 3

    .line 294
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->isHiddenOrHiding()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->onHandleBackInvoked()Ll/᩶ۧ;

    move-result-object v0

    .line 299
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->finishBackProgress()V

    return-void

    .line 304
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->hide()V

    return-void
.end method

.method public hide()V
    .locals 2

    .line 860
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->HIDING:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 861
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 864
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->hide()Landroid/animation/AnimatorSet;

    :cond_1
    :goto_0
    return-void
.end method

.method public inflateMenu(I)V
    .locals 1

    .line 670
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v0, p1}, Lcom/google/android/material/appbar/MaterialToolbar;->inflateMenu(I)V

    return-void
.end method

.method public isAdjustNothingSoftInputMode()Z
    .locals 2

    .line 930
    iget v0, p0, Lcom/google/android/material/search/SearchView;->softInputMode:I

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isAnimatedNavigationIcon()Z
    .locals 1

    .line 609
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->animatedNavigationIcon:Z

    return v0
.end method

.method public isAutoShowKeyboard()Z
    .locals 1

    .line 635
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->autoShowKeyboard:Z

    return v0
.end method

.method public isMenuItemsAnimated()Z
    .locals 1

    .line 625
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->animatedMenuItems:Z

    return v0
.end method

.method public isSetupWithSearchBar()Z
    .locals 1

    .line 541
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isShowing()Z
    .locals 2

    .line 835
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWING:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 836
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isUseWindowInsetsController()Z
    .locals 1

    .line 655
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->useWindowInsetsController:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 263
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 265
    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapeUtils;->setParentAbsoluteElevation(Landroid/view/View;)V

    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    .line 249
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 251
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->updateSoftInputMode()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1055
    instance-of v0, p1, Lcom/google/android/material/search/SearchView$SavedState;

    if-nez v0, :cond_0

    .line 1056
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1060
    :cond_0
    check-cast p1, Lcom/google/android/material/search/SearchView$SavedState;

    .line 1061
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1062
    iget-object v0, p1, Lcom/google/android/material/search/SearchView$SavedState;->text:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/material/search/SearchView;->setText(Ljava/lang/CharSequence;)V

    .line 1063
    iget p1, p1, Lcom/google/android/material/search/SearchView$SavedState;->visibility:I

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/search/SearchView;->setVisible(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1046
    new-instance v0, Lcom/google/android/material/search/SearchView$SavedState;

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/material/search/SearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1047
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->getText()Landroid/text/Editable;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 1048
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iput-object v1, v0, Lcom/google/android/material/search/SearchView$SavedState;->text:Ljava/lang/String;

    .line 1049
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    iput v1, v0, Lcom/google/android/material/search/SearchView$SavedState;->visibility:I

    return-object v0
.end method

.method public removeAllHeaderViews()V
    .locals 2

    .line 592
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 593
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public removeHeaderView(Landroid/view/View;)V
    .locals 1

    .line 584
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 585
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-nez p1, :cond_0

    .line 586
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public removeTransitionListener(Lcom/google/android/material/search/SearchView$TransitionListener;)V
    .locals 1

    .line 665
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->transitionListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public requestFocusAndShowKeyboard()V
    .locals 4

    .line 906
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    new-instance v1, Ll/᩷۠᩷;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public requestFocusAndShowKeyboardIfNeeded()V
    .locals 1

    .line 898
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->autoShowKeyboard:Z

    if-eqz v0, :cond_0

    .line 899
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->requestFocusAndShowKeyboard()V

    :cond_0
    return-void
.end method

.method public setAnimatedNavigationIcon(Z)V
    .locals 0

    .line 601
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->animatedNavigationIcon:Z

    return-void
.end method

.method public setAutoShowKeyboard(Z)V
    .locals 0

    .line 630
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->autoShowKeyboard:Z

    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 257
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 258
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay(F)V

    return-void
.end method

.method public setHint(I)V
    .locals 1

    .line 745
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(I)V

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 740
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setMenuItemsAnimated(Z)V
    .locals 0

    .line 617
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->animatedMenuItems:Z

    return-void
.end method

.method public setModalForAccessibility(Z)V
    .locals 3

    .line 938
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 941
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/material/search/SearchView;->childImportantForAccessibilityMap:Ljava/util/Map;

    .line 943
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/google/android/material/search/SearchView;->updateChildImportantForAccessibility(Landroid/view/ViewGroup;Z)V

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 947
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->childImportantForAccessibilityMap:Ljava/util/Map;

    :cond_1
    return-void
.end method

.method public setOnMenuItemClickListener(Ll/᩻ᩴ;)V
    .locals 1

    .line 676
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v0, p1}, Ll/ۢᩴ;->setOnMenuItemClickListener(Ll/᩻ᩴ;)V

    return-void
.end method

.method public setSearchPrefixText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 687
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 688
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setStatusBarSpacerEnabled(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 779
    iput-boolean v0, p0, Lcom/google/android/material/search/SearchView;->statusBarSpacerEnabledOverride:Z

    .line 780
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setStatusBarSpacerEnabledInternal(Z)V

    return-void
.end method

.method public setText(I)V
    .locals 1

    .line 724
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setToolbarTouchscreenBlocksFocus(Z)V
    .locals 1

    .line 958
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    return-void
.end method

.method public setTransitionState(Lcom/google/android/material/search/SearchView$TransitionState;)V
    .locals 1

    const/4 v0, 0x1

    .line 794
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchView;->setTransitionState(Lcom/google/android/material/search/SearchView$TransitionState;Z)V

    return-void
.end method

.method public setUseWindowInsetsController(Z)V
    .locals 0

    .line 645
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->useWindowInsetsController:Z

    return-void
.end method

.method public setVisible(Z)V
    .locals 4

    .line 869
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 870
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    if-eqz p1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/16 v3, 0x8

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 871
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->updateNavigationIconProgressIfNeeded()V

    if-eqz p1, :cond_2

    .line 873
    sget-object v2, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWN:Lcom/google/android/material/search/SearchView$TransitionState;

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/android/material/search/SearchView$TransitionState;->HIDDEN:Lcom/google/android/material/search/SearchView$TransitionState;

    :goto_2
    if-eq v0, p1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 872
    :goto_3
    invoke-direct {p0, v2, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Lcom/google/android/material/search/SearchView$TransitionState;Z)V

    return-void
.end method

.method public setupWithSearchBar(Lcom/google/android/material/search/SearchBar;)V
    .locals 2

    .line 551
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 552
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setSearchBar(Lcom/google/android/material/search/SearchBar;)V

    if-eqz p1, :cond_0

    .line 554
    new-instance v0, Ll/ۘۖᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/ۘۖᩳ;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 555
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 557
    :try_start_0
    new-instance v0, Ll/ۗ᩸ۢ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۗ᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setHandwritingDelegatorCallback(Ljava/lang/Runnable;)V

    .line 558
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setIsHandwritingDelegate(Z)V
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 565
    :catch_0
    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->updateNavigationIconIfNeeded()V

    .line 566
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay()V

    .line 567
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->getCurrentTransitionState()Lcom/google/android/material/search/SearchView$TransitionState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->updateListeningForBackCallbacks(Lcom/google/android/material/search/SearchView$TransitionState;)V

    return-void
.end method

.method public show()V
    .locals 2

    .line 846
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWN:Lcom/google/android/material/search/SearchView$TransitionState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->currentTransitionState:Lcom/google/android/material/search/SearchView$TransitionState;

    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWING:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 847
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 850
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method public startBackProgress(Ll/᩶ۧ;)V
    .locals 1

    .line 276
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->isHiddenOrHiding()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-nez v0, :cond_0

    goto :goto_0

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->startBackProgress(Ll/᩶ۧ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateBackProgress(Ll/᩶ۧ;)V
    .locals 2

    .line 284
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->isHiddenOrHiding()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchBar:Lcom/google/android/material/search/SearchBar;

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->searchViewAnimationHelper:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-virtual {v0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->updateBackProgress(Ll/᩶ۧ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public updateSoftInputMode()V
    .locals 1

    .line 763
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->getActivityWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 765
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    iput v0, p0, Lcom/google/android/material/search/SearchView;->softInputMode:I

    :cond_0
    return-void
.end method
