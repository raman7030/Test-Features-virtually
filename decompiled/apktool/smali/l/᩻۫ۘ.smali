.class public abstract Ll/᩻۫ۘ;
.super Ljava/lang/Object;
.source "T90P"


# static fields
.field public static final ֫:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    :try_start_0
    const-class v0, Ll/ۤ֡֡;

    const-string v1, "\u05ab"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 42
    :catchall_0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 45
    :goto_0
    sput-object v0, Ll/᩻۫ۘ;->֫:Ljava/util/Map;

    return-void
.end method

.method public static ֫(Ljava/lang/String;[I)I
    .locals 4

    .line 18
    sget-object v0, Ll/᩻۫ۘ;->֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    aput p0, p1, v0

    return v1

    .line 24
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    aput v3, p1, v0

    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    aput p0, p1, v2

    return v1

    :cond_1
    return v0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 14
    sget-object v0, Ll/᩻۫ۘ;->֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
