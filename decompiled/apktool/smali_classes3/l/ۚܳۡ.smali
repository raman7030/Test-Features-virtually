.class public final Ll/ۚܳۡ;
.super Ll/ܿ᩻ۡ;
.source "61JB"


# instance fields
.field public ۗ:Landroid/widget/ImageView;

.field public ۙ:Landroid/view/View;

.field public ۬:Landroid/widget/TextView;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 29
    iget-object v0, p0, Ll/ܿ᩻ۡ;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {v0, p1}, Ll/ܰܳۡ;->ۧ(Ll/۟ܳۡ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 31
    invoke-virtual {v0, p0}, Ll/ܰܳۡ;->֫(Ll/ۚܳۡ;)V

    return-void

    .line 33
    :cond_0
    sget-object v1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {v1}, Ll/ۡۤۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 34
    iget-object v1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {v0, p1, v1, p0}, Ll/ܰܳۡ;->֫(Landroid/view/View;Ll/۟ܳۡ;Ll/ۚܳۡ;)V

    :cond_1
    return-void
.end method
