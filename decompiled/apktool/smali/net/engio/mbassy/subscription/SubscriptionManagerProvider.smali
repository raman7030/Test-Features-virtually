.class public Lnet/engio/mbassy/subscription/SubscriptionManagerProvider;
.super Ljava/lang/Object;
.source "SubscriptionManagerProvider.java"

# interfaces
.implements Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createManager(Lnet/engio/mbassy/listener/MetadataReader;Lnet/engio/mbassy/subscription/SubscriptionFactory;Lnet/engio/mbassy/bus/BusRuntime;)Lnet/engio/mbassy/subscription/SubscriptionManager;
    .locals 1

    .line 10
    new-instance v0, Lnet/engio/mbassy/subscription/SubscriptionManager;

    invoke-direct {v0, p1, p2, p3}, Lnet/engio/mbassy/subscription/SubscriptionManager;-><init>(Lnet/engio/mbassy/listener/MetadataReader;Lnet/engio/mbassy/subscription/SubscriptionFactory;Lnet/engio/mbassy/bus/BusRuntime;)V

    return-object v0
.end method
