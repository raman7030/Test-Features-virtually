.class public final enum Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;
.super Ljava/lang/Enum;


# static fields
.field public static final synthetic $VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

.field public static final enum AES256_CCM:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

.field public static final enum AES256_KWP:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;


# direct methods
.method public static synthetic $values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    .line 0
    sget-object v1, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->AES256_CCM:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->AES256_KWP:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    const-string v1, "AES256_CCM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->AES256_CCM:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    new-instance v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    const-string v1, "AES256_KWP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->AES256_KWP:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    invoke-static {}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->$values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->$VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    return-object p0
.end method

.method public static values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->$VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    invoke-virtual {v0}, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;

    return-object v0
.end method
