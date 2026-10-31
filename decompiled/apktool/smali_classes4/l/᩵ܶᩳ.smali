.class public final synthetic Ll/᩵ܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܶܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܶᩳ;->֫:Ll/ܶܶᩳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 2382
    iget-object v0, p0, Ll/᩵ܶᩳ;->֫:Ll/ܶܶᩳ;

    iget-object v0, v0, Ll/ܶܶᩳ;->ۧ:Ll/᩹ܶᩳ;

    iget-boolean v1, v0, Ll/᩹ܶᩳ;->۬֫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    if-eqz v1, :cond_0

    new-instance v0, Ll/᩸ܶᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩸ܶᩳ;-><init>(ZLl/ᩴܶᩳ;)V

    return-object v0

    .line 2383
    :cond_0
    invoke-static {}, Ll/ᩳۚᩳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-static {v1, v4}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Ll/ۤۘᩳ;->ۧ(Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 2384
    invoke-static {v1}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v0, Ll/᩸ܶᩳ;

    invoke-direct {v0, v3, v2}, Ll/᩸ܶᩳ;-><init>(ZLl/ᩴܶᩳ;)V

    return-object v0

    .line 2385
    :cond_1
    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩳ(Ll/᩹ܶᩳ;)Ll/ᩴܶᩳ;

    move-result-object v4

    if-nez v4, :cond_4

    .line 2386
    invoke-static {v0}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩵ᩴᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object v2

    goto :goto_0

    .line 2387
    :cond_2
    invoke-static {v0}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۘ(Ll/᩹ܶᩳ;)Ll/᩵᩵ᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩵᩵ᩳ;->ᩳ()Ll/ۗ᩻᩵;

    move-result-object v2

    new-instance v4, Ll/ܿ֨ᩳ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v4}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v2

    goto :goto_0

    :cond_3
    invoke-static {v2}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v2

    .line 2388
    :goto_0
    new-instance v4, Ll/ᩴܶᩳ;

    invoke-direct {v4, v1, v2}, Ll/ᩴܶᩳ;-><init>(Ll/᩷۠ᩴ;Ll/ۗ᩻᩵;)V

    invoke-static {v0, v4}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ll/ᩴܶᩳ;)V

    .line 2389
    new-instance v1, Ll/᩸ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩳ(Ll/᩹ܶᩳ;)Ll/ᩴܶᩳ;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ll/᩸ܶᩳ;-><init>(ZLl/ᩴܶᩳ;)V

    return-object v1

    .line 2385
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Inactive session save is already running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
