.class public final Ll/֡᩸ۡ;
.super Ljava/lang/Object;
.source "H540"


# instance fields
.field public ֫:Landroid/util/SparseArray;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/֡᩸ۡ;->֫:Landroid/util/SparseArray;

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Ll/֡᩸ۡ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 24
    iget v0, p0, Ll/֡᩸ۡ;->ۧ:I

    return v0
.end method

.method public final ֫(Landroid/text/SpannableString;I)V
    .locals 3

    .line 14
    iget-object v0, p0, Ll/֡᩸ۡ;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵᩸ۡ;

    if-nez v1, :cond_0

    .line 16
    new-instance v1, Ll/᩵᩸ۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩵᩸ۡ;-><init>(I)V

    .line 17
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 53
    :cond_0
    new-instance p2, Ll/ᩴ᩸ۡ;

    .line 67
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p2, Ll/ᩴ᩸ۡ;->ۧ:Landroid/text/SpannableString;

    .line 54
    iget-object p1, v1, Ll/᩵᩸ۡ;->֫:Ll/ᩴ᩸ۡ;

    if-nez p1, :cond_1

    .line 55
    iput-object p2, v1, Ll/᩵᩸ۡ;->ۧ:Ll/ᩴ᩸ۡ;

    iput-object p2, v1, Ll/᩵᩸ۡ;->֫:Ll/ᩴ᩸ۡ;

    goto :goto_0

    .line 57
    :cond_1
    iget-object p1, v1, Ll/᩵᩸ۡ;->ۧ:Ll/ᩴ᩸ۡ;

    iput-object p2, p1, Ll/ᩴ᩸ۡ;->֫:Ll/ᩴ᩸ۡ;

    .line 58
    iput-object p2, v1, Ll/᩵᩸ۡ;->ۧ:Ll/ᩴ᩸ۡ;

    .line 20
    :goto_0
    iget p1, p0, Ll/֡᩸ۡ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֡᩸ۡ;->ۧ:I

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 6

    .line 34
    iget-object v0, p0, Ll/֡᩸ۡ;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 36
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v2}, Ljava/util/Arrays;->sort([I)V

    :goto_1
    if-ge v3, v1, :cond_2

    .line 39
    aget v4, v2, v3

    .line 40
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵᩸ۡ;

    if-eqz v4, :cond_1

    .line 42
    iget-object v4, v4, Ll/᩵᩸ۡ;->֫:Ll/ᩴ᩸ۡ;

    :goto_2
    if-eqz v4, :cond_1

    .line 43
    iget-object v5, v4, Ll/ᩴ᩸ۡ;->ۧ:Landroid/text/SpannableString;

    invoke-interface {p1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v4, v4, Ll/ᩴ᩸ۡ;->֫:Ll/ᩴ᩸ۡ;

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 2

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/֡᩸ۡ;->ۧ:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-virtual {p0, v0}, Ll/֡᩸ۡ;->֫(Ljava/util/ArrayList;)V

    return-object v0
.end method
