.class public final Ll/֨᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"


# static fields
.field public static final ۠:Ll/᩸ܳۧ;


# instance fields
.field public ֡:Ll/᩹᩻ۧ;

.field public ֨:Ll/۠ᩴ֫;

.field public final ֫:Ll/ܽۚ֫;

.field public ۖ:Ll/᩷֨֫;

.field public ۘ:I

.field public final ۚ:Ll/ܳ֡֫;

.field public ۜ:Z

.field public final ۡ:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public ۢ:J

.field public final ۧ:Landroid/content/Context;

.field public ܳ:J

.field public ܺ:I

.field public ܽ:Landroid/util/Pair;

.field public final ܿ:Z

.field public final ᩳ:Ll/ۜۜۧ;

.field public ᩴ:I

.field public ᩵:I

.field public final ᩷:Landroid/util/SparseArray;

.field public ᩻:Ll/᩵ۚ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 232
    new-instance v0, Ll/᩸ܳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֨᩻ۧ;->۠:Ll/᩸ܳۧ;

    return-void
.end method

.method public constructor <init>(Ll/᩷᩻ۧ;)V
    .locals 2

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    invoke-static {p1}, Ll/᩷᩻ۧ;->ۧ(Ll/᩷᩻ۧ;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩻ۧ;->ۧ:Landroid/content/Context;

    .line 280
    new-instance v0, Ll/᩷֨֫;

    invoke-direct {v0}, Ll/᩷֨֫;-><init>()V

    iput-object v0, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    .line 281
    invoke-static {p1}, Ll/᩷᩻ۧ;->ܿ(Ll/᩷᩻ۧ;)Ll/ܳ֡֫;

    move-result-object v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/֨᩻ۧ;->ۚ:Ll/ܳ֡֫;

    .line 282
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/֨᩻ۧ;->᩷:Landroid/util/SparseArray;

    .line 283
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    .line 285
    invoke-static {p1}, Ll/᩷᩻ۧ;->ܽ(Ll/᩷᩻ۧ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/֨᩻ۧ;->ܿ:Z

    .line 286
    invoke-static {p1}, Ll/᩷᩻ۧ;->֫(Ll/᩷᩻ۧ;)Ll/ܽۚ֫;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩻ۧ;->֫:Ll/ܽۚ֫;

    .line 287
    new-instance v1, Ll/ۤܳۧ;

    invoke-static {p1}, Ll/᩷᩻ۧ;->ᩳ(Ll/᩷᩻ۧ;)Ll/ۙ᩻ۧ;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ll/ۤܳۧ;-><init>(Ll/ۙ᩻ۧ;Ll/ܽۚ֫;)V

    iput-object v1, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    .line 300
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Ll/֨᩻ۧ;->ۡ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 301
    new-instance p1, Ll/֨ᩴ֫;

    invoke-direct {p1}, Ll/֨ᩴ֫;-><init>()V

    invoke-virtual {p1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩻ۧ;->֨:Ll/۠ᩴ֫;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 303
    iput-wide v0, p0, Ll/֨᩻ۧ;->ۢ:J

    .line 304
    iput-wide v0, p0, Ll/֨᩻ۧ;->ܳ:J

    const/4 p1, -0x1

    .line 305
    iput p1, p0, Ll/֨᩻ۧ;->᩵:I

    const/4 p1, 0x0

    .line 306
    iput p1, p0, Ll/֨᩻ۧ;->ᩴ:I

    return-void
.end method

.method private ֫(Landroid/view/Surface;II)V
    .locals 0

    return-void
.end method

.method public static synthetic ֫(Ll/֨᩻ۧ;)V
    .locals 1

    .line 633
    iget v0, p0, Ll/֨᩻ۧ;->ܺ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֨᩻ۧ;->ܺ:I

    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;F)V
    .locals 0

    .line 651
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0, p1}, Ll/ۤܳۧ;->֫(F)V

    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;I)V
    .locals 0

    .line 656
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0, p1}, Ll/ۤܳۧ;->֫(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨᩻ۧ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֨᩻ۧ;->ܳ:J

    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;JJ)V
    .locals 0

    .line 609
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۤܳۧ;->֫(JJ)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨᩻ۧ;Ll/᩷֨֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;Ll/᩹᩻ۧ;)V
    .locals 0

    .line 646
    iput-object p1, p0, Ll/֨᩻ۧ;->֡:Ll/᩹᩻ۧ;

    .line 647
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0, p1}, Ll/ۤܳۧ;->֫(Ll/᩹᩻ۧ;)V

    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;Z)V
    .locals 9

    .line 613
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    .line 568
    iget v1, p0, Ll/֨᩻ۧ;->ᩴ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 616
    iget v1, p0, Ll/֨᩻ۧ;->ܺ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/֨᩻ۧ;->ܺ:I

    .line 617
    move-object v3, v0

    check-cast v3, Ll/ۤܳۧ;

    invoke-virtual {v3, p1}, Ll/ۤܳۧ;->ۧ(Z)V

    .line 618
    :goto_0
    iget-object p1, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    invoke-virtual {p1}, Ll/᩷֨֫;->ܽ()I

    move-result p1

    if-le p1, v2, :cond_0

    .line 619
    iget-object p1, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    invoke-virtual {p1}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    goto :goto_0

    .line 621
    :cond_0
    iget-object p1, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    invoke-virtual {p1}, Ll/᩷֨֫;->ܽ()I

    move-result p1

    if-ne p1, v2, :cond_1

    .line 623
    iget-object p1, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    invoke-virtual {p1}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩻ۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    iget-wide v5, p1, Ll/ۚ᩻ۧ;->ܽ:J

    .line 625
    iget v7, p1, Ll/ۚ᩻ۧ;->֫:I

    .line 673
    iget-object v4, p0, Ll/֨᩻ۧ;->֨:Ll/۠ᩴ֫;

    .line 678
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v8

    .line 673
    invoke-virtual/range {v3 .. v8}, Ll/ۤܳۧ;->֫(Ll/۠ᩴ֫;JILjava/util/List;)V

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 628
    iput-wide v0, p0, Ll/֨᩻ۧ;->ۢ:J

    .line 629
    iput-wide v0, p0, Ll/֨᩻ۧ;->ܳ:J

    const/4 p1, 0x0

    .line 630
    iput-boolean p1, p0, Ll/֨᩻ۧ;->ۜ:Z

    .line 633
    iget-object p1, p0, Ll/֨᩻ۧ;->᩻:Ll/᩵ۚ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    new-instance v0, Ll/᩷۠᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public static ֫(Ll/֨᩻ۧ;Ll/۠ᩴ֫;)Z
    .locals 5

    .line 494
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    const-string v0, "Color transfer "

    .line 495
    iget v1, p0, Ll/֨᩻ۧ;->ᩴ:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 496
    iget-object v1, p1, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    if-eqz v1, :cond_1

    .line 665
    invoke-virtual {v1}, Ll/᩷ᩴ֫;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 666
    :cond_1
    sget-object v1, Ll/᩷ᩴ֫;->ۜ:Ll/᩷ᩴ֫;

    .line 501
    :goto_1
    :try_start_0
    iget v2, v1, Ll/᩷ᩴ֫;->ᩳ:I

    const/4 v3, 0x7

    if-ne v2, v3, :cond_3

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-ge v3, v4, :cond_3

    .line 503
    invoke-static {}, Ll/ۘۚ֫;->ۧ()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 508
    :cond_2
    invoke-virtual {v1}, Ll/᩷ᩴ֫;->֫()Ll/ۜᩴ֫;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ll/ۜᩴ֫;->ᩳ(I)V

    invoke-virtual {v0}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v1

    goto :goto_3

    .line 511
    :cond_3
    :goto_2
    invoke-static {v2}, Ll/ۘۚ֫;->֫(I)Z

    move-result v3

    if-nez v3, :cond_4

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_4

    .line 1126
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is not supported. Falling back to OpenGl tone mapping."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 513
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 518
    sget-object v1, Ll/᩷ᩴ֫;->ۜ:Ll/᩷ᩴ֫;
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    :cond_4
    :goto_3
    iget-object p1, p0, Ll/֨᩻ۧ;->֫:Ll/ܽۚ֫;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2}, Ll/ܽۚ֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩻ۧ;->᩻:Ll/᩵ۚ֫;

    .line 528
    iget-object v0, p0, Ll/֨᩻ۧ;->ۚ:Ll/ܳ֡֫;

    iget-object v2, p0, Ll/֨᩻ۧ;->ۧ:Landroid/content/Context;

    .line 534
    new-instance v3, Ll/ۜ᩻ۧ;

    invoke-direct {v3, p1}, Ll/ۜ᩻ۧ;-><init>(Ll/᩵ۚ֫;)V

    .line 529
    invoke-interface {v0, v2, v1, p0, v3}, Ll/ܳ֡֫;->֫(Landroid/content/Context;Ll/᩷ᩴ֫;Ll/֨᩻ۧ;Ll/ۜ᩻ۧ;)Ll/᩻֡֫;

    move-result-object p0

    .line 537
    invoke-interface {p0}, Ll/᩻֡֫;->ۜ()V

    const/4 p0, 0x0

    .line 538
    throw p0

    :catch_0
    move-exception p0

    .line 523
    new-instance v0, Ll/᩻ۜۧ;

    invoke-direct {v0, p0, p1}, Ll/᩻ۜۧ;-><init>(Ljava/lang/Exception;Ll/۠ᩴ֫;)V

    throw v0
