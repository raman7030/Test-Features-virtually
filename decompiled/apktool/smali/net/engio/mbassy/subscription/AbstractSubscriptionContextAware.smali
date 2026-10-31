.class public Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;
.super Ljava/lang/Object;
.source "AbstractSubscriptionContextAware.java"

# interfaces
.implements Lnet/engio/mbassy/subscription/ISubscriptionContextAware;


# instance fields
.field public final context:Lnet/engio/mbassy/subscription/SubscriptionContext;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/subscription/SubscriptionContext;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    return-void
.end method


# virtual methods
.method public final getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;
    .locals 1

    .line 18
    iget-object v0, p0, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;->context:Lnet/engio/mbassy/subscription/SubscriptionContext;

    return-object v0
.end method
