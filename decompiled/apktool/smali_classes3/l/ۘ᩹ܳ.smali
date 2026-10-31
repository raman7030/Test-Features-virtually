.class public final synthetic Ll/ۘ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/ۤۗۧ;


# instance fields
.field public final synthetic ֫:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩹ܳ;->֫:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 1097
    sget v0, Ll/ܽ᩶ܳ;->᩺:I

    .line 1108
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ll/᩸ۛᩳ;

    const/4 v2, 0x3

    iget-object v3, p0, Ll/ۘ᩹ܳ;->֫:Ll/֡ۚۢ;

    invoke-direct {v1, v2, v3}, Ll/᩸ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
