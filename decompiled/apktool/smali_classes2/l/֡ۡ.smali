.class public final Ll/֡ۡ;
.super Ljava/lang/Object;
.source "N5WL"

# interfaces
.implements Ll/ۙۡ;
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/ۗۡ;

.field public ᩶:Ljava/lang/CharSequence;

.field public ᩸:Landroid/widget/ListAdapter;

.field public ᩹:Ll/᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۗۡ;)V
    .locals 0

    .line 846
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۡ;->ۙ:Ll/ۗۡ;

    return-void
.end method


# virtual methods
.method public final dismiss()V
    .locals 1

    .line 854
    iget-object v0, p0, Ll/֡ۡ;->᩹:Ll/᩵ܿ;

    if-eqz v0, :cond_0

    .line 855
    invoke-virtual {v0}, Ll/۠ܳ;->dismiss()V

    const/4 v0, 0x0

    .line 856
    iput-object v0, p0, Ll/֡ۡ;->᩹:Ll/᩵ܿ;

    :cond_0
    return-void
.end method

.method public final getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isShowing()Z
    .locals 1

    .line 862
    iget-object v0, p0, Ll/֡ۡ;->᩹:Ll/᩵ܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 899
    iget-object p1, p0, Ll/֡ۡ;->ۙ:Ll/ۗۡ;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 900
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 901
    iget-object v0, p0, Ll/֡ۡ;->᩸:Landroid/widget/ListAdapter;

    invoke-interface {v0, p2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 903
    :cond_0
    invoke-virtual {p0}, Ll/֡ۡ;->dismiss()V

    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(II)V
    .locals 3

    .line 882
    iget-object v0, p0, Ll/֡ۡ;->᩸:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    return-void

    .line 885
    :cond_0
    new-instance v0, Ll/ᩴܿ;

    iget-object v1, p0, Ll/֡ۡ;->ۙ:Ll/ۗۡ;

    invoke-virtual {v1}, Ll/ۗۡ;->getPopupContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ᩴܿ;-><init>(Landroid/content/Context;)V

    .line 886
    iget-object v2, p0, Ll/֡ۡ;->᩶:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    .line 887
    invoke-virtual {v0, v2}, Ll/ᩴܿ;->setTitle(Ljava/lang/CharSequence;)Ll/ᩴܿ;

    .line 889
    :cond_1
    iget-object v2, p0, Ll/֡ۡ;->᩸:Landroid/widget/ListAdapter;

    .line 890
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    .line 889
    invoke-virtual {v0, v2, v1, p0}, Ll/ᩴܿ;->setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;

    move-result-object v0

    .line 890
    invoke-virtual {v0}, Ll/ᩴܿ;->create()Ll/᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۡ;->᩹:Ll/᩵ܿ;

    .line 891
    invoke-virtual {v0}, Ll/᩵ܿ;->֫()Ll/ۖܿ;

    move-result-object v0

    .line 892
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 893
    invoke-virtual {v0, p2}, Landroid/view/View;->setTextAlignment(I)V

    .line 894
    iget-object p1, p0, Ll/֡ۡ;->᩹:Ll/᩵ܿ;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final ֫(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 867
    iput-object p1, p0, Ll/֡ۡ;->᩸:Landroid/widget/ListAdapter;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 872
    iput-object p1, p0, Ll/֡ۡ;->᩶:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ۧ()Ljava/lang/CharSequence;
    .locals 1

    .line 877
    iget-object v0, p0, Ll/֡ۡ;->᩶:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    return-void
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method
