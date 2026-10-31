.class public abstract Ll/ۤۚܺ;
.super Ll/ܺۚܺ;
.source "SB7W"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1863
    invoke-direct {p0}, Ll/ܺۚܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚܺ;)V
    .locals 3

    .line 1868
    instance-of v0, p1, Ll/۫ۚܺ;

    if-eqz v0, :cond_0

    .line 1869
    iget-object v0, p0, Ll/ܺۚܺ;->᩷:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 1871
    :cond_0
    new-instance v0, Ll/᩵֨ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Text content elements cannot contain "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " elements."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 1871
    throw v0
.end method
