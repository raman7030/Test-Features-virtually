.class public Lorg/bouncycastle/crypto/util/ScryptConfig;
.super Lorg/bouncycastle/crypto/util/PBKDFConfig;


# instance fields
.field public final blockSize:I

.field public final costParameter:I

.field public final parallelizationParameter:I

.field public final saltLength:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_scrypt:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/util/PBKDFConfig;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    invoke-static {p1}, Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;->access$100(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->costParameter:I

    invoke-static {p1}, Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;->access$200(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->blockSize:I

    invoke-static {p1}, Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;->access$300(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->parallelizationParameter:I

    invoke-static {p1}, Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;->access$400(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->saltLength:I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;Lorg/bouncycastle/crypto/util/ScryptConfig$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/util/ScryptConfig;-><init>(Lorg/bouncycastle/crypto/util/ScryptConfig$Builder;)V

    return-void
.end method


# virtual methods
.method public getBlockSize()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->blockSize:I

    return v0
.end method

.method public getCostParameter()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->costParameter:I

    return v0
.end method

.method public getParallelizationParameter()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->parallelizationParameter:I

    return v0
.end method

.method public getSaltLength()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/util/ScryptConfig;->saltLength:I

    return v0
.end method
