.class public final Ll/ܶ֡ۧ;
.super Ljava/lang/Object;
.source "S8S4"


# instance fields
.field public ֫:Z

.field public ۖ:J

.field public final ۜ:Ll/᩵ۢۧ;

.field public ۡ:Z

.field public ۢ:Z

.field public ۧ:Z

.field public ܳ:J

.field public ܺ:J

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:I

.field public ᩷:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;)V
    .locals 0

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 329
    iput-object p1, p0, Ll/ܶ֡ۧ;->ۜ:Ll/᩵ۢۧ;

    return-void
.end method

.method private ֫(I)V
    .locals 8

    .line 401
    iget-wide v1, p0, Ll/ܶ֡ۧ;->ۖ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    iget-wide v3, p0, Ll/ܶ֡ۧ;->ܳ:J

    iget-wide v5, p0, Ll/ܶ֡ۧ;->ܺ:J

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    goto :goto_0

    .line 404
    :cond_0
    iget-boolean v7, p0, Ll/ܶ֡ۧ;->ۡ:Z

    sub-long/2addr v3, v5

    long-to-int v4, v3

    .line 406
    iget-object v0, p0, Ll/ܶ֡ۧ;->ۜ:Ll/᩵ۢۧ;

    const/4 v6, 0x0

    move v3, v7

    move v5, p1

    invoke-interface/range {v0 .. v6}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 333
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ܽ:Z

    .line 334
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ۧ:Z

    .line 335
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->֫:Z

    .line 336
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ۢ:Z

    .line 337
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->᩷:Z

    return-void
.end method

.method public final ֫(IIJJZ)V
    .locals 1

    const/4 v0, 0x0

    .line 342
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ۧ:Z

    .line 343
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->֫:Z

    .line 344
    iput-wide p5, p0, Ll/ܶ֡ۧ;->᩻:J

    .line 345
    iput v0, p0, Ll/ܶ֡ۧ;->ᩳ:I

    .line 346
    iput-wide p3, p0, Ll/ܶ֡ۧ;->ܳ:J

    const/4 p3, 0x1

    const/16 p4, 0x20

    if-lt p2, p4, :cond_5

    const/16 p5, 0x28

    if-ne p2, p5, :cond_0

    goto :goto_0

    .line 349
    :cond_0
    iget-boolean p5, p0, Ll/ܶ֡ۧ;->ۢ:Z

    if-eqz p5, :cond_2

    iget-boolean p5, p0, Ll/ܶ֡ۧ;->᩷:Z

    if-nez p5, :cond_2

    if-eqz p7, :cond_1

    .line 351
    invoke-direct {p0, p1}, Ll/ܶ֡ۧ;->֫(I)V

    .line 353
    :cond_1
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ۢ:Z

    :cond_2
    if-gt p4, p2, :cond_3

    const/16 p1, 0x23

    if-le p2, p1, :cond_4

    :cond_3
    const/16 p1, 0x27

    if-ne p2, p1, :cond_5

    .line 356
    :cond_4
    iget-boolean p1, p0, Ll/ܶ֡ۧ;->᩷:Z

    xor-int/2addr p1, p3

    iput-boolean p1, p0, Ll/ܶ֡ۧ;->֫:Z

    .line 357
    iput-boolean p3, p0, Ll/ܶ֡ۧ;->᩷:Z

    :cond_5
    :goto_0
    const/16 p1, 0x10

    if-lt p2, p1, :cond_6

    const/16 p1, 0x15

    if-gt p2, p1, :cond_6

    const/4 p1, 0x1

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    .line 362
    :goto_1
    iput-boolean p1, p0, Ll/ܶ֡ۧ;->ܿ:Z

    if-nez p1, :cond_7

    const/16 p1, 0x9

    if-gt p2, p1, :cond_8

    :cond_7
    const/4 v0, 0x1

    .line 365
    :cond_8
    iput-boolean v0, p0, Ll/ܶ֡ۧ;->ܽ:Z

    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 370
    iget-boolean v0, p0, Ll/ܶ֡ۧ;->ܽ:Z

    if-eqz v0, :cond_2

    add-int/lit8 v0, p1, 0x2

    .line 371
    iget v1, p0, Ll/ܶ֡ۧ;->ᩳ:I

    sub-int/2addr v0, v1

    if-ge v0, p2, :cond_1

    .line 373
    aget-byte p1, p3, v0

    and-int/lit16 p1, p1, 0x80

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ܶ֡ۧ;->ۧ:Z

    .line 374
    iput-boolean p2, p0, Ll/ܶ֡ۧ;->ܽ:Z

    return-void

    :cond_1
    sub-int/2addr p2, p1

    add-int/2addr p2, v1

    .line 376
    iput p2, p0, Ll/ܶ֡ۧ;->ᩳ:I

    :cond_2
    return-void
.end method

.method public final ֫(JIZ)V
    .locals 2

    .line 382
    iget-boolean v0, p0, Ll/ܶ֡ۧ;->᩷:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ܶ֡ۧ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 384
    iget-boolean p1, p0, Ll/ܶ֡ۧ;->ܿ:Z

    iput-boolean p1, p0, Ll/ܶ֡ۧ;->ۡ:Z

    const/4 p1, 0x0

    .line 385
    iput-boolean p1, p0, Ll/ܶ֡ۧ;->᩷:Z

    return-void

    .line 386
    :cond_0
    iget-boolean v0, p0, Ll/ܶ֡ۧ;->֫:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/ܶ֡ۧ;->ۧ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    .line 388
    iget-boolean p4, p0, Ll/ܶ֡ۧ;->ۢ:Z

    if-eqz p4, :cond_3

    .line 390
    iget-wide v0, p0, Ll/ܶ֡ۧ;->ܳ:J

    sub-long/2addr p1, v0

    long-to-int p2, p1

    add-int/2addr p3, p2

    .line 391
    invoke-direct {p0, p3}, Ll/ܶ֡ۧ;->֫(I)V

    .line 393
    :cond_3
    iget-wide p1, p0, Ll/ܶ֡ۧ;->ܳ:J

    iput-wide p1, p0, Ll/ܶ֡ۧ;->ܺ:J

    .line 394
    iget-wide p1, p0, Ll/ܶ֡ۧ;->᩻:J

    iput-wide p1, p0, Ll/ܶ֡ۧ;->ۖ:J

    .line 395
    iget-boolean p1, p0, Ll/ܶ֡ۧ;->ܿ:Z

    iput-boolean p1, p0, Ll/ܶ֡ۧ;->ۡ:Z

    const/4 p1, 0x1

    .line 396
    iput-boolean p1, p0, Ll/ܶ֡ۧ;->ۢ:Z

    return-void
.end method
