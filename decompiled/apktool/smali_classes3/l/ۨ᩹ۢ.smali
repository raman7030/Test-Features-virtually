.class public final Ll/ۨ᩹ۢ;
.super Landroid/os/Binder;
.source "J1RW"


# instance fields
.field public ۜ:Z

.field public ۡ:I

.field public ۢ:I

.field public ܳ:Ll/ܿ᩶ۢ;

.field public ܿ:I

.field public final synthetic ᩷:Ll/᩺᩹ۢ;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩺᩹ۢ;)V
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 146
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    const/4 p1, -0x1

    .line 148
    iput p1, p0, Ll/ۨ᩹ۢ;->ܿ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨ᩹ۢ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ۡ()V
    .locals 3

    .line 154
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_0

    return-void

    .line 156
    :cond_0
    iget-boolean v1, p0, Ll/ۨ᩹ۢ;->ۜ:Z

    if-eqz v1, :cond_1

    .line 157
    iget-object v0, v0, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object v0

    .line 158
    iget v1, p0, Ll/ۨ᩹ۢ;->ۢ:I

    iget v2, p0, Ll/ۨ᩹ۢ;->ۡ:I

    invoke-virtual {v0, v1, v2}, Ll/᩸ۚۢ;->֫(II)V

    .line 159
    invoke-virtual {v0}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 161
    :cond_1
    iget-object v0, v0, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method

.method public static ۢ()Ljava/lang/String;
    .locals 3

    .line 383
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "term_start_path"

    const-string v2, "/sdcard"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 384
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 385
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 32
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ۜ()Ljava/io/File;

    move-result-object v1

    const-string v2, "term/home"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 387
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_1

    .line 362
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 364
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿ᩶ۢ;

    iget-object p1, p1, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 297
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩶ۢ;

    .line 298
    invoke-static {v2}, Ll/֡᩸ۢ;->֫(Ll/ܿ᩶ۢ;)V

    goto :goto_0

    .line 300
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 301
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    const/4 v0, 0x0

    .line 302
    iput-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    const/4 v0, -0x1

    .line 303
    iput v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    return-void
.end method

.method public final ֫(IIZ)V
    .locals 0

    .line 176
    iput-boolean p3, p0, Ll/ۨ᩹ۢ;->ۜ:Z

    .line 177
    iput p1, p0, Ll/ۨ᩹ۢ;->ۢ:I

    .line 178
    iput p2, p0, Ll/ۨ᩹ۢ;->ۡ:I

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 2

    if-ltz p1, :cond_0

    .line 368
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 369
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿ᩶ۢ;

    iput-object p2, p1, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eqz v0, :cond_0

    .line 217
    invoke-virtual {v0, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֡᩶ۢ;I)V
    .locals 2

    .line 230
    iget v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    if-eq p2, v0, :cond_1

    if-ltz p2, :cond_1

    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p2, v1, :cond_0

    goto :goto_0

    .line 232
    :cond_0
    iput p2, p0, Ll/ۨ᩹ۢ;->ܿ:I

    .line 233
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿ᩶ۢ;

    iput-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    .line 234
    invoke-virtual {p1, p2}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 235
    invoke-direct {p0}, Ll/ۨ᩹ۢ;->ۡ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/֡᩶ۢ;Z)V
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_0

    .line 199
    invoke-static {}, Ll/ۨ᩹ۢ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Ll/֡᩸ۢ;->֫(Ljava/lang/String;ZZ)Ll/ܿ᩶ۢ;

    move-result-object p2

    iput-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    .line 200
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ۧ(Ll/᩺᩹ۢ;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;I)V

    invoke-virtual {p2, v1}, Ll/ܿ᩶ۢ;->ۧ(I)V

    .line 201
    iget-object p2, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Ll/ۨ᩹ۢ;->ܿ:I

    .line 202
    iget-object v1, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    .line 205
    :cond_0
    iget-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1, p2}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    return-void
.end method

