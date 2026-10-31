.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;
.super Ljava/lang/Object;
.source "XmlResponsesSaxParser.java"


# static fields
.field public static final synthetic ۧ:I

.field public static final ܽ:Lcom/amazonaws/logging/Log;


# instance fields
.field public ֫:Lorg/xml/sax/XMLReader;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 142
    const-class v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫:Lorg/xml/sax/XMLReader;

    .line 156
    :try_start_0
    invoke-static {}, Lorg/xml/sax/helpers/XMLReaderFactory;->createXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫:Lorg/xml/sax/XMLReader;
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "org.xml.sax.driver"

    const-string v2, "org.xmlpull.v1.sax2.Driver"

    .line 158
    invoke-static {v1, v2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    :try_start_1
    invoke-static {}, Lorg/xml/sax/helpers/XMLReaderFactory;->createXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v1

    iput-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫:Lorg/xml/sax/XMLReader;
    :try_end_1
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    .line 163
    :catch_1
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    const-string v2, "Couldn\'t initialize a sax driver for the XMLReader"

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    throw v1
.end method

.method public static synthetic ֫()Lcom/amazonaws/logging/Log;
    .locals 1

    .line 141
    sget-object v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_1

    .line 352
    sget p1, Lcom/amazonaws/services/s3/internal/S3HttpUtils;->֫:I

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_0
    const-string p1, "UTF-8"

    .line 132
    invoke-static {p0, p1}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 134
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 3

    .line 303
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 305
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse integer value \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    invoke-interface {v1, p0, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static ܽ(Ljava/lang/String;)J
    .locals 3

    .line 322
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 324
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse long value \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    invoke-interface {v1, p0, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;Z)Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;
    .locals 7

    .line 366
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;

    invoke-direct {v0, p2}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;-><init>(Z)V

    .line 216
    sget-object p2, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    invoke-interface {p2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1

    const-class v2, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;

    if-eqz v1, :cond_0

    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Sanitizing XML document destined for handler "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 229
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    const-string v5, "UTF-8"

    invoke-direct {v4, p1, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const/16 v4, 0x2000

    new-array v4, v4, [C

    .line 235
    :goto_0
    invoke-virtual {v3, v4}, Ljava/io/Reader;->read([C)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    const/4 v6, 0x0

    .line 236
    invoke-virtual {v1, v4, v6, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 238
    :cond_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "\r"

    const-string v4, "&#013;"

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 248
    new-instance v3, Ljava/io/ByteArrayInputStream;

    sget-object v4, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    .line 249
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    invoke-virtual {p0, v0, v3}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Lorg/xml/sax/helpers/DefaultHandler;Ljava/io/InputStream;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 256
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 258
    invoke-interface {p2}, Lcom/amazonaws/logging/Log;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Unable to close response InputStream after failure sanitizing XML document"

    .line 259
    invoke-interface {p2, v1, p1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 264
    :cond_2
    :goto_1
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Failed to sanitize XML document destined for handler "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-direct {p1, p2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    throw p1

    :catch_1
    move-exception p1

    .line 252
    throw p1
.end method

.method public final ֫(Lorg/xml/sax/helpers/DefaultHandler;Ljava/io/InputStream;)V
    .locals 5

    .line 182
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫:Lorg/xml/sax/XMLReader;

    sget-object v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ:Lcom/amazonaws/logging/Log;

    const-string v2, "Parsing XML response document with handler: "

    :try_start_0
    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 186
    :cond_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    const-string v4, "UTF-8"

    invoke-direct {v3, p2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 188
    invoke-interface {v0, p1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 189
    invoke-interface {v0, p1}, Lorg/xml/sax/XMLReader;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    .line 190
    new-instance v3, Lorg/xml/sax/InputSource;

    invoke-direct {v3, v2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-interface {v0, v3}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 197
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 199
    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Unable to close response InputStream up after XML parse failure"

    .line 200
    invoke-interface {v1, v2, p2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 203
    :cond_1
    :goto_0
    new-instance p2, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse XML document with handler "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-direct {p2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 204
    throw p2

    :catch_1
    move-exception p1

    .line 193
    throw p1
.end method
