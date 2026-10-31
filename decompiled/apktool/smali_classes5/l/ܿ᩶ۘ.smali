.class public final Ll/ܿ᩶ۘ;
.super Ljava/lang/Object;
.source "0ACF"

# interfaces
.implements Lorg/simpleframework/xml/convert/Converter;


# instance fields
.field public ֫:Ljava/lang/Class;

.field public ۧ:Lorg/simpleframework/xml/core/Persister;


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/core/Persister;Ljava/lang/Class;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ܿ᩶ۘ;->ۧ:Lorg/simpleframework/xml/core/Persister;

    .line 24
    iput-object p2, p0, Ll/ܿ᩶ۘ;->֫:Ljava/lang/Class;

    return-void
.end method

.method private ֫()Ljava/util/HashMap;
    .locals 8

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    iget-object v1, p0, Ll/ܿ᩶ۘ;->֫:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 30
    const-class v5, Lorg/simpleframework/xml/Element;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lorg/simpleframework/xml/Element;

    if-eqz v5, :cond_1

    .line 32
    invoke-interface {v5}, Lorg/simpleframework/xml/Element;->name()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    invoke-interface {v5}, Lorg/simpleframework/xml/Element;->name()Ljava/lang/String;

    move-result-object v5

    .line 33
    :goto_1
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final read(Lorg/simpleframework/xml/stream/InputNode;)Ljava/lang/Object;
    .locals 11

    .line 53
    invoke-direct {p0}, Ll/ܿ᩶ۘ;->֫()Ljava/util/HashMap;

    move-result-object v0

    .line 54
    iget-object v1, p0, Ll/ܿ᩶ۘ;->֫:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thegrizzlylabs/sardineandroid/model/EntityWithAnyElement;

    .line 55
    invoke-interface {v2}, Lcom/thegrizzlylabs/sardineandroid/model/EntityWithAnyElement;->getAny()Ljava/util/List;

    move-result-object v3

    .line 57
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/simpleframework/xml/stream/InputNode;->getNext()Lorg/simpleframework/xml/stream/InputNode;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 58
    invoke-interface {v4}, Lorg/simpleframework/xml/stream/Node;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 59
    invoke-interface {v4}, Lorg/simpleframework/xml/stream/Node;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Field;

    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "set"

    .line 0
    invoke-static {v7, v6}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    new-array v10, v9, [Ljava/lang/Class;

    aput-object v7, v10, v8

    invoke-virtual {v1, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 60
    iget-object v7, p0, Ll/ܿ᩶ۘ;->ۧ:Lorg/simpleframework/xml/core/Persister;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-interface {v7, v5, v4}, Lorg/simpleframework/xml/Serializer;->read(Ljava/lang/Class;Lorg/simpleframework/xml/stream/InputNode;)Ljava/lang/Object;

    move-result-object v4

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v4, v5, v8

    invoke-virtual {v6, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 61
    :cond_1
    invoke-interface {v4}, Lorg/simpleframework/xml/stream/InputNode;->getPrefix()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Lorg/simpleframework/xml/stream/InputNode;->getPrefix()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 12
    new-instance v5, Ljavax/xml/namespace/QName;

    invoke-interface {v4}, Lorg/simpleframework/xml/stream/InputNode;->getReference()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4}, Lorg/simpleframework/xml/stream/Node;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4}, Lorg/simpleframework/xml/stream/InputNode;->getPrefix()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v6, v7, v8}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {v5}, Ll/ܳ᩶ۘ;->֫(Ljavax/xml/namespace/QName;)Lorg/w3c/dom/Element;

    move-result-object v5

    .line 14
    invoke-interface {v4}, Lorg/simpleframework/xml/stream/Node;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lorg/w3c/dom/Node;->setTextContent(Ljava/lang/String;)V

    .line 63
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v4}, Lorg/simpleframework/xml/stream/InputNode;->getNext()Lorg/simpleframework/xml/stream/InputNode;

    move-result-object v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method public final write(Lorg/simpleframework/xml/stream/OutputNode;Ljava/lang/Object;)V
    .locals 7

    .line 17
    check-cast p2, Lcom/thegrizzlylabs/sardineandroid/model/EntityWithAnyElement;

    .line 80
    invoke-interface {p2}, Lcom/thegrizzlylabs/sardineandroid/model/EntityWithAnyElement;->getAny()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/w3c/dom/Element;

    .line 19
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Lorg/simpleframework/xml/stream/OutputNode;->getChild(Ljava/lang/String;)Lorg/simpleframework/xml/stream/OutputNode;

    move-result-object v2

    .line 20
    invoke-interface {v2}, Lorg/simpleframework/xml/stream/OutputNode;->getNamespaces()Lorg/simpleframework/xml/stream/NamespaceMap;

    move-result-object v3

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getPrefix()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lorg/simpleframework/xml/stream/NamespaceMap;->setReference(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/simpleframework/xml/stream/OutputNode;->setValue(Ljava/lang/String;)V

    .line 22
    invoke-interface {v2}, Lorg/simpleframework/xml/stream/OutputNode;->commit()V

    goto :goto_0

    .line 83
    :cond_0
    invoke-direct {p0}, Ll/ܿ᩶ۘ;->֫()Ljava/util/HashMap;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 85
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 48
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "get"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/ܿ᩶ۘ;->֫:Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 86
    invoke-virtual {v3, p2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 90
    :cond_1
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 91
    invoke-interface {p1, v2}, Lorg/simpleframework/xml/stream/OutputNode;->getChild(Ljava/lang/String;)Lorg/simpleframework/xml/stream/OutputNode;

    move-result-object v2

    const-string v4, "DAV:"

    .line 92
    invoke-interface {v2, v4}, Lorg/simpleframework/xml/stream/OutputNode;->setReference(Ljava/lang/String;)V

    .line 93
    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, v3}, Lorg/simpleframework/xml/stream/OutputNode;->setValue(Ljava/lang/String;)V

    goto :goto_1

    .line 95
    :cond_2
    iget-object v2, p0, Ll/ܿ᩶ۘ;->ۧ:Lorg/simpleframework/xml/core/Persister;

    invoke-interface {v2, v3, p1}, Lorg/simpleframework/xml/Serializer;->write(Ljava/lang/Object;Lorg/simpleframework/xml/stream/OutputNode;)V

    goto :goto_1

    :cond_3
    return-void
.end method
