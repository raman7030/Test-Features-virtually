.class public final Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;
.super Ljava/lang/Object;
.source "IPublicationErrorHandler.java"

# interfaces
.implements Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;


# instance fields
.field public final printStackTrace:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0}, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean p1, p0, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;->printStackTrace:Z

    return-void
.end method


# virtual methods
.method public handleError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    .locals 1

    .line 46
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 49
    iget-boolean v0, p0, Lnet/engio/mbassy/bus/error/IPublicationErrorHandler$ConsoleLogger;->printStackTrace:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
