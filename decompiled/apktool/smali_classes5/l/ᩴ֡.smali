.class public final Ll/ᩴ֡;
.super Ll/ۚۚ;
.source "E1AS"


# instance fields
.field public ֫:Z

.field public ۖ:F

.field public ۜ:F

.field public ۡ:F

.field public ۢ:F

.field public ۧ:F

.field public ܳ:F

.field public ܺ:F

.field public ܽ:I

.field public ܿ:F

.field public ᩳ:F

.field public ᩷:F

.field public ᩻:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ll/ۚۚ;-><init>()V

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Ll/ᩴ֡;->֫:Z

    return-void
.end method

.method private ֫(FFFFF)V
    .locals 8

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    const p1, 0x38d1b717    # 1.0E-4f

    .line 163
    :cond_0
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    div-float v1, p1, p3

    mul-float v2, v1, p1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    cmpg-float v6, p1, v0

    if-gez v6, :cond_2

    neg-float p5, p1

    div-float/2addr p5, p3

    mul-float p5, p5, p1

    div-float/2addr p5, v3

    sub-float p5, p2, p5

    mul-float p5, p5, p3

    float-to-double v1, p5

    .line 171
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    cmpg-float v1, p5, p4

    if-gez v1, :cond_1

    .line 174
    iput v5, p0, Ll/ᩴ֡;->ܽ:I

    .line 175
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 176
    iput p5, p0, Ll/ᩴ֡;->᩷:F

    .line 177
    iput v0, p0, Ll/ᩴ֡;->ܺ:F

    sub-float p4, p5, p1

    div-float/2addr p4, p3

    .line 178
    iput p4, p0, Ll/ᩴ֡;->ᩳ:F

    div-float p3, p5, p3

    .line 179
    iput p3, p0, Ll/ᩴ֡;->᩻:F

    add-float/2addr p1, p5

    mul-float p1, p1, p4

    div-float/2addr p1, v3

    .line 180
    iput p1, p0, Ll/ᩴ֡;->ܿ:F

    .line 181
    iput p2, p0, Ll/ᩴ֡;->ۜ:F

    .line 182
    iput p2, p0, Ll/ᩴ֡;->ۡ:F

    return-void

    .line 186
    :cond_1
    iput v4, p0, Ll/ᩴ֡;->ܽ:I

    .line 187
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 188
    iput p4, p0, Ll/ᩴ֡;->᩷:F

    .line 189
    iput p4, p0, Ll/ᩴ֡;->ܺ:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    .line 191
    iput p5, p0, Ll/ᩴ֡;->ᩳ:F

    div-float p3, p4, p3

    .line 192
    iput p3, p0, Ll/ᩴ֡;->ۢ:F

    add-float/2addr p1, p4

    mul-float p1, p1, p5

    div-float/2addr p1, v3

    mul-float p3, p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    .line 195
    iput p5, p0, Ll/ᩴ֡;->᩻:F

    .line 196
    iput p1, p0, Ll/ᩴ֡;->ܿ:F

    sub-float p1, p2, p3

    .line 197
    iput p1, p0, Ll/ᩴ֡;->ۜ:F

    .line 198
    iput p2, p0, Ll/ᩴ֡;->ۡ:F

    return-void

    :cond_2
    cmpl-float v6, v2, p2

    if-ltz v6, :cond_3

    mul-float v3, v3, p2

    div-float/2addr v3, p1

    const/4 p3, 0x1

    .line 206
    iput p3, p0, Ll/ᩴ֡;->ܽ:I

    .line 207
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 208
    iput v0, p0, Ll/ᩴ֡;->᩷:F

    .line 209
    iput p2, p0, Ll/ᩴ֡;->ܿ:F

    .line 210
    iput v3, p0, Ll/ᩴ֡;->ᩳ:F

    return-void

    :cond_3
    sub-float v2, p2, v2

    div-float v6, v2, p1

    add-float v7, v6, v1

    cmpg-float p5, v7, p5

    if-gez p5, :cond_4

    .line 218
    iput v5, p0, Ll/ᩴ֡;->ܽ:I

    .line 219
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 220
    iput p1, p0, Ll/ᩴ֡;->᩷:F

    .line 221
    iput v0, p0, Ll/ᩴ֡;->ܺ:F

    .line 222
    iput v2, p0, Ll/ᩴ֡;->ܿ:F

    .line 223
    iput p2, p0, Ll/ᩴ֡;->ۜ:F

    .line 224
    iput v6, p0, Ll/ᩴ֡;->ᩳ:F

    .line 225
    iput v1, p0, Ll/ᩴ֡;->᩻:F

    return-void

    :cond_4
    mul-float p5, p3, p2

    mul-float v1, p1, p1

    div-float/2addr v1, v3

    add-float/2addr v1, p5

    float-to-double v1, v1

    .line 229
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    sub-float v1, p5, p1

    div-float/2addr v1, p3

    .line 230
    iput v1, p0, Ll/ᩴ֡;->ᩳ:F

    div-float v2, p5, p3

    .line 231
    iput v2, p0, Ll/ᩴ֡;->᩻:F

    cmpg-float v6, p5, p4

    if-gez v6, :cond_5

    .line 234
    iput v5, p0, Ll/ᩴ֡;->ܽ:I

    .line 235
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 236
    iput p5, p0, Ll/ᩴ֡;->᩷:F

    .line 237
    iput v0, p0, Ll/ᩴ֡;->ܺ:F

    .line 238
    iput v1, p0, Ll/ᩴ֡;->ᩳ:F

    .line 239
    iput v2, p0, Ll/ᩴ֡;->᩻:F

    add-float/2addr p1, p5

    mul-float p1, p1, v1

    div-float/2addr p1, v3

    .line 240
    iput p1, p0, Ll/ᩴ֡;->ܿ:F

    .line 241
    iput p2, p0, Ll/ᩴ֡;->ۜ:F

    return-void

    .line 247
    :cond_5
    iput v4, p0, Ll/ᩴ֡;->ܽ:I

    .line 248
    iput p1, p0, Ll/ᩴ֡;->ܳ:F

    .line 249
    iput p4, p0, Ll/ᩴ֡;->᩷:F

    .line 250
    iput p4, p0, Ll/ᩴ֡;->ܺ:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    .line 252
    iput p5, p0, Ll/ᩴ֡;->ᩳ:F

    div-float p3, p4, p3

    .line 253
    iput p3, p0, Ll/ᩴ֡;->ۢ:F

    add-float/2addr p1, p4

    mul-float p1, p1, p5

    div-float/2addr p1, v3

    mul-float p3, p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    .line 257
    iput p5, p0, Ll/ᩴ֡;->᩻:F

    .line 258
    iput p1, p0, Ll/ᩴ֡;->ܿ:F

    sub-float p1, p2, p3

    .line 259
    iput p1, p0, Ll/ᩴ֡;->ۜ:F

    .line 260
    iput p2, p0, Ll/ᩴ֡;->ۡ:F

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 6

    .line 112
    iget v0, p0, Ll/ᩴ֡;->ᩳ:F

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v2, p1, v0

    if-gtz v2, :cond_0

    .line 113
    iget v2, p0, Ll/ᩴ֡;->ܳ:F

    mul-float v3, v2, p1

    iget v4, p0, Ll/ᩴ֡;->᩷:F

    sub-float/2addr v4, v2

    mul-float v4, v4, p1

    mul-float v4, v4, p1

    mul-float v0, v0, v1

    div-float/2addr v4, v0

    add-float/2addr v4, v3

    goto :goto_0

    .line 115
    :cond_0
    iget v2, p0, Ll/ᩴ֡;->ܽ:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 116
    iget v4, p0, Ll/ᩴ֡;->ܿ:F

    goto :goto_0

    :cond_1
    sub-float v0, p1, v0

    .line 119
    iget v3, p0, Ll/ᩴ֡;->᩻:F

    cmpg-float v4, v0, v3

    if-gez v4, :cond_2

    .line 121
    iget v2, p0, Ll/ᩴ֡;->ܿ:F

    iget v4, p0, Ll/ᩴ֡;->᩷:F

    mul-float v5, v4, v0

    add-float/2addr v5, v2

    iget v2, p0, Ll/ᩴ֡;->ܺ:F

    sub-float/2addr v2, v4

    mul-float v2, v2, v0

    mul-float v2, v2, v0

    mul-float v3, v3, v1

    div-float/2addr v2, v3

    add-float v4, v2, v5

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    if-ne v2, v4, :cond_3

    .line 124
    iget v4, p0, Ll/ᩴ֡;->ۜ:F

    goto :goto_0

    :cond_3
    sub-float/2addr v0, v3

    .line 127
    iget v2, p0, Ll/ᩴ֡;->ۢ:F

    cmpg-float v3, v0, v2

    if-gez v3, :cond_4

    .line 129
    iget v3, p0, Ll/ᩴ֡;->ۜ:F

    iget v4, p0, Ll/ᩴ֡;->ܺ:F

    mul-float v4, v4, v0

    add-float/2addr v3, v4

    mul-float v4, v4, v0

    mul-float v2, v2, v1

    div-float/2addr v4, v2

    sub-float v4, v3, v4

    goto :goto_0

    .line 131
    :cond_4
    iget v4, p0, Ll/ᩴ֡;->ۡ:F

    .line 149
    :goto_0
    iput p1, p0, Ll/ᩴ֡;->ۧ:F

    .line 150
    iget-boolean p1, p0, Ll/ᩴ֡;->֫:Z

    if-eqz p1, :cond_5

    iget p1, p0, Ll/ᩴ֡;->ۖ:F

    sub-float/2addr p1, v4

    return p1

    :cond_5
    iget p1, p0, Ll/ᩴ֡;->ۖ:F

    add-float/2addr p1, v4

    return p1
