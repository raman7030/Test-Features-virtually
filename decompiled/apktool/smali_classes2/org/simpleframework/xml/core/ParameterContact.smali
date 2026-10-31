.class public abstract Lorg/simpleframework/xml/core/ParameterContact;
.super Ljava/lang/Object;
.source "ParameterContact.java"

# interfaces
.implements Lorg/simpleframework/xml/core/Contact;


# instance fields
.field public final factory:Ljava/lang/reflect/Constructor;

.field public final index:I

.field public final label:Ljava/lang/annotation/Annotation;

.field public final labels:[Ljava/lang/annotation/Annotation;

.field public final owner:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Constructor;I)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    aget-object v0, v0, p3

    iput-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->labels:[Ljava/lang/annotation/Annotation;

    .line 73
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->owner:Ljava/lang/Class;

    .line 74
    iput-object p2, p0, Lorg/simpleframework/xml/core/ParameterContact;->factory:Ljava/lang/reflect/Constructor;

    .line 75
    iput p3, p0, Lorg/simpleframework/xml/core/ParameterContact;->index:I

    .line 76
    iput-object p1, p0, Lorg/simpleframework/xml/core/ParameterContact;->label:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getAnnotation()Ljava/lang/annotation/Annotation;
    .locals 1

    .line 87
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->label:Ljava/lang/annotation/Annotation;

    return-object v0
.end method

.method public getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 5

    .line 173
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->labels:[Ljava/lang/annotation/Annotation;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 174
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    .line 176
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDeclaringClass()Ljava/lang/Class;
    .locals 1

    .line 133
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->owner:Ljava/lang/Class;

    return-object v0
.end method

.method public getDependent()Ljava/lang/Class;
    .locals 2

    .line 110
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->factory:Ljava/lang/reflect/Constructor;

    iget v1, p0, Lorg/simpleframework/xml/core/ParameterContact;->index:I

    invoke-static {v0, v1}, Lorg/simpleframework/xml/core/Reflector;->getParameterDependent(Ljava/lang/reflect/Constructor;I)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getDependents()[Ljava/lang/Class;
    .locals 2

    .line 122
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->factory:Ljava/lang/reflect/Constructor;

    iget v1, p0, Lorg/simpleframework/xml/core/ParameterContact;->index:I

    invoke-static {v0, v1}, Lorg/simpleframework/xml/core/Reflector;->getParameterDependents(Ljava/lang/reflect/Constructor;I)[Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public getType()Ljava/lang/Class;
    .locals 2

    .line 98
    iget-object v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->factory:Ljava/lang/reflect/Constructor;

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    iget v1, p0, Lorg/simpleframework/xml/core/ParameterContact;->index:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public isReadOnly()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 203
    iget v0, p0, Lorg/simpleframework/xml/core/ParameterContact;->index:I

    iget-object v1, p0, Lorg/simpleframework/xml/core/ParameterContact;->factory:Ljava/lang/reflect/Constructor;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "parameter "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " of constructor "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
