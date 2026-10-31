.class public final Ll/ۡܳ᩻;
.super Ll/۟ܶۡ;
.source "OAHZ"


# instance fields
.field public final synthetic ܳ:Ll/ܺܳ᩻;

.field public final synthetic ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܺܳ᩻;Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iput-object p2, p0, Ll/ۡܳ᩻;->᩻:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 135
    iget-object v0, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iget-object v1, v0, Ll/ܺܳ᩻;->ᩳ֫:Ll/ۖۢܳ;

    iget-object v2, p0, Ll/ۡܳ᩻;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۖۢܳ;->ܽ(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 141
    iget-object v0, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iget-object v0, v0, Ll/ܺܳ᩻;->ᩳ֫:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 117
    iget-object v0, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iget-object v0, v0, Ll/ܺܳ᩻;->ᩳ֫:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f12088f

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 122
    iget-object v0, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iget-object v1, v0, Ll/ܺܳ᩻;->ܿ֫:Ll/ۗۢ᩻;

    iget-object v2, v0, Ll/ܺܳ᩻;->֫֫:Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 123
    invoke-interface {v2}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/ۡܳ᩻;->᩻:Ljava/lang/String;

    invoke-static {v4, v5}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 124
    iget-boolean v6, v0, Ll/ܺܳ᩻;->ۧ֫:Z

    if-eqz v6, :cond_0

    iget-object v0, v0, Ll/ܺܳ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-interface {v2}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ".tmp"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-virtual {v1, v3, v0}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {v1, v0, v4}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 129
    :cond_0
    invoke-virtual {v1, v3, v4}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 146
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 147
    iget-object v0, p0, Ll/ۡܳ᩻;->ܳ:Ll/ܺܳ᩻;

    iget-object v0, v0, Ll/ܺܳ᩻;->ܿ֫:Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
