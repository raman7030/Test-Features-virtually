.class public abstract Ll/᩸ܽܿ;
.super Ljava/lang/Object;
.source "K7TM"


# instance fields
.field public ֫:Ll/۫ۨᩳ;

.field public final ۧ:Ljava/util/concurrent/Executor;

.field public final ܳ:Ll/ᩳᩳܿ;

.field public ܽ:I

.field public final ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ᩳ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9a

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 83
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Ll/᩸ܽܿ;->ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 89
    iput-object v0, p0, Ll/᩸ܽܿ;->ۧ:Ljava/util/concurrent/Executor;

    .line 90
    new-instance v0, Ll/ᩳᩳܿ;

    const/16 v1, 0xf0

    invoke-direct {v0, p1, v1}, Ll/ᩳᩳܿ;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    .line 92
    new-instance p1, Ll/֡ܽܿ;

    invoke-direct {p1, p0}, Ll/֡ܽܿ;-><init>(Ll/᩸ܽܿ;)V

    invoke-virtual {v0, p1}, Ll/ᩳᩳܿ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 96
    new-instance p1, Ll/ۚܽܿ;

    invoke-direct {p1, p0}, Ll/ۚܽܿ;-><init>(Ll/᩸ܽܿ;)V

    invoke-virtual {v0, p1}, Ll/ᩳᩳܿ;->֫(Ll/ۚܽܿ;)V

    .line 99
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܿ()V

    return-void
.end method

.method private ֫(Ljava/lang/CharSequence;IIZ)V
    .locals 1

    .line 286
    iget-object v0, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p4, :cond_1

    .line 290
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܳܽ()Z

    move-result p4

    if-nez p4, :cond_1

    .line 291
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    return-void

    .line 365
    :cond_1
    instance-of p4, p1, Ll/᩶᩸ᩳ;

    if-eqz p4, :cond_2

    move-object p4, p1

    check-cast p4, Ll/᩶᩸ᩳ;

    invoke-interface {p4}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p4

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    :goto_0
    if-nez p4, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, p4

    .line 366
    :goto_1
    :try_start_0
    invoke-virtual {p0, p2, p1}, Ll/᩸ܽܿ;->֫(ILjava/lang/CharSequence;)Ll/ܶܽܿ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p4, :cond_4

    .line 367
    invoke-virtual {p4}, Ll/۟᩸ᩳ;->close()V

    :cond_4
    if-eqz p1, :cond_7

    .line 382
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_7

    if-ltz p3, :cond_5

    .line 383
    invoke-virtual {p1}, Ll/ܶܽܿ;->ܽ()I

    move-result p4

    if-ge p3, p4, :cond_5

    goto :goto_3

    .line 387
    :cond_5
    sget-object p3, Ll/ۖ۠ۡ;->ܿ:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object p4

    iget p4, p4, Landroid/content/pm/ApplicationInfo;->uid:I

    xor-int/2addr p3, p4

    const p4, -0x720ed8d6

    xor-int/2addr p3, p4

    if-eqz p3, :cond_6

    :goto_2
    return-void

    .line 390
    :cond_6
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܿ()V

    .line 391
    iget-object p3, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {p3, p1}, Ll/ᩳᩳܿ;->֫(Ljava/util/ArrayList;)V

    .line 392
    iget-object p1, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    invoke-virtual {p3, p1, p2}, Ll/ᩳᩳܿ;->֫(Ll/۫ۨᩳ;I)V

    return-void

    .line 384
    :cond_7
    :goto_3
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p4, :cond_8

    .line 365
    :try_start_1
    invoke-virtual {p4}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_4
    throw p1
.end method

.method public static ֫(Ll/᩸ܽܿ;I)V
    .locals 2

    .line 93
    iget-object v0, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    .line 474
    iget-object v1, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {v1, p1}, Ll/ᩳᩳܿ;->֫(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 93
    invoke-virtual {p0, v0, p1}, Ll/᩸ܽܿ;->֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۧ(Ll/᩸ܽܿ;I)Z
    .locals 2

    .line 97
    iget-object v0, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    .line 474
    iget-object v1, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {v1, p1}, Ll/ᩳᩳܿ;->֫(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 97
    invoke-virtual {p0, v0, p1}, Ll/᩸ܽܿ;->ۧ(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 124
    iget v0, p0, Ll/᩸ܽܿ;->ܽ:I

    return v0
.end method

.method public abstract ֫(ILjava/lang/CharSequence;)Ll/ܶܽܿ;
.end method

.method public ֫(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/۫ۨᩳ;)V
    .locals 0

    return-void
.end method

.method public abstract ֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)V
.end method

.method public final native ۧ(Ljava/lang/CharSequence;III)V
.end method

.method public final ۧ(Ll/۫ۨᩳ;)V
    .locals 1

    .line 145
    iput-object p1, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    .line 147
    iget-object v0, p0, Ll/᩸ܽܿ;->ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 148
    invoke-virtual {p0, p1}, Ll/᩸ܽܿ;->֫(Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 5

    .line 168
    iget-object v0, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->ᩳ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "comp_enter_accept"

    const/4 v4, 0x1

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 169
    iget-object v1, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    .line 474
    invoke-virtual {v0, v2}, Ll/ᩳᩳܿ;->֫(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 169
    invoke-virtual {p0, v1, v0}, Ll/᩸ܽܿ;->֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)V

    return v4

    :cond_0
    return v2
.end method

.method public ۧ(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()V
    .locals 1

    .line 454
    iget-object v0, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->֫()V

    return-void
.end method

.method public final ܽ(Ll/۫ۨᩳ;)V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 185
    iput-object p1, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    .line 186
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 108
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "comp_max_lines"

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 109
    iget v1, p0, Ll/᩸ܽܿ;->ᩳ:I

    if-ne v0, v1, :cond_0

    return-void

    .line 112
    :cond_0
    iget-object v1, p0, Ll/᩸ܽܿ;->ܳ:Ll/ᩳᩳܿ;

    invoke-virtual {v1}, Ll/ᩳᩳܿ;->ۧ()I

    move-result v2

    .line 113
    iput v0, p0, Ll/᩸ܽܿ;->ᩳ:I

    mul-int v0, v0, v2

    .line 114
    div-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩸ܽܿ;->ܽ:I

    .line 115
    invoke-virtual {v1, v2}, Ll/ᩳᩳܿ;->ۧ(I)V

    return-void
.end method

.method public final ᩳ()V
    .locals 5

    .line 237
    iget-object v0, p0, Ll/᩸ܽܿ;->֫:Ll/۫ۨᩳ;

    if-nez v0, :cond_0

    return-void

    .line 134
    :cond_0
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v1

    iget-object v2, p0, Ll/᩸ܽܿ;->ܿ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_2

    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "cc"

    const/4 v4, 0x1

    invoke-interface {v1, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 246
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    .line 247
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v3

    if-eq v1, v3, :cond_1

    .line 276
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 251
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    return-void

    .line 254
    :cond_1
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    .line 276
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v2, -0x1

    const/4 v3, 0x0

    .line 254
    invoke-direct {p0, v0, v1, v2, v3}, Ll/᩸ܽܿ;->֫(Ljava/lang/CharSequence;IIZ)V

    return-void

    .line 276
    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 243
    invoke-virtual {p0}, Ll/᩸ܽܿ;->ܽ()V

    return-void
.end method
