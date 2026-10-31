.class public final Ll/᩵ᩴᩳ;
.super Ljava/lang/Object;
.source "P6SA"


# instance fields
.field public final ֡:I

.field public ֨:Z

.field public ֫:Ll/ۗ᩻᩵;

.field public final ۖ:Landroid/graphics/Point;

.field public final ۘ:Landroid/graphics/Point;

.field public final ۚ:Ll/۫ۨᩳ;

.field public final ۜ:Ll/ܶ᩺ᩳ;

.field public ۡ:Ll/ᩴᩴᩳ;

.field public final ۢ:Ll/ۨ᩵ᩳ;

.field public final ۧ:Landroid/os/Bundle;

.field public ܳ:J

.field public final ܺ:Ll/᩺ܶᩳ;

.field public ܽ:Z

.field public final ܿ:Z

.field public ᩳ:Landroid/view/View$OnAttachStateChangeListener;

.field public ᩴ:Ll/᩸ۨᩳ;

.field public ᩵:Z

.field public final ᩷:Landroid/os/Handler;

.field public final ᩻:Ll/᩹ܶᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ۨ᩵ᩳ;ILl/᩺ܶᩳ;Z)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    .line 45
    iput-object p1, p0, Ll/᩵ᩴᩳ;->᩻:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/᩵ᩴᩳ;->ۢ:Ll/ۨ᩵ᩳ;

    iput p3, p0, Ll/᩵ᩴᩳ;->֡:I

    .line 46
    iput-boolean p5, p0, Ll/᩵ᩴᩳ;->ܿ:Z

    .line 47
    iget-object p2, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    iget-object p3, p1, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    iput-object p3, p0, Ll/᩵ᩴᩳ;->ۜ:Ll/ܶ᩺ᩳ;

    .line 48
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۫֫()I

    move-result p3

    invoke-virtual {p2, p3}, Ll/۫ۨᩳ;->ܽ(I)Landroid/graphics/Point;

    move-result-object p3

    iput-object p3, p0, Ll/᩵ᩴᩳ;->ۘ:Landroid/graphics/Point;

    .line 49
    new-instance p3, Landroid/graphics/Point;

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result p5

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p2

    invoke-direct {p3, p5, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p3, p0, Ll/᩵ᩴᩳ;->ۖ:Landroid/graphics/Point;

    .line 50
    new-instance p2, Landroid/os/Bundle;

    iget-object p1, p1, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    invoke-direct {p2, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p2, p0, Ll/᩵ᩴᩳ;->ۧ:Landroid/os/Bundle;

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p4}, Ll/᩺ܶᩳ;->֫()Ll/᩺ܶᩳ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/᩵ᩴᩳ;->ܺ:Ll/᩺ܶᩳ;

    return-void
.end method

.method private ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 141
    instance-of v0, p1, Ll/۬᩻᩵;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 142
    :cond_0
    iget-object v0, p0, Ll/᩵ᩴᩳ;->֫:Ll/ۗ᩻᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 143
    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩻:Ll/᩹ܶᩳ;

    invoke-virtual {v0, p0, p1}, Ll/᩹ܶᩳ;->֫(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ᩴᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵ᩴᩳ;->ۜ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ᩴᩳ;Ljava/lang/Long;Ljava/lang/Throwable;)V
    .locals 4

    if-eqz p2, :cond_0

    .line 93
    invoke-direct {p0, p2}, Ll/᩵ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 95
    :cond_0
    iget-object p2, p0, Ll/᩵ᩴᩳ;->ۢ:Ll/ۨ᩵ᩳ;

    iget-object p2, p2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {p2}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    iget-object p1, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance p2, Ll/ۢᩴᩳ;

    invoke-direct {p2, p0}, Ll/ۢᩴᩳ;-><init>(Ll/᩵ᩴᩳ;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 96
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵ᩴᩳ;->ܳ:J

    .line 97
    invoke-direct {p0}, Ll/᩵ᩴᩳ;->ۜ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Ll/᩵ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 133
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۢ(Z)V

    .line 134
    iget-object p1, p0, Ll/᩵ᩴᩳ;->ᩴ:Ll/᩸ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/᩸ۨᩳ;)V

    .line 135
    iget-object p1, p0, Ll/᩵ᩴᩳ;->᩻:Ll/᩹ܶᩳ;

    invoke-virtual {p1, p0}, Ll/᩹ܶᩳ;->֫(Ll/᩵ᩴᩳ;)V

    .line 136
    iget-object p0, p0, Ll/᩵ᩴᩳ;->֫:Ll/ۗ᩻᩵;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method private ۜ()V
    .locals 7

    .line 104
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۢ:Ll/ۨ᩵ᩳ;

    iget-boolean v1, p0, Ll/᩵ᩴᩳ;->ܿ:Z

    iget-object v2, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 105
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ᩳ:Landroid/view/View$OnAttachStateChangeListener;

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Ll/ۘᩴᩳ;

    invoke-direct {v0, p0}, Ll/ۘᩴᩳ;-><init>(Ll/᩵ᩴᩳ;)V

    iput-object v0, p0, Ll/᩵ᩴᩳ;->ᩳ:Landroid/view/View$OnAttachStateChangeListener;

    .line 115
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void

    .line 121
    :cond_1
    :try_start_0
    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v1}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v3

    iget-wide v5, p0, Ll/᩵ᩴᩳ;->ܳ:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    invoke-direct {p0}, Ll/᩵ᩴᩳ;->᩻()V

    return-void

    .line 122
    :cond_2
    invoke-virtual {v2}, Ll/۫ۨᩳ;->۟ۧ()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/ۖᩴᩳ;

    invoke-direct {v1, p0}, Ll/ۖᩴᩳ;-><init>(Ll/᩵ᩴᩳ;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 123
    :cond_3
    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;)V

    const/4 v1, 0x1

    .line 124
    iput-boolean v1, p0, Ll/᩵ᩴᩳ;->ܽ:Z

    .line 125
    iget-boolean v1, p0, Ll/᩵ᩴᩳ;->֨:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/᩵ᩴᩳ;->ۜ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v1}, Ll/ܶ᩺ᩳ;->ᩳ()V

    .line 131
    :cond_4
    iget-wide v1, p0, Ll/᩵ᩴᩳ;->ܳ:J

    invoke-virtual {v0, v1, v2}, Ll/ۨ᩵ᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۛ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۛ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 127
    invoke-direct {p0, v0}, Ll/᩵ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ᩴᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵ᩴᩳ;->᩻()V

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ᩴᩳ;Ljava/lang/Long;Ljava/lang/Throwable;)V
    .locals 2

    .line 92
    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/ۡᩴᩳ;

    invoke-direct {v1, p0, p1, p2}, Ll/ۡᩴᩳ;-><init>(Ll/᩵ᩴᩳ;Ljava/lang/Long;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V
    .locals 2

    .line 59
    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/᩷ᩴᩳ;

    invoke-direct {v1, p0, p1}, Ll/᩷ᩴᩳ;-><init>(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩵ᩴᩳ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V
    .locals 0

    if-nez p1, :cond_0

    .line 60
    invoke-direct {p0}, Ll/᩵ᩴᩳ;->᩻()V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Ll/᩵ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/᩵ᩴᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵ᩴᩳ;->ۜ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/᩵ᩴᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩵ᩴᩳ;->ᩳ:Landroid/view/View$OnAttachStateChangeListener;

    return-void
.end method

.method public static synthetic ᩳ(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V
    .locals 3

    .line 131
    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/ܺᩴᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ll/ܺᩴᩳ;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ᩻()V
    .locals 15

    .line 78
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۜ:Ll/ܶ᩺ᩳ;

    :try_start_0
    iget-boolean v1, p0, Ll/᩵ᩴᩳ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ll/᩵ᩴᩳ;->ۢ:Ll/ۨ᩵ᩳ;

    if-eqz v1, :cond_0

    .line 131
    :try_start_1
    iget-wide v0, p0, Ll/᩵ᩴᩳ;->ܳ:J

    invoke-virtual {v2, v0, v1}, Ll/ۨ᩵ᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۛ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۛ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void

    .line 79
    :cond_0
    iget-boolean v1, p0, Ll/᩵ᩴᩳ;->᩵:Z

    if-nez v1, :cond_2

    .line 80
    iget-object v1, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    iget-object v3, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    iget-object v4, p0, Ll/᩵ᩴᩳ;->ᩴ:Ll/᩸ۨᩳ;

    invoke-virtual {v1, v3, v4}, Ll/۫ۨᩳ;->֫(Ll/ۙ֫ܿ;Ll/᩸ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Ll/᩵ᩴᩳ;->᩷:Landroid/os/Handler;

    new-instance v1, Ll/ۢᩴᩳ;

    invoke-direct {v1, p0}, Ll/ۢᩴᩳ;-><init>(Ll/᩵ᩴᩳ;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 81
    iput-boolean v1, p0, Ll/᩵ᩴᩳ;->᩵:Z

    .line 83
    :cond_2
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    .line 84
    invoke-virtual {v0, v1}, Ll/ܶ᩺ᩳ;->ۧ(Ll/ۤۜܽ;)V

    invoke-virtual {v0, v3}, Ll/ܶ᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 85
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۧ:Landroid/os/Bundle;

    const-string v4, "changed"

    iget-object v5, p0, Ll/᩵ᩴᩳ;->᩻:Ll/᩹ܶᩳ;

    iget-object v6, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v6}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v6

    invoke-virtual {v5, v6}, Ll/᩹ܶᩳ;->ᩳ(Z)Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    invoke-virtual {v3}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    .line 87
    iget-object v6, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    iget-object v7, p0, Ll/᩵ᩴᩳ;->ۧ:Landroid/os/Bundle;

    iget-object v8, p0, Ll/᩵ᩴᩳ;->ܺ:Ll/᩺ܶᩳ;

    iget v11, p0, Ll/᩵ᩴᩳ;->֡:I

    const-wide/16 v12, -0x1

    const/4 v14, 0x0

    move-object v9, v0

    move-object v10, v1

    .line 60
    invoke-static/range {v6 .. v14}, Ll/۬ᩴᩳ;->֫(Ll/۫ۨᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;[B[BIJ[B)Ll/۬ᩴᩳ;

    move-result-object v3

    .line 89
    new-instance v4, Ll/ᩴᩴᩳ;

    invoke-virtual {v3}, Ll/۬ᩴᩳ;->ᩴ()Ll/ۗ֫ܿ;

    move-result-object v5

    invoke-direct {v4, v5, v0, v1}, Ll/ᩴᩴᩳ;-><init>(Ll/ۗ֫ܿ;[B[B)V

    iput-object v4, p0, Ll/᩵ᩴᩳ;->ۡ:Ll/ᩴᩴᩳ;

    .line 91
    iget-object v0, v2, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {v0, v3}, Ll/᩻ᩴᩳ;->֫(Ll/۬ᩴᩳ;)Ll/ۗ᩻᩵;

    move-result-object v0

    iget-object v1, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v1}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/۫᩵ᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/۫᩵ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۤ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۤ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 99
    invoke-direct {p0, v0}, Ll/᩵ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Ll/᩵ᩴᩳ;->֨:Z

    .line 73
    iget-boolean v0, p0, Ll/᩵ᩴᩳ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۜ:Ll/ܶ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܶ᩺ᩳ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/ۗ᩻᩵;
    .locals 2

    .line 68
    iget-object v0, p0, Ll/᩵ᩴᩳ;->֫:Ll/ۗ᩻᩵;

    new-instance v1, Ll/ۚ۬ۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۗ᩻᩵;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/᩵ᩴᩳ;->֫:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩵ᩴᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0

    .line 57
    :cond_0
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩵ᩴᩳ;->֫:Ll/ۗ᩻᩵;

    .line 58
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ᩴ:Ll/᩸ۨᩳ;

    iget-object v1, p0, Ll/᩵ᩴᩳ;->ۢ:Ll/ۨ᩵ᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->֫(Ll/ۙ֫ܿ;)Ll/᩸ۨᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ᩴᩳ;->ᩴ:Ll/᩸ۨᩳ;

    .line 59
    :cond_1
    invoke-virtual {v1}, Ll/ۨ᩵ᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۜᩴᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۜᩴᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 62
    invoke-virtual {p0}, Ll/᩵ᩴᩳ;->ۧ()Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/ᩴᩴᩳ;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩵ᩴᩳ;->ۡ:Ll/ᩴᩴᩳ;

    return-object v0
.end method

.method public final ܿ()Landroid/graphics/Point;
    .locals 2

    .line 65
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Ll/᩵ᩴᩳ;->ۘ:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    return-object v0
.end method

.method public final ᩳ()Landroid/graphics/Point;
    .locals 2

    .line 66
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Ll/᩵ᩴᩳ;->ۖ:Landroid/graphics/Point;

    invoke-direct {v0, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    return-object v0
.end method
