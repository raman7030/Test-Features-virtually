.class public final Ll/ᩳ᩹ۜ;
.super Ll/ᩳۚۜ;
.source "O8UQ"


# static fields
.field public static final ۛ:[Ljava/lang/String;

.field public static final ۤ:[I

.field public static final ۨ:[F


# instance fields
.field public final ۫:Ll/ۜ᩶ۜ;

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x6

    new-array v0, v0, [F

    .line 58
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ᩹ۜ;->ۨ:[F

    const-string v5, "x1.5"

    const-string v6, "x2.0"

    const-string v1, "x0.5"

    const-string v2, "x0.75"

    const-string v3, "x1.0"

    const-string v4, "x1.25"

    .line 62
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ᩳ᩹ۜ;->ۛ:[Ljava/lang/String;

    const/16 v0, 0x3c

    const/16 v1, 0x5a

    const/16 v2, 0xf

    const/16 v3, 0x1e

    const/16 v4, 0x2d

    .line 67
    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ᩳ᩹ۜ;->ۤ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Ll/ۜ᩶ۜ;Ljava/util/List;I)V
    .locals 0

    .line 83
    invoke-direct {p0, p3, p2}, Ll/ᩳۚۜ;-><init>(ILjava/util/List;)V

    .line 73
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ᩳ᩹ۜ;->۬:Ljava/util/ArrayList;

    .line 84
    iput-object p1, p0, Ll/ᩳ᩹ۜ;->۫:Ll/ۜ᩶ۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩹ۜ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩹ۜ;->۬:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ᩳ᩹ۜ;->ۧ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܺ᩷;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳ᩹ۜ;->ۧ(Ll/ۗܺ᩷;Landroid/widget/TextView;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ljava/lang/Runnable;)V
    .locals 0

    .line 243
    invoke-static {p0, p1}, Ll/ᩳ᩹ۜ;->ۧ(Ll/ۗܺ᩷;Landroid/widget/TextView;)V

    .line 244
    invoke-static {p2}, Ll/ᩳ᩹ۜ;->ۧ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/֫᩹ۜ;Ll/᩸᩸ۜ;[Ll/᩸ۖ;Landroid/view/View;)V
    .locals 7

    .line 248
    invoke-virtual {p4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 311
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p4, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 312
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p4

    const v1, 0x7f1206ab

    const/4 v3, 0x1

    .line 313
    invoke-interface {p4, v2, v3, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const/4 v1, 0x0

    :goto_0
    const/4 v4, 0x5

    if-ge v1, v4, :cond_1

    .line 315
    sget-object v4, Ll/ᩳ᩹ۜ;->ۤ:[I

    aget v4, v4, v1

    add-int/lit8 v5, v1, 0x64

    add-int/lit8 v1, v1, 0x1

    .line 317
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const v4, 0x7f1206a9

    invoke-virtual {p0, v4, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 316
    invoke-interface {p4, v2, v5, v1, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_0

    :cond_1
    const/4 v1, 0x6

    const v3, 0x7f1206a6

    const/16 v4, 0xc8

    .line 319
    invoke-interface {p4, v2, v4, v1, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 321
    new-instance p4, Ll/ۤ᩸ۜ;

    invoke-direct {p4, p0, p1}, Ll/ۤ᩸ۜ;-><init>(Ll/ۗܺ᩷;Ll/֫᩹ۜ;)V

    invoke-virtual {v0, p4}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 252
    invoke-virtual {v0, p2}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 253
    aput-object v0, p3, v2

    .line 254
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static ֫(Ll/ᩳ᩹ۜ;Landroid/widget/TextView;Landroid/view/MenuItem;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    invoke-interface {p2}, Landroid/view/MenuItem;->getOrder()I

    move-result p2

    if-ltz p2, :cond_0

    const/4 v0, 0x6

    if-ge p2, v0, :cond_0

    .line 135
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "mps"

    invoke-interface {v0, p2, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 225
    sget-object v0, Ll/ᩳ᩹ۜ;->ۛ:[Ljava/lang/String;

    aget-object v0, v0, p2

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    iget-object p0, p0, Ll/ᩳ᩹ۜ;->۫:Ll/ۜ᩶ۜ;

    iget-object p0, p0, Ll/ۜ᩶ۜ;->᩷:Ll/ۚ᩶ۜ;

    sget-object p1, Ll/ᩳ᩹ۜ;->ۨ:[F

    aget p1, p1, p2

    invoke-interface {p0, p1}, Ll/ۚ᩶ۜ;->֫(F)V

    return-void

    .line 133
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ᩳ᩹ۜ;Landroid/widget/TextView;Ll/᩸᩸ۜ;[Ll/᩸ۖ;Landroid/view/View;)V
    .locals 6

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    invoke-virtual {p4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 214
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p4, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 215
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p4

    .line 216
    sget-object v1, Ll/ᩳ᩹ۜ;->ۛ:[Ljava/lang/String;

    aget-object v3, v1, v2

    const v4, 0x7f0a05bf

    invoke-interface {p4, v2, v4, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0a05c0

    const/4 v4, 0x1

    .line 217
    aget-object v5, v1, v4

    invoke-interface {p4, v2, v3, v4, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0a05c1

    const/4 v4, 0x2

    .line 218
    aget-object v5, v1, v4

    invoke-interface {p4, v2, v3, v4, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0a05c2

    const/4 v4, 0x3

    .line 219
    aget-object v5, v1, v4

    invoke-interface {p4, v2, v3, v4, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0a05c3

    const/4 v4, 0x4

    .line 220
    aget-object v5, v1, v4

    invoke-interface {p4, v2, v3, v4, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0a05c4

    const/4 v4, 0x5

    .line 221
    aget-object v1, v1, v4

    invoke-interface {p4, v2, v3, v4, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 222
    new-instance p4, Ll/ۛ᩸ۜ;

    invoke-direct {p4, p0, p1}, Ll/ۛ᩸ۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p4}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 229
    invoke-virtual {v0, p2}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 230
    aput-object v0, p3, v2

    .line 231
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/֫᩹ۜ;Landroid/view/MenuItem;)Z
    .locals 2

    .line 322
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 324
    invoke-static {}, Ll/᩸᩶ۜ;->֫()V

    return v0

    :cond_0
    const/16 v1, 0xc8

    if-ne p2, v1, :cond_2

    .line 343
    new-instance p2, Ll/ܰ᩸ۜ;

    invoke-direct {p2, p0, p1}, Ll/ܰ᩸ۜ;-><init>(Ll/ۗܺ᩷;Ll/֫᩹ۜ;)V

    const v1, 0x7f1206a8

    .line 376
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ۡ(I)V

    const/4 v1, 0x2

    .line 377
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ܿ(I)V

    const/4 v1, 0x6

    .line 378
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    const v1, 0x7f1206a7

    .line 379
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 380
    invoke-static {}, Ll/᩸᩶ۜ;->ܽ()I

    move-result p0

    if-lez p0, :cond_1

    .line 382
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Ll/۬ۗܿ;->᩵()V

    .line 384
    :cond_1
    invoke-static {p1, p2}, Ll/֫᩹ۜ;->֫(Ll/֫᩹ۜ;Ll/۬ۗܿ;)V

    .line 205
    invoke-virtual {p2, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    return v0

    :cond_2
    add-int/lit8 p2, p2, -0x64

    if-ltz p2, :cond_4

    const/4 p0, 0x5

    if-lt p2, p0, :cond_3

    goto :goto_0

    .line 332
    :cond_3
    sget-object p0, Ll/ᩳ᩹ۜ;->ۤ:[I

    aget p0, p0, p2

    invoke-static {p0}, Ll/᩸᩶ۜ;->֫(I)V

    return v0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۖ()I
    .locals 3

    .line 139
    invoke-static {}, Ll/ᩳ᩹ۜ;->ۡ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 143
    :cond_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "mpm"

    invoke-interface {v1, v0, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 144
    sget-object v1, Ll/᩷᩶ۜ;->᩵:Ll/ۚۡ֫;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return v0
.end method

.method public static ۡ()I
    .locals 3

    .line 116
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpm"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    return v0

    :cond_0
    return v2
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ᩹ۜ;)Ll/ۜ᩶ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩹ۜ;->۫:Ll/ۜ᩶ۜ;

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Runnable;)V
    .locals 7

    .line 404
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 405
    invoke-static {}, Ll/᩸᩶ۜ;->ۧ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    :cond_0
    const-wide/32 v4, 0xea60

    .line 409
    rem-long/2addr v0, v4

    cmp-long v6, v0, v2

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    move-wide v4, v0

    .line 413
    :goto_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;Landroid/widget/TextView;)V
    .locals 3

    .line 392
    invoke-static {}, Ll/᩸᩶ۜ;->ܽ()I

    move-result v0

    if-lez v0, :cond_0

    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const v0, 0x7f1206ac

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const p0, 0x7f1206aa

    .line 396
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public static ܺ()I
    .locals 3

    .line 124
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mps"

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_1

    const/4 v1, 0x6

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    return v2
.end method

.method public static ܿ(I)I
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const p0, 0x7f120307

    return p0

    :cond_0
    const p0, 0x7f12069f

    return p0

    :cond_1
    const p0, 0x7f1206a4

    return p0

    :cond_2
    const p0, 0x7f12069d

    return p0

    :cond_3
    const p0, 0x7f12069c

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)Landroid/view/View;
    .locals 11

    .line 189
    new-instance v8, Ll/֫᩹ۜ;

    .line 78
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d01dd

    .line 196
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v9

    const/4 v0, 0x1

    new-array v7, v0, [Ll/᩸ۖ;

    .line 199
    new-instance v0, Ll/᩸᩸ۜ;

    invoke-direct {v0, v7}, Ll/᩸᩸ۜ;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0a0582

    .line 204
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۗۘ;

    .line 108
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "mbp"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 205
    invoke-virtual {v1, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 206
    new-instance v2, Ll/᩹᩸ۜ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩹᩸ۜ;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v1, 0x7f0a054e

    .line 208
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 209
    sget-object v2, Ll/ᩳ᩹ۜ;->ۛ:[Ljava/lang/String;

    invoke-static {}, Ll/ᩳ᩹ۜ;->ܺ()I

    move-result v3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f0a0061

    .line 210
    invoke-virtual {v9, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Ll/᩶᩸ۜ;

    invoke-direct {v3, p0, v1, v0, v7}, Ll/᩶᩸ۜ;-><init>(Ll/ᩳ᩹ۜ;Landroid/widget/TextView;Ll/᩸᩸ۜ;[Ll/᩸ۖ;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0530

    .line 234
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 235
    new-instance v6, Ll/ۨ᩸ۜ;

    invoke-direct {v6, p1, v1}, Ll/ۨ᩸ۜ;-><init>(Ll/ۗܺ᩷;Landroid/widget/TextView;)V

    .line 242
    new-instance v5, Ll/ۙ᩸ۜ;

    invoke-direct {v5, p1, v1, v6}, Ll/ۙ᩸ۜ;-><init>(Ll/ۗܺ᩷;Landroid/widget/TextView;Ljava/lang/Runnable;)V

    .line 246
    invoke-static {p1, v1}, Ll/ᩳ᩹ۜ;->ۧ(Ll/ۗܺ᩷;Landroid/widget/TextView;)V

    const v1, 0x7f0a0060

    .line 247
    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/ۗ᩸ۜ;

    invoke-direct {v2, p1, v8, v0, v7}, Ll/ۗ᩸ۜ;-><init>(Ll/ۗܺ᩷;Ll/֫᩹ۜ;Ll/᩸᩸ۜ;[Ll/᩸ۖ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 257
    invoke-virtual {v9, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۖۢۡ;

    .line 258
    invoke-virtual {p1}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 260
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->֫(J)V

    .line 261
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ܽ(J)V

    .line 262
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ᩳ(J)V

    .line 263
    invoke-virtual {v0, v1, v2}, Ll/᩺ۗۧ;->ۧ(J)V

    .line 264
    new-instance v0, Ll/۟᩸ۜ;

    invoke-direct {v0, p0}, Ll/۟᩸ۜ;-><init>(Ll/ᩳ᩹ۜ;)V

    .line 265
    invoke-virtual {p1, v0}, Ll/ۖۢۡ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 266
    new-instance v2, Ll/۬᩸ۜ;

    invoke-direct {v2, v0, p1}, Ll/۬᩸ۜ;-><init>(Ll/۟᩸ۜ;Ll/ۖۢۡ;)V

    .line 273
    sget-object v3, Ll/᩷᩶ۜ;->֡:Ll/ۚۡ֫;

    .line 274
    new-instance v4, Ll/۫᩸ۜ;

    invoke-direct {v4, p0, v0}, Ll/۫᩸ۜ;-><init>(Ll/ᩳ᩹ۜ;Ll/۟᩸ۜ;)V

    .line 277
    new-instance v10, Ll/᩺᩸ۜ;

    move-object v0, v10

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Ll/᩺᩸ۜ;-><init>(Ll/ᩳ᩹ۜ;Ll/۬᩸ۜ;Ll/ۚۡ֫;Ll/۫᩸ۜ;Ll/ۙ᩸ۜ;Ljava/lang/Runnable;[Ll/᩸ۖ;Ll/֫᩹ۜ;)V

    invoke-virtual {v9, v10}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 303
    invoke-virtual {p0}, Ll/ᩳۚۜ;->ᩳ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۖۢۡ;->scrollToPosition(I)V

    return-object v9
.end method

.method public final ۢ()Z
    .locals 2

    .line 89
    invoke-static {}, Ll/ᩳ᩹ۜ;->ۡ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(II)V
    .locals 3

    if-eq p1, p2, :cond_2

    .line 95
    iget-object v0, p0, Ll/ᩳ᩹ۜ;->۫:Ll/ۜ᩶ۜ;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 801
    iput v1, v0, Ll/ۜ᩶ۜ;->ۡ:I

    const/4 v1, 0x0

    .line 802
    iput-boolean v1, v0, Ll/ۜ᩶ۜ;->ۧ:Z

    const/4 v1, 0x0

    .line 796
    iput-object v1, v0, Ll/ۜ᩶ۜ;->ܽ:Ll/᩻᩶ۜ;

    .line 98
    :cond_0
    iget-object v1, p0, Ll/ᩳ᩹ۜ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩹ۜ;

    .line 99
    invoke-interface {v2, p1, p2}, Ll/ۧ᩹ۜ;->֫(II)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 101
    iget-boolean p1, v0, Ll/ۜ᩶ۜ;->ᩳ:Z

    if-eqz p1, :cond_2

    .line 102
    iget-object p1, v0, Ll/ۜ᩶ۜ;->ۖ:Ll/ܰܺܳ;

    invoke-static {p1, p2}, Ll/۠᩶ۜ;->֫(Ll/ܰܺܳ;I)V

    :cond_2
    return-void
.end method
