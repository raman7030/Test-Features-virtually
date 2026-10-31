.class public Ll/ܽ֨ᩳ;
.super Ll/ۗܺ᩷;
.source "75NJ"


# static fields
.field public static final ۗۧ:Ljava/lang/Object;

.field public static final ۙۧ:Ljava/lang/Object;

.field public static final synthetic ᩶ۧ:I


# instance fields
.field public ֡ۧ:Ll/۬۬ۧ;

.field public ֨ۧ:Ll/۬۬ܿ;

.field public ۖۧ:Z

.field public ۘۧ:Ll/֫ۗۧ;

.field public ۚۧ:Z

.field public ۜۧ:Ll/ۢᩴ;

.field public ۠ۧ:Z

.field public ۡۧ:Ljava/util/ArrayList;

.field public ۢۧ:Z

.field public ܳۧ:Z

.field public ܶۧ:Ll/ܽۢۡ;

.field public ܺۧ:Ll/֫۠ۢ;

.field public ܿۧ:I

.field public ᩳۧ:Ll/ۤۚᩳ;

.field public ᩴۧ:Ll/۠۬᩷;

.field public ᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ᩷ۧ:Ll/ۡۤۡ;

.field public ᩸ۧ:Ll/۫ۛ᩷;

.field public ᩹ۧ:Ll/᩶ܶᩳ;

.field public ᩻ۧ:Ll/۬ۧ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 96
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽ֨ᩳ;->ۙۧ:Ljava/lang/Object;

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽ֨ᩳ;->ۗۧ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 94
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 101
    new-instance v0, Ll/֫۠ۢ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/֫۠ۢ;-><init>(Ll/᩻ۡ֫;I)V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ܺۧ:Ll/֫۠ۢ;

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 114
    iput v0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 477
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ֨ᩳ;->᩷ۧ:Ll/ۡۤۡ;

    .line 506
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ۚۧ:Z

    return-void
.end method

.method private ֫(IZ)I
    .locals 2

    .line 1168
    :goto_0
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 1169
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܶᩳ;

    if-nez p2, :cond_0

    .line 1170
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public static ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 424
    sput-object p0, Ll/ܿ᩸ᩳ;->ۧ:Ljava/lang/CharSequence;

    return-void
.end method

