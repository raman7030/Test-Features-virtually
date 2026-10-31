.class public final Ll/ۚ۬֫;
.super Ljava/lang/Object;
.source "78R7"


# instance fields
.field public final ֫:Landroid/util/SparseArray;

.field public final ۧ:Ll/ۚᩴ֫;


# direct methods
.method public constructor <init>(Ll/ۚᩴ֫;Landroid/util/SparseArray;)V
    .locals 4

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Ll/ۚ۬֫;->ۧ:Ll/ۚᩴ֫;

    .line 105
    new-instance v0, Landroid/util/SparseArray;

    invoke-virtual {p1}, Ll/ۚᩴ֫;->֫()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v1, 0x0

    .line 106
    :goto_0
    invoke-virtual {p1}, Ll/ۚᩴ֫;->֫()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 107
    invoke-virtual {p1, v1}, Ll/ۚᩴ֫;->ۧ(I)I

    move-result v2

    .line 108
    invoke-virtual {p2, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡۬֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 110
    :cond_0
    iput-object v0, p0, Ll/ۚ۬֫;->֫:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ۚ۬֫;->ۧ:Ll/ۚᩴ֫;

    invoke-virtual {v0}, Ll/ۚᩴ֫;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۚ۬֫;->ۧ:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ۚ۬֫;->ۧ:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ܽ(I)Ll/֡۬֫;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۚ۬֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡۬֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method
