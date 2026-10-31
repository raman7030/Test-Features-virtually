.class public final Ll/ۖۖۜ;
.super Ljava/io/OutputStream;
.source "D6X3"


# instance fields
.field public ᩶:J

.field public final ᩸:Ljava/security/MessageDigest;

.field public final ᩹:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ljava/security/MessageDigest;)V
    .locals 0

    .line 2179
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2180
    iput-object p1, p0, Ll/ۖۖۜ;->᩹:Ljava/io/OutputStream;

    .line 2181
    iput-object p2, p0, Ll/ۖۖۜ;->᩸:Ljava/security/MessageDigest;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖۖۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۖۖۜ;->᩶:J

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 2205
    iget-object v0, p0, Ll/ۖۖۜ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 2200
    iget-object v0, p0, Ll/ۖۖۜ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 6

    .line 2186
    iget-object v0, p0, Ll/ۖۖۜ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 2187
    iget-object v0, p0, Ll/ۖۖۜ;->᩸:Ljava/security/MessageDigest;

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update(B)V

    .line 2188
    iget-wide v0, p0, Ll/ۖۖۜ;->᩶:J

    const/4 p1, 0x1

    int-to-long v2, p1

    const-wide v4, 0x1fffffffffffffL

    sub-long/2addr v4, v2

    cmp-long p1, v0, v4

    if-gtz p1, :cond_0

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۖۖۜ;->᩶:J

    return-void

    .line 2210
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Output exceeds the supported size range"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 4

    .line 2193
    iget-object v0, p0, Ll/ۖۖۜ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 2194
    iget-object v0, p0, Ll/ۖۖۜ;->᩸:Ljava/security/MessageDigest;

    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    .line 2195
    iget-wide p1, p0, Ll/ۖۖۜ;->᩶:J

    int-to-long v0, p3

    const-wide v2, 0x1fffffffffffffL

    sub-long/2addr v2, v0

    cmp-long p3, p1, v2

    if-gtz p3, :cond_0

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۖۖۜ;->᩶:J

    return-void

    .line 2210
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Output exceeds the supported size range"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
