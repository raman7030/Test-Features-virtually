.class public Lorg/bouncycastle/jcajce/provider/drbg/DRBG$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/jcajce/provider/drbg/DRBG$5;->run()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public run()Ljava/lang/String;
    .locals 1

    const-string v0, "securerandom.source"

    .line 0
    invoke-static {v0}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
