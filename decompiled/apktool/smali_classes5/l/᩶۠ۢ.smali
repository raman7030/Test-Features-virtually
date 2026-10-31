.class public final Ll/᩶۠ۢ;
.super Ll/᩶ۗۧ;
.source "998H"


# instance fields
.field public final synthetic ֫:Ll/᩷ܶۢ;


# direct methods
.method public constructor <init>(Ll/᩷ܶۢ;)V
    .locals 0

    .line 160
    iput-object p1, p0, Ll/᩶۠ۢ;->֫:Ll/᩷ܶۢ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 179
    iget-object v0, p0, Ll/᩶۠ۢ;->֫:Ll/᩷ܶۢ;

    invoke-static {v0}, Ll/᩷ܶۢ;->ᩳ(Ll/᩷ܶۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 160
    check-cast p1, Ll/ۜܶۢ;

    .line 169
    iget-object v0, p0, Ll/᩶۠ۢ;->֫:Ll/᩷ܶۢ;

    invoke-static {v0}, Ll/᩷ܶۢ;->ᩳ(Ll/᩷ܶۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ۠ۢ;

    invoke-virtual {p1, p2}, Ll/ۜܶۢ;->֫(Ll/ۘ۠ۢ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    .line 164
    new-instance p2, Ll/ۜܶۢ;

    iget-object v0, p0, Ll/᩶۠ۢ;->֫:Ll/᩷ܶۢ;

    invoke-static {v0}, Ll/᩷ܶۢ;->֫(Ll/᩷ܶۢ;)Lbin/mt/plus/Main;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ۜܶۢ;-><init>(Lbin/mt/plus/Main;Landroid/view/ViewGroup;)V

    return-object p2
.end method

.method public final onViewRecycled(Ll/ۗ۬ۧ;)V
    .locals 1

    .line 160
    check-cast p1, Ll/ۜܶۢ;

    const/4 v0, 0x0

    .line 174
    invoke-virtual {p1, v0}, Ll/ۜܶۢ;->֫(Ll/ۘ۠ۢ;)V

    return-void
.end method
