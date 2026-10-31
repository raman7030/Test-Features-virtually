.class public Lnet/engio/mbassy/dispatch/el/ElFilter;
.super Ljava/lang/Object;
.source "ElFilter.java"

# interfaces
.implements Lnet/engio/mbassy/listener/IMessageFilter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ELFactory()Ljavax/el/ExpressionFactory;
    .locals 1

    .line 46
    sget-object v0, Lnet/engio/mbassy/dispatch/el/ElFilter$ExpressionFactoryHolder;->ELFactory:Ljavax/el/ExpressionFactory;

    return-object v0
.end method

.method private evalExpression(Ljava/lang/String;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/subscription/SubscriptionContext;Ljava/lang/Object;)Z
    .locals 2

    .line 62
    invoke-static {}, Lnet/engio/mbassy/dispatch/el/ElFilter;->ELFactory()Ljavax/el/ExpressionFactory;

    move-result-object v0

    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {v0, p2, p1, v1}, Ljavax/el/ExpressionFactory;->createValueExpression(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;

    move-result-object p1

    .line 64
    :try_start_0
    invoke-virtual {p1, p2}, Ljavax/el/ValueExpression;->getValue(Ljavax/el/ELContext;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    move-exception p1

    .line 66
    new-instance p2, Lnet/engio/mbassy/bus/error/PublicationError;

    const-string v0, "Error while evaluating EL expression on message"

    invoke-direct {p2, p1, v0, p3}, Lnet/engio/mbassy/bus/error/PublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/subscription/SubscriptionContext;)V

    .line 67
    invoke-virtual {p2, p4}, Lnet/engio/mbassy/bus/error/PublicationError;->setPublishedMessage(Ljava/lang/Object;)Lnet/engio/mbassy/bus/error/PublicationError;

    move-result-object p1

    .line 68
    invoke-virtual {p3, p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->handleError(Lnet/engio/mbassy/bus/error/PublicationError;)V

    const/4 p1, 0x0

    return p1
.end method

.method public static final isELAvailable()Z
    .locals 1

    .line 42
    sget-object v0, Lnet/engio/mbassy/dispatch/el/ElFilter$ExpressionFactoryHolder;->ELFactory:Ljavax/el/ExpressionFactory;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public accepts(Ljava/lang/Object;Lnet/engio/mbassy/subscription/SubscriptionContext;)Z
    .locals 2

    .line 52
    invoke-virtual {p2}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lnet/engio/mbassy/listener/MessageHandler;->getCondition()Ljava/lang/String;

    move-result-object v0

    .line 54
    new-instance v1, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;

    invoke-direct {v1, p1}, Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;-><init>(Ljava/lang/Object;)V

    .line 55
    invoke-direct {p0, v0, v1, p2, p1}, Lnet/engio/mbassy/dispatch/el/ElFilter;->evalExpression(Ljava/lang/String;Lnet/engio/mbassy/dispatch/el/StandardELResolutionContext;Lnet/engio/mbassy/subscription/SubscriptionContext;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
