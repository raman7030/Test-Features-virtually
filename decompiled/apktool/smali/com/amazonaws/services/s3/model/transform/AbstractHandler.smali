.class public abstract Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "AbstractHandler.java"


# instance fields
.field public final ᩸:Ljava/util/LinkedList;

.field public final ᩹:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩹:Ljava/lang/StringBuilder;

    .line 30
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩸:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final characters([CII)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩹:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 52
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩸:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 53
    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ܳ(Ljava/lang/String;)V

    return-void
.end method

.method public final startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 39
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩹:Ljava/lang/StringBuilder;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 40
    invoke-virtual {p0, p2, p4}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 41
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩸:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
.end method

.method public final ֫()Z
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final varargs ֫([Ljava/lang/String;)Z
    .locals 6

    .line 75
    array-length v0, p1

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 80
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 81
    aget-object v4, p1, v1

    const-string v5, "*"

    .line 82
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    return v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->᩹:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܳ(Ljava/lang/String;)V
.end method
