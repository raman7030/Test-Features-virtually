.class public final Ll/ۜᩴۢ;
.super Ljava/lang/Object;
.source "R7AS"


# instance fields
.field public final ֫:Ll/᩺ᩴۢ;


# direct methods
.method public constructor <init>(Ll/ۗ֡ۢ;Ll/᩺ᩴۢ;Ll/ۧᩴۢ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    return-void
.end method

.method private varargs ֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;
    .locals 0

    .line 62
    invoke-static {p3, p4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p2

    .line 89
    invoke-static {p1}, Ll/ܿۚۢ;->ܽ(Ll/ܺܳܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 90
    invoke-virtual {p2}, Ll/۠ܳܳ;->֫()V

    :cond_0
    return-object p2
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 8

    .line 45
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 46
    sget-object v0, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v2, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1, v0, v2, v1}, Ll/ۜᩴۢ;->֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    iget-object v0, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {v0, p1}, Ll/᩺ᩴۢ;->ᩳ(Ll/ܺܳܳ;)Ll/ۤᩴۢ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 50
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    iget v1, v2, Ll/ۤᩴۢ;->ᩳ:I

    iget-object v2, v2, Ll/ۤᩴۢ;->ܽ:[Ljava/lang/Object;

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۜᩴۢ;->֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 99
    :cond_1
    invoke-static {p1}, Ll/ܿۚۢ;->ۧ(Ll/ܺܳܳ;)Z

    move-result v2

    const v3, 0x7f120813

    if-eqz v2, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v2, "content-length"

    .line 102
    invoke-static {p1, v2}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    .line 106
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 110
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_6

    .line 111
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_9

    const/16 v6, 0x39

    if-le v5, v6, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 117
    :cond_6
    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const-wide/16 v6, 0x2000

    cmp-long v2, v4, v6

    if-gtz v2, :cond_9

    .line 63
    :try_start_1
    invoke-static {p1}, Ll/ܿۚۢ;->ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    invoke-virtual {v0, p1, v1}, Ll/᩺ᩴۢ;->֫(Ll/ܺܳܳ;Ljava/lang/String;)Ll/ۤᩴۢ;

    move-result-object p1

    iget-object v0, p1, Ll/ۤᩴۢ;->ܽ:[Ljava/lang/Object;

    iget v1, p1, Ll/ۤᩴۢ;->ᩳ:I

    iget-object v2, p1, Ll/ۤᩴۢ;->ۧ:Ljava/lang/String;

    .line 69
    iget-boolean v3, p1, Ll/ۤᩴۢ;->ܿ:Z

    if-nez v3, :cond_8

    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    .line 71
    sget-object p1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    .line 52
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v4, "error"

    .line 53
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    .line 54
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "application/json"

    .line 55
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {p1, v1, v0}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 78
    :cond_7
    sget-object p1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "deviceId"

    .line 80
    iget-object p1, p1, Ll/ۤᩴۢ;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 65
    :catch_0
    invoke-virtual {v0, p1}, Ll/᩺ᩴۢ;->ܿ(Ll/ܺܳܳ;)V

    .line 66
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1, v0, v3, v1}, Ll/ۜᩴۢ;->֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 58
    :catch_1
    :cond_9
    :goto_1
    invoke-virtual {v0, p1}, Ll/᩺ᩴۢ;->ܿ(Ll/ܺܳܳ;)V

    .line 59
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1, v0, v3, v1}, Ll/ۜᩴۢ;->֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܺܳܳ;Ll/ܶᩴۢ;)Ll/۠ܳܳ;
    .locals 3

    .line 174
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 175
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const p2, 0x7f120824

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const v0, 0x7f12080c

    .line 179
    :try_start_0
    invoke-static {p1}, Ll/ܿۚۢ;->ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    .line 180
    invoke-static {p1}, Ll/ۧᩴۢ;->֫(Ljava/lang/String;)Ll/֨ᩴۢ;

    move-result-object p1

    .line 181
    iget-object v2, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {v2, p2, p1}, Ll/᩺ᩴۢ;->֫(Ll/ܶᩴۢ;Ll/֨ᩴۢ;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_1

    .line 183
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 185
    :cond_1
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/᩺ۘۢ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 187
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method public final ۧ(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 3

    .line 35
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    sget-object v0, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f120824

    invoke-direct {p0, p1, v0, v2, v1}, Ll/ۜᩴۢ;->֫(Ll/ܺܳܳ;Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 38
    :cond_0
    iget-object p1, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {p1}, Ll/᩺ᩴۢ;->ۧ()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܺܳܳ;Ll/ܶᩴۢ;)Ll/۠ܳܳ;
    .locals 3

    .line 154
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 155
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const p2, 0x7f120824

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const v0, 0x7f12080e

    .line 159
    :try_start_0
    invoke-static {p1}, Ll/ܿۚۢ;->ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    iget-object v2, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {v2, p2, p1}, Ll/᩺ᩴۢ;->֫(Ll/ܶᩴۢ;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    move-result-object p1

    if-nez p1, :cond_1

    .line 165
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 167
    :cond_1
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 161
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method public final ܽ(Ll/ܺܳܳ;Ll/ܶᩴۢ;)Ll/۠ܳܳ;
    .locals 3

    .line 139
    sget-object v0, Ll/ۘܳܳ;->ۙ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const-string v0, "deviceId"

    .line 140
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {v0, p2, p1}, Ll/᩺ᩴۢ;->ۧ(Ll/ܶᩴۢ;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "deleted"

    invoke-static {p2, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    .line 145
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 142
    :cond_1
    :goto_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v0, p2, v1

    const v0, 0x7f120827

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 147
    :cond_2
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const p2, 0x7f120824

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(Ll/ܺܳܳ;Ll/ܶᩴۢ;)Ll/۠ܳܳ;
    .locals 1

    .line 129
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 130
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const v0, 0x7f120824

    .line 62
    invoke-static {v0, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 132
    :cond_0
    iget-object p1, p0, Ll/ۜᩴۢ;->֫:Ll/᩺ᩴۢ;

    invoke-virtual {p1, p2}, Ll/᩺ᩴۢ;->֫(Ll/ܶᩴۢ;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
