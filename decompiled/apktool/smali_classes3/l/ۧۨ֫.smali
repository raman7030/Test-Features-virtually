.class public final synthetic Ll/ۧۨ֫;
.super Ljava/lang/Object;
.source "J8KC"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic ֫:Ll/ᩳۨ֫;

.field public final synthetic ۧ:Ll/ۨۛ֫;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۨ֫;Ll/ۨۛ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۨ֫;->֫:Ll/ᩳۨ֫;

    iput-object p2, p0, Ll/ۧۨ֫;->ۧ:Ll/ۨۛ֫;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ۧۨ֫;->֫:Ll/ᩳۨ֫;

    .line 4
    iget-object p4, p0, Ll/ۧۨ֫;->ۧ:Ll/ۨۛ֫;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    check-cast p4, Ll/ᩳۛ֫;

    .line 923
    iget-object p1, p4, Ll/ᩳۛ֫;->֫:Ll/ۖۛ֫;

    iget-object p1, p1, Ll/ۖۛ֫;->ۜ:Ll/ܿۛ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
