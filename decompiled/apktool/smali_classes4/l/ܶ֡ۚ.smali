.class public final synthetic Ll/ܶ֡ۚ;
.super Ljava/lang/Object;
.source "P44J"

# interfaces
.implements Ll/ܶ᩻ܽ;
.implements Ll/᩶ۤۡ;
.implements Ll/ᩴܺܳ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ۡ᩹ۚ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶ֡ۚ;->᩸:I

    iput-object p2, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginUI;

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->$r8$lambda$lr8zokJiYLX0ZzHcXICzIfn6kRc(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ܶ֡ۚ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩷ۛ᩻;

    .line 11
    check-cast p1, Ljava/lang/Void;

    .line 301
    invoke-virtual {v0}, Ll/᩷ۛ᩻;->run()V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۧܶܿ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۧܶܿ;->֫(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic ֫(Ll/ۨ֡ۚ;I)V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۧ(Ll/ۨ֡ۚ;I)V
    .locals 0

    .line 0
    iget-object p2, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-static {p2, p1}, Ll/᩶֡ۚ;->֫(Ljava/lang/StringBuilder;Ll/ۨ֡ۚ;)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܶ֡ۚ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 1665
    invoke-static {v0, p1}, Ll/ۡۛܿ;->ۧ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method
