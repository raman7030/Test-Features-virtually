.class public Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Lnet/engio/mbassy/bus/config/Feature;


# instance fields
.field public metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

.field public publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

.field public subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

.field public subscriptionManagerProvider:Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final Default()Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
    .locals 2

    .line 25
    new-instance v0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;-><init>()V

    new-instance v1, Lnet/engio/mbassy/listener/MetadataReader;

    invoke-direct {v1}, Lnet/engio/mbassy/listener/MetadataReader;-><init>()V

    .line 26
    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->setMetadataReader(Lnet/engio/mbassy/listener/MetadataReader;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/bus/MessagePublication$Factory;

    invoke-direct {v1}, Lnet/engio/mbassy/bus/MessagePublication$Factory;-><init>()V

    .line 27
    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->setPublicationFactory(Lnet/engio/mbassy/bus/MessagePublication$Factory;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/subscription/SubscriptionFactory;

    invoke-direct {v1}, Lnet/engio/mbassy/subscription/SubscriptionFactory;-><init>()V

    .line 28
    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->setSubscriptionFactory(Lnet/engio/mbassy/subscription/SubscriptionFactory;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/subscription/SubscriptionManagerProvider;

    invoke-direct {v1}, Lnet/engio/mbassy/subscription/SubscriptionManagerProvider;-><init>()V

    .line 29
    invoke-virtual {v0, v1}, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->setSubscriptionManagerProvider(Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getMetadataReader()Lnet/engio/mbassy/listener/MetadataReader;
    .locals 1

    .line 56
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

    return-object v0
.end method

.method public getPublicationFactory()Lnet/engio/mbassy/bus/MessagePublication$Factory;
    .locals 1

    .line 70
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

    return-object v0
.end method

.method public getSubscriptionFactory()Lnet/engio/mbassy/subscription/SubscriptionFactory;
    .locals 1

    .line 47
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

    return-object v0
.end method

.method public getSubscriptionManagerProvider()Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;
    .locals 1

    .line 38
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->subscriptionManagerProvider:Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;

    return-object v0
.end method

.method public setMetadataReader(Lnet/engio/mbassy/listener/MetadataReader;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
    .locals 0

    .line 60
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->metadataReader:Lnet/engio/mbassy/listener/MetadataReader;

    return-object p0
.end method

.method public setPublicationFactory(Lnet/engio/mbassy/bus/MessagePublication$Factory;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
    .locals 0

    .line 74
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->publicationFactory:Lnet/engio/mbassy/bus/MessagePublication$Factory;

    return-object p0
.end method

.method public setSubscriptionFactory(Lnet/engio/mbassy/subscription/SubscriptionFactory;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
    .locals 0

    .line 51
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->subscriptionFactory:Lnet/engio/mbassy/subscription/SubscriptionFactory;

    return-object p0
.end method

.method public setSubscriptionManagerProvider(Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;)Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;
    .locals 0

    .line 42
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/Feature$SyncPubSub;->subscriptionManagerProvider:Lnet/engio/mbassy/subscription/ISubscriptionManagerProvider;

    return-object p0
.end method
