.class public final Lcom/amazonaws/services/s3/model/transform/Unmarshallers$ListObjectsUnmarshaller;
.super Ljava/lang/Object;
.source "Unmarshallers.java"

# interfaces
.implements Lcom/amazonaws/transform/Unmarshaller;


# instance fields
.field public final ֫:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$ListObjectsUnmarshaller;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2

    .line 103
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;-><init>()V

    iget-boolean v1, p0, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$ListObjectsUnmarshaller;->֫:Z

    .line 104
    invoke-virtual {v0, p1, v1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/io/InputStream;Z)Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;

    move-result-object p1

    .line 106
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ܽ()Lcom/amazonaws/services/s3/model/ObjectListing;

    move-result-object p1

    return-object p1
.end method
