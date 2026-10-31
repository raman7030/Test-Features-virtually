.class public final Ll/ۙ֨ܺ;
.super Ljava/lang/Object;
.source "KB7N"

# interfaces
.implements Lorg/xml/sax/Attributes;


# instance fields
.field public ᩸:Lorg/xmlpull/v1/XmlPullParser;


# direct methods
.method public constructor <init>(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 0

    .line 641
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 642
    iput-object p1, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    return-void
.end method


# virtual methods
.method public final getIndex(Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final getIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final getLength()I
    .locals 1

    .line 648
    iget-object v0, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    return v0
.end method

.method public final getLocalName(I)Ljava/lang/String;
    .locals 1

    .line 660
    iget-object v0, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getQName(I)Ljava/lang/String;
    .locals 3

    .line 666
    iget-object v0, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    .line 667
    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 668
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3a

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final getType(I)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getType(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getURI(I)Ljava/lang/String;
    .locals 1

    .line 654
    iget-object v0, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getValue(I)Ljava/lang/String;
    .locals 1

    .line 675
    iget-object v0, p0, Ll/ۙ֨ܺ;->᩸:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
