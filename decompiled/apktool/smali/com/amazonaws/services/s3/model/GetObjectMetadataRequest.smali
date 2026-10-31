.class public Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "GetObjectMetadataRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 149
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->᩶:Ljava/lang/String;

    .line 195
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method
