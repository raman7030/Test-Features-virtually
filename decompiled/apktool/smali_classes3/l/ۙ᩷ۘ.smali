.class public final Ll/ۙ᩷ۘ;
.super Ll/۫᩷ۘ;
.source "F7UY"


# static fields
.field public static final serialVersionUID:J = -0x1L


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 40
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    packed-switch p1, :pswitch_data_0

    const-string p1, ""

    goto :goto_0

    :pswitch_0
    const-string p1, "lang.s2c"

    goto :goto_0

    :pswitch_1
    const-string p1, "lang.c2s"

    goto :goto_0

    :pswitch_2
    const-string p1, "compression.s2c"

    goto :goto_0

    :pswitch_3
    const-string p1, "compression.c2s"

    goto :goto_0

    :pswitch_4
    const-string p1, "mac.s2c"

    goto :goto_0

    :pswitch_5
    const-string p1, "mac.c2s"

    goto :goto_0

    :pswitch_6
    const-string p1, "cipher.s2c"

    goto :goto_0

    :pswitch_7
    const-string p1, "cipher.c2s"

    goto :goto_0

    :pswitch_8
    const-string p1, "server_host_key"

    goto :goto_0

    :pswitch_9
    const-string p1, "kex"

    :goto_0
    const-string v0, "\" jschProposal=\""

    const-string v1, "\" serverProposal=\""

    const-string v2, "Algorithm negotiation fail: algorithmName=\""

    .line 0
    invoke-static {v2, p1, v0, p2, v1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "\""

    invoke-static {p1, p3, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
