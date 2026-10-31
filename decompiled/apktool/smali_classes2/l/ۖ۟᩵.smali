.class public abstract Ll/ۖ۟᩵;
.super Ljava/lang/Object;
.source "N4FD"


# direct methods
.method public static ֫(Ll/ܰܰ᩵;Ljava/lang/String;)Ll/ۖ۟᩵;
    .locals 3

    .line 48
    sget-object v0, Ll/᩶۟᩵;->ᩴ:Ljava/nio/charset/Charset;

    if-eqz p0, :cond_1

    const/4 v1, 0x0

    .line 131
    invoke-virtual {p0, v1}, Ll/ܰܰ᩵;->֫(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    if-nez v2, :cond_0

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "; charset=utf-8"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 106
    :try_start_0
    invoke-static {p0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p0, v1

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 57
    invoke-static {p0, p1}, Ll/ۖ۟᩵;->֫(Ll/ܰܰ᩵;[B)Ll/ۖ۟᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܰ᩵;[B)Ll/ۖ۟᩵;
    .locals 12

    .line 80
    array-length v0, p1

    .line 87
    array-length v1, p1

    int-to-long v1, v1

    const/4 v3, 0x0

    int-to-long v3, v3

    int-to-long v5, v0

    sget-object v7, Ll/᩶۟᩵;->֫:[B

    or-long v7, v3, v5

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-ltz v11, :cond_0

    cmp-long v7, v3, v1

    if-gtz v7, :cond_0

    sub-long/2addr v1, v3

    cmp-long v3, v1, v5

    if-ltz v3, :cond_0

    .line 88
    new-instance v1, Ll/ܺ۟᩵;

    invoke-direct {v1, p0, v0, p1}, Ll/ܺ۟᩵;-><init>(Ll/ܰܰ᩵;I[B)V

    return-object v1

    .line 126
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0
.end method


# virtual methods
.method public abstract ֫()J
.end method

.method public abstract ֫(Ll/ۤܽ֡;)V
.end method

.method public abstract ܽ()Ll/ܰܰ᩵;
.end method
