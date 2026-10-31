.class public final Ll/᩶᩻;
.super Ljava/lang/Object;
.source "05T5"


# instance fields
.field public ֫:Landroid/content/Context;


# direct methods
.method public static ֫(Landroid/content/Context;)Ll/᩶᩻;
    .locals 1

    .line 41
    new-instance v0, Ll/᩶᩻;

    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p0, v0, Ll/᩶᩻;->֫:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 104
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ܳ()Z
    .locals 2

    .line 84
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f050000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 4

    .line 54
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 55
    iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 56
    iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 57
    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-gt v0, v3, :cond_6

    if-gt v1, v3, :cond_6

    const/16 v0, 0x2d0

    const/16 v3, 0x3c0

    if-le v1, v3, :cond_0

    if-gt v2, v0, :cond_6

    :cond_0
    if-le v1, v0, :cond_1

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x1f4

    if-ge v1, v0, :cond_5

    const/16 v0, 0x1e0

    const/16 v3, 0x280

    if-le v1, v3, :cond_2

    if-gt v2, v0, :cond_5

    :cond_2
    if-le v1, v0, :cond_3

    if-le v2, v3, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x168

    if-lt v1, v0, :cond_4

    const/4 v0, 0x3

    return v0

    :cond_4
    const/4 v0, 0x2

    return v0

    :cond_5
    :goto_0
    const/4 v0, 0x4

    return v0

    :cond_6
    :goto_1
    const/4 v0, 0x5

    return v0
.end method

.method public final ܿ()I
    .locals 5

    .line 88
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Ll/ۗᩳ;->֫:[I

    const v3, 0x7f040005

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0xd

    .line 90
    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    .line 91
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 92
    invoke-virtual {p0}, Ll/᩶᩻;->ܳ()Z

    move-result v3

    if-nez v3, :cond_0

    const v3, 0x7f070009

    .line 95
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 94
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 97
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    return v2
.end method

.method public final ᩳ()I
    .locals 2

    .line 109
    iget-object v0, p0, Ll/᩶᩻;->֫:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07000a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method
