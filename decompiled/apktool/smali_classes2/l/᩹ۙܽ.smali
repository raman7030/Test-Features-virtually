.class public Ll/᩹ۙܽ;
.super Ll/ۗܺ᩷;
.source "28VT"


# static fields
.field public static final synthetic ᩵ۧ:I


# instance fields
.field public ۖۧ:Ll/ۛ᩵᩷;

.field public ۘۧ:Ll/۫ۤۧ;

.field public ۜۧ:Ljava/lang/String;

.field public ۡۧ:Landroid/graphics/drawable/Drawable;

.field public ۢۧ:Ll/۬ܿᩳ;

.field public ܳۧ:Z

.field public ܺۧ:Ljava/util/List;

.field public ܿۧ:Ljava/util/List;

.field public ᩳۧ:Ll/᩻ۙܽ;

.field public ᩴۧ:Ljava/util/List;

.field public ᩷ۧ:Landroid/graphics/drawable/Drawable;

.field public ᩻ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 74
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩹ۙܽ;->ᩴۧ:Ljava/util/List;

    .line 75
    iput-object v0, p0, Ll/᩹ۙܽ;->ܺۧ:Ljava/util/List;

    .line 76
    iput-object v0, p0, Ll/᩹ۙܽ;->ܿۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ᩳۧ:Ll/᩻ۙܽ;

    return-object p0
.end method

