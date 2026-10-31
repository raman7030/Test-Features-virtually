.class public final Ll/ܿ᩻;
.super Ll/ۤᩳ;
.source "45OX"


# static fields
.field public static final ۗ:Landroid/view/animation/DecelerateInterpolator;

.field public static final ۙ:Landroid/view/animation/AccelerateInterpolator;


# instance fields
.field public ֡:Ljava/util/ArrayList;

.field public ֨:Ll/ۤ᩷;

.field public ֫:Ll/ᩳ᩻;

.field public ۖ:Z

.field public final ۘ:Ll/᩸᩺;

.field public ۚ:Z

.field public ۜ:Ll/ۧۜ;

.field public ۠:Z

.field public ۡ:Ll/ۙ᩻;

.field public ۢ:Ll/ᩳ᩻;

.field public ۧ:Ll/ܶ᩷;

.field public ܳ:Ll/᩹᩷;

.field public final ܶ:Ll/᩸᩺;

.field public ܺ:Z

.field public ܽ:Z

.field public ܿ:Landroid/content/Context;

.field public ᩳ:Landroid/view/View;

.field public ᩴ:Z

.field public ᩵:Z

.field public final ᩶:Ll/᩹᩺;

.field public ᩷:Ll/֡ܺ;

.field public ᩸:Z

