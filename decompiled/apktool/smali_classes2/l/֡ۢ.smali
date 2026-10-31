.class public final Ll/֡ۢ;
.super Landroid/widget/BaseAdapter;
.source "S696"


# instance fields
.field public final synthetic ᩸:Ll/۠ۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢ;)V
    .locals 0

    .line 691
    iput-object p1, p0, Ll/֡ۢ;->᩸:Ll/۠ۢ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    const/4 v0, 0x0

    .line 722
    throw v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    .line 740
    throw p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 769
    iget-object p1, p0, Ll/֡ۢ;->᩸:Ll/۠ۢ;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a02e4

    if-eq v0, v1, :cond_1

    .line 770
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0007

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 773
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    const p1, 0x7f0a0278

    .line 775
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const/4 p1, 0x0

    .line 740
    throw p1
.end method

.method public final getViewTypeCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
