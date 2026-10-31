.class public final Ll/ۗۙܿ;
.super Ljava/lang/Object;
.source "L9CC"


# instance fields
.field public final ֡:Landroid/view/animation/Interpolator;

.field public ֨:Landroid/util/Size;

.field public final ֫:Ll/۠ۙܿ;

.field public final ֫֫:Ljava/lang/Runnable;

.field public final ۖ:Ljava/lang/Object;

.field public ۖ֫:Ll/۬ۙܿ;

.field public ۗ:Z

.field public ۘ:Z

.field public final ۙ:Landroid/view/animation/AnimationSet;

.field public final ۚ:Landroid/view/ViewGroup;

.field public final ۛ:Ll/᩶ۙܿ;

.field public ۜ:Z

.field public ۜ֫:I

.field public final ۟:Landroid/widget/PopupWindow;

.field public final ۠:I

.field public final ۡ:Landroid/animation/AnimatorSet;

.field public ۡ֫:Ll/۬ۙܿ;

.field public final ۢ:Landroid/view/animation/Interpolator;

.field public ۢ֫:Z

.field public final ۤ:Landroid/util/Size;

.field public final ۧ:Landroid/graphics/drawable/Drawable;

.field public final ۧ֫:Landroid/graphics/Rect;

.field public ۨ:Landroid/util/Size;

.field public final ۫:Landroid/widget/ImageButton;

.field public final ۬:Landroid/graphics/drawable/Drawable;

.field public final ܰ:Landroid/view/View;

.field public final ܳ:Landroid/graphics/Point;

.field public final ܳ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

.field public final ܶ:I

.field public final ܺ:I

.field public ܺ֫:Ll/ۛ᩶ܿ;

.field public final ܽ:Landroid/view/animation/AnimationSet;

.field public final ܽ֫:Landroid/animation/AnimatorSet;

.field public final ܿ:Landroid/view/ContextThemeWrapper;

.field public final ܿ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

.field public final ᩳ:Landroid/view/ViewGroup;