.field public ᩹:Landroid/content/Context;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 83
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Ll/ܿ᩻;->ۙ:Landroid/view/animation/AccelerateInterpolator;

    .line 84
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Ll/ܿ᩻;->ۗ:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    .line 167
    invoke-direct {p0}, Ll/ۤᩳ;-><init>()V

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩻;->֡:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 120
    iput v0, p0, Ll/ܿ᩻;->᩻:I

    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Ll/ܿ᩻;->ܽ:Z

    .line 127
    iput-boolean v0, p0, Ll/ܿ᩻;->ۚ:Z

    .line 133
    new-instance v0, Ll/֫᩻;

    invoke-direct {v0, p0}, Ll/֫᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->ۘ:Ll/᩸᩺;

    .line 150
    new-instance v0, Ll/ۧ᩻;

    invoke-direct {v0, p0}, Ll/ۧ᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->ܶ:Ll/᩸᩺;

    .line 158
    new-instance v0, Ll/ܽ᩻;

    invoke-direct {v0, p0}, Ll/ܽ᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->᩶:Ll/᩹᩺;

    .line 169
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 170
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 171
    invoke-direct {p0, p1}, Ll/ܿ᩻;->֫(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 173
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩻;->ᩳ:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    .line 177
    invoke-direct {p0}, Ll/ۤᩳ;-><init>()V

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩻;->֡:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 120
    iput v0, p0, Ll/ܿ᩻;->᩻:I

    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Ll/ܿ᩻;->ܽ:Z

    .line 127
    iput-boolean v0, p0, Ll/ܿ᩻;->ۚ:Z

    .line 133
    new-instance v0, Ll/֫᩻;

    invoke-direct {v0, p0}, Ll/֫᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->ۘ:Ll/᩸᩺;

    .line 150
    new-instance v0, Ll/ۧ᩻;

    invoke-direct {v0, p0}, Ll/ۧ᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->ܶ:Ll/᩸᩺;

    .line 158
    new-instance v0, Ll/ܽ᩻;

    invoke-direct {v0, p0}, Ll/ܽ᩻;-><init>(Ll/ܿ᩻;)V

    iput-object v0, p0, Ll/ܿ᩻;->᩶:Ll/᩹᩺;

    .line 178
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܿ᩻;->֫(Landroid/view/View;)V

    return-void
.end method

.method private ֫(Landroid/view/View;)V
    .locals 5

    const v0, 0x7f0a0139

    .line 190
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤ᩷;

    iput-object v0, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {v0, p0}, Ll/ۤ᩷;->֫(Ll/ܿ᩻;)V

    :cond_0
    const v0, 0x7f0a0042

    .line 194
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 232
    instance-of v1, v0, Ll/֡ܺ;

    if-eqz v1, :cond_1

    .line 233
    check-cast v0, Ll/֡ܺ;

    goto :goto_0

    .line 234
    :cond_1
    instance-of v1, v0, Ll/ۢᩴ;

    if-eqz v1, :cond_8

    .line 235
    check-cast v0, Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ۢᩴ;->getWrapper()Ll/֡ܺ;

    move-result-object v0

    .line 194
    :goto_0
    iput-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    const v0, 0x7f0a004a

    .line 195
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/᩹᩷;

    iput-object v0, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    const v0, 0x7f0a0044

    .line 197
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ܶ᩷;

    iput-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    .line 200
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    if-eqz v0, :cond_7

    iget-object v1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    .line 205
    invoke-interface {v0}, Ll/֡ܺ;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    .line 208
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1}, Ll/֡ܺ;->ۢ()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 211
    iput-boolean v0, p0, Ll/ܿ᩻;->ܺ:Z

    .line 214
    :cond_3
    iget-object p1, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-static {p1}, Ll/᩶᩻;->֫(Landroid/content/Context;)Ll/᩶᩻;

    move-result-object p1

    .line 215
    invoke-virtual {p1}, Ll/᩶᩻;->֫()Z

    .line 390
    iget-object v2, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    invoke-virtual {p1}, Ll/᩶᩻;->ܳ()Z

    move-result p1

    invoke-direct {p0, p1}, Ll/ܿ᩻;->᩻(Z)V

    .line 218
    iget-object p1, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    sget-object v2, Ll/ۗᩳ;->֫:[I

    const v3, 0x7f040005

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v2, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v2, 0xe

    .line 221
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 725
    iget-object v2, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    invoke-virtual {v2}, Ll/ۤ᩷;->᩷()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 729
    iput-boolean v0, p0, Ll/ܿ᩻;->ᩴ:Z

    .line 730
    iget-object v2, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    invoke-virtual {v2, v0}, Ll/ۤ᩷;->ۧ(Z)V

    goto :goto_2

    .line 726
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    const/16 v0, 0xc

    .line 224
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    .line 244
    iget-object v1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-static {v1, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;F)V

    .line 228
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    .line 201
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "WindowDecorActionBar can only be used with a compatible window decor layout"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 237
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_9

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_9
    const-string v0, "null"

    :goto_3
    const-string v1, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۜ(Z)V
    .locals 8

    .line 765
    iget-boolean v0, p0, Ll/ܿ᩻;->ۖ:Z

    iget-boolean v1, p0, Ll/ܿ᩻;->᩸:Z

    const/high16 v2, 0x3f800000    # 1.0f

    .line 754
    iget-object v3, p0, Ll/ܿ᩻;->᩶:Ll/᩹᩺;

    iget-object v4, p0, Ll/ܿ᩻;->ᩳ:Landroid/view/View;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz v0, :cond_6

    .line 774
    iget-boolean v0, p0, Ll/ܿ᩻;->ۚ:Z

    if-eqz v0, :cond_d

    .line 775
    iput-boolean v6, p0, Ll/ܿ᩻;->ۚ:Z

    .line 831
    iget-object v0, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    if-eqz v0, :cond_1

    .line 832
    invoke-virtual {v0}, Ll/ۧۜ;->֫()V

    .line 835
    :cond_1
    iget v0, p0, Ll/ܿ᩻;->᩻:I

    iget-object v1, p0, Ll/ܿ᩻;->ۘ:Ll/᩸᩺;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ll/ܿ᩻;->۠:Z

    if-nez v0, :cond_2

    if-eqz p1, :cond_5

    .line 836
    :cond_2
    iget-object v0, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 837
    iget-object v0, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v0, v5}, Ll/ܶ᩷;->֫(Z)V

    .line 838
    new-instance v0, Ll/ۧۜ;

    invoke-direct {v0}, Ll/ۧۜ;-><init>()V

    .line 839
    iget-object v2, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    if-eqz p1, :cond_3

    .line 841
    filled-new-array {v6, v6}, [I

    move-result-object p1

    .line 842
    iget-object v6, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v6, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 843
    aget p1, p1, v5

    int-to-float p1, p1

    sub-float/2addr v2, p1

    .line 845
    :cond_3
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-static {p1}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ܶ᩺;->ۧ(F)V

    .line 846
    invoke-virtual {p1, v3}, Ll/ܶ᩺;->֫(Ll/᩹᩺;)V

    .line 847
    invoke-virtual {v0, p1}, Ll/ۧۜ;->֫(Ll/ܶ᩺;)V

    .line 848
    iget-boolean p1, p0, Ll/ܿ᩻;->ܽ:Z

    if-eqz p1, :cond_4

    if-eqz v4, :cond_4

    .line 849
    invoke-static {v4}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ܶ᩺;->ۧ(F)V

    invoke-virtual {v0, p1}, Ll/ۧۜ;->֫(Ll/ܶ᩺;)V

    .line 851
    :cond_4
    sget-object p1, Ll/ܿ᩻;->ۙ:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {v0, p1}, Ll/ۧۜ;->֫(Landroid/view/animation/Interpolator;)V

    .line 852
    invoke-virtual {v0}, Ll/ۧۜ;->ܽ()V

    .line 853
    check-cast v1, Ll/֨ۧܺ;

    invoke-virtual {v0, v1}, Ll/ۧۜ;->֫(Ll/֨ۧܺ;)V

    .line 854
    iput-object v0, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    .line 855
    invoke-virtual {v0}, Ll/ۧۜ;->ᩳ()V

    return-void

    .line 857
    :cond_5
    check-cast v1, Ll/֫᩻;

    invoke-virtual {v1}, Ll/֫᩻;->onAnimationEnd()V

    return-void

    .line 769
    :cond_6
    :goto_0
    iget-boolean v0, p0, Ll/ܿ᩻;->ۚ:Z

    if-nez v0, :cond_d

    .line 770
    iput-boolean v5, p0, Ll/ܿ᩻;->ۚ:Z

    .line 782
    iget-object v0, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    if-eqz v0, :cond_7

    .line 783
    invoke-virtual {v0}, Ll/ۧۜ;->֫()V

    .line 785
    :cond_7
    iget-object v0, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v0, v6}, Ll/ܶ᩷;->setVisibility(I)V

    .line 787
    iget v0, p0, Ll/ܿ᩻;->᩻:I

    iget-object v1, p0, Ll/ܿ᩻;->ܶ:Ll/᩸᩺;

    const/4 v7, 0x0

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/ܿ᩻;->۠:Z

    if-nez v0, :cond_8

    if-eqz p1, :cond_b

    .line 789
    :cond_8
    iget-object v0, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v0, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 790
    iget-object v0, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_9

    .line 792
    filled-new-array {v6, v6}, [I

    move-result-object p1

    .line 793
    iget-object v2, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v2, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 794
    aget p1, p1, v5

    int-to-float p1, p1

    sub-float/2addr v0, p1

    .line 796
    :cond_9
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 797
    new-instance p1, Ll/ۧۜ;

    invoke-direct {p1}, Ll/ۧۜ;-><init>()V

    .line 798
    iget-object v2, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-static {v2}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v2

    invoke-virtual {v2, v7}, Ll/ܶ᩺;->ۧ(F)V

    .line 799
    invoke-virtual {v2, v3}, Ll/ܶ᩺;->֫(Ll/᩹᩺;)V

    .line 800
    invoke-virtual {p1, v2}, Ll/ۧۜ;->֫(Ll/ܶ᩺;)V

    .line 801
    iget-boolean v2, p0, Ll/ܿ᩻;->ܽ:Z

    if-eqz v2, :cond_a

    if-eqz v4, :cond_a

    .line 802
    invoke-virtual {v4, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 803
    invoke-static {v4}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v0

    invoke-virtual {v0, v7}, Ll/ܶ᩺;->ۧ(F)V

    invoke-virtual {p1, v0}, Ll/ۧۜ;->֫(Ll/ܶ᩺;)V

    .line 805
    :cond_a
    sget-object v0, Ll/ܿ᩻;->ۗ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Ll/ۧۜ;->֫(Landroid/view/animation/Interpolator;)V

    .line 806
    invoke-virtual {p1}, Ll/ۧۜ;->ܽ()V

    .line 814
    check-cast v1, Ll/֨ۧܺ;

    invoke-virtual {p1, v1}, Ll/ۧۜ;->֫(Ll/֨ۧܺ;)V

    .line 815
    iput-object p1, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    .line 816
    invoke-virtual {p1}, Ll/ۧۜ;->ᩳ()V

    goto :goto_1

    .line 818
    :cond_b
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 819
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 820
    iget-boolean p1, p0, Ll/ܿ᩻;->ܽ:Z

    if-eqz p1, :cond_c

    if-eqz v4, :cond_c

    .line 821
    invoke-virtual {v4, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 823
    :cond_c
    check-cast v1, Ll/ۧ᩻;

    invoke-virtual {v1}, Ll/ۧ᩻;->onAnimationEnd()V

    .line 825
    :goto_1
    iget-object p1, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    if-eqz p1, :cond_d

    .line 826
    invoke-static {p1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_d
    return-void
.end method

.method private ᩻(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 261
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1}, Ll/֡ܺ;->᩷()V

    .line 262
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 264
    :cond_0
    iget-object p1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1}, Ll/֡ܺ;->᩷()V

    .line 508
    :goto_0
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ll/֡ܺ;->֫(Z)V

    .line 279
    iget-object p1, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    invoke-virtual {p1, v0}, Ll/ۤ᩷;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۙ᩻;)Ll/ۗ᩻;
    .locals 2

    .line 518
    iget-object v0, p0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    if-eqz v0, :cond_0

    .line 519
    invoke-virtual {v0}, Ll/ᩳ᩻;->֫()V

    .line 522
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۤ᩷;->ۧ(Z)V

    .line 523
    iget-object v0, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v0}, Ll/᩹᩷;->ܿ()V

    .line 524
    new-instance v0, Ll/ᩳ᩻;

    iget-object v1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Ll/ᩳ᩻;-><init>(Ll/ܿ᩻;Landroid/content/Context;Ll/ۙ᩻;)V

    .line 525
    invoke-virtual {v0}, Ll/ᩳ᩻;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 528
    iput-object v0, p0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    .line 529
    invoke-virtual {v0}, Ll/ᩳ᩻;->᩷()V

    .line 530
    iget-object p1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {p1, v0}, Ll/᩹᩷;->֫(Ll/ۗ᩻;)V

    const/4 p1, 0x1

    .line 531
    invoke-virtual {p0, p1}, Ll/ܿ᩻;->ܿ(Z)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 952
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0, p1}, Ll/֡ܺ;->ۧ(I)V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 937
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0, p1}, Ll/֡ܺ;->֫(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 441
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0, p1}, Ll/֡ܺ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 346
    iget-boolean v0, p0, Ll/ܿ᩻;->᩵:Z

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 349
    :cond_0
    iput-boolean p1, p0, Ll/ܿ᩻;->᩵:Z

    .line 351
    iget-object p1, p0, Ll/ܿ᩻;->֡:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 353
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ᩳ;

    invoke-interface {v2}, Ll/۫ᩳ;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1392
    iget-object v0, p0, Ll/ܿ᩻;->֫:Ll/ᩳ᩻;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 1395
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ᩻;->ܽ()Ll/ۗۜ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1398
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    .line 1397
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    .line 1399
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 1400
    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    :goto_1
    return v1
