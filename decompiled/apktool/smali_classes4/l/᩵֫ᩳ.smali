.class public final Ll/᩵֫ᩳ;
.super Landroid/widget/BaseAdapter;
.source "B9R5"


# instance fields
.field public final synthetic ᩸:Ll/֨֫ᩳ;


# direct methods
.method public constructor <init>(Ll/֨֫ᩳ;)V
    .locals 0

    .line 535
    iput-object p1, p0, Ll/᩵֫ᩳ;->᩸:Ll/֨֫ᩳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 539
    iget-object v0, p0, Ll/᩵֫ᩳ;->᩸:Ll/֨֫ᩳ;

    invoke-static {v0}, Ll/֨֫ᩳ;->ܽ(Ll/֨֫ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

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

    .line 555
    iget-object v0, p0, Ll/᩵֫ᩳ;->᩸:Ll/֨֫ᩳ;

    if-nez p2, :cond_0

    .line 556
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0145

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 557
    new-instance p3, Ll/֡֫ᩳ;

    invoke-direct {p3, p2}, Ll/֡֫ᩳ;-><init>(Landroid/view/View;)V

    .line 558
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 560
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֡֫ᩳ;

    .line 561
    :goto_0
    iget-object p3, p3, Ll/֡֫ᩳ;->֫:Landroid/widget/TextView;

    invoke-static {v0}, Ll/֨֫ᩳ;->ܽ(Ll/֨֫ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
