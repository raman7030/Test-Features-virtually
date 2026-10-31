.class public Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;
.super Ljava/lang/Object;
.source "Lockinfo.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field public locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field public owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLockscope()Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    return-object v0
.end method

.method public getLocktype()Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    return-object v0
.end method

.method public getOwner()Lcom/thegrizzlylabs/sardineandroid/model/Owner;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;

    return-object v0
.end method

.method public setLockscope(Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    return-void
.end method

.method public setLocktype(Lcom/thegrizzlylabs/sardineandroid/model/Locktype;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    return-void
.end method

.method public setOwner(Lcom/thegrizzlylabs/sardineandroid/model/Owner;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockinfo;->owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;

    return-void
.end method
