.class public final synthetic Ll/۠ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ljava/lang/Runnable;

.field public final synthetic ᩹:Ll/᩺ۙᩳ;


# direct methods
.method public synthetic constructor <init>(JLl/᩺ۙᩳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/۠ۗᩳ;->᩸:Ljava/lang/Runnable;

    iput-object p3, p0, Ll/۠ۗᩳ;->᩹:Ll/᩺ۙᩳ;

    iput-wide p1, p0, Ll/۠ۗᩳ;->᩶:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 956
    iget-object v0, p0, Ll/۠ۗᩳ;->᩸:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 957
    iget-object v0, p0, Ll/۠ۗᩳ;->᩹:Ll/᩺ۙᩳ;

    iget-object v0, v0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v0

    iget-wide v2, p0, Ll/۠ۗᩳ;->᩶:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 958
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Automatic compaction exceeded source size"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
