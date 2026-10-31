.class public final Ll/᩶ܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ܽ:Ll/᩶ܶۘ;


# instance fields
.field public ֫:Ll/᩺᩸ۘ;

.field public ۧ:Ll/ۚܶۘ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "openSDK_LOG.OpenHttpService"

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AndroidSDK_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤ᩸ۘ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 42
    :try_start_0
    new-instance v2, Ll/᩹ܶۘ;

    invoke-direct {v2, v1}, Ll/᩹ܶۘ;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "initClient okHttp catch throwable"

    .line 46
    invoke-static {v0, v3, v2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    const-string v2, "initClient okHttp fail NoClassDefFoundError"

    .line 44
    invoke-static {v0, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :goto_0
    iget-object v0, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ll/֨ܶۘ;

    invoke-direct {v0, v1}, Ll/֨ܶۘ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    :cond_0
    return-void
.end method

.method public static ֫()Ll/᩶ܶۘ;
    .locals 2

    .line 55
    sget-object v0, Ll/᩶ܶۘ;->ܽ:Ll/᩶ܶۘ;

    if-nez v0, :cond_1

    .line 56
    const-class v0, Ll/᩶ܶۘ;

    monitor-enter v0

    .line 57
    :try_start_0
    sget-object v1, Ll/᩶ܶۘ;->ܽ:Ll/᩶ܶۘ;

    if-nez v1, :cond_0

    .line 58
    new-instance v1, Ll/᩶ܶۘ;

    invoke-direct {v1}, Ll/᩶ܶۘ;-><init>()V

    sput-object v1, Ll/᩶ܶۘ;->ܽ:Ll/᩶ܶۘ;

    .line 60
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 62
    :cond_1
    :goto_0
    sget-object v0, Ll/᩶ܶۘ;->ܽ:Ll/᩶ܶۘ;

    invoke-direct {v0}, Ll/᩶ܶۘ;->ۧ()V

    .line 63
    sget-object v0, Ll/᩶ܶۘ;->ܽ:Ll/᩶ܶۘ;

    return-object v0
.end method

.method private ۧ()V
    .locals 5

    .line 77
    iget-object v0, p0, Ll/᩶ܶۘ;->֫:Ll/᩺᩸ۘ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Common_HttpConnectionTimeout"

    .line 80
    invoke-virtual {v0, v1}, Ll/᩺᩸ۘ;->֫(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x3a98

    .line 82
    :cond_1
    iget-object v1, p0, Ll/᩶ܶۘ;->֫:Ll/᩺᩸ۘ;

    const-string v2, "Common_SocketConnectionTimeout"

    invoke-virtual {v1, v2}, Ll/᩺᩸ۘ;->֫(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0x7530

    :cond_2
    int-to-long v2, v0

    int-to-long v0, v1

    .line 88
    iget-object v4, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    if-eqz v4, :cond_3

    .line 89
    invoke-interface {v4, v2, v3, v0, v1}, Ll/ۚܶۘ;->a(JJ)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ll/ۙܶۘ;
    .locals 1

    .line 163
    invoke-virtual {p3}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 149
    iget-object p3, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    invoke-interface {p3, p1, p2}, Ll/ۚܶۘ;->֫(Ljava/lang/String;Ljava/util/Map;)Ll/ۙܶۘ;

    move-result-object p1

    return-object p1

    .line 167
    :cond_0
    iget-object v0, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۚܶۘ;->֫(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ll/ۙܶۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;
    .locals 5

    .line 111
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 138
    iget-object p1, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    invoke-interface {p1, p2, v1}, Ll/ۚܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object p1

    return-object p1

    .line 114
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 116
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_1

    const-string v4, "UTF-8"

    .line 118
    invoke-static {v2, v4}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-static {v3, v4}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&"

    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 124
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 127
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 138
    iget-object v0, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    invoke-interface {v0, p2, p1}, Ll/ۚܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩺᩸ۘ;)V
    .locals 0

    .line 72
    iput-object p1, p0, Ll/᩶ܶۘ;->֫:Ll/᩺᩸ۘ;

    .line 73
    invoke-direct {p0}, Ll/᩶ܶۘ;->ۧ()V

    return-void
.end method

.method public final ۧ(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;
    .locals 1

    .line 149
    iget-object v0, p0, Ll/᩶ܶۘ;->ۧ:Ll/ۚܶۘ;

    invoke-interface {v0, p2, p1}, Ll/ۚܶۘ;->֫(Ljava/lang/String;Ljava/util/Map;)Ll/ۙܶۘ;

    move-result-object p1

    return-object p1
.end method
