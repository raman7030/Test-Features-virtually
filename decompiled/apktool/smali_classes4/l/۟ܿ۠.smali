.class public final Ll/۟ܿ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public ܳ:Ljava/util/Collection;

.field public final ܿ:Ljava/util/EnumMap;

.field public ᩳ:Z

.field public final synthetic ᩻:Ll/᩹ܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 3

    .line 820
    iput-object p1, p0, Ll/۟ܿ۠;->᩻:Ll/᩹ܳ۠;

    .line 821
    sget-object p1, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    const/16 v0, 0x8

    new-array v0, v0, [Ll/֡ۖ۠;

    sget-object v1, Ll/֡ۖ۠;->ᩳ֫:Ll/֡ۖ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->ۛۧ:Ll/֡ۖ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->᩺ۧ:Ll/֡ۖ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->ۨۧ:Ll/֡ۖ۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->ۚ֫:Ll/֡ۖ۠;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->ۘ֫:Ll/֡ۖ۠;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->֨֫:Ll/֡ۖ۠;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/֡ۖ۠;->ᩴ֫:Ll/֡ۖ۠;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    .line 813
    new-instance p1, Ljava/util/EnumMap;

    const-class v0, Ll/֡ۖ۠;

    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, Ll/۟ܿ۠;->ܿ:Ljava/util/EnumMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Iterable;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 876
    iput-object p1, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 878
    iput-boolean v0, p0, Ll/۟ܿ۠;->ᩳ:Z

    const/4 v1, 0x1

    .line 879
    iput-boolean v1, p0, Ll/ܰܿ۠;->֫:Z

    .line 880
    new-instance v1, Ll/֨ܳ۠;

    iget-object v2, p0, Ll/۟ܿ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {v1, v2}, Ll/֨ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    invoke-virtual {v1, p1, v0}, Ll/֨ܳ۠;->֫(Ljava/lang/Iterable;Z)V

    .line 881
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    .line 882
    iget-object p1, p0, Ll/۟ܿ۠;->ܿ:Ljava/util/EnumMap;

    invoke-virtual {p1}, Ljava/util/EnumMap;->clear()V

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 3

    .line 836
    iget-object v0, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 840
    iput-boolean v0, p0, Ll/ܰܿ۠;->֫:Z

    .line 855
    sget-object v1, Ll/᩺ܿ۠;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    if-eq v1, v0, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 861
    :cond_1
    sget-object p1, Ll/֡ۖ۠;->֨֫:Ll/֡ۖ۠;

    goto :goto_0

    .line 859
    :cond_2
    sget-object p1, Ll/֡ۖ۠;->ۚ֫:Ll/֡ۖ۠;

    goto :goto_0

    .line 857
    :cond_3
    sget-object p1, Ll/֡ۖ۠;->ᩳ֫:Ll/֡ۖ۠;

    .line 843
    :goto_0
    iget-object v1, p0, Ll/۟ܿ۠;->ܿ:Ljava/util/EnumMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    sget-object p2, Ll/֡ۖ۠;->ᩳ֫:Ll/֡ۖ۠;

    if-ne p1, p2, :cond_4

    .line 845
    sget-object p1, Ll/֡ۖ۠;->᩺ۧ:Ll/֡ۖ۠;

    invoke-virtual {v1, p1}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    sget-object p1, Ll/֡ۖ۠;->ۨۧ:Ll/֡ۖ۠;

    invoke-virtual {v1, p1}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const/4 p1, 0x0

    .line 848
    iput-object p1, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    return v0
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 2

    .line 977
    iget-object v0, p0, Ll/۟ܿ۠;->᩻:Ll/᩹ܳ۠;

    iget-object v1, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    invoke-static {v0, v1, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/util/Collection;Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()Z
    .locals 2

    .line 965
    iget-object v0, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 967
    :try_start_0
    invoke-virtual {p0}, Ll/۟ܿ۠;->᩻()Ll/֨ܳ۠;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 970
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 831
    :cond_0
    :goto_0
    iget-boolean v0, p0, Ll/۟ܿ۠;->ᩳ:Z

    return v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 2

    .line 965
    iget-object v0, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 967
    :try_start_0
    invoke-virtual {p0}, Ll/۟ܿ۠;->᩻()Ll/֨ܳ۠;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 970
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 870
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/۟ܿ۠;->ܳ:Ljava/util/Collection;

    return-object v0
.end method

.method public final ᩻()Ll/֨ܳ۠;
    .locals 10

    .line 887
    new-instance v0, Ll/֨ܳ۠;

    iget-object v1, p0, Ll/۟ܿ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/֨ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    .line 889
    sget-object v2, Ll/֡ۖ۠;->ᩳ֫:Ll/֡ۖ۠;

    iget-object v3, p0, Ll/۟ܿ۠;->ܿ:Ljava/util/EnumMap;

    invoke-virtual {v3, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 890
    sget-object v4, Ll/֡ۖ۠;->ۚ֫:Ll/֡ۖ۠;

    invoke-virtual {v3, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 891
    sget-object v5, Ll/֡ۖ۠;->֨֫:Ll/֡ۖ۠;

    invoke-virtual {v3, v5}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 892
    sget-object v6, Ll/֡ۖ۠;->᩺ۧ:Ll/֡ۖ۠;

    invoke-virtual {v3, v6}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 893
    sget-object v7, Ll/֡ۖ۠;->ۨۧ:Ll/֡ۖ۠;

    invoke-virtual {v3, v7}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 894
    invoke-virtual {v0, v6}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    .line 316
    invoke-static {v1}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    move-result v8

    invoke-virtual {v0, v4, v8}, Ll/֨ܳ۠;->֫(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    const-string v4, "java.endorsed.dirs"

    .line 899
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v7}, Ll/֨ܳ۠;->֫(Ljava/lang/String;Z)V

    :goto_0
    if-eqz v2, :cond_1

    .line 903
    invoke-virtual {v0, v2}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    goto :goto_3

    .line 948
    :cond_1
    sget-object v4, Ll/᩹ܳ۠;->ۡ:Ll/᩷۠ᩴ;

    new-array v8, v7, [Ll/ܳ۠ᩴ;

    invoke-static {v4, v8}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 949
    invoke-static {v4}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    goto :goto_2

    .line 953
    :cond_2
    sget-object v4, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    const-string v8, "modules"

    invoke-interface {v4, v8}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    const-string v8, "java.base"

    .line 954
    invoke-interface {v4, v8}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v8

    new-array v9, v7, [Ll/ܳ۠ᩴ;

    invoke-static {v8, v9}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 955
    invoke-static {v4}, Ll/ܿ۠ᩴ;->list(Ll/᩷۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    .line 956
    :try_start_0
    invoke-interface {v4}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 957
    invoke-interface {v4}, Ll/۫ۨᩴ;->close()V

    move-object v4, v8

    goto :goto_2

    :catchall_0
    move-exception v0

    if-eqz v4, :cond_3

    .line 955
    :try_start_1
    invoke-interface {v4}, Ll/۫ۨᩴ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_5

    .line 908
    invoke-virtual {v0, v4, v7}, Ll/֨ܳ۠;->֫(Ljava/lang/Iterable;Z)V

    goto :goto_3

    :cond_5
    const-string v4, "sun.boot.class.path"

    .line 911
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 912
    invoke-virtual {v0, v4, v7}, Ll/֨ܳ۠;->ۧ(Ljava/lang/String;Z)V

    .line 916
    :goto_3
    invoke-virtual {v0, v3}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    if-eqz v5, :cond_6

    .line 316
    invoke-static {v1}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    move-result v1

    invoke-virtual {v0, v5, v1}, Ll/֨ܳ۠;->֫(Ljava/lang/String;Z)V

    goto :goto_4

    .line 925
    :cond_6
    sget-object v1, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    const-string v4, "lib/jfxrt.jar"

    invoke-interface {v1, v4}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    new-array v4, v7, [Ll/ܳ۠ᩴ;

    .line 926
    invoke-static {v1, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 927
    invoke-virtual {v0, v1, v7}, Ll/֨ܳ۠;->֫(Ll/᩷۠ᩴ;Z)V

    :cond_7
    const-string v1, "java.ext.dirs"

    .line 929
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Ll/֨ܳ۠;->֫(Ljava/lang/String;Z)V

    :goto_4
    if-nez v6, :cond_8

    if-nez v2, :cond_8

    if-nez v3, :cond_8

    const/4 v7, 0x1

    .line 932
    :cond_8
    iput-boolean v7, p0, Ll/۟ܿ۠;->ᩳ:Z

    return-object v0
.end method
