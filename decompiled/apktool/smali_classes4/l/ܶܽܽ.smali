.class public final Ll/ܶܽܽ;
.super Ljava/lang/Thread;
.source "EAQ7"


# static fields
.field public static final ۛ:Ll/᩶۫᩷;

.field public static final ۤ:Ll/᩶۫᩷;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ll/᩶۫᩷;

.field public final ۫:I

.field public volatile ۬:Z

.field public ᩶:Z

.field public ᩸:Ll/᩶۫᩷;

.field public volatile ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܶܽܽ;->ۤ:Ll/᩶۫᩷;

    .line 63
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܶܽܽ;->ۛ:Ll/᩶۫᩷;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 88
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 65
    sget-object v0, Ll/ܶܽܽ;->ۤ:Ll/᩶۫᩷;

    iput-object v0, p0, Ll/ܶܽܽ;->᩸:Ll/᩶۫᩷;

    .line 66
    sget-object v0, Ll/ܶܽܽ;->ۛ:Ll/᩶۫᩷;

    iput-object v0, p0, Ll/ܶܽܽ;->ۙ:Ll/᩶۫᩷;

    const-string v0, ""

    .line 70
    iput-object v0, p0, Ll/ܶܽܽ;->ۗ:Ljava/lang/String;

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Ll/ܶܽܽ;->᩶:Z

    const/4 v1, 0x0

    .line 201
    iput-boolean v1, p0, Ll/ܶܽܽ;->᩹:Z

    .line 202
    iput-boolean v0, p0, Ll/ܶܽܽ;->۬:Z

    const/16 v0, 0x3a98

    .line 89
    iput v0, p0, Ll/ܶܽܽ;->۫:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܶܽܽ;)V
    .locals 1

    const/4 v0, 0x1

    .line 208
    iput-boolean v0, p0, Ll/ܶܽܽ;->᩹:Z

    .line 209
    iput-boolean v0, p0, Ll/ܶܽܽ;->۬:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const-string v0, "|ANR-WatchDog|"

    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 207
    new-instance v0, Ll/۠ܽܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/۠ܽܽ;-><init>(ILjava/lang/Object;)V

    .line 212
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-nez v1, :cond_8

    .line 85
    invoke-static {}, Ll/ۗۡ֫;->ܿ()Ll/ۗۡ֫;

    move-result-object v1

    .line 265
    invoke-virtual {v1}, Ll/ۗۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v1, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v1

    if-nez v1, :cond_1

    const-wide/16 v1, 0x3e8

    .line 216
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 218
    iget-object v1, p0, Ll/ܶܽܽ;->ۙ:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 223
    iput-boolean v1, p0, Ll/ܶܽܽ;->᩹:Z

    const/4 v2, 0x0

    :goto_2
    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    .line 226
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 229
    :try_start_1
    iget v4, p0, Ll/ܶܽܽ;->۫:I

    div-int/2addr v4, v3

    int-to-long v3, v4

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 234
    iget-boolean v3, p0, Ll/ܶܽܽ;->᩹:Z

    if-nez v3, :cond_0

    .line 85
    invoke-static {}, Ll/ۗۡ֫;->ܿ()Ll/ۗۡ֫;

    move-result-object v3

    .line 265
    invoke-virtual {v3}, Ll/ۗۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v3

    sget-object v4, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v3, v4}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 231
    iget-object v1, p0, Ll/ܶܽܽ;->ۙ:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 238
    :cond_3
    iget-boolean v2, p0, Ll/ܶܽܽ;->۬:Z

    if-eqz v2, :cond_0

    .line 239
    iget-boolean v2, p0, Ll/ܶܽܽ;->᩶:Z

    if-nez v2, :cond_5

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 241
    :cond_4
    iput-boolean v1, p0, Ll/ܶܽܽ;->۬:Z

    goto :goto_0

    .line 244
    :cond_5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    .line 245
    array-length v3, v2

    if-lez v3, :cond_6

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.os.MessageQueue"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 247
    iput-boolean v1, p0, Ll/ܶܽܽ;->۬:Z

    goto/16 :goto_0

    .line 252
    :cond_6
    iget-object v0, p0, Ll/ܶܽܽ;->ۗ:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 253
    iget v1, p0, Ll/ܶܽܽ;->۫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p0}, Ll/֨ܽܽ;->֫(JLjava/lang/String;Ll/ܶܽܽ;)Ll/֨ܽܽ;

    move-result-object v0

    goto :goto_3

    .line 255
    :cond_7
    iget v0, p0, Ll/ܶܽܽ;->۫:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ll/֨ܽܽ;->֫(J)Ll/֨ܽܽ;

    move-result-object v0

    .line 257
    :goto_3
    iget-object v1, p0, Ll/ܶܽܽ;->᩸:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    throw v0

    :cond_8
    return-void
.end method
