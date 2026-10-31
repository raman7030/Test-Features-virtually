.class public final Ll/۠ۜۡ;
.super Ll/᩶ۗۧ;
.source "A91T"


# instance fields
.field public final synthetic ֫:Ll/ܶۜۡ;


# direct methods
.method public constructor <init>(Ll/ܶۜۡ;)V
    .locals 0

    .line 134
    iput-object p1, p0, Ll/۠ۜۡ;->֫:Ll/ܶۜۡ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 150
    iget-object v0, p0, Ll/۠ۜۡ;->֫:Ll/ܶۜۡ;

    invoke-static {v0}, Ll/ܶۜۡ;->ܿ(Ll/ܶۜۡ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 134
    check-cast p1, Ll/ۘۜۡ;

    .line 145
    iget-object v0, p0, Ll/۠ۜۡ;->֫:Ll/ܶۜۡ;

    invoke-static {v0}, Ll/ܶۜۡ;->ܿ(Ll/ܶۜۡ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖۜۡ;

    invoke-virtual {p1, p2}, Ll/ۘۜۡ;->֫(Ll/ۖۜۡ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 139
    iget-object p2, p0, Ll/۠ۜۡ;->֫:Ll/ܶۜۡ;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0140

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 140
    new-instance v0, Ll/ۘۜۡ;

    invoke-static {p2}, Ll/ܶۜۡ;->ۧ(Ll/ܶۜۡ;)Ll/ܺ᩶ۘ;

    move-result-object v1

    invoke-direct {v0, p2, v1, p1}, Ll/ۘۜۡ;-><init>(Ll/ۗܺ᩷;Ll/ܺ᩶ۘ;Landroid/view/View;)V

    return-object v0
.end method
