.class public final enum Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;
.super Ljava/lang/Enum;
.source "TransferType.java"


# static fields
.field public static final enum ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

.field public static final enum ᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

.field public static final synthetic ᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

.field public static final enum ᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 25
    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const-string v1, "UPLOAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    .line 29
    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const-string v3, "DOWNLOAD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    .line 33
    new-instance v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const-string v5, "ANY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 21
    sput-object v5, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;
    .locals 1

    .line 21
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;
    .locals 1

    .line 21
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩸:[Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;
    .locals 3

    .line 42
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->ۙ:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 45
    :cond_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩶:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 48
    :cond_1
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferType;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 52
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Type "

    const-string v2, " is not a recognized type"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
