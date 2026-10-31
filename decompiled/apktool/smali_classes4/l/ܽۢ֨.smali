.class public abstract Ll/ܽۢ֨;
.super Ljava/lang/Object;
.source "S2V9"


# instance fields
.field public ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public ۧ:Ll/ۙۢ֨;

.field public ܽ:Z

.field public final ᩳ:Ll/᩻ۢ֨;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Ll/ܽۢ֨;->ܽ:Z

    .line 32
    new-instance v1, Ll/᩻ۢ֨;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-char v0, v1, Ll/᩻ۢ֨;->֫:C

    .line 32
    iput-object v1, p0, Ll/ܽۢ֨;->ᩳ:Ll/᩻ۢ֨;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫ۢ֨;
    .locals 6

    .line 61
    iget-object v0, p0, Ll/ܽۢ֨;->ۧ:Ll/ۙۢ֨;

    if-eqz v0, :cond_0

    .line 64
    iget-object v1, p0, Ll/ܽۢ֨;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-boolean v2, p0, Ll/ܽۢ֨;->ܽ:Z

    .line 33
    new-instance v3, Ll/֫ۢ֨;

    .line 37
    invoke-virtual {v0}, Ll/ۙۢ֨;->֫()Lpl/droidsonroids/gif/GifInfoHandle;

    move-result-object v0

    .line 38
    iget-object v4, p0, Ll/ܽۢ֨;->ᩳ:Ll/᩻ۢ֨;

    iget-char v4, v4, Ll/᩻ۢ֨;->֫:C

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v4}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(ZC)V

    .line 33
    invoke-direct {v3, v0, v1, v2}, Ll/֫ۢ֨;-><init>(Lpl/droidsonroids/gif/GifInfoHandle;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Z)V

    return-object v3

    .line 62
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Source is not set"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)Ll/ۧۢ֨;
    .locals 3

    .line 38
    iget-object v0, p0, Ll/ܽۢ֨;->ᩳ:Ll/᩻ۢ֨;

    const/4 v1, 0x1

    if-lt p1, v1, :cond_1

    const v2, 0xffff

    if-le p1, v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-char p1, p1

    .line 41
    iput-char p1, v0, Ll/᩻ۢ֨;->֫:C

    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    iput-char v1, v0, Ll/᩻ۢ֨;->֫:C

    .line 51
    :goto_1
    move-object p1, p0

    check-cast p1, Ll/ۧۢ֨;

    return-object p1
.end method

.method public final ֫(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)Ll/ۧۢ֨;
    .locals 0

    .line 99
    iput-object p1, p0, Ll/ܽۢ֨;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 100
    move-object p1, p0

    check-cast p1, Ll/ۧۢ֨;

    return-object p1
.end method

.method public final ֫(Ljava/io/File;)V
    .locals 1

    .line 214
    new-instance v0, Ll/᩸ۢ֨;

    invoke-direct {v0, p1}, Ll/᩸ۢ֨;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/ܽۢ֨;->ۧ:Ll/ۙۢ֨;

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 1

    .line 157
    new-instance v0, Ll/᩹ۢ֨;

    invoke-direct {v0, p1}, Ll/᩹ۢ֨;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ܽۢ֨;->ۧ:Ll/ۙۢ֨;

    return-void
.end method

.method public final ۧ()Ll/ۧۢ֨;
    .locals 1

    const/4 v0, 0x0

    .line 117
    iput-boolean v0, p0, Ll/ܽۢ֨;->ܽ:Z

    .line 118
    move-object v0, p0

    check-cast v0, Ll/ۧۢ֨;

    return-object v0
.end method
