.class public final Ll/ۢۢۢ;
.super Ll/᩶ۗۧ;
.source "K1PX"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ll/۠ۢۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;)V
    .locals 0

    .line 389
    iput-object p1, p0, Ll/ۢۢۢ;->ۧ:Ll/۠ۢۢ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 390
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۢۢۢ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 412
    iget-object v0, p0, Ll/ۢۢۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 386
    check-cast p1, Ll/ۡۢۢ;

    .line 401
    iget-object v0, p0, Ll/ۢۢۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۢۢ;

    .line 402
    iput-object p2, p1, Ll/ۡۢۢ;->᩸:Ll/ᩳۢۢ;

    .line 403
    iget-object v0, p1, Ll/ۡۢۢ;->᩶:Landroid/widget/ImageView;

    iget-object v1, p2, Ll/ᩳۢۢ;->ܽ:Ll/֡᩻;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    .line 404
    iput-boolean v0, p2, Ll/ᩳۢۢ;->ۧ:Z

    .line 405
    iget-object v0, p1, Ll/ۡۢۢ;->᩹:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ᩳۢۢ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 406
    iget-object v0, p1, Ll/ۡۢۢ;->ۗ:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ᩳۢۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    iget-object p1, p1, Ll/ۡۢۢ;->ۙ:Landroid/widget/TextView;

    iget-object p2, p2, Ll/ᩳۢۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    .line 396
    new-instance p2, Ll/ۡۢۢ;

    iget-object v0, p0, Ll/ۢۢۢ;->ۧ:Ll/۠ۢۢ;

    invoke-direct {p2, v0, p1}, Ll/ۡۢۢ;-><init>(Ll/۠ۢۢ;Landroid/view/ViewGroup;)V

    return-object p2
.end method
