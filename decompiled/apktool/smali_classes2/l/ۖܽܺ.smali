.class public final Ll/ۖܽܺ;
.super Ljava/lang/Object;
.source "8BBR"

# interfaces
.implements Ll/᩶ܽܺ;


# instance fields
.field public final ֫:[I

.field public final ۧ:[Ll/۠ܽܺ;

.field public final ܳ:[Ll/᩷ᩴܺ;

.field public final ܽ:[I

.field public ܿ:I

.field public final ᩳ:Ll/ۗܽܺ;

.field public final ᩻:[I


# direct methods
.method public constructor <init>(Ll/ۗܽܺ;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Ll/ۖܽܺ;->ᩳ:Ll/ۗܽܺ;

    .line 112
    invoke-virtual {p1}, Ll/ۗܽܺ;->ܿ()Ll/ۙܽܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙܽܺ;->ۧ()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 114
    invoke-static {p1}, Ll/ܰۘܺ;->֫(I)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۖܽܺ;->᩻:[I

    .line 115
    invoke-static {p1}, Ll/ܰۘܺ;->֫(I)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۖܽܺ;->ܽ:[I

    .line 116
    invoke-static {p1}, Ll/ܰۘܺ;->֫(I)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۖܽܺ;->֫:[I

    .line 117
    new-array v0, p1, [Ll/᩷ᩴܺ;

    iput-object v0, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    .line 118
    new-array p1, p1, [Ll/۠ܽܺ;

    iput-object p1, p0, Ll/ۖܽܺ;->ۧ:[Ll/۠ܽܺ;

    const/4 p1, -0x1

    .line 119
    iput p1, p0, Ll/ۖܽܺ;->ܿ:I

    return-void
.end method

.method public static ֫(Ll/ۗܽܺ;)Ll/ۚܽܺ;
    .locals 15

    .line 87
    new-instance v0, Ll/ۖܽܺ;

    invoke-direct {v0, p0}, Ll/ۖܽܺ;-><init>(Ll/ۗܽܺ;)V

    .line 358
    invoke-virtual {p0}, Ll/ۗܽܺ;->ܿ()Ll/ۙܽܺ;

    move-result-object v1

    .line 359
    invoke-virtual {p0}, Ll/ۗܽܺ;->ᩳ()Ll/۠ܽܺ;

    move-result-object p0

    .line 360
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x0

    .line 366
    iget-object v4, v0, Ll/ۖܽܺ;->᩻:[I

    invoke-static {v3, v4}, Ll/ܰۘܺ;->ᩳ(I[I)V

    .line 367
    iget-object v5, v0, Ll/ۖܽܺ;->֫:[I

    invoke-static {v3, v5}, Ll/ܰۘܺ;->ᩳ(I[I)V

    .line 114
    :cond_0
    array-length v6, v4

    const/4 v7, 0x0

    .line 116
    :goto_0
    iget-object v8, v0, Ll/ۖܽܺ;->ܽ:[I

    if-ge v7, v6, :cond_4

    .line 117
    aget v9, v4, v7

    if-eqz v9, :cond_3

    .line 376
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    :goto_1
    invoke-static {v3, v4}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v6, :cond_2

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_0

    .line 385
    invoke-virtual {p0, v6}, Ll/ܿᩴܺ;->get(I)Ll/֨ܽܺ;

    move-result-object v7

    .line 386
    invoke-virtual {v7}, Ll/֨ܽܺ;->ᩳ()I

    move-result v9

    .line 387
    invoke-virtual {v7}, Ll/֨ܽܺ;->֫()I

    move-result v10

    .line 153
    invoke-static {v9, v8}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v11

    if-ltz v11, :cond_1

    if-ge v11, v10, :cond_1

    .line 389
    invoke-static {v9, v5}, Ll/ܰۘܺ;->ᩳ(I[I)V

    .line 390
    invoke-static {v10, v5}, Ll/ܰۘܺ;->ᩳ(I[I)V

    .line 391
    invoke-virtual {v7}, Ll/֨ܽܺ;->ܽ()I

    move-result v7

    const/4 v9, 0x1

    invoke-direct {v0, v7, v9}, Ll/ۖܽܺ;->֫(IZ)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 166
    :cond_2
    :try_start_1
    invoke-static {v6, v4}, Ll/ܰۘܺ;->֫(I[I)V

    .line 167
    invoke-virtual {v1, v6, v0}, Ll/ۙܽܺ;->֫(ILl/᩶ܽܺ;)I

    .line 474
    iput v6, v0, Ll/ۖܽܺ;->ܿ:I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 379
    new-instance v0, Ll/ۖᩳܺ;

    const-string v1, "flow of control falls off end of method"

    .line 35
    invoke-direct {v0, v1, p0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 379
    throw v0

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 302
    :cond_4
    iget-object p0, v0, Ll/ۖܽܺ;->ᩳ:Ll/ۗܽܺ;

    invoke-virtual {p0}, Ll/ۗܽܺ;->ܿ()Ll/ۙܽܺ;

    move-result-object p0

    .line 303
    invoke-virtual {p0}, Ll/ۙܽܺ;->ۧ()I

    move-result p0

    new-array p0, p0, [Ll/֡ܽܺ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    :goto_3
    add-int/lit8 v2, v11, 0x1

    .line 307
    invoke-static {v2, v5}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v2

    if-gez v2, :cond_6

    .line 346
    new-instance v0, Ll/ۚܽܺ;

    .line 33
    invoke-direct {v0, v1}, Ll/ܺᩴܺ;-><init>(I)V

    :goto_4
    if-ge v3, v1, :cond_5

    .line 348
    aget-object v2, p0, v3

    invoke-virtual {v0, v3, v2}, Ll/ܺᩴܺ;->֫(ILl/֡ܽܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_5
    return-object v0

    .line 312
    :cond_6
    invoke-static {v11, v8}, Ll/ܰۘܺ;->ܽ(I[I)Z

    move-result v4

    if-eqz v4, :cond_b

    add-int/lit8 v4, v2, -0x1

    const/4 v6, 0x0

    :goto_5
    if-lt v4, v11, :cond_8

    .line 323
    iget-object v6, v0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    aget-object v6, v6, v4

    if-eqz v6, :cond_7

    goto :goto_6

    :cond_7
    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    :cond_8
    const/4 v4, -0x1

    :goto_6
    if-nez v6, :cond_9

    .line 331
    invoke-static {v2}, Ll/᩷ᩴܺ;->ܿ(I)Ll/᩷ᩴܺ;

    move-result-object v4

    .line 332
    sget-object v6, Ll/۠ܽܺ;->᩶:Ll/۠ܽܺ;

    move-object v13, v4

    move-object v14, v6

    goto :goto_7

    .line 334
    :cond_9
    iget-object v7, v0, Ll/ۖܽܺ;->ۧ:[Ll/۠ܽܺ;

    aget-object v4, v7, v4

    if-nez v4, :cond_a

    .line 336
    sget-object v4, Ll/۠ܽܺ;->᩶:Ll/۠ܽܺ;

    :cond_a
    move-object v14, v4

    move-object v13, v6

    .line 340
    :goto_7
    new-instance v4, Ll/֡ܽܺ;

    move-object v9, v4

    move v10, v11

    move v12, v2

    invoke-direct/range {v9 .. v14}, Ll/֡ܽܺ;-><init>(IIILl/᩷ᩴܺ;Ll/۠ܽܺ;)V

    aput-object v4, p0, v1

    add-int/lit8 v1, v1, 0x1

    :cond_b
    move v11, v2

    goto :goto_3
.end method

.method private ֫(IIZ)V
    .locals 1

    .line 425
    iget-object v0, p0, Ll/ۖܽܺ;->ܽ:[I

    invoke-static {p1, v0}, Ll/ܰۘܺ;->ᩳ(I[I)V

    if-eqz p3, :cond_0

    add-int/2addr p1, p2

    const/4 p2, 0x0

    .line 433
    invoke-direct {p0, p1, p2}, Ll/ۖܽܺ;->֫(IZ)V

    return-void

    .line 442
    :cond_0
    iget-object p3, p0, Ll/ۖܽܺ;->֫:[I

    add-int/2addr p1, p2

    invoke-static {p1, p3}, Ll/ܰۘܺ;->ᩳ(I[I)V

    return-void
.end method

.method private ֫(IZ)V
    .locals 1

    .line 406
    iget-object v0, p0, Ll/ۖܽܺ;->ܽ:[I

    invoke-static {p1, v0}, Ll/ܰۘܺ;->ܽ(I[I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 407
    iget-object v0, p0, Ll/ۖܽܺ;->᩻:[I

    invoke-static {p1, v0}, Ll/ܰۘܺ;->ᩳ(I[I)V

    :cond_0
    if-eqz p2, :cond_1

    .line 411
    iget-object p2, p0, Ll/ۖܽܺ;->֫:[I

    invoke-static {p1, p2}, Ll/ܰۘܺ;->ᩳ(I[I)V

    :cond_1
    return-void
.end method

.method private ۧ(IIZ)V
    .locals 2

    add-int/2addr p2, p1

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    .line 461
    invoke-direct {p0, p2, v0}, Ll/ۖܽܺ;->֫(IZ)V

    .line 464
    :cond_0
    iget-object v0, p0, Ll/ۖܽܺ;->ᩳ:Ll/ۗܽܺ;

    invoke-virtual {v0}, Ll/ۗܽܺ;->ᩳ()Ll/۠ܽܺ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۠ܽܺ;->ᩳ(I)Ll/۠ܽܺ;

    move-result-object v0

    .line 465
    iget-object v1, p0, Ll/ۖܽܺ;->ۧ:[Ll/۠ܽܺ;

    aput-object v0, v1, p1

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, -0x1

    .line 466
    :goto_0
    invoke-virtual {v0, p2}, Ll/۠ܽܺ;->ܿ(I)Ll/᩷ᩴܺ;

    move-result-object p2

    iget-object p3, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    aput-object p2, p3, p1

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 482
    iget v0, p0, Ll/ۖܽܺ;->ܿ:I

    return v0
.end method

.method public final ֫(II)V
    .locals 0

    const/4 p1, 0x1

    .line 134
    invoke-direct {p0, p2, p1, p1}, Ll/ۖܽܺ;->֫(IIZ)V

    return-void
.end method

.method public final ֫(IIII)V
    .locals 3

    const/16 v0, 0xa7

    .line 241
    iget-object v1, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    const/4 v2, 0x1

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa8

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 254
    :cond_0
    invoke-direct {p0, p2, v2}, Ll/ۖܽܺ;->֫(IZ)V

    :goto_0
    add-int p1, p2, p3

    .line 259
    invoke-direct {p0, p2, p3, v2}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 260
    invoke-direct {p0, p1, v2}, Ll/ۖܽܺ;->֫(IZ)V

    .line 70
    new-instance p3, Ll/᩷ᩴܺ;

    const/4 v0, 0x2

    invoke-direct {p3, v0}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 72
    invoke-virtual {p3, p1}, Ll/᩷ᩴܺ;->add(I)V

    .line 73
    invoke-virtual {p3, p4}, Ll/᩷ᩴܺ;->add(I)V

    .line 74
    invoke-virtual {p3}, Ll/ᩴᩴܺ;->ܺ()V

    .line 261
    aput-object p3, v1, p2

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 243
    invoke-direct {p0, p2, p3, p1}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 244
    invoke-static {p4}, Ll/᩷ᩴܺ;->ܿ(I)Ll/᩷ᩴܺ;

    move-result-object p1

    aput-object p1, v1, p2

    .line 266
    :goto_1
    invoke-direct {p0, p4, v2}, Ll/ۖܽܺ;->֫(IZ)V

    return-void
.end method

.method public final ֫(IIIILl/۟ܺܺ;I)V
    .locals 0

    const/16 p4, 0xa9

    if-ne p1, p4, :cond_0

    const/4 p1, 0x0

    .line 207
    invoke-direct {p0, p2, p3, p1}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 208
    iget-object p1, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    sget-object p3, Ll/᩷ᩴܺ;->ۗ:Ll/᩷ᩴܺ;

    aput-object p3, p1, p2

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 210
    invoke-direct {p0, p2, p3, p1}, Ll/ۖܽܺ;->֫(IIZ)V

    return-void
.end method

.method public final ֫(IIILl/ܰۡܺ;I)V
    .locals 0

    const/4 p1, 0x1

    .line 220
    invoke-direct {p0, p2, p3, p1}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 222
    instance-of p5, p4, Ll/ܶܺܺ;

    if-nez p5, :cond_1

    instance-of p5, p4, Ll/۫ܺܺ;

    if-nez p5, :cond_1

    instance-of p5, p4, Ll/۬ܺܺ;

    if-nez p5, :cond_1

    instance-of p5, p4, Ll/ᩴܺܺ;

    if-nez p5, :cond_1

    instance-of p5, p4, Ll/᩸ܺܺ;

    if-nez p5, :cond_1

    instance-of p4, p4, Ll/ۙܺܺ;

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 231
    :cond_1
    :goto_0
    invoke-direct {p0, p2, p3, p1}, Ll/ۖܽܺ;->ۧ(IIZ)V

    return-void
.end method

.method public final ֫(IILl/۟ܺܺ;)V
    .locals 2

    const/16 v0, 0x6c

    const/4 v1, 0x1

    if-eq p1, v0, :cond_3

    const/16 v0, 0x70

    if-eq p1, v0, :cond_3

    const/16 p3, 0xac

    const/4 v0, 0x0

    if-eq p1, p3, :cond_2

    const/16 p3, 0xb1

    if-eq p1, p3, :cond_2

    const/16 p3, 0xbe

    if-eq p1, p3, :cond_1

    const/16 p3, 0xbf

    if-eq p1, p3, :cond_0

    const/16 p3, 0xc2

    if-eq p1, p3, :cond_1

    const/16 p3, 0xc3

    if-eq p1, p3, :cond_1

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    .line 194
    invoke-direct {p0, p2, v1, v1}, Ll/ۖܽܺ;->֫(IIZ)V

    return-void

    .line 150
    :cond_0
    invoke-direct {p0, p2, v1, v0}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 151
    invoke-direct {p0, p2, v1, v0}, Ll/ۖܽܺ;->ۧ(IIZ)V

    return-void

    .line 177
    :cond_1
    :pswitch_0
    invoke-direct {p0, p2, v1, v1}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 178
    invoke-direct {p0, p2, v1, v1}, Ll/ۖܽܺ;->ۧ(IIZ)V

    return-void

    .line 145
    :cond_2
    invoke-direct {p0, p2, v1, v0}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 146
    iget-object p1, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    sget-object p3, Ll/᩷ᩴܺ;->ۗ:Ll/᩷ᩴܺ;

    aput-object p3, p1, p2

    return-void

    .line 187
    :cond_3
    invoke-direct {p0, p2, v1, v1}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 188
    sget-object p1, Ll/۟ܺܺ;->ܺ֫:Ll/۟ܺܺ;

    if-eq p3, p1, :cond_5

    sget-object p1, Ll/۟ܺܺ;->᩵֫:Ll/۟ܺܺ;

    if-ne p3, p1, :cond_4

    goto :goto_0

    :cond_4
    return-void

    .line 189
    :cond_5
    :goto_0
    invoke-direct {p0, p2, v1, v1}, Ll/ۖܽܺ;->ۧ(IIZ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(IILl/۫ܺܺ;Ljava/util/ArrayList;)V
    .locals 0

    const/4 p3, 0x1

    .line 292
    invoke-direct {p0, p1, p2, p3}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 293
    invoke-direct {p0, p1, p2, p3}, Ll/ۖܽܺ;->ۧ(IIZ)V

    return-void
.end method

.method public final ֫(IILl/᩵ᩳܺ;I)V
    .locals 2

    const/4 p4, 0x0

    .line 275
    invoke-direct {p0, p1, p2, p4}, Ll/ۖܽܺ;->֫(IIZ)V

    .line 276
    invoke-virtual {p3}, Ll/᩵ᩳܺ;->ۚ()I

    move-result p2

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Ll/ۖܽܺ;->֫(IZ)V

    .line 278
    invoke-virtual {p3}, Ll/᩵ᩳܺ;->size()I

    move-result p2

    :goto_0
    if-ge p4, p2, :cond_0

    .line 280
    invoke-virtual {p3, p4}, Ll/᩵ᩳܺ;->֫(I)I

    move-result v1

    invoke-direct {p0, v1, v0}, Ll/ۖܽܺ;->֫(IZ)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 283
    :cond_0
    iget-object p2, p0, Ll/ۖܽܺ;->ܳ:[Ll/᩷ᩴܺ;

    invoke-virtual {p3}, Ll/᩵ᩳܺ;->֨()Ll/᩷ᩴܺ;

    move-result-object p3

    aput-object p3, p2, p1

    return-void
.end method
