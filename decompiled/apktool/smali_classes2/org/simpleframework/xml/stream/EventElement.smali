.class public abstract Lorg/simpleframework/xml/stream/EventElement;
.super Ljava/util/ArrayList;
.source "EventElement.java"

# interfaces
.implements Lorg/simpleframework/xml/stream/EventNode;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public getLine()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isEnd()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isStart()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isText()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
