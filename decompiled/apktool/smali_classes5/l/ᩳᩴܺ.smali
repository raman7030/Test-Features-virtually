.class public final Ll/ᩳᩴܺ;
.super Ljava/lang/Object;
.source "J5T5"

# interfaces
.implements Ll/ۛۘܺ;


# instance fields
.field public ֫:I

.field public ۧ:Ljava/util/ArrayList;

.field public final ܳ:Z

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x3e8

    new-array v0, v0, [B

    const/4 v1, 0x1

    .line 108
    invoke-direct {p0, v0, v1}, Ll/ᩳᩴܺ;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, p1, v0}, Ll/ᩳᩴܺ;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 122
    iput-boolean p2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    .line 123
    iput-object p1, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    const/4 p1, 0x0

    .line 124
    iput p1, p0, Ll/ᩳᩴܺ;->ܽ:I

    const/4 p2, 0x0

    .line 126
    iput-object p2, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    .line 127
    iput p1, p0, Ll/ᩳᩴܺ;->֫:I

    .line 128
    iput p1, p0, Ll/ᩳᩴܺ;->ܿ:I

    return-void

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "data == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۜ()V
    .locals 2

    .line 597
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "attempt to write past the end"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۢ(I)V
    .locals 3

    .line 607
    iget-object v0, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit16 p1, p1, 0x3e8

    .line 608
    new-array p1, p1, [B

    .line 609
    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 610
    iput-object p1, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    add-int/lit8 v0, p1, -0x1

    if-ltz p1, :cond_2

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    .line 384
    iget p1, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    .line 386
    iget-boolean v0, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v0, :cond_0

    .line 387
    invoke-direct {p0, p1}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 388
    :cond_0
    iget-object v0, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v0, v0

    if-gt p1, v0, :cond_1

    .line 396
    :goto_0
    iget-object v0, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 398
    iput p1, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 389
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 381
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 3

    .line 435
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 439
    :cond_0
    invoke-virtual {p0}, Ll/ᩳᩴܺ;->ۧ()V

    .line 441
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 442
    :cond_1
    iget-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽᩴܺ;

    invoke-virtual {v0}, Ll/ܽᩴܺ;->֫()I

    move-result v0

    .line 445
    :goto_0
    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    if-gt v0, v1, :cond_2

    move v0, v1

    .line 451
    :cond_2
    iget-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    new-instance v2, Ll/ܽᩴܺ;

    add-int/2addr p1, v0

    invoke-direct {v2, v0, p1, p2}, Ll/ܽᩴܺ;-><init>(IILjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(J)V
    .locals 6

    .line 241
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v1, v0, 0x8

    .line 244
    iget-boolean v2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v2, :cond_0

    .line 245
    invoke-direct {p0, v1}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 246
    :cond_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    :goto_0
    long-to-int v2, p1

    .line 252
    iget-object v3, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    int-to-byte v4, v2

    aput-byte v4, v3, v0

    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v5, v2, 0x8

    int-to-byte v5, v5

    .line 253
    aput-byte v5, v3, v4

    add-int/lit8 v4, v0, 0x2

    shr-int/lit8 v5, v2, 0x10

    int-to-byte v5, v5

    .line 254
    aput-byte v5, v3, v4

    add-int/lit8 v4, v0, 0x3

    shr-int/lit8 v2, v2, 0x18

    int-to-byte v2, v2

    .line 255
    aput-byte v2, v3, v4

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    long-to-int p2, p1

    add-int/lit8 p1, v0, 0x4

    int-to-byte v2, p2

    .line 258
    aput-byte v2, v3, p1

    add-int/lit8 p1, v0, 0x5

    shr-int/lit8 v2, p2, 0x8

    int-to-byte v2, v2

    .line 259
    aput-byte v2, v3, p1

    add-int/lit8 p1, v0, 0x6

    shr-int/lit8 v2, p2, 0x10

    int-to-byte v2, v2

    .line 260
    aput-byte v2, v3, p1

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 p1, p2, 0x18

    int-to-byte p1, p1

    .line 261
    aput-byte p1, v3, v0

    .line 263
    iput v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 247
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 422
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 426
    :cond_0
    invoke-virtual {p0}, Ll/ᩳᩴܺ;->ۧ()V

    .line 427
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    new-instance v1, Ll/ܽᩴܺ;

    iget v2, p0, Ll/ᩳᩴܺ;->ܽ:I

    const v3, 0x7fffffff

    .line 655
    invoke-direct {v1, v2, v3, p1}, Ll/ܽᩴܺ;-><init>(IILjava/lang/String;)V

    .line 427
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۧᩴܺ;)V
    .locals 3

    .line 297
    invoke-virtual {p1}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    .line 298
    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/2addr v0, v1

    .line 301
    iget-boolean v2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v2, :cond_0

    .line 302
    invoke-direct {p0, v0}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 303
    :cond_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v2, v2

    if-gt v0, v2, :cond_1

    .line 308
    :goto_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    invoke-virtual {p1, v1, v2}, Ll/ۧᩴܺ;->֫(I[B)V

    .line 309
    iput v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 304
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫([B)V
    .locals 5

    .line 344
    array-length v0, p1

    .line 317
    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int v2, v1, v0

    or-int v3, v0, v2

    if-ltz v3, :cond_2

    .line 322
    array-length v3, p1

    if-gt v0, v3, :cond_2

    .line 328
    iget-boolean v3, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v3, :cond_0

    .line 329
    invoke-direct {p0, v2}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 330
    :cond_0
    iget-object v3, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v3, v3

    if-gt v2, v3, :cond_1

    .line 335
    :goto_0
    iget-object v3, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    const/4 v4, 0x0

    invoke-static {p1, v4, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 336
    iput v2, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 331
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 323
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "bytes.length "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; 0..!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()Z
    .locals 1

    .line 406
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ(I)I
    .locals 2

    .line 271
    iget-boolean v0, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v0, :cond_0

    .line 272
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ll/ᩳᩴܺ;->ۢ(I)V

    .line 274
    :cond_0
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    :goto_0
    ushr-int/lit8 v1, p1, 0x7

    if-eqz v1, :cond_1

    and-int/lit8 p1, p1, 0x7f

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    .line 108
    invoke-virtual {p0, p1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    move p1, v1

    goto :goto_0

    :cond_1
    and-int/lit8 p1, p1, 0x7f

    int-to-byte p1, p1

    .line 113
    invoke-virtual {p0, p1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    .line 276
    iget p1, p0, Ll/ᩳᩴܺ;->ܽ:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 459
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    .line 463
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 466
    iget-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽᩴܺ;

    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ܽᩴܺ;->ۧ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 169
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 170
    :cond_0
    new-instance v0, Ll/۠ۧܺ;

    const-string v1, "expected cursor "

    const-string v2, "; actual value: "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 170
    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p1, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 170
    throw v0
.end method

.method public final ܳ()I
    .locals 1

    .line 161
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    return v0
.end method

.method public final ܳ(I)V
    .locals 4

    .line 199
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v1, v0, 0x2

    .line 202
    iget-boolean v2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v2, :cond_0

    .line 203
    invoke-direct {p0, v1}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 204
    :cond_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    .line 209
    :goto_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    shr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    .line 210
    aput-byte p1, v2, v0

    .line 211
    iput v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 205
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܽ()V
    .locals 5

    .line 517
    invoke-virtual {p0}, Ll/ᩳᩴܺ;->ۧ()V

    .line 520
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 521
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    .line 523
    iget-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽᩴܺ;

    .line 524
    invoke-virtual {v1}, Ll/ܽᩴܺ;->ۧ()I

    move-result v3

    iget v4, p0, Ll/ᩳᩴܺ;->ܽ:I

    if-le v3, v4, :cond_0

    .line 525
    iget-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 527
    :cond_0
    invoke-virtual {v1}, Ll/ܽᩴܺ;->֫()I

    move-result v0

    iget v2, p0, Ll/ᩳᩴܺ;->ܽ:I

    if-le v0, v2, :cond_1

    .line 528
    invoke-virtual {v1, v2}, Ll/ܽᩴܺ;->֫(I)V

    :cond_1
    return-void
.end method

.method public final ܽ(I)V
    .locals 3

    .line 489
    iget-object v0, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    if-nez v0, :cond_3

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 v0, 0xf

    const/4 v1, 0x1

    const/4 v2, 0x7

    .line 497
    invoke-static {p1, v2, v0, v1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v0

    and-int/lit8 v0, v0, -0x2

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    const/4 v0, 0x6

    goto :goto_0

    :cond_0
    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    const/16 v0, 0xa

    .line 504
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x3e8

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ᩳᩴܺ;->ۧ:Ljava/util/ArrayList;

    .line 505
    iput p1, p0, Ll/ᩳᩴܺ;->֫:I

    .line 506
    iput v0, p0, Ll/ᩳᩴܺ;->ܿ:I

    return-void

    .line 494
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "annotationWidth < 40"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 490
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "cannot enable annotations"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ(I)V
    .locals 5

    .line 219
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v1, v0, 0x4

    .line 222
    iget-boolean v2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v2, :cond_0

    .line 223
    invoke-direct {p0, v1}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 224
    :cond_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    .line 229
    :goto_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    .line 230
    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    .line 231
    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 232
    aput-byte p1, v2, v0

    .line 233
    iput v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 225
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܿ()[B
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    return-object v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 475
    iget v0, p0, Ll/ᩳᩴܺ;->ܿ:I

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x8

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    .line 477
    iget v1, p0, Ll/ᩳᩴܺ;->֫:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ᩳ(I)V
    .locals 3

    .line 180
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v1, v0, 0x1

    .line 183
    iget-boolean v2, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v2, :cond_0

    .line 184
    invoke-direct {p0, v1}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 185
    :cond_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length v2, v2

    if-gt v1, v2, :cond_1

    .line 190
    :goto_0
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    .line 191
    iput v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 186
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ᩷(I)V
    .locals 3

    if-ltz p1, :cond_2

    .line 356
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/2addr v0, p1

    .line 358
    iget-boolean p1, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz p1, :cond_0

    .line 359
    invoke-direct {p0, v0}, Ll/ᩳᩴܺ;->ۢ(I)V

    goto :goto_0

    .line 360
    :cond_0
    iget-object p1, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    array-length p1, p1

    if-gt v0, p1, :cond_1

    .line 368
    :goto_0
    iget-object p1, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    iget v1, p0, Ll/ᩳᩴܺ;->ܽ:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 370
    iput v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    return-void

    .line 361
    :cond_1
    invoke-static {}, Ll/ᩳᩴܺ;->ۜ()V

    const/4 p1, 0x0

    throw p1

    .line 353
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "count < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩻(I)V
    .locals 5

    .line 284
    iget-boolean v0, p0, Ll/ᩳᩴܺ;->ܳ:Z

    if-eqz v0, :cond_0

    .line 285
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ll/ᩳᩴܺ;->ۢ(I)V

    :cond_0
    shr-int/lit8 v0, p1, 0x7

    const/high16 v1, -0x80000000

    and-int/2addr v1, p1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    const/4 v2, 0x1

    :goto_1
    move v4, v0

    move v0, p1

    move p1, v4

    if-eqz v2, :cond_5

    if-ne p1, v1, :cond_3

    and-int/lit8 v2, p1, 0x1

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x1

    :goto_3
    and-int/lit8 v0, v0, 0x7f

    if-eqz v2, :cond_4

    const/16 v3, 0x80

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_4
    or-int/2addr v0, v3

    int-to-byte v0, v0

    .line 129
    invoke-virtual {p0, v0}, Ll/ᩳᩴܺ;->ᩳ(I)V

    shr-int/lit8 v0, p1, 0x7

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final ᩻()[B
    .locals 4

    .line 151
    iget v0, p0, Ll/ᩳᩴܺ;->ܽ:I

    new-array v1, v0, [B

    .line 152
    iget-object v2, p0, Ll/ᩳᩴܺ;->ᩳ:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method
