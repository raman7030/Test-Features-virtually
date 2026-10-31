.class public final synthetic Ll/ۙ᩵ۢ;
.super Ljava/lang/Object;
.source "I7BH"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۙ᩵ۢ;->᩸:J

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 5

    .line 2
    iget-wide v1, p0, Ll/ۙ᩵ۢ;->᩸:J

    .line 4
    check-cast p1, Ljava/util/Map$Entry;

    .line 1179
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫֡ۢ;

    move-object v0, p1

    .line 1180
    monitor-enter v0

    .line 1181
    :try_start_0
    invoke-static {p1}, Ll/֫֡ۢ;->ۜ(Ll/֫֡ۢ;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1}, Ll/֫֡ۢ;->ۡ(Ll/֫֡ۢ;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/32 v3, 0x493e0

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 1182
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
