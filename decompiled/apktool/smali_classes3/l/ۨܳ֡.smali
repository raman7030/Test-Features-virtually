.class public abstract Ll/ۨܳ֡;
.super Ljava/lang/Object;
.source "9ARP"


# static fields
.field public static final ܽ:Ll/ܰۜ֡;


# instance fields
.field public final ֫:Ll/᩸ܳ֡;

.field public final ۧ:Ll/ᩳۜ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Ll/ܰۜ֡;

    new-instance v1, Ll/۬ܳ֡;

    invoke-direct {v1}, Ll/۬ܳ֡;-><init>()V

    invoke-direct {v0, v1}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    sput-object v0, Ll/ۨܳ֡;->ܽ:Ll/ܰۜ֡;

    const v1, 0x7fffffff

    .line 46
    iput v1, v0, Ll/ܰۜ֡;->ۜ:I

    return-void
.end method

.method public constructor <init>(Ll/᩸ܳ֡;Ll/ᩳۜ֡;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۨܳ֡;->֫:Ll/᩸ܳ֡;

    .line 53
    iput-object p2, p0, Ll/ۨܳ֡;->ۧ:Ll/ᩳۜ֡;

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;
    .locals 3

    .line 78
    iget-object v0, p0, Ll/ۨܳ֡;->ۧ:Ll/ᩳۜ֡;

    if-nez v0, :cond_0

    return-object p1

    .line 80
    :cond_0
    monitor-enter v0

    .line 81
    :try_start_0
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 83
    iget-object v2, p0, Ll/ۨܳ֡;->ۧ:Ll/ᩳۜ֡;

    invoke-static {p1, v2, v1}, Ll/ܽۜ֡;->֫(Ll/ܽۜ֡;Ll/ᩳۜ֡;Ljava/util/IdentityHashMap;)Ll/ܽۜ֡;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 86
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract ֫()V
.end method
