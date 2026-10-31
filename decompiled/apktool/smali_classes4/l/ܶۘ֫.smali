.class public abstract Ll/ܶۘ֫;
.super Landroid/app/Service;
.source "X6AW"


# static fields
.field public static final synthetic ۬:I


# instance fields
.field public final ۗ:Ll/֡ۘ֫;

.field public final ۙ:Ljava/util/ArrayList;

.field public ᩶:Ll/᩺ۖ֫;

.field public final ᩸:Ll/ۖ᩵;

.field public final ᩹:Ll/۠ۘ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "MBServiceCompat"

    const/4 v1, 0x3

    .line 132
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 130
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 181
    new-instance v0, Ll/֡ۘ֫;

    invoke-direct {v0, p0}, Ll/֡ۘ֫;-><init>(Ll/ܶۘ֫;)V

    iput-object v0, p0, Ll/ܶۘ֫;->ۗ:Ll/֡ۘ֫;

    .line 182
    new-instance v1, Ll/ۤۖ֫;

    const/4 v5, -0x1

    const/4 v6, 0x0

    const-string v3, "android.media.session.MediaController"

    const/4 v4, -0x1

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ll/ۤۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶۘ֫;->ۙ:Ljava/util/ArrayList;

    .line 185
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    .line 187
    new-instance v0, Ll/۠ۘ֫;

    invoke-direct {v0, p0}, Ll/۠ۘ֫;-><init>(Ll/ܶۘ֫;)V

    iput-object v0, p0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    return-void
.end method


# virtual methods
.method public final dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1279
    iget-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    .line 313
    iget-object v0, v0, Ll/᩺ۖ֫;->ܽ:Landroid/service/media/MediaBrowserService;

    invoke-virtual {v0, p1}, Landroid/service/media/MediaBrowserService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreate()V
    .locals 2

    .line 1255
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 1256
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 1257
    new-instance v0, Ll/ܿۘ֫;

    .line 659
    invoke-direct {v0, p0}, Ll/ᩳۘ֫;-><init>(Ll/ܶۘ֫;)V

    .line 1257
    iput-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 1259
    new-instance v0, Ll/ᩳۘ֫;

    invoke-direct {v0, p0}, Ll/ᩳۘ֫;-><init>(Ll/ܶۘ֫;)V

    iput-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    goto :goto_0

    :cond_1
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 1261
    new-instance v0, Ll/֫ۘ֫;

    invoke-direct {v0, p0}, Ll/֫ۘ֫;-><init>(Ll/ܶۘ֫;)V

    iput-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    goto :goto_0

    .line 1263
    :cond_2
    new-instance v0, Ll/᩺ۖ֫;

    invoke-direct {v0, p0}, Ll/᩺ۖ֫;-><init>(Ll/ܶۘ֫;)V

    iput-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    .line 1267
    :goto_0
    iget-object v0, p0, Ll/ܶۘ֫;->᩶:Ll/᩺ۖ֫;

    invoke-interface {v0}, Ll/ۛۖ֫;->onCreate()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1274
    iget-object v0, p0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    invoke-virtual {v0}, Ll/۠ۘ֫;->֫()V

    return-void
.end method

.method public abstract ֫()Ll/۬ۖ֫;
.end method

