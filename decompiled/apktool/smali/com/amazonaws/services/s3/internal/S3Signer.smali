.class public Lcom/amazonaws/services/s3/internal/S3Signer;
.super Lcom/amazonaws/auth/AbstractAWSSigner;
.source "S3Signer.java"


# static fields
.field public static final ᩳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    const-class v0, Lcom/amazonaws/services/s3/internal/S3Signer;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/S3Signer;->ᩳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/amazonaws/auth/AbstractAWSSigner;-><init>()V

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ۧ:Ljava/lang/String;

    .line 81
    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ܽ:Ljava/lang/String;

    .line 82
    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->֫:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/amazonaws/auth/AbstractAWSSigner;-><init>()V

    if-eqz p2, :cond_0

    .line 122
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ۧ:Ljava/lang/String;

    .line 123
    iput-object p2, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ܽ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 126
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->֫:Ljava/util/Set;

    return-void

    .line 118
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parameter resourcePath is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V
    .locals 1

    .line 186
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSSessionCredentials;->ۧ()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v0, "x-amz-security-token"

    invoke-virtual {p1, v0, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 5

    .line 135
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ܽ:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 141
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSCredentials;->ܽ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/amazonaws/services/s3/internal/S3Signer;->ᩳ:Lcom/amazonaws/logging/Log;

    if-nez v1, :cond_0

    const-string p1, "Canonical string will not be signed, as no AWS Secret Key was provided"

    .line 142
    invoke-interface {v2, p1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-void

    .line 146
    :cond_0
    invoke-virtual {p0, p2}, Lcom/amazonaws/auth/AbstractAWSSigner;->sanitizeCredentials(Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWSCredentials;

    move-result-object p2

    .line 147
    instance-of v1, p2, Lcom/amazonaws/auth/AWSSessionCredentials;

    if-eqz v1, :cond_1

    .line 148
    move-object v1, p2

    check-cast v1, Lcom/amazonaws/auth/AWSSessionCredentials;

    invoke-virtual {p0, p1, v1}, Lcom/amazonaws/services/s3/internal/S3Signer;->addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V

    .line 158
    :cond_1
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v0, v3}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getTimeOffset(Lcom/amazonaws/Request;)J

    move-result-wide v3

    .line 162
    invoke-virtual {p0, v3, v4}, Lcom/amazonaws/auth/AbstractAWSSigner;->getSignatureDate(J)Ljava/util/Date;

    move-result-object v1

    .line 168
    sget v3, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    const-string v3, "EEE, dd MMM yyyy HH:mm:ss z"

    .line 159
    invoke-static {v3, v1}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Date"

    .line 168
    invoke-virtual {p1, v3, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    iget-object v1, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->ۧ:Ljava/lang/String;

    iget-object v3, p0, Lcom/amazonaws/services/s3/internal/S3Signer;->֫:Ljava/util/Set;

    invoke-static {v1, v0, p1, v3}, Lcom/amazonaws/services/s3/internal/RestUtils;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/DefaultRequest;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Calculated string to sign:\n\""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 174
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSCredentials;->ܽ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/amazonaws/auth/SigningAlgorithm;->᩹:Lcom/amazonaws/auth/SigningAlgorithm;

    .line 173
    invoke-super {p0, v0, v1, v2}, Lcom/amazonaws/auth/AbstractAWSSigner;->signAndBase64Encode(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/auth/SigningAlgorithm;)Ljava/lang/String;

    move-result-object v0

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AWS "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/amazonaws/auth/AWSCredentials;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Authorization"

    invoke-virtual {p1, v0, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 136
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Cannot sign a request using a dummy S3Signer instance with no resource path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
