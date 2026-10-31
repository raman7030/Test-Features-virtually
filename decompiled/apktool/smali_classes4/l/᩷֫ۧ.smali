.class public final Ll/᩷֫ۧ;
.super Ljava/lang/Object;
.source "D8R5"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 268
    new-instance v0, Ll/ۜ֫ۧ;

    .line 269
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 268
    sput-object v0, Ll/᩷֫ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    .line 91
    :cond_0
    iput p1, p0, Ll/᩷֫ۧ;->᩸:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 245
    const-class v2, Ll/᩷֫ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 248
    :cond_1
    check-cast p1, Ll/᩷֫ۧ;

    iget p1, p1, Ll/᩷֫ۧ;->᩸:I

    iget v2, p0, Ll/᩷֫ۧ;->᩸:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 253
    iget v0, p0, Ll/᩷֫ۧ;->᩸:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 265
    iget p2, p0, Ll/᩷֫ۧ;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ֫(Ll/᩻֫ۧ;)I
    .locals 9

    .line 113
    iget v0, p0, Ll/᩷֫ۧ;->᩸:I

    and-int/lit8 v1, v0, 0x1

    const/16 v2, 0x10

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    const-string v1, "connectivity"

    .line 174
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 175
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 177
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 219
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x18

    if-ge v5, v6, :cond_0

    goto :goto_0

    .line 223
    :cond_0
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 231
    :cond_1
    :try_start_0
    invoke-virtual {v1, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 233
    invoke-virtual {v5, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_2

    goto :goto_0

    :catch_0
    nop

    :goto_0
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_3

    .line 182
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    goto :goto_2

    :cond_2
    :goto_1
    and-int/lit8 v1, v0, 0x3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    and-int/lit8 v5, v0, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    .line 191
    new-instance v5, Landroid/content/IntentFilter;

    const-string v7, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v5, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 192
    invoke-virtual {p1, v6, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v7, "status"

    const/4 v8, -0x1

    .line 197
    invoke-virtual {v5, v7, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    if-eq v5, v3, :cond_6

    const/4 v3, 0x5

    if-ne v5, v3, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    or-int/lit8 v1, v1, 0x8

    :cond_6
    :goto_4
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_9

    const-string v3, "power"

    .line 204
    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    check-cast v3, Landroid/os/PowerManager;

    .line 205
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-lt v5, v7, :cond_7

    invoke-virtual {v3}, Landroid/os/PowerManager;->isDeviceIdleMode()Z

    move-result v3

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Landroid/os/PowerManager;->isInteractive()Z

    move-result v3

    if-nez v3, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    :goto_5
    if-nez v3, :cond_9

    or-int/lit8 v1, v1, 0x4

    :cond_9
    and-int/2addr v0, v2

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_c

    .line 209
    new-instance v0, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.DEVICE_STORAGE_LOW"

    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v6, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    if-nez p1, :cond_b

    const/4 v4, 0x1

    :cond_b
    if-nez v4, :cond_c

    or-int/lit8 v1, v1, 0x10

    :cond_c
    return v1
.end method
