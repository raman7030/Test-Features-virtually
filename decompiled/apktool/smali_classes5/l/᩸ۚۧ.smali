.class public final Ll/᩸ۚۧ;
.super Ljava/lang/Object;
.source "P8OA"

# interfaces
.implements Ll/ܶۚۧ;


# instance fields
.field public final ֫:Ll/᩸᩷ۧ;

.field public final ۜ:Ll/᩶ۚۧ;

.field public final ۧ:Ll/۠ᩴ֫;

.field public final ܳ:I

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:I

.field public final ᩻:Ll/᩵ۢۧ;


# direct methods
.method public constructor <init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;Ljava/lang/String;I)V
    .locals 3

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 306
    iput-object p1, p0, Ll/᩸ۚۧ;->֫:Ll/᩸᩷ۧ;

    .line 307
    iput-object p2, p0, Ll/᩸ۚۧ;->᩻:Ll/᩵ۢۧ;

    .line 308
    iput-object p3, p0, Ll/᩸ۚۧ;->ۜ:Ll/᩶ۚۧ;

    .line 310
    iget p1, p3, Ll/᩶ۚۧ;->ܳ:I

    iget p2, p3, Ll/᩶ۚۧ;->ܿ:I

    iget v0, p3, Ll/᩶ۚۧ;->֫:I

    mul-int v0, v0, p1

    div-int/lit8 v0, v0, 0x8

    .line 312
    iget p3, p3, Ll/᩶ۚۧ;->ۧ:I

    if-ne p3, v0, :cond_0

    mul-int p3, p2, v0

    mul-int/lit8 v1, p3, 0x8

    .line 319
    div-int/lit8 p3, p3, 0xa

    .line 320
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Ll/᩸ۚۧ;->ܳ:I

    .line 321
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v2, "audio/wav"

    .line 323
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 324
    invoke-virtual {v0, p4}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 325
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 326
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֡(I)V

    .line 327
    invoke-virtual {v0, p3}, Ll/֨ᩴ֫;->ۖ(I)V

    .line 328
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 329
    invoke-virtual {v0, p2}, Ll/֨ᩴ֫;->۠(I)V

    .line 330
    invoke-virtual {v0, p5}, Ll/֨ᩴ֫;->᩵(I)V

    .line 331
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۚۧ;->ۧ:Ll/۠ᩴ֫;

    return-void

    .line 313
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Expected block size: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; got: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ֫(IJ)V
    .locals 8

    .line 343
    new-instance v7, Ll/۬ۚۧ;

    const/4 v2, 0x1

    int-to-long v3, p1

    iget-object v1, p0, Ll/᩸ۚۧ;->ۜ:Ll/᩶ۚۧ;

    move-object v0, v7

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Ll/۬ۚۧ;-><init>(Ll/᩶ۚۧ;IJJ)V

    .line 345
    iget-object p1, p0, Ll/᩸ۚۧ;->֫:Ll/᩸᩷ۧ;

    invoke-interface {p1, v7}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 346
    iget-object p1, p0, Ll/᩸ۚۧ;->ۧ:Ll/۠ᩴ֫;

    iget-object p2, p0, Ll/᩸ۚۧ;->᩻:Ll/᩵ۢۧ;

    invoke-interface {p2, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 347
    invoke-virtual {v7}, Ll/۬ۚۧ;->ۜ()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ll/᩵ۢۧ;->֫(J)V

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 336
    iput-wide p1, p0, Ll/᩸ۚۧ;->ܿ:J

    const/4 p1, 0x0

    .line 337
    iput p1, p0, Ll/᩸ۚۧ;->ᩳ:I

    const-wide/16 p1, 0x0

    .line 338
    iput-wide p1, p0, Ll/᩸ۚۧ;->ܽ:J

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;J)Z
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-lez v6, :cond_1

    .line 353
    iget v7, v0, Ll/᩸ۚۧ;->ᩳ:I

    iget v8, v0, Ll/᩸ۚۧ;->ܳ:I

    if-ge v7, v8, :cond_1

    sub-int/2addr v8, v7

    int-to-long v6, v8

    .line 354
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v7, v6

    .line 355
    iget-object v6, v0, Ll/᩸ۚۧ;->᩻:Ll/᩵ۢۧ;

    move-object/from16 v8, p1

    invoke-interface {v6, v8, v7, v3}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v3

    const/4 v6, -0x1

    if-ne v3, v6, :cond_0

    move-wide v1, v4

    goto :goto_0

    .line 359
    :cond_0
    iget v4, v0, Ll/᩸ۚۧ;->ᩳ:I

    add-int/2addr v4, v3

    iput v4, v0, Ll/᩸ۚۧ;->ᩳ:I

    int-to-long v3, v3

    sub-long/2addr v1, v3

    goto :goto_0

    .line 367
    :cond_1
    iget-object v1, v0, Ll/᩸ۚۧ;->ۜ:Ll/᩶ۚۧ;

    iget v2, v1, Ll/᩶ۚۧ;->ۧ:I

    .line 368
    iget v4, v0, Ll/᩸ۚۧ;->ᩳ:I

    div-int/2addr v4, v2

    if-lez v4, :cond_2

    .line 370
    iget-wide v7, v0, Ll/᩸ۚۧ;->ܿ:J

    iget-wide v9, v0, Ll/᩸ۚۧ;->ܽ:J

    iget v1, v1, Ll/᩶ۚۧ;->ܿ:I

    int-to-long v13, v1

    .line 372
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v11, 0xf4240

    invoke-static/range {v9 .. v15}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    add-long v12, v7, v9

    mul-int v15, v4, v2

    .line 375
    iget v1, v0, Ll/᩸ۚۧ;->ᩳ:I

    sub-int/2addr v1, v15

    const/4 v14, 0x1

    const/16 v17, 0x0

    .line 376
    iget-object v11, v0, Ll/᩸ۚۧ;->᩻:Ll/᩵ۢۧ;

    move/from16 v16, v1

    invoke-interface/range {v11 .. v17}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 378
    iget-wide v7, v0, Ll/᩸ۚۧ;->ܽ:J

    int-to-long v4, v4

    add-long/2addr v7, v4

    iput-wide v7, v0, Ll/᩸ۚۧ;->ܽ:J

    .line 379
    iput v1, v0, Ll/᩸ۚۧ;->ᩳ:I

    :cond_2
    if-gtz v6, :cond_3

    return v3

    :cond_3
    const/4 v1, 0x0

    return v1
.end method
