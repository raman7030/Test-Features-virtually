.class public final Lcom/amazonaws/services/s3/model/transform/Unmarshallers$DeleteObjectsResultUnmarshaller;
.super Ljava/lang/Object;
.source "Unmarshallers.java"

# interfaces
.implements Lcom/amazonaws/transform/Unmarshaller;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2

    .line 317
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;-><init>()V

    .line 514
    new-instance v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;-><init>()V

    .line 515
    invoke-virtual {v0, v1, p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Lorg/xml/sax/helpers/DefaultHandler;Ljava/io/InputStream;)V

    .line 318
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ܽ()Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    move-result-object p1

    return-object p1
.end method
