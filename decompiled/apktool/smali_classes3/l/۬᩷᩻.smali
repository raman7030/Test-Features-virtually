.class public final synthetic Ll/۬᩷᩻;
.super Ljava/lang/Object;
.source "W79N"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֫ۢ᩻;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۢ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩷᩻;->᩸:Ll/֫ۢ᩻;

    iput-object p2, p0, Ll/۬᩷᩻;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1344
    iget-object v0, p0, Ll/۬᩷᩻;->᩸:Ll/֫ۢ᩻;

    check-cast v0, Ll/᩵ۢ᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v0

    .line 67
    iget-object v1, p0, Ll/۬᩷᩻;->᩹:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
