.class public abstract Lorg/bouncycastle/pqc/crypto/frodo/FrodoMatrixGenerator;
.super Ljava/lang/Object;


# instance fields
.field public n:I

.field public q:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/frodo/FrodoMatrixGenerator;->n:I

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/frodo/FrodoMatrixGenerator;->q:I

    return-void
.end method


# virtual methods
.method public abstract genMatrix([B)[S
.end method
