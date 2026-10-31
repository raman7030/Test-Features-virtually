.class public Ll/ܶ֨ܿ;
.super Ll/ۗܺ᩷;
.source "G135"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# static fields
.field public static final synthetic ۜۧ:I


# instance fields
.field public ܳۧ:Landroid/widget/TextView;

.field public ܿۧ:Ll/۬᩵;

.field public ᩳۧ:Ll/۠֨ܿ;

.field public ᩻ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 27
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܶ֨ܿ;->᩻ۧ:Ljava/util/List;

    .line 28
    new-instance v0, Ll/۬᩵;

    invoke-direct {v0}, Ll/۬᩵;-><init>()V

    iput-object v0, p0, Ll/ܶ֨ܿ;->ܿۧ:Ll/۬᩵;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ֨ܿ;)Ll/۠֨ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܶ֨ܿ;I)V
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ܶ֨ܿ;->᩻ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ֨ܿ;

    .line 78
    iget-object v1, p0, Ll/ܶ֨ܿ;->ܿۧ:Ll/۬᩵;

    invoke-virtual {v1, p1}, Ll/۬᩵;->ܽ(I)V

    .line 79
    invoke-virtual {v0}, Ll/ۖ֨ܿ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۖ֨ܿ;->ᩳ(Ljava/lang/String;)V

    .line 80
    iget-object p0, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶ֨ܿ;)Ll/۬᩵;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܿ;->ܿۧ:Ll/۬᩵;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܶ֨ܿ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܿ;->ܳۧ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܶ֨ܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܿ;->᩻ۧ:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 37
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f120714

    .line 38
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0d0034

    .line 39
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 40
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const p1, 0x7f0a0190

    .line 41
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܶ֨ܿ;->ܳۧ:Landroid/widget/TextView;

    const v0, 0x7f1206ec

    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    const p1, 0x102000a

    .line 43
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    .line 44
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 45
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 46
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v1, Ll/ܽܶۜ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ܽܶۜ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    new-instance v0, Ll/۠֨ܿ;

    invoke-direct {v0, p0}, Ll/۠֨ܿ;-><init>(Ll/ܶ֨ܿ;)V

    iput-object v0, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 48
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 49
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 50
    iget-object p1, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    new-instance v0, Ll/֨֨ܿ;

    invoke-direct {v0, p0}, Ll/֨֨ܿ;-><init>(Ll/ܶ֨ܿ;)V

    invoke-virtual {p1, v0}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 56
    iget-object p1, p0, Ll/ܶ֨ܿ;->ܳۧ:Landroid/widget/TextView;

    iget-object v0, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    invoke-virtual {v0}, Ll/۠֨ܿ;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    return-void
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1

    .line 73
    new-instance p1, Ll/᩸ۖ;

    const/4 p4, 0x0

    .line 68
    invoke-direct {p1, p0, p2, p4}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 74
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p5

    const v0, 0x7f1205ca

    invoke-interface {p5, p4, v0, p4, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p4

    const p5, 0x7f0801e6

    invoke-interface {p4, p5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 75
    invoke-virtual {p1}, Ll/᩸ۖ;->ᩳ()V

    .line 76
    new-instance p4, Ll/ۚ֨ܿ;

    invoke-direct {p4, p0, p3}, Ll/ۚ֨ܿ;-><init>(Ll/ܶ֨ܿ;I)V

    invoke-virtual {p1, p4}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 83
    invoke-static {p2, p1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onResume()V
    .locals 1

    .line 61
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 62
    invoke-static {}, Ll/ۖ֨ܿ;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֨ܿ;->᩻ۧ:Ljava/util/List;

    .line 63
    iget-object v0, p0, Ll/ܶ֨ܿ;->ܿۧ:Ll/۬᩵;

    invoke-virtual {v0}, Ll/۬᩵;->֫()V

    .line 64
    iget-object v0, p0, Ll/ܶ֨ܿ;->ᩳۧ:Ll/۠֨ܿ;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "OpenMethodManager"

    return-object v0
.end method
