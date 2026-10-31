.class public final enum Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;
.super Ljava/lang/Enum;
.source "TransferState.java"


# static fields
.field public static final enum ֫֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۟:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۧ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final ۫:Ljava/util/Map;

.field public static final ۬:Lcom/amazonaws/logging/Log;

.field public static final enum ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final synthetic ᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

.field public static final enum ᩺:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    .line 39
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v1, "WAITING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۧ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 44
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v2, "IN_PROGRESS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۗ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 48
    new-instance v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v3, "PAUSED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۛ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 53
    new-instance v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v4, "RESUMED_WAITING"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۟:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 57
    new-instance v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v5, "COMPLETED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 61
    new-instance v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v6, "CANCELED"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 65
    new-instance v6, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v7, "FAILED"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 71
    new-instance v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v9, "WAITING_FOR_NETWORK"

    const/4 v10, 0x0

    const/4 v11, 0x7

    invoke-direct {v7, v9, v11}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܽ֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 77
    new-instance v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v12, "PART_COMPLETED"

    const/16 v14, 0x8

    invoke-direct {v9, v12, v14}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۤ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 84
    new-instance v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v15, "PENDING_CANCEL"

    const/16 v16, 0x2

    const/16 v14, 0x9

    invoke-direct {v12, v15, v14}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۨ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 91
    new-instance v14, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v15, "PENDING_PAUSE"

    const/16 v17, 0x3

    const/16 v11, 0xa

    invoke-direct {v14, v15, v11}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ܰ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 98
    new-instance v11, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v15, "PENDING_NETWORK_DISCONNECT"

    const/16 v18, 0x4

    const/16 v8, 0xb

    invoke-direct {v11, v15, v8}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩺:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 103
    new-instance v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const-string v15, "UNKNOWN"

    const/16 v19, 0x5

    const/16 v13, 0xc

    invoke-direct {v8, v15, v13}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    const/16 v15, 0xd

    new-array v15, v15, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    aput-object v0, v15, v10

    const/4 v0, 0x1

    aput-object v1, v15, v0

    aput-object v2, v15, v16

    aput-object v3, v15, v17

    aput-object v4, v15, v18

    aput-object v5, v15, v19

    const/4 v0, 0x6

    aput-object v6, v15, v0

    const/4 v0, 0x7

    aput-object v7, v15, v0

    const/16 v0, 0x8

    aput-object v9, v15, v0

    const/16 v0, 0x9

    aput-object v12, v15, v0

    const/16 v0, 0xa

    aput-object v14, v15, v0

    const/16 v0, 0xb

    aput-object v11, v15, v0

    aput-object v8, v15, v13

    .line 33
    sput-object v15, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۫:Ljava/util/Map;

    .line 108
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->values()[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 109
    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۫:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 113
    :cond_0
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۬:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;
    .locals 1

    .line 33
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;
    .locals 1

    .line 33
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;
    .locals 3

    .line 122
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 123
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    return-object p0

    .line 126
    :cond_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->۬:Lcom/amazonaws/logging/Log;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown state "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " transfer will be have state set to UNKNOWN."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 128
    sget-object p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->֫֫:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    return-object p0
.end method

.method public static ֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)Z
    .locals 1

    .line 132
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 133
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;

    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
