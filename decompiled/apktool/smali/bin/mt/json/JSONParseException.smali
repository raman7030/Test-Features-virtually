.class public Lbin/mt/json/JSONParseException;
.super Ljava/lang/RuntimeException;
.source "JSONParseException.java"


# instance fields
.field public final location:Lbin/mt/json/Location;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbin/mt/json/Location;)V
    .locals 1

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 35
    iput-object p2, p0, Lbin/mt/json/JSONParseException;->location:Lbin/mt/json/Location;

    return-void
.end method


# virtual methods
.method public getLocation()Lbin/mt/json/Location;
    .locals 1

    .line 45
    iget-object v0, p0, Lbin/mt/json/JSONParseException;->location:Lbin/mt/json/Location;

    return-object v0
.end method