.end method

.method public final ۡ()V
    .locals 1

    .line 691
    iget-boolean v0, p0, Ll/ܿ᩻;->ۖ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 692
    iput-boolean v0, p0, Ll/ܿ᩻;->ۖ:Z

    const/4 v0, 0x1

    .line 693
    invoke-direct {p0, v0}, Ll/ܿ᩻;->ۜ(Z)V

    :cond_0
    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 957
    iget-object v0, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    if-eqz v0, :cond_0

    .line 958
    invoke-virtual {v0}, Ll/ۧۜ;->֫()V

    const/4 v0, 0x0

    .line 959
    iput-object v0, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    :cond_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 316
    iput p1, p0, Ll/ܿ᩻;->᩻:I

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 1385
    iget-boolean v0, p0, Ll/ܿ᩻;->ܺ:Z

    if-nez v0, :cond_0

    .line 1386
    invoke-virtual {p0, p1}, Ll/ܿ᩻;->ܽ(Z)V

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 969
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/֡ܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 970
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()V
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-static {v0}, Ll/᩶᩻;->֫(Landroid/content/Context;)Ll/᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩻;->ܳ()Z

    move-result v0

    invoke-direct {p0, v0}, Ll/ܿ᩻;->᩻(Z)V

    return-void
.end method

.method public final ܳ(Z)V
    .locals 0

    .line 668
    iput-boolean p1, p0, Ll/ܿ᩻;->ܽ:Z

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 513
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ۢ()I

    move-result v0

    return v0
