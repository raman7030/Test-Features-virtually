.class public final Ll/ۨܿۖ;
.super Ll/۠ᩳۖ;
.source "47S6"


# static fields
.field public static final ᩳ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ll/ۛܿۖ;

    invoke-direct {v0}, Ll/ۛܿۖ;-><init>()V

    sput-object v0, Ll/ۨܿۖ;->ᩳ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 10

    .line 57
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۨܿۖ;->ۧ:Ljava/util/HashMap;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۨܿۖ;->ܽ:Ljava/util/HashMap;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۨܿۖ;->֫:Ljava/util/HashMap;

    .line 61
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    .line 63
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p1, v1

    .line 65
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v4, v2, 0x1

    .line 66
    aput-object v3, p1, v2

    move v2, v4

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 72
    :cond_1
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/reflect/Field;

    const/4 v0, 0x1

    .line 74
    invoke-static {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 76
    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    const/4 v3, 0x0

    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Enum;

    .line 79
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    .line 80
    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v5

    .line 82
    const-class v6, Ll/᩹ᩳۖ;

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Ll/᩹ᩳۖ;

    if-eqz v2, :cond_2

    .line 84
    invoke-interface {v2}, Ll/᩹ᩳۖ;->value()Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-interface {v2}, Ll/᩹ᩳۖ;->alternate()[Ljava/lang/String;

    move-result-object v2

    array-length v6, v2

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_2

    aget-object v8, v2, v7

    .line 86
    iget-object v9, p0, Ll/ۨܿۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v9, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 89
    :cond_2
    iget-object v2, p0, Ll/ۨܿۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v2, p0, Ll/ۨܿۖ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    iget-object v2, p0, Ll/ۨܿۖ;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void

    :catch_0
    move-exception p1

    .line 96
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 2

    .line 102
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 103
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 106
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p1

    .line 107
    iget-object v0, p0, Ll/ۨܿۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-nez v0, :cond_1

    .line 109
    iget-object v0, p0, Ll/ۨܿۖ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Enum;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 1

    .line 35
    check-cast p2, Ljava/lang/Enum;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Ll/ۨܿۖ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void
.end method
