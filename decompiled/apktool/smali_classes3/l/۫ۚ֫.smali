.class public final synthetic Ll/۫ۚ֫;
.super Ljava/lang/Object;
.source "J8TX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۧ֨֫;

.field public final synthetic ᩹:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ll/ۧ֨֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/۫ۚ֫;->᩸:Ll/ۧ֨֫;

    iput-object p1, p0, Ll/۫ۚ֫;->᩹:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 148
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 149
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 150
    new-instance v1, Ll/֫֨֫;

    iget-object v2, p0, Ll/۫ۚ֫;->᩸:Ll/ۧ֨֫;

    invoke-direct {v1, v2}, Ll/֫֨֫;-><init>(Ll/ۧ֨֫;)V

    iget-object v2, p0, Ll/۫ۚ֫;->᩹:Landroid/content/Context;

    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
