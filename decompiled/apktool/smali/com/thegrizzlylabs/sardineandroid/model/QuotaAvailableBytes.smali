.class public Lcom/thegrizzlylabs/sardineandroid/model/QuotaAvailableBytes;
.super Ljava/lang/Object;
.source "QuotaAvailableBytes.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public content:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementList;
        required = false
        type = Ljava/lang/String;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContent()Ljava/util/List;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/QuotaAvailableBytes;->content:Ljava/util/List;

    if-nez v0, :cond_0

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/QuotaAvailableBytes;->content:Ljava/util/List;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/QuotaAvailableBytes;->content:Ljava/util/List;

    return-object v0
.end method
