.class public final Ll/ᩳۖۡ;
.super Ll/ۤۙۧ;
.source "T8W7"


# instance fields
.field public final synthetic ᩳ:Ll/ۢۖۡ;


# direct methods
.method public constructor <init>(Ll/ۢۖۡ;)V
    .locals 0

    .line 93
    iput-object p1, p0, Ll/ᩳۖۡ;->ᩳ:Ll/ۢۖۡ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 2

    .line 102
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 103
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    if-ltz p1, :cond_1

    if-gez p2, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    iget-object p3, p0, Ll/ᩳۖۡ;->ᩳ:Ll/ۢۖۡ;

    invoke-static {p3}, Ll/ۢۖۡ;->ۧ(Ll/ۢۖۡ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 108
    invoke-static {p3}, Ll/ۢۖۡ;->֫(Ll/ۢۖۡ;)Ll/ܳۖۡ;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 109
    sget p1, Ll/֫ۖۡ;->֫:I

    .line 59
    new-instance p1, Ll/ᩴܶ᩷;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ll/ᩴܶ᩷;-><init>(I)V

    const-class p3, Ll/֫ۖۡ;

    const-wide/16 v0, 0x1f4

    invoke-static {p1, p3, v0, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return p2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 97
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