.method public final ֫(Landroid/os/Message;)V
    .locals 18

    move-object/from16 v0, p1

    .line 1584
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 1585
    iget v2, v0, Landroid/os/Message;->what:I

    const-string v3, "data_callback_token"

    const-string v4, "data_calling_uid"

    const-string v5, "data_calling_pid"

    const-string v6, "data_package_name"

    const-string v7, "data_root_hints"

    const-string v8, "data_media_item_id"

    const-string v9, "data_result_receiver"

    move-object/from16 v10, p0

    iget-object v15, v10, Ll/ܶۘ֫;->ۗ:Ll/֡ۘ֫;

    packed-switch v2, :pswitch_data_0

    .line 1662
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    :pswitch_0
    const-string v2, "data_custom_action_extras"

    .line 1651
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 1652
    invoke-static {v2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    const-string v3, "data_custom_action"

    .line 1655
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1657
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/᩸ۧ;

    new-instance v13, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v13, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 1654
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez v16, :cond_0

    goto/16 :goto_0

    .line 1117
    :cond_0
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v1, Ll/᩵ۘ֫;

    move-object v11, v1

    move-object v12, v15

    move-object v15, v2

    invoke-direct/range {v11 .. v16}, Ll/᩵ۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/Bundle;Ll/᩸ۧ;)V

    invoke-virtual {v0, v1}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    const-string v2, "data_search_extras"

    .line 1640
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 1641
    invoke-static {v2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    const-string v3, "data_search_query"

    .line 1644
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1646
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ll/᩸ۧ;

    new-instance v13, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v13, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 1643
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez v16, :cond_1

    goto/16 :goto_0

    .line 1096
    :cond_1
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v1, Ll/ᩴۘ֫;

    move-object v11, v1

    move-object v12, v15

    move-object v15, v2

    invoke-direct/range {v11 .. v16}, Ll/ᩴۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/Bundle;Ll/᩸ۧ;)V

    invoke-virtual {v0, v1}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 1637
    :pswitch_2
    new-instance v1, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v1, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 1078
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v2, Ll/ۘۘ֫;

    invoke-direct {v2, v15, v1}, Ll/ۘۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;)V

    invoke-virtual {v0, v2}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 1625
    :pswitch_3
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    .line 1626
    invoke-static {v14}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1628
    new-instance v2, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v2, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 1630
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 1631
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 1632
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1037
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v1, Ll/ۖۘ֫;

    move-object v11, v1

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v17}, Ll/ۖۘ֫;-><init>(IILandroid/os/Bundle;Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 1620
    :pswitch_4
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1621
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ll/᩸ۧ;

    new-instance v3, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v3, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 1619
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez v1, :cond_2

    goto :goto_0

    .line 1019
    :cond_2
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v4, Ll/ܺۘ֫;

    invoke-direct {v4, v15, v3, v2, v1}, Ll/ܺۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Ll/᩸ۧ;)V

    invoke-virtual {v0, v4}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void

    .line 1614
    :pswitch_5
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    .line 1615
    new-instance v3, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v3, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 993
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v4, Ll/ۡۘ֫;

    invoke-direct {v4, v15, v3, v2, v1}, Ll/ۡۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {v0, v4}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    :pswitch_6
    const-string v2, "data_options"

    .line 1602
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v16

    .line 1603
    invoke-static/range {v16 .. v16}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1606
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 44
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    .line 1607
    new-instance v13, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v13, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 973
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v2, Ll/ۢۘ֫;

    move-object v11, v2

    move-object v12, v15

    move-object v15, v1

    invoke-direct/range {v11 .. v16}, Ll/ۢۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 1599
    :pswitch_7
    new-instance v1, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v1, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 956
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v2, Ll/᩷ۘ֫;

    invoke-direct {v2, v15, v1}, Ll/᩷ۘ֫;-><init>(Ll/֡ۘ֫;Ll/֨ۘ֫;)V

    invoke-virtual {v0, v2}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 1587
    :pswitch_8
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    .line 1588
    invoke-static {v14}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1591
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1592
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1593
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v13

    new-instance v1, Ll/֨ۘ֫;

    iget-object v0, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v1, v0}, Ll/֨ۘ֫;-><init>(Landroid/os/Messenger;)V

    .line 908
    iget-object v0, v15, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    if-eqz v2, :cond_5

    .line 1680
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 1681
    invoke-virtual {v3, v13}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v3

    .line 1682
    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_5

    .line 1684
    aget-object v6, v3, v5

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 913
    iget-object v0, v0, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    new-instance v3, Ll/ۜۘ֫;

    move-object v11, v3

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    invoke-direct/range {v11 .. v17}, Ll/ۜۘ֫;-><init>(IILandroid/os/Bundle;Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ll/۠ۘ֫;->֫(Ljava/lang/Runnable;)V

    return-void

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 909
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Package/uid mismatch: uid="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " package="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ۧ()V
.end method
