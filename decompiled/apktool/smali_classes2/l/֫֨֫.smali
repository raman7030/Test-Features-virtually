.class public final Ll/֫֨֫;
.super Landroid/content/BroadcastReceiver;
.source "J8TX"


# instance fields
.field public final synthetic ֫:Ll/ۧ֨֫;


# direct methods
.method public constructor <init>(Ll/ۧ֨֫;)V
    .locals 0

    .line 253
    iput-object p1, p0, Ll/֫֨֫;->֫:Ll/ۧ֨֫;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 257
    iget-object p2, p0, Ll/֫֨֫;->֫:Ll/ۧ֨֫;

    invoke-static {p2}, Ll/ۧ֨֫;->֫(Ll/ۧ֨֫;)Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v0, Ll/۟ۚ֫;

    invoke-direct {v0, p0, p1}, Ll/۟ۚ֫;-><init>(Ll/֫֨֫;Landroid/content/Context;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
