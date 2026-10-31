.class public Ll/᩹ۖۢ;
.super Ll/᩸ۘۢ;
.source "U5DO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 11
    iput-object p2, p0, Ll/᩹ۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 16
    iget-object v0, p0, Ll/᩹ۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v1, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "550 Invalid name or chroot violation\r\n"

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "550 Can\'t DELE a directory\r\n"

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "450 Error deleting file\r\n"

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_3

    .line 26
    invoke-virtual {v1, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v2, "250 File successfully deleted\r\n"

    .line 28
    invoke-virtual {v1, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 29
    sget v1, Ll/ܳۤܳ;->֫:I

    .line 225
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method
