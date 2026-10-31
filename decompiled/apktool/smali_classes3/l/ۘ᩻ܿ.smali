.class public final Ll/ۘ᩻ܿ;
.super Ll/ۖ᩻ܿ;
.source "L7JF"


# instance fields
.field public ֫:Landroid/graphics/drawable/Drawable;

.field public ۜ:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Z

.field public ܿ:Ll/ۤۤ;

.field public final ᩳ:Ljava/lang/String;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ll/ۖ᩻ܿ;-><init>()V

    .line 39
    iput-object p1, p0, Ll/ۘ᩻ܿ;->ᩳ:Ljava/lang/String;

    .line 40
    iput-boolean p2, p0, Ll/ۘ᩻ܿ;->ܽ:Z

    const-string p2, ":"

    const/4 v0, 0x3

    .line 41
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    .line 43
    aget-object p2, p1, p2

    iput-object p2, p0, Ll/ۘ᩻ܿ;->ܳ:Ljava/lang/String;

    const/4 p2, 0x2

    .line 44
    aget-object p1, p1, p2

    iput-object p1, p0, Ll/ۘ᩻ܿ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method private ۜ()V
    .locals 8

    .line 56
    invoke-static {}, Ll/ܶܳ᩷;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    .line 58
    iget-object v2, p0, Ll/ۘ᩻ܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۘ᩻ܿ;->ۜ:I

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 62
    iput-object v2, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    .line 63
    iput-object v2, p0, Ll/ۘ᩻ܿ;->֫:Landroid/graphics/drawable/Drawable;

    .line 65
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->᩷()Ll/ۤۤ;

    move-result-object v3

    .line 66
    iget-object v4, v3, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v4, Ll/ܽܳ᩷;
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    :try_start_1
    iget-object v2, v3, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v2, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    .line 68
    invoke-virtual {v4}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->name()Ljava/lang/String;

    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_1

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_1

    .line 183
    check-cast v3, Ll/ۤ᩻᩷;

    invoke-virtual {v3, v5}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v5, v3

    .line 68
    :cond_1
    iput-object v5, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    .line 69
    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->icon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Ll/ۘ᩻ܿ;->֫:Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_0

    :catchall_1
    move-exception v3

    move-object v4, v2

    move-object v2, v3

    .line 75
    :goto_0
    iget-object v3, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    if-nez v3, :cond_2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    :cond_2
    if-eqz v4, :cond_3

    .line 79
    invoke-virtual {v4, v2}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    move-exception v2

    .line 71
    iget-object v3, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    if-nez v3, :cond_3

    .line 72
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    .line 82
    :cond_3
    :goto_1
    iput-object v0, p0, Ll/ۘ᩻ܿ;->᩻:Ljava/lang/String;

    .line 83
    iput v1, p0, Ll/ۘ᩻ܿ;->ۜ:I

    return-void
.end method

