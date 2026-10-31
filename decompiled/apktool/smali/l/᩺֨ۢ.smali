.class public final Ll/᩺֨ۢ;
.super Ljava/lang/Object;
.source "85H5"


# static fields
.field public static final ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩺֨ۢ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1388

    if-ge v0, v1, :cond_1

    .line 34
    :try_start_0
    invoke-static {v0}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 36
    sget-object v2, Ll/᩺֨ۢ;->֫:Ljava/util/ArrayList;

    new-instance v3, Ll/ۨ֨ۢ;

    invoke-direct {v3, v0, v1}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2328

    :goto_1
    const/16 v1, 0x2710

    if-ge v0, v1, :cond_3

    .line 34
    :try_start_1
    invoke-static {v0}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 36
    sget-object v2, Ll/᩺֨ۢ;->֫:Ljava/util/ArrayList;

    new-instance v3, Ll/ۨ֨ۢ;

    invoke-direct {v3, v0, v1}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static ֫()Ljava/util/ArrayList;
    .locals 10

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    .line 87
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v1

    .line 88
    new-instance v3, Ll/ᩴۢᩴ;

    sget-object v4, Ll/᩺֨ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v3, v5}, Ll/ᩴۢᩴ;-><init>(I)V

    .line 89
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 90
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 91
    iget-object v5, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v5, :cond_0

    .line 92
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    const/16 v7, 0x2710

    if-lt v6, v7, :cond_0

    invoke-virtual {v3, v6}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v6, :cond_0

    .line 94
    :try_start_1
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-static {v6}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 96
    iget v8, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-virtual {v3, v8}, Ll/ᩴۢᩴ;->add(I)Z

    .line 97
    new-instance v8, Ll/ۨ֨ۢ;

    iget v9, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-direct {v8, v9, v6, v4, v2}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;Landroid/content/pm/PackageInfo;I)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_1
    sget-boolean v6, Lbin/mt/plus/Features;->ۧ:Z

    if-eqz v6, :cond_2

    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v6, v7

    invoke-virtual {v3, v6}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v6

    if-nez v6, :cond_2

    .line 100
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v6, v7

    invoke-static {v6}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 102
    iget v8, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v8, v7

    invoke-virtual {v3, v8}, Ll/ᩴۢᩴ;->add(I)Z

    .line 103
    new-instance v8, Ll/ۨ֨ۢ;

    iget v9, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v9, v7

    invoke-direct {v8, v9, v6, v4, v2}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;Landroid/content/pm/PackageInfo;I)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_2
    sget-boolean v6, Lbin/mt/plus/Features;->֫:Z

    if-eqz v6, :cond_3

    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/lit16 v6, v6, 0x4e20

    invoke-virtual {v3, v6}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v6

    if-nez v6, :cond_3

    .line 107
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/lit16 v6, v6, 0x4e20

    invoke-static {v6}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 109
    iget v7, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/lit16 v7, v7, 0x4e20

    invoke-virtual {v3, v7}, Ll/ᩴۢᩴ;->add(I)Z

    .line 110
    new-instance v7, Ll/ۨ֨ۢ;

    iget v8, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/lit16 v8, v8, 0x4e20

    invoke-direct {v7, v8, v6, v4, v2}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;Landroid/content/pm/PackageInfo;I)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    :cond_3
    sget-boolean v6, Lbin/mt/plus/Features;->ܽ:Z

    if-eqz v6, :cond_0

    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    const v7, 0x5f45a60

    add-int/2addr v6, v7

    invoke-virtual {v3, v6}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v6

    if-nez v6, :cond_0

    .line 114
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v6, v7

    invoke-static {v6}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 116
    iget v8, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v8, v7

    invoke-virtual {v3, v8}, Ll/ᩴۢᩴ;->add(I)Z

    .line 117
    new-instance v8, Ll/ۨ֨ۢ;

    iget v5, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    add-int/2addr v5, v7

    invoke-direct {v8, v5, v6, v4, v2}, Ll/ۨ֨ۢ;-><init>(ILjava/lang/String;Landroid/content/pm/PackageInfo;I)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 127
    :catch_0
    :cond_4
    new-instance v1, Ll/ۛ֨ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۛ֨ۢ;-><init>(I)V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ۧ()Ljava/util/List;
    .locals 1

    .line 80
    sget-object v0, Ll/᩺֨ۢ;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
