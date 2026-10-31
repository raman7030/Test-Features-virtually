.class public Ll/ۖ᩸᩻;
.super Ll/۬᩺ܳ;
.source "9981"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ll/۬᩺ܳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 9

    const-string v0, "$RECYCLE.BIN$/"

    const-string v1, "ARG_PATHS"

    const/16 v2, 0xe

    const/4 v3, 0x0

    .line 65
    :try_start_0
    invoke-super {p0}, Ll/۬᩺ܳ;->ۢ()Ll/ܿ۠ۢ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 68
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 69
    array-length v6, v1

    :goto_0
    if-ge v3, v6, :cond_1

    aget-object v7, v1, v3

    .line 70
    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 71
    invoke-virtual {v7, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ۨ᩸᩻;->ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 73
    invoke-virtual {v7}, Ll/ۛ᩸᩻;->ܽ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 77
    :cond_1
    invoke-static {v5}, Ll/᩹֡ܿ;->֫(Ljava/util/Set;)V

    return-object v4

    :catchall_0
    move-exception v4

    .line 141
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 68
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 69
    array-length v6, v1

    :goto_1
    if-ge v3, v6, :cond_3

    aget-object v7, v1, v3

    .line 70
    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 71
    invoke-virtual {v7, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ۨ᩸᩻;->ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 73
    invoke-virtual {v7}, Ll/ۛ᩸᩻;->ܽ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v5}, Ll/᩹֡ܿ;->֫(Ljava/util/Set;)V

    .line 78
    throw v4
.end method
