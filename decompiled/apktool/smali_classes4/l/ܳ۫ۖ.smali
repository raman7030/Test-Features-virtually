.class public final Ll/ܳ۫ۖ;
.super Ll/ᩴ۬ۖ;
.source "M9GT"


# direct methods
.method private ֫(Ll/᩻۫ۖ;)V
    .locals 5

    .line 103
    invoke-static {p1}, Ll/᩻۫ۖ;->ۧ(Ll/᩻۫ۖ;)Ll/ۚ۬ۖ;

    move-result-object v0

    .line 104
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 105
    new-instance v2, Ll/ܺ۬ۖ;

    iget-object v3, p0, Ll/ᩴ۬ۖ;->֫:Ll/۠᩵ۚ;

    invoke-direct {v2, v3, v1}, Ll/ܺ۬ۖ;-><init>(Ll/۠᩵ۚ;Ljava/io/ByteArrayOutputStream;)V

    .line 106
    :try_start_0
    invoke-static {p1}, Ll/᩻۫ۖ;->ܽ(Ll/᩻۫ۖ;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 107
    invoke-virtual {v2, v0}, Ll/ܺ۬ۖ;->֫(Ll/ۚ۬ۖ;)V

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {v0}, Ll/ۚ۬ۖ;->ۧ()Ll/ۨ۬ۖ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ۨ۬ۖ;->֫(Ll/۠᩵ۚ;)Ll/ᩴ۬ۖ;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ll/ᩴ۬ۖ;->֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V

    .line 111
    :goto_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩻۫ۖ;->֫(Ll/᩻۫ۖ;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 105
    :try_start_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)I
    .locals 1

    .line 88
    check-cast p1, Ll/᩻۫ۖ;

    .line 96
    invoke-static {p1}, Ll/᩻۫ۖ;->֫(Ll/᩻۫ۖ;)[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 97
    invoke-direct {p0, p1}, Ll/ܳ۫ۖ;->֫(Ll/᩻۫ۖ;)V

    .line 99
    :cond_0
    invoke-static {p1}, Ll/᩻۫ۖ;->֫(Ll/᩻۫ۖ;)[B

    move-result-object p1

    array-length p1, p1

    return p1
.end method

.method public final ֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V
    .locals 1

    .line 88
    check-cast p1, Ll/᩻۫ۖ;

    .line 117
    invoke-static {p1}, Ll/᩻۫ۖ;->֫(Ll/᩻۫ۖ;)[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 118
    invoke-direct {p0, p1}, Ll/ܳ۫ۖ;->֫(Ll/᩻۫ۖ;)V

    .line 120
    :cond_0
    invoke-static {p1}, Ll/᩻۫ۖ;->֫(Ll/᩻۫ۖ;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
