.class public final Ll/ܽ۫ܳ;
.super Ll/ۤۙۧ;
.source "A940"


# instance fields
.field public final synthetic ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/ܽ۫ܳ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 58
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 59
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p3

    .line 60
    iget-object v0, p0, Ll/ܽ۫ܳ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {p2, p3, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 61
    invoke-virtual {p1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 53
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
