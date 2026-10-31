.class public Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;
.super Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
.source "StrongConcurrentSet.java"


# instance fields
.field public value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;-><init>()V

    .line 69
    iput-object p1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;->value:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V
    .locals 0

    .line 63
    invoke-direct {p0, p2}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;-><init>(Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V

    .line 64
    iput-object p1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;->value:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;Lnet/engio/mbassy/common/StrongConcurrentSet$1;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;-><init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/StrongConcurrentSet$1;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 74
    iget-object v0, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$StrongEntry;->value:Ljava/lang/Object;

    return-object v0
.end method
