.class public final Ll/ۛ֨ܿ;
.super Ljava/lang/Object;
.source "113M"


# static fields
.field public static ᩳ:Z


# instance fields
.field public ֫:Ll/ۗܺ᩷;

.field public ۧ:Ll/ܶ᩵ܿ;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/ۛ֨ܿ;->ᩳ:Z

    return-void
.end method

.method public static ֫(Ll/ۛ֡ܿ;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 242
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 243
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    invoke-interface {p0}, Ll/ۛ֡ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/high16 p0, 0x10000000

    .line 245
    invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 246
    invoke-static {v0, p1}, Ll/ۖ᩺ۘ;->֫(Landroid/content/Intent;Landroid/net/Uri;)V

    return-object v0
.end method

.method public static ֫(Landroid/content/pm/PackageManager;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ljava/util/List;
    .locals 6

    .line 202
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 203
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 204
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۚ()Z

    move-result v2

    const/high16 v3, 0x10000

    if-eqz v2, :cond_0

    .line 205
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 206
    invoke-virtual {p0, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 207
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    const/4 v5, 0x1

    .line 208
    invoke-static {v1, v4, v5}, Ll/ۛ֨ܿ;->֫(Ljava/util/HashMap;Landroid/content/pm/ResolveInfo;Z)V

    goto :goto_0

    .line 211
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 212
    invoke-virtual {p0, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 213
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    const/4 v3, 0x0

    .line 214
    invoke-static {v1, v2, v3}, Ll/ۛ֨ܿ;->֫(Ljava/util/HashMap;Landroid/content/pm/ResolveInfo;Z)V

    goto :goto_1

    .line 216
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "*/*"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 217
    invoke-static {p0, p1, v0}, Ll/ۛ֨ܿ;->֫(Landroid/content/pm/PackageManager;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 219
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;
    .locals 1

    .line 34
    new-instance v0, Ll/ۛ֨ܿ;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p0, v0, Ll/ۛ֨ܿ;->֫:Ll/ۗܺ᩷;

    .line 39
    iput-object p1, v0, Ll/ۛ֨ܿ;->ۧ:Ll/ܶ᩵ܿ;

    .line 40
    iput-object p2, v0, Ll/ۛ֨ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ljava/util/HashMap;Landroid/content/pm/ResolveInfo;Z)V
    .locals 3

    .line 223
    iget-object v0, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v1, "bin.mt.plus"

    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "bin.mt.plus.canary"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "/"

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 228
    iget-object v1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֨ܿ;

    if-nez v1, :cond_1

    .line 231
    new-instance v1, Ll/ۗ֨ܿ;

    invoke-direct {v1, p1}, Ll/ۗ֨ܿ;-><init>(Landroid/content/pm/ResolveInfo;)V

    .line 232
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    .line 235
    invoke-virtual {v1}, Ll/ۗ֨ܿ;->᩻()V

    return-void

    .line 237
    :cond_2
    invoke-virtual {v1}, Ll/ۗ֨ܿ;->ܳ()V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۛ֨ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "default"

    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    :cond_0
    iget-object p1, p0, Ll/ۛ֨ܿ;->ܽ:Ljava/lang/String;

    .line 60
    :cond_1
    iget-object v0, p0, Ll/ۛ֨ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Ll/ۛ֨ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-static {v0, v1, p1}, Ll/ۛ֨ܿ;->֫(Landroid/content/pm/PackageManager;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֡ܿ;)V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۛ֨ܿ;->֫:Ll/ۗܺ᩷;

    invoke-interface {p1}, Ll/ۛ֡ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۛ֡ܿ;Ll/ܶ᩵ܿ;Z)V
    .locals 10

    const-string v0, "bin.mt.filetransfer"

    .line 72
    iget-object v1, p0, Ll/ۛ֨ܿ;->ܽ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۛ֨ܿ;->֫:Ll/ۗܺ᩷;

    invoke-interface {p1}, Ll/ۛ֡ܿ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p1}, Ll/ۛ֡ܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 v3, 0x0

    if-eqz p3, :cond_2

    .line 77
    :try_start_0
    invoke-static {p2}, Ll/ۨ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 78
    invoke-virtual {v2, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 546
    invoke-virtual {v2, p1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 87
    :cond_2
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۚ()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-interface {p1}, Ll/ۛ֡ܿ;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_e

    .line 88
    invoke-interface {p1}, Ll/ۛ֡ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p3

    const/4 v4, 0x0

    .line 139
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, p3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    .line 140
    iget p3, p3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 p3, -0x1

    :goto_1
    const/16 v5, 0x1d

    if-lt p3, v5, :cond_3

    goto/16 :goto_3

    .line 98
    :cond_3
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object p3

    invoke-static {p1, p3, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    .line 99
    sget-boolean v5, Ll/ۛ֨ܿ;->ᩳ:Z

    if-eqz v5, :cond_4

    .line 101
    :try_start_2
    invoke-virtual {v2, p3}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_4

    :catch_2
    nop

    .line 107
    :cond_4
    invoke-static {}, Ll/ۢ֨ۢ;->ܿ()Ll/ۤۚۢ;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_c

    .line 108
    invoke-interface {v5}, Ll/ۤۚۢ;->ۧ()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 151
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "am start"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    const-string v9, " -a "

    .line 154
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    :cond_5
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v8

    if-eqz v8, :cond_6

    const-string v9, " -n "

    .line 158
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    :cond_6
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v8

    if-eqz v8, :cond_7

    const-string v9, " -d "

    .line 162
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    :cond_7
    invoke-virtual {p3}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    const-string v9, " -t "

    .line 166
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const-string v8, "android.intent.extra.STREAM"

    .line 168
    invoke-virtual {p3, v8}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Landroid/net/Uri;

    if-eqz v8, :cond_9

    const-string v9, " --eu android.intent.extra.STREAM "

    .line 170
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    :cond_9
    invoke-virtual {p3}, Landroid/content/Intent;->getFlags()I

    move-result v8

    if-eqz v8, :cond_a

    const-string v9, " -f "

    .line 174
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v8, v6, v4

    const-string v8, "0x%08x"

    invoke-static {v8, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    :cond_a
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 110
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Cmd: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 111
    invoke-interface {v5, v6}, Ll/ۤۚۢ;->֫(Ljava/lang/String;)Ll/۫ۚۢ;

    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ll/۫ۚۢ;->ۧ()Z

    move-result v6

    iget-object v5, v5, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    if-eqz v6, :cond_f

    const-string v6, "Warning"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_4

    .line 115
    :cond_b
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v7, "Start activity with shell failed: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 194
    :cond_c
    :try_start_3
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v4, 0x1

    goto :goto_2

    :catch_3
    nop

    :goto_2
    if-eqz v4, :cond_d

    .line 118
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 119
    new-instance v5, Landroid/content/ComponentName;

    const-string v6, "bin.mt.filetransfer.Main"

    invoke-direct {v5, v0, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v0, "intent"

    .line 120
    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 122
    :try_start_4
    invoke-virtual {v2, v4}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    .line 130
    :catch_4
    :cond_d
    :try_start_5
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 131
    invoke-virtual {v2, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    goto :goto_4

    .line 90
    :cond_e
    :goto_3
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 91
    invoke-virtual {v2, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_4

    :catch_5
    move-exception p1

    .line 546
    invoke-virtual {v2, p1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_f
    :goto_4
    return-void
.end method

.method public final ۧ(Ll/ۛ֡ܿ;)V
    .locals 2

    .line 64
    iget-object v0, p0, Ll/ۛ֨ܿ;->ۧ:Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    .line 68
    invoke-virtual {p0, p1, v0, v1}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Ll/ܶ᩵ܿ;Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 181
    sget-boolean v0, Ll/ۛ֨ܿ;->ᩳ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 183
    :cond_0
    iget-object v0, p0, Ll/ۛ֨ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 185
    :cond_1
    invoke-static {}, Ll/ۢ֨ۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return v1

    :cond_2
    :try_start_0
    const-string v0, "bin.mt.filetransfer"

    .line 194
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    const/4 v0, 0x1

    return v0
.end method
