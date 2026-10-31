.class public final Ll/֨۟ܳ;
.super Landroid/widget/ArrayAdapter;
.source "895N"


# instance fields
.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 2

    const v0, 0x7f0d01c8

    const v1, 0x1020014

    .line 64
    invoke-direct {p0, p1, v0, v1, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    .line 65
    iput-object p3, p0, Ll/֨۟ܳ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 86
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 87
    invoke-virtual {p0, p1}, Ll/֨۟ܳ;->isEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 88
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    return-object p2

    :cond_0
    const p1, 0x3e99999a    # 0.3f

    .line 90
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    return-object p2
.end method

.method public final hasStableIds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/֨۟ܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
