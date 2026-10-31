.class public Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/asymmetric/x509/SignatureCreator;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;

.field public final synthetic val$sigProvider:Ljava/security/Provider;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;Ljava/security/Provider;)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->val$sigProvider:Ljava/security/Provider;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createSignature(Ljava/lang/String;)Ljava/security/Signature;
    .locals 1

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->val$sigProvider:Ljava/security/Provider;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;->getSigAlgName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->val$sigProvider:Ljava/security/Provider;

    invoke-static {p1, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl$3;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CRLImpl;->getSigAlgName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    return-object p1
.end method
