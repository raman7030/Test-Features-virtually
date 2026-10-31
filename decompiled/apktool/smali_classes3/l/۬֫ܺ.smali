.class public final Ll/۬֫ܺ;
.super Ljava/lang/Object;
.source "3AWK"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ۗ:Ll/ۗ֫ܺ;

.field public ۙ:[C

.field public final ۬:Z

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:I

.field public final ᩹:Ll/ܺۧܺ;


# direct methods
.method public constructor <init>(Ll/ܺۧܺ;)V
    .locals 10

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    .line 42
    invoke-virtual {p1}, Ll/ܺۧܺ;->֫()Ll/۬۟ۡ;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 45
    invoke-interface {v0}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v8, v4, v6

    .line 46
    sget-object v9, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    if-ne v8, v9, :cond_0

    const/4 v7, 0x1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v0}, Ll/۬۟ۡ;->format()Ljava/lang/String;

    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v4

    .line 58
    :goto_1
    invoke-interface {v0}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v0

    iput v0, p0, Ll/۬֫ܺ;->᩸:I

    goto :goto_2

    .line 60
    :cond_3
    iput v2, p0, Ll/۬֫ܺ;->᩸:I

    const/4 v7, 0x0

    .line 62
    :goto_2
    iput-boolean v7, p0, Ll/۬֫ܺ;->۬:Z

    .line 63
    iput-object v3, p0, Ll/۬֫ܺ;->᩶:Ljava/lang/String;

    .line 65
    iget-object p1, p1, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, 0x3

    .line 67
    new-array v3, v3, [C

    iput-object v3, p0, Ll/۬֫ܺ;->ۙ:[C

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v2, v4, v3, v1}, Ljava/lang/String;->getChars(II[CI)V

    const/16 p1, 0x22

    .line 69
    aput-char p1, v3, v2

    add-int/lit8 v1, v0, 0x1

    .line 70
    aput-char p1, v3, v1

    add-int/lit8 v0, v0, 0x2

    const/16 p1, 0x3a

    .line 71
    aput-char p1, v3, v0

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 29
    check-cast p1, Ll/۬֫ܺ;

    .line 166
    iget-object v0, p0, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    iget-object p1, p1, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    invoke-virtual {v0, p1}, Ll/ܺۧܺ;->֫(Ll/ܺۧܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 92
    iget-object v0, p0, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    .line 359
    :try_start_0
    iget-boolean v1, v0, Ll/ܺۧܺ;->ۙ:Z

    if-eqz v1, :cond_0

    .line 360
    iget-object v1, v0, Ll/ܺۧܺ;->᩶:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 363
    :cond_0
    iget-object v1, v0, Ll/ܺۧܺ;->᩺:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 94
    iget-object v1, v0, Ll/ܺۧܺ;->᩺:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Ll/ܺۧܺ;->᩶:Ljava/lang/reflect/Field;

    .line 98
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 100
    new-instance v1, Ll/ܶ۟ۡ;

    const-string v2, "get property error\u3002 "

    .line 0
    invoke-static {v2, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {v1, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    throw v1
.end method

.method public final ֫(Ll/ۛ֫ܺ;)V
    .locals 4

    .line 75
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    .line 77
    iget v0, p1, Ll/ۜۧܺ;->᩶:I

    .line 79
    sget-object v1, Ll/᩷ۧܺ;->ۨ:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    if-eqz v1, :cond_1

    .line 80
    sget-object v1, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, v3, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 83
    iget-object v1, p0, Ll/۬֫ܺ;->ۙ:[C

    array-length v2, v1

    invoke-virtual {p1, v1, v0, v2}, Ll/ۜۧܺ;->write([CII)V

    return-void

    .line 86
    :cond_1
    iget-object v0, v3, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;)V
    .locals 6

    .line 105
    iget-object v0, p1, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    iget-object v1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    iget-object v2, p0, Ll/۬֫ܺ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 298
    instance-of v0, p2, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 299
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->ۧ()Ljava/text/DateFormat;

    move-result-object v0

    if-nez v0, :cond_0

    .line 301
    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v3, p1, Ll/ۛ֫ܺ;->ܳ:Ljava/util/Locale;

    invoke-direct {v0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 302
    iget-object p1, p1, Ll/ۛ֫ܺ;->ܺ:Ljava/util/TimeZone;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 304
    :cond_0
    check-cast p2, Ljava/util/Date;

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 305
    invoke-virtual {v1, p1}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 308
    :cond_1
    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    return-void

    .line 110
    :cond_2
    iget-object v2, p0, Ll/۬֫ܺ;->ۗ:Ll/ۗ֫ܺ;

    iget-object v3, p0, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    if-nez v2, :cond_4

    if-nez p2, :cond_3

    .line 114
    iget-object v2, v3, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    goto :goto_0

    .line 116
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 119
    :goto_0
    invoke-virtual {v0, v2}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v4

    .line 120
    new-instance v5, Ll/ۗ֫ܺ;

    .line 159
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 160
    iput-object v4, v5, Ll/ۗ֫ܺ;->֫:Ll/ܽۧܺ;

    .line 161
    iput-object v2, v5, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    .line 120
    iput-object v5, p0, Ll/۬֫ܺ;->ۗ:Ll/ۗ֫ܺ;

    .line 123
    :cond_4
    iget-object v2, p0, Ll/۬֫ܺ;->ۗ:Ll/ۗ֫ܺ;

    if-nez p2, :cond_8

    .line 126
    sget-object p2, Ll/᩷ۧܺ;->᩷֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    iget v0, p0, Ll/۬֫ܺ;->᩸:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_5

    const-class p2, Ljava/lang/Number;

    iget-object v4, v2, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    .line 127
    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_5

    const/16 p1, 0x30

    .line 128
    invoke-virtual {v1, p1}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 130
    :cond_5
    sget-object p2, Ll/᩷ۧܺ;->᩻֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_6

    const-class p2, Ljava/lang/Boolean;

    iget-object v4, v2, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    if-ne p2, v4, :cond_6

    const-string p1, "false"

    .line 132
    invoke-virtual {v1, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 134
    :cond_6
    sget-object p2, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_7

    const-class p2, Ljava/util/Collection;

    iget-object v0, v2, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    .line 135
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p1, "[]"

    .line 136
    invoke-virtual {v1, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 140
    :cond_7
    iget-object p2, v2, Ll/ۗ֫ܺ;->֫:Ll/ܽۧܺ;

    iget-object v0, v3, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    iget-object v1, v2, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-interface {p2, p1, v2, v0, v1}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void

    .line 144
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 145
    iget-object v4, v2, Ll/ۗ֫ܺ;->ۧ:Ljava/lang/Class;

    if-ne v1, v4, :cond_9

    .line 146
    iget-object v0, v2, Ll/ۗ֫ܺ;->֫:Ll/ܽۧܺ;

    iget-object v1, v3, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    iget-object v2, v3, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    invoke-interface {v0, p1, p2, v1, v2}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void

    .line 150
    :cond_9
    invoke-virtual {v0, v1}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v0

    .line 151
    iget-object v1, v3, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    iget-object v2, v3, Ll/ܺۧܺ;->۫:Ljava/lang/reflect/Type;

    invoke-interface {v0, p1, p2, v1, v2}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void
.end method
