.class public abstract Ll/۫ܶۢ;
.super Ll/ۘ۠ۢ;
.source "E7TE"


# static fields
.field public static final synthetic ۡ֫:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ll/ۘ۠ۢ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ܶۢ;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 41
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ᩴ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    :cond_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܶ֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 45
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;
    .locals 5

    .line 27
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->֫(Ll/ۗܺ᩷;)V

    const v0, 0x7f0d00b2

    .line 28
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a05e4

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a05ef

    .line 30
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a00a2

    .line 31
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/۬ܶۢ;

    invoke-direct {v4, p0}, Ll/۬ܶۢ;-><init>(Ll/۫ܶۢ;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const/4 v3, 0x0

    .line 37
    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->֫(Z)V

    .line 38
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 39
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 40
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۚ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v3, Ll/ۜۘᩳ;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v1, v2, v4}, Ll/ۜۘᩳ;-><init>(Ljava/lang/Object;Landroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v0, p1, v3}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-object p1
.end method

.method public abstract ۫֫()V
.end method
