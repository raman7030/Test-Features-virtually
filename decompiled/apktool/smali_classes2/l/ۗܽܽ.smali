.class public final synthetic Ll/ۗܽܽ;
.super Ljava/lang/Object;
.source "45G7"

# interfaces
.implements Ll/ܶ᩻ܽ;
.implements Ll/ܶۖ;
.implements Ll/ۖۛۡ;
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗܽܽ;->᩸:I

    iput-object p2, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget v0, p0, Ll/ۗܽܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֨ۚ᩷;

    invoke-static {v0, p1}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩵᩸ܳ;

    invoke-static {v0, p1}, Ll/᩵᩸ܳ;->֫(Ll/᩵᩸ܳ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic ֫()V
    .locals 0

    return-void
.end method

.method public ֫(I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۗܽܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩹ۙۡ;

    int-to-float p1, p1

    const v1, 0x3f19999a    # 0.6f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 124
    invoke-interface {v0, p1}, Ll/᩹ۙۡ;->֫(I)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֡᩸᩻;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast p1, [B

    .line 118
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۗܽܽ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 379
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
