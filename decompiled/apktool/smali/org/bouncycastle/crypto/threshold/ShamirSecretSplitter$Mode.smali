.class public final enum Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;
.super Ljava/lang/Enum;


# static fields
.field public static final synthetic $VALUES:[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

.field public static final enum Native:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

.field public static final enum Table:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;


# direct methods
.method public static synthetic $values()[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    .line 0
    sget-object v1, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->Native:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->Table:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    const-string v1, "Native"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->Native:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    new-instance v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    const-string v1, "Table"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->Table:Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    invoke-static {}, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->$values()[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->$VALUES:[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    return-object p0
.end method

.method public static values()[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->$VALUES:[Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    invoke-virtual {v0}, [Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/bouncycastle/crypto/threshold/ShamirSecretSplitter$Mode;

    return-object v0
.end method
