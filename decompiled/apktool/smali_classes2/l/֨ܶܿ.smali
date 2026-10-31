.class public final Ll/֨ܶܿ;
.super Ljava/lang/Object;
.source "89SC"


# static fields
.field public static final ֫:Ll/ۡۤۡ;

.field public static final ۧ:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 26
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    sput-object v0, Ll/֨ܶܿ;->֫:Ll/ۡۤۡ;

    .line 27
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/֨ܶܿ;->ۧ:Ll/ۚۡ֫;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 31
    new-instance v1, Ll/ۘܳۜ;

    invoke-direct {v1, v0, p0}, Ll/ۘܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    new-instance v0, Ll/֡ܶܿ;

    invoke-direct {v0, v1}, Ll/֡ܶܿ;-><init>(Ll/ۘܳۜ;)V

    sget-object v1, Ll/֨ܶܿ;->ۧ:Ll/ۚۡ֫;

    invoke-virtual {v1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/ۡܶܿ;)V
    .locals 6

    .line 65
    sget-object v0, Ll/֨ܶܿ;->֫:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p0}, Ll/ܳ᩸ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.android.externalstorage.documents"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 73
    :cond_1
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 74
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.content.action.DOCUMENTS_PROVIDER"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 75
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 76
    iget-object v5, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    iget-object v5, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 78
    :try_start_0
    iget-object v0, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 79
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 80
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v3

    const v2, 0x7f120511

    .line 81
    invoke-static {v2, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 82
    new-instance v3, Ll/᩵ܶܿ;

    invoke-direct {v3, p0, v0, v1}, Ll/᩵ܶܿ;-><init>(Ll/ۡܶܿ;Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 101
    new-instance p0, Ll/ۚܶܿ;

    invoke-direct {p0, v2, v3}, Ll/ۚܶܿ;-><init>(Ljava/lang/String;Ll/᩵ܶܿ;)V

    .line 102
    sget-object v0, Ll/֨ܶܿ;->ۧ:Ll/ۚۡ֫;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method
