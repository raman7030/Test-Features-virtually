.class public final synthetic Ll/᩸ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩸ۛᩳ;->᩸:I

    iput-object p2, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩸ۛᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 12
    invoke-static {v0}, Lcom/google/android/material/search/SearchBar;->$r8$lambda$K5cFI3WF_YN-Ulw429cadH_0yJ8(Lcom/google/android/material/search/SearchBar;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ۗܺ᩷;

    const-string v1, "def_sign_key_warn"

    const v2, 0x7f120235

    .line 293
    invoke-static {v2, v0, v1}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֡ۚۢ;

    .line 1109
    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1110
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܽ()V

    return-void

    :pswitch_3
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۟ۚۧ;

    invoke-static {v0}, Ll/۟ۚۧ;->֫(Ll/۟ۚۧ;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Ll/᩸ۛᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ܳ(Ll/۫ۨᩳ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