.end method

.method public static bridge synthetic ۜ(Ll/֨᩻ۧ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/֨᩻ۧ;->ۜ:Z

    return-void
.end method

.method public static ۡ(Ll/֨᩻ۧ;)Z
    .locals 2

    .line 660
    iget v0, p0, Ll/֨᩻ۧ;->᩵:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget p0, p0, Ll/֨᩻ۧ;->ۘ:I

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۢ(Ll/֨᩻ۧ;)Z
    .locals 1

    .line 596
    iget v0, p0, Ll/֨᩻ۧ;->ܺ:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֨᩻ۧ;->ۜ:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    .line 598
    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0}, Ll/ۤܳۧ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֨᩻ۧ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֨᩻ۧ;->ۢ:J

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֨᩻ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨᩻ۧ;->ܿ:Z

    return p0
.end method

.method public static ۧ(Ll/֨᩻ۧ;Z)Z
    .locals 1

    .line 586
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    if-eqz p1, :cond_0

    iget p0, p0, Ll/֨᩻ۧ;->ܺ:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    check-cast v0, Ll/ۤܳۧ;

    invoke-virtual {v0, p0}, Ll/ۤܳۧ;->֫(Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/֨᩻ۧ;)Ll/᩷֨֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨᩻ۧ;->ۖ:Ll/᩷֨֫;

    return-object p0
