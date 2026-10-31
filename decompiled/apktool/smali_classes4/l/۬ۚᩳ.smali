.class public final Ll/۬ۚᩳ;
.super Ll/ۤۙۧ;
.source "75NJ"


# instance fields
.field public final synthetic ܿ:Ll/ܽ֨ᩳ;

.field public ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 944
    iput-object p1, p0, Ll/۬ۚᩳ;->ܿ:Ll/ܽ֨ᩳ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    .line 945
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/۬ۚᩳ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 2

    .line 957
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 958
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 959
    iget-object p3, p0, Ll/۬ۚᩳ;->ܿ:Ll/ܽ֨ᩳ;

    invoke-static {p3}, Ll/ܽ֨ᩳ;->᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܶᩳ;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v0

    invoke-static {p3}, Ll/ܽ֨ᩳ;->᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    invoke-virtual {v1}, Ll/֫ۘᩳ;->ۡ()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 962
    :cond_0
    invoke-static {p3}, Ll/ܽ֨ᩳ;->᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 963
    invoke-static {p3}, Ll/ܽ֨ᩳ;->ܿ(Ll/ܽ֨ᩳ;)I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 964
    invoke-static {p3, p2}, Ll/ܽ֨ᩳ;->֫(Ll/ܽ֨ᩳ;I)V

    goto :goto_0

    .line 965
    :cond_1
    invoke-static {p3}, Ll/ܽ֨ᩳ;->ܿ(Ll/ܽ֨ᩳ;)I

    move-result v0

    if-ne v0, p2, :cond_2

    .line 966
    invoke-static {p3, p1}, Ll/ܽ֨ᩳ;->֫(Ll/ܽ֨ᩳ;I)V

    .line 968
    :cond_2
    :goto_0
    invoke-static {p3}, Ll/ܽ֨ᩳ;->ۖ(Ll/ܽ֨ᩳ;)V

    .line 969
    invoke-static {p3}, Ll/ܽ֨ᩳ;->ᩳ(Ll/ܽ֨ᩳ;)Ll/ۤۚᩳ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 970
    invoke-static {p3}, Ll/ܽ֨ᩳ;->ᩴ(Ll/ܽ֨ᩳ;)V

    .line 971
    iget-object p1, p0, Ll/۬ۚᩳ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    .line 972
    new-instance p2, Ll/ۗۚᩳ;

    invoke-direct {p2, p0, p1}, Ll/ۗۚᩳ;-><init>(Ll/۬ۚᩳ;I)V

    const-wide/16 v0, 0x12c

    invoke-static {p2, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 2

    .line 949
    iget-object v0, p0, Ll/۬ۚᩳ;->ܿ:Ll/ܽ֨ᩳ;

    invoke-static {v0}, Ll/ܽ֨ᩳ;->ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 952
    invoke-static {p1, v1}, Ll/ۤۙۧ;->ܽ(II)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
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
