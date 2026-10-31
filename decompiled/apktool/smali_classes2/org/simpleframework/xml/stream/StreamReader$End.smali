.class public Lorg/simpleframework/xml/stream/StreamReader$End;
.super Lorg/simpleframework/xml/stream/EventToken;
.source "StreamReader.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 482
    invoke-direct {p0}, Lorg/simpleframework/xml/stream/EventToken;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/simpleframework/xml/stream/StreamReader$1;)V
    .locals 0

    .line 482
    invoke-direct {p0}, Lorg/simpleframework/xml/stream/StreamReader$End;-><init>()V

    return-void
.end method


# virtual methods
.method public isEnd()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
