.class public Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/KeyEncoder;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher;

.field public final synthetic val$usePointCompression:Z


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher;Z)V
    .locals 0

    .line 0
    iput-boolean p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher$1;->val$usePointCompression:Z

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher$1;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEncoded(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B
    .locals 1

    .line 0
    check-cast p1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;->getQ()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    iget-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ec/IESCipher$1;->val$usePointCompression:Z

    invoke-virtual {p1, v0}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object p1

    return-object p1
.end method
