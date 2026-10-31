.class public final Ll/ۧۧۧ;
.super Ljava/lang/Object;
.source "I8NB"


# static fields
.field public static final ۧ:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final ֫:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Ll/ۧۧۧ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(JLjava/util/Map;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-wide p1, p0, Ll/ۧۧۧ;->֫:J

    return-void
.end method

.method public constructor <init>(Ll/ۗ۠֫;)V
    .locals 2

    .line 70
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 74
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-wide/16 v0, 0x0

    .line 70
    invoke-direct {p0, v0, v1, p1}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    return-void
.end method

.method public static ֫()J
    .locals 2

    .line 36
    sget-object v0, Ll/ۧۧۧ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    return-wide v0
.end method
