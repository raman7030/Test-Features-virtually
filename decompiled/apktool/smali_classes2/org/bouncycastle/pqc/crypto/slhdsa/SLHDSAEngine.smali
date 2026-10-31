.class public abstract Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;
.super Ljava/lang/Object;


# instance fields
.field public final A:I

.field public final D:I

.field public final H:I

.field public final H_PRIME:I

.field public final K:I

.field public final N:I

.field public final WOTS_LEN:I

.field public final WOTS_LEN1:I

.field public final WOTS_LEN2:I

.field public final WOTS_LOGW:I

.field public final WOTS_W:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 6

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->N:I

    const/16 v0, 0x10

    const-string v1, "cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}"

    const/4 v2, 0x2

    const/16 v3, 0x100

    const/16 v4, 0x8

    if-ne p2, v0, :cond_3

    const/4 v0, 0x4

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LOGW:I

    mul-int/lit8 v5, p1, 0x8

    div-int/2addr v5, v0

    iput v5, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN1:I

    if-gt p1, v4, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x88

    if-gt p1, v2, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN2:I

    goto :goto_2

    :cond_1
    if-gt p1, v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-ne p2, v3, :cond_6

    iput v4, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LOGW:I

    mul-int/lit8 v0, p1, 0x8

    div-int/2addr v0, v4

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN1:I

    const/4 v0, 0x1

    if-gt p1, v0, :cond_4

    :goto_0
    iput v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN2:I

    goto :goto_2

    :cond_4
    if-gt p1, v3, :cond_5

    :goto_1
    iput v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN2:I

    :goto_2
    iput p2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_W:I

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN1:I

    iget p2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN2:I

    add-int/2addr p1, p2

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->WOTS_LEN:I

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->A:I

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->K:I

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H:I

    div-int/2addr p6, p3

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "wots_w assumed 16 or 256"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract F([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B)[B
.end method

.method public abstract H([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B
.end method

.method public abstract H_msg([B[B[B[B[B)Lorg/bouncycastle/pqc/crypto/slhdsa/IndexedDigest;
.end method

.method public abstract PRF([B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B
.end method

.method public abstract PRF_msg([B[B[B[B)[B
.end method

.method public abstract T_l([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B)[B
.end method

.method public abstract init([B)V
.end method
