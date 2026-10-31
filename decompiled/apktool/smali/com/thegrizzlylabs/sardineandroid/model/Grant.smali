.class public Lcom/thegrizzlylabs/sardineandroid/model/Grant;
.super Ljava/lang/Object;
.source "Grant.java"


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
        type = Ljava/lang/Object;
    .end annotation
.end field

.field public privilege:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementList;
        inline = true
        type = Lcom/thegrizzlylabs/sardineandroid/model/Privilege;
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
.method public getContent()Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Grant;->content:Ljava/util/List;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Grant;->content:Ljava/util/List;

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Grant;->content:Ljava/util/List;

    return-object v0
.end method

.method public getPrivilege()Ljava/util/List;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Grant;->privilege:Ljava/util/List;

    return-object v0
.end method

.method public setPrivilege(Ljava/util/List;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Grant;->privilege:Ljava/util/List;

    return-void
.end method
