.class public final synthetic Ll/᩻ۨۡ;
.super Ljava/lang/Object;
.source "4BMC"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ᩴܺܳ;
.implements Ll/֫۠ܳ;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Lcom/umeng/commonsdk/listener/OnGetOaidListener;
.implements Ll/ۜ֡֨;
.implements Ll/۬ܶ۠;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ۜ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->$r8$lambda$diHaj3KVLD4f9HLhcnX74q8TZMQ(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۜ֡֫;

    .line 6
    check-cast p1, Ll/֨۬֫;

    .line 770
    invoke-interface {p1, v0}, Ll/֨۬֫;->֫(Ll/ۜ֡֫;)V

    .line 771
    iget p1, v0, Ll/ۜ֡֫;->ܽ:I

    return-void
.end method

.method public onGetOaid(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۤܽ֡;

    .line 388
    :try_start_0
    invoke-interface {v0, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 390
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ֫(II[B)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۛܶ۠;

    .line 422
    iget-object v0, v0, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v0, p1, p2, p3}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 9

    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 421
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/4 v1, 0x5

    .line 422
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 423
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 424
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 425
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 426
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/16 v5, 0x3e8

    const-string v6, ", "

    if-ge v4, v5, :cond_1

    .line 428
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 429
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    .line 430
    invoke-virtual {v1, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 431
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    sget v7, Ll/᩹֡᩷;->֫:I

    invoke-direct {v5, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int/lit8 v7, v4, 0x2

    const/16 v8, 0x11

    invoke-virtual {v1, v5, v4, v7, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 433
    :cond_0
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 435
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_2

    .line 436
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    :cond_2
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 440
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 441
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    new-instance v1, Ll/ᩴ۫ܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/ᩴ۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    return-void
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۗܰ֨;

    invoke-static {v0, p1}, Ll/ۗܰ֨;->֫(Ll/ۗܰ֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩻ۨۡ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 1758
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 172
    invoke-static {v0, p1, v1}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/util/List;)V

    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
