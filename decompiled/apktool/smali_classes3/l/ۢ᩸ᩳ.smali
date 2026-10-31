.class public final Ll/ۢ᩸ᩳ;
.super Ljava/io/OutputStream;
.source "Q92M"


# instance fields
.field public ᩸:J


# virtual methods
.method public final write(I)V
    .locals 4

    .line 138
    iget-wide v0, p0, Ll/ۢ᩸ᩳ;->᩸:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۢ᩸ᩳ;->᩸:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 139
    iget-wide p1, p0, Ll/ۢ᩸ᩳ;->᩸:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۢ᩸ᩳ;->᩸:J

    return-void
.end method
