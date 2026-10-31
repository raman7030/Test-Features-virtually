.class public final Ll/᩸ۛ᩻;
.super Ljava/lang/Object;
.source "A6XK"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/ۤۢۜ;

.field public static ܳ:Ljava/lang/String;

.field public static ܽ:Ll/۟ۢۜ;

.field public static ܿ:Z

.field public static ᩳ:Ll/ܳۤ᩻;

.field public static ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Ll/ۤۢۜ;

    new-instance v1, Ll/֡ۛ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Ll/ۤۢۜ;-><init>(Ll/֡ۛ᩻;)V

    sput-object v0, Ll/᩸ۛ᩻;->ۧ:Ll/ۤۢۜ;

    .line 53
    invoke-static {}, Ll/᩸ۛ᩻;->᩻()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/high16 v0, 0x1000000

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x1000000

    or-int/2addr p0, v0

    :cond_1
    :goto_0
    return p0
.end method

.method public static ֫(Landroid/content/Context;I)I
    .locals 3

    .line 222
    invoke-static {p1}, Ll/᩸ۛ᩻;->֫(I)I

    move-result p1

    const/high16 v0, 0x1000000

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return p1

    .line 226
    :cond_1
    :goto_0
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 227
    invoke-static {}, Ll/ᩳ۬᩷;->ۢ֫()I

    move-result v2

    invoke-direct {v1, p0, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    if-ne p1, v0, :cond_2

    const p0, 0x7f04011a

    goto :goto_1

    :cond_2
    const p0, 0x7f0400f3

    .line 232
    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    .line 130
    invoke-static {p1, p0}, Ll/᩸֡᩷;->ۧ(Landroid/content/res/Resources$Theme;I)I

    move-result p0

    return p0
.end method

.method public static ֫()Ljava/lang/String;
    .locals 2

    .line 450
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    const-string v1, "MT2"

    .line 451
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "mcp"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 450
    invoke-static {v0}, Ll/ܿ֡ܿ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 416
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 417
    invoke-static {}, Ll/᩸ۛ᩻;->֫()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "homePath"

    .line 420
    invoke-static {p0, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    :goto_0
    invoke-static {p0}, Ll/᩸ۛ᩻;->᩻(Ljava/lang/String;)Ll/۠ۛ᩻;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p0

    .line 265
    :cond_1
    new-instance p0, Ll/ܶۛ᩻;

    invoke-direct {p0, v0}, Ll/ܶۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    throw p0

    .line 422
    :catch_0
    new-instance p0, Ll/ܶۛ᩻;

    sget-object v0, Ll/۠ۛ᩻;->۬:Ll/۠ۛ᩻;

    invoke-direct {p0, v0}, Ll/ܶۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    throw p0
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    :try_start_0
    const-string v1, "/"

    .line 141
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 144
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-object v2, v2, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    .line 147
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    .line 148
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۢۜ;

    iget-object v6, v6, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v6, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v3, v5

    .line 149
    :cond_0
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۢۜ;

    iget-object v6, v6, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_1

    move v4, v5

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-ltz v3, :cond_4

    if-ltz v4, :cond_4

    if-ne v3, v4, :cond_3

    .line 152
    monitor-exit v0

    return-void

    .line 153
    :cond_3
    :try_start_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰۢۜ;

    invoke-virtual {v1, v4, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 154
    new-instance p0, Ll/ܳۤ᩻;

    invoke-direct {p0, v1, v2}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    invoke-static {p0}, Ll/᩸ۛ᩻;->֫(Ll/ܳۤ᩻;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    monitor-exit v0

    return-void

    .line 151
    :cond_4
    :try_start_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "File access rule no longer exists"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 142
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Root rule cannot be reordered"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;Ll/ۛۢۜ;)V
    .locals 6

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 119
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-object v2, v2, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 120
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 121
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۢۜ;

    .line 122
    iget-object v5, v4, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 123
    new-instance v5, Ll/ܰۢۜ;

    iget-object v4, v4, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v5, p0, v4, p1, v2}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    invoke-virtual {v1, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    new-instance p0, Ll/ܳۤ᩻;

    invoke-direct {p0, v1, v2}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    invoke-static {p0}, Ll/᩸ۛ᩻;->֫(Ll/ܳۤ᩻;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 128
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "File access rule no longer exists"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ll/ܰۢۜ;Ll/ۛۢۜ;)V
    .locals 5

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 111
    :try_start_0
    iget-object v1, p0, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ll/᩸ۛ᩻;->ᩳ(Ljava/lang/String;)V

    .line 112
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-object v2, v2, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 113
    new-instance v2, Ll/ܰۢۜ;

    iget-object v3, p0, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    iget-object p0, p0, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {v2, v3, p0, p1, v4}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 114
    new-instance p0, Ll/ܳۤ᩻;

    invoke-direct {p0, v1, v4}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    invoke-static {p0}, Ll/᩸ۛ᩻;->֫(Ll/ܳۤ᩻;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܳۤ᩻;)V
    .locals 3

    .line 171
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "amfa"

    invoke-virtual {p0}, Ll/ܳۤ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 172
    sput-object p0, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    const/4 p0, 0x0

    .line 173
    sput-object p0, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;

    return-void
.end method

.method public static ֫(ZZ)V
    .locals 2

    .line 318
    sput-boolean p0, Ll/᩸ۛ᩻;->ܿ:Z

    .line 319
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "amfw"

    .line 320
    invoke-interface {v0, v1, p0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p0

    const-string v0, "floating_button_stick_to_edge"

    .line 321
    invoke-interface {p0, v0, p1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p0

    .line 322
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static declared-synchronized ۧ()Ll/۟ۢۜ;
    .locals 4

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 80
    :try_start_0
    sget-object v1, Ll/᩸ۛ᩻;->ۧ:Ll/ۤۢۜ;

    invoke-virtual {v1}, Ll/ۤۢۜ;->֫()Ljava/util/List;

    move-result-object v1

    .line 81
    sget-object v2, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;

    if-eqz v2, :cond_0

    iget-object v2, v2, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    sget-object v3, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;

    iget-object v2, v2, Ll/۟ۢۜ;->ܽ:Ljava/util/List;

    .line 83
    invoke-interface {v2, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 84
    :cond_0
    sget-object v2, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    sget-object v3, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ll/ܳۤ᩻;->֫(Ljava/lang/String;Ljava/util/List;)Ll/۟ۢۜ;

    move-result-object v1

    sput-object v1, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;

    .line 86
    :cond_1
    sget-object v1, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ܰۢۜ;
    .locals 4

    const-string v0, "path"

    .line 96
    invoke-static {p0, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 97
    const-class v0, Ll/᩸ۛ᩻;

    monitor-enter v0

    .line 98
    :try_start_0
    invoke-static {p0}, Ll/᩸ۛ᩻;->ᩳ(Ljava/lang/String;)V

    .line 99
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 100
    invoke-static {p0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    .line 101
    sget-object v2, Ll/֨ۛ᩻;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 103
    sget-object v1, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    goto :goto_0

    .line 104
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Rule target must be an existing file or directory"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 102
    :cond_1
    sget-object v1, Ll/ۜܺۜ;->ۙ:Ll/ۜܺۜ;

    .line 106
    :goto_0
    new-instance v2, Ll/ܰۢۜ;

    sget-object v3, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    invoke-direct {v2, p0, v1, v3, v0}, Ll/ܰۢۜ;-><init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V

    return-object v2

    :catchall_0
    move-exception p0

    .line 99
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ܳ(Ljava/lang/String;)V
    .locals 3

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 281
    :try_start_0
    invoke-static {p0}, Ll/᩸ۗۡ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 285
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sput v1, Ll/᩸ۛ᩻;->᩻:I

    .line 286
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "amp"

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-interface {v1, p0, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    monitor-exit v0

    return-void

    .line 283
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid MCP port"

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 287
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܳ()Z
    .locals 1

    .line 180
    sget-boolean v0, Ll/᩸ۛ᩻;->ܿ:Z

    return v0
.end method

.method public static declared-synchronized ܽ()Ll/ܶ᩵ܿ;
    .locals 3

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 73
    :try_start_0
    sget-object v1, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ܽ(Ljava/lang/String;)V
    .locals 4

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    :try_start_0
    const-string v1, "/"

    .line 133
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 134
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-object v2, v2, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    new-instance v2, Ll/ۚۛ᩻;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll/ۚۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 136
    new-instance p0, Ll/ܳۤ᩻;

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Ll/ܳۤ᩻;-><init>(Ljava/util/List;Z)V

    invoke-static {p0}, Ll/᩸ۛ᩻;->֫(Ll/ܳۤ᩻;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit v0

    return-void

    .line 133
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Root rule cannot be removed"

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 137
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܿ(Ljava/lang/String;)V
    .locals 3

    .line 383
    invoke-static {p0}, Ll/᩸ۛ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 384
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 385
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 387
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 388
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 390
    :catch_0
    new-instance p0, Ll/ܶۛ᩻;

    sget-object v0, Ll/۠ۛ᩻;->᩶:Ll/۠ۛ᩻;

    invoke-direct {p0, v0}, Ll/ܶۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    throw p0

    .line 393
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    const-class v0, Ll/᩸ۛ᩻;

    monitor-enter v0

    .line 458
    :try_start_1
    sput-object p0, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    .line 275
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "amop"

    invoke-interface {v1, v2, p0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 276
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 394
    :cond_1
    new-instance p0, Ll/ܶۛ᩻;

    sget-object v0, Ll/۠ۛ᩻;->᩶:Ll/۠ۛ᩻;

    invoke-direct {p0, v0}, Ll/ܶۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    throw p0
.end method

.method public static declared-synchronized ܿ()Z
    .locals 2

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 91
    :try_start_0
    sget-object v1, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-boolean v1, v1, Ll/ܳۤ᩻;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ᩳ()I
    .locals 1

    .line 66
    sget v0, Ll/᩸ۛ᩻;->᩻:I

    return v0
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 2

    .line 159
    sget-object v0, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    sget-object v1, Ll/᩸ۛ᩻;->ۧ:Ll/ۤۢۜ;

    invoke-virtual {v1}, Ll/ۤۢۜ;->֫()Ljava/util/List;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/ܳۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 162
    sget-object v0, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    iget-object v0, v0, Ll/ܳۤ᩻;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۢۜ;

    .line 163
    iget-object v1, v1, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Duplicate file access rule path"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void

    .line 160
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "File access rule is shadowed by Home or managed paths"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩻(Ljava/lang/String;)Ll/۠ۛ᩻;
    .locals 2

    .line 431
    sget-object v0, Ll/᩸ۛ᩻;->ۧ:Ll/ۤۢۜ;

    invoke-virtual {v0}, Ll/ۤۢۜ;->֫()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 432
    invoke-static {p0, v1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 433
    sget-object p0, Ll/۠ۛ᩻;->ۗ:Ll/۠ۛ᩻;

    return-object p0

    .line 436
    :cond_1
    invoke-static {p0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 437
    sget-object p0, Ll/۠ۛ᩻;->᩹:Ll/۠ۛ᩻;

    return-object p0

    .line 439
    :cond_2
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 440
    sget-object p0, Ll/۠ۛ᩻;->۬:Ll/۠ۛ᩻;

    return-object p0

    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 442
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 443
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    if-nez p0, :cond_4

    sget-object p0, Ll/۠ۛ᩻;->ۙ:Ll/۠ۛ᩻;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static declared-synchronized ᩻()V
    .locals 6

    .line 2
    const-class v0, Ll/᩸ۛ᩻;

    .line 3
    monitor-enter v0

    .line 343
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "amp"

    const/16 v3, 0x2253

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 344
    invoke-static {v1}, Ll/᩸ۗۡ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v3, v1

    :cond_0
    sput v3, Ll/᩸ۛ᩻;->᩻:I

    .line 345
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "amop"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 416
    :try_start_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 417
    invoke-static {}, Ll/᩸ۛ᩻;->֫()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ll/ܶۛ᩻; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v2, "homePath"

    .line 420
    invoke-static {v1, v2}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ll/ܶۛ᩻; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 409
    :goto_0
    :try_start_3
    invoke-static {v2}, Ll/᩸ۛ᩻;->᩻(Ljava/lang/String;)Ll/۠ۛ᩻;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ll/᩸ۛ᩻;->֫()Ljava/lang/String;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 422
    :catch_0
    :try_start_4
    new-instance v2, Ll/ܶۛ᩻;

    sget-object v4, Ll/۠ۛ᩻;->۬:Ll/۠ۛ᩻;

    invoke-direct {v2, v4}, Ll/ܶۛ᩻;-><init>(Ll/۠ۛ᩻;)V

    throw v2
    :try_end_4
    .catch Ll/ܶۛ᩻; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 407
    :catch_1
    :try_start_5
    invoke-static {}, Ll/᩸ۛ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    .line 458
    :goto_1
    sput-object v2, Ll/᩸ۛ᩻;->ܳ:Ljava/lang/String;

    .line 348
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "amfa"

    invoke-interface {v4, v5, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 349
    invoke-static {v4}, Ll/ܳۤ᩻;->֫(Ljava/lang/String;)Ll/ܳۤ᩻;

    move-result-object v5

    sput-object v5, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    .line 350
    sput-object v3, Ll/᩸ۛ᩻;->ܽ:Ll/۟ۢۜ;

    if-eqz v4, :cond_3

    .line 351
    iget-boolean v3, v5, Ll/ܳۤ᩻;->֫:Z

    if-nez v3, :cond_3

    .line 352
    invoke-virtual {v5}, Ll/ܳۤ᩻;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 354
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    const-string v4, "amfa"

    sget-object v5, Ll/᩸ۛ᩻;->ᩳ:Ll/ܳۤ᩻;

    .line 355
    invoke-virtual {v5}, Ll/ܳۤ᩻;->֫()Ljava/lang/String;

    move-result-object v5

    .line 354
    invoke-interface {v3, v4, v5}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v3

    .line 355
    invoke-interface {v3}, Ll/۬ۤۡ;->apply()V

    :cond_3
    if-eqz v1, :cond_4

    .line 357
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 359
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v3, "amop"

    invoke-interface {v1, v3, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 361
    :cond_4
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "amfw"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Ll/᩸ۛ᩻;->ܿ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 362
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method
