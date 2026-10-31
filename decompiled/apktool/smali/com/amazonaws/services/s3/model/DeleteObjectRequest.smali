.class public Lcom/amazonaws/services/s3/model/DeleteObjectRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "DeleteObjectRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 95
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->᩶:Ljava/lang/String;

    .line 136
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method
