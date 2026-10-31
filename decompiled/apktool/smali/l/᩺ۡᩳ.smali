.class public final synthetic Ll/᩺ۡᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ll/ۢܺᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۜܺᩳ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۡᩳ;->֫:Ll/ۜܺᩳ;

    iput-object p2, p0, Ll/᩺ۡᩳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩺ۡᩳ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 861
    iget-object v0, p0, Ll/᩺ۡᩳ;->֫:Ll/ۜܺᩳ;

    iget-object v0, v0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;)Ll/ۨۢᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ۡᩳ;->ۧ:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 862
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    iget-object v6, p0, Ll/᩺ۡᩳ;->ܽ:Ljava/lang/String;

    if-ge v5, v3, :cond_3

    aget-object v7, v0, v5

    .line 863
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 864
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    const-class v9, [C

    if-ne v8, v9, :cond_2

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 865
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v0, 0x0

    .line 866
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    if-nez v1, :cond_0

    return-object v0

    .line 869
    :cond_0
    array-length v0, v1

    new-array v0, v0, [I

    .line 870
    :goto_1
    array-length v2, v1

    if-ge v4, v2, :cond_1

    .line 871
    aget-char v2, v1, v4

    aput v2, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 877
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    const-string v2, "."

    const-string v3, " not found"

    const-string v4, "Field "

    .line 0
    invoke-static {v4, v1, v2, v6, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 877
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
