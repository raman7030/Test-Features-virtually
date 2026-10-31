.class public final Ll/ۛ۟ۖ;
.super Ljava/lang/Object;
.source "99JQ"

# interfaces
.implements Ll/᩶ܰۖ;


# virtual methods
.method public final create()Ljava/lang/Object;
    .locals 2

    .line 52
    new-instance v0, Ll/ۤ۟ۖ;

    new-instance v1, Lorg/bouncycastle/crypto/engines/RC4Engine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/RC4Engine;-><init>()V

    invoke-direct {v0, v1}, Ll/᩺۟ۖ;-><init>(Lorg/bouncycastle/crypto/engines/RC4Engine;)V

    return-object v0
.end method
