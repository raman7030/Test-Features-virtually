.class public Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl$2;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/asymmetric/x509/SignatureCreator;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl;

.field public final synthetic val$sigProvider:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl$2;->val$sigProvider:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl$2;->this$0:Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createSignature(Ljava/lang/String;)Ljava/security/Signature;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/asymmetric/x509/X509CertificateImpl$2;->val$sigProvider:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    return-object p1
.end method
