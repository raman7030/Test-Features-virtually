.class public final synthetic Ll/۠۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ۨ᩵ᩳ;

.field public final synthetic ᩶:Ll/ܶ᩺ᩳ;

.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;Ll/ܶ᩺ᩳ;Ll/ۨ᩵ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/۠۠ᩳ;->᩹:Ll/۫ۨᩳ;

    iput-object p3, p0, Ll/۠۠ᩳ;->᩶:Ll/ܶ᩺ᩳ;

    iput-object p4, p0, Ll/۠۠ᩳ;->ۙ:Ll/ۨ᩵ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1707
    iget-object v0, p0, Ll/۠۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iget-boolean v1, v0, Ll/᩹ܶᩳ;->۬֫:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/۠۠ᩳ;->᩹:Ll/۫ۨᩳ;

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    iget-object v1, p0, Ll/۠۠ᩳ;->᩶:Ll/ܶ᩺ᩳ;

    if-ne v0, v1, :cond_0

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/۠۠ᩳ;->ۙ:Ll/ۨ᩵ᩳ;

    iget-object v1, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    if-ne v0, v1, :cond_0

    return-void

    .line 1708
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Fragment changed before its restored view was ready"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
