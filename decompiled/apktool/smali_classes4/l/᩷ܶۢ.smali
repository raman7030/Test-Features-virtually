.class public final Ll/᩷ܶۢ;
.super Ljava/lang/Object;
.source "998H"


# instance fields
.field public final ֫:Lbin/mt/plus/Main;

.field public ۧ:Ll/᩶۠ۢ;

.field public final ܽ:Landroid/widget/TextView;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/۬۬ۧ;)V
    .locals 3

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷ܶۢ;->ᩳ:Ljava/util/ArrayList;

    .line 48
    iput-object p1, p0, Ll/᩷ܶۢ;->֫:Lbin/mt/plus/Main;

    .line 49
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0a0190

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/᩷ܶۢ;->ܽ:Landroid/widget/TextView;

    const v1, 0x7f1206f6

    .line 50
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 51
    new-instance v0, Ll/ۜۗۧ;

    invoke-direct {v0, p1}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 52
    invoke-virtual {p2}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    const-wide/16 v1, 0xc8

    .line 54
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->֫(J)V

    .line 55
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ᩳ(J)V

    .line 56
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ܽ(J)V

    .line 57
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ۧ(J)V

    .line 59
    :cond_0
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/᩸۠ۢ;

    invoke-direct {v1, p0}, Ll/᩸۠ۢ;-><init>(Ll/᩷ܶۢ;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    .line 117
    invoke-virtual {v0, p2}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 118
    new-instance v0, Ll/᩶۠ۢ;

    invoke-direct {v0, p0}, Ll/᩶۠ۢ;-><init>(Ll/᩷ܶۢ;)V

    iput-object v0, p0, Ll/᩷ܶۢ;->ۧ:Ll/᩶۠ۢ;

    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 119
    invoke-static {}, Ll/ܶ۠ۢ;->ۢ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v1, Ll/ۢ᩹ۜ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۢ᩹ۜ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 154
    new-instance v0, Ll/֫۠᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p2}, Ll/֫۠᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->ۧ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ܶۢ;)Lbin/mt/plus/Main;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܶۢ;->֫:Lbin/mt/plus/Main;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩷ܶۢ;Ljava/lang/Iterable;)V
    .locals 4

    .line 120
    iget-object v0, p0, Ll/᩷ܶۢ;->ܽ:Landroid/widget/TextView;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩷ܶۢ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    iget-object v2, p0, Ll/᩷ܶۢ;->ᩳ:Ljava/util/ArrayList;

    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ۠ۢ;

    .line 123
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 125
    :cond_0
    iput-object v1, p0, Ll/᩷ܶۢ;->ᩳ:Ljava/util/ArrayList;

    .line 126
    new-instance p1, Ll/᩹۠ۢ;

    invoke-direct {p1, v2, v1}, Ll/᩹۠ۢ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {p1}, Ll/᩷ۙۧ;->֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;

    move-result-object p1

    .line 147
    iget-object v1, p0, Ll/᩷ܶۢ;->ۧ:Ll/᩶۠ۢ;

    invoke-virtual {p1, v1}, Ll/ܿۙۧ;->֫(Ll/᩶ۗۧ;)V

    .line 148
    iget-object p0, p0, Ll/᩷ܶۢ;->ۧ:Ll/᩶۠ۢ;

    invoke-virtual {p0}, Ll/᩶۠ۢ;->getItemCount()I

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    .line 149
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    const/16 p0, 0x8

    .line 151
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩷ܶۢ;Ll/۬۬ۧ;)V
    .locals 2

    .line 155
    iget-object v0, p0, Ll/᩷ܶۢ;->ܽ:Landroid/widget/TextView;

    sget-object v1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 156
    new-instance v0, Ll/᩶۠ۢ;

    invoke-direct {v0, p0}, Ll/᩶۠ۢ;-><init>(Ll/᩷ܶۢ;)V

    iput-object v0, p0, Ll/᩷ܶۢ;->ۧ:Ll/᩶۠ۢ;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩷ܶۢ;)Ll/᩶۠ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܶۢ;->ۧ:Ll/᩶۠ۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩷ܶۢ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܶۢ;->ܽ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩷ܶۢ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܶۢ;->ᩳ:Ljava/util/ArrayList;

    return-object p0
.end method
