.class public Lcom/thegrizzlylabs/sardineandroid/model/Propertyupdate;
.super Ljava/lang/Object;
.source "Propertyupdate.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public removeOrSet:Ljava/util/List;
    .annotation runtime Lorg/simpleframework/xml/ElementListUnion;
        value = {
            .subannotation Lorg/simpleframework/xml/ElementList;
                entry = "remove"
                inline = true
                type = Lcom/thegrizzlylabs/sardineandroid/model/Remove;
            .end subannotation,
            .subannotation Lorg/simpleframework/xml/ElementList;
                entry = "set"
                inline = true
                type = Lcom/thegrizzlylabs/sardineandroid/model/Set;
            .end subannotation
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRemoveOrSet()Ljava/util/List;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Propertyupdate;->removeOrSet:Ljava/util/List;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Propertyupdate;->removeOrSet:Ljava/util/List;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Propertyupdate;->removeOrSet:Ljava/util/List;

    return-object v0
.end method
