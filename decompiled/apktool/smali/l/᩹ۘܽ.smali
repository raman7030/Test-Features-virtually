.class public final Ll/᩹ۘܽ;
.super Ljava/lang/Object;
.source "Z5ED"


# instance fields
.field public final ֫:Ljava/util/Calendar;

.field public final ۧ:Ljava/util/Locale;

.field public final ܽ:C


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/᩹ۘܽ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 27
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    const-string v0, "getDefault(...)"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/᩹ۘܽ;->ۧ:Ljava/util/Locale;

    .line 30
    invoke-static {v1, p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    .line 31
    invoke-static {p1}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object p1

    invoke-virtual {p1}, Ljava/text/DecimalFormatSymbols;->getZeroDigit()C

    move-result p1

    iput-char p1, p0, Ll/᩹ۘܽ;->ܽ:C

    return-void
.end method

.method private final ֫(Ljava/lang/StringBuilder;II)V
    .locals 3

    .line 62
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 63
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr p3, v0

    const/4 v0, 0x0

    if-gez p3, :cond_0

    const/4 p3, 0x0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-char v2, p0, Ll/᩹ۘܽ;->ܽ:C

    if-ge v1, p3, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    :goto_1
    if-ge v0, p3, :cond_2

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    add-int/2addr v1, v2

    int-to-char v1, v1

    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(J)Ljava/lang/String;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v1, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 37
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 p2, 0x17

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    instance-of v1, p2, Ljava/util/GregorianCalendar;

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    .line 40
    check-cast p2, Ljava/util/GregorianCalendar;

    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/4 v1, 0x4

    invoke-direct {p0, p1, p2, v1}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    goto :goto_0

    .line 42
    :cond_0
    iget-object v1, p0, Ll/᩹ۘܽ;->ۧ:Ljava/util/Locale;

    invoke-virtual {p2, v2, v3, v1}, Ljava/util/Calendar;->getDisplayName(IILjava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 44
    :cond_1
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-direct {p0, p1, p2, v2}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    :goto_0
    const/16 p2, 0x2d

    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    iget-object v1, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/2addr v1, v2

    invoke-direct {p0, p1, v1, v3}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-direct {p0, p1, p2, v3}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    const/16 p2, 0x20

    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    const/16 v1, 0xb

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-direct {p0, p1, p2, v3}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    const/16 p2, 0x3a

    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    iget-object v1, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-direct {p0, p1, v1, v3}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    const/16 v1, 0xd

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-direct {p0, p1, p2, v3}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    const/16 p2, 0x2e

    .line 56
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    iget-object p2, p0, Ll/᩹ۘܽ;->֫:Ljava/util/Calendar;

    const/16 v1, 0xe

    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/4 v1, 0x3

    invoke-direct {p0, p1, p2, v1}, Ll/᩹ۘܽ;->֫(Ljava/lang/StringBuilder;II)V

    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
