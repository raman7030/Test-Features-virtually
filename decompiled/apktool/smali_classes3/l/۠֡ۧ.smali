.class public final Ll/۠֡ۧ;
.super Ljava/lang/Object;
.source "O8V0"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public final ֫:Z

.field public final ۖ:Ll/ᩳ֨֫;

.field public final ۘ:Ll/ۛ֡ۧ;

.field public final ۜ:[Z

.field public final ۡ:Ll/ۛ֡ۧ;

.field public ۢ:Ll/֨֡ۧ;

.field public final ۧ:Z

.field public ܳ:J

.field public final ܺ:Ll/ܳۚۧ;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/᩵ۢۧ;

.field public ᩳ:Z

.field public ᩴ:J

.field public ᩷:Z

.field public final ᩻:Ll/ۛ֡ۧ;


# direct methods
.method public constructor <init>(Ll/ܳۚۧ;ZZ)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Ll/۠֡ۧ;->ܺ:Ll/ܳۚۧ;

    .line 88
    iput-boolean p2, p0, Ll/۠֡ۧ;->֫:Z

    .line 89
    iput-boolean p3, p0, Ll/۠֡ۧ;->ۧ:Z

    const/4 p1, 0x3

    new-array p1, p1, [Z

    .line 91
    iput-object p1, p0, Ll/۠֡ۧ;->ۜ:[Z

    .line 92
    new-instance p1, Ll/ۛ֡ۧ;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/۠֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    .line 93
    new-instance p1, Ll/ۛ֡ۧ;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/۠֡ۧ;->᩻:Ll/ۛ֡ۧ;

    .line 94
    new-instance p1, Ll/ۛ֡ۧ;

    const/4 p2, 0x6

    invoke-direct {p1, p2}, Ll/ۛ֡ۧ;-><init>(I)V

    iput-object p1, p0, Ll/۠֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    iput-wide p1, p0, Ll/۠֡ۧ;->ܳ:J

    .line 96
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/۠֡ۧ;->ۖ:Ll/ᩳ֨֫;

    return-void
.end method

.method private ֫(IIJJ)V
    .locals 16
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output",
            "sampleReader"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 219
    iget-boolean v2, v0, Ll/۠֡ۧ;->ᩳ:Z

    const/4 v3, 0x0

    const/4 v4, 0x4

    iget-object v5, v0, Ll/۠֡ۧ;->ܺ:Ll/ܳۚۧ;

    if-eqz v2, :cond_0

    iget-object v2, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v2}, Ll/֨֡ۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 220
    :cond_0
    iget-object v2, v0, Ll/۠֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v2, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    .line 221
    iget-object v6, v0, Ll/۠֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v6, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    .line 222
    iget-boolean v7, v0, Ll/۠֡ۧ;->ᩳ:Z

    const/4 v8, 0x3

    if-nez v7, :cond_1

    .line 223
    invoke-virtual {v2}, Ll/ۛ֡ۧ;->֫()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Ll/ۛ֡ۧ;->֫()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 224
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 225
    iget-object v9, v2, Ll/ۛ֡ۧ;->ܽ:[B

    iget v10, v2, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    iget-object v9, v6, Ll/ۛ֡ۧ;->ܽ:[B

    iget v10, v6, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    iget-object v9, v2, Ll/ۛ֡ۧ;->ܽ:[B

    iget v10, v2, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v8, v10, v9}, Ll/ܽ۠֫;->ܽ(II[B)Ll/ۧ۠֫;

    move-result-object v9

    iget v10, v9, Ll/ۧ۠֫;->ܺ:I

    .line 228
    iget-object v11, v6, Ll/ۛ֡ۧ;->ܽ:[B

    iget v12, v6, Ll/ۛ֡ۧ;->ᩳ:I

    .line 1762
    new-instance v13, Ll/ᩳ۠֫;

    invoke-direct {v13, v11, v4, v12}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 1763
    invoke-virtual {v13}, Ll/ᩳ۠֫;->ܿ()I

    move-result v11

    .line 1764
    invoke-virtual {v13}, Ll/ᩳ۠֫;->ܿ()I

    move-result v12

    .line 1765
    invoke-virtual {v13}, Ll/ᩳ۠֫;->ܳ()V

    .line 1766
    invoke-virtual {v13}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v13

    .line 1767
    new-instance v14, Ll/֫۠֫;

    invoke-direct {v14, v11, v12, v13}, Ll/֫۠֫;-><init>(IIZ)V

    .line 229
    iget v11, v9, Ll/ۧ۠֫;->᩵:I

    iget v12, v9, Ll/ۧ۠֫;->ܳ:I

    iget v13, v9, Ll/ۧ۠֫;->ۡ:I

    .line 230
    sget v15, Ll/ᩳۚ֫;->֫:I

    .line 312
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v11, v8, v3

    const/4 v11, 0x1

    aput-object v12, v8, v11

    const/4 v12, 0x2

    aput-object v13, v8, v12

    const-string v12, "avc1.%02X%02X%02X"

    .line 311
    invoke-static {v12, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 234
    iget-object v12, v0, Ll/۠֡ۧ;->ܿ:Ll/᩵ۢۧ;

    new-instance v13, Ll/֨ᩴ֫;

    invoke-direct {v13}, Ll/֨ᩴ֫;-><init>()V

    iget-object v15, v0, Ll/۠֡ۧ;->ܽ:Ljava/lang/String;

    .line 236
    invoke-virtual {v13, v15}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v15, "video/mp2t"

    .line 237
    invoke-virtual {v13, v15}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v15, "video/avc"

    .line 238
    invoke-virtual {v13, v15}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 239
    invoke-virtual {v13, v8}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    iget v8, v9, Ll/ۧ۠֫;->֨:I

    .line 240
    invoke-virtual {v13, v8}, Ll/֨ᩴ֫;->ۙ(I)V

    iget v8, v9, Ll/ۧ۠֫;->ۢ:I

    .line 241
    invoke-virtual {v13, v8}, Ll/֨ᩴ֫;->ۡ(I)V

    new-instance v8, Ll/ۜᩴ֫;

    invoke-direct {v8}, Ll/ۜᩴ֫;-><init>()V

    iget v15, v9, Ll/ۧ۠֫;->ᩳ:I

    .line 244
    invoke-virtual {v8, v15}, Ll/ۜᩴ֫;->ܽ(I)V

    iget v15, v9, Ll/ۧ۠֫;->ܽ:I

    .line 245
    invoke-virtual {v8, v15}, Ll/ۜᩴ֫;->ۧ(I)V

    iget v15, v9, Ll/ۧ۠֫;->ܿ:I

    .line 246
    invoke-virtual {v8, v15}, Ll/ۜᩴ֫;->ᩳ(I)V

    iget v15, v9, Ll/ۧ۠֫;->ۧ:I

    add-int/lit8 v15, v15, 0x8

    .line 247
    invoke-virtual {v8, v15}, Ll/ۜᩴ֫;->ܿ(I)V

    iget v15, v9, Ll/ۧ۠֫;->֫:I

    add-int/lit8 v15, v15, 0x8

    .line 248
    invoke-virtual {v8, v15}, Ll/ۜᩴ֫;->֫(I)V

    .line 249
    invoke-virtual {v8}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v8

    .line 242
    invoke-virtual {v13, v8}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    iget v8, v9, Ll/ۧ۠֫;->ᩴ:F

    .line 250
    invoke-virtual {v13, v8}, Ll/֨ᩴ֫;->ۧ(F)V

    .line 251
    invoke-virtual {v13, v7}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 252
    invoke-virtual {v13, v10}, Ll/֨ᩴ֫;->ۘ(I)V

    .line 253
    invoke-virtual {v13}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v7

    .line 234
    invoke-interface {v12, v7}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 254
    iput-boolean v11, v0, Ll/۠֡ۧ;->ᩳ:Z

    .line 255
    invoke-virtual {v5, v10}, Ll/ܳۚۧ;->֫(I)V

    .line 256
    iget-object v7, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v7, v9}, Ll/֨֡ۧ;->֫(Ll/ۧ۠֫;)V

    .line 257
    iget-object v7, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v7, v14}, Ll/֨֡ۧ;->֫(Ll/֫۠֫;)V

    .line 258
    invoke-virtual {v2}, Ll/ۛ֡ۧ;->ۧ()V

    .line 259
    invoke-virtual {v6}, Ll/ۛ֡ۧ;->ۧ()V

    goto :goto_0

    .line 261
    :cond_1
    invoke-virtual {v2}, Ll/ۛ֡ۧ;->֫()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 262
    iget-object v6, v2, Ll/ۛ֡ۧ;->ܽ:[B

    iget v7, v2, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v8, v7, v6}, Ll/ܽ۠֫;->ܽ(II[B)Ll/ۧ۠֫;

    move-result-object v6

    .line 263
    iget v7, v6, Ll/ۧ۠֫;->ܺ:I

    invoke-virtual {v5, v7}, Ll/ܳۚۧ;->֫(I)V

    .line 264
    iget-object v7, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v7, v6}, Ll/֨֡ۧ;->֫(Ll/ۧ۠֫;)V

    .line 265
    invoke-virtual {v2}, Ll/ۛ֡ۧ;->ۧ()V

    goto :goto_0

    .line 266
    :cond_2
    invoke-virtual {v6}, Ll/ۛ֡ۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 267
    iget-object v2, v6, Ll/ۛ֡ۧ;->ܽ:[B

    iget v7, v6, Ll/ۛ֡ۧ;->ᩳ:I

    .line 1762
    new-instance v8, Ll/ᩳ۠֫;

    invoke-direct {v8, v2, v4, v7}, Ll/ᩳ۠֫;-><init>([BII)V

    .line 1763
    invoke-virtual {v8}, Ll/ᩳ۠֫;->ܿ()I

    move-result v2

    .line 1764
    invoke-virtual {v8}, Ll/ᩳ۠֫;->ܿ()I

    move-result v7

    .line 1765
    invoke-virtual {v8}, Ll/ᩳ۠֫;->ܳ()V

    .line 1766
    invoke-virtual {v8}, Ll/ᩳ۠֫;->ܽ()Z

    move-result v8

    .line 1767
    new-instance v9, Ll/֫۠֫;

    invoke-direct {v9, v2, v7, v8}, Ll/֫۠֫;-><init>(IIZ)V

    .line 268
    iget-object v2, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v2, v9}, Ll/֨֡ۧ;->֫(Ll/֫۠֫;)V

    .line 269
    invoke-virtual {v6}, Ll/ۛ֡ۧ;->ۧ()V

    .line 272
    :cond_3
    :goto_0
    iget-object v2, v0, Ll/۠֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v2, v1}, Ll/ۛ֡ۧ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 273
    iget-object v1, v2, Ll/ۛ֡ۧ;->ܽ:[B

    iget v6, v2, Ll/ۛ֡ۧ;->ᩳ:I

    invoke-static {v6, v1}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v1

    .line 274
    iget-object v2, v2, Ll/ۛ֡ۧ;->ܽ:[B

    iget-object v6, v0, Ll/۠֡ۧ;->ۖ:Ll/ᩳ֨֫;

    invoke-virtual {v6, v1, v2}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 275
    invoke-virtual {v6, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    move-wide/from16 v1, p5

    .line 276
    invoke-virtual {v5, v1, v2, v6}, Ll/ܳۚۧ;->֫(JLl/ᩳ֨֫;)V

    .line 278
    :cond_4
    iget-object v1, v0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    iget-boolean v2, v0, Ll/۠֡ۧ;->ᩳ:Z

    move/from16 v4, p1

    move-wide/from16 v5, p3

    invoke-virtual {v1, v5, v6, v4, v2}, Ll/֨֡ۧ;->֫(JIZ)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 283
    iput-boolean v3, v0, Ll/۠֡ۧ;->᩷:Z

    :cond_5
    return-void
.end method

.method private ֫(II[B)V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    .line 209
    iget-boolean v0, p0, Ll/۠֡ۧ;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v0}, Ll/֨֡ۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    :cond_0
    iget-object v0, p0, Ll/۠֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 211
    iget-object v0, p0, Ll/۠֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 213
    :cond_1
    iget-object v0, p0, Ll/۠֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛ֡ۧ;->֫(II[B)V

    .line 214
    iget-object v0, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/֨֡ۧ;->֫(II[B)V

    return-void
.end method

.method private ֫(JIJ)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sampleReader"
        }
    .end annotation

    .line 199
    iget-boolean v0, p0, Ll/۠֡ۧ;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    invoke-virtual {v0}, Ll/֨֡ۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    :cond_0
    iget-object v0, p0, Ll/۠֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p3}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 201
    iget-object v0, p0, Ll/۠֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p3}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 203
    :cond_1
    iget-object v0, p0, Ll/۠֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v0, p3}, Ll/ۛ֡ۧ;->ۧ(I)V

    .line 204
    iget-object v1, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    iget-boolean v7, p0, Ll/۠֡ۧ;->᩷:Z

    move v2, p3

    move-wide v3, p1

    move-wide v5, p4

    invoke-virtual/range {v1 .. v7}, Ll/֨֡ۧ;->֫(IJJZ)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 101
    iput-wide v0, p0, Ll/۠֡ۧ;->ᩴ:J

    const/4 v0, 0x0

    .line 102
    iput-boolean v0, p0, Ll/۠֡ۧ;->᩷:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    iput-wide v0, p0, Ll/۠֡ۧ;->ܳ:J

    .line 104
    iget-object v0, p0, Ll/۠֡ۧ;->ۜ:[Z

    invoke-static {v0}, Ll/ܽ۠֫;->֫([Z)V

    .line 105
    iget-object v0, p0, Ll/۠֡ۧ;->ۘ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 106
    iget-object v0, p0, Ll/۠֡ۧ;->᩻:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 107
    iget-object v0, p0, Ll/۠֡ۧ;->ۡ:Ll/ۛ֡ۧ;

    invoke-virtual {v0}, Ll/ۛ֡ۧ;->ۧ()V

    .line 108
    iget-object v0, p0, Ll/۠֡ۧ;->ܺ:Ll/ܳۚۧ;

    invoke-virtual {v0}, Ll/ܳۚۧ;->֫()V

    .line 109
    iget-object v0, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {v0}, Ll/֨֡ۧ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 125
    iput-wide p2, p0, Ll/۠֡ۧ;->ܳ:J

    .line 126
    iget-boolean p2, p0, Ll/۠֡ۧ;->᩷:Z

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Ll/۠֡ۧ;->᩷:Z

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 15

    move-object v7, p0

    .line 289
    iget-object v0, v7, Ll/۠֡ۧ;->ܿ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 290
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 133
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 134
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v8

    .line 135
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    .line 138
    iget-wide v1, v7, Ll/۠֡ۧ;->ᩴ:J

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v7, Ll/۠֡ۧ;->ᩴ:J

    .line 139
    iget-object v1, v7, Ll/۠֡ۧ;->ܿ:Ll/᩵ۢۧ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    move-object/from16 v3, p1

    invoke-interface {v1, v2, v3}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 143
    :goto_0
    iget-object v1, v7, Ll/۠֡ۧ;->ۜ:[Z

    invoke-static {v0, v8, v9, v1}, Ll/ܽ۠֫;->֫(II[B[Z)I

    move-result v1

    if-ne v1, v8, :cond_0

    .line 147
    invoke-direct {p0, v0, v8, v9}, Ll/۠֡ۧ;->֫(II[B)V

    return-void

    :cond_0
    add-int/lit8 v2, v1, 0x3

    .line 658
    aget-byte v2, v9, v2

    and-int/lit8 v10, v2, 0x1f

    if-lez v1, :cond_1

    add-int/lit8 v2, v1, -0x1

    .line 157
    aget-byte v2, v9, v2

    if-nez v2, :cond_1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x4

    move v11, v1

    const/4 v12, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    move v11, v1

    const/4 v12, 0x3

    :goto_1
    sub-int v1, v11, v0

    if-lez v1, :cond_2

    .line 166
    invoke-direct {p0, v0, v11, v9}, Ll/۠֡ۧ;->֫(II[B)V

    :cond_2
    sub-int v2, v8, v11

    .line 169
    iget-wide v3, v7, Ll/۠֡ۧ;->ᩴ:J

    int-to-long v5, v2

    sub-long v13, v3, v5

    if-gez v1, :cond_3

    neg-int v0, v1

    move v3, v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 176
    :goto_2
    iget-wide v5, v7, Ll/۠֡ۧ;->ܳ:J

    move-object v0, p0

    move v1, v2

    move v2, v3

    move-wide v3, v13

    .line 173
    invoke-direct/range {v0 .. v6}, Ll/۠֡ۧ;->֫(IIJJ)V

    .line 179
    iget-wide v4, v7, Ll/۠֡ۧ;->ܳ:J

    move-wide v1, v13

    move v3, v10

    invoke-direct/range {v0 .. v5}, Ll/۠֡ۧ;->֫(JIJ)V

    add-int v0, v11, v12

    goto :goto_0
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 4

    .line 116
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 117
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۠֡ۧ;->ܽ:Ljava/lang/String;

    .line 118
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/۠֡ۧ;->ܿ:Ll/᩵ۢۧ;

    .line 119
    new-instance v1, Ll/֨֡ۧ;

    iget-boolean v2, p0, Ll/۠֡ۧ;->֫:Z

    iget-boolean v3, p0, Ll/۠֡ۧ;->ۧ:Z

    invoke-direct {v1, v0, v2, v3}, Ll/֨֡ۧ;-><init>(Ll/᩵ۢۧ;ZZ)V

    iput-object v1, p0, Ll/۠֡ۧ;->ۢ:Ll/֨֡ۧ;

    .line 120
    iget-object v0, p0, Ll/۠֡ۧ;->ܺ:Ll/ܳۚۧ;

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 13

    .line 289
    iget-object v0, p0, Ll/۠֡ۧ;->ܿ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 290
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 189
    iget-object p1, p0, Ll/۠֡ۧ;->ܺ:Ll/ܳۚۧ;

    invoke-virtual {p1}, Ll/ܳۚۧ;->ۧ()V

    .line 191
    iget-wide v3, p0, Ll/۠֡ۧ;->ᩴ:J

    const/4 v2, 0x0

    iget-wide v5, p0, Ll/۠֡ۧ;->ܳ:J

    const/4 v1, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ll/۠֡ۧ;->֫(IIJJ)V

    .line 192
    iget-wide v8, p0, Ll/۠֡ۧ;->ᩴ:J

    const/16 v10, 0x9

    iget-wide v11, p0, Ll/۠֡ۧ;->ܳ:J

    move-object v7, p0

    invoke-direct/range {v7 .. v12}, Ll/۠֡ۧ;->֫(JIJ)V

    .line 193
    iget-wide v3, p0, Ll/۠֡ۧ;->ᩴ:J

    iget-wide v5, p0, Ll/۠֡ۧ;->ܳ:J

    invoke-direct/range {v0 .. v6}, Ll/۠֡ۧ;->֫(IIJJ)V

    :cond_0
    return-void
.end method
