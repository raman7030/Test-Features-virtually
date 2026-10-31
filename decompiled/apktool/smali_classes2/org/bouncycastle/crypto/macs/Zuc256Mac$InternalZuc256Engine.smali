.class public Lorg/bouncycastle/crypto/macs/Zuc256Mac$InternalZuc256Engine;
.super Lorg/bouncycastle/crypto/engines/Zuc256CoreEngine;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/Zuc256CoreEngine;-><init>(I)V

    return-void
.end method


# virtual methods
.method public createKeyStreamWord()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/Zuc128CoreEngine;->makeKeyStreamWord()I

    move-result v0

    return v0
.end method
