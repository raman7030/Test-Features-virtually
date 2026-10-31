.class public Lorg/bouncycastle/crypto/macs/Zuc128Mac$InternalZuc128Engine;
.super Lorg/bouncycastle/crypto/engines/Zuc128CoreEngine;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/Zuc128CoreEngine;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/macs/Zuc128Mac$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/macs/Zuc128Mac$InternalZuc128Engine;-><init>()V

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
