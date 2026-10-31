.class public final Ll/ᩳ᩸ܳ;
.super Ll/᩶ۗۧ;
.source "J7C4"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 92
    iput-object p1, p0, Ll/ᩳ᩸ܳ;->֫:Ll/ۗܺ᩷;

    .line 93
    iput-object p2, p0, Ll/ᩳ᩸ܳ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ᩳ᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 1

    .line 86
    check-cast p1, Ll/ܿ᩸ܳ;

    .line 109
    iget-object v0, p0, Ll/ᩳ᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܰܶܳ;

    iget-object v0, p0, Ll/ᩳ᩸ܳ;->ܽ:Ll/֫ۗۧ;

    invoke-virtual {p1, p2, v0}, Ll/ܿ᩸ܳ;->֫(Ll/ܰܶܳ;Ll/֫ۗۧ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 103
    iget-object p2, p0, Ll/ᩳ᩸ܳ;->֫:Ll/ۗܺ᩷;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0162

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 104
    new-instance v0, Ll/ܿ᩸ܳ;

    invoke-direct {v0, p2, p1}, Ll/ܿ᩸ܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    return-object v0
.end method

.method public final ֫(Ll/֫ۗۧ;)V
    .locals 0

    .line 97
    iput-object p1, p0, Ll/ᩳ᩸ܳ;->ܽ:Ll/֫ۗۧ;

    return-void
.end method
