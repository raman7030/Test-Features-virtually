.class public final Ll/ܶܽۧ;
.super Ljava/lang/Object;
.source "T8N8"

# interfaces
.implements Ll/ᩴܽۧ;


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public final synthetic ܽ:Ll/᩹ܽۧ;


# direct methods
.method public constructor <init>(Ll/᩹ܽۧ;)V
    .locals 0

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܽۧ;->ܽ:Ll/᩹ܽۧ;

    return-void
.end method

.method private ܽ()V
    .locals 13

    .line 422
    iget-boolean v0, p0, Ll/ܶܽۧ;->֫:Z

    if-nez v0, :cond_0

    .line 423
    iget-object v0, p0, Ll/ܶܽۧ;->ܽ:Ll/᩹ܽۧ;

    invoke-static {v0}, Ll/᩹ܽۧ;->֫(Ll/᩹ܽۧ;)Ll/۠ۧۧ;

    move-result-object v1

    iget-object v2, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    iget-object v2, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 424
    invoke-static {v2}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v5

    iget-object v6, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    .line 494
    new-instance v0, Ll/ۜۧۧ;

    const-wide/16 v2, 0x0

    .line 501
    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 507
    new-instance v2, Ll/۬֡ۢ;

    invoke-direct {v2, v1, v0}, Ll/۬֡ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    const/4 v0, 0x1

    .line 429
    iput-boolean v0, p0, Ll/ܶܽۧ;->֫:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(J)I
    .locals 3

    .line 413
    invoke-direct {p0}, Ll/ܶܽۧ;->ܽ()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 414
    iget p1, p0, Ll/ܶܽۧ;->ۧ:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 415
    iput p2, p0, Ll/ܶܽۧ;->ۧ:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 7

    .line 378
    invoke-direct {p0}, Ll/ܶܽۧ;->ܽ()V

    .line 379
    iget-object v0, p0, Ll/ܶܽۧ;->ܽ:Ll/᩹ܽۧ;

    iget-boolean v1, v0, Ll/᩹ܽۧ;->ۤ:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    iget-object v3, v0, Ll/᩹ܽۧ;->ۛ:[B

    if-nez v3, :cond_0

    .line 380
    iput v2, p0, Ll/ܶܽۧ;->ۧ:I

    .line 383
    :cond_0
    iget v3, p0, Ll/ܶܽۧ;->ۧ:I

    const/4 v4, -0x4

    if-ne v3, v2, :cond_1

    const/4 p1, 0x4

    .line 384
    invoke-virtual {p2, p1}, Ll/ۘ᩸֫;->ۧ(I)V

    return v4

    :cond_1
    and-int/lit8 v5, p3, 0x2

    const/4 v6, 0x1

    if-nez v5, :cond_6

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    const/4 p1, -0x3

    return p1

    .line 397
    :cond_3
    iget-object p1, v0, Ll/᩹ܽۧ;->ۛ:[B

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    invoke-virtual {p2, v6}, Ll/ۘ᩸֫;->ۧ(I)V

    const-wide/16 v5, 0x0

    .line 400
    iput-wide v5, p2, Ll/᩸᩸֫;->ۤ:J

    and-int/lit8 p1, p3, 0x4

    if-nez p1, :cond_4

    .line 402
    iget p1, v0, Ll/᩹ܽۧ;->ۨ:I

    invoke-virtual {p2, p1}, Ll/᩸᩸֫;->ܳ(I)V

    .line 403
    iget-object p1, p2, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    iget-object p2, v0, Ll/᩹ܽۧ;->ۛ:[B

    const/4 v1, 0x0

    iget v0, v0, Ll/᩹ܽۧ;->ۨ:I

    invoke-virtual {p1, p2, v1, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    :cond_4
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_5

    .line 406
    iput v2, p0, Ll/ܶܽۧ;->ۧ:I

    :cond_5
    return v4

    .line 389
    :cond_6
    :goto_0
    iget-object p2, v0, Ll/᩹ܽۧ;->ۗ:Ll/۠ᩴ֫;

    iput-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 390
    iput v6, p0, Ll/ܶܽۧ;->ۧ:I

    const/4 p1, -0x5

    return p1
.end method

.method public final ֫()V
    .locals 2

    .line 370
    iget-object v0, p0, Ll/ܶܽۧ;->ܽ:Ll/᩹ܽۧ;

    iget-boolean v1, v0, Ll/᩹ܽۧ;->֫֫:Z

    if-nez v1, :cond_0

    .line 371
    iget-object v0, v0, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    const/high16 v1, -0x80000000

    .line 341
    invoke-virtual {v0, v1}, Ll/ۡܳۧ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 358
    iget v0, p0, Ll/ܶܽۧ;->ۧ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 359
    iput v0, p0, Ll/ܶܽۧ;->ۧ:I

    :cond_0
    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 365
    iget-object v0, p0, Ll/ܶܽۧ;->ܽ:Ll/᩹ܽۧ;

    iget-boolean v0, v0, Ll/᩹ܽۧ;->ۤ:Z

    return v0
.end method
