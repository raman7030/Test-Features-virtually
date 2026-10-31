.class public final Ll/۠᩶;
.super Ljava/lang/Object;
.source "J5UB"

# interfaces
.implements Ll/ܿ᩶;


# instance fields
.field public final ֫:Landroid/app/Notification$Builder;

.field public final ۧ:Ll/᩷᩶;

.field public final ܽ:Landroid/os/Bundle;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩷᩶;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 70
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, Ll/۠᩶;->ܽ:Landroid/os/Bundle;

    .line 71
    iput-object v1, v0, Ll/۠᩶;->ۧ:Ll/᩷᩶;

    .line 72
    iget-object v2, v1, Ll/᩷᩶;->᩻:Landroid/content/Context;

    iget-object v3, v1, Ll/᩷᩶;->ܺ:Ljava/util/ArrayList;

    iget-object v4, v1, Ll/᩷᩶;->ۖ:Ljava/util/ArrayList;

    iget-object v5, v1, Ll/᩷᩶;->ܽ:Ljava/lang/String;

    iget-object v6, v1, Ll/᩷᩶;->᩷:Ljava/util/ArrayList;

    .line 73
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1a

    if-lt v7, v8, :cond_0

    .line 74
    invoke-static {v2, v5}, Ll/᩵᩶;->֫(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v8

    iput-object v8, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    goto :goto_0

    .line 76
    :cond_0
    new-instance v8, Landroid/app/Notification$Builder;

    invoke-direct {v8, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v8, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    .line 78
    :goto_0
    iget-object v8, v1, Ll/᩷᩶;->ۡ:Landroid/app/Notification;

    .line 79
    iget-object v9, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-wide v10, v8, Landroid/app/Notification;->when:J

    invoke-virtual {v9, v10, v11}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->icon:I

    iget v11, v8, Landroid/app/Notification;->iconLevel:I

    .line 80
    invoke-virtual {v9, v10, v11}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v8, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 81
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v8, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v11, 0x0

    .line 82
    invoke-virtual {v9, v10, v11}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v8, Landroid/app/Notification;->vibrate:[J

    .line 83
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->ledARGB:I

    iget v12, v8, Landroid/app/Notification;->ledOnMS:I

    iget v13, v8, Landroid/app/Notification;->ledOffMS:I

    .line 84
    invoke-virtual {v9, v10, v12, v13}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->flags:I

    and-int/lit8 v10, v10, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 85
    :goto_1
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->flags:I

    and-int/lit8 v10, v10, 0x8

    if-eqz v10, :cond_2

    const/4 v10, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 86
    :goto_2
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->flags:I

    and-int/lit8 v10, v10, 0x10

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    .line 87
    :goto_3
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->defaults:I

    .line 88
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v1, Ll/᩷᩶;->ܳ:Ljava/lang/CharSequence;

    .line 89
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v1, Ll/᩷᩶;->ܿ:Ljava/lang/CharSequence;

    .line 90
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 91
    invoke-virtual {v9, v11}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v1, Ll/᩷᩶;->ᩳ:Landroid/app/PendingIntent;

    .line 92
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget-object v10, v8, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 93
    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v9

    iget v10, v8, Landroid/app/Notification;->flags:I

    and-int/lit16 v10, v10, 0x80

    if-eqz v10, :cond_4

    const/4 v10, 0x1

    goto :goto_4

    :cond_4
    const/4 v10, 0x0

    .line 94
    :goto_4
    invoke-virtual {v9, v11, v10}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 96
    invoke-virtual {v9, v13}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 97
    invoke-virtual {v9, v13, v13, v13}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    const/16 v9, 0x17

    if-ge v7, v9, :cond_6

    .line 99
    iget-object v2, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-object v7, v1, Ll/᩷᩶;->ۢ:Ll/ۙ۬;

    if-nez v7, :cond_5

    move-object v7, v11

    goto :goto_5

    :cond_5
    invoke-virtual {v7}, Ll/ۙ۬;->֫()Landroid/graphics/Bitmap;

    move-result-object v7

    :goto_5
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    goto :goto_7

    .line 101
    :cond_6
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    .line 102
    iget-object v9, v1, Ll/᩷᩶;->ۢ:Ll/ۙ۬;

    if-nez v9, :cond_7

    move-object v2, v11

    goto :goto_6

    :cond_7
    invoke-virtual {v9, v2}, Ll/ۙ۬;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 101
    :goto_6
    invoke-static {v7, v2}, Ll/ۘ᩶;->֫(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 108
    :goto_7
    iget-object v2, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v2, v11}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 109
    invoke-virtual {v2, v13}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 110
    iget v7, v1, Ll/᩷᩶;->ۘ:I

    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 117
    iget-object v2, v1, Ll/᩷᩶;->֡:Ll/ۡ᩶;

    instance-of v7, v2, Ll/ۢ᩶;

    if-eqz v7, :cond_b

    .line 120
    check-cast v2, Ll/ۢ᩶;

    .line 4991
    iget-object v7, v2, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    iget-object v7, v7, Ll/᩷᩶;->᩻:Landroid/content/Context;

    const v9, 0x7f060042

    invoke-static {v7, v9}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result v7

    .line 4993
    new-instance v9, Landroid/text/SpannableStringBuilder;

    invoke-direct {v9}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 4994
    iget-object v10, v2, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    iget-object v10, v10, Ll/᩷᩶;->᩻:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v14, 0x7f120157

    invoke-virtual {v10, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4995
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v10, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v7

    const/16 v14, 0x12

    invoke-virtual {v9, v10, v13, v7, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 4998
    new-instance v7, Ll/ܳ᩶;

    iget-object v10, v2, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    iget-object v10, v10, Ll/᩷᩶;->᩻:Landroid/content/Context;

    .line 4999
    sget v14, Ll/ۙ۬;->ۡ:I

    .line 122
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const v15, 0x7f08010f

    invoke-static {v14, v10, v15}, Ll/ۙ۬;->֫(Landroid/content/res/Resources;Ljava/lang/String;I)Ll/ۙ۬;

    move-result-object v10

    .line 4999
    invoke-direct {v7, v10, v9}, Ll/ܳ᩶;-><init>(Ll/ۙ۬;Landroid/text/SpannableStringBuilder;)V

    .line 5000
    invoke-virtual {v7}, Ll/ܳ᩶;->֫()Ll/᩻᩶;

    move-result-object v7

    .line 5771
    iget-object v9, v7, Ll/᩻᩶;->ᩳ:Landroid/os/Bundle;

    const-string v10, "key_action_priority"

    .line 5001
    invoke-virtual {v9, v10, v12}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 5027
    new-instance v9, Ljava/util/ArrayList;

    const/4 v14, 0x3

    invoke-direct {v9, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 5029
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5034
    iget-object v2, v2, Ll/ۡ᩶;->֫:Ll/᩷᩶;

    iget-object v2, v2, Ll/᩷᩶;->֫:Ljava/util/ArrayList;

    if-eqz v2, :cond_a

    .line 5036
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v7, 0x2

    :cond_8
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩻᩶;

    .line 5037
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5771
    iget-object v15, v14, Ll/᩻᩶;->ᩳ:Landroid/os/Bundle;

    .line 5008
    invoke-virtual {v15, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_9

    goto :goto_8

    :cond_9
    if-le v7, v12, :cond_8

    .line 5047
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, -0x1

    goto :goto_8

    .line 123
    :cond_a
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻᩶;

    .line 124
    invoke-direct {v0, v7}, Ll/۠᩶;->֫(Ll/᩻᩶;)V

    goto :goto_9

    .line 127
    :cond_b
    iget-object v2, v1, Ll/᩷᩶;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻᩶;

    .line 128
    invoke-direct {v0, v7}, Ll/۠᩶;->֫(Ll/᩻᩶;)V

    goto :goto_a

    .line 132
    :cond_c
    iget-object v2, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    if-eqz v2, :cond_d

    .line 133
    iget-object v7, v0, Ll/۠᩶;->ܽ:Landroid/os/Bundle;

    invoke-virtual {v7, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 135
    :cond_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 155
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-boolean v9, v1, Ll/᩷᩶;->ᩴ:Z

    invoke-virtual {v7, v9}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 164
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v13}, Ll/ܺ᩶;->ۧ(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 165
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v11}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 166
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v11}, Ll/ܺ᩶;->ۧ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 167
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v13}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 168
    iput v13, v0, Ll/۠᩶;->ᩳ:I

    .line 171
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v11}, Ll/ۖ᩶;->ۧ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 172
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v13}, Ll/ۖ᩶;->֫(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 173
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget v9, v1, Ll/᩷᩶;->ۚ:I

    invoke-static {v7, v9}, Ll/ۖ᩶;->ۧ(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 174
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v11}, Ll/ۖ᩶;->֫(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 175
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-object v9, v8, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v10, v8, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v7, v9, v10}, Ll/ۖ᩶;->֫(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    const/16 v7, 0x1c

    if-ge v2, v7, :cond_14

    if-nez v4, :cond_e

    goto :goto_d

    .line 315
    :cond_e
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܰ᩶;

    .line 219
    iget-object v9, v7, Ll/ܰ᩶;->ܿ:Ljava/lang/CharSequence;

    iget-object v7, v7, Ll/ܰ᩶;->ܳ:Ljava/lang/String;

    if-eqz v7, :cond_f

    goto :goto_c

    :cond_f
    if-eqz v9, :cond_10

    .line 223
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "name:"

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_c

    :cond_10
    const-string v7, ""

    .line 317
    :goto_c
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_11
    :goto_d
    if-nez v11, :cond_12

    goto :goto_e

    :cond_12
    if-nez v3, :cond_13

    move-object v3, v11

    goto :goto_e

    .line 304
    :cond_13
    new-instance v2, Ll/ᩴ᩵;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    add-int/2addr v9, v7

    invoke-direct {v2, v9}, Ll/ᩴ᩵;-><init>(I)V

    .line 305
    invoke-virtual {v2, v11}, Ll/ᩴ᩵;->addAll(Ljava/util/Collection;)Z

    .line 306
    invoke-virtual {v2, v3}, Ll/ᩴ᩵;->addAll(Ljava/util/Collection;)Z

    .line 307
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_14
    :goto_e
    if-eqz v3, :cond_15

    .line 183
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    .line 184
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 185
    iget-object v7, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v7, v3}, Ll/ۖ᩶;->֫(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_f

    .line 191
    :cond_15
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1e

    .line 2013
    iget-object v2, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    if-nez v2, :cond_16

    .line 2014
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    .line 2016
    :cond_16
    iget-object v2, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    const-string v3, "android.car.EXTENSIONS"

    .line 195
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_17

    .line 197
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 199
    :cond_17
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 200
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const/4 v10, 0x0

    .line 201
    :goto_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_1c

    .line 203
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    .line 205
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩻᩶;

    .line 256
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 257
    invoke-virtual {v12}, Ll/᩻᩶;->ۧ()Ll/ۙ۬;

    move-result-object v14

    iget-object v15, v12, Ll/᩻᩶;->ᩳ:Landroid/os/Bundle;

    if-eqz v14, :cond_18

    .line 258
    invoke-virtual {v14}, Ll/ۙ۬;->ۧ()I

    move-result v14

    goto :goto_11

    :cond_18
    const/4 v14, 0x0

    :goto_11
    move-object/from16 v16, v6

    const-string v6, "icon"

    invoke-virtual {v13, v6, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "title"

    .line 5760
    iget-object v14, v12, Ll/᩻᩶;->ۜ:Ljava/lang/CharSequence;

    .line 259
    invoke-virtual {v13, v6, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v6, "actionIntent"

    .line 5764
    iget-object v14, v12, Ll/᩻᩶;->֫:Landroid/app/PendingIntent;

    .line 260
    invoke-virtual {v13, v6, v14}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz v15, :cond_19

    .line 263
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6, v15}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_12

    .line 265
    :cond_19
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    :goto_12
    const-string v14, "android.support.allowGeneratedReplies"

    .line 268
    invoke-virtual {v12}, Ll/᩻᩶;->֫()Z

    move-result v15

    .line 267
    invoke-virtual {v6, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v14, "extras"

    .line 269
    invoke-virtual {v13, v14, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 270
    invoke-virtual {v12}, Ll/᩻᩶;->ܽ()[Ll/ᩳۙ;

    move-result-object v6

    if-nez v6, :cond_1a

    const/4 v6, 0x0

    move-object/from16 v17, v4

    move-object/from16 v20, v5

    move-object/from16 v18, v8

    goto :goto_14

    .line 328
    :cond_1a
    array-length v15, v6

    new-array v15, v15, [Landroid/os/Bundle;

    const/16 v17, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v8

    const/4 v8, 0x0

    .line 329
    :goto_13
    array-length v4, v6

    if-ge v8, v4, :cond_1b

    .line 330
    aget-object v4, v6, v8

    move-object/from16 v19, v6

    .line 295
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 296
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "resultKey"

    move-object/from16 v20, v5

    const/4 v5, 0x0

    invoke-virtual {v6, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "label"

    .line 297
    invoke-virtual {v6, v4, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v4, "choices"

    .line 298
    invoke-virtual {v6, v4, v5}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    const-string v4, "allowFreeFormInput"

    const/4 v0, 0x0

    .line 299
    invoke-virtual {v6, v4, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 300
    invoke-virtual {v6, v14, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 330
    aput-object v6, v15, v8

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    goto :goto_13

    :cond_1b
    move-object/from16 v20, v5

    move-object v6, v15

    :goto_14
    const-string v0, "remoteInputs"

    .line 270
    invoke-virtual {v13, v0, v6}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    const-string v0, "showsUserInterface"

    .line 5841
    iget-boolean v4, v12, Ll/᩻᩶;->᩻:Z

    .line 271
    invoke-virtual {v13, v0, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "semanticAction"

    const/4 v4, 0x0

    .line 272
    invoke-virtual {v13, v0, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 202
    invoke-virtual {v9, v11, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v6, v16

    move-object/from16 v4, v17

    move-object/from16 v8, v18

    move-object/from16 v5, v20

    goto/16 :goto_10

    :cond_1c
    move-object/from16 v17, v4

    move-object/from16 v20, v5

    move-object/from16 v18, v8

    const-string v0, "invisible_actions"

    .line 207
    invoke-virtual {v2, v0, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 209
    invoke-virtual {v7, v0, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2013
    iget-object v0, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    if-nez v0, :cond_1d

    .line 2014
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    .line 2016
    :cond_1d
    iget-object v0, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    .line 211
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    move-object/from16 v0, p0

    .line 213
    iget-object v2, v0, Ll/۠᩶;->ܽ:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_15

    :cond_1e
    move-object/from16 v17, v4

    move-object/from16 v20, v5

    move-object/from16 v18, v8

    .line 217
    :goto_15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_1f

    .line 223
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-object v4, v1, Ll/᩷᩶;->ۜ:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 224
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll/ᩴ᩶;->֫(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    goto :goto_16

    :cond_1f
    const/4 v4, 0x0

    :goto_16
    const/16 v3, 0x1a

    if-lt v2, v3, :cond_20

    .line 236
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ll/᩵᩶;->֫(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 237
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v3, v4}, Ll/᩵᩶;->֫(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 238
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v3, v4}, Ll/᩵᩶;->֫(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 239
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const-wide/16 v6, 0x0

    invoke-static {v3, v6, v7}, Ll/᩵᩶;->֫(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 240
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v3, v5}, Ll/᩵᩶;->ۧ(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 245
    invoke-static/range {v20 .. v20}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_20

    .line 246
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 247
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 248
    invoke-virtual {v3, v5, v5, v5}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 249
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_20
    const/16 v3, 0x1c

    if-lt v2, v3, :cond_21

    .line 253
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰ᩶;

    .line 254
    iget-object v4, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    invoke-static {v3}, Ll/᩺᩶;->֫(Ll/ܰ᩶;)Landroid/app/Person;

    move-result-object v3

    .line 254
    invoke-static {v4, v3}, Ll/֡᩶;->֫(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_17

    .line 257
    :cond_21
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_22

    .line 258
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    iget-boolean v4, v1, Ll/᩷᩶;->ۧ:Z

    invoke-static {v3, v4}, Ll/ۚ᩶;->֫(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 261
    iget-object v3, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll/ۚ᩶;->֫(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    goto :goto_18

    :cond_22
    const/4 v4, 0x0

    .line 273
    :goto_18
    iget-boolean v1, v1, Ll/᩷᩶;->᩵:Z

    if-eqz v1, :cond_24

    .line 274
    iget-object v1, v0, Ll/۠᩶;->ۧ:Ll/᩷᩶;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 277
    iput v1, v0, Ll/۠᩶;->ᩳ:I

    .line 280
    iget-object v1, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 281
    iget-object v1, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-object/from16 v1, v18

    .line 282
    iget v3, v1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v3, v3, -0x4

    .line 283
    iput v3, v1, Landroid/app/Notification;->defaults:I

    .line 284
    iget-object v1, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    const/16 v1, 0x1a

    if-lt v2, v1, :cond_24

    .line 287
    iget-object v1, v0, Ll/۠᩶;->ۧ:Ll/᩷᩶;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 288
    iget-object v1, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const-string v2, "silent"

    invoke-static {v1, v2}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 290
    :cond_23
    iget-object v1, v0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ll/᩵᩶;->ۧ(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_24
    return-void
.end method

.method public static ֫(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    .line 525
    iput-object v0, p0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 526
    iput-object v0, p0, Landroid/app/Notification;->vibrate:[J

    .line 527
    iget v0, p0, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x4

    .line 528
    iput v0, p0, Landroid/app/Notification;->defaults:I

    return-void
.end method

.method private ֫(Ll/᩻᩶;)V
    .locals 10

    .line 371
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 373
    invoke-virtual {p1}, Ll/᩻᩶;->ۧ()Ll/ۙ۬;

    move-result-object v1

    iget-object v2, p1, Ll/᩻᩶;->ᩳ:Landroid/os/Bundle;

    iget-object v3, p1, Ll/᩻᩶;->֫:Landroid/app/PendingIntent;

    iget-object v4, p1, Ll/᩻᩶;->ۜ:Ljava/lang/CharSequence;

    const/16 v5, 0x17

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-lt v0, v5, :cond_1

    if-eqz v1, :cond_0

    .line 517
    invoke-virtual {v1, v7}, Ll/ۙ۬;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v7

    .line 375
    :goto_0
    invoke-static {v0, v4, v3}, Ll/ۘ᩶;->֫(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 380
    invoke-virtual {v1}, Ll/ۙ۬;->ۧ()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 379
    :goto_1
    invoke-static {v0, v4, v3}, Ll/ܺ᩶;->֫(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    .line 383
    :goto_2
    invoke-virtual {p1}, Ll/᩻᩶;->ܽ()[Ll/ᩳۙ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 385
    invoke-virtual {p1}, Ll/᩻᩶;->ܽ()[Ll/ᩳۙ;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_4

    .line 556
    :cond_3
    array-length v3, v1

    new-array v7, v3, [Landroid/app/RemoteInput;

    const/4 v3, 0x0

    .line 557
    :goto_3
    array-length v4, v1

    if-ge v3, v4, :cond_5

    .line 558
    aget-object v4, v1, v3

    .line 658
    new-instance v5, Landroid/app/RemoteInput$Builder;

    .line 659
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-direct {v5, v4}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    .line 660
    invoke-virtual {v5, v4}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v5

    .line 661
    invoke-virtual {v5, v4}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v5

    const/4 v8, 0x0

    .line 662
    invoke-virtual {v5, v8}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    move-result-object v5

    .line 663
    invoke-virtual {v5, v4}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    move-result-object v4

    .line 664
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1d

    if-lt v5, v9, :cond_4

    .line 673
    invoke-static {v4, v8}, Ll/ܽۙ;->֫(Landroid/app/RemoteInput$Builder;I)Landroid/app/RemoteInput$Builder;

    .line 675
    :cond_4
    invoke-virtual {v4}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    move-result-object v4

    .line 558
    aput-object v4, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 384
    :cond_5
    :goto_4
    array-length v1, v7

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v1, :cond_6

    aget-object v4, v7, v3

    .line 386
    invoke-static {v0, v4}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_6
    if-eqz v2, :cond_7

    .line 391
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_6

    .line 393
    :cond_7
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_6
    const-string v2, "android.support.allowGeneratedReplies"

    .line 396
    invoke-virtual {p1}, Ll/᩻᩶;->֫()Z

    move-result v3

    .line 395
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 397
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_8

    .line 399
    invoke-virtual {p1}, Ll/᩻᩶;->֫()Z

    move-result v3

    .line 398
    invoke-static {v0, v3}, Ll/ᩴ᩶;->֫(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_8
    const-string v3, "android.support.action.semanticAction"

    .line 402
    invoke-virtual {v1, v3, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_9

    .line 405
    invoke-static {v0, v6}, Ll/֡᩶;->֫(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_9
    const/16 v3, 0x1d

    if-lt v2, v3, :cond_a

    .line 409
    invoke-static {v0, v6}, Ll/ۚ᩶;->֫(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_a
    const/16 v3, 0x1f

    if-lt v2, v3, :cond_b

    .line 413
    invoke-static {v0, v6}, Ll/֨᩶;->֫(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_b
    const-string v2, "android.support.action.showsUserInterface"

    .line 5841
    iget-boolean p1, p1, Ll/᩻᩶;->᩻:Z

    .line 417
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 419
    invoke-static {v0, v1}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 420
    iget-object p1, p0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    invoke-static {v0}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܺ᩶;->֫(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/app/Notification$Builder;
    .locals 1

    .line 324
    iget-object v0, p0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public final ۧ()Landroid/app/Notification;
    .locals 8

    .line 332
    iget-object v0, p0, Ll/۠᩶;->ۧ:Ll/᩷᩶;

    iget-object v1, v0, Ll/᩷᩶;->֡:Ll/ۡ᩶;

    if-eqz v1, :cond_0

    .line 334
    invoke-virtual {v1, p0}, Ll/ۡ᩶;->֫(Ll/ܿ᩶;)V

    .line 429
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    iget-object v4, p0, Ll/۠᩶;->֫:Landroid/app/Notification$Builder;

    if-lt v2, v3, :cond_1

    .line 430
    invoke-virtual {v4}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/16 v3, 0x18

    const/4 v5, 0x1

    const/4 v6, 0x2

    .line 431
    iget v7, p0, Ll/۠᩶;->ᩳ:I

    if-lt v2, v3, :cond_3

    .line 432
    invoke-virtual {v4}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    if-eqz v7, :cond_5

    .line 436
    invoke-static {v2}, Ll/ܺ᩶;->֫(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v3, v2, Landroid/app/Notification;->flags:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_2

    if-ne v7, v6, :cond_2

    .line 439
    invoke-static {v2}, Ll/۠᩶;->֫(Landroid/app/Notification;)V

    .line 442
    :cond_2
    invoke-static {v2}, Ll/ܺ᩶;->֫(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    iget v3, v2, Landroid/app/Notification;->flags:I

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_5

    if-ne v7, v5, :cond_5

    .line 445
    invoke-static {v2}, Ll/۠᩶;->֫(Landroid/app/Notification;)V

    goto :goto_0

    .line 451
    :cond_3
    iget-object v2, p0, Ll/۠᩶;->ܽ:Landroid/os/Bundle;

    invoke-virtual {v4, v2}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 452
    invoke-virtual {v4}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    if-eqz v7, :cond_5

    .line 465
    invoke-static {v2}, Ll/ܺ᩶;->֫(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    iget v3, v2, Landroid/app/Notification;->flags:I

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_4

    if-ne v7, v6, :cond_4

    .line 468
    invoke-static {v2}, Ll/۠᩶;->֫(Landroid/app/Notification;)V

    .line 471
    :cond_4
    invoke-static {v2}, Ll/ܺ᩶;->֫(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    iget v3, v2, Landroid/app/Notification;->flags:I

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_5

    if-ne v7, v5, :cond_5

    .line 474
    invoke-static {v2}, Ll/۠᩶;->֫(Landroid/app/Notification;)V

    :cond_5
    :goto_0
    if-eqz v1, :cond_6

    .line 353
    iget-object v0, v0, Ll/᩷᩶;->֡:Ll/ۡ᩶;

    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    if-eqz v1, :cond_7

    .line 8959
    iget-object v0, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_7

    .line 2795
    invoke-virtual {v1}, Ll/ۡ᩶;->֫()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v3, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 2797
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object v2
.end method
