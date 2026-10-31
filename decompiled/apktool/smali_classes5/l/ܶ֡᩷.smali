.class public Ll/ܶ֡᩷;
.super Ll/ۗܺ᩷;
.source "C5P7"


# static fields
.field public static final synthetic ۜۧ:I


# instance fields
.field public ܳۧ:Ll/ܶ᩵ܿ;

.field public ܿۧ:Ljava/lang/String;

.field public ᩳۧ:Landroid/text/SpannableStringBuilder;

.field public ᩻ۧ:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ֡᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 130
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 133
    :cond_0
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    const-string v0, "\n\n"

    .line 134
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 136
    :cond_1
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 137
    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 138
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    .line 139
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    sget v2, Ll/᩹֡᩷;->֫:I

    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v2, 0x21

    invoke-virtual {p0, v1, v0, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 140
    new-instance v1, Landroid/text/style/StyleSpan;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0, v1, v0, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const-string p1, "\n"

    .line 141
    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 142
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    .line 143
    invoke-virtual {p0, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 144
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p2

    .line 145
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v1, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0, v0, p1, p2, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ֡᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;)V
    .locals 5

    .line 106
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :try_start_1
    invoke-static {p1}, Ll/ۢ᩻ۘ;->֫(Ljava/io/InputStream;)Ll/ۢ᩻ۘ;

    move-result-object v0

    .line 108
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 109
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    const-string v3, "Full Name"

    const/4 v4, 0x4

    .line 110
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Font Family"

    const/4 v4, 0x1

    .line 111
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Font Subfamily"

    const/4 v4, 0x2

    .line 112
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Unique Subfamily Identification"

    const/4 v4, 0x3

    .line 113
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Version"

    const/4 v4, 0x5

    .line 114
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Post Script"

    const/4 v4, 0x6

    .line 115
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Trademark"

    const/4 v4, 0x7

    .line 116
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Manufacturer"

    const/16 v4, 0x8

    .line 117
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Designer"

    const/16 v4, 0x9

    .line 118
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Description"

    const/16 v4, 0xa

    .line 119
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Copyright"

    const/4 v4, 0x0

    .line 120
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "License"

    const/16 v4, 0xd

    .line 121
    invoke-virtual {v0, v4, v1}, Ll/ۢ᩻ۘ;->֫(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ll/ܶ֡᩷;->֫(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    iput-object v2, p0, Ll/ܶ֡᩷;->ᩳۧ:Landroid/text/SpannableStringBuilder;

    .line 123
    invoke-virtual {p0}, Ll/֨ܿ;->invalidateOptionsMenu()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    .line 124
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_0

    .line 106
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶ֡᩷;)[Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֡᩷;->᩻ۧ:[Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 44
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f120402

    .line 45
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0d0028

    .line 46
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const/4 p1, 0x6

    new-array v0, p1, [I

    .line 47
    fill-array-data v0, :array_0

    new-array p1, p1, [Landroid/widget/TextView;

    .line 55
    iput-object p1, p0, Ll/ܶ֡᩷;->᩻ۧ:[Landroid/widget/TextView;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 56
    :goto_0
    iget-object v2, p0, Ll/ܶ֡᩷;->᩻ۧ:[Landroid/widget/TextView;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 57
    aget v3, v0, v1

    invoke-virtual {p0, v3}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 60
    :cond_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "font_viewer_displayed_text"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f120090

    .line 62
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    .line 64
    :cond_1
    iget-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc8

    if-le v0, v1, :cond_2

    .line 65
    iget-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    .line 67
    :cond_2
    iget-object v0, p0, Ll/ܶ֡᩷;->᩻ۧ:[Landroid/widget/TextView;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 68
    iget-object v4, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const v0, 0x7f0a063a

    .line 70
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 71
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 72
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 73
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v1, Ll/֨֡᩷;

    invoke-direct {v1, p1, p0}, Ll/֨֡᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ll/ۗܺ᩷;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_6

    .line 153
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 79
    iget-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 81
    :try_start_1
    new-instance v1, Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 82
    :try_start_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_5

    .line 83
    new-instance v2, Landroid/graphics/Typeface$Builder;

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v2

    new-instance v3, Landroid/graphics/Typeface$Builder;

    invoke-direct {v3, v2}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V

    invoke-virtual {v3}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object v2

    goto :goto_2

    .line 85
    :cond_5
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_0
    move-exception v2

    .line 81
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 88
    :catch_0
    :try_start_6
    sget-object v1, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ֡᩷;->ܳۧ:Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    .line 516
    invoke-virtual {v0, v1, v2, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    .line 90
    iget-object v0, p0, Ll/ܶ֡᩷;->ܳۧ:Ll/ܶ᩵ܿ;

    .line 91
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    :goto_4
    if-eqz v2, :cond_7

    .line 93
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    if-eq v2, v1, :cond_7

    .line 197
    iget-object v1, p0, Ll/ܶ֡᩷;->᩻ۧ:[Landroid/widget/TextView;

    array-length v3, v1

    :goto_5
    if-ge p1, v3, :cond_6

    aget-object v4, v1, p1

    .line 198
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_6
    const p1, 0x7f0a05be

    .line 200
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 201
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 97
    invoke-direct {p0, v0}, Ll/ܶ֡᩷;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_6

    .line 94
    :cond_7
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Invalid font file"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    const p1, 0x7f120711

    .line 100
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 101
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_6
    return-void

    :array_0
    .array-data 4
        0x7f0a05c0
        0x7f0a05c1
        0x7f0a05c2
        0x7f0a05c3
        0x7f0a05c4
        0x7f0a05c5
    .end array-data
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 150
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000d

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 151
    iget-object v0, p0, Ll/ܶ֡᩷;->ᩳۧ:Landroid/text/SpannableStringBuilder;

    if-nez v0, :cond_0

    const v0, 0x7f0a028b

    .line 152
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 1

    .line 206
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    .line 207
    iget-object v0, p0, Ll/ܶ֡᩷;->ܳۧ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_0

    .line 208
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 159
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a017a

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 161
    new-instance p1, Ll/۠֡᩷;

    invoke-direct {p1, p0, p0}, Ll/۠֡᩷;-><init>(Ll/ܶ֡᩷;Ll/ܶ֡᩷;)V

    const v0, 0x7f1202dd

    .line 176
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object v0, p0, Ll/ܶ֡᩷;->ܿۧ:Ljava/lang/String;

    .line 177
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/16 v0, 0xc8

    .line 178
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ܳ(I)V

    .line 179
    invoke-virtual {p1}, Ll/۬ۗܿ;->ܺ()V

    .line 180
    invoke-virtual {p1}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p1, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return v1

    :cond_0
    const v0, 0x7f0a028b

    if-ne p1, v0, :cond_1

    .line 184
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    iget-object v0, p0, Ll/ܶ֡᩷;->ᩳۧ:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v0, 0x7f120189

    const/4 v2, 0x0

    .line 185
    invoke-virtual {p1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 186
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 187
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    const v0, 0x102000b

    .line 188
    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 189
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "FontViewer"

    return-object v0
.end method
