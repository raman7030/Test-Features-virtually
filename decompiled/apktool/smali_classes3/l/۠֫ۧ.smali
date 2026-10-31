.class public final Ll/۠֫ۧ;
.super Ljava/lang/Object;
.source "98O4"

# interfaces
.implements Ll/ܶۧۧ;
.implements Ll/᩸ۛ֫;


# instance fields
.field public final synthetic ۙ:Ll/᩸֫ۧ;

.field public ᩶:Ll/۠ۧۧ;

.field public ᩸:Ll/ܶۛ֫;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩸֫ۧ;Ljava/lang/Object;)V
    .locals 2

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠֫ۧ;->ۙ:Ll/᩸֫ۧ;

    const/4 v0, 0x0

    .line 231
    invoke-virtual {p1, v0}, Ll/ۢ֫ۧ;->ۧ(Ll/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object v1

    iput-object v1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 232
    invoke-virtual {p1, v0}, Ll/ۢ֫ۧ;->֫(Ll/ܺۧۧ;)Ll/ܶۛ֫;

    move-result-object p1

    iput-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    .line 233
    iput-object p2, p0, Ll/۠֫ۧ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;
    .locals 13

    .line 381
    iget-wide v0, p1, Ll/ۜۧۧ;->ܽ:J

    .line 382
    iget-object p2, p0, Ll/۠֫ۧ;->ۙ:Ll/᩸֫ۧ;

    iget-object v2, p0, Ll/۠֫ۧ;->᩹:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v2}, Ll/᩸֫ۧ;->֫(JLjava/lang/Object;)J

    move-result-wide v9

    .line 383
    iget-wide v3, p1, Ll/ۜۧۧ;->ۧ:J

    .line 384
    invoke-virtual {p2, v3, v4, v2}, Ll/᩸֫ۧ;->֫(JLjava/lang/Object;)J

    move-result-wide v11

    cmp-long p2, v9, v0

    if-nez p2, :cond_0

    cmp-long p2, v11, v3

    if-nez p2, :cond_0

    return-object p1

    .line 389
    :cond_0
    new-instance p2, Ll/ۜۧۧ;

    iget v4, p1, Ll/ۜۧۧ;->֫:I

    iget v5, p1, Ll/ۜۧۧ;->᩻:I

    iget-object v6, p1, Ll/ۜۧۧ;->ᩳ:Ll/۠ᩴ֫;

    iget v7, p1, Ll/ۜۧۧ;->ܳ:I

    iget-object v8, p1, Ll/ۜۧۧ;->ܿ:Ljava/lang/Object;

    move-object v3, p2

    invoke-direct/range {v3 .. v12}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-object p2
.end method

.method private ᩳ(ILl/ܺۧۧ;)Z
    .locals 3

    .line 360
    iget-object v0, p0, Ll/۠֫ۧ;->᩹:Ljava/lang/Object;

    iget-object v1, p0, Ll/۠֫ۧ;->ۙ:Ll/᩸֫ۧ;

    if-eqz p2, :cond_0

    .line 361
    invoke-virtual {v1, v0, p2}, Ll/᩸֫ۧ;->֫(Ljava/lang/Object;Ll/ܺۧۧ;)Ll/ܺۧۧ;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    .line 367
    :cond_1
    invoke-virtual {v1, p1, v0}, Ll/᩸֫ۧ;->֫(ILjava/lang/Object;)I

    move-result p1

    .line 368
    iget-object v0, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    iget v2, v0, Ll/۠ۧۧ;->ܽ:I

    if-ne v2, p1, :cond_2

    iget-object v0, v0, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    .line 369
    invoke-static {v0, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 370
    :cond_2
    invoke-virtual {v1, p1, p2}, Ll/ۢ֫ۧ;->ۧ(ILl/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object v0

    iput-object v0, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 372
    :cond_3
    iget-object v0, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    iget v2, v0, Ll/ܶۛ֫;->ܽ:I

    if-ne v2, p1, :cond_4

    iget-object v0, v0, Ll/ܶۛ֫;->ۧ:Ll/ܺۧۧ;

    .line 373
    invoke-static {v0, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 374
    :cond_4
    invoke-virtual {v1, p1, p2}, Ll/ۢ֫ۧ;->֫(ILl/ܺۧۧ;)Ll/ܶۛ֫;

    move-result-object p1

    iput-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final ֫(ILl/ܺۧۧ;)V
    .locals 0

    .line 322
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 323
    iget-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {p1}, Ll/ܶۛ֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;I)V
    .locals 0

    .line 315
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 316
    iget-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {p1, p3}, Ll/ܶۛ֫;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ljava/lang/Exception;)V
    .locals 0

    .line 330
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 331
    iget-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {p1, p3}, Ll/ܶۛ֫;->֫(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۜۧۧ;)V
    .locals 1

    .line 295
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 296
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 297
    invoke-direct {p0, p3, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object p2

    .line 482
    iget-object p3, p1, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    new-instance v0, Ll/᩻ۚۡ;

    invoke-direct {v0, p1, p3, p2}, Ll/᩻ۚۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    .line 269
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 270
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 271
    invoke-direct {p0, p4, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object p2

    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    new-instance p4, Ll/᩵ۧۧ;

    invoke-direct {p4, p1, p3, p2}, Ll/᩵ۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-virtual {p1, p4}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V
    .locals 0

    .line 245
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 246
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 247
    invoke-direct {p0, p4, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object p2

    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    new-instance p4, Ll/ۚۧۧ;

    invoke-direct {p4, p1, p3, p2, p5}, Ll/ۚۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V

    invoke-virtual {p1, p4}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V
    .locals 6

    .line 283
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 284
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 286
    invoke-direct {p0, p4, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object v3

    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    new-instance p2, Ll/ᩴۧۧ;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Ll/ᩴۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V

    invoke-virtual {p1, p2}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;)V
    .locals 0

    .line 337
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 338
    iget-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {p1}, Ll/ܶۛ֫;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    .line 304
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 305
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 306
    invoke-direct {p0, p3, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object p2

    .line 305
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    new-instance p3, Ll/۬֡ۢ;

    invoke-direct {p3, p1, p2}, Ll/۬֡ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    .line 257
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 258
    iget-object p1, p0, Ll/۠֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 259
    invoke-direct {p0, p4, p2}, Ll/۠֫ۧ;->֫(Ll/ۜۧۧ;Ll/ܺۧۧ;)Ll/ۜۧۧ;

    move-result-object p2

    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    new-instance p4, Ll/֡ۧۧ;

    invoke-direct {p4, p1, p3, p2}, Ll/֡ۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-virtual {p1, p4}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    :cond_0
    return-void
.end method

.method public final ܽ(ILl/ܺۧۧ;)V
    .locals 0

    .line 351
    invoke-direct {p0, p1, p2}, Ll/۠֫ۧ;->ᩳ(ILl/ܺۧۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 352
    iget-object p1, p0, Ll/۠֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {p1}, Ll/ܶۛ֫;->ܽ()V

    :cond_0
    return-void
.end method
