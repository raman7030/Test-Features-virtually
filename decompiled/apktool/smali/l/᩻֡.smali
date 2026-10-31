.class public final Ll/᩻֡;
.super Ll/᩷֡;
.source "A1CD"


# instance fields
.field public ֫:[Ll/ܳ֡;

.field public final ۧ:[D


# direct methods
.method public constructor <init>([I[D[[D)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 24
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput-object v1, v0, Ll/᩻֡;->ۧ:[D

    .line 170
    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    new-array v2, v2, [Ll/ܳ֡;

    iput-object v2, v0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    .line 173
    :goto_0
    iget-object v7, v0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    array-length v8, v7

    if-ge v4, v8, :cond_5

    .line 174
    aget v8, p1, v4

    const/4 v9, 0x3

    if-eqz v8, :cond_4

    if-eq v8, v3, :cond_3

    const/4 v10, 0x2

    if-eq v8, v10, :cond_2

    if-eq v8, v9, :cond_0

    goto :goto_2

    :cond_0
    if-ne v5, v3, :cond_1

    const/4 v5, 0x2

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    :goto_1
    move v6, v5

    goto :goto_2

    :cond_2
    const/4 v5, 0x2

    const/4 v6, 0x2

    goto :goto_2

    :cond_3
    const/4 v5, 0x1

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x3

    .line 188
    :goto_2
    new-instance v22, Ll/ܳ֡;

    aget-wide v10, v1, v4

    add-int/lit8 v23, v4, 0x1

    aget-wide v12, v1, v23

    aget-object v8, p3, v4

    aget-wide v14, v8, v2

    aget-wide v16, v8, v3

    aget-object v8, p3, v23

    aget-wide v18, v8, v2

    aget-wide v20, v8, v3

    move-object/from16 v8, v22

    move v9, v6

    invoke-direct/range {v8 .. v21}, Ll/ܳ֡;-><init>(IDDDDDD)V

    aput-object v22, v7, v4

    move/from16 v4, v23

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(D)D
    .locals 6

    .line 110
    iget-object v0, p0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Ll/ܳ֡;->ۢ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_0

    move-wide p1, v2

    goto :goto_0

    .line 112
    :cond_0
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v0, v2

    iget-wide v2, v2, Ll/ܳ֡;->ۡ:D

    cmpl-double v4, p1, v2

    if-lez v4, :cond_1

    .line 113
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    iget-wide p1, p1, Ll/ܳ֡;->ۡ:D

    .line 116
    :cond_1
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_4

    .line 117
    aget-object v2, v0, v1

    iget-wide v3, v2, Ll/ܳ֡;->ۡ:D

    cmpg-double v5, p1, v3

    if-gtz v5, :cond_3

    .line 119
    iget-boolean v3, v2, Ll/ܳ֡;->֫:Z

    if-eqz v3, :cond_2

    .line 121
    invoke-virtual {v2, p1, p2}, Ll/ܳ֡;->֫(D)D

    move-result-wide p1

    return-wide p1

    .line 125
    :cond_2
    invoke-virtual {v2, p1, p2}, Ll/ܳ֡;->ܽ(D)V

    .line 128
    aget-object p1, v0, v1

    .line 252
    iget-wide v0, p1, Ll/ܳ֡;->ܳ:D

    iget-wide v2, p1, Ll/ܳ֡;->ᩳ:D

    iget-wide p1, p1, Ll/ܳ֡;->ۖ:D

    mul-double v2, v2, p1

    add-double/2addr v2, v0

    return-wide v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1
.end method

.method public final ֫(D[D)V
    .locals 10

    .line 40
    iget-object v0, p0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Ll/ܳ֡;->ۢ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_0

    move-wide p1, v2

    .line 43
    :cond_0
    array-length v2, v0

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget-object v2, v0, v2

    iget-wide v4, v2, Ll/ܳ֡;->ۡ:D

    cmpl-double v2, p1, v4

    if-lez v2, :cond_1

    .line 44
    array-length p1, v0

    sub-int/2addr p1, v3

    aget-object p1, v0, p1

    iget-wide p1, p1, Ll/ܳ֡;->ۡ:D

    :cond_1
    const/4 v2, 0x0

    .line 47
    :goto_0
    array-length v4, v0

    if-ge v2, v4, :cond_4

    .line 48
    aget-object v4, v0, v2

    iget-wide v5, v4, Ll/ܳ֡;->ۡ:D

    cmpg-double v7, p1, v5

    if-gtz v7, :cond_3

    .line 49
    iget-boolean v5, v4, Ll/ܳ֡;->֫:Z

    if-eqz v5, :cond_2

    .line 50
    invoke-virtual {v4, p1, p2}, Ll/ܳ֡;->֫(D)D

    move-result-wide v4

    aput-wide v4, p3, v1

    .line 51
    aget-object v0, v0, v2

    invoke-virtual {v0, p1, p2}, Ll/ܳ֡;->ۧ(D)D

    move-result-wide p1

    aput-wide p1, p3, v3

    return-void

    .line 54
    :cond_2
    invoke-virtual {v4, p1, p2}, Ll/ܳ֡;->ܽ(D)V

    .line 55
    aget-object p1, v0, v2

    .line 252
    iget-wide v4, p1, Ll/ܳ֡;->ܳ:D

    iget-wide v6, p1, Ll/ܳ֡;->ᩳ:D

    iget-wide v8, p1, Ll/ܳ֡;->ۖ:D

    mul-double v6, v6, v8

    add-double/2addr v6, v4

    .line 55
    aput-wide v6, p3, v1

    .line 256
    iget-wide v0, p1, Ll/ܳ֡;->᩻:D

    iget-wide v4, p1, Ll/ܳ֡;->ܿ:D

    iget-wide p1, p1, Ll/ܳ֡;->ܺ:D

    mul-double v4, v4, p1

    add-double/2addr v4, v0

    .line 56
    aput-wide v4, p3, v3

    return-void

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ֫(D[F)V
    .locals 9

    .line 64
    iget-object v0, p0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Ll/ܳ֡;->ۢ:D

    const/4 v4, 0x1

    cmpg-double v5, p1, v2

    if-gez v5, :cond_0

    move-wide p1, v2

    goto :goto_0

    .line 66
    :cond_0
    array-length v2, v0

    sub-int/2addr v2, v4

    aget-object v2, v0, v2

    iget-wide v2, v2, Ll/ܳ֡;->ۡ:D

    cmpl-double v5, p1, v2

    if-lez v5, :cond_1

    .line 67
    array-length p1, v0

    sub-int/2addr p1, v4

    aget-object p1, v0, p1

    iget-wide p1, p1, Ll/ܳ֡;->ۡ:D

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 70
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_4

    .line 71
    aget-object v3, v0, v2

    iget-wide v5, v3, Ll/ܳ֡;->ۡ:D

    cmpg-double v7, p1, v5

    if-gtz v7, :cond_3

    .line 72
    iget-boolean v5, v3, Ll/ܳ֡;->֫:Z

    if-eqz v5, :cond_2

    .line 73
    invoke-virtual {v3, p1, p2}, Ll/ܳ֡;->֫(D)D

    move-result-wide v5

    double-to-float v3, v5

    aput v3, p3, v1

    .line 74
    aget-object v0, v0, v2

    invoke-virtual {v0, p1, p2}, Ll/ܳ֡;->ۧ(D)D

    move-result-wide p1

    double-to-float p1, p1

    aput p1, p3, v4

    return-void

    .line 77
    :cond_2
    invoke-virtual {v3, p1, p2}, Ll/ܳ֡;->ܽ(D)V

    .line 78
    aget-object p1, v0, v2

    .line 252
    iget-wide v2, p1, Ll/ܳ֡;->ܳ:D

    iget-wide v5, p1, Ll/ܳ֡;->ᩳ:D

    iget-wide v7, p1, Ll/ܳ֡;->ۖ:D

    mul-double v5, v5, v7

    add-double/2addr v5, v2

    double-to-float p2, v5

    .line 78
    aput p2, p3, v1

    .line 256
    iget-wide v0, p1, Ll/ܳ֡;->᩻:D

    iget-wide v2, p1, Ll/ܳ֡;->ܿ:D

    iget-wide p1, p1, Ll/ܳ֡;->ܺ:D

    mul-double v2, v2, p1

    add-double/2addr v2, v0

    double-to-float p1, v2

    .line 79
    aput p1, p3, v4

    return-void

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ֫()[D
    .locals 1

    .line 165
    iget-object v0, p0, Ll/᩻֡;->ۧ:[D

    return-object v0
.end method

.method public final ۧ(D)D
    .locals 6

    .line 138
    iget-object v0, p0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Ll/ܳ֡;->ۢ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_0

    move-wide p1, v2

    .line 141
    :cond_0
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v0, v2

    iget-wide v2, v2, Ll/ܳ֡;->ۡ:D

    cmpl-double v4, p1, v2

    if-lez v4, :cond_1

    .line 142
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    iget-wide p1, p1, Ll/ܳ֡;->ۡ:D

    .line 145
    :cond_1
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_4

    .line 146
    aget-object v2, v0, v1

    iget-wide v3, v2, Ll/ܳ֡;->ۡ:D

    cmpg-double v5, p1, v3

    if-gtz v5, :cond_3

    .line 147
    iget-boolean v3, v2, Ll/ܳ֡;->֫:Z

    if-eqz v3, :cond_2

    .line 284
    iget-wide p1, v2, Ll/ܳ֡;->ܳ:D

    return-wide p1

    .line 153
    :cond_2
    invoke-virtual {v2, p1, p2}, Ll/ܳ֡;->ܽ(D)V

    .line 155
    aget-object p1, v0, v1

    invoke-virtual {p1}, Ll/ܳ֡;->֫()D

    move-result-wide p1

    return-wide p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1
.end method

.method public final ۧ(D[D)V
    .locals 8

    .line 87
    iget-object v0, p0, Ll/᩻֡;->֫:[Ll/ܳ֡;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Ll/ܳ֡;->ۢ:D

    const/4 v4, 0x1

    cmpg-double v5, p1, v2

    if-gez v5, :cond_0

    move-wide p1, v2

    goto :goto_0

    .line 89
    :cond_0
    array-length v2, v0

    sub-int/2addr v2, v4

    aget-object v2, v0, v2

    iget-wide v2, v2, Ll/ܳ֡;->ۡ:D

    cmpl-double v5, p1, v2

    if-lez v5, :cond_1

    .line 90
    array-length p1, v0

    sub-int/2addr p1, v4

    aget-object p1, v0, p1

    iget-wide p1, p1, Ll/ܳ֡;->ۡ:D

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 93
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_5

    .line 94
    aget-object v3, v0, v2

    iget-wide v5, v3, Ll/ܳ֡;->ۡ:D

    cmpg-double v7, p1, v5

    if-gtz v7, :cond_4

    .line 95
    iget-boolean v5, v3, Ll/ܳ֡;->֫:Z

    if-eqz v5, :cond_2

    .line 284
    iget-wide p1, v3, Ll/ܳ֡;->ܳ:D

    .line 96
    aput-wide p1, p3, v1

    .line 288
    iget-wide p1, v3, Ll/ܳ֡;->᩻:D

    .line 97
    aput-wide p1, p3, v4

    return-void

    .line 100
    :cond_2
    invoke-virtual {v3, p1, p2}, Ll/ܳ֡;->ܽ(D)V

    .line 101
    aget-object p1, v0, v2

    invoke-virtual {p1}, Ll/ܳ֡;->֫()D

    move-result-wide p1

    aput-wide p1, p3, v1

    .line 102
    aget-object p1, v0, v2

    .line 267
    iget-wide v0, p1, Ll/ܳ֡;->ᩳ:D

    iget-wide v2, p1, Ll/ܳ֡;->ܺ:D

    mul-double v0, v0, v2

    .line 268
    iget-wide v2, p1, Ll/ܳ֡;->ܿ:D

    neg-double v2, v2

    iget-wide v5, p1, Ll/ܳ֡;->ۖ:D

    mul-double v2, v2, v5

    .line 269
    iget-wide v5, p1, Ll/ܳ֡;->ܽ:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    div-double/2addr v5, v0

    .line 270
    iget-boolean p1, p1, Ll/ܳ֡;->ۘ:Z

    if-eqz p1, :cond_3

    neg-double p1, v2

    mul-double p1, p1, v5

    goto :goto_2

    :cond_3
    mul-double p1, v2, v5

    .line 102
    :goto_2
    aput-wide p1, p3, v4

    return-void

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method
