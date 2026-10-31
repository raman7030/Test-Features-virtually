.class public final enum Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$1;
.super Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;
.source "TransferNetworkConnectionType.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, p2, v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;-><init>(Ljava/lang/String;ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType$1;)V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/net/NetworkInfo;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
