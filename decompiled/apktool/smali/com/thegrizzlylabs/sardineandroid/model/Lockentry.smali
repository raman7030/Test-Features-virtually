.class public Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;
.super Ljava/lang/Object;
.source "Lockentry.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public write:Lcom/thegrizzlylabs/sardineandroid/model/Write;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLockscope()Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    if-nez v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;

    if-eqz v0, :cond_1

    .line 61
    :cond_0
    new-instance v0, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    invoke-direct {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;-><init>()V

    .line 62
    iget-object v1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;

    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->setExclusive(Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;)V

    .line 63
    iget-object v1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;

    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->setShared(Lcom/thegrizzlylabs/sardineandroid/model/Shared;)V

    .line 64
    invoke-virtual {p0, v0}, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->setLockscope(Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;)V

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    return-object v0
.end method

.method public getLocktype()Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->write:Lcom/thegrizzlylabs/sardineandroid/model/Write;

    if-eqz v0, :cond_0

    .line 90
    new-instance v0, Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    invoke-direct {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Locktype;-><init>()V

    .line 91
    iget-object v1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->write:Lcom/thegrizzlylabs/sardineandroid/model/Write;

    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Locktype;->setWrite(Lcom/thegrizzlylabs/sardineandroid/model/Write;)V

    .line 92
    invoke-virtual {p0, v0}, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->setLocktype(Lcom/thegrizzlylabs/sardineandroid/model/Locktype;)V

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    return-object v0
.end method

.method public setLockscope(Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;

    .line 79
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;

    return-void
.end method

.method public setLocktype(Lcom/thegrizzlylabs/sardineandroid/model/Locktype;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    const/4 p1, 0x0

    .line 105
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockentry;->write:Lcom/thegrizzlylabs/sardineandroid/model/Write;

    return-void
.end method
