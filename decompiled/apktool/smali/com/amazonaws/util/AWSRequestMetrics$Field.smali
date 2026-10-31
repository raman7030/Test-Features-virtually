.class public final enum Lcom/amazonaws/util/AWSRequestMetrics$Field;
.super Ljava/lang/Enum;
.source "AWSRequestMetrics.java"

# interfaces
.implements Lcom/amazonaws/metrics/MetricType;


# static fields
.field public static final enum ֫֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۗ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۙ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۛ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۜ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۟:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۤ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۧ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۨ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ۬:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ܰ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ܳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ܽ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ܿ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ᩳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final synthetic ᩸:[Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ᩹:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ᩺:Lcom/amazonaws/util/AWSRequestMetrics$Field;

.field public static final enum ᩻֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 27

    .line 51
    new-instance v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v1, "AWSErrorCode"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩹:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 54
    new-instance v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v2, "AWSRequestID"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 57
    new-instance v2, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v3, "BytesProcessed"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۙ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 64
    new-instance v3, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v4, "ClientExecuteTime"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۗ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 67
    new-instance v4, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v5, "CredentialsRequestTime"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۬:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 70
    new-instance v5, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v6, "Exception"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 75
    new-instance v6, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v7, "HttpRequestTime"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩺:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 78
    new-instance v7, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v8, "RedirectLocation"

    const/4 v10, 0x7

    invoke-direct {v7, v8, v10}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܰ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 81
    new-instance v8, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v11, "RequestMarshallTime"

    const/16 v13, 0x8

    invoke-direct {v8, v11, v13}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/amazonaws/util/AWSRequestMetrics$Field;->֫֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 85
    new-instance v11, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v14, "RequestSigningTime"

    const/16 v13, 0x9

    invoke-direct {v11, v14, v13}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۧ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 90
    new-instance v13, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v14, "ResponseProcessingTime"

    const/16 v16, 0x3

    const/16 v10, 0xa

    invoke-direct {v13, v14, v10}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܽ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 94
    new-instance v10, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v14, "RequestCount"

    const/16 v17, 0x4

    const/16 v15, 0xb

    invoke-direct {v10, v14, v15}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۟:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 98
    new-instance v14, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "RetryCount"

    const/16 v18, 0x5

    const/16 v12, 0xc

    invoke-direct {v14, v15, v12}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ᩳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 104
    new-instance v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "HttpClientRetryCount"

    const/16 v19, 0x6

    const/16 v9, 0xd

    invoke-direct {v12, v15, v9}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۛ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 109
    new-instance v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "HttpClientSendRequestTime"

    move-object/from16 v21, v12

    const/16 v12, 0xe

    invoke-direct {v9, v15, v12}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۨ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 114
    new-instance v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "HttpClientReceiveResponseTime"

    move-object/from16 v22, v9

    const/16 v9, 0xf

    invoke-direct {v12, v15, v9}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۤ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 117
    new-instance v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "RetryPauseTime"

    move-object/from16 v23, v12

    const/16 v12, 0x10

    invoke-direct {v9, v15, v12}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܿ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 123
    new-instance v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "ServiceEndpoint"

    move-object/from16 v24, v9

    const/16 v9, 0x11

    invoke-direct {v12, v15, v9}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 126
    new-instance v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "ServiceName"

    move-object/from16 v25, v12

    const/16 v12, 0x12

    invoke-direct {v9, v15, v12}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩻֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    .line 129
    new-instance v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const-string v15, "StatusCode"

    move-object/from16 v26, v9

    const/16 v9, 0x13

    invoke-direct {v12, v15, v9}, Lcom/amazonaws/util/AWSRequestMetrics$Field;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۜ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const/16 v15, 0x14

    new-array v15, v15, [Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const/16 v20, 0x0

    aput-object v0, v15, v20

    const/4 v0, 0x1

    aput-object v1, v15, v0

    const/4 v0, 0x2

    aput-object v2, v15, v0

    aput-object v3, v15, v16

    aput-object v4, v15, v17

    aput-object v5, v15, v18

    aput-object v6, v15, v19

    const/4 v0, 0x7

    aput-object v7, v15, v0

    const/16 v0, 0x8

    aput-object v8, v15, v0

    const/16 v0, 0x9

    aput-object v11, v15, v0

    const/16 v0, 0xa

    aput-object v13, v15, v0

    const/16 v0, 0xb

    aput-object v10, v15, v0

    const/16 v0, 0xc

    aput-object v14, v15, v0

    const/16 v0, 0xd

    aput-object v21, v15, v0

    const/16 v0, 0xe

    aput-object v22, v15, v0

    const/16 v0, 0xf

    aput-object v23, v15, v0

    const/16 v0, 0x10

    aput-object v24, v15, v0

    const/16 v0, 0x11

    aput-object v25, v15, v0

    const/16 v0, 0x12

    aput-object v26, v15, v0

    aput-object v12, v15, v9

    .line 48
    sput-object v15, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩸:[Lcom/amazonaws/util/AWSRequestMetrics$Field;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/util/AWSRequestMetrics$Field;
    .locals 1

    .line 48
    const-class v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/util/AWSRequestMetrics$Field;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/util/AWSRequestMetrics$Field;
    .locals 1

    .line 48
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩸:[Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0}, [Lcom/amazonaws/util/AWSRequestMetrics$Field;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/util/AWSRequestMetrics$Field;

    return-object v0
.end method
