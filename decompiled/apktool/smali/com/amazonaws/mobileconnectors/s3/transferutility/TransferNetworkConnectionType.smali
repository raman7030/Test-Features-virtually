.class public abstract enum Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
.super Ljava/lang/Enum;
.source "TransferNetworkConnectionType.java"


# static fields
.field public static final enum ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .annotation runtime Ll/᩹ᩳۖ;
        value = "MOBILE"
    .end annotation
.end field

.field public static final ۙ:Ljava/util/Map;

.field public static final enum ۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .annotation runtime Ll/᩹ᩳۖ;
        value = "WIFI"
    .end annotation
.end field

.field public static final ᩶:Lcom/amazonaws/logging/Log;

.field public static final synthetic ᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

.field public static final enum ᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .annotation runtime Ll/᩹ᩳۖ;
        value = "ANY"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 34
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$1;

    const-string v1, "ANY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    .line 45
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$2;

    const-string v3, "WIFI"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->۬:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    .line 57
    new-instance v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$3;

    const-string v5, "MOBILE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$3;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 30
    sput-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->ۙ:Ljava/util/Map;

    .line 69
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->values()[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 70
    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->ۙ:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 74
    :cond_0
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩶:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .locals 1

    .line 30
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .locals 1

    .line 30
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
    .locals 3

    .line 94
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->ۙ:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 95
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    return-object p0

    .line 98
    :cond_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩶:Lcom/amazonaws/logging/Log;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown connection type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " transfer will have connection type set to ANY."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 100
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    return-object p0
.end method


# virtual methods
.method public ֫(Landroid/net/ConnectivityManager;)Z
    .locals 0

    .line 82
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->֫(Landroid/net/NetworkInfo;)Z

    move-result p1

    return p1
.end method

.method public abstract ֫(Landroid/net/NetworkInfo;)Z
.end method
