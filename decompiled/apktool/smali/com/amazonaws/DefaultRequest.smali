.class public Lcom/amazonaws/DefaultRequest;
.super Ljava/lang/Object;
.source "DefaultRequest.java"

# interfaces
.implements Lcom/amazonaws/Request;


# instance fields
.field public ֫:Ljava/io/InputStream;

.field public ۜ:Ljava/lang/String;

.field public ۢ:Z

.field public ۧ:Ljava/net/URI;

.field public final ܳ:Lcom/amazonaws/AmazonWebServiceRequest;

.field public final ܽ:Ljava/util/HashMap;

.field public ܿ:Lcom/amazonaws/util/AWSRequestMetrics;

.field public ᩳ:Lcom/amazonaws/http/HttpMethodName;

.field public ᩷:Ljava/lang/String;

.field public final ᩻:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lcom/amazonaws/AmazonWebServiceRequest;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lcom/amazonaws/DefaultRequest;->ۢ:Z

    .line 47
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩻:Ljava/util/LinkedHashMap;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܽ:Ljava/util/HashMap;

    .line 65
    sget-object v0, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    iput-object v0, p0, Lcom/amazonaws/DefaultRequest;->ᩳ:Lcom/amazonaws/http/HttpMethodName;

    const-string v0, "Amazon S3"

    .line 92
    iput-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩷:Ljava/lang/String;

    .line 93
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->ܳ:Lcom/amazonaws/AmazonWebServiceRequest;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    iget-object v1, p0, Lcom/amazonaws/DefaultRequest;->ᩳ:Lcom/amazonaws/http/HttpMethodName;

    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    iget-object v2, p0, Lcom/amazonaws/DefaultRequest;->ۧ:Ljava/net/URI;

    .line 316
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    iget-object v2, p0, Lcom/amazonaws/DefaultRequest;->ۜ:Ljava/lang/String;

    const-string v3, "/"

    if-nez v2, :cond_0

    .line 320
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 324
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget-object v1, p0, Lcom/amazonaws/DefaultRequest;->᩻:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    const-string v3, ") "

    const-string v4, ", "

    const-string v5, ": "

    if-nez v2, :cond_3

    const-string v2, "Parameters: ("

    .line 330
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 332
    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 0
    invoke-static {v0, v6, v5, v7, v4}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 335
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    :cond_3
    iget-object v1, p0, Lcom/amazonaws/DefaultRequest;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "Headers: ("

    .line 339
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 341
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 0
    invoke-static {v0, v6, v5, v7, v4}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 344
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->֫:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/http/HttpMethodName;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->ᩳ:Lcom/amazonaws/http/HttpMethodName;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/util/AWSRequestMetrics;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 360
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܿ:Lcom/amazonaws/util/AWSRequestMetrics;

    if-nez v0, :cond_0

    .line 361
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->ܿ:Lcom/amazonaws/util/AWSRequestMetrics;

    return-void

    .line 363
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "AWSRequestMetrics has already been set on this request"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->֫:Ljava/io/InputStream;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/net/URI;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/amazonaws/DefaultRequest;->ۧ:Ljava/net/URI;

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 238
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final ֫(Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 247
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()V
    .locals 1

    const/4 v0, 0x1

    .line 375
    iput-boolean v0, p0, Lcom/amazonaws/DefaultRequest;->ۢ:Z

    return-void
.end method

.method public final ۧ()Ljava/net/URI;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ۧ:Ljava/net/URI;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩻:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܳ()Ljava/util/LinkedHashMap;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->᩻:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final ܽ()Ljava/util/HashMap;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܽ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ܿ()Lcom/amazonaws/AmazonWebServiceRequest;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ܳ:Lcom/amazonaws/AmazonWebServiceRequest;

    return-object v0
.end method

.method public final ᩳ()Lcom/amazonaws/http/HttpMethodName;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ᩳ:Lcom/amazonaws/http/HttpMethodName;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 370
    iget-boolean v0, p0, Lcom/amazonaws/DefaultRequest;->ۢ:Z

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/amazonaws/DefaultRequest;->ۜ:Ljava/lang/String;

    return-object v0
.end method
