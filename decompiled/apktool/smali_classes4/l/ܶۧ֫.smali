.class public Ll/ܶۧ֫;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "O607"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:F

.field public ᩳ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 2395
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2388
    iput v0, p0, Ll/ܶۧ֫;->֫:I

    .line 2397
    sget-object v1, Ll/۬ۧ֫;->֡֫:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2398
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Ll/ܶۧ֫;->֫:I

    .line 2399
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
