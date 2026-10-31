.class public final Ll/ۛۜ;
.super Ljava/lang/Object;
.source "L5OM"

# interfaces
.implements Ll/ܰ۬;


# instance fields
.field public ֡:Ll/ۗۜ;

.field public ֨:Z

.field public ֫:Ll/ܿۛ;

.field public ۖ:Landroid/graphics/PorterDuff$Mode;

.field public ۗ:I

.field public final ۘ:I

.field public ۙ:I

.field public ۚ:Landroid/view/ContextMenu$ContextMenuInfo;

.field public ۛ:Ljava/lang/CharSequence;

.field public ۜ:Z

.field public ۠:Landroid/view/MenuItem$OnActionExpandListener;

.field public ۡ:I

.field public ۢ:Landroid/graphics/drawable/Drawable;

.field public ۤ:Ljava/lang/CharSequence;

.field public ۧ:Landroid/view/View;

.field public ۫:Ljava/lang/CharSequence;

.field public ۬:Ll/᩵᩷;

.field public ܳ:I

.field public final ܶ:I

.field public ܺ:Landroid/content/res/ColorStateList;

.field public final ܽ:I

.field public ܿ:Ljava/lang/CharSequence;

.field public ᩳ:Landroid/view/MenuItem$OnMenuItemClickListener;

.field public ᩴ:Landroid/content/Intent;

.field public ᩵:Z

.field public ᩶:C

.field public ᩷:Z

.field public ᩸:C

.field public ᩹:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۗۜ;IIIILjava/lang/CharSequence;I)V
    .locals 2

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    .line 67
    iput v0, p0, Ll/ۛۜ;->ۙ:I

    .line 69
    iput v0, p0, Ll/ۛۜ;->᩹:I

    const/4 v0, 0x0

    .line 79
    iput v0, p0, Ll/ۛۜ;->ۡ:I

    const/4 v1, 0x0

    .line 92
    iput-object v1, p0, Ll/ۛۜ;->ܺ:Landroid/content/res/ColorStateList;

    .line 93
    iput-object v1, p0, Ll/ۛۜ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    .line 94
    iput-boolean v0, p0, Ll/ۛۜ;->ۜ:Z

    .line 95
    iput-boolean v0, p0, Ll/ۛۜ;->᩷:Z

    .line 96
    iput-boolean v0, p0, Ll/ۛۜ;->֨:Z

    const/16 v1, 0x10

    .line 98
    iput v1, p0, Ll/ۛۜ;->ܳ:I

    .line 111
    iput-boolean v0, p0, Ll/ۛۜ;->᩵:Z

    .line 138
    iput-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    .line 139
    iput p3, p0, Ll/ۛۜ;->ۘ:I

    .line 140
    iput p2, p0, Ll/ۛۜ;->᩻:I

    .line 141
    iput p4, p0, Ll/ۛۜ;->ܽ:I

    .line 142
    iput p5, p0, Ll/ۛۜ;->ܶ:I

    .line 143
    iput-object p6, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    .line 144
    iput p7, p0, Ll/ۛۜ;->ۗ:I

    return-void
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p1, :cond_3

    .line 564
    iget-boolean v0, p0, Ll/ۛۜ;->֨:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll/ۛۜ;->ۜ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۛۜ;->᩷:Z

    if-eqz v0, :cond_3

    .line 565
    :cond_0
    invoke-static {p1}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 566
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 568
    iget-boolean v0, p0, Ll/ۛۜ;->ۜ:Z

    if-eqz v0, :cond_1

    .line 569
    iget-object v0, p0, Ll/ۛۜ;->ܺ:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 572
    :cond_1
    iget-boolean v0, p0, Ll/ۛۜ;->᩷:Z

    if-eqz v0, :cond_2

    .line 573
    iget-object v0, p0, Ll/ۛۜ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    const/4 v0, 0x0

    .line 576
    iput-boolean v0, p0, Ll/ۛۜ;->֨:Z

    :cond_3
    return-object p1
.end method

.method public static ֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    .line 405
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public final collapseActionView()Z
    .locals 2

    .line 836
    iget v0, p0, Ll/ۛۜ;->ۗ:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 839
    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 844
    :cond_1
    iget-object v0, p0, Ll/ۛۜ;->۠:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_3

    .line 845
    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    .line 846
    :cond_3
    :goto_0
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0, p0}, Ll/ۗۜ;->collapseItemActionView(Ll/ۛۜ;)Z

    move-result v0

    return v0
