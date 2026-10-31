.class public final Ll/᩸᩷ۜ;
.super Ljava/lang/Object;
.source "T77G"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Ll/᩸᩷ۜ;->ܳ:I

    .line 44
    iput p2, p0, Ll/᩸᩷ۜ;->ۧ:I

    .line 45
    iput p3, p0, Ll/᩸᩷ۜ;->֫:I

    .line 46
    iput p4, p0, Ll/᩸᩷ۜ;->ܿ:I

    .line 47
    iput p5, p0, Ll/᩸᩷ۜ;->ᩳ:I

    .line 48
    iput p6, p0, Ll/᩸᩷ۜ;->ܽ:I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Ll/᩸᩷ۜ;
    .locals 9

    const-string v0, "scopeIndex"

    const/4 v1, 0x0

    .line 76
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    const-string v0, "entryIndex"

    .line 77
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "classIndex"

    .line 78
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v0, "memberIndex"

    .line 79
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "instructionIndex"

    .line 80
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "innerIndex"

    .line 81
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v8

    if-ltz v3, :cond_0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    if-ltz v6, :cond_0

    if-ltz v7, :cond_0

    if-ltz v8, :cond_0

    .line 87
    new-instance p0, Ll/᩸᩷ۜ;

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Ll/᩸᩷ۜ;-><init>(IIIIII)V

    return-object p0

    .line 85
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

    .line 84
    invoke-static {v1, v2, p1, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
