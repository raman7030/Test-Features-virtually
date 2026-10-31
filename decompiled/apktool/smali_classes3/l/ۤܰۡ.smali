.class public final Ll/ۤܰۡ;
.super Ljava/io/OutputStream;
.source "94G3"


# instance fields
.field public final ᩸:Ll/۠ۖܽ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/᩻ۖܽ;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Ll/ۤܰۡ;->᩹:J

    .line 13
    iput-object p1, p0, Ll/ۤܰۡ;->᩸:Ll/۠ۖܽ;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 4

    .line 26
    iget-object v0, p0, Ll/ۤܰۡ;->᩸:Ll/۠ۖܽ;

    invoke-interface {v0, p1}, Ll/۠ۖܽ;->write(I)V

    .line 27
    iget-wide v0, p0, Ll/ۤܰۡ;->᩹:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۤܰۡ;->᩹:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    if-lez p3, :cond_0

    .line 19
    iget-object v0, p0, Ll/ۤܰۡ;->᩸:Ll/۠ۖܽ;

    invoke-interface {v0, p1, p2, p3}, Ll/۠ۖܽ;->write([BII)V

    .line 20
    iget-wide p1, p0, Ll/ۤܰۡ;->᩹:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۤܰۡ;->᩹:J

    :cond_0
    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 31
    iget-wide v0, p0, Ll/ۤܰۡ;->᩹:J

    return-wide v0
.end method
