.class public final Ll/ۛۖ᩻;
.super Ljava/lang/Object;
.source "Q87M"

# interfaces
.implements Ll/ܺۜ᩻;


# instance fields
.field public final synthetic ֫:Ll/۟ۖ᩻;


# direct methods
.method public constructor <init>(Ll/۟ۖ᩻;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۖ᩻;->֫:Ll/۟ۖ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .line 78
    iget-object v0, p0, Ll/ۛۖ᩻;->֫:Ll/۟ۖ᩻;

    :try_start_0
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move-object v5, v2

    .line 82
    :goto_0
    invoke-static {v0}, Ll/۟ۖ᩻;->֫(Ll/۟ۖ᩻;)Ll/֫ۖ᩻;

    move-result-object v8

    new-instance v9, Lcom/amazonaws/services/s3/model/ListObjectsRequest;

    invoke-static {v0}, Ll/۟ۖ᩻;->ۧ(Ll/۟ۖ᩻;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "/"

    const/16 v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v2, v9

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v8, v9}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/ListObjectsRequest;)Lcom/amazonaws/services/s3/model/ObjectListing;

    move-result-object v2

    .line 83
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 84
    new-instance v5, Ll/ܰۖ᩻;

    invoke-direct {v5, v4}, Ll/ܰۖ᩻;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/ObjectListing;->ᩳ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 87
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 88
    new-instance v5, Ll/ܰۖ᩻;

    invoke-direct {v5, v4}, Ll/ܰۖ᩻;-><init>(Lcom/amazonaws/services/s3/model/S3ObjectSummary;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/ObjectListing;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/ObjectListing;->ܽ()Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    :goto_3
    return-object v1

    :catch_0
    move-exception p1

    .line 98
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 0

    .line 73
    check-cast p1, Ll/ܰۖ᩻;

    .line 109
    invoke-virtual {p1}, Ll/ܰۖ᩻;->ܽ()Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 73
    check-cast p1, Ll/ܰۖ᩻;

    .line 104
    invoke-virtual {p1}, Ll/ܰۖ᩻;->ۧ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
