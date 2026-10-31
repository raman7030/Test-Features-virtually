.class public final Lnet/engio/mbassy/subscription/Subscription$1;
.super Ljava/lang/Object;
.source "Subscription.java"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 100
    check-cast p1, Lnet/engio/mbassy/subscription/Subscription;

    check-cast p2, Lnet/engio/mbassy/subscription/Subscription;

    invoke-virtual {p0, p1, p2}, Lnet/engio/mbassy/subscription/Subscription$1;->compare(Lnet/engio/mbassy/subscription/Subscription;Lnet/engio/mbassy/subscription/Subscription;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/engio/mbassy/subscription/Subscription;Lnet/engio/mbassy/subscription/Subscription;)I
    .locals 2

    .line 103
    invoke-virtual {p2}, Lnet/engio/mbassy/subscription/Subscription;->getPriority()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/Subscription;->getPriority()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    if-nez v0, :cond_0

    .line 104
    invoke-static {p2}, Lnet/engio/mbassy/subscription/Subscription;->access$000(Lnet/engio/mbassy/subscription/Subscription;)Ljava/util/UUID;

    move-result-object p2

    invoke-static {p1}, Lnet/engio/mbassy/subscription/Subscription;->access$000(Lnet/engio/mbassy/subscription/Subscription;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/UUID;->compareTo(Ljava/util/UUID;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method
