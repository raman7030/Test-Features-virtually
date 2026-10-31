.class public final synthetic Ll/ۜ᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILl/ۗܺ᩷;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜ᩺ᩳ;->᩸:I

    iput-object p3, p0, Ll/ۜ᩺ᩳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜ᩺ᩳ;->᩶:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 0
    iget v0, p0, Ll/ۜ᩺ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Ll/ۜ᩺ᩳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۠۫ܽ;

    iget-object v0, p0, Ll/ۜ᩺ᩳ;->᩶:Ll/ۗܺ᩷;

    invoke-static {p1, v0}, Ll/۠۫ܽ;->ۧ(Ll/۠۫ܽ;Ll/ۗܺ᩷;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۜ᩺ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܶ᩺ᩳ;

    iget-object v1, p0, Ll/ۜ᩺ᩳ;->᩶:Ll/ۗܺ᩷;

    invoke-static {v0, v1, p1}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
