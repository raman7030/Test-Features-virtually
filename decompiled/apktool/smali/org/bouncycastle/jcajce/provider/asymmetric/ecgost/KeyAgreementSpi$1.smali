.class public Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi$1;
.super Ljava/security/InvalidKeyException;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi;

.field public final synthetic val$e:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 0
    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi$1;->val$e:Ljava/lang/Exception;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi$1;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi;

    invoke-direct {p0, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/ecgost/KeyAgreementSpi$1;->val$e:Ljava/lang/Exception;

    return-object v0
.end method
