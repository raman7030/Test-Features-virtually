.class public final Ll/ܶܳܿ;
.super Ljava/lang/Object;
.source "47OP"


# instance fields
.field public final ֫:Ll/ۧܿܿ;

.field public final ۧ:Ll/ۧܿܿ;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 27
    new-instance v0, Ll/ۙᩳܿ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ܶܳܿ;->ܽ:Ljava/lang/String;

    .line 32
    invoke-virtual {p2}, Ll/ۧܿܿ;->ܽ()I

    move-result p1

    const/16 v0, 0x1f

    if-ne p1, v0, :cond_0

    .line 33
    new-instance p2, Ll/ۙᩳܿ;

    const-string p1, "error"

    invoke-direct {p2, p1}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    .line 35
    :cond_0
    iput-object p2, p0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    .line 36
    iput-object p3, p0, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    .line 37
    iput-object p0, p2, Ll/ۧܿܿ;->֫:Ll/ܶܳܿ;

    if-eqz p3, :cond_1

    .line 39
    iput-object p0, p3, Ll/ۧܿܿ;->֫:Ll/ܶܳܿ;

    :cond_1
    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;
    .locals 7

    const-string v0, "a"

    .line 107
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "b"

    .line 108
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x22

    const/16 v3, 0x1b

    const/4 v4, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_0

    .line 122
    new-instance v5, Ll/ۧܿܿ;

    invoke-direct {v5, v0}, Ll/ۧܿܿ;-><init>(I)V

    goto :goto_0

    .line 119
    :cond_0
    new-instance v5, Ll/ۨᩳܿ;

    const-string v0, "h"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 56
    invoke-direct {v5, v0, v4}, Ll/ۨᩳܿ;-><init>(Lbin/mt/json/JSONObject;Ll/ۤۤ;)V

    goto :goto_0

    .line 116
    :cond_1
    new-instance v5, Ll/᩹ᩳܿ;

    const-string v0, "f"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v5, v0}, Ll/᩹ᩳܿ;-><init>(Lbin/mt/json/JSONObject;)V

    goto :goto_0

    .line 113
    :cond_2
    new-instance v5, Ll/ۙᩳܿ;

    const-string v0, "c"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v0, "d"

    .line 125
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 126
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    .line 138
    new-instance v4, Ll/ۧܿܿ;

    invoke-direct {v4, v0}, Ll/ۧܿܿ;-><init>(I)V

    goto :goto_1

    .line 135
    :cond_3
    new-instance v0, Ll/ۨᩳܿ;

    const-string v2, "i"

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 56
    invoke-direct {v0, p0, v4}, Ll/ۨᩳܿ;-><init>(Lbin/mt/json/JSONObject;Ll/ۤۤ;)V

    move-object v4, v0

    goto :goto_1

    .line 132
    :cond_4
    new-instance v4, Ll/᩹ᩳܿ;

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-direct {v4, p0}, Ll/᩹ᩳܿ;-><init>(Lbin/mt/json/JSONObject;)V

    goto :goto_1

    .line 129
    :cond_5
    new-instance v4, Ll/ۙᩳܿ;

    const-string v0, "e"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    .line 144
    :cond_6
    :goto_1
    new-instance p0, Ll/ܶܳܿ;

    invoke-direct {p0, v1, v5, v4}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۧܿܿ;->֫(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iget-object v2, p0, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Ll/ۧܿܿ;->֫(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    return v0

    :cond_1
    return v1
.end method

.method public final ۧ()Ll/ۧܿܿ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    return-object v0
.end method

.method public final ܽ()Ll/ۧܿܿ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 75
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 76
    iget-object v1, p0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    invoke-virtual {v1}, Ll/ۧܿܿ;->ܽ()I

    move-result v2

    const-string v3, "a"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v2, "b"

    .line 77
    iget-object v3, p0, Ll/ܶܳܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 78
    invoke-virtual {v1}, Ll/ۧܿܿ;->ܽ()I

    move-result v2

    const/16 v3, 0x22

    const/16 v4, 0x1b

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "h"

    .line 86
    invoke-virtual {v1}, Ll/ۧܿܿ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_1
    const-string v2, "f"

    .line 83
    invoke-virtual {v1}, Ll/ۧܿܿ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_2
    const-string v2, "c"

    .line 80
    invoke-virtual {v1}, Ll/ۧܿܿ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 89
    :goto_0
    iget-object v1, p0, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    if-eqz v1, :cond_6

    const-string v2, "d"

    .line 90
    invoke-virtual {v1}, Ll/ۧܿܿ;->ܽ()I

    move-result v5

    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 91
    invoke-virtual {v1}, Ll/ۧܿܿ;->ܽ()I

    move-result v2

    if-eqz v2, :cond_5

    if-eq v2, v4, :cond_4

    if-eq v2, v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "i"

    .line 99
    invoke-virtual {v1}, Ll/ۧܿܿ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object v0

    :cond_4
    const-string v2, "g"

    .line 96
    invoke-virtual {v1}, Ll/ۧܿܿ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object v0

    :cond_5
    const-string v2, "e"

    .line 93
    invoke-virtual {v1}, Ll/ۧܿܿ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_6
    :goto_1
    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܶܳܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