.method private declared-synchronized ᩷()Ll/ۤۤ;
    .locals 10

    const-string v1, "["

    const-string v2, "["

    move-object v0, p0

    .line 5
    monitor-enter v0

    .line 88
    :try_start_0
    iget-object v3, p0, Ll/ۘ᩻ܿ;->ܳ:Ljava/lang/String;

    invoke-static {v3}, Ll/۬ܿ᩷;->ܽ(Ljava/lang/String;)Ll/ܽܳ᩷;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_8

    .line 92
    invoke-virtual {v3}, Ll/ܽܳ᩷;->۠()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 95
    invoke-virtual {v3}, Ll/ܽܳ᩷;->᩶()Z

    move-result v6

    const v7, 0x7f12076d

    if-eqz v6, :cond_6

    .line 98
    iget-object v6, p0, Ll/ۘ᩻ܿ;->ܿ:Ll/ۤۤ;

    if-eqz v6, :cond_0

    iget-object v8, v6, Ll/ۤۤ;->֫:Ljava/lang/Object;

    if-ne v8, v3, :cond_0

    iget-object v6, v6, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v6, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    invoke-interface {v6}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v6

    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v8

    if-ne v6, v8, :cond_0

    .line 99
    iget-object v1, p0, Ll/ۘ᩻ܿ;->ܿ:Ll/ۤۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 101
    :cond_0
    :try_start_1
    iget-boolean v6, p0, Ll/ۘ᩻ܿ;->ܽ:Z

    if-eqz v6, :cond_1

    .line 102
    iget-object v6, p0, Ll/ۘ᩻ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ll/ܽܳ᩷;->֫(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    goto :goto_0

    .line 103
    :cond_1
    iget-object v6, p0, Ll/ۘ᩻ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ll/ܽܳ᩷;->ܽ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v6, :cond_5

    .line 109
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    .line 110
    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v6

    invoke-interface {v2, v6}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 111
    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->isEnabled()Z

    move-result v6

    if-nez v6, :cond_3

    .line 112
    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v6

    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->name()Ljava/lang/String;

    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x3

    if-lt v8, v9, :cond_2

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x7b

    if-ne v8, v9, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v4

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x7d

    if-ne v8, v9, :cond_2

    .line 183
    check-cast v6, Ll/ۤ᩻᩷;

    invoke-virtual {v6, v2}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    move-object v2, v6

    .line 113
    :cond_2
    new-instance v6, Ll/ܳۨۡ;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v5

    const v1, 0x7f120768

    .line 113
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v6, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 113
    throw v6

    .line 84
    :cond_3
    new-instance v1, Ll/ۤۤ;

    invoke-direct {v1, v3, v2}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    iput-object v1, p0, Ll/ۘ᩻ܿ;->ܿ:Ll/ۤۤ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catch_0
    move-exception v1

    .line 118
    :try_start_3
    instance-of v2, v1, Ll/ܳۨۡ;

    if-eqz v2, :cond_4

    check-cast v1, Ll/ܳۨۡ;

    .line 119
    throw v1

    .line 121
    :cond_4
    invoke-virtual {v3, v1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    .line 122
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v5

    invoke-static {v7, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 122
    throw v1

    .line 105
    :cond_5
    new-instance v1, Ll/ܳۨۡ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۘ᩻ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v5

    const v2, 0x7f120769

    .line 105
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 105
    throw v1

    .line 96
    :cond_6
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v5

    invoke-static {v7, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 96
    throw v1

    .line 93
    :cond_7
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v5

    const v2, 0x7f120776

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 93
    throw v1

    .line 90
    :cond_8
    new-instance v1, Ll/ܳۨۡ;

    iget-object v2, p0, Ll/ۘ᩻ܿ;->ܳ:Ljava/lang/String;

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v5

    const v2, 0x7f120778

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 90
    throw v1

    :catchall_0
    move-exception v1

    .line 122
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 172
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->ۜ()V

    .line 173
    iget-object p1, p0, Ll/ۘ᩻ܿ;->֫:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 175
    sget-object v0, Ll/᩹֡᩷;->ۜ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-object p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۘ᩻ܿ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 4

    .line 181
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۗܺ᩷;

    if-nez p1, :cond_0

    const-string p1, "Cannot get the activity"

    .line 183
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 188
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->᩷()Ll/ۤۤ;

    move-result-object v1

    .line 189
    iget-object v2, v1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 190
    :try_start_1
    new-instance v0, Ll/ᩳۢ᩷;

    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-direct {v0, v3, p1}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 191
    iget-object p1, v1, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p1, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->onPluginButtonClick(Lbin/mt/plugin/api/ui/PluginUI;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    move-object v0, v2

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v0, :cond_1

    .line 194
    invoke-virtual {v0, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 6

    .line 201
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    if-nez v0, :cond_0

    const-string p1, "Cannot get the activity"

    .line 203
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 208
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->᩷()Ll/ۤۤ;

    move-result-object v2

    .line 209
    iget-object v3, v2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v3, Ll/ܽܳ᩷;
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 210
    :try_start_1
    new-instance v4, Ll/ᩳۢ᩷;

    invoke-virtual {v3}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 211
    new-instance v5, Ll/ܿ۫ᩳ;

    invoke-direct {v5, p1}, Ll/ܿ۫ᩳ;-><init>(Ll/۫ۨᩳ;)V

    .line 212
    iget-object p1, v2, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p1, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    invoke-interface {p1, v4, v5}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->onMenuClick(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/editor/TextEditor;)V
    :try_end_1
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v3, v1

    .line 546
    :goto_0
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v3, :cond_1

    .line 218
    invoke-virtual {v3, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    move-exception p1

    .line 214
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/۫ۨᩳ;ZZII)Z
    .locals 0

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 149
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->᩷()Ll/ۤۤ;

    move-result-object p4

    .line 150
    iget-object p5, p4, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast p5, Ll/ܽܳ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 151
    :try_start_1
    iget-object p3, p4, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p3, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    .line 152
    invoke-interface {p3}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->isEnabled()Z

    move-result p4

    if-nez p4, :cond_0

    return p2

    .line 155
    :cond_0
    new-instance p4, Ll/ܿ۫ᩳ;

    invoke-direct {p4, p1}, Ll/ܿ۫ᩳ;-><init>(Ll/۫ۨᩳ;)V

    invoke-interface {p3, p4}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->checkVisible(Lbin/mt/plugin/api/editor/TextEditor;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return p1

    :catchall_0
    move-exception p1

    move-object p3, p5

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz p3, :cond_1

    .line 158
    invoke-virtual {p3, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    :cond_1
    return p2
.end method

.method public final ۧ()Ll/ܺ᩻ܿ;
    .locals 2

    .line 166
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->ۜ()V

    .line 167
    new-instance v0, Ll/ܺ᩻ܿ;

    iget-object v1, p0, Ll/ۘ᩻ܿ;->᩷:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Ll/ܺ᩻ܿ;-><init>(Ljava/lang/CharSequence;Ll/ۖ᩻ܿ;)V

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۘ᩻ܿ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۘ᩻ܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 3

    const/4 v0, 0x0

    .line 134
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩻ܿ;->᩷()Ll/ۤۤ;

    move-result-object v1

    .line 135
    iget-object v2, v1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 136
    :try_start_1
    iget-object v0, v1, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;

    invoke-interface {v0}, Lbin/mt/plugin/api/editor/TextEditorBaseMenu;->isEnabled()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :catchall_1
    move-exception v1

    :goto_0
    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {v0, v1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
