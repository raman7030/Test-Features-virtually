.class public final synthetic Ll/֨ۤܿ;
.super Ljava/lang/Object;
.source "G668"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/۬ܿᩳ;

.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ۫:Landroid/widget/EditText;

.field public final synthetic ۬:Ll/֨ۙܽ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:[Landroid/widget/RadioButton;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;ILl/֡ۚۢ;Ll/ۗܺ᩷;Ll/۬ܿᩳ;Ll/֨ۙܽ;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۤܿ;->᩸:[Landroid/widget/RadioButton;

    iput p2, p0, Ll/֨ۤܿ;->᩹:I

    iput-object p3, p0, Ll/֨ۤܿ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/֨ۤܿ;->ۙ:Ll/ۗܺ᩷;

    iput-object p5, p0, Ll/֨ۤܿ;->ۗ:Ll/۬ܿᩳ;

    iput-object p6, p0, Ll/֨ۤܿ;->۬:Ll/֨ۙܽ;

    iput-object p7, p0, Ll/֨ۤܿ;->۫:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 307
    iget-object p1, p0, Ll/֨ۤܿ;->᩸:[Landroid/widget/RadioButton;

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iget v2, p0, Ll/֨ۤܿ;->᩹:I

    iget-object v3, p0, Ll/֨ۤܿ;->᩶:Ll/֡ۚۢ;

    iget-object v4, p0, Ll/֨ۤܿ;->ۙ:Ll/ۗܺ᩷;

    iget-object v5, p0, Ll/֨ۤܿ;->ۗ:Ll/۬ܿᩳ;

    iget-object v6, p0, Ll/֨ۤܿ;->۬:Ll/֨ۙܽ;

    if-eqz v1, :cond_1

    if-nez v2, :cond_0

    .line 309
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 312
    :cond_0
    new-instance p1, Ll/ۙۤܿ;

    invoke-direct {p1, v4, v5, v3, v6}, Ll/ۙۤܿ;-><init>(Ll/ۗܺ᩷;Ll/۬ܿᩳ;Ll/֡ۚۢ;Ll/֨ۙܽ;)V

    .line 345
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 346
    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    const/4 v7, 0x0

    if-eqz p1, :cond_6

    .line 347
    iget-object p1, p0, Ll/֨ۤܿ;->۫:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    move-result v8

    if-nez v8, :cond_3

    if-ne v2, v1, :cond_2

    .line 349
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_2
    const v0, 0x7f120305

    .line 352
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 353
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_3
    if-ne v2, v1, :cond_4

    .line 358
    :try_start_0
    invoke-static {v5}, Ll/᩶ܿᩳ;->֫(Ll/۬ܿᩳ;)Ll/ܶ᩵ܿ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    :try_start_1
    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۧ()V

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v8, v7

    goto :goto_1

    :cond_4
    move-object v8, v7

    .line 361
    :goto_0
    invoke-static {}, Ll/ۡۨܽ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ܳ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v11

    invoke-virtual {v11}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v11

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v12

    invoke-interface {v12}, Ljava/security/Key;->getEncoded()[B

    move-result-object v12

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, v10, v11, v12, p1}, Ll/᩶ܿᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;[B[BLjava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 362
    invoke-virtual {v5}, Ll/۬ܿᩳ;->֡()V

    if-eq v2, v1, :cond_5

    .line 364
    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۧ()V

    .line 366
    :cond_5
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 367
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    .line 369
    invoke-virtual {v6, p1}, Ll/֨ۙܽ;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_1
    if-eqz v8, :cond_8

    .line 374
    :try_start_2
    invoke-static {v5}, Ll/᩶ܿᩳ;->֫(Ll/۬ܿᩳ;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    array-length v2, v8

    invoke-virtual {v1, v8, v0, v2}, Ll/ܶ᩵ܿ;->֫([BII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_2

    :cond_6
    const/4 p1, 0x2

    if-ne v2, p1, :cond_7

    .line 384
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 388
    :cond_7
    :try_start_3
    invoke-static {}, Ll/ۡۨܽ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Ll/ۙܿᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;[B[B)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 389
    invoke-virtual {v5}, Ll/۬ܿᩳ;->֡()V

    .line 390
    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۧ()V

    .line 391
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 392
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    .line 394
    invoke-virtual {v6, p1}, Ll/֨ۙܽ;->accept(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    return-void

    :catch_2
    move-exception p1

    .line 546
    :catch_3
    :cond_8
    :goto_2
    invoke-virtual {v4, p1, v7}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :goto_3
    return-void
.end method
