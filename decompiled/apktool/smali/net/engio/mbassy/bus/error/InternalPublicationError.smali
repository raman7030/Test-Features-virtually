.class public Lnet/engio/mbassy/bus/error/InternalPublicationError;
.super Lnet/engio/mbassy/bus/error/PublicationError;
.source "InternalPublicationError.java"


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Lnet/engio/mbassy/bus/error/PublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lnet/engio/mbassy/bus/error/PublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V

    return-void
.end method
