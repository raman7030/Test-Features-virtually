.class public final Ll/۬ۘۧ;
.super Ljava/lang/Object;
.source "48P4"


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;

.field public final ۧ:J

.field public final ܽ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JJLjava/util/List;)V
    .locals 2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-static {p5}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p5

    iput-object p5, p0, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    .line 72
    iput-wide p1, p0, Ll/۬ۘۧ;->ᩳ:J

    .line 73
    iput-wide p3, p0, Ll/۬ۘۧ;->ۧ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p5, p1, v0

    if-eqz p5, :cond_1

    cmp-long p5, p3, v0

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    add-long v0, p1, p3

    .line 77
    :cond_1
    :goto_0
    iput-wide v0, p0, Ll/۬ۘۧ;->ܽ:J

    return-void
.end method
