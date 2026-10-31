.class public abstract Ll/ܰܶᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/ܿ֨ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 68
    sget-object v0, Ll/۬۠ᩴ;->OWNER_READ:Ll/۬۠ᩴ;

    sget-object v1, Ll/۬۠ᩴ;->OWNER_WRITE:Ll/۬۠ᩴ;

    .line 69
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    .line 163
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 164
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬۠ᩴ;

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 169
    :cond_0
    new-instance v2, Ll/ܿ֨ᩴ;

    const/4 v4, 0x4

    invoke-direct {v2, v4, v3}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    .line 69
    sput-object v2, Ll/ܰܶᩴ;->a:Ll/ܿ֨ᩴ;

    .line 70
    sget-object v2, Ll/۬۠ᩴ;->OWNER_EXECUTE:Ll/۬۠ᩴ;

    .line 72
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    .line 163
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 164
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬۠ᩴ;

    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 169
    :cond_1
    new-instance v0, Ll/ܿ֨ᩴ;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    return-void
.end method
