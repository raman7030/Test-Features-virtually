.class public Lcom/thegrizzlylabs/sardineandroid/model/Link;
.super Ljava/lang/Object;
.source "Link.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public dst:Ljava/util/List;

.field public src:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDst()Ljava/util/List;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->dst:Ljava/util/List;

    if-nez v0, :cond_0

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->dst:Ljava/util/List;

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->dst:Ljava/util/List;

    return-object v0
.end method

.method public getSrc()Ljava/util/List;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->src:Ljava/util/List;

    if-nez v0, :cond_0

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->src:Ljava/util/List;

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Link;->src:Ljava/util/List;

    return-object v0
.end method
