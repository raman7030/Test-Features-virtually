.class public Ll/ۘ᩶ۜ;
.super Landroid/app/Service;
.source "Q8UX"


# static fields
.field public static final synthetic ۗ:I

.field public static ۤ:Ljava/lang/ref/WeakReference;

.field public static final ۫:Landroid/app/NotificationManager;

.field public static final ۬:Landroid/os/Handler;


# instance fields
.field public ۙ:J

.field public ᩶:Ll/۫᩶;

.field public ᩸:Ll/᩻ۧ;

.field public ᩹:Landroid/content/BroadcastReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "notification"

    .line 209
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 43
    check-cast v0, Landroid/app/NotificationManager;

    sput-object v0, Ll/ۘ᩶ۜ;->۫:Landroid/app/NotificationManager;

    .line 48
    new-instance v0, Ll/ۡ᩶ۜ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ۘ᩶ۜ;->۬:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private ֫(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .line 186
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۘ᩶ۜ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 187
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "playbackSessionId"

    iget-wide v1, p0, Ll/ۘ᩶ۜ;->ۙ:J

    .line 188
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x0

    const/high16 v1, 0xc000000

    .line 189
    invoke-static {p0, v0, p1, v1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public static bridge synthetic ֫()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 0
    sget-object v0, Ll/ۘ᩶ۜ;->ۤ:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public static ֫(Ll/ۘ᩶ۜ;)V
    .locals 1

    .line 111
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘ᩶ۜ;->֫(Ll/ۜ᩶ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩶:Ll/۫᩶;

    invoke-direct {p0}, Ll/ۘ᩶ۜ;->ۧ()Landroid/app/Notification;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/۫᩶;->֫(Landroid/app/Notification;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘ᩶ۜ;Ll/ۜ᩶ۜ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۘ᩶ۜ;->֫(Ll/ۜ᩶ۜ;)Z

    move-result p0

    return p0
.end method

.method private ֫(Ll/ۜ᩶ۜ;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 118
    iget-boolean v0, p1, Ll/ۜ᩶ۜ;->᩻:Z

    if-eqz v0, :cond_0

    iget-wide v0, p1, Ll/ۜ᩶ۜ;->ۜ:J

    iget-wide v2, p0, Ll/ۘ᩶ۜ;->ۙ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ()Landroid/app/Notification;
    .locals 16

    move-object/from16 v0, p0

    .line 126
    sget-object v1, Ll/᩷᩶ۜ;->ۚ:Ll/ۚۡ֫;

    invoke-virtual {v1}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 127
    sget-object v2, Ll/᩷᩶ۜ;->᩷:Ll/ۚۡ֫;

    invoke-virtual {v2}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 128
    sget-object v3, Ll/᩷᩶ۜ;->ۜ:Ll/ۚۡ֫;

    invoke-virtual {v3}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    .line 129
    sget-object v4, Ll/᩷᩶ۜ;->ۘ:Ll/ۚۡ֫;

    invoke-virtual {v4}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    .line 130
    sget-object v5, Ll/᩷᩶ۜ;->᩵:Ll/ۚۡ֫;

    invoke-virtual {v5}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 131
    sget-object v6, Ll/᩷᩶ۜ;->ᩴ:Ll/ۚۡ֫;

    invoke-virtual {v6}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    mul-int/lit8 v6, v6, 0x32

    int-to-long v6, v6

    .line 132
    sget-object v8, Ll/᩷᩶ۜ;->ۡ:Ll/ۚۡ֫;

    invoke-virtual {v8}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    mul-int/lit8 v8, v8, 0x32

    int-to-long v11, v8

    .line 133
    sget-object v8, Ll/᩷᩶ۜ;->֡:Ll/ۚۡ֫;

    invoke-virtual {v8}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v10, 0x1

    if-ne v8, v9, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x2

    const/4 v13, 0x3

    if-eq v5, v10, :cond_3

    if-eq v5, v9, :cond_2

    if-eq v5, v13, :cond_1

    const v5, 0x7f080284

    goto :goto_1

    :cond_1
    const v5, 0x7f080280

    goto :goto_1

    :cond_2
    const v5, 0x7f080286

    goto :goto_1

    :cond_3
    const v5, 0x7f080285

    :goto_1
    const/4 v9, 0x0

    if-eqz v3, :cond_4

    .line 143
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v9

    :goto_2
    if-eqz v4, :cond_5

    .line 144
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, v9

    .line 145
    :goto_3
    iget-object v9, v0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    new-instance v10, Ll/֫֫;

    invoke-direct {v10}, Ll/֫֫;-><init>()V

    const-string v13, "android.media.metadata.TITLE"

    .line 146
    invoke-virtual {v10, v13, v1}, Ll/֫֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v13, "android.media.metadata.ARTIST"

    .line 147
    invoke-virtual {v10, v13, v2}, Ll/֫֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-virtual {v10, v6, v7}, Ll/֫֫;->֫(J)V

    const-string v6, "android.media.metadata.ART"

    .line 149
    invoke-virtual {v10, v6, v3}, Ll/֫֫;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    const-string v3, "android.media.metadata.DISPLAY_ICON"

    .line 150
    invoke-virtual {v10, v3, v4}, Ll/֫֫;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 151
    invoke-virtual {v10}, Ll/֫֫;->֫()Ll/ۧ֫;

    move-result-object v3

    .line 145
    invoke-virtual {v9, v3}, Ll/᩻ۧ;->֫(Ll/ۧ֫;)V

    .line 152
    iget-object v3, v0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    new-instance v6, Ll/ۖۧ;

    invoke-direct {v6}, Ll/ۖۧ;-><init>()V

    if-eqz v8, :cond_6

    const/4 v7, 0x3

    const/4 v10, 0x3

    goto :goto_4

    :cond_6
    const/4 v7, 0x2

    const/4 v10, 0x2

    :goto_4
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1181
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v14

    const/4 v9, 0x1

    const/4 v7, 0x1

    move-object v9, v6

    invoke-virtual/range {v9 .. v15}, Ll/ۖۧ;->֫(IJFJ)V

    .line 154
    invoke-virtual {v6}, Ll/ۖۧ;->ۧ()V

    .line 160
    invoke-virtual {v6}, Ll/ۖۧ;->֫()Ll/᩵ۧ;

    move-result-object v6

    .line 152
    invoke-virtual {v3, v6}, Ll/᩻ۧ;->֫(Ll/᩵ۧ;)V

    .line 162
    new-instance v3, Landroid/content/Intent;

    const-class v6, Ll/ۢ᩶ۜ;

    invoke-direct {v3, v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "fromService"

    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v3

    .line 164
    new-instance v6, Ll/᩷᩶;

    const-string v9, "MusicPlayerService"

    invoke-direct {v6, v0, v9}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 165
    invoke-virtual {v6}, Ll/᩷᩶;->ܳ()V

    .line 166
    invoke-virtual {v6, v1}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v6, v2}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    .line 168
    invoke-virtual {v6, v4}, Ll/᩷᩶;->֫(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    .line 169
    invoke-virtual {v6, v1}, Ll/᩷᩶;->֫(Z)V

    .line 170
    invoke-virtual {v6}, Ll/᩷᩶;->ܽ()V

    .line 171
    invoke-virtual {v6}, Ll/᩷᩶;->ܿ()V

    .line 172
    invoke-virtual {v6}, Ll/᩷᩶;->᩻()V

    const/high16 v2, 0xc000000

    .line 173
    invoke-static {v0, v1, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v6, v1}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    const-string v1, "bin.mt.media.MusicPlayerService.ACTION_MODE"

    .line 174
    invoke-direct {v0, v1}, Ll/ۘ᩶ۜ;->֫(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "mode"

    invoke-virtual {v6, v5, v2, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    const-string v1, "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"

    .line 175
    invoke-direct {v0, v1}, Ll/ۘ᩶ۜ;->֫(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x7f080283

    const-string v3, "Previous"

    invoke-virtual {v6, v2, v3, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    if-eqz v8, :cond_7

    const v1, 0x7f08027e

    goto :goto_5

    :cond_7
    const v1, 0x7f08027f

    :goto_5
    if-eqz v8, :cond_8

    const-string v2, "Pause"

    goto :goto_6

    :cond_8
    const-string v2, "Play"

    :goto_6
    const-string v3, "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"

    .line 176
    invoke-direct {v0, v3}, Ll/ۘ᩶ۜ;->֫(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v6, v1, v2, v3}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    const-string v1, "bin.mt.media.MusicPlayerService.ACTION_NEXT"

    .line 177
    invoke-direct {v0, v1}, Ll/ۘ᩶ۜ;->֫(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x7f08027d

    const-string v3, "Next"

    invoke-virtual {v6, v2, v3, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    const-string v1, "bin.mt.media.MusicPlayerService.ACTION_EXIT"

    .line 178
    invoke-direct {v0, v1}, Ll/ۘ᩶ۜ;->֫(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x7f08027a

    const-string v3, "Expand"

    invoke-virtual {v6, v2, v3, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    new-instance v1, Ll/۫ۘ֫;

    invoke-direct {v1}, Ll/۫ۘ֫;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x3

    filled-new-array {v7, v2, v3}, [I

    move-result-object v2

    .line 180
    invoke-virtual {v1, v2}, Ll/۫ۘ֫;->֫([I)V

    iget-object v2, v0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    .line 181
    invoke-virtual {v2}, Ll/᩻ۧ;->֫()Ll/ܳۧ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫ۘ֫;->֫(Ll/ܳۧ;)V

    .line 179
    invoke-virtual {v6, v1}, Ll/᩷᩶;->֫(Ll/ۡ᩶;)V

    .line 182
    invoke-virtual {v6}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v1

    return-object v1
.end method

.method public static ܽ()V
    .locals 4

    .line 101
    sget-object v0, Ll/ۘ᩶ۜ;->ۤ:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩶ۜ;

    :goto_0
    if-eqz v0, :cond_1

    .line 103
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۘ᩶ۜ;->֫(Ll/ۜ᩶ۜ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    sget-object v0, Ll/ۘ᩶ۜ;->۬:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_1

    const-wide/16 v2, 0x64

    .line 105
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 4

    .line 68
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 69
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/ۘ᩶ۜ;->ۤ:Ljava/lang/ref/WeakReference;

    .line 70
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    iget-boolean v1, v0, Ll/ۜ᩶ۜ;->᩻:Z

    if-eqz v1, :cond_0

    .line 72
    iget-wide v0, v0, Ll/ۜ᩶ۜ;->ۜ:J

    iput-wide v0, p0, Ll/ۘ᩶ۜ;->ۙ:J

    .line 74
    :cond_0
    invoke-static {p0}, Ll/۫᩶;->֫(Landroid/content/Context;)Ll/۫᩶;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩶ۜ;->᩶:Ll/۫᩶;

    .line 75
    new-instance v0, Ll/᩻ۧ;

    invoke-direct {v0, p0}, Ll/᩻ۧ;-><init>(Ll/ۘ᩶ۜ;)V

    iput-object v0, p0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    .line 76
    new-instance v1, Ll/ۖ᩶ۜ;

    invoke-direct {v1, p0}, Ll/ۖ᩶ۜ;-><init>(Ll/ۘ᩶ۜ;)V

    const/4 v2, 0x0

    .line 591
    invoke-virtual {v0, v1, v2}, Ll/᩻ۧ;->֫(Ll/ۙ֫;Landroid/os/Handler;)V

    .line 77
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩻ۧ;->֫(Z)V

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 79
    new-instance v0, Landroid/app/NotificationChannel;

    const v0, 0x7f1206a0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    const-string v2, "MusicPlayerService"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 80
    sget-object v0, Ll/ۘ᩶ۜ;->۫:Landroid/app/NotificationManager;

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_1
    const/16 v0, 0x3ee

    .line 82
    invoke-direct {p0}, Ll/ۘ᩶ۜ;->ۧ()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 85
    new-instance v0, Ll/ܺ᩶ۜ;

    invoke-direct {v0, p0}, Ll/ܺ᩶ۜ;-><init>(Ll/ۘ᩶ۜ;)V

    iput-object v0, p0, Ll/ۘ᩶ۜ;->᩹:Landroid/content/BroadcastReceiver;

    .line 96
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.AUDIO_BECOMING_NOISY"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 97
    iget-object v1, p0, Ll/ۘ᩶ۜ;->᩹:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final onDestroy()V
    .locals 7

    .line 244
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 245
    sget-object v0, Ll/ۘ᩶ۜ;->۬:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 246
    sget-object v0, Ll/ۘ᩶ۜ;->ۤ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 247
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 249
    sput-object v0, Ll/ۘ᩶ۜ;->ۤ:Ljava/lang/ref/WeakReference;

    .line 251
    :cond_0
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    invoke-virtual {v0, v1}, Ll/᩻ۧ;->֫(Z)V

    .line 252
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩸:Ll/᩻ۧ;

    invoke-virtual {v0}, Ll/᩻ۧ;->ۧ()V

    .line 254
    invoke-static {}, Ll/᩸᩶ۜ;->֫()V

    .line 255
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 256
    iget-wide v2, v0, Ll/ۜ᩶ۜ;->ۜ:J

    iget-wide v4, p0, Ll/ۘ᩶ۜ;->ۙ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 257
    invoke-virtual {v0, v1}, Ll/ۜ᩶ۜ;->֫(Z)V

    .line 258
    invoke-static {v0}, Ll/᩷᩶ۜ;->֫(Ll/ۜ᩶ۜ;)V

    .line 260
    :cond_1
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(Z)V

    .line 261
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩶:Ll/۫᩶;

    invoke-virtual {v0}, Ll/۫᩶;->ۧ()V

    .line 262
    iget-object v0, p0, Ll/ۘ᩶ۜ;->᩹:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_2
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 207
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object p2

    .line 208
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    const-string v0, "playbackSessionId"

    const-wide/16 v1, 0x0

    .line 209
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    const/4 p1, 0x2

    if-nez p3, :cond_2

    cmp-long p3, v3, v1

    if-eqz p3, :cond_0

    if-eqz p2, :cond_0

    .line 211
    iget-boolean p3, p2, Ll/ۜ᩶ۜ;->᩻:Z

    if-eqz p3, :cond_0

    iget-wide v0, p2, Ll/ۜ᩶ۜ;->ۜ:J

    cmp-long p3, v0, v3

    if-nez p3, :cond_0

    .line 213
    iput-wide v3, p0, Ll/ۘ᩶ۜ;->ۙ:J

    .line 111
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ۘ᩶ۜ;->֫(Ll/ۜ᩶ۜ;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 112
    iget-object p2, p0, Ll/ۘ᩶ۜ;->᩶:Ll/۫᩶;

    invoke-direct {p0}, Ll/ۘ᩶ۜ;->ۧ()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/۫᩶;->֫(Landroid/app/Notification;)V

    return p1

    :cond_0
    if-eqz p2, :cond_1

    .line 215
    iget-boolean p2, p2, Ll/ۜ᩶ۜ;->᩻:Z

    if-nez p2, :cond_b

    .line 217
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p1

    .line 221
    :cond_2
    invoke-direct {p0, p2}, Ll/ۘ᩶ۜ;->֫(Ll/ۜ᩶ۜ;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p2, :cond_3

    .line 222
    iget-boolean p2, p2, Ll/ۜ᩶ۜ;->᩻:Z

    if-nez p2, :cond_b

    .line 224
    :cond_3
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p1

    :cond_4
    cmp-long v0, v3, v1

    if-eqz v0, :cond_b

    .line 228
    iget-wide v0, p0, Ll/ۘ᩶ۜ;->ۙ:J

    cmp-long v2, v3, v0

    if-eqz v2, :cond_5

    goto :goto_1

    .line 232
    :cond_5
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "bin.mt.media.MusicPlayerService.ACTION_PREVIOUS"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "bin.mt.media.MusicPlayerService.ACTION_PLAY_OR_PAUSE"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "bin.mt.media.MusicPlayerService.ACTION_NEXT"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "bin.mt.media.MusicPlayerService.ACTION_MODE"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "bin.mt.media.MusicPlayerService.ACTION_EXIT"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 236
    :pswitch_0
    invoke-virtual {p2}, Ll/ۜ᩶ۜ;->ܳ()V

    return p1

    .line 234
    :pswitch_1
    invoke-virtual {p2}, Ll/ۜ᩶ۜ;->ܽ()V

    return p1

    .line 235
    :pswitch_2
    invoke-virtual {p2}, Ll/ۜ᩶ۜ;->ܿ()V

    return p1

    .line 233
    :pswitch_3
    invoke-static {}, Ll/ᩳ᩹ۜ;->ۖ()I

    return p1

    .line 237
    :pswitch_4
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_b
    :goto_1
    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5f7a260e -> :sswitch_4
        -0x5f76a589 -> :sswitch_3
        -0x5f765439 -> :sswitch_2
        0x145f2d1 -> :sswitch_1
        0x7f649cb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
