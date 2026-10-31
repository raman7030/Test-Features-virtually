.class public Ll/ܰܶۢ;
.super Ll/ۤ᩹ۢ;
.source "U92X"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۤ᩹ۢ;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
    .locals 1

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    .line 112
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 113
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p1, v0

    .line 114
    :goto_0
    invoke-interface {p1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 115
    invoke-interface {p1, v0, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 116
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    const/16 v1, 0x32

    if-le p0, v1, :cond_1

    .line 117
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {p1, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p1, p0

    .line 119
    :cond_1
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/String;

    .line 120
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const-string v0, "eama"

    invoke-interface {p0, v0, p1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 121
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ֫(Landroid/app/ActivityManager$AppTask;)Z
    .locals 2

    .line 44
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 45
    invoke-virtual {p0}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    move-result-object p0

    iget-boolean p0, p0, Landroid/app/ActivityManager$RecentTaskInfo;->isRunning:Z

    return p0

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 48
    invoke-virtual {p0}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/app/ActivityManager$RecentTaskInfo;->topActivity:Landroid/content/ComponentName;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "operation"

    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "exec-script"

    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "path"

    .line 63
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "eae"

    .line 64
    invoke-virtual {v0, v7, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v8

    const-string v9, "ewrp"

    .line 65
    invoke-virtual {v0, v9, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    const-string v10, "ewse"

    const/4 v11, 0x1

    .line 66
    invoke-virtual {v0, v10, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 67
    invoke-static {v2, v6, v8, v5, v0}, Ll/ܰܶۢ;->֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object v2

    .line 68
    sget-object v12, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v13, "eama"

    const/4 v14, 0x0

    invoke-interface {v12, v13, v14}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_1

    .line 69
    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 70
    invoke-static {v2, v12}, Ll/ܰܶۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return v11

    .line 128
    :cond_1
    invoke-static {}, Lbin/mt/plus/ShortcutActivity;->᩵()Z

    move-result v11

    const-string v13, "bin.mt.plus.ACTION_SHORTCUT"

    if-eqz v11, :cond_4

    .line 129
    invoke-static/range {p0 .. p0}, Ll/ܽۗ;->ܿ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v11

    .line 130
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/۟ۙ;

    .line 131
    invoke-virtual {v14}, Ll/۟ۙ;->ۧ()Landroid/content/Intent;

    move-result-object v14

    .line 132
    invoke-virtual {v14}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 133
    invoke-virtual {v14, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 p1, v11

    .line 134
    invoke-virtual {v14, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move-object/from16 v17, v12

    .line 135
    invoke-virtual {v14, v7, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v12

    .line 136
    invoke-virtual {v14, v9, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v18, v9

    const/4 v9, 0x1

    .line 137
    invoke-virtual {v14, v10, v9}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    .line 138
    invoke-virtual {v3, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 139
    invoke-static {v6, v11}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    if-ne v8, v12, :cond_3

    if-ne v5, v2, :cond_3

    if-ne v0, v9, :cond_3

    goto :goto_2

    :cond_2
    move-object/from16 v16, v2

    move-object/from16 v18, v9

    move-object/from16 p1, v11

    move-object/from16 v17, v12

    :cond_3
    move-object/from16 v11, p1

    move-object/from16 v2, v16

    move-object/from16 v12, v17

    move-object/from16 v9, v18

    goto :goto_0

    :cond_4
    move-object/from16 v16, v2

    move-object/from16 v18, v9

    move-object/from16 v17, v12

    .line 148
    invoke-static/range {p0 .. p0}, Ll/ܽۗ;->֫(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۟ۙ;

    .line 150
    invoke-virtual {v9}, Ll/۟ۙ;->ۧ()Landroid/content/Intent;

    move-result-object v9

    .line 151
    invoke-virtual {v9}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 152
    invoke-virtual {v9, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 153
    invoke-virtual {v9, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    .line 154
    invoke-virtual {v9, v7, v14}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v15

    move-object/from16 v19, v1

    move-object/from16 v1, v18

    .line 155
    invoke-virtual {v9, v1, v14}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v14

    const/4 v1, 0x1

    .line 156
    invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    .line 157
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 158
    invoke-static {v6, v12}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    if-ne v8, v15, :cond_6

    if-ne v5, v14, :cond_6

    if-ne v0, v9, :cond_6

    :goto_2
    const/4 v0, 0x1

    move-object/from16 v1, v16

    move-object/from16 v9, v17

    .line 74
    invoke-static {v1, v9}, Ll/ܰܶۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return v0

    :cond_5
    move-object/from16 v19, v1

    :cond_6
    move-object/from16 v1, v16

    move-object/from16 v9, v17

    move-object/from16 v16, v1

    move-object/from16 v17, v9

    move-object/from16 v1, v19

    goto :goto_1

    :cond_7
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ(Landroid/content/Intent;)V
    .locals 6

    const-string v0, "operation"

    .line 86
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "exec-script"

    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v1, "path"

    .line 90
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "eae"

    const/4 v3, 0x0

    .line 91
    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "ewrp"

    .line 92
    invoke-virtual {p0, v4, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "ewse"

    const/4 v5, 0x1

    .line 93
    invoke-virtual {p0, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    .line 94
    invoke-static {v0, v1, v2, v3, p0}, Ll/ܰܶۢ;->֫(Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object p0

    .line 95
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "eama"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {p0, v0}, Ll/ܰܶۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 3

    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isTaskRoot()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    const-string v0, "activity"

    .line 29
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 30
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩺ܿۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩺ܿۢ;-><init>(I)V

    .line 31
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 32
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v0

    long-to-int v1, v0

    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 34
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Kill self process"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 35
    invoke-static {}, Ll/ۢ֨ۢ;->֫()V

    .line 36
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void

    .line 39
    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
