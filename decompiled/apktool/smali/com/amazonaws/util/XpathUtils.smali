.class public Lcom/amazonaws/util/XpathUtils;
.super Ljava/lang/Object;
.source "XpathUtils.java"


# static fields
.field public static ֫:Ljavax/xml/parsers/DocumentBuilderFactory;

.field public static ۧ:Lcom/amazonaws/logging/Log;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Lcom/amazonaws/util/XpathUtils;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/XpathUtils;->ۧ:Lcom/amazonaws/logging/Log;

    .line 48
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/XpathUtils;->֫:Ljavax/xml/parsers/DocumentBuilderFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "."

    .line 284
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 335
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v0

    .line 312
    sget-object v1, Ljavax/xml/xpath/XPathConstants;->NODE:Ljavax/xml/namespace/QName;

    invoke-interface {v0, p0, p1, v1}, Ljavax/xml/xpath/XPath;->evaluate(Ljava/lang/String;Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 335
    :cond_1
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v0

    .line 297
    invoke-interface {v0, p0, p1}, Ljavax/xml/xpath/XPath;->evaluate(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 299
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Lorg/w3c/dom/Document;
    .locals 2

    .line 77
    new-instance v0, Ljava/io/ByteArrayInputStream;

    sget-object v1, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 60
    new-instance p0, Lcom/amazonaws/util/NamespaceRemovingInputStream;

    invoke-direct {p0, v0}, Lcom/amazonaws/util/NamespaceRemovingInputStream;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 61
    sget-object v0, Lcom/amazonaws/util/XpathUtils;->֫:Ljavax/xml/parsers/DocumentBuilderFactory;

    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v0

    .line 62
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V

    return-object v0
.end method
