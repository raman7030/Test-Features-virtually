.class public final synthetic Ll/ܿ᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩹ۜ;->᩸:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 205
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 207
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v1, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 208
    sget-object v1, Ll/᩷᩶ۜ;->ۖ:Ll/ۚۡ֫;

    invoke-virtual {v1}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 209
    instance-of v2, v1, Ll/֨᩸ۜ;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    check-cast v1, Ll/֨᩸ۜ;

    .line 210
    iget-object v2, p0, Ll/ܿ᩹ۜ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    sget-object v4, Ll/᩷᩶ۜ;->ۚ:Ll/ۚۡ֫;

    invoke-virtual {v4}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const v4, 0x7f12036b

    .line 211
    invoke-virtual {v2, v4}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v4, Ll/ܶ᩹ۜ;

    invoke-direct {v4, v0, v1, p1}, Ll/ܶ᩹ۜ;-><init>(Ll/ۢۘܳ;Ll/֨᩸ۜ;Lbin/mt/plus/Main;)V

    const p1, 0x7f12070a

    .line 212
    invoke-virtual {v2, p1, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 225
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 226
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v3

    .line 228
    :cond_0
    instance-of p1, v1, Ll/ۚ᩸ۜ;

    if-nez p1, :cond_1

    const p1, 0x7f1206ea

    .line 229
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v3

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
