.class public final Ll/ܰܺۜ;
.super Ljava/lang/Object;
.source "Y6XM"


# instance fields
.field public ֫:J

.field public ۖ:I

.field public ۘ:Z

.field public ۜ:J

.field public final ۡ:J

.field public final ۢ:J

.field public ۧ:Z

.field public ܳ:J

.field public ܺ:I

.field public ܽ:Z

.field public final ܿ:I

.field public ᩳ:J

.field public final ᩴ:Ljava/lang/StringBuilder;

.field public ᩷:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIJJ)V
    .locals 2

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܰܺۜ;->ᩴ:Ljava/lang/StringBuilder;

    const-wide/16 v0, -0x1

    .line 261
    iput-wide v0, p0, Ll/ܰܺۜ;->ᩳ:J

    .line 269
    iput-wide p3, p0, Ll/ܰܺۜ;->ۡ:J

    .line 270
    iput-wide p5, p0, Ll/ܰܺۜ;->ۢ:J

    .line 271
    iput p1, p0, Ll/ܰܺۜ;->ܿ:I

    .line 272
    iput p2, p0, Ll/ܰܺۜ;->᩻:I

    return-void
.end method

.method public static ֫(Ll/ܰܺۜ;)Ll/ۨܺۜ;
    .locals 21

    move-object/from16 v0, p0

    .line 359
    iget-boolean v1, v0, Ll/ܰܺۜ;->ۧ:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    iget-boolean v1, v0, Ll/ܰܺۜ;->ܽ:Z

    if-nez v1, :cond_2

    .line 360
    iget-wide v3, v0, Ll/ܰܺۜ;->ܳ:J

    iget-wide v5, v0, Ll/ܰܺۜ;->ۡ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v5, v0, Ll/ܰܺۜ;->֫:J

    iget-wide v7, v0, Ll/ܰܺۜ;->ۢ:J

    cmp-long v1, v5, v7

    if-eqz v1, :cond_0

    goto :goto_0

    .line 363
    :cond_0
    iput-boolean v2, v0, Ll/ܰܺۜ;->ۧ:Z

    .line 364
    iput-wide v3, v0, Ll/ܰܺۜ;->᩷:J

    .line 365
    iput-wide v5, v0, Ll/ܰܺۜ;->ۜ:J

    goto :goto_1

    .line 361
    :cond_1
    :goto_0
    iput-boolean v2, v0, Ll/ܰܺۜ;->ܽ:Z

    .line 368
    :cond_2
    :goto_1
    new-instance v1, Ll/ۨܺۜ;

    iget-object v2, v0, Ll/ܰܺۜ;->ᩴ:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iget-wide v9, v0, Ll/ܰܺۜ;->᩷:J

    iget-wide v11, v0, Ll/ܰܺۜ;->ۜ:J

    iget v13, v0, Ll/ܰܺۜ;->ۖ:I

    iget v14, v0, Ll/ܰܺۜ;->ܺ:I

    iget-boolean v15, v0, Ll/ܰܺۜ;->ۘ:Z

    iget-boolean v2, v0, Ll/ܰܺۜ;->ܽ:Z

    xor-int/lit8 v16, v2, 0x1

    iget-wide v2, v0, Ll/ܰܺۜ;->ܳ:J

    iget-wide v4, v0, Ll/ܰܺۜ;->֫:J

    move-object v7, v1

    move-wide/from16 v17, v2

    move-wide/from16 v19, v4

    invoke-direct/range {v7 .. v20}, Ll/ۨܺۜ;-><init>(Ljava/lang/String;JJIIZZJJ)V

    return-object v1
.end method

