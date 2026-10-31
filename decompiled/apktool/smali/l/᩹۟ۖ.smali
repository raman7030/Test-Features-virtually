.class public final Ll/᩹۟ۖ;
.super Ll/ۙ۟ۖ;
.source "G9IQ"


# virtual methods
.method public final ֫([BLjavax/crypto/spec/GCMParameterSpec;)Lorg/bouncycastle/crypto/params/AEADParameters;
    .locals 2

    .line 63
    new-instance v0, Lorg/bouncycastle/crypto/params/AEADParameters;

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v1, p1}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    .line 65
    invoke-virtual {p2}, Ljavax/crypto/spec/GCMParameterSpec;->getTLen()I

    move-result p1

    .line 66
    invoke-virtual {p2}, Ljavax/crypto/spec/GCMParameterSpec;->getIV()[B

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B)V

    return-object v0
.end method
