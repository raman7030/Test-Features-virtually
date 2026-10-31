.class public final synthetic Ll/۠᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩺ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩺ۜ;->᩸:Ll/ܶ᩺ۜ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/۠᩺ۜ;->᩸:Ll/ܶ᩺ۜ;

    .line 1096
    iget-boolean v1, v0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->ܳ(Ll/᩶᩺ۜ;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v1}, Ll/᩶᩺ۜ;->᩷(Ll/᩶᩺ۜ;)Ll/ܶ᩺ۜ;

    move-result-object v1

    if-ne v1, v0, :cond_0

    iget-object v0, v0, Ll/ܶ᩺ۜ;->ۨ:Ll/᩶᩺ۜ;

    invoke-static {v0}, Ll/᩶᩺ۜ;->֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