.field public final ᩳ֫:[I

.field public final ᩴ:I

.field public final ᩵:Landroid/view/animation/Interpolator;

.field public ᩶:Ll/ۤ᩶ܿ;

.field public final ᩷:Landroid/view/animation/Interpolator;

.field public final ᩷֫:Landroid/graphics/Rect;

.field public final ᩸:Landroid/view/View$OnClickListener;

.field public final ᩹:Ljava/util/LinkedHashMap;

.field public final ᩺:Ll/ۙۙܿ;

.field public final ᩻:Landroid/animation/AnimatorSet;

.field public final ᩻֫:Landroid/graphics/Region;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 10

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۙܿ;->᩷֫:Landroid/graphics/Rect;

    .line 131
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/ۗۙܿ;->ܳ:Landroid/graphics/Point;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 133
    iput-object v1, p0, Ll/ۗۙܿ;->ᩳ֫:[I

    .line 135
    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iput-object v1, p0, Ll/ۗۙܿ;->᩻֫:Landroid/graphics/Region;

    .line 136
    new-instance v1, Ll/ܽۙܿ;

    invoke-direct {v1, p0}, Ll/ܽۙܿ;-><init>(Ll/ۗۙܿ;)V

    invoke-static {v1}, Ll/۠۬ۡ;->֫(Ll/ܽۙܿ;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/ۗۙܿ;->ۖ:Ljava/lang/Object;

    .line 149
    new-instance v1, Ll/ۡۙܿ;

    invoke-direct {v1, p0}, Ll/ۡۙܿ;-><init>(Ll/ۗۙܿ;)V

    iput-object v1, p0, Ll/ۗۙܿ;->֫֫:Ljava/lang/Runnable;

    const/4 v1, 0x1

    .line 158
    iput-boolean v1, p0, Ll/ۗۙܿ;->ۜ:Z

    .line 167
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, p0, Ll/ۗۙܿ;->᩹:Ljava/util/LinkedHashMap;

    .line 169
    new-instance v2, Ll/ܺۙܿ;

    invoke-direct {v2, p0}, Ll/ܺۙܿ;-><init>(Ll/ۗۙܿ;)V

    iput-object v2, p0, Ll/ۗۙܿ;->᩸:Landroid/view/View$OnClickListener;

    .line 193
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Ll/ۗۙܿ;->ۧ֫:Landroid/graphics/Rect;

    .line 195
    iput-boolean v1, p0, Ll/ۗۙܿ;->ۢ֫:Z

    .line 197
    sget-object v2, Ll/۬ۙܿ;->ۗ:Ll/۬ۙܿ;

    iput-object v2, p0, Ll/ۗۙܿ;->ۡ֫:Ll/۬ۙܿ;

    .line 198
    iput-object v2, p0, Ll/ۗۙܿ;->ۖ֫:Ll/۬ۙܿ;

    .line 416
    new-instance v2, Ll/۠ۙܿ;

    invoke-direct {v2, p0}, Ll/۠ۙܿ;-><init>(Ll/ۗۙܿ;)V

    iput-object v2, p0, Ll/ۗۙܿ;->֫:Ll/۠ۙܿ;

    .line 208
    iput-object p2, p0, Ll/ۗۙܿ;->ܰ:Landroid/view/View;

    .line 1715
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    const/4 v5, 0x0

    if-lt v3, v4, :cond_0

    const v3, 0x1010590

    .line 1716
    filled-new-array {v3}, [I

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 1717
    invoke-virtual {v3, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 1718
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    :goto_0
    if-eqz v4, :cond_1

    const v3, 0x103012b

    goto :goto_1

    :cond_1
    const v3, 0x1030128

    .line 1724
    :goto_1
    new-instance v4, Landroid/view/ContextThemeWrapper;

    invoke-direct {v4, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 209
    iput-object v4, p0, Ll/ۗۙܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    .line 1630
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v6, 0x7f0d0129

    const/4 v7, 0x0

    .line 1631
    invoke-virtual {v3, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 1632
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v8, -0x2

    invoke-direct {v6, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v6, "floating_toolbar"

    .line 1634
    invoke-virtual {v3, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1635
    invoke-virtual {v3, v6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1636
    invoke-virtual {v3, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 210
    iput-object v3, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    .line 1641
    new-instance v6, Ll/ܶۙܿ;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v6, v9, v2}, Ll/ܶۙܿ;-><init>(Landroid/content/Context;Ll/۠ۙܿ;)V

    .line 1642
    new-instance v2, Landroid/widget/PopupWindow;

    invoke-direct {v2, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;)V

    .line 1647
    invoke-virtual {v2, v5}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 1648
    new-instance v9, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v9, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v9}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1649
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v9, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1651
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 211
    iput-object v2, p0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    .line 212
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f0700bb

    .line 213
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Ll/ۗۙܿ;->۠:I

    .line 214
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0700c8

    .line 215
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Ll/ۗۙܿ;->ܶ:I

    .line 216
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0700ba

    .line 217
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Ll/ۗۙܿ;->ᩴ:I

    .line 218
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0700bc

    .line 219
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Ll/ۗۙܿ;->ܺ:I

    .line 222
    new-instance p2, Ll/᩸ۙܿ;

    .line 1498
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 222
    iput-object p2, p0, Ll/ۗۙܿ;->֡:Landroid/view/animation/Interpolator;

    const p2, 0x10c000d

    .line 223
    invoke-static {v4, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p2

    iput-object p2, p0, Ll/ۗۙܿ;->ۢ:Landroid/view/animation/Interpolator;

    const p2, 0x10c000e

    .line 225
    invoke-static {v4, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p2

    iput-object p2, p0, Ll/ۗۙܿ;->᩵:Landroid/view/animation/Interpolator;

    const p2, 0x10c000f

    .line 227
    invoke-static {v4, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p2

    iput-object p2, p0, Ll/ۗۙܿ;->᩷:Landroid/view/animation/Interpolator;

    .line 231
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0800fe

    .line 232
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {p2, v2, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Ll/ۗۙܿ;->ۧ:Landroid/graphics/drawable/Drawable;

    .line 233
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 234
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0800fc

    .line 235
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {p2, v2, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Ll/ۗۙܿ;->۬:Landroid/graphics/drawable/Drawable;

    .line 236
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 237
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f0800fd

    .line 238
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v2, v6, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iput-object v2, p0, Ll/ۗۙܿ;->ܿ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 239
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 240
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f0800ff

    .line 241
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v2, v6, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iput-object v2, p0, Ll/ۗۙܿ;->ܳ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 242
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 1342
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v6, 0x7f0d012b

    .line 1343
    invoke-virtual {v2, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    .line 1344
    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1345
    new-instance p2, Ll/ܿۙܿ;

    invoke-direct {p2, p0, v2}, Ll/ܿۙܿ;-><init>(Ll/ۗۙܿ;Landroid/widget/ImageButton;)V

    invoke-virtual {v2, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 427
    new-instance p2, Ll/ۧۙܿ;

    invoke-direct {p2, p0}, Ll/ۧۙܿ;-><init>(Ll/ۗۙܿ;)V

    invoke-virtual {v2, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 245
    iput-object v2, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    .line 1425
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_3

    .line 1426
    invoke-virtual {v2, v5, v5}, Landroid/view/View;->measure(II)V

    .line 1427
    new-instance p2, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-direct {p2, v6, v2}, Landroid/util/Size;-><init>(II)V

    .line 246
    iput-object p2, p0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    .line 1320
    new-instance p2, Ll/᩻ۙܿ;

    invoke-direct {p2, p0, v4}, Ll/᩻ۙܿ;-><init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;)V

    .line 247
    iput-object p2, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    .line 248
    new-instance p2, Ll/ۙۙܿ;

    invoke-direct {p2, p0, v4, p1}, Ll/ۙۙܿ;-><init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;I)V

    iput-object p2, p0, Ll/ۗۙܿ;->᩺:Ll/ۙۙܿ;

    .line 1361
    new-instance p1, Ll/᩶ۙܿ;

    invoke-direct {p1, p0}, Ll/᩶ۙܿ;-><init>(Ll/ۗۙܿ;)V

    .line 1362
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {p2, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1364
    invoke-virtual {p1, v7}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 1365
    invoke-virtual {p1, v5}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 1367
    new-instance p2, Ll/ۜۙܿ;

    invoke-direct {p2, p0, v4}, Ll/ۜۙܿ;-><init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;)V

    .line 1374
    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1376
    new-instance p2, Ll/ᩳۙܿ;

    invoke-direct {p2, p0, p1}, Ll/ᩳۙܿ;-><init>(Ll/ۗۙܿ;Ll/᩶ۙܿ;)V

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 249
    iput-object p1, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    .line 1395
    new-instance p1, Ll/ۢۙܿ;

    invoke-direct {p1, p0}, Ll/ۢۙܿ;-><init>(Ll/ۗۙܿ;)V

    .line 253
    new-instance p2, Landroid/view/animation/AnimationSet;

    invoke-direct {p2, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object p2, p0, Ll/ۗۙܿ;->ۙ:Landroid/view/animation/AnimationSet;

    .line 254
    invoke-virtual {p2, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 255
    new-instance p2, Landroid/view/animation/AnimationSet;

    invoke-direct {p2, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object p2, p0, Ll/ۗۙܿ;->ܽ:Landroid/view/animation/AnimationSet;

    .line 256
    invoke-virtual {p2, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1687
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1688
    sget-object p2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 1689
    invoke-static {v3, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-wide/16 v6, 0x96

    invoke-virtual {p2, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p2

    new-array v0, v1, [Landroid/animation/Animator;

    aput-object p2, v0, v5

    .line 1688
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 257
    iput-object p1, p0, Ll/ۗۙܿ;->ܽ֫:Landroid/animation/AnimatorSet;

    .line 258
    new-instance p1, Ll/ۖۙܿ;

    invoke-direct {p1, p0}, Ll/ۖۙܿ;-><init>(Ll/ۗۙܿ;)V

    const/16 p2, 0x96

    invoke-static {v3, p2, p1}, Ll/ۗۙܿ;->֫(Landroid/view/ViewGroup;ILandroid/animation/AnimatorListenerAdapter;)Landroid/animation/AnimatorSet;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۙܿ;->᩻:Landroid/animation/AnimatorSet;

    .line 272
    new-instance p1, Ll/ۘۙܿ;

    invoke-direct {p1, p0}, Ll/ۘۙܿ;-><init>(Ll/ۗۙܿ;)V

    invoke-static {v3, v5, p1}, Ll/ۗۙܿ;->֫(Landroid/view/ViewGroup;ILandroid/animation/AnimatorListenerAdapter;)Landroid/animation/AnimatorSet;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۙܿ;->ۡ:Landroid/animation/AnimatorSet;

    return-void

    .line 168
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static bridge synthetic ֡(Ll/ۗۙܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۗۙܿ;->ۜ()V

    return-void
.end method

.method private ֫(I)I
    .locals 3

    const/4 v0, 0x2

    .line 1268
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1269
    iget-object v0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    .line 1267
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/16 v1, 0xa

    .line 1265
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1271
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget v1, p0, Ll/ۗۙܿ;->ᩴ:I

    if-ge p1, v0, :cond_0

    int-to-float v0, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v0, v0, v2

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int p1, p1, v1

    .line 1276
    iget-object v1, p0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    .line 1277
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    add-int/2addr v1, p1

    add-int/2addr v1, v0

    return v1
.end method

.method public static ֫(Landroid/view/ViewGroup;ILandroid/animation/AnimatorListenerAdapter;)Landroid/animation/AnimatorSet;
    .locals 3

    .line 1702
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1703
    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    .line 1704
    invoke-static {p0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-wide/16 v1, 0x64

    invoke-virtual {p0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 1703
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    int-to-long p0, p1

    .line 1705
    invoke-virtual {v0, p0, p1}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 1706
    invoke-virtual {v0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static ֫(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;Landroid/view/MenuItem;I)Landroid/view/View;
    .locals 2

    .line 1567
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d012a

    const/4 v1, 0x0

    .line 1568
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 1570
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/view/MenuItem;IZ)V

    :cond_0
    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private ֫(Landroid/graphics/Rect;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1012
    iget-object v2, v0, Ll/ۗۙܿ;->ܰ:Landroid/view/View;

    iget-object v3, v0, Ll/ۗۙܿ;->᩷֫:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 553
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 554
    iget v5, v3, Landroid/graphics/Rect;->right:I

    iget-object v6, v0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v7

    sub-int/2addr v5, v7

    .line 555
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->centerX()I

    move-result v7

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    sub-int/2addr v7, v8

    if-ge v7, v4, :cond_0

    goto :goto_0

    :cond_0
    if-le v7, v5, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v7

    .line 564
    :goto_0
    iget v5, v1, Landroid/graphics/Rect;->top:I

    iget v7, v3, Landroid/graphics/Rect;->top:I

    sub-int v8, v5, v7

    .line 566
    iget v9, v3, Landroid/graphics/Rect;->bottom:I

    iget v10, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v9, v10

    .line 569
    iget v11, v0, Ll/ۗۙܿ;->ܶ:I

    mul-int/lit8 v12, v11, 0x2

    .line 570
    iget v13, v0, Ll/ۗۙܿ;->ᩴ:I

    add-int v14, v13, v12

    .line 1077
    iget-object v15, v0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    move/from16 v16, v4

    const/4 v4, 0x0

    if-eqz v15, :cond_8

    const/4 v5, 0x2

    .line 591
    invoke-direct {v0, v5}, Ll/ۗۙܿ;->֫(I)I

    move-result v5

    add-int/2addr v5, v12

    const/4 v7, 0x5

    .line 593
    invoke-direct {v0, v7}, Ll/ۗۙܿ;->֫(I)I

    move-result v7

    add-int/2addr v7, v12

    .line 594
    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    iget v11, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v10, v11

    add-int/2addr v10, v14

    .line 597
    iget v11, v1, Landroid/graphics/Rect;->bottom:I

    iget v13, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v11, v13

    add-int/2addr v11, v14

    if-lt v8, v5, :cond_4

    if-ge v8, v7, :cond_3

    if-lt v11, v10, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr v10, v12

    .line 612
    invoke-direct {v0, v10}, Ll/ۗۙܿ;->ۧ(I)V

    .line 613
    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int v10, v1, v14

    .line 614
    iput-boolean v4, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    :cond_3
    :goto_1
    sub-int/2addr v8, v12

    .line 605
    invoke-direct {v0, v8}, Ll/ۗۙܿ;->ۧ(I)V

    .line 606
    iget v1, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v3

    sub-int v10, v1, v3

    const/4 v1, 0x1

    .line 607
    iput-boolean v1, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    :cond_4
    if-lt v8, v14, :cond_5

    if-lt v10, v5, :cond_5

    sub-int/2addr v10, v12

    .line 621
    invoke-direct {v0, v10}, Ll/ۗۙܿ;->ۧ(I)V

    .line 622
    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int v10, v1, v14

    .line 623
    iput-boolean v4, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    :cond_5
    if-lt v9, v5, :cond_6

    sub-int/2addr v9, v12

    .line 627
    invoke-direct {v0, v9}, Ll/ۗۙܿ;->ۧ(I)V

    .line 628
    iget v10, v1, Landroid/graphics/Rect;->bottom:I

    .line 629
    iput-boolean v4, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    :cond_6
    if-lt v9, v14, :cond_7

    .line 631
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v7

    if-lt v7, v5, :cond_7

    sub-int/2addr v11, v12

    .line 635
    invoke-direct {v0, v11}, Ll/ۗۙܿ;->ۧ(I)V

    .line 636
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v14

    .line 637
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v3

    sub-int v10, v1, v3

    const/4 v1, 0x1

    .line 638
    iput-boolean v1, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    .line 642
    :cond_7
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v1

    sub-int/2addr v1, v12

    invoke-direct {v0, v1}, Ll/ۗۙܿ;->ۧ(I)V

    .line 643
    iget v10, v3, Landroid/graphics/Rect;->top:I

    .line 644
    iput-boolean v4, v0, Ll/ۗۙܿ;->ۗ:Z

    goto :goto_2

    :cond_8
    if-lt v8, v14, :cond_9

    sub-int v10, v5, v14

    goto :goto_2

    :cond_9
    if-lt v9, v14, :cond_a

    goto :goto_2

    :cond_a
    if-lt v9, v13, :cond_b

    sub-int/2addr v10, v11

    goto :goto_2

    :cond_b
    sub-int/2addr v5, v14

    .line 584
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 655
    :goto_2
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iget-object v3, v0, Ll/ۗۙܿ;->ᩳ֫:[I

    invoke-virtual {v1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 656
    aget v1, v3, v4

    const/4 v5, 0x1

    .line 657
    aget v6, v3, v5

    .line 658
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 659
    aget v2, v3, v4

    .line 660
    aget v3, v3, v5

    sub-int/2addr v1, v2

    sub-int/2addr v6, v3

    sub-int v4, v16, v1

    sub-int/2addr v10, v6

    .line 663
    iget-object v1, v0, Ll/ۗۙܿ;->ܳ:Landroid/graphics/Point;

    invoke-virtual {v1, v4, v10}, Landroid/graphics/Point;->set(II)V

    return-void
.end method

.method public static ֫(Landroid/view/View;II)V
    .locals 2

    .line 1431
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 1432
    invoke-virtual {p0, p2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1433
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1434
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1435
    :cond_0
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1436
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1437
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/util/Size;)V
    .locals 1

    .line 1441
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-static {p0, v0, p1}, Ll/ۗۙܿ;->֫(Landroid/view/View;II)V

    return-void
.end method

.method private ֫(Landroid/view/View;Landroid/view/MenuItem;IZ)V
    .locals 7

    if-eqz p4, :cond_0

    .line 1580
    iget-object v0, p0, Ll/ۗۙܿ;->ۡ֫:Ll/۬ۙܿ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۗۙܿ;->ۖ֫:Ll/۬ۙܿ;

    .line 1581
    :goto_0
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 1582
    invoke-interface {p2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 1583
    :goto_1
    iget-boolean v5, v0, Ll/۬ۙܿ;->᩶:Z

    if-eqz v5, :cond_2

    if-nez v1, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 1584
    :goto_2
    iget-boolean v0, v0, Ll/۬ۙܿ;->᩹:Z

    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_5

    if-nez v5, :cond_5

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v2, :cond_5

    const/4 v0, 0x1

    :cond_5
    move v3, v5

    :goto_4
    const v2, 0x7f0a0217

    .line 1593
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v5, 0x0

    .line 1595
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v5, 0x8

    if-eqz v3, :cond_6

    .line 1597
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1598
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 1600
    :cond_6
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    const v6, 0x7f0a0216

    .line 1602
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v0, :cond_7

    .line 1605
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1606
    invoke-interface {p2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1607
    invoke-virtual {v2, p3, v4, v4, v4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    goto :goto_6

    .line 1609
    :cond_7
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1610
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 26
    :goto_6
    move-object p3, p2

    check-cast p3, Ll/ܰ۬;

    invoke-interface {p3}, Ll/ܰ۬;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p3

    .line 1613
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1614
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 1616
    :cond_8
    invoke-virtual {p1, p3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_7
    if-eqz p4, :cond_9

    if-nez v1, :cond_9

    if-nez v3, :cond_9

    .line 1619
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_9
    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;I)V
    .locals 1

    .line 1450
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1451
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p0, v0, p1}, Ll/ۗۙܿ;->֫(Landroid/view/View;II)V

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;Ll/ۤ᩶ܿ;)V
    .locals 3

    .line 332
    iget-object v0, p0, Ll/ۗۙܿ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 333
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/MenuItem;

    .line 334
    invoke-static {v1}, Ll/᩹ۙܿ;->֫(Landroid/view/MenuItem;)Ll/᩹ۙܿ;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 336
    :cond_0
    iput-object p2, p0, Ll/ۗۙܿ;->᩶:Ll/ۤ᩶ܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۙܿ;Landroid/view/MotionEvent;)V
    .locals 0

    .line 428
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_0

    .line 429
    iget-object p0, p0, Ll/ۗۙܿ;->֫:Ll/۠ۙܿ;

    invoke-virtual {p0}, Ll/۠ۙܿ;->ܽ()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۙܿ;Landroid/view/View;Landroid/view/MenuItem;I)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/view/MenuItem;IZ)V

    return-void
.end method

.method public static ֫(Ll/ۗۙܿ;Landroid/widget/ImageButton;)V
    .locals 22

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    .line 1346
    iget-object v1, v6, Ll/ۗۙܿ;->ܿ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-object v7, v6, Ll/ۗۙܿ;->᩵:Landroid/view/animation/Interpolator;

    iget-object v8, v6, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    iget-object v9, v6, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    iget-object v10, v6, Ll/ۗۙܿ;->֡:Landroid/view/animation/Interpolator;

    iget-object v11, v6, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    iget-object v12, v6, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    iget-object v13, v6, Ll/ۗۙܿ;->ۢ:Landroid/view/animation/Interpolator;

    iget-object v2, v6, Ll/ۗۙܿ;->ܳ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-boolean v3, v6, Ll/ۗۙܿ;->ۘ:Z

    if-eqz v3, :cond_1

    .line 1347
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1348
    invoke-virtual {v2}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    .line 789
    iget-object v15, v6, Ll/ۗۙܿ;->ܽ:Landroid/view/animation/AnimationSet;

    iget-object v0, v6, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v2

    .line 790
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v5

    .line 791
    invoke-virtual {v12}, Landroid/view/View;->getX()F

    move-result v4

    .line 792
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float v16, v4, v0

    .line 793
    new-instance v3, Ll/ۚۙܿ;

    move-object v0, v3

    move-object/from16 v1, p0

    move-object v14, v3

    move v3, v5

    move-object/from16 v18, v7

    move v7, v5

    move/from16 v5, v16

    invoke-direct/range {v0 .. v5}, Ll/ۚۙܿ;-><init>(Ll/ۗۙܿ;IIFF)V

    .line 814
    iget-object v0, v6, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    .line 815
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 816
    invoke-virtual {v12}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 817
    new-instance v3, Ll/֨ۙܿ;

    invoke-direct {v3, v6, v0, v1, v2}, Ll/֨ۙܿ;-><init>(Ll/ۗۙܿ;IIF)V

    .line 828
    invoke-virtual {v11}, Landroid/view/View;->getX()F

    move-result v0

    .line 830
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    int-to-float v1, v7

    sub-float v1, v0, v1

    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    goto :goto_0

    :cond_0
    int-to-float v1, v7

    add-float/2addr v1, v0

    .line 831
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 832
    :goto_0
    new-instance v2, Ll/ܳۙܿ;

    invoke-direct {v2, v6, v0, v1, v7}, Ll/ܳۙܿ;-><init>(Ll/ۗۙܿ;FFI)V

    .line 843
    invoke-virtual {v14, v13}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 844
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v14, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 845
    invoke-virtual {v3, v10}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 846
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v3, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 847
    invoke-virtual {v2, v13}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 848
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 849
    invoke-virtual {v15}, Landroid/view/animation/AnimationSet;->getAnimations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 850
    invoke-virtual {v15, v14}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 851
    invoke-virtual {v15, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 852
    invoke-virtual {v15, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 853
    invoke-virtual {v12, v15}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v0, 0x0

    .line 854
    iput-boolean v0, v6, Ll/ۗۙܿ;->ۘ:Z

    .line 855
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 856
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, v6, Ll/ۗۙܿ;->᩷:Landroid/view/animation/Interpolator;

    .line 857
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    .line 858
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 859
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 860
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    .line 861
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    move-object/from16 v7, v18

    .line 862
    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x96

    .line 863
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 864
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    .line 1351
    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1352
    invoke-virtual {v1}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    .line 712
    iget-object v14, v6, Ll/ۗۙܿ;->ۙ:Landroid/view/animation/AnimationSet;

    iget-object v0, v6, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v15

    .line 713
    iget-object v0, v6, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v5

    .line 714
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 715
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 716
    invoke-virtual {v12}, Landroid/view/View;->getY()F

    move-result v2

    .line 717
    invoke-virtual {v12}, Landroid/view/View;->getX()F

    move-result v16

    .line 718
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float v17, v0, v16

    .line 719
    new-instance v1, Ll/ᩴۙܿ;

    move-object v0, v1

    move-object/from16 v18, v8

    move-object v8, v1

    move-object/from16 v1, p0

    move-object/from16 v19, v7

    move v7, v2

    move v2, v15

    move-object/from16 v20, v9

    move v9, v3

    move v3, v4

    move-object/from16 v21, v12

    move v12, v4

    move/from16 v4, v16

    move-object/from16 v16, v14

    move v14, v5

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Ll/ᩴۙܿ;-><init>(Ll/ۗۙܿ;IIFF)V

    .line 740
    new-instance v0, Ll/᩵ۙܿ;

    invoke-direct {v0, v6, v14, v9, v7}, Ll/᩵ۙܿ;-><init>(Ll/ۗۙܿ;IIF)V

    .line 752
    invoke-virtual {v11}, Landroid/view/View;->getX()F

    move-result v1

    .line 754
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_2

    int-to-float v2, v15

    add-float/2addr v2, v1

    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_2
    int-to-float v2, v15

    sub-float v2, v1, v2

    .line 755
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 756
    :goto_1
    new-instance v3, Ll/֡ۙܿ;

    invoke-direct {v3, v6, v1, v2, v12}, Ll/֡ۙܿ;-><init>(Ll/ۗۙܿ;FFI)V

    .line 767
    invoke-virtual {v8, v10}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 768
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v8, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 769
    invoke-virtual {v0, v13}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 770
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 771
    invoke-virtual {v3, v13}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 772
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ܿ()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v3, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 773
    invoke-virtual/range {v16 .. v16}, Landroid/view/animation/AnimationSet;->getAnimations()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 774
    invoke-virtual/range {v16 .. v16}, Landroid/view/animation/AnimationSet;->getAnimations()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object/from16 v1, v16

    .line 775
    invoke-virtual {v1, v8}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 776
    invoke-virtual {v1, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 777
    invoke-virtual {v1, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    move-object/from16 v0, v21

    .line 778
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v0, 0x1

    .line 779
    iput-boolean v0, v6, Ll/ۗۙܿ;->ۘ:Z

    .line 780
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    .line 781
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    move-object/from16 v1, v19

    .line 782
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xfa

    .line 783
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 784
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v1, v18

    .line 785
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۙܿ;Ll/ۚ۬ۡ;)V
    .locals 1

    .line 137
    invoke-virtual {p1}, Ll/ۚ۬ۡ;->֫()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 138
    invoke-virtual {p1}, Ll/ۚ۬ۡ;->ܽ()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 139
    invoke-virtual {p1}, Ll/ۚ۬ۡ;->ۧ()Landroid/graphics/Region;

    move-result-object v0

    iget-object p0, p0, Ll/ۗۙܿ;->᩻֫:Landroid/graphics/Region;

    invoke-virtual {v0, p0}, Landroid/graphics/Region;->set(Landroid/graphics/Region;)Z

    .line 140
    invoke-virtual {p1}, Ll/ۚ۬ۡ;->ᩳ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۙܿ;Ll/᩶ۙܿ;I)V
    .locals 0

    .line 1377
    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    .line 1378
    iget-object p0, p0, Ll/ۗۙܿ;->᩶:Ll/ۤ᩶ܿ;

    if-eqz p0, :cond_0

    .line 1379
    invoke-virtual {p0, p1}, Ll/ۤ᩶ܿ;->onMenuItemClick(Landroid/view/MenuItem;)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۖ(Ll/ۗۙܿ;)Landroid/widget/PopupWindow;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/ۗۙܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ۗۙܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۗۙܿ;->᩷()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۗۙܿ;)Landroid/widget/ImageButton;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    return-object p0
.end method

.method private ۜ()V
    .locals 6

    .line 1039
    iget-object v0, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    iget-boolean v0, p0, Ll/ۗۙܿ;->ۘ:Z

    if-eqz v0, :cond_0

    .line 1043
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    .line 1045
    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    goto :goto_0

    .line 1047
    :cond_0
    iget-object v0, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    .line 1048
    iget-object v1, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    .line 1051
    :goto_0
    iget-object v2, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getX()F

    move-result v3

    float-to-int v3, v3

    .line 1052
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v4

    float-to-int v4, v4

    .line 1053
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    move-result v5

    float-to-int v5, v5

    add-int/2addr v5, v0

    .line 1054
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v0

    float-to-int v0, v0

    add-int/2addr v0, v1

    .line 1050
    iget-object v1, p0, Ll/ۗۙܿ;->᩻֫:Landroid/graphics/Region;

    invoke-virtual {v1, v3, v4, v5, v0}, Landroid/graphics/Region;->set(IIII)Z

    return-void
.end method

.method public static bridge synthetic ۡ(Ll/ۗۙܿ;)Landroid/util/Size;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۗۙܿ;)Ll/᩶ۙܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    return-object p0
.end method

.method private ۢ()V
    .locals 5

    .line 998
    iget-object v0, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 999
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1000
    iget-object v2, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v4, v1

    move v1, v0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1002
    :goto_0
    iget-object v2, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v2, :cond_1

    .line 1003
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1004
    iget-object v2, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1006
    :cond_1
    iget v2, p0, Ll/ۗۙܿ;->۠:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v1

    iget-object v1, p0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 1007
    iget v2, p0, Ll/ۗۙܿ;->ܶ:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 1311
    iget-object v0, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v1, :cond_2

    .line 1312
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1313
    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    iget-object v2, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    mul-int v0, v0, v0

    mul-int v1, v1, v1

    add-int/2addr v1, v0

    int-to-double v0, v1

    .line 1314
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget-object v2, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    .line 1315
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    float-to-double v2, v2

    div-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Ll/ۗۙܿ;->ۜ֫:I

    :cond_2
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗۙܿ;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    return-object p0
.end method

.method private ۧ(I)V
    .locals 2

    .line 1077
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v0, :cond_3

    .line 974
    iget-object v0, p0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    .line 975
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Ll/ۗۙܿ;->ᩴ:I

    div-int/lit8 v1, v0, 0x2

    sub-int/2addr p1, v1

    div-int/2addr p1, v0

    .line 976
    invoke-direct {p0, p1}, Ll/ۗۙܿ;->֫(I)I

    move-result p1

    .line 977
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 978
    new-instance v0, Landroid/util/Size;

    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-direct {v0, v1, p1}, Landroid/util/Size;-><init>(II)V

    iput-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    .line 980
    :cond_0
    iget-object v0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-static {v0, v1}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 981
    iget-boolean v0, p0, Ll/ۗۙܿ;->ۘ:Z

    iget-object v1, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 982
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-static {v1, v0}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 983
    iget-boolean v0, p0, Ll/ۗۙܿ;->ۗ:Z

    if-eqz v0, :cond_2

    .line 984
    iget-object v0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    sub-int/2addr v0, p1

    .line 985
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result p1

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/view/View;->setY(F)V

    .line 986
    iget-object p1, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Landroid/view/View;->setY(F)V

    goto :goto_0

    .line 989
    :cond_1
    iget-object p1, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-static {v1, p1}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 991
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/ۗۙܿ;->ۢ()V

    :cond_3
    return-void
.end method

.method public static ۧ(Landroid/view/ViewGroup;I)V
    .locals 1

    .line 1445
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1446
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p0, p1, v0}, Ll/ۗۙܿ;->֫(Landroid/view/View;II)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۗۙܿ;)Landroid/view/MenuItem$OnMenuItemClickListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->᩶:Ll/ۤ᩶ܿ;

    return-object p0
.end method

.method private ܳ()Z
    .locals 3

    .line 1071
    iget-object v0, p0, Ll/ۗۙܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v2, 0x400000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    .line 1072
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ܺ(Ll/ۗۙܿ;)Ll/ۙۙܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->᩺:Ll/ۙۙܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۗۙܿ;)Landroid/view/ViewGroup;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private ܿ()I
    .locals 3

    .line 1291
    iget v0, p0, Ll/ۗۙܿ;->ۜ֫:I

    const/16 v1, 0x96

    if-ge v0, v1, :cond_0

    const/16 v0, 0xc8

    const/4 v1, 0x0

    .line 1293
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    const/16 v1, 0x12c

    if-le v0, v1, :cond_1

    return v1

    .line 1303
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/16 v2, 0xfa

    if-lt v0, v1, :cond_2

    int-to-float v0, v2

    .line 1304
    invoke-static {}, Landroid/animation/ValueAnimator;->getDurationScale()F

    move-result v1

    mul-float v1, v1, v0

    float-to-int v0, v1

    return v0

    :cond_2
    return v2
.end method

.method public static bridge synthetic ܿ(Ll/ۗۙܿ;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->᩹:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۗۙܿ;)Landroid/util/Size;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    return-object p0
.end method

.method private ᩳ()V
    .locals 1

    .line 704
    iget-object v0, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 705
    iget-object v0, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 706
    iget-object v0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 707
    iget-object v0, p0, Ll/ۗۙܿ;->ܿ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    .line 708
    iget-object v0, p0, Ll/ۗۙܿ;->ܳ֫:Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    return-void
.end method

.method public static ᩴ(Ll/ۗۙܿ;)Z
    .locals 4

    .line 1387
    iget-object v0, p0, Ll/ۗۙܿ;->ܽ:Landroid/view/animation/AnimationSet;

    iget-object p0, p0, Ll/ۗۙܿ;->ۙ:Landroid/view/animation/AnimationSet;

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 1388
    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1389
    :goto_0
    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1390
    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez p0, :cond_3

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v3
.end method

.method public static ᩵(Ll/ۗۙܿ;)V
    .locals 5

    .line 1245
    iget-object v0, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    iget-object v1, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    iget-boolean v2, p0, Ll/ۗۙܿ;->ۗ:Z

    if-eqz v2, :cond_0

    .line 1246
    iget-object v2, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setY(F)V

    .line 1247
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    .line 1248
    iget-object v0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object p0, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    sub-int/2addr v1, p0

    int-to-float p0, v1

    invoke-virtual {v0, p0}, Landroid/view/View;->setY(F)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۗۙܿ;)Landroid/util/Size;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    return-object p0
.end method

.method private ᩷()V
    .locals 13

    const/4 v0, 0x1

    .line 872
    iget-object v1, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 873
    iget-object v0, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v0}, Ll/᩶ۙܿ;->awakenScrollBars()Z

    .line 875
    iget-boolean v2, p0, Ll/ۗۙܿ;->ۘ:Z

    iget-object v3, p0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x4

    iget v7, p0, Ll/ۗۙܿ;->ܶ:I

    iget-object v8, p0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    iget v9, p0, Ll/ۗۙܿ;->۠:I

    iget-object v10, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    iget-object v11, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    const/4 v12, 0x0

    if-eqz v2, :cond_2

    .line 877
    iget-object v2, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    .line 878
    invoke-static {v11, v2}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 879
    invoke-virtual {v10, v12}, Landroid/view/View;->setAlpha(F)V

    .line 880
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    .line 881
    invoke-virtual {v0, v5}, Landroid/view/View;->setAlpha(F)V

    .line 882
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 883
    iget-object v4, p0, Ll/ۗۙܿ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 888
    invoke-direct {p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_0

    int-to-float v3, v9

    .line 889
    invoke-virtual {v11, v3}, Landroid/view/View;->setX(F)V

    .line 890
    invoke-virtual {v10, v12}, Landroid/view/View;->setX(F)V

    .line 892
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 891
    invoke-virtual {v1, v3}, Landroid/view/View;->setX(F)V

    .line 893
    invoke-virtual {v0, v12}, Landroid/view/View;->setX(F)V

    goto :goto_0

    .line 896
    :cond_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    sub-int/2addr v3, v9

    int-to-float v3, v3

    .line 895
    invoke-virtual {v11, v3}, Landroid/view/View;->setX(F)V

    .line 897
    invoke-virtual {v11}, Landroid/view/View;->getX()F

    move-result v3

    neg-float v3, v3

    invoke-virtual {v10, v3}, Landroid/view/View;->setX(F)V

    .line 898
    invoke-virtual {v1, v12}, Landroid/view/View;->setX(F)V

    .line 899
    invoke-virtual {v0, v12}, Landroid/view/View;->setX(F)V

    .line 903
    :goto_0
    iget-boolean v3, p0, Ll/ۗۙܿ;->ۗ:Z

    if-eqz v3, :cond_1

    int-to-float v3, v7

    .line 904
    invoke-virtual {v11, v3}, Landroid/view/View;->setY(F)V

    .line 906
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 905
    invoke-virtual {v10, v3}, Landroid/view/View;->setY(F)V

    .line 908
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    .line 907
    invoke-virtual {v1, v2}, Landroid/view/View;->setY(F)V

    .line 909
    invoke-virtual {v0, v12}, Landroid/view/View;->setY(F)V

    return-void

    :cond_1
    int-to-float v2, v7

    .line 912
    invoke-virtual {v11, v2}, Landroid/view/View;->setY(F)V

    .line 913
    invoke-virtual {v10, v12}, Landroid/view/View;->setY(F)V

    .line 914
    invoke-virtual {v1, v12}, Landroid/view/View;->setY(F)V

    .line 915
    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    return-void

    .line 919
    :cond_2
    iget-object v2, p0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    .line 920
    invoke-static {v11, v2}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 921
    invoke-virtual {v10, v5}, Landroid/view/View;->setAlpha(F)V

    .line 922
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 923
    invoke-virtual {v0, v12}, Landroid/view/View;->setAlpha(F)V

    .line 924
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 925
    iget-object v4, p0, Ll/ۗۙܿ;->۬:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1077
    iget-object v4, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v4, :cond_5

    .line 931
    invoke-direct {p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_3

    int-to-float v3, v9

    .line 932
    invoke-virtual {v11, v3}, Landroid/view/View;->setX(F)V

    .line 933
    invoke-virtual {v10, v12}, Landroid/view/View;->setX(F)V

    .line 934
    invoke-virtual {v1, v12}, Landroid/view/View;->setX(F)V

    .line 935
    invoke-virtual {v0, v12}, Landroid/view/View;->setX(F)V

    goto :goto_1

    .line 938
    :cond_3
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    sub-int/2addr v3, v9

    int-to-float v3, v3

    .line 937
    invoke-virtual {v11, v3}, Landroid/view/View;->setX(F)V

    .line 939
    invoke-virtual {v10, v12}, Landroid/view/View;->setX(F)V

    .line 941
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 940
    invoke-virtual {v1, v3}, Landroid/view/View;->setX(F)V

    .line 943
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v3

    iget-object v4, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 942
    invoke-virtual {v0, v3}, Landroid/view/View;->setX(F)V

    .line 947
    :goto_1
    iget-boolean v3, p0, Ll/ۗۙܿ;->ۗ:Z

    if-eqz v3, :cond_4

    .line 948
    iget-object v3, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    .line 949
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    add-int/2addr v3, v7

    .line 950
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 948
    invoke-virtual {v11, v3}, Landroid/view/View;->setY(F)V

    .line 951
    invoke-virtual {v10, v12}, Landroid/view/View;->setY(F)V

    .line 952
    invoke-virtual {v1, v12}, Landroid/view/View;->setY(F)V

    .line 954
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v1

    iget-object v2, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    .line 953
    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    return-void

    :cond_4
    int-to-float v2, v7

    .line 957
    invoke-virtual {v11, v2}, Landroid/view/View;->setY(F)V

    .line 958
    invoke-virtual {v10, v12}, Landroid/view/View;->setY(F)V

    .line 959
    invoke-virtual {v1, v12}, Landroid/view/View;->setY(F)V

    .line 960
    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    return-void

    :cond_5
    int-to-float v0, v9

    .line 964
    invoke-virtual {v11, v0}, Landroid/view/View;->setX(F)V

    int-to-float v0, v7

    .line 965
    invoke-virtual {v11, v0}, Landroid/view/View;->setY(F)V

    .line 966
    invoke-virtual {v10, v12}, Landroid/view/View;->setX(F)V

    .line 967
    invoke-virtual {v10, v12}, Landroid/view/View;->setY(F)V

    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 1205
    iget-object v0, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1077
    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v1, :cond_0

    .line 1210
    iget-object v1, p0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1212
    :cond_0
    iget-object v1, p0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1077
    iget-object v1, p0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    if-eqz v1, :cond_1

    .line 1214
    iget-object v1, p0, Ll/ۗۙܿ;->۫:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1216
    :cond_1
    invoke-direct {p0}, Ll/ۗۙܿ;->᩷()V

    .line 1217
    invoke-direct {p0}, Ll/ۗۙܿ;->ۜ()V

    .line 1222
    invoke-direct {p0}, Ll/ۗۙܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 1223
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1224
    iget-object v1, p0, Ll/ۗۙܿ;->֫֫:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۗۙܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗۙܿ;->ۗ:Z

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 404
    iget-boolean v0, p0, Ll/ۗۙܿ;->ۜ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 409
    iput-boolean v0, p0, Ll/ۗۙܿ;->ۜ:Z

    .line 410
    iget-object v0, p0, Ll/ۗۙܿ;->ۡ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 411
    iget-object v0, p0, Ll/ۗۙܿ;->֫:Ll/۠ۙܿ;

    invoke-virtual {v0}, Ll/۠ۙܿ;->֫()V

    .line 684
    iget-object v0, p0, Ll/ۗۙܿ;->᩻:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 685
    iget-object v0, p0, Ll/ۗۙܿ;->ܺ֫:Ll/ۛ᩶ܿ;

    if-eqz v0, :cond_1

    .line 687
    iget-object v0, v0, Ll/ۛ᩶ܿ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩺᩶ܿ;

    .line 80
    check-cast v0, Ll/ۛۤᩳ;

    iget-object v0, v0, Ll/ۛۤᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Ll/۫ۨᩳ;->ۧ(Ljava/util/ArrayList;)V

    .line 1032
    :cond_1
    iget-object v0, p0, Ll/ۗۙܿ;->᩻֫:Landroid/graphics/Region;

    invoke-virtual {v0}, Landroid/graphics/Region;->setEmpty()V

    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 522
    iget-object v0, p0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float p1, p1, v1

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 420
    iget-boolean v0, p0, Ll/ۗۙܿ;->ۜ:Z

    if-nez v0, :cond_0

    .line 421
    iget-object v0, p0, Ll/ۗۙܿ;->֫:Ll/۠ۙܿ;

    invoke-virtual {v0, p1, p2}, Ll/۠ۙܿ;->֫(J)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;Ll/ۤ᩶ܿ;Landroid/graphics/Rect;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 362
    iget-object v2, v0, Ll/ۗۙܿ;->֫:Ll/۠ۙܿ;

    invoke-virtual {v2}, Ll/۠ۙܿ;->֫()V

    .line 343
    iget-object v2, v0, Ll/ۗۙܿ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    .line 1791
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    iget-object v5, v0, Ll/ۗۙܿ;->ܰ:Landroid/view/View;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 1795
    :cond_0
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1796
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/MenuItem;

    .line 1797
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/MenuItem;

    .line 1798
    invoke-static {v4}, Ll/᩹ۙܿ;->֫(Landroid/view/MenuItem;)Ll/᩹ۙܿ;

    move-result-object v4

    invoke-static {v8}, Ll/᩹ۙܿ;->֫(Landroid/view/MenuItem;)Ll/᩹ۙܿ;

    move-result-object v8

    invoke-virtual {v4, v8}, Ll/᩹ۙܿ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 363
    :cond_2
    iget-boolean v2, v0, Ll/ۗۙܿ;->ۢ֫:Z

    if-eqz v2, :cond_16

    .line 364
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ۗۙܿ;->֫()V

    .line 313
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ᩳ()V

    const/4 v2, 0x0

    .line 1232
    iput-object v2, v0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    .line 1233
    iput-object v2, v0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    .line 1234
    iput-boolean v7, v0, Ll/ۗۙܿ;->ۘ:Z

    .line 1235
    iget-object v3, v0, Ll/ۗۙܿ;->ۚ:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1238
    iget-object v4, v0, Ll/ۗۙܿ;->ۛ:Ll/᩶ۙܿ;

    invoke-virtual {v4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v8

    check-cast v8, Landroid/widget/ArrayAdapter;

    .line 1239
    invoke-virtual {v8}, Landroid/widget/ArrayAdapter;->clear()V

    .line 1240
    invoke-virtual {v4, v8}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1241
    iget-object v8, v0, Ll/ۗۙܿ;->ᩳ:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 315
    invoke-direct/range {p0 .. p2}, Ll/ۗۙܿ;->֫(Ljava/util/ArrayList;Ll/ۤ᩶ܿ;)V

    .line 1012
    iget-object v8, v0, Ll/ۗۙܿ;->᩷֫:Landroid/graphics/Rect;

    invoke-virtual {v5, v8}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1018
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v8

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0700bb

    .line 1019
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    sub-int/2addr v8, v9

    .line 1021
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f0700c6

    .line 1022
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    .line 1024
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 1092
    new-instance v9, Ljava/util/LinkedList;

    invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V

    .line 1094
    new-instance v10, Ljava/util/LinkedList;

    invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V

    .line 1095
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/MenuItem;

    .line 17
    move-object v13, v12

    check-cast v13, Ll/ܰ۬;

    invoke-interface {v13}, Ll/ܰ۬;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_3

    .line 1097
    invoke-virtual {v10, v12}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1099
    :cond_3
    invoke-virtual {v9, v12}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1102
    :cond_4
    invoke-virtual {v9, v10}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1104
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1105
    invoke-virtual {v3, v7, v7, v7, v7}, Landroid/view/View;->setPaddingRelative(IIII)V

    const/4 v7, 0x1

    move v10, v8

    .line 1108
    :goto_2
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v11

    iget-object v12, v0, Ll/ۗۙܿ;->ۤ:Landroid/util/Size;

    if-nez v11, :cond_d

    .line 1109
    invoke-virtual {v9}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/MenuItem;

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v7, :cond_5

    .line 17
    move-object v13, v11

    check-cast v13, Ll/ܰ۬;

    invoke-interface {v13}, Ll/ܰ۬;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_5

    goto/16 :goto_7

    .line 1567
    :cond_5
    iget-object v13, v0, Ll/ۗۙܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-static {v13}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v13

    const v14, 0x7f0d012a

    .line 1568
    invoke-virtual {v13, v14, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 1570
    iget v13, v0, Ll/ۗۙܿ;->ܺ:I

    invoke-direct {v0, v2, v11, v13, v6}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/view/MenuItem;IZ)V

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    if-eqz v7, :cond_6

    .line 1126
    invoke-virtual {v2}, Landroid/view/View;->getPaddingStart()I

    move-result v7

    move-object/from16 v16, v4

    move-object v15, v5

    int-to-double v4, v7

    mul-double v4, v4, v13

    double-to-int v4, v4

    .line 1127
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    .line 1128
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    move-result v7

    .line 1129
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    .line 1125
    invoke-virtual {v2, v4, v5, v7, v13}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_3

    :cond_6
    move-object/from16 v16, v4

    move-object v15, v5

    .line 1133
    :goto_3
    invoke-virtual {v9}, Ljava/util/LinkedList;->size()I

    move-result v4

    if-ne v4, v6, :cond_7

    const/4 v4, 0x1

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_8

    .line 1136
    invoke-virtual {v2}, Landroid/view/View;->getPaddingStart()I

    move-result v5

    .line 1137
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    .line 1138
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    move-result v7

    int-to-double v13, v7

    const-wide/high16 v17, 0x3ff8000000000000L    # 1.5

    mul-double v13, v13, v17

    double-to-int v7, v13

    .line 1139
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    .line 1135
    invoke-virtual {v2, v5, v6, v7, v13}, Landroid/view/View;->setPaddingRelative(IIII)V

    :cond_8
    const/4 v5, 0x0

    .line 1142
    invoke-virtual {v2, v5, v5}, Landroid/view/View;->measure(II)V

    .line 1144
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 1143
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 1148
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v6

    sub-int v6, v10, v6

    if-gt v5, v6, :cond_9

    const/4 v6, 0x1

    goto :goto_5

    :cond_9
    const/4 v6, 0x0

    :goto_5
    if-eqz v4, :cond_a

    if-gt v5, v10, :cond_a

    const/4 v4, 0x1

    goto :goto_6

    :cond_a
    const/4 v4, 0x0

    :goto_6
    if-nez v6, :cond_b

    if-eqz v4, :cond_e

    .line 1282
    :cond_b
    invoke-static {v11}, Ll/᩹ۙܿ;->֫(Landroid/view/MenuItem;)Ll/᩹ۙܿ;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1283
    iget-object v4, v0, Ll/ۗۙܿ;->᩸:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    check-cast v11, Ll/ܰ۬;

    invoke-interface {v11}, Ll/ܰ۬;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 1154
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 1155
    invoke-static {v2, v4}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1157
    :cond_c
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 427
    new-instance v4, Ll/ۧۙܿ;

    invoke-direct {v4, v0}, Ll/ۧۙܿ;-><init>(Ll/ۗۙܿ;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1159
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 1160
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1161
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sub-int/2addr v10, v5

    .line 1163
    invoke-virtual {v9}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v5, v15

    move-object/from16 v4, v16

    goto/16 :goto_2

    :cond_d
    :goto_7
    move-object/from16 v16, v4

    move-object v15, v5

    .line 1170
    :cond_e
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    .line 1172
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v2, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_8

    :cond_f
    const/4 v4, 0x0

    .line 1425
    :goto_8
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_10

    const/4 v2, 0x1

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_15

    .line 1426
    invoke-virtual {v3, v4, v4}, Landroid/view/View;->measure(II)V

    .line 1427
    new-instance v2, Landroid/util/Size;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-direct {v2, v4, v3}, Landroid/util/Size;-><init>(II)V

    .line 1175
    iput-object v2, v0, Ll/ۗۙܿ;->֨:Landroid/util/Size;

    .line 317
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_14

    .line 1182
    invoke-virtual/range {v16 .. v16}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    check-cast v2, Landroid/widget/ArrayAdapter;

    .line 1183
    invoke-virtual {v2}, Landroid/widget/ArrayAdapter;->clear()V

    .line 1184
    invoke-virtual {v9}, Ljava/util/LinkedList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v3, :cond_11

    .line 1186
    invoke-virtual {v9, v4}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/MenuItem;

    invoke-virtual {v2, v5}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_11
    move-object/from16 v4, v16

    .line 1188
    invoke-virtual {v4, v2}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1189
    iget-boolean v2, v0, Ll/ۗۙܿ;->ۗ:Z

    if-eqz v2, :cond_12

    const/4 v2, 0x0

    .line 1190
    invoke-virtual {v4, v2}, Landroid/view/View;->setY(F)V

    goto :goto_b

    .line 1192
    :cond_12
    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v4, v2}, Landroid/view/View;->setY(F)V

    .line 1254
    :goto_b
    invoke-virtual {v4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    invoke-interface {v2}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_c
    if-ge v3, v2, :cond_13

    .line 1256
    invoke-virtual {v4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v6

    invoke-interface {v6, v3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/MenuItem;

    .line 1257
    iget-object v7, v0, Ll/ۗۙܿ;->᩺:Ll/ۙۙܿ;

    .line 1258
    invoke-virtual {v7, v6}, Ll/ۙۙܿ;->֫(Landroid/view/MenuItem;)I

    move-result v6

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    .line 1195
    :cond_13
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v3, 0xa

    .line 1196
    invoke-direct {v0, v3}, Ll/ۗۙܿ;->֫(I)I

    move-result v3

    .line 1197
    new-instance v5, Landroid/util/Size;

    invoke-direct {v5, v2, v3}, Landroid/util/Size;-><init>(II)V

    iput-object v5, v0, Ll/ۗۙܿ;->ۨ:Landroid/util/Size;

    .line 1198
    invoke-static {v4, v5}, Ll/ۗۙܿ;->֫(Landroid/view/View;Landroid/util/Size;)V

    .line 321
    :cond_14
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ۢ()V

    goto :goto_d

    .line 168
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    move-object v15, v5

    .line 367
    invoke-direct/range {p0 .. p2}, Ll/ۗۙܿ;->֫(Ljava/util/ArrayList;Ll/ۤ᩶ܿ;)V

    .line 512
    :goto_d
    iget-boolean v2, v0, Ll/ۗۙܿ;->ۜ:Z

    .line 369
    iget-object v3, v0, Ll/ۗۙܿ;->ۧ֫:Landroid/graphics/Rect;

    iget-object v4, v0, Ll/ۗۙܿ;->ܳ:Landroid/graphics/Point;

    iget-object v5, v0, Ll/ۗۙܿ;->۟:Landroid/widget/PopupWindow;

    if-eqz v2, :cond_1a

    .line 379
    invoke-static/range {p3 .. p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    iget-boolean v2, v0, Ll/ۗۙܿ;->ۜ:Z

    if-nez v2, :cond_17

    goto/16 :goto_10

    :cond_17
    const/4 v2, 0x0

    .line 386
    iput-boolean v2, v0, Ll/ۗۙܿ;->ۜ:Z

    .line 699
    iget-object v6, v0, Ll/ۗۙܿ;->᩻:Landroid/animation/AnimatorSet;

    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->cancel()V

    .line 700
    iget-object v6, v0, Ll/ۗۙܿ;->ۡ:Landroid/animation/AnimatorSet;

    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->cancel()V

    .line 388
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ᩳ()V

    .line 390
    invoke-direct {v0, v1}, Ll/ۗۙܿ;->֫(Landroid/graphics/Rect;)V

    .line 391
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->᩻()V

    .line 395
    invoke-virtual {v5, v2}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 396
    iget v6, v4, Landroid/graphics/Point;->x:I

    iget v4, v4, Landroid/graphics/Point;->y:I

    move-object v7, v15

    invoke-virtual {v5, v7, v2, v6, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 1063
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v2

    .line 1064
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    .line 1065
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    const-string v4, "android.view.ViewTreeObserver$OnComputeInternalInsetsListener"

    .line 82
    iget-object v5, v0, Ll/ۗۙܿ;->ۖ:Ljava/lang/Object;

    if-nez v2, :cond_18

    goto :goto_e

    :cond_18
    :try_start_0
    const-string v6, "removeOnComputeInternalInsetsListener"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "android.view.ViewTreeObserver$OnComputeInternalInsetsListener"

    .line 23
    :try_start_1
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Class;

    const/4 v10, 0x0

    aput-object v7, v9, v10

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v6, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v7, v8, [Ljava/lang/Object;

    aput-object v5, v7, v10

    .line 87
    invoke-virtual {v6, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_e

    :catch_0
    nop

    :goto_e
    if-nez v2, :cond_19

    goto :goto_f

    :cond_19
    :try_start_2
    const-string v6, "addOnComputeInternalInsetsListener"

    .line 23
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Class;

    const/4 v9, 0x0

    aput-object v4, v8, v9

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v5, v6, v9

    .line 66
    invoke-virtual {v4, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 670
    :catch_1
    :goto_f
    iget-object v2, v0, Ll/ۗۙܿ;->ܽ֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_10

    .line 371
    :cond_1a
    invoke-virtual {v3, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 531
    invoke-static/range {p3 .. p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    iget-boolean v2, v0, Ll/ۗۙܿ;->ۜ:Z

    if-nez v2, :cond_1c

    .line 533
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_10

    .line 537
    :cond_1b
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->ᩳ()V

    .line 538
    invoke-direct {v0, v1}, Ll/ۗۙܿ;->֫(Landroid/graphics/Rect;)V

    .line 539
    invoke-direct/range {p0 .. p0}, Ll/ۗۙܿ;->᩻()V

    .line 543
    iget v2, v4, Landroid/graphics/Point;->x:I

    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 545
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v6

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v7

    .line 543
    invoke-virtual {v5, v2, v4, v6, v7}, Landroid/widget/PopupWindow;->update(IIII)V

    :cond_1c
    :goto_10
    const/4 v2, 0x0

    .line 374
    iput-boolean v2, v0, Ll/ۗۙܿ;->ۢ֫:Z

    .line 375
    invoke-virtual {v3, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ֫(Ll/ۛ᩶ܿ;)V
    .locals 0

    .line 677
    iput-object p1, p0, Ll/ۗۙܿ;->ܺ֫:Ll/ۛ᩶ܿ;

    return-void
.end method

.method public final ֫(Ll/۬ۙܿ;Ll/۬ۙܿ;)V
    .locals 0

    .line 1625
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۗۙܿ;->ۡ֫:Ll/۬ۙܿ;

    .line 1626
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۗۙܿ;->ۖ֫:Ll/۬ۙܿ;

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 289
    iget v0, p0, Ll/ۗۙܿ;->ᩴ:I

    iget v1, p0, Ll/ۗۙܿ;->ܶ:I

    add-int/2addr v0, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 348
    iput-boolean v0, p0, Ll/ۗۙܿ;->ۢ֫:Z

    return-void
.end method
