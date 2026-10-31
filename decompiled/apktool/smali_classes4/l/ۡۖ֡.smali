.class public final Ll/ۡۖ֡;
.super Ll/ܽۖ֡;
.source "55OK"


# virtual methods
.method public final ֫()Ll/ۗܺ֡;
    .locals 4

    .line 71
    new-instance v0, Ll/ۗܺ֡;

    const-string v1, "MM-dd-yy HH:mm"

    const/4 v2, 0x0

    const-string v3, "OS/2"

    invoke-direct {v0, v3, v1, v2}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 6

    .line 85
    new-instance v0, Ll/ۤܺ֡;

    invoke-direct {v0}, Ll/ۤܺ֡;-><init>()V

    .line 86
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 87
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 88
    invoke-virtual {p0, v2}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    .line 89
    invoke-virtual {p0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v3

    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x4

    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x5

    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x6

    .line 91
    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    .line 93
    :try_start_0
    invoke-virtual {p0, v4}, Ll/ܽۖ֡;->ܽ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 99
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "DIR"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 102
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->֫(I)V

    goto :goto_2

    .line 100
    :cond_1
    :goto_1
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->֫(I)V

    .line 106
    :goto_2
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤܺ֡;->֫(J)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
