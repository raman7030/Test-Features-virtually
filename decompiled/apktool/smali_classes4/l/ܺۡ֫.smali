.class public final Ll/ܺۡ֫;
.super Ljava/lang/Object;
.source "64YW"


# static fields
.field public static final ֫:Ljava/util/HashMap;

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܺۡ֫;->֫:Ljava/util/HashMap;

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܺۡ֫;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/Class;)I
    .locals 10

    .line 114
    sget-object v0, Ll/ܺۡ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 125
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    goto/16 :goto_6

    :cond_1
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 88
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    .line 89
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_2

    .line 90
    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_2
    const-string v4, ""

    :goto_0
    const-string v6, "fullPackage"

    .line 93
    invoke-static {v4, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const-string v6, "name"

    .line 94
    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "this as java.lang.String).substring(startIndex)"

    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    const-string v6, "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)"

    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "."

    const-string v7, "_"

    .line 176
    invoke-static {v5, v6, v7}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "_LifecycleAdapter"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 98
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x2e

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 97
    :goto_2
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Class;

    aput-object p0, v5, v1

    .line 100
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 101
    invoke-virtual {v4}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v5

    if-nez v5, :cond_5

    .line 102
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    .line 109
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-object v4, v3

    .line 129
    :cond_5
    :goto_3
    sget-object v5, Ll/ܺۡ֫;->ۧ:Ljava/util/HashMap;

    if-eqz v4, :cond_6

    .line 130
    invoke-static {v4}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    .line 134
    :cond_6
    sget-object v4, Ll/ۚۢ֫;->ܽ:Ll/ۚۢ֫;

    invoke-virtual {v4, p0}, Ll/ۚۢ֫;->ۧ(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_6

    .line 138
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    .line 168
    const-class v6, Ll/ܳۡ֫;

    if-eqz v4, :cond_9

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_9

    const-string v3, "superclass"

    .line 141
    invoke-static {v4, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ll/ܺۡ֫;->֫(Ljava/lang/Class;)I

    move-result v3

    if-ne v3, v2, :cond_8

    goto :goto_6

    .line 144
    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    .line 145
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v4, Ljava/util/Collection;

    .line 144
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 148
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v4

    const-string v7, "klass.interfaces"

    invoke-static {v4, v7}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v4

    :goto_4
    if-ge v1, v7, :cond_d

    aget-object v8, v4, v1

    if-eqz v8, :cond_c

    .line 168
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_c

    const-string v9, "intrface"

    .line 152
    invoke-static {v8, v9}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ll/ܺۡ֫;->֫(Ljava/lang/Class;)I

    move-result v9

    if-ne v9, v2, :cond_a

    goto :goto_6

    :cond_a
    if-nez v3, :cond_b

    .line 156
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 158
    :cond_b
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v3, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    if-eqz v3, :cond_e

    .line 161
    invoke-virtual {v5, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    const/4 v2, 0x2

    .line 118
    :cond_e
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 119
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method public static final ֫(Ll/ܳۡ֫;)Ll/ܿۡ֫;
    .locals 5

    const-string v0, "object"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    instance-of v0, p0, Ll/ܿۡ֫;

    .line 39
    instance-of v1, p0, Ll/۠ۢ֫;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 41
    new-instance v0, Ll/᩸ۢ֫;

    .line 42
    move-object v1, p0

    check-cast v1, Ll/۠ۢ֫;

    .line 43
    check-cast p0, Ll/ܿۡ֫;

    .line 41
    invoke-direct {v0, v1, p0}, Ll/᩸ۢ֫;-><init>(Ll/۠ۢ֫;Ll/ܿۡ֫;)V

    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    .line 47
    new-instance v0, Ll/᩸ۢ֫;

    check-cast p0, Ll/۠ۢ֫;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩸ۢ֫;-><init>(Ll/۠ۢ֫;Ll/ܿۡ֫;)V

    return-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 50
    check-cast p0, Ll/ܿۡ֫;

    return-object p0

    .line 52
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 53
    invoke-static {v0}, Ll/ܺۡ֫;->֫(Ljava/lang/Class;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    .line 55
    sget-object v1, Ll/ܺۡ֫;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    .line 58
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 57
    invoke-static {v0, p0}, Ll/ܺۡ֫;->֫(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/᩶ۢ֫;

    move-result-object p0

    .line 60
    new-instance v0, Ll/֡ܺ֫;

    invoke-direct {v0, p0}, Ll/֡ܺ֫;-><init>(Ll/᩶ۢ֫;)V

    return-object v0

    .line 62
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [Ll/᩶ۢ֫;

    :goto_0
    if-ge v2, v1, :cond_4

    .line 63
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Constructor;

    invoke-static {v4, p0}, Ll/ܺۡ֫;->֫(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/᩶ۢ֫;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 65
    :cond_4
    new-instance p0, Ll/֨ۢ֫;

    invoke-direct {p0, v3}, Ll/֨ۢ֫;-><init>([Ll/᩶ۢ֫;)V

    return-object p0

    .line 67
    :cond_5
    new-instance v0, Ll/۬ۡ֫;

    invoke-direct {v0, p0}, Ll/۬ۡ֫;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/᩶ۢ֫;
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "{\n            constructo\u2026tance(`object`)\n        }"

    .line 74
    invoke-static {p0, p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll/᩶ۢ֫;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 81
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 79
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p0

    .line 77
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
