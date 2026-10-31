.class public final enum Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;
.super Ljava/lang/Enum;


# static fields
.field public static final synthetic $VALUES:[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

.field public static final enum ISAP_A_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

.field public static final enum ISAP_A_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

.field public static final enum ISAP_K_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

.field public static final enum ISAP_K_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;


# direct methods
.method public static synthetic $values()[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    .line 0
    sget-object v1, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_A_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_K_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_A_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_K_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const-string v1, "ISAP_A_128A"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_A_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    new-instance v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const-string v1, "ISAP_K_128A"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_K_128A:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    new-instance v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const-string v1, "ISAP_A_128"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_A_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    new-instance v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    const-string v1, "ISAP_K_128"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->ISAP_K_128:Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->$values()[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->$VALUES:[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    return-object p0
.end method

.method public static values()[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->$VALUES:[Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    invoke-virtual {v0}, [Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/bouncycastle/crypto/engines/ISAPEngine$IsapType;

    return-object v0
.end method
