.class public final Ll/ۡ᩻ᩳ;
.super Ljava/lang/Object;
.source "T731"

# interfaces
.implements Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;


# static fields
.field public static final ֫:Ll/ۡ᩻ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ll/ۡ᩻ᩳ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    sput-object v0, Ll/ۡ᩻ᩳ;->֫:Ll/ۡ᩻ᩳ;

    return-void
.end method


# virtual methods
.method public final getExtractMemoryUsage()J
    .locals 16

    .line 42
    sget-object v0, Ll/ۙ᩸᩷;->ۧ:Ll/᩶ۡ᩷;

    const-string v1, "activity"

    .line 43
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const-wide/32 v1, 0x10000000

    if-nez v0, :cond_0

    return-wide v1

    .line 47
    :cond_0
    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 48
    invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 49
    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v0

    .line 109
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_1

    .line 110
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    move-result v4

    goto :goto_1

    .line 112
    :cond_1
    invoke-static {}, Lbin/mt/plus/Features;->getABI()Ljava/lang/String;

    move-result-object v4

    const-string v5, "arm64-v8a"

    .line 113
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "x86_64"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v4, 0x1

    .line 60
    :goto_1
    iget-wide v5, v3, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    iget-wide v7, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    iget-wide v9, v3, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    iget-boolean v3, v3, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    const-wide/16 v11, 0x0

    .line 118
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    if-eqz v0, :cond_4

    move-wide v13, v1

    goto :goto_2

    :cond_4
    const-wide/32 v13, 0x8000000

    :goto_2
    cmp-long v15, v7, v9

    if-lez v15, :cond_5

    sub-long/2addr v7, v9

    goto :goto_3

    :cond_5
    move-wide v7, v11

    :goto_3
    cmp-long v9, v7, v13

    if-lez v9, :cond_6

    sub-long v11, v7, v13

    :cond_6
    const-wide/16 v7, 0x8

    .line 78
    div-long v7, v5, v7

    const-wide/32 v9, 0x40000000

    .line 79
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    .line 78
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    const-wide v9, 0x7fffffffffffffffL

    sub-long v13, v9, v7

    cmp-long v15, v11, v13

    if-lez v15, :cond_7

    goto :goto_4

    :cond_7
    add-long v9, v11, v7

    :goto_4
    const-wide v7, 0x90000000L

    const-wide/32 v11, 0x30000000

    if-eqz v0, :cond_8

    const-wide/32 v5, 0x20000000

    goto :goto_5

    :cond_8
    const-wide v13, 0x100000000L

    cmp-long v0, v5, v13

    if-gtz v0, :cond_9

    move-wide v5, v11

    goto :goto_5

    :cond_9
    const-wide v13, 0x180000000L

    cmp-long v0, v5, v13

    if-gtz v0, :cond_a

    const-wide/32 v5, 0x50000000

    goto :goto_5

    :cond_a
    move-wide v5, v7

    :goto_5
    if-eqz v4, :cond_b

    goto :goto_6

    :cond_b
    move-wide v7, v11

    .line 85
    :goto_6
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    if-eqz v3, :cond_c

    .line 88
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :cond_c
    const-wide/32 v0, 0x100000

    .line 133
    div-long/2addr v4, v0

    mul-long v4, v4, v0

    return-wide v4
.end method
