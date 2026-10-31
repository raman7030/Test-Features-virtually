.class public Lcom/thegrizzlylabs/sardineandroid/model/Property$PropertyConverter;
.super Ljava/lang/Object;
.source "Property.java"

# interfaces
.implements Lorg/simpleframework/xml/convert/Converter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lorg/simpleframework/xml/stream/InputNode;)Lcom/thegrizzlylabs/sardineandroid/model/Property;
    .locals 5

    .line 66
    new-instance v0, Lcom/thegrizzlylabs/sardineandroid/model/Property;

    invoke-direct {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Property;-><init>()V

    .line 67
    invoke-interface {p1}, Lorg/simpleframework/xml/stream/InputNode;->getNext()Lorg/simpleframework/xml/stream/InputNode;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 12
    new-instance v1, Ljavax/xml/namespace/QName;

    invoke-interface {p1}, Lorg/simpleframework/xml/stream/InputNode;->getReference()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lorg/simpleframework/xml/stream/Node;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lorg/simpleframework/xml/stream/InputNode;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {v1}, Ll/ܳ᩶ۘ;->֫(Ljavax/xml/namespace/QName;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 14
    invoke-interface {p1}, Lorg/simpleframework/xml/stream/Node;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/w3c/dom/Node;->setTextContent(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Property;->setProperty(Lorg/w3c/dom/Element;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic read(Lorg/simpleframework/xml/stream/InputNode;)Ljava/lang/Object;
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lcom/thegrizzlylabs/sardineandroid/model/Property$PropertyConverter;->read(Lorg/simpleframework/xml/stream/InputNode;)Lcom/thegrizzlylabs/sardineandroid/model/Property;

    move-result-object p1

    return-object p1
.end method

.method public write(Lorg/simpleframework/xml/stream/OutputNode;Lcom/thegrizzlylabs/sardineandroid/model/Property;)V
    .locals 3

    .line 76
    invoke-static {p2}, Lcom/thegrizzlylabs/sardineandroid/model/Property;->-$$Nest$fgetproperty(Lcom/thegrizzlylabs/sardineandroid/model/Property;)Lorg/w3c/dom/Element;

    move-result-object p2

    .line 19
    invoke-interface {p2}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/simpleframework/xml/stream/OutputNode;->getChild(Ljava/lang/String;)Lorg/simpleframework/xml/stream/OutputNode;

    move-result-object p1

    .line 20
    invoke-interface {p1}, Lorg/simpleframework/xml/stream/OutputNode;->getNamespaces()Lorg/simpleframework/xml/stream/NamespaceMap;

    move-result-object v0

    invoke-interface {p2}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Lorg/w3c/dom/Node;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/simpleframework/xml/stream/NamespaceMap;->setReference(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    invoke-interface {p2}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/simpleframework/xml/stream/OutputNode;->setValue(Ljava/lang/String;)V

    .line 22
    invoke-interface {p1}, Lorg/simpleframework/xml/stream/OutputNode;->commit()V

    return-void
.end method

.method public bridge synthetic write(Lorg/simpleframework/xml/stream/OutputNode;Ljava/lang/Object;)V
    .locals 0

    .line 63
    check-cast p2, Lcom/thegrizzlylabs/sardineandroid/model/Property;

    invoke-virtual {p0, p1, p2}, Lcom/thegrizzlylabs/sardineandroid/model/Property$PropertyConverter;->write(Lorg/simpleframework/xml/stream/OutputNode;Lcom/thegrizzlylabs/sardineandroid/model/Property;)V

    return-void
.end method
