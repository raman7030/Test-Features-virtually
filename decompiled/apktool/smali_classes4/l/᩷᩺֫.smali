.class public final Ll/᩷᩺֫;
.super Ljava/lang/Object;
.source "J7MO"


# instance fields
.field public final ֫:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/᩷᩺֫;->֫:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۢ֨֫;
    .locals 4

    .line 45
    iget-object v0, p0, Ll/᩷᩺֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢ֨֫;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ll/ۢ֨֫;

    const-wide v2, 0x7ffffffffffffffeL

    invoke-direct {v1, v2, v3}, Ll/ۢ֨֫;-><init>(J)V

    .line 48
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final ֫()V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩷᩺֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method
