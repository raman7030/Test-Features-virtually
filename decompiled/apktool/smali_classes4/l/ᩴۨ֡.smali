.class public final Ll/ᩴۨ֡;
.super Ljava/lang/Object;
.source "65V2"


# instance fields
.field public final ֫:Ll/ۘۨ֡;

.field public ۧ:I

.field public ܽ:Z


# direct methods
.method public constructor <init>(Ll/ۘۨ֡;I)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    .line 52
    iput p2, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method private ֫(Z)I
    .locals 9

    .line 141
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 142
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 147
    iget-object v2, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v4, v3, 0xff

    const/16 v5, 0x7f

    if-le v4, v5, :cond_5

    add-int/lit8 v4, v0, 0x2

    .line 149
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v6, v1, 0xff

    and-int/2addr v3, v5

    and-int/2addr v1, v5

    const/4 v7, 0x7

    shl-int/2addr v1, v7

    or-int/2addr v1, v3

    if-le v6, v5, :cond_4

    add-int/lit8 v3, v0, 0x3

    .line 152
    invoke-virtual {v2, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    and-int/lit16 v6, v4, 0xff

    and-int/2addr v4, v5

    shl-int/lit8 v4, v4, 0xe

    or-int/2addr v4, v1

    if-le v6, v5, :cond_3

    add-int/lit8 v1, v0, 0x4

    .line 155
    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v6, v3, 0xff

    and-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x15

    or-int/2addr v4, v3

    if-le v6, v5, :cond_5

    add-int/lit8 v0, v0, 0x5

    .line 158
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    if-ltz v1, :cond_2

    and-int/lit8 v6, v1, 0xf

    if-le v6, v7, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 168
    :cond_0
    new-instance p1, Ll/ܶ᩵ۚ;

    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "Encountered valid uleb128 that is out of range at offset 0x%x"

    .line 46
    invoke-direct {p1, v3, v0, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    throw p1

    :cond_1
    :goto_0
    shl-int/lit8 p1, v1, 0x1c

    or-int/2addr v4, p1

    move v1, v0

    goto :goto_1

    .line 162
    :cond_2
    new-instance p1, Ll/ܶ᩵ۚ;

    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 46
    invoke-direct {p1, v3, v0, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    throw p1

    :cond_3
    move v1, v3

    goto :goto_1

    :cond_4
    move v8, v4

    move v4, v1

    move v1, v8

    .line 178
    :cond_5
    :goto_1
    iput v1, p0, Ll/ᩴۨ֡;->ۧ:I

    return v4
.end method


# virtual methods
.method public final ֡()V
    .locals 4

    .line 302
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 303
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 307
    iget-object v2, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    if-gez v3, :cond_2

    add-int/lit8 v3, v0, 0x2

    .line 309
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    if-gez v1, :cond_1

    add-int/lit8 v1, v0, 0x3

    .line 311
    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    if-gez v3, :cond_2

    add-int/lit8 v3, v0, 0x4

    .line 313
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    if-gez v1, :cond_1

    add-int/lit8 v1, v0, 0x5

    .line 315
    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    .line 317
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 318
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x0

    const-string v3, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 46
    invoke-direct {v0, v1, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    throw v0

    :cond_1
    move v1, v3

    .line 325
    :cond_2
    :goto_0
    iput v1, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 700
    iget-boolean v0, p0, Ll/ᩴۨ֡;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 701
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 405
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method public final ֫(ILjava/io/Writer;Z)V
    .locals 2

    .line 676
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 677
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-static {p2, v1, v0, p1, p3}, Ll/۟᩵ۚ;->֫(Ljava/io/Writer;Ll/ۘۨ֡;IIZ)I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method public final ۖ()I
    .locals 2

    .line 366
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 367
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->᩷(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    .line 368
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v1
.end method

.method public final ۘ()V
    .locals 1

    .line 689
    iget-boolean v0, p0, Ll/ᩴۨ֡;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 690
    iput-boolean v0, p0, Ll/ᩴۨ֡;->ܽ:Z

    .line 691
    iget-object v0, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v0, p0}, Ll/ۘۨ֡;->֫(Ll/ᩴۨ֡;)V

    :cond_0
    return-void
.end method

.method public final ۜ()I
    .locals 8

    .line 237
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 238
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 243
    iget-object v2, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v4, v3, 0xff

    const/16 v5, 0x7f

    if-le v4, v5, :cond_3

    add-int/lit8 v4, v0, 0x2

    .line 245
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v6, v1, 0xff

    and-int/2addr v3, v5

    and-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v1, v3

    if-le v6, v5, :cond_2

    add-int/lit8 v3, v0, 0x3

    .line 248
    invoke-virtual {v2, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    and-int/lit16 v6, v4, 0xff

    and-int/2addr v4, v5

    shl-int/lit8 v4, v4, 0xe

    or-int/2addr v4, v1

    if-le v6, v5, :cond_1

    add-int/lit8 v1, v0, 0x4

    .line 251
    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v6, v3, 0xff

    and-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x15

    or-int/2addr v4, v3

    if-le v6, v5, :cond_3

    add-int/lit8 v0, v0, 0x5

    .line 254
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    if-ltz v1, :cond_0

    shl-int/lit8 v1, v1, 0x1c

    or-int/2addr v4, v1

    move v1, v0

    goto :goto_0

    .line 258
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 259
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x0

    const-string v3, "Invalid uleb128 integer encountered at offset 0x%x"

    .line 46
    invoke-direct {v0, v1, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    throw v0

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    move v7, v4

    move v4, v1

    move v1, v7

    .line 267
    :cond_3
    :goto_0
    iput v1, p0, Ll/ᩴۨ֡;->ۧ:I

    return v4
.end method

.method public final ۜ(I)Ljava/lang/String;
    .locals 3

    .line 667
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 669
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    iget v2, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1, v2, p1, v0}, Ll/۟᩵ۚ;->֫(Ll/ۘۨ֡;II[I)Ljava/lang/String;

    move-result-object p1

    .line 671
    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    const/4 v2, 0x0

    aget v0, v0, v2

    add-int/2addr v1, v0

    iput v1, p0, Ll/ᩴۨ֡;->ۧ:I

    return-object p1
.end method

.method public final ۡ()I
    .locals 8

    .line 64
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 65
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 70
    iget-object v2, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v2, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v4, v3, 0xff

    const/16 v5, 0x7f

    if-gt v4, v5, :cond_0

    shl-int/lit8 v0, v4, 0x19

    shr-int/lit8 v0, v0, 0x19

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v0, 0x2

    .line 74
    invoke-virtual {v2, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v6, v1, 0xff

    and-int/2addr v3, v5

    and-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v1, v3

    if-gt v6, v5, :cond_1

    shl-int/lit8 v0, v1, 0x12

    shr-int/lit8 v0, v0, 0x12

    :goto_0
    move v1, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v0, 0x3

    .line 79
    invoke-virtual {v2, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    and-int/lit16 v6, v4, 0xff

    and-int/2addr v4, v5

    shl-int/lit8 v4, v4, 0xe

    or-int/2addr v1, v4

    if-gt v6, v5, :cond_2

    shl-int/lit8 v0, v1, 0xb

    shr-int/lit8 v0, v0, 0xb

    move v1, v3

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v0, 0x4

    .line 84
    invoke-virtual {v2, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v6, v3, 0xff

    and-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x15

    or-int/2addr v1, v3

    if-gt v6, v5, :cond_3

    shl-int/lit8 v0, v1, 0x4

    shr-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_3
    add-int/lit8 v0, v0, 0x5

    .line 89
    invoke-virtual {v2, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-gt v2, v5, :cond_4

    shl-int/lit8 v2, v2, 0x1c

    or-int/2addr v1, v2

    move v7, v1

    move v1, v0

    move v0, v7

    .line 100
    :goto_1
    iput v1, p0, Ll/ᩴۨ֡;->ۧ:I

    return v0

    .line 91
    :cond_4
    new-instance v0, Ll/ܶ᩵ۚ;

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x0

    const-string v3, "Invalid sleb128 integer encountered at offset 0x%x"

    .line 46
    invoke-direct {v0, v1, v3, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    throw v0
.end method

.method public final ۢ()I
    .locals 1

    const/4 v0, 0x1

    .line 227
    invoke-direct {p0, v0}, Ll/ᩴۨ֡;->֫(Z)I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 56
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 425
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {p1, v0}, Ll/ۘۨ֡;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ܳ()I
    .locals 2

    .line 351
    iget-object v0, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method

.method public final ܳ(I)J
    .locals 13

    .line 533
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 534
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    const/16 v1, 0x18

    const/16 v2, 0x20

    const/16 v3, 0x28

    const/16 v4, 0x30

    const/16 v5, 0x38

    const-wide/16 v6, 0xff

    .line 538
    iget-object v8, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    packed-switch p1, :pswitch_data_0

    .line 592
    new-instance v0, Ll/ܶ᩵ۚ;

    .line 593
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    const/4 p1, 0x0

    const-string v1, "Invalid size %d for sized, right extended long at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    throw v0

    .line 540
    :pswitch_0
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    add-int/lit8 v10, v0, 0x1

    .line 541
    invoke-virtual {v8, v10}, Ll/ۘۨ֡;->֫(I)B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v9, v10

    add-int/lit8 v10, v0, 0x2

    .line 542
    invoke-virtual {v8, v10}, Ll/ۘۨ֡;->֫(I)B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    int-to-long v9, v9

    add-int/lit8 v11, v0, 0x3

    .line 543
    invoke-virtual {v8, v11}, Ll/ۘۨ֡;->֫(I)B

    move-result v11

    int-to-long v11, v11

    and-long/2addr v11, v6

    shl-long/2addr v11, v1

    or-long/2addr v9, v11

    add-int/lit8 v1, v0, 0x4

    .line 544
    invoke-virtual {v8, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v11, v1

    and-long/2addr v11, v6

    shl-long v1, v11, v2

    or-long/2addr v1, v9

    add-int/lit8 v9, v0, 0x5

    .line 545
    invoke-virtual {v8, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v3

    or-long/2addr v1, v9

    add-int/lit8 v3, v0, 0x6

    .line 546
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x7

    .line 547
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto/16 :goto_0

    .line 550
    :pswitch_1
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    add-int/lit8 v10, v0, 0x1

    .line 551
    invoke-virtual {v8, v10}, Ll/ۘۨ֡;->֫(I)B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    int-to-long v9, v9

    add-int/lit8 v11, v0, 0x2

    .line 552
    invoke-virtual {v8, v11}, Ll/ۘۨ֡;->֫(I)B

    move-result v11

    int-to-long v11, v11

    and-long/2addr v11, v6

    shl-long/2addr v11, v1

    or-long/2addr v9, v11

    add-int/lit8 v1, v0, 0x3

    .line 553
    invoke-virtual {v8, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v11, v1

    and-long/2addr v11, v6

    shl-long v1, v11, v2

    or-long/2addr v1, v9

    add-int/lit8 v9, v0, 0x4

    .line 554
    invoke-virtual {v8, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v3

    or-long/2addr v1, v9

    add-int/lit8 v3, v0, 0x5

    .line 555
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x6

    .line 556
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto/16 :goto_0

    .line 559
    :pswitch_2
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    int-to-long v9, v9

    add-int/lit8 v11, v0, 0x1

    .line 560
    invoke-virtual {v8, v11}, Ll/ۘۨ֡;->֫(I)B

    move-result v11

    int-to-long v11, v11

    and-long/2addr v11, v6

    shl-long/2addr v11, v1

    or-long/2addr v9, v11

    add-int/lit8 v1, v0, 0x2

    .line 561
    invoke-virtual {v8, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v11, v1

    and-long/2addr v11, v6

    shl-long v1, v11, v2

    or-long/2addr v1, v9

    add-int/lit8 v9, v0, 0x3

    .line 562
    invoke-virtual {v8, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v3

    or-long/2addr v1, v9

    add-int/lit8 v3, v0, 0x4

    .line 563
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x5

    .line 564
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto/16 :goto_0

    .line 567
    :pswitch_3
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v1

    add-int/lit8 v1, v0, 0x1

    .line 568
    invoke-virtual {v8, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v11, v1

    and-long/2addr v11, v6

    shl-long v1, v11, v2

    or-long/2addr v1, v9

    add-int/lit8 v9, v0, 0x2

    .line 569
    invoke-virtual {v8, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v3

    or-long/2addr v1, v9

    add-int/lit8 v3, v0, 0x3

    .line 570
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x4

    .line 571
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto :goto_0

    .line 574
    :pswitch_4
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v9, v1

    and-long/2addr v9, v6

    shl-long v1, v9, v2

    add-int/lit8 v9, v0, 0x1

    .line 575
    invoke-virtual {v8, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v3

    or-long/2addr v1, v9

    add-int/lit8 v3, v0, 0x2

    .line 576
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x3

    .line 577
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto :goto_0

    .line 580
    :pswitch_5
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v6

    shl-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x1

    .line 581
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v9, v3

    and-long/2addr v6, v9

    shl-long v3, v6, v4

    or-long/2addr v1, v3

    add-int/lit8 v3, v0, 0x2

    .line 582
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    goto :goto_0

    .line 585
    :pswitch_6
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v6

    shl-long/2addr v1, v4

    add-int/lit8 v3, v0, 0x1

    .line 586
    invoke-virtual {v8, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    :goto_0
    int-to-long v3, v3

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    goto :goto_1

    .line 589
    :pswitch_7
    invoke-virtual {v8, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v1, v5

    :goto_1
    add-int/2addr v0, p1

    .line 595
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return-wide v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܺ()I
    .locals 1

    const/4 v0, 0x0

    .line 133
    invoke-direct {p0, v0}, Ll/ᩴۨ֡;->֫(Z)I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 433
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v0

    return v0
.end method

.method public final ܽ(I)I
    .locals 5

    .line 437
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 438
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 442
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_2

    const/4 v4, 0x3

    if-eq p1, v4, :cond_1

    const/4 v4, 0x4

    if-ne p1, v4, :cond_0

    .line 444
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    .line 445
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    .line 446
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x3

    .line 447
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    goto :goto_0

    .line 462
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    aput-object v1, v3, v2

    const/4 p1, 0x0

    const-string v1, "Invalid size %d for sized int at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v1, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    throw v0

    .line 450
    :cond_1
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    .line 451
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    .line 452
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    goto :goto_0

    .line 455
    :cond_2
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    .line 456
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    .line 459
    :cond_3
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    :goto_1
    add-int/2addr v0, p1

    .line 464
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v1
.end method

.method public final ܿ()I
    .locals 2

    .line 362
    iget-object v0, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩷(I)I

    move-result v0

    return v0
.end method

.method public final ܿ(I)I
    .locals 5

    .line 500
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 501
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 505
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_2

    const/4 v4, 0x3

    if-eq p1, v4, :cond_1

    const/4 v4, 0x4

    if-ne p1, v4, :cond_0

    .line 507
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    .line 508
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    .line 509
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x3

    .line 510
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    goto :goto_0

    .line 525
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    .line 526
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    aput-object v1, v3, v2

    const/4 p1, 0x0

    const-string v1, "Invalid size %d for sized, right extended int at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v1, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    throw v0

    .line 513
    :cond_1
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/lit8 v3, v0, 0x1

    .line 514
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    .line 515
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    goto :goto_0

    .line 518
    :cond_2
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    add-int/lit8 v3, v0, 0x1

    .line 519
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    :goto_0
    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    goto :goto_1

    .line 522
    :cond_3
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    :goto_1
    add-int/2addr v0, p1

    .line 528
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v1
.end method

.method public final ᩳ()I
    .locals 2

    .line 429
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->᩻(I)I

    move-result v0

    return v0
.end method

.method public final ᩳ(I)J
    .locals 14

    .line 600
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 601
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    const/16 v1, 0x30

    const/16 v2, 0x28

    const/16 v3, 0x20

    const/16 v4, 0x18

    const-wide/16 v5, 0xff

    .line 605
    iget-object v7, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    packed-switch p1, :pswitch_data_0

    .line 659
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    const/4 p1, 0x0

    const-string v1, "Invalid size %d for sized long at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    throw v0

    .line 607
    :pswitch_0
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    add-int/lit8 v9, v0, 0x1

    .line 608
    invoke-virtual {v7, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v8, v9

    add-int/lit8 v9, v0, 0x2

    .line 609
    invoke-virtual {v7, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    or-int/2addr v8, v9

    int-to-long v8, v8

    add-int/lit8 v10, v0, 0x3

    .line 610
    invoke-virtual {v7, v10}, Ll/ۘۨ֡;->֫(I)B

    move-result v10

    int-to-long v10, v10

    and-long/2addr v10, v5

    shl-long/2addr v10, v4

    or-long/2addr v8, v10

    add-int/lit8 v4, v0, 0x4

    .line 611
    invoke-virtual {v7, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    int-to-long v10, v4

    and-long/2addr v10, v5

    shl-long v3, v10, v3

    or-long/2addr v3, v8

    add-int/lit8 v8, v0, 0x5

    .line 612
    invoke-virtual {v7, v8}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v0, 0x6

    .line 613
    invoke-virtual {v7, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    int-to-long v8, v4

    and-long v4, v8, v5

    shl-long/2addr v4, v1

    or-long v1, v4, v2

    add-int/lit8 v3, v0, 0x7

    .line 614
    invoke-virtual {v7, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x38

    shl-long/2addr v3, v5

    goto/16 :goto_1

    .line 617
    :pswitch_1
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    add-int/lit8 v9, v0, 0x1

    .line 618
    invoke-virtual {v7, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v8, v9

    add-int/lit8 v9, v0, 0x2

    .line 619
    invoke-virtual {v7, v9}, Ll/ۘۨ֡;->֫(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    or-int/2addr v8, v9

    int-to-long v8, v8

    add-int/lit8 v10, v0, 0x3

    .line 620
    invoke-virtual {v7, v10}, Ll/ۘۨ֡;->֫(I)B

    move-result v10

    int-to-long v10, v10

    and-long/2addr v10, v5

    shl-long/2addr v10, v4

    or-long/2addr v8, v10

    add-int/lit8 v4, v0, 0x4

    .line 621
    invoke-virtual {v7, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    int-to-long v10, v4

    and-long/2addr v10, v5

    shl-long v3, v10, v3

    or-long/2addr v3, v8

    add-int/lit8 v8, v0, 0x5

    .line 622
    invoke-virtual {v7, v8}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    int-to-long v8, v8

    and-long/2addr v5, v8

    shl-long/2addr v5, v2

    or-long v2, v3, v5

    add-int/lit8 v4, v0, 0x6

    .line 623
    invoke-virtual {v7, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v4, v1

    goto :goto_0

    .line 626
    :pswitch_2
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v8, v0, 0x1

    .line 627
    invoke-virtual {v7, v8}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v1, v8

    add-int/lit8 v8, v0, 0x2

    .line 628
    invoke-virtual {v7, v8}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x10

    or-int/2addr v1, v8

    int-to-long v8, v1

    add-int/lit8 v1, v0, 0x3

    .line 629
    invoke-virtual {v7, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v10, v1

    and-long/2addr v10, v5

    shl-long/2addr v10, v4

    or-long/2addr v8, v10

    add-int/lit8 v1, v0, 0x4

    .line 630
    invoke-virtual {v7, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v10, v1

    and-long v4, v10, v5

    shl-long v3, v4, v3

    or-long/2addr v3, v8

    add-int/lit8 v1, v0, 0x5

    .line 631
    invoke-virtual {v7, v1}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    int-to-long v5, v1

    shl-long v1, v5, v2

    move-wide v12, v1

    move-wide v2, v3

    move-wide v4, v12

    :goto_0
    or-long v1, v4, v2

    goto/16 :goto_4

    .line 634
    :pswitch_3
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 635
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v0, 0x2

    .line 636
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    int-to-long v1, v1

    add-int/lit8 v8, v0, 0x3

    .line 637
    invoke-virtual {v7, v8}, Ll/ۘۨ֡;->֫(I)B

    move-result v8

    int-to-long v8, v8

    and-long/2addr v5, v8

    shl-long v4, v5, v4

    or-long/2addr v1, v4

    add-int/lit8 v4, v0, 0x4

    .line 638
    invoke-virtual {v7, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    int-to-long v4, v4

    shl-long v3, v4, v3

    goto :goto_1

    .line 641
    :pswitch_4
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 642
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v0, 0x2

    .line 643
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    int-to-long v1, v1

    add-int/lit8 v3, v0, 0x3

    .line 644
    invoke-virtual {v7, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    int-to-long v5, v3

    shl-long v3, v5, v4

    :goto_1
    or-long/2addr v1, v3

    goto :goto_4

    .line 647
    :pswitch_5
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 648
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v0, 0x2

    .line 649
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    goto :goto_2

    .line 652
    :pswitch_6
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 653
    invoke-virtual {v7, v2}, Ll/ۘۨ֡;->֫(I)B

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    .line 656
    :pswitch_7
    invoke-virtual {v7, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    :goto_3
    int-to-long v1, v1

    :goto_4
    add-int/2addr v0, p1

    .line 662
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return-wide v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x0

    .line 696
    iput-boolean v0, p0, Ll/ᩴۨ֡;->ܽ:Z

    return-void
.end method

.method public final ᩵()V
    .locals 1

    .line 401
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method public final ᩷()I
    .locals 2

    .line 394
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 395
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    add-int/lit8 v0, v0, 0x1

    .line 396
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v1
.end method

.method public final ᩷(I)V
    .locals 0

    .line 60
    iput p1, p0, Ll/ᩴۨ֡;->ۧ:I

    return-void
.end method

.method public final ᩻()I
    .locals 2

    .line 413
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    add-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0
.end method

.method public final ᩻(I)I
    .locals 7

    .line 469
    invoke-virtual {p0}, Ll/ᩴۨ֡;->֫()V

    .line 470
    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 474
    iget-object v1, p0, Ll/ᩴۨ֡;->֫:Ll/ۘۨ֡;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_4

    const/4 v4, 0x2

    if-eq p1, v4, :cond_3

    const/4 v5, 0x3

    if-eq p1, v5, :cond_2

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-ne p1, v5, :cond_1

    add-int/lit8 v4, v0, 0x3

    .line 476
    invoke-virtual {v1, v4}, Ll/ۘۨ֡;->֫(I)B

    move-result v4

    if-ltz v4, :cond_0

    shl-int/lit8 v2, v4, 0x18

    goto :goto_0

    .line 478
    :cond_0
    new-instance p1, Ll/ܶ᩵ۚ;

    iget v0, p0, Ll/ᩴۨ֡;->ۧ:I

    .line 479
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "Encountered valid sized uint that is out of range at offset 0x%x"

    .line 46
    invoke-direct {p1, v6, v0, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    throw p1

    .line 493
    :cond_1
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Ll/ᩴۨ֡;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v2

    aput-object v1, v4, v3

    const-string p1, "Invalid size %d for sized uint at offset 0x%x"

    .line 46
    invoke-direct {v0, v6, p1, v4}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    throw v0

    :cond_2
    :goto_0
    add-int/lit8 v3, v0, 0x2

    .line 484
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    :cond_3
    add-int/lit8 v3, v0, 0x1

    .line 487
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->֫(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    .line 490
    :cond_4
    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v1, v2

    add-int/2addr v0, p1

    .line 495
    iput v0, p0, Ll/ᩴۨ֡;->ۧ:I

    return v1
.end method
