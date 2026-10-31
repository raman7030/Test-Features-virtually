.class public final Ll/ۧ᩶ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/֫᩶ܳ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:Ll/۬ۤ;

.field public final ܿ:Ll/᩶ۖܳ;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILl/᩶ۖܳ;Ljava/lang/String;Ll/۬ۤ;)V
    .locals 0

    .line 1174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1175
    iput-object p1, p0, Ll/ۧ᩶ܳ;->֫:Ljava/lang/String;

    .line 1176
    iput p2, p0, Ll/ۧ᩶ܳ;->ۧ:I

    .line 1178
    iput-object p3, p0, Ll/ۧ᩶ܳ;->ܿ:Ll/᩶ۖܳ;

    .line 1179
    iput-object p4, p0, Ll/ۧ᩶ܳ;->ᩳ:Ljava/lang/String;

    .line 1180
    iput-object p5, p0, Ll/ۧ᩶ܳ;->ܽ:Ll/۬ۤ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1198
    iget v0, p0, Ll/ۧ᩶ܳ;->ۧ:I

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1198
    iget v0, p0, Ll/ۧ᩶ܳ;->ۧ:I

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 1207
    iget-object v0, p0, Ll/ۧ᩶ܳ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Lbin/mt/plus/Main;)V
    .locals 1

    .line 1220
    iget-object v0, p0, Ll/ۧ᩶ܳ;->ܽ:Ll/۬ۤ;

    invoke-interface {v0, p1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Ll/ۨܺ᩷;
    .locals 1

    .line 1202
    iget-object v0, p0, Ll/ۧ᩶ܳ;->ܿ:Ll/᩶ۖܳ;

    .line 252
    iget-object v0, v0, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 1212
    iget v0, p0, Ll/ۧ᩶ܳ;->ۧ:I

    const v1, 0x7f12076f

    if-ne v0, v1, :cond_0

    .line 1213
    invoke-static {}, Ll/ۙܳ᩷;->ۧ()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 5

    .line 1184
    iget-object v0, p0, Ll/ۧ᩶ܳ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "tu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "re"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "pt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 1187
    :pswitch_0
    invoke-static {}, Ll/ܽ᩶ܳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ll/ۢۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v2

    .line 1185
    :pswitch_1
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result v0

    return v0

    .line 1186
    :pswitch_2
    invoke-static {}, Ll/ܽ᩶ܳ;->ܿ()Z

    move-result v0

    return v0

    :goto_1
    return v3

    :sswitch_data_0
    .sparse-switch
        0xe04 -> :sswitch_2
        0xe33 -> :sswitch_1
        0xe81 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
