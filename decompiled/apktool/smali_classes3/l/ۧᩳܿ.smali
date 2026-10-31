.class public final Ll/ۧᩳܿ;
.super Landroid/widget/BaseAdapter;
.source "R16R"


# instance fields
.field public ᩸:Landroid/content/Context;

.field public final synthetic ᩹:Ll/ᩳᩳܿ;


# direct methods
.method public constructor <init>(Ll/ᩳᩳܿ;Landroid/content/Context;)V
    .locals 0

    .line 218
    iput-object p1, p0, Ll/ۧᩳܿ;->᩹:Ll/ᩳᩳܿ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 219
    iput-object p2, p0, Ll/ۧᩳܿ;->᩸:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ۧᩳܿ;->᩹:Ll/ᩳᩳܿ;

    invoke-static {v0}, Ll/ᩳᩳܿ;->ܽ(Ll/ᩳᩳܿ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Ll/ᩳᩳܿ;->ܽ(Ll/ᩳᩳܿ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ۧᩳܿ;->᩹:Ll/ᩳᩳܿ;

    invoke-static {v0}, Ll/ᩳᩳܿ;->ܽ(Ll/ᩳᩳܿ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 241
    iget-object p2, p0, Ll/ۧᩳܿ;->᩸:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d014d

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 243
    :cond_0
    move-object p3, p2

    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 244
    iget-object v0, p0, Ll/ۧᩳܿ;->᩹:Ll/ᩳᩳܿ;

    invoke-static {v0}, Ll/ᩳᩳܿ;->ܽ(Ll/ᩳᩳܿ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    invoke-static {v0}, Ll/ᩳᩳܿ;->ۧ(Ll/ᩳᩳܿ;)Landroid/text/TextUtils$TruncateAt;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 247
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    :cond_1
    return-object p2
.end method
