.class public final Ll/ۚܳ;
.super Ll/۬ܿ;
.source "422Y"

# interfaces
.implements Ll/᩶ۜ;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final ֡ۧ:[I

.field public static final ᩴۧ:Z

.field public static final ᩵ۧ:Ll/ۗ᩵;


# instance fields
.field public ֡֫:Landroid/window/OnBackInvokedDispatcher;

.field public ֨֫:Z

.field public ֫֫:Landroid/widget/PopupWindow;

.field public ֫ۧ:Ll/֡ܳ;

.field public final ۖ֫:Landroid/content/Context;

.field public ۖۧ:Landroid/view/Window;

.field public ۗ֫:I

.field public ۘ֫:Z

.field public ۘۧ:Z

.field public final ۙ֫:Ljava/lang/Object;

.field public ۚ֫:Landroid/content/res/Configuration;

.field public ۛ֫:I

.field public ۜ֫:Ll/ۡܳ;

.field public ۜۧ:Landroid/graphics/Rect;

.field public ۟:Ll/ۗ᩻;

.field public ۟֫:Z

.field public ۠֫:Ll/ܶ᩺;

.field public ۡ֫:Z

.field public ۡۧ:Ljava/lang/CharSequence;

.field public ۢ֫:Landroid/window/OnBackInvokedCallback;

.field public ۢۧ:I

.field public ۤ֫:Z

.field public ۧ֫:Ll/᩹᩷;

.field public ۧۧ:[Ll/᩵ܳ;

.field public ۨ֫:Z

.field public final ۫֫:Ljava/lang/Runnable;

.field public ۬֫:Z

.field public ܰ:Ll/ۧܳ;

.field public ܰ֫:Z

.field public ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;

.field public ܳۧ:Landroid/view/ViewGroup;

.field public ܶ֫:Z

.field public ܺ֫:Z

.field public ܺۧ:Landroid/widget/TextView;

.field public ܽ֫:I

.field public ܽۧ:Ll/᩵ܳ;

.field public final ܿ֫:Ljava/lang/Object;

.field public ܿۧ:Landroid/view/View;

.field public ᩳ֫:Z

.field public ᩳۧ:Ljava/lang/Runnable;

.field public ᩴ֫:Ll/᩵ܺ;

.field public ᩵֫:Z

.field public ᩶֫:Z

.field public ᩷֫:Ll/ۘܳ;

.field public ᩷ۧ:Landroid/graphics/Rect;

.field public ᩸֫:Z

.field public ᩹֫:Z

.field public ᩺:Ll/ۤᩳ;

.field public ᩺֫:Ll/۟᩻;

.field public ᩻֫:Ll/ۢܳ;

.field public ᩻ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 141
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    sput-object v0, Ll/ۚܳ;->᩵ۧ:Ll/ۗ᩵;

    const v0, 0x1010054

    .line 144
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۚܳ;->֡ۧ:[I

    const-string v0, "robolectric"

    .line 150
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Ll/ۚܳ;->ᩴۧ:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Ll/۠ܿ;Ljava/lang/Object;)V
    .locals 3

    .line 309
    invoke-direct {p0}, Ll/۬ܿ;-><init>()V

    const/4 v0, 0x0

    .line 213
    iput-object v0, p0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    const/4 v1, 0x1

    .line 215
    iput-boolean v1, p0, Ll/ۚܳ;->᩹֫:Z

    const/16 v1, -0x64

    .line 257
    iput v1, p0, Ll/ۚܳ;->ۛ֫:I

    .line 268
    new-instance v2, Ll/۫ܿ;

    invoke-direct {v2, p0}, Ll/۫ܿ;-><init>(Ll/ۚܳ;)V

    iput-object v2, p0, Ll/ۚܳ;->۫֫:Ljava/lang/Runnable;

    .line 310
    iput-object p1, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    .line 311
    iput-object p3, p0, Ll/ۚܳ;->ܿ֫:Ljava/lang/Object;

    .line 312
    iput-object p4, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    .line 314
    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    .line 1721
    instance-of p3, p1, Ll/֨ܿ;

    if-eqz p3, :cond_0

    .line 1722
    check-cast p1, Ll/֨ܿ;

    goto :goto_1

    .line 1724
    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    .line 1725
    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    .line 322
    invoke-virtual {p1}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ܿ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ۚܳ;->ۛ֫:I

    .line 325
    :cond_2
    iget p1, p0, Ll/ۚܳ;->ۛ֫:I

    if-ne p1, v1, :cond_3

    .line 327
    iget-object p1, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 369
    sget-object p3, Ll/ۚܳ;->᩵ۧ:Ll/ۗ᩵;

    invoke-virtual {p3, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 327
    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    .line 329
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ۚܳ;->ۛ֫:I

    .line 331
    iget-object p1, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    .line 336
    invoke-direct {p0, p2}, Ll/ۚܳ;->֫(Landroid/view/Window;)V

    .line 343
    :cond_4
    invoke-static {}, Ll/ۛۢ;->ܽ()V

    return-void
.end method

.method public constructor <init>(Ll/֨ܿ;Ll/֨ܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 293
    invoke-direct {p0, p1, v0, p2, p1}, Ll/ۚܳ;-><init>(Landroid/content/Context;Landroid/view/Window;Ll/۠ܿ;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ll/۠ܳ;Ll/۠ܳ;)V
    .locals 2

    .line 297
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Ll/ۚܳ;-><init>(Landroid/content/Context;Landroid/view/Window;Ll/۠ܿ;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;ILl/ۘ۫;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 2712
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    .line 2713
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    goto :goto_0

    :cond_1
    const/16 p0, 0x20

    goto :goto_0

    :cond_2
    const/16 p0, 0x10

    .line 2719
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    const/4 p4, 0x0

    .line 2720
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_3

    .line 2722
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 2724
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p0, p3

    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_5

    .line 2664
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p0, p3, :cond_4

    .line 2665
    invoke-static {p1, p2}, Ll/ܳܳ;->֫(Landroid/content/res/Configuration;Ll/ۘ۫;)V

    return-object p1

    .line 2667
    :cond_4
    invoke-virtual {p2, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 2668
    invoke-virtual {p2, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    :cond_5
    return-object p1
.end method

.method private ֫(Landroid/view/Window;)V
    .locals 3

    .line 832
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_5

    .line 837
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 838
    instance-of v2, v0, Ll/ۢܳ;

    if-nez v2, :cond_4

    .line 842
    new-instance v1, Ll/ۢܳ;

    invoke-direct {v1, p0, v0}, Ll/ۢܳ;-><init>(Ll/ۚܳ;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    .line 844
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 846
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    sget-object v1, Ll/ۚܳ;->֡ۧ:[I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object v0

    const/4 v1, 0x0

    .line 848
    invoke-virtual {v0, v1}, Ll/᩺ۘ;->ܿ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 851
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 853
    :cond_0
    invoke-virtual {v0}, Ll/᩺ۘ;->ܿ()V

    .line 855
    iput-object p1, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    .line 858
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    if-nez p1, :cond_3

    if-eqz p1, :cond_1

    .line 352
    iget-object v0, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    .line 353
    invoke-static {p1, v0}, Ll/᩷ܳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    iput-object v2, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    .line 357
    :cond_1
    iget-object p1, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/app/Activity;

    .line 358
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 359
    invoke-static {p1}, Ll/᩷ܳ;->֫(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    iput-object p1, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    goto :goto_0

    .line 361
    :cond_2
    iput-object v2, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    .line 365
    :goto_0
    invoke-virtual {p0}, Ll/ۚܳ;->ۙ()V

    :cond_3
    return-void

    .line 839
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 833
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/᩵ܳ;Landroid/view/KeyEvent;)V
    .locals 12

    .line 1735
    iget-boolean v0, p1, Ll/᩵ܳ;->ۜ:Z

    iget v1, p1, Ll/᩵ܳ;->ᩳ:I

    if-nez v0, :cond_15

    iget-boolean v0, p0, Ll/ۚܳ;->᩵֫:Z

    if-eqz v0, :cond_0

    goto/16 :goto_7

    .line 1741
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    if-nez v1, :cond_1

    .line 1742
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 1743
    iget v2, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0xf

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1

    goto/16 :goto_7

    .line 577
    :cond_1
    iget-object v2, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 1751
    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-interface {v2, v1, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1753
    invoke-virtual {p0, p1, v3}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    return-void

    :cond_2
    const-string v2, "window"

    .line 1757
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_3

    goto/16 :goto_7

    .line 1763
    :cond_3
    invoke-direct {p0, p1, p2}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_4

    goto/16 :goto_7

    .line 1768
    :cond_4
    iget-object p2, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    const/4 v4, -0x2

    if-eqz p2, :cond_6

    iget-boolean v5, p1, Ll/᩵ܳ;->ۖ:Z

    if-eqz v5, :cond_5

    goto :goto_0

    .line 1807
    :cond_5
    iget-object p2, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    if-eqz p2, :cond_13

    .line 1810
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_13

    .line 1811
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne p2, v4, :cond_13

    const/4 p2, -0x1

    const/4 v5, -0x1

    goto/16 :goto_5

    :cond_6
    :goto_0
    if-nez p2, :cond_9

    .line 1838
    invoke-virtual {p0}, Ll/ۚܳ;->ܶ()Landroid/content/Context;

    move-result-object p2

    .line 3188
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 3189
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    .line 3190
    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    const v7, 0x7f040002

    .line 3193
    invoke-virtual {v6, v7, v5, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 3194
    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_7

    .line 3195
    invoke-virtual {v6, v7, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_7
    const v7, 0x7f0403a2

    .line 3199
    invoke-virtual {v6, v7, v5, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 3200
    iget v5, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_8

    .line 3201
    invoke-virtual {v6, v5, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_1

    :cond_8
    const v5, 0x7f130285

    .line 3203
    invoke-virtual {v6, v5, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 3206
    :goto_1
    new-instance v5, Ll/۫᩻;

    invoke-direct {v5, p2, v2}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    .line 3207
    invoke-virtual {v5}, Ll/۫᩻;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 3209
    iput-object v5, p1, Ll/᩵ܳ;->ۡ:Ll/۫᩻;

    .line 3211
    sget-object p2, Ll/ۗᩳ;->ۡ:[I

    invoke-virtual {v5, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/16 v5, 0x56

    .line 3212
    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, p1, Ll/᩵ܳ;->֫:I

    .line 3214
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, p1, Ll/᩵ܳ;->᩵:I

    .line 3216
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 1839
    new-instance p2, Ll/ᩴܳ;

    iget-object v5, p1, Ll/᩵ܳ;->ۡ:Ll/۫᩻;

    invoke-direct {p2, p0, v5}, Ll/ᩴܳ;-><init>(Ll/ۚܳ;Ll/۫᩻;)V

    iput-object p2, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    const/16 p2, 0x51

    .line 1840
    iput p2, p1, Ll/᩵ܳ;->ܳ:I

    goto :goto_2

    .line 1773
    :cond_9
    iget-boolean v5, p1, Ll/᩵ܳ;->ۖ:Z

    if-eqz v5, :cond_a

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_a

    .line 1775
    iget-object p2, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1932
    :cond_a
    :goto_2
    iget-object p2, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    if-eqz p2, :cond_b

    .line 1933
    iput-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    goto :goto_3

    .line 1937
    :cond_b
    iget-object p2, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-nez p2, :cond_c

    goto/16 :goto_6

    .line 1941
    :cond_c
    iget-object p2, p0, Ll/ۚܳ;->֫ۧ:Ll/֡ܳ;

    if-nez p2, :cond_d

    .line 1942
    new-instance p2, Ll/֡ܳ;

    invoke-direct {p2, p0}, Ll/֡ܳ;-><init>(Ll/ۚܳ;)V

    iput-object p2, p0, Ll/ۚܳ;->֫ۧ:Ll/֡ܳ;

    .line 1945
    :cond_d
    iget-object p2, p0, Ll/ۚܳ;->֫ۧ:Ll/֡ܳ;

    .line 3234
    iget-object v5, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    if-nez v5, :cond_e

    .line 3235
    new-instance v5, Ll/᩸ۜ;

    iget-object v6, p1, Ll/᩵ܳ;->ۡ:Ll/۫᩻;

    invoke-direct {v5, v6}, Ll/᩸ۜ;-><init>(Landroid/content/Context;)V

    iput-object v5, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    .line 3237
    invoke-virtual {v5, p2}, Ll/᩸ۜ;->setCallback(Ll/ܿ᩷;)V

    .line 3238
    iget-object p2, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    iget-object v5, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    invoke-virtual {p2, v5}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;)V

    .line 3241
    :cond_e
    iget-object p2, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    iget-object v5, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    invoke-virtual {p2, v5}, Ll/᩸ۜ;->֫(Landroid/view/ViewGroup;)Ll/ۜ᩷;

    move-result-object p2

    .line 1947
    check-cast p2, Landroid/view/View;

    iput-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    if-eqz p2, :cond_14

    .line 3171
    :goto_3
    iget-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    if-nez p2, :cond_f

    goto :goto_6

    .line 3172
    :cond_f
    iget-object p2, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    if-eqz p2, :cond_10

    goto :goto_4

    .line 3174
    :cond_10
    iget-object p2, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    invoke-virtual {p2}, Ll/᩸ۜ;->֫()Landroid/widget/ListAdapter;

    move-result-object p2

    invoke-interface {p2}, Landroid/widget/Adapter;->getCount()I

    move-result p2

    if-lez p2, :cond_14

    .line 1786
    :goto_4
    iget-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_11

    .line 1788
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1791
    :cond_11
    iget v4, p1, Ll/᩵ܳ;->֫:I

    .line 1792
    iget-object v5, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1794
    iget-object v4, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 1795
    instance-of v5, v4, Landroid/view/ViewGroup;

    if-eqz v5, :cond_12

    .line 1796
    check-cast v4, Landroid/view/ViewGroup;

    iget-object v5, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1798
    :cond_12
    iget-object v4, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    iget-object v5, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {v4, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1804
    iget-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_13

    .line 1805
    iget-object p2, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_13
    const/4 p2, -0x2

    const/4 v5, -0x2

    .line 1816
    :goto_5
    iput-boolean v2, p1, Ll/᩵ܳ;->᩻:Z

    .line 1818
    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/high16 v10, 0x820000

    const/4 v11, -0x3

    const/4 v6, -0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3ea

    move-object v4, p2

    invoke-direct/range {v4 .. v11}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 1825
    iget v2, p1, Ll/᩵ܳ;->ܳ:I

    iput v2, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 1826
    iget v2, p1, Ll/᩵ܳ;->᩵:I

    iput v2, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 1828
    iget-object v2, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    invoke-interface {v0, v2, p2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1829
    iput-boolean v3, p1, Ll/᩵ܳ;->ۜ:Z

    if-nez v1, :cond_15

    .line 1833
    invoke-virtual {p0}, Ll/ۚܳ;->ۙ()V

    return-void

    .line 1782
    :cond_14
    :goto_6
    iput-boolean v3, p1, Ll/᩵ܳ;->ۖ:Z

    :cond_15
    :goto_7
    return-void
.end method

.method private ֫(Ll/᩵ܳ;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 2235
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2243
    :cond_0
    iget-boolean v0, p1, Ll/᩵ܳ;->᩷:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p3}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object p1, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    .line 2245
    invoke-virtual {p1, p2, p3, v0}, Ll/ۗۜ;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    return v1
.end method

.method private ֫(ZZ)Z
    .locals 13

    .line 2511
    iget-boolean v0, p0, Ll/ۚܳ;->᩵֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2660
    :cond_0
    iget v0, p0, Ll/ۚܳ;->ۛ֫:I

    const/16 v2, -0x64

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ll/۬ܿ;->᩵()I

    move-result v0

    .line 2521
    :goto_0
    iget-object v2, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {p0, v2, v0}, Ll/ۚܳ;->֫(Landroid/content/Context;I)I

    move-result v3

    .line 2524
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    const/4 v6, 0x0

    if-ge v4, v5, :cond_2

    .line 2525
    invoke-static {v2}, Ll/ۚܳ;->ܿ(Landroid/content/Context;)Ll/ۘ۫;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    if-nez p2, :cond_3

    if-eqz v5, :cond_3

    .line 2533
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 2534
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    .line 2533
    invoke-static {p2}, Ll/ۚܳ;->ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object v5

    .line 2747
    :cond_3
    invoke-static {v2, v3, v5, v6, v1}, Ll/ۚܳ;->֫(Landroid/content/Context;ILl/ۘ۫;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object p2

    .line 2945
    iget-boolean v3, p0, Ll/ۚܳ;->ᩳ֫:Z

    const/16 v7, 0x18

    const/4 v8, 0x1

    iget-object v9, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    if-nez v3, :cond_7

    instance-of v3, v9, Landroid/app/Activity;

    if-eqz v3, :cond_7

    .line 2947
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    const/16 v10, 0x1d

    if-lt v4, v10, :cond_5

    const/high16 v4, 0x100c0000

    goto :goto_2

    :cond_5
    if-lt v4, v7, :cond_6

    const/high16 v4, 0xc0000

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    .line 2966
    :goto_2
    :try_start_0
    new-instance v10, Landroid/content/ComponentName;

    .line 2967
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-direct {v10, v2, v11}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2966
    invoke-virtual {v3, v10, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 2969
    iget v3, v3, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput v3, p0, Ll/ۚܳ;->ܽ֫:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 2975
    :catch_0
    iput v1, p0, Ll/ۚܳ;->ܽ֫:I

    .line 2979
    :cond_7
    :goto_3
    iput-boolean v8, p0, Ll/ۚܳ;->ᩳ֫:Z

    .line 2980
    iget v3, p0, Ll/ۚܳ;->ܽ֫:I

    .line 2750
    :goto_4
    iget-object v4, p0, Ll/ۚܳ;->ۚ֫:Landroid/content/res/Configuration;

    if-nez v4, :cond_8

    .line 2751
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    .line 2752
    :cond_8
    iget v10, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v10, v10, 0x30

    .line 2754
    iget v11, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v11, v11, 0x30

    .line 2756
    invoke-static {v4}, Ll/ۚܳ;->ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object v4

    if-nez v5, :cond_9

    move-object v5, v6

    goto :goto_5

    .line 2761
    :cond_9
    invoke-static {p2}, Ll/ۚܳ;->ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object v5

    :goto_5
    if-eq v10, v11, :cond_a

    const/16 v10, 0x200

    goto :goto_6

    :cond_a
    const/4 v10, 0x0

    :goto_6
    if-eqz v5, :cond_b

    .line 2770
    invoke-virtual {v4, v5}, Ll/ۘ۫;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    or-int/lit16 v10, v10, 0x2004

    :cond_b
    not-int v4, v3

    and-int/2addr v4, v10

    if-eqz v4, :cond_f

    if-eqz p1, :cond_f

    .line 2793
    iget-boolean p1, p0, Ll/ۚܳ;->ۡ֫:Z

    if-eqz p1, :cond_f

    sget-boolean p1, Ll/ۚܳ;->ᩴۧ:Z

    if-nez p1, :cond_c

    iget-boolean p1, p0, Ll/ۚܳ;->ۘ֫:Z

    if-eqz p1, :cond_f

    :cond_c
    instance-of p1, v9, Landroid/app/Activity;

    if-eqz p1, :cond_f

    move-object p1, v9

    check-cast p1, Landroid/app/Activity;

    .line 2798
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    move-result v4

    if-nez v4, :cond_f

    .line 2809
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1f

    if-lt v4, v12, :cond_d

    and-int/lit16 v12, v10, 0x2000

    if-eqz v12, :cond_d

    .line 2811
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v12

    invoke-virtual {v12}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v12

    .line 2812
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p2

    invoke-virtual {v12, p2}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_d
    const/16 p2, 0x1c

    if-lt v4, p2, :cond_e

    .line 657
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    goto :goto_7

    .line 662
    :cond_e
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {p2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 663
    new-instance v4, Ll/ۜ᩹;

    invoke-direct {v4, p1}, Ll/ۜ᩹;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_7
    const/4 p1, 0x1

    goto :goto_8

    :cond_f
    const/4 p1, 0x0

    :goto_8
    if-nez p1, :cond_16

    if-eqz v10, :cond_16

    and-int p1, v10, v3

    if-ne p1, v10, :cond_10

    const/4 p1, 0x1

    goto :goto_9

    :cond_10
    const/4 p1, 0x0

    .line 2866
    :goto_9
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 2867
    new-instance v3, Landroid/content/res/Configuration;

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 2872
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, -0x31

    or-int/2addr v4, v11

    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    if-eqz v5, :cond_12

    .line 2664
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v7, :cond_11

    .line 2665
    invoke-static {v3, v5}, Ll/ܳܳ;->֫(Landroid/content/res/Configuration;Ll/ۘ۫;)V

    goto :goto_a

    .line 2667
    :cond_11
    invoke-virtual {v5, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 2668
    invoke-virtual {v5, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 2876
    :cond_12
    :goto_a
    invoke-virtual {p2, v3, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 2879
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1a

    if-ge v4, v6, :cond_13

    .line 2880
    invoke-static {p2}, Ll/ۙܳ;->֫(Landroid/content/res/Resources;)V

    .line 2883
    :cond_13
    iget p2, p0, Ll/ۚܳ;->ۢۧ:I

    if-eqz p2, :cond_14

    .line 2886
    invoke-virtual {v2, p2}, Landroid/content/Context;->setTheme(I)V

    const/16 p2, 0x17

    if-lt v4, p2, :cond_14

    .line 2894
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    iget v4, p0, Ll/ۚܳ;->ۢۧ:I

    invoke-virtual {p2, v4, v8}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_14
    if-eqz p1, :cond_17

    .line 2898
    instance-of p1, v9, Landroid/app/Activity;

    if-eqz p1, :cond_17

    .line 2904
    check-cast v9, Landroid/app/Activity;

    .line 2905
    instance-of p1, v9, Ll/᩻ۡ֫;

    if-eqz p1, :cond_15

    .line 2908
    move-object p1, v9

    check-cast p1, Ll/᩻ۡ֫;

    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    .line 2909
    invoke-virtual {p1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p1

    sget-object p2, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {p1, p2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 2910
    invoke-virtual {v9, v3}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_b

    .line 2914
    :cond_15
    iget-boolean p1, p0, Ll/ۚܳ;->ۘ֫:Z

    if-eqz p1, :cond_17

    iget-boolean p1, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez p1, :cond_17

    .line 2915
    invoke-virtual {v9, v3}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_b

    :cond_16
    move v8, p1

    :cond_17
    :goto_b
    if-eqz v5, :cond_19

    .line 2856
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    .line 2855
    invoke-static {p1}, Ll/ۚܳ;->ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object p1

    .line 2683
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v7, :cond_18

    .line 2684
    invoke-static {p1}, Ll/ܳܳ;->֫(Ll/ۘ۫;)V

    goto :goto_c

    .line 2686
    :cond_18
    invoke-virtual {p1, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    :cond_19
    :goto_c
    if-nez v0, :cond_1b

    .line 2930
    iget-object p1, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    if-nez p1, :cond_1a

    .line 2931
    new-instance p1, Ll/ۘܳ;

    .line 2932
    invoke-static {v2}, Ll/۟ܳ;->֫(Landroid/content/Context;)Ll/۟ܳ;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/ۘܳ;-><init>(Ll/ۚܳ;Ll/۟ܳ;)V

    iput-object p1, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    .line 2934
    :cond_1a
    iget-object p1, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    .line 2541
    invoke-virtual {p1}, Ll/ۖܳ;->ᩳ()V

    goto :goto_d

    .line 2542
    :cond_1b
    iget-object p1, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    if-eqz p1, :cond_1c

    .line 2544
    invoke-virtual {p1}, Ll/ۖܳ;->֫()V

    :cond_1c
    :goto_d
    const/4 p1, 0x3

    if-ne v0, p1, :cond_1e

    .line 2938
    iget-object p1, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    if-nez p1, :cond_1d

    .line 2939
    new-instance p1, Ll/ۡܳ;

    invoke-direct {p1, p0, v2}, Ll/ۡܳ;-><init>(Ll/ۚܳ;Landroid/content/Context;)V

    iput-object p1, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    .line 2941
    :cond_1d
    iget-object p1, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    .line 2547
    invoke-virtual {p1}, Ll/ۖܳ;->ᩳ()V

    goto :goto_e

    .line 2548
    :cond_1e
    iget-object p1, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    if-eqz p1, :cond_1f

    .line 2550
    invoke-virtual {p1}, Ll/ۖܳ;->֫()V

    :cond_1f
    :goto_e
    return v8
.end method

.method private ۗ()V
    .locals 11

    .line 864
    iget-boolean v0, p0, Ll/ۚܳ;->᩻ۧ:Z

    if-nez v0, :cond_1a

    .line 898
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    sget-object v1, Ll/ۗᩳ;->ۡ:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v3, 0x75

    .line 900
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_19

    const/16 v4, 0x7e

    const/4 v5, 0x0

    .line 906
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v6, 0x6c

    const/4 v7, 0x1

    if-eqz v4, :cond_0

    .line 907
    invoke-virtual {p0, v7}, Ll/ۚܳ;->ۧ(I)Z

    goto :goto_0

    .line 908
    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 910
    invoke-virtual {p0, v6}, Ll/ۚܳ;->ۧ(I)Z

    :cond_1
    :goto_0
    const/16 v3, 0x76

    .line 912
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/16 v4, 0x6d

    if-eqz v3, :cond_2

    .line 913
    invoke-virtual {p0, v4}, Ll/ۚܳ;->ۧ(I)Z

    :cond_2
    const/16 v3, 0x77

    .line 915
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    .line 916
    invoke-virtual {p0, v3}, Ll/ۚܳ;->ۧ(I)Z

    .line 918
    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Ll/ۚܳ;->ۤ֫:Z

    .line 919
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 922
    invoke-direct {p0}, Ll/ۚܳ;->۬()V

    .line 923
    iget-object v2, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 925
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 929
    iget-boolean v3, p0, Ll/ۚܳ;->ۘۧ:Z

    const/4 v8, 0x0

    if-nez v3, :cond_9

    .line 930
    iget-boolean v3, p0, Ll/ۚܳ;->ۤ֫:Z

    if-eqz v3, :cond_4

    const v3, 0x7f0d000c

    .line 932
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 936
    iput-boolean v5, p0, Ll/ۚܳ;->ܰ֫:Z

    iput-boolean v5, p0, Ll/ۚܳ;->᩶֫:Z

    goto/16 :goto_2

    .line 937
    :cond_4
    iget-boolean v2, p0, Ll/ۚܳ;->᩶֫:Z

    if-eqz v2, :cond_8

    .line 943
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 944
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v9, 0x7f040009

    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 947
    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v3, :cond_5

    .line 948
    new-instance v3, Ll/۫᩻;

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v3, v0, v2}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    move-object v3, v0

    .line 954
    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0d0017

    .line 955
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x7f0a0139

    .line 958
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/᩵ܺ;

    iput-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    .line 577
    iget-object v9, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v9

    .line 959
    invoke-interface {v3, v9}, Ll/᩵ܺ;->֫(Landroid/view/Window$Callback;)V

    .line 964
    iget-boolean v3, p0, Ll/ۚܳ;->ܰ֫:Z

    if-eqz v3, :cond_6

    .line 965
    iget-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {v3, v4}, Ll/᩵ܺ;->֫(I)V

    .line 967
    :cond_6
    iget-boolean v3, p0, Ll/ۚܳ;->᩸֫:Z

    if-eqz v3, :cond_7

    .line 968
    iget-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Ll/᩵ܺ;->֫(I)V

    .line 970
    :cond_7
    iget-boolean v3, p0, Ll/ۚܳ;->ܶ֫:Z

    if-eqz v3, :cond_b

    .line 971
    iget-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    const/4 v4, 0x5

    invoke-interface {v3, v4}, Ll/᩵ܺ;->֫(I)V

    goto :goto_2

    :cond_8
    move-object v2, v8

    goto :goto_2

    .line 975
    :cond_9
    iget-boolean v3, p0, Ll/ۚܳ;->۟֫:Z

    if-eqz v3, :cond_a

    const v3, 0x7f0d0016

    .line 976
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_a
    const v3, 0x7f0d0015

    .line 979
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_b
    :goto_2
    if-eqz v2, :cond_18

    .line 997
    new-instance v3, Ll/ۤܿ;

    invoke-direct {v3, p0}, Ll/ۤܿ;-><init>(Ll/ۚܳ;)V

    invoke-static {v2, v3}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    .line 1027
    iget-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-nez v3, :cond_c

    const v3, 0x7f0a0631

    .line 1028
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Ll/ۚܳ;->ܺۧ:Landroid/widget/TextView;

    .line 1032
    :cond_c
    sget v3, Ll/᩹ᩴ;->֫:I

    .line 101
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "makeOptionalFitsSystemWindows"

    invoke-virtual {v3, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 102
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v4

    if-nez v4, :cond_d

    .line 103
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 105
    :cond_d
    invoke-virtual {v3, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    nop

    :goto_3
    const v3, 0x7f0a0043

    .line 1034
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ᩴܺ;

    .line 1037
    iget-object v4, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    const v9, 0x1020002

    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_f

    .line 1041
    :goto_4
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    if-lez v10, :cond_e

    .line 1042
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 1043
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 1044
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_e
    const/4 v10, -0x1

    .line 1049
    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    .line 1050
    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    .line 1054
    instance-of v10, v4, Landroid/widget/FrameLayout;

    if-eqz v10, :cond_f

    .line 1055
    check-cast v4, Landroid/widget/FrameLayout;

    invoke-virtual {v4, v8}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 1060
    :cond_f
    iget-object v4, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 1062
    new-instance v4, Ll/ۛܿ;

    invoke-direct {v4, p0}, Ll/ۛܿ;-><init>(Ll/ۚܳ;)V

    invoke-virtual {v3, v4}, Ll/ᩴܺ;->֫(Ll/ۘܺ;)V

    .line 865
    iput-object v2, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    .line 1197
    iget-object v2, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_10

    .line 1198
    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_5

    .line 1201
    :cond_10
    iget-object v2, p0, Ll/ۚܳ;->ۡۧ:Ljava/lang/CharSequence;

    .line 869
    :goto_5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    .line 870
    iget-object v3, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v3, :cond_11

    .line 871
    invoke-interface {v3, v2}, Ll/᩵ܺ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 573
    :cond_11
    iget-object v3, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v3, :cond_12

    .line 873
    invoke-virtual {v3, v2}, Ll/ۤᩳ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 874
    :cond_12
    iget-object v3, p0, Ll/ۚܳ;->ܺۧ:Landroid/widget/TextView;

    if-eqz v3, :cond_13

    .line 875
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1078
    :cond_13
    :goto_6
    iget-object v2, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ᩴܺ;

    .line 1084
    iget-object v3, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    .line 1085
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    .line 1086
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    .line 1087
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    .line 1085
    invoke-virtual {v2, v4, v8, v9, v3}, Ll/ᩴܺ;->֫(IIII)V

    .line 1089
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x7c

    .line 1090
    invoke-virtual {v2}, Ll/ᩴܺ;->ܿ()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7d

    .line 1091
    invoke-virtual {v2}, Ll/ᩴܺ;->ܳ()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v1, 0x7a

    .line 1093
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 1095
    invoke-virtual {v2}, Ll/ᩴܺ;->ܽ()Landroid/util/TypedValue;

    move-result-object v3

    .line 1094
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_14
    const/16 v1, 0x7b

    .line 1097
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 1099
    invoke-virtual {v2}, Ll/ᩴܺ;->ᩳ()Landroid/util/TypedValue;

    move-result-object v3

    .line 1098
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    const/16 v1, 0x78

    .line 1101
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_16

    .line 1103
    invoke-virtual {v2}, Ll/ᩴܺ;->֫()Landroid/util/TypedValue;

    move-result-object v3

    .line 1102
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    const/16 v1, 0x79

    .line 1105
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 1107
    invoke-virtual {v2}, Ll/ᩴܺ;->ۧ()Landroid/util/TypedValue;

    move-result-object v3

    .line 1106
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 1109
    :cond_17
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1111
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 883
    iput-boolean v7, p0, Ll/ۚܳ;->᩻ۧ:Z

    .line 890
    invoke-virtual {p0, v5}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 891
    iget-boolean v1, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v1, :cond_1a

    iget-object v0, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-nez v0, :cond_1a

    .line 892
    invoke-direct {p0, v6}, Ll/ۚܳ;->ۡ(I)V

    goto :goto_7

    .line 984
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Ll/ۚܳ;->᩶֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۚܳ;->ܰ֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۚܳ;->ۤ֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۚܳ;->۟֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۚܳ;->ۘۧ:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 901
    :cond_19
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 902
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    :goto_7
    return-void
.end method

.method private ۡ(I)V
    .locals 2

    .line 2259
    iget v0, p0, Ll/ۚܳ;->ۗ֫:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۚܳ;->ۗ֫:I

    .line 2261
    iget-boolean p1, p0, Ll/ۚܳ;->۬֫:Z

    if-nez p1, :cond_0

    .line 2262
    iget-object p1, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    sget v0, Ll/ܿ᩺;->֫:I

    .line 1359
    iget-object v0, p0, Ll/ۚܳ;->۫֫:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 2263
    iput-boolean v1, p0, Ll/ۚܳ;->۬֫:Z

    :cond_0
    return-void
.end method

.method private ۤ()V
    .locals 2

    .line 2421
    iget-boolean v0, p0, Ll/ۚܳ;->᩻ۧ:Z

    if-nez v0, :cond_0

    return-void

    .line 2422
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;
    .locals 2

    .line 2673
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2674
    invoke-static {p0}, Ll/ܳܳ;->֫(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object p0

    return-object p0

    .line 2676
    :cond_0
    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {p0}, Ll/ܿܳ;->֫(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۘ۫;->֫(Ljava/lang/String;)Ll/ۘ۫;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1953
    iget-boolean v0, p0, Ll/ۚܳ;->᩵֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 1958
    :cond_0
    iget-boolean v0, p1, Ll/᩵ܳ;->᩷:Z

    iget v2, p1, Ll/᩵ܳ;->ᩳ:I

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    return v3

    .line 1962
    :cond_1
    iget-object v0, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    .line 1964
    invoke-virtual {p0, v0, v1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    .line 577
    :cond_2
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1970
    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    :cond_3
    const/16 v4, 0x6c

    if-eqz v2, :cond_5

    if-ne v2, v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-eqz v5, :cond_6

    .line 1976
    iget-object v6, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v6, :cond_6

    .line 1979
    invoke-interface {v6}, Ll/᩵ܺ;->ܿ()V

    .line 1982
    :cond_6
    iget-object v6, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    if-nez v6, :cond_1e

    if-eqz v5, :cond_7

    .line 573
    iget-object v6, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 1983
    instance-of v6, v6, Ll/ۨܳ;

    if-nez v6, :cond_1e

    .line 1986
    :cond_7
    iget-object v6, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    const/4 v7, 0x0

    if-eqz v6, :cond_8

    iget-boolean v8, p1, Ll/᩵ܳ;->ۘ:Z

    if-eqz v8, :cond_18

    :cond_8
    if-nez v6, :cond_11

    .line 1892
    iget-object v6, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    if-eqz v2, :cond_9

    if-ne v2, v4, :cond_d

    :cond_9
    iget-object v4, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v4, :cond_d

    .line 1894
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 1895
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    const v9, 0x7f040009

    .line 1896
    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1899
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    const v10, 0x7f04000a

    if-eqz v9, :cond_a

    .line 1900
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    .line 1901
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 1902
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 1903
    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    .line 1906
    :cond_a
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v9, v7

    .line 1910
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v10, :cond_c

    if-nez v9, :cond_b

    .line 1912
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    .line 1913
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 1915
    :cond_b
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_c
    if-eqz v9, :cond_d

    .line 1919
    new-instance v4, Ll/۫᩻;

    invoke-direct {v4, v6, v1}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    .line 1920
    invoke-virtual {v4}, Ll/۫᩻;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v6, v4

    .line 1924
    :cond_d
    new-instance v4, Ll/ۗۜ;

    invoke-direct {v4, v6}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    .line 1925
    invoke-virtual {v4, p0}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    .line 3220
    iget-object v6, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-ne v4, v6, :cond_e

    goto :goto_3

    :cond_e
    if-eqz v6, :cond_f

    .line 3223
    iget-object v8, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    invoke-virtual {v6, v8}, Ll/ۗۜ;->removeMenuPresenter(Ll/ܳ᩷;)V

    .line 3225
    :cond_f
    iput-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    .line 3227
    iget-object v6, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    if-eqz v6, :cond_10

    invoke-virtual {v4, v6}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;)V

    .line 1988
    :cond_10
    :goto_3
    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-nez v4, :cond_11

    goto :goto_5

    :cond_11
    if-eqz v5, :cond_13

    .line 1993
    iget-object v4, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v4, :cond_13

    .line 1994
    iget-object v6, p0, Ll/ۚܳ;->ܰ:Ll/ۧܳ;

    if-nez v6, :cond_12

    .line 1995
    new-instance v6, Ll/ۧܳ;

    invoke-direct {v6, p0}, Ll/ۧܳ;-><init>(Ll/ۚܳ;)V

    iput-object v6, p0, Ll/ۚܳ;->ܰ:Ll/ۧܳ;

    .line 1997
    :cond_12
    iget-object v6, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    iget-object v8, p0, Ll/ۚܳ;->ܰ:Ll/ۧܳ;

    invoke-interface {v4, v6, v8}, Ll/᩵ܺ;->֫(Landroid/view/Menu;Ll/ܿ᩷;)V

    .line 2002
    :cond_13
    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v4}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 2003
    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_17

    .line 3220
    iget-object p2, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-nez p2, :cond_14

    goto :goto_4

    :cond_14
    if-eqz p2, :cond_15

    .line 3223
    iget-object v0, p1, Ll/᩵ܳ;->ۢ:Ll/᩸ۜ;

    invoke-virtual {p2, v0}, Ll/ۗۜ;->removeMenuPresenter(Ll/ܳ᩷;)V

    .line 3225
    :cond_15
    iput-object v7, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    :goto_4
    if-eqz v5, :cond_16

    .line 2007
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz p1, :cond_16

    .line 2009
    iget-object p2, p0, Ll/ۚܳ;->ܰ:Ll/ۧܳ;

    invoke-interface {p1, v7, p2}, Ll/᩵ܺ;->֫(Landroid/view/Menu;Ll/ܿ᩷;)V

    :cond_16
    :goto_5
    return v1

    .line 2015
    :cond_17
    iput-boolean v1, p1, Ll/᩵ܳ;->ۘ:Z

    .line 2020
    :cond_18
    iget-object v2, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v2}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 2024
    iget-object v2, p1, Ll/᩵ܳ;->ܿ:Landroid/os/Bundle;

    if-eqz v2, :cond_19

    .line 2025
    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v4, v2}, Ll/ۗۜ;->restoreActionViewStates(Landroid/os/Bundle;)V

    .line 2026
    iput-object v7, p1, Ll/᩵ܳ;->ܿ:Landroid/os/Bundle;

    .line 2030
    :cond_19
    iget-object v2, p1, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    iget-object v4, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_1b

    if-eqz v5, :cond_1a

    .line 2031
    iget-object p2, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz p2, :cond_1a

    .line 2034
    iget-object v0, p0, Ll/ۚܳ;->ܰ:Ll/ۧܳ;

    invoke-interface {p2, v7, v0}, Ll/᩵ܺ;->֫(Landroid/view/Menu;Ll/ܿ᩷;)V

    .line 2036
    :cond_1a
    iget-object p1, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {p1}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return v1

    :cond_1b
    if-eqz p2, :cond_1c

    .line 2042
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_6

    :cond_1c
    const/4 p2, -0x1

    .line 2041
    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    .line 2043
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v3, :cond_1d

    const/4 p2, 0x1

    goto :goto_7

    :cond_1d
    const/4 p2, 0x0

    .line 2044
    :goto_7
    iget-object v0, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v0, p2}, Ll/ۗۜ;->setQwertyMode(Z)V

    .line 2045
    iget-object p2, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {p2}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    .line 2049
    :cond_1e
    iput-boolean v3, p1, Ll/᩵ܳ;->᩷:Z

    .line 2050
    iput-boolean v1, p1, Ll/᩵ܳ;->᩻:Z

    .line 2051
    iput-object p1, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    return v3
.end method

.method private ۫()V
    .locals 3

    .line 581
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 583
    iget-boolean v0, p0, Ll/ۚܳ;->᩶֫:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 587
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    .line 588
    new-instance v1, Ll/ܿ᩻;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, Ll/ۚܳ;->ܰ֫:Z

    invoke-direct {v1, v0, v2}, Ll/ܿ᩻;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    goto :goto_0

    .line 589
    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    if-eqz v1, :cond_2

    .line 590
    new-instance v1, Ll/ܿ᩻;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, Ll/ܿ᩻;-><init>(Landroid/app/Dialog;)V

    iput-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 592
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_3

    .line 593
    iget-boolean v1, p0, Ll/ۚܳ;->֨֫:Z

    invoke-virtual {v0, v1}, Ll/ۤᩳ;->ۧ(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method private ۬()V
    .locals 2

    .line 823
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 824
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۚܳ;->֫(Landroid/view/Window;)V

    .line 826
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    .line 827
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܿ(Landroid/content/Context;)Ll/ۘ۫;
    .locals 5

    .line 2563
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 2566
    :cond_0
    invoke-static {}, Ll/۬ܿ;->ۚ()Ll/ۘ۫;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 2571
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 2572
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    .line 2570
    invoke-static {p0}, Ll/ۚܳ;->ۧ(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object p0

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-lt v0, v2, :cond_6

    .line 47
    invoke-virtual {v1}, Ll/ۘ۫;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    invoke-static {}, Ll/ۘ۫;->ܿ()Ll/ۘ۫;

    move-result-object v0

    goto :goto_3

    .line 69
    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 70
    :goto_1
    invoke-virtual {v1}, Ll/ۘ۫;->ۧ()I

    move-result v2

    invoke-virtual {p0}, Ll/ۘ۫;->ۧ()I

    move-result v4

    add-int/2addr v4, v2

    if-ge v3, v4, :cond_5

    .line 72
    invoke-virtual {v1}, Ll/ۘ۫;->ۧ()I

    move-result v2

    if-ge v3, v2, :cond_3

    .line 73
    invoke-virtual {v1, v3}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v2

    goto :goto_2

    .line 75
    :cond_3
    invoke-virtual {v1}, Ll/ۘ۫;->ۧ()I

    move-result v2

    sub-int v2, v3, v2

    invoke-virtual {p0, v2}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v2

    :goto_2
    if-eqz v2, :cond_4

    .line 78
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 82
    :cond_5
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/util/Locale;

    .line 81
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Locale;

    invoke-static {v0}, Ll/ۘ۫;->֫([Ljava/util/Locale;)Ll/ۘ۫;

    move-result-object v0

    goto :goto_3

    .line 2584
    :cond_6
    invoke-virtual {v1}, Ll/ۘ۫;->֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2585
    invoke-static {}, Ll/ۘ۫;->ܿ()Ll/ۘ۫;

    move-result-object v0

    goto :goto_3

    .line 2589
    :cond_7
    invoke-virtual {v1, v3}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v0

    .line 2588
    invoke-static {v0}, Ll/ܿܳ;->֫(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ۫;->֫(Ljava/lang/String;)Ll/ۘ۫;

    move-result-object v0

    .line 2598
    :goto_3
    invoke-virtual {v0}, Ll/ۘ۫;->֫()Z

    move-result v1

    if-eqz v1, :cond_8

    return-object p0

    :cond_8
    return-object v0
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 1612
    iget-object v0, p0, Ll/ۚܳ;->ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;

    if-nez v0, :cond_1

    .line 1613
    sget-object v0, Ll/ۗᩳ;->ۡ:[I

    iget-object v1, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v2, 0x74

    .line 1615
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1616
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v2, :cond_0

    .line 1620
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    iput-object v0, p0, Ll/ۚܳ;->ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;

    goto :goto_0

    .line 1624
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 1626
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 1627
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AppCompatViewInflater;

    iput-object v0, p0, Ll/ۚܳ;->ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1631
    :catchall_0
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    iput-object v0, p0, Ll/ۚܳ;->ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;

    .line 1654
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/ۚܳ;->ܳ֫:Landroidx/appcompat/app/AppCompatViewInflater;

    .line 1657
    sget v0, Ll/۠ᩴ;->֫:I

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1654
    invoke-virtual/range {v1 .. v9}, Landroidx/appcompat/app/AppCompatViewInflater;->createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1714
    invoke-virtual {p0, v0, p1, p2, p3}, Ll/ۚܳ;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 2

    .line 577
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1232
    iget-boolean v1, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v1, :cond_0

    .line 1233
    invoke-virtual {p1}, Ll/ۗۜ;->getRootMenu()Ll/ۗۜ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۚܳ;->ۧ(Ll/ۗۜ;)Ll/᩵ܳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1235
    iget p1, p1, Ll/᩵ܳ;->ᩳ:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 5

    .line 1845
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ll/᩵ܺ;->֫()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    .line 1846
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    .line 1847
    invoke-interface {p1}, Ll/᩵ܺ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 577
    :cond_0
    iget-object p1, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p1

    .line 1851
    iget-object v2, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {v2}, Ll/᩵ܺ;->ᩳ()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_1

    .line 1871
    iget-object v0, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {v0}, Ll/᩵ܺ;->ۧ()Z

    .line 1872
    iget-boolean v0, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v0, :cond_3

    .line 1873
    invoke-virtual {p0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 1874
    iget-object v0, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_1
    if-eqz p1, :cond_3

    .line 1852
    iget-boolean v2, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v2, :cond_3

    .line 1854
    iget-boolean v2, p0, Ll/ۚܳ;->۬֫:Z

    if-eqz v2, :cond_2

    iget v2, p0, Ll/ۚܳ;->ۗ֫:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    .line 1856
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Ll/ۚܳ;->۫֫:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1857
    check-cast v2, Ll/۫ܿ;

    invoke-virtual {v2}, Ll/۫ܿ;->run()V

    .line 1860
    :cond_2
    invoke-virtual {p0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 1864
    iget-object v2, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-eqz v2, :cond_3

    iget-boolean v4, v0, Ll/᩵ܳ;->ۘ:Z

    if-nez v4, :cond_3

    iget-object v4, v0, Ll/᩵ܳ;->ۧ:Landroid/view/View;

    .line 1865
    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1866
    iget-object v0, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 1867
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {p1}, Ll/᩵ܺ;->ܽ()Z

    :cond_3
    return-void

    .line 1880
    :cond_4
    invoke-virtual {p0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object p1

    .line 1882
    iput-boolean v0, p1, Ll/᩵ܳ;->ۖ:Z

    .line 1883
    invoke-virtual {p0, p1, v1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    const/4 v0, 0x0

    .line 1885
    invoke-direct {p0, p1, v0}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final ֫(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_6

    if-eq p2, v1, :cond_5

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_5

    const/4 v0, 0x2

    if-eq p2, v0, :cond_5

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 2938
    iget-object p2, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    if-nez p2, :cond_0

    .line 2939
    new-instance p2, Ll/ۡܳ;

    invoke-direct {p2, p0, p1}, Ll/ۡܳ;-><init>(Ll/ۚܳ;Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    .line 2941
    :cond_0
    iget-object p1, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    .line 2648
    invoke-virtual {p1}, Ll/ۡܳ;->ܿ()I

    move-result p1

    return p1

    .line 2653
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2637
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_3

    .line 2638
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    .line 2639
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    .line 2640
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    .line 2930
    :cond_3
    iget-object p2, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    if-nez p2, :cond_4

    .line 2931
    new-instance p2, Ll/ۘܳ;

    .line 2932
    invoke-static {p1}, Ll/۟ܳ;->֫(Landroid/content/Context;)Ll/۟ܳ;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Ll/ۘܳ;-><init>(Ll/ۚܳ;Ll/۟ܳ;)V

    iput-object p2, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    .line 2934
    :cond_4
    iget-object p1, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    .line 2646
    invoke-virtual {p1}, Ll/ۘܳ;->ܿ()I

    move-result p1

    return p1

    :cond_5
    return p2

    :cond_6
    :goto_0
    return v1
.end method

.method public final ֫(Ll/᩸ܰ;)I
    .locals 11

    .line 2305
    invoke-virtual {p1}, Ll/᩸ܰ;->ۢ()I

    move-result v0

    .line 2312
    iget-object v1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_e

    .line 2313
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_e

    .line 2314
    iget-object v1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    .line 2315
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2318
    iget-object v4, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_c

    .line 2319
    iget-object v3, p0, Ll/ۚܳ;->ۜۧ:Landroid/graphics/Rect;

    if-nez v3, :cond_0

    .line 2320
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Ll/ۚܳ;->ۜۧ:Landroid/graphics/Rect;

    .line 2321
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Ll/ۚܳ;->᩷ۧ:Landroid/graphics/Rect;

    .line 2323
    :cond_0
    iget-object v3, p0, Ll/ۚܳ;->ۜۧ:Landroid/graphics/Rect;

    .line 2324
    iget-object v4, p0, Ll/ۚܳ;->᩷ۧ:Landroid/graphics/Rect;

    .line 2329
    invoke-virtual {p1}, Ll/᩸ܰ;->ۜ()I

    move-result v6

    .line 2330
    invoke-virtual {p1}, Ll/᩸ܰ;->ۢ()I

    move-result v7

    .line 2331
    invoke-virtual {p1}, Ll/᩸ܰ;->᩷()I

    move-result v8

    .line 2332
    invoke-virtual {p1}, Ll/᩸ܰ;->᩻()I

    move-result p1

    .line 2328
    invoke-virtual {v3, v6, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 2335
    iget-object p1, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-static {p1, v3, v4}, Ll/᩹ᩴ;->֫(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 2336
    iget p1, v3, Landroid/graphics/Rect;->top:I

    .line 2337
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 2338
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 2343
    iget-object v6, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-static {v6}, Ll/ܿ᩺;->᩷(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object v6

    if-nez v6, :cond_1

    const/4 v7, 0x0

    goto :goto_0

    .line 2345
    :cond_1
    invoke-virtual {v6}, Ll/᩸ܰ;->ۜ()I

    move-result v7

    :goto_0
    if-nez v6, :cond_2

    const/4 v6, 0x0

    goto :goto_1

    .line 2347
    :cond_2
    invoke-virtual {v6}, Ll/᩸ܰ;->᩷()I

    move-result v6

    .line 2349
    :goto_1
    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_4

    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, v4, :cond_4

    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    goto :goto_3

    .line 2352
    :cond_4
    :goto_2
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 2353
    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2354
    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v3, 0x1

    .line 2357
    :goto_3
    iget-object v4, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    if-lez p1, :cond_5

    iget-object p1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    if-nez p1, :cond_5

    .line 2358
    new-instance p1, Landroid/view/View;

    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    .line 2359
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2360
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v9, 0x33

    const/4 v10, -0x1

    invoke-direct {p1, v10, v8, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 2362
    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 2363
    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 2364
    iget-object v6, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    iget-object v7, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    invoke-virtual {v6, v7, v10, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_4

    .line 2365
    :cond_5
    iget-object p1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    if-eqz p1, :cond_7

    .line 2367
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2368
    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v9, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, v9, :cond_6

    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, v7, :cond_6

    iget v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v6, :cond_7

    .line 2370
    :cond_6
    iput v9, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 2371
    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2372
    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 2373
    iget-object v6, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    invoke-virtual {v6, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2379
    :cond_7
    :goto_4
    iget-object p1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_a

    .line 2381
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_a

    .line 2383
    iget-object p1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    .line 2793
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v6

    and-int/lit16 v6, v6, 0x2000

    if-eqz v6, :cond_9

    const v6, 0x7f060006

    .line 2416
    invoke-static {v4, v6}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result v4

    goto :goto_6

    :cond_9
    const v6, 0x7f060005

    .line 2417
    invoke-static {v4, v6}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result v4

    .line 2415
    :goto_6
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2390
    :cond_a
    iget-boolean p1, p0, Ll/ۚܳ;->۟֫:Z

    if-nez p1, :cond_b

    if-eqz v5, :cond_b

    const/4 v0, 0x0

    :cond_b
    move p1, v5

    move v5, v3

    goto :goto_7

    .line 2395
    :cond_c
    iget p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_d

    .line 2397
    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 p1, 0x0

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    const/4 p1, 0x0

    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_7
    if-eqz v5, :cond_f

    .line 2401
    iget-object v3, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_8

    :cond_e
    const/4 p1, 0x0

    .line 2405
    :cond_f
    :goto_8
    iget-object v1, p0, Ll/ۚܳ;->ܿۧ:Landroid/view/View;

    if-eqz v1, :cond_11

    if-eqz p1, :cond_10

    const/4 v2, 0x0

    .line 2406
    :cond_10
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    return v0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/content/Context;
    .locals 9

    const/4 v0, 0x1

    .line 384
    iput-boolean v0, p0, Ll/ۚܳ;->ۡ֫:Z

    .line 2660
    iget v1, p0, Ll/ۚܳ;->ۛ֫:I

    const/16 v2, -0x64

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/۬ܿ;->᩵()I

    move-result v1

    .line 396
    :goto_0
    invoke-virtual {p0, p1, v1}, Ll/ۚܳ;->֫(Landroid/content/Context;I)I

    move-result v1

    .line 398
    invoke-static {p1}, Ll/۬ܿ;->ܽ(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 403
    invoke-static {p1}, Ll/۬ܿ;->ᩳ(Landroid/content/Context;)V

    .line 405
    :cond_1
    invoke-static {p1}, Ll/ۚܳ;->ܿ(Landroid/content/Context;)Ll/ۘ۫;

    move-result-object v2

    .line 410
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 411
    invoke-static {p1, v1, v2, v5, v4}, Ll/ۚܳ;->֫(Landroid/content/Context;ILl/ۘ۫;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    .line 419
    :try_start_0
    move-object v6, p1

    check-cast v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    .line 429
    :cond_2
    instance-of v3, p1, Ll/۫᩻;

    if-eqz v3, :cond_3

    .line 430
    invoke-static {p1, v1, v2, v5, v4}, Ll/ۚܳ;->֫(Landroid/content/Context;ILl/ۘ۫;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    .line 438
    :try_start_1
    move-object v4, p1

    check-cast v4, Ll/۫᩻;

    invoke-virtual {v4, v3}, Ll/۫᩻;->֫(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    nop

    .line 452
    :cond_3
    sget-boolean v3, Ll/ۚܳ;->ᩴۧ:Z

    if-nez v3, :cond_4

    return-object p1

    .line 463
    :cond_4
    new-instance v3, Landroid/content/res/Configuration;

    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    const/4 v4, -0x1

    .line 466
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    const/4 v4, 0x0

    .line 468
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 470
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v3

    .line 471
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    .line 473
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    .line 474
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 477
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v7

    if-nez v7, :cond_1b

    .line 3785
    new-instance v5, Landroid/content/res/Configuration;

    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    .line 3786
    iput v4, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 3788
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_2

    .line 3792
    :cond_5
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v4, v4, v7

    if-eqz v4, :cond_6

    .line 3793
    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 3796
    :cond_6
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    if-eq v4, v7, :cond_7

    .line 3797
    iput v7, v5, Landroid/content/res/Configuration;->mcc:I

    .line 3800
    :cond_7
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    if-eq v4, v7, :cond_8

    .line 3801
    iput v7, v5, Landroid/content/res/Configuration;->mnc:I

    .line 3804
    :cond_8
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x18

    if-lt v4, v7, :cond_9

    .line 3805
    invoke-static {v3, v6, v5}, Ll/ܳܳ;->֫(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    goto :goto_1

    .line 3807
    :cond_9
    iget-object v7, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v8, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 50
    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 3808
    iget-object v7, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v7, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 3812
    :cond_a
    :goto_1
    iget v7, v3, Landroid/content/res/Configuration;->touchscreen:I

    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v7, v8, :cond_b

    .line 3813
    iput v8, v5, Landroid/content/res/Configuration;->touchscreen:I

    .line 3816
    :cond_b
    iget v7, v3, Landroid/content/res/Configuration;->keyboard:I

    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    if-eq v7, v8, :cond_c

    .line 3817
    iput v8, v5, Landroid/content/res/Configuration;->keyboard:I

    .line 3820
    :cond_c
    iget v7, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v7, v8, :cond_d

    .line 3821
    iput v8, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 3824
    :cond_d
    iget v7, v3, Landroid/content/res/Configuration;->navigation:I

    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    if-eq v7, v8, :cond_e

    .line 3825
    iput v8, v5, Landroid/content/res/Configuration;->navigation:I

    .line 3828
    :cond_e
    iget v7, v3, Landroid/content/res/Configuration;->navigationHidden:I

    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v7, v8, :cond_f

    .line 3829
    iput v8, v5, Landroid/content/res/Configuration;->navigationHidden:I

    .line 3832
    :cond_f
    iget v7, v3, Landroid/content/res/Configuration;->orientation:I

    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    if-eq v7, v8, :cond_10

    .line 3833
    iput v8, v5, Landroid/content/res/Configuration;->orientation:I

    .line 3836
    :cond_10
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0xf

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0xf

    if-eq v7, v8, :cond_11

    .line 3838
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 3841
    :cond_11
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0xc0

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0xc0

    if-eq v7, v8, :cond_12

    .line 3843
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 3846
    :cond_12
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0x30

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0x30

    if-eq v7, v8, :cond_13

    .line 3848
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 3851
    :cond_13
    iget v7, v3, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0x300

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0x300

    if-eq v7, v8, :cond_14

    .line 3853
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_14
    const/16 v7, 0x1a

    if-lt v4, v7, :cond_15

    .line 3857
    invoke-static {v3, v6, v5}, Ll/᩻ܳ;->֫(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 3860
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0xf

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0xf

    if-eq v4, v7, :cond_16

    .line 3862
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 3865
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0x30

    if-eq v4, v7, :cond_17

    .line 3867
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v7

    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 3870
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v4, v7, :cond_18

    .line 3871
    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 3874
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v4, v7, :cond_19

    .line 3875
    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 3878
    :cond_19
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v4, v7, :cond_1a

    .line 3879
    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 3882
    :cond_1a
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v3, v4, :cond_1b

    .line 3883
    iput v4, v5, Landroid/content/res/Configuration;->densityDpi:I

    .line 485
    :cond_1b
    :goto_2
    invoke-static {p1, v1, v2, v5, v0}, Ll/ۚܳ;->֫(Landroid/content/Context;ILl/ۘ۫;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    .line 494
    new-instance v1, Ll/۫᩻;

    const v2, 0x7f130291

    invoke-direct {v1, p1, v2}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    .line 496
    invoke-virtual {v1, v0}, Ll/۫᩻;->֫(Landroid/content/res/Configuration;)V

    .line 503
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_1c

    .line 513
    invoke-virtual {v1}, Ll/۫᩻;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۗ;->֫(Landroid/content/res/Resources$Theme;)V

    :catch_2
    :cond_1c
    return-object v1
.end method

.method public final ֫(I)Landroid/view/View;
    .locals 1

    .line 667
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 668
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ᩻;)Ll/ۗ᩻;
    .locals 8

    .line 1252
    iget-object v0, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz v0, :cond_0

    .line 1253
    invoke-virtual {v0}, Ll/ۗ᩻;->֫()V

    .line 1256
    :cond_0
    new-instance v0, Ll/ᩳܳ;

    invoke-direct {v0, p0, p1}, Ll/ᩳܳ;-><init>(Ll/ۚܳ;Ll/ۛ᩻;)V

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object p1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 1259
    iget-object v1, p0, Ll/ۚܳ;->ܿ֫:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 1260
    invoke-virtual {p1, v0}, Ll/ۤᩳ;->֫(Ll/ۙ᩻;)Ll/ۗ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    .line 1262
    invoke-interface {v1, p1}, Ll/۠ܿ;->onSupportActionModeStarted(Ll/ۗ᩻;)V

    .line 1266
    :cond_1
    iget-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-nez p1, :cond_f

    .line 1452
    iget-object p1, p0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    if-eqz p1, :cond_2

    .line 1453
    invoke-virtual {p1}, Ll/ܶ᩺;->֫()V

    .line 1286
    :cond_2
    iget-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz p1, :cond_3

    .line 1287
    invoke-virtual {p1}, Ll/ۗ᩻;->֫()V

    :cond_3
    const/4 p1, 0x0

    if-eqz v1, :cond_4

    .line 1296
    iget-boolean v2, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v2, :cond_4

    .line 1298
    :try_start_0
    invoke-interface {v1, v0}, Ll/۠ܿ;->onWindowStartingSupportActionMode(Ll/ۙ᩻;)Ll/ۗ᩻;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_4
    move-object v2, p1

    :goto_0
    if-eqz v2, :cond_5

    .line 1305
    iput-object v2, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    goto/16 :goto_3

    .line 1307
    :cond_5
    iget-object v2, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/4 v3, 0x0

    if-nez v2, :cond_8

    .line 1308
    iget-boolean v2, p0, Ll/ۚܳ;->ۤ֫:Z

    if-eqz v2, :cond_7

    .line 1310
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 1311
    iget-object v4, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    const v6, 0x7f040009

    const/4 v7, 0x1

    .line 1312
    invoke-virtual {v5, v6, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1315
    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_6

    .line 1316
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    .line 1317
    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 1318
    iget v5, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v6, v5, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 1320
    new-instance v5, Ll/۫᩻;

    invoke-direct {v5, v4, v3}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    .line 1321
    invoke-virtual {v5}, Ll/۫᩻;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v4, v5

    .line 1326
    :cond_6
    new-instance v5, Ll/᩹᩷;

    .line 57
    invoke-direct {v5, v4, p1}, Ll/᩹᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1326
    iput-object v5, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    .line 1327
    new-instance v5, Landroid/widget/PopupWindow;

    const v6, 0x7f040018

    invoke-direct {v5, v4, p1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v5, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    const/4 v6, 0x2

    .line 1329
    invoke-static {v5, v6}, Ll/֨֫֫;->֫(Landroid/widget/PopupWindow;I)V

    .line 1331
    iget-object v5, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    iget-object v6, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 1332
    iget-object v5, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 1334
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    const v6, 0x7f040003

    invoke-virtual {v5, v6, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1336
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 1337
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 1336
    invoke-static {v2, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v2

    .line 1338
    iget-object v4, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v4, v2}, Ll/᩹᩷;->֫(I)V

    .line 1339
    iget-object v2, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 1340
    new-instance v2, Ll/᩺ܿ;

    invoke-direct {v2, p0}, Ll/᩺ܿ;-><init>(Ll/ۚܳ;)V

    iput-object v2, p0, Ll/ۚܳ;->ᩳۧ:Ljava/lang/Runnable;

    goto :goto_1

    .line 1371
    :cond_7
    iget-object v2, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    const v4, 0x7f0a0050

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ܶᩴ;

    if-eqz v2, :cond_8

    .line 1374
    invoke-virtual {p0}, Ll/ۚܳ;->ܶ()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ܶᩴ;->֫(Landroid/view/LayoutInflater;)V

    .line 1375
    invoke-virtual {v2}, Ll/ܶᩴ;->֫()Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹᩷;

    iput-object v2, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    .line 1380
    :cond_8
    :goto_1
    iget-object v2, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    if-eqz v2, :cond_d

    .line 1452
    iget-object v2, p0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    if-eqz v2, :cond_9

    .line 1453
    invoke-virtual {v2}, Ll/ܶ᩺;->֫()V

    .line 1382
    :cond_9
    iget-object v2, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v2}, Ll/᩹᩷;->ܿ()V

    .line 1383
    new-instance v2, Ll/ۤ᩻;

    iget-object v4, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-direct {v2, v4, v5, v0}, Ll/ۤ᩻;-><init>(Landroid/content/Context;Ll/᩹᩷;Ll/ۙ᩻;)V

    .line 1385
    invoke-virtual {v2}, Ll/ۤ᩻;->ܽ()Ll/ۗۜ;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ll/ᩳܳ;->ۧ(Ll/ۗ᩻;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1386
    invoke-virtual {v2}, Ll/ۤ᩻;->᩷()V

    .line 1387
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {p1, v2}, Ll/᩹᩷;->֫(Ll/ۗ᩻;)V

    .line 1388
    iput-object v2, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    .line 1390
    invoke-virtual {p0}, Ll/ۚܳ;->᩶()Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_a

    .line 1391
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1392
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-static {p1}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ܶ᩺;->֫(F)V

    iput-object p1, p0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    .line 1393
    new-instance v0, Ll/ܰܿ;

    invoke-direct {v0, p0}, Ll/ܰܿ;-><init>(Ll/ۚܳ;)V

    invoke-virtual {p1, v0}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    goto :goto_2

    .line 1410
    :cond_a
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1411
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {p1, v3}, Ll/֨᩷;->setVisibility(I)V

    .line 1412
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_b

    .line 1413
    iget-object p1, p0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    .line 1417
    :cond_b
    :goto_2
    iget-object p1, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_d

    .line 1418
    iget-object p1, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Ll/ۚܳ;->ᩳۧ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    .line 1421
    :cond_c
    iput-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    .line 1425
    :cond_d
    :goto_3
    iget-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz p1, :cond_e

    if-eqz v1, :cond_e

    .line 1426
    invoke-interface {v1, p1}, Ll/۠ܿ;->onSupportActionModeStarted(Ll/ۗ᩻;)V

    .line 1430
    :cond_e
    invoke-virtual {p0}, Ll/ۚܳ;->ۙ()V

    .line 1432
    iget-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    .line 1268
    iput-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    .line 1272
    :cond_f
    invoke-virtual {p0}, Ll/ۚܳ;->ۙ()V

    .line 1274
    iget-object p1, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 2483
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-static {v0}, Ll/۬ܿ;->ܽ(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2484
    invoke-static {}, Ll/۬ܿ;->ۚ()Ll/ۘ۫;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2485
    invoke-static {}, Ll/۬ܿ;->ۚ()Ll/ۘ۫;

    move-result-object v1

    invoke-static {}, Ll/۬ܿ;->֨()Ll/ۘ۫;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۘ۫;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 937
    new-instance v1, Ll/ܶܿ;

    invoke-direct {v1, v0}, Ll/ܶܿ;-><init>(Landroid/content/Context;)V

    sget-object v0, Ll/۬ܿ;->ۛ:Ll/ۙܿ;

    invoke-virtual {v0, v1}, Ll/ۙܿ;->execute(Ljava/lang/Runnable;)V

    :cond_0
    const/4 v0, 0x1

    .line 2498
    invoke-direct {p0, v0, v0}, Ll/ۚܳ;->֫(ZZ)Z

    return-void
.end method

.method public final ֫(ILl/᩵ܳ;Ll/ۗۜ;)V
    .locals 2

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    .line 2180
    iget-object v0, p0, Ll/ۚܳ;->ۧۧ:[Ll/᩵ܳ;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 2181
    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    .line 2187
    iget-object p3, p2, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    :cond_1
    if-eqz p2, :cond_2

    .line 2192
    iget-boolean p2, p2, Ll/᩵ܳ;->ۜ:Z

    if-nez p2, :cond_2

    goto :goto_0

    .line 2196
    :cond_2
    iget-boolean p2, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez p2, :cond_3

    .line 2200
    iget-object p2, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2, v0, p1, p3}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/content/res/Configuration;)V
    .locals 1

    .line 675
    iget-boolean p1, p0, Ll/ۚܳ;->᩶֫:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/ۚܳ;->᩻ۧ:Z

    if-eqz p1, :cond_0

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object p1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz p1, :cond_0

    .line 680
    invoke-virtual {p1}, Ll/ۤᩳ;->ܳ()V

    .line 685
    :cond_0
    invoke-static {}, Ll/ۛۢ;->ۧ()Ll/ۛۢ;

    move-result-object p1

    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {p1, v0}, Ll/ۛۢ;->֫(Landroid/content/Context;)V

    .line 689
    new-instance p1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object p1, p0, Ll/ۚܳ;->ۚ֫:Landroid/content/res/Configuration;

    const/4 p1, 0x0

    .line 702
    invoke-direct {p0, p1, p1}, Ll/ۚܳ;->֫(ZZ)Z

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 739
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 740
    iget-object v0, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 741
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 742
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 743
    iget-object p1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 766
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 767
    iget-object v0, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 768
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 769
    iget-object p1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object p2, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1184
    iput-object p1, p0, Ll/ۚܳ;->ۡۧ:Ljava/lang/CharSequence;

    .line 1186
    iget-object v0, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v0, :cond_0

    .line 1187
    invoke-interface {v0, p1}, Ll/᩵ܺ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 573
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_1

    .line 1189
    invoke-virtual {v0, p1}, Ll/ۤᩳ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 1190
    :cond_1
    iget-object v0, p0, Ll/ۚܳ;->ܺۧ:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 1191
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۗۜ;)V
    .locals 2

    .line 2057
    iget-boolean v0, p0, Ll/ۚܳ;->ܺ֫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2061
    iput-boolean v0, p0, Ll/ۚܳ;->ܺ֫:Z

    .line 2062
    iget-object v0, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {v0}, Ll/᩵ܺ;->᩻()V

    .line 577
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2064
    iget-boolean v1, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    .line 2065
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    .line 2067
    iput-boolean p1, p0, Ll/ۚܳ;->ܺ֫:Z

    return-void
.end method

.method public final ֫(Ll/ۢᩴ;)V
    .locals 3

    .line 599
    iget-object v0, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    return-void

    .line 568
    :cond_0
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 605
    instance-of v2, v1, Ll/ܿ᩻;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    .line 613
    iput-object v2, p0, Ll/ۚܳ;->᩺֫:Ll/۟᩻;

    if-eqz v1, :cond_1

    .line 617
    invoke-virtual {v1}, Ll/ۤᩳ;->᩻()V

    .line 619
    :cond_1
    iput-object v2, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz p1, :cond_3

    .line 622
    new-instance v1, Ll/ۨܳ;

    .line 1197
    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_2

    .line 1198
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    .line 1201
    :cond_2
    iget-object v0, p0, Ll/ۚܳ;->ۡۧ:Ljava/lang/CharSequence;

    .line 622
    :goto_0
    iget-object v2, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    invoke-direct {v1, p1, v0, v2}, Ll/ۨܳ;-><init>(Ll/ۢᩴ;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    .line 624
    iput-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 626
    iget-object v0, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object v1, v1, Ll/ۨܳ;->ܽ:Ll/ۛܳ;

    invoke-virtual {v0, v1}, Ll/ۢܳ;->֫(Ll/֫ܳ;)V

    const/4 v0, 0x1

    .line 628
    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setBackInvokedCallbackEnabled(Z)V

    goto :goto_1

    .line 631
    :cond_3
    iget-object p1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    invoke-virtual {p1, v2}, Ll/ۢܳ;->֫(Ll/֫ܳ;)V

    .line 634
    :goto_1
    invoke-virtual {p0}, Ll/ۚܳ;->ۜ()V

    return-void

    .line 606
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩵ܳ;Z)V
    .locals 3

    if-eqz p2, :cond_0

    .line 2075
    iget v0, p1, Ll/᩵ܳ;->ᩳ:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v0, :cond_0

    .line 2076
    invoke-interface {v0}, Ll/᩵ܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2077
    iget-object p1, p1, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {p0, p1}, Ll/ۚܳ;->֫(Ll/ۗۜ;)V

    return-void

    .line 2081
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2082
    iget-boolean v2, p1, Ll/᩵ܳ;->ۜ:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Ll/᩵ܳ;->ܽ:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    .line 2083
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    .line 2086
    iget p2, p1, Ll/᩵ܳ;->ᩳ:I

    invoke-virtual {p0, p2, p1, v1}, Ll/ۚܳ;->֫(ILl/᩵ܳ;Ll/ۗۜ;)V

    :cond_1
    const/4 p2, 0x0

    .line 2090
    iput-boolean p2, p1, Ll/᩵ܳ;->᩷:Z

    .line 2091
    iput-boolean p2, p1, Ll/᩵ܳ;->᩻:Z

    .line 2092
    iput-boolean p2, p1, Ll/᩵ܳ;->ۜ:Z

    .line 2095
    iput-object v1, p1, Ll/᩵ܳ;->ᩴ:Landroid/view/View;

    const/4 p2, 0x1

    .line 2099
    iput-boolean p2, p1, Ll/᩵ܳ;->ۖ:Z

    .line 2101
    iget-object p2, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    if-ne p2, p1, :cond_2

    .line 2102
    iput-object v1, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    .line 2106
    :cond_2
    iget p1, p1, Ll/᩵ܳ;->ᩳ:I

    if-nez p1, :cond_3

    .line 2107
    invoke-virtual {p0}, Ll/ۚܳ;->ۙ()V

    :cond_3
    return-void
.end method

.method public final ֫(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1520
    invoke-virtual {v0, p1, p2}, Ll/ۤᩳ;->֫(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 1526
    :cond_0
    iget-object p1, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    if-eqz p1, :cond_1

    .line 1527
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0, p1, v0, p2}, Ll/ۚܳ;->֫(Ll/᩵ܳ;ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1530
    iget-object p1, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    if-eqz p1, :cond_2

    .line 1531
    iput-boolean v1, p1, Ll/᩵ܳ;->᩻:Z

    return v1

    .line 1541
    :cond_1
    iget-object p1, p0, Ll/ۚܳ;->ܽۧ:Ll/᩵ܳ;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    .line 1542
    invoke-virtual {p0, v0}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object p1

    .line 1543
    invoke-direct {p0, p1, p2}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    .line 1544
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-direct {p0, p1, v2, p2}, Ll/ۚܳ;->֫(Ll/᩵ܳ;ILandroid/view/KeyEvent;)Z

    move-result p2

    .line 1545
    iput-boolean v0, p1, Ll/᩵ܳ;->᩷:Z

    if-eqz p2, :cond_3

    :cond_2
    :goto_0
    return v1

    :cond_3
    return v0
.end method

.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1555
    iget-object v0, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v1, v0, Ll/۠ۛ;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Ll/۠ܳ;

    if-eqz v0, :cond_1

    .line 1556
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1557
    invoke-static {v0, p1}, Ll/ܶۛ;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_4

    .line 1562
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    .line 1564
    iget-object v0, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object v3, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_4

    .line 1569
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 1570
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-nez v3, :cond_6

    if-eq v0, v4, :cond_4

    if-eq v0, v1, :cond_3

    goto/16 :goto_5

    .line 2112
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_10

    .line 2113
    invoke-virtual {p0, v5}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 2114
    iget-boolean v1, v0, Ll/᩵ܳ;->ۜ:Z

    if-nez v1, :cond_10

    .line 2115
    invoke-direct {p0, v0, p1}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    return v2

    .line 1603
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Ll/ۚܳ;->ۨ֫:Z

    return v5

    :cond_6
    if-eq v0, v4, :cond_f

    if-eq v0, v1, :cond_7

    goto/16 :goto_5

    .line 2123
    :cond_7
    iget-object v0, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz v0, :cond_8

    goto/16 :goto_4

    .line 2128
    :cond_8
    invoke-virtual {p0, v5}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 2129
    iget-object v1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    iget-object v3, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    if-eqz v1, :cond_a

    .line 2130
    invoke-interface {v1}, Ll/᩵ܺ;->֫()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 2131
    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v1

    if-nez v1, :cond_a

    .line 2132
    iget-object v1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {v1}, Ll/᩵ܺ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_9

    .line 2133
    iget-boolean v1, p0, Ll/ۚܳ;->᩵֫:Z

    if-nez v1, :cond_d

    invoke-direct {p0, v0, p1}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 2134
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {p1}, Ll/᩵ܺ;->ܽ()Z

    move-result p1

    goto :goto_3

    .line 2137
    :cond_9
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    invoke-interface {p1}, Ll/᩵ܺ;->ۧ()Z

    move-result p1

    goto :goto_3

    .line 2140
    :cond_a
    iget-boolean v1, v0, Ll/᩵ܳ;->ۜ:Z

    if-nez v1, :cond_e

    iget-boolean v4, v0, Ll/᩵ܳ;->᩻:Z

    if-eqz v4, :cond_b

    goto :goto_2

    .line 2146
    :cond_b
    iget-boolean v1, v0, Ll/᩵ܳ;->᩷:Z

    if-eqz v1, :cond_d

    .line 2148
    iget-boolean v1, v0, Ll/᩵ܳ;->ۘ:Z

    if-eqz v1, :cond_c

    .line 2151
    iput-boolean v5, v0, Ll/᩵ܳ;->᩷:Z

    .line 2152
    invoke-direct {p0, v0, p1}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_1

    :cond_c
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_d

    .line 2157
    invoke-direct {p0, v0, p1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Landroid/view/KeyEvent;)V

    const/4 p1, 0x1

    goto :goto_3

    :cond_d
    const/4 p1, 0x0

    goto :goto_3

    .line 2145
    :cond_e
    :goto_2
    invoke-virtual {p0, v0, v2}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    move p1, v1

    :goto_3
    if-eqz p1, :cond_10

    .line 2164
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    .line 2165
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_10

    .line 2167
    invoke-virtual {p1, v5}, Landroid/media/AudioManager;->playSoundEffect(I)V

    return v2

    .line 1582
    :cond_f
    invoke-virtual {p0}, Ll/ۚܳ;->᩹()Z

    move-result p1

    if-eqz p1, :cond_11

    :cond_10
    :goto_4
    return v2

    :cond_11
    :goto_5
    return v5
.end method

.method public final ۖ()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 717
    invoke-direct {p0, v0, v1}, Ll/ۚܳ;->֫(ZZ)Z

    return-void
.end method

.method public final ۘ()V
    .locals 2

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 725
    invoke-virtual {v0, v1}, Ll/ۤᩳ;->ᩳ(Z)V

    :cond_0
    return-void
.end method

.method public final ۙ()V
    .locals 2

    .line 369
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    .line 1464
    iget-object v0, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 1468
    :cond_0
    invoke-virtual {p0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 1469
    iget-boolean v0, v0, Ll/᩵ܳ;->ۜ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1473
    :cond_1
    iget-object v0, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz v0, :cond_2

    :goto_0
    const/4 v1, 0x1

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 371
    iget-object v0, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    if-nez v0, :cond_3

    .line 372
    iget-object v0, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v0, p0}, Ll/᩷ܳ;->֫(Ljava/lang/Object;Ll/ۚܳ;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    return-void

    :cond_3
    if-nez v1, :cond_4

    .line 373
    iget-object v0, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_4

    .line 374
    iget-object v1, p0, Ll/ۚܳ;->֡֫:Landroid/window/OnBackInvokedDispatcher;

    invoke-static {v1, v0}, Ll/᩷ܳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Ll/ۚܳ;->ۢ֫:Landroid/window/OnBackInvokedCallback;

    :cond_4
    return-void
.end method

.method public final ۜ(I)Ll/᩵ܳ;
    .locals 4

    .line 2218
    iget-object v0, p0, Ll/ۚܳ;->ۧۧ:[Ll/᩵ܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    if-gt v2, p1, :cond_2

    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 2219
    new-array v2, v2, [Ll/᩵ܳ;

    if-eqz v0, :cond_1

    .line 2221
    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2223
    :cond_1
    iput-object v2, p0, Ll/ۚܳ;->ۧۧ:[Ll/᩵ܳ;

    move-object v0, v2

    .line 2226
    :cond_2
    aget-object v2, v0, p1

    if-nez v2, :cond_3

    .line 2228
    new-instance v2, Ll/᩵ܳ;

    .line 3164
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 3165
    iput p1, v2, Ll/᩵ܳ;->ᩳ:I

    .line 3167
    iput-boolean v1, v2, Ll/᩵ܳ;->ۖ:Z

    .line 2228
    aput-object v2, v0, p1

    :cond_3
    return-object v2
.end method

.method public final ۜ()V
    .locals 1

    .line 573
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_1

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    .line 1279
    invoke-virtual {v0}, Ll/ۤᩳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1281
    invoke-direct {p0, v0}, Ll/ۚܳ;->ۡ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۠()V
    .locals 2

    .line 2446
    iget-object v0, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz v0, :cond_0

    .line 2447
    invoke-interface {v0}, Ll/᩵ܺ;->᩻()V

    .line 2450
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    .line 2451
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/ۚܳ;->ᩳۧ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2452
    iget-object v0, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2454
    :try_start_0
    iget-object v0, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 2460
    iput-object v0, p0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    .line 1452
    :cond_2
    iget-object v0, p0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    if-eqz v0, :cond_3

    .line 1453
    invoke-virtual {v0}, Ll/ܶ᩺;->֫()V

    :cond_3
    const/4 v0, 0x0

    .line 2464
    invoke-virtual {p0, v0}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 2465
    iget-object v0, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-eqz v0, :cond_4

    .line 2466
    invoke-virtual {v0}, Ll/ۗۜ;->close()V

    :cond_4
    return-void
.end method

.method public final ۡ()V
    .locals 0

    .line 561
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    return-void
.end method

.method public final ۢ()V
    .locals 5

    .line 778
    iget-object v0, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 779
    invoke-static {p0}, Ll/۬ܿ;->ۧ(Ll/۬ܿ;)V

    .line 782
    :cond_0
    iget-boolean v2, p0, Ll/ۚܳ;->۬֫:Z

    if-eqz v2, :cond_1

    .line 783
    iget-object v2, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Ll/ۚܳ;->۫֫:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v2, 0x1

    .line 786
    iput-boolean v2, p0, Ll/ۚܳ;->᩵֫:Z

    .line 788
    iget v2, p0, Ll/ۚܳ;->ۛ֫:I

    const/16 v3, -0x64

    sget-object v4, Ll/ۚܳ;->᩵ۧ:Ll/ۗ᩵;

    if-eq v2, v3, :cond_2

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    .line 790
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 792
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Ll/ۚܳ;->ۛ֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 794
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    :goto_0
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_3

    .line 798
    invoke-virtual {v0}, Ll/ۤᩳ;->᩻()V

    .line 807
    :cond_3
    iget-object v0, p0, Ll/ۚܳ;->᩷֫:Ll/ۘܳ;

    if-eqz v0, :cond_4

    .line 808
    invoke-virtual {v0}, Ll/ۖܳ;->֫()V

    .line 810
    :cond_4
    iget-object v0, p0, Ll/ۚܳ;->ۜ֫:Ll/ۡܳ;

    if-eqz v0, :cond_5

    .line 811
    invoke-virtual {v0}, Ll/ۖܳ;->֫()V

    :cond_5
    return-void
.end method

.method public final ۢ(I)V
    .locals 2

    const/16 v0, 0x6c

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object p1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz p1, :cond_1

    .line 1208
    invoke-virtual {p1, v1}, Ll/ۤᩳ;->֫(Z)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 1213
    invoke-virtual {p0, p1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object p1

    .line 1214
    iget-boolean v0, p1, Ll/᩵ܳ;->ۜ:Z

    if-eqz v0, :cond_1

    .line 1215
    invoke-virtual {p0, p1, v1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۗۜ;)Ll/᩵ܳ;
    .locals 5

    .line 2205
    iget-object v0, p0, Ll/ۚܳ;->ۧۧ:[Ll/᩵ܳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2206
    array-length v2, v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 2208
    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    .line 2209
    iget-object v4, v3, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 757
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 758
    iget-object v0, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 759
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 760
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 761
    iget-object p1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object p2, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    .line 2498
    invoke-direct {p0, v0, v0}, Ll/ۚܳ;->֫(ZZ)Z

    move-result v0

    return v0
.end method

.method public final ۧ(I)Z
    .locals 5

    const/16 v0, 0x8

    const/16 v1, 0x6d

    const/16 v2, 0x6c

    if-ne p1, v0, :cond_0

    const/16 p1, 0x6c

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    const/16 p1, 0x6d

    .line 1118
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ۚܳ;->ۘۧ:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne p1, v2, :cond_2

    return v3

    .line 1121
    :cond_2
    iget-boolean v0, p0, Ll/ۚܳ;->᩶֫:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v4, :cond_3

    .line 1123
    iput-boolean v3, p0, Ll/ۚܳ;->᩶֫:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    if-eq p1, v2, :cond_5

    if-eq p1, v1, :cond_4

    .line 1153
    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    .line 1132
    :cond_4
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1133
    iput-boolean v4, p0, Ll/ۚܳ;->ܰ֫:Z

    return v4

    .line 1128
    :cond_5
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1129
    iput-boolean v4, p0, Ll/ۚܳ;->᩶֫:Z

    return v4

    .line 1136
    :cond_6
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1137
    iput-boolean v4, p0, Ll/ۚܳ;->۟֫:Z

    return v4

    .line 1144
    :cond_7
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1145
    iput-boolean v4, p0, Ll/ۚܳ;->ܶ֫:Z

    return v4

    .line 1140
    :cond_8
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1141
    iput-boolean v4, p0, Ll/ۚܳ;->᩸֫:Z

    return v4

    .line 1148
    :cond_9
    invoke-direct {p0}, Ll/ۚܳ;->ۤ()V

    .line 1149
    iput-boolean v4, p0, Ll/ۚܳ;->ۘۧ:Z

    return v4
.end method

.method public final ܳ()Ll/ۤᩳ;
    .locals 1

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    return-object v0
.end method

.method public final ܶ()Landroid/content/Context;
    .locals 1

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_0

    .line 643
    invoke-virtual {v0}, Ll/ۤᩳ;->ᩳ()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 647
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public final ܺ()V
    .locals 2

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 733
    invoke-virtual {v0, v1}, Ll/ۤᩳ;->ᩳ(Z)V

    :cond_0
    return-void
.end method

.method public final ܽ()Landroid/content/Context;
    .locals 1

    .line 2472
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 748
    invoke-direct {p0}, Ll/ۚܳ;->ۗ()V

    .line 749
    iget-object v0, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 750
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 751
    iget-object v1, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 752
    iget-object p1, p0, Ll/ۚܳ;->᩻֫:Ll/ۢܳ;

    iget-object v0, p0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۢܳ;->֫(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final ܿ()Landroid/view/MenuInflater;
    .locals 2

    .line 655
    iget-object v0, p0, Ll/ۚܳ;->᩺֫:Ll/۟᩻;

    if-nez v0, :cond_1

    .line 656
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 657
    new-instance v0, Ll/۟᩻;

    .line 658
    iget-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۤᩳ;->ᩳ()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Ll/۟᩻;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۚܳ;->᩺֫:Ll/۟᩻;

    .line 660
    :cond_1
    iget-object v0, p0, Ll/ۚܳ;->᩺֫:Ll/۟᩻;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 817
    iput p1, p0, Ll/ۚܳ;->ۢۧ:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 2624
    iget v0, p0, Ll/ۚܳ;->ۛ֫:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 2612
    iget v0, p0, Ll/ۚܳ;->ۛ֫:I

    if-eq v0, p1, :cond_0

    .line 2613
    iput p1, p0, Ll/ۚܳ;->ۛ֫:I

    .line 2614
    iget-boolean p1, p0, Ll/ۚܳ;->ۡ֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2498
    invoke-direct {p0, p1, p1}, Ll/ۚܳ;->֫(ZZ)Z

    :cond_0
    return-void
.end method

.method public final ᩶()Z
    .locals 1

    .line 1438
    iget-boolean v0, p0, Ll/ۚܳ;->᩻ۧ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()V
    .locals 3

    const/4 v0, 0x1

    .line 523
    iput-boolean v0, p0, Ll/ۚܳ;->ۡ֫:Z

    const/4 v1, 0x0

    .line 2498
    invoke-direct {p0, v1, v0}, Ll/ۚܳ;->֫(ZZ)Z

    .line 531
    invoke-direct {p0}, Ll/ۚܳ;->۬()V

    .line 533
    iget-object v1, p0, Ll/ۚܳ;->ۙ֫:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    .line 536
    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 206
    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ᩳ᩶;->֫(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 209
    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 573
    iget-object v1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-nez v1, :cond_0

    .line 544
    iput-boolean v0, p0, Ll/ۚܳ;->֨֫:Z

    goto :goto_1

    .line 546
    :cond_0
    invoke-virtual {v1, v0}, Ll/ۤᩳ;->ۧ(Z)V

    .line 551
    :cond_1
    :goto_1
    invoke-static {p0}, Ll/۬ܿ;->֫(Ll/۬ܿ;)V

    .line 554
    :cond_2
    new-instance v1, Landroid/content/res/Configuration;

    iget-object v2, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v1, p0, Ll/ۚܳ;->ۚ֫:Landroid/content/res/Configuration;

    .line 555
    iput-boolean v0, p0, Ll/ۚܳ;->ۘ֫:Z

    return-void
.end method

.method public final ᩷(I)V
    .locals 1

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_0

    .line 568
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object p1, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 1224
    invoke-virtual {p1, v0}, Ll/ۤᩳ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 1448
    iget-boolean v0, p0, Ll/ۚܳ;->᩹֫:Z

    return v0
.end method

.method public final ᩹()Z
    .locals 5

    .line 1488
    iget-boolean v0, p0, Ll/ۚܳ;->ۨ֫:Z

    const/4 v1, 0x0

    .line 1489
    iput-boolean v1, p0, Ll/ۚܳ;->ۨ֫:Z

    .line 1493
    invoke-virtual {p0, v1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v2

    .line 1494
    iget-boolean v3, v2, Ll/᩵ܳ;->ۜ:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    if-nez v0, :cond_2

    .line 1496
    invoke-virtual {p0, v2, v4}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    return v4

    .line 1502
    :cond_0
    iget-object v0, p0, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    if-eqz v0, :cond_1

    .line 1503
    invoke-virtual {v0}, Ll/ۗ᩻;->֫()V

    return v4

    .line 568
    :cond_1
    invoke-direct {p0}, Ll/ۚܳ;->۫()V

    .line 569
    iget-object v0, p0, Ll/ۚܳ;->᩺:Ll/ۤᩳ;

    if-eqz v0, :cond_3

    .line 1509
    invoke-virtual {v0}, Ll/ۤᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    return v4

    :cond_3
    return v1
.end method

.method public final ᩻()V
    .locals 2

    .line 1688
    iget-object v0, p0, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 1689
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    .line 141
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-void

    .line 1692
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    return-void
.end method

.method public final ᩻(I)V
    .locals 3

    .line 2268
    invoke-virtual {p0, p1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 2270
    iget-object v1, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    if-eqz v1, :cond_1

    .line 2271
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2272
    iget-object v2, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v2, v1}, Ll/ۗۜ;->saveActionViewStates(Landroid/os/Bundle;)V

    .line 2273
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 2274
    iput-object v1, v0, Ll/᩵ܳ;->ܿ:Landroid/os/Bundle;

    .line 2277
    :cond_0
    iget-object v1, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v1}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 2278
    iget-object v1, v0, Ll/᩵ܳ;->ܺ:Ll/ۗۜ;

    invoke-virtual {v1}, Ll/ۗۜ;->clear()V

    :cond_1
    const/4 v1, 0x1

    .line 2280
    iput-boolean v1, v0, Ll/᩵ܳ;->ۘ:Z

    .line 2281
    iput-boolean v1, v0, Ll/᩵ܳ;->ۖ:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    .line 2284
    :cond_2
    iget-object p1, p0, Ll/ۚܳ;->ᩴ֫:Ll/᩵ܺ;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 2286
    invoke-virtual {p0, p1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object v0

    .line 2288
    iput-boolean p1, v0, Ll/᩵ܳ;->᩷:Z

    const/4 p1, 0x0

    .line 2289
    invoke-direct {p0, v0, p1}, Ll/ۚܳ;->ۧ(Ll/᩵ܳ;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method
