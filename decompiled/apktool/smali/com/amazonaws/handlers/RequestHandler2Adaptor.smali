.class public final Lcom/amazonaws/handlers/RequestHandler2Adaptor;
.super Lcom/amazonaws/handlers/RequestHandler2;
.source "RequestHandler2Adaptor.java"


# instance fields
.field public final ֫:Lcom/amazonaws/handlers/RequestHandler;


# direct methods
.method public constructor <init>(Lcom/amazonaws/handlers/RequestHandler;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/amazonaws/handlers/RequestHandler2;-><init>()V

    if-eqz p1, :cond_0

    .line 35
    iput-object p1, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 70
    instance-of v0, p1, Lcom/amazonaws/handlers/RequestHandler2Adaptor;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 72
    :cond_0
    check-cast p1, Lcom/amazonaws/handlers/RequestHandler2Adaptor;

    .line 73
    iget-object v0, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    iget-object p1, p1, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Lcom/amazonaws/DefaultRequest;)V
    .locals 0

    .line 41
    iget-object p1, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    invoke-interface {p1}, Lcom/amazonaws/handlers/RequestHandler;->֫()V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/AmazonClientException;)V
    .locals 0

    .line 60
    iget-object p1, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    invoke-interface {p1}, Lcom/amazonaws/handlers/RequestHandler;->ܽ()V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/Response;)V
    .locals 0

    .line 53
    iget-object p1, p0, Lcom/amazonaws/handlers/RequestHandler2Adaptor;->֫:Lcom/amazonaws/handlers/RequestHandler;

    invoke-interface {p1}, Lcom/amazonaws/handlers/RequestHandler;->ۧ()V

    return-void
.end method