.end method

.method public final ֫()F
    .locals 1

    .line 155
    iget-boolean v0, p0, Ll/ᩴ֡;->֫:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ᩴ֡;->ۧ:F

    invoke-virtual {p0, v0}, Ll/ᩴ֡;->֫(F)F

    move-result v0

    neg-float v0, v0

    return v0

    :cond_0
    iget v0, p0, Ll/ᩴ֡;->ۧ:F

    invoke-virtual {p0, v0}, Ll/ᩴ֡;->֫(F)F

    move-result v0

    return v0
.end method

.method public final ֫(F)F
    .locals 3

    .line 89
    iget v0, p0, Ll/ᩴ֡;->ᩳ:F

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    .line 90
    iget v1, p0, Ll/ᩴ֡;->ܳ:F

    iget v2, p0, Ll/ᩴ֡;->᩷:F

    goto :goto_0

    .line 92
    :cond_0
    iget v1, p0, Ll/ᩴ֡;->ܽ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sub-float/2addr p1, v0

    .line 96
    iget v0, p0, Ll/ᩴ֡;->᩻:F

    cmpg-float v2, p1, v0

    if-gez v2, :cond_2

    .line 98
    iget v1, p0, Ll/ᩴ֡;->᩷:F

    iget v2, p0, Ll/ᩴ֡;->ܺ:F

    :goto_0
    sub-float/2addr v2, v1

    mul-float v2, v2, p1

    div-float/2addr v2, v0

    add-float/2addr v2, v1

    return v2

    :cond_2
    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 101
    iget p1, p0, Ll/ᩴ֡;->ۜ:F

    return p1

    :cond_3
    sub-float/2addr p1, v0

    .line 104
    iget v0, p0, Ll/ᩴ֡;->ۢ:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    .line 106
    iget v1, p0, Ll/ᩴ֡;->ܺ:F

    mul-float p1, p1, v1

    div-float/2addr p1, v0

    sub-float/2addr v1, p1

    return v1

    .line 108
    :cond_4
    iget p1, p0, Ll/ᩴ֡;->ۡ:F

    return p1
.end method

.method public final ֫(FFFFFF)V
    .locals 6

    .line 137
    iput p1, p0, Ll/ᩴ֡;->ۖ:F

    cmpl-float v1, p1, p2

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 138
    :goto_0
    iput-boolean v1, p0, Ll/ᩴ֡;->֫:Z

    if-eqz v1, :cond_1

    neg-float v1, p3

    sub-float v2, p1, p2

    move-object v0, p0

    move v3, p5

    move v4, p6

    move v5, p4

    .line 140
    invoke-direct/range {v0 .. v5}, Ll/ᩴ֡;->֫(FFFFF)V

    return-void

    :cond_1
    sub-float v2, p2, p1

    move-object v0, p0

    move v1, p3

    move v3, p5

    move v4, p6

    move v5, p4

    .line 142
    invoke-direct/range {v0 .. v5}, Ll/ᩴ֡;->֫(FFFFF)V

    return-void
.end method
