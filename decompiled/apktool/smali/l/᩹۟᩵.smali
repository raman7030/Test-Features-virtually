.class public final Ll/᩹۟᩵;
.super Ljava/lang/Object;
.source "R5PD"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ֫:Z

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۟᩵;->ۧ:Ljava/lang/String;

    iput-boolean p2, p0, Ll/᩹۟᩵;->֫:Z

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 247
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Ll/᩹۟᩵;->ۧ:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 248
    iget-boolean p1, p0, Ll/᩹۟᩵;->֫:Z

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
