.class public final Ll/ۚۢ֫;
.super Ljava/lang/Object;
.source "D5S8"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static ܽ:Ll/ۚۢ֫;


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ll/ۚۢ֫;

    invoke-direct {v0}, Ll/ۚۢ֫;-><init>()V

    sput-object v0, Ll/ۚۢ֫;->ܽ:Ll/ۚۢ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚۢ֫;->֫:Ljava/util/HashMap;

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚۢ֫;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method private ֫(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ll/᩵ۢ֫;
    .locals 11

    .line 109
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 110
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {p0, v0}, Ll/ۚۢ֫;->֫(Ljava/lang/Class;)Ll/᩵ۢ֫;

    move-result-object v0

    .line 114
    iget-object v0, v0, Ll/᩵ۢ֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 118
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    .line 119
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    .line 120
    invoke-virtual {p0, v5}, Ll/ۚۢ֫;->֫(Ljava/lang/Class;)Ll/᩵ۢ֫;

    move-result-object v5

    iget-object v5, v5, Ll/᩵ۢ֫;->ۧ:Ljava/util/HashMap;

    .line 121
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    .line 120
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 122
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ۢ֫;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ۢ֫;

    invoke-static {v1, v7, v6, p1}, Ll/ۚۢ֫;->֫(Ljava/util/HashMap;Ll/֡ۢ֫;Ll/᩺ۢ֫;Ljava/lang/Class;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    goto :goto_2

    .line 74
    :cond_3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_2
    array-length v0, p2

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_3
    if-ge v2, v0, :cond_b

    aget-object v5, p2, v2

    .line 129
    const-class v6, Ll/۠ۡ֫;

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Ll/۠ۡ֫;

    if-nez v6, :cond_4

    goto :goto_6

    .line 134
    :cond_4
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    .line 136
    array-length v7, v4

    const/4 v8, 0x1

    if-lez v7, :cond_6

    .line 138
    const-class v7, Ll/᩻ۡ֫;

    aget-object v9, v4, v3

    invoke-virtual {v7, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/4 v7, 0x1

    goto :goto_4

    .line 139
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid parameter type. Must be one and instanceof LifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/4 v7, 0x0

    .line 143
    :goto_4
    invoke-interface {v6}, Ll/۠ۡ֫;->value()Ll/᩺ۢ֫;

    move-result-object v6

    .line 145
    array-length v9, v4

    const/4 v10, 0x2

    if-le v9, v8, :cond_9

    .line 147
    const-class v7, Ll/᩺ۢ֫;

    aget-object v8, v4, v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 151
    sget-object v7, Ll/᩺ۢ֫;->᩶:Ll/᩺ۢ֫;

    if-ne v6, v7, :cond_7

    const/4 v7, 0x2

    goto :goto_5

    .line 152
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Second arg is supported only for ON_ANY value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 148
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid parameter type. second arg must be an event"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 156
    :cond_9
    :goto_5
    array-length v4, v4

    if-gt v4, v10, :cond_a

    .line 159
    new-instance v4, Ll/֡ۢ֫;

    invoke-direct {v4, v5, v7}, Ll/֡ۢ֫;-><init>(Ljava/lang/reflect/Method;I)V

    .line 160
    invoke-static {v1, v4, v6, p1}, Ll/ۚۢ֫;->֫(Ljava/util/HashMap;Ll/֡ۢ֫;Ll/᩺ۢ֫;Ljava/lang/Class;)V

    const/4 v4, 0x1

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 157
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "cannot have more than 2 params"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 162
    :cond_b
    new-instance p2, Ll/᩵ۢ֫;

    invoke-direct {p2, v1}, Ll/᩵ۢ֫;-><init>(Ljava/util/HashMap;)V

    .line 163
    iget-object v0, p0, Ll/ۚۢ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget-object v0, p0, Ll/ۚۢ֫;->ۧ:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :catch_0
    move-exception p1

    .line 76
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static ֫(Ljava/util/HashMap;Ll/֡ۢ֫;Ll/᩺ۢ֫;Ljava/lang/Class;)V
    .locals 3

    .line 95
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۢ֫;

    if-eqz v0, :cond_1

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    iget-object p0, p1, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    .line 98
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " already declared with different @OnLifecycleEvent value: previous value "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", new value "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 104
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/᩵ۢ֫;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۚۢ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۢ֫;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, p1, v0}, Ll/ۚۢ֫;->֫(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ll/᩵ۢ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Class;)Z
    .locals 7

    .line 49
    iget-object v0, p0, Ll/ۚۢ֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 74
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    .line 56
    const-class v6, Ll/۠ۡ֫;

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Ll/۠ۡ֫;

    if-eqz v5, :cond_1

    .line 64
    invoke-direct {p0, p1, v1}, Ll/ۚۢ֫;->֫(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ll/᩵ۢ֫;

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 68
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v3

    :catch_0
    move-exception p1

    .line 76
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
