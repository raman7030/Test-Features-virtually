.class public final Ll/᩹ۨۜ;
.super Ljava/lang/Object;
.source "Q6MT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/᩸ۨۜ;

.field public final ᩶:Ll/᩹ۛۜ;

.field public final ᩸:Landroid/graphics/Bitmap;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ll/᩹ۛۜ;I)V
    .locals 0

    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    iput-object p1, p0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    .line 293
    iput-object p2, p0, Ll/᩹ۨۜ;->᩶:Ll/᩹ۛۜ;

    .line 294
    iput p3, p0, Ll/᩹ۨۜ;->ۗ:I

    .line 295
    new-instance p1, Ll/᩸ۨۜ;

    .line 325
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput p2, p1, Ll/᩸ۨۜ;->֫:I

    .line 295
    iput-object p1, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    return-void
.end method

.method public constructor <init>(Ll/᩹ۨۜ;)V
    .locals 1

    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 299
    iget-object v0, p1, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    iput-object v0, p0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    iget-object v0, p1, Ll/᩹ۨۜ;->᩶:Ll/᩹ۛۜ;

    iput-object v0, p0, Ll/᩹ۨۜ;->᩶:Ll/᩹ۛۜ;

    iget v0, p1, Ll/᩹ۨۜ;->ۗ:I

    iput v0, p0, Ll/᩹ۨۜ;->ۗ:I

    .line 300
    iget-object p1, p1, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    iput-object p1, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 314
    iget-object v0, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    monitor-enter v0

    .line 315
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۨۜ;->᩹:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 316
    iput-boolean v1, p0, Ll/᩹ۨۜ;->᩹:Z

    .line 317
    iget-object v2, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    iget v3, v2, Ll/᩸ۨۜ;->֫:I

    sub-int/2addr v3, v1

    iput v3, v2, Ll/᩸ۨۜ;->֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v3, :cond_2

    .line 319
    :try_start_1
    iget-object v1, p0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 320
    :cond_1
    :try_start_2
    iget-object v1, p0, Ll/᩹ۨۜ;->᩶:Ll/᩹ۛۜ;

    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ll/᩹ۨۜ;->᩶:Ll/᩹ۛۜ;

    invoke-virtual {v2}, Ll/᩹ۛۜ;->close()V

    throw v1

    .line 322
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final ᩺ۧ()Ll/᩹ۨۜ;
    .locals 3

    .line 305
    iget-object v0, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    monitor-enter v0

    .line 306
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۨۜ;->᩹:Z

    if-nez v1, :cond_0

    .line 307
    iget-object v1, p0, Ll/᩹ۨۜ;->ۙ:Ll/᩸ۨۜ;

    iget v2, v1, Ll/᩸ۨۜ;->֫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Ll/᩸ۨۜ;->֫:I

    .line 308
    new-instance v1, Ll/᩹ۨۜ;

    invoke-direct {v1, p0}, Ll/᩹ۨۜ;-><init>(Ll/᩹ۨۜ;)V

    monitor-exit v0

    return-object v1

    .line 306
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Bitmap handle is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 309
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
