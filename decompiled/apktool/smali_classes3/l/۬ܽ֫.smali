.class public Ll/۬ܽ֫;
.super Ljava/lang/Object;
.source "UB1K"


# virtual methods
.method public ֫(Landroid/content/pm/ResolveInfo;)Landroid/content/pm/ProviderInfo;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    const/16 v0, 0x40

    .line 270
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 272
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    return-object p1
.end method
