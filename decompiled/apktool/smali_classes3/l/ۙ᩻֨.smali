.class public final Ll/ۙ᩻֨;
.super Ll/ۛ᩻֨;
.source "F2NF"


# instance fields
.field public final ᩸:Ljava/io/OutputStream;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Ll/ۙ᩻֨;->᩹:J

    .line 23
    iput-object p1, p0, Ll/ۙ᩻֨;->᩸:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۙ᩻֨;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۙ᩻֨;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 4

    .line 28
    iget-object v0, p0, Ll/ۙ᩻֨;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 29
    iget-wide v0, p0, Ll/ۙ᩻֨;->᩹:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 30
    iput-wide v0, p0, Ll/ۙ᩻֨;->᩹:J

    :cond_0
    return-void
.end method

.method public final write([BII)V
    .locals 3

    .line 35
    iget-object v0, p0, Ll/ۙ᩻֨;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 36
    iget-wide p1, p0, Ll/ۙ᩻֨;->᩹:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    int-to-long v0, p3

    add-long/2addr p1, v0

    .line 37
    iput-wide p1, p0, Ll/ۙ᩻֨;->᩹:J

    :cond_0
    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 51
    iget-wide v0, p0, Ll/ۙ᩻֨;->᩹:J

    return-wide v0
.end method
