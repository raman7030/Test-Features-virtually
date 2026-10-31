.class public final Ll/᩸۫ۧ;
.super Ljava/lang/Object;
.source "H20Z"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/᩹۫ۧ;

.field public final ܽ:Ll/ܶ۫ۧ;


# direct methods
.method public constructor <init>(Ll/᩹۫ۧ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۫ۧ;->ۧ:Ll/᩹۫ۧ;

    .line 33
    new-instance p1, Ll/ܶ۫ۧ;

    invoke-direct {p1}, Ll/ܶ۫ۧ;-><init>()V

    iput-object p1, p0, Ll/᩸۫ۧ;->ܽ:Ll/ܶ۫ۧ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܶ۫ۧ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩸۫ۧ;->ܽ:Ll/ܶ۫ۧ;

    return-object v0
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 3

    .line 62
    iget-boolean v0, p0, Ll/᩸۫ۧ;->֫:Z

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/᩸۫ۧ;->ۧ()V

    .line 65
    :cond_0
    iget-object v0, p0, Ll/᩸۫ۧ;->ۧ:Ll/᩹۫ۧ;

    invoke-interface {v0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v1, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 69
    iget-object v0, p0, Ll/᩸۫ۧ;->ܽ:Ll/ܶ۫ۧ;

    invoke-virtual {v0, p1}, Ll/ܶ۫ۧ;->֫(Landroid/os/Bundle;)V

    return-void

    .line 67
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "performRestore cannot be called when owner is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()V
    .locals 4

    .line 44
    iget-object v0, p0, Ll/᩸۫ۧ;->ۧ:Ll/᩹۫ۧ;

    invoke-interface {v0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    if-ne v2, v3, :cond_0

    .line 48
    new-instance v2, Ll/ۚ۫ۧ;

    invoke-direct {v2, v0}, Ll/ۚ۫ۧ;-><init>(Ll/᩹۫ۧ;)V

    invoke-virtual {v1, v2}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 49
    iget-object v0, p0, Ll/᩸۫ۧ;->ܽ:Ll/ܶ۫ۧ;

    invoke-virtual {v0, v1}, Ll/ܶ۫ۧ;->֫(Ll/۟ۢ֫;)V

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Ll/᩸۫ۧ;->֫:Z

    return-void

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Ll/᩸۫ۧ;->ܽ:Ll/ܶ۫ۧ;

    invoke-virtual {v0, p1}, Ll/ܶ۫ۧ;->ۧ(Landroid/os/Bundle;)V

    return-void
.end method
