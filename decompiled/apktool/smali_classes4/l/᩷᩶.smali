.class public final Ll/᩷᩶;
.super Ljava/lang/Object;
.source "N5WY"


# instance fields
.field public ֡:Ll/ۡ᩶;

.field public ֫:Ljava/util/ArrayList;

.field public ۖ:Ljava/util/ArrayList;

.field public ۘ:I

.field public ۚ:I

.field public ۜ:Landroid/os/Bundle;

.field public ۡ:Landroid/app/Notification;

.field public ۢ:Ll/ۙ۬;

.field public ۧ:Z

.field public ܳ:Ljava/lang/CharSequence;

.field public ܺ:Ljava/util/ArrayList;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/CharSequence;

.field public ᩳ:Landroid/app/PendingIntent;

.field public ᩴ:Z

.field public ᩵:Z

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1011
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷᩶;->֫:Ljava/util/ArrayList;

    .line 1014
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷᩶;->ۖ:Ljava/util/ArrayList;

    .line 1021
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷᩶;->᩷:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 1032
    iput-boolean v0, p0, Ll/᩷᩶;->ᩴ:Z

    const/4 v1, 0x0

    .line 1051
    iput v1, p0, Ll/᩷᩶;->ۚ:I

    .line 1065
    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Ll/᩷᩶;->ۡ:Landroid/app/Notification;

    .line 1251
    iput-object p1, p0, Ll/᩷᩶;->᩻:Landroid/content/Context;

    .line 1252
    iput-object p2, p0, Ll/᩷᩶;->ܽ:Ljava/lang/String;

    .line 1254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    const/4 p1, -0x1

    .line 1255
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 1256
    iput v1, p0, Ll/᩷᩶;->ۘ:I

    .line 1257
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩷᩶;->ܺ:Ljava/util/ArrayList;

    .line 1258
    iput-boolean v0, p0, Ll/᩷᩶;->ۧ:Z

    return-void
.end method

.method public static ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    .line 2529
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 2530
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final ֫()Landroid/app/Notification;
    .locals 1

    .line 2524
    new-instance v0, Ll/۠᩶;

    invoke-direct {v0, p0}, Ll/۠᩶;-><init>(Ll/᩷᩶;)V

    invoke-virtual {v0}, Ll/۠᩶;->ۧ()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 10

    .line 2037
    new-instance v9, Ll/᩻᩶;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 5693
    invoke-static {v0, v1, p1}, Ll/ۙ۬;->֫(Landroid/content/res/Resources;Ljava/lang/String;I)Ll/ۙ۬;

    move-result-object p1

    move-object v1, p1

    .line 5702
    :goto_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v8}, Ll/᩻᩶;-><init>(Ll/ۙ۬;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Ll/ᩳۙ;[Ll/ᩳۙ;ZZ)V

    .line 2037
    iget-object p1, p0, Ll/᩷᩶;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Landroid/app/PendingIntent;)V
    .locals 0

    .line 1514
    iput-object p1, p0, Ll/᩷᩶;->ᩳ:Landroid/app/PendingIntent;

    return-void
.end method

.method public final ֫(Landroid/graphics/Bitmap;)V
    .locals 9

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 9391
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_1

    goto :goto_0

    .line 9395
    :cond_1
    iget-object v0, p0, Ll/᩷᩶;->᩻:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07005f

    .line 9397
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const v2, 0x7f07005e

    .line 9399
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 9400
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_2

    goto :goto_0

    :cond_2
    int-to-double v1, v1

    .line 9405
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    .line 9406
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    .line 9404
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    .line 9409
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 9410
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double v5, v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 9407
    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1588
    :goto_0
    invoke-static {p1}, Ll/ۙ۬;->ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Ll/᩷᩶;->ۢ:Ll/ۙ۬;

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1394
    invoke-static {p1}, Ll/᩷᩶;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩶;->ܿ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1386
    invoke-static {p1}, Ll/᩷᩶;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩶;->ܳ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ll/ۡ᩶;)V
    .locals 1

    .line 2129
    iget-object v0, p0, Ll/᩷᩶;->֡:Ll/ۡ᩶;

    if-eq v0, p1, :cond_0

    .line 2130
    iput-object p1, p0, Ll/᩷᩶;->֡:Ll/ۡ᩶;

    if-eqz p1, :cond_0

    .line 2710
    iget-object v0, p1, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    if-eq v0, p0, :cond_0

    .line 2711
    iput-object p0, p1, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    .line 2713
    invoke-virtual {p0, p1}, Ll/᩷᩶;->֫(Ll/ۡ᩶;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 1284
    iput-boolean p1, p0, Ll/᩷᩶;->ᩴ:Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1821
    iget-object v0, p0, Ll/᩷᩶;->ۡ:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public final ܳ()V
    .locals 2

    const v0, 0x7f080145

    .line 1340
    iget-object v1, p0, Ll/᩷᩶;->ۡ:Landroid/app/Notification;

    iput v0, v1, Landroid/app/Notification;->icon:I

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 1821
    iget-object v0, p0, Ll/᩷᩶;->ۡ:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 1378
    iput-boolean v0, p0, Ll/᩷᩶;->᩵:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 1850
    iput v0, p0, Ll/᩷᩶;->ۘ:I

    return-void
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 2158
    iput v0, p0, Ll/᩷᩶;->ۚ:I

    return-void
.end method
