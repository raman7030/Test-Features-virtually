.class public final Ll/֡۠᩵;
.super Ljava/lang/Object;
.source "VAXH"

# interfaces
.implements Ll/ܿ۠᩵;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩶:Ljava/lang/Object;

.field public volatile ᩸:Ljava/lang/Object;

.field public ᩹:Ll/֫᩹᩵;


# direct methods
.method public constructor <init>(Ll/֫᩹᩵;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Ll/֡۠᩵;->᩹:Ll/֫᩹᩵;

    .line 67
    sget-object p1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    iput-object p1, p0, Ll/֡۠᩵;->᩸:Ljava/lang/Object;

    .line 71
    iput-object p0, p0, Ll/֡۠᩵;->᩶:Ljava/lang/Object;

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 98
    new-instance v0, Ll/ᩳ۠᩵;

    invoke-virtual {p0}, Ll/֡۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ۠᩵;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 3

    .line 75
    iget-object v0, p0, Ll/֡۠᩵;->᩸:Ljava/lang/Object;

    .line 76
    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-eq v0, v1, :cond_0

    return-object v0

    .line 81
    :cond_0
    iget-object v0, p0, Ll/֡۠᩵;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    iget-object v2, p0, Ll/֡۠᩵;->᩸:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    iget-object v1, p0, Ll/֡۠᩵;->᩹:Ll/֫᩹᩵;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v1}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    move-result-object v2

    .line 87
    iput-object v2, p0, Ll/֡۠᩵;->᩸:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 88
    iput-object v1, p0, Ll/֡۠᩵;->᩹:Ll/֫᩹᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 94
    iget-object v0, p0, Ll/֡۠᩵;->᩸:Ljava/lang/Object;

    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-eq v0, v1, :cond_0

    .line 96
    invoke-virtual {p0}, Ll/֡۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    return-object v0
.end method
