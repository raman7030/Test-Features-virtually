.class public final Ll/ۤ᩹᩷;
.super Ljava/lang/Object;
.source "592B"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۧ:I

.field public final ܽ:Z


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Z)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۤ᩹᩷;->֫:Ll/ۗܺ᩷;

    .line 25
    iput-boolean p2, p0, Ll/ۤ᩹᩷;->ܽ:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩹᩷;)V
    .locals 1

    .line 46
    iget-object p0, p0, Ll/ۤ᩹᩷;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩹ᩴܺ;->֫(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 13

    .line 29
    iget-boolean v0, p0, Ll/ۤ᩹᩷;->ܽ:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۤ᩹᩷;->֫:Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    .line 30
    invoke-static {v3}, Ll/ܽۗ;->ۧ(Landroid/content/Context;)I

    move-result v0

    const/4 v4, 0x4

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 31
    invoke-static {v3}, Ll/ܽۗ;->֫(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v4, v0, :cond_11

    const v0, 0x7f120961

    .line 32
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    .line 33
    invoke-static {v3}, Ll/ᩴ᩶᩷;->֫(Ll/ۗܺ᩷;)V

    return v2

    .line 37
    :cond_0
    invoke-static {}, Lbin/mt/plus/ShortcutActivity;->᩵()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f120964

    .line 38
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return v2

    .line 45
    :cond_1
    invoke-static {}, Ll/ۗᩴܺ;->ۧ()Z

    move-result v0

    const/4 v4, 0x2

    const/4 v5, -0x1

    if-eqz v0, :cond_2

    .line 25
    new-instance v0, Landroid/content/Intent;

    const-string v6, "com.android.launcher.action.INSTALL_SHORTCUT"

    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :try_start_0
    const-string v6, "com.huawei.hsm.permission.PermissionManager"

    .line 27
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v7, "canSendBroadcast"

    new-array v8, v4, [Ljava/lang/Class;

    .line 28
    const-class v9, Landroid/content/Context;

    aput-object v9, v8, v2

    const-class v9, Landroid/content/Intent;

    aput-object v9, v8, v1

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v3, v8, v2

    aput-object v0, v8, v1

    .line 29
    invoke-virtual {v7, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_c

    goto/16 :goto_3

    .line 47
    :cond_2
    invoke-static {}, Ll/ۗᩴܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    :try_start_1
    const-string v0, "appops"

    .line 87
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    .line 88
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 89
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget v7, v7, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 90
    const-class v8, Landroid/app/AppOpsManager;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const-string v9, "checkOpNoThrow"

    const/4 v10, 0x3

    new-array v11, v10, [Ljava/lang/Class;

    .line 91
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v11, v2

    aput-object v12, v11, v1

    const-class v12, Ljava/lang/String;

    aput-object v12, v11, v4

    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/16 v9, 0x2721

    .line 92
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v9, v10, v2

    aput-object v7, v10, v1

    aput-object v6, v10, v4

    invoke-virtual {v8, v0, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    goto/16 :goto_4

    .line 96
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/16 v7, 0x30

    if-eq v6, v7, :cond_6

    const/16 v7, 0x31

    if-eq v6, v7, :cond_5

    const/16 v7, 0x35

    if-eq v6, v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "5"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v4, 0x1

    goto/16 :goto_4

    :cond_5
    const-string v6, "1"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto/16 :goto_0

    :cond_6
    const-string v6, "0"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_10

    goto/16 :goto_3

    :catch_0
    nop

    goto/16 :goto_4

    .line 49
    :cond_7
    invoke-static {}, Ll/ۗᩴܺ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 114
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    if-nez v6, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v0, "content://settings/secure/launcher_shortcut_permission_settings"

    .line 118
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 119
    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-nez v0, :cond_9

    if-eqz v0, :cond_10

    goto :goto_1

    .line 124
    :cond_9
    :try_start_2
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 125
    :cond_a
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-eqz v7, :cond_d

    const-string v7, "value"

    .line 127
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 128
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_a

    .line 129
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", 1"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v8, :cond_b

    .line 138
    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    .line 132
    :cond_b
    :try_start_4
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", 0"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v7, :cond_a

    .line 138
    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_c
    :goto_0
    const/4 v4, -0x1

    goto :goto_4

    :cond_d
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_4

    :catchall_0
    move-exception v6

    .line 120
    :try_start_6
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_7
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 51
    :cond_e
    invoke-static {}, Ll/ۗᩴܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 52
    invoke-static {v3}, Ll/᩶ᩴܺ;->֫(Landroid/content/Context;)I

    move-result v4

    goto :goto_4

    :cond_f
    :goto_3
    const/4 v4, 0x0

    .line 41
    :cond_10
    :goto_4
    iput v4, p0, Ll/ۤ᩹᩷;->ۧ:I

    if-ne v4, v5, :cond_11

    .line 43
    invoke-virtual {v3}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120307

    .line 44
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f120209

    .line 45
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/۫᩹᩷;

    invoke-direct {v1, p0}, Ll/۫᩹᩷;-><init>(Ll/ۤ᩹᩷;)V

    const v3, 0x7f12070a

    .line 46
    invoke-virtual {v0, v3, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v1, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 48
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v2

    :cond_11
    return v1
.end method

.method public final ֫(Landroid/content/Intent;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Z
    .locals 4

    .line 56
    iget-boolean v0, p0, Ll/ۤ᩹᩷;->ܽ:Z

    if-eqz v0, :cond_0

    const-string v1, ":dynamic"

    .line 0
    invoke-static {p4, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 59
    :cond_0
    new-instance v1, Ll/ܰۙ;

    invoke-static {p4}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iget-object v2, p0, Ll/ۤ᩹᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v1, v2, p4}, Ll/ܰۙ;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v1, p2}, Ll/ܰۙ;->֫(Ljava/lang/CharSequence;)V

    .line 61
    invoke-static {p3}, Ll/ۙ۬;->ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object p2

    invoke-virtual {v1, p2}, Ll/ܰۙ;->֫(Ll/ۙ۬;)V

    .line 62
    invoke-virtual {v1, p1}, Ll/ܰۙ;->֫(Landroid/content/Intent;)V

    .line 63
    invoke-virtual {v1}, Ll/ܰۙ;->֫()Ll/۟ۙ;

    move-result-object p1

    const/4 p2, 0x0

    const p4, 0x7f120207

    const/4 v1, 0x1

    const v3, 0x7f12020a

    if-eqz v0, :cond_2

    .line 65
    invoke-static {v2, p1}, Ll/ܽۗ;->ۧ(Landroid/content/Context;Ll/۟ۙ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {p1}, Ll/۟ۙ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lbin/mt/plus/ShortcutActivity;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 67
    invoke-static {v3}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1

    .line 70
    :cond_1
    invoke-static {p4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return p2

    .line 74
    :cond_2
    invoke-static {v2, p1}, Ll/ܽۗ;->ܽ(Landroid/content/Context;Ll/۟ۙ;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 75
    iget p1, p0, Ll/ۤ᩹᩷;->ۧ:I

    if-nez p1, :cond_3

    .line 76
    invoke-static {v3}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1

    .line 78
    :cond_3
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const p2, 0x7f120491

    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(I)V

    const p2, 0x7f120208

    .line 79
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(I)V

    const p2, 0x7f120189

    const/4 p3, 0x0

    .line 80
    invoke-virtual {p1, p2, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 81
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v1

    .line 85
    :cond_4
    invoke-static {p4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return p2
.end method
