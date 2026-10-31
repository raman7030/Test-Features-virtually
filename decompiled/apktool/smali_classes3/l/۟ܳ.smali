.class public final Ll/۟ܳ;
.super Ljava/lang/Object;
.source "G5FQ"


# static fields
.field public static ᩳ:Ll/۟ܳ;


# instance fields
.field public final ֫:Landroid/content/Context;

.field public final ۧ:Landroid/location/LocationManager;

.field public final ܽ:Ll/ܰܳ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ll/ܰܳ;

    .line 196
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object v0, p0, Ll/۟ܳ;->ܽ:Ll/ܰܳ;

    .line 70
    iput-object p1, p0, Ll/۟ܳ;->֫:Landroid/content/Context;

    .line 71
    iput-object p2, p0, Ll/۟ܳ;->ۧ:Landroid/location/LocationManager;

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/۟ܳ;
    .locals 2

    .line 50
    sget-object v0, Ll/۟ܳ;->ᩳ:Ll/۟ܳ;

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 52
    new-instance v0, Ll/۟ܳ;

    const-string v1, "location"

    .line 53
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    invoke-direct {v0, p0, v1}, Ll/۟ܳ;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v0, Ll/۟ܳ;->ᩳ:Ll/۟ܳ;

    .line 55
    :cond_0
    sget-object p0, Ll/۟ܳ;->ᩳ:Ll/۟ܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 21

    move-object/from16 v0, p0

    .line 144
    iget-object v1, v0, Ll/۟ܳ;->ܽ:Ll/ܰܳ;

    iget-wide v2, v1, Ll/ܰܳ;->ۧ:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 84
    iget-boolean v1, v1, Ll/ܰܳ;->֫:Z

    return v1

    :cond_0
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 110
    iget-object v3, v0, Ll/۟ܳ;->֫:Landroid/content/Context;

    invoke-static {v3, v2}, Ll/۫ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 112
    iget-object v4, v0, Ll/۟ܳ;->ۧ:Landroid/location/LocationManager;

    const/4 v5, 0x0

    if-nez v2, :cond_1

    const-string v2, "network"

    .line 134
    :try_start_0
    invoke-virtual {v4, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 135
    invoke-virtual {v4, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v2, v5

    :goto_0
    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    .line 116
    invoke-static {v3, v6}, Ll/۫ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "gps"

    .line 134
    :try_start_1
    invoke-virtual {v4, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 135
    invoke-virtual {v4, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    if-eqz v2, :cond_3

    .line 124
    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    cmp-long v8, v3, v6

    if-lez v8, :cond_4

    goto :goto_2

    :cond_3
    if-eqz v5, :cond_4

    :goto_2
    move-object v2, v5

    :cond_4
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_a

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 150
    invoke-static {}, Ll/᩺ܳ;->֫()Ll/᩺ܳ;

    move-result-object v14

    const-wide/32 v15, 0x5265c00

    sub-long v10, v12, v15

    .line 154
    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    move-object v5, v14

    .line 153
    invoke-virtual/range {v5 .. v11}, Ll/᩺ܳ;->֫(DDJ)V

    .line 157
    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    move-wide v10, v12

    invoke-virtual/range {v5 .. v11}, Ll/᩺ܳ;->֫(DDJ)V

    .line 158
    iget v5, v14, Ll/᩺ܳ;->֫:I

    if-ne v5, v4, :cond_5

    const/4 v3, 0x1

    .line 159
    :cond_5
    iget-wide v10, v14, Ll/᩺ܳ;->ۧ:J

    .line 160
    iget-wide v8, v14, Ll/᩺ܳ;->ܽ:J

    add-long/2addr v15, v12

    .line 164
    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v17

    move-object v5, v14

    move-wide/from16 v19, v8

    move-wide/from16 v8, v17

    move-wide/from16 v17, v10

    move-wide v10, v15

    .line 163
    invoke-virtual/range {v5 .. v11}, Ll/᩺ܳ;->֫(DDJ)V

    .line 165
    iget-wide v10, v14, Ll/᩺ܳ;->ۧ:J

    const-wide/16 v4, -0x1

    cmp-long v2, v17, v4

    if-eqz v2, :cond_9

    cmp-long v2, v19, v4

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    cmp-long v2, v12, v19

    if-lez v2, :cond_7

    goto :goto_3

    :cond_7
    cmp-long v2, v12, v17

    if-lez v2, :cond_8

    move-wide/from16 v10, v19

    goto :goto_3

    :cond_8
    move-wide/from16 v10, v17

    :goto_3
    const-wide/32 v4, 0xea60

    add-long/2addr v10, v4

    goto :goto_5

    :cond_9
    :goto_4
    const-wide/32 v4, 0x2932e00

    add-long v10, v12, v4

    .line 185
    :goto_5
    iput-boolean v3, v1, Ll/ܰܳ;->֫:Z

    .line 186
    iput-wide v10, v1, Ll/ܰܳ;->ۧ:J

    return v3

    .line 100
    :cond_a
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/16 v2, 0xb

    .line 101
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_c

    const/16 v2, 0x16

    if-lt v1, v2, :cond_b

    goto :goto_6

    :cond_b
    return v3

    :cond_c
    :goto_6
    return v4
.end method
