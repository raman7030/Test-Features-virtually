.class public Ll/۟۫ᩳ;
.super Landroid/view/ViewGroup;
.source "28WH"

# interfaces
.implements Ll/ܽܰᩳ;


# static fields
.field public static final synthetic ۗ֫:I


# instance fields
.field public ֡֫:Z

.field public ֨֫:Z

.field public ֫֫:Ll/ۤ۫ᩳ;

.field public ۖ֫:Ll/۟᩺ᩳ;

.field public ۗ:Ljava/util/List;

.field public ۘ֫:Ll/۟᩺ᩳ;

.field public ۙ:Ll/ܰ᩺ۡ;

.field public final ۙ֫:[F

.field public ۚ֫:I

.field public ۛ:Z

.field public final ۜ֫:Ljava/lang/Object;

.field public final ۟:Ll/۫۫ᩳ;

.field public ۠֫:Z

.field public final ۡ֫:Landroid/graphics/Path;

.field public final ۢ֫:Ll/ۛ۫ᩳ;

.field public ۤ:Z

.field public ۧ֫:Ll/ۙܳۘ;

.field public final ۨ:Ll/۫ۨᩳ;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۬:Ll/ۘ᩷ᩳ;

.field public final ܰ:Ll/۫۫ᩳ;

.field public ܳ֫:Z

.field public ܶ֫:Z

.field public ܺ֫:I

.field public ܽ֫:Z

.field public final ܿ֫:Ll/ۚۡ֫;

.field public ᩳ֫:Z

.field public ᩴ֫:I

.field public ᩵֫:Z

.field public final ᩶:I

.field public ᩶֫:Z

.field public ᩷֫:Z

.field public final ᩸:Ll/ۙ۫ᩳ;

.field public ᩸֫:Z

.field public final ᩹:I

.field public ᩹֫:Ljava/util/ArrayList;

.field public final ᩺:Ll/۫ۨᩳ;

.field public volatile ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, p1, p2, v0}, Ll/۟۫ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 113
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    new-instance p2, Ll/۫۫ᩳ;

    invoke-direct {p2}, Ll/۫۫ᩳ;-><init>()V

    iput-object p2, p0, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    .line 67
    new-instance p2, Ll/۫۫ᩳ;

    invoke-direct {p2}, Ll/۫۫ᩳ;-><init>()V

    iput-object p2, p0, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    .line 70
    new-instance p2, Ll/ۛ۫ᩳ;

    .line 2233
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    const/4 p3, -0x1

    .line 2234
    iput p3, p2, Ll/ۛ۫ᩳ;->ۧ:I

    .line 2235
    iput p3, p2, Ll/ۛ۫ᩳ;->֫:I

    .line 2236
    iput p3, p2, Ll/ۛ۫ᩳ;->ᩳ:I

    .line 2237
    iput p3, p2, Ll/ۛ۫ᩳ;->ܽ:I

    .line 70
    iput-object p2, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    .line 71
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/۟۫ᩳ;->ۜ֫:Ljava/lang/Object;

    .line 72
    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p2, p0, Ll/۟۫ᩳ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    new-instance p2, Ll/ۙ۫ᩳ;

    invoke-direct {p2, p0}, Ll/ۙ۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    iput-object p2, p0, Ll/۟۫ᩳ;->᩸:Ll/ۙ۫ᩳ;

    .line 74
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ll/۟۫ᩳ;->ۡ֫:Landroid/graphics/Path;

    const/4 p2, 0x4

    new-array p2, p2, [F

    .line 75
    iput-object p2, p0, Ll/۟۫ᩳ;->ۙ֫:[F

    .line 77
    new-instance p2, Ll/ۙܳۘ;

    .line 19
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p2, p0, Ll/۟۫ᩳ;->ۧ֫:Ll/ۙܳۘ;

    const/4 p2, 0x1

    .line 87
    iput-boolean p2, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    .line 88
    new-instance p3, Ll/ۚۡ֫;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    invoke-direct {p3, v0}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 88
    iput-object p3, p0, Ll/۟۫ᩳ;->ܿ֫:Ll/ۚۡ֫;

    .line 90
    iput-boolean p2, p0, Ll/۟۫ᩳ;->᩷֫:Z

    .line 91
    sget-object p3, Ll/ۤ۫ᩳ;->᩹:Ll/ۤ۫ᩳ;

    iput-object p3, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    const/4 p3, 0x0

    .line 92
    iput-boolean p3, p0, Ll/۟۫ᩳ;->ۤ:Z

    .line 93
    iput-boolean p3, p0, Ll/۟۫ᩳ;->᩶֫:Z

    .line 94
    iput-boolean p2, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    .line 95
    iput-boolean p2, p0, Ll/۟۫ᩳ;->۠֫:Z

    const/16 v0, 0x12c

    .line 98
    iput v0, p0, Ll/۟۫ᩳ;->ۚ֫:I

    .line 114
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    .line 115
    new-instance v0, Ll/۫ۨᩳ;

    const/4 v1, 0x0

    .line 343
    invoke-direct {v0, p1, v1}, Ll/۫ۨᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 115
    iput-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    .line 116
    new-instance v2, Ll/۫ۨᩳ;

    .line 343
    invoke-direct {v2, p1, v1}, Ll/۫ۨᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 116
    iput-object v2, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 117
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 957
    new-instance p1, Ll/᩹۫ᩳ;

    invoke-direct {p1, p0, p2}, Ll/᩹۫ᩳ;-><init>(Ll/۟۫ᩳ;Z)V

    .line 120
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    .line 957
    new-instance p1, Ll/᩹۫ᩳ;

    invoke-direct {p1, p0, p3}, Ll/᩹۫ᩳ;-><init>(Ll/۟۫ᩳ;Z)V

    .line 121
    invoke-virtual {v2, p1}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    .line 123
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫ܽ()V

    .line 124
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۫ܽ()V

    .line 125
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܳᩳ()V

    .line 126
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܳᩳ()V

    .line 127
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۤܽ()V

    .line 128
    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۤܽ()V

    const p1, -0xc8c8c9

    const/16 v1, -0x51d

    .line 129
    invoke-static {p1, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result p1

    iput p1, p0, Ll/۟۫ᩳ;->᩹:I

    const p1, -0x9597be

    const v1, -0x51250

    .line 130
    invoke-static {p1, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result p1

    iput p1, p0, Ll/۟۫ᩳ;->᩶:I

    .line 132
    invoke-static {v0, v2}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/۫ۨᩳ;)V

    .line 133
    iget-object p1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    .line 134
    iget-object v1, v2, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    .line 135
    iput p3, p1, Ll/᩺֫ܿ;->ܳ֫:I

    .line 136
    iput p3, v1, Ll/᩺֫ܿ;->ܳ֫:I

    .line 137
    iput-boolean p2, p1, Ll/᩺֫ܿ;->ܿ֫:Z

    .line 138
    iput-boolean p2, v1, Ll/᩺֫ܿ;->ܿ֫:Z

    .line 139
    iput-boolean p2, p1, Ll/᩺֫ܿ;->۬֫:Z

    .line 140
    iput-boolean p2, v1, Ll/᩺֫ܿ;->۬֫:Z

    .line 141
    iput-boolean p2, p1, Ll/᩺֫ܿ;->᩵֫:Z

    .line 142
    iput-boolean p2, v1, Ll/᩺֫ܿ;->᩵֫:Z

    .line 143
    iput-boolean p2, p1, Ll/᩺֫ܿ;->ۚ֫:Z

    .line 144
    iput-boolean p2, v1, Ll/᩺֫ܿ;->ۚ֫:Z

    .line 145
    iput-boolean p2, p1, Ll/᩺֫ܿ;->ۗۧ:Z

    .line 146
    iput-boolean p2, v1, Ll/᩺֫ܿ;->ۗۧ:Z

    .line 148
    iget-boolean v3, p0, Ll/۟۫ᩳ;->᩶֫:Z

    iput-boolean v3, p1, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 149
    iput-boolean p2, v1, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 150
    iput p3, p1, Ll/᩺֫ܿ;->ܽܽ:I

    .line 151
    iput p3, v1, Ll/᩺֫ܿ;->ܽܽ:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 152
    iput v4, p1, Ll/᩺֫ܿ;->ۢۧ:F

    .line 153
    iput v4, v1, Ll/᩺֫ܿ;->ۢۧ:F

    .line 154
    iget-boolean v4, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    iput-boolean v4, p1, Ll/᩺֫ܿ;->ۛۧ:Z

    .line 155
    iput-boolean v4, v1, Ll/᩺֫ܿ;->ۛۧ:Z

    if-eqz v3, :cond_0

    .line 157
    iget-object v3, p1, Ll/᩺֫ܿ;->֫ܽ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    iput v3, v1, Ll/᩺֫ܿ;->ۧܽ:I

    iput v3, p1, Ll/᩺֫ܿ;->ۧܽ:I

    .line 160
    :cond_0
    iget v3, p1, Ll/᩺֫ܿ;->᩵ۧ:I

    .line 161
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v4, v4, v5

    float-to-int v4, v4

    shl-int/lit8 v4, v4, 0x18

    const v5, 0xffffff

    and-int/2addr v3, v5

    or-int/2addr v3, v4

    .line 162
    iput v3, v1, Ll/᩺֫ܿ;->᩵ۧ:I

    iput v3, p1, Ll/᩺֫ܿ;->᩵ۧ:I

    .line 164
    new-instance v3, Ll/۠۫ᩳ;

    invoke-direct {v3, p0}, Ll/۠۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    iput-object v3, p1, Ll/᩺֫ܿ;->ۢ֫:Ll/ᩴۤᩳ;

    .line 201
    new-instance p1, Ll/ܶ۫ᩳ;

    invoke-direct {p1, p0}, Ll/ܶ۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    iput-object p1, v1, Ll/᩺֫ܿ;->ۢ֫:Ll/ᩴۤᩳ;

    .line 238
    new-instance p1, Ll/ۘ᩹ܽ;

    const/4 v1, 0x3

    invoke-direct {p1, v1, p0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/֨۟ᩳ;)V

    .line 265
    new-instance p1, Ll/֫ܶܽ;

    invoke-direct {p1, p0}, Ll/֫ܶܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Ll/۫ۨᩳ;->֫(Ll/֨۟ᩳ;)V

    .line 292
    new-instance p1, Ll/ۘ۫ᩳ;

    invoke-direct {p1, p0}, Ll/ۘ۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    .line 301
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 302
    invoke-virtual {v2, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 303
    new-instance p1, Ll/ᩴ۫ᩳ;

    invoke-direct {p1, p0}, Ll/ᩴ۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 311
    new-instance p1, Ll/᩵۫ᩳ;

    invoke-direct {p1, p0}, Ll/᩵۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    invoke-virtual {v2, p1}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 319
    new-instance p1, Ll/᩺۫ᩳ;

    invoke-direct {p1, p0, p2}, Ll/᩺۫ᩳ;-><init>(Ll/۟۫ᩳ;Z)V

    .line 2581
    iput-object p1, v0, Ll/۫ۨᩳ;->᩶ܽ:Ll/֡ۨᩳ;

    .line 320
    new-instance p1, Ll/᩺۫ᩳ;

    invoke-direct {p1, p0, p3}, Ll/᩺۫ᩳ;-><init>(Ll/۟۫ᩳ;Z)V

    .line 2581
    iput-object p1, v2, Ll/۫ۨᩳ;->᩶ܽ:Ll/֡ۨᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(ZIIILjava/util/List;)I
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/۟۫ᩳ;->ۧ(ZIIILjava/util/List;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;Ll/ۙܳۘ;)Ljava/util/ArrayList;
    .locals 9

    if-nez p3, :cond_0

    .line 1937
    new-instance p3, Ll/ۨ۬ۡ;

    invoke-direct {p3, p0}, Ll/ۨ۬ۡ;-><init>(Ljava/lang/CharSequence;)V

    .line 1938
    new-instance p0, Ll/ۨ۬ۡ;

    invoke-direct {p0, p1}, Ll/ۨ۬ۡ;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, p0

    move-object p0, p3

    .line 1941
    :cond_0
    sget-object p3, Ll/᩶۫ᩳ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v7, 0x1

    if-eq p3, v7, :cond_4

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    const/4 v0, 0x3

    if-eq p3, v0, :cond_2

    const/4 v0, 0x4

    if-ne p3, v0, :cond_1

    goto :goto_0

    .line 1953
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    .line 1950
    :cond_2
    :goto_0
    sget-object p3, Ll/ۚܿۘ;->᩶:Ll/ۚܿۘ;

    goto :goto_1

    .line 1946
    :cond_3
    sget-object p3, Ll/ۚܿۘ;->ۙ:Ll/ۚܿۘ;

    goto :goto_1

    .line 1943
    :cond_4
    sget-object p3, Ll/ۚܿۘ;->᩹:Ll/ۚܿۘ;

    .line 1955
    :goto_1
    sget-object v0, Ll/ۤ۫ᩳ;->ۙ:Ll/ۤ۫ᩳ;

    const/4 v8, 0x0

    if-ne p2, v0, :cond_5

    const/4 p2, 0x1

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    .line 1956
    :goto_2
    invoke-virtual {p5}, Ll/ۙܳۘ;->ᩳ()V

    .line 1957
    invoke-static {p0}, Ll/ܶܳۘ;->֫(Ljava/lang/CharSequence;)Ll/֨ܳۘ;

    move-result-object v2

    .line 1958
    invoke-static {p1}, Ll/ܶܳۘ;->֫(Ljava/lang/CharSequence;)Ll/֨ܳۘ;

    move-result-object v3

    .line 1959
    sget-object v5, Ll/᩸ܿۘ;->ۙ:Ll/᩸ܿۘ;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Ll/֡ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/֨ܳۘ;Ll/֨ܳۘ;Ll/ۚܿۘ;Ll/᩸ܿۘ;Ll/ۙܳۘ;)Ljava/util/ArrayList;

    move-result-object v6

    .line 1961
    invoke-virtual {p5}, Ll/ۙܳۘ;->ܽ()Z

    move-result p5

    if-eqz p5, :cond_6

    .line 1962
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_6
    if-eqz p4, :cond_9

    .line 1965
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_7
    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1966
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳۘ;

    .line 1968
    invoke-interface {v0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v1

    invoke-interface {v0}, Ll/ᩴܳۘ;->֫()I

    move-result v2

    invoke-static {p0, v1, v2}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object v1

    .line 1969
    invoke-interface {v0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v2

    invoke-interface {v0}, Ll/ᩴܳۘ;->᩻()I

    move-result v0

    invoke-static {p1, v2, v0}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object v0

    .line 1970
    move-object v2, p4

    check-cast v2, Ll/ܰ᩺ۡ;

    iget-object v2, v2, Ll/ܰ᩺ۡ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/᩵֡ᩴ;

    .line 151
    invoke-virtual {v2, v8}, Ll/᩵֡ᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v2

    .line 1067
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۘܽ;

    .line 1068
    invoke-virtual {v3, v1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/۫ۘܽ;->matches()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/۫ۘܽ;->matches()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 1971
    invoke-interface {p5}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 203
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_a

    return-object v6

    .line 205
    :cond_a
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 206
    new-instance p5, Ll/᩵ܿۘ;

    move-object v0, p5

    move-object v1, p4

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Ll/᩵ܿۘ;-><init>(Ljava/util/ArrayList;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;Z)V

    .line 430
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ge v7, p0, :cond_c

    add-int/lit8 p0, v7, -0x1

    .line 431
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ܳۘ;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳۘ;

    .line 515
    invoke-interface {p0}, Ll/֡ܳۘ;->ۜ()I

    move-result p2

    invoke-interface {p1}, Ll/֡ܳۘ;->ۧ()I

    move-result p3

    if-ne p2, p3, :cond_b

    .line 516
    invoke-interface {p0}, Ll/֡ܳۘ;->᩷()I

    move-result p2

    invoke-interface {p1}, Ll/֡ܳۘ;->ܽ()I

    move-result p3

    if-ne p2, p3, :cond_b

    .line 517
    invoke-interface {p0}, Ll/ᩴܳۘ;->֫()I

    move-result p2

    invoke-interface {p1}, Ll/ᩴܳۘ;->ᩳ()I

    move-result p3

    if-ne p2, p3, :cond_b

    .line 518
    invoke-interface {p0}, Ll/ᩴܳۘ;->᩻()I

    move-result p0

    invoke-interface {p1}, Ll/ᩴܳۘ;->ܿ()I

    move-result p1

    if-ne p0, p1, :cond_b

    goto :goto_5

    .line 432
    :cond_b
    invoke-virtual {v6, v8, v7}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p5, p0}, Ll/᩵ܿۘ;->accept(Ljava/lang/Object;)V

    move v8, v7

    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 436
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ge v8, p0, :cond_d

    .line 437
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-virtual {v6, v8, p0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p5, p0}, Ll/᩵ܿۘ;->accept(Ljava/lang/Object;)V

    :cond_d
    return-object p4
.end method

.method public static ֫(Ljava/util/List;Ll/ܰ۫ᩳ;Ljava/util/ArrayList;)Ljava/util/List;
    .locals 3

    if-nez p0, :cond_0

    return-object p2

    .line 1329
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ܰ۫ᩳ;->ۜ(Ll/ܰ۫ᩳ;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {p1}, Ll/ܰ۫ᩳ;->֫(Ll/ܰ۫ᩳ;)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 1330
    :goto_0
    invoke-static {p1}, Ll/ܰ۫ᩳ;->ۜ(Ll/ܰ۫ᩳ;)I

    move-result v2

    if-gt v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳۘ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1331
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1332
    invoke-static {p1}, Ll/ܰ۫ᩳ;->֫(Ll/ܰ۫ᩳ;)I

    move-result p1

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡ܳۘ;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public static ֫(Ljava/util/List;Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;IIII)Ll/ܰ۫ᩳ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    if-nez v0, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    .line 1282
    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    const/4 v8, -0x1

    if-ne v3, v8, :cond_1

    const/4 v3, -0x1

    goto :goto_1

    .line 1283
    :cond_1
    invoke-virtual {v1, v3}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v3

    :goto_1
    if-ne v4, v8, :cond_2

    const/4 v4, -0x1

    goto :goto_2

    .line 1284
    :cond_2
    invoke-virtual {v1, v4}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    :goto_2
    if-ne v5, v8, :cond_3

    const/4 v5, -0x1

    goto :goto_3

    .line 1285
    :cond_3
    invoke-virtual {v2, v5}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v5

    :goto_3
    if-ne v6, v8, :cond_4

    const/4 v6, -0x1

    goto :goto_4

    .line 1286
    :cond_4
    invoke-virtual {v2, v6}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    :goto_4
    const/4 v9, 0x0

    move v10, v7

    :goto_5
    if-ge v9, v10, :cond_8

    add-int v11, v9, v10

    ushr-int/lit8 v11, v11, 0x1

    .line 1290
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֡ܳۘ;

    if-eq v3, v8, :cond_5

    .line 1291
    invoke-interface {v12}, Ll/֡ܳۘ;->ۜ()I

    move-result v13

    if-ge v13, v3, :cond_6

    :cond_5
    if-eq v5, v8, :cond_7

    .line 1292
    invoke-interface {v12}, Ll/֡ܳۘ;->᩷()I

    move-result v12

    if-ge v12, v5, :cond_6

    goto :goto_6

    :cond_6
    move v10, v11

    goto :goto_5

    :cond_7
    :goto_6
    add-int/lit8 v9, v11, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v9, v9, -0x2

    .line 1295
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/4 v3, 0x0

    move v5, v7

    :goto_7
    if-ge v3, v5, :cond_c

    add-int v9, v3, v5

    ushr-int/lit8 v9, v9, 0x1

    .line 1300
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡ܳۘ;

    if-eq v4, v8, :cond_9

    .line 1301
    invoke-interface {v10}, Ll/֡ܳۘ;->ۧ()I

    move-result v12

    if-le v12, v4, :cond_a

    :cond_9
    if-eq v6, v8, :cond_b

    .line 1302
    invoke-interface {v10}, Ll/֡ܳۘ;->ܽ()I

    move-result v10

    if-le v10, v6, :cond_a

    goto :goto_8

    :cond_a
    add-int/lit8 v3, v9, 0x1

    goto :goto_7

    :cond_b
    :goto_8
    move v5, v9

    goto :goto_7

    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 1305
    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    move-result v12

    if-ltz v11, :cond_d

    .line 1308
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳۘ;

    .line 1309
    invoke-interface {v3}, Ll/ᩴܳۘ;->֫()I

    move-result v4

    .line 1310
    invoke-interface {v3}, Ll/ᩴܳۘ;->᩻()I

    move-result v5

    .line 1311
    invoke-interface {v3}, Ll/֡ܳۘ;->ۜ()I

    move-result v6

    .line 1312
    invoke-interface {v3}, Ll/֡ܳۘ;->᩷()I

    move-result v3

    move/from16 v18, v3

    move v13, v4

    move v15, v5

    move/from16 v17, v6

    goto :goto_9

    :cond_d
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 1314
    :goto_9
    invoke-virtual/range {p1 .. p1}, Ll/۟᩸ᩳ;->length()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->length()I

    move-result v4

    if-ge v12, v7, :cond_10

    .line 1316
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳۘ;

    .line 1317
    invoke-interface {v0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v3

    .line 1318
    invoke-interface {v0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v0

    .line 1319
    invoke-virtual/range {p1 .. p1}, Ll/۟᩸ᩳ;->length()I

    move-result v1

    if-eq v3, v1, :cond_e

    add-int/lit8 v3, v3, -0x1

    .line 1320
    :cond_e
    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->length()I

    move-result v1

    if-eq v0, v1, :cond_f

    add-int/lit8 v0, v0, -0x1

    :cond_f
    move/from16 v16, v0

    move v14, v3

    goto :goto_a

    :cond_10
    move v14, v3

    move/from16 v16, v4

    .line 1322
    :goto_a
    new-instance v0, Ll/ܰ۫ᩳ;

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Ll/ܰ۫ᩳ;-><init>(IIIIIIII)V

    return-object v0
.end method

.method private ֫(IIZ)V
    .locals 4

    .line 324
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 328
    :cond_0
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    if-eqz p3, :cond_1

    move-object v3, v2

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    if-nez p3, :cond_2

    move-object v1, v2

    .line 330
    :cond_2
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 331
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne p1, p2, :cond_3

    .line 333
    invoke-static {p3, p1, v2, v3, v0}, Ll/۟۫ᩳ;->ۧ(ZIIILjava/util/List;)I

    move-result p1

    move p2, p1

    goto :goto_1

    .line 335
    :cond_3
    invoke-static {p3, p1, v2, v3, v0}, Ll/۟۫ᩳ;->ۧ(ZIIILjava/util/List;)I

    move-result p1

    .line 336
    invoke-static {p3, p2, v2, v3, v0}, Ll/۟۫ᩳ;->ۧ(ZIIILjava/util/List;)I

    move-result p2

    .line 338
    :goto_1
    invoke-virtual {v1, p1, p2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 339
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۠ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/۟۫ᩳ;)V
    .locals 0

    .line 2012
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 2013
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V

    return-void
.end method

.method public static synthetic ֫(Ll/۟۫ᩳ;II)V
    .locals 2

    .line 312
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 313
    invoke-direct {p0, p1, p2, v1}, Ll/۟۫ᩳ;->֫(IIZ)V

    .line 314
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 315
    :cond_0
    iget-boolean p0, p0, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz p0, :cond_1

    .line 316
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/۟۫ᩳ;III)V
    .locals 4

    .line 239
    iget-boolean v0, p0, Ll/۟۫ᩳ;->۠֫:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 242
    :cond_0
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    .line 243
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 244
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    return-void

    :cond_1
    if-ne p1, p3, :cond_2

    .line 249
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p1

    invoke-virtual {v1, p2, p1}, Ll/۫ۨᩳ;->ۜ(II)V

    .line 250
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    return-void

    .line 253
    :cond_2
    iget-object p1, p0, Ll/۟۫ᩳ;->᩸:Ll/ۙ۫ᩳ;

    const/4 v2, 0x1

    .line 254
    invoke-virtual {p1, v0, v1, v2}, Ll/ۙ۫ᩳ;->֫(Ll/۫ۨᩳ;Ll/۫ۨᩳ;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 255
    iget-object v2, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v2

    .line 256
    iget v3, p1, Ll/ۙ۫ᩳ;->֫:I

    int-to-float v3, v3

    mul-float v3, v3, v2

    int-to-float p3, p3

    sub-float/2addr v3, p3

    .line 257
    invoke-virtual {p1, v0}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result p3

    sub-float/2addr p3, v3

    div-float/2addr p3, v2

    .line 258
    iget v0, p1, Ll/ۙ۫ᩳ;->ۧ:I

    iget v3, p1, Ll/ۙ۫ᩳ;->ܽ:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    mul-float v0, v0, p3

    int-to-float p3, v3

    add-float/2addr v0, p3

    mul-float v0, v0, v2

    .line 260
    invoke-virtual {p1, v1}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result p1

    sub-float/2addr v0, p1

    float-to-int p3, v0

    .line 262
    :cond_3
    invoke-virtual {v1, p2, p3}, Ll/۫ۨᩳ;->ۜ(II)V

    .line 263
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    return-void
.end method

.method public static synthetic ֫(Ll/۟۫ᩳ;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_1

    .line 294
    iget-object p2, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 295
    :goto_0
    iget-boolean p2, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eq p2, p1, :cond_1

    .line 296
    iput-boolean p1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    .line 297
    iget-object p0, p0, Ll/۟۫ᩳ;->ܿ֫:Ll/ۚۡ֫;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/۟۫ᩳ;Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;Ll/ܰ۫ᩳ;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;ILjava/util/List;IIZ)V
    .locals 21

    move-object/from16 v14, p0

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    const/4 v1, 0x0

    .line 1214
    :try_start_0
    invoke-static/range {p1 .. p1}, Ll/ܶۤᩳ;->֫(Ljava/lang/CharSequence;)Ll/ܶۤᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-static/range {p2 .. p2}, Ll/ܶۤᩳ;->֫(Ljava/lang/CharSequence;)Ll/ܶۤᩳ;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1215
    :try_start_2
    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ᩳ(Ll/ܰ۫ᩳ;)I

    move-result v0

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ۧ(Ll/ܰ۫ᩳ;)I

    move-result v4

    .line 1216
    invoke-virtual {v2, v0, v4}, Ll/ܶۤᩳ;->range(II)Ljava/lang/CharSequence;

    move-result-object v15

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->᩻(Ll/ܰ۫ᩳ;)I

    move-result v0

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ܿ(Ll/ܰ۫ᩳ;)I

    move-result v4

    invoke-virtual {v3, v0, v4}, Ll/ܶۤᩳ;->range(II)Ljava/lang/CharSequence;

    move-result-object v16

    new-instance v20, Ll/ۙܳۘ;

    .line 19
    invoke-direct/range {v20 .. v20}, Ljava/lang/Object;-><init>()V

    move-object/from16 v17, p4

    move/from16 v18, p5

    move-object/from16 v19, p6

    .line 1215
    invoke-static/range {v15 .. v20}, Ll/۟۫ᩳ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;Ll/ۙܳۘ;)Ljava/util/ArrayList;

    move-result-object v13

    .line 1218
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳۘ;

    .line 1219
    invoke-interface {v4}, Ll/֡ܳۘ;->ۧ()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ܽ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/֡ܳۘ;->ᩳ(I)V

    .line 1220
    invoke-interface {v4}, Ll/֡ܳۘ;->ۜ()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ܽ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/֡ܳۘ;->ۜ(I)V

    .line 1221
    invoke-interface {v4}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ᩳ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/ᩴܳۘ;->ܿ(I)V

    .line 1222
    invoke-interface {v4}, Ll/ᩴܳۘ;->֫()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ᩳ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/ᩴܳۘ;->ܽ(I)V

    .line 1223
    invoke-interface {v4}, Ll/֡ܳۘ;->ܽ()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ܳ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/֡ܳۘ;->֫(I)V

    .line 1224
    invoke-interface {v4}, Ll/֡ܳۘ;->᩷()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->ܳ(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/֡ܳۘ;->᩻(I)V

    .line 1225
    invoke-interface {v4}, Ll/ᩴܳۘ;->ܿ()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->᩻(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/ᩴܳۘ;->ܳ(I)V

    .line 1226
    invoke-interface {v4}, Ll/ᩴܳۘ;->᩻()I

    move-result v5

    invoke-static/range {p3 .. p3}, Ll/ܰ۫ᩳ;->᩻(Ll/ܰ۫ᩳ;)I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface {v4, v5}, Ll/ᩴܳۘ;->ۧ(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1228
    :cond_0
    :try_start_3
    invoke-virtual {v3}, Ll/ܶۤᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v2}, Ll/ܶۤᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :try_start_6
    invoke-virtual/range {p1 .. p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 1363
    invoke-interface {v8, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v9, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1235
    new-instance v0, Ll/ܺ۫ᩳ;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p11

    move/from16 v11, p12

    move-object/from16 v12, p3

    invoke-direct/range {v1 .. v13}, Ll/ܺ۫ᩳ;-><init>(Ll/۟۫ᩳ;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;ILjava/util/List;Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;IILl/ܰ۫ᩳ;Ljava/util/ArrayList;)V

    if-eqz p13, :cond_1

    .line 1261
    invoke-virtual {v0}, Ll/ܺ۫ᩳ;->run()V

    return-void

    :cond_1
    invoke-virtual {v14, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    .line 1214
    :try_start_7
    invoke-virtual {v3}, Ll/ܶۤᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_8
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_9
    invoke-virtual {v2}, Ll/ܶۤᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_a
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_d
    invoke-virtual/range {p1 .. p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/Error; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    .line 1229
    :goto_5
    :try_start_f
    new-instance v2, Ll/᩻᩷ᩳ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v14}, Ll/᩻᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v14, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1230
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 1363
    :goto_6
    invoke-interface {v8, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v9, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1234
    throw v0
.end method

.method public static ֫(Ll/۟۫ᩳ;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;ILjava/util/List;Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;IILl/ܰ۫ᩳ;Ljava/util/ArrayList;)V
    .locals 2

    const/4 v1, 0x0

    .line 1237
    :try_start_0
    iget-object v0, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    if-ne v0, p1, :cond_0

    iget-boolean p1, p0, Ll/۟۫ᩳ;->᩷֫:Z

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->ۙ:Ll/ܰ᩺ۡ;

    if-ne p1, p3, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1238
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-ne p4, p1, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-ne p1, p5, :cond_0

    invoke-direct {p0}, Ll/۟۫ᩳ;->᩶()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    .line 1239
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    if-ne p6, p1, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    if-ne p7, p1, :cond_0

    .line 1240
    invoke-interface {p6}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p1

    if-ne p8, p1, :cond_0

    invoke-interface {p7}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p1

    if-ne p9, p1, :cond_0

    .line 1242
    invoke-static {p5, p10, p11}, Ll/۟۫ᩳ;->֫(Ljava/util/List;Ll/ܰ۫ᩳ;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    .line 1243
    iget-object p2, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    move-object v0, p2

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    const/4 p3, -0x1

    .line 2278
    iput p3, p2, Ll/ۛ۫ᩳ;->ܽ:I

    iput p3, p2, Ll/ۛ۫ᩳ;->ᩳ:I

    iput p3, p2, Ll/ۛ۫ᩳ;->֫:I

    iput p3, p2, Ll/ۛ۫ᩳ;->ۧ:I

    .line 1243
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1244
    :try_start_2
    invoke-direct {p0, p1}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 1245
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 1742
    iget-boolean p1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    .line 1247
    invoke-virtual {p0, p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object p2

    .line 1248
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۫֫()I

    move-result p3

    invoke-virtual {p2}, Ll/۫ۨᩳ;->۬֫()I

    move-result p2

    invoke-direct {p0, p3, p2, p1}, Ll/۟۫ᩳ;->֫(IIZ)V

    .line 1249
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 1243
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    .line 1250
    :cond_0
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩶()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 1251
    iput-boolean p1, p0, Ll/۟۫ᩳ;->֡֫:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1254
    :cond_1
    :goto_0
    iput-boolean v1, p0, Ll/۟۫ᩳ;->֨֫:Z

    .line 1255
    iget-boolean p1, p0, Ll/۟۫ᩳ;->֡֫:Z

    if-eqz p1, :cond_2

    .line 1256
    iput-boolean v1, p0, Ll/۟۫ᩳ;->֡֫:Z

    .line 1257
    new-instance p1, Ll/ۖ۫ᩳ;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Ll/ۖ۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void

    :catchall_1
    move-exception p1

    .line 1254
    iput-boolean v1, p0, Ll/۟۫ᩳ;->֨֫:Z

    .line 1255
    iget-boolean p2, p0, Ll/۟۫ᩳ;->֡֫:Z

    if-eqz p2, :cond_3

    .line 1256
    iput-boolean v1, p0, Ll/۟۫ᩳ;->֡֫:Z

    .line 1257
    new-instance p2, Ll/ۖ۫ᩳ;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p0}, Ll/ۖ۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1259
    :cond_3
    throw p1
.end method

.method public static ֫(Ll/۟۫ᩳ;Ll/۫۫ᩳ;Z)V
    .locals 0

    .line 937
    iput-boolean p2, p1, Ll/۫۫ᩳ;->ܽ:Z

    .line 938
    iget-boolean p1, p0, Ll/۟۫ᩳ;->ۛ:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/۟۫ᩳ;->ܽ֫:Z

    iget-object p2, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-direct {p0, p2}, Ll/۟۫ᩳ;->֫(Ljava/util/List;)Z

    move-result p2

    if-eq p1, p2, :cond_0

    .line 940
    invoke-super {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟۫ᩳ;ZII)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p3, p1}, Ll/۟۫ᩳ;->֫(IIZ)V

    return-void
.end method

.method public static ֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p9

    .line 789
    iget-object v3, v0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v3, :cond_9

    .line 790
    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual/range {p2 .. p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_6

    :cond_0
    sub-float v4, p6, p4

    float-to-int v4, v4

    .line 794
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v5

    const/high16 v6, 0x40400000    # 3.0f

    .line 795
    iget v7, v2, Ll/ۢ۫ۡ;->ܳ:F

    mul-float v7, v7, v6

    if-eqz p1, :cond_1

    .line 796
    iget-boolean v0, v0, Ll/۟۫ᩳ;->᩶֫:Z

    if-nez v0, :cond_1

    .line 797
    iget v0, v2, Ll/᩺֫ܿ;->᩶ۧ:F

    add-float v0, v0, p3

    move v2, v0

    move/from16 v0, p3

    goto :goto_0

    .line 799
    :cond_1
    iget v0, v2, Ll/᩺֫ܿ;->᩶ۧ:F

    sub-float v0, p5, v0

    move/from16 v2, p5

    .line 801
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܳۘ;

    if-eqz p1, :cond_3

    .line 802
    invoke-interface {v6}, Ll/֡ܳۘ;->ۧ()I

    move-result v8

    goto :goto_2

    :cond_3
    invoke-interface {v6}, Ll/֡ܳۘ;->ܽ()I

    move-result v8

    :goto_2
    if-eqz p1, :cond_4

    .line 803
    invoke-interface {v6}, Ll/֡ܳۘ;->ۜ()I

    move-result v9

    goto :goto_3

    :cond_4
    invoke-interface {v6}, Ll/֡ܳۘ;->᩷()I

    move-result v9

    .line 805
    :goto_3
    invoke-virtual {v1, v8}, Ll/᩷۟ᩳ;->֫(I)I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_5

    .line 807
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v10

    iget v10, v10, Ll/ۨܰᩳ;->᩹:I

    add-int/lit8 v10, v10, 0x1

    if-ne v8, v10, :cond_2

    .line 808
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v8

    goto :goto_4

    .line 813
    :cond_5
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v8

    .line 815
    :goto_4
    invoke-virtual {v1, v9}, Ll/᩷۟ᩳ;->֫(I)I

    move-result v10

    if-ne v10, v11, :cond_6

    .line 817
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v10

    iget v10, v10, Ll/ۨܰᩳ;->᩹:I

    add-int/lit8 v10, v10, 0x1

    if-ne v9, v10, :cond_2

    .line 818
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v9

    goto :goto_5

    .line 823
    :cond_6
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v9

    :goto_5
    int-to-float v8, v8

    int-to-float v10, v4

    mul-float v8, v8, v10

    int-to-float v11, v5

    div-float/2addr v8, v11

    int-to-float v9, v9

    mul-float v9, v9, v10

    div-float/2addr v9, v11

    sub-float/2addr v10, v7

    cmpl-float v11, v8, v10

    if-lez v11, :cond_7

    move v8, v10

    :cond_7
    sub-float v10, v9, v8

    cmpg-float v10, v10, v7

    if-gez v10, :cond_8

    add-float v9, v8, v7

    .line 834
    :cond_8
    invoke-static {v6}, Ll/ۗ۫ᩳ;->֫(Ll/֡ܳۘ;)Ll/ۗ۫ᩳ;

    move-result-object v6

    iget v6, v6, Ll/ۗ۫ᩳ;->᩶:I

    move-object/from16 v14, p8

    invoke-virtual {v14, v6}, Landroid/graphics/Paint;->setColor(I)V

    add-float v10, p4, v8

    add-float v12, p4, v9

    move-object/from16 v8, p7

    move v9, v0

    move v11, v2

    move-object/from16 v13, p8

    .line 835
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :cond_9
    :goto_6
    return-void
.end method

.method public static ֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;IIFFZLandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v10, p9

    move-object/from16 v11, p11

    .line 672
    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v4

    iget-object v12, v4, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 673
    iget-object v13, v0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v13, :cond_1a

    .line 674
    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_15

    :cond_0
    if-eqz p1, :cond_1

    .line 677
    iget-object v4, v0, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    goto :goto_0

    :cond_1
    iget-object v4, v0, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    :goto_0
    move-object v14, v4

    .line 2070
    iget-object v4, v14, Ll/۫۫ᩳ;->ۧ:Ljava/util/List;

    if-ne v4, v13, :cond_19

    iget-object v4, v14, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    if-ne v4, v11, :cond_19

    iget-object v4, v14, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    if-ne v4, v1, :cond_19

    iget v4, v14, Ll/۫۫ᩳ;->ܳ:I

    if-ne v4, v2, :cond_19

    iget v4, v14, Ll/۫۫ᩳ;->ᩳ:I

    if-ne v4, v3, :cond_19

    .line 684
    iget-object v15, v14, Ll/۫۫ᩳ;->֫:Ll/ܺۢᩴ;

    .line 685
    invoke-static {}, Ll/ۗ۫ᩳ;->values()[Ll/ۗ۫ᩳ;

    move-result-object v16

    .line 686
    invoke-virtual {v15}, Ll/ܺۢᩴ;->size()I

    move-result v9

    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v9, :cond_4

    .line 687
    invoke-virtual {v15, v8}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v4

    add-int/lit8 v5, v8, 0x1

    .line 688
    invoke-virtual {v15, v5}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v5

    add-int/lit8 v6, v8, 0x2

    .line 689
    invoke-virtual {v15, v6}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v6

    if-gez v6, :cond_2

    .line 691
    iget v6, v0, Ll/۟۫ᩳ;->᩹:I

    invoke-virtual {v10, v6}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    .line 693
    :cond_2
    aget-object v6, v16, v6

    add-int/lit8 v7, v8, 0x3

    .line 694
    invoke-virtual {v15, v7}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v7

    if-eqz v7, :cond_3

    .line 695
    iget v6, v6, Ll/ۗ۫ᩳ;->᩹:I

    goto :goto_2

    :cond_3
    iget v6, v6, Ll/ۗ۫ᩳ;->᩸:I

    :goto_2
    invoke-virtual {v10, v6}, Landroid/graphics/Paint;->setColor(I)V

    :goto_3
    int-to-float v6, v4

    int-to-float v7, v5

    move-object/from16 v4, p8

    move/from16 v5, p5

    move/from16 v17, v7

    move/from16 v7, p6

    move/from16 v18, v8

    move/from16 v8, v17

    move/from16 v17, v9

    move-object/from16 v9, p9

    .line 697
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v8, v18, 0x4

    move/from16 v9, v17

    goto :goto_1

    .line 699
    :cond_4
    iget-object v0, v11, Ll/᩺֫ܿ;->ۡۧ:Ll/ܺۢᩴ;

    .line 700
    invoke-virtual/range {p11 .. p11}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v4

    .line 2087
    iget-object v5, v14, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v6, v14, Ll/۫۫ᩳ;->ܳ:I

    invoke-virtual {v5, v6}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v5

    .line 2091
    iget-object v6, v14, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v7, v14, Ll/۫۫ᩳ;->ᩳ:I

    invoke-virtual {v6, v7}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v6

    move v7, v2

    :goto_4
    if-gt v5, v6, :cond_1a

    .line 27
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    const/4 v10, 0x0

    :goto_5
    if-gt v10, v8, :cond_7

    add-int v14, v10, v8

    ushr-int v9, v14, v9

    .line 30
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֡ܳۘ;

    if-eqz p1, :cond_5

    .line 33
    invoke-interface {v14}, Ll/֡ܳۘ;->ۧ()I

    move-result v15

    .line 34
    invoke-interface {v14}, Ll/֡ܳۘ;->ۜ()I

    move-result v16

    goto :goto_6

    .line 36
    :cond_5
    invoke-interface {v14}, Ll/֡ܳۘ;->ܽ()I

    move-result v15

    .line 37
    invoke-interface {v14}, Ll/֡ܳۘ;->᩷()I

    move-result v16

    :goto_6
    move/from16 p0, v6

    move/from16 v6, v16

    if-ge v5, v15, :cond_6

    add-int/lit8 v9, v9, -0x1

    move v8, v9

    goto :goto_7

    :cond_6
    if-lt v5, v6, :cond_8

    add-int/lit8 v9, v9, 0x1

    move v10, v9

    :goto_7
    const/4 v9, 0x1

    move/from16 v6, p0

    goto :goto_5

    :cond_7
    move/from16 p0, v6

    const/4 v14, 0x0

    :cond_8
    if-nez v14, :cond_9

    goto :goto_8

    .line 709
    :cond_9
    invoke-interface {v14}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_a

    goto :goto_8

    .line 713
    :cond_a
    invoke-virtual {v1, v5, v7}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_b

    :goto_8
    move-object/from16 v21, v13

    goto/16 :goto_14

    .line 717
    :cond_b
    invoke-virtual {v1, v8}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v7

    .line 718
    invoke-virtual {v1, v8}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v8

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ge v7, v2, :cond_c

    const/4 v7, 0x0

    move v7, v2

    const/4 v9, 0x0

    goto :goto_9

    :cond_c
    const/4 v9, 0x1

    :goto_9
    add-int/lit8 v10, v8, 0x1

    .line 727
    invoke-virtual {v12, v7}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v15

    .line 728
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v16

    .line 729
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v2

    :goto_a
    if-gt v7, v8, :cond_18

    float-to-int v15, v15

    if-eqz p7, :cond_d

    if-nez v9, :cond_d

    .line 732
    invoke-virtual/range {p11 .. p11}, Ll/᩺֫ܿ;->۠()I

    move-result v9

    goto :goto_b

    :cond_d
    const/4 v9, 0x0

    .line 733
    :goto_b
    invoke-virtual {v2, v7}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v3

    move-object/from16 p8, v2

    .line 734
    iget v2, v3, Ll/ۨܰᩳ;->᩶:I

    move/from16 p9, v8

    .line 735
    iget v8, v3, Ll/ۨܰᩳ;->᩸:I

    move/from16 v17, v10

    add-int/lit8 v10, v16, -0x1

    if-ge v7, v10, :cond_e

    add-int/lit8 v10, v7, 0x1

    .line 736
    invoke-virtual {v1, v10}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v10

    iget v3, v3, Ll/ۨܰᩳ;->᩹:I

    if-eq v10, v3, :cond_e

    add-int/lit8 v8, v8, 0x1

    .line 742
    :cond_e
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    const/4 v10, 0x0

    const/16 v18, 0x0

    move v11, v2

    const/4 v1, 0x0

    :goto_c
    if-ge v1, v3, :cond_17

    .line 743
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ll/ᩴܳۘ;

    if-eqz p1, :cond_f

    .line 746
    invoke-interface {v14}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v19

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v20

    add-int v20, v20, v19

    .line 747
    invoke-interface {v14}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v19

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->֫()I

    move-result v21

    goto :goto_d

    .line 749
    :cond_f
    invoke-interface {v14}, Ll/ᩴܳۘ;->ܿ()I

    move-result v19

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->ܿ()I

    move-result v20

    add-int v20, v20, v19

    .line 750
    invoke-interface {v14}, Ll/ᩴܳۘ;->ܿ()I

    move-result v19

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->᩻()I

    move-result v21

    :goto_d
    move-object/from16 v22, v6

    move/from16 v24, v20

    move/from16 v20, v3

    move/from16 v3, v24

    add-int v6, v21, v19

    if-le v6, v2, :cond_15

    if-gt v8, v3, :cond_10

    goto/16 :goto_12

    .line 755
    :cond_10
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 756
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-eqz p1, :cond_11

    move/from16 v19, v2

    .line 759
    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v2

    move-object/from16 v21, v13

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->֫()I

    move-result v13

    if-ne v2, v13, :cond_12

    goto :goto_e

    :cond_11
    move/from16 v19, v2

    move-object/from16 v21, v13

    .line 761
    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->ܿ()I

    move-result v2

    invoke-interface/range {v18 .. v18}, Ll/ᩴܳۘ;->᩻()I

    move-result v13

    if-ne v2, v13, :cond_12

    :goto_e
    const/4 v2, 0x1

    goto :goto_f

    :cond_12
    const/4 v2, 0x0

    .line 763
    :goto_f
    move-object/from16 v13, p10

    check-cast v13, Ll/᩶ۤᩳ;

    invoke-virtual {v13, v11, v10, v3}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v11

    add-float/2addr v10, v11

    int-to-float v11, v9

    add-float v23, v10, v11

    if-eqz v2, :cond_13

    const/high16 v2, 0x41800000    # 16.0f

    div-float v2, v4, v2

    sub-float v6, v23, v2

    float-to-int v6, v6

    int-to-float v6, v6

    const/high16 v11, 0x40000000    # 2.0f

    mul-float v2, v2, v11

    add-float/2addr v2, v6

    move/from16 v23, v6

    goto :goto_10

    :cond_13
    if-ne v6, v8, :cond_14

    move/from16 v2, p6

    :goto_10
    move v11, v3

    goto :goto_11

    .line 772
    :cond_14
    invoke-virtual {v13, v3, v10, v6}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    add-float/2addr v10, v2

    add-float v2, v10, v11

    move v11, v6

    :goto_11
    cmpg-float v3, v23, v2

    if-gez v3, :cond_16

    cmpg-float v3, v2, p5

    if-ltz v3, :cond_16

    cmpl-float v3, v23, p6

    if-gtz v3, :cond_16

    .line 775
    invoke-virtual {v0, v15}, Ll/ܺۢᩴ;->add(I)Z

    .line 776
    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ܺۢᩴ;->add(I)Z

    .line 777
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ܺۢᩴ;->add(I)Z

    .line 778
    invoke-static/range {v18 .. v18}, Ll/ۗ۫ᩳ;->֫(Ll/ᩴܳۘ;)Ll/ۗ۫ᩳ;

    move-result-object v2

    iget v2, v2, Ll/ۗ۫ᩳ;->᩸:I

    invoke-virtual {v0, v2}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_13

    :cond_15
    :goto_12
    move/from16 v19, v2

    move-object/from16 v21, v13

    :cond_16
    :goto_13
    add-int/lit8 v1, v1, 0x1

    move/from16 v2, v19

    move/from16 v3, v20

    move-object/from16 v13, v21

    move-object/from16 v6, v22

    goto/16 :goto_c

    :cond_17
    move-object/from16 v22, v6

    move-object/from16 v21, v13

    add-int/lit8 v7, v7, 0x1

    .line 781
    invoke-virtual {v12, v7}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v15

    const/4 v9, 0x0

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v2, p8

    move/from16 v8, p9

    move-object/from16 v11, p11

    move/from16 v10, v17

    goto/16 :goto_a

    :cond_18
    move/from16 v17, v10

    move-object/from16 v21, v13

    move/from16 v7, v17

    :goto_14
    add-int/lit8 v5, v5, 0x1

    move/from16 v6, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v11, p11

    move-object/from16 v13, v21

    goto/16 :goto_4

    .line 679
    :cond_19
    iget-object v1, v0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 680
    iget-object v1, v0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 681
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidate()V

    :cond_1a
    :goto_15
    return-void
.end method

.method public static ֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;IIILandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    .line 543
    iget v6, v0, Ll/۟۫ᩳ;->᩶:I

    iget-object v7, v0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v8, v0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v9

    iget-object v9, v9, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    .line 544
    iget-object v10, v0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v10, :cond_19

    .line 545
    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v11

    invoke-virtual {v11}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v11

    if-nez v11, :cond_0

    goto/16 :goto_16

    :cond_0
    if-eqz v1, :cond_1

    .line 548
    iget-object v11, v0, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    goto :goto_0

    :cond_1
    iget-object v11, v0, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    .line 550
    :goto_0
    invoke-virtual/range {p0 .. p1}, Ll/۟۫ᩳ;->֫(Z)Ll/۫ۨᩳ;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v13, v11, Ll/۫۫ᩳ;->֫:Ll/ܺۢᩴ;

    .line 2058
    invoke-virtual {v12}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v12

    iput-object v12, v11, Ll/۫۫ᩳ;->᩻:Ll/۟᩺ᩳ;

    .line 2059
    invoke-interface {v12}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v12

    iput v12, v11, Ll/۫۫ᩳ;->᩷:I

    .line 2060
    iput-object v10, v11, Ll/۫۫ᩳ;->ۧ:Ljava/util/List;

    .line 2061
    invoke-static/range {p8 .. p8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, p8

    iput-object v12, v11, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    .line 2062
    invoke-static/range {p2 .. p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v11, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    .line 2063
    iput v3, v11, Ll/۫۫ᩳ;->ܳ:I

    .line 2064
    iput v4, v11, Ll/۫۫ᩳ;->ᩳ:I

    .line 2065
    invoke-virtual {v13}, Ll/ܺۢᩴ;->clear()V

    .line 554
    iget-boolean v12, v0, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz v12, :cond_a

    .line 555
    iget-boolean v12, v0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v12, :cond_2

    move-object v15, v8

    goto :goto_1

    :cond_2
    move-object v15, v7

    .line 557
    :goto_1
    invoke-virtual {v15}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v14

    .line 558
    invoke-virtual {v15}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    .line 559
    invoke-virtual {v15}, Ll/۫ۨᩳ;->۬֫()I

    move-result v15

    if-ne v0, v15, :cond_a

    if-eqz v1, :cond_3

    move-object v7, v8

    .line 561
    :cond_3
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v8

    const/4 v15, 0x0

    :goto_2
    if-gt v15, v8, :cond_a

    if-ne v15, v8, :cond_4

    move/from16 v17, v8

    move v3, v14

    move v4, v3

    const/4 v8, 0x0

    goto :goto_3

    .line 568
    :cond_4
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v17, v8

    move-object/from16 v8, v16

    check-cast v8, Ll/֡ܳۘ;

    .line 569
    invoke-interface {v8, v12}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v16

    .line 570
    invoke-interface {v8, v12}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v18

    move/from16 v4, v16

    move/from16 v3, v18

    :goto_3
    if-gt v4, v0, :cond_8

    if-ne v0, v14, :cond_5

    if-ne v4, v0, :cond_5

    if-ne v4, v3, :cond_5

    goto :goto_5

    :cond_5
    if-eqz v8, :cond_7

    if-le v3, v0, :cond_6

    goto :goto_4

    :cond_6
    if-ne v0, v14, :cond_7

    if-ne v3, v0, :cond_7

    :goto_4
    move-object/from16 v4, p7

    move-object v14, v8

    goto :goto_7

    :cond_7
    add-int/lit8 v15, v15, 0x1

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v8, v17

    goto :goto_2

    :cond_8
    :goto_5
    if-eq v12, v1, :cond_9

    if-lez v15, :cond_9

    add-int/lit8 v15, v15, -0x1

    .line 575
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳۘ;

    .line 576
    invoke-interface {v3, v12}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    sub-int/2addr v0, v4

    invoke-interface {v3, v1}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v3

    add-int/2addr v0, v3

    .line 578
    :cond_9
    iget-object v3, v7, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v3, v0}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v0

    .line 579
    iget v3, v11, Ll/۫۫ᩳ;->ܳ:I

    if-lt v0, v3, :cond_a

    iget v3, v11, Ll/۫۫ᩳ;->ᩳ:I

    if-gt v0, v3, :cond_a

    .line 580
    invoke-virtual {v2, v0}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v3

    .line 581
    invoke-virtual {v2, v0}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v0

    .line 582
    invoke-virtual {v9, v3}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v3

    add-int/lit8 v0, v0, 0x1

    .line 583
    invoke-virtual {v9, v0}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v0

    move-object/from16 v4, p7

    .line 584
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v15, 0x0

    int-to-float v7, v5

    const/4 v8, -0x1

    move-object/from16 v14, p6

    move/from16 v16, v3

    move/from16 v17, v7

    move/from16 v18, v0

    move-object/from16 v19, p7

    .line 585
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    float-to-int v3, v3

    .line 586
    invoke-virtual {v13, v3}, Ll/ܺۢᩴ;->add(I)Z

    float-to-int v0, v0

    .line 587
    invoke-virtual {v13, v0}, Ll/ܺۢᩴ;->add(I)Z

    .line 588
    invoke-virtual {v13, v8}, Ll/ܺۢᩴ;->add(I)Z

    const/4 v0, 0x0

    .line 589
    invoke-virtual {v13, v0}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_6

    :cond_a
    move-object/from16 v4, p7

    :goto_6
    const/4 v14, 0x0

    .line 2087
    :goto_7
    iget-object v0, v11, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v3, v11, Ll/۫۫ᩳ;->ܳ:I

    invoke-virtual {v0, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v0

    .line 2091
    iget-object v3, v11, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v7, v11, Ll/۫۫ᩳ;->ᩳ:I

    invoke-virtual {v3, v7}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 2095
    iget-object v7, v11, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {v7}, Ll/ۢ۫ۡ;->ܳ()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x41800000    # 16.0f

    div-float/2addr v7, v8

    .line 608
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    move-object/from16 v10, p0

    move-object v12, v4

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_19

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/֡ܳۘ;

    if-eqz v1, :cond_b

    .line 609
    invoke-interface {v15}, Ll/֡ܳۘ;->ۧ()I

    move-result v16

    goto :goto_a

    :cond_b
    invoke-interface {v15}, Ll/֡ܳۘ;->ܽ()I

    move-result v16

    :goto_a
    move/from16 v4, v16

    if-eqz v1, :cond_c

    .line 610
    invoke-interface {v15}, Ll/֡ܳۘ;->ۜ()I

    move-result v16

    goto :goto_b

    :cond_c
    invoke-interface {v15}, Ll/֡ܳۘ;->᩷()I

    move-result v16

    :goto_b
    move-object/from16 p8, v8

    move/from16 v8, v16

    if-lt v8, v0, :cond_18

    if-le v4, v3, :cond_d

    move/from16 v22, v0

    move/from16 v21, v3

    move-object/from16 v23, v13

    goto :goto_c

    :cond_d
    move/from16 v21, v3

    .line 614
    invoke-static {v15}, Ll/ۗ۫ᩳ;->֫(Ll/֡ܳۘ;)Ll/ۗ۫ᩳ;

    move-result-object v3

    sub-int v16, v4, v0

    move/from16 v22, v0

    add-int v0, v16, p3

    .line 615
    invoke-virtual {v2, v4, v0}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result v0

    move-object/from16 v23, v13

    const/4 v13, -0x1

    if-ne v0, v13, :cond_f

    .line 617
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    if-ne v4, v0, :cond_e

    .line 618
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    goto :goto_d

    :cond_e
    :goto_c
    move-object v0, v10

    move-object/from16 v8, v23

    move/from16 v10, p4

    goto/16 :goto_15

    .line 624
    :cond_f
    :goto_d
    iget-boolean v10, v10, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz v10, :cond_10

    const/4 v13, 0x0

    goto :goto_e

    :cond_10
    if-eqz v1, :cond_11

    int-to-float v10, v5

    .line 2099
    iget-object v13, v11, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    iget v1, v13, Ll/᩺֫ܿ;->ۢۧ:F

    iget v13, v13, Ll/᩺֫ܿ;->ۜۧ:F

    mul-float v1, v1, v13

    sub-float/2addr v10, v1

    move/from16 v18, v10

    const/16 v16, 0x0

    goto :goto_f

    :cond_11
    iget-object v1, v11, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    iget v10, v1, Ll/᩺֫ܿ;->ۢۧ:F

    iget v1, v1, Ll/᩺֫ܿ;->ۜۧ:F

    mul-float v13, v10, v1

    :goto_e
    int-to-float v1, v5

    move/from16 v18, v1

    move/from16 v16, v13

    .line 634
    :goto_f
    invoke-virtual {v9, v0}, Ll/ۗۤᩳ;->ܽ(I)F

    move-result v1

    if-ne v4, v8, :cond_14

    if-nez v0, :cond_12

    add-float v0, v1, v7

    add-float/2addr v0, v7

    goto :goto_10

    .line 638
    :cond_12
    invoke-virtual/range {p2 .. p2}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    if-ne v0, v4, :cond_13

    sub-float v0, v1, v7

    sub-float/2addr v0, v7

    move/from16 v10, p4

    goto :goto_12

    :cond_13
    add-float v0, v1, v7

    sub-float/2addr v1, v7

    :goto_10
    move/from16 v10, p4

    move/from16 v24, v1

    move v1, v0

    move/from16 v0, v24

    goto :goto_12

    :cond_14
    const/4 v4, 0x1

    :goto_11
    add-int/lit8 v0, v0, 0x1

    move/from16 v10, p4

    if-gt v0, v10, :cond_15

    .line 648
    invoke-virtual {v2, v0}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v13

    if-ge v13, v8, :cond_15

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :cond_15
    int-to-float v0, v4

    .line 2103
    iget-object v4, v11, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {v4}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v4

    mul-float v4, v4, v0

    add-float/2addr v4, v1

    move v0, v1

    move v1, v4

    :goto_12
    if-ne v15, v14, :cond_16

    .line 657
    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_13

    .line 659
    :cond_16
    iget v4, v3, Ll/ۗ۫ᩳ;->᩸:I

    invoke-virtual {v12, v4}, Landroid/graphics/Paint;->setColor(I)V

    :goto_13
    move-object v4, v15

    move-object/from16 v15, p6

    move/from16 v17, v0

    move/from16 v19, v1

    move-object/from16 v20, v12

    .line 661
    invoke-virtual/range {v15 .. v20}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    float-to-int v0, v0

    move-object/from16 v8, v23

    .line 662
    invoke-virtual {v8, v0}, Ll/ܺۢᩴ;->add(I)Z

    float-to-int v0, v1

    .line 663
    invoke-virtual {v8, v0}, Ll/ܺۢᩴ;->add(I)Z

    .line 664
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v8, v0}, Ll/ܺۢᩴ;->add(I)Z

    .line 665
    invoke-interface {v4}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_17

    const/4 v0, 0x0

    goto :goto_14

    :cond_17
    const/4 v0, 0x1

    :goto_14
    invoke-virtual {v8, v0}, Ll/ܺۢᩴ;->add(I)Z

    move/from16 v1, p1

    move-object/from16 v4, p7

    move-object v13, v8

    move/from16 v3, v21

    move/from16 v0, v22

    move-object/from16 v8, p8

    goto/16 :goto_8

    :cond_18
    move/from16 v10, p4

    move/from16 v22, v0

    move/from16 v21, v3

    move-object v8, v13

    move-object/from16 v0, p0

    move-object/from16 v12, p7

    :goto_15
    move/from16 v1, p1

    move-object/from16 v4, p7

    move-object v10, v0

    move-object v13, v8

    move/from16 v3, v21

    move/from16 v0, v22

    move-object/from16 v8, p8

    goto/16 :goto_9

    :cond_19
    :goto_16
    return-void
.end method

.method private ֫(Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;)V
    .locals 1

    .line 1636
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩵֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 1639
    iput-boolean p1, p0, Ll/۟۫ᩳ;->᩵֫:Z

    const/4 p1, 0x0

    .line 1640
    invoke-direct {p0, p1}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 1641
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۗ()V

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(ZLl/ᩴܳۘ;Z)V
    .locals 2

    .line 1870
    invoke-interface {p2, p1}, Ll/ᩴܳۘ;->֫(Z)I

    move-result p2

    if-eqz p1, :cond_0

    .line 1874
    iget-object p1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 1876
    :goto_0
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 1879
    :cond_1
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۟ܽ()V

    .line 1880
    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1881
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۠ܽ()V

    .line 1882
    iget-object v0, p0, Ll/۟۫ᩳ;->᩸:Ll/ۙ۫ᩳ;

    .line 2204
    invoke-virtual {v0, p1}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result v0

    float-to-int v0, v0

    .line 1885
    iget-object v1, p1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1, p2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v1

    mul-float v1, v1, p2

    float-to-int p2, v1

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    sub-int/2addr p2, v0

    .line 1887
    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->᩷(I)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Ll/۫ۨᩳ;->ۢ(II)V

    return-void

    :cond_2
    sub-int/2addr p2, v0

    .line 1889
    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->᩷(I)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Ll/۫ۨᩳ;->scrollTo(II)V

    return-void
.end method

.method private ֫(Ljava/util/List;)Z
    .locals 3

    if-eqz p1, :cond_0

    .line 953
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 946
    iget-object v2, p0, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    .line 947
    invoke-virtual {v2, v0, p1}, Ll/۫۫ᩳ;->֫(Ll/۫ۨᩳ;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    .line 948
    invoke-virtual {v0, v1, p1}, Ll/۫۫ᩳ;->֫(Ll/۫ۨᩳ;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۖ(Ll/۟۫ᩳ;)Z
    .locals 1

    .line 953
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۗ()V
    .locals 2

    .line 2007
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2008
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 2009
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V

    return-void

    .line 2011
    :cond_0
    new-instance v0, Ll/ۡ۫ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۡ۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ۙ()Z
    .locals 1

    .line 1719
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩻֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ۜ(Ll/۟۫ᩳ;)Ll/۫۫ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/۟۫ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۟۫ᩳ;->۠֫:Z

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/۟۫ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۟۫ᩳ;->ۚ֫:I

    return p0
.end method

.method public static ۧ(ZIIILjava/util/List;)I
    .locals 6

    .line 343
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_a

    .line 345
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴܳۘ;

    .line 346
    invoke-interface {v3, p0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v4

    .line 347
    invoke-interface {v3, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v5

    if-gt v4, p1, :cond_6

    if-ne p1, p2, :cond_0

    if-ne v4, p1, :cond_0

    if-ne v4, v5, :cond_0

    goto :goto_2

    :cond_0
    if-gt v5, p1, :cond_2

    if-ne p1, p2, :cond_1

    if-ne v5, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    xor-int/lit8 p2, p0, 0x1

    .line 370
    invoke-interface {v3, p2}, Ll/ᩴܳۘ;->֫(Z)I

    move-result p3

    .line 371
    invoke-interface {v3, p2}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result p2

    sub-int/2addr p1, v4

    .line 373
    instance-of p4, v3, Ll/֡ܳۘ;

    if-eqz p4, :cond_3

    move-object p4, v3

    check-cast p4, Ll/֡ܳۘ;

    .line 374
    invoke-interface {p4}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object p4

    if-eqz p4, :cond_3

    .line 376
    invoke-interface {v3, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v0

    invoke-interface {v3, p0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v1

    sub-int/2addr v0, v1

    sub-int v1, p2, p3

    .line 378
    invoke-static {p0, p1, v0, v1, p4}, Ll/۟۫ᩳ;->ۧ(ZIIILjava/util/List;)I

    move-result p1

    :cond_3
    add-int/2addr p1, p3

    if-ge p1, p3, :cond_4

    return p3

    :cond_4
    if-le p1, p2, :cond_5

    return p2

    :cond_5
    return p1

    :cond_6
    :goto_2
    if-lez v2, :cond_7

    add-int/lit8 p2, v2, -0x1

    .line 351
    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܳۘ;

    xor-int/lit8 v1, p0, 0x1

    .line 352
    invoke-interface {p2, v1}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v1

    .line 353
    invoke-interface {p2, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result p2

    sub-int/2addr p1, p2

    add-int/2addr p1, v1

    if-ge p1, v1, :cond_7

    move p1, v1

    :cond_7
    add-int/lit8 v2, v2, 0x1

    if-ge v2, v0, :cond_8

    .line 359
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܳۘ;

    xor-int/lit8 p0, p0, 0x1

    .line 360
    invoke-interface {p2, p0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result p0

    if-le p1, p0, :cond_8

    move p1, p0

    :cond_8
    if-le p1, p3, :cond_9

    goto :goto_3

    :cond_9
    return p1

    :cond_a
    if-lez v0, :cond_b

    add-int/lit8 v0, v0, -0x1

    .line 391
    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܳۘ;

    .line 392
    invoke-interface {p2, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result p4

    if-lt p1, p4, :cond_b

    sub-int/2addr p1, p4

    xor-int/lit8 p0, p0, 0x1

    .line 394
    invoke-interface {p2, p0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result p0

    add-int/2addr p1, p0

    :cond_b
    if-gez p1, :cond_c

    return v1

    :cond_c
    if-le p1, p3, :cond_d

    :goto_3
    return p3

    :cond_d
    return p1
.end method

.method private ۧ(Ljava/util/List;)V
    .locals 0

    .line 1435
    iput-object p1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    .line 1436
    iget-object p1, p0, Ll/۟۫ᩳ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public static synthetic ۧ(Ll/۟۫ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 1229
    iput-boolean v0, p0, Ll/۟۫ᩳ;->֨֫:Z

    iput-boolean v0, p0, Ll/۟۫ᩳ;->֡֫:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/۟۫ᩳ;II)V
    .locals 2

    .line 304
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 305
    invoke-direct {p0, p1, p2, v1}, Ll/۟۫ᩳ;->֫(IIZ)V

    .line 306
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 307
    :cond_0
    iget-boolean p0, p0, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz p0, :cond_1

    .line 308
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public static synthetic ۧ(Ll/۟۫ᩳ;III)V
    .locals 4

    .line 266
    iget-boolean v0, p0, Ll/۟۫ᩳ;->۠֫:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 269
    :cond_0
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 270
    iget-object v1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    .line 271
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    return-void

    :cond_1
    if-ne p1, p3, :cond_2

    .line 276
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p1

    invoke-virtual {v1, p2, p1}, Ll/۫ۨᩳ;->ۜ(II)V

    .line 277
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    return-void

    .line 280
    :cond_2
    iget-object p1, p0, Ll/۟۫ᩳ;->᩸:Ll/ۙ۫ᩳ;

    const/4 v2, 0x0

    .line 281
    invoke-virtual {p1, v0, v1, v2}, Ll/ۙ۫ᩳ;->֫(Ll/۫ۨᩳ;Ll/۫ۨᩳ;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 282
    iget-object v2, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v2

    .line 283
    iget v3, p1, Ll/ۙ۫ᩳ;->֫:I

    int-to-float v3, v3

    mul-float v3, v3, v2

    int-to-float p3, p3

    sub-float/2addr v3, p3

    .line 284
    invoke-virtual {p1, v0}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result p3

    sub-float/2addr p3, v3

    div-float/2addr p3, v2

    .line 285
    iget v0, p1, Ll/ۙ۫ᩳ;->ۧ:I

    iget v3, p1, Ll/ۙ۫ᩳ;->ܽ:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    mul-float v0, v0, p3

    int-to-float p3, v3

    add-float/2addr v0, p3

    mul-float v0, v0, v2

    .line 287
    invoke-virtual {p1, v1}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result p1

    sub-float/2addr v0, p1

    float-to-int p3, v0

    .line 289
    :cond_3
    invoke-virtual {v1, p2, p3}, Ll/۫ۨᩳ;->ۜ(II)V

    .line 290
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    return-void
.end method

.method private ۫()V
    .locals 3

    .line 1659
    iget-object v0, p0, Ll/۟۫ᩳ;->ۖ֫:Ll/۟᩺ᩳ;

    .line 1660
    iget-object v1, p0, Ll/۟۫ᩳ;->ۘ֫:Ll/۟᩺ᩳ;

    const/4 v2, 0x0

    .line 1661
    iput-object v2, p0, Ll/۟۫ᩳ;->ۘ֫:Ll/۟᩺ᩳ;

    iput-object v2, p0, Ll/۟۫ᩳ;->ۖ֫:Ll/۟᩺ᩳ;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    .line 1363
    invoke-interface {v0, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v1, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    :cond_0
    return-void
.end method

.method private ۬()V
    .locals 8

    .line 1904
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 1905
    iget-object v2, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    const/4 v4, 0x1

    .line 1363
    invoke-interface {v1, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v3, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    const/4 v4, 0x0

    .line 1907
    :try_start_0
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-interface {v3}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1908
    :try_start_2
    invoke-virtual {p0, v5, v6}, Ll/۟۫ᩳ;->֫(Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;)Ljava/util/ArrayList;

    move-result-object v7

    .line 1909
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v1, v0, :cond_0

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v3, v0, :cond_0

    .line 1910
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v0

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v0, v2, :cond_0

    invoke-virtual {v6}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v0

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 1911
    invoke-direct {p0, v7}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1913
    invoke-direct {p0, v0}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 1914
    new-instance v0, Ll/֡۫ᩳ;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0}, Ll/֡۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1916
    :goto_0
    :try_start_3
    invoke-virtual {v6}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1363
    invoke-interface {v1, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v3, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    return-void

    :catchall_0
    move-exception v0

    .line 1907
    :try_start_5
    invoke-virtual {v6}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v2

    :try_start_8
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    .line 1363
    invoke-interface {v1, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v3, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1918
    throw v0
.end method

.method public static bridge synthetic ܳ(Ll/۟۫ᩳ;)Ll/۫ۨᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/۟۫ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۟۫ᩳ;->᩶֫:Z

    return p0
.end method

.method public static synthetic ܽ(Ll/۟۫ᩳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/۟۫ᩳ;)Ll/۫ۨᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/۟۫ᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    return-object p0
.end method

.method private ᩶()Z
    .locals 2

    .line 1546
    iget-object v0, p0, Ll/۟۫ᩳ;->ۜ֫:Ljava/lang/Object;

    monitor-enter v0

    .line 1547
    :try_start_0
    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܳ֫:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 1548
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ᩷(Ll/۟۫ᩳ;)Ll/ۛ۫ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    return-object p0
.end method

.method private ᩸()V
    .locals 3

    .line 1724
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 1726
    :goto_0
    invoke-virtual {p0}, Ll/۟۫ᩳ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1727
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1728
    iget-object v1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܶ()V

    .line 1729
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܶ()V

    :cond_1
    const-wide/16 v1, 0xa

    .line 1731
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    .line 1732
    iput-boolean v0, p0, Ll/۟۫ᩳ;->᩻֫:Z

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 1734
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    :goto_1
    return-void
.end method

.method private ᩹()V
    .locals 1

    .line 1994
    iget-object v0, p0, Ll/۟۫ᩳ;->۬:Ll/ۘ᩷ᩳ;

    if-eqz v0, :cond_1

    .line 1995
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1996
    iget-object v0, p0, Ll/۟۫ᩳ;->۬:Ll/ۘ᩷ᩳ;

    invoke-virtual {v0}, Ll/ۘ᩷ᩳ;->run()V

    return-void

    .line 1998
    :cond_0
    iget-object v0, p0, Ll/۟۫ᩳ;->۬:Ll/ۘ᩷ᩳ;

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/۟۫ᩳ;)Ll/۫۫ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    return-object p0
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 28

    move-object/from16 v1, p0

    .line 842
    iget-object v0, v1, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-static {v0, v2}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Ll/۫ۨᩳ;)V

    iget-object v3, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    .line 849
    invoke-virtual {v2}, Ll/۫ۨᩳ;->computeScroll()V

    const/4 v4, 0x1

    .line 850
    iput-boolean v4, v2, Ll/۫ۨᩳ;->ۘ֫:Z

    .line 851
    iput-boolean v4, v1, Ll/۟۫ᩳ;->ۛ:Z

    const/4 v5, 0x0

    .line 853
    :try_start_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 855
    iput-boolean v5, v1, Ll/۟۫ᩳ;->ۛ:Z

    .line 856
    iput-boolean v5, v2, Ll/۫ۨᩳ;->ۘ֫:Z

    .line 860
    iget-object v5, v1, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    .line 861
    invoke-direct {v1, v5}, Ll/۟۫ᩳ;->֫(Ljava/util/List;)Z

    move-result v6

    .line 862
    iput-boolean v6, v1, Ll/۟۫ᩳ;->ܽ֫:Z

    .line 863
    iget-object v13, v3, Ll/᩺֫ܿ;->ܳۧ:Ll/֫ۖܽ;

    .line 864
    iget-boolean v7, v1, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz v7, :cond_0

    .line 866
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 867
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    .line 868
    sget v3, Ll/᩹֡᩷;->ۢ:I

    const v4, 0xffffff

    and-int/2addr v3, v4

    const/high16 v4, -0x60000000

    or-int/2addr v3, v4

    sget v4, Ll/᩹֡᩷;->ۖ:I

    .line 35
    invoke-static {v3, v4}, Ll/۟ۗ;->ۧ(II)I

    move-result v3

    .line 868
    invoke-virtual {v13, v3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v9, v0

    .line 869
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v10, v3

    int-to-float v11, v2

    const/4 v3, 0x0

    move-object/from16 v7, p1

    move v8, v3

    move-object v12, v13

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 870
    sget v4, Ll/᩹֡᩷;->ۢ:I

    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v0, v0, 0x2

    int-to-float v9, v0

    .line 872
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v10, v0

    add-int/lit8 v2, v2, -0x2

    int-to-float v11, v2

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_5

    :cond_0
    if-eqz v6, :cond_8

    .line 2087
    iget-object v7, v1, Ll/۟۫ᩳ;->ܰ:Ll/۫۫ᩳ;

    iget-object v8, v7, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v9, v7, Ll/۫۫ᩳ;->ܳ:I

    invoke-virtual {v8, v9}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v8

    iget-object v9, v1, Ll/۟۫ᩳ;->۟:Ll/۫۫ᩳ;

    iget-object v10, v9, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v11, v9, Ll/۫۫ᩳ;->ܳ:I

    invoke-virtual {v10, v11}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v10

    .line 2091
    iget-object v11, v7, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v12, v7, Ll/۫۫ᩳ;->ᩳ:I

    invoke-virtual {v11, v12}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v11

    add-int/2addr v11, v4

    iget-object v12, v9, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget v14, v9, Ll/۫۫ᩳ;->ᩳ:I

    invoke-virtual {v12, v14}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v12

    add-int/2addr v12, v4

    .line 881
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v14, 0x40000000    # 2.0f

    div-float/2addr v4, v14

    .line 2099
    iget-object v15, v7, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    iget v14, v15, Ll/᩺֫ܿ;->ۢۧ:F

    iget v15, v15, Ll/᩺֫ܿ;->ۜۧ:F

    mul-float v14, v14, v15

    sub-float v14, v4, v14

    iget-object v15, v9, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    move/from16 v24, v6

    iget v6, v15, Ll/᩺֫ܿ;->ۢۧ:F

    iget v15, v15, Ll/᩺֫ܿ;->ۜۧ:F

    mul-float v6, v6, v15

    add-float/2addr v6, v4

    .line 884
    iget v3, v3, Ll/᩺֫ܿ;->ۜۧ:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 886
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳۘ;

    .line 887
    invoke-interface {v5}, Ll/֡ܳۘ;->ۜ()I

    move-result v15

    if-ge v15, v8, :cond_1

    .line 888
    invoke-interface {v5}, Ll/֡ܳۘ;->᩷()I

    move-result v15

    if-ge v15, v10, :cond_1

    goto :goto_0

    .line 891
    :cond_1
    invoke-interface {v5}, Ll/֡ܳۘ;->ۧ()I

    move-result v15

    if-le v15, v11, :cond_2

    .line 892
    invoke-interface {v5}, Ll/֡ܳۘ;->ܽ()I

    move-result v15

    if-le v15, v12, :cond_2

    goto :goto_0

    .line 895
    :cond_2
    invoke-static {v5}, Ll/ۗ۫ᩳ;->֫(Ll/֡ܳۘ;)Ll/ۗ۫ᩳ;

    move-result-object v15

    move-object/from16 v16, v4

    .line 896
    iget-object v4, v1, Ll/۟۫ᩳ;->ۡ֫:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    move/from16 v25, v8

    .line 897
    iget-object v8, v1, Ll/۟۫ᩳ;->ۙ֫:[F

    move/from16 v26, v10

    const/4 v10, 0x0

    move/from16 v27, v11

    const/4 v11, 0x1

    invoke-virtual {v7, v5, v11, v8, v10}, Ll/۫۫ᩳ;->֫(Ll/֡ܳۘ;Z[FI)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    const/4 v11, 0x2

    .line 900
    invoke-virtual {v9, v5, v10, v8, v11}, Ll/۫۫ᩳ;->֫(Ll/֡ܳۘ;Z[FI)Z

    move-result v5

    if-nez v5, :cond_4

    :goto_1
    move-object/from16 v5, p1

    goto/16 :goto_4

    .line 904
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v11

    sub-int/2addr v5, v11

    .line 905
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v11

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v17

    sub-int v11, v11, v17

    .line 906
    aget v10, v8, v10

    int-to-float v5, v5

    const/16 v17, 0x0

    add-float/2addr v10, v5

    aput v10, v8, v17

    const/16 v17, 0x1

    .line 907
    aget v18, v8, v17

    add-float v18, v18, v5

    aput v18, v8, v17

    const/4 v5, 0x2

    .line 908
    aget v18, v8, v5

    int-to-float v11, v11

    add-float v18, v18, v11

    aput v18, v8, v5

    const/4 v5, 0x3

    .line 909
    aget v18, v8, v5

    add-float v18, v18, v11

    aput v18, v8, v5

    .line 911
    invoke-virtual {v4, v14, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 912
    aget v10, v8, v17

    invoke-virtual {v4, v14, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 913
    aget v10, v8, v17

    aget v11, v8, v5

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f800000    # 1.0f

    cmpg-float v10, v10, v11

    if-gtz v10, :cond_5

    .line 914
    aget v5, v8, v5

    invoke-virtual {v4, v6, v5}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_2

    :cond_5
    add-float v18, v14, v3

    .line 916
    aget v19, v8, v17

    sub-float v20, v6, v3

    aget v23, v8, v5

    move-object/from16 v17, v4

    move/from16 v21, v23

    move/from16 v22, v6

    invoke-virtual/range {v17 .. v23}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    :goto_2
    const/4 v5, 0x2

    .line 918
    aget v10, v8, v5

    invoke-virtual {v4, v6, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 919
    aget v10, v8, v5

    const/16 v17, 0x0

    aget v18, v8, v17

    sub-float v10, v10, v18

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v10, v10, v11

    if-gtz v10, :cond_6

    .line 920
    aget v5, v8, v17

    invoke-virtual {v4, v14, v5}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_3

    :cond_6
    sub-float v18, v6, v3

    .line 922
    aget v19, v8, v5

    add-float v20, v14, v3

    aget v23, v8, v17

    move-object/from16 v17, v4

    move/from16 v21, v23

    move/from16 v22, v14

    invoke-virtual/range {v17 .. v23}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 924
    :goto_3
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 925
    iget v5, v15, Ll/ۗ۫ᩳ;->᩸:I

    invoke-virtual {v13, v5}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v5, p1

    .line 926
    invoke-virtual {v5, v4, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_4
    move-object/from16 v4, v16

    move/from16 v8, v25

    move/from16 v10, v26

    move/from16 v11, v27

    goto/16 :goto_0

    :cond_7
    move-object/from16 v5, p1

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p1

    move/from16 v24, v6

    .line 930
    :goto_6
    iget-boolean v0, v1, Ll/۟۫ᩳ;->ۤ:Z

    if-eqz v0, :cond_a

    if-eqz v24, :cond_a

    .line 2214
    iget-object v0, v1, Ll/۟۫ᩳ;->᩸:Ll/ۙ۫ᩳ;

    iget-object v2, v0, Ll/ۙ۫ᩳ;->ᩳ:Landroid/graphics/Paint;

    sget v3, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 2215
    iget-object v3, v0, Ll/ۙ۫ᩳ;->ܿ:Ll/۟۫ᩳ;

    iget-object v4, v3, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v6, v3, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    iget-boolean v7, v3, Ll/۟۫ᩳ;->᩶֫:Z

    if-eqz v7, :cond_9

    .line 2204
    invoke-virtual {v0, v6}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result v7

    float-to-int v7, v7

    .line 2217
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v6

    add-int/2addr v6, v7

    int-to-float v6, v6

    .line 2218
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/4 v8, 0x0

    move-object/from16 v17, p1

    move/from16 v18, v8

    move/from16 v19, v6

    move/from16 v20, v7

    move/from16 v21, v6

    move-object/from16 v22, v2

    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 2204
    invoke-virtual {v0, v4}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result v0

    float-to-int v0, v0

    .line 2221
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    add-int/2addr v4, v0

    int-to-float v0, v4

    .line 2222
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    move/from16 v19, v0

    move/from16 v20, v3

    move/from16 v21, v0

    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 2204
    :cond_9
    invoke-virtual {v0, v6}, Ll/ۙ۫ᩳ;->ۧ(Ll/۫ۨᩳ;)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    .line 2225
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/16 v18, 0x0

    move-object/from16 v17, p1

    move/from16 v19, v0

    move/from16 v20, v3

    move/from16 v21, v0

    move-object/from16 v22, v2

    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    move-object v3, v0

    const/4 v0, 0x0

    .line 855
    iput-boolean v0, v1, Ll/۟۫ᩳ;->ۛ:Z

    .line 856
    iput-boolean v0, v2, Ll/۫ۨᩳ;->ۘ֫:Z

    .line 857
    throw v3
.end method

.method public final invalidate()V
    .locals 1

    .line 1369
    invoke-super {p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 1371
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1372
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 1555
    iget-boolean p1, p0, Ll/۟۫ᩳ;->᩶֫:Z

    iget-object p2, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object p3, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/high16 p1, 0x40200000    # 2.5f

    .line 1556
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    .line 1557
    div-int/lit8 v1, p5, 0x2

    sub-int v2, v1, p1

    invoke-virtual {p3, v0, v0, p4, v2}, Landroid/view/View;->layout(IIII)V

    add-int/2addr v1, p1

    .line 1558
    invoke-virtual {p2, v0, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void

    .line 1560
    :cond_0
    div-int/lit8 p1, p4, 0x2

    invoke-virtual {p3, v0, v0, p1, p5}, Landroid/view/View;->layout(IIII)V

    .line 1561
    invoke-virtual {p2, p1, v0, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final ֡()Z
    .locals 1

    .line 1410
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩷֫:Z

    return v0
.end method

.method public final ֨()Z
    .locals 1

    .line 439
    iget-boolean v0, p0, Ll/۟۫ᩳ;->۠֫:Z

    return v0
.end method

.method public final ֫(IZ)I
    .locals 6

    .line 1782
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 1783
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 1787
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_4

    add-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1

    .line 1790
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳۘ;

    .line 1791
    invoke-interface {v4, p2}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v5

    .line 1792
    invoke-interface {v4, p2}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    if-ge p1, v5, :cond_1

    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_1
    if-gt p1, v4, :cond_3

    if-ne p1, v4, :cond_2

    if-ge v5, v4, :cond_2

    goto :goto_1

    :cond_2
    return v3

    :cond_3
    :goto_1
    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;)Ljava/util/ArrayList;
    .locals 8

    .line 1923
    invoke-static {p1}, Ll/ܶۤᩳ;->֫(Ljava/lang/CharSequence;)Ll/ܶۤᩳ;

    move-result-object p1

    .line 1924
    :try_start_0
    invoke-static {p2}, Ll/ܶۤᩳ;->֫(Ljava/lang/CharSequence;)Ll/ܶۤᩳ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1925
    :try_start_1
    invoke-virtual {p1}, Ll/ܶۤᩳ;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ll/ܶۤᩳ;->range(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p2}, Ll/ܶۤᩳ;->length()I

    move-result v0

    invoke-virtual {p2, v1, v0}, Ll/ܶۤᩳ;->range(II)Ljava/lang/CharSequence;

    move-result-object v3

    .line 1930
    iget-object v4, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    iget-boolean v5, p0, Ll/۟۫ᩳ;->᩷֫:Z

    iget-object v6, p0, Ll/۟۫ᩳ;->ۙ:Ll/ܰ᩺ۡ;

    iget-object v7, p0, Ll/۟۫ᩳ;->ۧ֫:Ll/ۙܳۘ;

    invoke-static/range {v2 .. v7}, Ll/۟۫ᩳ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۤ۫ᩳ;ZLl/۬۫ᩳ;Ll/ۙܳۘ;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1926
    :try_start_2
    invoke-virtual {p2}, Ll/ܶۤᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p1}, Ll/ܶۤᩳ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 1923
    :try_start_3
    invoke-virtual {p2}, Ll/ܶۤᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_5
    invoke-virtual {p1}, Ll/ܶۤᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
.end method

.method public final ֫(Z)Ll/۫ۨᩳ;
    .locals 0

    if-eqz p1, :cond_0

    .line 1465
    iget-object p1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 1646
    iput-boolean v0, p0, Ll/۟۫ᩳ;->᩸֫:Z

    const/4 v0, 0x0

    .line 1647
    iput-boolean v0, p0, Ll/۟۫ᩳ;->᩵֫:Z

    const/4 v0, 0x0

    .line 1648
    iput-object v0, p0, Ll/۟۫ᩳ;->᩹֫:Ljava/util/ArrayList;

    .line 1650
    :try_start_0
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫()V

    .line 1651
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1653
    invoke-direct {p0}, Ll/۟۫ᩳ;->۫()V

    return-void

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Ll/۟۫ᩳ;->۫()V

    .line 1654
    throw v0
.end method

.method public final ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V
    .locals 13

    move-object v1, p0

    .line 1586
    iget-object v0, v1, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v9, v1, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v9}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    .line 1587
    :cond_0
    invoke-direct {p0}, Ll/۟۫ᩳ;->۫()V

    .line 1588
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v10

    .line 1589
    invoke-virtual {v9}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v11

    const/4 v2, 0x0

    .line 1590
    iput-boolean v2, v1, Ll/۟۫ᩳ;->᩵֫:Z

    const/4 v2, 0x0

    .line 1591
    iput-object v2, v1, Ll/۟۫ᩳ;->᩹֫:Ljava/util/ArrayList;

    .line 1593
    :try_start_0
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v3

    const/4 v12, 0x1

    if-eqz v3, :cond_2

    move-object v4, p1

    move-object/from16 v5, p3

    .line 1595
    invoke-virtual {v0, v5, p1}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;)V

    .line 1596
    invoke-direct {p0, v10, v11}, Ll/۟۫ᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;)V

    .line 1597
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V

    return-void

    :cond_1
    move-object v7, p2

    move-object/from16 v8, p4

    .line 1598
    invoke-virtual {v9, v8, p2}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    move-object v4, p1

    move-object v7, p2

    move-object/from16 v5, p3

    move-object/from16 v8, p4

    .line 1601
    iput-boolean v12, v1, Ll/۟۫ᩳ;->᩵֫:Z

    .line 1602
    invoke-direct {p0, v2}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 1603
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۗ()V

    .line 1604
    new-instance v2, Ll/֨ۤᩳ;

    new-instance v3, Ll/ۢ۫ᩳ;

    invoke-direct {v3, p0}, Ll/ۢ۫ᩳ;-><init>(Ll/۟۫ᩳ;)V

    invoke-direct {v2, v3}, Ll/֨ۤᩳ;-><init>(Ll/ۢ۫ᩳ;)V

    move-object v3, v0

    move-object v4, p1

    move-object/from16 v5, p3

    move-object v6, v9

    move-object v7, p2

    move-object/from16 v8, p4

    .line 1605
    invoke-virtual/range {v2 .. v8}, Ll/֨ۤᩳ;->֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;Ll/ܶ᩵ܿ;Ll/۫ۨᩳ;Ljava/lang/CharSequence;Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1606
    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V

    return-void

    .line 1610
    :cond_3
    :goto_0
    invoke-direct {p0, v10, v11}, Ll/۟۫ᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;)V

    .line 1611
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V

    return-void

    .line 1612
    :cond_4
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    .line 1613
    invoke-virtual {v9}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    .line 1363
    invoke-interface {v0, v12}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v2, v12}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1615
    iput-object v0, v1, Ll/۟۫ᩳ;->ۖ֫:Ll/۟᩺ᩳ;

    .line 1616
    iput-object v2, v1, Ll/۟۫ᩳ;->ۘ֫:Ll/۟᩺ᩳ;

    .line 1617
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1618
    :try_start_2
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v0

    iput v0, v1, Ll/۟۫ᩳ;->ܺ֫:I

    .line 1619
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v0

    iput v0, v1, Ll/۟۫ᩳ;->ᩴ֫:I

    .line 1620
    invoke-virtual {p0, v3, v2}, Ll/۟۫ᩳ;->֫(Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, v1, Ll/۟۫ᩳ;->᩹֫:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1621
    :try_start_3
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    .line 1622
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩸()V

    .line 1623
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    .line 1617
    :try_start_5
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v4, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_7
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_8
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    .line 1625
    :goto_3
    invoke-direct {p0, v10, v11}, Ll/۟۫ᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;)V

    .line 1627
    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V

    .line 1628
    throw v0

    :cond_5
    :goto_4
    return-void
.end method

.method public final ֫(Ll/֫ۢᩳ;Ll/ᩴ᩷ᩳ;)V
    .locals 2

    .line 443
    new-instance v0, Ll/ۘܺ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ll/ۘܺ᩷;-><init>(ILjava/lang/Object;)V

    iget-object p2, p0, Ll/۟۫ᩳ;->ܿ֫:Ll/ۚۡ֫;

    invoke-virtual {p2, p1, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final ֫(Ll/ۘ᩷ᩳ;)V
    .locals 0

    .line 1990
    iput-object p1, p0, Ll/۟۫ᩳ;->۬:Ll/ۘ᩷ᩳ;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 3

    const v0, 0x25a92106

    .line 447
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 448
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 449
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩷֫:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 450
    iget-object v0, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v0, 0x2106

    .line 451
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 452
    iget-boolean v1, p0, Ll/۟۫ᩳ;->ۤ:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 453
    iget-boolean v1, p0, Ll/۟۫ᩳ;->᩶֫:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 454
    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 455
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 456
    iget-boolean v0, p0, Ll/۟۫ᩳ;->۠֫:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 457
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_1

    .line 460
    :cond_0
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 461
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 462
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳۘ;

    .line 463
    invoke-interface {v2, p1}, Ll/ᩴܳۘ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 466
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->֫(Ll/ۤۜܽ;Z)V

    .line 467
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->֫(Ll/ۤۜܽ;Z)V

    return-void
.end method

.method public final ֫(Ll/ۤ۫ᩳ;)V
    .locals 1

    .line 1387
    iget-object v0, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 1389
    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    .line 1390
    iget-object p1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p1

    if-gtz p1, :cond_2

    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 1894
    :cond_2
    :goto_1
    invoke-direct {p0}, Ll/۟۫ᩳ;->۬()V

    .line 1896
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 1897
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V
    .locals 7

    const v0, 0x25a92106

    .line 478
    invoke-static {p1, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    const/4 v0, 0x0

    .line 480
    invoke-direct {p0, v0}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 481
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    .line 483
    iget-object v1, p0, Ll/۟۫ᩳ;->ܿ֫:Ll/ۚۡ֫;

    invoke-virtual {v1}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-boolean v3, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eq v2, v3, :cond_0

    .line 484
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 486
    :cond_0
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟۫ᩳ;->᩷֫:Z

    .line 487
    invoke-static {}, Ll/ۤ۫ᩳ;->values()[Ll/ۤ۫ᩳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    aget-object v1, v1, v2

    iput-object v1, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    const/16 v1, 0x2106

    .line 488
    invoke-virtual {p1, v1}, Ll/۬ۜܽ;->ۧ(I)Z

    move-result v2

    iget-object v3, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    if-eqz v2, :cond_1

    .line 489
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    invoke-virtual {p0, v2}, Ll/۟۫ᩳ;->ܽ(Z)V

    .line 490
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    invoke-virtual {p0, v2}, Ll/۟۫ᩳ;->᩻(Z)V

    .line 491
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    .line 428
    iput-boolean v2, p0, Ll/۟۫ᩳ;->ܶ֫:Z

    .line 429
    iget-object v5, v4, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iput-boolean v2, v5, Ll/᩺֫ܿ;->ۛۧ:Z

    .line 430
    iget-object v5, v3, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iput-boolean v2, v5, Ll/᩺֫ܿ;->ۛۧ:Z

    .line 431
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 493
    :cond_1
    invoke-virtual {p1, v1}, Ll/۬ۜܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 494
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    .line 435
    iput-boolean v1, p0, Ll/۟۫ᩳ;->۠֫:Z

    .line 496
    :cond_2
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 499
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 500
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_3

    .line 502
    new-instance v6, Ll/ۚܳۘ;

    invoke-direct {v6, p1}, Ll/ۚܳۘ;-><init>(Ll/۬ۜܽ;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move-object v0, v2

    .line 506
    :cond_4
    invoke-virtual {v4, p1}, Ll/۫ۨᩳ;->֫(Ll/۬ۜܽ;)V

    .line 507
    invoke-virtual {v3, p1}, Ll/۫ۨᩳ;->֫(Ll/۬ۜܽ;)V

    if-eqz v1, :cond_5

    .line 509
    invoke-direct {p0, v0}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    goto :goto_1

    .line 511
    :cond_5
    invoke-direct {p0}, Ll/۟۫ᩳ;->۬()V

    .line 513
    :goto_1
    invoke-direct {p0}, Ll/۟۫ᩳ;->ۗ()V

    .line 514
    iget-boolean p1, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz p1, :cond_6

    .line 515
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 516
    new-instance p1, Ll/ᩳۛᩳ;

    const/4 v0, 0x1

    invoke-direct {p1, v4, v0}, Ll/ᩳۛᩳ;-><init>(Ll/۫ۨᩳ;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 519
    :cond_6
    invoke-virtual {v4}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 520
    new-instance p1, Ll/ᩳۛᩳ;

    const/4 v0, 0x1

    invoke-direct {p1, v3, v0}, Ll/ᩳۛᩳ;-><init>(Ll/۫ۨᩳ;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 523
    :cond_7
    :goto_2
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩸()V

    if-eqz p2, :cond_8

    .line 1667
    invoke-virtual {v4, p2}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;)V

    :cond_8
    if-eqz p3, :cond_9

    .line 1670
    invoke-virtual {v3, p3}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 474
    :cond_9
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩸()V

    return-void
.end method

.method public final ֫(Ll/ܰ᩺ۡ;)V
    .locals 0

    .line 1414
    iput-object p1, p0, Ll/۟۫ᩳ;->ۙ:Ll/ܰ᩺ۡ;

    return-void
.end method

.method public final ֫(FF)Z
    .locals 1

    .line 1986
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->֫(FF)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->֫(FF)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۖ()V
    .locals 6

    .line 1830
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 1835
    :cond_0
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v0, :cond_1

    .line 1836
    iget-object v1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 1837
    :goto_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    .line 1839
    iget-object v2, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_1
    if-ltz v2, :cond_3

    .line 1840
    iget-object v4, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳۘ;

    .line 1841
    invoke-interface {v4, v0}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v5

    if-ge v5, v1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_4

    .line 1848
    iget-object v1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    .line 0
    invoke-static {v3, v1}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    .line 1848
    move-object v4, v1

    check-cast v4, Ll/֡ܳۘ;

    .line 1849
    iget-object v1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1851
    :cond_4
    invoke-direct {p0, v0, v4, v3}, Ll/۟۫ᩳ;->֫(ZLl/ᩴܳۘ;Z)V

    return-void

    :cond_5
    :goto_3
    const v0, 0x7f1206ed

    .line 1831
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 1376
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ۤ:Z

    return v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 1477
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/۫ۨᩳ;
    .locals 1

    .line 1473
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    return-object v0
.end method

.method public final ۠()Z
    .locals 1

    .line 406
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩶֫:Z

    return v0
.end method

.method public final ۡ()V
    .locals 3

    .line 1855
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1860
    :cond_0
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v0, :cond_1

    .line 1861
    iget-object v1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 1862
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1863
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 1865
    :cond_2
    iget-object v1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܳۘ;

    invoke-direct {p0, v0, v1, v2}, Ll/۟۫ᩳ;->֫(ZLl/ᩴܳۘ;Z)V

    return-void

    :cond_3
    :goto_1
    const v0, 0x7f1206ed

    .line 1856
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ۢ()Ll/ۤ۫ᩳ;
    .locals 1

    .line 1397
    iget-object v0, p0, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    return-object v0
.end method

.method public final ۧ()V
    .locals 4

    .line 1495
    iget-object v0, p0, Ll/۟۫ᩳ;->ۜ֫:Ljava/lang/Object;

    monitor-enter v0

    .line 1496
    :try_start_0
    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܳ֫:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 1497
    iput-boolean v2, p0, Ll/۟۫ᩳ;->ܳ֫:Z

    .line 1498
    iput-boolean v3, p0, Ll/۟۫ᩳ;->᩻֫:Z

    .line 1499
    iput-boolean v3, p0, Ll/۟۫ᩳ;->᩸֫:Z

    .line 1500
    iget-object v1, p0, Ll/۟۫ᩳ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1503
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    .line 1505
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v2, v3}, Ll/۫ۨᩳ;->֫(ZZ)V

    .line 1506
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0, v2, v3}, Ll/۫ۨᩳ;->֫(ZZ)V

    .line 1507
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿ()V

    .line 1508
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿ()V

    .line 1509
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧᩳ()V

    .line 1510
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧᩳ()V

    .line 1512
    :cond_1
    iget-object v0, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    .line 66
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    .line 67
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1513
    iget-object v0, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    monitor-enter v0

    .line 1514
    :try_start_1
    iget-object v1, p0, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    const/4 v2, -0x1

    .line 2278
    iput v2, v1, Ll/ۛ۫ᩳ;->ܽ:I

    iput v2, v1, Ll/ۛ۫ᩳ;->ᩳ:I

    iput v2, v1, Ll/ۛ۫ᩳ;->֫:I

    iput v2, v1, Ll/ۛ۫ᩳ;->ۧ:I

    .line 1515
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 1503
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final ۧ(Z)V
    .locals 23

    move-object/from16 v15, p0

    .line 1180
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1181
    new-instance v0, Ll/ۚ۫ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v15}, Ll/ۚ۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v15, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1184
    :cond_0
    iget-boolean v0, v15, Ll/۟۫ᩳ;->֨֫:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, v15, Ll/۟۫ᩳ;->֡֫:Z

    return-void

    .line 1185
    :cond_1
    invoke-direct/range {p0 .. p0}, Ll/۟۫ᩳ;->᩶()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 1186
    :cond_2
    iget-object v0, v15, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    const/4 v14, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 1188
    :goto_0
    iget-object v2, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    move-object/from16 v16, v2

    monitor-enter v16

    if-nez v0, :cond_4

    .line 1189
    :try_start_0
    iget-object v2, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    iget v3, v2, Ll/ۛ۫ᩳ;->ۧ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_4

    iget v2, v2, Ll/ۛ۫ᩳ;->ᩳ:I

    if-ne v2, v4, :cond_4

    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v15

    goto/16 :goto_b

    :cond_4
    if-eqz v0, :cond_5

    const/4 v2, 0x0

    const/4 v6, 0x0

    goto :goto_1

    .line 1190
    :cond_5
    iget-object v2, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    iget v2, v2, Ll/ۛ۫ᩳ;->ۧ:I

    move v6, v2

    :goto_1
    if-eqz v0, :cond_6

    .line 1191
    iget-object v2, v15, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v2

    :goto_2
    move v7, v2

    goto :goto_3

    :cond_6
    iget-object v2, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    iget v2, v2, Ll/ۛ۫ᩳ;->֫:I

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_7

    const/4 v2, 0x0

    const/4 v8, 0x0

    goto :goto_4

    .line 1192
    :cond_7
    iget-object v2, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    iget v2, v2, Ll/ۛ۫ᩳ;->ᩳ:I

    move v8, v2

    :goto_4
    if-eqz v0, :cond_8

    .line 1193
    iget-object v0, v15, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    :goto_5
    move v9, v0

    goto :goto_6

    :cond_8
    iget-object v0, v15, Ll/۟۫ᩳ;->ۢ֫:Ll/ۛ۫ᩳ;

    iget v0, v0, Ll/ۛ۫ᩳ;->ܽ:I

    goto :goto_5

    .line 1195
    :goto_6
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1196
    iget-object v0, v15, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v13

    iget-object v0, v15, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v12

    .line 1197
    invoke-interface {v13}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v16

    .line 1199
    :try_start_1
    invoke-interface {v12}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v17
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 1201
    iget-object v0, v15, Ll/۟۫ᩳ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v11

    .line 1202
    invoke-virtual/range {v16 .. v16}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v0

    invoke-virtual/range {v17 .. v17}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v18

    .line 1203
    iget-object v10, v15, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    move-object v3, v10

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    .line 1205
    :try_start_2
    invoke-static/range {v3 .. v9}, Ll/۟۫ᩳ;->֫(Ljava/util/List;Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;IIII)Ll/ܰ۫ᩳ;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1

    .line 1207
    iget-object v6, v15, Ll/۟۫ᩳ;->֫֫:Ll/ۤ۫ᩳ;

    .line 1208
    iget-boolean v7, v15, Ll/۟۫ᩳ;->᩷֫:Z

    .line 1209
    iget-object v8, v15, Ll/۟۫ᩳ;->ۙ:Ll/ܰ᩺ۡ;

    .line 1210
    iput-boolean v1, v15, Ll/۟۫ᩳ;->֨֫:Z

    .line 1363
    invoke-interface {v13, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1364
    invoke-interface {v12, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1212
    new-instance v9, Ll/֨۫ᩳ;

    move-object v1, v9

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    move-object/from16 v19, v9

    move-object v9, v13

    move-object/from16 v20, v10

    move-object v10, v12

    move-object/from16 v21, v12

    move-object/from16 v12, v20

    move-object/from16 v22, v13

    move v13, v0

    move/from16 v14, v18

    move/from16 v15, p1

    invoke-direct/range {v1 .. v15}, Ll/֨۫ᩳ;-><init>(Ll/۟۫ᩳ;Ll/۟᩸ᩳ;Ll/۟᩸ᩳ;Ll/ܰ۫ᩳ;Ll/ۤ۫ᩳ;ZLl/ܰ᩺ۡ;Ll/۟᩺ᩳ;Ll/۟᩺ᩳ;ILjava/util/List;IIZ)V

    if-eqz p1, :cond_9

    .line 1263
    invoke-virtual/range {v19 .. v19}, Ll/֨۫ᩳ;->run()V

    return-void

    .line 1265
    :cond_9
    :try_start_3
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    .line 1267
    iput-boolean v2, v1, Ll/۟۫ᩳ;->֨֫:Z

    .line 1268
    invoke-virtual/range {v16 .. v16}, Ll/۟᩸ᩳ;->close()V

    invoke-virtual/range {v17 .. v17}, Ll/۟᩸ᩳ;->close()V

    move-object/from16 v3, v22

    .line 1363
    invoke-interface {v3, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    move-object/from16 v3, v21

    .line 1364
    invoke-interface {v3, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 1270
    throw v0

    :catch_1
    move-exception v0

    :goto_7
    move-object v1, v15

    goto :goto_8

    :catch_2
    move-exception v0

    goto :goto_7

    .line 1206
    :goto_8
    invoke-virtual/range {v16 .. v16}, Ll/۟᩸ᩳ;->close()V

    invoke-virtual/range {v17 .. v17}, Ll/۟᩸ᩳ;->close()V

    throw v0

    :catch_3
    move-exception v0

    :goto_9
    move-object v1, v15

    goto :goto_a

    :catch_4
    move-exception v0

    goto :goto_9

    .line 1200
    :goto_a
    invoke-virtual/range {v16 .. v16}, Ll/۟᩸ᩳ;->close()V

    throw v0

    .line 1195
    :goto_b
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_b
.end method

.method public final ܳ()I
    .locals 1

    .line 1765
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ܳ(Z)V
    .locals 0

    .line 435
    iput-boolean p1, p0, Ll/۟۫ᩳ;->۠֫:Z

    return-void
.end method

.method public final ܶ()V
    .locals 1

    .line 1676
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۚܽ()V

    .line 1677
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۚܽ()V

    return-void
.end method

.method public final ܺ()V
    .locals 6

    .line 1805
    iget-object v0, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 1810
    :cond_0
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v0, :cond_1

    .line 1811
    iget-object v1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    .line 1812
    :goto_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1814
    :goto_1
    iget-object v4, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 1815
    iget-object v4, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳۘ;

    .line 1816
    invoke-interface {v4, v0}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v5

    if-le v5, v1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_4

    .line 1823
    iget-object v1, p0, Ll/۟۫ᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/֡ܳۘ;

    :cond_4
    const/4 v1, 0x1

    .line 1826
    invoke-direct {p0, v0, v4, v1}, Ll/۟۫ᩳ;->֫(ZLl/ᩴܳۘ;Z)V

    return-void

    :cond_5
    :goto_3
    const v0, 0x7f1206ed

    .line 1806
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 1714
    iput-boolean v0, p0, Ll/۟۫ᩳ;->᩻֫:Z

    .line 1715
    iget-object v0, p0, Ll/۟۫ᩳ;->ۧ֫:Ll/ۙܳۘ;

    invoke-virtual {v0}, Ll/ۙܳۘ;->֫()V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 1380
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ۤ:Z

    if-eq v0, p1, :cond_0

    .line 1381
    iput-boolean p1, p0, Ll/۟۫ᩳ;->ۤ:Z

    .line 1382
    invoke-super {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 1687
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    :try_start_0
    iget-object v1, p0, Ll/۟۫ᩳ;->ۖ֫:Ll/۟᩺ᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    iget-object v4, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    if-ne v1, v2, :cond_0

    :try_start_1
    iget-object v1, p0, Ll/۟۫ᩳ;->ۘ֫:Ll/۟᩺ᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Ll/۟۫ᩳ;->ܺ֫:I

    iget-object v2, p0, Ll/۟۫ᩳ;->ۖ֫:Ll/۟᩺ᩳ;

    .line 1688
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Ll/۟۫ᩳ;->ᩴ֫:I

    iget-object v2, p0, Ll/۟۫ᩳ;->ۘ֫:Ll/۟᩺ᩳ;

    .line 1689
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 1690
    iget-object v1, p0, Ll/۟۫ᩳ;->᩹֫:Ljava/util/ArrayList;

    invoke-direct {p0, v1}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    goto :goto_0

    .line 1692
    :cond_0
    invoke-direct {p0, v3}, Ll/۟۫ᩳ;->ۧ(Ljava/util/List;)V

    .line 1693
    new-instance v1, Ll/᩻ۛᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩻ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1695
    :goto_0
    iput-object v3, p0, Ll/۟۫ᩳ;->᩹֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 1696
    iput-boolean v1, p0, Ll/۟۫ᩳ;->᩵֫:Z

    .line 1697
    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫֫()V

    .line 1698
    invoke-virtual {v4}, Ll/۫ۨᩳ;->֫֫()V

    .line 1699
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result v1

    .line 1700
    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-nez v2, :cond_1

    .line 1702
    invoke-virtual {v4, v3}, Ll/۫ۨᩳ;->ۚ(Z)V

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    if-eqz v2, :cond_2

    .line 1704
    invoke-virtual {v0, v3}, Ll/۫ۨᩳ;->ۚ(Z)V

    .line 1706
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 1707
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1709
    invoke-direct {p0}, Ll/۟۫ᩳ;->۫()V

    return-void

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Ll/۟۫ᩳ;->۫()V

    .line 1710
    throw v0
.end method

.method public final ܿ(Z)V
    .locals 1

    .line 1481
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۡ(Z)V

    .line 1482
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۡ(Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 1522
    iget-object v0, p0, Ll/۟۫ᩳ;->ۜ֫:Ljava/lang/Object;

    monitor-enter v0

    .line 1523
    :try_start_0
    iget-boolean v1, p0, Ll/۟۫ᩳ;->ܳ֫:Z

    if-nez v1, :cond_0

    .line 1524
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 1526
    iput-boolean v1, p0, Ll/۟۫ᩳ;->ܳ֫:Z

    .line 1527
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1529
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩵֫:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Ll/۟۫ᩳ;->֫()V

    .line 1530
    :cond_2
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨ()V

    .line 1531
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨ()V

    .line 1532
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗܽ()V

    .line 1533
    :cond_3
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܿܽ()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗܽ()V

    .line 1535
    :cond_4
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩸֫:Z

    if-nez v0, :cond_5

    invoke-direct {p0}, Ll/۟۫ᩳ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1536
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v1, v1}, Ll/۫ۨᩳ;->֫(ZZ)V

    .line 1537
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0, v1, v1}, Ll/۫ۨᩳ;->֫(ZZ)V

    .line 1538
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    :cond_5
    return-void

    :catchall_0
    move-exception v1

    .line 1527
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ(Z)V
    .locals 1

    .line 1401
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩷֫:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 1403
    :cond_0
    iput-boolean p1, p0, Ll/۟۫ᩳ;->᩷֫:Z

    .line 1404
    iget-object p1, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p1

    if-gtz p1, :cond_2

    iget-object p1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 1894
    :cond_2
    :goto_1
    invoke-direct {p0}, Ll/۟۫ᩳ;->۬()V

    .line 1896
    invoke-virtual {p0}, Ll/۟۫ᩳ;->invalidate()V

    .line 1897
    invoke-direct {p0}, Ll/۟۫ᩳ;->᩹()V

    return-void
.end method

.method public final ᩴ()Z
    .locals 1

    .line 1742
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 1681
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗۧ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩷()Ll/۫ۨᩳ;
    .locals 1

    .line 1746
    iget-boolean v0, p0, Ll/۟۫ᩳ;->ᩳ֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    return-object v0
.end method

.method public final ᩻()Ll/۫ۨᩳ;
    .locals 1

    .line 1469
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    return-object v0
.end method

.method public final ᩻(Z)V
    .locals 2

    .line 410
    iget-boolean v0, p0, Ll/۟۫ᩳ;->᩶֫:Z

    if-eq v0, p1, :cond_1

    .line 411
    iput-boolean p1, p0, Ll/۟۫ᩳ;->᩶֫:Z

    .line 413
    iget-object v0, p0, Ll/۟۫ᩳ;->ۨ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iput-boolean p1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    .line 414
    iget-object v1, p0, Ll/۟۫ᩳ;->᩺:Ll/۫ۨᩳ;

    if-eqz p1, :cond_0

    .line 415
    iget-object p1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v1, v0, Ll/᩺֫ܿ;->֫ܽ:Landroid/graphics/drawable/Drawable;

    .line 417
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iput v1, p1, Ll/᩺֫ܿ;->ۧܽ:I

    iput v1, v0, Ll/᩺֫ܿ;->ۧܽ:I

    goto :goto_0

    .line 419
    :cond_0
    iget-object p1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v1, v0, Ll/᩺֫ܿ;->֫ܽ:Landroid/graphics/drawable/Drawable;

    .line 421
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    iput v1, p1, Ll/᩺֫ܿ;->ۧܽ:I

    iput v1, v0, Ll/᩺֫ܿ;->ۧܽ:I

    .line 423
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method
