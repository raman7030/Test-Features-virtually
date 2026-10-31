.class public final Ll/ۧۘ᩻;
.super Lcom/amazonaws/auth/AWS4Signer;
.source "C7UE"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;-><init>(Z)V

    const-string v0, "s3"

    .line 10
    invoke-virtual {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;->setServiceName(Ljava/lang/String;)V

    const-string v0, "auto"

    .line 11
    invoke-virtual {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;->setRegionName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 0

    const-string p1, "UNSIGNED-PAYLOAD"

    return-object p1
.end method

.method public final sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 2

    .line 23
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "x-amz-content-sha256"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "UNSIGNED-PAYLOAD"

    .line 24
    invoke-virtual {p1, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/amazonaws/auth/AWS4Signer;->sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V

    return-void
.end method
