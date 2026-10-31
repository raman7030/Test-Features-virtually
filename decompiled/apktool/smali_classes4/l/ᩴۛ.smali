.class public final Ll/ᩴۛ;
.super Ljava/lang/Object;
.source "I96L"


# instance fields
.field public final ֫:Landroid/content/Context;

.field public ۜ:Landroid/view/VelocityTracker;

.field public final ۧ:[I

.field public ܳ:I

.field public ܽ:F

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:Ll/᩵ۛ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩵ۛ;)V
    .locals 2

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 56
    iput v0, p0, Ll/ᩴۛ;->ᩳ:I

    .line 57
    iput v0, p0, Ll/ᩴۛ;->ܳ:I

    .line 58
    iput v0, p0, Ll/ᩴۛ;->ܿ:I

    const v0, 0x7fffffff

    const/4 v1, 0x0

    .line 61
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۛ;->ۧ:[I

    .line 116
    iput-object p1, p0, Ll/ᩴۛ;->֫:Landroid/content/Context;

    .line 117
    iput-object p2, p0, Ll/ᩴۛ;->᩻:Ll/᩵ۛ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MotionEvent;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 175
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    .line 176
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v3

    .line 177
    iget v4, v0, Ll/ᩴۛ;->ܳ:I

    iget-object v5, v0, Ll/ᩴۛ;->ۧ:[I

    if-ne v4, v2, :cond_1

    iget v4, v0, Ll/ᩴۛ;->ܿ:I

    if-ne v4, v3, :cond_1

    iget v4, v0, Ll/ᩴۛ;->ᩳ:I

    if-eq v4, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    goto/16 :goto_a

    .line 194
    :cond_1
    :goto_1
    iget-object v4, v0, Ll/ᩴۛ;->֫:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v6

    .line 196
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v8

    .line 195
    sget v9, Ll/᩷᩺;->֫:I

    .line 238
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v10, "android"

    const-string v11, "dimen"

    const/16 v12, 0x1a

    const/high16 v14, 0x400000

    const/16 v13, 0x22

    const/4 v15, -0x1

    if-lt v9, v13, :cond_3

    .line 239
    invoke-static {v6, v7, v1, v8}, Ll/ۜ᩺;->ۧ(Landroid/view/ViewConfiguration;III)I

    move-result v7

    :cond_2
    :goto_2
    const/4 v8, 0x0

    goto :goto_5

    .line 371
    :cond_3
    invoke-static {v7}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 372
    invoke-virtual {v7, v1, v8}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 246
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    if-ne v8, v14, :cond_4

    if-ne v1, v12, :cond_4

    const-string v8, "config_viewMinRotaryEncoderFlingVelocity"

    .line 367
    invoke-virtual {v7, v8, v11, v10}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    goto :goto_3

    :cond_4
    const/4 v8, -0x1

    .line 250
    :goto_3
    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v8, v15, :cond_5

    if-eqz v8, :cond_6

    .line 400
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    if-gez v7, :cond_2

    goto :goto_4

    .line 394
    :cond_5
    invoke-virtual {v6}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v7

    goto :goto_2

    :cond_6
    :goto_4
    const v7, 0x7fffffff

    goto :goto_2

    .line 195
    :goto_5
    aput v7, v5, v8

    .line 198
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v8

    if-lt v9, v13, :cond_8

    .line 272
    invoke-static {v6, v7, v1, v8}, Ll/ۜ᩺;->֫(Landroid/view/ViewConfiguration;III)I

    move-result v4

    :cond_7
    :goto_6
    const/4 v6, 0x1

    goto :goto_9

    .line 371
    :cond_8
    invoke-static {v7}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 372
    invoke-virtual {v7, v1, v8}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 279
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    if-ne v8, v14, :cond_9

    if-ne v1, v12, :cond_9

    const-string v7, "config_viewMaxRotaryEncoderFlingVelocity"

    .line 367
    invoke-virtual {v4, v7, v11, v10}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    goto :goto_7

    :cond_9
    const/4 v7, -0x1

    .line 283
    :goto_7
    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v7, v15, :cond_a

    if-eqz v7, :cond_b

    .line 400
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    if-gez v4, :cond_7

    goto :goto_8

    .line 394
    :cond_a
    invoke-virtual {v6}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v4

    goto :goto_6

    :cond_b
    :goto_8
    const/high16 v4, -0x80000000

    goto :goto_6

    .line 197
    :goto_9
    aput v4, v5, v6

    .line 184
    iput v2, v0, Ll/ᩴۛ;->ܳ:I

    .line 185
    iput v3, v0, Ll/ᩴۛ;->ܿ:I

    .line 186
    iput v1, v0, Ll/ᩴۛ;->ᩳ:I

    const/4 v2, 0x1

    goto/16 :goto_0

    .line 130
    :goto_a
    aget v6, v5, v4

    const v7, 0x7fffffff

    if-ne v6, v7, :cond_c

    .line 133
    iget-object v1, v0, Ll/ᩴۛ;->ۜ:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_10

    .line 134
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v1, 0x0

    .line 135
    iput-object v1, v0, Ll/ᩴۛ;->ۜ:Landroid/view/VelocityTracker;

    return-void

    .line 202
    :cond_c
    iget-object v6, v0, Ll/ᩴۛ;->ۜ:Landroid/view/VelocityTracker;

    if-nez v6, :cond_d

    .line 203
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v6

    iput-object v6, v0, Ll/ᩴۛ;->ۜ:Landroid/view/VelocityTracker;

    .line 206
    :cond_d
    iget-object v6, v0, Ll/ᩴۛ;->ۜ:Landroid/view/VelocityTracker;

    move-object/from16 v7, p1

    .line 210
    invoke-static {v6, v7}, Ll/᩵ۨ;->֫(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V

    .line 211
    invoke-static {v6}, Ll/᩵ۨ;->֫(Landroid/view/VelocityTracker;)V

    .line 212
    invoke-static {v6, v1}, Ll/᩵ۨ;->֫(Landroid/view/VelocityTracker;I)F

    move-result v1

    .line 141
    iget-object v6, v0, Ll/ᩴۛ;->᩻:Ll/᩵ۛ;

    invoke-interface {v6}, Ll/᩵ۛ;->֫()F

    move-result v7

    mul-float v7, v7, v1

    .line 143
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    move-result v1

    const/4 v8, 0x0

    if-nez v2, :cond_e

    .line 146
    iget v2, v0, Ll/ᩴۛ;->ܽ:F

    .line 147
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v2

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_f

    cmpl-float v1, v1, v8

    if-eqz v1, :cond_f

    .line 149
    :cond_e
    invoke-interface {v6}, Ll/᩵ۛ;->ۧ()V

    .line 152
    :cond_f
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v1

    aget v2, v5, v4

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_11

    :cond_10
    return-void

    .line 161
    :cond_11
    aget v1, v5, v3

    neg-int v2, v1

    int-to-float v2, v2

    int-to-float v1, v1

    .line 164
    invoke-static {v7, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 162
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 166
    invoke-interface {v6, v1}, Ll/᩵ۛ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_12

    move v8, v1

    .line 167
    :cond_12
    iput v8, v0, Ll/ᩴۛ;->ܽ:F

    return-void
.end method
