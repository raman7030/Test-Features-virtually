.class public Lcom/thegrizzlylabs/sardineandroid/model/Acl;
.super Ljava/lang/Object;
.source "Acl.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public ace:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementList;
        inline = true
        required = false
        type = Lcom/thegrizzlylabs/sardineandroid/model/Ace;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAce()Ljava/util/List;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Acl;->ace:Ljava/util/List;

    return-object v0
.end method

.method public setAce(Ljava/util/List;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Acl;->ace:Ljava/util/List;

    return-void
.end method
