.class public final Ll/᩷ۖ֡;
.super Ll/ܽۖ֡;
.source "O546"


# instance fields
.field public final ܿ:Ll/ܿۖ֡;


# direct methods
.method public constructor <init>(Ll/ۗܺ֡;)V
    .locals 3

    .line 67
    invoke-direct {p0}, Ll/ܽۖ֡;-><init>()V

    .line 68
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    .line 69
    new-instance p1, Ll/ۗܺ֡;

    const/4 v0, 0x0

    const-string v1, "WINDOWS"

    const-string v2, "MM-dd-yy kk:mm"

    invoke-direct {p1, v1, v2, v0}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1, v2}, Ll/ۗܺ֡;->֫(Ljava/lang/String;)V

    .line 71
    new-instance v0, Ll/ܿۖ֡;

    invoke-direct {v0}, Ll/ܿۖ֡;-><init>()V

    iput-object v0, p0, Ll/᩷ۖ֡;->ܿ:Ll/ܿۖ֡;

    .line 72
    invoke-interface {v0, p1}, Ll/֨ܺ֡;->֫(Ll/ۗܺ֡;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۗܺ֡;
    .locals 4

    .line 82
    new-instance v0, Ll/ۗܺ֡;

    const-string v1, "MM-dd-yy hh:mma"

    const/4 v2, 0x0

    const-string v3, "WINDOWS"

    invoke-direct {v0, v3, v1, v2}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 6

    .line 95
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    new-instance v0, Ll/ۤܺ֡;

    invoke-direct {v0}, Ll/ۤܺ֡;-><init>()V

    .line 97
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x3

    .line 99
    invoke-virtual {p0, v2}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    .line 100
    invoke-virtual {p0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    .line 101
    invoke-virtual {p0, v4}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v5, "."

    .line 102
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, ".."

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    .line 106
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->ܽ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 110
    :catch_0
    :try_start_1
    iget-object v5, p0, Ll/᩷ۖ֡;->ܿ:Ll/ܿۖ֡;

    invoke-virtual {v5, p1}, Ll/ܿۖ֡;->֫(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 115
    :goto_0
    invoke-virtual {v0, v4}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    const-string p1, "<DIR>"

    .line 116
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 117
    invoke-virtual {v0, v1}, Ll/ۤܺ֡;->֫(I)V

    const-wide/16 v1, 0x0

    .line 118
    invoke-virtual {v0, v1, v2}, Ll/ۤܺ֡;->֫(J)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 120
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->֫(I)V

    if-eqz v3, :cond_2

    .line 122
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤܺ֡;->֫(J)V

    :cond_2
    :goto_1
    return-object v0

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method
