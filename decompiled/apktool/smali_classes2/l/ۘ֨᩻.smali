.class public final Ll/ۘ֨᩻;
.super Ljava/io/OutputStream;
.source "M9Q4"


# instance fields
.field public ᩸:J

.field public final ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(JLl/᩻ۖܽ;)V
    .locals 0

    .line 827
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 828
    iput-object p3, p0, Ll/ۘ֨᩻;->᩹:Ll/᩻ۖܽ;

    .line 829
    iput-wide p1, p0, Ll/ۘ֨᩻;->᩸:J

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 0

    .line 834
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final write([BII)V
    .locals 4

    .line 839
    iget-object v0, p0, Ll/ۘ֨᩻;->᩹:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 840
    :try_start_0
    iget-object v1, p0, Ll/ۘ֨᩻;->᩹:Ll/᩻ۖܽ;

    iget-wide v2, p0, Ll/ۘ֨᩻;->᩸:J

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 841
    iget-object v1, p0, Ll/ۘ֨᩻;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, p1, p2, p3}, Ll/᩻ۖܽ;->write([BII)V

    .line 842
    iget-wide p1, p0, Ll/ۘ֨᩻;->᩸:J

    int-to-long v1, p3

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/ۘ֨᩻;->᩸:J

    .line 843
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
