.class public final synthetic Ll/ܽۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 478
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const p1, 0x7f12009e

    .line 479
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method
