.class public final synthetic Ll/֫ܺۡ;
.super Ljava/lang/Object;
.source "53XL"


# direct methods
.method public static ֫(Ll/ۧܺۡ;)Ljava/io/InputStream;
    .locals 1

    .line 622
    invoke-interface {p0}, Ll/ۧܺۡ;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    .line 623
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 624
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0

    :cond_0
    return-object p0
.end method
