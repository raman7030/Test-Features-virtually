.class public final Ll/᩻֡ۧ;
.super Ljava/lang/Object;
.source "K8IZ"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:I

.field public final ۜ:Ll/ᩳ֨֫;

.field public final ۡ:Ll/ܽ֨֫;

.field public final ۢ:Ll/ᩳ֨֫;

.field public ۧ:Ll/᩸᩷ۧ;

.field public ܳ:Z

.field public ܺ:Z

.field public ܽ:J

.field public final ܿ:I

.field public ᩳ:J

.field public final ᩷:Ll/ۜ֡ۧ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    .line 136
    :cond_0
    iput p1, p0, Ll/᩻֡ۧ;->ܿ:I

    .line 137
    new-instance p1, Ll/ۜ֡ۧ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "audio/mp4a-latm"

    const/4 v3, 0x1

    .line 111
    invoke-direct {p1, v0, v1, v2, v3}, Ll/ۜ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 137
    iput-object p1, p0, Ll/᩻֡ۧ;->᩷:Ll/ۜ֡ۧ;

    .line 138
    new-instance p1, Ll/ᩳ֨֫;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/᩻֡ۧ;->ۜ:Ll/ᩳ֨֫;

    const/4 p1, -0x1

    .line 139
    iput p1, p0, Ll/᩻֡ۧ;->֫:I

    const-wide/16 v0, -0x1

    .line 140
    iput-wide v0, p0, Ll/᩻֡ۧ;->ܽ:J

    .line 142
    new-instance p1, Ll/ᩳ֨֫;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/᩻֡ۧ;->ۢ:Ll/ᩳ֨֫;

    .line 143
    new-instance v0, Ll/ܽ֨֫;

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    .line 48
    array-length v1, p1

    invoke-direct {v0, p1, v1}, Ll/ܽ֨֫;-><init>([BI)V

    .line 143
    iput-object v0, p0, Ll/᩻֡ۧ;->ۡ:Ll/ܽ֨֫;

    return-void
.end method

.method private ۧ(Ll/۠᩷ۧ;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 254
    :goto_0
    iget-object v2, p0, Ll/᩻֡ۧ;->ۢ:Ll/ᩳ֨֫;

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/16 v4, 0xa

    invoke-interface {p1, v0, v4, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 255
    invoke-virtual {v2, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 256
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩸()I

    move-result v3

    const v4, 0x494433

    if-eq v3, v4, :cond_1

    .line 264
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 265
    invoke-interface {p1, v1}, Ll/۠᩷ۧ;->֫(I)V

    .line 266
    iget-wide v2, p0, Ll/᩻֡ۧ;->ܽ:J

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    int-to-long v2, v1

    .line 267
    iput-wide v2, p0, Ll/᩻֡ۧ;->ܽ:J

    :cond_0
    return v1

    :cond_1
    const/4 v3, 0x3

    .line 259
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 260
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۚ()I

    move-result v2

    add-int/lit8 v3, v2, 0xa

    add-int/2addr v1, v3

    .line 262
    invoke-interface {p1, v2}, Ll/۠᩷ۧ;->֫(I)V

    goto :goto_0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 218
    iget-object v2, v0, Ll/᩻֡ۧ;->ۧ:Ll/᩸᩷ۧ;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 220
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v6

    .line 221
    iget v2, v0, Ll/᩻֡ۧ;->ܿ:I

    and-int/lit8 v3, v2, 0x2

    const/4 v11, 0x4

    const/4 v4, -0x1

    const/4 v12, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    and-int/lit8 v8, v2, 0x1

    if-eqz v8, :cond_b

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-eqz v10, :cond_b

    .line 299
    :cond_0
    iget-object v8, v0, Ll/᩻֡ۧ;->ۡ:Ll/ܽ֨֫;

    iget-object v9, v0, Ll/᩻֡ۧ;->ۢ:Ll/ᩳ֨֫;

    iget-boolean v10, v0, Ll/᩻֡ۧ;->ܳ:Z

    if-eqz v10, :cond_1

    goto/16 :goto_4

    .line 302
    :cond_1
    iput v4, v0, Ll/᩻֡ۧ;->֫:I

    .line 303
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 304
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v10, v13, v15

    if-nez v10, :cond_2

    .line 306
    invoke-direct/range {p0 .. p1}, Ll/᩻֡ۧ;->ۧ(Ll/۠᩷ۧ;)I

    :cond_2
    const/4 v10, 0x0

    .line 313
    :goto_0
    :try_start_0
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    const/4 v14, 0x2

    .line 312
    invoke-interface {v1, v12, v5, v14, v13}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v13

    if-eqz v13, :cond_9

    .line 314
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 315
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ۗ()I

    move-result v13

    const v14, 0xfff6

    and-int/2addr v13, v14

    const v14, 0xfff0

    if-ne v13, v14, :cond_3

    const/4 v13, 0x1

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    :goto_1
    if-nez v13, :cond_4

    const/4 v10, 0x0

    goto :goto_2

    .line 324
    :cond_4
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    .line 323
    invoke-interface {v1, v12, v5, v11, v13}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/16 v5, 0xe

    .line 327
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v5, 0xd

    .line 328
    invoke-virtual {v8, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    const/4 v13, 0x6

    if-le v5, v13, :cond_8

    int-to-long v13, v5

    add-long/2addr v15, v13

    add-int/lit8 v10, v10, 0x1

    const/16 v13, 0x3e8

    if-ne v10, v13, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v5, v5, -0x6

    .line 339
    invoke-interface {v1, v5, v12}, Ll/۠᩷ۧ;->ۧ(IZ)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    goto :goto_0

    :catch_0
    nop

    goto :goto_2

    .line 331
    :cond_8
    iput-boolean v12, v0, Ll/᩻֡ۧ;->ܳ:Z

    const-string v5, "Malformed ADTS stream"

    const/4 v8, 0x0

    .line 332
    invoke-static {v5, v8}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v5

    throw v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 350
    :cond_9
    :goto_2
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    if-lez v10, :cond_a

    int-to-long v8, v10

    .line 352
    div-long v8, v15, v8

    long-to-int v5, v8

    iput v5, v0, Ll/᩻֡ۧ;->֫:I

    goto :goto_3

    .line 354
    :cond_a
    iput v4, v0, Ll/᩻֡ۧ;->֫:I

    .line 356
    :goto_3
    iput-boolean v12, v0, Ll/᩻֡ۧ;->ܳ:Z

    .line 229
    :cond_b
    :goto_4
    iget-object v13, v0, Ll/᩻֡ۧ;->ۜ:Ll/ᩳ֨֫;

    invoke-virtual {v13}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    const/16 v8, 0x800

    const/4 v9, 0x0

    invoke-interface {v1, v5, v9, v8}, Ll/ۢᩴ֫;->read([BII)I

    move-result v1

    if-ne v1, v4, :cond_c

    const/4 v4, 0x1

    const/4 v14, 0x1

    goto :goto_5

    :cond_c
    const/4 v4, 0x0

    const/4 v14, 0x0

    .line 274
    :goto_5
    iget-boolean v4, v0, Ll/᩻֡ۧ;->᩻:Z

    iget-object v15, v0, Ll/᩻֡ۧ;->᩷:Ll/ۜ֡ۧ;

    if-eqz v4, :cond_d

    goto :goto_7

    :cond_d
    and-int/2addr v2, v12

    if-eqz v2, :cond_e

    .line 278
    iget v2, v0, Ll/᩻֡ۧ;->֫:I

    if-lez v2, :cond_e

    const/4 v2, 0x1

    goto :goto_6

    :cond_e
    const/4 v2, 0x0

    :goto_6
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_f

    .line 281
    invoke-virtual {v15}, Ll/ۜ֡ۧ;->ۧ()J

    move-result-wide v8

    cmp-long v10, v8, v4

    if-nez v10, :cond_f

    if-nez v14, :cond_f

    :goto_7
    const/4 v2, -0x1

    move-object/from16 p1, v15

    const/4 v3, 0x1

    goto :goto_a

    :cond_f
    if-eqz v2, :cond_11

    .line 288
    invoke-virtual {v15}, Ll/ۜ֡ۧ;->ۧ()J

    move-result-wide v8

    cmp-long v2, v8, v4

    if-eqz v2, :cond_11

    .line 289
    iget-object v2, v0, Ll/᩻֡ۧ;->ۧ:Ll/᩸᩷ۧ;

    if-eqz v3, :cond_10

    const/4 v3, 0x1

    const/4 v10, 0x1

    goto :goto_8

    :cond_10
    const/4 v3, 0x0

    const/4 v10, 0x0

    .line 360
    :goto_8
    iget v3, v0, Ll/᩻֡ۧ;->֫:I

    invoke-virtual {v15}, Ll/ۜ֡ۧ;->ۧ()J

    move-result-wide v4

    int-to-long v8, v3

    const-wide/32 v16, 0x7a1200

    mul-long v8, v8, v16

    .line 373
    div-long/2addr v8, v4

    long-to-int v4, v8

    .line 361
    new-instance v8, Ll/ۡ᩷ۧ;

    iget-wide v11, v0, Ll/᩻֡ۧ;->ܽ:J

    iget v5, v0, Ll/᩻֡ۧ;->֫:I

    const/16 v17, -0x1

    move-object v3, v8

    move-object/from16 p1, v15

    move-object v15, v8

    move-wide v8, v11

    invoke-direct/range {v3 .. v10}, Ll/ۡ᩷ۧ;-><init>(IIJJZ)V

    .line 289
    invoke-interface {v2, v15}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    const/4 v2, -0x1

    goto :goto_9

    :cond_11
    move-object/from16 p1, v15

    const/4 v2, -0x1

    .line 293
    iget-object v3, v0, Ll/᩻֡ۧ;->ۧ:Ll/᩸᩷ۧ;

    new-instance v6, Ll/᩷ۢۧ;

    invoke-direct {v6, v4, v5}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v3, v6}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    :goto_9
    const/4 v3, 0x1

    .line 295
    iput-boolean v3, v0, Ll/᩻֡ۧ;->᩻:Z

    :goto_a
    if-eqz v14, :cond_12

    return v2

    :cond_12
    const/4 v2, 0x0

    .line 237
    invoke-virtual {v13, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 238
    invoke-virtual {v13, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 240
    iget-boolean v1, v0, Ll/᩻֡ۧ;->ܺ:Z

    if-nez v1, :cond_13

    .line 242
    iget-wide v4, v0, Ll/᩻֡ۧ;->ᩳ:J

    move-object/from16 v6, p1

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v4, v5}, Ll/ۜ֡ۧ;->֫(IJ)V

    .line 243
    iput-boolean v3, v0, Ll/᩻֡ۧ;->ܺ:Z

    goto :goto_b

    :cond_13
    move-object/from16 v6, p1

    .line 247
    :goto_b
    invoke-virtual {v6, v13}, Ll/ۜ֡ۧ;->֫(Ll/ᩳ֨֫;)V

    return v2
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    const/4 p1, 0x0

    .line 206
    iput-boolean p1, p0, Ll/᩻֡ۧ;->ܺ:Z

    .line 207
    iget-object p1, p0, Ll/᩻֡ۧ;->᩷:Ll/ۜ֡ۧ;

    invoke-virtual {p1}, Ll/ۜ֡ۧ;->֫()V

    .line 208
    iput-wide p3, p0, Ll/᩻֡ۧ;->ᩳ:J

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 3

    .line 199
    iput-object p1, p0, Ll/᩻֡ۧ;->ۧ:Ll/᩸᩷ۧ;

    .line 200
    new-instance v0, Ll/᩵ۚۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩵ۚۧ;-><init>(II)V

    iget-object v1, p0, Ll/᩻֡ۧ;->᩷:Ll/ۜ֡ۧ;

    invoke-virtual {v1, p1, v0}, Ll/ۜ֡ۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    .line 201
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 10

    .line 151
    invoke-direct {p0, p1}, Ll/᩻֡ۧ;->ۧ(Ll/۠᩷ۧ;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v0

    .line 158
    :cond_0
    iget-object v5, p0, Ll/᩻֡ۧ;->ۢ:Ll/ᩳ֨֫;

    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    move-object v7, p1

    check-cast v7, Ll/ܺ᩷ۧ;

    const/4 v8, 0x2

    .line 157
    invoke-virtual {v7, v1, v1, v8, v6}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 159
    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 160
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    const v8, 0xfff6

    and-int/2addr v6, v8

    const v8, 0xfff0

    if-ne v6, v8, :cond_3

    const/4 v6, 0x1

    add-int/2addr v2, v6

    const/4 v8, 0x4

    if-lt v2, v8, :cond_1

    const/16 v9, 0xbc

    if-le v3, v9, :cond_1

    return v6

    .line 175
    :cond_1
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    .line 157
    invoke-virtual {v7, v1, v1, v8, v5}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    const/16 v5, 0xe

    .line 176
    iget-object v6, p0, Ll/᩻֡ۧ;->ۡ:Ll/ܽ֨֫;

    invoke-virtual {v6, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v5, 0xd

    .line 177
    invoke-virtual {v6, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    const/4 v6, 0x6

    if-gt v5, v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 184
    invoke-virtual {v7}, Ll/ܺ᩷ۧ;->ۧ()V

    goto :goto_0

    :cond_2
    add-int/lit8 v6, v5, -0x6

    .line 178
    invoke-virtual {v7, v6, v1}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    add-int/2addr v3, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 167
    invoke-virtual {v7}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 178
    :goto_0
    invoke-virtual {v7, v4, v1}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    sub-int v5, v4, v0

    const/16 v6, 0x2000

    if-lt v5, v6, :cond_0

    return v1
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
