.class public final synthetic Ll/ۛ֨ܳ;
.super Ljava/lang/Object;
.source "98EM"

# interfaces
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ֨ܳ;->᩸:I

    iput-wide p2, p0, Ll/ۛ֨ܳ;->᩹:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛ֨ܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-wide v0, p0, Ll/ۛ֨ܳ;->᩹:J

    .line 66
    invoke-static {p1, v0, v1}, Ll/ܺ۫ܳ;->֫(Landroid/widget/TextView;J)V

    return-void

    .line 0
    :pswitch_0
    iget-wide v0, p0, Ll/ۛ֨ܳ;->᩹:J

    .line 484
    invoke-static {p1, v0, v1}, Ll/ܺ۫ܳ;->֫(Landroid/widget/TextView;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
