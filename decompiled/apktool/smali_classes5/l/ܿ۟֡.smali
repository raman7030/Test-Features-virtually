.class public final Ll/ܿ۟֡;
.super Ll/᩹۟֡;
.source "J55P"


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final synthetic ۫:[Ll/᩹֫ۚ;

.field public final synthetic ۬:Ll/᩻۟֡;


# direct methods
.method public constructor <init>(Ll/᩻۟֡;Ll/۬ۛ֡;II[Ll/᩹֫ۚ;)V
    .locals 0

    .line 225
    iput-object p1, p0, Ll/ܿ۟֡;->۬:Ll/᩻۟֡;

    iput-object p5, p0, Ll/ܿ۟֡;->۫:[Ll/᩹֫ۚ;

    invoke-direct {p0, p2, p3}, Ll/᩹۟֡;-><init>(Ll/۬ۛ֡;I)V

    const/4 p1, 0x0

    .line 226
    iput p1, p0, Ll/ܿ۟֡;->ۙ:I

    .line 227
    iput p4, p0, Ll/ܿ۟֡;->ۗ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۨ֡;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    .line 232
    iget-object v1, v0, Ll/ܿ۟֡;->۬:Ll/᩻۟֡;

    iget-object v1, v1, Ll/᩻۟֡;->᩹:Ll/۬ۛ֡;

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۖ()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 233
    iget-object v5, v0, Ll/ܿ۟֡;->۫:[Ll/᩹֫ۚ;

    const/4 v6, 0x1

    packed-switch v2, :pswitch_data_0

    add-int/lit8 v2, v2, -0xa

    .line 325
    iget v1, v0, Ll/ܿ۟֡;->ۙ:I

    div-int/lit8 v3, v2, 0xf

    add-int/2addr v3, v1

    iput v3, v0, Ll/ܿ۟֡;->ۙ:I

    .line 326
    iget v1, v0, Ll/ܿ۟֡;->ۗ:I

    rem-int/lit8 v2, v2, 0xf

    add-int/lit8 v2, v2, -0x4

    add-int/2addr v2, v1

    iput v2, v0, Ll/ܿ۟֡;->ۗ:I

    .line 327
    invoke-static {v3, v2}, Ll/ۚ۟֡;->֫(II)Ll/ۚ۟֡;

    move-result-object v1

    return-object v1

    .line 320
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    sub-int/2addr v2, v6

    invoke-virtual {v1, v2}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v1

    .line 321
    new-instance v2, Ll/᩵ᩳۚ;

    iget v3, v0, Ll/ܿ۟֡;->ۙ:I

    invoke-direct {v2, v3, v1}, Ll/᩵ᩳۚ;-><init>(ILjava/lang/String;)V

    return-object v2

    .line 317
    :pswitch_1
    new-instance v1, Ll/ܺᩳۚ;

    iget v2, v0, Ll/ܿ۟֡;->ۙ:I

    .line 41
    invoke-direct {v1, v2}, Ll/ۢᩳۚ;-><init>(I)V

    return-object v1

    .line 314
    :pswitch_2
    new-instance v1, Ll/ۖᩳۚ;

    iget v2, v0, Ll/ܿ۟֡;->ۙ:I

    .line 41
    invoke-direct {v1, v2}, Ll/ۢᩳۚ;-><init>(I)V

    return-object v1

    .line 298
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v1

    if-ltz v1, :cond_0

    .line 300
    array-length v2, v5

    if-ge v1, v2, :cond_0

    .line 301
    aget-object v2, v5, v1

    goto :goto_1

    .line 303
    :cond_0
    invoke-static {}, Ll/᩻۟֡;->ܽ()Ll/᩹֫ۚ;

    move-result-object v2

    .line 305
    :goto_1
    new-instance v3, Ll/ۘᩳۚ;

    iget v8, v0, Ll/ܿ۟֡;->ۙ:I

    .line 306
    invoke-interface {v2}, Ll/᩹֫ۚ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 307
    invoke-interface {v2}, Ll/᩹֫ۚ;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2}, Ll/᩹֫ۚ;->getSignature()Ljava/lang/String;

    move-result-object v10

    move-object v6, v3

    move v11, v1

    invoke-direct/range {v6 .. v11}, Ll/ۘᩳۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    if-ltz v1, :cond_1

    .line 308
    array-length v2, v5

    if-ge v1, v2, :cond_1

    .line 309
    aput-object v3, v5, v1

    :cond_1
    return-object v3

    .line 271
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_2

    .line 275
    array-length v3, v5

    if-ge v1, v3, :cond_2

    .line 276
    aget-object v3, v5, v1

    goto :goto_2

    .line 278
    :cond_2
    invoke-static {}, Ll/᩻۟֡;->ܽ()Ll/᩹֫ۚ;

    move-result-object v3

    const/4 v6, 0x0

    .line 282
    :goto_2
    instance-of v4, v3, Ll/ܶ֫ۚ;

    if-eqz v4, :cond_3

    .line 283
    invoke-static {}, Ll/᩻۟֡;->ܽ()Ll/᩹֫ۚ;

    move-result-object v3

    goto :goto_3

    :cond_3
    move v2, v6

    .line 289
    :goto_3
    new-instance v4, Ll/ۡᩳۚ;

    iget v8, v0, Ll/ܿ۟֡;->ۙ:I

    .line 290
    invoke-interface {v3}, Ll/᩹֫ۚ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 291
    invoke-interface {v3}, Ll/᩹֫ۚ;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3}, Ll/᩹֫ۚ;->getSignature()Ljava/lang/String;

    move-result-object v10

    move-object v6, v4

    move v11, v1

    invoke-direct/range {v6 .. v11}, Ll/ۡᩳۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    if-eqz v2, :cond_4

    .line 293
    aput-object v4, v5, v1

    :cond_4
    return-object v4

    .line 259
    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 260
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v7

    sub-int/2addr v7, v6

    invoke-virtual {v1, v7}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v12

    .line 261
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v7

    sub-int/2addr v7, v6

    if-ne v7, v3, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    .line 586
    :cond_5
    invoke-virtual {v1, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    move-object v14, v4

    .line 262
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v1, v3}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v15

    .line 263
    new-instance v1, Ll/۠ᩳۚ;

    iget v13, v0, Ll/ܿ۟֡;->ۙ:I

    move-object v11, v1

    move/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Ll/۠ᩳۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    if-ltz v2, :cond_6

    .line 265
    array-length v3, v5

    if-ge v2, v3, :cond_6

    .line 266
    aput-object v1, v5, v2

    :cond_6
    return-object v1

    .line 248
    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 249
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v7

    sub-int/2addr v7, v6

    invoke-virtual {v1, v7}, Ll/۬ۛ֡;->᩻(I)Ljava/lang/String;

    move-result-object v7

    .line 250
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v8

    sub-int/2addr v8, v6

    if-ne v8, v3, :cond_7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    .line 586
    :cond_7
    invoke-virtual {v1, v8}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v4

    :goto_5
    move-object v9, v4

    .line 251
    new-instance v1, Ll/۠ᩳۚ;

    iget v8, v0, Ll/ܿ۟֡;->ۙ:I

    const/4 v10, 0x0

    move-object v6, v1

    move v11, v2

    invoke-direct/range {v6 .. v11}, Ll/۠ᩳۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    if-ltz v2, :cond_8

    .line 253
    array-length v3, v5

    if-ge v2, v3, :cond_8

    .line 254
    aput-object v1, v5, v2

    :cond_8
    return-object v1

    .line 243
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۡ()I

    move-result v2

    .line 244
    iget v3, v0, Ll/ܿ۟֡;->ۗ:I

    add-int/2addr v3, v2

    iput v3, v0, Ll/ܿ۟֡;->ۗ:I

    goto/16 :goto_0

    .line 238
    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 239
    iget v3, v0, Ll/ܿ۟֡;->ۙ:I

    add-int/2addr v3, v2

    iput v3, v0, Ll/ܿ۟֡;->ۙ:I

    goto/16 :goto_0

    .line 235
    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
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
