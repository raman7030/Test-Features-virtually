.class public final Ll/ۡ۬ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x5f9acf201199524bL


# instance fields
.field public final a:Ll/ۧۗᩴ;

.field public final b:B

.field public final c:Ll/᩸᩹ᩴ;

.field public final d:Ll/۟ۙᩴ;

.field public final e:Z

.field public final f:Ll/ۢ۬ᩴ;

.field public final g:Ll/ᩳ۬ᩴ;

.field public final h:Ll/ᩳ۬ᩴ;

.field public final i:Ll/ᩳ۬ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 100
    const-class v0, Ll/ۡ۬ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۧۗᩴ;ILl/᩸᩹ᩴ;Ll/۟ۙᩴ;ZLl/ۢ۬ᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    iput-object p1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    int-to-byte p1, p2

    .line 229
    iput-byte p1, p0, Ll/ۡ۬ᩴ;->b:B

    .line 230
    iput-object p3, p0, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    .line 231
    iput-object p4, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    .line 232
    iput-boolean p5, p0, Ll/ۡ۬ᩴ;->e:Z

    .line 233
    iput-object p6, p0, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    .line 234
    iput-object p7, p0, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    .line 235
    iput-object p8, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 236
    iput-object p9, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    return-void
.end method

.method public static a(Ljava/io/DataInput;)Ll/ۡ۬ᩴ;
    .locals 15

    .line 346
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x1c

    .line 347
    invoke-static {v1}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object v3

    const/high16 v1, 0xfc00000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x16

    add-int/lit8 v4, v1, -0x20

    const/high16 v1, 0x380000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x13

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 350
    :cond_0
    invoke-static {v1}, Ll/᩸᩹ᩴ;->V(I)Ll/᩸᩹ᩴ;

    move-result-object v1

    :goto_0
    move-object v5, v1

    const v1, 0x7c000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0xe

    .line 352
    invoke-static {}, Ll/ۢ۬ᩴ;->values()[Ll/ۢ۬ᩴ;

    move-result-object v2

    and-int/lit16 v6, v0, 0x3000

    ushr-int/lit8 v6, v6, 0xc

    aget-object v8, v2, v6

    and-int/lit16 v2, v0, 0xff0

    ushr-int/lit8 v2, v2, 0x4

    and-int/lit8 v6, v0, 0xc

    ushr-int/lit8 v6, v6, 0x2

    and-int/lit8 v0, v0, 0x3

    const/16 v7, 0x1f

    if-ne v1, v7, :cond_1

    .line 356
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v7

    int-to-long v9, v7

    sget-object v7, Ll/۟ۙᩴ;->e:Ll/۟ۙᩴ;

    .line 380
    sget-object v7, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v7, v9, v10}, Ll/ᩴۗᩴ;->T(J)V

    const-wide/16 v11, 0xe10

    .line 381
    div-long v11, v9, v11

    long-to-int v7, v11

    mul-int/lit16 v11, v7, 0xe10

    int-to-long v11, v11

    sub-long/2addr v9, v11

    const-wide/16 v11, 0x3c

    .line 383
    div-long v11, v9, v11

    long-to-int v12, v11

    mul-int/lit8 v11, v12, 0x3c

    int-to-long v13, v11

    sub-long/2addr v9, v13

    long-to-int v10, v9

    const/4 v9, 0x0

    .line 385
    invoke-static {v7, v12, v10, v9}, Ll/۟ۙᩴ;->W(IIII)Ll/۟ۙᩴ;

    move-result-object v7

    goto :goto_1

    .line 356
    :cond_1
    rem-int/lit8 v7, v1, 0x18

    sget-object v9, Ll/۟ۙᩴ;->e:Ll/۟ۙᩴ;

    .line 296
    sget-object v9, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    int-to-long v10, v7

    invoke-virtual {v9, v10, v11}, Ll/ᩴۗᩴ;->T(J)V

    .line 298
    sget-object v9, Ll/۟ۙᩴ;->h:[Ll/۟ۙᩴ;

    aget-object v7, v9, v7

    :goto_1
    const/16 v9, 0xff

    if-ne v2, v9, :cond_2

    .line 357
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, -0x80

    mul-int/lit16 v2, v2, 0x384

    :goto_2
    invoke-static {v2}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object v9

    const/4 v2, 0x3

    if-ne v6, v2, :cond_3

    .line 358
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v6

    goto :goto_3

    .line 474
    :cond_3
    iget v10, v9, Ll/ᩳ۬ᩴ;->b:I

    mul-int/lit16 v6, v6, 0x708

    add-int/2addr v6, v10

    .line 358
    :goto_3
    invoke-static {v6}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object v10

    if-ne v0, v2, :cond_4

    .line 359
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    goto :goto_4

    .line 474
    :cond_4
    iget p0, v9, Ll/ᩳ۬ᩴ;->b:I

    mul-int/lit16 v0, v0, 0x708

    add-int/2addr p0, v0

    .line 359
    :goto_4
    invoke-static {p0}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object v11

    const/16 p0, 0x18

    if-ne v1, p0, :cond_5

    const/4 p0, 0x1

    goto :goto_5

    :cond_5
    const/4 p0, 0x0

    :goto_5
    const-string v0, "month"

    .line 182
    invoke-static {v3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "time"

    .line 183
    invoke-static {v7, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "timeDefnition"

    .line 184
    invoke-static {v8, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "standardOffset"

    .line 185
    invoke-static {v9, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "offsetBefore"

    .line 186
    invoke-static {v10, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "offsetAfter"

    .line 187
    invoke-static {v11, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v0, -0x1c

    if-lt v4, v0, :cond_9

    const/16 v0, 0x1f

    if-gt v4, v0, :cond_9

    if-eqz v4, :cond_9

    if-eqz p0, :cond_7

    .line 191
    sget-object v0, Ll/۟ۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-virtual {v7, v0}, Ll/۟ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_6

    .line 192
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Time must be midnight when end of day flag is true"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 738
    :cond_7
    :goto_6
    iget v0, v7, Ll/۟ۙᩴ;->d:I

    if-nez v0, :cond_8

    .line 197
    new-instance v0, Ll/ۡ۬ᩴ;

    move-object v2, v0

    move-object v6, v7

    move v7, p0

    invoke-direct/range {v2 .. v11}, Ll/ۡ۬ᩴ;-><init>(Ll/ۧۗᩴ;ILl/᩸᩹ᩴ;Ll/۟ۙᩴ;ZLl/ۢ۬ᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v0

    .line 195
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Time\'s nano-of-second must be zero"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 189
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Day of month indicator must be between -28 and 31 inclusive excluding zero"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 247
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 296
    new-instance v0, Ll/᩻۬ᩴ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩻۬ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/io/DataOutput;)V
    .locals 12

    .line 306
    iget-boolean v0, p0, Ll/ۡ۬ᩴ;->e:Z

    if-eqz v0, :cond_0

    const v0, 0x15180

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ll/۟ۙᩴ;->i0()I

    move-result v0

    .line 307
    :goto_0
    iget-object v1, p0, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    .line 308
    iget-object v2, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 474
    iget v2, v2, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v2, v1

    .line 309
    iget-object v3, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    .line 474
    iget v3, v3, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v3, v1

    .line 310
    rem-int/lit16 v4, v0, 0xe10

    const/16 v5, 0x1f

    if-nez v4, :cond_2

    iget-boolean v4, p0, Ll/ۡ۬ᩴ;->e:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x18

    goto :goto_1

    :cond_1
    iget-object v4, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    .line 711
    iget-byte v4, v4, Ll/۟ۙᩴ;->a:B

    goto :goto_1

    :cond_2
    const/16 v4, 0x1f

    .line 311
    :goto_1
    rem-int/lit16 v6, v1, 0x384

    const/16 v7, 0xff

    if-nez v6, :cond_3

    div-int/lit16 v6, v1, 0x384

    add-int/lit16 v6, v6, 0x80

    goto :goto_2

    :cond_3
    const/16 v6, 0xff

    :goto_2
    const/16 v8, 0xe10

    const/4 v9, 0x3

    const/16 v10, 0x708

    if-eqz v2, :cond_5

    if-eq v2, v10, :cond_5

    if-ne v2, v8, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x3

    goto :goto_4

    .line 312
    :cond_5
    :goto_3
    div-int/2addr v2, v10

    :goto_4
    if-eqz v3, :cond_7

    if-eq v3, v10, :cond_7

    if-ne v3, v8, :cond_6

    goto :goto_5

    :cond_6
    const/4 v3, 0x3

    goto :goto_6

    .line 313
    :cond_7
    :goto_5
    div-int/2addr v3, v10

    .line 314
    :goto_6
    iget-object v8, p0, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    if-nez v8, :cond_8

    const/4 v8, 0x0

    goto :goto_7

    :cond_8
    invoke-virtual {v8}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v8

    .line 315
    :goto_7
    iget-object v10, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    invoke-virtual {v10}, Ll/ۧۗᩴ;->getValue()I

    move-result v10

    shl-int/lit8 v10, v10, 0x1c

    iget-byte v11, p0, Ll/ۡ۬ᩴ;->b:B

    add-int/lit8 v11, v11, 0x20

    shl-int/lit8 v11, v11, 0x16

    add-int/2addr v10, v11

    shl-int/lit8 v8, v8, 0x13

    add-int/2addr v10, v8

    shl-int/lit8 v8, v4, 0xe

    add-int/2addr v10, v8

    iget-object v8, p0, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    .line 319
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    shl-int/lit8 v8, v8, 0xc

    add-int/2addr v10, v8

    shl-int/lit8 v8, v6, 0x4

    add-int/2addr v10, v8

    shl-int/lit8 v8, v2, 0x2

    add-int/2addr v10, v8

    add-int/2addr v10, v3

    .line 323
    invoke-interface {p1, v10}, Ljava/io/DataOutput;->writeInt(I)V

    if-ne v4, v5, :cond_9

    .line 325
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_9
    if-ne v6, v7, :cond_a

    .line 328
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_a
    if-ne v2, v9, :cond_b

    .line 331
    iget-object v0, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 474
    iget v0, v0, Ll/ᩳ۬ᩴ;->b:I

    .line 331
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_b
    if-ne v3, v9, :cond_c

    .line 334
    iget-object v0, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    .line 474
    iget v0, v0, Ll/ᩳ۬ᩴ;->b:I

    .line 334
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_c
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 522
    :cond_0
    instance-of v1, p1, Ll/ۡ۬ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 523
    check-cast p1, Ll/ۡ۬ᩴ;

    .line 524
    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    if-ne v1, v3, :cond_1

    iget-byte v1, p0, Ll/ۡ۬ᩴ;->b:B

    iget-byte v3, p1, Ll/ۡ۬ᩴ;->b:B

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    .line 526
    invoke-virtual {v1, v3}, Ll/۟ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/ۡ۬ᩴ;->e:Z

    iget-boolean v3, p1, Ll/ۡ۬ᩴ;->e:Z

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    .line 528
    invoke-virtual {v1, v3}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    iget-object v3, p1, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 529
    invoke-virtual {v1, v3}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    iget-object p1, p1, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    .line 530
    invoke-virtual {v1, p1}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 542
    iget-object v0, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ll/۟ۙᩴ;->i0()I

    move-result v0

    iget-boolean v1, p0, Ll/ۡ۬ᩴ;->e:Z

    add-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0xf

    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    .line 543
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    shl-int/lit8 v1, v1, 0xb

    add-int/2addr v0, v1

    iget-byte v1, p0, Ll/ۡ۬ᩴ;->b:B

    add-int/lit8 v1, v1, 0x20

    shl-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    .line 544
    iget-object v1, p0, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    if-nez v1, :cond_0

    const/4 v1, 0x7

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    :goto_0
    shl-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/2addr v1, v0

    .line 545
    iget-object v0, p0, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    .line 736
    iget v0, v0, Ll/ᩳ۬ᩴ;->b:I

    xor-int/2addr v0, v1

    .line 545
    iget-object v1, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 736
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    xor-int/2addr v0, v1

    .line 546
    iget-object v1, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    .line 736
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransitionRule["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 559
    iget-object v1, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    iget-object v2, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    .line 705
    iget v2, v2, Ll/ᩳ۬ᩴ;->b:I

    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v2, v1

    if-lez v2, :cond_0

    const-string v1, "Gap "

    goto :goto_0

    :cond_0
    const-string v1, "Overlap "

    .line 559
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->i:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    iget-object v1, p0, Ll/ۡ۬ᩴ;->c:Ll/᩸᩹ᩴ;

    const/16 v2, 0x20

    if-eqz v1, :cond_3

    .line 562
    iget-byte v3, p0, Ll/ۡ۬ᩴ;->b:B

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 563
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on or before last day of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    if-gez v3, :cond_2

    .line 565
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on or before last day minus "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Ll/ۡ۬ᩴ;->b:B

    neg-int v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 567
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on or after "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Ll/ۡ۬ᩴ;->b:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 570
    :cond_3
    iget-object v1, p0, Ll/ۡ۬ᩴ;->a:Ll/ۧۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Ll/ۡ۬ᩴ;->b:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, " at "

    .line 572
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۡ۬ᩴ;->e:Z

    if-eqz v1, :cond_4

    const-string v1, "24:00"

    goto :goto_2

    :cond_4
    iget-object v1, p0, Ll/ۡ۬ᩴ;->d:Ll/۟ۙᩴ;

    invoke-virtual {v1}, Ll/۟ۙᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->f:Ll/ۢ۬ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", standard offset "

    .line 574
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 576
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
