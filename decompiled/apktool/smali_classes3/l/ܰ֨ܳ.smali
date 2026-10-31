.class public abstract Ll/ܰ֨ܳ;
.super Ljava/lang/Object;
.source "98EM"


# instance fields
.field public final ֫:[Landroid/view/View;


# direct methods
.method public varargs constructor <init>([Landroid/view/View;)V
    .locals 0

    .line 373
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    iput-object p1, p0, Ll/ܰ֨ܳ;->֫:[Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 378
    iget-object v0, p0, Ll/ܰ֨ܳ;->֫:[Landroid/view/View;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    const/16 v4, 0x8

    .line 379
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 384
    iget-object v0, p0, Ll/ܰ֨ܳ;->֫:[Landroid/view/View;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 385
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