.end method

.method public final expandActionView()Z
    .locals 2

    .line 822
    invoke-virtual {p0}, Ll/ۛۜ;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 826
    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->۠:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_2

    .line 827
    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    .line 828
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0, p0}, Ll/ۗۜ;->expandItemActionView(Ll/ۛۜ;)Z

    move-result v0

    return v0
.end method

.method public final getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    .line 784
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is not supported, use MenuItemCompat.getActionProvider()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActionView()Landroid/view/View;
    .locals 1

    .line 766
    iget-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    .line 768
    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz v0, :cond_1

    .line 769
    invoke-virtual {v0, p0}, Ll/ܿۛ;->֫(Ll/ۛۜ;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAlphabeticModifiers()I
    .locals 1

    .line 275
    iget v0, p0, Ll/ۛۜ;->᩹:I

    return v0
.end method

.method public final getAlphabeticShortcut()C
    .locals 1

    .line 242
    iget-char v0, p0, Ll/ۛۜ;->᩸:C

    return v0
.end method

.method public final getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 890
    iget-object v0, p0, Ll/ۛۜ;->ܿ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 202
    iget v0, p0, Ll/ۛۜ;->᩻:I

    return v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 492
    iget-object v0, p0, Ll/ۛۜ;->ۢ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 493
    invoke-direct {p0, v0}, Ll/ۛۜ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 496
    :cond_0
    iget v0, p0, Ll/ۛۜ;->ۡ:I

    if-eqz v0, :cond_1

    .line 497
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Ll/ۛۜ;->ۡ:I

    invoke-static {v0, v1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    .line 498
    iput v1, p0, Ll/ۛۜ;->ۡ:I

    .line 499
    iput-object v0, p0, Ll/ۛۜ;->ۢ:Landroid/graphics/drawable/Drawable;

    .line 500
    invoke-direct {p0, v0}, Ll/ۛۜ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 543
    iget-object v0, p0, Ll/ۛۜ;->ܺ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 560
    iget-object v0, p0, Ll/ۛۜ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ۛۜ;->ᩴ:Landroid/content/Intent;

    return-object v0
.end method

.method public final getItemId()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .line 208
    iget v0, p0, Ll/ۛۜ;->ۘ:I

    return v0
.end method

.method public final getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .line 681
    iget-object v0, p0, Ll/ۛۜ;->ۚ:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public final getNumericModifiers()I
    .locals 1

    .line 285
    iget v0, p0, Ll/ۛۜ;->ۙ:I

    return v0
.end method

.method public final getNumericShortcut()C
    .locals 1

    .line 280
    iget-char v0, p0, Ll/ۛۜ;->᩶:C

    return v0
.end method

.method public final getOrder()I
    .locals 1

    .line 213
    iget v0, p0, Ll/ۛۜ;->ܽ:I

    return v0
.end method

.method public final getSubMenu()Landroid/view/SubMenu;
    .locals 1

    .line 421
    iget-object v0, p0, Ll/ۛۜ;->۬:Ll/᩵᩷;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .line 438
    iget-object v0, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    .line 473
    iget-object v0, p0, Ll/ۛۜ;->ۤ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    .line 905
    iget-object v0, p0, Ll/ۛۜ;->ۛ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final hasSubMenu()Z
    .locals 1

    .line 426
    iget-object v0, p0, Ll/ۛۜ;->۬:Ll/᩵᩷;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isActionViewExpanded()Z
    .locals 1

    .line 869
    iget-boolean v0, p0, Ll/ۛۜ;->᩵:Z

    return v0
.end method

.method public final isCheckable()Z
    .locals 2

    .line 584
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isChecked()Z
    .locals 2

    .line 608
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 184
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVisible()Z
    .locals 1

    .line 634
    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿۛ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 635
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    invoke-virtual {v0}, Ll/ܿۛ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 637
    :cond_0
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    .line 778
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This is not supported, use MenuItemCompat.setActionProvider()"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setActionView(I)Landroid/view/MenuItem;
    .locals 4

    .line 758
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 759
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 760
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 746
    iput-object p1, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    const/4 v1, 0x0

    .line 747
    iput-object v1, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz p1, :cond_0

    .line 748
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Ll/ۛۜ;->ۘ:I

    if-lez v1, :cond_0

    .line 749
    invoke-virtual {p1, v1}, Landroid/view/View;->setId(I)V

    .line 751
    :cond_0
    invoke-virtual {v0, p0}, Ll/ۗۜ;->onItemActionRequestChanged(Ll/ۛۜ;)V

    return-object p0
.end method

.method public final setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 2

    .line 746
    iput-object p1, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    const/4 v0, 0x0

    .line 747
    iput-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz p1, :cond_0

    .line 748
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۛۜ;->ۘ:I

    if-lez v0, :cond_0

    .line 749
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 751
    :cond_0
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, p0}, Ll/ۗۜ;->onItemActionRequestChanged(Ll/ۛۜ;)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 247
    iget-char v0, p0, Ll/ۛۜ;->᩸:C

    if-ne v0, p1, :cond_0

    return-object p0

    .line 251
    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Ll/ۛۜ;->᩸:C

    .line 253
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 261
    iget-char v0, p0, Ll/ۛۜ;->᩸:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Ll/ۛۜ;->᩹:I

    if-ne v0, p2, :cond_0

    return-object p0

    .line 266
    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Ll/ۛۜ;->᩸:C

    .line 267
    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Ll/ۛۜ;->᩹:I

    .line 269
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setCheckable(Z)Landroid/view/MenuItem;
    .locals 2

    .line 589
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v1, v0, -0x2

    or-int/2addr p1, v1

    .line 590
    iput p1, p0, Ll/ۛۜ;->ܳ:I

    if-eq v0, p1, :cond_0

    .line 592
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_0
    return-object p0
.end method

.method public final setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    .line 613
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 616
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, p0}, Ll/ۗۜ;->setExclusiveItemChecked(Landroid/view/MenuItem;)V

    return-object p0

    .line 618
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۛۜ;->ۧ(Z)V

    return-object p0
