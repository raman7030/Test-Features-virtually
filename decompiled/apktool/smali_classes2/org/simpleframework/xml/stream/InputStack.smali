.class public Lorg/simpleframework/xml/stream/InputStack;
.super Lorg/simpleframework/xml/stream/Stack;
.source "InputStack.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 40
    invoke-direct {p0, v0}, Lorg/simpleframework/xml/stream/Stack;-><init>(I)V

    return-void
.end method


# virtual methods
.method public isRelevant(Lorg/simpleframework/xml/stream/InputNode;)Z
    .locals 0

    .line 55
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
