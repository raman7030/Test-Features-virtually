.class public final Ll/᩹ܽۧ;
.super Ljava/lang/Object;
.source "T8N8"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/ᩳܳۧ;


# instance fields
.field public final ֫֫:Z

.field public final ۗ:Ll/۠ᩴ֫;

.field public final ۙ:Ll/۠ۧۧ;

.field public ۛ:[B

.field public final ۟:Ll/֡ܶ֫;

.field public ۤ:Z

.field public ۨ:I

.field public final ۫:Ll/ۡܳۧ;

.field public final ۬:Ll/ۧܳۧ;

.field public final ܰ:Ll/ۛܽۧ;

.field public final ᩶:J

.field public final ᩸:Ll/ܶ۠֫;

.field public final ᩹:Ll/ۗ۠֫;

.field public final ᩺:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗ۠֫;Ll/ܶ۠֫;Ll/֡ܶ֫;Ll/۠ᩴ֫;JLl/ۧܳۧ;Ll/۠ۧۧ;ZLl/۠ܳۧ;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Ll/᩹ܽۧ;->᩹:Ll/ۗ۠֫;

    .line 87
    iput-object p2, p0, Ll/᩹ܽۧ;->᩸:Ll/ܶ۠֫;

    .line 88
    iput-object p3, p0, Ll/᩹ܽۧ;->۟:Ll/֡ܶ֫;

    .line 89
    iput-object p4, p0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    .line 90
    iput-wide p5, p0, Ll/᩹ܽۧ;->᩶:J

    .line 91
    iput-object p7, p0, Ll/᩹ܽۧ;->۬:Ll/ۧܳۧ;

    .line 92
    iput-object p8, p0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    .line 93
    iput-boolean p9, p0, Ll/᩹ܽۧ;->֫֫:Z

    .line 94
    new-instance p1, Ll/ۛܽۧ;

    new-instance p2, Ll/۬᩵֫;

    const/4 p3, 0x1

    new-array p5, p3, [Ll/۠ᩴ֫;

    const/4 p6, 0x0

    aput-object p4, p5, p6

    const-string p4, ""

    .line 76
    invoke-direct {p2, p4, p5}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    new-array p3, p3, [Ll/۬᩵֫;

    aput-object p2, p3, p6

    .line 94
    invoke-direct {p1, p3}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    iput-object p1, p0, Ll/᩹ܽۧ;->ܰ:Ll/ۛܽۧ;

    .line 95
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩹ܽۧ;->᩺:Ljava/util/ArrayList;

    if-eqz p10, :cond_0

    .line 98
    new-instance p1, Ll/ۡܳۧ;

    invoke-direct {p1, p10}, Ll/ۡܳۧ;-><init>(Ll/۠ܳۧ;)V

    goto :goto_0

    .line 99
    :cond_0
    new-instance p1, Ll/ۡܳۧ;

    const-string p2, "SingleSampleMediaPeriod"

    invoke-direct {p1, p2}, Ll/ۡܳۧ;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ܽۧ;)Ll/۠ۧۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫(J)J
    .locals 3

    const/4 v0, 0x0

    .line 192
    :goto_0
    iget-object v1, p0, Ll/᩹ܽۧ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 193
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶܽۧ;

    invoke-virtual {v1}, Ll/ܶܽۧ;->ۧ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 0

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 4

    const/4 v0, 0x0

    .line 128
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 129
    aget-object v1, p3, v0

    iget-object v2, p0, Ll/᩹ܽۧ;->᩺:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    aget-object v3, p1, v0

    if-eqz v3, :cond_0

    aget-boolean v3, p2, v0

    if-nez v3, :cond_1

    .line 130
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 131
    aput-object v1, p3, v0

    .line 133
    :cond_1
    aget-object v1, p3, v0

    if-nez v1, :cond_2

    aget-object v1, p1, v0

    if-eqz v1, :cond_2

    .line 134
    new-instance v1, Ll/ܶܽۧ;

    invoke-direct {v1, p0}, Ll/ܶܽۧ;-><init>(Ll/᩹ܽۧ;)V

    .line 135
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    aput-object v1, p3, v0

    const/4 v1, 0x1

    .line 137
    aput-boolean v1, p4, v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-wide p5
.end method

.method public final ֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p6

    move/from16 v1, p7

    .line 50
    move-object/from16 v2, p1

    check-cast v2, Ll/᩸ܽۧ;

    .line 292
    invoke-static {v2}, Ll/᩸ܽۧ;->֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    .line 293
    new-instance v3, Ll/ۧۧۧ;

    .line 297
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v4, p4

    .line 301
    invoke-direct {v3, v4, v5, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 302
    iget-wide v4, v0, Ll/᩹ܽۧ;->᩶:J

    .line 310
    invoke-static {v4, v5}, Ll/ۘ֨֫;->ۧ(J)J

    .line 311
    new-instance v2, Ll/֫ܳۧ;

    invoke-direct {v2, v12, v1}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 312
    iget-object v4, v0, Ll/᩹ܽۧ;->۬:Ll/ۧܳۧ;

    invoke-interface {v4, v2}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x0

    const/4 v9, 0x1

    cmp-long v10, v5, v7

    if-eqz v10, :cond_1

    .line 317
    invoke-interface {v4, v9}, Ll/ۧܳۧ;->֫(I)I

    move-result v4

    if-lt v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 320
    :goto_1
    iget-boolean v4, v0, Ll/᩹ܽۧ;->֫֫:Z

    if-eqz v4, :cond_2

    if-eqz v1, :cond_2

    const-string v1, "Loading failed, treating as end-of-stream."

    .line 321
    invoke-static {v1, v12}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    iput-boolean v9, v0, Ll/᩹ܽۧ;->ۤ:Z

    .line 323
    sget-object v1, Ll/ۡܳۧ;->ᩳ:Ll/ܿܳۧ;

    goto :goto_2

    :cond_2
    if-eqz v10, :cond_3

    .line 327
    invoke-static {v5, v6, v2}, Ll/ۡܳۧ;->֫(JZ)Ll/ܿܳۧ;

    move-result-object v1

    goto :goto_2

    .line 328
    :cond_3
    sget-object v1, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    :goto_2
    move-object v14, v1

    .line 330
    invoke-virtual {v14}, Ll/ܿܳۧ;->֫()Z

    move-result v1

    xor-int/lit8 v13, v1, 0x1

    const-wide/16 v8, 0x0

    .line 331
    iget-wide v10, v0, Ll/᩹ܽۧ;->᩶:J

    iget-object v1, v0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    const/4 v4, 0x1

    const/4 v5, -0x1

    iget-object v6, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    const/4 v7, 0x0

    const/4 v15, 0x0

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move v6, v7

    move-object v7, v15

    move-object/from16 v12, p6

    invoke-virtual/range {v1 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v14
.end method

.method public final ֫(JZ)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 0

    .line 108
    invoke-interface {p1, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJ)V
    .locals 13

    move-object v0, p0

    .line 50
    move-object v1, p1

    check-cast v1, Ll/᩸ܽۧ;

    .line 235
    invoke-static {v1}, Ll/᩸ܽۧ;->֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩴܶ֫;->ܳ()J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Ll/᩹ܽۧ;->ۨ:I

    .line 236
    invoke-static {v1}, Ll/᩸ܽۧ;->ۧ(Ll/᩸ܽۧ;)[B

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    iput-object v2, v0, Ll/᩹ܽۧ;->ۛ:[B

    const/4 v2, 0x1

    .line 237
    iput-boolean v2, v0, Ll/᩹ܽۧ;->ۤ:Z

    .line 238
    invoke-static {v1}, Ll/᩸ܽۧ;->֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;

    move-result-object v1

    .line 239
    new-instance v3, Ll/ۧۧۧ;

    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    invoke-virtual {v1}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v1

    move-wide/from16 v4, p4

    invoke-direct {v3, v4, v5, v1}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 248
    iget-object v1, v0, Ll/᩹ܽۧ;->۬:Ll/ۧܳۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v9, 0x0

    .line 249
    iget-wide v11, v0, Ll/᩹ܽۧ;->᩶:J

    iget-object v2, v0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    const/4 v4, 0x1

    const/4 v5, -0x1

    iget-object v6, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v12}, Ll/۠ۧۧ;->ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJI)V
    .locals 15

    move-object v0, p0

    .line 50
    move-object/from16 v1, p1

    check-cast v1, Ll/᩸ܽۧ;

    .line 208
    invoke-static {v1}, Ll/᩸ܽۧ;->֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;

    move-result-object v2

    if-nez p6, :cond_0

    .line 211
    new-instance v2, Ll/ۧۧۧ;

    iget-object v1, v1, Ll/᩸ܽۧ;->ۧ:Ll/ۗ۠֫;

    invoke-direct {v2, v1}, Ll/ۧۧۧ;-><init>(Ll/ۗ۠֫;)V

    move-object v4, v2

    goto :goto_0

    .line 212
    :cond_0
    new-instance v1, Ll/ۧۧۧ;

    .line 215
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    invoke-virtual {v2}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v2

    move-wide/from16 v3, p4

    .line 219
    invoke-direct {v1, v3, v4, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    move-object v4, v1

    :goto_0
    const-wide/16 v10, 0x0

    .line 220
    iget-wide v12, v0, Ll/᩹ܽۧ;->᩶:J

    iget-object v3, v0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    const/4 v5, 0x1

    const/4 v6, -0x1

    iget-object v7, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v14, p6

    invoke-virtual/range {v3 .. v14}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJZ)V
    .locals 13

    move-object v0, p0

    .line 50
    move-object v1, p1

    check-cast v1, Ll/᩸ܽۧ;

    .line 263
    invoke-static {v1}, Ll/᩸ܽۧ;->֫(Ll/᩸ܽۧ;)Ll/ᩴܶ֫;

    move-result-object v1

    .line 264
    new-instance v3, Ll/ۧۧۧ;

    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    invoke-virtual {v1}, Ll/ᩴܶ֫;->ۜ()Ljava/util/Map;

    move-result-object v1

    move-wide/from16 v4, p4

    .line 272
    invoke-direct {v3, v4, v5, v1}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 273
    iget-object v1, v0, Ll/᩹ܽۧ;->۬:Ll/ۧܳۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v9, 0x0

    .line 274
    iget-wide v11, v0, Ll/᩹ܽۧ;->᩶:J

    iget-object v2, v0, Ll/᩹ܽۧ;->ۙ:Ll/۠ۧۧ;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v12}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 172
    iget-object v0, p0, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 3

    .line 155
    iget-boolean p1, p0, Ll/᩹ܽۧ;->ۤ:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    invoke-virtual {p1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ll/ۡܳۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Ll/᩹ܽۧ;->᩸:Ll/ܶ۠֫;

    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    .line 159
    iget-object v1, p0, Ll/᩹ܽۧ;->۟:Ll/֡ܶ֫;

    if-eqz v1, :cond_1

    .line 160
    invoke-interface {v0, v1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    .line 162
    :cond_1
    new-instance v1, Ll/᩸ܽۧ;

    iget-object v2, p0, Ll/᩹ܽۧ;->᩹:Ll/ۗ۠֫;

    invoke-direct {v1, v0, v2}, Ll/᩸ܽۧ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V

    .line 163
    iget-object v0, p0, Ll/᩹ܽۧ;->۬:Ll/ۧܳۧ;

    const/4 v2, 0x1

    .line 166
    invoke-interface {v0, v2}, Ll/ۧܳۧ;->֫(I)I

    move-result v0

    .line 163
    invoke-virtual {p1, v1, p0, v0}, Ll/ۡܳۧ;->֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V

    return v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 187
    iget-boolean v0, p0, Ll/᩹ܽۧ;->ۤ:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 182
    iget-boolean v0, p0, Ll/᩹ܽۧ;->ۤ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 0

    return-void
.end method

.method public final ܽ()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final ܿ()V
    .locals 0

    return-void
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩹ܽۧ;->ܰ:Ll/ۛܽۧ;

    return-object v0
.end method
