.class public Ll/ܿ۟ܳ;
.super Ll/ܽ۟ܳ;
.source "V7BK"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ll/ܽ۟ܳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 102
    iget-object p1, p0, Ll/ܽ۟ܳ;->۟֫:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 103
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 104
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 105
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method
