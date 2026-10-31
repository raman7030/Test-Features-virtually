.class public synthetic Lorg/bouncycastle/crypto/threshold/PolynomialNative$1;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;->values()[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/bouncycastle/crypto/threshold/PolynomialNative$1;->$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm:[I

    :try_start_0
    sget-object v1, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;->AES:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lorg/bouncycastle/crypto/threshold/PolynomialNative$1;->$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm:[I

    sget-object v1, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;->RSA:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Algorithm;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
