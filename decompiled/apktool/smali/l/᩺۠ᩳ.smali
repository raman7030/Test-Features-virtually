.class public final Ll/᩺۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Lbin/mt/plugin/api/util/ResultCallback;


# instance fields
.field public final synthetic ֫:Ll/᩹ܶᩳ;

.field public final synthetic ۧ:Ll/۟᩺ᩳ;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ljava/lang/Runnable;

.field public final synthetic ᩳ:Ll/۫ۨᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    .line 2107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺۠ᩳ;->֫:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/᩺۠ᩳ;->ᩳ:Ll/۫ۨᩳ;

    iput-object p3, p0, Ll/᩺۠ᩳ;->ۧ:Ll/۟᩺ᩳ;

    iput-object p4, p0, Ll/᩺۠ᩳ;->ܽ:Ljava/lang/String;

    iput-object p5, p0, Ll/᩺۠ᩳ;->ܿ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onSuccess()V
    .locals 3

    .line 2110
    iget-object v0, p0, Ll/᩺۠ᩳ;->֫:Ll/᩹ܶᩳ;

    iget-object v1, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/᩺۠ᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-ne v1, v2, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/᩺۠ᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-ne v1, v2, :cond_1

    .line 2111
    :cond_0
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v1

    .line 63
    iget-object v1, v1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 2111
    iget-object v2, p0, Ll/᩺۠ᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/֫ۘᩳ;->᩷()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩺۠ᩳ;->ܿ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method
