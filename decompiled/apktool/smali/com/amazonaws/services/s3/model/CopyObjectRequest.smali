.class public Lcom/amazonaws/services/s3/model/CopyObjectRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "CopyObjectRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/lang/String;

.field public ۤ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/util/ArrayList;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 201
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۗ:Ljava/util/ArrayList;

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->۬:Ljava/util/ArrayList;

    .line 202
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->۫:Ljava/lang/String;

    .line 203
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۤ:Ljava/lang/String;

    .line 205
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->᩶:Ljava/lang/String;

    .line 206
    iput-object p4, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/util/ArrayList;
    .locals 1

    .line 751
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->۬:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/util/ArrayList;
    .locals 1

    .line 685
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۗ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->۫:Ljava/lang/String;

    return-object v0
.end method
