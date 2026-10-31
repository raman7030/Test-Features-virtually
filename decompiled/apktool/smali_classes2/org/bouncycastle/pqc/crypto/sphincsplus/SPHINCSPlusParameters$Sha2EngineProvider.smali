.class public Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;


# instance fields
.field public final a:I

.field public final d:I

.field public final h:I

.field public final k:I

.field public final n:I

.field public final robust:Z

.field public final w:I


# direct methods
.method public constructor <init>(ZIIIIII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->robust:Z

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->n:I

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->w:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->d:I

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->a:I

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->k:I

    iput p7, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->h:I

    return-void
.end method


# virtual methods
.method public get()Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine;
    .locals 9

    .line 0
    new-instance v8, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine$Sha2Engine;

    iget-boolean v1, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->robust:Z

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->n:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->w:I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->d:I

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->a:I

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->k:I

    iget v7, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->h:I

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine$Sha2Engine;-><init>(ZIIIIII)V

    return-object v8
.end method

.method public getN()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;->n:I

    return v0
.end method
