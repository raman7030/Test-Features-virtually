.class public final Ll/ܿۗ֫;
.super Ljava/lang/Object;
.source "48Q4"


# instance fields
.field public ֫:Z

.field public ۖ:Ll/ۛܽۧ;

.field public final ۘ:Ll/ۚܿۧ;

.field public ۜ:Z

.field public ۡ:J

.field public final ۢ:[Ll/ᩳ۬֫;

.field public ۧ:Z

.field public final ܳ:Ll/ۗۗ֫;

.field public final ܺ:[Ll/ᩴܽۧ;

.field public ܽ:Ll/ܳۗ֫;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:[Z

.field public ᩴ:Ll/֨ܿۧ;

.field public final ᩵:Ljava/lang/Object;

.field public ᩷:Z

.field public ᩻:Ll/ܿۗ֫;


# direct methods
.method public constructor <init>([Ll/ᩳ۬֫;JLl/ۚܿۧ;Ll/᩸ܿۧ;Ll/ۗۗ֫;Ll/ܳۗ֫;Ll/֨ܿۧ;)V
    .locals 7

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Ll/ܿۗ֫;->ۢ:[Ll/ᩳ۬֫;

    .line 115
    iput-wide p2, p0, Ll/ܿۗ֫;->ۡ:J

    .line 116
    iput-object p4, p0, Ll/ܿۗ֫;->ۘ:Ll/ۚܿۧ;

    .line 117
    iput-object p6, p0, Ll/ܿۗ֫;->ܳ:Ll/ۗۗ֫;

    .line 118
    iget-object p2, p7, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-object p3, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    .line 119
    iput-object p7, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    .line 121
    sget-object p3, Ll/ۛܽۧ;->ᩳ:Ll/ۛܽۧ;

    iput-object p3, p0, Ll/ܿۗ֫;->ۖ:Ll/ۛܽۧ;

    .line 122
    iput-object p8, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    .line 123
    array-length p3, p1

    new-array p3, p3, [Ll/ᩴܽۧ;

    iput-object p3, p0, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    .line 124
    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ܿۗ֫;->ᩳ:[Z

    .line 125
    iget-wide p3, p7, Ll/ܳۗ֫;->ۢ:J

    iget-wide v5, p7, Ll/ܳۗ֫;->ۧ:J

    iget-boolean p1, p7, Ll/ܳۗ֫;->ۜ:Z

    .line 498
    invoke-virtual {p6, p2, p5, p3, p4}, Ll/ۗۗ֫;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ᩳۧۧ;

    move-result-object v1

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p4, v5, p2

    if-eqz p4, :cond_0

    .line 500
    new-instance p2, Ll/ۘ֫ۧ;

    xor-int/lit8 v2, p1, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Ll/ۘ֫ۧ;-><init>(Ll/ۢۧۧ;ZJJ)V

    move-object v1, p2

    .line 126
    :cond_0
    iput-object v1, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method private ۡ()V
    .locals 3

    .line 487
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 450
    :goto_0
    iget-object v1, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    iget v2, v1, Ll/֨ܿۧ;->ۧ:I

    if-ge v0, v2, :cond_1

    .line 451
    invoke-virtual {v1, v0}, Ll/֨ܿۧ;->֫(I)Z

    move-result v1

    .line 452
    iget-object v2, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    iget-object v2, v2, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 454
    invoke-interface {v2}, Ll/ۢܿۧ;->ᩳ()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܺ()V
    .locals 3

    .line 487
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 437
    :goto_0
    iget-object v1, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    iget v2, v1, Ll/֨ܿۧ;->ۧ:I

    if-ge v0, v2, :cond_1

    .line 438
    invoke-virtual {v1, v0}, Ll/֨ܿۧ;->֫(I)Z

    move-result v1

    .line 439
    iget-object v2, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    iget-object v2, v2, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 441
    invoke-interface {v2}, Ll/ۢܿۧ;->ܳ()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 5

    .line 190
    iget-boolean v0, p0, Ll/ܿۗ֫;->᩷:Z

    if-nez v0, :cond_0

    .line 191
    iget-object v0, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v0, v0, Ll/ܳۗ֫;->ۢ:J

    return-wide v0

    .line 194
    :cond_0
    iget-boolean v0, p0, Ll/ܿۗ֫;->ۧ:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    .line 195
    iget-object v0, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v0, v0, Ll/ܳۗ֫;->֫:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final ֫(Ll/֨ܿۧ;J)J
    .locals 7

    .line 302
    iget-object v0, p0, Ll/ܿۗ֫;->ۢ:[Ll/ᩳ۬֫;

    array-length v0, v0

    new-array v6, v0, [Z

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-virtual/range {v1 .. v6}, Ll/ܿۗ֫;->֫(Ll/֨ܿۧ;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫(Ll/֨ܿۧ;JZ[Z)J
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 326
    :goto_0
    iget v4, v1, Ll/֨ܿۧ;->ۧ:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    if-nez p4, :cond_0

    .line 327
    iget-object v4, v0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    .line 328
    invoke-virtual {v1, v4, v3}, Ll/֨ܿۧ;->֫(Ll/֨ܿۧ;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    iget-object v4, v0, Ll/ܿۗ֫;->ᩳ:[Z

    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 465
    :goto_2
    iget-object v4, v0, Ll/ܿۗ֫;->ۢ:[Ll/ᩳ۬֫;

    array-length v6, v4

    const/4 v7, -0x2

    iget-object v8, v0, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    if-ge v3, v6, :cond_3

    .line 466
    aget-object v4, v4, v3

    check-cast v4, Ll/ۙ᩹֫;

    invoke-virtual {v4}, Ll/ۙ᩹֫;->ۖ()I

    move-result v4

    if-ne v4, v7, :cond_2

    const/4 v4, 0x0

    .line 467
    aput-object v4, v8, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 334
    :cond_3
    invoke-direct/range {p0 .. p0}, Ll/ܿۗ֫;->ۡ()V

    .line 335
    iput-object v1, v0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    .line 336
    invoke-direct/range {p0 .. p0}, Ll/ܿۗ֫;->ܺ()V

    .line 338
    iget-object v10, v1, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    iget-object v11, v0, Ll/ܿۗ֫;->ᩳ:[Z

    iget-object v12, v0, Ll/ܿۗ֫;->ܺ:[Ll/ᩴܽۧ;

    .line 339
    iget-object v9, v0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    move-object/from16 v13, p5

    move-wide/from16 v14, p2

    invoke-interface/range {v9 .. v15}, Ll/ۢۧۧ;->֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J

    move-result-wide v9

    const/4 v3, 0x0

    .line 478
    :goto_3
    array-length v6, v4

    if-ge v3, v6, :cond_5

    .line 479
    aget-object v6, v4, v3

    check-cast v6, Ll/ۙ᩹֫;

    invoke-virtual {v6}, Ll/ۙ᩹֫;->ۖ()I

    move-result v6

    if-ne v6, v7, :cond_4

    iget-object v6, v0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    .line 480
    invoke-virtual {v6, v3}, Ll/֨ܿۧ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 481
    new-instance v6, Ll/ۢۤۡ;

    .line 25
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 481
    aput-object v6, v8, v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 348
    :cond_5
    iput-boolean v2, v0, Ll/ܿۗ֫;->ۧ:Z

    const/4 v2, 0x0

    .line 349
    :goto_4
    array-length v3, v8

    if-ge v2, v3, :cond_9

    .line 350
    aget-object v3, v8, v2

    if-eqz v3, :cond_6

    .line 351
    invoke-virtual {v1, v2}, Ll/֨ܿۧ;->֫(I)Z

    move-result v3

    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 353
    aget-object v3, v4, v2

    check-cast v3, Ll/ۙ᩹֫;

    invoke-virtual {v3}, Ll/ۙ᩹֫;->ۖ()I

    move-result v3

    if-eq v3, v7, :cond_8

    .line 354
    iput-boolean v5, v0, Ll/ܿۗ֫;->ۧ:Z

    goto :goto_6

    .line 357
    :cond_6
    iget-object v3, v1, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object v3, v3, v2

    if-nez v3, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    return-wide v9
.end method

.method public final ֫(FLl/ۙ᩵֫;Z)V
    .locals 5

    const/4 v0, 0x1

    .line 216
    iput-boolean v0, p0, Ll/ܿۗ֫;->᩷:Z

    .line 217
    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    invoke-interface {v0}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۗ֫;->ۖ:Ll/ۛܽۧ;

    .line 218
    invoke-virtual {p0, p1, p2, p3}, Ll/ܿۗ֫;->ۧ(FLl/ۙ᩵֫;Z)Ll/֨ܿۧ;

    move-result-object p1

    .line 219
    iget-object p2, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v0, p2, Ll/ܳۗ֫;->ۢ:J

    .line 220
    iget-wide p2, p2, Ll/ܳۗ֫;->֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p2, v2

    if-eqz v4, :cond_0

    cmp-long v2, v0, p2

    if-ltz v2, :cond_0

    const-wide/16 v0, 0x1

    sub-long/2addr p2, v0

    const-wide/16 v0, 0x0

    .line 222
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 225
    :cond_0
    invoke-virtual {p0, p1, v0, v1}, Ll/ܿۗ֫;->֫(Ll/֨ܿۧ;J)J

    move-result-wide p1

    .line 227
    iget-wide v0, p0, Ll/ܿۗ֫;->ۡ:J

    iget-object p3, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v2, p3, Ll/ܳۗ֫;->ۢ:J

    sub-long/2addr v2, p1

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ܿۗ֫;->ۡ:J

    .line 228
    invoke-virtual {p3, p1, p2}, Ll/ܳۗ֫;->ۧ(J)Ll/ܳۗ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 487
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 238
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 239
    iget-boolean v0, p0, Ll/ܿۗ֫;->᩷:Z

    if-eqz v0, :cond_1

    .line 153
    iget-wide v0, p0, Ll/ܿۗ֫;->ۡ:J

    sub-long/2addr p1, v0

    .line 240
    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    invoke-interface {v0, p1, p2}, Ll/֡ܽۧ;->ۧ(J)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۨۙ֫;)V
    .locals 1

    .line 487
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 252
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 253
    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    return-void
.end method

.method public final ֫(Ll/ܿۗ֫;)V
    .locals 1

    .line 376
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    if-ne p1, v0, :cond_0

    return-void

    .line 379
    :cond_0
    invoke-direct {p0}, Ll/ܿۗ֫;->ۡ()V

    .line 380
    iput-object p1, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    .line 381
    invoke-direct {p0}, Ll/ܿۗ֫;->ܺ()V

    return-void
.end method

.method public final ۜ()Z
    .locals 5

    .line 178
    iget-boolean v0, p0, Ll/ܿۗ֫;->᩷:Z

    if-eqz v0, :cond_1

    .line 179
    invoke-virtual {p0}, Ll/ܿۗ֫;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    invoke-virtual {p0}, Ll/ܿۗ֫;->֫()J

    move-result-wide v0

    iget-object v2, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v2, v2, Ll/ܳۗ֫;->ۢ:J

    sub-long/2addr v0, v2

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()V
    .locals 6

    .line 405
    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    instance-of v1, v0, Ll/ۘ֫ۧ;

    if-eqz v1, :cond_1

    .line 407
    iget-object v1, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v1, v1, Ll/ܳۗ֫;->ۧ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    .line 408
    :cond_0
    check-cast v0, Ll/ۘ֫ۧ;

    invoke-virtual {v0, v1, v2}, Ll/ۘ֫ۧ;->ܽ(J)V

    :cond_1
    return-void
.end method

.method public final ۧ(FLl/ۙ᩵֫;Z)Ll/֨ܿۧ;
    .locals 6

    .line 395
    iget-object v0, p0, Ll/ܿۗ֫;->ۖ:Ll/ۛܽۧ;

    .line 271
    iget-object v1, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v1, v1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/ܿۗ֫;->ۘ:Ll/ۚܿۧ;

    iget-object v3, p0, Ll/ܿۗ֫;->ۢ:[Ll/ᩳ۬֫;

    invoke-virtual {v2, v3, v0, v1, p2}, Ll/ۚܿۧ;->֫([Ll/ᩳ۬֫;Ll/ۛܽۧ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)Ll/֨ܿۧ;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 272
    :goto_0
    iget v2, p2, Ll/֨ܿۧ;->ۧ:I

    iget-object v4, p2, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    if-ge v1, v2, :cond_4

    .line 273
    invoke-virtual {p2, v1}, Ll/֨ܿۧ;->֫(I)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    .line 274
    aget-object v2, v4, v1

    if-nez v2, :cond_1

    aget-object v2, v3, v1

    .line 276
    check-cast v2, Ll/ۙ᩹֫;

    invoke-virtual {v2}, Ll/ۙ᩹֫;->ۖ()I

    move-result v2

    const/4 v4, -0x2

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 274
    :cond_1
    :goto_1
    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Z)V

    goto :goto_3

    .line 278
    :cond_2
    aget-object v2, v4, v1

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Z)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 281
    :cond_4
    array-length v1, v4

    :goto_4
    if-ge v0, v1, :cond_6

    aget-object v2, v4, v0

    if-eqz v2, :cond_5

    .line 283
    invoke-interface {v2, p1}, Ll/ۢܿۧ;->֫(F)V

    .line 284
    invoke-interface {v2, p3}, Ll/ۢܿۧ;->֫(Z)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    return-object p2
.end method

.method public final ۧ()Ll/ܿۗ֫;
    .locals 1

    .line 390
    iget-object v0, p0, Ll/ܿۗ֫;->᩻:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 162
    iput-wide p1, p0, Ll/ܿۗ֫;->ۡ:J

    return-void
.end method

.method public final ܳ()Ll/֨ܿۧ;
    .locals 1

    .line 400
    iget-object v0, p0, Ll/ܿۗ֫;->ᩴ:Ll/֨ܿۧ;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 153
    iget-wide v0, p0, Ll/ܿۗ֫;->ۡ:J

    return-wide v0
.end method

.method public final ܽ(J)J
    .locals 2

    .line 153
    iget-wide v0, p0, Ll/ܿۗ֫;->ۡ:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final ܿ()Ll/ۛܽۧ;
    .locals 1

    .line 395
    iget-object v0, p0, Ll/ܿۗ֫;->ۖ:Ll/ۛܽۧ;

    return-object v0
.end method

.method public final ᩳ()J
    .locals 4

    .line 167
    iget-object v0, p0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v0, v0, Ll/ܳۗ֫;->ۢ:J

    iget-wide v2, p0, Ll/ܿۗ֫;->ۡ:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩳ(J)J
    .locals 2

    .line 153
    iget-wide v0, p0, Ll/ܿۗ֫;->ۡ:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final ᩷()V
    .locals 3

    .line 365
    invoke-direct {p0}, Ll/ܿۗ֫;->ۡ()V

    .line 366
    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    .line 513
    :try_start_0
    instance-of v1, v0, Ll/ۘ֫ۧ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Ll/ܿۗ֫;->ܳ:Ll/ۗۗ֫;

    if-eqz v1, :cond_0

    .line 514
    :try_start_1
    check-cast v0, Ll/ۘ֫ۧ;

    iget-object v0, v0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-virtual {v2, v0}, Ll/ۗۗ֫;->֫(Ll/ۢۧۧ;)V

    return-void

    .line 516
    :cond_0
    invoke-virtual {v2, v0}, Ll/ۗۗ֫;->֫(Ll/ۢۧۧ;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Period release failed."

    .line 520
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 5

    .line 172
    iget-boolean v0, p0, Ll/ܿۗ֫;->᩷:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܿۗ֫;->ۧ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    .line 173
    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
