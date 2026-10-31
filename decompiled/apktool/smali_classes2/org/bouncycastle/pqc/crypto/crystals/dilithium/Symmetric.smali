.class public abstract Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Symmetric;
.super Ljava/lang/Object;


# instance fields
.field public final stream128BlockBytes:I

.field public final stream256BlockBytes:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Symmetric;->stream128BlockBytes:I

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/crystals/dilithium/Symmetric;->stream256BlockBytes:I

    return-void
.end method


# virtual methods
.method public abstract stream128init([BS)V
.end method

.method public abstract stream128squeezeBlocks([BII)V
.end method

.method public abstract stream256init([BS)V
.end method

.method public abstract stream256squeezeBlocks([BII)V
.end method
