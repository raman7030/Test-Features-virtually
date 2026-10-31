.class public final Ll/۫ۡ᩻;
.super Ll/ܿۜ᩻;
.source "WADD"


# instance fields
.field public ۧ֫:Ll/ܽۜܳ;


# direct methods
.method public constructor <init>(Ll/ۤܺ֡;Ljava/lang/String;)V
    .locals 9

    .line 20
    invoke-virtual {p1}, Ll/ۤܺ֡;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤܺ֡;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ll/ۤܺ֡;->ܿ()J

    move-result-wide v4

    .line 64
    invoke-virtual {p1}, Ll/ۤܺ֡;->ܳ()Ljava/util/Calendar;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v6, 0x0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 20
    :goto_0
    invoke-virtual {p1}, Ll/ۤܺ֡;->ۢ()Z

    move-result v8

    move-object v0, p0

    move-object v2, p2

    .line 10
    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 22
    invoke-virtual {p1}, Ll/ۤܺ֡;->᩻()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v2, :cond_2

    if-eq p2, v1, :cond_1

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    const p2, 0xa000

    goto :goto_1

    :cond_2
    const/16 p2, 0x4000

    goto :goto_1

    :cond_3
    const p2, 0x8000

    .line 33
    :goto_1
    invoke-virtual {p1, v0, v0}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_4

    or-int/lit16 p2, p2, 0x100

    .line 36
    :cond_4
    invoke-virtual {p1, v0, v2}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_5

    or-int/lit16 p2, p2, 0x80

    .line 39
    :cond_5
    invoke-virtual {p1, v0, v1}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_6

    or-int/lit8 p2, p2, 0x40

    .line 42
    :cond_6
    invoke-virtual {p1, v2, v0}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_7

    or-int/lit8 p2, p2, 0x20

    .line 45
    :cond_7
    invoke-virtual {p1, v2, v2}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_8

    or-int/lit8 p2, p2, 0x10

    .line 48
    :cond_8
    invoke-virtual {p1, v2, v1}, Ll/ۤܺ֡;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_9

    or-int/lit8 p2, p2, 0x8

    .line 51
    :cond_9
    invoke-virtual {p1, v1, v0}, Ll/ۤܺ֡;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_a

    or-int/lit8 p2, p2, 0x4

    .line 54
    :cond_a
    invoke-virtual {p1, v1, v2}, Ll/ۤܺ֡;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_b

    or-int/lit8 p2, p2, 0x2

    .line 57
    :cond_b
    invoke-virtual {p1, v1, v1}, Ll/ۤܺ֡;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_c

    or-int/lit8 p2, p2, 0x1

    .line 60
    :cond_c
    new-instance v0, Ll/ܽۜܳ;

    invoke-virtual {p1}, Ll/ۤܺ֡;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤܺ֡;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, v1, p1}, Ll/ܽۜܳ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ll/۫ۡ᩻;->ۧ֫:Ll/ܽۜܳ;

    return-void
.end method


# virtual methods
.method public final ֨ۧ()Ll/ܽۜܳ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۫ۡ᩻;->ۧ֫:Ll/ܽۜܳ;

    return-object v0
.end method

.method public final ֫(Ll/ܽۜܳ;)V
    .locals 0

    .line 75
    iput-object p1, p0, Ll/۫ۡ᩻;->ۧ֫:Ll/ܽۜܳ;

    return-void
.end method
