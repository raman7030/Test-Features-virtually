.class public final Ll/ܰ᩸;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "S6AR"


# instance fields
.field public ֡:I

.field public ֫:I

.field public ۖ:Z

.field public ۘ:Z

.field public final ۚ:Landroid/graphics/Rect;

.field public ۜ:Landroid/view/View;

.field public ۡ:Ljava/lang/Object;

.field public ۢ:Z

.field public ۧ:I

.field public ܳ:Landroid/view/View;

.field public ܺ:Z

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:Z

.field public ᩵:I

.field public ᩷:Ll/ۛ᩸;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, -0x2

    .line 2869
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 2809
    iput-boolean v0, p0, Ll/ܰ᩸;->ۢ:Z

    .line 2818
    iput v0, p0, Ll/ܰ᩸;->ܽ:I

    .line 2824
    iput v0, p0, Ll/ܰ᩸;->֫:I

    const/4 v1, -0x1

    .line 2831
    iput v1, p0, Ll/ܰ᩸;->ܿ:I

    .line 2837
    iput v1, p0, Ll/ܰ᩸;->᩻:I

    .line 2844
    iput v0, p0, Ll/ܰ᩸;->ᩳ:I

    .line 2851
    iput v0, p0, Ll/ܰ᩸;->ۧ:I

    .line 2864
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 2873
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2809
    iput-boolean v0, p0, Ll/ܰ᩸;->ۢ:Z

    .line 2818
    iput v0, p0, Ll/ܰ᩸;->ܽ:I

    .line 2824
    iput v0, p0, Ll/ܰ᩸;->֫:I

    const/4 v1, -0x1

    .line 2831
    iput v1, p0, Ll/ܰ᩸;->ܿ:I

    .line 2837
    iput v1, p0, Ll/ܰ᩸;->᩻:I

    .line 2844
    iput v0, p0, Ll/ܰ᩸;->ᩳ:I

    .line 2851
    iput v0, p0, Ll/ܰ᩸;->ۧ:I

    .line 2864
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    .line 2875
    sget-object v2, Ll/۬᩸;->ۧ:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 2878
    invoke-virtual {v2, v0, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Ll/ܰ᩸;->ܽ:I

    const/4 v3, 0x1

    .line 2881
    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ܰ᩸;->᩻:I

    const/4 v3, 0x2

    .line 2883
    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Ll/ܰ᩸;->֫:I

    const/4 v3, 0x6

    .line 2887
    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩸;->ܿ:I

    const/4 v1, 0x5

    .line 2890
    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩸;->ᩳ:I

    const/4 v1, 0x4

    .line 2891
    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Ll/ܰ᩸;->ۧ:I

    const/4 v0, 0x3

    .line 2893
    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܰ᩸;->ۢ:Z

    if-eqz v1, :cond_0

    .line 2896
    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/ᩳ᩹;->֫(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Ll/ۛ᩸;

    move-result-object p1

    iput-object p1, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    .line 2899
    :cond_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 2901
    iget-object p1, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz p1, :cond_1

    .line 2903
    invoke-virtual {p1, p0}, Ll/ۛ᩸;->onAttachedToLayoutParams(Ll/ܰ᩸;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 2916
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Ll/ܰ᩸;->ۢ:Z

    .line 2818
    iput p1, p0, Ll/ܰ᩸;->ܽ:I

    .line 2824
    iput p1, p0, Ll/ܰ᩸;->֫:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Ll/ܰ᩸;->ܿ:I

    .line 2837
    iput v0, p0, Ll/ܰ᩸;->᩻:I

    .line 2844
    iput p1, p0, Ll/ܰ᩸;->ᩳ:I

    .line 2851
    iput p1, p0, Ll/ܰ᩸;->ۧ:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .line 2912
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Ll/ܰ᩸;->ۢ:Z

    .line 2818
    iput p1, p0, Ll/ܰ᩸;->ܽ:I

    .line 2824
    iput p1, p0, Ll/ܰ᩸;->֫:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Ll/ܰ᩸;->ܿ:I

    .line 2837
    iput v0, p0, Ll/ܰ᩸;->᩻:I

    .line 2844
    iput p1, p0, Ll/ܰ᩸;->ᩳ:I

    .line 2851
    iput p1, p0, Ll/ܰ᩸;->ۧ:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Ll/ܰ᩸;)V
    .locals 1

    .line 2908
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Ll/ܰ᩸;->ۢ:Z

    .line 2818
    iput p1, p0, Ll/ܰ᩸;->ܽ:I

    .line 2824
    iput p1, p0, Ll/ܰ᩸;->֫:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Ll/ܰ᩸;->ܿ:I

    .line 2837
    iput v0, p0, Ll/ܰ᩸;->᩻:I

    .line 2844
    iput p1, p0, Ll/ܰ᩸;->ᩳ:I

    .line 2851
    iput p1, p0, Ll/ܰ᩸;->ۧ:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final ֫(IZ)V
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-void

    .line 3063
    :cond_0
    iput-boolean p2, p0, Ll/ܰ᩸;->ܺ:Z

    return-void

    .line 3060
    :cond_1
    iput-boolean p2, p0, Ll/ܰ᩸;->ۖ:Z

    return-void
.end method

.method public final ֫(Ll/ۛ᩸;)V
    .locals 1

    .line 2965
    iget-object v0, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    .line 2968
    invoke-virtual {v0}, Ll/ۛ᩸;->onDetachedFromLayoutParams()V

    .line 2971
    :cond_0
    iput-object p1, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    const/4 v0, 0x0

    .line 2972
    iput-object v0, p0, Ll/ܰ᩸;->ۡ:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 2973
    iput-boolean v0, p0, Ll/ܰ᩸;->ۢ:Z

    if-eqz p1, :cond_1

    .line 2977
    invoke-virtual {p1, p0}, Ll/ۛ᩸;->onAttachedToLayoutParams(Ll/ܰ᩸;)V

    :cond_1
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 3083
    iput-boolean p1, p0, Ll/ܰ᩸;->ᩴ:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 3014
    iget-object v0, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 3015
    iput-boolean v0, p0, Ll/ܰ᩸;->ۘ:Z

    .line 3017
    :cond_0
    iget-boolean v0, p0, Ll/ܰ᩸;->ۘ:Z

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3073
    :cond_0
    iget-boolean p1, p0, Ll/ܰ᩸;->ܺ:Z

    return p1

    .line 3071
    :cond_1
    iget-boolean p1, p0, Ll/ܰ᩸;->ۖ:Z

    return p1
.end method

.method public final ֫(Ll/ᩳ᩹;Landroid/view/View;)Z
    .locals 2

    .line 3033
    iget-boolean v0, p0, Ll/ܰ᩸;->ۘ:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3037
    :cond_0
    iget-object v1, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v1, :cond_1

    .line 3038
    invoke-virtual {v1, p1, p2}, Ll/ۛ᩸;->blocksInteractionBelow(Ll/ᩳ᩹;Landroid/view/View;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput-boolean p1, p0, Ll/ܰ᩸;->ۘ:Z

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 2926
    iget v0, p0, Ll/ܰ᩸;->᩻:I

    return v0
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 3050
    iput-boolean v0, p0, Ll/ܰ᩸;->ۘ:Z

    return-void
.end method

.method public final ܽ()Ll/ۛ᩸;
    .locals 1

    .line 2952
    iget-object v0, p0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    return-object v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x0

    .line 3087
    iput-boolean v0, p0, Ll/ܰ᩸;->ᩴ:Z

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 3079
    iget-boolean v0, p0, Ll/ܰ᩸;->ᩴ:Z

    return v0
.end method
