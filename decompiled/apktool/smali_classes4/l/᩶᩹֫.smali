.class public final Ll/᩶᩹֫;
.super Ljava/lang/Object;
.source "68TO"


# instance fields
.field public ֫:Ll/ᩳᩴ֫;

.field public ۜ:F

.field public ۧ:Ll/ܺ֡֫;

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:Landroid/os/Handler;

.field public final ᩳ:Ll/ۛܶܺ;

.field public ᩻:Ll/᩹᩹֫;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ll/᩹᩹֫;)V
    .locals 1

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 133
    iput v0, p0, Ll/᩶᩹֫;->ۜ:F

    .line 145
    new-instance v0, Ll/᩸᩹֫;

    invoke-direct {v0, p1}, Ll/᩸᩹֫;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Ll/֫᩸ܺ;->֫(Ll/ۛܶܺ;)Ll/ۛܶܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩹֫;->ᩳ:Ll/ۛܶܺ;

    .line 146
    iput-object p3, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    .line 147
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll/᩶᩹֫;->ܿ:Landroid/os/Handler;

    const/4 p1, 0x0

    .line 148
    iput p1, p0, Ll/᩶᩹֫;->ܽ:I

    return-void
.end method

.method private ֫(I)V
    .locals 1

    .line 347
    iget v0, p0, Ll/᩶᩹֫;->ܽ:I

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 350
    :cond_0
    iput p1, p0, Ll/᩶᩹֫;->ܽ:I

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    const p1, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 356
    :goto_0
    iget v0, p0, Ll/᩶᩹֫;->ۜ:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_2

    goto :goto_1

    .line 359
    :cond_2
    iput p1, p0, Ll/᩶᩹֫;->ۜ:F

    .line 360
    iget-object p1, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    if-eqz p1, :cond_3

    .line 361
    check-cast p1, Ll/᩶ۙ֫;

    invoke-virtual {p1}, Ll/᩶ۙ֫;->᩻()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static ֫(Ll/᩶᩹֫;I)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x3

    const/4 v1, -0x2

    if-eq p1, v0, :cond_4

    if-eq p1, v1, :cond_4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_0

    const-string p0, "Unknown focus change type: "

    .line 0
    invoke-static {p1, p0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x2

    .line 368
    invoke-direct {p0, p1}, Ll/᩶᩹֫;->֫(I)V

    .line 391
    iget-object p0, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    if-eqz p0, :cond_1

    .line 392
    check-cast p0, Ll/᩶ۙ֫;

    invoke-virtual {p0, v1}, Ll/᩶ۙ֫;->֫(I)V

    :cond_1
    return-void

    .line 391
    :cond_2
    iget-object p1, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    if-eqz p1, :cond_3

    .line 392
    check-cast p1, Ll/᩶ۙ֫;

    invoke-virtual {p1, v0}, Ll/᩶ۙ֫;->֫(I)V

    .line 373
    :cond_3
    invoke-direct {p0}, Ll/᩶᩹֫;->ܽ()V

    .line 374
    invoke-direct {p0, v1}, Ll/᩶᩹֫;->֫(I)V

    return-void

    :cond_4
    if-eq p1, v1, :cond_5

    const/4 p1, 0x4

    .line 382
    invoke-direct {p0, p1}, Ll/᩶᩹֫;->֫(I)V

    return-void

    .line 391
    :cond_5
    iget-object p1, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    if-eqz p1, :cond_6

    .line 392
    check-cast p1, Ll/᩶ۙ֫;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/᩶ۙ֫;->֫(I)V

    :cond_6
    const/4 p1, 0x3

    .line 380
    invoke-direct {p0, p1}, Ll/᩶᩹֫;->֫(I)V

    return-void
.end method

.method private ܽ()V
    .locals 2

    .line 238
    iget v0, p0, Ll/᩶᩹֫;->ܽ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 242
    :cond_0
    iget-object v0, p0, Ll/᩶᩹֫;->ۧ:Ll/ܺ֡֫;

    if-eqz v0, :cond_1

    .line 243
    iget-object v0, p0, Ll/᩶᩹֫;->ᩳ:Ll/ۛܶܺ;

    invoke-interface {v0}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iget-object v1, p0, Ll/᩶᩹֫;->ۧ:Ll/ܺ֡֫;

    invoke-static {v0, v1}, Ll/ۖ֡֫;->֫(Landroid/media/AudioManager;Ll/ܺ֡֫;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 1

    .line 153
    iget v0, p0, Ll/᩶᩹֫;->ۜ:F

    return v0
.end method

.method public final ֫(IZ)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_7

    .line 220
    iget p1, p0, Ll/᩶᩹֫;->ܳ:I

    if-ne p1, v1, :cond_7

    const/4 v2, -0x1

    if-eqz p2, :cond_4

    .line 224
    iget p2, p0, Ll/᩶᩹֫;->ܽ:I

    const/4 v3, 0x2

    if-ne p2, v3, :cond_0

    goto :goto_2

    .line 248
    :cond_0
    iget-object p2, p0, Ll/᩶᩹֫;->ۧ:Ll/ܺ֡֫;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    .line 251
    new-instance p2, Ll/᩷֡֫;

    invoke-direct {p2, p1}, Ll/᩷֡֫;-><init>(I)V

    goto :goto_0

    .line 252
    :cond_2
    invoke-virtual {p2}, Ll/ܺ֡֫;->֫()Ll/᩷֡֫;

    move-result-object p2

    .line 255
    :goto_0
    iget-object p1, p0, Ll/᩶᩹֫;->֫:Ll/ᩳᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    invoke-virtual {p2, p1}, Ll/᩷֡֫;->֫(Ll/ᩳᩴ֫;)V

    .line 258
    invoke-virtual {p2, v0}, Ll/᩷֡֫;->֫(Z)V

    new-instance p1, Ll/ܶ᩹֫;

    invoke-direct {p1, p0}, Ll/ܶ᩹֫;-><init>(Ll/᩶᩹֫;)V

    iget-object v0, p0, Ll/᩶᩹֫;->ܿ:Landroid/os/Handler;

    .line 259
    invoke-virtual {p2, p1, v0}, Ll/᩷֡֫;->֫(Ll/ܶ᩹֫;Landroid/os/Handler;)V

    .line 260
    invoke-virtual {p2}, Ll/᩷֡֫;->֫()Ll/ܺ֡֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩹֫;->ۧ:Ll/ܺ֡֫;

    .line 264
    :goto_1
    iget-object p1, p0, Ll/᩶᩹֫;->ᩳ:Ll/ۛܶܺ;

    invoke-interface {p1}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iget-object p2, p0, Ll/᩶᩹֫;->ۧ:Ll/ܺ֡֫;

    invoke-static {p1, p2}, Ll/ۖ֡֫;->ۧ(Landroid/media/AudioManager;Ll/ܺ֡֫;)I

    move-result p1

    if-ne p1, v1, :cond_3

    .line 229
    invoke-direct {p0, v3}, Ll/᩶᩹֫;->֫(I)V

    return v1

    .line 232
    :cond_3
    invoke-direct {p0, v1}, Ll/᩶᩹֫;->֫(I)V

    return v2

    .line 192
    :cond_4
    iget p1, p0, Ll/᩶᩹֫;->ܽ:I

    if-eq p1, v1, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_5

    :goto_2
    return v1

    :cond_5
    return v0

    :cond_6
    return v2

    .line 185
    :cond_7
    invoke-direct {p0}, Ll/᩶᩹֫;->ܽ()V

    .line 186
    invoke-direct {p0, v0}, Ll/᩶᩹֫;->֫(I)V

    return v1
.end method

.method public final ֫(Ll/ᩳᩴ֫;)V
    .locals 2

    .line 166
    iget-object v0, p0, Ll/᩶᩹֫;->֫:Ll/ᩳᩴ֫;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 167
    iput-object p1, p0, Ll/᩶᩹֫;->֫:Ll/ᩳᩴ֫;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 168
    :goto_0
    iput p1, p0, Ll/᩶᩹֫;->ܳ:I

    if-eq p1, v1, :cond_1

    if-nez p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 169
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 207
    iput-object v0, p0, Ll/᩶᩹֫;->᩻:Ll/᩹᩹֫;

    .line 208
    invoke-direct {p0}, Ll/᩶᩹֫;->ܽ()V

    const/4 v0, 0x0

    .line 209
    invoke-direct {p0, v0}, Ll/᩶᩹֫;->֫(I)V

    return-void
.end method
