.class public final Ll/᩻ܳܿ;
.super Ljava/lang/Object;
.source "4AWI"


# instance fields
.field public ֫:Ll/۟ܿܿ;

.field public ۜ:I

.field public final synthetic ۢ:Ll/֡ܳܿ;

.field public ۧ:I

.field public final ܳ:I

.field public ܽ:Ljava/util/BitSet;

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:Ll/۬۬ۧ;

.field public ᩻:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;I)V
    .locals 2

    .line 901
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    .line 892
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    .line 902
    iput p2, p0, Ll/᩻ܳܿ;->ܳ:I

    const p2, 0x7f0d01e2

    .line 903
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/۬۬ۧ;

    iput-object p2, p0, Ll/᩻ܳܿ;->᩷:Ll/۬۬ۧ;

    .line 905
    new-instance v0, Ll/۟ܿܿ;

    invoke-direct {v0, p0}, Ll/۟ܿܿ;-><init>(Ll/᩻ܳܿ;)V

    iput-object v0, p0, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    .line 906
    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 907
    invoke-static {}, Ll/۬ܿ᩷;->ᩳ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v1, Ll/᩺ܿܿ;

    invoke-direct {v1, p0}, Ll/᩺ܿܿ;-><init>(Ll/᩻ܳܿ;)V

    invoke-virtual {v0, p1, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 908
    new-instance p1, Ll/֫ۗۧ;

    new-instance v0, Ll/ܰܿܿ;

    invoke-direct {v0, p0}, Ll/ܰܿܿ;-><init>(Ll/᩻ܳܿ;)V

    invoke-direct {p1, v0}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object p1, p0, Ll/᩻ܳܿ;->᩻:Ll/֫ۗۧ;

    .line 952
    invoke-virtual {p1, p2}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Z)Ljava/util/ArrayList;
    .locals 5

    .line 964
    invoke-virtual {p0}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    .line 965
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 966
    iget-object v2, p0, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    if-eqz p1, :cond_2

    .line 967
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :cond_0
    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 968
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 969
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܳܿ;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 970
    iget-object v3, p0, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {v3, p1}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    goto :goto_0

    .line 973
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-object v1

    .line 975
    :cond_2
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p1, :cond_4

    .line 976
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 977
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶܳܿ;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 960
    invoke-virtual {p0}, Ll/᩻ܳܿ;->ۧ()Ll/ۚܳܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۚܳܿ;
    .locals 2

    .line 956
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/᩻ܳܿ;->ܳ:I

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܳܿ;

    return-object v0
.end method
