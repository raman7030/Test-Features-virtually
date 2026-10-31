.class public final Ll/᩹ۨ֡;
.super Ljava/lang/Object;
.source "T65P"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final synthetic ܽ:Ll/ܰۨ֡;


# direct methods
.method public constructor <init>(Ll/ܰۨ֡;I)V
    .locals 2

    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۨ֡;->ܽ:Ll/ܰۨ֡;

    .line 351
    iput p2, p0, Ll/᩹ۨ֡;->֫:I

    .line 352
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xe1

    const/16 v0, 0x44

    if-lt p1, p2, :cond_0

    .line 353
    iput v0, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 354
    :cond_0
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xbe

    const/16 v1, 0x40

    if-lt p1, p2, :cond_1

    .line 355
    iput v1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 356
    :cond_1
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xb4

    if-lt p1, p2, :cond_2

    const/16 p1, 0x3c

    .line 357
    iput p1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 358
    :cond_2
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xaa

    if-lt p1, p2, :cond_3

    const/16 p1, 0x38

    .line 359
    iput p1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 360
    :cond_3
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xa6

    if-lt p1, p2, :cond_4

    .line 361
    iput v1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 362
    :cond_4
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0xa2

    if-lt p1, p2, :cond_5

    .line 363
    iput v0, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    .line 364
    :cond_5
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result p1

    const/16 p2, 0x7f

    if-lt p1, p2, :cond_6

    const/16 p1, 0x4c

    .line 365
    iput p1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void

    :cond_6
    const/16 p1, 0x48

    .line 367
    iput p1, p0, Ll/᩹ۨ֡;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۨ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۨ֡;->֫:I

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 392
    iget v0, p0, Ll/᩹ۨ֡;->֫:I

    add-int/lit8 v0, v0, 0x14

    iget-object v1, p0, Ll/᩹ۨ֡;->ܽ:Ll/ܰۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 5

    .line 445
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result v0

    const/16 v1, 0x7f

    iget-object v2, p0, Ll/᩹ۨ֡;->ܽ:Ll/ܰۨ֡;

    iget v3, p0, Ll/᩹ۨ֡;->֫:I

    if-lt v0, v1, :cond_0

    add-int/lit8 v0, v3, 0x18

    .line 446
    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    add-int/2addr v0, v3

    return v0

    .line 404
    :cond_0
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result v0

    const-string v1, "Unsupported oat version"

    const/16 v4, 0x38

    if-lt v0, v4, :cond_2

    .line 396
    invoke-virtual {p0}, Ll/᩹ۨ֡;->ܽ()I

    move-result v0

    if-lt v0, v4, :cond_1

    .line 399
    iget v0, p0, Ll/᩹ۨ֡;->ۧ:I

    add-int/lit8 v1, v0, -0x4

    add-int/2addr v1, v3

    .line 400
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v3

    return v1

    .line 397
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 405
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()I
    .locals 4

    .line 388
    iget v0, p0, Ll/᩹ۨ֡;->֫:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Ll/᩹ۨ֡;->ܽ:Ll/ܰۨ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v1, v0, v3, v2}, Ll/᩺ۤ֡;->֫(IILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    .line 388
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    .line 372
    iget v3, p0, Ll/᩹ۨ֡;->֫:I

    iget-object v4, p0, Ll/᩹ۨ֡;->ܽ:Ll/ܰۨ֡;

    if-ge v1, v2, :cond_1

    add-int/2addr v3, v1

    .line 373
    invoke-virtual {v4, v3}, Ll/᩺ۤ֡;->֫(I)B

    move-result v2

    invoke-static {}, Ll/ܰۨ֡;->ܳ()[B

    move-result-object v3

    aget-byte v3, v3, v1

    if-eq v2, v3, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v1, 0x7

    if-ge v2, v1, :cond_3

    add-int v1, v3, v2

    .line 379
    invoke-virtual {v4, v1}, Ll/᩺ۤ֡;->֫(I)B

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_4

    invoke-virtual {v4, v1}, Ll/᩺ۤ֡;->֫(I)B

    move-result v1

    const/16 v5, 0x39

    if-le v1, v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v3, v1

    .line 384
    invoke-virtual {v4, v3}, Ll/᩺ۤ֡;->֫(I)B

    move-result v1

    if-nez v1, :cond_4

    const/4 v0, 0x1

    :cond_4
    :goto_2
    return v0
.end method
