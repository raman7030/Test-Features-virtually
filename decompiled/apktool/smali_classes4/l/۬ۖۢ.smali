.class public Ll/۬ۖۢ;
.super Ll/᩸ۘۢ;
.source "PALD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 13
    iput-object p2, p0, Ll/۬ۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 18
    iget-object v0, p0, Ll/۬ۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v1, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "550 Invalid name or chroot violation\r\n"

    .line 20
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 21
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 22
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "213 "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Ll/ۗۘۢ;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "550 file does not exist\r\n"

    .line 26
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
