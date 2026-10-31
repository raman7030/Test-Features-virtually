.class public Lorg/simpleframework/xml/core/AttributeParameter$Contact;
.super Lorg/simpleframework/xml/core/ParameterContact;
.source "AttributeParameter.java"


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/Attribute;Ljava/lang/reflect/Constructor;I)V
    .locals 0

    .line 245
    invoke-direct {p0, p1, p2, p3}, Lorg/simpleframework/xml/core/ParameterContact;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Constructor;I)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->label:Ljava/lang/annotation/Annotation;

    check-cast v0, Lorg/simpleframework/xml/Attribute;

    invoke-interface {v0}, Lorg/simpleframework/xml/Attribute;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
