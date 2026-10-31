.class public final Ll/ᩳۛ᩷;
.super Ll/ۗ۬ۧ;
.source "31K1"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public ۙ:Landroid/widget/TextView;

.field public final synthetic ۫:Ll/ܿۛ᩷;

.field public ۬:Landroid/view/View;

.field public ᩶:Landroid/widget/ImageView;

.field public ᩸:Landroid/view/View;

.field public ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Landroid/view/View;)V
    .locals 1

    .line 2780
    iput-object p1, p0, Ll/ᩳۛ᩷;->۫:Ll/ܿۛ᩷;

    .line 2781
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 2782
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2783
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0054

    .line 2784
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۛ᩷;->᩸:Landroid/view/View;

    const v0, 0x7f0a0445

    .line 2785
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۛ᩷;->۬:Landroid/view/View;

    const v0, 0x7f0a0278

    .line 2786
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ll/ᩳۛ᩷;->᩶:Landroid/widget/ImageView;

    const v0, 0x7f0a03d6

    .line 2787
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ᩳۛ᩷;->ۗ:Landroid/widget/TextView;

    const v0, 0x7f0a03b2

    .line 2788
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ᩳۛ᩷;->ۙ:Landroid/widget/TextView;

    const v0, 0x7f0a0163

    .line 2789
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/ᩳۛ᩷;->᩹:Landroid/widget/ImageView;

    .line 2790
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x1

    .line 2791
    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 2792
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    const v0, 0x7f0801ee

    .line 2793
    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x77

    .line 2794
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2795
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳۛ᩷;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۛ᩷;->᩸:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩳۛ᩷;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۛ᩷;->᩹:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳۛ᩷;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۛ᩷;->᩶:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۛ᩷;->ۗ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۛ᩷;->ۙ:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2800
    iget-object p1, p0, Ll/ᩳۛ᩷;->۫:Ll/ܿۛ᩷;

    invoke-static {p1}, Ll/ܿۛ᩷;->᩸(Ll/ܿۛ᩷;)Ll/ܽۢۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2801
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 2805
    invoke-static {p1, v0, v1}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;IZ)V

    .line 2806
    invoke-virtual {p1}, Ll/ܿۛ᩷;->ܰ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 10

    .line 2815
    iget-object p1, p0, Ll/ᩳۛ᩷;->۫:Ll/ܿۛ᩷;

    invoke-static {p1}, Ll/ܿۛ᩷;->᩸(Ll/ܿۛ᩷;)Ll/ܽۢۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2818
    :cond_0
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 2822
    :cond_1
    invoke-static {p1}, Ll/ܿۛ᩷;->ۚ(Ll/ܿۛ᩷;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۛ᩷;

    .line 2823
    invoke-static {p1, v0}, Ll/ܿۛ᩷;->ۧ(Ll/ܿۛ᩷;I)Ll/ۧۛ᩷;

    move-result-object v3

    .line 2824
    invoke-virtual {v2}, Ll/ܳۛ᩷;->ۧ()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Ll/ۧۛ᩷;->ܿ(Ll/ۧۛ᩷;)Z

    move-result v4

    if-nez v4, :cond_2

    :goto_0
    return v1

    .line 2827
    :cond_2
    new-instance v4, Ll/᩸ۖ;

    const v5, 0x800003

    iget-object v6, p0, Ll/ᩳۛ᩷;->۬:Landroid/view/View;

    invoke-direct {v4, p1, v6, v5}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 2828
    invoke-static {v6}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 2829
    invoke-virtual {v4}, Ll/᩸ۖ;->ᩳ()V

    .line 2830
    invoke-virtual {v4}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v5

    .line 2831
    invoke-virtual {v2}, Ll/ܳۛ᩷;->ۧ()Z

    move-result v6

    const v7, 0x7f120189

    if-eqz v6, :cond_3

    .line 2832
    invoke-interface {v5, v1, v7, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    const v8, 0x7f0801dd

    invoke-interface {v6, v8}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1756
    :cond_3
    invoke-static {v3}, Ll/ۧۛ᩷;->ܿ(Ll/ۧۛ᩷;)Z

    move-result v6

    const/4 v8, 0x1

    if-nez v6, :cond_4

    goto/16 :goto_6

    .line 1759
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u2026"

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const v6, 0x7f0a0367

    invoke-interface {v5, v1, v6, v1, p1}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    .line 1760
    invoke-interface {p1}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v6

    const v7, 0x7f0801de

    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v6, 0x7f1207ce

    .line 1761
    invoke-interface {p1, v6}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    const v6, 0x7f0a036b

    const v7, 0x7f1207d6

    .line 1762
    invoke-interface {p1, v1, v6, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-static {v3}, Ll/ۧۛ᩷;->֫(Ll/ۧۛ᩷;)I

    move-result v7

    invoke-static {v3}, Ll/ۧۛ᩷;->ܽ(Ll/ۧۛ᩷;)I

    move-result v9

    add-int/2addr v7, v9

    if-lez v7, :cond_5

    const/4 v7, 0x1

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    .line 1763
    :goto_1
    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v6, 0x7f0a0369

    const v7, 0x7f1207d1

    .line 1764
    invoke-interface {p1, v1, v6, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-static {v3}, Ll/ۧۛ᩷;->ۧ(Ll/ۧۛ᩷;)I

    move-result v7

    if-lez v7, :cond_6

    const/4 v7, 0x1

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    .line 1765
    :goto_2
    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v6, 0x7f0a036c

    const v7, 0x7f1207d8

    .line 1766
    invoke-interface {p1, v1, v6, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-static {v3}, Ll/ۧۛ᩷;->ᩳ(Ll/ۧۛ᩷;)I

    move-result v7

    if-lez v7, :cond_7

    const/4 v7, 0x1

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    .line 1767
    :goto_3
    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v6, 0x7f0a0368

    const v7, 0x7f1207cf

    .line 1768
    invoke-interface {p1, v1, v6, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-static {v3}, Ll/ۧۛ᩷;->֫(Ll/ۧۛ᩷;)I

    move-result v7

    if-lez v7, :cond_8

    const/4 v7, 0x1

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    .line 1769
    :goto_4
    invoke-interface {v6, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v6, 0x7f0a036a

    const v7, 0x7f1207d3

    .line 1770
    invoke-interface {p1, v1, v6, v1, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v3}, Ll/ۧۛ᩷;->ܽ(Ll/ۧۛ᩷;)I

    move-result v3

    if-lez v3, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    .line 1771
    :goto_5
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 2835
    :goto_6
    invoke-virtual {v2}, Ll/ܳۛ᩷;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 2836
    invoke-virtual {v2}, Ll/ܳۛ᩷;->ۘ()Z

    move-result p1

    const v3, 0x7f1209de

    if-eqz p1, :cond_a

    const p1, 0x7f120875

    .line 2837
    invoke-interface {v5, v1, v3, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v3, 0x7f080230

    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    goto :goto_7

    .line 2839
    :cond_a
    invoke-interface {v5, v1, v3, v1, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v3, 0x7f080244

    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 2841
    :goto_7
    invoke-virtual {v2}, Ll/ܳۛ᩷;->֡()Z

    move-result p1

    if-eqz p1, :cond_b

    const p1, 0x7f120530

    .line 2842
    invoke-interface {v5, v1, p1, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v3, 0x7f080219

    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    :cond_b
    const p1, 0x7f1209b5

    .line 2844
    invoke-interface {v5, v1, p1, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801ee

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 2846
    :cond_c
    new-instance p1, Ll/ܽۛ᩷;

    invoke-direct {p1, p0, v2, v0}, Ll/ܽۛ᩷;-><init>(Ll/ᩳۛ᩷;Ll/ܳۛ᩷;I)V

    invoke-virtual {v4, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 2870
    invoke-virtual {v4}, Ll/᩸ۖ;->ܿ()V

    return v8
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 2879
    iget-object v0, p0, Ll/ᩳۛ᩷;->᩹:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 2880
    iget-object p1, p0, Ll/ᩳۛ᩷;->۫:Ll/ܿۛ᩷;

    invoke-static {p1}, Ll/ܿۛ᩷;->᩸(Ll/ܿۛ᩷;)Ll/ܽۢۡ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ܽۢۡ;->֫(Ll/ۗ۬ۧ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
