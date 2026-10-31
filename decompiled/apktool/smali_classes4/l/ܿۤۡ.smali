.class public final Ll/ܿۤۡ;
.super Ljava/lang/Object;
.source "A5R0"


# static fields
.field public static final ֫:Ljava/lang/ThreadLocal;

.field public static final ۧ:Ljava/lang/ThreadLocal;

.field public static final ܽ:Ljava/lang/ThreadLocal;

.field public static ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ll/֫ۤۡ;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    .line 23
    new-instance v0, Ll/ۧۤۡ;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    .line 35
    new-instance v0, Ll/ܽۤۡ;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    const/4 v0, 0x0

    .line 51
    sput v0, Ll/ܿۤۡ;->ᩳ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 2

    .line 108
    :try_start_0
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 115
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 188
    iget-object v0, v0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    .line 112
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 188
    iget-object v0, v0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    .line 110
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 188
    iget-object v0, v0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static ֫()Ljava/lang/String;
    .locals 2

    .line 155
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    return-object v0

    :cond_0
    const-string v0, "HH:mm:ss dd-MM-yyyy"

    return-object v0

    :cond_1
    const-string v0, "dd-MM-yyyy HH:mm:ss"

    return-object v0
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 2

    .line 71
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 78
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 184
    :goto_0
    iget-object v0, v0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 75
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0

    .line 73
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0
.end method

.method public static ֫(JZZ)Ljava/lang/String;
    .locals 2

    .line 59
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 66
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ᩳۤۡ;->֫(JZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 63
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ᩳۤۡ;->֫(JZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 61
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ᩳۤۡ;->֫(JZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)V
    .locals 1

    if-ltz p0, :cond_0

    const/4 v0, 0x2

    if-gt p0, v0, :cond_0

    .line 55
    sput p0, Ll/ܿۤۡ;->ᩳ:I

    :cond_0
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)J
    .locals 2

    .line 140
    :try_start_0
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 147
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 196
    iget-object v0, v0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    .line 144
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 196
    iget-object v0, v0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    .line 142
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 196
    iget-object v0, v0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static ۧ(J)Ljava/lang/String;
    .locals 2

    .line 95
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 102
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 192
    :goto_0
    iget-object v0, v0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 99
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0

    .line 97
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0
.end method

.method public static ܽ(J)Ljava/lang/String;
    .locals 2

    .line 83
    sget v0, Ll/ܿۤۡ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 90
    sget-object v0, Ll/ܿۤۡ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    .line 200
    :goto_0
    iget-object v0, v0, Ll/ᩳۤۡ;->ܽ:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 87
    :cond_0
    sget-object v0, Ll/ܿۤۡ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0

    .line 85
    :cond_1
    sget-object v0, Ll/ܿۤۡ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۡ;

    goto :goto_0
.end method
