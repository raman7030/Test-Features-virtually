.class public final Ll/ۧܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ۨ᩵᩷;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;)V
    .locals 0

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܶᩳ;->᩸:Ll/᩹ܶᩳ;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 3

    .line 204
    iget-object v0, p0, Ll/ۧܶᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩷(Ll/᩹ܶᩳ;)Lbin/mt/plugin/api/util/ResultCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 205
    invoke-static {v0}, Ll/᩹ܶᩳ;->᩷(Ll/᩹ܶᩳ;)Lbin/mt/plugin/api/util/ResultCallback;

    move-result-object v1

    const-string v2, "Operation cancelled"

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 206
    invoke-static {v0, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Lbin/mt/plugin/api/util/ResultCallback;)V

    :cond_0
    return-void
.end method

.method public final onGetPath(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    const-string v0, "exit"

    const/4 v1, 0x0

    .line 199
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iget-object v0, p0, Ll/ۧܶᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-virtual {v0, p2, p1}, Ll/᩹ܶᩳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method
