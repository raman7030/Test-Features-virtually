.class public final Ll/᩹ۢۧ;
.super Ljava/lang/Object;
.source "88L3"

# interfaces
.implements Ll/֨᩷ۧ;


# static fields
.field public static final ֨:[B

.field public static final ۠:[B

.field public static final ܶ:[I

.field public static final ᩸:[I


# instance fields
.field public final ֡:Ll/᩵᩷ۧ;

.field public ֫:I

.field public ۖ:Ll/᩵ۢۧ;

.field public final ۘ:[B

.field public ۚ:J

.field public final ۜ:I

.field public ۡ:Z

.field public ۢ:Z

.field public ۧ:I

.field public ܳ:J

.field public ܺ:I

.field public ܽ:J

.field public ܿ:Ll/᩸᩷ۧ;

.field public ᩳ:Ll/᩵ۢۧ;

.field public ᩴ:Ll/ۢۢۧ;

.field public ᩵:J

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 122
    fill-array-data v1, :array_0

    sput-object v1, Ll/᩹ۢۧ;->ܶ:[I

    new-array v0, v0, [I

    .line 145
    fill-array-data v0, :array_1

    sput-object v0, Ll/᩹ۢۧ;->᩸:[I

    .line 164
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "#!AMR\n"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 164
    sput-object v1, Ll/᩹ۢۧ;->֨:[B

    const-string v1, "#!AMR-WB\n"

    .line 1076
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 165
    sput-object v0, Ll/᩹ۢۧ;->۠:[B

    return-void

    nop

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    .line 209
    :cond_0
    iput p1, p0, Ll/᩹ۢۧ;->ۜ:I

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 210
    iput-object p1, p0, Ll/᩹ۢۧ;->ۘ:[B

    const/4 p1, -0x1

    .line 211
    iput p1, p0, Ll/᩹ۢۧ;->᩻:I

    .line 212
    new-instance p1, Ll/᩵᩷ۧ;

    invoke-direct {p1}, Ll/᩵᩷ۧ;-><init>()V

    iput-object p1, p0, Ll/᩹ۢۧ;->֡:Ll/᩵᩷ۧ;

    .line 213
    iput-object p1, p0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    return-void
.end method

.method private ۧ(Ll/۠᩷ۧ;)I
    .locals 3

    .line 398
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 399
    iget-object v2, p0, Ll/᩹ۢۧ;->ۘ:[B

    invoke-interface {p1, v1, v0, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 401
    aget-byte p1, v2, v1

    and-int/lit16 v0, p1, 0x83

    const/4 v1, 0x0

    if-gtz v0, :cond_5

    shr-int/lit8 p1, p1, 0x3

    const/16 v0, 0xf

    and-int/2addr p1, v0

    if-ltz p1, :cond_3

    if-gt p1, v0, :cond_3

    .line 431
    iget-boolean v0, p0, Ll/᩹ۢۧ;->ۡ:Z

    if-eqz v0, :cond_0

    const/16 v2, 0xa

    if-lt p1, v2, :cond_1

    const/16 v2, 0xd

    if-le p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_3

    const/16 v2, 0xc

    if-lt p1, v2, :cond_1

    const/16 v2, 0xe

    if-le p1, v2, :cond_3

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 420
    sget-object v0, Ll/᩹ۢۧ;->᩸:[I

    aget p1, v0, p1

    return p1

    :cond_2
    sget-object v0, Ll/᩹ۢۧ;->ܶ:[I

    aget p1, v0, p1

    return p1

    .line 415
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Illegal AMR "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    iget-boolean v2, p0, Ll/᩹ۢۧ;->ۡ:Z

    if-eqz v2, :cond_4

    const-string v2, "WB"

    goto :goto_1

    :cond_4
    const-string v2, "NB"

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " frame type "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 415
    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 405
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Invalid padding bits for frame header "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method private ܽ(Ll/۠᩷ۧ;)Z
    .locals 5

    .line 317
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 318
    sget-object v0, Ll/᩹ۢۧ;->֨:[B

    array-length v1, v0

    new-array v1, v1, [B

    .line 319
    array-length v2, v0

    const/4 v3, 0x0

    invoke-interface {p1, v3, v2, v1}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 320
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 303
    iput-boolean v3, p0, Ll/᩹ۢۧ;->ۡ:Z

    .line 304
    array-length v0, v0

    invoke-interface {p1, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    return v2

    .line 317
    :cond_0
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 318
    sget-object v0, Ll/᩹ۢۧ;->۠:[B

    array-length v1, v0

    new-array v1, v1, [B

    .line 319
    array-length v4, v0

    invoke-interface {p1, v3, v4, v1}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 320
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 307
    iput-boolean v2, p0, Ll/᩹ۢۧ;->ۡ:Z

    .line 308
    array-length v0, v0

    invoke-interface {p1, v0}, Ll/۠᩷ۧ;->ܽ(I)V

    return v2

    :cond_1
    return v3
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 18

    move-object/from16 v0, p0

    .line 475
    iget-object v1, v0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 476
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 234
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 235
    invoke-direct/range {p0 .. p1}, Ll/᩹ۢۧ;->ܽ(Ll/۠᩷ۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Could not find AMR header."

    const/4 v2, 0x0

    .line 236
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 325
    :cond_1
    :goto_0
    iget-boolean v1, v0, Ll/᩹ۢۧ;->᩷:Z

    const/4 v2, 0x1

    if-nez v1, :cond_6

    .line 326
    iput-boolean v2, v0, Ll/᩹ۢۧ;->᩷:Z

    .line 327
    iget-boolean v1, v0, Ll/᩹ۢۧ;->ۡ:Z

    const-string v5, "audio/amr-wb"

    if-eqz v1, :cond_2

    move-object v6, v5

    goto :goto_1

    :cond_2
    const-string v6, "audio/amr"

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "audio/3gpp"

    :goto_2
    if-eqz v1, :cond_4

    const/16 v7, 0x3e80

    goto :goto_3

    :cond_4
    const/16 v7, 0x1f40

    :goto_3
    if-eqz v1, :cond_5

    .line 331
    sget-object v1, Ll/᩹ۢۧ;->᩸:[I

    const/16 v8, 0x8

    aget v1, v1, v8

    goto :goto_4

    :cond_5
    sget-object v1, Ll/᩹ۢۧ;->ܶ:[I

    const/4 v8, 0x7

    aget v1, v1, v8

    .line 332
    :goto_4
    iget-object v8, v0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    new-instance v9, Ll/֨ᩴ֫;

    invoke-direct {v9}, Ll/֨ᩴ֫;-><init>()V

    .line 334
    invoke-virtual {v9, v6}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 335
    invoke-virtual {v9, v5}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v9, v1}, Ll/֨ᩴ֫;->ۖ(I)V

    .line 337
    invoke-virtual {v9, v2}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 338
    invoke-virtual {v9, v7}, Ll/֨ᩴ֫;->۠(I)V

    .line 339
    invoke-virtual {v9}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 332
    invoke-interface {v8, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 345
    :cond_6
    iget v1, v0, Ll/᩹ۢۧ;->֫:I

    const/4 v5, 0x0

    const-wide/16 v6, 0x4e20

    const/4 v8, -0x1

    if-nez v1, :cond_a

    .line 347
    :try_start_0
    invoke-direct/range {p0 .. p1}, Ll/᩹ۢۧ;->ۧ(Ll/۠᩷ۧ;)I

    move-result v1

    iput v1, v0, Ll/᩹ۢۧ;->ۧ:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    iput v1, v0, Ll/᩹ۢۧ;->֫:I

    .line 352
    iget v1, v0, Ll/᩹ۢۧ;->᩻:I

    if-ne v1, v8, :cond_7

    .line 353
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v9

    iput-wide v9, v0, Ll/᩹ۢۧ;->ܳ:J

    .line 354
    iget v1, v0, Ll/᩹ۢۧ;->ۧ:I

    iput v1, v0, Ll/᩹ۢۧ;->᩻:I

    .line 356
    :cond_7
    iget v1, v0, Ll/᩹ۢۧ;->᩻:I

    iget v9, v0, Ll/᩹ۢۧ;->ۧ:I

    if-ne v1, v9, :cond_8

    .line 357
    iget v1, v0, Ll/᩹ۢۧ;->ܺ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩹ۢۧ;->ܺ:I

    .line 359
    :cond_8
    iget-object v1, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    instance-of v9, v1, Ll/ᩳۢۧ;

    if-eqz v9, :cond_a

    .line 360
    check-cast v1, Ll/ᩳۢۧ;

    .line 363
    iget-wide v9, v0, Ll/᩹ۢۧ;->ۚ:J

    iget-wide v11, v0, Ll/᩹ۢۧ;->ܽ:J

    add-long/2addr v9, v11

    add-long/2addr v9, v6

    .line 364
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v11

    iget v13, v0, Ll/᩹ۢۧ;->ۧ:I

    int-to-long v13, v13

    add-long/2addr v11, v13

    .line 365
    invoke-virtual {v1, v9, v10}, Ll/ᩳۢۧ;->ܽ(J)Z

    move-result v13

    if-nez v13, :cond_9

    .line 367
    invoke-virtual {v1, v9, v10, v11, v12}, Ll/ᩳۢۧ;->֫(JJ)V

    .line 369
    :cond_9
    iget-boolean v1, v0, Ll/᩹ۢۧ;->ۢ:Z

    if-eqz v1, :cond_a

    iget-wide v11, v0, Ll/᩹ۢۧ;->᩵:J

    sub-long/2addr v11, v9

    .line 487
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    cmp-long v1, v9, v6

    if-gez v1, :cond_a

    .line 370
    iput-boolean v5, v0, Ll/᩹ۢۧ;->ۢ:Z

    .line 371
    iget-object v1, v0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    iput-object v1, v0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    goto :goto_5

    :catch_0
    move-object/from16 v10, p1

    goto :goto_6

    .line 376
    :cond_a
    :goto_5
    iget-object v1, v0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    iget v9, v0, Ll/᩹ۢۧ;->֫:I

    move-object/from16 v10, p1

    .line 377
    invoke-interface {v1, v10, v9, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v1

    if-ne v1, v8, :cond_b

    :goto_6
    const/4 v1, -0x1

    goto :goto_8

    .line 382
    :cond_b
    iget v9, v0, Ll/᩹ۢۧ;->֫:I

    sub-int/2addr v9, v1

    iput v9, v0, Ll/᩹ۢۧ;->֫:I

    if-lez v9, :cond_c

    goto :goto_7

    .line 387
    :cond_c
    iget-object v11, v0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    iget-wide v12, v0, Ll/᩹ۢۧ;->ۚ:J

    iget-wide v14, v0, Ll/᩹ۢۧ;->ܽ:J

    add-long/2addr v12, v14

    iget v15, v0, Ll/᩹ۢۧ;->ۧ:I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x1

    invoke-interface/range {v11 .. v17}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 393
    iget-wide v11, v0, Ll/᩹ۢۧ;->ܽ:J

    add-long/2addr v11, v6

    iput-wide v11, v0, Ll/᩹ۢۧ;->ܽ:J

    :goto_7
    const/4 v1, 0x0

    .line 242
    :goto_8
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v12

    .line 441
    iget-object v9, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    if-eqz v9, :cond_d

    goto :goto_c

    .line 445
    :cond_d
    iget v9, v0, Ll/᩹ۢۧ;->ۜ:I

    and-int/lit8 v10, v9, 0x4

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v10, :cond_e

    .line 446
    new-instance v6, Ll/ᩳۢۧ;

    iget-wide v9, v0, Ll/᩹ۢۧ;->ܳ:J

    new-array v7, v2, [J

    aput-wide v9, v7, v5

    new-array v2, v2, [J

    aput-wide v3, v2, v5

    invoke-direct {v6, v14, v15, v7, v2}, Ll/ᩳۢۧ;-><init>(J[J[J)V

    iput-object v6, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    goto :goto_b

    :cond_e
    and-int/lit8 v2, v9, 0x1

    if-eqz v2, :cond_12

    .line 451
    iget v11, v0, Ll/᩹ۢۧ;->᩻:I

    if-eq v11, v8, :cond_f

    iget v2, v0, Ll/᩹ۢۧ;->ۧ:I

    if-eq v11, v2, :cond_f

    goto :goto_a

    .line 454
    :cond_f
    iget v2, v0, Ll/᩹ۢۧ;->ܺ:I

    const/16 v3, 0x14

    if-ge v2, v3, :cond_10

    if-ne v1, v8, :cond_13

    :cond_10
    and-int/lit8 v2, v9, 0x2

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    const/16 v16, 0x1

    goto :goto_9

    :cond_11
    const/4 v2, 0x0

    const/16 v16, 0x0

    :goto_9
    int-to-long v2, v11

    const-wide/32 v4, 0x7a1200

    mul-long v2, v2, v4

    .line 498
    div-long/2addr v2, v6

    long-to-int v10, v2

    .line 469
    new-instance v2, Ll/ۡ᩷ۧ;

    iget-wide v14, v0, Ll/᩹ۢۧ;->ܳ:J

    move-object v9, v2

    invoke-direct/range {v9 .. v16}, Ll/ۡ᩷ۧ;-><init>(IIJJZ)V

    .line 457
    iput-object v2, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    .line 459
    iget-object v3, v0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-virtual {v2}, Ll/ۡ᩷ۧ;->ۜ()J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, Ll/᩵ۢۧ;->֫(J)V

    goto :goto_b

    .line 453
    :cond_12
    :goto_a
    new-instance v2, Ll/᩷ۢۧ;

    invoke-direct {v2, v14, v15}, Ll/᩷ۢۧ;-><init>(J)V

    iput-object v2, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    .line 462
    :cond_13
    :goto_b
    iget-object v2, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    if-eqz v2, :cond_14

    .line 463
    iget-object v3, v0, Ll/᩹ۢۧ;->ܿ:Ll/᩸᩷ۧ;

    invoke-interface {v3, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    :cond_14
    :goto_c
    if-ne v1, v8, :cond_15

    .line 243
    iget-object v2, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    instance-of v3, v2, Ll/ᩳۢۧ;

    if-eqz v3, :cond_15

    .line 245
    iget-wide v3, v0, Ll/᩹ۢۧ;->ۚ:J

    iget-wide v5, v0, Ll/᩹ۢۧ;->ܽ:J

    add-long/2addr v3, v5

    .line 246
    check-cast v2, Ll/ᩳۢۧ;

    invoke-virtual {v2, v3, v4}, Ll/ᩳۢۧ;->ᩳ(J)V

    .line 247
    iget-object v2, v0, Ll/᩹ۢۧ;->ܿ:Ll/᩸᩷ۧ;

    iget-object v5, v0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    invoke-interface {v2, v5}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 248
    iget-object v2, v0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-interface {v2, v3, v4}, Ll/᩵ۢۧ;->֫(J)V

    :cond_15
    return v1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 255
    iput-wide v0, p0, Ll/᩹ۢۧ;->ܽ:J

    const/4 v2, 0x0

    .line 256
    iput v2, p0, Ll/᩹ۢۧ;->ۧ:I

    .line 257
    iput v2, p0, Ll/᩹ۢۧ;->֫:I

    .line 258
    iput-wide p3, p0, Ll/᩹ۢۧ;->᩵:J

    .line 259
    iget-object p3, p0, Ll/᩹ۢۧ;->ᩴ:Ll/ۢۢۧ;

    instance-of p4, p3, Ll/ᩳۢۧ;

    if-eqz p4, :cond_1

    .line 260
    check-cast p3, Ll/ᩳۢۧ;

    invoke-virtual {p3, p1, p2}, Ll/ᩳۢۧ;->ۧ(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩹ۢۧ;->ۚ:J

    .line 261
    iget-wide p3, p0, Ll/᩹ۢۧ;->᩵:J

    sub-long/2addr p3, p1

    .line 487
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    const-wide/16 p3, 0x4e20

    cmp-long v0, p1, p3

    if-gez v0, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 262
    iput-boolean p1, p0, Ll/᩹ۢۧ;->ۢ:Z

    .line 263
    iget-object p1, p0, Ll/᩹ۢۧ;->֡:Ll/᩵᩷ۧ;

    iput-object p1, p0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    return-void

    :cond_1
    cmp-long p4, p1, v0

    if-eqz p4, :cond_2

    .line 265
    instance-of p4, p3, Ll/ۡ᩷ۧ;

    if-eqz p4, :cond_2

    .line 266
    check-cast p3, Ll/ۡ᩷ۧ;

    invoke-virtual {p3, p1, p2}, Ll/ۡ᩷ۧ;->ܽ(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩹ۢۧ;->ۚ:J

    return-void

    .line 268
    :cond_2
    iput-wide v0, p0, Ll/᩹ۢۧ;->ۚ:J

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 225
    iput-object p1, p0, Ll/᩹ۢۧ;->ܿ:Ll/᩸᩷ۧ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 226
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۢۧ;->ۖ:Ll/᩵ۢۧ;

    .line 227
    iput-object v0, p0, Ll/᩹ۢۧ;->ᩳ:Ll/᩵ۢۧ;

    .line 228
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 0

    .line 220
    invoke-direct {p0, p1}, Ll/᩹ۢۧ;->ܽ(Ll/۠᩷ۧ;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
