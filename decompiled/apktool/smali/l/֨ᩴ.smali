.class public Ll/֨ᩴ;
.super Ljava/lang/Object;
.source "X58Q"


# static fields
.field public static ۢ֨ۖ:I


# instance fields
.field public final ֫:Landroid/view/View;

.field public final ۧ:Landroid/content/Context;

.field public final ܳ:[I

.field public final ܽ:Landroid/view/WindowManager$LayoutParams;

.field public final ܿ:[I

.field public final ᩳ:Landroid/widget/TextView;

.field public final ᩻:Landroid/graphics/Rect;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Ll/֨ᩴ;->ܽ:Landroid/view/WindowManager$LayoutParams;

    .line 54
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/֨ᩴ;->᩻:Landroid/graphics/Rect;

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 55
    iput-object v2, p0, Ll/֨ᩴ;->ܿ:[I

    new-array v1, v1, [I

    .line 56
    iput-object v1, p0, Ll/֨ᩴ;->ܳ:[I

    .line 59
    iput-object p1, p0, Ll/֨ᩴ;->ۧ:Landroid/content/Context;

    .line 61
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d001b

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/֨ᩴ;->֫:Landroid/view/View;

    const v2, 0x7f0a0397

    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֨ᩴ;->ᩳ:Landroid/widget/TextView;

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    const/16 p1, 0x3ea

    .line 66
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    const/4 p1, -0x2

    .line 67
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 68
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p1, -0x3

    .line 69
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    const p1, 0x7f130005

    .line 70
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    const/16 p1, 0x18

    .line 71
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    return-void
.end method

.method public static ֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ֫᩻ܽ(Ljava/lang/Object;F)V
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static ۖ᩶ۜ()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۘۖ֡()I
    .locals 1

    const v0, 0x29687c65

    return v0
.end method

.method public static ۠᩹ܺ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۡᩴ᩷(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ֫ܽ(Ljava/lang/Object;Ljava/lang/Object;I)Lbin/mt/json/JSONObject;
    .locals 0

    check-cast p0, Lbin/mt/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۬ۖܺ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩶ۗۧ;

    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static ۬᩶ᩳ(Ljava/lang/Object;)Ll/۬ۤۡ;
    .locals 0

    check-cast p0, Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ܶ֨ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/᩻ᩴۡ;

    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ֡᩵(Ljava/lang/Object;)[B
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    return-object p0
.end method

.method public static ᩳۨۘ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    check-cast p2, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public static ᩴۡܶ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۬۬ۧ;

    check-cast p1, Ll/᩶ۗۧ;

    invoke-virtual {p0, p1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method

.method public static ᩶ܳ᩹(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Landroid/os/Bundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ᩷ۢ᩶(Ljava/lang/Object;J)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-static {p0, p1, p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static ᩹֨ۡ(F)I
    .locals 0

    invoke-static {p0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p0

    return p0
.end method


# virtual methods
.method public ֫()V
    .locals 2

    .line 90
    invoke-virtual {p0}, Ll/֨ᩴ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 94
    :cond_0
    iget-object v0, p0, Ll/֨ᩴ;->ۧ:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 95
    iget-object v1, p0, Ll/֨ᩴ;->֫:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public ֫(Landroid/view/View;IIZLjava/lang/CharSequence;)V
    .locals 17

    move-object/from16 v0, p0

    .line 77
    invoke-virtual/range {p0 .. p0}, Ll/֨ᩴ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    invoke-virtual/range {p0 .. p0}, Ll/֨ᩴ;->֫()V

    .line 81
    :cond_0
    iget-object v1, v0, Ll/֨ᩴ;->ᩳ:Landroid/widget/TextView;

    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iget-object v2, v0, Ll/֨ᩴ;->ܽ:Landroid/view/WindowManager$LayoutParams;

    iput-object v1, v2, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 105
    iget-object v1, v0, Ll/֨ᩴ;->ۧ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070371

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    .line 109
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v4

    const/4 v5, 0x2

    if-lt v4, v3, :cond_1

    move/from16 v4, p2

    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v4

    div-int/2addr v4, v5

    .line 119
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v6

    const/4 v7, 0x0

    if-lt v6, v3, :cond_2

    .line 121
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f070370

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    add-int v6, p3, v3

    sub-int v3, p3, v3

    goto :goto_1

    .line 127
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v6

    const/4 v3, 0x0

    :goto_1
    const/16 v8, 0x31

    .line 131
    iput v8, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 133
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    if-eqz p4, :cond_3

    const v9, 0x7f070374

    goto :goto_2

    :cond_3
    const v9, 0x7f070373

    :goto_2
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    .line 187
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v9

    .line 188
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    .line 189
    instance-of v11, v10, Landroid/view/WindowManager$LayoutParams;

    if-eqz v11, :cond_4

    check-cast v10, Landroid/view/WindowManager$LayoutParams;

    iget v10, v10, Landroid/view/WindowManager$LayoutParams;->type:I

    if-ne v10, v5, :cond_4

    goto :goto_4

    .line 197
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    .line 198
    :goto_3
    instance-of v11, v10, Landroid/content/ContextWrapper;

    if-eqz v11, :cond_6

    .line 199
    instance-of v11, v10, Landroid/app/Activity;

    if-eqz v11, :cond_5

    .line 200
    check-cast v10, Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v9

    goto :goto_4

    .line 202
    :cond_5
    check-cast v10, Landroid/content/ContextWrapper;

    invoke-virtual {v10}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v10

    goto :goto_3

    .line 137
    :cond_6
    :goto_4
    iget-object v10, v0, Ll/֨ᩴ;->֫:Landroid/view/View;

    if-nez v9, :cond_7

    goto/16 :goto_6

    .line 141
    :cond_7
    iget-object v11, v0, Ll/֨ᩴ;->᩻:Landroid/graphics/Rect;

    invoke-virtual {v9, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 142
    iget v12, v11, Landroid/graphics/Rect;->left:I

    if-gez v12, :cond_9

    iget v12, v11, Landroid/graphics/Rect;->top:I

    if-gez v12, :cond_9

    .line 145
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const-string v13, "dimen"

    const-string v14, "android"

    const-string v15, "status_bar_height"

    .line 147
    invoke-virtual {v12, v15, v13, v14}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v13

    if-eqz v13, :cond_8

    .line 149
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v13

    goto :goto_5

    :cond_8
    const/4 v13, 0x0

    .line 153
    :goto_5
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    .line 154
    iget v14, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v11, v7, v13, v14, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 156
    :cond_9
    iget-object v12, v0, Ll/֨ᩴ;->ܳ:[I

    invoke-virtual {v9, v12}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 158
    iget-object v13, v0, Ll/֨ᩴ;->ܿ:[I

    move-object/from16 v14, p1

    invoke-virtual {v14, v13}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 159
    aget v14, v13, v7

    aget v15, v12, v7

    sub-int/2addr v14, v15

    aput v14, v13, v7

    const/4 v15, 0x1

    .line 160
    aget v16, v13, v15

    aget v12, v12, v15

    sub-int v16, v16, v12

    aput v16, v13, v15

    add-int/2addr v14, v4

    .line 163
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v4

    div-int/2addr v4, v5

    sub-int/2addr v14, v4

    iput v14, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 165
    invoke-static {v7, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 166
    invoke-virtual {v10, v4, v4}, Landroid/view/View;->measure(II)V

    .line 167
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    .line 169
    aget v5, v13, v15

    add-int/2addr v3, v5

    sub-int/2addr v3, v8

    sub-int/2addr v3, v4

    add-int/2addr v5, v6

    add-int/2addr v5, v8

    if-eqz p4, :cond_b

    if-ltz v3, :cond_a

    .line 173
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_6

    .line 175
    :cond_a
    iput v5, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_6

    :cond_b
    add-int/2addr v4, v5

    .line 178
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    move-result v6

    if-gt v4, v6, :cond_c

    .line 179
    iput v5, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_6

    .line 181
    :cond_c
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    :goto_6
    const-string v3, "window"

    .line 85
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    .line 86
    invoke-interface {v1, v10, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public ۧ()Z
    .locals 1

    .line 99
    iget-object v0, p0, Ll/֨ᩴ;->֫:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
