.class public Lnet/engio/mbassy/subscription/MessageEnvelope;
.super Ljava/lang/Object;
.source "MessageEnvelope.java"


# instance fields
.field public message:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lnet/engio/mbassy/subscription/MessageEnvelope;->message:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/Object;
    .locals 1

    .line 20
    iget-object v0, p0, Lnet/engio/mbassy/subscription/MessageEnvelope;->message:Ljava/lang/Object;

    return-object v0
.end method
