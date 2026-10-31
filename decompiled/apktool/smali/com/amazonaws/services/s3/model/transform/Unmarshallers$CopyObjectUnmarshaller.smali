.class public final Lcom/amazonaws/services/s3/model/transform/Unmarshallers$CopyObjectUnmarshaller;
.super Ljava/lang/Object;
.source "Unmarshallers.java"

# interfaces
.implements Lcom/amazonaws/transform/Unmarshaller;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2

    .line 272
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;-><init>()V

    .line 521
    new-instance v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;-><init>()V

    .line 522
    invoke-virtual {v0, v1, p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Lorg/xml/sax/helpers/DefaultHandler;Ljava/io/InputStream;)V

    return-object v1
.end method
