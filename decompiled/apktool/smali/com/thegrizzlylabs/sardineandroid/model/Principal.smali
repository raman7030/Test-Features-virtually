.class public Lcom/thegrizzlylabs/sardineandroid/model/Principal;
.super Ljava/lang/Object;
.source "Principal.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public all:Lcom/thegrizzlylabs/sardineandroid/model/All;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public authenticated:Lcom/thegrizzlylabs/sardineandroid/model/Authenticated;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public href:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public property:Lcom/thegrizzlylabs/sardineandroid/model/Property;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public self:Lcom/thegrizzlylabs/sardineandroid/model/Self;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field public unauthenticated:Lcom/thegrizzlylabs/sardineandroid/model/Unauthenticated;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAll()Lcom/thegrizzlylabs/sardineandroid/model/All;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->all:Lcom/thegrizzlylabs/sardineandroid/model/All;

    return-object v0
.end method

.method public getAuthenticated()Lcom/thegrizzlylabs/sardineandroid/model/Authenticated;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->authenticated:Lcom/thegrizzlylabs/sardineandroid/model/Authenticated;

    return-object v0
.end method

.method public getHref()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->href:Ljava/lang/String;

    return-object v0
.end method

.method public getProperty()Lcom/thegrizzlylabs/sardineandroid/model/Property;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->property:Lcom/thegrizzlylabs/sardineandroid/model/Property;

    return-object v0
.end method

.method public getSelf()Lcom/thegrizzlylabs/sardineandroid/model/Self;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->self:Lcom/thegrizzlylabs/sardineandroid/model/Self;

    return-object v0
.end method

.method public getUnauthenticated()Lcom/thegrizzlylabs/sardineandroid/model/Unauthenticated;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->unauthenticated:Lcom/thegrizzlylabs/sardineandroid/model/Unauthenticated;

    return-object v0
.end method

.method public setAll(Lcom/thegrizzlylabs/sardineandroid/model/All;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->all:Lcom/thegrizzlylabs/sardineandroid/model/All;

    return-void
.end method

.method public setAuthenticated(Lcom/thegrizzlylabs/sardineandroid/model/Authenticated;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->authenticated:Lcom/thegrizzlylabs/sardineandroid/model/Authenticated;

    return-void
.end method

.method public setHref(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->href:Ljava/lang/String;

    return-void
.end method

.method public setProperty(Lcom/thegrizzlylabs/sardineandroid/model/Property;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->property:Lcom/thegrizzlylabs/sardineandroid/model/Property;

    return-void
.end method

.method public setSelf(Lcom/thegrizzlylabs/sardineandroid/model/Self;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->self:Lcom/thegrizzlylabs/sardineandroid/model/Self;

    return-void
.end method

.method public setUnauthenticated(Lcom/thegrizzlylabs/sardineandroid/model/Unauthenticated;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Principal;->unauthenticated:Lcom/thegrizzlylabs/sardineandroid/model/Unauthenticated;

    return-void
.end method
