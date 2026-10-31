.class public Lcom/amazonaws/services/s3/internal/ServiceUtils;
.super Ljava/lang/Object;
.source "ServiceUtils.java"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Lcom/amazonaws/logging/Log;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    const-class v0, Lcom/amazonaws/services/s3/internal/ServiceUtils;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/ServiceUtils;->ۧ:Lcom/amazonaws/logging/Log;

    .line 71
    new-instance v0, Lcom/amazonaws/util/DateUtils;

    invoke-direct {v0}, Lcom/amazonaws/util/DateUtils;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 147
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\""

    .line 148
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 149
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 151
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static ֫(Lcom/amazonaws/AmazonWebServiceRequest;)Z
    .locals 1

    const-string v0, "com.amazonaws.services.s3.disableGetObjectMD5Validation"

    .line 479
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 483
    :cond_0
    instance-of v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;

    if-eqz v0, :cond_1

    .line 484
    check-cast p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;

    .line 486
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->᩷()[J

    move-result-object p0

    if-eqz p0, :cond_4

    goto :goto_0

    .line 492
    :cond_1
    instance-of v0, p0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    if-eqz v0, :cond_4

    .line 493
    check-cast p0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    .line 494
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩷()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 495
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܺ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 501
    :cond_2
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 502
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    sget-object v0, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->ۙ:Lcom/amazonaws/services/s3/model/SSEAlgorithm;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 503
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;->֫()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method
