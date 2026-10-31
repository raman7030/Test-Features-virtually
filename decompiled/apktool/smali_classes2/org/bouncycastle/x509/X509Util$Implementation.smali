.class public Lorg/bouncycastle/x509/X509Util$Implementation;
.super Ljava/lang/Object;


# instance fields
.field public engine:Ljava/lang/Object;

.field public provider:Ljava/security/Provider;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/security/Provider;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/x509/X509Util$Implementation;->engine:Ljava/lang/Object;

    iput-object p2, p0, Lorg/bouncycastle/x509/X509Util$Implementation;->provider:Ljava/security/Provider;

    return-void
.end method


# virtual methods
.method public getEngine()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/x509/X509Util$Implementation;->engine:Ljava/lang/Object;

    return-object v0
.end method

.method public getProvider()Ljava/security/Provider;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/x509/X509Util$Implementation;->provider:Ljava/security/Provider;

    return-object v0
.end method
