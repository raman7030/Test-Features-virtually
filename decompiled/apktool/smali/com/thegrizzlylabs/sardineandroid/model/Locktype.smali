.class public Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
.super Ljava/lang/Object;
.source "Locktype.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public aNull:Lcom/thegrizzlylabs/sardineandroid/model/Null;
    .annotation runtime Lorg/simpleframework/xml/Element;
        name = "null"
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

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getWrite()Lcom/thegrizzlylabs/sardineandroid/model/Write;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Locktype;->write:Lcom/thegrizzlylabs/sardineandroid/model/Write;

    return-object v0
.end method

.method public setWrite(Lcom/thegrizzlylabs/sardineandroid/model/Write;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Locktype;->write:Lcom/thegrizzlylabs/sardineandroid/model/Write;

    return-void
.end method
