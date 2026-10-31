.class public Ll/۫ۖۢ;
.super Ll/᩸ۘۢ;
.source "0AMR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 20
    iput-object p2, p0, Ll/۫ۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 26
    iget-object v0, p0, Ll/۫ۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    .line 28
    iget-object v3, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-ne v1, v2, :cond_0

    const-string v0, "500 wrong number of parameters\r\n"

    .line 29
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 38
    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "yyyyMMddhhmmss"

    invoke-direct {v1, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v5, "UTC"

    .line 39
    invoke-static {v5}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 68
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v7, "yyyyMMddHHmmss"

    invoke-direct {v6, v7, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 69
    invoke-static {v5}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 80
    invoke-virtual {v6, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    invoke-static {v3, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "550 Invalid name or chroot violation\r\n"

    .line 52
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 56
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_2

    const-string v0, "550 file does not exist on server\r\n"

    .line 57
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 61
    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ll/ܶ᩵ܿ;->֫(J)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v0, "500 unable to modify last modification time\r\n"

    .line 63
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 68
    :cond_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v4

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "213 "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :catch_0
    const-string v0, "501 unable to parse parameter time-val\r\n"

    .line 45
    invoke-virtual {v3, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
