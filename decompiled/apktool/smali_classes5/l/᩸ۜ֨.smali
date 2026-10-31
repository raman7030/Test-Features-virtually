.class public final Ll/᩸ۜ֨;
.super Ll/֨ۧܺ;
.source "DBV2"


# direct methods
.method public static ֫(Ljava/io/OutputStream;J)V
    .locals 3

    :goto_0
    const-wide/16 v0, 0x80

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    or-long/2addr v0, p1

    long-to-int v1, v0

    int-to-byte v0, v1

    .line 25
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0

    :cond_0
    long-to-int p2, p1

    int-to-byte p1, p2

    .line 29
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public static ֫([BLjava/io/OutputStream;)V
    .locals 4

    .line 14
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 15
    invoke-virtual {v0, p0}, Ljava/util/zip/CRC32;->update([B)V

    .line 16
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    const/4 p0, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge p0, v2, :cond_0

    mul-int/lit8 v2, p0, 0x8

    ushr-long v2, v0, v2

    long-to-int v3, v2

    int-to-byte v2, v3

    .line 19
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
