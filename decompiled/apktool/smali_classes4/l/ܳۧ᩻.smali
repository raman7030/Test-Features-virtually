.class public final synthetic Ll/ܳۧ᩻;
.super Ljava/lang/Object;
.source "I23M"

# interfaces
.implements Ll/ۙ۫ۡ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ܳۧ᩻;->᩸:I

    iput-object p1, p0, Ll/ܳۧ᩻;->᩹:Ll/ܶ᩵ܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget v0, p0, Ll/ܳۧ᩻;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܳۧ᩻;->᩹:Ll/ܶ᩵ܿ;

    .line 268
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܳۧ᩻;->᩹:Ll/ܶ᩵ܿ;

    .line 239
    invoke-static {v0}, Ll/ܿܺۡ;->ܿ(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
