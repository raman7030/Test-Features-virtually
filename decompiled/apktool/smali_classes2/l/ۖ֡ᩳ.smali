.class public final synthetic Ll/ۖ֡ᩳ;
.super Ljava/lang/Object;
.source "PAPA"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩻ۚ֫;
.implements Ll/ܳ۫ᩳ;
.implements Ll/ᩴܺܳ;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/֫۠ܳ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ֡ᩳ;->᩸:I

    iput-object p2, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ljava/lang/Object;J)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/ۖ֡ᩳ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۖ֡ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginProgressBar;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setProgress(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽᩴۧ;

    check-cast p1, Ll/۬ۘۧ;

    invoke-static {v0, p1}, Ll/ܽᩴۧ;->֫(Ll/ܽᩴۧ;Ll/۬ۘۧ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۗ᩻ܳ;

    .line 473
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 474
    invoke-interface {v0, p1}, Ll/ۗ᩻ܳ;->֫(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    .line 477
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۧ᩸᩻;

    invoke-static {v0, p1}, Ll/ۧ᩸᩻;->֫(Ll/ۧ᩸᩻;Landroid/widget/TextView;)V

    return-void
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۗܰ֨;

    invoke-static {v0, p1}, Ll/ۗܰ֨;->ܽ(Ll/ۗܰ֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public ֫(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Landroid/widget/ProgressBar;

    .line 6
    sget v1, Ll/֨֡ᩳ;->ۘۧ:I

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 110
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 1761
    invoke-static {v0, p1}, Ll/᩵ܺܳ;->ܿ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