.end method

.method public final ܽ(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 469
    :goto_0
    iget-object v0, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {v0}, Ll/֡ܺ;->ۢ()I

    move-result v0

    const/4 v1, 0x1

    .line 471
    iput-boolean v1, p0, Ll/ܿ᩻;->ܺ:Z

    .line 473
    iget-object v1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    and-int/lit8 p1, p1, 0x4

    and-int/lit8 v0, v0, -0x5

    or-int/2addr p1, v0

    invoke-interface {v1, p1}, Ll/֡ܺ;->֫(I)V

    return-void
.end method

.method public final ܿ(Z)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 680
    iget-boolean v1, p0, Ll/ܿ᩻;->᩸:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 681
    iput-boolean v1, p0, Ll/ܿ᩻;->᩸:Z

    .line 685
    invoke-direct {p0, v0}, Ll/ܿ᩻;->ۜ(Z)V

    goto :goto_0

    .line 706
    :cond_0
    iget-boolean v1, p0, Ll/ܿ᩻;->᩸:Z

    if-eqz v1, :cond_1

    .line 707
    iput-boolean v0, p0, Ll/ܿ᩻;->᩸:Z

    .line 711
    invoke-direct {p0, v0}, Ll/ܿ᩻;->ۜ(Z)V

    .line 910
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x4

    if-eqz v1, :cond_3

    const-wide/16 v4, 0xc8

    const-wide/16 v6, 0x64

    if-eqz p1, :cond_2

    .line 882
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1, v3, v6, v7}, Ll/֡ܺ;->֫(IJ)Ll/ܶ᩺;

    move-result-object p1

    .line 884
    iget-object v1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {v1, v0, v4, v5}, Ll/᩹᩷;->֫(IJ)Ll/ܶ᩺;

    move-result-object v0

    goto :goto_1

    .line 887
    :cond_2
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1, v0, v4, v5}, Ll/֡ܺ;->֫(IJ)Ll/ܶ᩺;

    move-result-object v0

    .line 889
    iget-object p1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {p1, v2, v6, v7}, Ll/᩹᩷;->֫(IJ)Ll/ܶ᩺;

    move-result-object p1

    .line 892
    :goto_1
    new-instance v1, Ll/ۧۜ;

    invoke-direct {v1}, Ll/ۧۜ;-><init>()V

    .line 893
    invoke-virtual {v1, p1, v0}, Ll/ۧۜ;->֫(Ll/ܶ᩺;Ll/ܶ᩺;)V

    .line 894
    invoke-virtual {v1}, Ll/ۧۜ;->ᩳ()V

    return-void

    :cond_3
    if-eqz p1, :cond_4

    .line 897
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1, v3}, Ll/֡ܺ;->setVisibility(I)V

    .line 898
    iget-object p1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {p1, v0}, Ll/֨᩷;->setVisibility(I)V

    return-void

    .line 900
    :cond_4
    iget-object p1, p0, Ll/ܿ᩻;->᩷:Ll/֡ܺ;

    invoke-interface {p1, v0}, Ll/֡ܺ;->setVisibility(I)V

    .line 901
    iget-object p1, p0, Ll/ܿ᩻;->ܳ:Ll/᩹᩷;

    invoke-virtual {p1, v2}, Ll/֨᩷;->setVisibility(I)V

    return-void
