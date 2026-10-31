.class public Ll/ܺۘۢ;
.super Ll/᩸ۘۢ;
.source "Q64Y"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 18
    iput-object p2, p0, Ll/ܺۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 26
    iget-object v0, p0, Ll/ܺۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v1, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v0, "550 Invalid name or chroot violation\r\n"

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1}, Ll/᩶ۘۢ;->ܳ()Ll/ܶ᩵ܿ;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v0, "550 Rename error, maybe RNFR not sent\r\n"

    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "550 Error during rename operation\r\n"

    goto :goto_0

    :cond_2
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_3

    .line 41
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v0, "250 rename successful\r\n"

    .line 43
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 45
    :goto_1
    invoke-virtual {v1, v3}, Ll/᩶ۘۢ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method
