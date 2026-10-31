.class public final Lcom/amazonaws/services/s3/model/transform/RequestXmlFactory$1;
.super Ljava/lang/Object;
.source "RequestXmlFactory.java"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 41
    check-cast p1, Lcom/amazonaws/services/s3/model/PartETag;

    check-cast p2, Lcom/amazonaws/services/s3/model/PartETag;

    .line 44
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/PartETag;->ۧ()I

    move-result v0

    invoke-virtual {p2}, Lcom/amazonaws/services/s3/model/PartETag;->ۧ()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 46
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/PartETag;->ۧ()I

    move-result p1

    invoke-virtual {p2}, Lcom/amazonaws/services/s3/model/PartETag;->ۧ()I

    move-result p2

    if-le p1, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
