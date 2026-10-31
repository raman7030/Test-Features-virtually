.class public Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;
.super Ljava/lang/Object;


# instance fields
.field public final communicatedBits:[B

.field public final inputShare:[I

.field public final seed1:[B

.field public final seed2:[B

.field public final view3Commitment:[B

.field public final view3UnruhG:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->seedSizeBytes:I

    new-array v1, v0, [B

    iput-object v1, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->seed1:[B

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->seed2:[B

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->stateSizeWords:I

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->inputShare:[I

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->andSizeBytes:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->communicatedBits:[B

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->digestSizeBytes:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->view3Commitment:[B

    iget p1, p1, Lorg/bouncycastle/pqc/crypto/picnic/PicnicEngine;->UnruhGWithInputBytes:I

    if-lez p1, :cond_0

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->view3UnruhG:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/picnic/Signature$Proof;->view3UnruhG:[B

    return-void
.end method
