.class public final Ll/᩵ۢۡ;
.super Ljava/lang/Object;
.source "21RX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/۠ۢۡ;

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۠ۢۡ;)V
    .locals 0

    .line 402
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۢۡ;->᩶:Ll/۠ۢۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 408
    iget-boolean v0, p0, Ll/᩵ۢۡ;->᩸:Z

    iget-object v1, p0, Ll/᩵ۢۡ;->᩶:Ll/۠ۢۡ;

    invoke-virtual {v1}, Landroid/view/View;->isPressed()Z

    move-result v2

    if-ne v0, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩵ۢۡ;->᩹:I

    .line 409
    invoke-static {v1}, Ll/۠ۢۡ;->ۧ(Ll/۠ۢۡ;)I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 410
    invoke-virtual {v1}, Landroid/view/View;->performLongClick()Z

    .line 411
    invoke-static {v1}, Ll/۠ۢۡ;->֫(Ll/۠ۢۡ;)V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 420
    iget-object v0, p0, Ll/᩵ۢۡ;->᩶:Ll/۠ۢۡ;

    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩵ۢۡ;->᩸:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 416
    iget-object v0, p0, Ll/᩵ۢۡ;->᩶:Ll/۠ۢۡ;

    invoke-static {v0}, Ll/۠ۢۡ;->ܽ(Ll/۠ۢۡ;)I

    move-result v0

    iput v0, p0, Ll/᩵ۢۡ;->᩹:I

    return-void
.end method
