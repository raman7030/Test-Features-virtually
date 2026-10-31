.class public Lorg/simpleframework/xml/stream/StreamReader$Start;
.super Lorg/simpleframework/xml/stream/EventElement;
.source "StreamReader.java"


# instance fields
.field public final element:Ljavax/xml/stream/events/StartElement;

.field public final location:Ljavax/xml/stream/Location;


# direct methods
.method public constructor <init>(Ljavax/xml/stream/events/XMLEvent;)V
    .locals 1

    .line 340
    invoke-direct {p0}, Lorg/simpleframework/xml/stream/EventElement;-><init>()V

    .line 341
    invoke-interface {p1}, Ljavax/xml/stream/events/XMLEvent;->asStartElement()Ljavax/xml/stream/events/StartElement;

    move-result-object v0

    iput-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    .line 342
    invoke-interface {p1}, Ljavax/xml/stream/events/XMLEvent;->getLocation()Ljavax/xml/stream/Location;

    move-result-object p1

    iput-object p1, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->location:Ljavax/xml/stream/Location;

    return-void
.end method


# virtual methods
.method public getAttributes()Ljava/util/Iterator;
    .locals 1

    .line 399
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    invoke-interface {v0}, Ljavax/xml/stream/events/StartElement;->getAttributes()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getLine()I
    .locals 1

    .line 353
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->location:Ljavax/xml/stream/Location;

    invoke-interface {v0}, Ljavax/xml/stream/Location;->getLineNumber()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 364
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    invoke-interface {v0}, Ljavax/xml/stream/events/StartElement;->getName()Ljavax/xml/namespace/QName;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 376
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    invoke-interface {v0}, Ljavax/xml/stream/events/StartElement;->getName()Ljavax/xml/namespace/QName;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getPrefix()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReference()Ljava/lang/String;
    .locals 1

    .line 388
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    invoke-interface {v0}, Ljavax/xml/stream/events/StartElement;->getName()Ljavax/xml/namespace/QName;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    .line 410
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:Ljavax/xml/stream/events/StartElement;

    return-object v0
.end method