.end method

.method public final bridge synthetic setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Ll/ۛۜ;->setContentDescription(Ljava/lang/CharSequence;)Ll/ܰ۬;

    return-object p0
.end method

.method public final setContentDescription(Ljava/lang/CharSequence;)Ll/ܰ۬;
    .locals 1

    .line 881
    iput-object p1, p0, Ll/ۛۜ;->ܿ:Ljava/lang/CharSequence;

    .line 883
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    if-eqz p1, :cond_0

    .line 190
    iget p1, p0, Ll/ۛۜ;->ܳ:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Ll/ۛۜ;->ܳ:I

    goto :goto_0

    .line 192
    :cond_0
    iget p1, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Ll/ۛۜ;->ܳ:I

    .line 195
    :goto_0
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 518
    iput-object v0, p0, Ll/ۛۜ;->ۢ:Landroid/graphics/drawable/Drawable;

    .line 519
    iput p1, p0, Ll/ۛۜ;->ۡ:I

    const/4 p1, 0x1

    .line 520
    iput-boolean p1, p0, Ll/ۛۜ;->֨:Z

    .line 523
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 508
    iput v0, p0, Ll/ۛۜ;->ۡ:I

    .line 509
    iput-object p1, p0, Ll/ۛۜ;->ۢ:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    .line 510
    iput-boolean p1, p0, Ll/ۛۜ;->֨:Z

    .line 511
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    .line 532
    iput-object p1, p0, Ll/ۛۜ;->ܺ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 533
    iput-boolean p1, p0, Ll/ۛۜ;->ۜ:Z

    .line 534
    iput-boolean p1, p0, Ll/ۛۜ;->֨:Z

    .line 536
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    .line 549
    iput-object p1, p0, Ll/ۛۜ;->ۖ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 550
    iput-boolean p1, p0, Ll/ۛۜ;->᩷:Z

    .line 551
    iput-boolean p1, p0, Ll/ۛۜ;->֨:Z

    .line 553
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0

    .line 227
    iput-object p1, p0, Ll/ۛۜ;->ᩴ:Landroid/content/Intent;

    return-object p0
.end method

.method public final setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 290
    iget-char v0, p0, Ll/ۛۜ;->᩶:C

    if-ne v0, p1, :cond_0

    return-object p0

    .line 294
    :cond_0
    iput-char p1, p0, Ll/ۛۜ;->᩶:C

    .line 296
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 304
    iget-char v0, p0, Ll/ۛۜ;->᩶:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Ll/ۛۜ;->ۙ:I

    if-ne v0, p2, :cond_0

    return-object p0

    .line 308
    :cond_0
    iput-char p1, p0, Ll/ۛۜ;->᩶:C

    .line 309
    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Ll/ۛۜ;->ۙ:I

    .line 311
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 0

    .line 874
    iput-object p1, p0, Ll/ۛۜ;->۠:Landroid/view/MenuItem$OnActionExpandListener;

    return-object p0
