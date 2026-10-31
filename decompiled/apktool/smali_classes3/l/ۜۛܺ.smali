.class public final Ll/ۜۛܺ;
.super Ll/ۢ۬ܺ;
.source "6574"


# static fields
.field public static final serialVersionUID:J

.field public static final ۤ:Ll/ۢ۬ܺ;


# instance fields
.field public final transient ۗ:[Ljava/lang/Object;

.field public final transient ۫:I

.field public final transient ۬:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 50
    new-instance v0, Ll/ۜۛܺ;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Ll/ۜۛܺ;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    sput-object v0, Ll/ۜۛܺ;->ۤ:Ll/ۢ۬ܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    .line 294
    invoke-direct {p0}, Ll/ۢ۬ܺ;-><init>()V

    .line 295
    iput-object p1, p0, Ll/ۜۛܺ;->۬:Ljava/lang/Object;

    .line 296
    iput-object p2, p0, Ll/ۜۛܺ;->ۗ:[Ljava/lang/Object;

    .line 297
    iput p3, p0, Ll/ۜۛܺ;->۫:I

    return-void
.end method

.method public static ֫(III[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    .line 155
    aget-object v0, p3, p2

    .line 156
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/lit8 v0, p2, 0x1

    aget-object v0, p3, v0

    .line 157
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_0
    add-int/lit8 v4, v1, -0x1

    const/16 v5, 0x80

    const/4 v6, 0x3

    const/4 v7, -0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-gt v1, v5, :cond_6

    .line 169
    new-array v1, v1, [B

    .line 170
    invoke-static {v1, v7}, Ljava/util/Arrays;->fill([BB)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v5, v0, :cond_4

    mul-int/lit8 v10, v5, 0x2

    add-int v10, v10, p2

    mul-int/lit8 v11, v7, 0x2

    add-int v11, v11, p2

    .line 178
    aget-object v12, p3, v10

    invoke-static {v12}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v10, v3

    .line 179
    aget-object v10, p3, v10

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-static {v13}, Ll/ۗۗܺ;->֫(I)I

    move-result v13

    :goto_1
    and-int/2addr v13, v4

    .line 183
    aget-byte v14, v1, v13

    const/16 v15, 0xff

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_2

    int-to-byte v14, v11

    .line 185
    aput-byte v14, v1, v13

    if-ge v7, v5, :cond_1

    .line 196
    aput-object v12, p3, v11

    xor-int/lit8 v11, v11, 0x1

    .line 197
    aput-object v10, p3, v11

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 187
    :cond_2
    aget-object v15, p3, v14

    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 188
    new-instance v2, Ll/᩻۬ܺ;

    xor-int/lit8 v11, v14, 0x1

    aget-object v13, p3, v11

    .line 190
    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v2, v12, v10, v13}, Ll/᩻۬ܺ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    aput-object v10, p3, v11

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_4
    if-ne v7, v0, :cond_5

    return-object v1

    .line 201
    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v9

    aput-object v0, v4, v3

    aput-object v2, v4, v8

    return-object v4

    :cond_6
    const v5, 0x8000

    if-gt v1, v5, :cond_c

    .line 209
    new-array v1, v1, [S

    .line 210
    invoke-static {v1, v7}, Ljava/util/Arrays;->fill([SS)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_3
    if-ge v5, v0, :cond_a

    mul-int/lit8 v10, v5, 0x2

    add-int v10, v10, p2

    mul-int/lit8 v11, v7, 0x2

    add-int v11, v11, p2

    .line 218
    aget-object v12, p3, v10

    invoke-static {v12}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v10, v3

    .line 219
    aget-object v10, p3, v10

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-static {v13}, Ll/ۗۗܺ;->֫(I)I

    move-result v13

    :goto_4
    and-int/2addr v13, v4

    .line 223
    aget-short v14, v1, v13

    const v15, 0xffff

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_8

    int-to-short v14, v11

    .line 225
    aput-short v14, v1, v13

    if-ge v7, v5, :cond_7

    .line 236
    aput-object v12, p3, v11

    xor-int/lit8 v11, v11, 0x1

    .line 237
    aput-object v10, p3, v11

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 227
    :cond_8
    aget-object v15, p3, v14

    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_9

    .line 228
    new-instance v2, Ll/᩻۬ܺ;

    xor-int/lit8 v11, v14, 0x1

    aget-object v13, p3, v11

    .line 230
    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v2, v12, v10, v13}, Ll/᩻۬ܺ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    aput-object v10, p3, v11

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_a
    if-ne v7, v0, :cond_b

    return-object v1

    .line 241
    :cond_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v9

    aput-object v0, v4, v3

    aput-object v2, v4, v8

    return-object v4

    .line 246
    :cond_c
    new-array v1, v1, [I

    .line 247
    invoke-static {v1, v7}, Ljava/util/Arrays;->fill([II)V

    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_6
    if-ge v5, v0, :cond_10

    mul-int/lit8 v11, v5, 0x2

    add-int v11, v11, p2

    mul-int/lit8 v12, v10, 0x2

    add-int v12, v12, p2

    .line 255
    aget-object v13, p3, v11

    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v3, v11

    .line 256
    aget-object v3, p3, v3

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v11

    invoke-static {v11}, Ll/ۗۗܺ;->֫(I)I

    move-result v11

    :goto_7
    and-int/2addr v11, v4

    .line 260
    aget v14, v1, v11

    if-ne v14, v7, :cond_e

    .line 262
    aput v12, v1, v11

    if-ge v10, v5, :cond_d

    .line 273
    aput-object v13, p3, v12

    xor-int/lit8 v11, v12, 0x1

    .line 274
    aput-object v3, p3, v11

    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 264
    :cond_e
    aget-object v15, p3, v14

    invoke-virtual {v13, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    .line 265
    new-instance v2, Ll/᩻۬ܺ;

    xor-int/lit8 v11, v14, 0x1

    aget-object v12, p3, v11

    .line 267
    invoke-static {v12}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v2, v13, v3, v12}, Ll/᩻۬ܺ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    aput-object v3, p3, v11

    :goto_8
    add-int/lit8 v5, v5, 0x1

    const/4 v3, 0x1

    goto :goto_6

    :cond_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_10
    const/4 v3, 0x1

    if-ne v10, v0, :cond_11

    return-object v1

    .line 278
    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v9

    aput-object v0, v4, v3

    aput-object v2, v4, v8

    return-object v4
.end method

.method public static ֫(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p4, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 330
    aget-object p0, p1, p3

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    xor-int/lit8 p0, p3, 0x1

    .line 331
    aget-object p0, p1, p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_1
    if-nez p0, :cond_2

    goto :goto_3

    .line 336
    :cond_2
    instance-of p2, p0, [B

    if-eqz p2, :cond_5

    .line 337
    move-object p2, p0

    check-cast p2, [B

    .line 338
    array-length p0, p2

    add-int/lit8 p3, p0, -0x1

    .line 339
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ll/ۗۗܺ;->֫(I)I

    move-result p0

    :goto_0
    and-int/2addr p0, p3

    .line 341
    aget-byte v0, p2, p0

    const/16 v1, 0xff

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    goto :goto_3

    .line 344
    :cond_3
    aget-object v1, p1, v0

    invoke-virtual {p4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    xor-int/lit8 p0, v0, 0x1

    .line 345
    aget-object p0, p1, p0

    return-object p0

    :cond_4
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 348
    :cond_5
    instance-of p2, p0, [S

    if-eqz p2, :cond_8

    .line 349
    move-object p2, p0

    check-cast p2, [S

    .line 350
    array-length p0, p2

    add-int/lit8 p3, p0, -0x1

    .line 351
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ll/ۗۗܺ;->֫(I)I

    move-result p0

    :goto_1
    and-int/2addr p0, p3

    .line 353
    aget-short v0, p2, p0

    const v1, 0xffff

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_6

    goto :goto_3

    .line 356
    :cond_6
    aget-object v1, p1, v0

    invoke-virtual {p4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    xor-int/lit8 p0, v0, 0x1

    .line 357
    aget-object p0, p1, p0

    return-object p0

    :cond_7
    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    .line 361
    :cond_8
    check-cast p0, [I

    .line 362
    array-length p2, p0

    sub-int/2addr p2, v0

    .line 363
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    move-result p3

    invoke-static {p3}, Ll/ۗۗܺ;->֫(I)I

    move-result p3

    :goto_2
    and-int/2addr p3, p2

    .line 365
    aget v0, p0, p3

    const/4 v1, -0x1

    if-ne v0, v1, :cond_a

    :cond_9
    :goto_3
    const/4 p0, 0x0

    return-object p0

    .line 368
    :cond_a
    aget-object v1, p1, v0

    invoke-virtual {p4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    xor-int/lit8 p0, v0, 0x1

    .line 369
    aget-object p0, p1, p0

    return-object p0

    :cond_b
    add-int/lit8 p3, p3, 0x1

    goto :goto_2
.end method

.method public static ֫(I[Ljava/lang/Object;Ll/ۜ۬ܺ;)Ll/ۜۛܺ;
    .locals 4

    if-nez p0, :cond_0

    .line 104
    sget-object p0, Ll/ۜۛܺ;->ۤ:Ll/ۢ۬ܺ;

    check-cast p0, Ll/ۜۛܺ;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_1

    .line 108
    aget-object p0, p1, v0

    .line 109
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aget-object p0, p1, v1

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    new-instance p0, Ll/ۜۛܺ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1, v1}, Ll/ۜۛܺ;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p0

    .line 112
    :cond_1
    array-length v2, p1

    shr-int/2addr v2, v1

    invoke-static {p0, v2}, Ll/ۘܶܺ;->ۧ(II)V

    .line 113
    invoke-static {p0}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v2

    .line 119
    invoke-static {p0, v2, v0, p1}, Ll/ۜۛܺ;->֫(III[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 121
    instance-of v3, v2, [Ljava/lang/Object;

    if-eqz v3, :cond_3

    .line 122
    check-cast v2, [Ljava/lang/Object;

    const/4 p0, 0x2

    .line 123
    aget-object p0, v2, p0

    check-cast p0, Ll/᩻۬ܺ;

    if-eqz p2, :cond_2

    .line 127
    iput-object p0, p2, Ll/ۜ۬ܺ;->ۧ:Ll/᩻۬ܺ;

    .line 128
    aget-object p0, v2, v0

    .line 129
    aget-object p2, v2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    mul-int/lit8 v0, p2, 0x2

    .line 130
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    move-object v2, p0

    move p0, p2

    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {p0}, Ll/᩻۬ܺ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    .line 134
    :cond_3
    :goto_0
    new-instance p2, Ll/ۜۛܺ;

    invoke-direct {p2, v2, p1, p0}, Ll/ۜۛܺ;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object p2
.end method

.method public static ۧ(III[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 284
    invoke-static {p0, p1, p2, p3}, Ll/ۜۛܺ;->֫(III[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 285
    instance-of p1, p0, [Ljava/lang/Object;

    if-nez p1, :cond_0

    return-object p0

    .line 286
    :cond_0
    check-cast p0, [Ljava/lang/Object;

    const/4 p1, 0x2

    .line 287
    aget-object p0, p0, p1

    check-cast p0, Ll/᩻۬ܺ;

    .line 288
    invoke-virtual {p0}, Ll/᩻۬ܺ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 308
    iget v0, p0, Ll/ۜۛܺ;->۫:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۜۛܺ;->۬:Ljava/lang/Object;

    iget-object v3, p0, Ll/ۜۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1, p1}, Ll/ۜۛܺ;->֫(Ljava/lang/Object;[Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 302
    iget v0, p0, Ll/ۜۛܺ;->۫:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 585
    invoke-super {p0}, Ll/ۢ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۛ۬ܺ;
    .locals 4

    .line 377
    new-instance v0, Ll/ܿۛܺ;

    const/4 v1, 0x0

    iget v2, p0, Ll/ۜۛܺ;->۫:I

    iget-object v3, p0, Ll/ۜۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ܿۛܺ;-><init>(Ll/ۢ۬ܺ;[Ljava/lang/Object;II)V

    return-object v0
.end method

.method public final ۧ()Ll/ۛ۬ܺ;
    .locals 4

    .line 478
    new-instance v0, Ll/᩻ۛܺ;

    const/4 v1, 0x0

    iget v2, p0, Ll/ۜۛܺ;->۫:I

    iget-object v3, p0, Ll/ۜۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ll/᩻ۛܺ;-><init>(II[Ljava/lang/Object;)V

    .line 480
    new-instance v1, Ll/ܳۛܺ;

    invoke-direct {v1, p0, v0}, Ll/ܳۛܺ;-><init>(Ll/ۢ۬ܺ;Ll/ܳ۬ܺ;)V

    return-object v1
.end method

.method public final ܽ()Ll/᩺ۗܺ;
    .locals 4

    .line 571
    new-instance v0, Ll/᩻ۛܺ;

    const/4 v1, 0x1

    iget v2, p0, Ll/ۜۛܺ;->۫:I

    iget-object v3, p0, Ll/ۜۛܺ;->ۗ:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ll/᩻ۛܺ;-><init>(II[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
