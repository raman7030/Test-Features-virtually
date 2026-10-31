.class public Ll/ۘۜ᩵;
.super Ljava/lang/Thread;
.source "86PR"


# instance fields
.field public final ᩸:Ll/ܿۜ᩵;

.field public final ᩹:Ll/ᩳۜ᩵;


# direct methods
.method public constructor <init>(Ll/ܿۜ᩵;Ljava/lang/ClassLoader;)V
    .locals 1

    const-string v0, "aFJWorkerThread"

    .line 67
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-static {p0, p2}, Ll/ۚۜ᩵;->֫(Ljava/lang/Thread;Ljava/lang/ClassLoader;)V

    .line 69
    iput-object p1, p0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    .line 70
    invoke-virtual {p1, p0}, Ll/ܿۜ᩵;->֫(Ll/ۘۜ᩵;)Ll/ᩳۜ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    return-void
.end method

.method public constructor <init>(Ll/ܿۜ᩵;Ljava/lang/ClassLoader;Ljava/lang/ThreadGroup;Ljava/security/AccessControlContext;)V
    .locals 1

    const-string v0, "aFJWorkerThread"

    .line 81
    invoke-direct {p0, p3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    .line 82
    invoke-super {p0, p2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 83
    invoke-static {p0, p4}, Ll/ۚۜ᩵;->֫(Ljava/lang/Thread;Ljava/security/AccessControlContext;)V

    .line 84
    invoke-static {p0}, Ll/ۚۜ᩵;->֫(Ljava/lang/Thread;)V

    .line 85
    iput-object p1, p0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    .line 86
    invoke-virtual {p1, p0}, Ll/ܿۜ᩵;->֫(Ll/ۘۜ᩵;)Ll/ᩳۜ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 118
    iget-object v0, p0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    iget-object v1, p0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    iget-object v2, v1, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-nez v2, :cond_0

    .line 122
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ܿۜ᩵;->ۧ(Ll/ᩳۜ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 133
    :goto_0
    invoke-virtual {v0, p0, v1}, Ll/ܿۜ᩵;->֫(Ll/ۘۜ᩵;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public ֫()V
    .locals 0

    return-void
.end method
