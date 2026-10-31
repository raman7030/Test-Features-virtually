.class public Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;
.super Ljava/lang/Object;
.source "ErrorMessage.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public exception:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field public message:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getException()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->exception:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->message:Ljava/lang/String;

    return-object v0
.end method

.method public setException(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->exception:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/ErrorMessage;->message:Ljava/lang/String;

    return-void
.end method
