.class public final Ll/ۖ᩸;
.super Ljava/lang/Object;
.source "R1K2"


# static fields
.field public static ۘ:Landroid/util/SparseIntArray;


# instance fields
.field public ֫:Z

.field public ۖ:F

.field public ۜ:F

.field public ۡ:F

.field public ۢ:F

.field public ۧ:F

.field public ܳ:F

.field public ܺ:F

.field public ܽ:Z

.field public ܿ:F

.field public ᩳ:F

.field public ᩷:F

.field public ᩻:F


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1057
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/ۖ᩸;->ۘ:Landroid/util/SparseIntArray;

    const/4 v1, 0x6

    const/4 v2, 0x1

    .line 1071
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x7

    const/4 v4, 0x2

    .line 1072
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v5, 0x8

    const/4 v6, 0x3

    .line 1073
    invoke-virtual {v0, v5, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v7, 0x4

    .line 1074
    invoke-virtual {v0, v7, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v7, 0x5

    .line 1075
    invoke-virtual {v0, v7, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v7, 0x0

    .line 1076
    invoke-virtual {v0, v7, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 1077
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 1078
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x9

    .line 1079
    invoke-virtual {v0, v6, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0xa

    .line 1080
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xb

    .line 1081
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1085
    sget-object v0, Ll/᩸᩸;->᩶:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    .line 1086
    iput-boolean p2, p0, Ll/ۖ᩸;->ܽ:Z

    .line 1087
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1089
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 1091
    sget-object v3, Ll/ۖ᩸;->ۘ:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 1126
    :pswitch_0
    iput-boolean p2, p0, Ll/ۖ᩸;->֫:Z

    .line 1127
    iget v3, p0, Ll/ۖ᩸;->ۧ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ۧ:F

    goto :goto_1

    .line 1121
    :pswitch_1
    iget v3, p0, Ll/ۖ᩸;->ۖ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ۖ:F

    goto :goto_1

    .line 1117
    :pswitch_2
    iget v3, p0, Ll/ۖ᩸;->ܺ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ܺ:F

    goto :goto_1

    .line 1114
    :pswitch_3
    iget v3, p0, Ll/ۖ᩸;->ۡ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ۡ:F

    goto :goto_1

    .line 1111
    :pswitch_4
    iget v3, p0, Ll/ۖ᩸;->ۢ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ۢ:F

    goto :goto_1

    .line 1108
    :pswitch_5
    iget v3, p0, Ll/ۖ᩸;->᩷:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->᩷:F

    goto :goto_1

    .line 1105
    :pswitch_6
    iget v3, p0, Ll/ۖ᩸;->ۜ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ۜ:F

    goto :goto_1

    .line 1102
    :pswitch_7
    iget v3, p0, Ll/ۖ᩸;->᩻:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->᩻:F

    goto :goto_1

    .line 1099
    :pswitch_8
    iget v3, p0, Ll/ۖ᩸;->ܳ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ܳ:F

    goto :goto_1

    .line 1096
    :pswitch_9
    iget v3, p0, Ll/ۖ᩸;->ܿ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ܿ:F

    goto :goto_1

    .line 1093
    :pswitch_a
    iget v3, p0, Ll/ۖ᩸;->ᩳ:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۖ᩸;->ᩳ:F

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1132
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۖ᩸;)V
    .locals 1

    .line 1042
    iget-boolean v0, p1, Ll/ۖ᩸;->ܽ:Z

    iput-boolean v0, p0, Ll/ۖ᩸;->ܽ:Z

    .line 1043
    iget v0, p1, Ll/ۖ᩸;->ᩳ:F

    iput v0, p0, Ll/ۖ᩸;->ᩳ:F

    .line 1044
    iget v0, p1, Ll/ۖ᩸;->ܿ:F

    iput v0, p0, Ll/ۖ᩸;->ܿ:F

    .line 1045
    iget v0, p1, Ll/ۖ᩸;->ܳ:F

    iput v0, p0, Ll/ۖ᩸;->ܳ:F

    .line 1046
    iget v0, p1, Ll/ۖ᩸;->᩻:F

    iput v0, p0, Ll/ۖ᩸;->᩻:F

    .line 1047
    iget v0, p1, Ll/ۖ᩸;->ۜ:F

    iput v0, p0, Ll/ۖ᩸;->ۜ:F

    .line 1048
    iget v0, p1, Ll/ۖ᩸;->᩷:F

    iput v0, p0, Ll/ۖ᩸;->᩷:F

    .line 1049
    iget v0, p1, Ll/ۖ᩸;->ۢ:F

    iput v0, p0, Ll/ۖ᩸;->ۢ:F

    .line 1050
    iget v0, p1, Ll/ۖ᩸;->ۡ:F

    iput v0, p0, Ll/ۖ᩸;->ۡ:F

    .line 1051
    iget v0, p1, Ll/ۖ᩸;->ܺ:F

    iput v0, p0, Ll/ۖ᩸;->ܺ:F

    .line 1052
    iget v0, p1, Ll/ۖ᩸;->ۖ:F

    iput v0, p0, Ll/ۖ᩸;->ۖ:F

    .line 1053
    iget-boolean v0, p1, Ll/ۖ᩸;->֫:Z

    iput-boolean v0, p0, Ll/ۖ᩸;->֫:Z

    .line 1054
    iget p1, p1, Ll/ۖ᩸;->ۧ:F

    iput p1, p0, Ll/ۖ᩸;->ۧ:F

    return-void
.end method
