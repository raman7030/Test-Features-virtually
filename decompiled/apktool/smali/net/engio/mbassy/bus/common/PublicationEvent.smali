.class public abstract Lnet/engio/mbassy/bus/common/PublicationEvent;
.super Ljava/lang/Object;
.source "PublicationEvent.java"


# instance fields
.field public relatedMessage:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lnet/engio/mbassy/bus/common/PublicationEvent;->relatedMessage:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/Object;
    .locals 1

    .line 19
    iget-object v0, p0, Lnet/engio/mbassy/bus/common/PublicationEvent;->relatedMessage:Ljava/lang/Object;

    return-object v0
.end method
