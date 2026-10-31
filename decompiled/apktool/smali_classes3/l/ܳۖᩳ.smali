.class public final synthetic Ll/ܳۖᩳ;
.super Ljava/lang/Object;
.source "U5MD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۖᩳ;->᩸:I

    iput-object p2, p0, Ll/ܳۖᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܳۖᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܳۖᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ܽۜۢ;

    .line 233
    new-instance v1, Ll/᩶᩻ۢ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܳۖᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, [B

    invoke-static {v0}, Ll/ۡᩴܳ;->֫([B)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/ܳۖᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺۖᩳ;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
