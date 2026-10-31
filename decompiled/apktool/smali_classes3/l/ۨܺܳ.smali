.class public final Ll/ۨܺܳ;
.super Ljava/lang/Object;
.source "PAJ1"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۨܺܳ;->֫:Ljava/util/HashMap;

    .line 46
    new-instance v1, Ll/ۛۚۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۛۚۢ;-><init>(I)V

    const-string v2, "local"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    new-instance v1, Ll/ۧ᩵᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ۧ᩵᩷;-><init>(I)V

    const-string v2, "zip"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    new-instance v1, Ll/ܶᩴᩳ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ܶᩴᩳ;-><init>(I)V

    const-string v2, "tar"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    new-instance v1, Ll/۠ۗ᩻;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/۠ۗ᩻;-><init>(I)V

    const-string v2, "compress"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    new-instance v1, Ll/ۛܺܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۛܺܳ;-><init>(I)V

    const-string v2, "archive"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    new-instance v1, Ll/᩻ۛ᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/᩻ۛ᩷;-><init>(I)V

    const-string v2, "net"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    new-instance v1, Ll/᩺ᩳ֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩺ᩳ֨;-><init>(I)V

    const-string v2, "payload"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    new-instance v1, Ll/ᩴܺܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ᩴܺܿ;-><init>(I)V

    const-string v2, "trash"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫([BZ)Ll/ܰܺܳ;
    .locals 2

    .line 67
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 68
    sget-object p0, Ll/ۨܺܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/function/Function;

    if-eqz p0, :cond_1

    .line 72
    invoke-interface {p0, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰܺܳ;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 74
    iput-boolean p1, p0, Ll/ܰܺܳ;->᩸:Z

    :cond_0
    return-object p0

    .line 70
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    .line 57
    sget-object v0, Ll/ۨܺܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 58
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Type has not been registered in StatelessVisitor.Generator: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
