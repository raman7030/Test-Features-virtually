.class public final Ll/ܽ᩻ۡ;
.super Ljava/lang/Object;
.source "J1J0"


# instance fields
.field public final ֫:Ll/ܰܳۡ;

.field public final ۧ:Ll/۟ܳۡ;

.field public final ܽ:I

.field public final ᩳ:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/ܰܳۡ;Ll/ܿ᩻ۡ;Landroid/view/View;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/ܽ᩻ۡ;->֫:Ll/ܰܳۡ;

    .line 15
    iput-object p3, p0, Ll/ܽ᩻ۡ;->ᩳ:Landroid/view/View;

    .line 16
    iget-object p1, p2, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    iput-object p1, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    .line 17
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    iput p2, p0, Ll/ܽ᩻ۡ;->ܽ:I

    .line 18
    invoke-virtual {p1}, Ll/۟ܳۡ;->᩷()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    invoke-virtual {v0}, Ll/۟ܳۡ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ۜ()V
    .locals 6

    .line 29
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    invoke-virtual {v0}, Ll/۟ܳۡ;->ܳ()Z

    move-result v1

    iget-object v2, v0, Ll/۟ܳۡ;->ᩳ:Ll/۟ܳۡ;

    iget-object v3, p0, Ll/ܽ᩻ۡ;->֫:Ll/ܰܳۡ;

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v3, v0}, Ll/ܰܳۡ;->ܽ(Ll/۟ܳۡ;)V

    :cond_0
    if-eqz v2, :cond_2

    .line 33
    iget-object v1, v2, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 34
    iget-object v0, v2, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 35
    iget-object v0, v2, Ll/۟ܳۡ;->ᩳ:Ll/۟ܳۡ;

    if-eqz v0, :cond_1

    .line 36
    iget-object v0, v0, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {v3}, Ll/ܰܳۡ;->᩷()Ll/ۧ᩻ۡ;

    move-result-object v1

    iget-object v1, v1, Ll/ۧ᩻ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3
    const/4 v0, 0x0

    .line 43
    :goto_0
    invoke-virtual {v3}, Ll/ܰܳۡ;->ۜ()I

    move-result v1

    .line 44
    iget v2, p0, Ll/ܽ᩻ۡ;->ܽ:I

    if-eqz v0, :cond_4

    .line 45
    invoke-virtual {v3}, Ll/ܰܳۡ;->᩻()Ljava/util/ArrayList;

    move-result-object v0

    add-int/lit8 v4, v2, -0x1

    sub-int v5, v4, v1

    add-int/lit8 v2, v2, 0x1

    sub-int/2addr v2, v1

    invoke-virtual {v0, v5, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x2

    .line 46
    invoke-virtual {v3, v4, v0}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    return-void

    .line 48
    :cond_4
    invoke-virtual {v3}, Ll/ܰܳۡ;->᩻()Ljava/util/ArrayList;

    move-result-object v0

    sub-int v1, v2, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    invoke-virtual {v3, v2}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 80
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    .line 60
    iget-object v0, v0, Ll/۟ܳۡ;->ܳ:Ljava/lang/String;

    const/16 v1, 0xc8

    invoke-static {v1, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Landroid/view/View;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ᩳ:Landroid/view/View;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    iget-object v0, v0, Ll/۟ܳۡ;->ᩳ:Ll/۟ܳۡ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    iget-object v0, v0, Ll/۟ܳۡ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ܽ᩻ۡ;->ܽ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    iget-object v0, v0, Ll/۟ܳۡ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 24
    iget-object v0, p0, Ll/ܽ᩻ۡ;->֫:Ll/ܰܳۡ;

    iget-object v1, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    invoke-virtual {v0, v1}, Ll/ܰܳۡ;->ᩳ(Ll/۟ܳۡ;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܽ᩻ۡ;->ۧ:Ll/۟ܳۡ;

    invoke-virtual {v0}, Ll/۟ܳۡ;->᩻()Z

    move-result v0

    return v0
.end method
