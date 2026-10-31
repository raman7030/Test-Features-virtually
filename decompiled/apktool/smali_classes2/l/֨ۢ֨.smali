.class public Ll/֨ۢ֨;
.super Ljava/lang/Object;
.source "L5HA"


# instance fields
.field public ֫:Z

.field public final ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 113
    iput-boolean v0, p0, Ll/֨ۢ֨;->֫:Z

    const/4 v0, -0x1

    .line 114
    iput v0, p0, Ll/֨ۢ֨;->ۧ:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Ll/۫ۢ֨;->ۧ:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 107
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/֨ۢ֨;->֫:Z

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 108
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Ll/֨ۢ֨;->ۧ:I

    .line 109
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
