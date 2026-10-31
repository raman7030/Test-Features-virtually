.class public Lnet/engio/mbassy/bus/MessagePublication$Factory;
.super Ljava/lang/Object;
.source "MessagePublication.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createPublication(Lnet/engio/mbassy/bus/BusRuntime;Ljava/util/Collection;Ljava/lang/Object;)Lnet/engio/mbassy/bus/MessagePublication;
    .locals 2

    .line 121
    new-instance v0, Lnet/engio/mbassy/bus/MessagePublication;

    sget-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Initial:Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-direct {v0, p1, p2, p3, v1}, Lnet/engio/mbassy/bus/MessagePublication;-><init>(Lnet/engio/mbassy/bus/BusRuntime;Ljava/util/Collection;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication$State;)V

    return-object v0
.end method
