.class public final Ll/۠᩻ܿ;
.super Ll/ۤۙۧ;
.source "A7IB"


# instance fields
.field public final synthetic ᩳ:Ll/ۛ᩻ܿ;


# direct methods
.method public constructor <init>(Ll/ۛ᩻ܿ;)V
    .locals 0

    .line 78
    iput-object p1, p0, Ll/۠᩻ܿ;->ᩳ:Ll/ۛ᩻ܿ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 3

    .line 90
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 91
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p3

    .line 92
    iget-object v0, p0, Ll/۠᩻ܿ;->ᩳ:Ll/ۛ᩻ܿ;

    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩻ܿ;

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/᩸᩻ܿ;

    if-eqz v2, :cond_0

    .line 93
    invoke-virtual {v1}, Ll/᩶᩻ܿ;->֫()Ll/᩸᩻ܿ;

    move-result-object v1

    iget v1, v1, Ll/᩸᩻ܿ;->֫:I

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 96
    :cond_0
    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p2, p3, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 97
    invoke-virtual {p1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 98
    new-instance p1, Ll/֨᩻ܿ;

    invoke-direct {p1, p0}, Ll/֨᩻ܿ;-><init>(Ll/۠᩻ܿ;)V

    const-wide/16 p2, 0x3e8

    invoke-static {p1, p0, p2, p3}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۠᩻ܿ;->ᩳ:Ll/ۛ᩻ܿ;

    invoke-static {v0}, Ll/ۛ᩻ܿ;->ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶᩻ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p1, Ll/ۙ᩻ܿ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    .line 82
    invoke-static {p1, v0}, Ll/ۤۙۧ;->ܽ(II)I

    move-result p1

    return p1

    .line 84
    :cond_0
    invoke-static {v0, v0}, Ll/ۤۙۧ;->ܽ(II)I

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
