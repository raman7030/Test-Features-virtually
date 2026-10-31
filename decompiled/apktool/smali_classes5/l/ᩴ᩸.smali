.class public Ll/ᩴ᩸;
.super Ll/ܽ᩸;
.source "83VR"


# instance fields
.field public ֫ۧ:F

.field public ۜۧ:F

.field public ۟֫:F

.field public ۧۧ:F

.field public ۨ֫:F

.field public ܰ֫:F

.field public ܳۧ:F

.field public ܽۧ:F

.field public ܿۧ:F

.field public ᩳۧ:F

.field public ᩷ۧ:F

.field public ᩺֫:Z

.field public ᩻ۧ:F


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, -0x2

    .line 82
    invoke-direct {p0, v0}, Ll/ܽ᩸;-><init>(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 67
    iput v0, p0, Ll/ᩴ᩸;->ۨ֫:F

    const/4 v1, 0x0

    .line 68
    iput-boolean v1, p0, Ll/ᩴ᩸;->᩺֫:Z

    const/4 v1, 0x0

    .line 69
    iput v1, p0, Ll/ᩴ᩸;->ܰ֫:F

    .line 70
    iput v1, p0, Ll/ᩴ᩸;->۟֫:F

    .line 71
    iput v1, p0, Ll/ᩴ᩸;->֫ۧ:F

    .line 72
    iput v1, p0, Ll/ᩴ᩸;->ۧۧ:F

    .line 73
    iput v0, p0, Ll/ᩴ᩸;->ܽۧ:F

    .line 74
    iput v0, p0, Ll/ᩴ᩸;->ᩳۧ:F

    .line 75
    iput v1, p0, Ll/ᩴ᩸;->ܿۧ:F

    .line 76
    iput v1, p0, Ll/ᩴ᩸;->ܳۧ:F

    .line 77
    iput v1, p0, Ll/ᩴ᩸;->᩻ۧ:F

    .line 78
    iput v1, p0, Ll/ᩴ᩸;->ۜۧ:F

    .line 79
    iput v1, p0, Ll/ᩴ᩸;->᩷ۧ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 90
    invoke-direct {p0, p1, p2}, Ll/ܽ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 67
    iput v0, p0, Ll/ᩴ᩸;->ۨ֫:F

    const/4 v1, 0x0

    .line 68
    iput-boolean v1, p0, Ll/ᩴ᩸;->᩺֫:Z

    const/4 v2, 0x0

    .line 69
    iput v2, p0, Ll/ᩴ᩸;->ܰ֫:F

    .line 70
    iput v2, p0, Ll/ᩴ᩸;->۟֫:F

    .line 71
    iput v2, p0, Ll/ᩴ᩸;->֫ۧ:F

    .line 72
    iput v2, p0, Ll/ᩴ᩸;->ۧۧ:F

    .line 73
    iput v0, p0, Ll/ᩴ᩸;->ܽۧ:F

    .line 74
    iput v0, p0, Ll/ᩴ᩸;->ᩳۧ:F

    .line 75
    iput v2, p0, Ll/ᩴ᩸;->ܿۧ:F

    .line 76
    iput v2, p0, Ll/ᩴ᩸;->ܳۧ:F

    .line 77
    iput v2, p0, Ll/ᩴ᩸;->᩻ۧ:F

    .line 78
    iput v2, p0, Ll/ᩴ᩸;->ۜۧ:F

    .line 79
    iput v2, p0, Ll/ᩴ᩸;->᩷ۧ:F

    .line 91
    sget-object v0, Ll/᩸᩸;->ᩳ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_0
    if-ge v1, p2, :cond_c

    .line 94
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    const/16 v2, 0xf

    if-ne v0, v2, :cond_0

    .line 96
    iget v2, p0, Ll/ᩴ᩸;->ۨ֫:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ۨ֫:F

    goto/16 :goto_1

    :cond_0
    const/16 v2, 0x1c

    if-ne v0, v2, :cond_1

    .line 99
    iget v2, p0, Ll/ᩴ᩸;->ܰ֫:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ܰ֫:F

    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Ll/ᩴ᩸;->᩺֫:Z

    goto/16 :goto_1

    :cond_1
    const/16 v2, 0x17

    if-ne v0, v2, :cond_2

    .line 103
    iget v2, p0, Ll/ᩴ᩸;->֫ۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->֫ۧ:F

    goto/16 :goto_1

    :cond_2
    const/16 v2, 0x18

    if-ne v0, v2, :cond_3

    .line 105
    iget v2, p0, Ll/ᩴ᩸;->ۧۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ۧۧ:F

    goto/16 :goto_1

    :cond_3
    const/16 v2, 0x16

    if-ne v0, v2, :cond_4

    .line 107
    iget v2, p0, Ll/ᩴ᩸;->۟֫:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->۟֫:F

    goto :goto_1

    :cond_4
    const/16 v2, 0x14

    if-ne v0, v2, :cond_5

    .line 109
    iget v2, p0, Ll/ᩴ᩸;->ܽۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ܽۧ:F

    goto :goto_1

    :cond_5
    const/16 v2, 0x15

    if-ne v0, v2, :cond_6

    .line 111
    iget v2, p0, Ll/ᩴ᩸;->ᩳۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ᩳۧ:F

    goto :goto_1

    :cond_6
    const/16 v2, 0x10

    if-ne v0, v2, :cond_7

    .line 113
    iget v2, p0, Ll/ᩴ᩸;->ܿۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ܿۧ:F

    goto :goto_1

    :cond_7
    const/16 v2, 0x11

    if-ne v0, v2, :cond_8

    .line 115
    iget v2, p0, Ll/ᩴ᩸;->ܳۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ܳۧ:F

    goto :goto_1

    :cond_8
    const/16 v2, 0x12

    if-ne v0, v2, :cond_9

    .line 117
    iget v2, p0, Ll/ᩴ᩸;->᩻ۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->᩻ۧ:F

    goto :goto_1

    :cond_9
    const/16 v2, 0x13

    if-ne v0, v2, :cond_a

    .line 119
    iget v2, p0, Ll/ᩴ᩸;->ۜۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->ۜۧ:F

    goto :goto_1

    :cond_a
    const/16 v2, 0x1b

    if-ne v0, v2, :cond_b

    .line 122
    iget v2, p0, Ll/ᩴ᩸;->᩷ۧ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Ll/ᩴ᩸;->᩷ۧ:F

    :cond_b
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 126
    :cond_c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
