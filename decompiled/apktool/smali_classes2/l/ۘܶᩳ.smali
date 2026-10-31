.class public final Ll/ۘܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"


# instance fields
.field public ֫:Ll/ۡܶᩳ;

.field public final synthetic ۖ:Ll/᩹ܶᩳ;

.field public final ۘ:Ll/۫ۨᩳ;

.field public final ۜ:Ll/᩺ܶᩳ;

.field public ۡ:Z

.field public final ۢ:Ljava/lang/String;

.field public ۧ:Ll/ۗ᩻᩵;

.field public final ܳ:Ll/ۢۘᩳ;

.field public final ܺ:Ll/ۚۚᩳ;

.field public final ܽ:Ll/ۗ᩻᩵;

.field public final ܿ:Ll/ܺܶᩳ;

.field public ᩳ:Ll/ۗ᩻᩵;

.field public ᩷:Ll/۟᩺ᩳ;

.field public ᩻:Ll/᩵᩵ᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/᩺ܶᩳ;)V
    .locals 4

    .line 2226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܶᩳ;->ۖ:Ll/᩹ܶᩳ;

    .line 2212
    iget-object v0, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iput-object v0, p0, Ll/ۘܶᩳ;->ۘ:Ll/۫ۨᩳ;

    .line 2213
    iget-object v1, p1, Ll/֫ۘᩳ;->᩹:Ll/ۢۘᩳ;

    iput-object v1, p0, Ll/ۘܶᩳ;->ܳ:Ll/ۢۘᩳ;

    .line 2214
    invoke-virtual {p1}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v2

    .line 63
    iget-object v2, v2, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 2214
    iput-object v2, p0, Ll/ۘܶᩳ;->ۢ:Ljava/lang/String;

    .line 2216
    new-instance v2, Ll/ۗ᩻᩵;

    invoke-direct {v2}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v2, p0, Ll/ۘܶᩳ;->ܽ:Ll/ۗ᩻᩵;

    .line 2217
    new-instance v2, Ll/ۚۚᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/ۚۚᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Ll/ۘܶᩳ;->ܺ:Ll/ۚۚᩳ;

    .line 2218
    new-instance v2, Ll/ܺܶᩳ;

    invoke-direct {v2, p0}, Ll/ܺܶᩳ;-><init>(Ll/ۘܶᩳ;)V

    iput-object v2, p0, Ll/ۘܶᩳ;->ܿ:Ll/ܺܶᩳ;

    .line 2227
    iput-object p2, p0, Ll/ۘܶᩳ;->ۜ:Ll/᩺ܶᩳ;

    .line 2228
    invoke-static {p1}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object p2

    const/4 v2, 0x0

    if-nez p2, :cond_2

    invoke-static {p1}, Ll/᩹ܶᩳ;->ۜ(Ll/᩹ܶᩳ;)Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۢۘᩳ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    .line 2229
    :cond_1
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    :cond_2
    :goto_0
    iput-object v2, p0, Ll/ۘܶᩳ;->᩷:Ll/۟᩺ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 2305
    iget-object v0, p0, Ll/ۘܶᩳ;->ۧ:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 2306
    :cond_0
    iget-object v0, p0, Ll/ۘܶᩳ;->ᩳ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 2307
    :cond_1
    iget-object v0, p0, Ll/ۘܶᩳ;->ۘ:Ll/۫ۨᩳ;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/ۘܶᩳ;->ܺ:Ll/ۚۚᩳ;

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ۧ(Ll/ۚۚᩳ;)V

    .line 2308
    :cond_2
    iget-object v0, p0, Ll/ۘܶᩳ;->ܳ:Ll/ۢۘᩳ;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ll/ۘܶᩳ;->ܿ:Ll/ܺܶᩳ;

    invoke-virtual {v0, v1}, Ll/ۢۘᩳ;->ۧ(Ll/ܺܶᩳ;)V

    .line 2309
    :cond_3
    iget-object v0, p0, Ll/ۘܶᩳ;->ۖ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܽ(Ll/᩹ܶᩳ;)Ll/ۘܶᩳ;

    move-result-object v1

    if-ne v1, p0, :cond_4

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ll/ۘܶᩳ;)V

    :cond_4
    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 2

    .line 2298
    iget-object v0, p0, Ll/ۘܶᩳ;->ܽ:Ll/ۗ᩻᩵;

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2299
    :cond_0
    invoke-virtual {p0}, Ll/ۘܶᩳ;->֫()V

    .line 2300
    invoke-virtual {v0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 2244
    iget-boolean v0, p0, Ll/ۘܶᩳ;->ۡ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۘܶᩳ;->ܽ:Ll/ۗ᩻᩵;

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2245
    iput-boolean v0, p0, Ll/ۘܶᩳ;->ۡ:Z

    .line 2246
    new-instance v0, Ll/ܿᩴᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ܿᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
