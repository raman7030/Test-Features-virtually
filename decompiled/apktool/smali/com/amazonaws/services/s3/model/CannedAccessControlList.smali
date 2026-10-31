.class public final enum Lcom/amazonaws/services/s3/model/CannedAccessControlList;
.super Ljava/lang/Enum;
.source "CannedAccessControlList.java"


# static fields
.field public static final enum ۗ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۛ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۤ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۨ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۫:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ۬:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final enum ᩶:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public static final synthetic ᩹:[Lcom/amazonaws/services/s3/model/CannedAccessControlList;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 39
    new-instance v0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v1, "private"

    const-string v2, "Private"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->ۤ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 50
    new-instance v1, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v2, "public-read"

    const-string v3, "PublicRead"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->ۛ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 60
    new-instance v2, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v3, "public-read-write"

    const-string v4, "PublicReadWrite"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->ۨ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 67
    new-instance v3, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v4, "authenticated-read"

    const-string v6, "AuthenticatedRead"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v4}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->᩶:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 79
    new-instance v4, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v6, "log-delivery-write"

    const-string v8, "LogDeliveryWrite"

    const/4 v9, 0x4

    invoke-direct {v4, v8, v9, v6}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->۫:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 90
    new-instance v6, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v8, "bucket-owner-read"

    const-string v10, "BucketOwnerRead"

    const/4 v11, 0x5

    invoke-direct {v6, v10, v11, v8}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->۬:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 101
    new-instance v8, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v10, "bucket-owner-full-control"

    const-string v12, "BucketOwnerFullControl"

    const/4 v13, 0x6

    invoke-direct {v8, v12, v13, v10}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->ۗ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 108
    new-instance v10, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const-string v12, "aws-exec-read"

    const/4 v14, 0x0

    const-string v15, "AwsExecRead"

    const/16 v16, 0x1

    const/4 v13, 0x7

    invoke-direct {v10, v15, v13, v12}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    const/16 v12, 0x8

    new-array v12, v12, [Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    aput-object v0, v12, v14

    aput-object v1, v12, v16

    aput-object v2, v12, v5

    aput-object v3, v12, v7

    aput-object v4, v12, v9

    aput-object v6, v12, v11

    const/4 v0, 0x6

    aput-object v8, v12, v0

    aput-object v10, v12, v13

    .line 31
    sput-object v12, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->᩹:[Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 114
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/CannedAccessControlList;
    .locals 1

    .line 31
    const-class v0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/services/s3/model/CannedAccessControlList;
    .locals 1

    .line 31
    sget-object v0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->᩹:[Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    invoke-virtual {v0}, [Lcom/amazonaws/services/s3/model/CannedAccessControlList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->᩸:Ljava/lang/String;

    return-object v0
.end method
