.class public final synthetic Ll/ۨۡᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ll/ۢܺᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۜܺᩳ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:[Ljava/lang/Class;

.field public final synthetic ᩳ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۡᩳ;->֫:Ll/ۜܺᩳ;

    iput-object p2, p0, Ll/ۨۡᩳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۨۡᩳ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/ۨۡᩳ;->ᩳ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۨۡᩳ;->ܿ:[Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 2
    iget-object v0, p0, Ll/ۨۡᩳ;->ܽ:Ljava/lang/String;

    .line 4
    iget-object v1, p0, Ll/ۨۡᩳ;->ᩳ:Ljava/lang/String;

    .line 6
    iget-object v2, p0, Ll/ۨۡᩳ;->ܿ:[Ljava/lang/Class;

    .line 695
    iget-object v3, p0, Ll/ۨۡᩳ;->֫:Ll/ۜܺᩳ;

    iget-object v3, v3, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {v3}, Ll/ܺܺᩳ;->ܿ(Ll/ܺܺᩳ;)Ljava/util/Map;

    move-result-object v4

    check-cast v4, Ll/ۧۤᩴ;

    iget-object v5, p0, Ll/ۨۡᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    if-nez v4, :cond_1

    .line 699
    :try_start_0
    invoke-static {v3}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;)Ll/ۨۢᩳ;

    move-result-object v4

    const/4 v6, 0x1

    invoke-static {v0, v6, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 700
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 701
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 702
    :cond_0
    invoke-static {v3}, Ll/ܺܺᩳ;->ܿ(Ll/ܺܺᩳ;)Ljava/util/Map;

    move-result-object v1

    check-cast v1, Ll/ۧۤᩴ;

    invoke-virtual {v1, v5, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 704
    invoke-static {v3, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    return-object v4
.end method
