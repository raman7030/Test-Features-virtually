.class public final Ll/ᩳܽۘ;
.super Ljava/lang/Object;
.source "V9DJ"

# interfaces
.implements Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;


# virtual methods
.method public final handleError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    .locals 2

    .line 39
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    invoke-static {}, Ll/ܿܽۘ;->֫()Ll/֫᩻֨;

    move-result-object v0

    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 42
    :cond_0
    invoke-static {}, Ll/ܿܽۘ;->֫()Ll/֫᩻֨;

    move-result-object v0

    invoke-virtual {p1}, Lnet/engio/mbassy/bus/error/PublicationError;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return-void
.end method
