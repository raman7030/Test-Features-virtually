.class public final Ll/֡֫֡;
.super Ljava/lang/ThreadLocal;
.source "K4FK"


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 41
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 43
    sget-object v1, Ll/᩶۟᩵;->ܳ:Ljava/util/TimeZone;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object v0
.end method
