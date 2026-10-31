.class public abstract Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;
.super Ljava/lang/Object;


# instance fields
.field public final xofBlockBytes:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/mlkem/Symmetric;->xofBlockBytes:I

    return-void
.end method


# virtual methods
.method public abstract hash_g([B[B)V
.end method

.method public abstract hash_h([B[BI)V
.end method

.method public abstract kdf([B[B)V
.end method

.method public abstract prf([B[BB)V
.end method

.method public abstract xofAbsorb([BBB)V
.end method

.method public abstract xofSqueezeBlocks([BII)V
.end method
