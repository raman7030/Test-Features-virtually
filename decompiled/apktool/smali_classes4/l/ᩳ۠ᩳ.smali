.class public final synthetic Ll/ᩳ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/᩹ܶᩳ;

.field public final synthetic ۧ:Ll/᩺ܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/᩺ܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ۠ᩳ;->֫:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ᩳ۠ᩳ;->ۧ:Ll/᩺ܶᩳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ᩳ۠ᩳ;->֫:Ll/᩹ܶᩳ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2187
    new-instance v1, Ll/ۘܶᩳ;

    iget-object v2, p0, Ll/ᩳ۠ᩳ;->ۧ:Ll/᩺ܶᩳ;

    invoke-direct {v1, v0, v2}, Ll/ۘܶᩳ;-><init>(Ll/᩹ܶᩳ;Ll/᩺ܶᩳ;)V

    .line 2233
    invoke-static {v0}, Ll/᩹ܶᩳ;->ܽ(Ll/᩹ܶᩳ;)Ll/ۘܶᩳ;

    move-result-object v2

    if-nez v2, :cond_4

    .line 2234
    invoke-static {v0, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ll/ۘܶᩳ;)V

    .line 2235
    iget-object v2, v1, Ll/ۘܶᩳ;->ۘ:Ll/۫ۨᩳ;

    if-eqz v2, :cond_0

    iget-object v3, v1, Ll/ۘܶᩳ;->ܺ:Ll/ۚۚᩳ;

    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->֫(Ll/ۚۚᩳ;)V

    .line 2236
    :cond_0
    iget-object v2, v1, Ll/ۘܶᩳ;->ܳ:Ll/ۢۘᩳ;

    if-eqz v2, :cond_1

    iget-object v3, v1, Ll/ۘܶᩳ;->ܿ:Ll/ܺܶᩳ;

    invoke-virtual {v2, v3}, Ll/ۢۘᩳ;->֫(Ll/ܺܶᩳ;)V

    .line 2237
    :cond_1
    invoke-static {v0}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v2

    .line 2287
    invoke-virtual {v2}, Ll/᩵ᩴᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object v2

    iput-object v2, v1, Ll/ۘܶᩳ;->ۧ:Ll/ۗ᩻᩵;

    .line 2288
    new-instance v3, Ll/ۖܶᩳ;

    invoke-direct {v3, v1}, Ll/ۖܶᩳ;-><init>(Ll/ۘܶᩳ;)V

    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 2238
    :cond_2
    invoke-static {v0}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v0

    .line 2292
    iput-object v0, v1, Ll/ۘܶᩳ;->᩻:Ll/᩵᩵ᩳ;

    .line 2293
    invoke-virtual {v0}, Ll/᩵᩵ᩳ;->ᩳ()Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, v1, Ll/ۘܶᩳ;->ᩳ:Ll/ۗ᩻᩵;

    .line 2294
    new-instance v2, Ll/ۜᩴᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/ۜᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 2239
    :cond_3
    invoke-virtual {v1}, Ll/ۘܶᩳ;->ۧ()V

    return-object v1

    .line 2233
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A save capture is already waiting"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
