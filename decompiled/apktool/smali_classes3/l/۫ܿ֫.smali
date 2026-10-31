.class public final Ll/۫ܿ֫;
.super Landroid/media/MediaDataSource;
.source "057Y"


# instance fields
.field public ᩸:J

.field public final synthetic ᩹:Ll/ܰܿ֫;


# direct methods
.method public constructor <init>(Ll/ܰܿ֫;)V
    .locals 0

    .line 6014
    iput-object p1, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final getSize()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 6

    if-nez p5, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v2, -0x1

    cmp-long v3, p1, v0

    if-gez v3, :cond_1

    return v2

    .line 6030
    :cond_1
    :try_start_0
    iget-wide v3, p0, Ll/۫ܿ֫;->᩸:J

    cmp-long v5, v3, p1

    if-eqz v5, :cond_3

    cmp-long v5, v3, v0

    if-ltz v5, :cond_2

    .line 6035
    iget-object v0, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    .line 8086
    iget-object v0, v0, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v3, v0

    cmp-long v0, p1, v3

    if-ltz v0, :cond_2

    return v2

    .line 6038
    :cond_2
    iget-object v0, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    invoke-virtual {v0, p1, p2}, Ll/ܰܿ֫;->seek(J)V

    .line 6039
    iput-wide p1, p0, Ll/۫ܿ֫;->᩸:J

    .line 6045
    :cond_3
    iget-object p1, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    .line 8086
    iget-object p1, p1, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result p1

    if-le p5, p1, :cond_4

    .line 6046
    iget-object p1, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    .line 8086
    iget-object p1, p1, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result p5

    .line 6049
    :cond_4
    iget-object p1, p0, Ll/۫ܿ֫;->᩹:Ll/ܰܿ֫;

    invoke-virtual {p1, p3, p4, p5}, Ll/ۤܿ֫;->read([BII)I

    move-result p1

    if-ltz p1, :cond_5

    .line 6051
    iget-wide p2, p0, Ll/۫ܿ֫;->᩸:J

    int-to-long p4, p1

    add-long/2addr p2, p4

    iput-wide p2, p0, Ll/۫ܿ֫;->᩸:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_5
    const-wide/16 p1, -0x1

    .line 6057
    iput-wide p1, p0, Ll/۫ܿ֫;->᩸:J

    return v2
.end method
