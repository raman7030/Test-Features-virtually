.class public final Ll/ۗ۟ۜ;
.super Ljava/lang/Object;
.source "X9M9"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۙ۟ۜ;

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:F


# direct methods
.method public constructor <init>(FI)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Ll/ۗ۟ۜ;->֫:Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ll/ۗ۟ۜ;->ۧ:Ll/ۙ۟ۜ;

    const v0, 0x7fffffff

    .line 10
    iput v0, p0, Ll/ۗ۟ۜ;->ܽ:I

    .line 13
    iput p1, p0, Ll/ۗ۟ۜ;->ᩳ:F

    .line 14
    iput p2, p0, Ll/ۗ۟ۜ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ۟ۜ;
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/ۗ۟ۜ;->֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ۟ۜ;->ۧ:Ll/ۙ۟ۜ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/ۙ۟ۜ;F)V
    .locals 6

    .line 59
    iget v0, p1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۗ۟ۜ;->ᩳ:F

    mul-float v0, v0, v1

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    .line 60
    iget v2, p1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v2, v2

    mul-float v2, v2, v1

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-int v2, v2

    .line 61
    iget v3, p1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v3, v3

    mul-float v3, v3, v1

    iget v4, p0, Ll/ۗ۟ۜ;->ܿ:I

    int-to-float v5, v4

    sub-float/2addr v3, v5

    cmpg-float v3, v3, p2

    if-gez v3, :cond_0

    iget v3, p1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v3, v3

    mul-float v3, v3, v1

    add-float/2addr v3, v5

    cmpg-float p2, p2, v3

    if-gez p2, :cond_0

    .line 62
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    goto :goto_0

    .line 64
    :cond_0
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    neg-int p2, p2

    :goto_0
    if-ltz p2, :cond_1

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ll/ۗ۟ۜ;->֫:Z

    goto :goto_1

    :cond_1
    neg-int p2, p2

    mul-int/lit8 v4, v4, 0x4

    if-le p2, v4, :cond_2

    goto :goto_2

    .line 33
    :cond_2
    :goto_1
    iget v0, p0, Ll/ۗ۟ۜ;->ܽ:I

    if-ge p2, v0, :cond_3

    .line 34
    iput-object p1, p0, Ll/ۗ۟ۜ;->ۧ:Ll/ۙ۟ۜ;

    .line 35
    iput p2, p0, Ll/ۗ۟ۜ;->ܽ:I

    :cond_3
    :goto_2
    return-void
.end method

.method public final ۧ(Ll/ۙ۟ۜ;F)I
    .locals 2

    .line 40
    iget v0, p1, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۗ۟ۜ;->ᩳ:F

    mul-float v0, v0, v1

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 41
    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    int-to-float p1, p1

    mul-float p1, p1, v1

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 42
    iget p2, p0, Ll/ۗ۟ۜ;->ܿ:I

    cmpg-float v1, v0, p1

    mul-int/lit8 p2, p2, 0x2

    if-gtz v1, :cond_0

    int-to-float p1, p2

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
