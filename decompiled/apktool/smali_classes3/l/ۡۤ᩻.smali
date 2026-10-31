.class public final Ll/ۡۤ᩻;
.super Ll/ۤۙۧ;
.source "M6WW"


# instance fields
.field public final synthetic ᩳ:Ll/ܶۤ᩻;


# direct methods
.method public constructor <init>(Ll/ܶۤ᩻;)V
    .locals 0

    .line 64
    iput-object p1, p0, Ll/ۡۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۡۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    invoke-static {v0, p1}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;I)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 4

    .line 83
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 84
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 85
    iget-object p3, p0, Ll/ۡۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-static {p3, p1}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3, p2}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    invoke-static {p3}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۢۜ;

    iget-object v0, v0, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {p3}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v2

    add-int/lit8 v3, p2, -0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۢۜ;

    iget-object v2, v2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {v0, v2}, Ll/᩸ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-static {p3}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v1, v3, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 89
    invoke-static {p3}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;)Ll/֡ۤ᩻;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۡۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    invoke-static {v0, p1}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;I)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1, v0}, Ll/ۤۙۧ;->ܽ(II)I

    move-result p1

    return p1
.end method

.method public final ܽ(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