.end method

.method public final setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0

    .line 666
    iput-object p1, p0, Ll/ۛۜ;->ᩳ:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-object p0
.end method

.method public final setShortcut(CC)Landroid/view/MenuItem;
    .locals 0

    .line 318
    iput-char p1, p0, Ll/ۛۜ;->᩶:C

    .line 319
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Ll/ۛۜ;->᩸:C

    .line 321
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setShortcut(CCII)Landroid/view/MenuItem;
    .locals 0

    .line 330
    iput-char p1, p0, Ll/ۛۜ;->᩶:C

    .line 331
    invoke-static {p3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Ll/ۛۜ;->ۙ:I

    .line 332
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Ll/ۛۜ;->᩸:C

    .line 333
    invoke-static {p4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Ll/ۛۜ;->᩹:I

    .line 335
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setShowAsAction(I)V
    .locals 2

    and-int/lit8 v0, p1, 0x3

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 736
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 739
    :cond_1
    :goto_0
    iput p1, p0, Ll/ۛۜ;->ۗ:I

    .line 740
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, p0}, Ll/ۗۜ;->onItemActionRequestChanged(Ll/ۛۜ;)V

    return-void
.end method

.method public final setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 0

    .line 816
    invoke-virtual {p0, p1}, Ll/ۛۜ;->setShowAsAction(I)V

    return-object p0
.end method

.method public final setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .line 468
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛۜ;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2

    .line 455
    iput-object p1, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    .line 457
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۗۜ;->onItemsChanged(Z)V

    .line 459
    iget-object v0, p0, Ll/ۛۜ;->۬:Ll/᩵᩷;

    if-eqz v0, :cond_0

    .line 460
    invoke-virtual {v0, p1}, Ll/᩵᩷;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    :cond_0
    return-object p0
.end method

.method public final setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .line 478
    iput-object p1, p0, Ll/ۛۜ;->ۤ:Ljava/lang/CharSequence;

    .line 485
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final bridge synthetic setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Ll/ۛۜ;->setTooltipText(Ljava/lang/CharSequence;)Ll/ܰ۬;

    return-object p0
.end method

.method public final setTooltipText(Ljava/lang/CharSequence;)Ll/ܰ۬;
    .locals 1

    .line 896
    iput-object p1, p0, Ll/ۛۜ;->ۛ:Ljava/lang/CharSequence;

    .line 898
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p0
.end method

.method public final setVisible(Z)Landroid/view/MenuItem;
    .locals 0

    .line 659
    invoke-virtual {p0, p1}, Ll/ۛۜ;->ܿ(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, p0}, Ll/ۗۜ;->onItemVisibleChanged(Ll/ۛۜ;)V

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 672
    iget-object v0, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/᩻᩷;)Ljava/lang/CharSequence;
    .locals 0

    .line 448
    invoke-interface {p1}, Ll/᩻᩷;->prefersCondensedTitle()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 449
    invoke-virtual {p0}, Ll/ۛۜ;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 438
    :cond_0
    iget-object p1, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    return-object p1
.end method

.method public final ֫(Ll/ܿۛ;)Ll/ܰ۬;
    .locals 1

    const/4 v0, 0x0

    .line 799
    iput-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    .line 800
    iput-object p1, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    .line 801
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    .line 802
    iget-object p1, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz p1, :cond_0

    .line 803
    new-instance v0, Ll/ۤۜ;

    invoke-direct {v0, p0}, Ll/ۤۜ;-><init>(Ll/ۛۜ;)V

    invoke-virtual {p1, v0}, Ll/ܿۛ;->֫(Ll/ᩳۛ;)V

    :cond_0
    return-object p0
.end method

.method public final ֫()Ll/ܿۛ;
    .locals 1

    .line 790
    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    return-object v0
.end method

