.class public final synthetic Ll/۟ᩳܽ;
.super Ljava/lang/Object;
.source "J63D"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ᩳܽ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 9

    .line 2
    iget v0, p0, Ll/۟ᩳܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Landroid/text/SpannableString;

    .line 9
    check-cast p2, Landroid/text/SpannableString;

    const-string v0, "android:"

    .line 509
    invoke-static {p1, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩺ܶ֫;

    check-cast p2, Ll/᩺ܶ֫;

    .line 79
    iget-wide v0, p1, Ll/᩺ܶ֫;->ۙ:J

    iget-wide v2, p2, Ll/᩺ܶ֫;->ۙ:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_0

    .line 82
    invoke-virtual {p1, p2}, Ll/᩺ܶ֫;->֫(Ll/᩺ܶ֫;)I

    move-result p1

    goto :goto_0

    :cond_0
    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/᩸᩻ܽ;

    check-cast p2, Ll/᩸᩻ܽ;

    .line 96
    iget v0, p1, Ll/᩸᩻ܽ;->ۧ:I

    iget v1, p2, Ll/᩸᩻ܽ;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 99
    :cond_2
    iget v0, p2, Ll/᩸᩻ܽ;->֫:I

    iget v1, p1, Ll/᩸᩻ܽ;->֫:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 102
    :cond_3
    iget-object p1, p1, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    iget-object p2, p2, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_1
    return v0

    :cond_4
    const/4 v1, 0x0

    .line 510
    :goto_2
    invoke-static {p2, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    if-ne v0, v3, :cond_5

    const/4 v2, 0x1

    :cond_5
    if-ne v1, v2, :cond_6

    .line 512
    invoke-virtual {p1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    goto :goto_3

    :cond_6
    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, -0x1

    :goto_3
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
