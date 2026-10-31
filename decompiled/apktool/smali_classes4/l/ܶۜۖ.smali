.class public abstract Ll/ܶۜۖ;
.super Ljava/lang/Object;
.source "Y4D9"

# interfaces
.implements Ll/ۙۜۖ;


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    .line 195
    invoke-interface {p0}, Ll/ۙۜۖ;->nextByte()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 200
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
