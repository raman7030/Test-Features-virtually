.class public final Ll/ܰ᩶ۜ;
.super Ljava/lang/Object;
.source "V743"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/ۨ᩶ۜ;

.field public ᩸:Z

.field public final ᩹:Ll/֫ۙۜ;


# direct methods
.method public constructor <init>(Ll/֫ۙۜ;Ll/ۨ᩶ۜ;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p1, p0, Ll/ܰ᩶ۜ;->᩹:Ll/֫ۙۜ;

    .line 125
    iput-object p2, p0, Ll/ܰ᩶ۜ;->᩶:Ll/ۨ᩶ۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 135
    iget-boolean v0, p0, Ll/ܰ᩶ۜ;->᩸:Z

    if-nez v0, :cond_1

    const/4 v1, 0x1

    .line 136
    iput-boolean v1, p0, Ll/ܰ᩶ۜ;->᩸:Z

    .line 137
    iget-object v0, p0, Ll/ܰ᩶ۜ;->᩹:Ll/֫ۙۜ;

    iget-object v2, p0, Ll/ܰ᩶ۜ;->᩶:Ll/ۨ᩶ۜ;

    .line 0
    monitor-enter v0

    .line 96
    :try_start_0
    iget v3, v2, Ll/ۨ᩶ۜ;->ۧ:I

    if-lez v3, :cond_0

    sub-int/2addr v3, v1

    .line 99
    iput v3, v2, Ll/ۨ᩶ۜ;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    monitor-exit v0

    return-void

    .line 97
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Preview page is not pinned"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 100
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_1
    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܰ᩶ۜ;->᩶:Ll/ۨ᩶ۜ;

    iget-object v0, v0, Ll/ۨ᩶ۜ;->֫:[B

    return-object v0
.end method
