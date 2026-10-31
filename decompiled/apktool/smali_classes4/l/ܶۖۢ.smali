.class public Ll/ܶۖۢ;
.super Ll/᩸ۘۢ;
.source "X5RH"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 16
    iget-object v0, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v0}, Ll/᩶ۘۢ;->ۢ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "550 Current dir cannot find parent\r\n"

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v1}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "550 Invalid name or chroot violation\r\n"

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v1, "550 Can\'t CWD to invalid directory\r\n"

    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 30
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ۧ(Ll/ܶ᩵ܿ;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    const-string v1, "550 That path is inaccessible\r\n"

    :goto_0
    if-eqz v1, :cond_4

    .line 36
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v1, "200 CDUP successful\r\n"

    .line 38
    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
