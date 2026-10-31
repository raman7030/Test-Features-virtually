.class public final Lcom/amazonaws/services/s3/AmazonS3Client$1;
.super Ljava/util/LinkedHashMap;
.source "AmazonS3Client.java"


# static fields
.field public static final serialVersionUID:J = 0x5b9dL


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 1

    .line 224
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p1

    const/16 v0, 0x12c

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
