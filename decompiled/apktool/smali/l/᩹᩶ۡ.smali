.class public final Ll/᩹᩶ۡ;
.super Lorg/xml/sax/ext/DefaultHandler2;
.source "UBKB"


# instance fields
.field public final ۗ:Lorg/w3c/dom/Document;

.field public ۙ:I

.field public final ۛ:Ljava/lang/String;

.field public final ۤ:Ljava/util/ArrayList;

.field public final ۫:Ljava/lang/StringBuilder;

.field public ۬:Lorg/xml/sax/Locator;

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 795
    invoke-direct {p0}, Lorg/xml/sax/ext/DefaultHandler2;-><init>()V

    const/4 v0, 0x0

    .line 787
    iput v0, p0, Ll/᩹᩶ۡ;->᩶:I

    .line 790
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    .line 792
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩹᩶ۡ;->۫:Ljava/lang/StringBuilder;

    .line 796
    iput-object p1, p0, Ll/᩹᩶ۡ;->ۛ:Ljava/lang/String;

    .line 798
    invoke-static {}, Ll/ۙ᩶ۡ;->֫()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    .line 799
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilder;->newDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    iput-object v0, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    const-string v1, "contents"

    const/4 v2, 0x0

    .line 800
    invoke-interface {v0, v1, p1, v2}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    return-void
.end method

.method private ֫(Ll/᩶᩶ۡ;)Ll/᩶᩶ۡ;
    .locals 6

    .line 922
    invoke-virtual {p1}, Ll/᩶᩶ۡ;->ᩳ()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_5

    .line 923
    iget-object v1, p0, Ll/᩹᩶ۡ;->ۛ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_0

    .line 927
    invoke-virtual {p1}, Ll/᩶᩶ۡ;->ܽ()I

    move-result v2

    .line 928
    invoke-virtual {p1}, Ll/᩶᩶ۡ;->ᩳ()I

    move-result p1

    move v3, v0

    :goto_0
    const/16 v4, 0xa

    if-ge v3, p1, :cond_2

    .line 929
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 p1, v0, -0x1

    const/4 v3, 0x0

    :goto_1
    if-ltz p1, :cond_4

    .line 937
    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 p1, p1, -0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 942
    :cond_4
    :goto_2
    new-instance p1, Ll/᩶᩶ۡ;

    invoke-direct {p1, v2, v3, v0}, Ll/᩶᩶ۡ;-><init>(III)V

    :cond_5
    return-object p1
.end method

