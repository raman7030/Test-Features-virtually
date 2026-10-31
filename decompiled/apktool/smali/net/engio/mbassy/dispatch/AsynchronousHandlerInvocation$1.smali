.class public Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;
.super Ljava/lang/Object;
.source "AsynchronousHandlerInvocation.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic this$0:Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;

.field public final synthetic val$listener:Ljava/lang/Object;

.field public final synthetic val$message:Ljava/lang/Object;

.field public final synthetic val$publication:Lnet/engio/mbassy/bus/MessagePublication;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->this$0:Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;

    iput-object p2, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$listener:Ljava/lang/Object;

    iput-object p3, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$message:Ljava/lang/Object;

    iput-object p4, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$publication:Lnet/engio/mbassy/bus/MessagePublication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 35
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->this$0:Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;

    invoke-static {v0}, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;->access$000(Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    move-result-object v0

    iget-object v1, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$listener:Ljava/lang/Object;

    iget-object v2, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$message:Ljava/lang/Object;

    iget-object v3, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;->val$publication:Lnet/engio/mbassy/bus/MessagePublication;

    invoke-interface {v0, v1, v2, v3}, Lnet/engio/mbassy/dispatch/IHandlerInvocation;->invoke(Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V

    return-void
.end method
