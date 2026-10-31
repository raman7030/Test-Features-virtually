.class public final Ll/ܿۨ֫;
.super Ljava/lang/Object;
.source "M8HZ"

# interfaces
.implements Ll/᩻ۨ֫;


# instance fields
.field public final ֫:Ll/ۤ۠֫;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLl/ۤ۠֫;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 75
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 76
    iput-object p3, p0, Ll/ܿۨ֫;->֫:Ll/ۤ۠֫;

    .line 77
    iput-object p1, p0, Ll/ܿۨ֫;->ۧ:Ljava/lang/String;

    .line 78
    iput-boolean p2, p0, Ll/ܿۨ֫;->ܽ:Z

    .line 79
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܿۨ֫;->ᩳ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    iget-object v0, p0, Ll/ܿۨ֫;->ᩳ:Ljava/util/HashMap;

    monitor-enter v0

    .line 92
    :try_start_0
    iget-object v1, p0, Ll/ܿۨ֫;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/UUID;Ll/ۛۛ֫;)[B
    .locals 7

    .line 129
    invoke-virtual {p2}, Ll/ۛۛ֫;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 130
    iget-boolean v1, p0, Ll/ܿۨ֫;->ܽ:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 131
    :cond_0
    iget-object v0, p0, Ll/ܿۨ֫;->ۧ:Ljava/lang/String;

    :cond_1
    move-object v1, v0

    .line 133
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 141
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 144
    sget-object v0, Ll/᩻ᩴ֫;->ܽ:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "text/xml"

    goto :goto_0

    .line 146
    :cond_2
    sget-object v3, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {v3, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "application/json"

    goto :goto_0

    :cond_3
    const-string v3, "application/octet-stream"

    :goto_0
    const-string v4, "Content-Type"

    .line 147
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "SOAPAction"

    const-string v0, "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"

    .line 149
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_4
    iget-object p1, p0, Ll/ܿۨ֫;->ᩳ:Ljava/util/HashMap;

    move-object v0, p1

    monitor-enter v0

    .line 154
    :try_start_0
    iget-object p1, p0, Ll/ܿۨ֫;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 155
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    iget-object p1, p0, Ll/ܿۨ֫;->֫:Ll/ۤ۠֫;

    .line 75
    invoke-virtual {p1}, Ll/ۤ۠֫;->֫()Ll/۟۠֫;

    move-result-object p1

    .line 159
    invoke-virtual {p2}, Ll/ۛۛ֫;->֫()[B

    move-result-object p2

    .line 156
    invoke-static {p1, v1, p2, v2}, Ll/۬ۛ֫;->֫(Ll/᩸۠֫;Ljava/lang/String;[BLjava/util/Map;)[B

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 155
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 134
    :cond_5
    new-instance p1, Ll/ۜۨ֫;

    new-instance p2, Ll/ۙ۠֫;

    invoke-direct {p2}, Ll/ۙ۠֫;-><init>()V

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 135
    invoke-virtual {p2, v2}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    invoke-virtual {p2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    .line 137
    invoke-static {}, Ll/ۢ۬ܺ;->of()Ll/ۢ۬ܺ;

    move-result-object v3

    new-instance v6, Ljava/lang/IllegalStateException;

    const-string p2, "No license URL"

    invoke-direct {v6, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ll/ۜۨ֫;-><init>(Ll/ۗ۠֫;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    throw p1
.end method

.method public final ֫(Ll/ܰۛ֫;)[B
    .locals 3

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    invoke-virtual {p1}, Ll/ܰۛ֫;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&signedRequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܰۛ֫;->֫()[B

    move-result-object p1

    invoke-static {p1}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 120
    iget-object v0, p0, Ll/ܿۨ֫;->֫:Ll/ۤ۠֫;

    .line 75
    invoke-virtual {v0}, Ll/ۤ۠֫;->֫()Ll/۟۠֫;

    move-result-object v0

    const/4 v1, 0x0

    .line 124
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 120
    invoke-static {v0, p1, v1, v2}, Ll/۬ۛ֫;->֫(Ll/᩸۠֫;Ljava/lang/String;[BLjava/util/Map;)[B

    move-result-object p1

    return-object p1
.end method
