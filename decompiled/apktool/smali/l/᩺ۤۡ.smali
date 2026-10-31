.class public Ll/᩺ۤۡ;
.super Ljava/lang/Object;
.source "35B7"

# interfaces
.implements Ll/ۘۢۧ;


# static fields
.field public static ᩸:Landroid/content/Context;


# direct methods
.method public static ֫(II[I)I
    .locals 5

    .line 46
    array-length v0, p2

    .line 48
    array-length v1, p2

    add-int/lit8 v1, v1, -0x2

    move v2, v1

    move v1, p0

    :goto_0
    if-lt v1, p1, :cond_0

    .line 50
    aget v3, p2, v1

    rem-int/2addr v3, v0

    if-le v3, p0, :cond_0

    sub-int v2, p0, v1

    add-int/lit8 v2, v2, 0x1

    sub-int v2, v1, v2

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 54
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_1
    add-int/lit8 v1, p1, 0x1

    if-le v2, v1, :cond_2

    add-int v1, p1, v2

    shr-int/lit8 v1, v1, 0x1

    .line 58
    aget v3, p2, v1

    rem-int/2addr v3, v0

    if-le v3, p0, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    return v2
.end method

.method public static ֫()Landroid/content/Context;
    .locals 1

    .line 55
    sget-object v0, Ll/᩺ۤۡ;->᩸:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    long-to-double p0, p0

    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double/2addr p0, v0

    const-string v0, "K"

    .line 73
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x40000000

    cmp-long v2, p0, v0

    if-gez v2, :cond_2

    long-to-double p0, p0

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    div-double/2addr p0, v0

    const-string v0, "M"

    .line 75
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide v0, 0x10000000000L

    cmp-long v2, p0, v0

    if-gez v2, :cond_3

    long-to-double p0, p0

    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr p0, v0

    const-string v0, "G"

    .line 77
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    long-to-double p0, p0

    const-wide/high16 v0, 0x4270000000000000L    # 1.099511627776E12

    div-double/2addr p0, v0

    const-string v0, "T"

    .line 79
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 991
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 993
    new-instance v1, Ll/ᩳ۬ۡ;

    invoke-direct {v1, p0}, Ll/ᩳ۬ۡ;-><init>(Ljava/lang/String;)V

    .line 996
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ll/ᩳ۬ۡ;->֫()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 997
    invoke-virtual {v1}, Ll/ᩳ۬ۡ;->ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩺ۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 998
    invoke-virtual {v1}, Ll/ᩳ۬ۡ;->֫()Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x2c

    .line 999
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1003
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;D)Ljava/lang/String;
    .locals 5

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double p1, p1, v0

    .line 100
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    neg-long p1, p1

    :cond_1
    const-wide/16 v1, 0x64

    .line 109
    div-long v3, p1, v1

    .line 110
    rem-long/2addr p1, v1

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    if-eqz v0, :cond_2

    const/16 v0, 0x2d

    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    :cond_2
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0xa

    cmp-long v0, p1, v2

    if-gez v0, :cond_3

    const/16 v0, 0x30

    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 0
    :cond_3
    invoke-static {v1, p1, p2, p0}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬ܽܺ;Ll/۬ܽܺ;)Ll/۬ܽܺ;
    .locals 7

    if-ne p0, p1, :cond_0

    return-object p0

    .line 101
    :cond_0
    invoke-virtual {p0}, Ll/۬ܽܺ;->size()I

    move-result v0

    .line 104
    invoke-virtual {p1}, Ll/۬ܽܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_6

    const/4 v1, 0x0

    move-object v3, v2

    :goto_0
    if-ge v1, v0, :cond_4

    .line 109
    invoke-virtual {p0, v1}, Ll/۬ܽܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object v4

    .line 110
    invoke-virtual {p1, v1}, Ll/۬ܽܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object v5

    .line 111
    invoke-static {v4, v5}, Ll/᩺ۤۡ;->ۧ(Ll/֫ۖܺ;Ll/֫ۖܺ;)Ll/֫ۖܺ;

    move-result-object v6

    if-eq v6, v4, :cond_3

    if-nez v3, :cond_1

    .line 119
    invoke-virtual {p0}, Ll/۬ܽܺ;->֨()Ll/۬ܽܺ;

    move-result-object v3

    :cond_1
    if-eqz v6, :cond_2

    .line 127
    :try_start_0
    invoke-virtual {v3, v1, v6}, Ll/۬ܽܺ;->֫(ILl/֫ۖܺ;)V

    goto :goto_1

    .line 124
    :cond_2
    new-instance p0, Ll/ۖᩳܺ;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "incompatible: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-direct {p0, p1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 124
    throw p0
    :try_end_0
    .catch Ll/ۖᩳܺ; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 130
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "...while merging stack["

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 131
    throw p0

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    return-object p0

    .line 140
    :cond_5
    invoke-virtual {v3}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v3

    .line 105
    :cond_6
    new-instance p0, Ll/ۖᩳܺ;

    const-string p1, "mismatched stack depths"

    .line 60
    invoke-direct {p0, p1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 105
    throw p0
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 0

    .line 65
    sput-object p0, Ll/᩺ۤۡ;->᩸:Landroid/content/Context;

    return-void
.end method

.method public static ֫([I)V
    .locals 12

    .line 189
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_11

    const/4 v3, 0x2

    if-eq v0, v3, :cond_10

    .line 76
    array-length v0, p0

    .line 78
    aget v4, p0, v1

    aget v5, p0, v2

    add-int/2addr v4, v5

    aput v4, p0, v1

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v7, v0, -0x1

    if-ge v4, v7, :cond_4

    if-ge v5, v0, :cond_1

    .line 82
    aget v7, p0, v6

    aget v8, p0, v5

    if-ge v7, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 83
    :cond_1
    :goto_1
    aget v8, p0, v6

    add-int/lit8 v7, v6, 0x1

    .line 84
    aput v4, p0, v6

    move v6, v7

    :goto_2
    if-ge v5, v0, :cond_3

    if-ge v6, v4, :cond_2

    .line 89
    aget v7, p0, v6

    aget v9, p0, v5

    if-ge v7, v9, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 93
    aget v5, p0, v5

    add-int/2addr v8, v5

    move v5, v7

    goto :goto_4

    .line 90
    :cond_3
    :goto_3
    aget v7, p0, v6

    add-int/2addr v8, v7

    add-int/lit8 v7, v6, 0x1

    add-int v9, v4, v0

    .line 91
    aput v9, p0, v6

    move v6, v7

    .line 96
    :goto_4
    aput v8, p0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 110
    :cond_4
    array-length v0, p0

    sub-int/2addr v0, v3

    const/4 v4, 0x1

    :goto_5
    const/16 v5, 0x13

    if-ge v4, v5, :cond_5

    if-le v0, v2, :cond_5

    add-int/lit8 v0, v0, -0x1

    .line 112
    invoke-static {v0, v1, p0}, Ll/᩺ۤۡ;->֫(II[I)I

    move-result v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 204
    :cond_5
    aget v4, p0, v1

    array-length v5, p0

    rem-int/2addr v4, v5

    if-lt v4, v0, :cond_7

    .line 126
    array-length v0, p0

    sub-int/2addr v0, v3

    .line 127
    array-length v4, p0

    sub-int/2addr v4, v2

    :goto_6
    if-lez v3, :cond_f

    add-int/lit8 v5, v0, -0x1

    .line 131
    invoke-static {v5, v1, p0}, Ll/᩺ۤۡ;->֫(II[I)I

    move-result v5

    sub-int/2addr v0, v5

    sub-int/2addr v3, v0

    :goto_7
    if-lez v3, :cond_6

    add-int/lit8 v6, v4, -0x1

    .line 134
    aput v2, p0, v4

    add-int/lit8 v3, v3, -0x1

    move v4, v6

    goto :goto_7

    :cond_6
    shl-int/lit8 v3, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    move v0, v5

    goto :goto_6

    :cond_7
    add-int/lit8 v1, v0, -0x1

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x20

    rsub-int/lit8 v4, v1, 0x14

    .line 151
    array-length v5, p0

    sub-int/2addr v5, v3

    .line 152
    array-length v6, p0

    sub-int/2addr v6, v2

    if-ne v4, v2, :cond_8

    goto :goto_8

    :cond_8
    const/4 v3, 0x1

    :goto_8
    if-ne v4, v2, :cond_9

    add-int/lit8 v7, v0, -0x2

    goto :goto_9

    :cond_9
    move v7, v0

    :goto_9
    shl-int/lit8 v8, v3, 0x1

    :goto_a
    if-lez v8, :cond_f

    if-gt v5, v0, :cond_a

    move v9, v5

    goto :goto_b

    :cond_a
    add-int/lit8 v9, v5, -0x1

    .line 158
    invoke-static {v9, v0, p0}, Ll/᩺ۤۡ;->֫(II[I)I

    move-result v9

    :goto_b
    if-lt v3, v4, :cond_b

    sub-int v10, v3, v4

    shl-int v10, v2, v10

    .line 162
    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    goto :goto_c

    :cond_b
    rsub-int/lit8 v10, v1, 0x13

    if-ne v3, v10, :cond_d

    .line 165
    aget v10, p0, v9

    if-ne v10, v5, :cond_c

    add-int/lit8 v9, v9, 0x1

    :cond_c
    const/4 v10, 0x1

    goto :goto_c

    :cond_d
    const/4 v10, 0x0

    :goto_c
    sub-int/2addr v5, v9

    add-int/2addr v5, v10

    sub-int/2addr v8, v5

    :goto_d
    if-lez v8, :cond_e

    add-int/lit8 v11, v6, -0x1

    .line 171
    aput v3, p0, v6

    add-int/lit8 v8, v8, -0x1

    move v6, v11

    goto :goto_d

    :cond_e
    sub-int/2addr v7, v10

    shl-int/lit8 v8, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    move v5, v9

    goto :goto_a

    :cond_f
    return-void

    .line 191
    :cond_10
    aput v2, p0, v2

    .line 193
    :cond_11
    aput v2, p0, v1

    return-void
.end method

.method public static ֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z
    .locals 4

    .line 221
    invoke-interface {p0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p0

    .line 222
    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    .line 224
    invoke-virtual {p0, p1}, Ll/۟ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 229
    :cond_0
    invoke-virtual {p0}, Ll/۟ܺܺ;->ܿ()I

    move-result v0

    .line 230
    invoke-virtual {p1}, Ll/۟ܺܺ;->ܿ()I

    move-result v1

    const/16 v2, 0xa

    const/16 v3, 0x9

    if-ne v0, v2, :cond_1

    .line 235
    sget-object p0, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    const/16 v0, 0x9

    :cond_1
    if-ne v1, v2, :cond_2

    .line 240
    sget-object p1, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    const/16 v1, 0x9

    :cond_2
    if-ne v0, v3, :cond_a

    if-eq v1, v3, :cond_3

    goto :goto_0

    .line 254
    :cond_3
    sget-object v0, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne p0, v0, :cond_4

    goto :goto_2

    :cond_4
    if-ne p1, v0, :cond_5

    goto :goto_1

    .line 267
    :cond_5
    sget-object v0, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    if-ne p0, v0, :cond_6

    goto :goto_1

    .line 272
    :cond_6
    invoke-virtual {p0}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 274
    invoke-virtual {p1}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    .line 285
    :cond_7
    invoke-virtual {p0}, Ll/۟ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object p0

    .line 286
    invoke-virtual {p1}, Ll/۟ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object p1

    .line 287
    invoke-virtual {p0}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-nez v0, :cond_7

    .line 289
    :cond_8
    invoke-static {p0, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p0

    return p0

    .line 290
    :cond_9
    invoke-virtual {p1}, Ll/۟ܺܺ;->֨()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 295
    sget-object p1, Ll/۟ܺܺ;->᩶֫:Ll/۟ܺܺ;

    if-eq p0, p1, :cond_b

    sget-object p1, Ll/۟ܺܺ;->ܿ֫:Ll/۟ܺܺ;

    if-ne p0, p1, :cond_c

    goto :goto_1

    .line 249
    :cond_a
    :goto_0
    invoke-virtual {p0}, Ll/۟ܺܺ;->᩸()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-virtual {p1}, Ll/۟ܺܺ;->᩸()Z

    move-result p0

    if-eqz p0, :cond_c

    :cond_b
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_c
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 3

    .line 55
    sget-object v0, Ll/᩺ۤۡ;->᩸:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-nez v2, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-nez v0, :cond_2

    move-object v0, v1

    .line 73
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    long-to-double p0, p0

    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double/2addr p0, v0

    const-string v0, " KB"

    .line 88
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x40000000

    cmp-long v2, p0, v0

    if-gez v2, :cond_2

    long-to-double p0, p0

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    div-double/2addr p0, v0

    const-string v0, " MB"

    .line 90
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-wide v0, 0x10000000000L

    cmp-long v2, p0, v0

    if-gez v2, :cond_3

    long-to-double p0, p0

    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr p0, v0

    const-string v0, " GB"

    .line 92
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    long-to-double p0, p0

    const-wide/high16 v0, 0x4270000000000000L    # 1.099511627776E12

    div-double/2addr p0, v0

    const-string v0, " TB"

    .line 94
    invoke-static {v0, p0, p1}, Ll/᩺ۤۡ;->֫(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 145
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    .line 574
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 578
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x56

    if-ne v2, v3, :cond_2

    const-string v2, "void"

    goto :goto_1

    :cond_2
    const/16 v3, 0x5a

    if-ne v2, v3, :cond_3

    const-string v2, "boolean"

    goto :goto_1

    :cond_3
    const/16 v3, 0x42

    if-ne v2, v3, :cond_4

    const-string v2, "byte"

    goto :goto_1

    :cond_4
    const/16 v3, 0x43

    if-ne v2, v3, :cond_5

    const-string v2, "char"

    goto :goto_1

    :cond_5
    const/16 v3, 0x53

    if-ne v2, v3, :cond_6

    const-string v2, "short"

    goto :goto_1

    :cond_6
    const/16 v3, 0x49

    if-ne v2, v3, :cond_7

    const-string v2, "int"

    goto :goto_1

    :cond_7
    const/16 v3, 0x46

    if-ne v2, v3, :cond_8

    const-string v2, "float"

    goto :goto_1

    :cond_8
    const/16 v3, 0x4a

    if-ne v2, v3, :cond_9

    const-string v2, "long"

    goto :goto_1

    :cond_9
    const/16 v3, 0x44

    if-ne v2, v3, :cond_a

    const-string v2, "double"

    goto :goto_1

    :cond_a
    const/16 v3, 0x25

    if-ne v2, v3, :cond_b

    const-string v2, "%"

    goto :goto_1

    :cond_b
    const/16 v3, 0x4c

    if-ne v2, v3, :cond_c

    const/16 v2, 0x3b

    .line 591
    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2f

    const/16 v4, 0x2e

    .line 85
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_c
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_e

    :goto_2
    if-ge v0, v1, :cond_d

    const-string p0, "[]"

    .line 0
    invoke-static {v2, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_d
    return-object v2

    .line 595
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown type ["

    const-string v2, "]"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 595
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ll/֫ۖܺ;Ll/֫ۖܺ;)Ll/֫ۖܺ;
    .locals 2

    if-eqz p0, :cond_9

    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    .line 157
    :cond_1
    invoke-interface {p0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p0

    .line 158
    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    .line 162
    :cond_2
    invoke-virtual {p0}, Ll/۟ܺܺ;->᩶()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Ll/۟ܺܺ;->᩶()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 163
    sget-object v0, Ll/۟ܺܺ;->ᩴ֫:Ll/۟ܺܺ;

    if-ne p0, v0, :cond_3

    return-object p1

    :cond_3
    if-ne p1, v0, :cond_4

    return-object p0

    .line 175
    :cond_4
    invoke-virtual {p0}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ll/۟ܺܺ;->֨()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 177
    invoke-virtual {p0}, Ll/۟ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object p0

    .line 178
    invoke-virtual {p1}, Ll/۟ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object p1

    .line 177
    invoke-static {p0, p1}, Ll/᩺ۤۡ;->ۧ(Ll/֫ۖܺ;Ll/֫ۖܺ;)Ll/֫ۖܺ;

    move-result-object p0

    if-nez p0, :cond_5

    .line 184
    sget-object p0, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    return-object p0

    .line 186
    :cond_5
    check-cast p0, Ll/۟ܺܺ;

    invoke-virtual {p0}, Ll/۟ܺܺ;->ۧ()Ll/۟ܺܺ;

    move-result-object p0

    return-object p0

    .line 193
    :cond_6
    sget-object p0, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    return-object p0

    .line 195
    :cond_7
    invoke-virtual {p0}, Ll/۟ܺܺ;->᩸()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Ll/۟ܺܺ;->᩸()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 200
    sget-object p0, Ll/۟ܺܺ;->ܺ֫:Ll/۟ܺܺ;

    return-object p0

    :cond_8
    return-object v0

    :cond_9
    :goto_0
    return-object p0
.end method

.method public static ܽ()Ljava/io/File;
    .locals 4

    .line 55
    sget-object v0, Ll/᩺ۤۡ;->᩸:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    if-nez v0, :cond_1

    return-object v1

    .line 1233
    :cond_1
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "openSDK_LOG.Util"

    const-string v3, "getExternalFilesDirs exception"

    .line 1235
    invoke-static {v2, v3, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    .line 1237
    array-length v2, v0

    if-lez v2, :cond_2

    const/4 v1, 0x0

    aget-object v1, v0, v1

    :cond_2
    return-object v1
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<clinit>"

    .line 316
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "<init>"

    .line 317
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
