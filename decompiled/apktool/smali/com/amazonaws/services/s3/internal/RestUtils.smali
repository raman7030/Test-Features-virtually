.class public Lcom/amazonaws/services/s3/internal/RestUtils;
.super Ljava/lang/Object;
.source "RestUtils.java"


# static fields
.field public static final ֫:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 30

    const-string v28, "response-content-type"

    const-string v29, "response-expires"

    const-string v0, "acl"

    const-string v1, "torrent"

    const-string v2, "logging"

    const-string v3, "location"

    const-string v4, "policy"

    const-string v5, "requestPayment"

    const-string v6, "versioning"

    const-string v7, "versions"

    const-string v8, "versionId"

    const-string v9, "notification"

    const-string v10, "uploadId"

    const-string v11, "uploads"

    const-string v12, "partNumber"

    const-string v13, "website"

    const-string v14, "delete"

    const-string v15, "lifecycle"

    const-string v16, "tagging"

    const-string v17, "cors"

    const-string v18, "restore"

    const-string v19, "replication"

    const-string v20, "accelerate"

    const-string v21, "inventory"

    const-string v22, "analytics"

    const-string v23, "metrics"

    const-string v24, "response-cache-control"

    const-string v25, "response-content-disposition"

    const-string v26, "response-content-encoding"

    const-string v27, "response-content-language"

    .line 42
    filled-new-array/range {v0 .. v29}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/RestUtils;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/DefaultRequest;Ljava/util/Collection;)Ljava/lang/String;
    .locals 10

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v1

    .line 101
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    const-string v3, "x-amz-"

    const-string v4, "date"

    const-string v5, "content-md5"

    const-string v6, "content-type"

    if-eqz v1, :cond_3

    .line 102
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v7

    if-lez v7, :cond_3

    .line 103
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 104
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 106
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 107
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v8, :cond_1

    goto :goto_0

    .line 112
    :cond_1
    invoke-static {v8}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 115
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 116
    invoke-virtual {v8, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 117
    :cond_2
    invoke-virtual {v2, v8, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const-string v1, "x-amz-date"

    .line 123
    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-string v7, ""

    if-eqz v1, :cond_4

    .line 124
    invoke-virtual {v2, v4, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    :cond_4
    invoke-virtual {v2, v6}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 137
    invoke-virtual {v2, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    :cond_5
    invoke-virtual {v2, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 140
    invoke-virtual {v2, v5, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_6
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 146
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 147
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 152
    :cond_8
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 153
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 154
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 157
    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 158
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_a

    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    if-eqz v2, :cond_a

    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    :cond_a
    :goto_3
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 169
    :cond_b
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    .line 171
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    .line 170
    invoke-interface {p0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    .line 172
    invoke-static {p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 174
    array-length p1, p0

    const/16 v1, 0x3f

    const/4 v2, 0x0

    :goto_4
    if-ge v2, p1, :cond_10

    aget-object v3, p0, v2

    .line 177
    sget-object v4, Lcom/amazonaws/services/s3/internal/RestUtils;->֫:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    if-eqz p3, :cond_f

    .line 180
    invoke-interface {p3, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_5

    .line 184
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-nez v4, :cond_d

    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    :cond_d
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_e

    const-string v3, "="

    .line 191
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    const/16 v1, 0x26

    :cond_f
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 197
    :cond_10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
