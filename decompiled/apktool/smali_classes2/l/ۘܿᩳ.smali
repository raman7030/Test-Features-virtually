.class public final synthetic Ll/ۘܿᩳ;
.super Ljava/lang/Object;
.source "A1VX"


# direct methods
.method public static ֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;
    .locals 5

    .line 22
    invoke-interface {p0}, Ll/֡ܿᩳ;->size()J

    move-result-wide v0

    const/16 v2, 0x1000

    int-to-long v3, v2

    .line 23
    rem-long/2addr v0, v3

    long-to-int v1, v0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    sub-int/2addr v2, v1

    .line 27
    new-array v0, v2, [B

    .line 18
    new-instance v1, Ll/ۡܿᩳ;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Ll/ۡܿᩳ;-><init>([BII)V

    const/4 v0, 0x2

    new-array v0, v0, [Ll/֡ܿᩳ;

    aput-object p0, v0, v3

    const/4 p0, 0x1

    aput-object v1, v0, p0

    .line 31
    new-instance p0, Ll/ܺܿᩳ;

    invoke-direct {p0, v0}, Ll/ܺܿᩳ;-><init>([Ll/֡ܿᩳ;)V

    return-object p0
.end method

.method public static ֫(Ll/֨ܿᩳ;)Ll/ۡܿᩳ;
    .locals 5

    .line 61
    invoke-virtual {p0}, Ll/֨ܿᩳ;->ۧ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 65
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    long-to-int v3, v0

    invoke-direct {v2, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 66
    invoke-virtual {p0, v2, v0, v1}, Ll/֨ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    .line 67
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 14
    array-length v0, p0

    .line 18
    new-instance v1, Ll/ۡܿᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Ll/ۡܿᩳ;-><init>([BII)V

    return-object v1

    .line 63
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Data too large"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/֡ܿᩳ;Ljava/security/MessageDigest;J)V
    .locals 1

    .line 27
    new-instance v0, Ll/ᩴܿᩳ;

    invoke-direct {v0, p1}, Ll/ᩴܿᩳ;-><init>(Ljava/security/MessageDigest;)V

    .line 38
    invoke-interface {p0, v0, p2, p3}, Ll/֡ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    return-void
.end method

.method public static ֫(Ll/֡ܿᩳ;Ll/᩻ۖܽ;J)V
    .locals 1

    .line 42
    new-instance v0, Ll/᩵ܿᩳ;

    invoke-direct {v0, p1}, Ll/᩵ܿᩳ;-><init>(Ll/᩻ۖܽ;)V

    .line 53
    invoke-interface {p0, v0, p2, p3}, Ll/֡ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    return-void
.end method

.method public static ۧ(Ll/֨ܿᩳ;)Ll/֡ܿᩳ;
    .locals 5

    .line 71
    invoke-virtual {p0}, Ll/֨ܿᩳ;->ۧ()J

    move-result-wide v0

    const-wide/32 v2, 0x3200000

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-object p0

    .line 75
    :cond_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    long-to-int v3, v0

    invoke-direct {v2, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 76
    invoke-virtual {p0, v2, v0, v1}, Ll/֨ܿᩳ;->֫(Ljava/io/OutputStream;J)V

    .line 77
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 14
    array-length v0, p0

    .line 18
    new-instance v1, Ll/ۡܿᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Ll/ۡܿᩳ;-><init>([BII)V

    return-object v1
.end method
