.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;
.super Ljava/lang/Object;
.source "TransferUtility.java"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static final ۧ:Lcom/amazonaws/logging/Log;

.field public static ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 110
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->ۧ:Lcom/amazonaws/logging/Log;

    .line 126
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫:Ljava/lang/Object;

    const-string v0, ""

    .line 149
    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 3

    .line 158
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 159
    :try_start_0
    sget-object v1, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_1
    :goto_0
    const-string v1, ""

    .line 160
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 163
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ֫(Lcom/amazonaws/AmazonWebServiceRequest;)V
    .locals 2

    .line 1006
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceRequest;->ܽ()Lcom/amazonaws/RequestClientOptions;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransferService_multipart/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1007
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/amazonaws/util/VersionInfoUtils;->֫:I

    const-string v1, "2.81.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1006
    invoke-virtual {p0, v0}, Lcom/amazonaws/RequestClientOptions;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ(Lcom/amazonaws/AmazonWebServiceRequest;)V
    .locals 2

    .line 1000
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceRequest;->ܽ()Lcom/amazonaws/RequestClientOptions;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransferService/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1001
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/amazonaws/util/VersionInfoUtils;->֫:I

    const-string v1, "2.81.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1000
    invoke-virtual {p0, v0}, Lcom/amazonaws/RequestClientOptions;->֫(Ljava/lang/String;)V

    return-void
.end method
