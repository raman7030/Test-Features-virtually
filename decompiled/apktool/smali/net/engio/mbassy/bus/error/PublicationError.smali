.class public Lnet/engio/mbassy/bus/error/PublicationError;
.super Ljava/lang/Object;
.source "PublicationError.java"


# instance fields
.field public cause:Ljava/lang/Throwable;

.field public errorMsg:Ljava/lang/String;

.field public handler:Ljava/lang/reflect/Method;

.field public listener:Ljava/lang/Object;

.field public message:Ljava/lang/Object;

.field public publication:Lnet/engio/mbassy/bus/IMessagePublication;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    .line 72
    iput-object p2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/Object;Lnet/engio/mbassy/bus/IMessagePublication;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    .line 48
    iput-object p2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    .line 49
    iput-object p3, p0, Lnet/engio/mbassy/bus/error/PublicationError;->handler:Ljava/lang/reflect/Method;

    .line 50
    iput-object p4, p0, Lnet/engio/mbassy/bus/error/PublicationError;->listener:Ljava/lang/Object;

    .line 51
    iput-object p5, p0, Lnet/engio/mbassy/bus/error/PublicationError;->publication:Lnet/engio/mbassy/bus/IMessagePublication;

    if-eqz p5, :cond_0

    .line 52
    invoke-interface {p5}, Lnet/engio/mbassy/bus/IMessagePublication;->getMessage()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->message:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    .line 59
    iput-object p2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/subscription/SubscriptionContext;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    .line 66
    iput-object p2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    .line 67
    invoke-virtual {p3}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/listener/MessageHandler;->getMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->handler:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .line 87
    iget-object v0, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    return-object v0
.end method

.method public getHandler()Ljava/lang/reflect/Method;
    .locals 1

    .line 116
    iget-object v0, p0, Lnet/engio/mbassy/bus/error/PublicationError;->handler:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public getListener()Ljava/lang/Object;
    .locals 1

    .line 125
    iget-object v0, p0, Lnet/engio/mbassy/bus/error/PublicationError;->listener:Ljava/lang/Object;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getPublishedMessage()Ljava/lang/Object;
    .locals 1

    .line 134
    iget-object v0, p0, Lnet/engio/mbassy/bus/error/PublicationError;->message:Ljava/lang/Object;

    return-object v0
.end method

.method public setCause(Ljava/lang/Throwable;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 97
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    return-object p0
.end method

.method public setHandler(Ljava/lang/reflect/Method;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 120
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->handler:Ljava/lang/reflect/Method;

    return-object p0
.end method

.method public setListener(Ljava/lang/Object;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 129
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->listener:Ljava/lang/Object;

    return-object p0
.end method

.method public setMessage(Ljava/lang/String;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 106
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    return-object p0
.end method

.method public setPublication(Lnet/engio/mbassy/bus/IMessagePublication;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 138
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->publication:Lnet/engio/mbassy/bus/IMessagePublication;

    return-object p0
.end method

.method public setPublishedMessage(Ljava/lang/Object;)Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 0

    .line 111
    iput-object p1, p0, Lnet/engio/mbassy/bus/error/PublicationError;->message:Ljava/lang/Object;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "line.separator"

    .line 147
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "PublicationError{"

    const-string v2, "\tcause="

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 148
    iget-object v2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->cause:Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tmessage=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->errorMsg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\thandler="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->handler:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tlistener="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnet/engio/mbassy/bus/error/PublicationError;->listener:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\tpublishedMessage="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/error/PublicationError;->getPublishedMessage()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
