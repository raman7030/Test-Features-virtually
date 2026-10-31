.class public final Ll/᩸֡ۧ;
.super Ljava/lang/Object;
.source "S8S4"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۖ:J

.field public final ۘ:Ll/ۛ֡ۧ;

.field public ۜ:Ll/ܶ֡ۧ;

.field public final ۡ:Ll/ۛ֡ۧ;

.field public final ۢ:Ll/ᩳ֨֫;

.field public ۧ:Z

.field public final ܳ:[Z

.field public final ܺ:Ll/ۛ֡ۧ;

.field public ܽ:Ll/᩵ۢۧ;

.field public final ܿ:Ll/ۛ֡ۧ;

.field public ᩳ:J

.field public final ᩷:Ll/ܳۚۧ;

.field public final ᩻:Ll/ۛ֡ۧ;


# direct methods
.method public constructor <init>(Ll/ܳۚۧ;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/᩸֡ۧ;->᩷:Ll/ܳۚۧ;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    .line 75
    iput-object p1, p0, Ll/᩸֡ۧ;->ܳ:[Z

    .line 76
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/᩸֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    .line 77
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0x21

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/᩸֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    .line 78
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0x22

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/᩸֡ۧ;->ܿ:Ll/ۛ֡ۧ;

    .line 79
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0x27

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/᩸֡ۧ;->᩻:Ll/ۛ֡ۧ;

    .line 80
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 v0, 0x28

    invoke-direct {p1, v0}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/᩸֡ۧ;->ܺ:Ll/ۛ֡ۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    iput-wide v0, p0, Ll/᩸֡ۧ;->ᩳ:J

    .line 82
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/᩸֡ۧ;->ۢ:Ll/ᩳ֨֫;

    return-void
.end method

.method private ֫(IIJJ)V
    .locals 19
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output",
            "sampleReader"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v2, p5

    .line 213
    iget-object v4, v0, Ll/᩸֡ۧ;->ۜ:Ll/ܶ֡ۧ;

    iget-boolean v5, v0, Ll/᩸֡ۧ;->ۧ:Z

    move/from16 v6, p1

    move-wide/from16 v7, p3

    invoke-virtual {v4, v7, v8, v6, v5}, Ll/ܶ֡ۧ;->֫(JIZ)V

    .line 214
    iget-boolean v4, v0, Ll/᩸֡ۧ;->ۧ:Z

    iget-object v5, v0, Ll/᩸֡ۧ;->᩷:Ll/ܳۚۧ;

    if-nez v4, :cond_2

    .line 215
    iget-object v4, v0, Ll/᩸֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v4, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    .line 216
    iget-object v6, v0, Ll/᩸֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v6, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    .line 217
    iget-object v7, v0, Ll/᩸֡ۧ;->ܿ:Ll/ۛ֡ۧ;

    invoke-virtual {v7, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    .line 218
    invoke-virtual {v4}, Ll/ۛ֡ۧ;->֫()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6}, Ll/ۛ֡ۧ;->֫()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v7}, Ll/ۛ֡ۧ;->֫()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 219
    iget-object v8, v0, Ll/᩸֡ۧ;->֫:Ljava/lang/String;

    .line 251
    iget v9, v4, Ll/ۛ֡ۧ;->ᩳ:I

    iget v10, v6, Ll/ۛ֡ۧ;->ᩳ:I

    add-int/2addr v10, v9

    iget v11, v7, Ll/ۛ֡ۧ;->ᩳ:I

    add-int/2addr v10, v11

    new-array v10, v10, [B

    .line 252
    iget-object v11, v4, Ll/ۛ֡ۧ;->ܽ:[B

    const/4 v12, 0x0

    invoke-static {v11, v12, v10, v12, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 253
    iget-object v9, v6, Ll/ۛ֡ۧ;->ܽ:[B

    iget v11, v4, Ll/ۛ֡ۧ;->ᩳ:I

    iget v13, v6, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v9, v12, v10, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 254
    iget-object v9, v7, Ll/ۛ֡ۧ;->ܽ:[B

    iget v4, v4, Ll/ۛ֡ۧ;->ᩳ:I

    iget v11, v6, Ll/ۛ֡ۧ;->ᩳ:I

    add-int/2addr v4, v11

    iget v7, v7, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v9, v12, v10, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 257
    iget-object v4, v6, Ll/ۛ֡ۧ;->ܽ:[B

    iget v6, v6, Ll/ۛ֡ۧ;->ᩳ:I

    const/4 v7, 0x3

    const/4 v9, 0x0

    .line 258
    invoke-static {v4, v7, v6, v9}, Ll/ܽ۠֫;->֫([BIILl/۟֨֫;)Ll/ۨ֨֫;

    move-result-object v4

    .line 262
    iget-object v6, v4, Ll/ۨ֨֫;->ܺ:Ll/ۗ֨֫;

    if-eqz v6, :cond_0

    .line 263
    iget v13, v6, Ll/ۗ֨֫;->ܿ:I

    iget-boolean v7, v6, Ll/ۗ֨֫;->ܳ:Z

    iget v14, v6, Ll/ۗ֨֫;->ᩳ:I

    iget v15, v6, Ll/ۗ֨֫;->ܽ:I

    iget-object v9, v6, Ll/ۗ֨֫;->֫:[I

    iget v6, v6, Ll/ۗ֨֫;->ۧ:I

    move-object/from16 v16, v9

    move/from16 v17, v7

    move/from16 v18, v6

    .line 264
    invoke-static/range {v13 .. v18}, Ll/ᩳۚ֫;->֫(III[IZI)Ljava/lang/String;

    move-result-object v9

    .line 272
    :cond_0
    new-instance v6, Ll/֨ᩴ֫;

    invoke-direct {v6}, Ll/֨ᩴ֫;-><init>()V

    .line 273
    invoke-virtual {v6, v8}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v7, "video/mp2t"

    .line 274
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v7, "video/hevc"

    .line 275
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 276
    invoke-virtual {v6, v9}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v7, v4, Ll/ۨ֨֫;->ۖ:I

    .line 277
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۙ(I)V

    iget v7, v4, Ll/ۨ֨֫;->ۜ:I

    .line 278
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۡ(I)V

    iget v7, v4, Ll/ۨ֨֫;->᩻:I

    .line 279
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۜ(I)V

    iget v7, v4, Ll/ۨ֨֫;->ܳ:I

    .line 280
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->᩻(I)V

    new-instance v7, Ll/ۜᩴ֫;

    invoke-direct {v7}, Ll/ۜᩴ֫;-><init>()V

    iget v8, v4, Ll/ۨ֨֫;->ᩳ:I

    .line 283
    invoke-virtual {v7, v8}, Ll/ۜᩴ֫;->ܽ(I)V

    iget v8, v4, Ll/ۨ֨֫;->ܽ:I

    .line 284
    invoke-virtual {v7, v8}, Ll/ۜᩴ֫;->ۧ(I)V

    iget v8, v4, Ll/ۨ֨֫;->ܿ:I

    .line 285
    invoke-virtual {v7, v8}, Ll/ۜᩴ֫;->ᩳ(I)V

    iget v8, v4, Ll/ۨ֨֫;->ۧ:I

    add-int/lit8 v8, v8, 0x8

    .line 286
    invoke-virtual {v7, v8}, Ll/ۜᩴ֫;->ܿ(I)V

    iget v8, v4, Ll/ۨ֨֫;->֫:I

    add-int/lit8 v8, v8, 0x8

    .line 287
    invoke-virtual {v7, v8}, Ll/ۜᩴ֫;->֫(I)V

    .line 288
    invoke-virtual {v7}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v7

    .line 281
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    iget v7, v4, Ll/ۨ֨֫;->ۡ:F

    .line 289
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۧ(F)V

    iget v7, v4, Ll/ۨ֨֫;->᩷:I

    .line 290
    invoke-virtual {v6, v7}, Ll/֨ᩴ֫;->ۘ(I)V

    iget v4, v4, Ll/ۨ֨֫;->ۢ:I

    const/4 v7, 0x1

    add-int/2addr v4, v7

    .line 291
    invoke-virtual {v6, v4}, Ll/֨ᩴ֫;->ᩴ(I)V

    .line 292
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v6, v4}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 293
    invoke-virtual {v6}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v4

    iget v6, v4, Ll/۠ᩴ֫;->۬:I

    .line 220
    iget-object v8, v0, Ll/᩸֡ۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-interface {v8, v4}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    const/4 v4, -0x1

    if-eq v6, v4, :cond_1

    const/4 v12, 0x1

    .line 221
    :cond_1
    invoke-static {v12}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 222
    invoke-virtual {v5, v6}, Ll/ܳۚۧ;->֫(I)V

    .line 223
    iput-boolean v7, v0, Ll/᩸֡ۧ;->ۧ:Z

    .line 226
    :cond_2
    iget-object v4, v0, Ll/᩸֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v4, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    move-result v6

    const/4 v7, 0x5

    iget-object v8, v0, Ll/᩸֡ۧ;->ۢ:Ll/ᩳ֨֫;

    if-eqz v6, :cond_3

    .line 227
    iget-object v6, v4, Ll/ۛ֡ۧ;->ܽ:[B

    iget v9, v4, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v9, v6}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v6

    .line 228
    iget-object v4, v4, Ll/ۛ֡ۧ;->ܽ:[B

    invoke-virtual {v8, v6, v4}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 231
    invoke-virtual {v8, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 232
    invoke-virtual {v5, v2, v3, v8}, Ll/ܳۚۧ;->֫(JLl/ᩳ֨֫;)V

    .line 234
    :cond_3
    iget-object v4, v0, Ll/᩸֡ۧ;->ܺ:Ll/ۛ֡ۧ;

    invoke-virtual {v4, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 235
    iget-object v1, v4, Ll/ۛ֡ۧ;->ܽ:[B

    iget v6, v4, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v6, v1}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v1

    .line 236
    iget-object v4, v4, Ll/ۛ֡ۧ;->ܽ:[B

    invoke-virtual {v8, v1, v4}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 239
    invoke-virtual {v8, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 240
    invoke-virtual {v5, v2, v3, v8}, Ll/ܳۚۧ;->֫(JLl/ᩳ֨֫;)V

    :cond_4
    return-void
.end method

.method private ֫(II[B)V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    .line 201
    iget-object v0, p0, Ll/᩸֡ۧ;->ۜ:Ll/ܶ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܶ֡ۧ;->֫(II[B)V

    .line 202
    iget-boolean v0, p0, Ll/᩸֡ۧ;->ۧ:Z

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Ll/᩸֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 204
    iget-object v0, p0, Ll/᩸֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 205
    iget-object v0, p0, Ll/᩸֡ۧ;->ܿ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 207
    :cond_0
    iget-object v0, p0, Ll/᩸֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 208
    iget-object v0, p0, Ll/᩸֡ۧ;->ܺ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    return-void
.end method

.method private ۧ(IIJJ)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Ll/᩸֡ۧ;->ۜ:Ll/ܶ֡ۧ;

    iget-boolean v7, p0, Ll/᩸֡ۧ;->ۧ:Z

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-wide v5, p5

    invoke-virtual/range {v0 .. v7}, Ll/ܶ֡ۧ;->֫(IIJJZ)V

    .line 190
    iget-boolean p1, p0, Ll/᩸֡ۧ;->ۧ:Z

    if-nez p1, :cond_0

    .line 191
    iget-object p1, p0, Ll/᩸֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {p1, p2}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 192
    iget-object p1, p0, Ll/᩸֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {p1, p2}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 193
    iget-object p1, p0, Ll/᩸֡ۧ;->ܿ:Ll/ۛ֡ۧ;

    invoke-virtual {p1, p2}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 195
    :cond_0
    iget-object p1, p0, Ll/᩸֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {p1, p2}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 196
    iget-object p1, p0, Ll/᩸֡ۧ;->ܺ:Ll/ۛ֡ۧ;

    invoke-virtual {p1, p2}, Ll/ۛ֡ۧ;->ۧ(I)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 87
    iput-wide v0, p0, Ll/᩸֡ۧ;->ۖ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 88
    iput-wide v0, p0, Ll/᩸֡ۧ;->ᩳ:J

    .line 89
    iget-object v0, p0, Ll/᩸֡ۧ;->ܳ:[Z

    invoke-static {v0}, Ll/ܽ۠֫;->֫([Z)V

    .line 90
    iget-object v0, p0, Ll/᩸֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 91
    iget-object v0, p0, Ll/᩸֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 92
    iget-object v0, p0, Ll/᩸֡ۧ;->ܿ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 93
    iget-object v0, p0, Ll/᩸֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 94
    iget-object v0, p0, Ll/᩸֡ۧ;->ܺ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 95
    iget-object v0, p0, Ll/᩸֡ۧ;->᩷:Ll/ܳۚۧ;

    invoke-virtual {v0}, Ll/ܳۚۧ;->֫()V

    .line 96
    iget-object v0, p0, Ll/᩸֡ۧ;->ۜ:Ll/ܶ֡ۧ;

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v0}, Ll/ܶ֡ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 113
    iput-wide p2, p0, Ll/᩸֡ۧ;->ᩳ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 17

    move-object/from16 v7, p0

    .line 298
    iget-object v0, v7, Ll/᩸֡ۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 299
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 120
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_5

    .line 121
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 122
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v8

    .line 123
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    .line 126
    iget-wide v1, v7, Ll/᩸֡ۧ;->ۖ:J

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v7, Ll/᩸֡ۧ;->ۖ:J

    .line 127
    iget-object v1, v7, Ll/᩸֡ۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    move-object/from16 v10, p1

    invoke-interface {v1, v2, v10}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    :goto_0
    if-ge v0, v8, :cond_0

    .line 131
    iget-object v1, v7, Ll/᩸֡ۧ;->ܳ:[Z

    invoke-static {v0, v8, v9, v1}, Ll/ܽ۠֫;->֫(II[B[Z)I

    move-result v1

    if-ne v1, v8, :cond_1

    .line 135
    invoke-direct {v7, v0, v8, v9}, Ll/᩸֡ۧ;->֫(II[B)V

    return-void

    :cond_1
    add-int/lit8 v2, v1, 0x3

    .line 764
    aget-byte v2, v9, v2

    and-int/lit8 v2, v2, 0x7e

    shr-int/lit8 v11, v2, 0x1

    if-lez v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    .line 145
    aget-byte v2, v9, v2

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x4

    move v12, v1

    const/4 v13, 0x4

    goto :goto_1

    :cond_2
    const/4 v2, 0x3

    move v12, v1

    const/4 v13, 0x3

    :goto_1
    sub-int v1, v12, v0

    if-lez v1, :cond_3

    .line 154
    invoke-direct {v7, v0, v12, v9}, Ll/᩸֡ۧ;->֫(II[B)V

    :cond_3
    sub-int v14, v8, v12

    .line 158
    iget-wide v2, v7, Ll/᩸֡ۧ;->ۖ:J

    int-to-long v4, v14

    sub-long v15, v2, v4

    if-gez v1, :cond_4

    neg-int v0, v1

    move v2, v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 165
    :goto_2
    iget-wide v5, v7, Ll/᩸֡ۧ;->ᩳ:J

    move-object/from16 v0, p0

    move v1, v14

    move-wide v3, v15

    .line 162
    invoke-direct/range {v0 .. v6}, Ll/᩸֡ۧ;->֫(IIJJ)V

    .line 168
    iget-wide v5, v7, Ll/᩸֡ۧ;->ᩳ:J

    move v2, v11

    invoke-direct/range {v0 .. v6}, Ll/᩸֡ۧ;->ۧ(IIJJ)V

    add-int v0, v12, v13

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 2

    .line 103
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 104
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸֡ۧ;->֫:Ljava/lang/String;

    .line 105
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸֡ۧ;->ܽ:Ll/᩵ۢۧ;

    .line 106
    new-instance v1, Ll/ܶ֡ۧ;

    invoke-direct {v1, v0}, Ll/ܶ֡ۧ;-><init>(Ll/᩵ۢۧ;)V

    iput-object v1, p0, Ll/᩸֡ۧ;->ۜ:Ll/ܶ֡ۧ;

    .line 107
    iget-object v0, p0, Ll/᩸֡ۧ;->᩷:Ll/ܳۚۧ;

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 14

    .line 298
    iget-object v0, p0, Ll/᩸֡ۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 299
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 179
    iget-object p1, p0, Ll/᩸֡ۧ;->᩷:Ll/ܳۚۧ;

    invoke-virtual {p1}, Ll/ܳۚۧ;->ۧ()V

    .line 182
    iget-wide v3, p0, Ll/᩸֡ۧ;->ۖ:J

    const/4 v2, 0x0

    iget-wide v5, p0, Ll/᩸֡ۧ;->ᩳ:J

    const/4 v1, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ll/᩸֡ۧ;->֫(IIJJ)V

    .line 183
    iget-wide v10, p0, Ll/᩸֡ۧ;->ۖ:J

    const/16 v9, 0x30

    iget-wide v12, p0, Ll/᩸֡ۧ;->ᩳ:J

    const/4 v8, 0x0

    move-object v7, p0

    invoke-direct/range {v7 .. v13}, Ll/᩸֡ۧ;->ۧ(IIJJ)V

    :cond_0
    return-void
.end method
