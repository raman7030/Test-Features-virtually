.class public Ll/ܽۘۢ;
.super Ll/᩸ۘۢ;
.source "C55Y"

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
    .locals 5

    .line 15
    iget-object v0, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v0}, Ll/᩶ۘۢ;->ۘ()I

    move-result v1

    const-string v2, "502 Couldn\'t open a port\r\n"

    if-nez v1, :cond_0

    .line 17
    invoke-virtual {v0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۘۢ;->ܽ()Ljava/net/InetAddress;

    move-result-object v3

    if-nez v3, :cond_1

    .line 22
    invoke-virtual {v0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v4, 0x1

    if-ge v1, v4, :cond_2

    .line 26
    invoke-virtual {v0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 29
    :cond_2
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const/16 v3, 0x2e

    const/16 v4, 0x2c

    .line 31
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    :cond_3
    const-string v3, "227 Entering Passive Mode ("

    const-string v4, ","

    .line 0
    invoke-static {v3, v2, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 34
    div-int/lit16 v3, v1, 0x100

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    rem-int/lit16 v1, v1, 0x100

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ").\r\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
