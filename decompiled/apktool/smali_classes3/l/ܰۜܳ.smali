.class public final Ll/ܰۜܳ;
.super Ljava/lang/Object;
.source "969A"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܰۜܳ;->֫:Ljava/util/HashMap;

    .line 98
    new-instance v1, Ll/ۙۢۡ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۙۢۡ;-><init>(I)V

    const-string v2, "local"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    new-instance v1, Ll/۟᩵ܿ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/۟᩵ܿ;-><init>(I)V

    const-string v2, "zip"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    new-instance v1, Ll/ۛۜܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۛۜܳ;-><init>(I)V

    const-string v2, "tar"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    new-instance v1, Ll/ܳۢۘ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܳۢۘ;-><init>(I)V

    const-string v2, "compress"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    new-instance v1, Ll/ۨۜܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۨۜܳ;-><init>(I)V

    const-string v2, "archive"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    new-instance v1, Ll/ۜ֡ܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۜ֡ܿ;-><init>(I)V

    const-string v2, "net"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    new-instance v1, Ll/᩷֡ܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩷֡ܿ;-><init>(I)V

    const-string v2, "payload"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    new-instance v1, Ll/᩺ۜܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩺ۜܳ;-><init>(I)V

    const-string v2, "trash"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ܽ᩷ܳ;
    .locals 2

    .line 116
    sget-object v0, Ll/ܰۜܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Function;

    if-eqz v0, :cond_0

    .line 119
    invoke-interface {v0, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܽ᩷ܳ;

    return-object p0

    .line 118
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    .line 109
    sget-object v0, Ll/ܰۜܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    invoke-static {p0}, Ll/ۨܺܳ;->֫(Ljava/lang/String;)V

    return-void

    .line 110
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Type has not been registered in FileVisitor.Generator: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