.end method

.method public static ܺ(Ll/֨᩻ۧ;)V
    .locals 1

    .line 591
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast v0, Ll/ۤܳۧ;

    invoke-virtual {v0}, Ll/ۤܳۧ;->᩻()V

    const/4 v0, 0x1

    .line 592
    iput-boolean v0, p0, Ll/֨᩻ۧ;->ۜ:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/֨᩻ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֨᩻ۧ;->ܳ:J

    return-wide v0
.end method

.method public static ܽ(Ll/֨᩻ۧ;Z)V
    .locals 0

    .line 637
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0, p1}, Ll/ۤܳۧ;->ܽ(Z)V

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/֨᩻ۧ;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨᩻ۧ;->ۡ:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֨᩻ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֨᩻ۧ;->ۢ:J

    return-wide v0
.end method

.method public static ᩷(Ll/֨᩻ۧ;)V
    .locals 0

    .line 641
    iget-object p0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast p0, Ll/ۤܳۧ;

    invoke-virtual {p0}, Ll/ۤܳۧ;->ۜ()V

    return-void
.end method

.method public static bridge synthetic ᩻()Ll/᩸ܳۧ;
    .locals 1

    .line 0
    sget-object v0, Ll/֨᩻ۧ;->۠:Ll/᩸ܳۧ;

    return-object v0