.end method

.method public final ᩳ()Landroid/content/Context;
    .locals 4

    .line 915
    iget-object v0, p0, Ll/ܿ᩻;->᩹:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 916
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 917
    iget-object v1, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f04000a

    const/4 v3, 0x1

    .line 918
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 919
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 922
    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Ll/ܿ᩻;->᩹:Landroid/content/Context;

    goto :goto_0

    .line 924
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻;->ܿ:Landroid/content/Context;

    iput-object v0, p0, Ll/ܿ᩻;->᩹:Landroid/content/Context;

    .line 927
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܿ᩻;->᩹:Landroid/content/Context;

    return-object v0
.end method

.method public final ᩳ(Z)V
    .locals 0

    .line 328
    iput-boolean p1, p0, Ll/ܿ᩻;->۠:Z

    if-nez p1, :cond_0

    .line 329
    iget-object p1, p0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    if-eqz p1, :cond_0

    .line 330
    invoke-virtual {p1}, Ll/ۧۜ;->֫()V

    :cond_0
    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 717
    iget-boolean v0, p0, Ll/ܿ᩻;->ۖ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 718
    iput-boolean v0, p0, Ll/ܿ᩻;->ۖ:Z

    .line 719
    invoke-direct {p0, v0}, Ll/ܿ᩻;->ۜ(Z)V

    :cond_0
    return-void
.end method
