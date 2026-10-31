.class public final Ll/᩸ܽ֫;
.super Ll/֨ܽ֫;
.source "5B43"


# instance fields
.field public ֨:Z

.field public ۠:F

.field public ܶ:Ll/᩹ܽ֫;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll/ܶܽ֫;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Ll/֨ܽ֫;-><init>(Ljava/lang/Object;Ll/ܶܽ֫;)V

    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 61
    iput p1, p0, Ll/᩸ܽ֫;->۠:F

    const/4 p1, 0x0

    .line 63
    iput-boolean p1, p0, Ll/᩸ܽ֫;->֨:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩹ܽ֫;)V
    .locals 0

    .line 128
    iput-object p1, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 191
    iget-object v0, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    iget-wide v0, v0, Ll/᩹ܽ֫;->ۧ:D

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_2

    .line 177
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 180
    iget-boolean v0, p0, Ll/֨ܽ֫;->ܳ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 181
    iput-boolean v0, p0, Ll/᩸ܽ֫;->֨:Z

    :cond_0
    return-void

    .line 178
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Animations may only be started on the main thread"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Spring animations can only come to an end when there is damping"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(J)Z
    .locals 20

    move-object/from16 v0, p0

    .line 215
    iget-boolean v1, v0, Ll/᩸ܽ֫;->֨:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    if-eqz v1, :cond_1

    .line 216
    iget v1, v0, Ll/᩸ܽ֫;->۠:F

    cmpl-float v6, v1, v5

    if-eqz v6, :cond_0

    .line 217
    iget-object v6, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v6, v1}, Ll/᩹ܽ֫;->ۧ(F)V

    .line 218
    iput v5, v0, Ll/᩸ܽ֫;->۠:F

    .line 220
    :cond_0
    iget-object v1, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v1}, Ll/᩹ܽ֫;->֫()F

    move-result v1

    iput v1, v0, Ll/֨ܽ֫;->ۢ:F

    .line 221
    iput v4, v0, Ll/֨ܽ֫;->ۡ:F

    .line 222
    iput-boolean v3, v0, Ll/᩸ܽ֫;->֨:Z

    return v2

    .line 226
    :cond_1
    iget v1, v0, Ll/᩸ܽ֫;->۠:F

    cmpl-float v1, v1, v5

    if-eqz v1, :cond_2

    .line 227
    iget-object v1, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    iget-object v6, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    iget v1, v0, Ll/֨ܽ֫;->ۢ:F

    float-to-double v7, v1

    iget v1, v0, Ll/֨ܽ֫;->ۡ:F

    float-to-double v9, v1

    const-wide/16 v11, 0x2

    div-long v18, p1, v11

    move-wide/from16 v11, v18

    invoke-virtual/range {v6 .. v12}, Ll/᩹ܽ֫;->֫(DDJ)Ll/ᩴܽ֫;

    move-result-object v1

    .line 231
    iget-object v6, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    iget v7, v0, Ll/᩸ܽ֫;->۠:F

    invoke-virtual {v6, v7}, Ll/᩹ܽ֫;->ۧ(F)V

    .line 232
    iput v5, v0, Ll/᩸ܽ֫;->۠:F

    .line 234
    iget-object v13, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    iget v6, v1, Ll/ᩴܽ֫;->֫:F

    float-to-double v14, v6

    iget v1, v1, Ll/ᩴܽ֫;->ۧ:F

    float-to-double v6, v1

    move-wide/from16 v16, v6

    invoke-virtual/range {v13 .. v19}, Ll/᩹ܽ֫;->֫(DDJ)Ll/ᩴܽ֫;

    move-result-object v1

    .line 235
    iget v6, v1, Ll/ᩴܽ֫;->֫:F

    iput v6, v0, Ll/֨ܽ֫;->ۢ:F

    .line 236
    iget v1, v1, Ll/ᩴܽ֫;->ۧ:F

    iput v1, v0, Ll/֨ܽ֫;->ۡ:F

    goto :goto_0

    .line 239
    :cond_2
    iget-object v13, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    iget v1, v0, Ll/֨ܽ֫;->ۢ:F

    float-to-double v14, v1

    iget v1, v0, Ll/֨ܽ֫;->ۡ:F

    float-to-double v6, v1

    move-wide/from16 v16, v6

    move-wide/from16 v18, p1

    invoke-virtual/range {v13 .. v19}, Ll/᩹ܽ֫;->֫(DDJ)Ll/ᩴܽ֫;

    move-result-object v1

    .line 240
    iget v6, v1, Ll/ᩴܽ֫;->֫:F

    iput v6, v0, Ll/֨ܽ֫;->ۢ:F

    .line 241
    iget v1, v1, Ll/ᩴܽ֫;->ۧ:F

    iput v1, v0, Ll/֨ܽ֫;->ۡ:F

    .line 244
    :goto_0
    iget v1, v0, Ll/֨ܽ֫;->ۢ:F

    iget v6, v0, Ll/֨ܽ֫;->ܽ:F

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, v0, Ll/֨ܽ֫;->ۢ:F

    .line 245
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v0, Ll/֨ܽ֫;->ۢ:F

    .line 247
    iget v5, v0, Ll/֨ܽ֫;->ۡ:F

    .line 262
    iget-object v6, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v6, v1, v5}, Ll/᩹ܽ֫;->֫(FF)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 248
    iget-object v1, v0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v1}, Ll/᩹ܽ֫;->֫()F

    move-result v1

    iput v1, v0, Ll/֨ܽ֫;->ۢ:F

    .line 249
    iput v4, v0, Ll/֨ܽ֫;->ۡ:F

    return v2

    :cond_3
    return v3
