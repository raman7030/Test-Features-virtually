.class public Ll/֫ۤۧ;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "U6BG"


# static fields
.field public static final ᩳ:[I


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x1010181

    .line 1639
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/֫ۤۧ;->ᩳ:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    .line 1663
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 1647
    iput v0, p0, Ll/֫ۤۧ;->ܽ:F

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, -0x1

    .line 1667
    invoke-direct {p0, p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 p1, 0x0

    .line 1647
    iput p1, p0, Ll/֫ۤۧ;->ܽ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1684
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 1647
    iput v0, p0, Ll/֫ۤۧ;->ܽ:F

    .line 1686
    sget-object v1, Ll/֫ۤۧ;->ᩳ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 1687
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Ll/֫ۤۧ;->ܽ:F

    .line 1688
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
