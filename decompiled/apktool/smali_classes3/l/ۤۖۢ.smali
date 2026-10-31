.class public Ll/ۤۖۢ;
.super Ll/᩸ۘۢ;
.source "156M"

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
    iput-object p2, p0, Ll/ۤۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 16
    iget-object v0, p0, Ll/ۤۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-ge v1, v2, :cond_0

    const-string v0, "550 Invalid name\r\n"

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "550 Invalid name or chroot violation\r\n"

    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "550 Already exists\r\n"

    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "550 Error making directory (permissions?)\r\n"

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    .line 41
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v0, "250 Directory created\r\n"

    .line 43
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
