.class public final Ll/᩵۬ᩳ;
.super Ljava/lang/Object;
.source "56UC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/֨۬ᩳ;

.field public ᩹:Ll/ᩴ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/֨۬ᩳ;Ll/ᩴ۬ᩳ;)V
    .locals 0

    .line 430
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 431
    iput-object p1, p0, Ll/᩵۬ᩳ;->᩸:Ll/֨۬ᩳ;

    .line 432
    iput-object p2, p0, Ll/᩵۬ᩳ;->᩹:Ll/ᩴ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 443
    iget-object v0, p0, Ll/᩵۬ᩳ;->᩸:Ll/֨۬ᩳ;

    monitor-enter v0

    .line 444
    :try_start_0
    iget-object v1, p0, Ll/᩵۬ᩳ;->᩹:Ll/ᩴ۬ᩳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 445
    iget v3, v1, Ll/ᩴ۬ᩳ;->ܽ:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v1, Ll/ᩴ۬ᩳ;->ܽ:I

    .line 446
    iget-object v1, v1, Ll/ᩴ۬ᩳ;->ᩳ:Ll/۠۬ᩳ;

    iget-object v1, v1, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    .line 447
    iput-object v2, p0, Ll/᩵۬ᩳ;->᩹:Ll/ᩴ۬ᩳ;

    .line 448
    iget-object v2, p0, Ll/᩵۬ᩳ;->᩸:Ll/֨۬ᩳ;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    move-object v2, v1

    .line 450
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 451
    invoke-virtual {v2}, Ll/᩸۬ᩳ;->᩻()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 450
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫()Ll/ۧ۫ᩳ;
    .locals 2

    .line 436
    iget-object v0, p0, Ll/᩵۬ᩳ;->᩹:Ll/ᩴ۬ᩳ;

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, v0, Ll/ᩴ۬ᩳ;->ۧ:Ll/ۧ۫ᩳ;

    return-object v0

    .line 436
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Page lease is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
