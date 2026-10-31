.class public Ll/ۗۖۢ;
.super Ll/֨ۖۢ;
.source "N585"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Ll/֨ۖۢ;-><init>(Ll/᩶ۘۢ;Ljava/lang/String;)V

    .line 18
    iput-object p2, p0, Ll/ۗۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 26
    iget-object v0, p0, Ll/ۗۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "-"

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-eqz v1, :cond_1

    .line 33
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ۢ()Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v1, "*"

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "550 LIST does not support wildcards\r\n"

    goto :goto_3

    .line 39
    :cond_2
    invoke-static {v2, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "450 Listing target violates chroot\r\n"

    goto :goto_3

    .line 46
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    invoke-virtual {p0, v0, v1}, Ll/֨ۖۢ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 54
    :cond_5
    invoke-virtual {p0, v0}, Ll/ۗۖۢ;->ۧ(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    const-string v0, "450 Couldn\'t list that file\r\n"

    goto :goto_3

    .line 60
    :cond_6
    :goto_2
    invoke-virtual {p0, v0}, Ll/֨ۖۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    if-eqz v0, :cond_7

    .line 64
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 7

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 84
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "*"

    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    .line 89
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "drwxr-xr-x 1 owner group"

    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const-string v2, "-rw-r--r-- 1 owner group"

    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    :goto_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    .line 97
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 98
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    rsub-int/lit8 v3, v3, 0xd

    :goto_1
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_3

    const/16 v3, 0x20

    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v3, v4

    goto :goto_1

    .line 102
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-wide v2, 0x39ef8b000L

    cmp-long v6, v4, v2

    if-gez v6, :cond_4

    .line 111
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, " MMM dd HH:mm "

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    goto :goto_2

    .line 114
    :cond_4
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, " MMM dd  yyyy "

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 116
    :goto_2
    new-instance v3, Ljava/util/Date;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\r\n"

    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_3
    return-object v2
.end method
