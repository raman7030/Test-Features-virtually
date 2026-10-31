.class public final Lnet/engio/mbassy/listener/MessageListener$1;
.super Ljava/lang/Object;
.source "MessageListener.java"

# interfaces
.implements Lnet/engio/mbassy/common/IPredicate;


# instance fields
.field public final synthetic val$messageType:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lnet/engio/mbassy/listener/MessageListener$1;->val$messageType:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 0

    .line 30
    check-cast p1, Lnet/engio/mbassy/listener/MessageHandler;

    invoke-virtual {p0, p1}, Lnet/engio/mbassy/listener/MessageListener$1;->apply(Lnet/engio/mbassy/listener/MessageHandler;)Z

    move-result p1

    return p1
.end method

.method public apply(Lnet/engio/mbassy/listener/MessageHandler;)Z
    .locals 1

    .line 33
    iget-object v0, p0, Lnet/engio/mbassy/listener/MessageListener$1;->val$messageType:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lnet/engio/mbassy/listener/MessageHandler;->handlesMessage(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
