.class public final synthetic Ll/᩶ۙᩳ;
.super Ljava/lang/Object;
.source "K6UK"

# interfaces
.implements Ll/᩸ۜ᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۤۙᩳ;

.field public final synthetic ᩹:Ll/ۛۗᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۙᩳ;Ll/ۛۗᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۙᩳ;->᩸:Ll/ۤۙᩳ;

    iput-object p2, p0, Ll/᩶ۙᩳ;->᩹:Ll/ۛۗᩳ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 2
    iget-object v1, p0, Ll/᩶ۙᩳ;->᩸:Ll/ۤۙᩳ;

    .line 4
    iget-object v2, p0, Ll/᩶ۙᩳ;->᩹:Ll/ۛۗᩳ;

    .line 6
    check-cast p1, Ljava/lang/Long;

    .line 125
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    .line 126
    invoke-static {p1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, v1

    .line 0
    monitor-enter v0

    const/4 p1, 0x0

    .line 115
    :try_start_0
    invoke-virtual {v1, v2, p1}, Ll/ۤۙᩳ;->֫(Ll/ۛۗᩳ;Z)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
