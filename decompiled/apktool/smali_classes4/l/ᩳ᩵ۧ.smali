.class public final Ll/ᩳ᩵ۧ;
.super Ljava/lang/Object;
.source "B8J7"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Ll/ᩳ᩵ۧ;->ۧ:I

    .line 50
    iput p2, p0, Ll/ᩳ᩵ۧ;->ᩳ:I

    .line 51
    iput p3, p0, Ll/ᩳ᩵ۧ;->֫:I

    .line 52
    iput p4, p0, Ll/ᩳ᩵ۧ;->ܿ:I

    .line 53
    iput p5, p0, Ll/ᩳ᩵ۧ;->ܳ:I

    .line 54
    iput p6, p0, Ll/ᩳ᩵ۧ;->ܽ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ᩳ᩵ۧ;
    .locals 9

    const-string v0, "Format:"

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const/4 v0, 0x7

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, ","

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    .line 71
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_5

    .line 72
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v8, "style"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x4

    goto :goto_2

    :sswitch_1
    const-string v8, "start"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    goto :goto_2

    :sswitch_2
    const-string v8, "layer"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    goto :goto_2

    :sswitch_3
    const-string v8, "text"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    goto :goto_2

    :sswitch_4
    const-string v8, "end"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    :goto_1
    const/4 v2, -0x1

    :goto_2
    packed-switch v2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    move v6, v1

    goto :goto_3

    :pswitch_1
    move v4, v1

    goto :goto_3

    :pswitch_2
    move v3, v1

    goto :goto_3

    :pswitch_3
    move v7, v1

    goto :goto_3

    :pswitch_4
    move v5, v1

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    if-eq v4, v0, :cond_6

    if-eq v5, v0, :cond_6

    if-eq v7, v0, :cond_6

    .line 93
    new-instance v0, Ll/ᩳ᩵ۧ;

    array-length v8, p0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ll/ᩳ᩵ۧ;-><init>(IIIIII)V

    return-object v0

    :cond_6
    const/4 p0, 0x0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x188db -> :sswitch_4
        0x36452d -> :sswitch_3
        0x61fd551 -> :sswitch_2
        0x68ac462 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
