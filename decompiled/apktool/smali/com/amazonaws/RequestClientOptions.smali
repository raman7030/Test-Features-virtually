.class public final Lcom/amazonaws/RequestClientOptions;
.super Ljava/lang/Object;
.source "RequestClientOptions.java"


# instance fields
.field public final ֫:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/amazonaws/RequestClientOptions$Marker;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/amazonaws/RequestClientOptions;->֫:Ljava/util/EnumMap;

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/RequestClientOptions$Marker;)Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/amazonaws/RequestClientOptions;->֫:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 97
    sget-object v0, Lcom/amazonaws/RequestClientOptions$Marker;->᩹:Lcom/amazonaws/RequestClientOptions$Marker;

    iget-object v1, p0, Lcom/amazonaws/RequestClientOptions;->֫:Ljava/util/EnumMap;

    invoke-virtual {v1, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    .line 113
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, " "

    .line 0
    invoke-static {v2, v3, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 77
    :goto_0
    invoke-virtual {v1, v0, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
