.class public Lorg/simpleframework/xml/stream/InputPosition;
.super Ljava/lang/Object;
.source "InputPosition.java"

# interfaces
.implements Lorg/simpleframework/xml/stream/Position;


# instance fields
.field public source:Lorg/simpleframework/xml/stream/EventNode;


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/stream/EventNode;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/simpleframework/xml/stream/InputPosition;->source:Lorg/simpleframework/xml/stream/EventNode;

    return-void
.end method


# virtual methods
.method public getLine()I
    .locals 1

    .line 57
    iget-object v0, p0, Lorg/simpleframework/xml/stream/InputPosition;->source:Lorg/simpleframework/xml/stream/EventNode;

    invoke-interface {v0}, Lorg/simpleframework/xml/stream/EventNode;->getLine()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 68
    invoke-virtual {p0}, Lorg/simpleframework/xml/stream/InputPosition;->getLine()I

    move-result v0

    const-string v1, "line "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
