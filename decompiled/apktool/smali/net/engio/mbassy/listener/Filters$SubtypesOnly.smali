.class public final Lnet/engio/mbassy/listener/Filters$SubtypesOnly;
.super Ljava/lang/Object;
.source "Filters.java"

# interfaces
.implements Lnet/engio/mbassy/listener/IMessageFilter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accepts(Ljava/lang/Object;Lnet/engio/mbassy/subscription/SubscriptionContext;)Z
    .locals 5

    .line 47
    invoke-virtual {p2}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lnet/engio/mbassy/listener/MessageHandler;->getHandledMessages()[Ljava/lang/Class;

    move-result-object p2

    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
