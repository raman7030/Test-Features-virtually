.class public final Ll/֫ۖ᩻;
.super Lcom/amazonaws/services/s3/AmazonS3Client;
.source "Q7TX"


# instance fields
.field public ֡:Ljava/net/URI;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "UnsignedPayloadSignerType"

    .line 18
    const-class v1, Ll/ۧۘ᩻;

    invoke-static {v1, v0}, Lcom/amazonaws/auth/SignerFactory;->֫(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 52
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "://"

    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    add-int/lit8 v0, v0, 0x3

    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    const/16 v0, 0x2f

    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    .line 59
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const/16 v0, 0x3a

    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_2

    .line 63
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_2
    const-string v0, "s3.cstcloud.cn"

    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/֫ۖ᩻;->֡:Ljava/net/URI;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    instance-of v0, v0, Lcom/amazonaws/services/s3/model/GetObjectRequest;

    if-eqz v0, :cond_1

    .line 71
    iget-object p2, p0, Ll/֫ۖ᩻;->֡:Ljava/net/URI;

    invoke-virtual {p1, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/net/URI;)V

    if-eqz p3, :cond_0

    const-string p2, "/"

    .line 87
    invoke-virtual {p3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 88
    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 73
    :cond_0
    invoke-virtual {p1, p3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;)V

    return-void

    .line 76
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 41
    invoke-static {p1}, Ll/֫ۖ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v0}, Lcom/amazonaws/ClientConfiguration;->᩷()V

    .line 43
    invoke-virtual {v0}, Lcom/amazonaws/ClientConfiguration;->ۜ()V

    .line 45
    :cond_0
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩷:Lcom/amazonaws/services/s3/S3ClientOptions;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/S3ClientOptions;->֫(Z)V

    return-void
.end method

.method public final ۧ(Ljava/net/URI;)V
    .locals 0

    .line 28
    iput-object p1, p0, Ll/֫ۖ᩻;->֡:Ljava/net/URI;

    return-void
.end method
