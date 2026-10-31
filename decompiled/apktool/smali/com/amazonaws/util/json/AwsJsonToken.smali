.class public final enum Lcom/amazonaws/util/json/AwsJsonToken;
.super Ljava/lang/Enum;
.source "AwsJsonToken.java"


# static fields
.field public static final enum ۗ:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۙ:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۛ:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۤ:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۨ:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۫:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ۬:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ᩶:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final synthetic ᩸:[Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ᩹:Lcom/amazonaws/util/json/AwsJsonToken;

.field public static final enum ᩺:Lcom/amazonaws/util/json/AwsJsonToken;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    .line 23
    new-instance v0, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->᩹:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 25
    new-instance v1, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v2, "END_ARRAY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/util/json/AwsJsonToken;->ۙ:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 27
    new-instance v2, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v3, "BEGIN_OBJECT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/amazonaws/util/json/AwsJsonToken;->᩶:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 29
    new-instance v3, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v4, "END_OBJECT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/util/json/AwsJsonToken;->ۗ:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 31
    new-instance v4, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v6, "FIELD_NAME"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v7}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/amazonaws/util/json/AwsJsonToken;->۬:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 33
    new-instance v6, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v8, "VALUE_BOOLEAN"

    const/4 v9, 0x5

    invoke-direct {v6, v8, v9}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/amazonaws/util/json/AwsJsonToken;->ۤ:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 35
    new-instance v8, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v10, "VALUE_NULL"

    const/4 v11, 0x6

    invoke-direct {v8, v10, v11}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/amazonaws/util/json/AwsJsonToken;->ۛ:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 37
    new-instance v10, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v12, "VALUE_NUMBER"

    const/4 v13, 0x0

    const/4 v14, 0x7

    invoke-direct {v10, v12, v14}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lcom/amazonaws/util/json/AwsJsonToken;->ۨ:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 39
    new-instance v12, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v15, "VALUE_STRING"

    const/16 v16, 0x1

    const/16 v14, 0x8

    invoke-direct {v12, v15, v14}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/amazonaws/util/json/AwsJsonToken;->᩺:Lcom/amazonaws/util/json/AwsJsonToken;

    .line 41
    new-instance v14, Lcom/amazonaws/util/json/AwsJsonToken;

    const-string v15, "UNKNOWN"

    const/16 v17, 0x2

    const/16 v11, 0x9

    invoke-direct {v14, v15, v11}, Lcom/amazonaws/util/json/AwsJsonToken;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lcom/amazonaws/util/json/AwsJsonToken;->۫:Lcom/amazonaws/util/json/AwsJsonToken;

    const/16 v15, 0xa

    new-array v15, v15, [Lcom/amazonaws/util/json/AwsJsonToken;

    aput-object v0, v15, v13

    aput-object v1, v15, v16

    aput-object v2, v15, v17

    aput-object v3, v15, v5

    aput-object v4, v15, v7

    aput-object v6, v15, v9

    const/4 v0, 0x6

    aput-object v8, v15, v0

    const/4 v0, 0x7

    aput-object v10, v15, v0

    const/16 v0, 0x8

    aput-object v12, v15, v0

    aput-object v14, v15, v11

    .line 21
    sput-object v15, Lcom/amazonaws/util/json/AwsJsonToken;->᩸:[Lcom/amazonaws/util/json/AwsJsonToken;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/util/json/AwsJsonToken;
    .locals 1

    .line 21
    const-class v0, Lcom/amazonaws/util/json/AwsJsonToken;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/util/json/AwsJsonToken;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/util/json/AwsJsonToken;
    .locals 1

    .line 21
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->᩸:[Lcom/amazonaws/util/json/AwsJsonToken;

    invoke-virtual {v0}, [Lcom/amazonaws/util/json/AwsJsonToken;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0
.end method