.method private ֫(Ll/۬ܿᩳ;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 656
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v2

    .line 657
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    .line 658
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->֡()V

    .line 659
    new-instance v11, Ll/֨۫ܽ;

    .line 795
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    const v4, 0x7f0d0080

    .line 660
    invoke-virtual {v0, v4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v12

    const v4, 0x7f0a05e4

    .line 661
    invoke-virtual {v12, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f120990

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    const v4, 0x7f0a0602

    .line 662
    invoke-virtual {v12, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0a060d

    .line 663
    invoke-virtual {v12, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f0a05fb

    .line 664
    invoke-virtual {v12, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Landroid/widget/TextView;

    const v6, 0x7f0a05fd

    .line 665
    invoke-virtual {v12, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Landroid/widget/TextView;

    const v6, 0x7f0a05fe

    .line 666
    invoke-virtual {v12, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Landroid/widget/TextView;

    const v6, 0x7f0a05ff

    .line 667
    invoke-virtual {v12, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v7, 0x7f0a05fc

    .line 668
    invoke-virtual {v12, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    const v8, 0x7f0a0601

    .line 669
    invoke-virtual {v12, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    const v9, 0x7f0a060b

    .line 670
    invoke-virtual {v12, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    const v10, 0x7f0a060c

    .line 671
    invoke-virtual {v12, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    move-object/from16 v16, v3

    const v3, 0x7f0a0057

    .line 672
    invoke-virtual {v12, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۗۘ;

    move-object/from16 v17, v2

    const v2, 0x7f0a066a

    .line 673
    invoke-virtual {v12, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۗۘ;

    const v0, 0x7f0a0232

    .line 674
    invoke-virtual {v12, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v18, v3

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 676
    instance-of v0, v1, Ll/᩹ܿᩳ;

    if-eqz v0, :cond_0

    const v0, 0x7f12047e

    .line 677
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 678
    :cond_0
    instance-of v0, v1, Ll/᩶ܿᩳ;

    if-eqz v0, :cond_1

    const v0, 0x7f120480

    .line 679
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 680
    :cond_1
    instance-of v0, v1, Ll/ۙܿᩳ;

    if-nez v0, :cond_2

    instance-of v0, v1, Ll/۫ܿᩳ;

    if-eqz v0, :cond_3

    :cond_2
    const v0, 0x7f120482

    .line 681
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 685
    :cond_3
    :goto_0
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "\\(.*\\)|\uff08.*\uff09"

    const-string v1, ""

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 687
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_4

    const/4 v0, 0x2

    .line 688
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    .line 689
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    .line 690
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    .line 691
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    .line 692
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    .line 695
    :cond_4
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 696
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 697
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 698
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 699
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 700
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 701
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 702
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 703
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 704
    invoke-static {}, Ll/ܳ᩹ۡ;->֫()Ll/ܳ᩹ۡ;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 706
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 708
    new-instance v0, Ll/ܰ᩶ܽ;

    move-object v4, v0

    move-object v5, v11

    invoke-direct/range {v4 .. v10}, Ll/ܰ᩶ܽ;-><init>(Ll/֨۫ܽ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 711
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 712
    invoke-virtual {v1, v12}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v3, 0x7f120189

    const/4 v4, 0x0

    .line 713
    invoke-virtual {v1, v3, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f1201bd

    .line 714
    invoke-virtual {v1, v3, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 715
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 717
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "apk_signature_info_upper_case"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 718
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "apk_signature_info_add_colon"

    invoke-interface {v3, v4, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    move-object/from16 v4, v18

    invoke-virtual {v4, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 720
    new-instance v3, Ll/۟᩶ܽ;

    invoke-direct {v3, v0}, Ll/۟᩶ܽ;-><init>(Ll/ܰ᩶ܽ;)V

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 725
    new-instance v2, Ll/֫ۙܽ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ll/֫ۙܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 730
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ۧۙܽ;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v11}, Ll/ۧۙܽ;-><init>(Ll/᩹ۙܽ;Ll/֨۫ܽ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 732
    invoke-virtual/range {v17 .. v17}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v1

    .line 733
    invoke-virtual/range {v17 .. v17}, Ljava/security/cert/X509Certificate;->getSigAlgOID()Ljava/lang/String;

    move-result-object v2

    .line 734
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 735
    invoke-static {v2}, Ll/ᩳܳᩳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move-object v1, v2

    .line 740
    :cond_5
    invoke-virtual {v13, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 741
    invoke-virtual/range {v17 .. v17}, Ljava/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 742
    invoke-virtual/range {v17 .. v17}, Ljava/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v1, v17

    .line 743
    invoke-static {v3, v12, v1}, Ll/۠۫ܽ;->֫(Ll/ۗܺ᩷;Landroid/view/View;Ljava/security/cert/X509Certificate;)V

    move-object/from16 v1, v16

    .line 745
    invoke-virtual {v11, v1}, Ll/֨۫ܽ;->֫([B)V

    .line 746
    invoke-virtual {v0}, Ll/ܰ᩶ܽ;->run()V

    return-void
.end method

.method public static ֫(Ll/᩹ۙܽ;Ljava/lang/String;)V
    .locals 8

    .line 111
    iget-object v0, p0, Ll/᩹ۙܽ;->ۢۧ:Ll/۬ܿᩳ;

    if-nez v0, :cond_0

    return-void

    .line 115
    :cond_0
    :try_start_0
    new-instance v1, Ll/ۡܰۡ;

    invoke-direct {v1, p1}, Ll/ۡܰۡ;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :try_start_1
    invoke-virtual {v0}, Ll/۬ܿᩳ;->ܳ()Ljava/lang/String;

    move-result-object p1

    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".x509.pem"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----BEGIN CERTIFICATE-----\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {v0}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    const/4 v4, 0x2

    .line 132
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 133
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    .line 135
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    add-int/lit8 v6, v5, 0x40

    .line 136
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-virtual {v4, v3, v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const-string v5, "\n"

    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v6

    goto :goto_0

    .line 139
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n-----END CERTIFICATE-----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 118
    invoke-virtual {v1, v2}, Ll/ۡܰۡ;->write([B)V

    .line 121
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".pk8"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v0}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۡܰۡ;->write([B)V

    const p1, 0x7f1208d1

    .line 123
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    :try_start_2
    invoke-virtual {v1}, Ll/ۡܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 115
    :try_start_3
    invoke-virtual {v1}, Ll/ۡܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۙܽ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->ܿۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۙܽ;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->ܺۧ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ll/᩹ۙܽ;Ll/۬ܿᩳ;)V
    .locals 1

    .line 648
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩹ۙܽ;->֫(Ll/۬ܿᩳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ֫(Ll/᩹ۙܽ;Ll/۬ܿᩳ;Ljava/lang/Runnable;)V
    .locals 1

    .line 620
    invoke-virtual {p1}, Ll/۬ܿᩳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 621
    sput-boolean v0, Ll/᩹ܿᩳ;->᩻:Z

    .line 622
    new-instance v0, Ll/ܳۙܽ;

    invoke-direct {v0, p2}, Ll/ܳۙܽ;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0, p1, p0}, Ll/ۡۨܽ;->֫(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    return-void

    .line 641
    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/᩹ۙܽ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ܺۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/᩹ۙܽ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ᩴۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/᩹ۙܽ;)Ll/۫ۤۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ۘۧ:Ll/۫ۤۧ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۙܽ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ܿۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۙܽ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->᩻ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۙܽ;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->ᩴۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۙܽ;Ll/۬ܿᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->ۢۧ:Ll/۬ܿᩳ;

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->᩷ۧ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public static ܺ(Ll/᩹ۙܽ;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    new-instance v0, Ll/ܿۙܽ;

    invoke-direct {v0, p0}, Ll/ܿۙܽ;-><init>(Ll/᩹ۙܽ;)V

    .line 245
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩹ۙܽ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹ۙܽ;->ۜۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩹ۙܽ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩹ۙܽ;->ܳۧ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/᩹ۙܽ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ۜۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩹ۙܽ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->᩻ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩹ۙܽ;)Ll/ۛ᩵᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ۖۧ:Ll/ۛ᩵᩷;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۙܽ;->ۡۧ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 94
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 95
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "fromDialog"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/᩹ۙܽ;->ܳۧ:Z

    const p1, 0x7f0d004f

    .line 96
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f12098b

    .line 97
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 98
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 99
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 100
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 101
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ᩳۘܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ᩳۘܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a04a1

    .line 102
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۫ۤۧ;

    iput-object p1, p0, Ll/᩹ۙܽ;->ۘۧ:Ll/۫ۤۧ;

    .line 104
    sget-object p1, Ll/᩶ۖܳ;->ۨ:Ll/᩶ۖܳ;

    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    invoke-virtual {p1}, Ll/ۨܺ᩷;->ܽ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۙܽ;->ۡۧ:Landroid/graphics/drawable/Drawable;

    .line 105
    sget-object p1, Ll/᩶ۖܳ;->ۛ:Ll/᩶ۖܳ;

    iget-object p1, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    invoke-virtual {p1}, Ll/ۨܺ᩷;->ܽ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۙܽ;->᩷ۧ:Landroid/graphics/drawable/Drawable;

    .line 143
    new-instance p1, Ll/ܿۙܽ;

    invoke-direct {p1, p0}, Ll/ܿۙܽ;-><init>(Ll/᩹ۙܽ;)V

    .line 245
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    const p1, 0x7f0a0486

    .line 107
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    .line 108
    new-instance v0, Ll/᩻ۙܽ;

    invoke-direct {v0, p0}, Ll/᩻ۙܽ;-><init>(Ll/᩹ۙܽ;)V

    iput-object v0, p0, Ll/᩹ۙܽ;->ᩳۧ:Ll/᩻ۙܽ;

    .line 109
    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 110
    new-instance p1, Ll/ۜ᩸ܽ;

    invoke-direct {p1, p0}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, p1}, Ll/᩵֡᩷;->֫(Ll/ۗܺ᩷;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۙܽ;->ۖۧ:Ll/ۛ᩵᩷;

    .line 128
    iget-object p1, p0, Ll/᩹ۙܽ;->ۘۧ:Ll/۫ۤۧ;

    new-instance v0, Ll/᩷᩸ܽ;

    invoke-direct {v0, p0}, Ll/᩷᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/۫ۤۧ;->֫(Ll/ۙۤۧ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const v0, 0x7f0a0348

    const v1, 0x7f12042f

    const/4 v2, 0x0

    .line 250
    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x2

    .line 251
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f0801b8

    .line 252
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 258
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0348

    if-ne p1, v0, :cond_0

    .line 260
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f12042f

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120989

    .line 261
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 262
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 263
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    const v0, 0x102000b

    .line 50
    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 51
    invoke-virtual {p1}, Ll/֡ۚۢ;->֫()Landroid/content/Context;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Ll/᩶᩻ۡ;->֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;

    move-result-object p1

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ll/ܺ᩶ۘ;->֫(Landroid/widget/TextView;Ljava/lang/String;)V

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "SignatureKeyActivity"

    return-object v0
.end method
