.class public final enum Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;
.super Ljava/lang/Enum;


# static fields
.field public static final synthetic $VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

.field public static final enum HmacSHA3_512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

.field public static final enum HmacSHA512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;


# direct methods
.method public static synthetic $values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    .line 0
    sget-object v1, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->HmacSHA512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->HmacSHA3_512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    const-string v1, "HmacSHA512"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->HmacSHA512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    new-instance v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    const-string v1, "HmacSHA3_512"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->HmacSHA3_512:Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    invoke-static {}, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->$values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->$VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    return-object p0
.end method

.method public static values()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->$VALUES:[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    invoke-virtual {v0}, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;

    return-object v0
.end method
