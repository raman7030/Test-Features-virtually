.class public abstract Lbin/mt/json/JSONHandler;
.super Ljava/lang/Object;
.source "JSONHandler.java"


# instance fields
.field public parser:Lbin/mt/json/JSONParser;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public endArray(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public endArrayValue(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public endBoolean(Z)V
    .locals 0

    return-void
.end method

.method public endNull()V
    .locals 0

    return-void
.end method

.method public endNumber(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public endObject(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public endObjectName(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public endObjectValue(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public endString(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public getLocation()Lbin/mt/json/Location;
    .locals 1

    .line 60
    iget-object v0, p0, Lbin/mt/json/JSONHandler;->parser:Lbin/mt/json/JSONParser;

    invoke-virtual {v0}, Lbin/mt/json/JSONParser;->getLocation()Lbin/mt/json/Location;

    move-result-object v0

    return-object v0
.end method

.method public startArray()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public startArrayValue(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public startBoolean()V
    .locals 0

    return-void
.end method

.method public startNull()V
    .locals 0

    return-void
.end method

.method public startNumber()V
    .locals 0

    return-void
.end method

.method public startObject()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public startObjectName(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public startObjectValue(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public startString()V
    .locals 0

    return-void
.end method
