.class public final Ll/ᩴ᩺᩷;
.super Ljava/lang/Object;
.source "C19Y"

# interfaces
.implements Ljava/util/concurrent/Future;


# instance fields
.field public final synthetic ᩸:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺᩷;->᩸:[B

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ᩴ᩺᩷;->᩸:[B

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0

    .line 78
    iget-object p1, p0, Ll/ᩴ᩺᩷;->᩸:[B

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
