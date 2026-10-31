.class public final Ll/ۗۨ;
.super Ljava/lang/Object;
.source "95QI"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public ֫:Ll/᩸ܰ;

.field public final synthetic ۧ:Ll/ܽۨ;

.field public final synthetic ܽ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ܽۨ;)V
    .locals 0

    .line 5214
    iput-object p1, p0, Ll/ۗۨ;->ܽ:Landroid/view/View;

    iput-object p2, p0, Ll/ۗۨ;->ۧ:Ll/ܽۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 5215
    iput-object p1, p0, Ll/ۗۨ;->֫:Ll/᩸ܰ;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    .line 5220
    invoke-static {p1, p2}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    .line 5222
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, Ll/ۗۨ;->ۧ:Ll/ܽۨ;

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    .line 5223
    iget-object v4, p0, Ll/ۗۨ;->ܽ:Landroid/view/View;

    invoke-static {p2, v4}, Ll/۬ۨ;->֫(Landroid/view/WindowInsets;Landroid/view/View;)V

    .line 5225
    iget-object p2, p0, Ll/ۗۨ;->֫:Ll/᩸ܰ;

    invoke-virtual {v0, p2}, Ll/᩸ܰ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5227
    invoke-interface {v2, p1, v0}, Ll/ܽۨ;->onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    .line 5228
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    .line 5231
    :cond_0
    iput-object v0, p0, Ll/ۗۨ;->֫:Ll/᩸ܰ;

    .line 5232
    invoke-interface {v2, p1, v0}, Ll/ܽۨ;->onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p2

    if-lt v1, v3, :cond_1

    .line 5235
    invoke-virtual {p2}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    .line 5242
    :cond_1
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2804
    invoke-static {p1}, Ll/ۙۨ;->֫(Landroid/view/View;)V

    .line 5246
    invoke-virtual {p2}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
