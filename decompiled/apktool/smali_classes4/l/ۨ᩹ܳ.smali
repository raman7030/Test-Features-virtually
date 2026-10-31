.class public final Ll/ۨ᩹ܳ;
.super Ll/ܳܶܳ;
.source "164Z"


# instance fields
.field public final ۛ:Landroid/view/View;

.field public ۤ:Ll/᩵᩹ܳ;

.field public ۨ:Z

.field public final ᩺:Ll/ܽ᩶ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ܽ᩶ܳ;)V
    .locals 0

    .line 718
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    const p1, 0x7f0a0145

    .line 719
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩹ܳ;->ۛ:Landroid/view/View;

    .line 720
    iput-object p3, p0, Ll/ۨ᩹ܳ;->᩺:Ll/ܽ᩶ܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨ᩹ܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ᩹ܳ;->ۛ:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۨ᩹ܳ;Ll/᩵᩹ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۨ᩹ܳ;->ۤ:Ll/᩵᩹ܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 8

    .line 745
    iget-object p1, p0, Ll/ۨ᩹ܳ;->᩺:Ll/ܽ᩶ܳ;

    iget-object v0, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 748
    :cond_0
    iget-object v0, p0, Ll/ۨ᩹ܳ;->ۤ:Ll/᩵᩹ܳ;

    if-eqz v0, :cond_2

    invoke-static {v0}, Ll/᩵᩹ܳ;->֫(Ll/᩵᩹ܳ;)Ll/֫᩶ܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/֫᩶ܳ;->֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 751
    :cond_1
    iget-object v0, p0, Ll/ۨ᩹ܳ;->ۤ:Ll/᩵᩹ܳ;

    invoke-static {v0}, Ll/᩵᩹ܳ;->֫(Ll/᩵᩹ܳ;)Ll/֫᩶ܳ;

    move-result-object v3

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    .line 752
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ll/ܺ᩺ᩳ;

    const/4 v0, 0x1

    invoke-direct {v6, v0, p1}, Ll/ܺ᩺ᩳ;-><init>(ILjava/lang/Object;)V

    const/4 v7, 0x0

    .line 751
    iget-object v1, p0, Ll/ۨ᩹ܳ;->᩺:Ll/ܽ᩶ܳ;

    iget-object v2, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ll/ܽ᩶ܳ;->֫(Ll/ܽ᩶ܳ;Landroid/view/View;Ll/֫᩶ܳ;ZLl/֡ۚۢ;Ljava/lang/Runnable;Ll/᩹᩹ܳ;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Z
    .locals 1

    .line 730
    iget-boolean v0, p0, Ll/ۨ᩹ܳ;->ۨ:Z

    return v0
.end method

.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 735
    check-cast p1, Ll/ۨ᩹ܳ;

    .line 736
    iget-boolean v0, p1, Ll/ۨ᩹ܳ;->ۨ:Z

    if-eqz v0, :cond_0

    .line 737
    iget-object v0, p0, Ll/ۨ᩹ܳ;->᩺:Ll/ܽ᩶ܳ;

    invoke-static {v0, p0, p1}, Ll/ܽ᩶ܳ;->֫(Ll/ܽ᩶ܳ;Ll/ۨ᩹ܳ;Ll/ۨ᩹ܳ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