.method public static synthetic ֫(Ll/ܽ֨ᩳ;)V
    .locals 3

    .line 156
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 157
    iget-object v1, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v1, v0

    const/high16 v0, 0x42100000    # 36.0f

    .line 158
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    mul-int/lit8 v2, v0, 0x2

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v0

    goto :goto_0

    .line 163
    :cond_0
    div-int/lit8 v1, v1, 0x2

    :goto_0
    neg-int v0, v1

    .line 165
    iget-object v1, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v1

    int-to-float v0, v0

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_1

    .line 166
    iget-object p0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationX(F)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽ֨ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    const/4 v2, 0x1

    add-int/2addr p1, v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, p1, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 825
    new-instance p1, Ll/ۖۚᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۛ۫ۡ;->֫(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 826
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 827
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 828
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 829
    new-instance v3, Ll/ܰۚᩳ;

    invoke-direct {v3, p0, p2, v1, p1}, Ll/ܰۚᩳ;-><init>(Ll/ܽ֨ᩳ;Ljava/util/LinkedList;Ll/᩹ܶᩳ;Z)V

    invoke-virtual {p2, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 831
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 832
    iput-boolean v2, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 833
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰۚᩳ;

    invoke-virtual {p0}, Ll/ܰۚᩳ;->֫()V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V
    .locals 3

    .line 383
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֨ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    .line 384
    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    const/4 v0, 0x0

    .line 385
    iput-object v0, p0, Ll/ܽ֨ᩳ;->֨ۧ:Ll/۬۬ܿ;

    :cond_0
    const/4 v0, 0x0

    .line 387
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ۖۧ:Z

    .line 404
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v1

    .line 405
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_1

    .line 406
    invoke-virtual {v1}, Ll/ۚۜ֫;->۬()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ll/ۚۜ֫;->ۗ()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 391
    invoke-direct {p0, p1, v1, v0}, Ll/ܽ֨ᩳ;->֫(Landroid/content/Intent;ZZ)Z

    if-eqz p2, :cond_1

    .line 413
    iget p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    .line 416
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܽ֫()I

    move-result p1

    if-eq p1, p2, :cond_1

    .line 1100
    invoke-direct {p0, p1, v0}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ܽ֨ᩳ;Landroid/widget/CheckBox;)V
    .locals 4

    .line 744
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 745
    new-instance v1, Ll/ۖۚᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۛ۫ۡ;->֫(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 746
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 747
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 748
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܶᩳ;

    .line 749
    new-instance v3, Ll/ܰۚᩳ;

    invoke-direct {v3, p0, v1, v2, p1}, Ll/ܰۚᩳ;-><init>(Ll/ܽ֨ᩳ;Ljava/util/LinkedList;Ll/᩹ܶᩳ;Z)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 751
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 752
    iput-boolean p1, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 753
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰۚᩳ;

    invoke-virtual {p0}, Ll/ܰۚᩳ;->֫()V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܽ֨ᩳ;Ll/ۗۜ;I)V
    .locals 6

    .line 686
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    new-instance v1, Ll/۟ۚᩳ;

    .line 845
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 687
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 688
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ܶᩳ;

    .line 689
    invoke-virtual {v4}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 692
    :cond_0
    invoke-static {v1}, Ll/۟ۚᩳ;->ۧ(Ll/۟ۚᩳ;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v1, v5}, Ll/۟ۚᩳ;->ۧ(Ll/۟ۚᩳ;I)V

    .line 693
    invoke-virtual {v4}, Ll/֫ۘᩳ;->᩷()Z

    move-result v4

    if-nez v4, :cond_1

    .line 694
    invoke-static {v1}, Ll/۟ۚᩳ;->ᩳ(Ll/۟ۚᩳ;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/۟ۚᩳ;->ᩳ(Ll/۟ۚᩳ;I)V

    :cond_1
    if-ge v3, p2, :cond_2

    .line 697
    invoke-static {v1}, Ll/۟ۚᩳ;->֫(Ll/۟ۚᩳ;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/۟ۚᩳ;->֫(Ll/۟ۚᩳ;I)V

    goto :goto_1

    :cond_2
    if-le v3, p2, :cond_3

    .line 699
    invoke-static {v1}, Ll/۟ۚᩳ;->ܽ(Ll/۟ۚᩳ;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/۟ۚᩳ;->ܽ(Ll/۟ۚᩳ;I)V

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 663
    :cond_4
    invoke-static {v1}, Ll/۟ۚᩳ;->ܿ(Ll/۟ۚᩳ;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    .line 666
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x7f120189

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u2026"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const p2, 0x7f0a0367

    invoke-interface {p1, v2, p2, v2, p0}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p0

    .line 667
    invoke-interface {p0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x7f0801de

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const p1, 0x7f1207ce

    .line 668
    invoke-interface {p0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    const p1, 0x7f0a036b

    const p2, 0x7f1207d6

    .line 669
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/۟ۚᩳ;->֫(Ll/۟ۚᩳ;)I

    move-result p2

    invoke-static {v1}, Ll/۟ۚᩳ;->ܽ(Ll/۟ۚᩳ;)I

    move-result v0

    add-int/2addr p2, v0

    if-lez p2, :cond_6

    const/4 p2, 0x1

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    .line 670
    :goto_2
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a0369

    const p2, 0x7f1207d1

    .line 671
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/۟ۚᩳ;->ۧ(Ll/۟ۚᩳ;)I

    move-result p2

    if-lez p2, :cond_7

    const/4 p2, 0x1

    goto :goto_3

    :cond_7
    const/4 p2, 0x0

    .line 672
    :goto_3
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a036c

    const p2, 0x7f1207d8

    .line 673
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/۟ۚᩳ;->ᩳ(Ll/۟ۚᩳ;)I

    move-result p2

    if-lez p2, :cond_8

    const/4 p2, 0x1

    goto :goto_4

    :cond_8
    const/4 p2, 0x0

    .line 674
    :goto_4
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a0368

    const p2, 0x7f1207cf

    .line 675
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/۟ۚᩳ;->֫(Ll/۟ۚᩳ;)I

    move-result p2

    if-lez p2, :cond_9

    const/4 p2, 0x1

    goto :goto_5

    :cond_9
    const/4 p2, 0x0

    .line 676
    :goto_5
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a036a

    const p2, 0x7f1207d3

    .line 677
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p0

    invoke-static {v1}, Ll/۟ۚᩳ;->ܽ(Ll/۟ۚᩳ;)I

    move-result p1

    if-lez p1, :cond_a

    const/4 v2, 0x1

    .line 678
    :cond_a
    invoke-interface {p0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method

.method private ֫(Landroid/content/Intent;ZZ)Z
    .locals 8

    const-string v0, "fromExternalApp"

    const/4 v1, 0x0

    .line 277
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 278
    iput-boolean v2, p0, Ll/ܽ֨ᩳ;->ۢۧ:Z

    :cond_0
    const-string v0, "bin.mt.edit2.ACTION_CREATE_WITH_TEXT"

    .line 280
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->ۨ()V

    return v1

    :cond_1
    const-string v0, "android.intent.action.SEND"

    .line 284
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "android.intent.extra.TEXT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 285
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 424
    sput-object v0, Ll/ܿ᩸ᩳ;->ۧ:Ljava/lang/CharSequence;

    .line 288
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->ۨ()V

    return v1

    :cond_2
    const-string v0, "android.intent.action.VIEW"

    .line 292
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    const-string v0, "android.intent.action.EDIT"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 293
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 294
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->ۨ()V

    return v1

    .line 298
    :cond_3
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_4

    .line 299
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 300
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->ۨ()V

    return v1

    :cond_4
    if-nez p2, :cond_5

    .line 304
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result p2

    if-nez p2, :cond_5

    .line 372
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 373
    iput-boolean v2, p0, Ll/ܽ֨ᩳ;->ۖۧ:Z

    .line 374
    new-instance p1, Ll/۬۬ܿ;

    const v0, 0x7f120528

    invoke-direct {p1, p0, v0}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    const/16 v0, 0x1f4

    invoke-virtual {p1, v0}, Ll/۬۬ܿ;->ܽ(I)V

    iput-object p1, p0, Ll/ܽ֨ᩳ;->֨ۧ:Ll/۬۬ܿ;

    .line 375
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۠ۚᩳ;

    invoke-direct {v0, p0, p2, p3}, Ll/۠ۚᩳ;-><init>(Ll/ܽ֨ᩳ;Landroid/content/Intent;Z)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v2

    .line 309
    :cond_5
    :try_start_0
    invoke-static {p1}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 316
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v0, p3, :cond_7

    .line 317
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܶᩳ;

    .line 318
    invoke-virtual {v5}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v6

    .line 63
    iget-object v6, v6, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    .line 318
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    const/4 v0, -0x1

    move-object v5, v4

    :goto_1
    if-nez v5, :cond_d

    .line 326
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p3

    if-ne p3, v2, :cond_8

    .line 327
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹ܶᩳ;

    .line 328
    invoke-virtual {p3}, Ll/֫ۘᩳ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3}, Ll/֫ۘᩳ;->᩷()Z

    move-result p3

    if-nez p3, :cond_8

    const/4 p3, 0x1

    goto :goto_2

    :cond_8
    const/4 p3, 0x0

    .line 333
    :goto_2
    new-instance v0, Ll/᩹ܶᩳ;

    invoke-direct {v0}, Ll/᩹ܶᩳ;-><init>()V

    .line 334
    invoke-virtual {v0, v4}, Ll/֫ۘᩳ;->ۧ(Ljava/lang/String;)V

    const-string v4, "filePath"

    .line 335
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    iget-object v5, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    invoke-virtual {v5, v4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    invoke-static {}, Ll/ۖۘᩳ;->ۧ()Ll/ۖۘᩳ;

    move-result-object p2

    sget-object v4, Ll/ۖۘᩳ;->᩹:Ll/ۖۘᩳ;

    if-eq p2, v4, :cond_9

    const-string p2, "temp"

    .line 337
    invoke-virtual {v5, p2, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_9
    const-string p2, "save_as_path"

    .line 340
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 342
    invoke-virtual {v5, p2, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    const-string p2, "axml"

    .line 344
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "forceTryAXml"

    .line 345
    invoke-virtual {v5, p2, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_b
    const-string p2, "class"

    .line 347
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "forceTryClass"

    .line 348
    invoke-virtual {v5, p1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 350
    :cond_c
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܽ֫()I

    move-result p1

    add-int/2addr p1, v2

    invoke-direct {p0, p1, v1}, Ll/ܽ֨ᩳ;->֫(IZ)I

    move-result p1

    .line 351
    invoke-virtual {v3, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 352
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    new-array p2, v1, [Ljava/lang/String;

    .line 353
    invoke-virtual {v0, p2}, Ll/᩹ܶᩳ;->֫([Ljava/lang/String;)V

    move v0, p1

    goto :goto_3

    :cond_d
    const/4 p3, 0x0

    .line 1100
    :goto_3
    invoke-direct {p0, v0, v1}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    if-eqz p3, :cond_e

    .line 363
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶᩳ;

    invoke-virtual {p0, p1}, Ll/ܽ֨ᩳ;->֫(Ll/᩹ܶᩳ;)V

    :cond_e
    return v1

    :catch_0
    move-exception p1

    .line 311
    invoke-virtual {p0, p1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return v1
.end method

.method public static bridge synthetic ۖ(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    return-void
.end method

.method public static bridge synthetic ۘ(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    return-object p0
.end method

.method private ۜ֫()V
    .locals 9

    .line 996
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result v0

    .line 997
    iget-object v1, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    check-cast v1, Ll/ۜۗۧ;

    .line 998
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    invoke-virtual {v1}, Ll/ۜۗۧ;->findFirstVisibleItemPosition()I

    move-result v2

    .line 1000
    invoke-virtual {v1}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v1

    add-int/2addr v1, v2

    .line 1001
    iget v3, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 v4, 0x2

    const-wide/16 v5, 0xc8

    const-string v7, "alpha"

    const/4 v8, 0x0

    if-lt v3, v2, :cond_1

    if-lt v3, v1, :cond_0

    goto :goto_0

    .line 1010
    :cond_0
    iget-boolean v1, p0, Ll/ܽ֨ᩳ;->۠ۧ:Z

    if-eqz v1, :cond_2

    .line 1011
    iput-boolean v8, p0, Ll/ܽ֨ᩳ;->۠ۧ:Z

    if-eqz v0, :cond_2

    .line 1013
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-array v1, v4, [F

    fill-array-data v1, :array_0

    invoke-static {v0, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 1014
    new-instance v1, Ll/۫ۚᩳ;

    invoke-direct {v1, p0}, Ll/۫ۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1035
    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    .line 1002
    :cond_1
    :goto_0
    iget-boolean v1, p0, Ll/ܽ֨ᩳ;->۠ۧ:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 1003
    iput-boolean v1, p0, Ll/ܽ֨ᩳ;->۠ۧ:Z

    if-eqz v0, :cond_2

    .line 1005
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, v8}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 1006
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1007
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-array v1, v4, [F

    fill-array-data v1, :array_1

    invoke-static {v0, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_2
    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static bridge synthetic ۡ(Ll/ܽ֨ᩳ;)Ll/᩶ܶᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    return-object p0
.end method

.method private ۧ(IZ)V
    .locals 6

    if-ltz p1, :cond_8

    .line 1105
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_8

    .line 1108
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v1

    .line 1109
    invoke-virtual {v1}, Ll/ۚۜ֫;->۬()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Ll/ۚۜ֫;->ۗ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    .line 1112
    :cond_0
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 1114
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩹ܶᩳ;

    .line 1115
    invoke-virtual {v1}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object v0

    invoke-virtual {p2}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0a010f

    invoke-virtual {v0, v2, p2, v1}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܽ᩷֫;->ۧ()I

    .line 1116
    iput p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 1117
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 1118
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    .line 1119
    iget-object p1, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    :cond_1
    if-eq v2, p1, :cond_6

    .line 1121
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܶᩳ;

    .line 1122
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܶᩳ;

    if-nez p2, :cond_3

    .line 1124
    invoke-virtual {v2}, Ll/᩹ܶᩳ;->ܶ()Ll/ᩴۛ᩷;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 1126
    iget-object v3, p0, Ll/ܽ֨ᩳ;->᩸ۧ:Ll/۫ۛ᩷;

    invoke-virtual {v3}, Ll/۫ۛ᩷;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1127
    iget-object v3, p0, Ll/ܽ֨ᩳ;->᩸ۧ:Ll/۫ۛ᩷;

    new-instance v4, Ll/֨ۚᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p2}, Ll/֨ۚᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/۫ۛ᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1132
    :cond_2
    invoke-interface {p2}, Ll/ᩴۛ᩷;->ۧ()V

    .line 1133
    iget-object v3, p0, Ll/ܽ֨ᩳ;->᩸ۧ:Ll/۫ۛ᩷;

    new-instance v4, Ll/ۘۚᩳ;

    invoke-direct {v4, p2}, Ll/ۘۚᩳ;-><init>(Ll/ᩴۛ᩷;)V

    invoke-virtual {v3, v4}, Ll/۫ۛ᩷;->֫(Ljava/lang/Runnable;)V

    .line 1137
    :cond_3
    :goto_0
    invoke-virtual {v1}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object p2

    .line 1138
    iget v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-ge v1, p1, :cond_4

    const v1, 0x7f01003b

    const v3, 0x7f01003a

    .line 1139
    invoke-virtual {p2, v1, v3}, Ll/ܽ᩷֫;->֫(II)V

    goto :goto_1

    :cond_4
    const v1, 0x7f010039

    const v3, 0x7f01003c

    .line 1141
    invoke-virtual {p2, v1, v3}, Ll/ܽ᩷֫;->֫(II)V

    .line 1143
    :goto_1
    invoke-virtual {p2, v2}, Ll/ܽ᩷֫;->ۧ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;

    .line 1144
    invoke-virtual {v0}, Ll/ۡ᩻֫;->isDetached()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1145
    invoke-virtual {p2, v0}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;)V

    goto :goto_2

    .line 1147
    :cond_5
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 1149
    :goto_2
    invoke-virtual {p2}, Ll/ܽ᩷֫;->ܽ()I

    .line 1150
    iput p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 1151
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 1152
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    .line 1153
    iget-object p1, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    .line 1155
    :cond_6
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶᩳ;

    invoke-virtual {p1}, Ll/᩹ܶᩳ;->᩶()V

    :cond_7
    :goto_3
    return-void

    .line 1106
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public static ۧ(Ll/ܽ֨ᩳ;)V
    .locals 4

    const/4 v0, 0x1

    .line 767
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    const/4 v0, 0x0

    .line 769
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܶᩳ;

    .line 770
    invoke-virtual {v2}, Ll/֫ۘᩳ;->᩷()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2977
    invoke-virtual {p0, v2}, Ll/ܽ֨ᩳ;->֫(Ll/᩹ܶᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 775
    :cond_1
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 776
    throw v1
.end method

.method public static ۧ(Ll/ܽ֨ᩳ;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1100
    invoke-direct {p0, p1, v0}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 796
    new-instance p1, Ll/ۖۚᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۛ۫ۡ;->֫(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 797
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 798
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 799
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 800
    new-instance v2, Ll/ܰۚᩳ;

    invoke-direct {v2, p0, p2, v1, p1}, Ll/ܰۚᩳ;-><init>(Ll/ܽ֨ᩳ;Ljava/util/LinkedList;Ll/᩹ܶᩳ;Z)V

    invoke-virtual {p2, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 802
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 803
    iput-boolean p1, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 804
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰۚᩳ;

    invoke-virtual {p0}, Ll/ܰۚᩳ;->֫()V

    :cond_1
    return-void
.end method

.method public static ۧ֫()Z
    .locals 3

    .line 1509
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_id_2_name"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static bridge synthetic ܳ(Ll/ܽ֨ᩳ;)Ll/۬ۧ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    return-object p0
.end method

.method private ܳ֫()V
    .locals 6

    .line 1182
    invoke-static {}, Ll/ᩳۚᩳ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const v1, 0x67821367

    .line 0
    invoke-static {v1}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v1

    .line 1185
    iget-object v2, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܶᩳ;

    .line 1186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 115
    invoke-virtual {v3}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 116
    invoke-virtual {v4}, Landroid/os/Parcel;->marshall()[B

    move-result-object v3

    .line 117
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1186
    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ۧ([B)V

    goto :goto_0

    .line 1188
    :cond_0
    new-instance v2, Ll/۠᩸ᩳ;

    sget-object v3, Ll/ܽ֨ᩳ;->ۙۧ:Ljava/lang/Object;

    invoke-direct {v2, v0, v1, v3}, Ll/۠᩸ᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ۤۜܽ;Ljava/lang/Object;)V

    .line 33
    :try_start_0
    invoke-virtual {v2}, Ll/۠᩸ᩳ;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܽ֨ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    return-void
.end method

.method public static synthetic ܽ(Ll/ܽ֨ᩳ;)V
    .locals 1

    .line 935
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    iget p0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v0, p0}, Ll/۬۬ۧ;->smoothScrollToPosition(I)V

    return-void
.end method

.method public static ܽ(Ll/ܽ֨ᩳ;I)V
    .locals 6

    .line 1477
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    const/4 v1, -0x1

    if-eq p1, v1, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_1

    .line 1481
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 1482
    invoke-virtual {v1}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v2

    const-string v3, "top"

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 1483
    invoke-direct {p0, v4, v4}, Ll/ܽ֨ᩳ;->֫(IZ)I

    move-result v2

    .line 110
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1485
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܶᩳ;

    invoke-virtual {v3}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 1489
    invoke-direct {p0, v4, v2}, Ll/ܽ֨ᩳ;->֫(IZ)I

    move-result v4

    .line 110
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1491
    invoke-virtual {v1}, Ll/᩹ܶᩳ;->ۙ()V

    move v2, v4

    :cond_2
    if-eq p1, v2, :cond_4

    .line 1494
    iget v3, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܶᩳ;

    if-ge p1, v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    .line 1498
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1499
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1500
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 1501
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 1502
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    .line 1504
    :cond_4
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    .line 1505
    iget-object p0, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_5
    :goto_1
    return-void
.end method

.method public static synthetic ܽ(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 721
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 722
    new-instance p1, Ll/ۖۚᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۛ۫ۡ;->֫(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 723
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 724
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 725
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 726
    new-instance v2, Ll/ܰۚᩳ;

    invoke-direct {v2, p0, p2, v1, p1}, Ll/ܰۚᩳ;-><init>(Ll/ܽ֨ᩳ;Ljava/util/LinkedList;Ll/᩹ܶᩳ;Z)V

    invoke-virtual {p2, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 728
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 729
    iput-boolean p1, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    .line 730
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰۚᩳ;

    invoke-virtual {p0}, Ll/ܰۚᩳ;->֫()V

    :cond_1
    return-void
.end method

.method private ܽ֫()I
    .locals 4

    const/4 v0, -0x1

    .line 1295
    :try_start_0
    invoke-static {}, Ll/ᩳۚᩳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 1296
    sget-object v2, Ll/ܽ֨ᩳ;->ۗۧ:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1297
    :try_start_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1298
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 1300
    :goto_0
    :try_start_2
    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v1

    const/4 v3, -0x1

    move-object v3, v1

    const/4 v1, -0x1

    :goto_1
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v2, v1

    const/4 v1, -0x1

    .line 1302
    :goto_2
    iget-object v3, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    invoke-virtual {v3, v2}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 1304
    :goto_3
    iget-object v2, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :cond_1
    if-ltz v1, :cond_3

    .line 1306
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    goto :goto_4

    :cond_2
    move v0, v1

    goto :goto_5

    :cond_3
    :goto_4
    const/4 v0, 0x0

    :goto_5
    return v0
.end method

.method public static bridge synthetic ܿ(Ll/ܽ֨ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    return p0
.end method

.method private ܿ֫()V
    .locals 3

    .line 1273
    iget v0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 1274
    iget v0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܶᩳ;

    .line 1275
    invoke-virtual {v0}, Ll/᩹ܶᩳ;->ܶ()Ll/ᩴۛ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1277
    invoke-interface {v0}, Ll/ᩴۛ᩷;->ۧ()V

    .line 1278
    iget-object v1, p0, Ll/ܽ֨ᩳ;->᩸ۧ:Ll/۫ۛ᩷;

    new-instance v2, Ll/ۘۚᩳ;

    invoke-direct {v2, v0}, Ll/ۘۚᩳ;-><init>(Ll/ᩴۛ᩷;)V

    invoke-virtual {v1, v2}, Ll/۫ۛ᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܽ֨ᩳ;)Ll/ۤۚᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    return-object p0
.end method

.method private ᩳ֫()V
    .locals 6

    .line 1284
    new-instance v0, Ll/ۤۜܽ;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    .line 1285
    iget v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1286
    new-instance v1, Ll/۠᩸ᩳ;

    invoke-static {}, Ll/ᩳۚᩳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ܽ֨ᩳ;->ۗۧ:Ljava/lang/Object;

    invoke-direct {v1, v2, v0, v3}, Ll/۠᩸ᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ۤۜܽ;Ljava/lang/Object;)V

    const-wide/16 v4, 0xc8

    invoke-static {v1, v3, v4, v5}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    return-void
.end method

.method private ᩷(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_1

    .line 651
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 654
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶᩳ;

    invoke-virtual {p1}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object p1

    .line 58
    iget-object p1, p1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x32

    .line 655
    invoke-static {v0, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static bridge synthetic ᩷(Ll/ܽ֨ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܽ֨ᩳ;->۠ۧ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩻֫()V
    .locals 3

    .line 251
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 252
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/۫ܰ;->֫(I)V

    return-void

    .line 253
    :cond_0
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v2, :cond_1

    .line 254
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/۫ܰ;->ܽ(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 246
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 247
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->᩻֫()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 129
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const-string v0, ""

    .line 130
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f0d0055

    .line 131
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 132
    invoke-virtual {p0}, Ll/ۗܺ᩷;->֡()V

    .line 134
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/۫ܰ;->ۧ(I)V

    .line 135
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->᩻֫()V

    const v0, 0x7f0a063a

    .line 137
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 138
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 140
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    .line 452
    new-instance v1, Ll/᩹ۚᩳ;

    invoke-direct {v1, p0}, Ll/᩹ۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    const v0, 0x7f0a03a3

    .line 142
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll/ᩴۚᩳ;

    invoke-direct {v1, p0}, Ll/ᩴۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0173

    .line 144
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ۜۧ:Ll/ۢᩴ;

    const v1, 0x7f120a57

    .line 145
    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setTitle(I)V

    .line 146
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۜۧ:Ll/ۢᩴ;

    const v1, 0x7f0f001f

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->inflateMenu(I)V

    .line 147
    new-instance v0, Ll/ܽۢۡ;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۜۧ:Ll/ۢᩴ;

    const v2, 0x7f0a0336

    const v3, 0x7f0a03ae

    filled-new-array {v2, v3}, [I

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ܽۢۡ;-><init>(Ll/ۢᩴ;[I)V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    .line 148
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۜۧ:Ll/ۢᩴ;

    new-instance v1, Ll/᩵ۚᩳ;

    invoke-direct {v1, p0}, Ll/᩵ۚᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setOnMenuItemClickListener(Ll/᩻ᩴ;)V

    const v0, 0x7f0a0172

    .line 150
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۬ۧ֫;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    const v0, 0x7f0a0211

    .line 152
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 153
    iget-object v2, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    const v0, 0x7f0a0171

    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const v0, 0x7f0a02db

    .line 154
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Ll/ܽ֨ᩳ;->ۜۧ:Ll/ۢᩴ;

    iget-object v7, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-object v1, p0

    .line 153
    invoke-virtual/range {v1 .. v7}, Ll/ۗܺ᩷;->֫(Ll/۬ۧ֫;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 155
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    new-instance v1, Ll/֡ۚᩳ;

    invoke-direct {v1, p0}, Ll/֡ۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 170
    new-instance v0, Ll/۟ᩳ;

    iget-object v1, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    iget-object v2, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-direct {v0, p0, v1, v2}, Ll/۟ᩳ;-><init>(Ll/ۗܺ᩷;Ll/۬ۧ֫;Ll/ۢᩴ;)V

    .line 171
    invoke-virtual {v0}, Ll/۟ᩳ;->֫()Ll/ۚ᩻;

    move-result-object v1

    sget-object v2, Ll/᩹֡᩷;->᩷:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۚ᩻;->֫(I)V

    .line 172
    iget-object v1, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    invoke-virtual {v1, v0}, Ll/۬ۧ֫;->֫(Ll/۠ۧ֫;)V

    .line 173
    invoke-virtual {v0}, Ll/۟ᩳ;->ۧ()V

    .line 174
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    new-instance v1, Ll/᩸ۚᩳ;

    invoke-direct {v1, p0}, Ll/᩸ۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->֫(Ll/۠ۧ֫;)V

    .line 219
    new-instance v0, Ll/ۙܺ֫;

    invoke-direct {v0, p0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v1, Ll/᩶ܶᩳ;

    invoke-virtual {v0, v1}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v0

    check-cast v0, Ll/᩶ܶᩳ;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    .line 220
    iget-object v1, p0, Ll/ܽ֨ᩳ;->ܺۧ:Ll/֫۠ۢ;

    invoke-virtual {v0, p0, v1}, Ll/᩶ܶᩳ;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 221
    new-instance v0, Ll/ۙܺ֫;

    invoke-direct {v0, p0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v1, Ll/۫ۛ᩷;

    invoke-virtual {v0, v1}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v0

    check-cast v0, Ll/۫ۛ᩷;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->᩸ۧ:Ll/۫ۛ᩷;

    .line 222
    new-instance v0, Ll/۠۬᩷;

    invoke-direct {v0}, Ll/۠۬᩷;-><init>()V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ᩴۧ:Ll/۠۬᩷;

    .line 223
    new-instance v0, Ll/ۚۚᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۚۚᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 1196
    :goto_0
    sget-object v0, Ll/ܽ֨ᩳ;->ۙۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 1197
    :try_start_0
    invoke-static {}, Ll/ᩳۚᩳ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 1198
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1199
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    .line 1202
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 1204
    :try_start_2
    iget-object v5, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    invoke-virtual {v5, v4}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    const/4 v4, 0x0

    .line 1206
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_7

    .line 1209
    :try_start_3
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, v4}, Ll/۬ۜܽ;-><init>([B)V

    const v4, 0x67821367

    .line 1210
    invoke-static {v0, v4}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 1211
    :cond_2
    :goto_2
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_7

    .line 1212
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v4

    .line 1213
    new-instance v5, Ll/᩹ܶᩳ;

    invoke-direct {v5}, Ll/᩹ܶᩳ;-><init>()V

    .line 122
    invoke-virtual {v5}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    if-nez v6, :cond_6

    .line 125
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    .line 126
    array-length v7, v4

    invoke-virtual {v6, v4, v1, v7}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 127
    invoke-virtual {v6, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 128
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 129
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 130
    invoke-virtual {v5, v4}, Ll/ۡ᩻֫;->setArguments(Landroid/os/Bundle;)V

    .line 131
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 1215
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v4

    invoke-virtual {v5}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ۚۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v4

    if-eqz v3, :cond_5

    if-eqz v4, :cond_4

    .line 1218
    check-cast v4, Ll/᩹ܶᩳ;

    .line 1220
    invoke-virtual {v4}, Ll/֫ۘᩳ;->ۧ()Z

    move-result v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-nez v5, :cond_3

    .line 1222
    :try_start_4
    invoke-virtual {v4}, Ll/֫ۘᩳ;->ᩴ()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    .line 1224
    :try_start_5
    iget-object v6, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    invoke-virtual {v6, v5}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 1227
    :cond_3
    :goto_3
    invoke-virtual {v4}, Ll/֫ۘᩳ;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1228
    iget-object v5, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1231
    :cond_4
    invoke-virtual {v5}, Ll/֫ۘᩳ;->ᩴ()V

    .line 1232
    invoke-virtual {v5}, Ll/֫ۘᩳ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1233
    iget-object v4, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1237
    :cond_5
    invoke-static {v4}, Ll/۫ۙ;->ۧ(Ljava/lang/Object;)V

    .line 1238
    invoke-virtual {v5}, Ll/֫ۘᩳ;->ᩴ()V

    .line 1239
    invoke-virtual {v5}, Ll/֫ۘᩳ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1240
    iget-object v4, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 123
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "Arguments is not null."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    move-exception v0

    .line 1245
    iget-object v3, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    invoke-virtual {v3, v0}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 1248
    :cond_7
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩹ۧ:Ll/᩶ܶᩳ;

    iget-boolean v3, v0, Ll/᩶ܶᩳ;->ۗ:Z

    if-eqz v3, :cond_9

    .line 1249
    iput-boolean v1, v0, Ll/᩶ܶᩳ;->ۗ:Z

    .line 1250
    invoke-static {}, Ll/ᩳۚᩳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 413
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 1251
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "current|list"

    .line 51
    invoke-static {v4}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    .line 1253
    :goto_4
    iget-object v5, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    .line 1254
    iget-object v5, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܶᩳ;

    invoke-virtual {v5}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v5

    .line 55
    invoke-static {v5}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1256
    :cond_8
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v4, Ll/ܶۚᩳ;

    invoke-direct {v4, v3}, Ll/ܶۚᩳ;-><init>(Ljava/util/ArrayList;)V

    invoke-interface {v0, v4}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/᩻۠᩷;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/᩻۠᩷;-><init>(I)V

    .line 1265
    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 926
    :cond_9
    :goto_5
    new-instance v0, Ll/ۤۚᩳ;

    invoke-direct {v0, p0}, Ll/ۤۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    const v0, 0x7f0a0486

    .line 927
    invoke-virtual {p0, v0}, Ll/֨ܿ;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۬۬ۧ;

    iput-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    .line 928
    iget-object v3, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {v0, v3}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 929
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    new-instance v3, Ll/ۜۗۧ;

    invoke-direct {v3, p0}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 931
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    const-wide/16 v3, 0xc8

    invoke-virtual {v0, v3, v4}, Ll/᩺ۗۧ;->֫(J)V

    .line 932
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/᩺ۗۧ;->ᩳ(J)V

    .line 933
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/᩺ۗۧ;->ܽ(J)V

    .line 934
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/᩺ۗۧ;->ۧ(J)V

    .line 935
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩵ۧ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v3, Ll/ܳۚᩳ;

    invoke-direct {v3, p0}, Ll/ܳۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 936
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    new-instance v3, Ll/ۙۚᩳ;

    invoke-direct {v3, p0}, Ll/ۙۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-virtual {v0, v3}, Ll/۬۬ۧ;->addOnScrollListener(Ll/ۢ۬ۧ;)V

    .line 943
    iget-object v0, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    new-instance v3, Ll/ۚۡۡ;

    iget-object v4, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ll/᩻ۚᩳ;

    invoke-direct {v5, v4}, Ll/᩻ۚᩳ;-><init>(Ll/ܽۢۡ;)V

    invoke-direct {v3, v0, v5}, Ll/ۚۡۡ;-><init>(Ll/۬۬ۧ;Ljava/util/function/BooleanSupplier;)V

    invoke-virtual {v0, v3}, Ll/۬۬ۧ;->addOnItemTouchListener(Ll/᩷۬ۧ;)V

    .line 944
    new-instance v0, Ll/֫ۗۧ;

    new-instance v3, Ll/۬ۚᩳ;

    invoke-direct {v3, p0}, Ll/۬ۚᩳ;-><init>(Ll/ܽ֨ᩳ;)V

    invoke-direct {v0, v3}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/ܽ֨ᩳ;->ۘۧ:Ll/֫ۗۧ;

    .line 990
    iget-object v3, p0, Ll/ܽ֨ᩳ;->֡ۧ:Ll/۬۬ۧ;

    invoke-virtual {v0, v3}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 991
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    iget-object v3, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {v0, v3}, Ll/ܽۢۡ;->֫(Ll/᩶ۗۧ;)V

    .line 992
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    iget-object v3, p0, Ll/ܽ֨ᩳ;->ۘۧ:Ll/֫ۗۧ;

    invoke-virtual {v0, v3}, Ll/ܽۢۡ;->֫(Ll/֫ۗۧ;)V

    .line 227
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    if-nez p1, :cond_a

    .line 231
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1, v1, v2}, Ll/ܽ֨ᩳ;->֫(Landroid/content/Intent;ZZ)Z

    move-result p1

    goto :goto_6

    :cond_a
    const/4 p1, 0x0

    :goto_6
    if-nez p1, :cond_b

    .line 413
    iget p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_b

    .line 416
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܽ֫()I

    move-result p1

    if-eq p1, v0, :cond_b

    .line 1100
    invoke-direct {p0, p1, v1}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    :cond_b
    return-void

    :catchall_0
    move-exception p1

    .line 1206
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 260
    invoke-super {p0, p1}, Ll/᩻ܽ;->onNewIntent(Landroid/content/Intent;)V

    .line 261
    iget-boolean v0, p0, Ll/ܽ֨ᩳ;->ۖۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 269
    invoke-direct {p0, p1, v0, v0}, Ll/ܽ֨ᩳ;->֫(Landroid/content/Intent;ZZ)Z

    return-void
.end method

.method public final onPause()V
    .locals 0

    .line 563
    invoke-super {p0}, Ll/ۗܺ᩷;->onPause()V

    .line 564
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܿ֫()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 557
    invoke-super {p0, p1}, Ll/᩻ܽ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 558
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܿ֫()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    const/4 v0, 0x0

    .line 240
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ۢۧ:Z

    .line 241
    invoke-super {p0}, Ll/ۗܺ᩷;->onStop()V

    return-void
.end method

.method public final ֫(Landroid/view/MenuItem;)V
    .locals 3

    .line 571
    sget-object v0, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 574
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a016c

    if-ne v0, v1, :cond_1

    .line 576
    iget-object p1, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    const/4 v0, 0x1

    .line 77
    invoke-virtual {p1, v0}, Ll/ܽۢۡ;->֫(Z)V

    return-void

    .line 577
    :cond_1
    iget-object v1, p0, Ll/ܽ֨ᩳ;->ܶۧ:Ll/ܽۢۡ;

    invoke-virtual {v1}, Ll/ܽۢۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const v1, 0x7f0a0376

    .line 579
    iget-object v2, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    if-ne v0, v1, :cond_6

    .line 595
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 596
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 597
    invoke-virtual {v1}, Ll/֫ۘᩳ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ll/֫ۘᩳ;->ۖ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 2122
    new-instance v2, Ll/ܶܶᩳ;

    invoke-direct {v2, v1, p0}, Ll/ܶܶᩳ;-><init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;)V

    .line 598
    invoke-virtual {p1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 601
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    const p1, 0x7f1208d1

    .line 602
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 605
    :cond_5
    new-instance v0, Ll/᩶ۚᩳ;

    invoke-direct {v0, p0, p1}, Ll/᩶ۚᩳ;-><init>(Ll/ܽ֨ᩳ;Ljava/util/LinkedList;)V

    .line 644
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_6
    const v1, 0x7f0a0336

    if-ne v0, v1, :cond_7

    .line 582
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->᩺()V

    .line 583
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->ۨ()V

    return-void

    :cond_7
    const v1, 0x7f0a0380

    if-ne v0, v1, :cond_8

    .line 585
    iget v0, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܶᩳ;

    .line 586
    invoke-virtual {v0, p1}, Ll/᩹ܶᩳ;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    :cond_8
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩹ܶᩳ;)V
    .locals 6

    .line 1052
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_9

    .line 1055
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1056
    :goto_0
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 1057
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v4, :cond_3

    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-ne v1, v2, :cond_3

    if-lez v2, :cond_1

    sub-int/2addr v2, v4

    .line 1059
    invoke-direct {p0, v2, v4}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    goto :goto_1

    :cond_1
    add-int/2addr v2, v4

    .line 1061
    invoke-direct {p0, v2, v4}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    .line 1063
    :goto_1
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-eq v1, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 1066
    :cond_3
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v2

    invoke-virtual {p1}, Ll/֫ۘᩳ;->ۜ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/ۚۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v2

    if-eqz v2, :cond_5

    if-ne p1, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    .line 1068
    :goto_3
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 1069
    invoke-virtual {p0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۜ֫;->ۧ()Ll/ܽ᩷֫;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ܽ᩷֫;->ܽ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;

    invoke-virtual {v2}, Ll/ܽ᩷֫;->ۧ()I

    goto :goto_5

    .line 1071
    :cond_5
    invoke-virtual {p1}, Ll/ۡ᩻֫;->isAdded()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, Ll/ۡ᩻֫;->isDetached()Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 1074
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1075
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-ge v1, v2, :cond_7

    sub-int/2addr v2, v4

    .line 1076
    iput v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 1077
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 1078
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ۜ֫()V

    .line 1080
    :cond_7
    iget-object v2, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    invoke-virtual {v2, v1}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    .line 1081
    invoke-virtual {p1}, Ll/᩹ܶᩳ;->ۚ()V

    .line 1083
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    .line 1084
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1085
    invoke-virtual {p0, v3}, Ll/ܽ֨ᩳ;->֫(Z)V

    :cond_8
    return-void

    .line 1053
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 494
    invoke-virtual {p0}, Ll/ܽ֨ᩳ;->۟()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f12079b

    .line 495
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 497
    :cond_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "exitToExternalApp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ll/ܽ֨ᩳ;->ۢۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 498
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܿ֫()V

    .line 499
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 500
    iget-boolean p1, p0, Ll/ܽ֨ᩳ;->ۢۧ:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 501
    invoke-virtual {p0, p1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    :cond_1
    return-void
.end method

.method public final ֫֫()V
    .locals 1

    .line 911
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ᩳۧ:Ll/ۤۚᩳ;

    if-eqz v0, :cond_0

    .line 912
    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TextEditor"

    return-object v0
.end method

.method public final ۜ(I)V
    .locals 5

    .line 713
    invoke-direct {p0, p1}, Ll/ܽ֨ᩳ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e5

    .line 716
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03b2

    .line 717
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1207d7

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00d9

    .line 718
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 719
    new-instance v2, Ll/ۜۚᩳ;

    invoke-direct {v2, p0, p1, v0}, Ll/ۜۚᩳ;-><init>(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V

    .line 733
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 734
    invoke-virtual {p1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 735
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 736
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ۟()Z
    .locals 3

    .line 480
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "double_confirm_before_exit"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 481
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩷ۧ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    return v0

    :cond_0
    return v2
.end method

.method public final ۧ(Ll/᩹ܶᩳ;)V
    .locals 1

    .line 1093
    iget-object v0, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    .line 1100
    invoke-direct {p0, p1, v0}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    :cond_0
    return-void
.end method

.method public final ۧ(Z)V
    .locals 6

    .line 510
    iget-boolean v0, p0, Ll/ܽ֨ᩳ;->ۚۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 512
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ۚۧ:Z

    .line 514
    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    if-eqz p1, :cond_7

    .line 515
    iget p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶᩳ;

    .line 516
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 517
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ܶᩳ;

    .line 518
    invoke-virtual {v4}, Ll/᩹ܶᩳ;->ܺ()Z

    move-result v5

    if-eqz v5, :cond_1

    if-eq v4, p1, :cond_1

    invoke-virtual {v4}, Ll/֫ۘᩳ;->᩷()Z

    move-result v5

    if-nez v5, :cond_1

    .line 519
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 522
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    xor-int/lit8 v4, v3, 0x1

    if-nez v3, :cond_4

    .line 524
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܶᩳ;

    .line 525
    invoke-virtual {v5}, Ll/᩹ܶᩳ;->ۚ()V

    goto :goto_1

    .line 527
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 528
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iput v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 530
    :cond_4
    invoke-virtual {p1}, Ll/᩹ܶᩳ;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 531
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 532
    iget v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-lez v1, :cond_5

    sub-int/2addr v1, v0

    .line 533
    iput v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 534
    :cond_5
    invoke-virtual {p1}, Ll/᩹ܶᩳ;->ۚ()V

    goto :goto_2

    :cond_6
    move v0, v4

    :goto_2
    if-eqz v0, :cond_9

    .line 538
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 539
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    goto :goto_3

    .line 542
    :cond_7
    iget p1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܶᩳ;

    .line 543
    invoke-virtual {p1}, Ll/᩹ܶᩳ;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 544
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 545
    iget v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    if-lez v1, :cond_8

    sub-int/2addr v1, v0

    .line 546
    iput v1, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 547
    :cond_8
    invoke-virtual {p1}, Ll/᩹ܶᩳ;->ۚ()V

    .line 548
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ᩳ֫()V

    .line 549
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    :cond_9
    :goto_3
    const/4 p1, 0x0

    .line 552
    invoke-virtual {p0, p1}, Ll/ܽ֨ᩳ;->֫(Z)V

    return-void
.end method

.method public final ۨ()V
    .locals 4

    .line 1041
    new-instance v0, Ll/᩹ܶᩳ;

    invoke-direct {v0}, Ll/᩹ܶᩳ;-><init>()V

    const/4 v1, 0x0

    .line 1042
    invoke-virtual {v0, v1}, Ll/֫ۘᩳ;->ۧ(Ljava/lang/String;)V

    const-string v1, "filePath"

    const-string v2, "untitled"

    .line 1043
    iget-object v3, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1160
    iget-object v1, p0, Ll/ܽ֨ᩳ;->ۡۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    .line 1161
    iput v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    .line 1163
    :cond_0
    iget v2, p0, Ll/ܽ֨ᩳ;->ܿۧ:I

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Ll/ܽ֨ᩳ;->֫(IZ)I

    move-result v2

    .line 1045
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1046
    invoke-direct {p0}, Ll/ܽ֨ᩳ;->ܳ֫()V

    new-array v1, v3, [Ljava/lang/String;

    .line 353
    invoke-virtual {v0, v1}, Ll/᩹ܶᩳ;->֫([Ljava/lang/String;)V

    .line 1100
    invoke-direct {p0, v2, v3}, Ll/ܽ֨ᩳ;->ۧ(IZ)V

    return-void
.end method

.method public final ܰ()Z
    .locals 1

    .line 706
    iget-boolean v0, p0, Ll/ܽ֨ᩳ;->ܳۧ:Z

    return v0
.end method

.method public final ܳ(I)V
    .locals 5

    .line 788
    invoke-direct {p0, p1}, Ll/ܽ֨ᩳ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e5

    .line 791
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03b2

    .line 792
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1207d0

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00d9

    .line 793
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 794
    new-instance v2, Ll/ܺۚᩳ;

    invoke-direct {v2, p0, p1, v0, v4}, Ll/ܺۚᩳ;-><init>(Ll/ۗܺ᩷;ILandroid/widget/CheckBox;I)V

    .line 807
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 808
    invoke-virtual {p1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 809
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 810
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ܽ(Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 269
    invoke-direct {p0, p1, v0, v0}, Ll/ܽ֨ᩳ;->֫(Landroid/content/Intent;ZZ)Z

    return-void
.end method

.method public final ܿ(I)V
    .locals 1

    .line 431
    iget-object p1, p0, Ll/ܽ֨ᩳ;->ᩴۧ:Ll/۠۬᩷;

    if-eqz p1, :cond_0

    const v0, 0x7f0d0054

    .line 432
    invoke-virtual {p1, p0, v0}, Ll/۠۬᩷;->֫(Ll/ۗܺ᩷;I)V

    :cond_0
    return-void
.end method

.method public final ᩳ(I)Landroid/view/View;
    .locals 1

    .line 440
    iget-object p1, p0, Ll/ܽ֨ᩳ;->ᩴۧ:Ll/۠۬᩷;

    if-eqz p1, :cond_0

    const v0, 0x7f0d0054

    .line 441
    invoke-virtual {p1, v0}, Ll/۠۬᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x0

    .line 489
    iput-boolean v0, p0, Ll/ܽ֨ᩳ;->ۢۧ:Z

    .line 490
    invoke-virtual {p0, v0}, Ll/ܽ֨ᩳ;->֫(Z)V

    return-void
.end method

.method public final ᩺()V
    .locals 2

    .line 920
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 921
    iget-object v0, p0, Ll/ܽ֨ᩳ;->᩻ۧ:Ll/۬ۧ֫;

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ᩻(I)V
    .locals 5

    .line 817
    invoke-direct {p0, p1}, Ll/ܽ֨ᩳ;->᩷(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e5

    .line 820
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03b2

    .line 821
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1207d4

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00d9

    .line 822
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 823
    new-instance v2, Ll/ۢۚᩳ;

    invoke-direct {v2, p0, p1, v0}, Ll/ۢۚᩳ;-><init>(Ll/ܽ֨ᩳ;ILandroid/widget/CheckBox;)V

    .line 836
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 837
    invoke-virtual {p1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 838
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 839
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