.method public final ֫(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 676
    iput-object p1, p0, Ll/ۛۜ;->ۚ:Landroid/view/ContextMenu$ContextMenuInfo;

    return-void
.end method

.method public final ֫(Ll/᩵᩷;)V
    .locals 1

    .line 430
    iput-object p1, p0, Ll/ۛۜ;->۬:Ll/᩵᩷;

    .line 438
    iget-object v0, p0, Ll/ۛۜ;->۫:Ljava/lang/CharSequence;

    .line 432
    invoke-virtual {p1, v0}, Ll/᩵᩷;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 863
    iput-boolean p1, p0, Ll/ۛۜ;->᩵:Z

    .line 864
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public final ۜ()Z
    .locals 3

    .line 153
    iget-object v0, p0, Ll/ۛۜ;->ᩳ:Landroid/view/MenuItem$OnMenuItemClickListener;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0, v0, p0}, Ll/ۗۜ;->dispatchMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 166
    :cond_1
    iget-object v2, p0, Ll/ۛۜ;->ᩴ:Landroid/content/Intent;

    if-eqz v2, :cond_2

    .line 168
    :try_start_0
    invoke-virtual {v0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Ll/ۛۜ;->ᩴ:Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    nop

    .line 175
    :cond_2
    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/ܿۛ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 700
    iget v0, p0, Ll/ۛۜ;->ۗ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 603
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Z)V
    .locals 3

    .line 625
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v1, v0, -0x3

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v1

    .line 626
    iput p1, p0, Ll/ۛۜ;->ܳ:I

    if-eq v0, p1, :cond_1

    .line 628
    iget-object p1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {p1, v2}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 705
    iget v0, p0, Ll/ۛۜ;->ۗ:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 6

    .line 354
    invoke-virtual {p0}, Ll/ۛۜ;->ܿ()C

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 359
    :cond_0
    iget-object v1, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v1}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 361
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    invoke-virtual {v1}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v4

    if-eqz v4, :cond_1

    const v4, 0x7f120012

    .line 363
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    :cond_1
    invoke-virtual {v1}, Ll/ۗۜ;->isQwertyMode()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۛۜ;->᩹:I

    goto :goto_0

    :cond_2
    iget v1, p0, Ll/ۛۜ;->ۙ:I

    :goto_0
    const v4, 0x7f12000e

    .line 369
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x10000

    .line 368
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const v4, 0x7f12000a

    .line 371
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x1000

    .line 370
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const v4, 0x7f120009

    .line 373
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    .line 372
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const v4, 0x7f12000f

    .line 375
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 374
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const v4, 0x7f120011

    .line 377
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    .line 376
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const v4, 0x7f12000d

    .line 379
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x8

    .line 378
    invoke-static {v1, v5, v4, v3}, Ll/ۛۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    if-eq v0, v5, :cond_5

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0x20

    if-eq v0, v1, :cond_3

    .line 396
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const v0, 0x7f120010

    .line 392
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const v0, 0x7f12000c

    .line 384
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    const v0, 0x7f12000b

    .line 388
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Z
    .locals 2

    .line 722
    iget v0, p0, Ll/ۛۜ;->ۗ:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 599
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v0, v0, -0x5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Ll/ۛۜ;->ܳ:I

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 710
    invoke-virtual {p0}, Ll/ۛۜ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۛۜ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()C
    .locals 1

    .line 344
    iget-object v0, p0, Ll/ۛۜ;->֡:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->isQwertyMode()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-char v0, p0, Ll/ۛۜ;->᩸:C

    return v0

    :cond_0
    iget-char v0, p0, Ll/ۛۜ;->᩶:C

    return v0
.end method

.method public final ܿ(Z)Z
    .locals 3

    .line 649
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 v1, v0, -0x9

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    or-int/2addr p1, v1

    .line 650
    iput p1, p0, Ll/ۛۜ;->ܳ:I

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public final ᩳ()I
    .locals 1

    .line 217
    iget v0, p0, Ll/ۛۜ;->ܶ:I

    return v0
.end method

.method public final ᩳ(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 715
    iget p1, p0, Ll/ۛۜ;->ܳ:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ۛۜ;->ܳ:I

    return-void

    .line 717
    :cond_0
    iget p1, p0, Ll/ۛۜ;->ܳ:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Ll/ۛۜ;->ܳ:I

    return-void
.end method

.method public final ᩷()Z
    .locals 2

    .line 696
    iget v0, p0, Ll/ۛۜ;->ܳ:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 853
    iget v0, p0, Ll/ۛۜ;->ۗ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_1

    .line 854
    iget-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۛۜ;->֫:Ll/ܿۛ;

    if-eqz v0, :cond_0

    .line 855
    invoke-virtual {v0, p0}, Ll/ܿۛ;->֫(Ll/ۛۜ;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    .line 857
    :cond_0
    iget-object v0, p0, Ll/ۛۜ;->ۧ:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
