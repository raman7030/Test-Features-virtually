.class public final Ll/᩺ܺ᩻;
.super Ljava/lang/Object;
.source "R811"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/᩺ܺ᩻;->֫:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Ll/᩺ܺ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;
    .locals 0

    .line 107
    invoke-interface {p1, p0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 108
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    .line 109
    invoke-interface {p0, p1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p0

    invoke-interface {p0}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 8

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Host"

    const-string v2, "service.cos.myqcloud.com"

    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "GMT"

    .line 119
    invoke-static {v2}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 120
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Date"

    .line 54
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v1, p0, Ll/᩺ܺ᩻;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/᩺ܺ᩻;->ۧ:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Ll/ۨܺ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    .line 60
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    new-instance v1, Ll/ۢ۟᩵;

    invoke-direct {v1}, Ll/ۢ۟᩵;-><init>()V

    const-string v2, "https://service.cos.myqcloud.com"

    .line 64
    invoke-virtual {v1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v1}, Ll/ۢ۟᩵;->ۧ()V

    .line 68
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 69
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 74
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v0

    .line 75
    :try_start_0
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v1

    if-nez v1, :cond_3

    .line 76
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x191

    if-eq v1, v2, :cond_2

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x193

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 79
    :cond_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Request failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_2
    :goto_1
    new-instance v1, Ll/᩵ۤۡ;

    const v2, 0x7f120703

    invoke-direct {v1, v2}, Ll/᩵ۤۡ;-><init>(I)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :cond_3
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v2

    .line 86
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v2

    const-string v3, "Bucket"

    .line 87
    invoke-interface {v2, v3}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v2

    const/4 v3, 0x0

    .line 89
    :goto_2
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 90
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 91
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_4

    .line 92
    check-cast v4, Lorg/w3c/dom/Element;

    const-string v5, "Name"

    .line 93
    invoke-static {v5, v4}, Ll/᩺ܺ᩻;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Location"

    .line 94
    invoke-static {v6, v4}, Ll/᩺ܺ᩻;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v4

    .line 95
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "cos."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".myqcloud.com"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 96
    new-instance v7, Ll/ۛܺ᩻;

    invoke-direct {v7, v5, v4, v6}, Ll/ۛܺ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V

    return-object v1

    :catch_0
    move-exception v1

    .line 101
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Failed to parse ListBuckets response"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v1

    .line 74
    :try_start_3
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method
