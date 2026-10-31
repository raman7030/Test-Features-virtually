.class public final Ll/ᩳᩴܿ;
.super Ljava/lang/Object;
.source "B9A2"

# interfaces
.implements Ll/ܽᩴܿ;


# static fields
.field public static final ۧ:Landroid/content/ComponentName;


# instance fields
.field public final ֫:Landroid/content/pm/PackageInfo;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 123
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.xiaomi.aiasst.vision"

    const-string v2, "com.xiaomi.aiasst.vision.control.translation.AiTranslateService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ᩳᩴܿ;->ۧ:Landroid/content/ComponentName;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;)V
    .locals 2

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    sget-object v0, Ll/ᩳᩴܿ;->ۧ:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳᩴܿ;->֫:Landroid/content/pm/PackageInfo;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 141
    sget-object v0, Ll/ᩳᩴܿ;->ۧ:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Landroid/content/pm/PackageManager;)Ljava/lang/String;
    .locals 1

    .line 133
    :try_start_0
    iget-object v0, p0, Ll/ᩳᩴܿ;->֫:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫ۨᩳ;)Z
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    new-array v0, v0, [I

    .line 147
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 148
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 149
    invoke-virtual {p1, v3}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 150
    aget v4, v0, v1

    aget v0, v0, v2

    invoke-virtual {v3, v4, v0}, Landroid/graphics/Rect;->offset(II)V

    .line 151
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 152
    sget-object v4, Ll/ᩳᩴܿ;->ۧ:Landroid/content/ComponentName;

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 153
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "from"

    const-string v6, "system_edit_box"

    .line 154
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "text"

    .line 155
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۙ֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "floatingWindowType"

    const-string v6, "startDictionaryTranslationWindow"

    .line 156
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "rawX"

    .line 157
    iget v6, v3, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "rawY"

    .line 158
    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4, v5, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 159
    invoke-virtual {v0, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 160
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    move-exception v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Landroid/os/TransactionTooLargeException;

    if-eqz v3, :cond_0

    const p1, 0x7f120933

    .line 164
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v2

    .line 167
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    instance-of v2, p1, Ll/ۗܺ᩷;

    if-eqz v2, :cond_1

    check-cast p1, Ll/ۗܺ᩷;

    const/4 v2, 0x0

    .line 546
    invoke-virtual {p1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 170
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    :goto_0
    return v1
.end method
