.class public Lcom/amazonaws/services/s3/model/ListObjectsRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "ListObjectsRequest.java"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/Integer;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 148
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 176
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->᩶:Ljava/lang/String;

    .line 219
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->۫:Ljava/lang/String;

    .line 266
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۗ:Ljava/lang/String;

    .line 323
    iput-object p4, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۙ:Ljava/lang/String;

    .line 375
    iput-object p5, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->۬:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/lang/Integer;
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->۬:Ljava/lang/Integer;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->۫:Ljava/lang/String;

    return-object v0
.end method
