.class public final synthetic Ll/᩹᩹᩷;
.super Ljava/lang/Object;
.source "A92H"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/widget/AdapterView$OnItemSelectedListener;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/AdapterView$OnItemSelectedListener;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩹᩹᩷;->᩸:I

    iput-object p1, p0, Ll/᩹᩹᩷;->᩹:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 0
    iget v0, p0, Ll/᩹᩹᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Ll/᩹᩹᩷;->᩹:Landroid/widget/AdapterView$OnItemSelectedListener;

    check-cast p1, Ll/ۤܿۢ;

    invoke-static {p1, p2}, Ll/ۤܿۢ;->֫(Ll/ۤܿۢ;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩹᩹᩷;->᩹:Landroid/widget/AdapterView$OnItemSelectedListener;

    check-cast v0, Ll/۬᩹᩷;

    invoke-static {v0, p1, p2}, Ll/۬᩹᩷;->֫(Ll/۬᩹᩷;Landroid/widget/CompoundButton;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
