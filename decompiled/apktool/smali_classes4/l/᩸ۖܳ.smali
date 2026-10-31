.class public abstract Ll/᩸ۖܳ;
.super Ljava/lang/Object;
.source "R12P"


# instance fields
.field public ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    iput p1, p0, Ll/᩸ۖܳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public ֫()I
    .locals 5

    .line 401
    sget-boolean v0, Ll/᩹֡᩷;->ۘ:Z

    if-eqz v0, :cond_1

    .line 402
    iget v0, p0, Ll/᩸ۖܳ;->֫:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x3

    new-array v1, v0, [F

    .line 407
    invoke-virtual {p0}, Ll/᩸ۖܳ;->ᩳ()I

    move-result v2

    .line 408
    invoke-static {v2, v1}, Ll/۟ۗ;->֫(I[F)V

    const v2, 0x3f666666    # 0.9f

    const/4 v3, 0x2

    aput v2, v1, v3

    .line 410
    invoke-static {v1}, Ll/۟ۗ;->֫([F)I

    move-result v1

    new-array v0, v0, [D

    .line 393
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {v2, v4, v1, v0}, Ll/۟ۗ;->֫(III[D)V

    const/4 v1, 0x1

    .line 413
    aget-wide v1, v0, v1

    aget-wide v3, v0, v3

    invoke-static {v1, v2, v3, v4}, Ll/۟ۗ;->֫(DD)I

    move-result v0

    .line 414
    iput v0, p0, Ll/᩸ۖܳ;->֫:I

    return v0

    .line 417
    :cond_1
    invoke-virtual {p0}, Ll/᩸ۖܳ;->ᩳ()I

    move-result v0

    return v0
.end method

.method public ۧ()I
    .locals 1

    .line 427
    sget-boolean v0, Ll/᩹֡᩷;->ۘ:Z

    if-eqz v0, :cond_0

    .line 428
    invoke-virtual {p0}, Ll/᩸ۖܳ;->ᩳ()I

    move-result v0

    return v0

    .line 423
    :cond_0
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, -0x37000001

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public ܽ()I
    .locals 1

    .line 395
    iget v0, p0, Ll/᩸ۖܳ;->ۧ:I

    return v0
.end method

.method public abstract ᩳ()I
.end method
