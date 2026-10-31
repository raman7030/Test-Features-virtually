.class public final Ll/ۨᩳ֫;
.super Ljava/lang/Object;
.source "LB1M"


# instance fields
.field public final ֫:Landroid/util/SparseArray;

.field public ۧ:Ll/֫ܿ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 244
    invoke-direct {p0, v0}, Ll/ۨᩳ֫;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, p1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Ll/ۨᩳ֫;->֫:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫ܿ֫;
    .locals 1

    .line 257
    iget-object v0, p0, Ll/ۨᩳ֫;->ۧ:Ll/֫ܿ֫;

    return-object v0
.end method

.method public final ֫(I)Ll/ۨᩳ֫;
    .locals 1

    .line 253
    iget-object v0, p0, Ll/ۨᩳ֫;->֫:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨᩳ֫;

    return-object p1
.end method

.method public final ֫(Ll/֫ܿ֫;II)V
    .locals 3

    .line 262
    invoke-virtual {p1, p2}, Ll/֫ܿ֫;->֫(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۨᩳ֫;->֫(I)Ll/ۨᩳ֫;

    move-result-object v0

    if-nez v0, :cond_0

    .line 264
    new-instance v0, Ll/ۨᩳ֫;

    invoke-direct {v0}, Ll/ۨᩳ֫;-><init>()V

    .line 265
    iget-object v1, p0, Ll/ۨᩳ֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Ll/֫ܿ֫;->֫(I)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    if-le p3, p2, :cond_1

    add-int/lit8 p2, p2, 0x1

    .line 269
    invoke-virtual {v0, p1, p2, p3}, Ll/ۨᩳ֫;->֫(Ll/֫ܿ֫;II)V

    return-void

    .line 271
    :cond_1
    iput-object p1, v0, Ll/ۨᩳ֫;->ۧ:Ll/֫ܿ֫;

    return-void
.end method
