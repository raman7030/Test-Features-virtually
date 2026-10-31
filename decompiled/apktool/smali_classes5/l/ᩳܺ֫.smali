.class public final Ll/ᩳܺ֫;
.super Ljava/lang/Object;
.source "Q1H1"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ۧܺ֫;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۧܺ֫;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ᩳܺ֫;->᩶:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Ll/ᩳܺ֫;->᩸:Ll/ۧܺ֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧܺ֫;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ᩳܺ֫;->᩸:Ll/ۧܺ֫;

    return-object v0
.end method

.method public final ֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V
    .locals 1

    const-string v0, "registry"

    .line 5
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-boolean v0, p0, Ll/ᩳܺ֫;->᩹:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ll/ᩳܺ֫;->᩹:Z

    .line 31
    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 32
    iget-object p1, p0, Ll/ᩳܺ֫;->᩸:Ll/ۧܺ֫;

    invoke-virtual {p1}, Ll/ۧܺ֫;->֫()Ll/۠۫ۧ;

    move-result-object p1

    iget-object v0, p0, Ll/ᩳܺ֫;->᩶:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;Ll/۠۫ۧ;)V

    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 36
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    .line 37
    iput-boolean p2, p0, Ll/ᩳܺ֫;->᩹:Z

    .line 38
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Ll/ᩳܺ֫;->᩹:Z

    return v0
.end method
