.class public final synthetic Ll/֫۠ۢ;
.super Ljava/lang/Object;
.source "LAXL"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/᩻ۡ֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۡ֫;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/֫۠ۢ;->᩸:I

    iput-object p1, p0, Ll/֫۠ۢ;->᩹:Ll/᩻ۡ֫;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/֫۠ۢ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫۠ۢ;->᩹:Ll/᩻ۡ֫;

    .line 9
    check-cast v0, Ll/᩸᩻ۢ;

    .line 11
    check-cast p1, Ljava/util/List;

    .line 14
    invoke-static {v0, p1}, Ll/᩸᩻ۢ;->֫(Ll/᩸᩻ۢ;Ljava/util/List;)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/֫۠ۢ;->᩹:Ll/᩻ۡ֫;

    .line 19
    check-cast v0, Ll/ܽ֨ᩳ;

    .line 21
    check-cast p1, Ljava/lang/Throwable;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/֫۠ۢ;->᩹:Ll/᩻ۡ֫;

    check-cast v0, Ll/֡ۚۢ;

    check-cast p1, Ll/ܰۚۡ;

    .line 170
    invoke-virtual {p1}, Ll/ܰۚۡ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 171
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
