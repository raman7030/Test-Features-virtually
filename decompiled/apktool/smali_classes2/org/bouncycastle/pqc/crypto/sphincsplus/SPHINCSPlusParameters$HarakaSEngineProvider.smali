.class public Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;
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

    iput-boolean p1, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->robust:Z

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->n:I

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->w:I

    iput p4, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->d:I

    iput p5, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->a:I

    iput p6, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->k:I

    iput p7, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->h:I

    return-void
.end method


# virtual methods
.method public get()Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine;
    .locals 9

    .line 0
    new-instance v8, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine$HarakaSEngine;

    iget-boolean v1, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->robust:Z

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->n:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->w:I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->d:I

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->a:I

    iget v6, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->k:I

    iget v7, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->h:I

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine$HarakaSEngine;-><init>(ZIIIIII)V

    return-object v8
.end method

.method public getN()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;->n:I

    return v0
.end method