.method public final ֫(Ll/֡᩶ۢ;ZZF)V
    .locals 1

    .line 239
    invoke-static {}, Ll/ۨ᩹ۢ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2, p3}, Ll/֡᩸ۢ;->֫(Ljava/lang/String;ZZ)Ll/ܿ᩶ۢ;

    move-result-object p2

    iput-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    .line 240
    iget-object p3, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {p3}, Ll/᩺᩹ۢ;->ۧ(Ll/᩺᩹ۢ;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p3, v0}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;I)V

    invoke-virtual {p2, v0}, Ll/ܿ᩶ۢ;->ۧ(I)V

    .line 241
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 242
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    iget p2, p2, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float p4, p4, p2

    invoke-virtual {v0, p4}, Ll/ܿ᩶ۢ;->֫(F)V

    .line 244
    iget p2, p0, Ll/ۨ᩹ۢ;->ܿ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/ۨ᩹ۢ;->ܿ:I

    iget-object p4, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, p4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 245
    iget-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1, p2}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 246
    invoke-direct {p0}, Ll/ۨ᩹ۢ;->ۡ()V

    .line 247
    invoke-static {p3}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 4

    .line 316
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "power"

    .line 317
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    .line 318
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":MTermWakeLock"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;Landroid/os/PowerManager$WakeLock;)V

    .line 319
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 321
    :cond_1
    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v1

    if-nez v1, :cond_3

    .line 322
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "wifi"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 323
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":MTermWifiLock"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v1, v3, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;Landroid/net/wifi/WifiManager$WifiLock;)V

    .line 324
    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 326
    :cond_3
    invoke-static {v0}, Ll/ۧ᩹ۡ;->֫(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 327
    invoke-static {v0}, Ll/ۧ᩹ۡ;->ۧ(Landroid/content/Context;)V

    :cond_4
    if-eqz p1, :cond_6

    .line 166
    iget-boolean p1, p0, Ll/ۨ᩹ۢ;->ۜ:Z

    const v1, 0x7f120b7a

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    .line 167
    invoke-static {v1, p1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    .line 168
    iget v1, p0, Ll/ۨ᩹ۢ;->ۢ:I

    iget v2, p0, Ll/ۨ᩹ۢ;->ۡ:I

    invoke-virtual {p1, v1, v2}, Ll/᩸ۚۢ;->֫(II)V

    .line 169
    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_0

    .line 171
    :cond_5
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 331
    :cond_6
    :goto_0
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    return-void
.end method

.method public final ֫(Ll/֡᩶ۢ;)Z
    .locals 4

    .line 262
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 264
    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-static {v0}, Ll/֡᩸ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 267
    :cond_1
    iget v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    iget-object v2, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 268
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    .line 269
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    .line 270
    iput-object p1, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    const/4 p1, -0x1

    .line 271
    iput p1, p0, Ll/ۨ᩹ۢ;->ܿ:I

    return v1

    .line 274
    :cond_2
    iget v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v0, v3, :cond_3

    .line 275
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    .line 276
    :cond_3
    iget v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩶ۢ;

    iput-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    .line 277
    invoke-virtual {p1, v0}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 278
    invoke-direct {p0}, Ll/ۨ᩹ۢ;->ۡ()V

    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()Z
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 4

    .line 284
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩶ۢ;

    .line 285
    iget-object v3, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eq v2, v3, :cond_0

    .line 286
    invoke-static {v2}, Ll/֡᩸ۢ;->֫(Ll/ܿ᩶ۢ;)V

    goto :goto_0

    .line 288
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 289
    iget-object v1, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eqz v1, :cond_2

    .line 290
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 291
    iput v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    .line 293
    :cond_2
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    .line 222
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 224
    iget-object v2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    const/16 v3, 0x7f

    invoke-virtual {v2, v3, v0}, Ll/ܿ᩶ۢ;->֫(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/֡᩶ۢ;Z)V
    .locals 3

    .line 186
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_0

    return-void

    .line 188
    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-static {v0}, Ll/֡᩸ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 190
    :cond_1
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    iget-object v0, v0, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    .line 191
    invoke-static {}, Ll/ۨ᩹ۢ;->ۢ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-virtual {v2}, Ll/ܿ᩶ۢ;->ۖ()Z

    move-result v2

    invoke-static {v1, p2, v2}, Ll/֡᩸ۢ;->֫(Ljava/lang/String;ZZ)Ll/ܿ᩶ۢ;

    move-result-object p2

    iput-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    .line 192
    iput-object v0, p2, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    .line 193
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    iget v1, p0, Ll/ۨ᩹ۢ;->ܿ:I

    invoke-virtual {v0, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 194
    iget-object p2, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1, p2}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 3

    .line 335
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 336
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 337
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 339
    :cond_0
    invoke-static {v0, v2}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;Landroid/os/PowerManager$WakeLock;)V

    .line 341
    :cond_1
    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 342
    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 343
    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 345
    :cond_2
    invoke-static {v0, v2}, Ll/᩺᩹ۢ;->֫(Ll/᩺᩹ۢ;Landroid/net/wifi/WifiManager$WifiLock;)V

    :cond_3
    if-eqz p1, :cond_5

    .line 166
    iget-boolean p1, p0, Ll/ۨ᩹ۢ;->ۜ:Z

    const v1, 0x7f120b79

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    .line 167
    invoke-static {v1, p1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    .line 168
    iget v1, p0, Ll/ۨ᩹ۢ;->ۢ:I

    iget v2, p0, Ll/ۨ᩹ۢ;->ۡ:I

    invoke-virtual {p1, v1, v2}, Ll/᩸ۚۢ;->֫(II)V

    .line 169
    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_0

    .line 171
    :cond_4
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 349
    :cond_5
    :goto_0
    invoke-static {v0}, Ll/᩺᩹ۢ;->ܿ(Ll/᩺᩹ۢ;)V

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ۨ᩹ۢ;->ܳ:Ll/ܿ᩶ۢ;

    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩹ۢ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 378
    iget v0, p0, Ll/ۨ᩹ۢ;->ܿ:I

    return v0
.end method

.method public final ܿ()[Ljava/lang/CharSequence;
    .locals 4

    .line 353
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    .line 354
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 355
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ᩶ۢ;

    .line 356
    iget-object v3, v3, Ll/ܿ᩶ۢ;->֡:Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ᩳ()I
    .locals 1

    .line 374
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩷()V
    .locals 3

    .line 251
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ᩶ۢ;

    if-eqz v1, :cond_0

    .line 252
    invoke-virtual {v1}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 253
    invoke-virtual {v1}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v1

    iget-object v1, v1, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    invoke-virtual {v1}, Ll/ܽ᩹ۢ;->֫()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 307
    iget-object v0, p0, Ll/ۨ᩹ۢ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
