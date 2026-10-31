.class public final synthetic Ll/᩹۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹۫ܳ;->᩸:I

    iput-object p2, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩹۫ܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܳ᩷ۡ;

    .line 12
    invoke-static {v0}, Ll/ܳ᩷ۡ;->֫(Ll/ܳ᩷ۡ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Lbin/mt/plugin/api/util/AsyncTask;

    .line 20
    invoke-static {v0}, Lbin/mt/plugin/api/util/AsyncTask;->$r8$lambda$406bpkkgsyqlN9dEFu9XO8YzfFc(Lbin/mt/plugin/api/util/AsyncTask;)V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    .line 25
    check-cast v0, Ljava/lang/String;

    .line 1156
    invoke-static {v0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩺ۤܿ;

    invoke-static {v0}, Ll/᩺ۤܿ;->֫(Ll/᩺ۤܿ;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Ll/᩹۫ܳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۛ۫ܳ;

    invoke-static {v0}, Ll/ۛ۫ܳ;->֫(Ll/ۛ۫ܳ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
