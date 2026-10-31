.class public final Ll/ܶ֨ܺ;
.super Lorg/xml/sax/ext/DefaultHandler2;
.source "KB7N"


# instance fields
.field public final synthetic ᩸:Ll/ۗ֨ܺ;


# direct methods
.method public constructor <init>(Ll/ۗ֨ܺ;)V
    .locals 0

    .line 831
    iput-object p1, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-direct {p0}, Lorg/xml/sax/ext/DefaultHandler2;-><init>()V

    return-void
.end method


# virtual methods
.method public final characters([CII)V
    .locals 1

    .line 850
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    iget-object p1, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-static {p1, v0}, Ll/ۗ֨ܺ;->֫(Ll/ۗ֨ܺ;Ljava/lang/String;)V

    return-void
.end method

.method public final endDocument()V
    .locals 1

    .line 873
    iget-object v0, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 866
    iget-object v0, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-static {v0, p1, p2, p3}, Ll/ۗ֨ܺ;->֫(Ll/ۗ֨ܺ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 880
    new-instance v0, Ll/᩶֨ܺ;

    invoke-direct {v0, p2}, Ll/᩶֨ܺ;-><init>(Ljava/lang/String;)V

    .line 881
    invoke-static {v0}, Ll/ۗ֨ܺ;->֫(Ll/᩶֨ܺ;)Ljava/util/HashMap;

    const-string p2, "xml-stylesheet"

    .line 1133
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    return-void
.end method

.method public final startDocument()V
    .locals 1

    .line 836
    iget-object v0, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-static {v0}, Ll/ۗ֨ܺ;->֫(Ll/ۗ֨ܺ;)V

    return-void
.end method

.method public final startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1

    .line 843
    iget-object v0, p0, Ll/ܶ֨ܺ;->᩸:Ll/ۗ֨ܺ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/ۗ֨ܺ;->֫(Ll/ۗ֨ܺ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method
