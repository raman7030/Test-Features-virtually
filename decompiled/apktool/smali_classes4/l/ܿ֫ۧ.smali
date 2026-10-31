.class public abstract Ll/ܿ֫ۧ;
.super Landroid/app/Service;
.source "88LY"


# static fields
.field public static final ᩹:Ljava/util/HashMap;


# instance fields
.field public ᩸:Ll/ᩳ֫ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 193
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܿ֫ۧ;->᩹:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 719
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final onCreate()V
    .locals 2

    .line 594
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 595
    sget-object v1, Ll/ܿ֫ۧ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ֫ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 603
    invoke-virtual {p0}, Ll/ܿ֫ۧ;->֫()Ll/ۨ۟֫;

    .line 604
    throw v1

    .line 610
    :cond_0
    iput-object v0, p0, Ll/ܿ֫ۧ;->᩸:Ll/ᩳ֫ۧ;

    .line 611
    invoke-virtual {v0, p0}, Ll/ᩳ֫ۧ;->֫(Ll/ܿ֫ۧ;)V

    throw v1
.end method

.method public final onDestroy()V
    .locals 1

    .line 707
    iget-object v0, p0, Ll/ܿ֫ۧ;->᩸:Ll/ᩳ֫ۧ;

    invoke-virtual {v0, p0}, Ll/ᩳ֫ۧ;->ۧ(Ll/ܿ֫ۧ;)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    const-string p2, "androidx.media3.exoplayer.downloadService.action.RESTART"

    const/4 p3, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 621
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content_id"

    .line 622
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "foreground"

    .line 624
    invoke-virtual {p1, v3, p3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v1, v0

    move-object v2, v1

    :cond_1
    :goto_0
    const-string v3, "androidx.media3.exoplayer.downloadService.action.INIT"

    if-nez v1, :cond_2

    move-object v1, v3

    .line 632
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, -0x1

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string p2, "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v5, 0x8

    goto :goto_1

    :sswitch_1
    const-string p2, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, 0x7

    goto :goto_1

    :sswitch_2
    const-string p2, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, 0x6

    goto :goto_1

    :sswitch_3
    const-string p2, "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v5, 0x5

    goto :goto_1

    :sswitch_4
    const-string p2, "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v5, 0x4

    goto :goto_1

    :sswitch_5
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_1

    :cond_8
    const/4 v5, 0x3

    goto :goto_1

    :sswitch_6
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_1

    :cond_9
    const/4 v5, 0x2

    goto :goto_1

    :sswitch_7
    const-string p2, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_1

    :cond_a
    const/4 v5, 0x1

    goto :goto_1

    :sswitch_8
    const-string p2, "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_1

    :cond_b
    const/4 v5, 0x0

    :goto_1
    const-string p2, "stop_reason"

    packed-switch v5, :pswitch_data_0

    const-string p1, "Ignored unrecognized action: "

    .line 683
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 662
    :pswitch_0
    throw v0

    .line 155
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "requirements"

    .line 675
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/᩷֫ۧ;

    if-nez p1, :cond_c

    const-string p1, "Ignored SET_REQUIREMENTS: Missing requirements extra"

    .line 677
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 679
    :cond_c
    throw v0

    .line 155
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "download_request"

    .line 640
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ll/ܽ֫ۧ;

    if-nez v1, :cond_d

    const-string p1, "Ignored ADD_DOWNLOAD: Missing download_request extra"

    .line 642
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 644
    :cond_d
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 645
    throw v0

    .line 656
    :pswitch_3
    throw v0

    .line 659
    :pswitch_4
    throw v0

    :pswitch_5
    if-nez v2, :cond_e

    const-string p1, "Ignored REMOVE_DOWNLOAD: Missing content_id extra"

    .line 650
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 652
    :cond_e
    throw v0

    .line 155
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    invoke-virtual {p1, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string p1, "Ignored SET_STOP_REASON: Missing stop_reason extra"

    .line 666
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    .line 668
    :cond_f
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 669
    throw v0

    .line 693
    :goto_2
    :pswitch_7
    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b47cdc8 -> :sswitch_8
        -0x47112489 -> :sswitch_7
        -0x274df87d -> :sswitch_6
        -0xe367804 -> :sswitch_5
        0x1f2a425 -> :sswitch_4
        0x1bab7dfe -> :sswitch_3
        0x3175ed72 -> :sswitch_2
        0x3267e259 -> :sswitch_1
        0x6815b736 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public abstract ֫()Ll/ۨ۟֫;
.end method
