.class public final Ll/۠ܶۜ;
.super Landroid/media/MediaDataSource;
.source "W8GL"


# instance fields
.field public final ᩸:Ll/᩻ۖܽ;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;Z)V
    .locals 0

    .line 424
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 425
    iput-object p1, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    .line 426
    iput-boolean p2, p0, Ll/۠ܶۜ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 444
    iget-boolean v0, p0, Ll/۠ܶۜ;->᩹:Z

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    :cond_0
    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 439
    iget-object v0, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    .line 173
    invoke-virtual {v0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 2

    .line 431
    iget-object v0, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 432
    :try_start_0
    iget-object v1, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {v1, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    .line 433
    iget-object p1, p0, Ll/۠ܶۜ;->᩸:Ll/᩻ۖܽ;

    invoke-virtual {p1, p4, p5, p3}, Ll/᩻ۖܽ;->ۧ(II[B)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 434
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
