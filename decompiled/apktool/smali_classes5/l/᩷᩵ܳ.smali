.class public final Ll/᩷᩵ܳ;
.super Ll/ۤۙۧ;
.source "715M"


# instance fields
.field public final synthetic ܿ:Ll/᩺ᩴܳ;

.field public final synthetic ᩳ:Ll/ۡ᩵ܳ;


# direct methods
.method public constructor <init>(Ll/ۡ᩵ܳ;Ll/᩺ᩴܳ;)V
    .locals 0

    .line 913
    iput-object p1, p0, Ll/᩷᩵ܳ;->ᩳ:Ll/ۡ᩵ܳ;

    iput-object p2, p0, Ll/᩷᩵ܳ;->ܿ:Ll/᩺ᩴܳ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 922
    iget-object p1, p0, Ll/᩷᩵ܳ;->ᩳ:Ll/ۡ᩵ܳ;

    invoke-static {p1}, Ll/ۡ᩵ܳ;->ۢ(Ll/ۡ᩵ܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 925
    :cond_0
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 926
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p3

    .line 927
    iget-object v0, p0, Ll/᩷᩵ܳ;->ܿ:Ll/᩺ᩴܳ;

    invoke-virtual {v0, p2, p3}, Ll/᩺ᩴܳ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 928
    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 49
    sget-object p1, Ll/᩵ܶܳ;->ۛ:Ll/ۚۡ֫;

    const-class p2, Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 917
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
