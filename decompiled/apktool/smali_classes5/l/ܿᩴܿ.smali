.class public final Ll/ܿᩴܿ;
.super Ljava/lang/Object;
.source "B9A2"

# interfaces
.implements Ll/ܽᩴܿ;


# instance fields
.field public final ֫:Landroid/content/ComponentName;

.field public final ۧ:Landroid/content/pm/ResolveInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/ResolveInfo;)V
    .locals 2

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Ll/ܿᩴܿ;->ۧ:Landroid/content/pm/ResolveInfo;

    .line 184
    new-instance v0, Landroid/content/ComponentName;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ܿᩴܿ;->֫:Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ܿᩴܿ;->֫:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ܿᩴܿ;->ۧ:Landroid/content/pm/ResolveInfo;

    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 191
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 192
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    .line 195
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " - "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫ۨᩳ;)Z
    .locals 3

    .line 208
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 209
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PROCESS_TEXT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 210
    iget-object v1, p0, Ll/ܿᩴܿ;->֫:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v1, "text/plain"

    .line 211
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.PROCESS_TEXT"

    .line 212
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۙ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.PROCESS_TEXT_READONLY"

    const/4 v2, 0x1

    .line 213
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 215
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception p1

    .line 218
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Landroid/os/TransactionTooLargeException;

    if-eqz p1, :cond_0

    const p1, 0x7f120933

    .line 219
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
