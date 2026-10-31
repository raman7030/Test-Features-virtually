.class public Lcom/amazonaws/regions/RegionMetadataParser;
.super Ljava/lang/Object;
.source "RegionMetadataParser.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;
    .locals 0

    .line 189
    invoke-interface {p1, p0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 192
    :cond_0
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 193
    invoke-interface {p0, p1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p0

    .line 195
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/FileInputStream;)Ljava/util/ArrayList;
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Unable to parse region metadata file: "

    .line 113
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v1

    .line 115
    invoke-virtual {v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v1

    .line 116
    invoke-virtual {v1, p0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    const-string p0, "Region"

    .line 131
    invoke-interface {v0, p0}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 132
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 133
    :goto_0
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 134
    invoke-interface {p0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v2

    .line 135
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 136
    check-cast v2, Lorg/w3c/dom/Element;

    const-string v3, "Name"

    .line 148
    invoke-static {v3, v2}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Domain"

    .line 149
    invoke-static {v4, v2}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    .line 151
    new-instance v4, Lcom/amazonaws/regions/Region;

    invoke-direct {v4, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    const-string v3, "Endpoint"

    .line 154
    invoke-interface {v2, v3}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v2

    const/4 v3, 0x0

    .line 156
    :goto_1
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v5

    if-ge v3, v5, :cond_0

    .line 158
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v5

    check-cast v5, Lorg/w3c/dom/Element;

    const-string v6, "ServiceName"

    .line 170
    invoke-static {v6, v5}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Hostname"

    .line 171
    invoke-static {v7, v5}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Http"

    .line 172
    invoke-static {v8, v5}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Https"

    .line 173
    invoke-static {v9, v5}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v5

    .line 180
    invoke-virtual {v4}, Lcom/amazonaws/regions/Region;->ܿ()Ljava/util/HashMap;

    move-result-object v9

    invoke-virtual {v9, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    invoke-virtual {v4}, Lcom/amazonaws/regions/Region;->֫()Ljava/util/HashMap;

    move-result-object v7

    const-string v9, "true"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    invoke-virtual {v4}, Lcom/amazonaws/regions/Region;->ۧ()Ljava/util/HashMap;

    move-result-object v7

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v7, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 137
    :cond_0
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    .line 121
    :try_start_2
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    move-exception v0

    .line 119
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    :goto_2
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 129
    :catch_3
    throw v0
.end method
