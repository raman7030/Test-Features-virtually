.class public final Ll/ۘۧᩳ;
.super Ll/۟ܶۡ;
.source "56B1"


# instance fields
.field public final synthetic ܳ:Ll/ۚۧᩳ;


# direct methods
.method public constructor <init>(Ll/ۚۧᩳ;)V
    .locals 0

    .line 218
    iput-object p1, p0, Ll/ۘۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ۘۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ۢ(Ll/ۚۧᩳ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ۘۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 227
    :goto_0
    iget-object v0, p0, Ll/ۘۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ᩳ(Ll/ۚۧᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x14

    .line 228
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 244
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
