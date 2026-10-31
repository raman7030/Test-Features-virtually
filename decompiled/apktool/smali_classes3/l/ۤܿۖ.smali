.class public final Ll/ۤܿۖ;
.super Ll/۠ᩳۖ;
.source "G851"


# static fields
.field public static final ܽ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/۫ܿۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Ll/ۗܿۖ;

    invoke-direct {v0}, Ll/ۗܿۖ;-><init>()V

    sput-object v0, Ll/ۤܿۖ;->ܽ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 128
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 118
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    .line 129
    sget-object v0, Ll/۫ܿۖ;->֫:Ll/۫ܿۖ;

    iput-object v0, p0, Ll/ۤܿۖ;->ۧ:Ll/۫ܿۖ;

    .line 130
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    invoke-static {v1, v1, v0}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 132
    invoke-static {v1, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    :cond_0
    invoke-static {}, Ll/ۨᩳۖ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, " "

    const-string v2, "h:mm:ss a"

    const-string v3, "MMM d, yyyy"

    .line 0
    invoke-static {v3, v1, v2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-direct {v2, v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 135
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 191
    iget-object v0, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    .line 192
    instance-of v1, v0, Ljava/text/SimpleDateFormat;

    const/16 v2, 0x29

    const-string v3, "DefaultDateTypeAdapter("

    if-eqz v1, :cond_0

    .line 193
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 195
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 5

    .line 157
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 158
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 166
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v1

    .line 168
    iget-object v0, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    monitor-enter v0

    .line 169
    :try_start_0
    iget-object v2, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/text/DateFormat;

    .line 170
    invoke-virtual {v3}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 172
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 177
    throw p1

    .line 176
    :catch_0
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    goto :goto_0

    .line 179
    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    :try_start_3
    new-instance v0, Ljava/text/ParsePosition;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {v1, v0}, Ll/᩹᩻ۖ;->֫(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p1
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_1

    .line 162
    :goto_1
    iget-object v0, p0, Ll/ۤܿۖ;->ۧ:Ll/۫ܿۖ;

    check-cast v0, Ll/۬ܿۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :catch_1
    move-exception v0

    .line 184
    new-instance v2, Ll/ܳᩳۖ;

    const-string v3, "Failed parsing \'"

    const-string v4, "\' as Date; at path "

    .line 0
    invoke-static {v3, v1, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 185
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    throw v2

    :catchall_1
    move-exception p1

    .line 179
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 55
    check-cast p2, Ljava/util/Date;

    if-nez p2, :cond_0

    .line 142
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 146
    :cond_0
    iget-object v0, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/text/DateFormat;

    .line 149
    iget-object v0, p0, Ll/ۤܿۖ;->֫:Ljava/util/ArrayList;

    monitor-enter v0

    .line 150
    :try_start_0
    invoke-virtual {v1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    .line 151
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 151
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
