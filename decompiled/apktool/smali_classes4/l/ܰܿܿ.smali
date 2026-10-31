.class public final Ll/ܰܿܿ;
.super Ll/ۤۙۧ;
.source "4AWI"


# instance fields
.field public final synthetic ᩳ:Ll/᩻ܳܿ;


# direct methods
.method public constructor <init>(Ll/᩻ܳܿ;)V
    .locals 0

    .line 908
    iput-object p1, p0, Ll/ܰܿܿ;->ᩳ:Ll/᩻ܳܿ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 3

    .line 920
    iget-object p1, p0, Ll/ܰܿܿ;->ᩳ:Ll/᩻ܳܿ;

    iget-object v0, p1, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 921
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p3

    if-ltz p2, :cond_2

    if-gez p3, :cond_0

    goto :goto_0

    .line 925
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    .line 926
    invoke-virtual {v0, p3}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eq v1, v2, :cond_1

    .line 928
    invoke-virtual {v0, p2, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 929
    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 931
    :cond_1
    invoke-virtual {p1}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, p3, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 932
    iget-object p1, p1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 933
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    .line 911
    iget-object p1, p0, Ll/ܰܿܿ;->ᩳ:Ll/᩻ܳܿ;

    iget-object p1, p1, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-static {p1}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x3

    .line 915
    invoke-static {p1, v0}, Ll/ۤۙۧ;->ܽ(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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
