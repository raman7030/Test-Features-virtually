.class public final synthetic Ll/ۚۘᩳ;
.super Ljava/lang/Object;
.source "G6SF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟᩺ᩳ;

.field public final synthetic ᩹:Ll/ۗ᩻᩵;


# direct methods
.method public synthetic constructor <init>(Ll/۟᩺ᩳ;Ll/ۗ᩻᩵;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۘᩳ;->᩸:Ll/۟᩺ᩳ;

    iput-object p2, p0, Ll/ۚۘᩳ;->᩹:Ll/ۗ᩻᩵;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۚۘᩳ;->᩸:Ll/۟᩺ᩳ;

    .line 4
    iget-object v1, p0, Ll/ۚۘᩳ;->᩹:Ll/ۗ᩻᩵;

    .line 88
    :try_start_0
    invoke-interface {v0}, Ll/۟᩺ᩳ;->᩹֫()V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 89
    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
