.class public final synthetic Ll/ۤ᩹ۡ;
.super Ljava/lang/Object;
.source "ZBIL"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ll/ۢ᩶ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ᩶ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩹ۡ;->᩸:Ll/ۢ᩶ۡ;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 14

    .line 2
    check-cast p1, Ll/ۧ᩶ۡ;

    .line 191
    iget-object v0, p1, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 628
    invoke-interface {v0}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v1

    .line 632
    invoke-interface {v1}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v4

    :goto_0
    const/4 v9, 0x1

    if-ge v7, v2, :cond_6

    .line 634
    invoke-interface {v1, v7}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v10

    .line 635
    invoke-interface {v10}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v11

    .line 636
    invoke-interface {v10}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v10

    const-string v12, "href"

    .line 637
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, ""

    if-eqz v12, :cond_1

    .line 676
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v10, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_1
    const-string v12, "xlink:href"

    .line 639
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    if-nez v8, :cond_2

    .line 676
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    :goto_1
    move-object v8, v13

    goto :goto_2

    :cond_2
    const-string v9, "x"

    .line 641
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 642
    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    goto :goto_2

    :cond_3
    const-string v9, "y"

    .line 643
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 644
    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    goto :goto_2

    .line 645
    :cond_4
    sget-object v9, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v9, v11}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 646
    invoke-virtual {p1, v11, v10}, Ll/ۧ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 649
    :cond_6
    new-instance v1, Ll/֡᩶ۡ;

    invoke-direct {v1, v3, v6}, Ll/֡᩶ۡ;-><init>(FF)V

    .line 650
    iget-object v2, p0, Ll/ۤ᩹ۡ;->᩸:Ll/ۢ᩶ۡ;

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v2, v8}, Ll/ۢ᩶ۡ;->ܽ(Ljava/lang/String;)Ll/ܳ᩶ۡ;

    move-result-object v4

    :goto_3
    if-nez v4, :cond_a

    if-eqz v8, :cond_9

    .line 652
    invoke-virtual {v2, v8}, Ll/ۢ᩶ۡ;->ᩳ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    return v9

    :cond_9
    :goto_4
    const-string p1, "Referenced id not found"

    .line 653
    invoke-virtual {v2, p1, v0}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    return v9

    .line 657
    :cond_a
    invoke-virtual {v2}, Ll/ۢ᩶ۡ;->᩻()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    return v5

    .line 662
    :cond_b
    invoke-virtual {v4}, Ll/ܳ᩶ۡ;->֫()Ll/ܳ᩶ۡ;

    move-result-object v0

    .line 663
    invoke-virtual {p1, v0}, Ll/ۧ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)V

    iget-object v2, p1, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    .line 664
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 665
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 666
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v5, v4}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 668
    :cond_c
    invoke-virtual {p1, v2}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    .line 669
    invoke-virtual {p1, v1}, Ll/ۧ᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    return v9
.end method
