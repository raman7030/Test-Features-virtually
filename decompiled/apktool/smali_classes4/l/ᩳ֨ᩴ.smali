.class public final Ll/ᩳ֨ᩴ;
.super Ljava/nio/channels/FileLock;
.source "N673"


# instance fields
.field public final a:Ljava/nio/channels/FileLock;


# direct methods
.method public constructor <init>(Ljava/nio/channels/FileLock;Ll/ܽ֨ᩴ;)V
    .locals 7

    .line 275
    invoke-virtual {p1}, Ljava/nio/channels/FileLock;->position()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/nio/channels/FileLock;->size()J

    move-result-wide v4

    invoke-virtual {p1}, Ljava/nio/channels/FileLock;->isShared()Z

    move-result v6

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v6}, Ljava/nio/channels/FileLock;-><init>(Ljava/nio/channels/FileChannel;JJZ)V

    .line 276
    iput-object p1, p0, Ll/ᩳ֨ᩴ;->a:Ljava/nio/channels/FileLock;

    return-void
.end method


# virtual methods
.method public final isValid()Z
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ᩳ֨ᩴ;->a:Ljava/nio/channels/FileLock;

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    return v0
.end method

.method public final release()V
    .locals 1

    .line 286
    iget-object v0, p0, Ll/ᩳ֨ᩴ;->a:Ljava/nio/channels/FileLock;

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V

    return-void
.end method
