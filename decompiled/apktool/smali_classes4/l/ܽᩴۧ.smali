.class public final Ll/ܽᩴۧ;
.super Ljava/lang/Object;
.source "88N4"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:I

.field public final ۜ:Ll/ۢᩴۧ;

.field public ۢ:Ll/᩵ۢۧ;

.field public final ۧ:Ll/۠ᩴ֫;

.field public ܳ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:J

.field public final ᩳ:Ll/ᩳ֨֫;

.field public ᩷:[J

.field public ᩻:[B


# direct methods
.method public constructor <init>(Ll/ۢᩴۧ;)V
    .locals 2

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Ll/ܽᩴۧ;->ۜ:Ll/ۢᩴۧ;

    .line 114
    sget-object p1, Ll/ۘ֨֫;->ܿ:[B

    iput-object p1, p0, Ll/ܽᩴۧ;->᩻:[B

    .line 115
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ܽᩴۧ;->ᩳ:Ll/ᩳ֨֫;

    const/4 p1, 0x0

    .line 126
    iput-object p1, p0, Ll/ܽᩴۧ;->ۧ:Ll/۠ᩴ֫;

    .line 127
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܽᩴۧ;->ܽ:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 128
    iput p1, p0, Ll/ܽᩴۧ;->ܳ:I

    .line 129
    sget-object p1, Ll/ۘ֨֫;->ܳ:[J

    iput-object p1, p0, Ll/ܽᩴۧ;->᩷:[J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 130
    iput-wide v0, p0, Ll/ܽᩴۧ;->ܿ:J

    return-void
.end method

.method private ֫(Ll/ۧᩴۧ;)V
    .locals 8

    .line 289
    iget-object v0, p0, Ll/ܽᩴۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 290
    invoke-static {p1}, Ll/ۧᩴۧ;->֫(Ll/ۧᩴۧ;)[B

    move-result-object v0

    array-length v5, v0

    .line 291
    invoke-static {p1}, Ll/ۧᩴۧ;->֫(Ll/ۧᩴۧ;)[B

    move-result-object v0

    iget-object v1, p0, Ll/ܽᩴۧ;->ᩳ:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 292
    iget-object v0, p0, Ll/ܽᩴۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-interface {v0, v5, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 293
    iget-object v1, p0, Ll/ܽᩴۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-static {p1}, Ll/ۧᩴۧ;->ۧ(Ll/ۧᩴۧ;)J

    move-result-wide v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽᩴۧ;Ll/۬ۘۧ;)V
    .locals 6

    .line 257
    new-instance v0, Ll/ۧᩴۧ;

    iget-wide v1, p1, Ll/۬ۘۧ;->ᩳ:J

    iget-object v3, p1, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    iget-wide v4, p1, Ll/۬ۘۧ;->ۧ:J

    .line 260
    invoke-static {v4, v5, v3}, Ll/ۗۘۧ;->֫(JLjava/util/List;)[B

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ll/ۧᩴۧ;-><init>(J[B)V

    .line 261
    iget-object v1, p0, Ll/ܽᩴۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    iget-wide v1, p0, Ll/ܽᩴۧ;->ܿ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v3, p1, Ll/۬ۘۧ;->ܽ:J

    cmp-long p1, v3, v1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 263
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Ll/ܽᩴۧ;->֫(Ll/ۧᩴۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 159
    iget v2, v1, Ll/ܽᩴۧ;->ܳ:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/4 v5, 0x5

    if-eq v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 160
    iget v2, v1, Ll/ܽᩴۧ;->ܳ:I

    const/4 v5, 0x2

    const/16 v6, 0x400

    const-wide/16 v7, -0x1

    if-ne v2, v3, :cond_3

    .line 162
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v9

    cmp-long v2, v9, v7

    if-eqz v2, :cond_1

    .line 163
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v9

    invoke-static {v9, v10}, Ll/۬᩺ܺ;->֫(J)I

    move-result v2

    goto :goto_1

    :cond_1
    const/16 v2, 0x400

    .line 165
    :goto_1
    iget-object v9, v1, Ll/ܽᩴۧ;->᩻:[B

    array-length v9, v9

    if-le v2, v9, :cond_2

    .line 166
    new-array v2, v2, [B

    iput-object v2, v1, Ll/ܽᩴۧ;->᩻:[B

    .line 168
    :cond_2
    iput v4, v1, Ll/ܽᩴۧ;->֫:I

    .line 169
    iput v5, v1, Ll/ܽᩴۧ;->ܳ:I

    .line 171
    :cond_3
    iget v2, v1, Ll/ܽᩴۧ;->ܳ:I

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v4, v1, Ll/ܽᩴۧ;->ܽ:Ljava/util/ArrayList;

    const/4 v11, 0x4

    const/4 v12, -0x1

    if-ne v2, v5, :cond_a

    .line 224
    iget-object v2, v1, Ll/ܽᩴۧ;->᩻:[B

    array-length v5, v2

    iget v13, v1, Ll/ܽᩴۧ;->֫:I

    if-ne v5, v13, :cond_4

    .line 225
    array-length v5, v2

    add-int/2addr v5, v6

    .line 226
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    iput-object v2, v1, Ll/ܽᩴۧ;->᩻:[B

    .line 228
    :cond_4
    iget-object v2, v1, Ll/ܽᩴۧ;->᩻:[B

    iget v5, v1, Ll/ܽᩴۧ;->֫:I

    array-length v13, v2

    sub-int/2addr v13, v5

    .line 229
    invoke-interface {v0, v2, v5, v13}, Ll/ۢᩴ֫;->read([BII)I

    move-result v2

    if-eq v2, v12, :cond_5

    .line 232
    iget v5, v1, Ll/ܽᩴۧ;->֫:I

    add-int/2addr v5, v2

    iput v5, v1, Ll/ܽᩴۧ;->֫:I

    .line 234
    :cond_5
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v13

    cmp-long v5, v13, v7

    if-eqz v5, :cond_6

    .line 235
    iget v5, v1, Ll/ܽᩴۧ;->֫:I

    const/4 v15, 0x0

    int-to-long v6, v5

    cmp-long v5, v6, v13

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_6
    const/4 v15, 0x0

    :goto_2
    if-ne v2, v12, :cond_b

    .line 248
    :cond_7
    :try_start_0
    iget-wide v5, v1, Ll/ܽᩴۧ;->ܿ:J

    cmp-long v2, v5, v9

    if-eqz v2, :cond_8

    .line 249
    invoke-static {v5, v6}, Ll/᩷ᩴۧ;->֫(J)Ll/᩷ᩴۧ;

    move-result-object v2

    :goto_3
    move-object/from16 v20, v2

    goto :goto_4

    .line 250
    :cond_8
    invoke-static {}, Ll/᩷ᩴۧ;->ۧ()Ll/᩷ᩴۧ;

    move-result-object v2

    goto :goto_3

    .line 251
    :goto_4
    iget-object v2, v1, Ll/ܽᩴۧ;->ۜ:Ll/ۢᩴۧ;

    iget-object v5, v1, Ll/ܽᩴۧ;->᩻:[B

    iget v6, v1, Ll/ܽᩴۧ;->֫:I

    new-instance v7, Ll/ۖ֡ᩳ;

    const/4 v8, 0x2

    invoke-direct {v7, v8, v1}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    const/16 v18, 0x0

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    move/from16 v19, v6

    move-object/from16 v21, v7

    invoke-interface/range {v16 .. v21}, Ll/ۢᩴۧ;->֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V

    .line 266
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 267
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [J

    iput-object v2, v1, Ll/ܽᩴۧ;->᩷:[J

    const/4 v2, 0x0

    .line 268
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_9

    .line 269
    iget-object v5, v1, Ll/ܽᩴۧ;->᩷:[J

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۧᩴۧ;

    invoke-static {v6}, Ll/ۧᩴۧ;->ۧ(Ll/ۧᩴۧ;)J

    move-result-wide v6

    aput-wide v6, v5, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 271
    :cond_9
    sget-object v2, Ll/ۘ֨֫;->ܿ:[B

    iput-object v2, v1, Ll/ܽᩴۧ;->᩻:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    iput v11, v1, Ll/ܽᩴۧ;->ܳ:I

    goto :goto_6

    :catch_0
    move-exception v0

    const-string v2, "SubtitleParser failed."

    .line 273
    invoke-static {v2, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_a
    const/4 v15, 0x0

    .line 178
    :cond_b
    :goto_6
    iget v2, v1, Ll/ܽᩴۧ;->ܳ:I

    const/4 v5, 0x3

    if-ne v2, v5, :cond_f

    .line 216
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-eqz v2, :cond_c

    .line 217
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll/۬᩺ܺ;->֫(J)I

    move-result v6

    goto :goto_7

    :cond_c
    const/16 v6, 0x400

    .line 215
    :goto_7
    invoke-interface {v0, v6}, Ll/۠᩷ۧ;->ۧ(I)I

    move-result v0

    if-ne v0, v12, :cond_f

    .line 279
    iget-wide v5, v1, Ll/ܽᩴۧ;->ܿ:J

    cmp-long v0, v5, v9

    if-nez v0, :cond_d

    const/4 v0, 0x0

    goto :goto_8

    .line 281
    :cond_d
    iget-object v0, v1, Ll/ܽᩴۧ;->᩷:[J

    invoke-static {v0, v5, v6, v3}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v0

    .line 283
    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_e

    .line 284
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩴۧ;

    invoke-direct {v1, v2}, Ll/ܽᩴۧ;->֫(Ll/ۧᩴۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 182
    :cond_e
    iput v11, v1, Ll/ܽᩴۧ;->ܳ:I

    .line 185
    :cond_f
    iget v0, v1, Ll/ܽᩴۧ;->ܳ:I

    if-ne v0, v11, :cond_10

    return v12

    :cond_10
    return v15
.end method

.method public final ֫()V
    .locals 2

    .line 206
    iget v0, p0, Ll/ܽᩴۧ;->ܳ:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    return-void

    .line 209
    :cond_0
    iget-object v0, p0, Ll/ܽᩴۧ;->ۜ:Ll/ۢᩴۧ;

    invoke-interface {v0}, Ll/ۢᩴۧ;->reset()V

    .line 210
    iput v1, p0, Ll/ܽᩴۧ;->ܳ:I

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 193
    iget p1, p0, Ll/ܽᩴۧ;->ܳ:I

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 194
    iput-wide p3, p0, Ll/ܽᩴۧ;->ܿ:J

    .line 195
    iget p1, p0, Ll/ܽᩴۧ;->ܳ:I

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    .line 196
    iput p2, p0, Ll/ܽᩴۧ;->ܳ:I

    .line 198
    :cond_1
    iget p1, p0, Ll/ܽᩴۧ;->ܳ:I

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    const/4 p1, 0x3

    .line 199
    iput p1, p0, Ll/ܽᩴۧ;->ܳ:I

    :cond_2
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 7

    .line 143
    iget v0, p0, Ll/ܽᩴۧ;->ܳ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 v0, 0x3

    .line 144
    invoke-interface {p1, v1, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽᩴۧ;->ۢ:Ll/᩵ۢۧ;

    .line 145
    iget-object v3, p0, Ll/ܽᩴۧ;->ۧ:Ll/۠ᩴ֫;

    if-eqz v3, :cond_1

    .line 146
    invoke-interface {v0, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 147
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 148
    new-instance v0, Ll/ᩳۢۧ;

    new-array v3, v2, [J

    const-wide/16 v4, 0x0

    aput-wide v4, v3, v1

    new-array v6, v2, [J

    aput-wide v4, v6, v1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v4, v5, v3, v6}, Ll/ᩳۢۧ;-><init>(J[J[J)V

    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 154
    :cond_1
    iput v2, p0, Ll/ܽᩴۧ;->ܳ:I

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 0

    const/4 p1, 0x1

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
