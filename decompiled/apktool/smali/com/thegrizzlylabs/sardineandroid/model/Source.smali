.class public Lcom/thegrizzlylabs/sardineandroid/model/Source;
.super Ljava/lang/Object;
.source "Source.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public link:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLink()Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Source;->link:Ljava/util/List;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Source;->link:Ljava/util/List;

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Source;->link:Ljava/util/List;

    return-object v0
.end method
