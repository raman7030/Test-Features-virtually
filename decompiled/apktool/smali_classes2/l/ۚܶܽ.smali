.class public final Ll/ۚܶܽ;
.super Landroid/widget/BaseAdapter;
.source "4646"


# instance fields
.field public final synthetic ᩸:Ll/۠ܶܽ;


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;)V
    .locals 0

    .line 347
    iput-object p1, p0, Ll/ۚܶܽ;->᩸:Ll/۠ܶܽ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .line 351
    iget-object v0, p0, Ll/ۚܶܽ;->᩸:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-boolean v1, v1, Ll/֨ܶܽ;->ۨ:Z

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    if-eqz v1, :cond_0

    iget v0, v0, Ll/֨ܶܽ;->ۛ:I

    return v0

    :cond_0
    iget-object v0, v0, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v0, v0, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/۬ܿܽ;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 367
    iget-object v0, p0, Ll/ۚܶܽ;->᩸:Ll/۠ܶܽ;

    if-nez p2, :cond_0

    .line 368
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0147

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const p3, 0x7f0a05e4

    .line 369
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 370
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 372
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 373
    :goto_0
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-boolean v1, v1, Ll/֨ܶܽ;->ۨ:Z

    if-eqz v1, :cond_1

    .line 374
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v1, v1, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    iget-object v0, v0, Ll/֨ܶܽ;->ۤ:[I

    aget p1, v0, p1

    invoke-virtual {v1, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    .line 376
    :cond_1
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    iget-object v0, v0, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v0, v0, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
