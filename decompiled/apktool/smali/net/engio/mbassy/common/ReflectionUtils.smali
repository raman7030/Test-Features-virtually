.class public Lnet/engio/mbassy/common/ReflectionUtils;
.super Ljava/lang/Object;
.source "ReflectionUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static collectInterfaces(Ljava/lang/Class;Ljava/util/Collection;)V
    .locals 3

    .line 88
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 89
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    invoke-static {v2, p1}, Lnet/engio/mbassy/common/ReflectionUtils;->collectInterfaces(Ljava/lang/Class;Ljava/util/Collection;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static containsOverridingMethod([Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 95
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 98
    aget-object v3, p0, v2

    .line 100
    invoke-static {p1, v3}, Lnet/engio/mbassy/common/ReflectionUtils;->isOverriddenBy(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 1

    .line 132
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0, p1, v0}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;Ljava/util/Set;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;Ljava/util/Set;)Ljava/lang/annotation/Annotation;
    .locals 4

    .line 118
    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 119
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 120
    invoke-interface {p0, p1}, Ljava/lang/reflect/AnnotatedElement;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 122
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p0

    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p0, v2

    .line 123
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3, p1, p2}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;Ljava/util/Set;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static getMethods(Lnet/engio/mbassy/common/IPredicate;Ljava/lang/Class;Ljava/util/ArrayList;)V
    .locals 5

    .line 30
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 31
    invoke-interface {p0, v3}, Lnet/engio/mbassy/common/IPredicate;->apply(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 32
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    nop

    .line 39
    :cond_1
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lnet/engio/mbassy/common/ReflectionUtils;->getMethods(Lnet/engio/mbassy/common/IPredicate;Ljava/lang/Class;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public static getMethods(Lnet/engio/mbassy/common/IPredicate;Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    .locals 1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-static {p0, p1, v0}, Lnet/engio/mbassy/common/ReflectionUtils;->getMethods(Lnet/engio/mbassy/common/IPredicate;Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/reflect/Method;

    .line 24
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p0
.end method

.method public static getOverridingMethod(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    .line 54
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 59
    :catch_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getSuperTypes(Ljava/lang/Class;)[Ljava/lang/Class;
    .locals 2

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-static {p0, v0}, Lnet/engio/mbassy/common/ReflectionUtils;->collectInterfaces(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 76
    :goto_0
    const-class v1, Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    .line 79
    invoke-static {p0, v0}, Lnet/engio/mbassy/common/ReflectionUtils;->collectInterfaces(Ljava/lang/Class;Ljava/util/Collection;)V

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/Class;

    .line 83
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p0
.end method

.method public static isOverriddenBy(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 139
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 140
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    .line 146
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    .line 149
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_2

    .line 150
    aget-object v2, p0, v0

    aget-object v3, p1, v0

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v1
.end method
