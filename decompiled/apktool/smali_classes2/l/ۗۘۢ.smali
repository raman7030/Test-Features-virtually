.class public abstract Ll/ۗۘۢ;
.super Ljava/lang/Object;
.source "R5PD"


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗۘۢ;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 3

    .line 68
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    .line 69
    invoke-static {v1}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 75
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۗۘۢ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 167
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ֫(II[B[B)I
.end method

.method public ֫(Ll/᩶ۡܺ;)Ll/᩶ۡܺ;
    .locals 4

    .line 49
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 50
    new-instance v1, Ll/᩶ۡܺ;

    .line 105
    invoke-direct {v1, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 53
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {p0, v3}, Ll/ۗۘۢ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    .line 59
    invoke-virtual {v1, p1}, Ll/ܿᩴܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public abstract ֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
.end method
