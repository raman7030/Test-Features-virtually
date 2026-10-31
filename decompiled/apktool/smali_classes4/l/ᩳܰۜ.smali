.class public final Ll/ᩳܰۜ;
.super Ljava/lang/Object;
.source "K6MS"


# static fields
.field public static final ֫:Ljava/util/WeakHashMap;

.field public static ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ᩳܰۜ;->֫:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ֫(Ll/ܺܶۜ;Ll/ܰܺܳ;Ll/ᩳۜܳ;)Ll/᩺ۨۜ;
    .locals 9

    .line 105
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    instance-of v0, p1, Ll/ۖۧ᩻;

    if-nez v0, :cond_4

    instance-of v0, p1, Ll/ۨ᩸᩻;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 109
    :cond_0
    instance-of v0, p1, Ll/᩵ۙ᩻;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ۖۛܳ;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ۗۢ᩻;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ܿ᩸᩻;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ۨۛܳ;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/ۚ֨᩻;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 112
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported gallery visitor"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 115
    :cond_2
    :goto_0
    sget-object v1, Ll/ᩳܰۜ;->֫:Ljava/util/WeakHashMap;

    move-object v0, v1

    monitor-enter v0

    .line 116
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-nez v2, :cond_3

    .line 117
    sget-wide v2, Ll/ᩳܰۜ;->ۧ:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    sput-wide v2, Ll/ᩳܰۜ;->ۧ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 119
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "visitor:"

    const-string v3, ":"

    .line 0
    invoke-static {v0, v3, v1, v2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 120
    invoke-interface {p2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 121
    invoke-interface {p2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 122
    new-instance v8, Ljava/lang/ref/WeakReference;

    invoke-direct {v8, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 123
    new-instance p0, Ll/֫ܰۜ;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Ll/֫ܰۜ;-><init>(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 119
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 108
    :cond_4
    :goto_1
    invoke-interface {p2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p0

    .line 73
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "content"

    .line 75
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "uri:"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 77
    new-instance v0, Ll/ܳ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    .line 78
    new-instance v1, Ll/ܰ᩺ۜ;

    invoke-direct {v1, p2, p1, v0, p0}, Ll/ܰ᩺ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ᩸ܿ;Landroid/net/Uri;)V

    return-object v1

    .line 75
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Expected a content URI"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 50
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "mfile:"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 51
    new-instance v0, Ll/᩺᩺ۜ;

    invoke-direct {v0, p0, p2, p1}, Ll/᩺᩺ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ll/ܰܺܳ;)V
    .locals 1

    .line 212
    instance-of v0, p1, Ll/᩵ۙ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵ۙ᩻;

    .line 213
    invoke-virtual {p1}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1, p0}, Ll/ᩳܰۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V

    return-void

    .line 214
    :cond_0
    instance-of v0, p1, Ll/ۖۛܳ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۖۛܳ;

    .line 215
    invoke-virtual {p1}, Ll/ۖۛܳ;->ᩴ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    invoke-static {v0, p0}, Ll/ᩳܰۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 216
    :cond_1
    instance-of v0, p1, Ll/ܿ᩸᩻;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ܿ᩸᩻;

    .line 217
    invoke-virtual {p1}, Ll/ܿ᩸᩻;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1, p0}, Ll/ᩳܰۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V

    return-void

    .line 218
    :cond_2
    instance-of v0, p1, Ll/ۨۛܳ;

    if-eqz v0, :cond_3

    check-cast p1, Ll/ۨۛܳ;

    .line 219
    invoke-virtual {p1}, Ll/ۨۛܳ;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1, p0}, Ll/ᩳܰۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V

    return-void

    .line 220
    :cond_3
    instance-of v0, p1, Ll/ۚ֨᩻;

    if-eqz v0, :cond_4

    check-cast p1, Ll/ۚ֨᩻;

    .line 221
    invoke-virtual {p1}, Ll/ۚ֨᩻;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1, p0}, Ll/ᩳܰۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)V
    .locals 4

    .line 226
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x7c

    .line 228
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    return-void

    .line 226
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Image container is no longer a regular file"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
