.class public Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;
.super Ljava/lang/Object;


# instance fields
.field public level:I

.field public subleaf:J

.field public subtree:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->level:I

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->level:I

    iget-wide v0, p1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    iput-wide v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    iget-wide v0, p1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    iput-wide v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    return-void
.end method
