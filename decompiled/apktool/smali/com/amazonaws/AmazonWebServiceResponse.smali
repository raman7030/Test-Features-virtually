.class public Lcom/amazonaws/AmazonWebServiceResponse;
.super Ljava/lang/Object;
.source "AmazonWebServiceResponse.java"


# instance fields
.field public ֫:Lcom/amazonaws/services/s3/S3ResponseMetadata;

.field public ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceResponse;->֫:Lcom/amazonaws/services/s3/S3ResponseMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_0
    iget-object v0, v0, Lcom/amazonaws/ResponseMetadata;->֫:Ljava/util/HashMap;

    const-string v1, "AWS_REQUEST_ID"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/S3ResponseMetadata;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceResponse;->֫:Lcom/amazonaws/services/s3/S3ResponseMetadata;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceResponse;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceResponse;->ۧ:Ljava/lang/Object;

    return-object v0
.end method
