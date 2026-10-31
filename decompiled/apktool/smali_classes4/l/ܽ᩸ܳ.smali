.class public final Ll/ܽ᩸ܳ;
.super Ll/ۤۙۧ;
.source "J7C4"


# instance fields
.field public final synthetic ܿ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:Ll/ᩳ᩸ܳ;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ll/ᩳ᩸ܳ;)V
    .locals 0

    .line 42
    iput-object p1, p0, Ll/ܽ᩸ܳ;->ܿ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ܽ᩸ܳ;->ᩳ:Ll/ᩳ᩸ܳ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 0

    .line 50
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 51
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    const/4 p3, -0x1

    if-eq p1, p3, :cond_1

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    iget-object p3, p0, Ll/ܽ᩸ܳ;->ܿ:Ljava/util/ArrayList;

    invoke-static {p1, p2, p3}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 56
    iget-object p3, p0, Ll/ܽ᩸ܳ;->ᩳ:Ll/ᩳ᩸ܳ;

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

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 45
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
