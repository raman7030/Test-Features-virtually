.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/google/android/material/internal/ScrimInsetsFrameLayout;
.source "NavigationView.java"

# interfaces
.implements Lcom/google/android/material/motion/MaterialBackHandler;


# static fields
.field public static final CHECKED_STATE_SET:[I

.field public static final DEF_STYLE_RES:I

.field public static final DISABLED_STATE_SET:[I

.field public static final PRESENTER_NAVIGATION_VIEW_ID:I = 0x1


# instance fields
.field public final backDrawerListener:Ll/۠ۧ֫;

.field public final backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

.field public bottomInsetScrimEnabled:Z

.field public drawerLayoutCornerSize:I

.field public final drawerLayoutCornerSizeBackAnimationEnabled:Z

.field public final drawerLayoutCornerSizeBackAnimationMax:I

.field public listener:Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;

.field public final maxWidth:I

.field public final menu:Lcom/google/android/material/internal/NavigationMenu;

.field public menuInflater:Landroid/view/MenuInflater;

.field public onGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

.field public final shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

.field public final sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

.field public final tmpLocation:[I

.field public topInsetScrimEnabled:Z


# direct methods
.method public static synthetic $r8$lambda$AHFKJHmjzrzMxPjc--xxWf1dl_U(Lcom/google/android/material/navigation/NavigationView;Landroid/graphics/Canvas;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->lambda$dispatchDraw$0(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a0

    .line 130
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->CHECKED_STATE_SET:[I

    const v0, -0x101009e

    .line 131
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->DISABLED_STATE_SET:[I

    .line 133
    sget v0, Ll/ᩴ۠ܺ;->᩻᩶:I

    sput v0, Lcom/google/android/material/navigation/NavigationView;->DEF_STYLE_RES:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 178
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 182
    sget v0, Ll/ᩳ۠ܺ;->֡᩹:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    .line 186
    sget v6, Lcom/google/android/material/navigation/NavigationView;->DEF_STYLE_RES:I

    invoke-static {p1, p2, p3, v6}, Lcom/google/android/material/theme/overlay/MaterialThemeOverlay;->wrap(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 137
    new-instance p1, Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-direct {p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 142
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->tmpLocation:[I

    const/4 v7, 0x1

    .line 146
    iput-boolean v7, p0, Lcom/google/android/material/navigation/NavigationView;->topInsetScrimEnabled:Z

    .line 147
    iput-boolean v7, p0, Lcom/google/android/material/navigation/NavigationView;->bottomInsetScrimEnabled:Z

    const/4 v8, 0x0

    .line 149
    iput v8, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    .line 152
    invoke-static {p0}, Lcom/google/android/material/shape/ShapeableDelegate;->create(Landroid/view/View;)Lcom/google/android/material/shape/ShapeableDelegate;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    .line 154
    new-instance v0, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-direct {v0, p0}, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    .line 156
    new-instance v0, Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-direct {v0, p0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    .line 157
    new-instance v0, Lcom/google/android/material/navigation/NavigationView$1;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$1;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->backDrawerListener:Ll/۠ۧ֫;

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    .line 191
    new-instance v10, Lcom/google/android/material/internal/NavigationMenu;

    invoke-direct {v10, v9}, Lcom/google/android/material/internal/NavigationMenu;-><init>(Landroid/content/Context;)V

    iput-object v10, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    .line 194
    sget-object v2, Ll/᩵۠ܺ;->֡ܿ֫:[I

    new-array v5, v8, [I

    move-object v0, v9

    move-object v1, p2

    move v3, p3

    move v4, v6

    .line 195
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/ThemeEnforcement;->obtainTintedStyledAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ll/᩺ۘ;

    move-result-object v0

    .line 198
    sget v1, Ll/᩵۠ܺ;->ۚܿ֫:I

    invoke-virtual {v0, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 199
    sget v1, Ll/᩵۠ܺ;->ۚܿ֫:I

    invoke-virtual {v0, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Ll/ܿ᩺;->֫:I

    .line 3370
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 204
    :cond_0
    sget v1, Ll/᩵۠ܺ;->ۙܿ֫:I

    .line 205
    invoke-virtual {v0, v1, v8}, Ll/᩺ۘ;->ۧ(II)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 206
    :goto_0
    iput-boolean v1, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationEnabled:Z

    .line 208
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Ll/᩻۠ܺ;->ܿۖ:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationMax:I

    .line 212
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 213
    invoke-static {v1}, Lcom/google/android/material/drawable/DrawableUtils;->getColorStateListOrNull(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_4

    .line 217
    :cond_2
    invoke-static {v9, p2, p3, v6}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p2

    .line 218
    new-instance p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    invoke-direct {p3, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    if-eqz v2, :cond_3

    .line 220
    invoke-virtual {p3, v2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 222
    :cond_3
    invoke-virtual {p3, v9}, Lcom/google/android/material/shape/MaterialShapeDrawable;->initializeElevationOverlay(Landroid/content/Context;)V

    .line 223
    sget p2, Ll/ܿ᩺;->֫:I

    .line 3370
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 226
    :cond_4
    sget p2, Ll/᩵۠ܺ;->ۗܿ֫:I

    invoke-virtual {v0, p2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 227
    sget p2, Ll/᩵۠ܺ;->ۗܿ֫:I

    invoke-virtual {v0, p2, v8}, Ll/᩺ۘ;->ۧ(II)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 229
    :cond_5
    sget p2, Ll/᩵۠ܺ;->֨ܿ֫:I

    invoke-virtual {v0, p2, v8}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 231
    sget p2, Ll/᩵۠ܺ;->ܶܿ֫:I

    invoke-virtual {v0, p2, v8}, Ll/᩺ۘ;->ۧ(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/navigation/NavigationView;->maxWidth:I

    .line 234
    sget p2, Ll/᩵۠ܺ;->ᩴܳ֫:I

    invoke-virtual {v0, p2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_6

    .line 235
    sget p2, Ll/᩵۠ܺ;->ᩴܳ֫:I

    invoke-virtual {v0, p2}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    goto :goto_1

    :cond_6
    move-object p2, p3

    .line 239
    :goto_1
    sget v1, Ll/᩵۠ܺ;->ۚܳ֫:I

    invoke-virtual {v0, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 240
    sget v1, Ll/᩵۠ܺ;->ۚܳ֫:I

    .line 241
    invoke-virtual {v0, v1, v8}, Ll/᩺ۘ;->ܳ(II)I

    move-result v1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    const v2, 0x1010038

    if-nez v1, :cond_8

    if-nez p2, :cond_8

    .line 247
    invoke-direct {p0, v2}, Lcom/google/android/material/navigation/NavigationView;->createDefaultColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 251
    :cond_8
    sget v3, Ll/᩵۠ܺ;->᩺ܿ֫:I

    invoke-virtual {v0, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 252
    sget v2, Ll/᩵۠ܺ;->᩺ܿ֫:I

    invoke-virtual {v0, v2}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_3

    .line 254
    :cond_9
    invoke-direct {p0, v2}, Lcom/google/android/material/navigation/NavigationView;->createDefaultColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 258
    :goto_3
    sget v3, Ll/᩵۠ܺ;->ۜܳ֫:I

    invoke-virtual {v0, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 259
    sget v3, Ll/᩵۠ܺ;->ۜܳ֫:I

    invoke-virtual {v0, v3, v8}, Ll/᩺ۘ;->ܳ(II)I

    move-result v3

    goto :goto_4

    :cond_a
    const/4 v3, 0x0

    .line 262
    :goto_4
    sget v4, Ll/᩵۠ܺ;->᩷ܳ֫:I

    .line 263
    invoke-virtual {v0, v4, v7}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v4

    .line 265
    sget v5, Ll/᩵۠ܺ;->ۨܿ֫:I

    invoke-virtual {v0, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 266
    sget v5, Ll/᩵۠ܺ;->ۨܿ֫:I

    invoke-virtual {v0, v5, v8}, Ll/᩺ۘ;->ۧ(II)I

    move-result v5

    invoke-virtual {p0, v5}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    .line 270
    :cond_b
    sget v5, Ll/᩵۠ܺ;->ۢܳ֫:I

    invoke-virtual {v0, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 271
    sget v5, Ll/᩵۠ܺ;->ۢܳ֫:I

    invoke-virtual {v0, v5}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    goto :goto_5

    :cond_c
    move-object v5, p3

    :goto_5
    if-nez v3, :cond_d

    if-nez v5, :cond_d

    const v5, 0x1010036

    .line 276
    invoke-direct {p0, v5}, Lcom/google/android/material/navigation/NavigationView;->createDefaultColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    .line 279
    :cond_d
    sget v6, Ll/᩵۠ܺ;->۫ܿ֫:I

    invoke-virtual {v0, v6}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-nez v6, :cond_e

    .line 282
    invoke-direct {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->hasShapeAppearance(Ll/᩺ۘ;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 283
    invoke-direct {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->createDefaultItemBackground(Ll/᩺ۘ;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 285
    sget v7, Ll/᩵۠ܺ;->۟ܿ֫:I

    .line 286
    invoke-static {v9, v0, v7}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    if-eqz v7, :cond_e

    .line 293
    invoke-direct {p0, v0, p3}, Lcom/google/android/material/navigation/NavigationView;->createDefaultItemDrawable(Ll/᩺ۘ;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 294
    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    .line 296
    invoke-static {v7}, Lcom/google/android/material/ripple/RippleUtils;->sanitizeRippleDrawableColor(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-direct {v11, v7, p3, v8}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 297
    invoke-virtual {p1, v11}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemForeground(Landroid/graphics/drawable/RippleDrawable;)V

    .line 301
    :cond_e
    sget p3, Ll/᩵۠ܺ;->ۤܿ֫:I

    invoke-virtual {v0, p3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p3

    if-eqz p3, :cond_f

    .line 302
    sget p3, Ll/᩵۠ܺ;->ۤܿ֫:I

    const/4 v7, 0x0

    .line 303
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 304
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    goto :goto_6

    :cond_f
    const/4 v7, 0x0

    .line 307
    :goto_6
    sget p3, Ll/᩵۠ܺ;->ۡܳ֫:I

    invoke-virtual {v0, p3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p3

    if-eqz p3, :cond_10

    .line 308
    sget p3, Ll/᩵۠ܺ;->ۡܳ֫:I

    .line 309
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 310
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    .line 313
    :cond_10
    sget p3, Ll/᩵۠ܺ;->᩶ܿ֫:I

    .line 314
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 315
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    .line 317
    sget p3, Ll/᩵۠ܺ;->᩹ܿ֫:I

    .line 318
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 319
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    .line 321
    sget p3, Ll/᩵۠ܺ;->֡ܳ֫:I

    .line 322
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 323
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    .line 325
    sget p3, Ll/᩵۠ܺ;->᩵ܳ֫:I

    .line 326
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 327
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    .line 329
    sget p3, Ll/᩵۠ܺ;->֨ܳ֫:I

    iget-boolean v8, p0, Lcom/google/android/material/navigation/NavigationView;->topInsetScrimEnabled:Z

    .line 330
    invoke-virtual {v0, p3, v8}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p3

    .line 329
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    .line 332
    sget p3, Ll/᩵۠ܺ;->᩸ܿ֫:I

    iget-boolean v8, p0, Lcom/google/android/material/navigation/NavigationView;->bottomInsetScrimEnabled:Z

    .line 333
    invoke-virtual {v0, p3, v8}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p3

    .line 332
    invoke-virtual {p0, p3}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    .line 335
    sget p3, Ll/᩵۠ܺ;->ۛܿ֫:I

    .line 336
    invoke-virtual {v0, p3, v7}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 338
    sget v7, Ll/᩵۠ܺ;->ܰܿ֫:I

    const/4 v8, 0x1

    invoke-virtual {v0, v7, v8}, Ll/᩺ۘ;->ܽ(II)I

    move-result v7

    invoke-virtual {p0, v7}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 340
    new-instance v7, Lcom/google/android/material/navigation/NavigationView$2;

    invoke-direct {v7, p0}, Lcom/google/android/material/navigation/NavigationView$2;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {v10, v7}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    .line 350
    invoke-virtual {p1, v8}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setId(I)V

    .line 351
    invoke-virtual {p1, v9, v10}, Lcom/google/android/material/internal/NavigationMenuPresenter;->initForMenu(Landroid/content/Context;Ll/ۗۜ;)V

    if-eqz v1, :cond_11

    .line 353
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setSubheaderTextAppearance(I)V

    .line 355
    :cond_11
    invoke-virtual {p1, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setSubheaderColor(Landroid/content/res/ColorStateList;)V

    .line 356
    invoke-virtual {p1, v2}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    .line 357
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setOverScrollMode(I)V

    if-eqz v3, :cond_12

    .line 359
    invoke-virtual {p1, v3}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextAppearance(I)V

    .line 361
    :cond_12
    invoke-virtual {p1, v4}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 362
    invoke-virtual {p1, v5}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 363
    invoke-virtual {p1, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 364
    invoke-virtual {p1, p3}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconPadding(I)V

    .line 365
    invoke-virtual {v10, p1}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;)V

    .line 366
    invoke-virtual {p1, p0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Ll/ۜ᩷;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 368
    sget p1, Ll/᩵۠ܺ;->ܺܳ֫:I

    invoke-virtual {v0, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 369
    sget p1, Ll/᩵۠ܺ;->ܺܳ֫:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ll/᩺ۘ;->ܳ(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->inflateMenu(I)V

    goto :goto_7

    :cond_13
    const/4 p2, 0x0

    .line 372
    :goto_7
    sget p1, Ll/᩵۠ܺ;->۬ܿ֫:I

    invoke-virtual {v0, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 373
    sget p1, Ll/᩵۠ܺ;->۬ܿ֫:I

    invoke-virtual {v0, p1, p2}, Ll/᩺ۘ;->ܳ(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->inflateHeaderView(I)Landroid/view/View;

    .line 376
    :cond_14
    invoke-virtual {v0}, Ll/᩺ۘ;->ܿ()V

    .line 378
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->setupInsetScrimsListener()V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/android/material/navigation/NavigationView;)Lcom/google/android/material/motion/MaterialBackOrchestrator;
    .locals 0

    .line 128
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->maybeClearCornerSizeAnimationForDrawerLayout()V

    return-void
.end method

.method public static synthetic access$200(Lcom/google/android/material/navigation/NavigationView;)[I
    .locals 0

    .line 128
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->tmpLocation:[I

    return-object p0
.end method

.method public static synthetic access$300(Lcom/google/android/material/navigation/NavigationView;)Lcom/google/android/material/internal/NavigationMenuPresenter;
    .locals 0

    .line 128
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    return-object p0
.end method

.method private createDefaultColorStateList(I)Landroid/content/res/ColorStateList;
    .locals 7

    .line 1062
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 1063
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 1066
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    .line 46
    invoke-static {p1, v3}, Ll/֨ۙ;->ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 1067
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 1068
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v4, 0x7f04011a

    .line 1069
    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    .line 1072
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 1073
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 1074
    new-instance v3, Landroid/content/res/ColorStateList;

    sget-object v4, Lcom/google/android/material/navigation/NavigationView;->DISABLED_STATE_SET:[I

    const/4 v5, 0x3

    new-array v5, v5, [[I

    const/4 v6, 0x0

    aput-object v4, v5, v6

    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->CHECKED_STATE_SET:[I

    aput-object v6, v5, v2

    sget-object v2, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    const/4 v6, 0x2

    aput-object v2, v5, v6

    .line 1077
    invoke-virtual {p1, v4, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    filled-new-array {p1, v0, v1}, [I

    move-result-object p1

    invoke-direct {v3, v5, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method private createDefaultItemBackground(Ll/᩺ۘ;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 513
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Ll/᩵۠ܺ;->ܽܳ֫:I

    .line 512
    invoke-static {v0, p1, v1}, Lcom/google/android/material/resources/MaterialResources;->getColorStateList(Landroid/content/Context;Ll/᩺ۘ;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 514
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->createDefaultItemDrawable(Ll/᩺ۘ;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method private createDefaultItemDrawable(Ll/᩺ۘ;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 520
    sget v0, Ll/᩵۠ܺ;->֫ܳ֫:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v0

    .line 521
    sget v2, Ll/᩵۠ܺ;->ۧܳ֫:I

    .line 522
    invoke-virtual {p1, v2, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v2

    .line 523
    new-instance v4, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 526
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 525
    invoke-static {v3, v0, v2}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v0

    .line 527
    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 528
    invoke-virtual {v4, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 530
    sget p2, Ll/᩵۠ܺ;->ܳܳ֫:I

    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v5

    .line 531
    sget p2, Ll/᩵۠ܺ;->᩻ܳ֫:I

    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v6

    .line 532
    sget p2, Ll/᩵۠ܺ;->ܿܳ֫:I

    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v7

    .line 533
    sget p2, Ll/᩵۠ܺ;->ᩳܳ֫:I

    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v8

    .line 534
    new-instance p1, Landroid/graphics/drawable/InsetDrawable;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-object p1
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1054
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menuInflater:Landroid/view/MenuInflater;

    if-nez v0, :cond_0

    .line 1055
    new-instance v0, Ll/۟᩻;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۟᩻;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menuInflater:Landroid/view/MenuInflater;

    .line 1057
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menuInflater:Landroid/view/MenuInflater;

    return-object v0
.end method

.method private hasShapeAppearance(Ll/᩺ۘ;)Z
    .locals 1

    .line 450
    sget v0, Ll/᩵۠ܺ;->֫ܳ֫:I

    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Ll/᩵۠ܺ;->ۧܳ֫:I

    .line 451
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private synthetic lambda$dispatchDraw$0(Landroid/graphics/Canvas;)V
    .locals 0

    .line 588
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private maybeClearCornerSizeAnimationForDrawerLayout()V
    .locals 2

    .line 443
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationEnabled:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 444
    iput v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    .line 445
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/material/navigation/NavigationView;->maybeUpdateCornerSizeForDrawerLayout(II)V

    :cond_0
    return-void
.end method

.method private maybeUpdateCornerSizeForDrawerLayout(II)V
    .locals 5

    .line 408
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Ll/۬ۧ֫;

    if-eqz v0, :cond_3

    .line 409
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Ll/ܶۧ֫;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    if-gtz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationEnabled:Z

    if-eqz v0, :cond_3

    .line 411
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v0, :cond_3

    .line 412
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    iget v0, v0, Ll/ܶۧ֫;->֫:I

    .line 414
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    .line 134
    invoke-static {v0, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 420
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 422
    invoke-virtual {v1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->toBuilder()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v3

    iget v4, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    int-to-float v4, v4

    .line 423
    invoke-virtual {v3, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setAllCornerSizes(F)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_2

    .line 425
    invoke-virtual {v3, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopLeftCornerSize(F)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 426
    invoke-virtual {v3, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setBottomLeftCornerSize(F)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    goto :goto_1

    .line 429
    :cond_2
    invoke-virtual {v3, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopRightCornerSize(F)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 430
    invoke-virtual {v3, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setBottomRightCornerSize(F)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 432
    :goto_1
    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object v0

    .line 433
    invoke-virtual {v1, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 434
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    invoke-virtual {v1, p0, v0}, Lcom/google/android/material/shape/ShapeableDelegate;->onShapeAppearanceChanged(Landroid/view/View;Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 435
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    new-instance v1, Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-direct {v1, v4, v4, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, p0, v1}, Lcom/google/android/material/shape/ShapeableDelegate;->onMaskChanged(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 438
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    invoke-virtual {p1, p0, v2}, Lcom/google/android/material/shape/ShapeableDelegate;->setOffsetZeroCornerEdgeBoundsEnabled(Landroid/view/View;Z)V

    :cond_3
    return-void
.end method

.method private requireDrawerLayoutParent()Landroid/util/Pair;
    .locals 3

    .line 1038
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 1039
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1040
    instance-of v2, v0, Ll/۬ۧ֫;

    if-eqz v2, :cond_0

    instance-of v2, v1, Ll/ܶۧ֫;

    if-eqz v2, :cond_0

    .line 1041
    new-instance v2, Landroid/util/Pair;

    check-cast v0, Ll/۬ۧ֫;

    check-cast v1, Ll/ܶۧ֫;

    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 1043
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "NavigationView back progress requires the direct parent view to be a DrawerLayout."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private setupInsetScrimsListener()V
    .locals 2

    .line 1087
    new-instance v0, Lcom/google/android/material/navigation/NavigationView$3;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$3;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->onGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 1122
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->onGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method


# virtual methods
.method public addHeaderView(Landroid/view/View;)V
    .locals 1

    .line 634
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->addHeaderView(Landroid/view/View;)V

    return-void
.end method

.method public cancelBackProgress()V
    .locals 1

    .line 1031
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->requireDrawerLayoutParent()Landroid/util/Pair;

    .line 1032
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;->cancelBackProgress()V

    .line 1033
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->maybeClearCornerSizeAnimationForDrawerLayout()V

    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 588
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    new-instance v1, Ll/ۙܶ᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ۙܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/shape/ShapeableDelegate;->maybeClip(Landroid/graphics/Canvas;Lcom/google/android/material/canvas/CanvasCompat$CanvasOperation;)V

    return-void
.end method

.method public getBackHelper()Lcom/google/android/material/motion/MaterialSideContainerBackHelper;
    .locals 1

    .line 1050
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    return-object v0
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 1

    .line 863
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getCheckedItem()Ll/ۛۜ;

    move-result-object v0

    return-object v0
.end method

.method public getDividerInsetEnd()I
    .locals 1

    .line 960
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getDividerInsetEnd()I

    move-result v0

    return v0
.end method

.method public getDividerInsetStart()I
    .locals 1

    .line 947
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getDividerInsetStart()I

    move-result v0

    return v0
.end method

.method public getHeaderCount()I
    .locals 1

    .line 652
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getHeaderCount()I

    move-result v0

    return v0
.end method

.method public getHeaderView(I)Landroid/view/View;
    .locals 1

    .line 663
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getHeaderView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 716
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .locals 1

    .line 748
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemHorizontalPadding()I

    move-result v0

    return v0
.end method

.method public getItemIconPadding()I
    .locals 1

    .line 810
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemIconPadding()I

    move-result v0

    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 674
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getItemMaxLines()I
    .locals 1

    .line 909
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemMaxLines()I

    move-result v0

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 695
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemTextColor()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getItemVerticalPadding()I
    .locals 1

    .line 779
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getItemVerticalPadding()I

    move-result v0

    return v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 615
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    return-object v0
.end method

.method public getSubheaderInsetEnd()I
    .locals 1

    .line 982
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getSubheaderInsetEnd()I

    move-result v0

    return v0
.end method

.method public getSubheaderInsetStart()I
    .locals 1

    .line 971
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->getSubheaderInsetStart()I

    move-result v0

    return v0
.end method

.method public handleBackInvoked()V
    .locals 5

    .line 1011
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->requireDrawerLayoutParent()Landroid/util/Pair;

    move-result-object v0

    .line 1012
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ll/۬ۧ֫;

    .line 1014
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-virtual {v2}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->onHandleBackInvoked()Ll/᩶ۧ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1015
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-ge v3, v4, :cond_0

    goto :goto_0

    .line 1020
    :cond_0
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ll/ܶۧ֫;

    iget v0, v0, Ll/ܶۧ֫;->֫:I

    .line 1022
    invoke-static {v1, p0}, Lcom/google/android/material/navigation/DrawerLayoutUtils;->getScrimCloseAnimatorListener(Ll/۬ۧ֫;Landroid/view/View;)Landroid/animation/Animator$AnimatorListener;

    move-result-object v3

    .line 1024
    invoke-static {v1}, Lcom/google/android/material/navigation/DrawerLayoutUtils;->getScrimCloseAnimatorUpdateListener(Ll/۬ۧ֫;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v1

    .line 1025
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-virtual {v4, v2, v0, v3, v1}, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;->finishBackProgress(Ll/᩶ۧ;ILandroid/animation/Animator$AnimatorListener;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 1809
    invoke-virtual {v1, p0, v0}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    return-void
.end method

.method public inflateHeaderView(I)Landroid/view/View;
    .locals 1

    .line 625
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->inflateHeaderView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public inflateMenu(I)V
    .locals 2

    .line 606
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setUpdateSuspended(Z)V

    .line 607
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 608
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setUpdateSuspended(Z)V

    .line 609
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter;->updateMenuView(Z)V

    return-void
.end method

.method public isBottomInsetScrimEnabled()Z
    .locals 1

    .line 929
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->bottomInsetScrimEnabled:Z

    return v0
.end method

.method public isTopInsetScrimEnabled()Z
    .locals 1

    .line 914
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->topInsetScrimEnabled:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 456
    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onAttachedToWindow()V

    .line 457
    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapeUtils;->setParentAbsoluteElevation(Landroid/view/View;)V

    .line 459
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 460
    instance-of v1, v0, Ll/۬ۧ֫;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-virtual {v1}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->shouldListenForBackCallbacks()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 461
    check-cast v0, Ll/۬ۧ֫;

    .line 463
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->backDrawerListener:Ll/۠ۧ֫;

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ۧ(Ll/۠ۧ֫;)V

    .line 464
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->backDrawerListener:Ll/۠ۧ֫;

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->֫(Ll/۠ۧ֫;)V

    .line 466
    invoke-static {p0}, Ll/۬ۧ֫;->ܳ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 467
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->backOrchestrator:Lcom/google/android/material/motion/MaterialBackOrchestrator;

    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackOrchestrator;->startListeningForBackCallbacksWithPriorityOverlay()V

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 474
    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onDetachedFromWindow()V

    .line 479
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->onGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 482
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 483
    instance-of v1, v0, Ll/۬ۧ֫;

    if-eqz v1, :cond_0

    .line 484
    check-cast v0, Ll/۬ۧ֫;

    .line 485
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->backDrawerListener:Ll/۠ۧ֫;

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ۧ(Ll/۠ۧ֫;)V

    :cond_0
    return-void
.end method

.method public onInsetsChanged(Ll/᩸ܰ;)V
    .locals 1

    .line 595
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->dispatchApplyWindowInsets(Ll/᩸ܰ;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 569
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 579
    :cond_0
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->maxWidth:I

    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    .line 576
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->maxWidth:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 575
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 583
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 548
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    if-nez v0, :cond_0

    .line 549
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 552
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 553
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 554
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->menuState:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->restorePresenterStates(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 539
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 540
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 541
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->menuState:Landroid/os/Bundle;

    .line 542
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    invoke-virtual {v2, v0}, Ll/ۗۜ;->savePresenterStates(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 491
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 492
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/navigation/NavigationView;->maybeUpdateCornerSizeForDrawerLayout(II)V

    return-void
.end method

.method public removeHeaderView(Landroid/view/View;)V
    .locals 1

    .line 643
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->removeHeaderView(Landroid/view/View;)V

    return-void
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    .line 939
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->bottomInsetScrimEnabled:Z

    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 839
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 841
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    check-cast p1, Ll/ۛۜ;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setCheckedItem(Ll/ۛۜ;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 851
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->menu:Lcom/google/android/material/internal/NavigationMenu;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 853
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    check-cast p1, Ll/ۛۜ;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setCheckedItem(Ll/ۛۜ;)V

    return-void

    .line 855
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerInsetEnd(I)V
    .locals 1

    .line 965
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setDividerInsetEnd(I)V

    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 1

    .line 954
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setDividerInsetStart(I)V

    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 498
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 500
    invoke-static {p0, p1}, Lcom/google/android/material/shape/MaterialShapeUtils;->setElevation(Landroid/view/View;F)V

    return-void
.end method

.method public setForceCompatClippingEnabled(Z)V
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->shapeableDelegate:Lcom/google/android/material/shape/ShapeableDelegate;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/material/shape/ShapeableDelegate;->setForceCompatClippingEnabled(Landroid/view/View;Z)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 737
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 727
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    .line 758
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemHorizontalPadding(I)V

    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 2

    .line 768
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemHorizontalPadding(I)V

    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    .line 820
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconPadding(I)V

    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 2

    .line 830
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconPadding(I)V

    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 891
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconSize(I)V

    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 684
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    .line 900
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemMaxLines(I)V

    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    .line 872
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextAppearance(I)V

    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 881
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextAppearanceActiveBoldEnabled(Z)V

    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 705
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 1

    .line 789
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemVerticalPadding(I)V

    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
    .locals 2

    .line 799
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setItemVerticalPadding(I)V

    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;)V
    .locals 0

    .line 564
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->listener:Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;

    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    .line 383
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOverScrollMode(I)V

    .line 384
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setOverScrollMode(I)V

    :cond_0
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 1

    .line 987
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setSubheaderInsetEnd(I)V

    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 1

    .line 976
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->presenter:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->setSubheaderInsetStart(I)V

    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    .line 924
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->topInsetScrimEnabled:Z

    return-void
.end method

.method public startBackProgress(Ll/᩶ۧ;)V
    .locals 1

    .line 992
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->requireDrawerLayoutParent()Landroid/util/Pair;

    .line 993
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-virtual {v0, p1}, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;->startBackProgress(Ll/᩶ۧ;)V

    return-void
.end method

.method public updateBackProgress(Ll/᩶ۧ;)V
    .locals 2

    .line 998
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->requireDrawerLayoutParent()Landroid/util/Pair;

    move-result-object v0

    .line 999
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ll/ܶۧ֫;

    iget v0, v0, Ll/ܶۧ֫;->֫:I

    invoke-virtual {v1, p1, v0}, Lcom/google/android/material/motion/MaterialSideContainerBackHelper;->updateBackProgress(Ll/᩶ۧ;I)V

    .line 1001
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationEnabled:Z

    if-eqz v0, :cond_0

    .line 1002
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->sideContainerBackHelper:Lcom/google/android/material/motion/MaterialSideContainerBackHelper;

    invoke-virtual {p1}, Ll/᩶ۧ;->֫()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->interpolateProgress(F)F

    move-result p1

    const/4 v0, 0x0

    .line 1003
    iget v1, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSizeBackAnimationMax:I

    .line 1004
    invoke-static {v0, v1, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/navigation/NavigationView;->drawerLayoutCornerSize:I

    .line 1005
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->maybeUpdateCornerSizeForDrawerLayout(II)V

    :cond_0
    return-void
.end method
