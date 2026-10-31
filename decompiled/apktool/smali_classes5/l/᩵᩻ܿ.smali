.class public final Ll/᩵᩻ܿ;
.super Ll/ۖ᩻ܿ;
.source "S7IR"


# static fields
.field public static ۧ:Ll/ۖۙܺ;

.field public static ܽ:Ll/ۖۙܺ;


# instance fields
.field public final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 50
    invoke-static {}, Ll/ۤۗܺ;->᩻()Ll/۬ۗܺ;

    move-result-object v0

    const/4 v1, 0x1

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:copyLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:cutLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:deleteLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:emptyLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x5

    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:replaceLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x6

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:duplicateLine"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x7

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:caseLow2Up"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:caseUp2Low"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0x9

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:increaseIndent"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0xa

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:decreaseIndent"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0xb

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:toggleComment"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0xc

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:shrinkCode"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0xd

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:formatCode"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0xe

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "builtin:customize"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 461
    invoke-virtual {v0}, Ll/۬ۗܺ;->ۧ()Ll/ۤۗܺ;

    move-result-object v0

    .line 65
    sput-object v0, Ll/᩵᩻ܿ;->ܽ:Ll/ۖۙܺ;

    .line 67
    invoke-interface {v0}, Ll/ۖۙܺ;->ᩳ()Ll/ۖۙܺ;

    move-result-object v0

    sput-object v0, Ll/᩵᩻ܿ;->ۧ:Ll/ۖۙܺ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ll/ۖ᩻ܿ;-><init>()V

    .line 84
    iput p1, p0, Ll/᩵᩻ܿ;->֫:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 78
    sget-object v0, Ll/᩵᩻ܿ;->ۧ:Ll/ۖۙܺ;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static ܿ()Ll/ۛ۬ܺ;
    .locals 1

    .line 70
    sget-object v0, Ll/᩵᩻ܿ;->ܽ:Ll/ۖۙܺ;

    check-cast v0, Ll/ۤۗܺ;

    .line 567
    invoke-virtual {v0}, Ll/ۤۗܺ;->ᩳ()Ll/ۤۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->keySet()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 130
    iget v0, p0, Ll/᩵᩻ܿ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 145
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown action "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const v0, 0x7f08023d

    goto :goto_0

    :pswitch_1
    const v0, 0x7f0801fc

    goto :goto_0

    :pswitch_2
    const v0, 0x7f080254

    goto :goto_0

    :pswitch_3
    const v0, 0x7f080211

    goto :goto_0

    :pswitch_4
    const v0, 0x7f08020d

    goto :goto_0

    :pswitch_5
    const v0, 0x7f08020e

    goto :goto_0

    :pswitch_6
    const v0, 0x7f0801db

    goto :goto_0

    :pswitch_7
    const v0, 0x7f0801da

    goto :goto_0

    :pswitch_8
    const v0, 0x7f0801ef

    goto :goto_0

    :pswitch_9
    const v0, 0x7f080233

    goto :goto_0

    :pswitch_a
    const v0, 0x7f0801f2

    goto :goto_0

    :pswitch_b
    const v0, 0x7f0801e7

    goto :goto_0

    :pswitch_c
    const v0, 0x7f0801e5

    goto :goto_0

    :pswitch_d
    const v0, 0x7f0801e3

    .line 147
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {v1, v0, p1}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 74
    sget-object v0, Ll/᩵᩻ܿ;->ܽ:Ll/ۖۙܺ;

    iget v1, p0, Ll/᩵᩻ܿ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 91
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown action "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 3

    .line 154
    iget v0, p0, Ll/᩵᩻ܿ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 170
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown action "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 169
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-class v2, Ll/ۛ᩻ܿ;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 167
    :pswitch_1
    invoke-static {p1}, Ll/᩺ۨᩳ;->ۜ(Ll/۫ۨᩳ;)V

    return-void

    .line 166
    :pswitch_2
    invoke-static {p1}, Ll/᩺ۨᩳ;->ۢ(Ll/۫ۨᩳ;)V

    return-void

    .line 165
    :pswitch_3
    invoke-static {p1}, Ll/᩺ۨᩳ;->ۡ(Ll/۫ۨᩳ;)V

    return-void

    .line 164
    :pswitch_4
    invoke-static {p1}, Ll/᩺ۨᩳ;->ܽ(Ll/۫ۨᩳ;)V

    return-void

    .line 163
    :pswitch_5
    invoke-static {p1}, Ll/᩺ۨᩳ;->᩻(Ll/۫ۨᩳ;)V

    return-void

    :pswitch_6
    const/4 v0, 0x0

    .line 162
    invoke-static {p1, v0}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    return-void

    :pswitch_7
    const/4 v0, 0x1

    .line 161
    invoke-static {p1, v0}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    return-void

    .line 160
    :pswitch_8
    invoke-static {p1}, Ll/᩺ۨᩳ;->ܿ(Ll/۫ۨᩳ;)V

    return-void

    .line 159
    :pswitch_9
    invoke-static {p1}, Ll/᩺ۨᩳ;->᩷(Ll/۫ۨᩳ;)V

    return-void

    .line 158
    :pswitch_a
    invoke-static {p1}, Ll/᩺ۨᩳ;->ܳ(Ll/۫ۨᩳ;)V

    return-void

    .line 157
    :pswitch_b
    invoke-static {p1}, Ll/᩺ۨᩳ;->ᩳ(Ll/۫ۨᩳ;)V

    return-void

    .line 156
    :pswitch_c
    invoke-static {p1}, Ll/᩺ۨᩳ;->ۧ(Ll/۫ۨᩳ;)V

    return-void

    .line 155
    :pswitch_d
    invoke-static {p1}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/۫ۨᩳ;ZZII)Z
    .locals 0

    .line 98
    iget p2, p0, Ll/᩵᩻ܿ;->֫:I

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 100
    :pswitch_0
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩺֫()Ll/ܿۜܿ;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 101
    :pswitch_1
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܰ֫()Ll/ۜۜܿ;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 99
    :pswitch_2
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۟֫()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :goto_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ()Ll/ܺ᩻ܿ;
    .locals 3

    .line 108
    iget v0, p0, Ll/᩵᩻ܿ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 123
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unknown action "

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const v0, 0x7f12021d

    goto :goto_0

    :pswitch_1
    const v0, 0x7f1205f4

    goto :goto_0

    :pswitch_2
    const v0, 0x7f120608

    goto :goto_0

    :pswitch_3
    const v0, 0x7f120612

    goto :goto_0

    :pswitch_4
    const v0, 0x7f1205c9

    goto :goto_0

    :pswitch_5
    const v0, 0x7f1205e2

    goto :goto_0

    :pswitch_6
    const v0, 0x7f1205c0

    goto :goto_0

    :pswitch_7
    const v0, 0x7f1205c1

    goto :goto_0

    :pswitch_8
    const v0, 0x7f1205d1

    goto :goto_0

    :pswitch_9
    const v0, 0x7f1205fb

    goto :goto_0

    :pswitch_a
    const v0, 0x7f1205d4

    goto :goto_0

    :pswitch_b
    const v0, 0x7f1205cb

    goto :goto_0

    :pswitch_c
    const v0, 0x7f1205c8

    goto :goto_0

    :pswitch_d
    const v0, 0x7f1205c5

    .line 125
    :goto_0
    new-instance v1, Ll/ܺ᩻ܿ;

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Ll/ܺ᩻ܿ;-><init>(Ljava/lang/CharSequence;Ll/ۖ᩻ܿ;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
