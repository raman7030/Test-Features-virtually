.class public final Ll/ۘ۠ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/᩵۠ܳ;


# direct methods
.method public constructor <init>(Ll/᩵۠ܳ;)V
    .locals 0

    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۠ܳ;->᩸:Ll/᩵۠ܳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 245
    iget-object v0, p0, Ll/ۘ۠ܳ;->᩸:Ll/᩵۠ܳ;

    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, p1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v1, v0, Ll/᩵۠ܳ;->۟:Ljava/text/SimpleDateFormat;

    .line 246
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ܽ(I)V

    .line 247
    iget-object p1, v0, Ll/᩵۠ܳ;->۟:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v1, 0x0

    .line 249
    iput-object v1, v0, Ll/᩵۠ܳ;->۟:Ljava/text/SimpleDateFormat;

    .line 250
    sget v1, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ܽ(I)V

    .line 251
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
