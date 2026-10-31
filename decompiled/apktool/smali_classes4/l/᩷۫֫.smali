.class public final Ll/᩷۫֫;
.super Ljava/lang/Object;
.source "O8SZ"


# instance fields
.field public ֫:Ll/ᩳᩴ֫;

.field public final ۜ:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

.field public ۢ:Ll/ۢ۫֫;

.field public ۧ:Ll/ᩳ۫֫;

.field public final ܳ:Landroid/os/Handler;

.field public final ܽ:Ll/ܳ۫֫;

.field public final ܿ:Ll/᩻۫֫;

.field public final ᩳ:Landroid/content/Context;

.field public ᩷:Z

.field public final ᩻:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 104
    iput-object p1, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    .line 105
    iput-object p2, p0, Ll/᩷۫֫;->ۜ:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    .line 106
    iput-object p3, p0, Ll/᩷۫֫;->֫:Ll/ᩳᩴ֫;

    .line 107
    iput-object p4, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    .line 108
    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 903
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 904
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    .line 783
    :goto_0
    new-instance p3, Landroid/os/Handler;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 108
    iput-object p3, p0, Ll/᩷۫֫;->ܳ:Landroid/os/Handler;

    .line 109
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_1

    new-instance p2, Ll/ܳ۫֫;

    invoke-direct {p2, p0}, Ll/ܳ۫֫;-><init>(Ll/᩷۫֫;)V

    goto :goto_1

    :cond_1
    move-object p2, p4

    :goto_1
    iput-object p2, p0, Ll/᩷۫֫;->ܽ:Ll/ܳ۫֫;

    .line 110
    new-instance p2, Ll/ۜ۫֫;

    invoke-direct {p2, p0}, Ll/ۜ۫֫;-><init>(Ll/᩷۫֫;)V

    iput-object p2, p0, Ll/᩷۫֫;->᩻:Landroid/content/BroadcastReceiver;

    .line 111
    sget-object p2, Ll/ᩳ۫֫;->ᩳ:Ll/ᩳ۫֫;

    .line 374
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "Amazon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Xiaomi"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, p4

    goto :goto_3

    :cond_3
    :goto_2
    const-string p2, "external_surround_sound_enabled"

    .line 217
    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_3
    if-eqz p2, :cond_4

    .line 114
    new-instance p4, Ll/᩻۫֫;

    .line 115
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p4, p0, p3, p1, p2}, Ll/᩻۫֫;-><init>(Ll/᩷۫֫;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 116
    :cond_4
    iput-object p4, p0, Ll/᩷۫֫;->ܿ:Ll/᩻۫֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷۫֫;)Ll/ᩳᩴ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۫֫;->֫:Ll/ᩳᩴ֫;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩷۫֫;Ll/ᩳ۫֫;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷۫֫;->ۧ(Ll/ᩳ۫֫;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩷۫֫;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    return-object p0
.end method

.method private ۧ(Ll/ᩳ۫֫;)V
    .locals 1

    .line 208
    iget-boolean v0, p0, Ll/᩷۫֫;->᩷:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷۫֫;->ۧ:Ll/ᩳ۫֫;

    invoke-virtual {p1, v0}, Ll/ᩳ۫֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 209
    iput-object p1, p0, Ll/᩷۫֫;->ۧ:Ll/ᩳ۫֫;

    .line 210
    iget-object v0, p0, Ll/᩷۫֫;->ۜ:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    iget-object v0, v0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Object;

    check-cast v0, Ll/۠ۤ֫;

    invoke-virtual {v0, p1}, Ll/۠ۤ֫;->֫(Ll/ᩳ۫֫;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩷۫֫;)Ll/ۢ۫֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩷۫֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ᩳ۫֫;
    .locals 5

    .line 166
    iget-boolean v0, p0, Ll/᩷۫֫;->᩷:Z

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Ll/᩷۫֫;->ۧ:Ll/ᩳ۫֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_0
    const/4 v0, 0x1

    .line 169
    iput-boolean v0, p0, Ll/᩷۫֫;->᩷:Z

    .line 170
    iget-object v0, p0, Ll/᩷۫֫;->ܿ:Ll/᩻۫֫;

    if-eqz v0, :cond_1

    .line 171
    invoke-virtual {v0}, Ll/᩻۫֫;->֫()V

    .line 173
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    iget-object v2, p0, Ll/᩷۫֫;->ܳ:Landroid/os/Handler;

    iget-object v3, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Ll/᩷۫֫;->ܽ:Ll/ܳ۫֫;

    if-eqz v0, :cond_2

    .line 174
    invoke-static {v3, v0, v2}, Ll/ܿ۫֫;->֫(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 176
    :cond_2
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 177
    iget-object v4, p0, Ll/᩷۫֫;->᩻:Landroid/content/BroadcastReceiver;

    invoke-virtual {v3, v4, v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    move-result-object v0

    .line 182
    iget-object v1, p0, Ll/᩷۫֫;->֫:Ll/ᩳᩴ֫;

    iget-object v2, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    .line 183
    invoke-static {v3, v0, v1, v2}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Landroid/content/Intent;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object v0

    iput-object v0, p0, Ll/᩷۫֫;->ۧ:Ll/ᩳ۫֫;

    return-object v0
.end method

.method public final ֫(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 149
    iget-object v0, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ll/ۢ۫֫;->֫:Landroid/media/AudioDeviceInfo;

    .line 148
    :goto_0
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 152
    new-instance v1, Ll/ۢ۫֫;

    invoke-direct {v1, p1}, Ll/ۢ۫֫;-><init>(Landroid/media/AudioDeviceInfo;)V

    :cond_2
    iput-object v1, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    .line 153
    iget-object p1, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    iget-object v0, p0, Ll/᩷۫֫;->֫:Ll/ᩳᩴ֫;

    .line 154
    invoke-static {p1, v0, v1}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object p1

    .line 153
    invoke-direct {p0, p1}, Ll/᩷۫֫;->ۧ(Ll/ᩳ۫֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ۫֫;)V
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Ll/᩷۫֫;->ۧ(Ll/ᩳ۫֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩳᩴ֫;)V
    .locals 2

    .line 135
    iput-object p1, p0, Ll/᩷۫֫;->֫:Ll/ᩳᩴ֫;

    .line 136
    iget-object v0, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    iget-object v1, p0, Ll/᩷۫֫;->ۢ:Ll/ۢ۫֫;

    .line 137
    invoke-static {v0, p1, v1}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object p1

    .line 136
    invoke-direct {p0, p1}, Ll/᩷۫֫;->ۧ(Ll/ᩳ۫֫;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 193
    iget-boolean v0, p0, Ll/᩷۫֫;->᩷:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Ll/᩷۫֫;->ۧ:Ll/ᩳ۫֫;

    .line 197
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    iget-object v2, p0, Ll/᩷۫֫;->ᩳ:Landroid/content/Context;

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Ll/᩷۫֫;->ܽ:Ll/ܳ۫֫;

    if-eqz v0, :cond_1

    .line 198
    invoke-static {v2, v0}, Ll/ܿ۫֫;->֫(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V

    .line 200
    :cond_1
    iget-object v0, p0, Ll/᩷۫֫;->᩻:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 201
    iget-object v0, p0, Ll/᩷۫֫;->ܿ:Ll/᩻۫֫;

    if-eqz v0, :cond_2

    .line 202
    invoke-virtual {v0}, Ll/᩻۫֫;->ۧ()V

    :cond_2
    const/4 v0, 0x0

    .line 204
    iput-boolean v0, p0, Ll/᩷۫֫;->᩷:Z

    return-void
.end method
