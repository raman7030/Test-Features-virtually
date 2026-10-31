.class public final Ll/᩻ܰ֫;
.super Ljava/lang/Object;
.source "18S9"


# instance fields
.field public final ֫:Landroid/content/ContextWrapper;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Ll/᩻ܰ֫;->֫:Landroid/content/ContextWrapper;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 5

    .line 129
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-static {v0}, Ll/ۢ᩵֫;->ۜ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 132
    :cond_0
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3352
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "image/png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "image/bmp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "image/webp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "image/jpeg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "image/heif"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "image/heic"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "image/avif"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_2

    .line 3360
    :pswitch_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_8

    goto :goto_1

    .line 3362
    :pswitch_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p1, v0, :cond_8

    .line 245
    :goto_1
    :pswitch_2
    invoke-static {v2, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_8
    :goto_2
    invoke-static {v3, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_9
    :goto_3
    invoke-static {v1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_6
        -0x58a8e8f5 -> :sswitch_5
        -0x58a8e8f2 -> :sswitch_4
        -0x58a7d764 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x3468a12f -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final ֫()Ll/ۜܰ֫;
    .locals 2

    .line 139
    new-instance v0, Ll/ۜܰ֫;

    iget-object v1, p0, Ll/᩻ܰ֫;->֫:Landroid/content/ContextWrapper;

    invoke-direct {v0, v1}, Ll/ۜܰ֫;-><init>(Landroid/content/ContextWrapper;)V

    return-object v0
.end method
