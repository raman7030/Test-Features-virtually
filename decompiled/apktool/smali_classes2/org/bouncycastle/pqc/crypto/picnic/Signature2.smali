.class public Lorg/bouncycastle/pqc/crypto/picnic/Signature2;
.super Ljava/lang/Object;


# instance fields
.field public challengeC:[I

.field public challengeHash:[B

.field public challengeP:[I

.field public cvInfo:[B

.field public cvInfoLen:I

.field public iSeedInfo:[B

.field public iSeedInfoLen:I

.field public proofs:[Lorg/bouncycastle/pqc/crypto/picnic/Signature2$Proof2;

.field public salt:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->digestSizeBytes:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature2;->challengeHash:[B

    const/16 v0, 0x20

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature2;->salt:[B

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->numOpenedRounds:I

    new-array v1, v0, [I

    iput-object v1, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature2;->challengeC:[I

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature2;->challengeP:[I

    iget p1, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->numMPCRounds:I

    new-array p1, p1, [Lorg/bouncycastle/pqc/crypto/picnic/Signature2$Proof2;

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature2;->proofs:[Lorg/bouncycastle/pqc/crypto/picnic/Signature2$Proof2;

    return-void
.end method
