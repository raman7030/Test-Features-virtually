.class public Lcom/thegrizzlylabs/sardineandroid/model/Supportedlock;
.super Ljava/lang/Object;
.source "Supportedlock.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public lockentryList:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementList;
        inline = true
        required = false
        type = Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLockentryList()Ljava/util/List;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Supportedlock;->lockentryList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Supportedlock;->lockentryList:Ljava/util/List;

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Supportedlock;->lockentryList:Ljava/util/List;

    return-object v0
.end method
