.class public Lcom/amazonaws/http/HttpResponse;
.super Ljava/lang/Object;
.source "HttpResponse.java"


# instance fields
.field public ֫:Ljava/io/InputStream;

.field public final ۧ:Ljava/util/Map;

.field public final ܽ:Ljava/io/InputStream;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/io/InputStream;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/amazonaws/http/HttpResponse;->ܿ:Ljava/lang/String;

    .line 42
    iput p2, p0, Lcom/amazonaws/http/HttpResponse;->ᩳ:I

    .line 43
    iput-object p3, p0, Lcom/amazonaws/http/HttpResponse;->ۧ:Ljava/util/Map;

    .line 44
    iput-object p4, p0, Lcom/amazonaws/http/HttpResponse;->ܽ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 4

    .line 63
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse;->֫:Ljava/io/InputStream;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 65
    monitor-enter v0

    .line 66
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/http/HttpResponse;->ܽ:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    const-string v1, "gzip"

    iget-object v2, p0, Lcom/amazonaws/http/HttpResponse;->ۧ:Ljava/util/Map;

    const-string v3, "Content-Encoding"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 67
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    iget-object v2, p0, Lcom/amazonaws/http/HttpResponse;->ܽ:Ljava/io/InputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v1, p0, Lcom/amazonaws/http/HttpResponse;->֫:Ljava/io/InputStream;

    goto :goto_0

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/amazonaws/http/HttpResponse;->ܽ:Ljava/io/InputStream;

    iput-object v1, p0, Lcom/amazonaws/http/HttpResponse;->֫:Ljava/io/InputStream;

    .line 71
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 73
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse;->֫:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse;->ۧ:Ljava/util/Map;

    return-object v0
.end method

.method public final ܽ()Ljava/io/InputStream;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse;->ܽ:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/amazonaws/http/HttpResponse;->ᩳ:I

    return v0
.end method
