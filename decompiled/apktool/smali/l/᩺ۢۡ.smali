.class public final Ll/᩺ۢۡ;
.super Landroid/media/MediaDataSource;
.source "U17E"


# instance fields
.field public final ᩸:J

.field public final ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    const-string v0, "r"

    .line 19
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۢۡ;->᩹:Ll/᩻ۖܽ;

    .line 20
    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩺ۢۡ;->᩸:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩺ۢۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 33
    iget-wide v0, p0, Ll/᩺ۢۡ;->᩸:J

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 2

    .line 25
    iget-object v0, p0, Ll/᩺ۢۡ;->᩹:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v1, p0, Ll/᩺ۢۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    .line 27
    iget-object p1, p0, Ll/᩺ۢۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {p1, p3, p4, p5}, Ll/᩻ۖܽ;->read([BII)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
