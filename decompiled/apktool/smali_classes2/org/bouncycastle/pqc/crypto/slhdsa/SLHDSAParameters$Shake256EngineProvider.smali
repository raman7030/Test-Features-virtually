.class public Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngineProvider;


# instance fields
.field public final a:I

.field public final d:I

.field public final h:I

.field public final k:I

.field public final n:I

.field public final w:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->n:I

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->w:I

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->d:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->a:I

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->k:I

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->h:I

    return-void
.end method


# virtual methods
.method public get()Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;
    .locals 8

    .line 0
    new-instance v7, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->n:I

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->w:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->d:I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->a:I

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->k:I

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->h:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine$Shake256Engine;-><init>(IIIIII)V

    return-object v7
.end method

.method public getN()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAParameters$Shake256EngineProvider;->n:I

    return v0
.end method
