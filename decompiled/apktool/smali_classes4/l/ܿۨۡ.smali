.class public final Ll/ܿۨۡ;
.super Ljava/lang/Object;
.source "N33Q"


# static fields
.field public static final ֫:Ljava/text/SimpleDateFormat;

.field public static final ۧ:Ljava/text/SimpleDateFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܿۨۡ;->֫:Ljava/text/SimpleDateFormat;

    .line 18
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܿۨۡ;->ۧ:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public static ֫(Ll/۟ܿ֫;)Ljava/lang/Long;
    .locals 4

    .line 51
    invoke-virtual {p0}, Ll/۟ܿ֫;->ܿ()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    .line 53
    invoke-virtual {p0}, Ll/۟ܿ֫;->ᩳ()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "OffsetTimeOriginal"

    .line 54
    invoke-virtual {p0, v1}, Ll/۟ܿ֫;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 59
    invoke-virtual {p0}, Ll/۟ܿ֫;->ܽ()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "OffsetTimeDigitized"

    .line 60
    invoke-virtual {p0, v1}, Ll/۟ܿ֫;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 61
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 65
    invoke-virtual {p0}, Ll/۟ܿ֫;->ۧ()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "OffsetTime"

    .line 66
    invoke-virtual {p0, v1}, Ll/۟ܿ֫;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    .line 67
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p0

    int-to-long v2, p0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 7

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    const-wide/16 v2, 0x3e8

    .line 24
    div-long/2addr v0, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x3c

    cmp-long v6, v0, v4

    if-gez v6, :cond_0

    .line 26
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f11000b

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    div-long/2addr v0, v4

    cmp-long v6, v0, v4

    if-gez v6, :cond_1

    .line 31
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f11000a

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 34
    :cond_1
    div-long/2addr v0, v4

    const-wide/16 v4, 0x18

    cmp-long v6, v0, v4

    if-gez v6, :cond_2

    .line 36
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f110009

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 38
    :cond_2
    div-long/2addr v0, v4

    const-wide/16 v4, 0x1f

    cmp-long v6, v0, v4

    if-gez v6, :cond_3

    .line 40
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f110008

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 43
    :cond_3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getYear()I

    move-result v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1}, Ljava/util/Date;->getYear()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 44
    sget-object v0, Ll/ܿۨۡ;->֫:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 46
    :cond_4
    sget-object v0, Ll/ܿۨۡ;->ۧ:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