.end method

.method public static bridge synthetic ᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 363
    sget-object v0, Ll/ܿ֨֫;->ܽ:Ll/ܿ֨֫;

    .line 365
    invoke-virtual {v0}, Ll/ܿ֨֫;->ۧ()I

    move-result v1

    .line 366
    invoke-virtual {v0}, Ll/ܿ֨֫;->֫()I

    move-result v0

    const/4 v2, 0x0

    .line 363
    invoke-direct {p0, v2, v1, v0}, Ll/֨᩻ۧ;->֫(Landroid/view/Surface;II)V

    .line 367
    iput-object v2, p0, Ll/֨᩻ۧ;->ܽ:Landroid/util/Pair;

    return-void
.end method

.method public final ֫(Landroid/view/Surface;Ll/ܿ֨֫;)V
    .locals 1

    .line 351
    iget-object v0, p0, Ll/֨᩻ۧ;->ܽ:Landroid/util/Pair;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    .line 352
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֨᩻ۧ;->ܽ:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ll/ܿ֨֫;

    .line 353
    invoke-virtual {v0, p2}, Ll/ܿ֨֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 356
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩻ۧ;->ܽ:Landroid/util/Pair;

    .line 358
    invoke-virtual {p2}, Ll/ܿ֨֫;->ۧ()I

    move-result v0

    invoke-virtual {p2}, Ll/ܿ֨֫;->֫()I

    move-result p2

    .line 357
    invoke-direct {p0, p1, v0, p2}, Ll/֨᩻ۧ;->֫(Landroid/view/Surface;II)V

    return-void
.end method

.method public final ۧ()Ll/ۜۜۧ;
    .locals 4

    .line 338
    iget-object v0, p0, Ll/֨᩻ۧ;->᩷:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 339
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۜۧ;

    return-object v0

    .line 341
    :cond_0
    new-instance v2, Ll/ۖ᩻ۧ;

    iget-object v3, p0, Ll/֨᩻ۧ;->ۧ:Landroid/content/Context;

    invoke-direct {v2, p0, v3}, Ll/ۖ᩻ۧ;-><init>(Ll/֨᩻ۧ;Landroid/content/Context;)V

    .line 315
    iget-object v3, p0, Ll/֨᩻ۧ;->ۡ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 345
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public final ܳ()V
    .locals 1

    .line 377
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast v0, Ll/ۤܳۧ;

    invoke-virtual {v0}, Ll/ۤܳۧ;->᩷()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 407
    iget v0, p0, Ll/֨᩻ۧ;->ᩴ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    .line 410
    :cond_0
    iget-object v0, p0, Ll/֨᩻ۧ;->᩻:Ll/᩵ۚ֫;

    if-eqz v0, :cond_1

    .line 411
    invoke-interface {v0}, Ll/᩵ۚ֫;->ۧ()V

    :cond_1
    const/4 v0, 0x0

    .line 416
    iput-object v0, p0, Ll/֨᩻ۧ;->ܽ:Landroid/util/Pair;

    .line 417
    iput v1, p0, Ll/֨᩻ۧ;->ᩴ:I

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 372
    iget-object v0, p0, Ll/֨᩻ۧ;->ᩳ:Ll/ۜۜۧ;

    check-cast v0, Ll/ۤܳۧ;

    invoke-virtual {v0}, Ll/ۤܳۧ;->ۢ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 328
    iput v0, p0, Ll/֨᩻ۧ;->᩵:I

    return-void
.end method
