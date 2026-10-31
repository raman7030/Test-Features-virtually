.class public final Ll/᩻֨֫;
.super Ljava/lang/Object;
.source "78OY"

# interfaces
.implements Ll/ᩴۚ֫;


# instance fields
.field public ֫:Landroid/os/Message;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩻֨֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 160
    iget-object v0, p0, Ll/᩻֨֫;->֫:Landroid/os/Message;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    .line 170
    iput-object v0, p0, Ll/᩻֨֫;->֫:Landroid/os/Message;

    .line 172
    invoke-static {p0}, Ll/ۜ֨֫;->֫(Ll/᩻֨֫;)V

    return-void
.end method

.method public final ֫(Landroid/os/Message;)V
    .locals 0

    .line 147
    iput-object p1, p0, Ll/᩻֨֫;->֫:Landroid/os/Message;

    return-void
.end method

.method public final ֫(Landroid/os/Handler;)Z
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩻֨֫;->֫:Landroid/os/Message;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    move-result p1

    const/4 v0, 0x0

    .line 170
    iput-object v0, p0, Ll/᩻֨֫;->֫:Landroid/os/Message;

    .line 172
    invoke-static {p0}, Ll/ۜ֨֫;->֫(Ll/᩻֨֫;)V

    return p1
.end method
