.class public Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;
.super Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;

# interfaces
.implements Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE;


# static fields
.field public static final BUF_SIZE:I = 0x200

.field public static final availableSpecs:[Ljava/lang/Class;


# instance fields
.field public aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

.field public baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

.field public cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

.field public digest:I

.field public engineProvider:Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;

.field public fixedIv:Z

.field public ivLength:I

.field public ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

.field public keySizeInBits:I

.field public modeName:Ljava/lang/String;

.field public padded:Z

.field public pbeAlgorithm:Ljava/lang/String;

.field public pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

.field public scheme:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Class;

    .line 0
    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljavax/crypto/spec/RC5ParameterSpec;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/GcmSpecUtil;->gcmSpecClass:Ljava/lang/Class;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-class v1, Ljavax/crypto/spec/IvParameterSpec;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-class v1, Ljavax/crypto/spec/PBEParameterSpec;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->availableSpecs:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/crypto/BlockCipher;I)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/crypto/BufferedBlockCipher;I)V
    .locals 2

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/crypto/modes/AEADBlockCipher;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    invoke-interface {p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/modes/AEADCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GCM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_0

    const/16 p1, 0xc

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    :goto_0
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    invoke-direct {p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/crypto/modes/AEADBlockCipher;ZI)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    invoke-interface {p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput-boolean p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    iput p4, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    invoke-direct {p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(ILorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    invoke-interface {p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;->get()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineProvider:Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-interface {p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;->get()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;I)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, p1, v0, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;ZI)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;IIII)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->digest:I

    iput p4, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iput p5, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {p2, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;ZI)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput-boolean p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    new-instance p2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {p2, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;I)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, p1, v0, p2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;ZI)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;ZI)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    iput-boolean p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(ILorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;ZI)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0, p1, p2, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;-><init>(ILorg/bouncycastle/crypto/modes/AEADBlockCipher;ZI)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/modes/AEADCipher;ZI)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput-boolean p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    iput p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    invoke-direct {p2, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    invoke-interface {p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;->get()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineProvider:Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;

    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;->get()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void
.end method

.method private adjustParameters(Ljava/security/spec/AlgorithmParameterSpec;Lorg/bouncycastle/crypto/CipherParameters;)Lorg/bouncycastle/crypto/CipherParameters;
    .locals 3

    .line 0
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    instance-of v1, p1, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v1, :cond_0

    check-cast p1, Ljavax/crypto/spec/IvParameterSpec;

    new-instance p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p1}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    return-object p2

    :cond_0
    instance-of v1, p1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    if-eqz v1, :cond_5

    check-cast p1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithSBox;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getSBox()[B

    move-result-object v2

    invoke-direct {v1, p2, v2}, Lorg/bouncycastle/crypto/params/ParametersWithSBox;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object p2

    if-eqz p2, :cond_1

    iget p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz p2, :cond_1

    new-instance p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    iput-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    return-object p2

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p1, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_3

    check-cast p1, Ljavax/crypto/spec/IvParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p1}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    return-object v0

    :cond_3
    instance-of v0, p1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    if-eqz v0, :cond_5

    check-cast p1, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithSBox;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getSBox()[B

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lorg/bouncycastle/crypto/params/ParametersWithSBox;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object p2

    if-eqz p2, :cond_4

    iget p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz p2, :cond_4

    new-instance p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p1}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    return-object p2

    :cond_4
    return-object v0

    :cond_5
    return-object p2
.end method

.method private isAEADModeName(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "CCM"

    .line 0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "EAX"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GCM"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GCM-SIV"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "OCB"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public engineDoFinal([BII[BI)I
    .locals 8

    .line 0
    invoke-virtual {p0, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineGetOutputSize(I)I

    move-result v0

    add-int/2addr v0, p5

    array-length v1, p4

    if-gt v0, v1, :cond_1

    if-eqz p3, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->processBytes([BII[BI)I

    move-result p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    add-int/2addr p5, p1

    invoke-interface {p2, p4, p5}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->doFinal([BI)I

    move-result p2
    :try_end_0
    .catch Lorg/bouncycastle/crypto/OutputLengthException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p1, p2

    return p1

    :goto_1
    new-instance p2, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_2
    new-instance p2, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljavax/crypto/ShortBufferException;

    const-string p2, "output buffer too short for input."

    invoke-direct {p1, p2}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineDoFinal([BII)[B
    .locals 9

    .line 0
    invoke-virtual {p0, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineGetOutputSize(I)I

    move-result v0

    new-array v7, v0, [B

    const/4 v8, 0x0

    if-eqz p3, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    const/4 v6, 0x0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, v7

    invoke-interface/range {v1 .. v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->processBytes([BII[BI)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    :try_start_0
    iget-object p2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {p2, v7, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->doFinal([BI)I

    move-result p2
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p1, p2

    if-ne p1, v0, :cond_1

    return-object v7

    :cond_1
    if-gt p1, v0, :cond_2

    new-array p2, p1, [B

    invoke-static {v7, v8, p2, v8, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_2
    new-instance p1, Ljavax/crypto/IllegalBlockSizeException;

    const-string p2, "internal buffer overflow"

    invoke-direct {p1, p2}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public engineGetBlockSize()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    return v0
.end method

.method public engineGetIV()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public engineGetKeySize(Ljava/security/Key;)I
    .locals 0

    .line 0
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x8

    return p1
.end method

.method public engineGetOutputSize(I)I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getOutputSize(I)I

    move-result p1

    return p1
.end method

.method public engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->createParametersInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    if-nez v0, :cond_1

    :try_start_1
    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->id_alg_AEADChaCha20Poly1305:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->createParametersInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    new-instance v1, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :try_start_2
    const-string v0, "GCM"

    invoke-virtual {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->createParametersInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    new-instance v1, Lorg/bouncycastle/internal/asn1/cms/GCMParameters;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/params/AEADParameters;->getMacSize()I

    move-result v3

    div-int/lit8 v3, v3, 0x8

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/internal/asn1/cms/GCMParameters;-><init>([BI)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_3
    :try_start_3
    invoke-virtual {p0, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->createParametersInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_0

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    return-object v0
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 1

    if-eqz p3, :cond_1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->availableSpecs:[Ljava/lang/Class;

    invoke-static {p3, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/SpecUtil;->extractSpec(Ljava/security/AlgorithmParameters;[Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "can\'t handle parameter "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/security/AlgorithmParameters;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    iput-object p3, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    return-void
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/InvalidKeyException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 21

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "unknown opmode "

    const/4 v6, 0x0

    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher;->engineParams:Ljava/security/AlgorithmParameters;

    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    instance-of v7, v2, Ljavax/crypto/SecretKey;

    if-nez v7, :cond_1

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Key for algorithm "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v2, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v6

    :cond_0
    const-string v2, " not suitable for symmetric enryption."

    .line 0
    invoke-static {v3, v6, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v7, "RC5-64"

    if-nez v3, :cond_3

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    if-eqz v8, :cond_3

    invoke-interface {v8}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "RC5 requires an RC5ParametersSpec to be passed in."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    const-string v9, "Algorithm requires a PBE key"

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v8, v11, :cond_12

    instance-of v13, v2, Lorg/bouncycastle/jcajce/PKCS12Key;

    if-eqz v13, :cond_4

    goto/16 :goto_3

    :cond_4
    instance-of v13, v2, Lorg/bouncycastle/jcajce/PBKDF1Key;

    if-eqz v13, :cond_7

    move-object v6, v2

    check-cast v6, Lorg/bouncycastle/jcajce/PBKDF1Key;

    instance-of v8, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v8, :cond_5

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_5
    instance-of v8, v6, Lorg/bouncycastle/jcajce/PBKDF1KeyWithParameters;

    if-eqz v8, :cond_6

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v8, :cond_6

    new-instance v8, Ljavax/crypto/spec/PBEParameterSpec;

    move-object v9, v6

    check-cast v9, Lorg/bouncycastle/jcajce/PBKDF1KeyWithParameters;

    invoke-virtual {v9}, Lorg/bouncycastle/jcajce/PBKDF1KeyWithParameters;->getSalt()[B

    move-result-object v13

    invoke-virtual {v9}, Lorg/bouncycastle/jcajce/PBKDF1KeyWithParameters;->getIterationCount()I

    move-result v9

    invoke-direct {v8, v13, v9}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_6
    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/PBKDF1Key;->getEncoded()[B

    move-result-object v14

    iget v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->digest:I

    iget v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iget v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    mul-int/lit8 v18, v9, 0x8

    iget-object v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v13, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v13}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v20

    const/4 v15, 0x0

    move/from16 v16, v6

    move/from16 v17, v8

    move-object/from16 v19, v9

    invoke-static/range {v14 .. v20}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters([BIIIILjava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    instance-of v8, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v8, :cond_1b

    goto/16 :goto_8

    :cond_7
    instance-of v13, v2, Lorg/bouncycastle/jcajce/PBKDF2Key;

    if-eqz v13, :cond_a

    move-object v6, v2

    check-cast v6, Lorg/bouncycastle/jcajce/PBKDF2Key;

    instance-of v8, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v8, :cond_8

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_8
    instance-of v8, v6, Lorg/bouncycastle/jcajce/PBKDF2KeyWithParameters;

    if-eqz v8, :cond_9

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v8, :cond_9

    new-instance v8, Ljavax/crypto/spec/PBEParameterSpec;

    move-object v9, v6

    check-cast v9, Lorg/bouncycastle/jcajce/PBKDF2KeyWithParameters;

    invoke-virtual {v9}, Lorg/bouncycastle/jcajce/PBKDF2KeyWithParameters;->getSalt()[B

    move-result-object v13

    invoke-virtual {v9}, Lorg/bouncycastle/jcajce/PBKDF2KeyWithParameters;->getIterationCount()I

    move-result v9

    invoke-direct {v8, v13, v9}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_9
    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/PBKDF2Key;->getEncoded()[B

    move-result-object v14

    iget v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v9}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v20

    const/4 v15, 0x1

    const/16 v16, 0x9

    const/16 v18, 0x0

    move/from16 v17, v6

    move-object/from16 v19, v8

    invoke-static/range {v14 .. v20}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters([BIIIILjava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    instance-of v8, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v8, :cond_1b

    goto/16 :goto_8

    :cond_a
    instance-of v13, v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    if-eqz v13, :cond_e

    move-object v6, v2

    check-cast v6, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getOID()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getOID()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v8

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_b
    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v8

    :goto_1
    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getParam()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    if-eqz v8, :cond_c

    invoke-virtual {v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getParam()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    invoke-direct {v1, v3, v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->adjustParameters(Ljava/security/spec/AlgorithmParameterSpec;Lorg/bouncycastle/crypto/CipherParameters;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    goto :goto_2

    :cond_c
    instance-of v8, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v8, :cond_d

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v8}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v8

    invoke-interface {v8}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v3, v8}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters(Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    :goto_2
    instance-of v8, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v8, :cond_1b

    goto/16 :goto_8

    :cond_d
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    instance-of v13, v2, Ljavax/crypto/interfaces/PBEKey;

    if-eqz v13, :cond_10

    move-object v6, v2

    check-cast v6, Ljavax/crypto/interfaces/PBEKey;

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    instance-of v9, v6, Lorg/bouncycastle/jcajce/PKCS12KeyWithParameters;

    if-eqz v9, :cond_f

    if-nez v8, :cond_f

    new-instance v8, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-interface {v6}, Ljavax/crypto/interfaces/PBEKey;->getSalt()[B

    move-result-object v9

    invoke-interface {v6}, Ljavax/crypto/interfaces/PBEKey;->getIterationCount()I

    move-result v13

    invoke-direct {v8, v9, v13}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_f
    invoke-interface {v6}, Ljava/security/Key;->getEncoded()[B

    move-result-object v14

    iget v15, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->scheme:I

    iget v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->digest:I

    iget v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iget v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    mul-int/lit8 v18, v9, 0x8

    iget-object v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v13, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v13}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v20

    move/from16 v16, v6

    move/from16 v17, v8

    move-object/from16 v19, v9

    invoke-static/range {v14 .. v20}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters([BIIIILjava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    instance-of v8, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v8, :cond_1b

    goto/16 :goto_8

    :cond_10
    instance-of v13, v2, Lorg/bouncycastle/jcajce/spec/RepeatedSecretKeySpec;

    if-nez v13, :cond_1b

    if-eqz v8, :cond_11

    if-eq v8, v10, :cond_11

    if-eq v8, v12, :cond_11

    const/4 v6, 0x5

    if-eq v8, v6, :cond_11

    new-instance v6, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface/range {p2 .. p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v8

    invoke-direct {v6, v8}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    goto/16 :goto_9

    :cond_11
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, v9}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    :goto_3
    :try_start_0
    move-object v6, v2

    check-cast v6, Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    instance-of v8, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v8, :cond_13

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    :cond_13
    instance-of v8, v6, Ljavax/crypto/interfaces/PBEKey;

    if-eqz v8, :cond_15

    iget-object v13, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v13, :cond_15

    move-object v13, v6

    check-cast v13, Ljavax/crypto/interfaces/PBEKey;

    invoke-interface {v13}, Ljavax/crypto/interfaces/PBEKey;->getSalt()[B

    move-result-object v14

    if-eqz v14, :cond_14

    new-instance v14, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-interface {v13}, Ljavax/crypto/interfaces/PBEKey;->getSalt()[B

    move-result-object v15

    invoke-interface {v13}, Ljavax/crypto/interfaces/PBEKey;->getIterationCount()I

    move-result v13

    invoke-direct {v14, v15, v13}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v14, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    goto :goto_4

    :cond_14
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "PBEKey requires parameters to specify salt"

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_4
    iget-object v13, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v13, :cond_17

    if-eqz v8, :cond_16

    goto :goto_5

    :cond_16
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, v9}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_5
    const-string v8, "PKCS12PBE"

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeAlgorithm:Ljava/lang/String;

    instance-of v8, v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    if-eqz v8, :cond_1a

    move-object v8, v2

    check-cast v8, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;

    invoke-virtual {v8}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BCPBEKey;->getParam()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    instance-of v9, v8, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v9, :cond_18

    goto :goto_6

    :cond_18
    if-nez v8, :cond_19

    invoke-interface {v6}, Ljava/security/Key;->getEncoded()[B

    move-result-object v13

    iget v15, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->digest:I

    iget v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iget v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    mul-int/lit8 v17, v8, 0x8

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v9}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v19

    const/4 v14, 0x2

    move/from16 v16, v6

    move-object/from16 v18, v8

    invoke-static/range {v13 .. v19}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters([BIIIILjava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v8

    :goto_6
    move-object v6, v8

    goto :goto_7

    :cond_19
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v2, "Algorithm requires a PBE key suitable for PKCS12"

    invoke-direct {v0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-interface {v6}, Ljava/security/Key;->getEncoded()[B

    move-result-object v13

    iget v15, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->digest:I

    iget v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->keySizeInBits:I

    iget v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    mul-int/lit8 v17, v8, 0x8

    iget-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v9, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v9}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v19

    const/4 v14, 0x2

    move/from16 v16, v6

    move-object/from16 v18, v8

    invoke-static/range {v13 .. v19}, Lorg/bouncycastle/jcajce/provider/symmetric/util/PBE$Util;->makePBEParameters([BIIIILjava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    :goto_7
    instance-of v8, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v8, :cond_1b

    :goto_8
    move-object v8, v6

    check-cast v8, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v8, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :cond_1b
    :goto_9
    instance-of v8, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v8, :cond_1d

    move-object v8, v3

    check-cast v8, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v8}, Ljavax/crypto/spec/PBEParameterSpec;->getParameterSpec()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v8

    instance-of v9, v8, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v9, :cond_1c

    move-object v9, v8

    check-cast v9, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {v9}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v9

    array-length v9, v9

    if-nez v9, :cond_1c

    goto :goto_a

    :cond_1c
    move-object v3, v8

    :cond_1d
    :goto_a
    nop

    instance-of v8, v3, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;

    if-eqz v8, :cond_21

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->isAEADModeName(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1f

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    instance-of v2, v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    if-eqz v2, :cond_1e

    goto :goto_b

    :cond_1e
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "AEADParameterSpec can only be used with AEAD modes."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    :goto_b
    check-cast v3, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;

    instance-of v2, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v2, :cond_20

    check-cast v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_c

    :cond_20
    move-object v2, v6

    check-cast v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    :goto_c
    new-instance v6, Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getMacSizeInBits()I

    move-result v7

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getNonce()[B

    move-result-object v8

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/AEADParameterSpec;->getAssociatedData()[B

    move-result-object v3

    invoke-direct {v6, v2, v7, v8, v3}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B[B)V

    goto/16 :goto_14

    :cond_21
    instance-of v8, v3, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v8, :cond_27

    iget v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz v2, :cond_25

    check-cast v3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {v3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    array-length v2, v2

    iget v7, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eq v2, v7, :cond_23

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    instance-of v2, v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    if-nez v2, :cond_23

    iget-boolean v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    if-nez v2, :cond_22

    goto :goto_d

    :cond_22
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IV must be "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const-string v4, " bytes long."

    invoke-static {v3, v4, v2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    :goto_d
    instance-of v2, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v2, :cond_24

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    check-cast v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v6

    invoke-virtual {v3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v3

    invoke-direct {v2, v6, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto :goto_e

    :cond_24
    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v3

    invoke-direct {v2, v6, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    :goto_e
    move-object v6, v2

    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    goto/16 :goto_15

    :cond_25
    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    if-eqz v2, :cond_36

    const-string v3, "ECB"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    goto/16 :goto_15

    :cond_26
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "ECB mode does not use an IV"

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    instance-of v8, v3, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    if-eqz v8, :cond_28

    check-cast v3, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;

    new-instance v6, Lorg/bouncycastle/crypto/params/ParametersWithSBox;

    new-instance v7, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface/range {p2 .. p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v7, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getSBox()[B

    move-result-object v2

    invoke-direct {v6, v7, v2}, Lorg/bouncycastle/crypto/params/ParametersWithSBox;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object v2

    if-eqz v2, :cond_36

    iget v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz v2, :cond_36

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/GOST28147ParameterSpec;->getIV()[B

    move-result-object v3

    invoke-direct {v2, v6, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto/16 :goto_10

    :cond_28
    instance-of v8, v3, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v8, :cond_29

    check-cast v3, Ljavax/crypto/spec/RC2ParameterSpec;

    new-instance v6, Lorg/bouncycastle/crypto/params/RC2Parameters;

    invoke-interface/range {p2 .. p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v3}, Ljavax/crypto/spec/RC2ParameterSpec;->getEffectiveKeyBits()I

    move-result v7

    invoke-direct {v6, v2, v7}, Lorg/bouncycastle/crypto/params/RC2Parameters;-><init>([BI)V

    invoke-virtual {v3}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v2

    if-eqz v2, :cond_36

    iget v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz v2, :cond_36

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v3}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v3

    invoke-direct {v2, v6, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    goto/16 :goto_10

    :cond_29
    instance-of v8, v3, Ljavax/crypto/spec/RC5ParameterSpec;

    if-eqz v8, :cond_2f

    check-cast v3, Ljavax/crypto/spec/RC5ParameterSpec;

    new-instance v6, Lorg/bouncycastle/crypto/params/RC5Parameters;

    invoke-interface/range {p2 .. p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getRounds()I

    move-result v8

    invoke-direct {v6, v2, v8}, Lorg/bouncycastle/crypto/params/RC5Parameters;-><init>([BI)V

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v8, "RC5"

    invoke-virtual {v2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v8, "RC5-32"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, "."

    if-eqz v2, :cond_2b

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v2

    const/16 v7, 0x20

    if-ne v2, v7, :cond_2a

    goto :goto_f

    :cond_2a
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "RC5 already set up for a word size of 32 not "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v2

    const/16 v7, 0x40

    if-ne v2, v7, :cond_2c

    goto :goto_f

    :cond_2c
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "RC5 already set up for a word size of 64 not "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    :goto_f
    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v2

    if-eqz v2, :cond_36

    iget v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    if-eqz v2, :cond_36

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v3}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v3

    invoke-direct {v2, v6, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    :goto_10
    iput-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    goto :goto_11

    :cond_2e
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "RC5 parameters passed to a cipher that is not RC5."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    instance-of v2, v3, Lorg/bouncycastle/jcajce/spec/FPEParameterSpec;

    if-eqz v2, :cond_30

    check-cast v3, Lorg/bouncycastle/jcajce/spec/FPEParameterSpec;

    new-instance v2, Lorg/bouncycastle/crypto/params/FPEParameters;

    check-cast v6, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/FPEParameterSpec;->getRadixConverter()Lorg/bouncycastle/crypto/util/RadixConverter;

    move-result-object v7

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/FPEParameterSpec;->getTweak()[B

    move-result-object v8

    invoke-virtual {v3}, Lorg/bouncycastle/jcajce/spec/FPEParameterSpec;->isUsingInverseFunction()Z

    move-result v3

    invoke-direct {v2, v6, v7, v8, v3}, Lorg/bouncycastle/crypto/params/FPEParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;Lorg/bouncycastle/crypto/util/RadixConverter;[BZ)V

    :goto_11
    move-object v6, v2

    goto :goto_15

    :cond_30
    invoke-static {v3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/GcmSpecUtil;->isGcmSpec(Ljava/security/spec/AlgorithmParameterSpec;)Z

    move-result v2

    if-eqz v2, :cond_34

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->isAEADModeName(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_32

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    instance-of v2, v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    if-eqz v2, :cond_31

    goto :goto_12

    :cond_31
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "GCMParameterSpec can only be used with AEAD modes."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    :goto_12
    instance-of v2, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v2, :cond_33

    check-cast v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_13

    :cond_33
    move-object v2, v6

    check-cast v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    :goto_13
    invoke-static {v2, v3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/GcmSpecUtil;->extractAeadParameters(Lorg/bouncycastle/crypto/params/KeyParameter;Ljava/security/spec/AlgorithmParameterSpec;)Lorg/bouncycastle/crypto/params/AEADParameters;

    move-result-object v2

    move-object v6, v2

    :goto_14
    iput-object v6, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    goto :goto_15

    :cond_34
    if-eqz v3, :cond_36

    instance-of v2, v3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v2, :cond_35

    goto :goto_15

    :cond_35
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "unknown parameter type."

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    :goto_15
    iget v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/4 v3, 0x3

    if-eqz v2, :cond_3b

    instance-of v2, v6, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-nez v2, :cond_3b

    instance-of v2, v6, Lorg/bouncycastle/crypto/params/AEADParameters;

    if-nez v2, :cond_3b

    if-nez v4, :cond_37

    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v2

    goto :goto_16

    :cond_37
    move-object v2, v4

    :goto_16
    if-eq v0, v12, :cond_3a

    if-ne v0, v3, :cond_38

    goto :goto_17

    :cond_38
    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v2

    invoke-interface {v2}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    const-string v7, "PGPCFB"

    invoke-virtual {v2, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_39

    goto :goto_18

    :cond_39
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v2, "no IV set when one expected"

    invoke-direct {v0, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    :goto_17
    iget v7, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-array v7, v7, [B

    invoke-virtual {v2, v7}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-direct {v2, v6, v7}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    iput-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    move-object v6, v2

    :cond_3b
    :goto_18
    if-eqz v4, :cond_3c

    iget-boolean v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->padded:Z

    if-eqz v2, :cond_3c

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v2, v6, v4}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    move-object v6, v2

    :cond_3c
    if-eq v0, v12, :cond_3f

    if-eq v0, v11, :cond_3e

    if-eq v0, v3, :cond_3f

    if-ne v0, v10, :cond_3d

    goto :goto_19

    :cond_3d
    :try_start_1
    new-instance v2, Ljava/security/InvalidParameterException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " passed"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3e
    :goto_19
    iget-object v0, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_1a

    :cond_3f
    iget-object v0, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0, v12, v6}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    :goto_1a
    iget-object v0, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    instance-of v2, v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    if-eqz v2, :cond_40

    iget-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;

    if-nez v2, :cond_40

    check-cast v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    invoke-static {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;->access$000(Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;)Lorg/bouncycastle/crypto/modes/AEADCipher;

    move-result-object v0

    new-instance v2, Lorg/bouncycastle/crypto/params/AEADParameters;

    iget-object v3, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/modes/AEADCipher;->getMac()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    iget-object v4, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivParam:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v4

    invoke-direct {v2, v3, v0, v4}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B)V

    iput-object v2, v1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->aeadParams:Lorg/bouncycastle/crypto/params/AEADParameters;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_40
    return-void

    :catch_0
    move-exception v0

    new-instance v2, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher$InvalidKeyOrParametersException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseWrapCipher$InvalidKeyOrParametersException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v0

    new-instance v2, Ljava/security/InvalidAlgorithmParameterException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v2, "PKCS12 requires a SecretKey/PBEKey"

    invoke-direct {v0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineSetMode(Ljava/lang/String;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    if-eqz v0, :cond_1b

    .line 7
    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v1, "ECB"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 21
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 23
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 25
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 28
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 30
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "CBC"

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 46
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 49
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 51
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 53
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 56
    invoke-static {v0}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CBCModeCipher;

    move-result-object v0

    .line 60
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 62
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "OFB"

    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x3

    if-eqz v0, :cond_3

    .line 76
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 79
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 82
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 84
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eq p1, v2, :cond_2

    .line 92
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 95
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 102
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 104
    new-instance v1, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    .line 106
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 109
    invoke-direct {v1, v2, p1}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    .line 112
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 114
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 117
    :cond_2
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 119
    new-instance v0, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    .line 121
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 124
    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    .line 130
    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    .line 133
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 135
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 138
    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v3, "CFB"

    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 148
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 151
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 154
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 156
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eq p1, v2, :cond_4

    .line 164
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 167
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 171
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 174
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 176
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 179
    invoke-static {v1, p1}, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;I)Lorg/bouncycastle/crypto/modes/CFBModeCipher;

    move-result-object p1

    .line 183
    invoke-direct {v0, p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 185
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 188
    :cond_4
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 190
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 193
    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    .line 199
    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;I)Lorg/bouncycastle/crypto/modes/CFBModeCipher;

    move-result-object v0

    .line 203
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 205
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 208
    :cond_5
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "PGPCFB"

    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 218
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v0, "PGPCFBWITHIV"

    .line 223
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 228
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_6

    goto :goto_0

    .line 238
    :cond_6
    new-instance p1, Ljava/security/NoSuchAlgorithmException;

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no mode support for "

    .line 245
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 257
    invoke-direct {p1, v0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    .line 258
    throw p1

    .line 260
    :cond_7
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 263
    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    .line 266
    iput v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 268
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 270
    new-instance v1, Lorg/bouncycastle/crypto/modes/PGPCFBBlockCipher;

    .line 272
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 275
    invoke-direct {v1, v2, p1}, Lorg/bouncycastle/crypto/modes/PGPCFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Z)V

    .line 278
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 280
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 283
    :cond_8
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "OPENPGPCFB"

    .line 288
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 293
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 295
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 297
    new-instance v0, Lorg/bouncycastle/crypto/modes/OpenPGPCFBBlockCipher;

    .line 299
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 302
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/OpenPGPCFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 305
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 307
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 310
    :cond_9
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "FF1"

    .line 315
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 320
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 322
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedFPEBlockCipher;

    .line 324
    new-instance v0, Lorg/bouncycastle/crypto/fpe/FPEFF1Engine;

    .line 326
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 329
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/fpe/FPEFF1Engine;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 332
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedFPEBlockCipher;-><init>(Lorg/bouncycastle/crypto/fpe/FPEEngine;)V

    .line 334
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 337
    :cond_a
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "FF3-1"

    .line 342
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 347
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 349
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedFPEBlockCipher;

    .line 351
    new-instance v0, Lorg/bouncycastle/crypto/fpe/FPEFF3_1Engine;

    .line 353
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 356
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/fpe/FPEFF3_1Engine;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 359
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedFPEBlockCipher;-><init>(Lorg/bouncycastle/crypto/fpe/FPEEngine;)V

    .line 361
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 364
    :cond_b
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "SIC"

    .line 369
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 374
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 377
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 380
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_c

    .line 386
    iput-boolean v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    .line 388
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 390
    new-instance v0, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 392
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 395
    invoke-static {v1}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    move-result-object v1

    .line 399
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 402
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 404
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 407
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)"

    .line 412
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 413
    throw p1

    .line 415
    :cond_d
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "CTR"

    .line 420
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 425
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 428
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 431
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 433
    iput-boolean v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->fixedIv:Z

    .line 435
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 437
    instance-of v0, p1, Lorg/bouncycastle/crypto/engines/DSTU7624Engine;

    if-eqz v0, :cond_e

    .line 441
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 443
    new-instance v1, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 445
    new-instance v2, Lorg/bouncycastle/crypto/modes/KCTRBlockCipher;

    .line 448
    invoke-direct {v2, p1}, Lorg/bouncycastle/crypto/modes/KCTRBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 451
    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 454
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 456
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 459
    :cond_e
    new-instance v0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 461
    new-instance v1, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 464
    invoke-static {p1}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    move-result-object p1

    .line 468
    invoke-direct {v1, p1}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 471
    invoke-direct {v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 473
    iput-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 476
    :cond_f
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v1, "GOFB"

    .line 481
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 486
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 489
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 492
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 494
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 496
    new-instance v0, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 498
    new-instance v1, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;

    .line 500
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 503
    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 506
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 509
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 511
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 514
    :cond_10
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v1, "GCFB"

    .line 519
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 524
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 527
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 530
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 532
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 534
    new-instance v0, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 536
    new-instance v1, Lorg/bouncycastle/crypto/modes/GCFBBlockCipher;

    .line 538
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 541
    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/GCFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 544
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 547
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 549
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 552
    :cond_11
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v1, "CTS"

    .line 557
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 562
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 565
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    .line 568
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 570
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 572
    new-instance v0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;

    .line 574
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 577
    invoke-static {v1}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CBCModeCipher;

    move-result-object v1

    .line 581
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 584
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 586
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 589
    :cond_12
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v1, "CCM"

    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0xc

    if-eqz v0, :cond_14

    .line 601
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 603
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 605
    instance-of p1, p1, Lorg/bouncycastle/crypto/engines/DSTU7624Engine;

    if-eqz p1, :cond_13

    .line 609
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    .line 611
    new-instance v0, Lorg/bouncycastle/crypto/modes/KCCMBlockCipher;

    .line 613
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 616
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/KCCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 619
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    .line 621
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 624
    :cond_13
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    .line 626
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 629
    invoke-static {v0}, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CCMModeCipher;

    move-result-object v0

    .line 633
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    .line 635
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 638
    :cond_14
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v2, "OCB"

    .line 643
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "can\'t support mode "

    if-eqz v0, :cond_16

    .line 650
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineProvider:Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;

    if-eqz v0, :cond_15

    const/16 p1, 0xf

    .line 656
    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    .line 658
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    .line 660
    new-instance v0, Lorg/bouncycastle/crypto/modes/OCBBlockCipher;

    .line 662
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    .line 664
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineProvider:Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;

    .line 667
    invoke-interface {v2}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BlockCipherProvider;->get()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v2

    .line 671
    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/modes/OCBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 674
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    .line 676
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 679
    :cond_15
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    .line 0
    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v3, "EAX"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    new-instance v0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_17
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v3, "GCM-SIV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    new-instance v0, Lorg/bouncycastle/crypto/modes/GCMSIVBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/GCMSIVBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_18
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    const-string v3, "GCM"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    instance-of v0, p1, Lorg/bouncycastle/crypto/engines/DSTU7624Engine;

    if-eqz v0, :cond_19

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    new-instance v0, Lorg/bouncycastle/crypto/modes/KGCMBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/KGCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_19
    iput v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->ivLength:I

    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-static {v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/GCMModeCipher;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$AEADGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/modes/AEADCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_1a
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    new-instance p1, Ljava/security/NoSuchAlgorithmException;

    const-string v0, "no mode supported for this algorithm"

    invoke-direct {p1, v0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineSetPadding(Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->baseEngine:Lorg/bouncycastle/crypto/BlockCipher;

    if-eqz v0, :cond_f

    .line 7
    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NOPADDING"

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    iget-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    .line 21
    invoke-interface {p1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->wrapOnNoPadding()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 26
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 28
    new-instance v0, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;

    .line 30
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    .line 33
    invoke-interface {v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DefaultBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    .line 40
    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    .line 42
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    :cond_0
    return-void

    :cond_1
    const-string v1, "WITHCTS"

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "CTSPADDING"

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "CS3PADDING"

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const/4 v1, 0x1

    .line 72
    iput-boolean v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->padded:Z

    .line 74
    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->modeName:Ljava/lang/String;

    .line 77
    invoke-direct {p0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->isAEADModeName(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "PKCS5PADDING"

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "PKCS7PADDING"

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "ZEROBYTEPADDING"

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 108
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 110
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    .line 113
    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    .line 116
    new-instance v1, Lorg/bouncycastle/crypto/paddings/ZeroBytePadding;

    .line 119
    invoke-direct {v1}, Lorg/bouncycastle/crypto/paddings/ZeroBytePadding;-><init>()V

    .line 122
    invoke-direct {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    .line 124
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_4
    const-string v1, "ISO10126PADDING"

    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "ISO10126-2PADDING"

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "X9.23PADDING"

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "X923PADDING"

    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "ISO7816-4PADDING"

    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "ISO9797-1PADDING"

    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_0

    :cond_7
    const-string v1, "TBCPADDING"

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 186
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    .line 188
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    .line 191
    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    .line 194
    new-instance v1, Lorg/bouncycastle/crypto/paddings/TBCPadding;

    .line 197
    invoke-direct {v1}, Lorg/bouncycastle/crypto/paddings/TBCPadding;-><init>()V

    .line 200
    invoke-direct {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    .line 202
    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    .line 205
    :cond_8
    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    const-string v1, "Padding "

    const-string v2, " unknown."

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_0
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    invoke-direct {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_a
    :goto_1
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/paddings/X923Padding;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/paddings/X923Padding;-><init>()V

    invoke-direct {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_b
    :goto_2
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/paddings/ISO10126d2Padding;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/paddings/ISO10126d2Padding;-><init>()V

    invoke-direct {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_c
    :goto_3
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_d
    new-instance p1, Ljavax/crypto/NoSuchPaddingException;

    const-string v0, "Only NoPadding can be used with AEAD modes."

    invoke-direct {p1, v0}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_4
    new-instance p1, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;

    new-instance v0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {p1, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$BufferedGenericBlockCipher;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    return-void

    :cond_f
    new-instance p1, Ljavax/crypto/NoSuchPaddingException;

    const-string v0, "no padding supported for this algorithm"

    invoke-direct {p1, v0}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineUpdate([BII[BI)I
    .locals 8

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUpdateOutputSize(I)I

    move-result v0

    add-int/2addr v0, p5

    array-length v1, p4

    if-gt v0, v1, :cond_0

    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->processBytes([BII[BI)I

    move-result p1
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p1, Ljavax/crypto/ShortBufferException;

    const-string p2, "output buffer too short for input."

    invoke-direct {p1, p2}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public engineUpdate([BII)[B
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->getUpdateOutputSize(I)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    new-array v8, v0, [B

    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    const/4 v7, 0x0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, v8

    invoke-interface/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->processBytes([BII[BI)I

    move-result p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    if-eq p1, v0, :cond_1

    new-array p2, p1, [B

    const/4 p3, 0x0

    invoke-static {v8, p3, p2, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_1
    return-object v8

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v2 .. v7}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->processBytes([BII[BI)I

    return-object v1
.end method

.method public engineUpdateAAD(Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p0, v1, v3, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineUpdateAAD([BII)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :cond_1
    const/16 v1, 0x200

    const/4 v2, 0x0

    if-gt v0, v1, :cond_2

    new-array v1, v0, [B

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v1, v2, v0}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineUpdateAAD([BII)V

    invoke-static {v1, v2}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    return-void

    :cond_2
    new-array v3, v1, [B

    :cond_3
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {p1, v3, v2, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v3, v2, v4}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->engineUpdateAAD([BII)V

    sub-int/2addr v0, v4

    if-gtz v0, :cond_3

    invoke-static {v3, v2}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    return-void
.end method

.method public engineUpdateAAD([BII)V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher;->cipher:Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher$GenericBlockCipher;->updateAAD([BII)V

    return-void
.end method
