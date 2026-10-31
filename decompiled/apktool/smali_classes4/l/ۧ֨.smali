.class public final Ll/ۧ֨;
.super Ll/᩵֨;
.source "H1CY"


# instance fields
.field public ܳ:Landroid/util/SparseArray;

.field public ᩻:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫(FI)V
    .locals 0

    .line 287
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(FLandroid/view/View;)V
    .locals 3

    .line 296
    iget-object v0, p0, Ll/᩵֨;->ۧ:Ll/᩷֡;

    float-to-double v1, p1

    iget-object p1, p0, Ll/ۧ֨;->᩻:[F

    invoke-virtual {v0, v1, v2, p1}, Ll/᩷֡;->֫(D[F)V

    .line 297
    iget-object p1, p0, Ll/ۧ֨;->ܳ:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰܶ;

    iget-object v0, p0, Ll/ۧ֨;->᩻:[F

    invoke-virtual {p1, p2, v0}, Ll/ܰܶ;->֫(Landroid/view/View;[F)V

    return-void
.end method

.method public final ֫(I)V
    .locals 11

    .line 265
    iget-object v0, p0, Ll/ۧ֨;->ܳ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    .line 266
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰܶ;

    invoke-virtual {v3}, Ll/ܰܶ;->ܽ()I

    move-result v3

    .line 267
    new-array v4, v1, [D

    .line 268
    new-array v5, v3, [F

    iput-object v5, p0, Ll/ۧ֨;->᩻:[F

    const/4 v5, 0x2

    new-array v5, v5, [I

    const/4 v6, 0x1

    aput v3, v5, v6

    aput v1, v5, v2

    .line 269
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[D

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 272
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    .line 273
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰܶ;

    int-to-double v7, v5

    const-wide v9, 0x3f847ae147ae147bL    # 0.01

    mul-double v7, v7, v9

    .line 275
    aput-wide v7, v4, v3

    .line 276
    iget-object v5, p0, Ll/ۧ֨;->᩻:[F

    invoke-virtual {v6, v5}, Ll/ܰܶ;->֫([F)V

    const/4 v5, 0x0

    .line 277
    :goto_1
    iget-object v6, p0, Ll/ۧ֨;->᩻:[F

    array-length v7, v6

    if-ge v5, v7, :cond_0

    .line 278
    aget-object v7, v2, v3

    aget v6, v6, v5

    float-to-double v8, v6

    aput-wide v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 282
    :cond_1
    invoke-static {p1, v4, v2}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩵֨;->ۧ:Ll/᩷֡;

    return-void
.end method
