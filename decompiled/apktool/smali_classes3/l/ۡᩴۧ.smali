.class public final Ll/ۡᩴۧ;
.super Ljava/lang/Object;
.source "K8JQ"

# interfaces
.implements Ll/᩸᩷ۧ;


# instance fields
.field public final ۙ:Landroid/util/SparseArray;

.field public final ᩶:Ll/ۜᩴۧ;

.field public final ᩸:Ll/᩸᩷ۧ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۡᩴۧ;->᩸:Ll/᩸᩷ۧ;

    .line 54
    iput-object p2, p0, Ll/ۡᩴۧ;->᩶:Ll/ۜᩴۧ;

    .line 55
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ۡᩴۧ;->ۙ:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 3

    const/4 v0, 0x3

    .line 68
    iget-object v1, p0, Ll/ۡᩴۧ;->᩸:Ll/᩸᩷ۧ;

    if-eq p2, v0, :cond_0

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Ll/ۡᩴۧ;->᩹:Z

    .line 70
    invoke-interface {v1, p1, p2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    return-object p1

    .line 72
    :cond_0
    iget-object v0, p0, Ll/ۡᩴۧ;->ۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖᩴۧ;

    if-eqz v2, :cond_1

    return-object v2

    .line 76
    :cond_1
    new-instance v2, Ll/ۖᩴۧ;

    .line 77
    invoke-interface {v1, p1, p2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p2

    iget-object v1, p0, Ll/ۡᩴۧ;->᩶:Ll/ۜᩴۧ;

    invoke-direct {v2, p2, v1}, Ll/ۖᩴۧ;-><init>(Ll/᩵ۢۧ;Ll/ۜᩴۧ;)V

    .line 78
    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۡᩴۧ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0, p1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ܳ()V
    .locals 3

    .line 84
    iget-object v0, p0, Ll/ۡᩴۧ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    .line 85
    iget-boolean v0, p0, Ll/ۡᩴۧ;->᩹:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 86
    :goto_0
    iget-object v1, p0, Ll/ۡᩴۧ;->ۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 87
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴۧ;

    invoke-virtual {v1}, Ll/ۖᩴۧ;->֫()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
