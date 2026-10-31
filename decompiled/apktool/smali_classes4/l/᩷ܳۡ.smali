.class public final Ll/᩷ܳۡ;
.super Ljava/lang/Object;
.source "TBJG"


# static fields
.field public static ۧ:Lorg/xml/sax/ErrorHandler;


# instance fields
.field public final ֫:Ll/ۢܳۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 482
    new-instance v0, Ll/ۛܿۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩷ܳۡ;->ۧ:Lorg/xml/sax/ErrorHandler;

    return-void
.end method

.method public constructor <init>(Ll/ۢܳۡ;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ll/᩷ܳۡ;->֫:Ll/ۢܳۡ;

    return-void
.end method

.method private ֫(Ljava/io/StringReader;Ll/ܰܿۡ;)V
    .locals 5

    .line 65
    invoke-static {p1}, Ll/ܳܳۡ;->֫(Ljava/io/StringReader;)Ll/֫ܳۡ;

    move-result-object p1

    .line 66
    invoke-static {p2}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;)I

    move-result v0

    invoke-virtual {p1}, Ll/֫ܳۡ;->ܽ()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p2, v0}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;I)V

    .line 68
    invoke-static {p2}, Ll/ܰܿۡ;->ۧ(Ll/ܰܿۡ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 0
    instance-of v0, p1, Ll/᩻ܳۡ;

    if-nez v0, :cond_1

    .line 143
    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v2, v4, :cond_1

    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\r"

    .line 144
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v2, v4, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 75
    invoke-static {p2}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;)I

    move-result v0

    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 148
    invoke-static {v1, v0}, Ll/ܰۨᩴ;->range(II)Ll/ۧ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/ۤܿۡ;

    invoke-direct {v3, p0, v2}, Ll/ۤܿۡ;-><init>(Ll/᩷ܳۡ;Ljava/lang/StringBuilder;)V

    invoke-interface {v0, v3}, Ll/ۧ᩺ᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    .line 79
    :cond_2
    instance-of v0, p1, Ll/ۜܳۡ;

    if-eqz v0, :cond_5

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x1e

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 81
    invoke-static {p2}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;)I

    move-result v2

    .line 148
    invoke-static {v1, v2}, Ll/ܰۨᩴ;->range(II)Ll/ۧ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ۤܿۡ;

    invoke-direct {v2, p0, v0}, Ll/ۤܿۡ;-><init>(Ll/᩷ܳۡ;Ljava/lang/StringBuilder;)V

    invoke-interface {v1, v2}, Ll/ۧ᩺ᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    .line 82
    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "</"

    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "<%"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "<?"

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "<["

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 34
    :cond_3
    :try_start_0
    new-instance v3, Ll/᩵ܳۡ;

    .line 163
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {v3, v2}, Ll/᩵ܳۡ;->ۧ(Ljava/lang/String;)Ll/ۖܳۡ;

    move-result-object v2
    :try_end_0
    .catch Ll/ܺܳۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    new-instance v3, Ll/ۘܳۡ;

    iget-object v4, p0, Ll/᩷ܳۡ;->֫:Ll/ۢܳۡ;

    invoke-direct {v3, v4}, Ll/ۘܳۡ;-><init>(Ll/ۢܳۡ;)V

    invoke-virtual {v3, v2, v0}, Ll/ۘܳۡ;->֫(Ll/ۖܳۡ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 82
    :catch_0
    :cond_4
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 85
    :cond_5
    invoke-static {p2}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    :goto_2
    invoke-static {p2}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;)I

    move-result v0

    invoke-virtual {p1}, Ll/֫ܳۡ;->ۧ()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p2, v0}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;I)V

    .line 89
    invoke-virtual {p1}, Ll/֫ܳۡ;->ܿ()Z

    move-result p1

    invoke-static {p2, p1}, Ll/ܰܿۡ;->֫(Ll/ܰܿۡ;Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩷ܳۡ;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 148
    iget-object p0, p0, Ll/᩷ܳۡ;->֫:Ll/ۢܳۡ;

    invoke-virtual {p0}, Ll/ۢܳۡ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    .line 121
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v1

    const/4 v2, 0x0

    .line 122
    invoke-virtual {v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    .line 123
    invoke-virtual {v1, v0}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    .line 127
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v1

    .line 130
    sget-object v2, Ll/᩷ܳۡ;->ۧ:Lorg/xml/sax/ErrorHandler;

    invoke-interface {v1, v2}, Lorg/xml/sax/XMLReader;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    .line 131
    new-instance v2, Lorg/xml/sax/InputSource;

    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-interface {v1, v2}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 133
    instance-of v2, v1, Lorg/xml/sax/SAXParseException;

    if-eqz v2, :cond_1

    .line 135
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "WARN: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 97
    :goto_0
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 98
    new-instance p1, Ll/ܰܿۡ;

    invoke-direct {p1}, Ll/ܰܿۡ;-><init>()V

    .line 102
    :goto_1
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/io/Reader;->mark(I)V

    .line 103
    invoke-virtual {v1}, Ljava/io/Reader;->read()I

    move-result v2

    .line 104
    invoke-virtual {v1}, Ljava/io/Reader;->reset()V

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 107
    invoke-direct {p0, v1, p1}, Ll/᩷ܳۡ;->֫(Ljava/io/StringReader;Ll/ܰܿۡ;)V

    goto :goto_1

    .line 112
    :cond_0
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 114
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 116
    :goto_2
    invoke-static {p1}, Ll/ܰܿۡ;->ܽ(Ll/ܰܿۡ;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 137
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
