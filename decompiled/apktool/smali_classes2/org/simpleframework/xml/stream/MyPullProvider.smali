.class public Lorg/simpleframework/xml/stream/MyPullProvider;
.super Ljava/lang/Object;
.source "MyPullProvider.java"

# interfaces
.implements Lorg/simpleframework/xml/stream/Provider;


# instance fields
.field public final factory:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/simpleframework/xml/stream/MyPullProvider;->factory:Lorg/xmlpull/v1/XmlPullParserFactory;

    const/4 v1, 0x1

    .line 63
    invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V

    const-string v2, "http://xmlpull.org/v1/doc/features.html#relaxed"

    .line 64
    invoke-virtual {v0, v2, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setFeature(Ljava/lang/String;Z)V

    return-void
.end method

.method public static inject()V
    .locals 3

    .line 42
    :try_start_0
    const-class v0, Lorg/simpleframework/xml/stream/NodeBuilder;

    const-string v1, "PROVIDER"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    new-instance v1, Lorg/simpleframework/xml/stream/MyPullProvider;

    invoke-direct {v1}, Lorg/simpleframework/xml/stream/MyPullProvider;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 46
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public provide(Ljava/io/InputStream;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 2

    .line 77
    iget-object v0, p0, Lorg/simpleframework/xml/stream/MyPullProvider;->factory:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 79
    invoke-interface {v0, p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 81
    :cond_0
    new-instance p1, Lorg/simpleframework/xml/stream/PullReader;

    invoke-direct {p1, v0}, Lorg/simpleframework/xml/stream/PullReader;-><init>(Lorg/xmlpull/v1/XmlPullParser;)V

    return-object p1
.end method

.method public provide(Ljava/io/Reader;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 1

    .line 93
    iget-object v0, p0, Lorg/simpleframework/xml/stream/MyPullProvider;->factory:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 95
    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 97
    :cond_0
    new-instance p1, Lorg/simpleframework/xml/stream/PullReader;

    invoke-direct {p1, v0}, Lorg/simpleframework/xml/stream/PullReader;-><init>(Lorg/xmlpull/v1/XmlPullParser;)V

    return-object p1
.end method
