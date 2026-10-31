.class public final Ll/ۗ᩵᩵;
.super Ll/۫ᩴ᩵;
.source "I9X8"

# interfaces
.implements Ll/᩷ۖ᩵;


# static fields
.field public static final ۫֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:I

.field public ֨֫:I

.field public ۗ֫:[B

.field public ۙ֫:I

.field public ۚ֫:I

.field public ۠֫:I

.field public ۬֫:J

.field public ܶ֫:[Ll/᩹᩵᩵;

.field public ᩴ֫:I

.field public ᩵֫:I

.field public ᩶֫:Ll/᩸ۡ᩵;

.field public ᩸֫:[B

.field public ᩹֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    const-class v0, Ll/ۗ᩵᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۗ᩵᩵;->۫֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    const/16 p1, 0x10

    new-array p1, p1, [B

    .line 51
    iput-object p1, p0, Ll/ۗ᩵᩵;->ۗ֫:[B

    const/4 p1, -0x1

    .line 65
    iput p1, p0, Ll/ۗ᩵᩵;->ۙ֫:I

    return-void
.end method


# virtual methods
.method public final getSendBufferSize()I
    .locals 1

    .line 430
    iget v0, p0, Ll/ۗ᩵᩵;->۠֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 592
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Smb2NegotiateResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    invoke-super {p0}, Ll/ۗᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",dialectRevision="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۗ᩵᩵;->֡֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",securityMode=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۗ᩵᩵;->᩹֫:I

    const/4 v3, 0x1

    const-string v4, ",capabilities=0x"

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 594
    iget v2, p0, Ll/ۗ᩵᩵;->ᩴ֫:I

    const/16 v3, 0x8

    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",serverTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ll/ۗ᩵᩵;->۬֫:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֡֫()I
    .locals 1

    .line 140
    iget v0, p0, Ll/ۗ᩵᩵;->᩵֫:I

    return v0
.end method

.method public final ֨֫()[B
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۗ᩵᩵;->᩸֫:[B

    return-object v0
.end method

.method public final ֫(Ll/ܰ֨᩵;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩴۡ᩵;)Z
    .locals 1

    .line 232
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ll/ۜۖ᩵;)Z
    .locals 17

    move-object/from16 v0, p0

    .line 238
    invoke-virtual/range {p0 .. p0}, Ll/۫ᩴ᩵;->۟()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_25

    invoke-virtual/range {p0 .. p0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_d

    .line 242
    :cond_0
    invoke-interface/range {p2 .. p2}, Ll/ۜۖ᩵;->۠()Z

    move-result v1

    sget-object v3, Ll/ۗ᩵᩵;->۫֫:Ll/֫᩻֨;

    if-eqz v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩵᩵;->ۚ()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Signing is enforced but server does not allow it"

    .line 243
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v2

    .line 91
    :cond_1
    iget v1, v0, Ll/ۗ᩵᩵;->֡֫:I

    const/16 v4, 0x2ff

    if-ne v1, v4, :cond_2

    const-string v1, "Server returned ANY dialect"

    .line 248
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v2

    .line 252
    :cond_2
    move-object/from16 v1, p2

    check-cast v1, Ll/ۙ᩵᩵;

    .line 255
    invoke-static {}, Ll/᩸ۡ᩵;->values()[Ll/᩸ۡ᩵;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    aget-object v8, v4, v6

    .line 256
    invoke-virtual {v8}, Ll/᩸ۡ᩵;->ۧ()Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_1

    .line 259
    :cond_3
    invoke-virtual {v8}, Ll/᩸ۡ᩵;->֫()I

    move-result v9

    .line 91
    iget v10, v0, Ll/ۗ᩵᩵;->֡֫:I

    if-ne v9, v10, :cond_4

    move-object v7, v8

    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    if-nez v7, :cond_6

    const-string v1, "Server returned an unknown dialect"

    .line 265
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v2

    .line 269
    :cond_6
    invoke-virtual/range {p0 .. p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ۚ()Ll/᩸ۡ᩵;

    move-result-object v2

    invoke-virtual {v7, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-virtual/range {p0 .. p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v2

    invoke-virtual {v7, v2}, Ll/᩸ۡ᩵;->ۧ(Ll/᩸ۡ᩵;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_c

    .line 278
    :cond_7
    iput-object v7, v0, Ll/ۗ᩵᩵;->᩶֫:Ll/᩸ۡ᩵;

    .line 281
    invoke-virtual {v1}, Ll/ۙ᩵᩵;->ۘ֫()I

    move-result v2

    iget v4, v0, Ll/ۗ᩵᩵;->ᩴ֫:I

    and-int/2addr v2, v4

    iput v2, v0, Ll/ۗ᩵᩵;->᩵֫:I

    and-int/lit8 v2, v2, 0x40

    if-eqz v2, :cond_8

    .line 284
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    :cond_8
    iget-object v2, v0, Ll/ۗ᩵᩵;->᩶֫:Ll/᩸ۡ᩵;

    sget-object v4, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v2, v4}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_23

    .line 288
    iget v2, v0, Ll/ۗ᩵᩵;->᩵֫:I

    .line 305
    iget-object v5, v0, Ll/ۗ᩵᩵;->ܶ֫:[Ll/᩹᩵᩵;

    if-eqz v5, :cond_22

    array-length v6, v5

    if-nez v6, :cond_9

    goto/16 :goto_a

    .line 311
    :cond_9
    array-length v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_2
    if-ge v7, v6, :cond_1f

    aget-object v10, v5, v7

    if-nez v10, :cond_a

    goto/16 :goto_9

    :cond_a
    const/4 v11, 0x2

    if-nez v9, :cond_13

    .line 314
    invoke-interface {v10}, Ll/᩹᩵᩵;->֫()I

    move-result v12

    if-ne v12, v11, :cond_13

    .line 316
    check-cast v10, Ll/ܶ᩵᩵;

    .line 383
    invoke-virtual {v10}, Ll/ܶ᩵᩵;->ܽ()[I

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-virtual {v10}, Ll/ܶ᩵᩵;->ܽ()[I

    move-result-object v9

    array-length v9, v9

    if-eq v9, v4, :cond_b

    goto :goto_5

    .line 389
    :cond_b
    invoke-virtual {v1}, Ll/ۙ᩵᩵;->֡֫()[Ll/᩸᩵᩵;

    move-result-object v9

    array-length v11, v9

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_3
    if-ge v12, v11, :cond_d

    aget-object v14, v9, v12

    .line 390
    instance-of v15, v14, Ll/ܶ᩵᩵;

    if-eqz v15, :cond_c

    .line 391
    check-cast v14, Ll/ܶ᩵᩵;

    move-object v13, v14

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_d
    const/4 v9, 0x0

    if-nez v13, :cond_e

    goto/16 :goto_e

    .line 399
    :cond_e
    invoke-virtual {v13}, Ll/ܶ᩵᩵;->ܽ()[I

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_4
    if-ge v13, v12, :cond_10

    aget v15, v11, v13

    .line 400
    invoke-virtual {v10}, Ll/ܶ᩵᩵;->ܽ()[I

    move-result-object v16

    aget v4, v16, v9

    if-ne v15, v4, :cond_f

    const/4 v4, 0x1

    const/4 v14, 0x1

    :cond_f
    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x1

    goto :goto_4

    :cond_10
    if-nez v14, :cond_11

    const-string v1, "Server returned invalid cipher selection"

    .line 405
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v9

    .line 320
    :cond_11
    invoke-virtual {v10}, Ll/ܶ᩵᩵;->ܽ()[I

    move-result-object v4

    aget v4, v4, v9

    const/4 v4, 0x1

    const/4 v9, 0x1

    goto/16 :goto_9

    :cond_12
    :goto_5
    const/4 v1, 0x0

    const-string v2, "Server returned no cipher selection"

    .line 384
    invoke-interface {v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v1

    :cond_13
    const/4 v4, 0x0

    .line 322
    invoke-interface {v10}, Ll/᩹᩵᩵;->֫()I

    move-result v12

    if-ne v12, v11, :cond_14

    const-string v1, "Multiple encryption negotiate contexts"

    .line 323
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v4

    :cond_14
    if-nez v8, :cond_1d

    .line 325
    invoke-interface {v10}, Ll/᩹᩵᩵;->֫()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_1d

    .line 327
    check-cast v10, Ll/᩶᩵᩵;

    .line 353
    invoke-virtual {v10}, Ll/᩶᩵᩵;->ܽ()[I

    move-result-object v8

    if-eqz v8, :cond_1c

    invoke-virtual {v10}, Ll/᩶᩵᩵;->ܽ()[I

    move-result-object v8

    array-length v8, v8

    if-eq v8, v12, :cond_15

    goto :goto_8

    .line 359
    :cond_15
    invoke-virtual {v1}, Ll/ۙ᩵᩵;->֡֫()[Ll/᩸᩵᩵;

    move-result-object v8

    array-length v11, v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_6
    if-ge v12, v11, :cond_17

    aget-object v14, v8, v12

    .line 360
    instance-of v15, v14, Ll/᩶᩵᩵;

    if-eqz v15, :cond_16

    .line 361
    check-cast v14, Ll/᩶᩵᩵;

    move-object v13, v14

    :cond_16
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_17
    if-nez v13, :cond_18

    goto/16 :goto_d

    .line 369
    :cond_18
    invoke-virtual {v13}, Ll/᩶᩵᩵;->ܽ()[I

    move-result-object v8

    array-length v11, v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_7
    if-ge v12, v11, :cond_1a

    aget v14, v8, v12

    .line 370
    invoke-virtual {v10}, Ll/᩶᩵᩵;->ܽ()[I

    move-result-object v15

    aget v15, v15, v4

    if-ne v14, v15, :cond_19

    const/4 v13, 0x1

    :cond_19
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_1a
    if-nez v13, :cond_1b

    const-string v1, "Server returned invalid hash selection"

    .line 375
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v4

    .line 331
    :cond_1b
    invoke-virtual {v10}, Ll/᩶᩵᩵;->ܽ()[I

    move-result-object v8

    aget v4, v8, v4

    iput v4, v0, Ll/ۗ᩵᩵;->ۙ֫:I

    const/4 v4, 0x1

    const/4 v8, 0x1

    goto :goto_9

    :cond_1c
    :goto_8
    const-string v1, "Server returned no hash selection"

    .line 354
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v4

    .line 332
    :cond_1d
    invoke-interface {v10}, Ll/᩹᩵᩵;->֫()I

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_1e

    const-string v1, "Multiple preauth negotiate contexts"

    .line 333
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v4

    :cond_1e
    :goto_9
    add-int/lit8 v7, v7, 0x1

    const/4 v4, 0x1

    goto/16 :goto_2

    :cond_1f
    const/4 v1, 0x0

    if-nez v8, :cond_20

    const-string v2, "Missing preauth negotiate context"

    .line 339
    invoke-interface {v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v1

    :cond_20
    if-nez v9, :cond_21

    and-int/lit8 v2, v2, 0x40

    if-eqz v2, :cond_21

    const-string v2, "Missing encryption negotiate context"

    .line 343
    invoke-interface {v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v1

    :cond_21
    if-nez v9, :cond_23

    const-string v1, "No encryption support"

    .line 346
    invoke-interface {v3, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_b

    :cond_22
    :goto_a
    const/4 v1, 0x0

    const-string v2, "Response lacks negotiate contexts"

    .line 306
    invoke-interface {v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return v1

    .line 293
    :cond_23
    :goto_b
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ܽ֫()I

    move-result v1

    add-int/lit8 v2, v1, -0x50

    .line 294
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->ۛ()I

    move-result v3

    iget v4, v0, Ll/ۗ᩵᩵;->ۚ֫:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    and-int/lit8 v2, v2, -0x8

    iput v2, v0, Ll/ۗ᩵᩵;->ۚ֫:I

    add-int/lit8 v2, v1, -0x70

    .line 296
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->ܰ()I

    move-result v3

    iget v4, v0, Ll/ۗ᩵᩵;->۠֫:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    and-int/lit8 v2, v2, -0x8

    iput v2, v0, Ll/ۗ᩵᩵;->۠֫:I

    add-int/lit16 v1, v1, -0x200

    .line 298
    iget v2, v0, Ll/ۗ᩵᩵;->֨֫:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    and-int/lit8 v1, v1, -0x8

    iput v1, v0, Ll/ۗ᩵᩵;->֨֫:I

    const/4 v1, 0x1

    return v1

    :cond_24
    :goto_c
    const/4 v9, 0x0

    .line 274
    invoke-virtual/range {p0 .. p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ۚ()Ll/᩸ۡ᩵;

    move-result-object v1

    .line 275
    invoke-virtual/range {p0 .. p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v2

    .line 271
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Server selected an disallowed dialect version "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " (min: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " max: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 270
    invoke-interface {v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    goto :goto_e

    :cond_25
    :goto_d
    const/4 v9, 0x0

    :goto_e
    return v9
.end method

.method public final ۖ()Z
    .locals 1

    .line 452
    iget v0, p0, Ll/ۗ᩵᩵;->᩹֫:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 441
    iget v0, p0, Ll/ۗ᩵᩵;->᩹֫:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ֫()I
    .locals 1

    .line 91
    iget v0, p0, Ll/ۗ᩵᩵;->֡֫:I

    return v0
.end method

.method public final ۠֫()I
    .locals 1

    .line 191
    iget v0, p0, Ll/ۗ᩵᩵;->᩹֫:I

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 9

    .line 491
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x41

    if-ne v0, v1, :cond_7

    add-int/lit8 v0, p1, 0x2

    .line 496
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗ᩵᩵;->᩹֫:I

    add-int/lit8 v0, p1, 0x4

    .line 499
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗ᩵᩵;->֡֫:I

    add-int/lit8 v0, p1, 0x6

    .line 500
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    add-int/lit8 v1, p1, 0x8

    .line 503
    iget-object v2, p0, Ll/ۗ᩵᩵;->ۗ֫:[B

    const/16 v3, 0x10

    const/4 v4, 0x0

    invoke-static {p2, v1, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v1, p1, 0x18

    .line 506
    invoke-static {v1, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۗ᩵᩵;->ᩴ֫:I

    add-int/lit8 v1, p1, 0x1c

    .line 509
    invoke-static {v1, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۗ᩵᩵;->֨֫:I

    add-int/lit8 v1, p1, 0x20

    .line 511
    invoke-static {v1, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۗ᩵᩵;->ۚ֫:I

    add-int/lit8 v1, p1, 0x24

    .line 513
    invoke-static {v1, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۗ᩵᩵;->۠֫:I

    add-int/lit8 v1, p1, 0x28

    .line 516
    invoke-static {v1, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ᩵᩵;->۬֫:J

    add-int/lit8 v1, p1, 0x30

    .line 518
    invoke-static {v1, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v1, p1, 0x38

    .line 521
    invoke-static {v1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    add-int/lit8 v2, p1, 0x3a

    .line 522
    invoke-static {v2, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v2

    add-int/lit8 v3, p1, 0x3c

    .line 525
    invoke-static {v3, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v3

    add-int/lit8 v5, p1, 0x40

    .line 528
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v6

    add-int/2addr v1, v6

    add-int v7, v1, v2

    .line 529
    array-length v8, p2

    if-ge v7, v8, :cond_0

    .line 530
    new-array v7, v2, [B

    iput-object v7, p0, Ll/ۗ᩵᩵;->᩸֫:[B

    .line 531
    invoke-static {p2, v1, v7, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v2

    :cond_0
    sub-int v1, v5, v6

    .line 535
    rem-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v5

    .line 538
    iget v2, p0, Ll/ۗ᩵᩵;->֡֫:I

    const/16 v5, 0x311

    if-ne v2, v5, :cond_6

    if-eqz v3, :cond_6

    if-eqz v0, :cond_6

    .line 539
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v2

    add-int/2addr v2, v3

    .line 540
    new-array v3, v0, [Ll/᩹᩵᩵;

    :goto_0
    if-ge v4, v0, :cond_5

    .line 542
    invoke-static {v2, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v5

    add-int/lit8 v6, v2, 0x2

    .line 543
    invoke-static {v6, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v6

    add-int/lit8 v2, v2, 0x8

    const/4 v7, 0x1

    if-eq v5, v7, :cond_2

    const/4 v7, 0x2

    if-eq v5, v7, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    .line 571
    :cond_1
    new-instance v5, Ll/ܶ᩵᩵;

    invoke-direct {v5}, Ll/ܶ᩵᩵;-><init>()V

    goto :goto_1

    .line 573
    :cond_2
    new-instance v5, Ll/᩶᩵᩵;

    invoke-direct {v5}, Ll/᩶᩵᩵;-><init>()V

    :goto_1
    if-eqz v5, :cond_3

    .line 548
    invoke-interface {v5, v2, v6, p2}, Ll/۠ۡ᩵;->֫(II[B)I

    .line 549
    aput-object v5, v3, v4

    :cond_3
    add-int/2addr v2, v6

    add-int/lit8 v5, v0, -0x1

    if-eq v4, v5, :cond_4

    .line 553
    invoke-virtual {p0, v2}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result v5

    add-int/2addr v2, v5

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 556
    :cond_5
    iput-object v3, p0, Ll/ۗ᩵᩵;->ܶ֫:[Ll/᩹᩵᩵;

    .line 557
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, p1

    return p2

    :cond_6
    sub-int/2addr v1, p1

    return v1

    .line 493
    :cond_7
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Structure size is not 65"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 493
    throw p1
.end method

.method public final ۧ(Ll/۟ܺ᩵;)V
    .locals 0

    return-void
.end method

.method public final ۫()I
    .locals 1

    .line 156
    iget v0, p0, Ll/ۗ᩵᩵;->֨֫:I

    return v0
.end method

.method public final ܰ()Z
    .locals 2

    .line 213
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۗ᩵᩵;->ܽ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܶ֫()I
    .locals 1

    .line 124
    iget v0, p0, Ll/ۗ᩵᩵;->ۙ֫:I

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 419
    iget v0, p0, Ll/ۗ᩵᩵;->ۚ֫:I

    return v0
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 202
    iget v0, p0, Ll/ۗ᩵᩵;->᩵֫:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵֫()I
    .locals 1

    .line 132
    iget v0, p0, Ll/ۗ᩵᩵;->ᩴ֫:I

    return v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 463
    invoke-virtual {p0}, Ll/ۗ᩵᩵;->ۖ()Z

    move-result v0

    return v0
.end method

.method public final ᩸֫()[B
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۗ᩵᩵;->ۗ֫:[B

    return-object v0
.end method

.method public final ᩻()Ll/᩸ۡ᩵;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۗ᩵᩵;->᩶֫:Ll/᩸ۡ᩵;

    return-object v0
.end method
