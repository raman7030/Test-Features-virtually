.class public final Ll/֡֡ۧ;
.super Ljava/lang/Object;
.source "98SV"

# interfaces
.implements Ll/ܺ֡ۧ;


# static fields
.field public static final ܺ:[F


# instance fields
.field public final ֫:Ll/ᩴ֡ۧ;

.field public ۜ:J

.field public final ۡ:Ll/֨ۚۧ;

.field public final ۢ:Ll/ᩳ֨֫;

.field public ۧ:Ljava/lang/String;

.field public final ܳ:[Z

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Ll/᩵ۢۧ;

.field public final ᩷:Ll/ۛ֡ۧ;

.field public ᩻:Ll/᩵֡ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    .line 63
    fill-array-data v0, :array_0

    sput-object v0, Ll/֡֡ۧ;->ܺ:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Ll/֨ۚۧ;)V
    .locals 2

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ll/֡֡ۧ;->ۡ:Ll/֨ۚۧ;

    const/4 p1, 0x4

    new-array p1, p1, [Z

    .line 96
    iput-object p1, p0, Ll/֡֡ۧ;->ܳ:[Z

    .line 97
    new-instance p1, Ll/ᩴ֡ۧ;

    .line 357
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [B

    .line 358
    iput-object v0, p1, Ll/ᩴ֡ۧ;->֫:[B

    .line 97
    iput-object p1, p0, Ll/֡֡ۧ;->֫:Ll/ᩴ֡ۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    iput-wide v0, p0, Ll/֡֡ۧ;->ܿ:J

    .line 100
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0xb2

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/֡֡ۧ;->᩷:Ll/ۛ֡ۧ;

    .line 101
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/֡֡ۧ;->ۢ:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 110
    iget-object v0, p0, Ll/֡֡ۧ;->ܳ:[Z

    invoke-static {v0}, Ll/ܽ۠֫;->֫([Z)V

    .line 111
    iget-object v0, p0, Ll/֡֡ۧ;->֫:Ll/ᩴ֡ۧ;

    invoke-virtual {v0}, Ll/ᩴ֡ۧ;->֫()V

    .line 112
    iget-object v0, p0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {v0}, Ll/᩵֡ۧ;->֫()V

    .line 115
    :cond_0
    iget-object v0, p0, Ll/֡֡ۧ;->᩷:Ll/ۛ֡ۧ;

    if-eqz v0, :cond_1

    .line 116
    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    :cond_1
    const-wide/16 v0, 0x0

    .line 118
    iput-wide v0, p0, Ll/֡֡ۧ;->ۜ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 119
    iput-wide v0, p0, Ll/֡֡ۧ;->ܿ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 136
    iput-wide p2, p0, Ll/֡֡ۧ;->ܿ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 16

    move-object/from16 v0, p0

    .line 142
    iget-object v1, v0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 143
    iget-object v1, v0, Ll/֡֡ۧ;->ᩳ:Ll/᩵ۢۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 144
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 145
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    .line 146
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 149
    iget-wide v4, v0, Ll/֡֡ۧ;->ۜ:J

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Ll/֡֡ۧ;->ۜ:J

    .line 150
    iget-object v4, v0, Ll/֡֡ۧ;->ᩳ:Ll/᩵ۢۧ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v5, v6}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 153
    :goto_0
    iget-object v4, v0, Ll/֡֡ۧ;->ܳ:[Z

    invoke-static {v1, v2, v3, v4}, Ll/ܽ۠֫;->֫(II[B[Z)I

    move-result v4

    .line 155
    iget-object v5, v0, Ll/֡֡ۧ;->֫:Ll/ᩴ֡ۧ;

    iget-object v7, v0, Ll/֡֡ۧ;->᩷:Ll/ۛ֡ۧ;

    if-ne v4, v2, :cond_2

    .line 157
    iget-boolean v4, v0, Ll/֡֡ۧ;->ܽ:Z

    if-nez v4, :cond_0

    .line 158
    invoke-virtual {v5, v1, v2, v3}, Ll/ᩴ֡ۧ;->֫(II[B)V

    .line 160
    :cond_0
    iget-object v4, v0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    invoke-virtual {v4, v1, v2, v3}, Ll/᩵֡ۧ;->֫(II[B)V

    if-eqz v7, :cond_1

    .line 162
    invoke-virtual {v7, v1, v2, v3}, Ll/ۛ֡ۧ;->֫(II[B)V

    :cond_1
    return-void

    .line 168
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    add-int/lit8 v9, v4, 0x3

    aget-byte v8, v8, v9

    and-int/lit16 v8, v8, 0xff

    sub-int v10, v4, v1

    .line 173
    iget-boolean v11, v0, Ll/֡֡ۧ;->ܽ:Z

    if-nez v11, :cond_e

    if-lez v10, :cond_3

    .line 175
    invoke-virtual {v5, v1, v4, v3}, Ll/ᩴ֡ۧ;->֫(II[B)V

    :cond_3
    if-gez v10, :cond_4

    neg-int v11, v10

    goto :goto_1

    :cond_4
    const/4 v11, 0x0

    .line 180
    :goto_1
    invoke-virtual {v5, v8, v11}, Ll/ᩴ֡ۧ;->֫(II)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 182
    iget-object v11, v0, Ll/֡֡ۧ;->ᩳ:Ll/᩵ۢۧ;

    iget v12, v5, Ll/ᩴ֡ۧ;->ܿ:I

    iget-object v13, v0, Ll/֡֡ۧ;->ۧ:Ljava/lang/String;

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    iget-object v14, v5, Ll/ᩴ֡ۧ;->֫:[B

    iget v5, v5, Ll/ᩴ֡ۧ;->ܽ:I

    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 246
    new-instance v14, Ll/ܽ֨֫;

    .line 48
    array-length v15, v5

    invoke-direct {v14, v5, v15}, Ll/ܽ֨֫;-><init>([BI)V

    .line 247
    invoke-virtual {v14, v12}, Ll/ܽ֨֫;->ܳ(I)V

    const/4 v12, 0x4

    .line 250
    invoke-virtual {v14, v12}, Ll/ܽ֨֫;->ܳ(I)V

    .line 251
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    const/16 v15, 0x8

    .line 252
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ܿ(I)V

    .line 253
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܿ()Z

    move-result v15

    const/4 v6, 0x3

    if-eqz v15, :cond_5

    .line 254
    invoke-virtual {v14, v12}, Ll/ܽ֨֫;->ܿ(I)V

    .line 255
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 258
    :cond_5
    invoke-virtual {v14, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const-string v15, "Invalid aspect ratio"

    const/16 v12, 0xf

    if-ne v6, v12, :cond_7

    const/16 v6, 0x8

    .line 260
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 261
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    if-nez v6, :cond_6

    .line 263
    invoke-static {v15}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    int-to-float v12, v12

    int-to-float v6, v6

    div-float/2addr v12, v6

    goto :goto_3

    :cond_7
    const/4 v12, 0x7

    if-ge v6, v12, :cond_8

    .line 269
    sget-object v12, Ll/֡֡ۧ;->ܺ:[F

    aget v12, v12, v6

    goto :goto_3

    .line 271
    :cond_8
    invoke-static {v15}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_2
    const/high16 v12, 0x3f800000    # 1.0f

    .line 274
    :goto_3
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    const/4 v15, 0x2

    if-eqz v6, :cond_9

    .line 275
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v6, 0x1

    .line 276
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 277
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0xf

    .line 278
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 279
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 280
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 281
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 282
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 283
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    const/4 v15, 0x3

    .line 284
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v15, 0xb

    .line 285
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ܿ(I)V

    .line 286
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 287
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 288
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    const/4 v15, 0x2

    .line 291
    :cond_9
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    if-eqz v6, :cond_a

    const-string v6, "Unhandled video object layer shape"

    .line 293
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 295
    :cond_a
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    const/16 v6, 0x10

    .line 296
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    .line 297
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 298
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܿ()Z

    move-result v15

    if-eqz v15, :cond_d

    if-nez v6, :cond_b

    const-string v6, "Invalid vop_increment_time_resolution"

    .line 300
    invoke-static {v6}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    add-int/lit8 v6, v6, -0x1

    const/4 v15, 0x0

    :goto_4
    if-lez v6, :cond_c

    add-int/lit8 v15, v15, 0x1

    shr-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 308
    :cond_c
    invoke-virtual {v14, v15}, Ll/ܽ֨֫;->ܿ(I)V

    .line 311
    :cond_d
    :goto_5
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    const/16 v6, 0xd

    .line 312
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v15

    .line 313
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 314
    invoke-virtual {v14, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    .line 315
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 316
    invoke-virtual {v14}, Ll/ܽ֨֫;->ܳ()V

    .line 317
    new-instance v14, Ll/֨ᩴ֫;

    invoke-direct {v14}, Ll/֨ᩴ֫;-><init>()V

    .line 318
    invoke-virtual {v14, v13}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v13, "video/mp2t"

    .line 319
    invoke-virtual {v14, v13}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v13, "video/mp4v-es"

    .line 320
    invoke-virtual {v14, v13}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 321
    invoke-virtual {v14, v15}, Ll/֨ᩴ֫;->ۙ(I)V

    .line 322
    invoke-virtual {v14, v6}, Ll/֨ᩴ֫;->ۡ(I)V

    .line 323
    invoke-virtual {v14, v12}, Ll/֨ᩴ֫;->ۧ(F)V

    .line 324
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v14, v5}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 325
    invoke-virtual {v14}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    .line 182
    invoke-interface {v11, v5}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    const/4 v5, 0x1

    .line 188
    iput-boolean v5, v0, Ll/֡֡ۧ;->ܽ:Z

    .line 192
    :cond_e
    iget-object v5, v0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    invoke-virtual {v5, v1, v4, v3}, Ll/᩵֡ۧ;->֫(II[B)V

    if-eqz v7, :cond_11

    if-lez v10, :cond_f

    .line 197
    invoke-virtual {v7, v1, v4, v3}, Ll/ۛ֡ۧ;->֫(II[B)V

    const/4 v1, 0x0

    goto :goto_6

    :cond_f
    neg-int v1, v10

    .line 202
    :goto_6
    invoke-virtual {v7, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 203
    iget-object v1, v7, Ll/ۛ֡ۧ;->ܽ:[B

    iget v5, v7, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v5, v1}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v1

    .line 204
    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-object v5, v7, Ll/ۛ֡ۧ;->ܽ:[B

    iget-object v6, v0, Ll/֡֡ۧ;->ۢ:Ll/ᩳ֨֫;

    invoke-virtual {v6, v1, v5}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 205
    iget-object v1, v0, Ll/֡֡ۧ;->ۡ:Ll/֨ۚۧ;

    iget-wide v10, v0, Ll/֡֡ۧ;->ܿ:J

    invoke-virtual {v1, v10, v11, v6}, Ll/֨ۚۧ;->֫(JLl/ᩳ֨֫;)V

    :cond_10
    const/16 v1, 0xb2

    if-ne v8, v1, :cond_11

    .line 209
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    add-int/lit8 v5, v4, 0x2

    aget-byte v1, v1, v5

    const/4 v5, 0x1

    if-ne v1, v5, :cond_11

    .line 210
    invoke-virtual {v7, v8}, Ll/ۛ֡ۧ;->ۧ(I)V

    :cond_11
    sub-int v1, v2, v4

    .line 215
    iget-wide v4, v0, Ll/֡֡ۧ;->ۜ:J

    int-to-long v6, v1

    sub-long/2addr v4, v6

    .line 216
    iget-object v6, v0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    iget-boolean v7, v0, Ll/֡֡ۧ;->ܽ:Z

    invoke-virtual {v6, v4, v5, v1, v7}, Ll/᩵֡ۧ;->֫(JIZ)V

    .line 218
    iget-object v1, v0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    iget-wide v4, v0, Ll/֡֡ۧ;->ܿ:J

    invoke-virtual {v1, v8, v4, v5}, Ll/᩵֡ۧ;->֫(IJ)V

    move-object/from16 v6, p1

    move v1, v9

    goto/16 :goto_0
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 124
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 125
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡ۧ;->ۧ:Ljava/lang/String;

    .line 126
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡ۧ;->ᩳ:Ll/᩵ۢۧ;

    .line 127
    new-instance v1, Ll/᩵֡ۧ;

    invoke-direct {v1, v0}, Ll/᩵֡ۧ;-><init>(Ll/᩵ۢۧ;)V

    iput-object v1, p0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    .line 128
    iget-object v0, p0, Ll/֡֡ۧ;->ۡ:Ll/֨ۚۧ;

    .line 129
    invoke-virtual {v0, p1, p2}, Ll/֨ۚۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 4

    .line 227
    iget-object v0, p0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 229
    iget-object p1, p0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    iget-wide v0, p0, Ll/֡֡ۧ;->ۜ:J

    const/4 v2, 0x0

    iget-boolean v3, p0, Ll/֡֡ۧ;->ܽ:Z

    invoke-virtual {p1, v0, v1, v2, v3}, Ll/᩵֡ۧ;->֫(JIZ)V

    .line 230
    iget-object p1, p0, Ll/֡֡ۧ;->᩻:Ll/᩵֡ۧ;

    invoke-virtual {p1}, Ll/᩵֡ۧ;->֫()V

    :cond_0
    return-void
.end method
