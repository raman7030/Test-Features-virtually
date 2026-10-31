.class public final Ll/᩷ᩳۧ;
.super Ljava/lang/Object;
.source "L8QH"

# interfaces
.implements Ll/ۢᩳۧ;


# instance fields
.field public final ۧ:Ll/ۤۘۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ll/ۤۘۧ;

    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object v0, p0, Ll/᩷ᩳۧ;->ۧ:Ll/ۤۘۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)Ll/۟ۘۧ;
    .locals 4

    .line 77
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget v1, p1, Ll/۠ᩴ֫;->֫:I

    if-eqz v0, :cond_3

    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "application/cea-708"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "application/cea-608"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "application/x-mp4-cea-608"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 87
    :pswitch_0
    new-instance v0, Ll/ܶᩴۧ;

    iget-object p1, p1, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    invoke-direct {v0, v1, p1}, Ll/ܶᩴۧ;-><init>(ILjava/util/List;)V

    return-object v0

    .line 82
    :pswitch_1
    new-instance p1, Ll/᩵ᩴۧ;

    invoke-direct {p1, v0, v1}, Ll/᩵ᩴۧ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 92
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/᩷ᩳۧ;->ۧ:Ll/ۤۘۧ;

    invoke-virtual {v1, p1}, Ll/ۤۘۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 93
    invoke-virtual {v1, p1}, Ll/ۤۘۧ;->ܽ(Ll/۠ᩴ֫;)Ll/ۢᩴۧ;

    move-result-object p1

    .line 94
    new-instance v0, Ll/ܳᩳۧ;

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Decoder"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܳᩳۧ;-><init>(Ljava/lang/String;Ll/ۢᩴۧ;)V

    return-object v0

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attempted to create decoder for unsupported MIME type: "

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 97
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x37713300 -> :sswitch_2
        0x5d578071 -> :sswitch_1
        0x5d578432 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Z
    .locals 2

    .line 68
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 69
    iget-object v1, p0, Ll/᩷ᩳۧ;->ۧ:Ll/ۤۘۧ;

    invoke-virtual {v1, p1}, Ll/ۤۘۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "application/cea-608"

    .line 70
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "application/x-mp4-cea-608"

    .line 71
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "application/cea-708"

    .line 72
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
