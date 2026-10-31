.class public Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;
.super Ljava/lang/Object;
.source "SyncMessageBus.java"

# interfaces
.implements Lnet/engio/mbassy/bus/publication/IPublicationCommand;


# instance fields
.field public message:Ljava/lang/Object;

.field public final synthetic this$0:Lnet/engio/mbassy/bus/SyncMessageBus;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/SyncMessageBus;Ljava/lang/Object;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;->this$0:Lnet/engio/mbassy/bus/SyncMessageBus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p2, p0, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;->message:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public now()Lnet/engio/mbassy/bus/IMessagePublication;
    .locals 2

    .line 74
    iget-object v0, p0, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;->this$0:Lnet/engio/mbassy/bus/SyncMessageBus;

    iget-object v1, p0, Lnet/engio/mbassy/bus/SyncMessageBus$SyncPostCommand;->message:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/SyncMessageBus;->publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    move-result-object v0

    return-object v0
.end method
