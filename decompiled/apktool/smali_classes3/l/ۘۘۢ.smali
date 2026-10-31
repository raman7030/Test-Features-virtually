.class public Ll/ۘۘۢ;
.super Ll/᩸ۘۢ;
.source "469D"


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 10
    iput-object p2, p0, Ll/ۘۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 16
    iget-object v0, p0, Ll/ۘۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 20
    iget-object v1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v1}, Ll/᩶ۘۢ;->ۢ()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 21
    sget-object v3, Ll/ܶ᩵ܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_0

    const-string v0, "550 No directory traversal allowed in SIZE param\r\n"

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "550 SIZE target violates chroot\r\n"

    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v0, "550 Cannot get the SIZE of nonexistent object\r\n"

    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v0, "550 Cannot get the size of a non-file\r\n"

    goto :goto_0

    .line 40
    :cond_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    .line 43
    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 45
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "213 "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
