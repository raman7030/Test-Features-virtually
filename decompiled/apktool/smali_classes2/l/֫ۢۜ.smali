.class public final Ll/֫ۢۜ;
.super Ljava/lang/Object;
.source "377O"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Ll/֫ۢۜ;->֫:I

    .line 50
    iput p2, p0, Ll/֫ۢۜ;->ܽ:I

    .line 51
    iput p3, p0, Ll/֫ۢۜ;->ۧ:I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Ll/֫ۢۜ;
    .locals 4

    const-string v0, "classIndex"

    const/4 v1, 0x0

    .line 65
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "memberIndex"

    .line 66
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "instructionIndex"

    .line 67
    invoke-virtual {p0, v3, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz v0, :cond_0

    if-ltz v2, :cond_0

    if-ltz p0, :cond_0

    .line 72
    new-instance p1, Ll/֫ۢۜ;

    invoke-direct {p1, v0, v2, p0}, Ll/֫ۢۜ;-><init>(III)V

    return-object p1

    .line 70
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "<cursor>"

    const-string v2, "nextCursor"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Invalid cursor position"

    .line 69
    invoke-static {v1, v2, p1, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
