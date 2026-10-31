.class public final synthetic Ll/֫֡ۧ;
.super Ljava/lang/Object;
.source "L8NY"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫֡ۧ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 2
    iget v0, p0, Ll/֫֡ۧ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Landroid/text/SpannableString;

    .line 9
    check-cast p2, Landroid/text/SpannableString;

    const/16 v0, 0x3a

    .line 220
    invoke-static {p1, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۗ᩵ۧ;

    check-cast p2, Ll/ۗ᩵ۧ;

    .line 83
    iget-wide v0, p1, Ll/ۗ᩵ۧ;->ܽ:J

    iget-wide p1, p2, Ll/ۗ᩵ۧ;->ܽ:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :cond_0
    const/4 v1, 0x0

    .line 221
    :goto_0
    invoke-static {p2, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v0

    if-eq v0, v4, :cond_1

    const/4 v2, 0x1

    :cond_1
    if-ne v1, v2, :cond_2

    .line 223
    invoke-virtual {p1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, -0x1

    :goto_1
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
