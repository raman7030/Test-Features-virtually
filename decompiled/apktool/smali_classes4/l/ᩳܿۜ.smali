.class public final Ll/ᩳܿۜ;
.super Ljava/lang/Object;
.source "87B0"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:J

.field public final ᩳ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 9

    const-wide/16 v6, -0x1

    const/4 v8, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 43
    invoke-direct/range {v0 .. v8}, Ll/ᩳܿۜ;-><init>(IIIIIJI)V

    return-void
.end method

.method public constructor <init>(IIIIIJI)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Ll/ᩳܿۜ;->᩻:I

    .line 49
    iput p2, p0, Ll/ᩳܿۜ;->ܽ:I

    .line 50
    iput p3, p0, Ll/ᩳܿۜ;->ۧ:I

    .line 51
    iput p4, p0, Ll/ᩳܿۜ;->ᩳ:I

    .line 52
    iput p5, p0, Ll/ᩳܿۜ;->֫:I

    .line 53
    iput-wide p6, p0, Ll/ᩳܿۜ;->ܿ:J

    .line 54
    iput p8, p0, Ll/ᩳܿۜ;->ܳ:I

    return-void
.end method

.method public static ֫(III)Ll/ᩳܿۜ;
    .locals 7

    .line 81
    new-instance v6, Ll/ᩳܿۜ;

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v3, p1

    move v4, p2

    .line 36
    invoke-direct/range {v0 .. v5}, Ll/ᩳܿۜ;-><init>(IIIII)V

    return-object v6
.end method

.method public static ֫(IIIIJ)Ll/ᩳܿۜ;
    .locals 10

    .line 60
    new-instance v9, Ll/ᩳܿۜ;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v9

    move v1, p0

    move v2, p1

    move v4, p2

    move-wide v6, p4

    move v8, p3

    invoke-direct/range {v0 .. v8}, Ll/ᩳܿۜ;-><init>(IIIIIJI)V

    return-object v9
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Ll/ᩳܿۜ;
    .locals 11

    const-string v0, "scopeIndex"

    const/4 v1, 0x0

    .line 95
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    const-string v0, "entryIndex"

    .line 96
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "classIndex"

    .line 97
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v0, "memberIndex"

    const/4 v2, -0x1

    .line 98
    invoke-virtual {p0, v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "classCharOffset"

    .line 99
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "nativeStringScanOffset"

    const-wide/16 v8, -0x1

    .line 100
    invoke-virtual {p0, v0, v8, v9}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v10, "nativeStringTotalCount"

    .line 101
    invoke-virtual {p0, v10, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v10

    if-ltz v3, :cond_2

    if-ltz v4, :cond_2

    if-ltz v5, :cond_2

    if-lt v6, v2, :cond_2

    if-ltz v7, :cond_2

    cmp-long p0, v0, v8

    if-ltz p0, :cond_2

    if-lt v10, v2, :cond_2

    const-wide/16 v8, 0x0

    cmp-long p0, v0, v8

    if-ltz p0, :cond_0

    if-ltz v10, :cond_2

    :cond_0
    if-ltz v10, :cond_1

    if-ltz v6, :cond_2

    if-gt v6, v10, :cond_2

    .line 109
    :cond_1
    new-instance p0, Ll/ᩳܿۜ;

    move-object v2, p0

    move-wide v8, v0

    invoke-direct/range {v2 .. v10}, Ll/ᩳܿۜ;-><init>(IIIIIJI)V

    return-object p0

    .line 107
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "<cursor>"

    const-string v2, "nextCursor"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Invalid cursor position"

    .line 106
    invoke-static {v1, v2, p1, p0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
