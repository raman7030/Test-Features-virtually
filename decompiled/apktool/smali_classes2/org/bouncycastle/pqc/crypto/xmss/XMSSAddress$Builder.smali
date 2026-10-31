.class public abstract Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;
.super Ljava/lang/Object;


# instance fields
.field public keyAndMask:I

.field public layerAddress:I

.field public treeAddress:J

.field public final type:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->layerAddress:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->treeAddress:J

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->keyAndMask:I

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->type:I

    return-void
.end method

.method public static synthetic access$000(Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;)I
    .locals 0

    .line 0
    iget p0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->layerAddress:I

    return p0
.end method

.method public static synthetic access$100(Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->treeAddress:J

    return-wide v0
.end method

.method public static synthetic access$200(Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;)I
    .locals 0

    .line 0
    iget p0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->type:I

    return p0
.end method

.method public static synthetic access$300(Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;)I
    .locals 0

    .line 0
    iget p0, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->keyAndMask:I

    return p0
.end method


# virtual methods
.method public abstract build()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress;
.end method

.method public abstract getThis()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;
.end method

.method public withKeyAndMask(I)Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;
    .locals 0

    .line 0
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->keyAndMask:I

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->getThis()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;

    move-result-object p1

    return-object p1
.end method

.method public withLayerAddress(I)Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;
    .locals 0

    .line 0
    iput p1, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->layerAddress:I

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->getThis()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;

    move-result-object p1

    return-object p1
.end method

.method public withTreeAddress(J)Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;
    .locals 0

    .line 0
    iput-wide p1, p0, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->treeAddress:J

    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;->getThis()Lorg/bouncycastle/pqc/crypto/xmss/XMSSAddress$Builder;

    move-result-object p1

    return-object p1
.end method
