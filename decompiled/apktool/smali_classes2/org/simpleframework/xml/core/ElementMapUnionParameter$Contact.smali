.class public Lorg/simpleframework/xml/core/ElementMapUnionParameter$Contact;
.super Lorg/simpleframework/xml/core/ParameterContact;
.source "ElementMapUnionParameter.java"


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/ElementMap;Ljava/lang/reflect/Constructor;I)V
    .locals 0

    .line 234
    invoke-direct {p0, p1, p2, p3}, Lorg/simpleframework/xml/core/ParameterContact;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Constructor;I)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->label:Ljava/lang/annotation/Annotation;

    check-cast v0, Lorg/simpleframework/xml/ElementMap;

    invoke-interface {v0}, Lorg/simpleframework/xml/ElementMap;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
