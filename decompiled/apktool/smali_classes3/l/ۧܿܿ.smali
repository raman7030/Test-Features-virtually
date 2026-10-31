.class public Ll/ۧܿܿ;
.super Ljava/lang/Object;
.source "NAVX"


# static fields
.field public static final ܽ:Ll/۟ᩳܿ;

.field public static final ܿ:Ll/ۙۡᩴ;

.field public static final ᩳ:Ll/ۙۡᩴ;


# instance fields
.field public ֫:Ll/ܶܳܿ;

.field public final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 261
    new-instance v0, Ll/۟ᩳܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۧܿܿ;->ܽ:Ll/۟ᩳܿ;

    const/16 v0, 0x23

    new-array v0, v0, [I

    .line 325
    fill-array-data v0, :array_0

    .line 363
    invoke-static {v0}, Ll/ܺۢᩴ;->֫([I)Ll/ܺۢᩴ;

    move-result-object v1

    invoke-static {v1}, Ll/۬ۡᩴ;->֫(Ll/ܺۢᩴ;)Ll/ۙۡᩴ;

    move-result-object v1

    sput-object v1, Ll/ۧܿܿ;->ᩳ:Ll/ۙۡᩴ;

    .line 364
    new-instance v1, Ll/ܺۢᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/ܺۢᩴ;-><init>([II)V

    invoke-static {v1}, Ll/۬ۡᩴ;->֫(Ll/ܺۢᩴ;)Ll/ۙۡᩴ;

    move-result-object v0

    sput-object v0, Ll/ۧܿܿ;->ܿ:Ll/ۙۡᩴ;

    return-void

    nop

    :array_0
    .array-data 4
        0x1f
        0x0
        0x22
        0x1b
        0x1c
        0x1d
        0x1e
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0x20
        0x21
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x17
        0x18
        0x12
        0x13
        0x14
        0x15
        0x19
        0x1a
        0x16
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Ll/ۧܿܿ;->ۧ:I

    return-void
.end method

.method public static ֫(I)Ll/᩵ᩳܿ;
    .locals 1

    if-eqz p0, :cond_2

    const/16 v0, 0x1b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x22

    if-eq p0, v0, :cond_0

    .line 257
    sget-object p0, Ll/ۧܿܿ;->ܽ:Ll/۟ᩳܿ;

    return-object p0

    .line 256
    :cond_0
    sget-object p0, Ll/ۨᩳܿ;->ۘ:Ll/ۤᩳܿ;

    return-object p0

    .line 255
    :cond_1
    sget-object p0, Ll/᩹ᩳܿ;->ۜ:Ll/᩸ᩳܿ;

    return-object p0

    .line 254
    :cond_2
    sget-object p0, Ll/ۙᩳܿ;->᩻:Ll/᩶ᩳܿ;

    return-object p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "???"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const p0, 0x7f120a5d

    .line 438
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const p0, 0x7f120608

    .line 406
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    const p0, 0x7f1205f4

    .line 404
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_3
    const p0, 0x7f120892

    .line 380
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_4
    const p0, 0x104000b

    .line 378
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_5
    const p0, 0x1040003

    .line 376
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_6
    const p0, 0x1040001

    .line 374
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_7
    const p0, 0x7f1203e2

    .line 372
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_8
    const p0, 0x7f120139

    .line 434
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_9
    const p0, 0x7f120138

    .line 432
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_a
    const p0, 0x7f120a7b

    .line 422
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_b
    const p0, 0x7f120a7d

    .line 420
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_c
    const p0, 0x7f120a59

    .line 436
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_d
    const p0, 0x7f120636

    .line 430
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_e
    const p0, 0x7f120639

    .line 428
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_f
    const p0, 0x7f120638

    .line 426
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_10
    const p0, 0x7f120637

    .line 424
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_11
    const p0, 0x7f120a7c

    .line 418
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_12
    const p0, 0x7f120a7e

    .line 416
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_13
    const p0, 0x7f120949

    .line 414
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_14
    const p0, 0x7f1206dc

    .line 412
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_15
    const p0, 0x7f12079f

    .line 410
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_16
    const p0, 0x7f1205ff

    .line 408
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_17
    const p0, 0x7f120612

    .line 402
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_18
    const p0, 0x7f1205c9

    .line 400
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_19
    const p0, 0x7f1205e2

    .line 398
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1a
    const p0, 0x7f1205c0

    .line 396
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1b
    const p0, 0x7f1205c1

    .line 394
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1c
    const p0, 0x7f1205d1

    .line 392
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1d
    const p0, 0x7f1205fb

    .line 390
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1e
    const p0, 0x7f1205d4

    .line 388
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1f
    const p0, 0x7f1205cb

    .line 386
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_20
    const p0, 0x7f1205c8

    .line 384
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_21
    const p0, 0x7f1205c5

    .line 382
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_22
    const p0, 0x7f1204ad

    .line 370
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ֫(Landroid/view/View;Ll/֫ܿܿ;)V
    .locals 5

    .line 102
    invoke-interface {p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object v0

    .line 103
    invoke-interface {p2}, Ll/֫ܿܿ;->ۧ()Ll/᩹᩺ᩳ;

    move-result-object v1

    if-eqz v0, :cond_6

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 106
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-nez v2, :cond_1

    .line 107
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 109
    :cond_1
    iget v2, p0, Ll/ۧܿܿ;->ۧ:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    .line 243
    :pswitch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unsupported type "

    .line 0
    invoke-static {v2, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 243
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 156
    :pswitch_1
    invoke-static {v0}, Ll/᩺ۨᩳ;->ۢ(Ll/۫ۨᩳ;)V

    return-void

    .line 153
    :pswitch_2
    invoke-static {v0}, Ll/᩺ۨᩳ;->ۜ(Ll/۫ۨᩳ;)V

    return-void

    .line 213
    :pswitch_3
    iget-object v0, p0, Ll/ۧܿܿ;->֫:Ll/ܶܳܿ;

    if-eqz v0, :cond_3

    .line 216
    iget-object v0, v0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    invoke-virtual {v0}, Ll/ۧܿܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    .line 217
    iget-object v0, p0, Ll/ۧܿܿ;->֫:Ll/ܶܳܿ;

    iget-object v0, v0, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    invoke-virtual {v0, p1, p2}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/֫ܿܿ;)V

    .line 218
    new-instance p1, Ll/᩺ᩳܿ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0xc8

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 221
    :cond_2
    new-instance v0, Ll/ܰᩳܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܰᩳܿ;-><init>(Ll/ۧܿܿ;Landroid/view/View;Ll/֫ܿܿ;)V

    .line 240
    invoke-virtual {v0}, Ll/ܰᩳܿ;->run()V

    return-void

    .line 214
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "bindingFunction == null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    const p1, 0x1020022

    .line 117
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܺ(I)V

    return-void

    :pswitch_5
    const p1, 0x1020020

    .line 114
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܺ(I)V

    return-void

    :pswitch_6
    const p1, 0x1020021

    .line 111
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܺ(I)V

    return-void

    .line 198
    :pswitch_7
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷()V

    return-void

    .line 195
    :pswitch_8
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜ()V

    return-void

    .line 95
    :pswitch_9
    invoke-static {v0, v4}, Ll/᩺ۨᩳ;->ۧ(Ll/۫ۨᩳ;Z)V

    return-void

    .line 80
    :pswitch_a
    invoke-static {v0, v4}, Ll/᩺ۨᩳ;->ᩳ(Ll/۫ۨᩳ;Z)V

    return-void

    .line 202
    :pswitch_b
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_5

    .line 204
    instance-of p2, p1, Ll/ۧۚᩳ;

    if-eqz p2, :cond_4

    check-cast p1, Ll/ۧۚᩳ;

    .line 205
    invoke-virtual {p1}, Ll/֡ܰۧ;->ܽ()I

    move-result v4

    goto :goto_1

    .line 208
    :cond_4
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    .line 37
    :cond_5
    :goto_1
    sget-object p1, Ll/ۙ᩸᩷;->ۧ:Ll/᩶ۡ᩷;

    .line 38
    new-instance p2, Landroid/content/Intent;

    const-class v0, Ll/֡ܳܿ;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    .line 39
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "pageIndex"

    .line 40
    invoke-virtual {p2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :pswitch_c
    const/16 p1, 0x14

    .line 189
    invoke-virtual {v0, p1, v3}, Ll/۫ۨᩳ;->onKeyDown(ILandroid/view/KeyEvent;)Z

    return-void

    :pswitch_d
    const/16 p1, 0x13

    .line 186
    invoke-virtual {v0, p1, v3}, Ll/۫ۨᩳ;->onKeyDown(ILandroid/view/KeyEvent;)Z

    return-void

    :pswitch_e
    const/16 p1, 0x16

    .line 183
    invoke-virtual {v0, p1, v3}, Ll/۫ۨᩳ;->onKeyDown(ILandroid/view/KeyEvent;)Z

    return-void

    :pswitch_f
    const/16 p1, 0x15

    .line 180
    invoke-virtual {v0, p1, v3}, Ll/۫ۨᩳ;->onKeyDown(ILandroid/view/KeyEvent;)Z

    return-void

    .line 61
    :pswitch_10
    invoke-static {v0, v4}, Ll/᩺ۨᩳ;->ܽ(Ll/۫ۨᩳ;Z)V

    return-void

    .line 45
    :pswitch_11
    invoke-static {v0, v4}, Ll/᩺ۨᩳ;->ܿ(Ll/۫ۨᩳ;Z)V

    return-void

    .line 192
    :pswitch_12
    invoke-interface {p2}, Ll/֫ܿܿ;->ܽ()V

    return-void

    .line 165
    :pswitch_13
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܽ֫()V

    return-void

    .line 162
    :pswitch_14
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩳ()V

    return-void

    .line 159
    :pswitch_15
    invoke-interface {v1}, Ll/᩹᩺ᩳ;->֫()V

    return-void

    .line 150
    :pswitch_16
    invoke-static {v0}, Ll/᩺ۨᩳ;->ۡ(Ll/۫ۨᩳ;)V

    return-void

    .line 147
    :pswitch_17
    invoke-static {v0}, Ll/᩺ۨᩳ;->ܽ(Ll/۫ۨᩳ;)V

    return-void

    .line 144
    :pswitch_18
    invoke-static {v0}, Ll/᩺ۨᩳ;->᩻(Ll/۫ۨᩳ;)V

    return-void

    .line 141
    :pswitch_19
    invoke-static {v0, v4}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    return-void

    :pswitch_1a
    const/4 p1, 0x1

    .line 138
    invoke-static {v0, p1}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;Z)V

    return-void

    .line 135
    :pswitch_1b
    invoke-static {v0}, Ll/᩺ۨᩳ;->ܿ(Ll/۫ۨᩳ;)V

    return-void

    .line 132
    :pswitch_1c
    invoke-static {v0}, Ll/᩺ۨᩳ;->᩷(Ll/۫ۨᩳ;)V

    return-void

    .line 129
    :pswitch_1d
    invoke-static {v0}, Ll/᩺ۨᩳ;->ܳ(Ll/۫ۨᩳ;)V

    return-void

    .line 126
    :pswitch_1e
    invoke-static {v0}, Ll/᩺ۨᩳ;->ᩳ(Ll/۫ۨᩳ;)V

    return-void

    .line 123
    :pswitch_1f
    invoke-static {v0}, Ll/᩺ۨᩳ;->ۧ(Ll/۫ۨᩳ;)V

    return-void

    .line 120
    :pswitch_20
    invoke-static {v0}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;)V

    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public ֫(Landroid/view/View;Ll/ۤۤᩳ;)V
    .locals 0

    .line 98
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Z)Z
    .locals 2

    .line 249
    iget v0, p0, Ll/ۧܿܿ;->ۧ:I

    if-ltz v0, :cond_1

    const/16 v1, 0x23

    if-ge v0, v1, :cond_1

    if-nez p1, :cond_0

    const/16 p1, 0x1f

    if-eq v0, p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    .line 37
    iget v0, p0, Ll/ۧܿܿ;->ۧ:I

    invoke-static {v0}, Ll/ۧܿܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܳ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۙᩳܿ;

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 33
    iget v0, p0, Ll/ۧܿܿ;->ۧ:I

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 33
    iget v0, p0, Ll/ۧܿܿ;->ۧ:I

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ()Lbin/mt/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ᩻()Z
    .locals 4

    .line 53
    iget v0, p0, Ll/ۧܿܿ;->ۧ:I

    packed-switch v0, :pswitch_data_0

    .line 89
    :pswitch_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    const/4 v0, 0x1

    return v0

    :pswitch_2
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
