.class public final Ll/۟ۗ᩻;
.super Ll/᩶ۗۧ;
.source "D7B1"


# instance fields
.field public final synthetic ֫:Ll/ۧ۬᩻;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۧ۬᩻;)V
    .locals 0

    .line 387
    iput-object p1, p0, Ll/۟ۗ᩻;->֫:Ll/ۧ۬᩻;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 388
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۟ۗ᩻;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 422
    iget-object v0, p0, Ll/۟ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 387
    check-cast p1, Ll/֫۬᩻;

    .line 417
    iget-object v0, p0, Ll/۟ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷ۨ᩻;

    invoke-virtual {p1, p2}, Ll/֫۬᩻;->֫(Ll/᩷ۨ᩻;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    const p2, 0x7f0d0144

    const/4 v0, 0x0

    .line 0
    invoke-static {p1, p2, p1, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 412
    new-instance p2, Ll/֫۬᩻;

    iget-object v0, p0, Ll/۟ۗ᩻;->֫:Ll/ۧ۬᩻;

    invoke-direct {p2, v0, p1}, Ll/֫۬᩻;-><init>(Ll/ۧ۬᩻;Landroid/view/View;)V

    return-object p2
.end method

.method public final ֫()V
    .locals 1

    .line 403
    iget-object v0, p0, Ll/۟ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 404
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 1

    .line 394
    iget-object v0, p0, Ll/۟ۗ᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 395
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 396
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
