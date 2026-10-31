.class public final synthetic Ll/ۨ᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩺᩸ۢ;

.field public final synthetic ᩹:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Ll/᩺᩸ۢ;Landroid/os/IBinder;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩸ۢ;->᩸:Ll/᩺᩸ۢ;

    iput-object p2, p0, Ll/ۨ᩸ۢ;->᩹:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 355
    iget-object v0, p0, Ll/ۨ᩸ۢ;->᩸:Ll/᩺᩸ۢ;

    iget-object v0, v0, Ll/᩺᩸ۢ;->᩸:Ll/۟᩸ۢ;

    iget-object v1, p0, Ll/ۨ᩸ۢ;->᩹:Landroid/os/IBinder;

    check-cast v1, Ll/ۨ᩹ۢ;

    invoke-static {v0, v1}, Ll/۟᩸ۢ;->֫(Ll/۟᩸ۢ;Ll/ۨ᩹ۢ;)V

    .line 356
    invoke-static {v0}, Ll/۟᩸ۢ;->ܺ(Ll/۟᩸ۢ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    .line 357
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 359
    :cond_0
    invoke-static {v0}, Ll/۟᩸ۢ;->ܺ(Ll/۟᩸ۢ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
