.class public Ll/֡ۘۢ;
.super Ll/᩸ۘۢ;
.source "C52M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 8
    iput-object p2, p0, Ll/֡ۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 14
    iget-object v0, p0, Ll/֡ۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "I"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-nez v1, :cond_3

    const-string v1, "L 8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "A"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "A N"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "503 Malformed TYPE command\r\n"

    goto :goto_2

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ۧ(Z)V

    const-string v0, "200 ASCII type set\r\n"

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 17
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ۧ(Z)V

    const-string v0, "200 Binary type set\r\n"

    .line 24
    :goto_2
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
