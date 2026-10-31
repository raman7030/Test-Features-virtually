.class public final Ll/ۖۧ᩻;
.super Ll/ܰܺܳ;
.source "8AHU"


# static fields
.field public static final ᩹:Ll/ۖۧ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ll/ۖۧ᩻;

    .line 36
    invoke-direct {v0}, Ll/ܰܺܳ;-><init>()V

    .line 34
    sput-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 0

    .line 56
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 59
    :cond_0
    invoke-interface {p2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 13

    .line 88
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 91
    :cond_0
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 92
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, p2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p2

    .line 93
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string p2, "/"

    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string v2, "/system"

    const-string v3, "/system_ext"

    const-string v4, "/etc"

    const-string v5, "/sdcard"

    const-string v6, "/storage"

    const-string v7, "/data"

    const-string v8, "/cust"

    const-string v9, "/mnt"

    const-string v10, "/proc"

    const-string v11, "/product"

    const-string v12, "/vendor"

    .line 97
    filled-new-array/range {v2 .. v12}, [Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xb

    if-ge v2, v3, :cond_b

    .line 99
    aget-object v3, p2, v2

    new-array v4, v0, [Ljava/lang/String;

    .line 100
    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ll/ۢۧ᩻;

    invoke-direct {v4, v3}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 104
    new-instance p2, Ll/ۢۧ᩻;

    invoke-direct {p2, v2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "0"

    .line 108
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p2, "999"

    goto :goto_1

    :cond_3
    const-string v0, "999"

    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "0"

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_b

    .line 114
    invoke-virtual {v2, p2}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 115
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 116
    new-instance v0, Ll/ۢۧ᩻;

    invoke-direct {v0, p2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_5
    const-string p2, "/storage/"

    .line 119
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "/storage/emulated"

    new-array v0, v0, [Ljava/lang/String;

    .line 120
    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ll/ۢۧ᩻;

    invoke-direct {v0, p2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_6
    const-string p2, "/data/"

    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_8

    const-string p2, "/data/app"

    new-array v2, v0, [Ljava/lang/String;

    .line 123
    invoke-static {p2, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 124
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Ll/ۢۧ᩻;

    invoke-direct {v2, p2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_7
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object p2

    invoke-interface {p2}, Ll/֡᩶ܿ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "/data/local"

    new-array v0, v0, [Ljava/lang/String;

    .line 126
    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 127
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ll/ۢۧ᩻;

    invoke-direct {v0, p2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_8
    const-string p2, "/data/local/"

    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 130
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object p2

    invoke-interface {p2}, Ll/֡᩶ܿ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "/data/local/tmp"

    new-array v0, v0, [Ljava/lang/String;

    .line 131
    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 132
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ll/ۢۧ᩻;

    invoke-direct {v0, p2}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    const-string p2, "/data/app/"

    .line 134
    invoke-static {p2, p1}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 135
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object p2

    .line 137
    invoke-virtual {p2, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/᩷֡ܿ;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Ll/᩷֡ܿ;-><init>(I)V

    .line 138
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۡۧ᩻;

    invoke-direct {v0, p1}, Ll/ۡۧ᩻;-><init>(Ljava/lang/String;)V

    .line 139
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۛۜ᩷;

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1}, Ll/ۛۜ᩷;-><init>(ILjava/lang/Object;)V

    .line 140
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 148
    invoke-interface {p2}, Ll/ܿ᩺ᩴ;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۘᩳ֨;

    invoke-direct {v0, v2, p1}, Ll/ۘᩳ֨;-><init>(ILjava/lang/Object;)V

    .line 149
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/֡֡ܿ;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Ll/֡֡ܿ;-><init>(I)V

    .line 150
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۛۚۢ;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Ll/ۛۚۢ;-><init>(I)V

    .line 151
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 152
    new-instance v0, Ll/ܺۧ᩻;

    invoke-direct {v0, v1}, Ll/ܺۧ᩻;-><init>(Ljava/util/ArrayList;)V

    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_3

    .line 155
    :cond_a
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 156
    new-instance v2, Ll/ۢۧ᩻;

    invoke-direct {v2, v0}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    :goto_3
    const-string p2, "/storage/"

    .line 159
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 160
    const-class p1, Ll/ᩴܶܿ;

    move-object v0, p1

    monitor-enter v0

    .line 161
    :try_start_0
    invoke-static {}, Ll/ᩴܶܿ;->ܽ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘܶܿ;

    .line 162
    new-instance v2, Ll/ۢۧ᩻;

    invoke-direct {v2, p2}, Ll/ۢۧ᩻;-><init>(Ll/ۘܶܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 164
    :cond_c
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_d
    return-object v1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 3

    const-string v0, "/"

    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 69
    :cond_0
    new-instance v2, Ll/ۢۧ᩻;

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-direct {v2, p1}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    .line 70
    invoke-virtual {v2}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 1

    const-string v0, "local"

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "local"

    return-object v0
.end method