.method private ֫(Lorg/w3c/dom/Node;)V
    .locals 2

    .line 902
    iget-object v0, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 903
    iget-object v0, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    invoke-interface {v0, p1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 905
    check-cast v0, Lorg/w3c/dom/Element;

    .line 906
    invoke-interface {v0, p1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    return-void
.end method

.method private ܽ()V
    .locals 4

    .line 1023
    iget-object v0, p0, Ll/᩹᩶ۡ;->۫:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-gtz v1, :cond_0

    iget-boolean v1, p0, Ll/᩹᩶ۡ;->᩸:Z

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    .line 0
    invoke-static {v1, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 1024
    check-cast v1, Lorg/w3c/dom/Element;

    .line 1026
    iget-boolean v2, p0, Ll/᩹᩶ۡ;->᩸:Z

    iget-object v3, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    if-eqz v2, :cond_1

    .line 1027
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/w3c/dom/Document;->createCDATASection(Ljava/lang/String;)Lorg/w3c/dom/CDATASection;

    move-result-object v2

    goto :goto_0

    .line 1029
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object v2

    .line 1031
    :goto_0
    invoke-interface {v1, v2}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    const/4 v1, 0x0

    .line 1032
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_2
    return-void
.end method

.method private ᩳ()Ll/᩶᩶ۡ;
    .locals 9

    .line 957
    iget-object v0, p0, Ll/᩹᩶ۡ;->۬:Lorg/xml/sax/Locator;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 958
    iget-object v1, p0, Ll/᩹᩶ۡ;->۬:Lorg/xml/sax/Locator;

    invoke-interface {v1}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 961
    iget-object v2, p0, Ll/᩹᩶ۡ;->ۛ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 962
    :goto_0
    iget v4, p0, Ll/᩹᩶ۡ;->᩶:I

    const/16 v5, 0xa

    if-ge v4, v0, :cond_3

    iget v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    if-ge v4, v3, :cond_3

    .line 963
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0xd

    const/4 v7, 0x0

    if-ne v4, v6, :cond_0

    .line 964
    iget v6, p0, Ll/᩹᩶ۡ;->ۙ:I

    add-int/lit8 v8, v3, -0x1

    if-ge v6, v8, :cond_0

    add-int/lit8 v6, v6, 0x1

    .line 965
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v5, :cond_2

    .line 966
    iget v4, p0, Ll/᩹᩶ۡ;->᩶:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩹᩶ۡ;->᩶:I

    .line 967
    iput v7, p0, Ll/᩹᩶ۡ;->᩹:I

    goto :goto_1

    :cond_0
    if-ne v4, v5, :cond_1

    .line 970
    iget v4, p0, Ll/᩹᩶ۡ;->᩶:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩹᩶ۡ;->᩶:I

    .line 971
    iput v7, p0, Ll/᩹᩶ۡ;->᩹:I

    goto :goto_1

    .line 973
    :cond_1
    iget v4, p0, Ll/᩹᩶ۡ;->᩹:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩹᩶ۡ;->᩹:I

    .line 975
    :cond_2
    :goto_1
    iget v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    goto :goto_0

    .line 984
    :cond_3
    iget v0, p0, Ll/᩹᩶ۡ;->᩹:I

    :goto_2
    if-ge v0, v1, :cond_6

    .line 985
    iget v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    if-ne v4, v3, :cond_4

    goto :goto_3

    .line 988
    :cond_4
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_5

    goto :goto_3

    .line 992
    :cond_5
    iget v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩹᩶ۡ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 995
    :cond_6
    :goto_3
    iget v0, p0, Ll/᩹᩶ۡ;->ۙ:I

    if-lt v0, v3, :cond_7

    .line 998
    iput v3, p0, Ll/᩹᩶ۡ;->ۙ:I

    .line 1000
    :cond_7
    iput v1, p0, Ll/᩹᩶ۡ;->᩹:I

    .line 1002
    new-instance v0, Ll/᩶᩶ۡ;

    iget v2, p0, Ll/᩹᩶ۡ;->᩶:I

    iget v3, p0, Ll/᩹᩶ۡ;->ۙ:I

    invoke-direct {v0, v2, v1, v3}, Ll/᩶᩶ۡ;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final characters([CII)V
    .locals 1

    .line 1019
    iget-object v0, p0, Ll/᩹᩶ۡ;->۫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final comment([CII)V
    .locals 1

    .line 882
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    .line 883
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 884
    iget-object p1, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    invoke-interface {p1, v0}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    move-result-object p1

    .line 887
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ᩳ()Ll/᩶᩶ۡ;

    move-result-object p2

    .line 888
    invoke-direct {p0, p2}, Ll/᩹᩶ۡ;->֫(Ll/᩶᩶ۡ;)Ll/᩶᩶ۡ;

    move-result-object p3

    .line 889
    invoke-virtual {p3, p2}, Ll/᩶᩶ۡ;->֫(Ll/᩶᩶ۡ;)V

    const-string p2, "offsets"

    const/4 v0, 0x0

    .line 891
    invoke-interface {p1, p2, p3, v0}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    .line 892
    invoke-direct {p0, p1}, Ll/᩹᩶ۡ;->֫(Lorg/w3c/dom/Node;)V

    return-void
.end method

.method public final endCDATA()V
    .locals 1

    .line 1013
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    const/4 v0, 0x0

    .line 1014
    iput-boolean v0, p0, Ll/᩹᩶ۡ;->᩸:Z

    return-void
.end method

.method public final endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 870
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    .line 871
    iget-object p1, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    const/4 p2, 0x1

    .line 0
    invoke-static {p1, p2}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 871
    check-cast p1, Lorg/w3c/dom/Element;

    const-string p2, "offsets"

    .line 873
    invoke-interface {p1, p2}, Lorg/w3c/dom/Node;->getUserData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶᩶ۡ;

    .line 875
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ᩳ()Ll/᩶᩶ۡ;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/᩶᩶ۡ;->֫(Ll/᩶᩶ۡ;)V

    .line 877
    invoke-direct {p0, p1}, Ll/᩹᩶ۡ;->֫(Lorg/w3c/dom/Node;)V

    return-void
.end method

.method public final setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 0

    .line 827
    iput-object p1, p0, Ll/᩹᩶ۡ;->۬:Lorg/xml/sax/Locator;

    return-void
.end method

.method public final startCDATA()V
    .locals 1

    .line 1007
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    const/4 v0, 0x1

    .line 1008
    iput-boolean v0, p0, Ll/᩹᩶ۡ;->᩸:Z

    return-void
.end method

.method public final startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    .line 834
    iget-object p2, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    :try_start_0
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    .line 835
    invoke-interface {p2, p1, p3}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object p1

    const/4 p3, 0x0

    .line 836
    :goto_0
    invoke-interface {p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v0

    if-ge p3, v0, :cond_1

    .line 837
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 838
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v0

    .line 839
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v1

    .line 838
    invoke-interface {p2, v0, v1}, Lorg/w3c/dom/Document;->createAttributeNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v0

    .line 840
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/w3c/dom/Attr;->setValue(Ljava/lang/String;)V

    .line 841
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->setAttributeNodeNS(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;

    goto :goto_1

    .line 844
    :cond_0
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/w3c/dom/Document;->createAttribute(Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v0

    .line 845
    invoke-interface {p4, p3}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/w3c/dom/Attr;->setValue(Ljava/lang/String;)V

    .line 846
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->setAttributeNode(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;

    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 851
    :cond_1
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ᩳ()Ll/᩶᩶ۡ;

    move-result-object p2

    const-string p3, "offsets"

    .line 861
    invoke-direct {p0, p2}, Ll/᩹᩶ۡ;->֫(Ll/᩶᩶ۡ;)Ll/᩶᩶ۡ;

    move-result-object p2

    const/4 p4, 0x0

    invoke-interface {p1, p3, p2, p4}, Lorg/w3c/dom/Node;->setUserData(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;

    .line 862
    iget-object p2, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 864
    new-instance p2, Lorg/xml/sax/SAXException;

    invoke-direct {p2, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public final ֫()V
    .locals 3

    .line 813
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ܽ()V

    .line 814
    :goto_0
    iget-object v0, p0, Ll/᩹᩶ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 815
    check-cast v0, Lorg/w3c/dom/Element;

    const-string v1, "offsets"

    .line 817
    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->getUserData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩶ۡ;

    .line 819
    invoke-direct {p0}, Ll/᩹᩶ۡ;->ᩳ()Ll/᩶᩶ۡ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩶᩶ۡ;->֫(Ll/᩶᩶ۡ;)V

    .line 821
    invoke-direct {p0, v0}, Ll/᩹᩶ۡ;->֫(Lorg/w3c/dom/Node;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Lorg/w3c/dom/Document;
    .locals 1

    .line 808
    invoke-virtual {p0}, Ll/᩹᩶ۡ;->֫()V

    .line 809
    iget-object v0, p0, Ll/᩹᩶ۡ;->ۗ:Lorg/w3c/dom/Document;

    return-object v0
.end method