.method public static ֫(Ll/ܰܺۜ;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 276
    invoke-direct {p0, v0, v1}, Ll/ܰܺۜ;->֫(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Ll/ܰܺۜ;->ᩴ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 279
    :cond_0
    invoke-direct {p0, v1}, Ll/ܰܺۜ;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/ܰܺۜ;Ljava/lang/String;)V
    .locals 2

    .line 283
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    .line 284
    invoke-direct {p0, v0, v1}, Ll/ܰܺۜ;->֫(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Ll/ܰܺۜ;->ᩴ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    :cond_0
    invoke-direct {p0, v1}, Ll/ܰܺۜ;->֫(Z)V

    return-void
.end method

.method private ֫(Z)V
    .locals 8

    .line 327
    iget-boolean v0, p0, Ll/ܰܺۜ;->ۘ:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 328
    iget-wide v1, p0, Ll/ܰܺۜ;->ܳ:J

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Ll/ܰܺۜ;->֫:J

    :goto_0
    const-wide v3, 0x1fffffffffffffL

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    const/4 p1, 0x1

    .line 330
    iput-boolean p1, p0, Ll/ܰܺۜ;->ܽ:Z

    return-void

    .line 333
    :cond_1
    iget-boolean v1, p0, Ll/ܰܺۜ;->ۧ:Z

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    .line 335
    iget-wide v6, p0, Ll/ܰܺۜ;->ܳ:J

    add-long/2addr v6, v4

    iput-wide v6, p0, Ll/ܰܺۜ;->᩷:J

    .line 336
    iput-wide v2, p0, Ll/ܰܺۜ;->ۜ:J

    goto :goto_1

    .line 338
    :cond_2
    iget-wide v6, p0, Ll/ܰܺۜ;->ܳ:J

    iput-wide v6, p0, Ll/ܰܺۜ;->᩷:J

    .line 339
    iget-wide v6, p0, Ll/ܰܺۜ;->֫:J

    add-long/2addr v6, v4

    iput-wide v6, p0, Ll/ܰܺۜ;->ۜ:J

    :cond_3
    :goto_1
    if-nez v0, :cond_5

    if-eqz p1, :cond_4

    .line 345
    iget-wide v0, p0, Ll/ܰܺۜ;->ܳ:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/ܰܺۜ;->ܳ:J

    .line 346
    iput-wide v2, p0, Ll/ܰܺۜ;->֫:J

    return-void

    .line 348
    :cond_4
    iget-wide v0, p0, Ll/ܰܺۜ;->֫:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/ܰܺۜ;->֫:J

    :cond_5
    return-void
.end method

.method private ֫(IZ)Z
    .locals 10

    .line 291
    iget-boolean v0, p0, Ll/ܰܺۜ;->ۧ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ܰܺۜ;->ܽ:Z

    if-nez v0, :cond_3

    .line 292
    iget-wide v2, p0, Ll/ܰܺۜ;->ܳ:J

    iget-wide v4, p0, Ll/ܰܺۜ;->ۡ:J

    iget-wide v6, p0, Ll/ܰܺۜ;->ۢ:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    if-nez v0, :cond_1

    iget-wide v4, p0, Ll/ܰܺۜ;->֫:J

    cmp-long v8, v4, v6

    if-lez v8, :cond_1

    .line 294
    :cond_0
    iput-boolean v1, p0, Ll/ܰܺۜ;->ܽ:Z

    .line 296
    :cond_1
    iget-boolean v4, p0, Ll/ܰܺۜ;->ܽ:Z

    if-nez v4, :cond_2

    if-nez v0, :cond_2

    iget-wide v8, p0, Ll/ܰܺۜ;->֫:J

    cmp-long v5, v8, v6

    if-nez v5, :cond_2

    .line 297
    iput-boolean v1, p0, Ll/ܰܺۜ;->ۧ:Z

    .line 298
    iput-wide v2, p0, Ll/ܰܺۜ;->᩷:J

    .line 299
    iput-wide v8, p0, Ll/ܰܺۜ;->ۜ:J

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    if-nez v0, :cond_3

    if-eqz p2, :cond_3

    .line 302
    iput-boolean v1, p0, Ll/ܰܺۜ;->ܽ:Z

    .line 307
    :cond_3
    :goto_0
    iget-boolean p2, p0, Ll/ܰܺۜ;->ۧ:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_9

    iget-boolean p2, p0, Ll/ܰܺۜ;->ۘ:Z

    if-nez p2, :cond_9

    .line 308
    iget-wide v2, p0, Ll/ܰܺۜ;->ᩳ:J

    iget-wide v4, p0, Ll/ܰܺۜ;->ܳ:J

    cmp-long p2, v2, v4

    if-eqz p2, :cond_4

    const/4 p2, 0x1

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_5

    .line 309
    iget v2, p0, Ll/ܰܺۜ;->ۖ:I

    iget v3, p0, Ll/ܰܺۜ;->ܿ:I

    if-ge v2, v3, :cond_6

    :cond_5
    iget v2, p0, Ll/ܰܺۜ;->ܺ:I

    iget v3, p0, Ll/ܰܺۜ;->᩻:I

    sub-int/2addr v3, p1

    if-le v2, v3, :cond_7

    .line 311
    :cond_6
    iput-boolean v1, p0, Ll/ܰܺۜ;->ۘ:Z

    .line 312
    iput-wide v4, p0, Ll/ܰܺۜ;->᩷:J

    .line 313
    iget-wide p1, p0, Ll/ܰܺۜ;->֫:J

    iput-wide p1, p0, Ll/ܰܺۜ;->ۜ:J

    return v0

    :cond_7
    add-int/2addr v2, p1

    .line 315
    iput v2, p0, Ll/ܰܺۜ;->ܺ:I

    if-eqz p2, :cond_8

    .line 317
    iget p1, p0, Ll/ܰܺۜ;->ۖ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ܰܺۜ;->ۖ:I

    .line 318
    iput-wide v4, p0, Ll/ܰܺۜ;->ᩳ:J

    :cond_8
    return v1

    :cond_9
    return v0
.end method

.method public static ۧ(Ll/ܰܺۜ;)Z
    .locals 0

    .line 355
    iget-boolean p0, p0, Ll/ܰܺۜ;->ۘ:Z

    return p0
.end method
