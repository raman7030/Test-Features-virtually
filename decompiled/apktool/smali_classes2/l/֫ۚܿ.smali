.class public final synthetic Ll/֫ۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p2, p0, Ll/֫ۚܿ;->᩸:I

    iput-object p3, p0, Ll/֫ۚܿ;->᩹:Ljava/lang/Object;

    iput p1, p0, Ll/֫ۚܿ;->᩶:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/֫ۚܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫ۚܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;

    .line 11
    iget v1, p0, Ll/֫ۚܿ;->᩶:I

    .line 14
    invoke-static {v0, v1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->$r8$lambda$YGoc72W4PaVci462hvbeS0iWXII(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;I)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/֫ۚܿ;->᩹:Ljava/lang/Object;

    .line 19
    check-cast v0, Ll/ۖܿ;

    .line 21
    iget v1, p0, Ll/֫ۚܿ;->᩶:I

    const/4 v2, 0x1

    .line 214
    invoke-virtual {v0, v1, v2}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
