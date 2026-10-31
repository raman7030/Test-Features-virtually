.class public final Ll/ۧۚۧ;
.super Ljava/lang/Object;
.source "W8S5"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ܺ֡ۧ;

.field public ܳ:J

.field public final ܽ:Ll/ܽ֨֫;

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩻:Ll/ۢ֨֫;


# direct methods
.method public constructor <init>(Ll/ܺ֡ۧ;Ll/ۢ֨֫;)V
    .locals 1

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 328
    iput-object p1, p0, Ll/ۧۚۧ;->ۧ:Ll/ܺ֡ۧ;

    .line 329
    iput-object p2, p0, Ll/ۧۚۧ;->᩻:Ll/ۢ֨֫;

    .line 330
    new-instance p1, Ll/ܽ֨֫;

    const/16 p2, 0x40

    new-array v0, p2, [B

    .line 48
    invoke-direct {p1, v0, p2}, Ll/ܽ֨֫;-><init>([BI)V

    .line 330
    iput-object p1, p0, Ll/ۧۚۧ;->ܽ:Ll/ܽ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 341
    iput-boolean v0, p0, Ll/ۧۚۧ;->ܿ:Z

    .line 342
    iget-object v0, p0, Ll/ۧۚۧ;->ۧ:Ll/ܺ֡ۧ;

    invoke-interface {v0}, Ll/ܺ֡ۧ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 14

    .line 352
    iget-object v0, p0, Ll/ۧۚۧ;->ܽ:Ll/ܽ֨֫;

    iget-object v1, v0, Ll/ܽ֨֫;->ᩳ:[B

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v3, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 353
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v1, 0x8

    .line 369
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 370
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    iput-boolean v4, p0, Ll/ۧۚۧ;->ᩳ:Z

    .line 371
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    iput-boolean v4, p0, Ll/ۧۚۧ;->֫:Z

    const/4 v4, 0x6

    .line 374
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 375
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 355
    iget-object v4, v0, Ll/ܽ֨֫;->ᩳ:[B

    invoke-virtual {p1, v2, v1, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 356
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ᩳ(I)V

    const-wide/16 v1, 0x0

    .line 379
    iput-wide v1, p0, Ll/ۧۚۧ;->ܳ:J

    .line 380
    iget-boolean v1, p0, Ll/ۧۚۧ;->ᩳ:Z

    const/4 v2, 0x4

    if-eqz v1, :cond_1

    .line 381
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 382
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    int-to-long v4, v1

    const/16 v1, 0x1e

    shl-long/2addr v4, v1

    const/4 v6, 0x1

    .line 383
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v7, 0xf

    .line 384
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    shl-int/2addr v8, v7

    int-to-long v8, v8

    or-long/2addr v4, v8

    .line 385
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 386
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    int-to-long v8, v8

    or-long/2addr v4, v8

    .line 387
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 388
    iget-boolean v8, p0, Ll/ۧۚۧ;->ܿ:Z

    iget-object v9, p0, Ll/ۧۚۧ;->᩻:Ll/ۢ֨֫;

    if-nez v8, :cond_0

    iget-boolean v8, p0, Ll/ۧۚۧ;->֫:Z

    if-eqz v8, :cond_0

    .line 389
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 390
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    int-to-long v10, v3

    shl-long/2addr v10, v1

    .line 391
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 392
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    shl-int/2addr v1, v7

    int-to-long v12, v1

    or-long/2addr v10, v12

    .line 393
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 394
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    int-to-long v7, v1

    or-long/2addr v7, v10

    .line 395
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 401
    invoke-virtual {v9, v7, v8}, Ll/ۢ֨֫;->ۧ(J)J

    .line 402
    iput-boolean v6, p0, Ll/ۧۚۧ;->ܿ:Z

    .line 404
    :cond_0
    invoke-virtual {v9, v4, v5}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧۚۧ;->ܳ:J

    .line 358
    :cond_1
    iget-wide v0, p0, Ll/ۧۚۧ;->ܳ:J

    iget-object v3, p0, Ll/ۧۚۧ;->ۧ:Ll/ܺ֡ۧ;

    invoke-interface {v3, v2, v0, v1}, Ll/ܺ֡ۧ;->֫(IJ)V

    .line 359
    invoke-interface {v3, p1}, Ll/ܺ֡ۧ;->֫(Ll/ᩳ֨֫;)V

    const/4 p1, 0x0

    .line 361
    invoke-interface {v3, p1}, Ll/ܺ֡ۧ;->֫(Z)V

    return-void
.end method
