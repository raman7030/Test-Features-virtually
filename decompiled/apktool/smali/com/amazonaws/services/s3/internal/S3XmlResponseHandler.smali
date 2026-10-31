.class public Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;
.super Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;
.source "S3XmlResponseHandler.java"


# static fields
.field public static final ܿ:Lcom/amazonaws/logging/Log;


# instance fields
.field public ܽ:Ljava/util/Map;

.field public ᩳ:Lcom/amazonaws/transform/Unmarshaller;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "com.amazonaws.request"

    .line 39
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ܿ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/transform/Unmarshaller;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ᩳ:Lcom/amazonaws/transform/Unmarshaller;

    return-void
.end method


# virtual methods
.method public ֫(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;
    .locals 4

    .line 60
    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->ۧ(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;

    move-result-object v0

    .line 61
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ܽ:Ljava/util/Map;

    .line 63
    iget-object v1, p0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ᩳ:Lcom/amazonaws/transform/Unmarshaller;

    if-eqz v1, :cond_0

    const-string v2, "Beginning to parse service response XML"

    .line 64
    sget-object v3, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ܿ:Lcom/amazonaws/logging/Log;

    invoke-interface {v3, v2}, Lcom/amazonaws/logging/Log;->ܿ(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->֫()Ljava/io/InputStream;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/amazonaws/transform/Unmarshaller;->֫(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Done parsing service response XML"

    .line 66
    invoke-interface {v3, v1}, Lcom/amazonaws/logging/Log;->ܿ(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v0, p1}, Lcom/amazonaws/AmazonWebServiceResponse;->֫(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic ֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->֫(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ܽ:Ljava/util/Map;

    return-object v0
.end method
