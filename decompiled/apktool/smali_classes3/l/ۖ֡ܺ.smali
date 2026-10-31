.class public abstract Ll/ۖ֡ܺ;
.super Ll/᩵ۚܺ;
.source "SB7W"

# interfaces
.implements Ll/ۘۚܺ;


# instance fields
.field public ۜ:Ljava/util/List;

.field public ۡ:Ljava/lang/String;

.field public ۢ:Ljava/lang/Boolean;

.field public ܺ:Ll/ۘ֡ܺ;

.field public ᩷:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1992
    invoke-direct {p0}, Ll/᩵ۚܺ;-><init>()V

    .line 1994
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖ֡ܺ;->ۜ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getChildren()Ljava/util/List;
    .locals 1

    .line 2004
    iget-object v0, p0, Ll/ۖ֡ܺ;->ۜ:Ljava/util/List;

    return-object v0
.end method

.method public final ֫(Ll/ۚۚܺ;)V
    .locals 3

    .line 2010
    instance-of v0, p1, Ll/ܰ֡ܺ;

    if-eqz v0, :cond_0

    .line 2011
    iget-object v0, p0, Ll/ۖ֡ܺ;->ۜ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 2013
    :cond_0
    new-instance v0, Ll/᩵֨ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Gradient elements cannot contain "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " elements."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    .line 2013
    throw v0
.end method
