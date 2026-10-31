.class public final Ll/ۘۛ᩵;
.super Ljava/lang/Object;
.source "QAY3"


# static fields
.field public static final ֫:Ll/᩸۫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "kotlinx.coroutines.fast.service.loader"

    .line 21
    invoke-static {v0}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    :cond_0
    const/4 v0, 0x0

    .line 35
    :try_start_0
    new-instance v1, Ll/֨۫᩵;

    invoke-direct {v1}, Ll/֨۫᩵;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Ll/ۖۛ᩵;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "<this>"

    .line 0
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v2, Ll/ۖۙ᩵;

    invoke-direct {v2, v1}, Ll/ۖۙ᩵;-><init>(Ljava/util/Iterator;)V

    .line 677
    new-instance v1, Ll/۟᩶᩵;

    invoke-direct {v1, v2}, Ll/۟᩶᩵;-><init>(Ll/ۖۙ᩵;)V

    .line 35
    invoke-static {v1}, Ll/᩷ۙ᩵;->֫(Ll/ܳۙ᩵;)Ljava/util/List;

    move-result-object v1

    .line 138
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v2, v0

    goto :goto_0

    .line 140
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 1899
    :cond_2
    move-object v3, v2

    check-cast v3, Ll/ۖۛ᩵;

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1901
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1902
    check-cast v3, Ll/ۖۛ᩵;

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1907
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 38
    :goto_0
    check-cast v2, Ll/ۖۛ᩵;

    if-eqz v2, :cond_4

    .line 57
    invoke-interface {v2}, Ll/ۖۛ᩵;->֫()Ll/ܶ۫᩵;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    sput-object v0, Ll/ۘۛ᩵;->֫:Ll/᩸۫᩵;

    return-void

    :cond_4
    const/4 v1, 0x3

    .line 39
    :try_start_2
    invoke-static {v1, v0}, Ll/ᩴۛ᩵;->֫(ILjava/lang/Throwable;)V

    throw v0

    :catchall_0
    move-exception v1

    .line 35
    new-instance v2, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    const/4 v2, 0x2

    .line 42
    invoke-static {v2, v1}, Ll/ᩴۛ᩵;->֫(ILjava/lang/Throwable;)V

    throw v0
.end method
