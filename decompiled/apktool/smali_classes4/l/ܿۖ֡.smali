.class public final Ll/ܿۖ֡;
.super Ljava/lang/Object;
.source "64LS"

# interfaces
.implements Ll/֨ܺ֡;


# static fields
.field public static final ܳ:[I


# instance fields
.field public ֫:Ljava/text/SimpleDateFormat;

.field public ۧ:I

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:Ljava/text/SimpleDateFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 46
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿۖ֡;->ܳ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0xe
        0xd
        0xc
        0xb
        0x5
        0x2
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "MMM d yyyy"

    const/4 v1, 0x0

    .line 129
    invoke-direct {p0, v0, v1}, Ll/ܿۖ֡;->֫(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    const-string v0, "MMM d HH:mm"

    .line 130
    invoke-direct {p0, v0, v1}, Ll/ܿۖ֡;->ۧ(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    return-void
.end method

.method public static ֫(I)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x7

    if-ge v1, v2, :cond_1

    .line 85
    sget-object v2, Ll/ܿۖ֡;->ܳ:[I

    aget v2, v2, v1

    if-ne p0, v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ֫(Ljava/text/SimpleDateFormat;)I
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 57
    :cond_0
    invoke-virtual {p0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object p0

    const-string v1, "SsmHdM"

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    aget-char v4, v1, v3

    .line 59
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_7

    const/16 v5, 0x48

    if-eq v4, v5, :cond_6

    const/16 v5, 0x4d

    if-eq v4, v5, :cond_5

    const/16 v5, 0x53

    if-eq v4, v5, :cond_4

    const/16 v5, 0x64

    if-eq v4, v5, :cond_3

    const/16 v5, 0x6d

    if-eq v4, v5, :cond_2

    const/16 v5, 0x73

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 p0, 0xd

    .line 64
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_2
    const/16 p0, 0xc

    .line 66
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_3
    const/4 p0, 0x5

    .line 70
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_4
    const/16 p0, 0xe

    .line 62
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_5
    const/4 p0, 0x2

    .line 72
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_6
    const/16 p0, 0xb

    .line 68
    invoke-static {p0}, Ll/ܿۖ֡;->֫(I)I

    move-result p0

    return p0

    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_8
    return v0
.end method

.method private ֫(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 337
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    iput-object v0, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    goto :goto_0

    .line 339
    :cond_0
    new-instance p2, Ljava/text/SimpleDateFormat;

    invoke-direct {p2, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    .line 341
    :goto_0
    iget-object p1, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 345
    iget-object p1, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    invoke-static {p1}, Ll/ܿۖ֡;->֫(Ljava/text/SimpleDateFormat;)I

    move-result p1

    iput p1, p0, Ll/ܿۖ֡;->ۧ:I

    return-void
.end method

.method private ۧ(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 362
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    iput-object v0, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    goto :goto_0

    .line 364
    :cond_0
    new-instance p2, Ljava/text/SimpleDateFormat;

    invoke-direct {p2, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    .line 366
    :goto_0
    iget-object p1, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setLenient(Z)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 368
    iput-object p1, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    .line 370
    :goto_1
    iget-object p1, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    invoke-static {p1}, Ll/ܿۖ֡;->֫(Ljava/text/SimpleDateFormat;)I

    move-result p1

    iput p1, p0, Ll/ܿۖ֡;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/util/Calendar;
    .locals 10

    .line 255
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 272
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Calendar;

    .line 221
    iget-object v2, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v2}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v2

    .line 273
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 277
    iget-object v2, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    sget-object v3, Ll/ܿۖ֡;->ܳ:[I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    .line 278
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Calendar;

    .line 221
    iget-object v6, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v6}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v6

    .line 279
    invoke-virtual {v2, v6}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 280
    iget-boolean v6, p0, Ll/ܿۖ֡;->ܽ:Z

    if-eqz v6, :cond_0

    const/4 v6, 0x5

    .line 283
    invoke-virtual {v2, v6, v5}, Ljava/util/Calendar;->add(II)V

    .line 294
    :cond_0
    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, " "

    .line 0
    invoke-static {p1, v7, v6}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 296
    new-instance v7, Ljava/text/SimpleDateFormat;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v9}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " yyyy"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v9}, Ljava/text/SimpleDateFormat;->getDateFormatSymbols()Ljava/text/DateFormatSymbols;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    .line 297
    invoke-virtual {v7, v4}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 298
    iget-object v8, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    invoke-virtual {v8}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 299
    new-instance v8, Ljava/text/ParsePosition;

    invoke-direct {v8, v4}, Ljava/text/ParsePosition;-><init>(I)V

    .line 300
    invoke-virtual {v7, v6, v8}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 302
    invoke-virtual {v8}, Ljava/text/ParsePosition;->getIndex()I

    move-result v8

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v8, v6, :cond_4

    .line 303
    invoke-virtual {v1, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 304
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    .line 305
    invoke-virtual {v1, v5, p1}, Ljava/util/Calendar;->add(II)V

    .line 307
    :cond_1
    iget p1, p0, Ll/ܿۖ֡;->ܿ:I

    if-gtz p1, :cond_2

    goto :goto_0

    :cond_2
    sub-int/2addr p1, v5

    .line 100
    aget p1, v3, p1

    .line 103
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->clear(I)V

    return-object v1

    .line 312
    :cond_4
    new-instance v2, Ljava/text/ParsePosition;

    invoke-direct {v2, v4}, Ljava/text/ParsePosition;-><init>(I)V

    .line 313
    iget-object v4, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v4, p1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 321
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v6, v7, :cond_7

    .line 325
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 326
    iget p1, p0, Ll/ܿۖ֡;->ۧ:I

    if-gtz p1, :cond_5

    goto :goto_0

    :cond_5
    sub-int/2addr p1, v5

    .line 100
    aget p1, v3, p1

    .line 103
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    if-eqz v0, :cond_6

    :goto_0
    return-object v1

    .line 107
    :cond_6
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->clear(I)V

    return-object v1

    .line 322
    :cond_7
    new-instance v1, Ljava/text/ParseException;

    const-string v3, "Timestamp \'"

    const-string v4, "\' could not be parsed using a server time of "

    .line 0
    invoke-static {v3, p1, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 322
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 323
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v0

    invoke-direct {v1, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1
.end method

.method public final ֫(Ll/ۗܺ֡;)V
    .locals 2

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "en"

    .line 162
    invoke-static {v0}, Ll/ۗܺ֡;->ܽ(Ljava/lang/String;)Ljava/text/DateFormatSymbols;

    move-result-object v0

    .line 165
    invoke-virtual {p1}, Ll/ۗܺ֡;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 166
    invoke-direct {p0, v1, v0}, Ll/ܿۖ֡;->ۧ(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    .line 168
    invoke-virtual {p1}, Ll/ۗܺ֡;->֫()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 172
    invoke-direct {p0, v1, v0}, Ll/ܿۖ֡;->֫(Ljava/lang/String;Ljava/text/DateFormatSymbols;)V

    .line 379
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    .line 383
    iget-object v1, p0, Ll/ܿۖ֡;->֫:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 384
    iget-object v1, p0, Ll/ܿۖ֡;->ᩳ:Ljava/text/SimpleDateFormat;

    if-eqz v1, :cond_0

    .line 385
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 176
    :cond_0
    invoke-virtual {p1}, Ll/ۗܺ֡;->ᩳ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿۖ֡;->ܽ:Z

    return-void

    .line 170
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "defaultFormatString cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
