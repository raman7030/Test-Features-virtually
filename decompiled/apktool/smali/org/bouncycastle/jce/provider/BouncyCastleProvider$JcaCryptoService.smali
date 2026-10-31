.class public Lorg/bouncycastle/jce/provider/BouncyCastleProvider$JcaCryptoService;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/CryptoServiceProperties;


# instance fields
.field public final bitsOfSecurity:I

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$JcaCryptoService;->name:Ljava/lang/String;

    iput p2, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$JcaCryptoService;->bitsOfSecurity:I

    return-void
.end method


# virtual methods
.method public bitsOfSecurity()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$JcaCryptoService;->bitsOfSecurity:I

    return v0
.end method

.method public getParams()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPurpose()Lorg/bouncycastle/crypto/CryptoServicePurpose;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/CryptoServicePurpose;->ANY:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    return-object v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider$JcaCryptoService;->name:Ljava/lang/String;

    return-object v0
.end method