.end method

.method public final ܽ(F)V
    .locals 6

    .line 605
    iget-boolean v0, p0, Ll/֨ܽ֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 153
    iput p1, p0, Ll/᩸ܽ֫;->۠:F

    return-void

    .line 155
    :cond_0
    iget-object v0, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    if-nez v0, :cond_1

    .line 156
    new-instance v0, Ll/᩹ܽ֫;

    invoke-direct {v0, p1}, Ll/᩹ܽ֫;-><init>(F)V

    iput-object v0, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    .line 158
    :cond_1
    iget-object v0, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {v0, p1}, Ll/᩹ܽ֫;->ۧ(F)V

    .line 197
    iget-object p1, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    if-eqz p1, :cond_a

    .line 201
    invoke-virtual {p1}, Ll/᩹ܽ֫;->֫()F

    move-result p1

    float-to-double v0, p1

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    float-to-double v2, p1

    cmpl-double v4, v0, v2

    if-gtz v4, :cond_9

    .line 205
    iget v2, p0, Ll/֨ܽ֫;->ܽ:F

    float-to-double v3, v2

    cmpg-double v5, v0, v3

    if-ltz v5, :cond_8

    .line 135
    iget-object v0, p0, Ll/᩸ܽ֫;->ܶ:Ll/᩹ܽ֫;

    invoke-virtual {p0}, Ll/֨ܽ֫;->֫()F

    move-result v1

    float-to-double v3, v1

    invoke-virtual {v0, v3, v4}, Ll/᩹ܽ֫;->֫(D)V

    .line 576
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_7

    .line 579
    iget-boolean v0, p0, Ll/֨ܽ֫;->ܳ:Z

    if-nez v0, :cond_6

    if-nez v0, :cond_6

    const/4 v0, 0x1

    .line 614
    iput-boolean v0, p0, Ll/֨ܽ֫;->ܳ:Z

    .line 615
    iget-boolean v0, p0, Ll/֨ܽ֫;->᩻:Z

    if-nez v0, :cond_2

    .line 710
    iget-object v0, p0, Ll/֨ܽ֫;->ܿ:Ll/ܶܽ֫;

    iget-object v1, p0, Ll/֨ܽ֫;->ۜ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ll/ܶܽ֫;->getValue(Ljava/lang/Object;)F

    move-result v0

    .line 616
    iput v0, p0, Ll/֨ܽ֫;->ۢ:F

    .line 619
    :cond_2
    iget v0, p0, Ll/֨ܽ֫;->ۢ:F

    cmpl-float p1, v0, p1

    if-gtz p1, :cond_5

    cmpg-float p1, v0, v2

    if-ltz p1, :cond_5

    .line 88
    sget-object p1, Ll/۟ۧ֫;->ܳ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 89
    new-instance v0, Ll/۟ۧ֫;

    invoke-direct {v0}, Ll/۟ۧ֫;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 91
    :cond_3
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۧ֫;

    .line 125
    iget-object v0, p1, Ll/۟ۧ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_4

    .line 126
    invoke-virtual {p1}, Ll/۟ۧ֫;->֫()Ll/ۨۧ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨۧ֫;->֫()V

    .line 128
    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 129
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 620
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Starting value need to be in between min value and max value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    .line 577
    :cond_7
    new-instance p1, Landroid/util/AndroidRuntimeException;

    const-string v0, "Animations may only be started on the main thread"

    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 206
    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Final position of the spring cannot be less than the min value."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 203
    :cond_9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Final position of the spring cannot be greater than the max value."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 198
    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
